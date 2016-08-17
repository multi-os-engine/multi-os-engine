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


package org.moe.idea.builder;

public class MOEModuleProperties {
    private String projectName;
    private String productName;
    private String organizationName;
    private String companyIdentifier;
    private String projectRoot;
    private String mainClassName = "Main";
    private String xcodeProjectPath;
    private boolean keepXcodeProject;

    public String getProjectRoot() {
        return projectRoot;
    }

    public void setProjectRoot(String projectRoot) {
        this.projectRoot = projectRoot;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setCompanyIdentifier(String companyIdentifier) {
        this.companyIdentifier = companyIdentifier;
    }

    public String getCompanyIdentifier() {
        return companyIdentifier;
    }

    public String getMainClassName() {
        return mainClassName;
    }

    public void setMainClassName(String mainClassName) {
        this.mainClassName = mainClassName;
    }

    public boolean isKeepXcodeProject() {
        return keepXcodeProject;
    }

    public String getXcodeProjectPath() {
        return xcodeProjectPath;
    }

    public void setXcodeProjectPath(String xcodeProjectPath) {
        this.xcodeProjectPath = xcodeProjectPath;
    }

    public void setKeepXcodeProject(boolean keepXcodeProject) {
        this.keepXcodeProject = keepXcodeProject;
    }
}
