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

package org.moe.document.pbxproj;

import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;

import java.util.Map;

@SuppressWarnings("unchecked")
public class PBXContainerItemProxy extends PBXObject {

    public static final String CONTAINER_PORTAL_KEY = "containerPortal";
    public static final String PROXY_TYPE_KEY = "proxyType";
    public static final String REMOTE_GLOBAL_ID_STRING_KEY = "remoteGlobalIDString";
    public static final String REMOTE_INFO_KEY = "remoteInfo";

    public PBXContainerItemProxy(Dictionary<Value, NextStep> dict) {
        super(dict);
    }

    public PBXContainerItemProxy() {
        super(null);
        setIsa(this.getClass().getSimpleName());
    }

    @Override
    public String getCommentString() {
        return "PBXContainerItemProxy";
    }

    @Override
    public void connectReferences(Map<String, Value> map) {
        connectReferencesInValue(CONTAINER_PORTAL_KEY, map);
    }

    @Override
    public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
        if (ref.equals(getContainerPortal())) {
            setContainerPortal(null);
        }
    }

    /**
     * Fields
     **/

    public PBXObjectRef<PBXObject> getContainerPortal() {
        return getPBXObjectRefValue(CONTAINER_PORTAL_KEY);
    }

    public void setContainerPortal(PBXObjectRef<PBXObject> value) {
        setPBXObjectRefValue(CONTAINER_PORTAL_KEY, value);
    }

    public String getProxyType() {
        return getStringValue(PROXY_TYPE_KEY);
    }

    public void setProxyType(String value) {
        setStringValue(PROXY_TYPE_KEY, value);
    }

    public String getRemoteGlobalIDString() {
        return getStringValue(REMOTE_GLOBAL_ID_STRING_KEY);
    }

    public void setRemoteGlobalIDString(String value) {
        setStringValue(REMOTE_GLOBAL_ID_STRING_KEY, value);
    }

    public String getRemoteInfo() {
        return getStringValue(REMOTE_INFO_KEY);
    }

    public void setRemoteInfo(String value) {
        setStringValue(REMOTE_INFO_KEY, value);
    }

}
