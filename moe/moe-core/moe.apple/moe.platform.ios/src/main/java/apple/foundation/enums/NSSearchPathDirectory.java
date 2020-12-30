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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSSearchPathDirectory {
    /**
     * supported applications (Applications)
     */
    @Generated @NUInt public static final long ApplicationDirectory = 0x0000000000000001L;
    /**
     * unsupported applications, demonstration versions (Demos)
     */
    @Generated @NUInt public static final long DemoApplicationDirectory = 0x0000000000000002L;
    /**
     * developer applications (Developer/Applications). DEPRECATED - there is no one single Developer directory.
     */
    @Generated @NUInt public static final long DeveloperApplicationDirectory = 0x0000000000000003L;
    /**
     * system and network administration applications (Administration)
     */
    @Generated @NUInt public static final long AdminApplicationDirectory = 0x0000000000000004L;
    /**
     * various documentation, support, and configuration files, resources (Library)
     */
    @Generated @NUInt public static final long LibraryDirectory = 0x0000000000000005L;
    /**
     * developer resources (Developer) DEPRECATED - there is no one single Developer directory.
     */
    @Generated @NUInt public static final long DeveloperDirectory = 0x0000000000000006L;
    /**
     * user home directories (Users)
     */
    @Generated @NUInt public static final long UserDirectory = 0x0000000000000007L;
    /**
     * documentation (Documentation)
     */
    @Generated @NUInt public static final long DocumentationDirectory = 0x0000000000000008L;
    /**
     * documents (Documents)
     */
    @Generated @NUInt public static final long DocumentDirectory = 0x0000000000000009L;
    /**
     * location of CoreServices directory (System/Library/CoreServices)
     */
    @Generated @NUInt public static final long CoreServiceDirectory = 0x000000000000000AL;
    /**
     * location of autosaved documents (Documents/Autosaved)
     */
    @Generated @NUInt public static final long AutosavedInformationDirectory = 0x000000000000000BL;
    /**
     * location of user's desktop
     */
    @Generated @NUInt public static final long DesktopDirectory = 0x000000000000000CL;
    /**
     * location of discardable cache files (Library/Caches)
     */
    @Generated @NUInt public static final long CachesDirectory = 0x000000000000000DL;
    /**
     * location of application support files (plug-ins, etc) (Library/Application Support)
     */
    @Generated @NUInt public static final long ApplicationSupportDirectory = 0x000000000000000EL;
    /**
     * location of the user's "Downloads" directory
     */
    @Generated @NUInt public static final long DownloadsDirectory = 0x000000000000000FL;
    /**
     * input methods (Library/Input Methods)
     */
    @Generated @NUInt public static final long InputMethodsDirectory = 0x0000000000000010L;
    /**
     * location of user's Movies directory (~/Movies)
     */
    @Generated @NUInt public static final long MoviesDirectory = 0x0000000000000011L;
    /**
     * location of user's Music directory (~/Music)
     */
    @Generated @NUInt public static final long MusicDirectory = 0x0000000000000012L;
    /**
     * location of user's Pictures directory (~/Pictures)
     */
    @Generated @NUInt public static final long PicturesDirectory = 0x0000000000000013L;
    /**
     * location of system's PPDs directory (Library/Printers/PPDs)
     */
    @Generated @NUInt public static final long PrinterDescriptionDirectory = 0x0000000000000014L;
    /**
     * location of user's Public sharing directory (~/Public)
     */
    @Generated @NUInt public static final long SharedPublicDirectory = 0x0000000000000015L;
    /**
     * location of the PreferencePanes directory for use with System Preferences (Library/PreferencePanes)
     */
    @Generated @NUInt public static final long PreferencePanesDirectory = 0x0000000000000016L;
    /**
     * For use with NSFileManager's URLForDirectory:inDomain:appropriateForURL:create:error:
     */
    @Generated @NUInt public static final long ItemReplacementDirectory = 0x0000000000000063L;
    /**
     * all directories where applications can occur
     */
    @Generated @NUInt public static final long AllApplicationsDirectory = 0x0000000000000064L;
    /**
     * all directories where resources can occur
     */
    @Generated @NUInt public static final long AllLibrariesDirectory = 0x0000000000000065L;

    @Generated
    private NSSearchPathDirectory() {
    }

    /**
     * location of Trash directory
     */
    @Generated @NUInt public static final long TrashDirectory = 0x0000000000000066L;
}
