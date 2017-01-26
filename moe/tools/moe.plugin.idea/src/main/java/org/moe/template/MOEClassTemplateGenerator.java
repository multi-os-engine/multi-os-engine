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

package org.moe.template;

import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import org.moe.idea.utils.logger.LoggerFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class MOEClassTemplateGenerator {

    private static final Logger LOG = LoggerFactory.getLogger(MOEClassTemplateGenerator.class);

    String PACKAGE_NAME = "__PACKAGE_NAME__";

    String CLASS_NAME = "__CLASS_NAME__";
    String SUBCLASS_NAME = "__SUBCLASS_NAME__";

    public void generate(MOEClassTemplate classTemplate, DataContext dataContext) {
        Module module = (Module) dataContext.getData(LangDataKeys.MODULE.getName());
        VirtualFile file = CommonDataKeys.VIRTUAL_FILE.getData(dataContext);

        if (module == null) {
            LOG.error("Failed to get module");
            return;
        }

        if (file == null) {
            LOG.error("Failed to get input file");
            return;
        }

        try {
            String fileName = classTemplate.getClassName();
            String fileContent = generateClassContent(classTemplate);

            createFile(file.getPath(), fileName, fileContent);
            VirtualFileManager.getInstance().syncRefresh();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readStream(InputStream stream) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        String line;
        StringBuilder contentBuffer = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            contentBuffer.append(line).append("\n");
        }

        return contentBuffer.toString();
    }

    private String generateClassContent(MOEClassTemplate classTemplate) throws IOException {
        String classFileContent = "";
        InputStream templateStream = null;
        try {
            templateStream = MOEClassTemplateGenerator.class.getResourceAsStream(classTemplate.getTemplatePath());

            classFileContent = readStream(templateStream);
            classFileContent = classFileContent.replace(PACKAGE_NAME, classTemplate.getPackageName());
            classFileContent = classFileContent.replace(CLASS_NAME, classTemplate.getClassName());
            classFileContent = classFileContent.replace(SUBCLASS_NAME, classTemplate.getSubclassName());
        } finally {
            if (templateStream != null) {
                try {
                    templateStream.close();
                } catch(Exception e) {}
            }
        }

        return classFileContent;
    }

    private File createFile(String path, String fileName, String content) throws IOException {
        File javaFile = new File(path + File.separator + fileName + ".java");

        if (!javaFile.exists()) {

            javaFile.createNewFile();

            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(javaFile));
                bw.write(content);
            } finally {
                if (bw != null) {
                    try {
                        bw.close();
                    } catch (Exception e) {}
                }
            }

            return javaFile;

        } else {
            return null;
        }

    }

}
