/*
Copyright (C) 2016 Migeran

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

package org.moe.editors;

import com.dd.plist.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class InfoPlistManager {

    public static final String BUNDELE_IDENTIFIER_KEY = "CFBundleIdentifier";
    public static final String BUNDELE_VERSION_KEY = "CFBundleShortVersionString";
    public static final String BUNDELE_BUILD_KEY = "CFBundleVersion";
    public static final String INTERFACE_ORIENTATIONS_KEY = "UISupportedInterfaceOrientations";
    public static final String INTERFACE_ORIENTATIONS_IPAD_KEY = "UISupportedInterfaceOrientations~ipad";
    public static final String INTERFACE_ORIENTATIONS_PORTRAIT = "UIInterfaceOrientationPortrait";
    public static final String INTERFACE_ORIENTATIONS_UPSIDE_DOWN = "UIInterfaceOrientationPortraitUpsideDown";
    public static final String INTERFACE_ORIENTATIONS_LANDSCAPE_LEFT = "UIInterfaceOrientationLandscapeLeft";
    public static final String INTERFACE_ORIENTATIONS_LANDSCAPE_RIGHT = "UIInterfaceOrientationLandscapeRight";
    public static final String STATUS_BAR_STYLE_KEY = "UIStatusBarStyle";
    public static final String STATUS_BAR_STYLE_DEFAULT = "UIStatusBarStyleDefault";
    public static final String STATUS_BAR_STYLE_LIGHT = "UIStatusBarStyleLightContent";
    public static final String STATUS_BAR_HIDDEN_KEY = "UIStatusBarHidden";
    public static final String STATUS_BAR_HIDDEN_IPAD_KEY = "UIStatusBarHidden~ipad";
    public static final String REQUIRES_FULL_SCREEN_KEY = "UIRequiresFullScreen";
    public static final String IPHONE_NIB_FILE_KEY = "NSMainNibFile";
    public static final String IPAD_NIB_FILE_KEY = "NSMainNibFile~ipad";
    public static final String IPHONE_MAIN_STORYBOARD_FILE_KEY = "UIMainStoryboardFile";
    public static final String IPAD_MAIN_STORYBOARD_FILE_KEY = "UIMainStoryboardFile~ipad";

    private NSString portrait = new NSString(INTERFACE_ORIENTATIONS_PORTRAIT);
    private NSString upsideDown = new NSString(INTERFACE_ORIENTATIONS_UPSIDE_DOWN);
    private NSString landscapeLeft = new NSString(INTERFACE_ORIENTATIONS_LANDSCAPE_LEFT);
    private NSString landscapeRight = new NSString(INTERFACE_ORIENTATIONS_LANDSCAPE_RIGHT);
    private static NSString defaultStyle = new NSString(STATUS_BAR_STYLE_DEFAULT);
    private static NSString lightStyle = new NSString(STATUS_BAR_STYLE_LIGHT);

    private NSDictionary rootDict;
    private NSString version;
    private NSString build;
    private NSString bundleId;
    private NSArray interfaceOrientatios;
    private NSArray interfaceOrientatiosIPad;
    private NSNumber statusBarHidden;
    private NSNumber statusBarHiddenIPad;
    private NSString style;
    private NSNumber requiresFullScreen;
    private NSString iphoneNibFile;
    private NSString ipadNibFile;
    private NSString iphoneStoryboardFile;
    private NSString ipadStoryboardFile;

    private File infoPlistFile;
    private DocumentChangeListener documentChangeListener;

    public static Map<String, NSString> getStatusBarStylesMap() {
        Map<String, NSString> styles = new HashMap<String, NSString>();
        styles.put("Default", defaultStyle);
        styles.put("Light", lightStyle);
        return styles;
    }

    public InfoPlistManager(File infoPlist, DocumentChangeListener listener) throws PropertyListFormatException, ParserConfigurationException, SAXException, ParseException, IOException {
        this.infoPlistFile = infoPlist;
        this.documentChangeListener = listener;
        load();
    }

    public void load() throws ParserConfigurationException, ParseException, SAXException, PropertyListFormatException, IOException {
        this.rootDict = (NSDictionary) PropertyListParser.parse(infoPlistFile);
        this.version = (NSString) rootDict.get(BUNDELE_VERSION_KEY);
        this.build = (NSString) rootDict.get(BUNDELE_BUILD_KEY);
        this.bundleId = (NSString) rootDict.get(BUNDELE_IDENTIFIER_KEY);
        this.interfaceOrientatios = (NSArray) rootDict.get(INTERFACE_ORIENTATIONS_KEY);
        this.interfaceOrientatiosIPad = (NSArray) rootDict.get(INTERFACE_ORIENTATIONS_IPAD_KEY);
        this.statusBarHidden = (NSNumber) rootDict.get(STATUS_BAR_HIDDEN_KEY);
        this.statusBarHiddenIPad = (NSNumber) rootDict.get(STATUS_BAR_HIDDEN_IPAD_KEY);
        this.requiresFullScreen = (NSNumber) rootDict.get(REQUIRES_FULL_SCREEN_KEY);
        this.style = (NSString) rootDict.get(STATUS_BAR_STYLE_KEY);
        this.iphoneNibFile = (NSString) rootDict.get(IPHONE_NIB_FILE_KEY);
        this.ipadNibFile = (NSString) rootDict.get(IPAD_NIB_FILE_KEY);
        this.iphoneStoryboardFile = (NSString) rootDict.get(IPHONE_MAIN_STORYBOARD_FILE_KEY);
        this.ipadStoryboardFile = (NSString) rootDict.get(IPAD_MAIN_STORYBOARD_FILE_KEY);
    }

    public String getVersion() {
        if (version != null) {
            return version.getContent();
        }
        return "";
    }

    public void setVersion(String versionNumber) {
        if (version != null && version.getContent().equals(versionNumber)) {
            return;
        }
        if (version == null) {
            version = new NSString(versionNumber);
            rootDict.put(BUNDELE_VERSION_KEY, version);
        } else {
            version.setContent(versionNumber);
        }
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getBuild() {
        if (build != null) {
            return build.getContent();
        }
        return "";
    }

    public void setBuild(String buildNumber) {
        if (build != null && build.getContent().equals(buildNumber)) {
            return;
        }
        if (build == null) {
            build = new NSString(buildNumber);
            rootDict.put(BUNDELE_BUILD_KEY, version);
        } else {
            build.setContent(buildNumber);
        }
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getBundleIdentifier() {
        if (bundleId != null) {
            return bundleId.getContent();
        }
        return "";
    }

    public void setBundleIdentifier(String id) {
        if (bundleId != null && bundleId.getContent().equals(id)) {
            return;
        }
        if (bundleId == null) {
            bundleId = new NSString(id);
            rootDict.put(BUNDELE_IDENTIFIER_KEY, bundleId);
        } else {
            bundleId.setContent(id);
        }
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public boolean isInterfacePortrait() {
        if (interfaceOrientatios != null) {
            return interfaceOrientatios.containsObject(portrait);
        }
        return false;
    }

    public void setInterfacePortrait(boolean interfacePortrait) {
        setInterface(interfacePortrait, portrait);
    }

    public boolean isInterfacePortraitIPad() {
        if (interfaceOrientatiosIPad != null) {
            return interfaceOrientatiosIPad.containsObject(portrait);
        } else if (interfaceOrientatios != null) {
            return interfaceOrientatios.containsObject(portrait);
        }
        return false;
    }

    public void setInterfacePortraitIPad(boolean interfacePortrait) {
        setInterfaceIPad(interfacePortrait, portrait);
    }

    public boolean isInterfaceUpsideDown() {
        if (interfaceOrientatios != null) {
            return interfaceOrientatios.containsObject(upsideDown);
        }
        return false;
    }

    public void setInterfaceUpsideDown(boolean interfaceUpsideDown) {
        setInterface(interfaceUpsideDown, upsideDown);
    }

    public boolean isInterfaceUpsideDownIPad() {
        if (interfaceOrientatiosIPad != null) {
            return interfaceOrientatiosIPad.containsObject(upsideDown);
        } else if (interfaceOrientatios != null) {
            return interfaceOrientatios.containsObject(upsideDown);
        }
        return false;
    }

    public void setInterfaceUpsideDownIPad(boolean interfaceUpsideDown) {
        setInterfaceIPad(interfaceUpsideDown, upsideDown);
    }

    public boolean isInterfaceLandscapeLeft() {
        if (interfaceOrientatios != null) {
            return interfaceOrientatios.containsObject(landscapeLeft);
        }
        return false;
    }

    public void setInterfaceLandscapeLeft(boolean interfaceLandscapeLeft) {
        setInterface(interfaceLandscapeLeft, landscapeLeft);
    }

    public boolean isInterfaceLandscapeLeftIPad() {
        if (interfaceOrientatiosIPad != null) {
            return interfaceOrientatiosIPad.containsObject(landscapeLeft);
        } else if (interfaceOrientatios != null) {
            return interfaceOrientatios.containsObject(landscapeLeft);
        }
        return false;
    }

    public void setInterfaceLandscapeLeftIPad(boolean interfaceLandscapeLeft) {
        setInterfaceIPad(interfaceLandscapeLeft, landscapeLeft);
    }

    public boolean isInterfaceLandscapeRight() {
        if (interfaceOrientatios != null) {
            return interfaceOrientatios.containsObject(landscapeRight);
        }
        return false;
    }

    public void setInterfaceLandscapeRight(boolean interfaceLandscapeRight) {
        setInterface(interfaceLandscapeRight, landscapeRight);
    }

    public boolean isInterfaceLandscapeRightIPad() {
        if (interfaceOrientatiosIPad != null) {
            return interfaceOrientatiosIPad.containsObject(landscapeRight);
        } else if (interfaceOrientatios != null) {
            return interfaceOrientatios.containsObject(landscapeRight);
        }
        return false;
    }

    public void setInterfaceLandscapeRightIPad(boolean interfaceLandscapeRight) {
        setInterfaceIPad(interfaceLandscapeRight, landscapeRight);
    }

    public boolean isHideStatusBar() {
        if (statusBarHidden != null) {
            return statusBarHidden.boolValue();
        }
        return false;
    }

    public void setHideStatusBar(boolean hideStatusBar) {
        if (isHideStatusBar() == hideStatusBar) {return;}
        statusBarHidden = new NSNumber(hideStatusBar);
        NSObject nsObject = rootDict.put(STATUS_BAR_HIDDEN_KEY, statusBarHidden);
        if (nsObject != null) {
            if (documentChangeListener != null) {
                documentChangeListener.documentChanged();
            }
        }
    }

    public boolean isHideStatusBarIPad() {
        if (statusBarHiddenIPad != null) {
            return statusBarHiddenIPad.boolValue();
        } else if (statusBarHidden != null) {
            return statusBarHidden.boolValue();
        }
        return false;
    }

    public void setHideStatusBarIPad(boolean hideStatusBar) {
        if (isHideStatusBarIPad() == hideStatusBar) {return;}
        statusBarHiddenIPad = new NSNumber(hideStatusBar);
        NSObject nsObject = rootDict.put(STATUS_BAR_HIDDEN_IPAD_KEY, statusBarHiddenIPad);
        if (nsObject != null) {
            if (documentChangeListener != null) {
                documentChangeListener.documentChanged();
            }
        }
    }

    public boolean isRequiresFullScreen() {
        if (requiresFullScreen != null) {
            return requiresFullScreen.boolValue();
        }
        return false;
    }

    public void setRequiresFullScreen(boolean rFullScreen) {
        if (isRequiresFullScreen() == rFullScreen) {return;}
        requiresFullScreen = new NSNumber(rFullScreen);
        NSObject nsObject = rootDict.put(REQUIRES_FULL_SCREEN_KEY, requiresFullScreen);
        if (nsObject != null) {
            if (documentChangeListener != null) {
                documentChangeListener.documentChanged();
            }
        }
    }

    public NSString getStyle() {
        if (style == null) {
            return defaultStyle;
        }
        return style;
    }

    public void setStyle(NSString value) {
        if (getStyle().getContent().equals(value.getContent())) {return;}
        style = value;
        NSObject nsObject = rootDict.put(STATUS_BAR_STYLE_KEY, style);
        if (nsObject != null) {
            if (documentChangeListener != null) {
                documentChangeListener.documentChanged();
            }
        }
    }

    public String getInterfaceFile() {
        if (iphoneStoryboardFile != null) {
            return iphoneStoryboardFile.getContent() + ".storyboard";
        }
        if (iphoneNibFile != null) {
            return iphoneNibFile.getContent() + ".xib";
        }
        return "-";
    }

    public void setInterfaceFile(String fullName) {
        boolean changed = false;
        if (fullName == null) {
            if (iphoneNibFile != null) {
                iphoneNibFile = null;
                rootDict.remove(IPHONE_NIB_FILE_KEY);
                changed = true;
            }
            if (iphoneStoryboardFile != null) {
                iphoneStoryboardFile = null;
                rootDict.remove(IPHONE_MAIN_STORYBOARD_FILE_KEY);
                changed = true;
            }
        } else {
            String name = fullName.substring(0, fullName.indexOf("."));
            if (fullName.endsWith(".xib")) {
                if (iphoneStoryboardFile != null) {
                    iphoneStoryboardFile = null;
                    rootDict.remove(IPHONE_MAIN_STORYBOARD_FILE_KEY);
                    changed = true;
                }
                if (iphoneNibFile == null) {
                    iphoneNibFile = new NSString(name);
                    rootDict.put(IPHONE_NIB_FILE_KEY, iphoneNibFile);
                    changed = true;
                } else if (!iphoneNibFile.getContent().equals(name)) {
                    iphoneNibFile.setContent(name);
                }
            } else {
                if (iphoneNibFile != null) {
                    iphoneNibFile = null;
                    rootDict.remove(IPHONE_NIB_FILE_KEY);
                    changed = true;
                }
                if (iphoneStoryboardFile == null) {
                    iphoneStoryboardFile = new NSString(name);
                    rootDict.put(IPHONE_MAIN_STORYBOARD_FILE_KEY, iphoneStoryboardFile);
                    changed = true;
                } else if (!iphoneStoryboardFile.getContent().equals(name)) {
                    iphoneStoryboardFile.setContent(name);
                }
            }
        }

        if (changed) {
            if (documentChangeListener != null) {
                documentChangeListener.documentChanged();
            }
        }
    }

    public String getInterfaceFileIPad() {
        if (ipadStoryboardFile != null) {
            return ipadStoryboardFile.getContent() + ".storyboard";
        }
        if (ipadNibFile != null) {
            return ipadNibFile.getContent() + ".xib";
        }
        return "-";
    }

    public void setInterfaceFileIPad(String fullName) {
        boolean changed = false;
        if (fullName == null) {
            if (ipadNibFile != null) {
                ipadNibFile = null;
                rootDict.remove(IPAD_NIB_FILE_KEY);
                changed = true;
            }
            if (ipadStoryboardFile != null) {
                ipadStoryboardFile = null;
                rootDict.remove(IPAD_MAIN_STORYBOARD_FILE_KEY);
                changed = true;
            }
        } else {
            String name = fullName.substring(0, fullName.indexOf("."));
            if (fullName.endsWith(".xib")) {
                if (ipadStoryboardFile != null) {
                    ipadStoryboardFile = null;
                    rootDict.remove(IPAD_MAIN_STORYBOARD_FILE_KEY);
                    changed = true;
                }
                if (ipadNibFile == null) {
                    ipadNibFile = new NSString(name);
                    rootDict.put(IPAD_NIB_FILE_KEY, ipadNibFile);
                    changed = true;
                } else if (!ipadNibFile.getContent().equals(name)) {
                    ipadNibFile.setContent(name);
                    changed = true;
                }
            } else {
                if (ipadNibFile != null) {
                    ipadNibFile = null;
                    rootDict.remove(IPAD_NIB_FILE_KEY);
                    changed = true;
                }
                if (ipadStoryboardFile == null) {
                    ipadStoryboardFile = new NSString(name);
                    rootDict.put(IPAD_MAIN_STORYBOARD_FILE_KEY, ipadStoryboardFile);
                    changed = true;
                } else if (!ipadStoryboardFile.getContent().equals(name)) {
                    ipadStoryboardFile.setContent(name);
                    changed = true;
                }
            }
        }

        if (changed) {
            if (documentChangeListener != null) {
                documentChangeListener.documentChanged();
            }
        }
    }

    public void save() throws IOException {
        PropertyListParser.saveAsXML(rootDict, infoPlistFile);
    }

    public String getValueToString() {
        return  rootDict.toXMLPropertyList();
    }

    private NSArray addToNSArray(NSArray array, NSObject object) {
        NSObject[] objects = array.getArray();
        NSObject[] newObjects = new NSObject[objects.length + 1];
        System.arraycopy(objects, 0, newObjects, 0, objects.length);
        newObjects[objects.length] = object;
        return new NSArray(newObjects);
    }

    private void setInterface(boolean set, NSObject value) {
        if (interfaceOrientatios == null) {
            interfaceOrientatios = new NSArray();
            rootDict.put(INTERFACE_ORIENTATIONS_KEY, interfaceOrientatios);
        }
        interfaceOrientatios = setOrRemoveInterfaceOrientationValue(set, interfaceOrientatios, value, INTERFACE_ORIENTATIONS_KEY);
    }

    private void setInterfaceIPad(boolean set, NSObject value) {
        if (interfaceOrientatiosIPad == null) {
            interfaceOrientatiosIPad = new NSArray();
            rootDict.put(INTERFACE_ORIENTATIONS_IPAD_KEY, interfaceOrientatiosIPad);
        }
        interfaceOrientatiosIPad = setOrRemoveInterfaceOrientationValue(set, interfaceOrientatiosIPad, value, INTERFACE_ORIENTATIONS_IPAD_KEY);
    }

    private NSArray setOrRemoveInterfaceOrientationValue(boolean set, NSArray array, NSObject value, String key) {
        if (set) {
            if (!array.containsObject(value)) {
                array = addToNSArray(array, value);
                rootDict.put(key, array);
                if (documentChangeListener != null) {
                    documentChangeListener.documentChanged();
                }
            }
        } else {
            if (array.containsObject(value)) {
                array.remove(array.indexOfObject(value));
                if (documentChangeListener != null) {
                    documentChangeListener.documentChanged();
                }
            }
        }
        return array;
    }
}
