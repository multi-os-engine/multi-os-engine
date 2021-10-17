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

    /**
     * \brief The tag class for filename extensions such as \c "txt".
     * <p>
     * The leading period character is not part of the filename extension and
     * should not be included in the tag.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UTTagClassFilenameExtension();

    /**
     * \brief The tag class for MIME types such as \c "text/plain".
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UTTagClassMIMEType();

    /**
     * \brief A generic base type for most things (files, directories.)
     * <p>
     * UTI: public.item
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeItem();

    /**
     * \brief A base type for anything containing user-viewable document content
     * (documents, pasteboard data, and document packages.)
     * <p>
     * Types describing files or packages must also conform to \c UTTypeData or
     * \c UTTypePackage in order for the system to bind documents to them.
     * <p>
     * UTI: public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeContent();

    /**
     * \brief A base type for content formats supporting mixed embedded content
     * (i.e., compound documents).
     * <p>
     * UTI: public.composite-content
     * <p>
     * conforms to: public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCompositeContent();

    /**
     * \brief A data item mountable as a volume
     * <p>
     * UTI: public.disk-image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeDiskImage();

    /**
     * \brief A base type for any sort of simple byte stream, including files and
     * in-memory data.
     * <p>
     * UTI: public.data
     * <p>
     * conforms to: public.item
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeData();

    /**
     * \brief A file system directory (includes packages \em and folders.)
     * <p>
     * UTI: public.directory
     * <p>
     * conforms to: public.item
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeDirectory();

    /**
     * \brief Symbolic link and alias file types conform to this type.
     * <p>
     * UTI: com.apple.resolvable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeResolvable();

    /**
     * \brief A symbolic link.
     * <p>
     * UTI: public.symlink
     * <p>
     * conforms to: public.item, com.apple.resolvable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSymbolicLink();

    /**
     * \brief An executable item.
     * <p>
     * UTI: public.executable
     * <p>
     * conforms to: public.item
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeExecutable();

    /**
     * \brief A volume mount point (resolvable, resolves to the root directory of a
     * volume.)
     * <p>
     * UTI: com.apple.mount-point
     * <p>
     * conforms to: public.item, com.apple.resolvable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMountPoint();

    /**
     * \brief A fully-formed alias file.
     * <p>
     * UTI: com.apple.alias-file
     * <p>
     * conforms to: public.data, com.apple.resolvable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAliasFile();

    /**
     * \brief A URL bookmark.
     * <p>
     * UTI: com.apple.bookmark
     * <p>
     * conforms to: public.data, com.apple.resolvable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeURLBookmarkData();

    /**
     * \brief Any URL.
     * <p>
     * UTI: public.url
     * <p>
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeURL();

    /**
     * \brief A URL with the scheme \c "file:".
     * <p>
     * UTI: public.file-url
     * <p>
     * conforms to: public.url
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeFileURL();

    /**
     * \brief The base type for all text-encoded data, including text with markup
     * (HTML, RTF, etc.).
     * <p>
     * UTI: public.text
     * <p>
     * conforms to: public.data, public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeText();

    /**
     * \brief Text with no markup and an unspecified encoding.
     * <p>
     * UTI: public.plain-text
     * <p>
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePlainText();

    /**
     * \brief Plain text encoded as UTF-8.
     * <p>
     * UTI: public.utf8-plain-text
     * <p>
     * conforms to: public.plain-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUTF8PlainText();

    /**
     * \brief Plain text encoded as UTF-16 with a BOM, or if a BOM is not present,
     * using "external representation" byte order (big-endian).
     * <p>
     * UTI: public.utf16-external-plain-text
     * <p>
     * conforms to: public.plain-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUTF16ExternalPlainText();

    /**
     * \brief Plain text encoded as UTF-16, in native byte order, with an optional
     * BOM.
     * <p>
     * UTI: public.utf16-plain-text
     * <p>
     * conforms to: public.plain-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUTF16PlainText();

    /**
     * \brief Text containing delimited values.
     * <p>
     * UTI: public.delimited-values-text
     * <p>
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeDelimitedText();

    /**
     * \brief Text containing comma-separated values (.csv).
     * <p>
     * UTI: public.comma-separated-values-text
     * <p>
     * conforms to: public.delimited-values-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCommaSeparatedText();

    /**
     * \brief Text containing tab-separated values.
     * <p>
     * UTI: public.tab-separated-values-text
     * <p>
     * conforms to: public.delimited-values-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeTabSeparatedText();

    /**
     * \brief UTF-8 encoded text containing tab-separated values.
     * <p>
     * UTI: public.utf8-tab-separated-values-text
     * <p>
     * conforms to: public.tab-separated-values-text, public.utf8-plain-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUTF8TabSeparatedText();

    /**
     * \brief Rich Text Format data.
     * <p>
     * UTI: public.rtf
     * <p>
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeRTF();

    /**
     * \brief Any version of HTML.
     * <p>
     * UTI: public.html
     * <p>
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeHTML();

    /**
     * \brief Generic XML.
     * <p>
     * UTI: public.xml
     * <p>
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeXML();

    /**
     * \brief Yet Another Markup Language.
     * <p>
     * UTI: public.yaml
     * <p>
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeYAML();

    /**
     * \brief Abstract type for source code of any language.
     * <p>
     * UTI: public.source-code
     * <p>
     * conforms to: public.plain-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSourceCode();

    /**
     * \brief Assembly language source (.s)
     * <p>
     * UTI: public.assembly-source
     * <p>
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAssemblyLanguageSource();

    /**
     * \brief C source code (.c)
     * <p>
     * UTI: public.c-source
     * <p>
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCSource();

    /**
     * \brief Objective-C source code (.m)
     * <p>
     * UTI: public.objective-c-source
     * <p>
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeObjectiveCSource();

    /**
     * \brief Swift source code (.swift)
     * <p>
     * UTI: public.swift-source
     * <p>
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSwiftSource();

    /**
     * \brief C++ source code (.cp, etc.)
     * <p>
     * UTI: public.c-plus-plus-source
     * <p>
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCPlusPlusSource();

    /**
     * \brief Objective-C++ source code.
     * <p>
     * UTI: public.objective-c-plus-plus-source
     * <p>
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeObjectiveCPlusPlusSource();

    /**
     * \brief A C header.
     * <p>
     * UTI: public.c-header
     * <p>
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCHeader();

    /**
     * \brief A C++ header.
     * <p>
     * UTI: public.c-plus-plus-header
     * <p>
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCPlusPlusHeader();

    /**
     * \brief A base type for any scripting language source.
     * <p>
     * UTI: public.script
     * <p>
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeScript();

    /**
     * \brief An AppleScript text-based script (.applescript).
     * <p>
     * UTI: com.apple.applescript.text
     * <p>
     * conforms to: public.script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAppleScript();

    /**
     * \brief An Open Scripting Architecture binary script (.scpt).
     * <p>
     * UTI: com.apple.applescript.script
     * <p>
     * conforms to: public.data, public.script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeOSAScript();

    /**
     * \brief An Open Scripting Architecture script bundle (.scptd).
     * <p>
     * UTI: com.apple.applescript.script-bundle
     * <p>
     * conforms to: com.apple.bundle, com.apple.package, public.script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeOSAScriptBundle();

    /**
     * \brief JavaScript source code
     * <p>
     * UTI: com.netscape.javascript-source
     * <p>
     * conforms to: public.source-code, public.executable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeJavaScript();

    /**
     * \brief The base type for shell scripts.
     * <p>
     * UTI: public.shell-script
     * <p>
     * conforms to: public.script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeShellScript();

    /**
     * \brief A Perl script.
     * <p>
     * UTI: public.perl-script
     * <p>
     * conforms to: public.shell-script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePerlScript();

    /**
     * \brief A Python script.
     * <p>
     * UTI: public.python-script
     * <p>
     * conforms to: public.shell-script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePythonScript();

    /**
     * \brief A Ruby script.
     * <p>
     * UTI: public.ruby-script
     * <p>
     * conforms to: public.shell-script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeRubyScript();

    /**
     * \brief A PHP script.
     * <p>
     * UTI: public.php-script
     * <p>
     * conforms to: public.shell-script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePHPScript();

    /**
     * \brief JavaScript object notation (JSON) data
     * <p>
     * UTI: public.json
     * <p>
     * conforms to: public.text
     * <p>
     * \note JSON almost (but doesn't quite) conforms to
     * com.netscape.javascript-source.
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeJSON();

    /**
     * \brief A base type for property lists.
     * <p>
     * UTI: com.apple.property-list
     * <p>
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePropertyList();

    /**
     * \brief An XML property list.
     * <p>
     * UTI: com.apple.xml-property-list
     * <p>
     * conforms to: public.xml, com.apple.property-list
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeXMLPropertyList();

    /**
     * \brief A binary property list.
     * <p>
     * UTI: com.apple.binary-property-list
     * <p>
     * conforms to: com.apple.property-list
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeBinaryPropertyList();

    /**
     * \brief An Adobe PDF document.
     * <p>
     * UTI: com.adobe.pdf
     * <p>
     * conforms to: public.data, public.composite-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePDF();

    /**
     * \brief A Rich Text Format Directory document (RTF with content embedding
     * in its on-disk format.)
     * <p>
     * UTI: com.apple.rtfd
     * <p>
     * conforms to: com.apple.package, public.composite-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeRTFD();

    /**
     * \brief A flattened RTFD document (formatted for the pasteboard.)
     * <p>
     * UTI: com.apple.flat-rtfd
     * <p>
     * conforms to: public.data, public.composite-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeFlatRTFD();

    /**
     * \brief The WebKit webarchive format.
     * <p>
     * UTI: com.apple.webarchive
     * <p>
     * conforms to: public.data, public.composite-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeWebArchive();

    /**
     * \brief A base type for abstract image data.
     * <p>
     * UTI: public.image
     * <p>
     * conforms to: public.data, public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeImage();

    /**
     * \brief A JPEG image.
     * <p>
     * UTI: public.jpeg
     * <p>
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeJPEG();

    /**
     * \brief A TIFF image.
     * <p>
     * UTI: public.tiff
     * <p>
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeTIFF();

    /**
     * \brief A GIF image.
     * <p>
     * UTI: com.compuserve.gif
     * <p>
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeGIF();

    /**
     * \brief A PNG image.
     * <p>
     * UTI: public.png
     * <p>
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePNG();

    /**
     * \brief Apple icon data
     * <p>
     * UTI: com.apple.icns
     * <p>
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeICNS();

    /**
     * \brief A Windows bitmap.
     * <p>
     * UTI: com.microsoft.bmp
     * <p>
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeBMP();

    /**
     * \brief Windows icon data
     * <p>
     * UTI: com.microsoft.ico
     * <p>
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeICO();

    /**
     * \brief A base type for raw image data (.raw).
     * <p>
     * UTI: public.camera-raw-image
     * <p>
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeRAWImage();

    /**
     * \brief A Scalable Vector Graphics image.
     * <p>
     * UTI: public.svg-image
     * <p>
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSVG();

    /**
     * \brief A Live Photo.
     * <p>
     * UTI: com.apple.live-photo
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeLivePhoto();

    /**
     * \brief A High Efficiency Image File Format image.
     * <p>
     * UTI: public.heif
     * <p>
     * conforms to: public.heif-standard
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeHEIF();

    /**
     * \brief A High Efficiency Image Coding image.
     * <p>
     * UTI: public.heic
     * <p>
     * conforms to: public.heif-standard
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeHEIC();

    /**
     * \brief The WebP image format.
     * <p>
     * UTI: org.webmproject.webp
     * <p>
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeWebP();

    /**
     * \brief A base type for 3D content.
     * <p>
     * UTI: public.3d-content
     * <p>
     * conforms to: public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTType3DContent();

    /**
     * \brief Universal Scene Description content.
     * <p>
     * UTI: com.pixar.universal-scene-description
     * <p>
     * conforms to: public.3d-content, public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUSD();

    /**
     * \brief Universal Scene Description Package content.
     * <p>
     * UTI: com.pixar.universal-scene-description-mobile
     * <p>
     * conforms to: public.3d-content, public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUSDZ();

    /**
     * \brief A Reality File.
     * <p>
     * UTI: com.apple.reality
     * <p>
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeRealityFile();

    /**
     * \brief A SceneKit serialized scene.
     * <p>
     * UTI: com.apple.scenekit.scene
     * <p>
     * conforms to: public.3d-content, public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSceneKitScene();

    /**
     * \brief An AR reference object.
     * <p>
     * UTI: com.apple.arobject
     * <p>
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeARReferenceObject();

    /**
     * \brief Any audio and/or video content.
     * <p>
     * UTI: public.audiovisual-content
     * <p>
     * conforms to: public.data, public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAudiovisualContent();

    /**
     * \brief A media format which may contain both video and audio.
     * <p>
     * This type corresponds to what users would label a "movie".
     * <p>
     * UTI: public.movie
     * <p>
     * conforms to: public.audiovisual-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMovie();

    /**
     * \brief Pure video data with no audio data.
     * <p>
     * UTI: public.video
     * <p>
     * conforms to: public.movie
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeVideo();

    /**
     * \brief Pure audio data with no video data.
     * <p>
     * UTI: public.audio
     * <p>
     * conforms to: public.audiovisual-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAudio();

    /**
     * \brief A QuickTime movie.
     * <p>
     * UTI: com.apple.quicktime-movie
     * <p>
     * conforms to: public.movie
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeQuickTimeMovie();

    /**
     * \brief An MPEG-1 or MPEG-2 movie.
     * <p>
     * UTI: public.mpeg
     * <p>
     * conforms to: public.movie
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG();

    /**
     * \brief An MPEG-2 video.
     * <p>
     * UTI: public.mpeg-2-video
     * <p>
     * conforms to: public.video
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG2Video();

    /**
     * \brief The MPEG-2 Transport Stream movie format.
     * <p>
     * UTI: public.mpeg-2-transport-stream
     * <p>
     * conforms to: public.movie
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG2TransportStream();

    /**
     * \brief MP3 audio.
     * <p>
     * UTI: public.mp3
     * <p>
     * conforms to: public.audio
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMP3();

    /**
     * \brief MPEG-4 movie
     * <p>
     * UTI: public.mpeg-4
     * <p>
     * conforms to: public.movie
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG4Movie();

    /**
     * \brief An MPEG-4 audio layer file.
     * <p>
     * UTI: public.mpeg-4-audio
     * <p>
     * conforms to: public.mpeg-4, public.audio
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG4Audio();

    /**
     * \brief The Apple protected MPEG4 format (.m4p, iTunes music store format.)
     * <p>
     * UTI: com.apple.protected-mpeg-4-audio
     * <p>
     * conforms to: public.audio
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAppleProtectedMPEG4Audio();

    /**
     * \brief An Apple protected MPEG-4 movie.
     * <p>
     * UTI: com.apple.protected-mpeg-4-video
     * <p>
     * conforms to: com.apple.m4v-video
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAppleProtectedMPEG4Video();

    /**
     * \brief The AVI movie format.
     * <p>
     * UTI: public.avi
     * <p>
     * conforms to: public.movie
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAVI();

    /**
     * \brief The AIFF audio format
     * <p>
     * UTI: public.aiff-audio
     * <p>
     * conforms to: public.aifc-audio
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAIFF();

    /**
     * \brief The Microsoft waveform audio format (.wav).
     * <p>
     * UTI: com.microsoft.waveform-audio
     * <p>
     * conforms to: public.audio
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeWAV();

    /**
     * \brief The MIDI audio format.
     * <p>
     * UTI: public.midi-audio
     * <p>
     * conforms to: public.audio
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMIDI();

    /**
     * \brief The base type for playlists.
     * <p>
     * UTI: public.playlist
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePlaylist();

    /**
     * \brief An M3U or M3U8 playlist
     * <p>
     * UTI: public.m3u-playlist
     * <p>
     * conforms to: public.text, public.playlist
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeM3UPlaylist();

    /**
     * \brief A user-browsable directory (i.e. not a package.)
     * <p>
     * UTI: public.folder
     * <p>
     * conforms to: public.directory
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeFolder();

    /**
     * \brief The root folder of a volume or mount point.
     * <p>
     * UTI: public.volume
     * <p>
     * conforms to: public.folder
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeVolume();

    /**
     * \brief A packaged directory.
     * <p>
     * Bundles differ from packages in that a bundle has an internal file hierarchy
     * that \c CFBundle can read, while packages are displayed to the user as if
     * they were regular files. A single file system object can be both a package
     * and a bundle.
     * <p>
     * UTI: com.apple.package
     * <p>
     * conforms to: public.directory
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePackage();

    /**
     * \brief A directory conforming to one of the \c CFBundle layouts.
     * <p>
     * Bundles differ from packages in that a bundle has an internal file hierarchy
     * that \c CFBundle can read, while packages are displayed to the user as if
     * they were regular files. A single file system object can be both a package
     * and a bundle.
     * <p>
     * UTI: com.apple.bundle
     * <p>
     * conforms to: public.directory
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeBundle();

    /**
     * \brief The base type for bundle-based plugins.
     * <p>
     * UTI: com.apple.plugin
     * <p>
     * conforms to: com.apple.bundle, com.apple.package
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePluginBundle();

    /**
     * \brief A Spotlight metadata importer bundle.
     * <p>
     * UTI: com.apple.metadata-importer
     * <p>
     * conforms to: com.apple.plugin
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSpotlightImporter();

    /**
     * \brief A QuickLook preview generator bundle.
     * <p>
     * UTI: com.apple.quicklook-generator
     * <p>
     * conforms to: com.apple.plugin
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeQuickLookGenerator();

    /**
     * \brief An XPC service bundle.
     * <p>
     * UTI: com.apple.xpc-service
     * <p>
     * conforms to: com.apple.bundle, com.apple.package
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeXPCService();

    /**
     * \brief A macOS or iOS framework bundle.
     * <p>
     * UTI: com.apple.framework
     * <p>
     * conforms to: com.apple.bundle
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeFramework();

    /**
     * \brief The base type for macOS and iOS applications.
     * <p>
     * UTI: com.apple.application
     * <p>
     * conforms to: public.executable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeApplication();

    /**
     * \brief A bundled application.
     * <p>
     * UTI: com.apple.application-bundle
     * <p>
     * conforms to: com.apple.application, com.apple.bundle, com.apple.package
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeApplicationBundle();

    /**
     * \brief An application extension (.appex).
     * <p>
     * UTI: com.apple.application-and-system-extension
     * <p>
     * conforms to: com.apple.xpc-service
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeApplicationExtension();

    /**
     * \brief A UNIX executable (flat file.)
     * <p>
     * UTI: public.unix-executable
     * <p>
     * conforms to: public.data, public.executable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUnixExecutable();

    /**
     * \brief A Windows executable (.exe).
     * <p>
     * UTI: com.microsoft.windows-executable
     * <p>
     * conforms to: public.data, public.executable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeEXE();

    /**
     * \brief A System Preferences pane.
     * <p>
     * UTI: com.apple.systempreference.prefpane
     * <p>
     * conforms to: com.apple.package, com.apple.bundle
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSystemPreferencesPane();

    /**
     * \brief an archive of files and directories
     * <p>
     * UTI: public.archive
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeArchive();

    /**
     * \brief A GNU zip archive.
     * <p>
     * UTI: org.gnu.gnu-zip-archive
     * <p>
     * conforms to: public.data, public.archive
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeGZIP();

    /**
     * \brief A bzip2 archive.
     * <p>
     * UTI: public.bzip2-archive
     * <p>
     * conforms to: public.data, public.archive
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeBZ2();

    /**
     * \brief A zip archive.
     * <p>
     * UTI: public.zip-archive
     * <p>
     * conforms to: com.pkware.zip-archive
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeZIP();

    /**
     * \brief An Apple Archive.
     * <p>
     * UTI: com.apple.archive
     * <p>
     * conforms to: public.data, public.archive
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAppleArchive();

    /**
     * \brief A base type for spreadsheet documents.
     * <p>
     * UTI: public.spreadsheet
     * <p>
     * conforms to: public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSpreadsheet();

    /**
     * \brief A base type for presentation documents.
     * <p>
     * UTI: public.presentation
     * <p>
     * conforms to: public.composite-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePresentation();

    /**
     * \brief A database store.
     * <p>
     * UTI: public.database
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeDatabase();

    /**
     * \brief A base type for messages (email, IM, etc.)
     * <p>
     * UTI: public.message
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMessage();

    /**
     * \brief contact information, e.g. for a person, group, organization
     * <p>
     * UTI: public.contact
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeContact();

    /**
     * \brief A vCard file.
     * <p>
     * UTI: public.vcard
     * <p>
     * conforms to: public.text, public.contact
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeVCard();

    /**
     * \brief A to-do item.
     * <p>
     * UTI: public.to-do-item
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeToDoItem();

    /**
     * \brief A calendar event.
     * <p>
     * UTI: public.calendar-event
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCalendarEvent();

    /**
     * \brief An e-mail message.
     * <p>
     * UTI: public.email-message
     * <p>
     * conforms to: public.message
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeEmailMessage();

    /**
     * \brief A base type for Apple Internet location files.
     * <p>
     * UTI: com.apple.internet-location
     * <p>
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeInternetLocation();

    /**
     * \brief Microsoft Internet shortcut files (.url).
     * <p>
     * UTI: com.apple.internet-location
     * <p>
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeInternetShortcut();

    /**
     * \brief A base type for fonts.
     * <p>
     * UTI: public.font
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeFont();

    /**
     * \brief A bookmark.
     * <p>
     * UTI: public.bookmark
     * <p>
     * \sa UTTypeURLBookmarkData
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeBookmark();

    /**
     * \brief PKCS#12 data.
     * <p>
     * UTI: com.rsa.pkcs-12
     * <p>
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePKCS12();

    /**
     * \brief An X.509 certificate.
     * <p>
     * UTI: public.x509-certificate
     * <p>
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeX509Certificate();

    /**
     * \brief The EPUB format.
     * <p>
     * UTI: org.idpf.epub-container
     * <p>
     * conforms to: public.data, public.composite-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeEPUB();

    /**
     * \brief A base type for console logs.
     * <p>
     * UTI: public.log
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeLog();

    /**
     * \brief A makefile.
     * <p>
     * UTI: public.make-source
     * <p>
     * conforms to: public.script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMakefile();
}
