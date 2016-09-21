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

package apple.mobilecoreservices.c;

import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;

@Generated
@Library("MobileCoreServices")
@Runtime(CRuntime.class)
public final class MobileCoreServices {
    static {
        NatJ.register();
    }

    @Generated
    private MobileCoreServices() {
    }

    @Generated
    @CFunction
    public static native CFStringRef UTTypeCreatePreferredIdentifierForTag(CFStringRef inTagClass, CFStringRef inTag,
            CFStringRef inConformingToUTI);

    @Generated
    @CFunction
    public static native CFArrayRef UTTypeCreateAllIdentifiersForTag(CFStringRef inTagClass, CFStringRef inTag,
            CFStringRef inConformingToUTI);

    @Generated
    @CFunction
    public static native CFStringRef UTTypeCopyPreferredTagWithClass(CFStringRef inUTI, CFStringRef inTagClass);

    @Generated
    @CFunction
    public static native CFArrayRef UTTypeCopyAllTagsWithClass(CFStringRef inUTI, CFStringRef inTagClass);

    @Generated
    @CFunction
    public static native byte UTTypeEqual(CFStringRef inUTI1, CFStringRef inUTI2);

    @Generated
    @CFunction
    public static native byte UTTypeConformsTo(CFStringRef inUTI, CFStringRef inConformsToUTI);

    @Generated
    @CFunction
    public static native CFStringRef UTTypeCopyDescription(CFStringRef inUTI);

    @Generated
    @CFunction
    public static native byte UTTypeIsDeclared(CFStringRef inUTI);

    @Generated
    @CFunction
    public static native byte UTTypeIsDynamic(CFStringRef inUTI);

    @Generated
    @CFunction
    public static native CFDictionaryRef UTTypeCopyDeclaration(CFStringRef inUTI);

    @Generated
    @CFunction
    public static native CFURLRef UTTypeCopyDeclaringBundleURL(CFStringRef inUTI);

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeItem();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeContent();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCompositeContent();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMessage();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeContact();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeArchive();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDiskImage();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeData();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDirectory();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeResolvable();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSymLink();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeExecutable();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMountPoint();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAliasFile();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAliasRecord();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeURLBookmarkData();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeURL();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFileURL();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePlainText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUTF8PlainText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUTF16ExternalPlainText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUTF16PlainText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDelimitedText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCommaSeparatedText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeTabSeparatedText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUTF8TabSeparatedText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeRTF();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeHTML();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeXML();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSourceCode();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAssemblyLanguageSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeObjectiveCSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCPlusPlusSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeObjectiveCPlusPlusSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCHeader();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCPlusPlusHeader();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJavaSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAppleScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeOSAScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeOSAScriptBundle();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJavaScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeShellScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePerlScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePythonScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeRubyScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePHPScript();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJSON();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePropertyList();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeXMLPropertyList();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBinaryPropertyList();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePDF();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeRTFD();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFlatRTFD();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeTXNTextAndMultimediaData();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeWebArchive();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeImage();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJPEG();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJPEG2000();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeTIFF();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePICT();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeGIF();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePNG();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeQuickTimeImage();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAppleICNS();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBMP();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeICO();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeRawImage();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeScalableVectorGraphics();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAudiovisualContent();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMovie();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeVideo();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAudio();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeQuickTimeMovie();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG2Video();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG2TransportStream();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMP3();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG4();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMPEG4Audio();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAppleProtectedMPEG4Audio();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAppleProtectedMPEG4Video();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAVIMovie();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeAudioInterchangeFileFormat();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeWaveformAudio();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeMIDIAudio();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePlaylist();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeM3UPlaylist();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFolder();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeVolume();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePackage();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBundle();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePluginBundle();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSpotlightImporter();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeQuickLookGenerator();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeXPCService();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFramework();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeApplication();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeApplicationBundle();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeApplicationFile();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeUnixExecutable();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeWindowsExecutable();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJavaClass();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeJavaArchive();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSystemPreferencesPane();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeGNUZipArchive();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBzip2Archive();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeZipArchive();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSpreadsheet();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePresentation();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDatabase();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeVCard();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeToDoItem();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeCalendarEvent();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeEmailMessage();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeInternetLocation();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeInkText();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeFont();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeBookmark();

    @Generated
    @CVariable()
    public static native CFStringRef kUTType3DContent();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypePKCS12();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeX509Certificate();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeElectronicPublication();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeLog();

    @Generated
    @CVariable()
    public static native CFStringRef kUTExportedTypeDeclarationsKey();

    @Generated
    @CVariable()
    public static native CFStringRef kUTImportedTypeDeclarationsKey();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeTagSpecificationKey();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeConformsToKey();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeDescriptionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeIconFileKey();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeReferenceURLKey();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeVersionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTagClassFilenameExtension();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTagClassMIMEType();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeSwiftSource();

    @Generated
    @CVariable()
    public static native CFStringRef kUTTypeLivePhoto();
}
