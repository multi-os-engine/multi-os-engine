/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.natjgen;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.internal.formatter.DefaultCodeFormatterOptions;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;
import org.moe.natjgen.helper.MOEICompilationUnit;
import org.moe.natjgen.util.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;

public class UnitEditContext {

    /**
     * Logger for this class
     */
    private static final Logger LOG = LoggerFactory.getLogger(UnitEditContext.class);

    /**
     * Compilation unit for the manager
     */
    private final MOEICompilationUnit unit;

    /**
     * Document object for the source code
     */
    private final Document document;

    /**
     * AST rewriter for the source code
     */
    private final ASTRewrite rewrite;

    /**
     * Compilation unit for the source code
     */
    private final CompilationUnit astRoot;

    /**
     * Create a new {@link UnitEditContext}
     *
     * @param manager {@link AbstractUnitManager} to edit
     */
    public UnitEditContext(AbstractUnitManager manager) {
        try {
            unit = getCompilationUnit(manager);
        } catch (CoreException e) {
            throw new RuntimeException("Failed to get compilation unit", e);
        }

        document = new Document(unit.getSource());

        // Build AST for the compilation unit
        ASTParser parser = ASTParser.newParser(AST.JLS8);
        parser.setSource(unit.getSource().toCharArray());
        astRoot = (CompilationUnit)parser.createAST(null);

        // Create AST rewriter
        rewrite = ASTRewrite.create(astRoot.getAST());
    }

    /**
     * Java file extension
     */
    private static final String JAVA_EXTENSION = ".java";

    /**
     * Retrieve compilation unit for element with canonical name
     *
     * @return compilation unit
     */
    private final MOEICompilationUnit getCompilationUnit(AbstractUnitManager manager) throws CoreException {
        String name = manager.getUnitName();
        String pkg = manager.getPackage();
        String out = manager.getIndexer().getPkgroot();

        String inPath = Path
                .compose(out, pkg.replaceAll("\\.", Matcher.quoteReplacement(File.separator)), name + JAVA_EXTENSION);
        File inFile = new File(inPath);

        if (inFile.exists()) {
            LOG.info("Getting compilation unit from " + inPath);
            return getFileCompilationUnit(inPath, "UTF-8");
        } else {
            LOG.info("Creating compilation unit at " + inPath);
            return createNewComilationUnit(manager, inFile);
        }
    }

    /**
     * Creates a new compilation unit in the indexer's package root
     *
     * @return compilation unit
     * @throws CoreException
     */
    private MOEICompilationUnit createNewComilationUnit(AbstractUnitManager manager, File outFile)
            throws CoreException {
        if (outFile == null) {
            throw new NullPointerException();
        }
        File parentFile = outFile.getParentFile();
        if (!parentFile.exists()) {
            if (!parentFile.mkdirs()) {
                throw new RuntimeException("Unable to create parent directory: " + parentFile);
            }
        }

        try {
            if (!outFile.createNewFile()) {
                throw new RuntimeException("Unable to create java file: " + outFile);
            }
        } catch (IOException e) {
            throw new RuntimeException("Unable to create java file: " + outFile, e);
        }

        return getFileCompilationUnit(outFile.getAbsolutePath(), "UTF-8");
    }

    /**
     * Save the modification in the file
     */
    public void save() {
        try {
            DefaultCodeFormatterOptions o = DefaultCodeFormatterOptions.getEclipseDefaultSettings();
            o.tab_char = DefaultCodeFormatterOptions.SPACE;
            o.page_width = 120;
            o.comment_line_length = 120;
            // When passed null instead of defaultSettings, eclipse did not find
            // the default formatter settings.
            TextEdit edit = rewrite.rewriteAST(document, o.getMap());
            edit.apply(document);
            String newSource = document.get();
            unit.setSource(newSource);
            unit.save();
        } catch (MalformedTreeException e) {
            LOG.error("Saving modifications failed(a): ", e);
            e.printStackTrace();
        } catch (BadLocationException e) {
            LOG.error("Saving modifications failed(b): ", e);
            e.printStackTrace();
        }
    }

    /**
     * Returns the {@link ASTRewrite}
     *
     * @return {@link ASTRewrite}
     */
    public ASTRewrite getRewrite() {
        return rewrite;
    }

    /**
     * Returns the {@link CompilationUnit}
     *
     * @return {@link CompilationUnit}
     */
    public CompilationUnit getAstRoot() {
        return astRoot;
    }

    /**
     * Returns the {@link AST}
     *
     * @return {@link AST}
     */
    public AST getAST() {
        return rewrite.getAST();
    }

    public static MOEICompilationUnit getFileCompilationUnit(String path, String encoding) throws CoreException {
        File f = new File(path);
        if (!f.exists() || !f.canRead() || !f.isFile()) {
            throw new RuntimeException("Unabe read java file!");
        }

        long length = f.length();
        byte[] encoded = new byte[(int)length];
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            fis.read(encoded);
            if (fis.available() != 0) {
                throw new RuntimeException("incorrect number of bytes read");
            }
        } catch (Exception ex) {
            throw new RuntimeException("Unabe read java file!", ex);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
        }

        // aSTParser.setSource(new String(encoded, encoding).toCharArray());
        MOEICompilationUnit compilationUnit = new MOEICompilationUnit();
        compilationUnit.setLocation(path);
        try {
            compilationUnit.setSource(new String(encoded, encoding));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unabe read java file, unsupported encoding!", e);
        }
        return compilationUnit;
    }
}
