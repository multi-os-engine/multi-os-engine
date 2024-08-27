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

import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TextElement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.text.edits.TextEditGroup;
import org.moe.common.utils.NativeUtil;
import org.moe.natjgen.XcodeDocumentation.IXcodeDocumenrationImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class XcodeLinkedDocumentation implements IXcodeDocumenrationImpl {

    private static final Logger LOG = LoggerFactory.getLogger(XcodeLinkedDocumentation.class);

    /**
     * Name of the developer center
     */
    private static String DEV_CENTER_NAME;

    /**
     * Documentation link base URL
     */
    private static String URL_ROOT;

    private static class Cache {

        private final Connection connection;

        private final HashMap<String, String> langMap = new HashMap<String, String>();
        private final HashMap<String, String> typeMap = new HashMap<String, String>();

        Cache(Connection connection) {
            this.connection = connection;
            // Languages
            cachePrimaryKey(langMap, "ZAPILANGUAGE", "ZFULLNAME", XcodeDocumentation.DocCLanguage);
            cachePrimaryKey(langMap, "ZAPILANGUAGE", "ZFULLNAME", XcodeDocumentation.DocObjectiveCLanguage);

            // Types
            cachePrimaryKey(typeMap, "ZTOKENTYPE", "ZTYPENAME", XcodeDocumentation.DocFunctionType);
            cachePrimaryKey(typeMap, "ZTOKENTYPE", "ZTYPENAME", XcodeDocumentation.DocMacroType);
            cachePrimaryKey(typeMap, "ZTOKENTYPE", "ZTYPENAME", XcodeDocumentation.DocClassMethodType);
            cachePrimaryKey(typeMap, "ZTOKENTYPE", "ZTYPENAME", XcodeDocumentation.DocInstanceMethodType);
            cachePrimaryKey(typeMap, "ZTOKENTYPE", "ZTYPENAME", XcodeDocumentation.DocInstancePropertyType);
            cachePrimaryKey(typeMap, "ZTOKENTYPE", "ZTYPENAME", XcodeDocumentation.DocInterfaceClassMethodType);
            cachePrimaryKey(typeMap, "ZTOKENTYPE", "ZTYPENAME", XcodeDocumentation.DocInterfaceMethodType);
            cachePrimaryKey(typeMap, "ZTOKENTYPE", "ZTYPENAME", XcodeDocumentation.DocInterfacePropertyType);
        }

        private void cachePrimaryKey(HashMap<String, String> cache, String table, String column, String value) {
            try {
                Statement stmt = connection.createStatement();
                ResultSet set = stmt
                        .executeQuery("select Z_PK from " + table + " where " + column + "='" + value + "'");
                while (set.next()) {
                    cache.put(value, set.getString("Z_PK"));
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private Cache cache;
    private TextEditGroup editGroup;
    private String URL;
    private String name;

    static Object initSQL(Indexer indexer) {
        // Restrict function to OS X host
        String osName = NativeUtil.getUnifiedSystemName();
        if (!NativeUtil.OS_NAME_MAC_OS_X.equals(osName)) {
            return null;
        }

        Configuration configuration = indexer.getConfiguration();
        if (URL_ROOT == null && configuration.isApplePlatform()) {
            if (configuration.getPlatform().equals(Configuration.PLATFORM_IOS)) {
                URL_ROOT = "https://developer.apple.com/library/ios/";
                DEV_CENTER_NAME = "iOS Dev Center";
            } else if (configuration.getPlatform().equals(Configuration.PLATFORM_TVOS)) {
                URL_ROOT = "https://developer.apple.com/library/tvos/";
                DEV_CENTER_NAME = "tvOS Dev Center";
            } else if (configuration.getPlatform().equals(Configuration.PLATFORM_OSX)) {
                URL_ROOT = "https://developer.apple.com/library/mac/";
                DEV_CENTER_NAME = "Mac Dev Center";
            } else {
                return null;
            }
        } else {
            return null;
        }

        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");

            ArrayList<String> docsets = indexer.getConfiguration().getDocsets();
            for (String docset : docsets) {
                File ds = new File(indexer.getXcodePath(), "Documentation/DocSets");
                ds = new File(ds, docset);
                ds = new File(ds, "Contents/Resources/docSet.dsidx");
                if (!ds.exists()) {
                    continue;
                }
                c = DriverManager.getConnection("jdbc:sqlite:" + ds.getCanonicalPath());
                return new Cache(c);
            }
        } catch (Exception e) {
            LOG.error("SQLite init failed", e);
        }
        return null;
    }

    public XcodeLinkedDocumentation(Indexer indexer, String lang, String type, String element, String name,
            TextEditGroup editGroup) throws IOException {
        this.cache = (Cache)indexer.getXcodeDocCache();
        this.editGroup = editGroup;
        this.name = name;

        if (this.cache == null) {
            URL = null;
            return;
        }

        try {
            String q;
            if (XcodeDocumentation.DocCLanguage.equals(lang)) {
                q = String.format("SELECT M.ZANCHOR, F.ZPATH "
                                + "FROM ZTOKEN AS T JOIN ZTOKENMETAINFORMATION AS M JOIN ZFILEPATH AS F "
                                + "WHERE T.ZMETAINFORMATION=M.Z_PK" + " and M.ZFILE=F.Z_PK" + " and T.ZTOKENNAME='%s'"
                                + " and T.ZLANGUAGE=%s" + " and T.ZTOKENTYPE=%s", name, cache.langMap.get(lang),
                        cache.typeMap.get(type));
            } else {
                q = String.format("SELECT M.ZANCHOR, F.ZPATH "
                                + "FROM ZTOKEN AS T JOIN ZTOKENMETAINFORMATION AS M JOIN ZFILEPATH AS F JOIN ZCONTAINER AS C "
                                + "WHERE T.ZMETAINFORMATION=M.Z_PK" + " and M.ZFILE=F.Z_PK" + " and T.ZCONTAINER=C.Z_PK"
                                + " and T.ZTOKENNAME='%s'" + " and T.ZLANGUAGE=%s" + " and T.ZTOKENTYPE=%s"
                                + " and C.ZCONTAINERNAME%s", name, cache.langMap.get(lang), cache.typeMap.get(type),
                        "-".equals(element) ? " IS NULL" : "='" + element + "'");
            }
            Statement stmt = cache.connection.createStatement();
            ResultSet set = stmt.executeQuery(q);
            int count = 0;
            while (set.next()) {
                URL = URL_ROOT + set.getString("ZPATH") + "#" + set.getString("ZANCHOR");
                ++count;
            }
            if (count > 1) {
                URL = null;
                LOG.warn("More than one documentation link: " + name + " " + type + " (" + cache.typeMap.get(type)
                        + ") - " + cache.langMap.get(lang));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Javadoc getJavaDoc(ASTRewrite rewrite, ArrayList<CalleeArgument> args) {
        if (URL == null) {
            return null;
        }

        Javadoc doc = rewrite.getAST().newJavadoc();
        addTag(doc, rewrite, null,
                name + "</br>\nOriginal documentation: <a href=\"" + URL + "\">" + DEV_CENTER_NAME + "</a>");
        return doc;
    }

    private void addTag(Javadoc doc, ASTRewrite rewrite, String tag, String string) {
        if (string == null) return;

        ListRewrite lrw = rewrite.getListRewrite(doc, Javadoc.TAGS_PROPERTY);

        TagElement t = rewrite.getAST().newTagElement();
        lrw.insertLast(t, editGroup);
        if (tag != null) {
            rewrite.set(t, TagElement.TAG_NAME_PROPERTY, tag, editGroup);
        }

        ListRewrite fragments = rewrite.getListRewrite(t, TagElement.FRAGMENTS_PROPERTY);
        TextElement text = rewrite.getAST().newTextElement();
        fragments.insertLast(text, editGroup);
        rewrite.set(text, TextElement.TEXT_PROPERTY, string, editGroup);
    }
}
