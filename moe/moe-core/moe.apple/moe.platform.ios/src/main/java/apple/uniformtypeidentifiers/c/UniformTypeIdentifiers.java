package apple.uniformtypeidentifiers.c;

import apple.uniformtypeidentifiers.UTType;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("UniformTypeIdentifiers")
@Runtime(CRuntime.class)
public final class UniformTypeIdentifiers {
    static {
        NatJ.register();
    }

    @Generated
    private UniformTypeIdentifiers() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UTTagClassFilenameExtension();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UTTagClassMIMEType();

    @Generated
    @CVariable()
    public static native UTType UTTypeItem();

    @Generated
    @CVariable()
    public static native UTType UTTypeContent();

    @Generated
    @CVariable()
    public static native UTType UTTypeCompositeContent();

    @Generated
    @CVariable()
    public static native UTType UTTypeDiskImage();

    @Generated
    @CVariable()
    public static native UTType UTTypeData();

    @Generated
    @CVariable()
    public static native UTType UTTypeDirectory();

    @Generated
    @CVariable()
    public static native UTType UTTypeResolvable();

    @Generated
    @CVariable()
    public static native UTType UTTypeSymbolicLink();

    @Generated
    @CVariable()
    public static native UTType UTTypeExecutable();

    @Generated
    @CVariable()
    public static native UTType UTTypeMountPoint();

    @Generated
    @CVariable()
    public static native UTType UTTypeAliasFile();

    @Generated
    @CVariable()
    public static native UTType UTTypeURLBookmarkData();

    @Generated
    @CVariable()
    public static native UTType UTTypeURL();

    @Generated
    @CVariable()
    public static native UTType UTTypeFileURL();

    @Generated
    @CVariable()
    public static native UTType UTTypeText();

    @Generated
    @CVariable()
    public static native UTType UTTypePlainText();

    @Generated
    @CVariable()
    public static native UTType UTTypeUTF8PlainText();

    @Generated
    @CVariable()
    public static native UTType UTTypeUTF16ExternalPlainText();

    @Generated
    @CVariable()
    public static native UTType UTTypeUTF16PlainText();

    @Generated
    @CVariable()
    public static native UTType UTTypeDelimitedText();

    @Generated
    @CVariable()
    public static native UTType UTTypeCommaSeparatedText();

    @Generated
    @CVariable()
    public static native UTType UTTypeTabSeparatedText();

    @Generated
    @CVariable()
    public static native UTType UTTypeUTF8TabSeparatedText();

    @Generated
    @CVariable()
    public static native UTType UTTypeRTF();

    @Generated
    @CVariable()
    public static native UTType UTTypeHTML();

    @Generated
    @CVariable()
    public static native UTType UTTypeXML();

    @Generated
    @CVariable()
    public static native UTType UTTypeYAML();

    @Generated
    @CVariable()
    public static native UTType UTTypeSourceCode();

    @Generated
    @CVariable()
    public static native UTType UTTypeAssemblyLanguageSource();

    @Generated
    @CVariable()
    public static native UTType UTTypeCSource();

    @Generated
    @CVariable()
    public static native UTType UTTypeObjectiveCSource();

    @Generated
    @CVariable()
    public static native UTType UTTypeSwiftSource();

    @Generated
    @CVariable()
    public static native UTType UTTypeCPlusPlusSource();

    @Generated
    @CVariable()
    public static native UTType UTTypeObjectiveCPlusPlusSource();

    @Generated
    @CVariable()
    public static native UTType UTTypeCHeader();

    @Generated
    @CVariable()
    public static native UTType UTTypeCPlusPlusHeader();

    @Generated
    @CVariable()
    public static native UTType UTTypeScript();

    @Generated
    @CVariable()
    public static native UTType UTTypeAppleScript();

    @Generated
    @CVariable()
    public static native UTType UTTypeOSAScript();

    @Generated
    @CVariable()
    public static native UTType UTTypeOSAScriptBundle();

    @Generated
    @CVariable()
    public static native UTType UTTypeJavaScript();

    @Generated
    @CVariable()
    public static native UTType UTTypeShellScript();

    @Generated
    @CVariable()
    public static native UTType UTTypePerlScript();

    @Generated
    @CVariable()
    public static native UTType UTTypePythonScript();

    @Generated
    @CVariable()
    public static native UTType UTTypeRubyScript();

    @Generated
    @CVariable()
    public static native UTType UTTypePHPScript();

    @Generated
    @CVariable()
    public static native UTType UTTypeJSON();

    @Generated
    @CVariable()
    public static native UTType UTTypePropertyList();

    @Generated
    @CVariable()
    public static native UTType UTTypeXMLPropertyList();

    @Generated
    @CVariable()
    public static native UTType UTTypeBinaryPropertyList();

    @Generated
    @CVariable()
    public static native UTType UTTypePDF();

    @Generated
    @CVariable()
    public static native UTType UTTypeRTFD();

    @Generated
    @CVariable()
    public static native UTType UTTypeFlatRTFD();

    @Generated
    @CVariable()
    public static native UTType UTTypeWebArchive();

    @Generated
    @CVariable()
    public static native UTType UTTypeImage();

    @Generated
    @CVariable()
    public static native UTType UTTypeJPEG();

    @Generated
    @CVariable()
    public static native UTType UTTypeTIFF();

    @Generated
    @CVariable()
    public static native UTType UTTypeGIF();

    @Generated
    @CVariable()
    public static native UTType UTTypePNG();

    @Generated
    @CVariable()
    public static native UTType UTTypeICNS();

    @Generated
    @CVariable()
    public static native UTType UTTypeBMP();

    @Generated
    @CVariable()
    public static native UTType UTTypeICO();

    @Generated
    @CVariable()
    public static native UTType UTTypeRAWImage();

    @Generated
    @CVariable()
    public static native UTType UTTypeSVG();

    @Generated
    @CVariable()
    public static native UTType UTTypeLivePhoto();

    @Generated
    @CVariable()
    public static native UTType UTTypeHEIF();

    @Generated
    @CVariable()
    public static native UTType UTTypeHEIC();

    @Generated
    @CVariable()
    public static native UTType UTTypeWebP();

    @Generated
    @CVariable()
    public static native UTType UTType3DContent();

    @Generated
    @CVariable()
    public static native UTType UTTypeUSD();

    @Generated
    @CVariable()
    public static native UTType UTTypeUSDZ();

    @Generated
    @CVariable()
    public static native UTType UTTypeRealityFile();

    @Generated
    @CVariable()
    public static native UTType UTTypeSceneKitScene();

    @Generated
    @CVariable()
    public static native UTType UTTypeARReferenceObject();

    @Generated
    @CVariable()
    public static native UTType UTTypeAudiovisualContent();

    @Generated
    @CVariable()
    public static native UTType UTTypeMovie();

    @Generated
    @CVariable()
    public static native UTType UTTypeVideo();

    @Generated
    @CVariable()
    public static native UTType UTTypeAudio();

    @Generated
    @CVariable()
    public static native UTType UTTypeQuickTimeMovie();

    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG();

    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG2Video();

    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG2TransportStream();

    @Generated
    @CVariable()
    public static native UTType UTTypeMP3();

    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG4Movie();

    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG4Audio();

    @Generated
    @CVariable()
    public static native UTType UTTypeAppleProtectedMPEG4Audio();

    @Generated
    @CVariable()
    public static native UTType UTTypeAppleProtectedMPEG4Video();

    @Generated
    @CVariable()
    public static native UTType UTTypeAVI();

    @Generated
    @CVariable()
    public static native UTType UTTypeAIFF();

    @Generated
    @CVariable()
    public static native UTType UTTypeWAV();

    @Generated
    @CVariable()
    public static native UTType UTTypeMIDI();

    @Generated
    @CVariable()
    public static native UTType UTTypePlaylist();

    @Generated
    @CVariable()
    public static native UTType UTTypeM3UPlaylist();

    @Generated
    @CVariable()
    public static native UTType UTTypeFolder();

    @Generated
    @CVariable()
    public static native UTType UTTypeVolume();

    @Generated
    @CVariable()
    public static native UTType UTTypePackage();

    @Generated
    @CVariable()
    public static native UTType UTTypeBundle();

    @Generated
    @CVariable()
    public static native UTType UTTypePluginBundle();

    @Generated
    @CVariable()
    public static native UTType UTTypeSpotlightImporter();

    @Generated
    @CVariable()
    public static native UTType UTTypeQuickLookGenerator();

    @Generated
    @CVariable()
    public static native UTType UTTypeXPCService();

    @Generated
    @CVariable()
    public static native UTType UTTypeFramework();

    @Generated
    @CVariable()
    public static native UTType UTTypeApplication();

    @Generated
    @CVariable()
    public static native UTType UTTypeApplicationBundle();

    @Generated
    @CVariable()
    public static native UTType UTTypeApplicationExtension();

    @Generated
    @CVariable()
    public static native UTType UTTypeUnixExecutable();

    @Generated
    @CVariable()
    public static native UTType UTTypeEXE();

    @Generated
    @CVariable()
    public static native UTType UTTypeSystemPreferencesPane();

    @Generated
    @CVariable()
    public static native UTType UTTypeArchive();

    @Generated
    @CVariable()
    public static native UTType UTTypeGZIP();

    @Generated
    @CVariable()
    public static native UTType UTTypeBZ2();

    @Generated
    @CVariable()
    public static native UTType UTTypeZIP();

    @Generated
    @CVariable()
    public static native UTType UTTypeAppleArchive();

    @Generated
    @CVariable()
    public static native UTType UTTypeSpreadsheet();

    @Generated
    @CVariable()
    public static native UTType UTTypePresentation();

    @Generated
    @CVariable()
    public static native UTType UTTypeDatabase();

    @Generated
    @CVariable()
    public static native UTType UTTypeMessage();

    @Generated
    @CVariable()
    public static native UTType UTTypeContact();

    @Generated
    @CVariable()
    public static native UTType UTTypeVCard();

    @Generated
    @CVariable()
    public static native UTType UTTypeToDoItem();

    @Generated
    @CVariable()
    public static native UTType UTTypeCalendarEvent();

    @Generated
    @CVariable()
    public static native UTType UTTypeEmailMessage();

    @Generated
    @CVariable()
    public static native UTType UTTypeInternetLocation();

    @Generated
    @CVariable()
    public static native UTType UTTypeInternetShortcut();

    @Generated
    @CVariable()
    public static native UTType UTTypeFont();

    @Generated
    @CVariable()
    public static native UTType UTTypeBookmark();

    @Generated
    @CVariable()
    public static native UTType UTTypePKCS12();

    @Generated
    @CVariable()
    public static native UTType UTTypeX509Certificate();

    @Generated
    @CVariable()
    public static native UTType UTTypeEPUB();

    @Generated
    @CVariable()
    public static native UTType UTTypeLog();
}