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
     * 
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
     * 
     * UTI: public.item
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeItem();

    /**
     * \brief A base type for anything containing user-viewable document content
     * 	(documents, pasteboard data, and document packages.)
     * 
     * Types describing files or packages must also conform to \c UTTypeData or
     * \c UTTypePackage in order for the system to bind documents to them.
     * 
     * UTI: public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeContent();

    /**
     * \brief A base type for content formats supporting mixed embedded content
     * 	(i.e., compound documents).
     * 
     * UTI: public.composite-content
     * 
     * conforms to: public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCompositeContent();

    /**
     * \brief A data item mountable as a volume
     * 
     * UTI: public.disk-image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeDiskImage();

    /**
     * \brief A base type for any sort of simple byte stream, including files and
     * 	in-memory data.
     * 
     * UTI: public.data
     * 
     * conforms to: public.item
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeData();

    /**
     * \brief A file system directory (includes packages \em and folders.)
     * 
     * UTI: public.directory
     * 
     * conforms to: public.item
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeDirectory();

    /**
     * \brief Symbolic link and alias file types conform to this type.
     * 
     * UTI: com.apple.resolvable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeResolvable();

    /**
     * \brief A symbolic link.
     * 
     * UTI: public.symlink
     * 
     * conforms to: public.item, com.apple.resolvable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSymbolicLink();

    /**
     * \brief An executable item.
     * 
     * UTI: public.executable
     * 
     * conforms to: public.item
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeExecutable();

    /**
     * \brief A volume mount point (resolvable, resolves to the root directory of a
     * 	volume.)
     * 
     * UTI: com.apple.mount-point
     * 
     * conforms to: public.item, com.apple.resolvable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMountPoint();

    /**
     * \brief A fully-formed alias file.
     * 
     * UTI: com.apple.alias-file
     * 
     * conforms to: public.data, com.apple.resolvable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAliasFile();

    /**
     * \brief A URL bookmark.
     * 
     * UTI: com.apple.bookmark
     * 
     * conforms to: public.data, com.apple.resolvable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeURLBookmarkData();

    /**
     * \brief Any URL.
     * 
     * UTI: public.url
     * 
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeURL();

    /**
     * \brief A URL with the scheme \c "file:".
     * 
     * UTI: public.file-url
     * 
     * conforms to: public.url
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeFileURL();

    /**
     * \brief The base type for all text-encoded data, including text with markup
     * 	(HTML, RTF, etc.).
     * 
     * UTI: public.text
     * 
     * conforms to: public.data, public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeText();

    /**
     * \brief Text with no markup and an unspecified encoding.
     * 
     * UTI: public.plain-text
     * 
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePlainText();

    /**
     * \brief Plain text encoded as UTF-8.
     * 
     * UTI: public.utf8-plain-text
     * 
     * conforms to: public.plain-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUTF8PlainText();

    /**
     * \brief Plain text encoded as UTF-16 with a BOM, or if a BOM is not present,
     * 	using "external representation" byte order (big-endian).
     * 
     * UTI: public.utf16-external-plain-text
     * 
     * conforms to: public.plain-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUTF16ExternalPlainText();

    /**
     * \brief Plain text encoded as UTF-16, in native byte order, with an optional
     * 	BOM.
     * 
     * UTI: public.utf16-plain-text
     * 
     * conforms to: public.plain-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUTF16PlainText();

    /**
     * \brief Text containing delimited values.
     * 
     * UTI: public.delimited-values-text
     * 
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeDelimitedText();

    /**
     * \brief Text containing comma-separated values (.csv).
     * 
     * UTI: public.comma-separated-values-text
     * 
     * conforms to: public.delimited-values-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCommaSeparatedText();

    /**
     * \brief Text containing tab-separated values.
     * 
     * UTI: public.tab-separated-values-text
     * 
     * conforms to: public.delimited-values-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeTabSeparatedText();

    /**
     * \brief UTF-8 encoded text containing tab-separated values.
     * 
     * UTI: public.utf8-tab-separated-values-text
     * 
     * conforms to: public.tab-separated-values-text, public.utf8-plain-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUTF8TabSeparatedText();

    /**
     * \brief Rich Text Format data.
     * 
     * UTI: public.rtf
     * 
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeRTF();

    /**
     * \brief Any version of HTML.
     * 
     * UTI: public.html
     * 
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeHTML();

    /**
     * \brief Generic XML.
     * 
     * UTI: public.xml
     * 
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeXML();

    /**
     * \brief Yet Another Markup Language.
     * 
     * UTI: public.yaml
     * 
     * conforms to: public.text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeYAML();

    /**
     * \brief Abstract type for source code of any language.
     * 
     * UTI: public.source-code
     * 
     * conforms to: public.plain-text
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSourceCode();

    /**
     * \brief Assembly language source (.s)
     * 
     * UTI: public.assembly-source
     * 
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAssemblyLanguageSource();

    /**
     * \brief C source code (.c)
     * 
     * UTI: public.c-source
     * 
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCSource();

    /**
     * \brief Objective-C source code (.m)
     * 
     * UTI: public.objective-c-source
     * 
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeObjectiveCSource();

    /**
     * \brief Swift source code (.swift)
     * 
     * UTI: public.swift-source
     * 
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSwiftSource();

    /**
     * \brief C++ source code (.cp, etc.)
     * 
     * UTI: public.c-plus-plus-source
     * 
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCPlusPlusSource();

    /**
     * \brief Objective-C++ source code.
     * 
     * UTI: public.objective-c-plus-plus-source
     * 
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeObjectiveCPlusPlusSource();

    /**
     * \brief A C header.
     * 
     * UTI: public.c-header
     * 
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCHeader();

    /**
     * \brief A C++ header.
     * 
     * UTI: public.c-plus-plus-header
     * 
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCPlusPlusHeader();

    /**
     * \brief A base type for any scripting language source.
     * 
     * UTI: public.script
     * 
     * conforms to: public.source-code
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeScript();

    /**
     * \brief An AppleScript text-based script (.applescript).
     * 
     * UTI: com.apple.applescript.text
     * 
     * conforms to: public.script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAppleScript();

    /**
     * \brief An Open Scripting Architecture binary script (.scpt).
     * 
     * UTI: com.apple.applescript.script
     * 
     * conforms to: public.data, public.script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeOSAScript();

    /**
     * \brief An Open Scripting Architecture script bundle (.scptd).
     * 
     * UTI: com.apple.applescript.script-bundle
     * 
     * conforms to: com.apple.bundle, com.apple.package, public.script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeOSAScriptBundle();

    /**
     * \brief JavaScript source code
     * 
     * UTI: com.netscape.javascript-source
     * 
     * conforms to: public.source-code, public.executable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeJavaScript();

    /**
     * \brief The base type for shell scripts.
     * 
     * UTI: public.shell-script
     * 
     * conforms to: public.script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeShellScript();

    /**
     * \brief A Perl script.
     * 
     * UTI: public.perl-script
     * 
     * conforms to: public.shell-script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePerlScript();

    /**
     * \brief A Python script.
     * 
     * UTI: public.python-script
     * 
     * conforms to: public.shell-script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePythonScript();

    /**
     * \brief A Ruby script.
     * 
     * UTI: public.ruby-script
     * 
     * conforms to: public.shell-script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeRubyScript();

    /**
     * \brief A PHP script.
     * 
     * UTI: public.php-script
     * 
     * conforms to: public.shell-script
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePHPScript();

    /**
     * \brief JavaScript object notation (JSON) data
     * 
     * UTI: public.json
     * 
     * conforms to: public.text
     * 
     * \note JSON almost (but doesn't quite) conforms to
     * 	com.netscape.javascript-source.
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeJSON();

    /**
     * \brief A base type for property lists.
     * 
     * UTI: com.apple.property-list
     * 
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePropertyList();

    /**
     * \brief An XML property list.
     * 
     * UTI: com.apple.xml-property-list
     * 
     * conforms to: public.xml, com.apple.property-list
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeXMLPropertyList();

    /**
     * \brief A binary property list.
     * 
     * UTI: com.apple.binary-property-list
     * 
     * conforms to: com.apple.property-list
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeBinaryPropertyList();

    /**
     * \brief An Adobe PDF document.
     * 
     * UTI: com.adobe.pdf
     * 
     * conforms to: public.data, public.composite-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePDF();

    /**
     * \brief A Rich Text Format Directory document (RTF with content embedding
     * 	in its on-disk format.)
     * 
     * UTI: com.apple.rtfd
     * 
     * conforms to: com.apple.package, public.composite-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeRTFD();

    /**
     * \brief A flattened RTFD document (formatted for the pasteboard.)
     * 
     * UTI: com.apple.flat-rtfd
     * 
     * conforms to: public.data, public.composite-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeFlatRTFD();

    /**
     * \brief The WebKit webarchive format.
     * 
     * UTI: com.apple.webarchive
     * 
     * conforms to: public.data, public.composite-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeWebArchive();

    /**
     * \brief A base type for abstract image data.
     * 
     * UTI: public.image
     * 
     * conforms to: public.data, public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeImage();

    /**
     * \brief A JPEG image.
     * 
     * UTI: public.jpeg
     * 
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeJPEG();

    /**
     * \brief A TIFF image.
     * 
     * UTI: public.tiff
     * 
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeTIFF();

    /**
     * \brief A GIF image.
     * 
     * UTI: com.compuserve.gif
     * 
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeGIF();

    /**
     * \brief A PNG image.
     * 
     * UTI: public.png
     * 
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePNG();

    /**
     * \brief Apple icon data
     * 
     * UTI: com.apple.icns
     * 
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeICNS();

    /**
     * \brief A Windows bitmap.
     * 
     * UTI: com.microsoft.bmp
     * 
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeBMP();

    /**
     * \brief Windows icon data
     * 
     * UTI: com.microsoft.ico
     * 
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeICO();

    /**
     * \brief A base type for raw image data (.raw).
     * 
     * UTI: public.camera-raw-image
     * 
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeRAWImage();

    /**
     * \brief A Scalable Vector Graphics image.
     * 
     * UTI: public.svg-image
     * 
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSVG();

    /**
     * \brief A Live Photo.
     * 
     * UTI: com.apple.live-photo
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeLivePhoto();

    /**
     * \brief A High Efficiency Image File Format image.
     * 
     * UTI: public.heif
     * 
     * conforms to: public.heif-standard
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeHEIF();

    /**
     * \brief A High Efficiency Image Coding image.
     * 
     * UTI: public.heic
     * 
     * conforms to: public.heif-standard
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeHEIC();

    /**
     * \brief The WebP image format.
     * 
     * UTI: org.webmproject.webp
     * 
     * conforms to: public.image
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeWebP();

    /**
     * \brief A base type for 3D content.
     * 
     * UTI: public.3d-content
     * 
     * conforms to: public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTType3DContent();

    /**
     * \brief Universal Scene Description content.
     * 
     * UTI: com.pixar.universal-scene-description
     * 
     * conforms to: public.3d-content, public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUSD();

    /**
     * \brief Universal Scene Description Package content.
     * 
     * UTI: com.pixar.universal-scene-description-mobile
     * 
     * conforms to: public.3d-content, public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUSDZ();

    /**
     * \brief A Reality File.
     * 
     * UTI: com.apple.reality
     * 
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeRealityFile();

    /**
     * \brief A SceneKit serialized scene.
     * 
     * UTI: com.apple.scenekit.scene
     * 
     * conforms to: public.3d-content, public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSceneKitScene();

    /**
     * \brief An AR reference object.
     * 
     * UTI: com.apple.arobject
     * 
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeARReferenceObject();

    /**
     * \brief Any audio and/or video content.
     * 
     * UTI: public.audiovisual-content
     * 
     * conforms to: public.data, public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAudiovisualContent();

    /**
     * \brief A media format which may contain both video and audio.
     * 
     * This type corresponds to what users would label a "movie".
     * 
     * UTI: public.movie
     * 
     * conforms to: public.audiovisual-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMovie();

    /**
     * \brief Pure video data with no audio data.
     * 
     * UTI: public.video
     * 
     * conforms to: public.movie
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeVideo();

    /**
     * \brief Pure audio data with no video data.
     * 
     * UTI: public.audio
     * 
     * conforms to: public.audiovisual-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAudio();

    /**
     * \brief A QuickTime movie.
     * 
     * UTI: com.apple.quicktime-movie
     * 
     * conforms to: public.movie
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeQuickTimeMovie();

    /**
     * \brief An MPEG-1 or MPEG-2 movie.
     * 
     * UTI: public.mpeg
     * 
     * conforms to: public.movie
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG();

    /**
     * \brief An MPEG-2 video.
     * 
     * UTI: public.mpeg-2-video
     * 
     * conforms to: public.video
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG2Video();

    /**
     * \brief The MPEG-2 Transport Stream movie format.
     * 
     * UTI: public.mpeg-2-transport-stream
     * 
     * conforms to: public.movie
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG2TransportStream();

    /**
     * \brief MP3 audio.
     * 
     * UTI: public.mp3
     * 
     * conforms to: public.audio
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMP3();

    /**
     * \brief MPEG-4 movie
     * 
     * UTI: public.mpeg-4
     * 
     * conforms to: public.movie
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG4Movie();

    /**
     * \brief An MPEG-4 audio layer file.
     * 
     * UTI: public.mpeg-4-audio
     * 
     * conforms to: public.mpeg-4, public.audio
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMPEG4Audio();

    /**
     * \brief The Apple protected MPEG4 format (.m4p, iTunes music store format.)
     * 
     * UTI: com.apple.protected-mpeg-4-audio
     * 
     * conforms to: public.audio
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAppleProtectedMPEG4Audio();

    /**
     * \brief An Apple protected MPEG-4 movie.
     * 
     * UTI: com.apple.protected-mpeg-4-video
     * 
     * conforms to: com.apple.m4v-video
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAppleProtectedMPEG4Video();

    /**
     * \brief The AVI movie format.
     * 
     * UTI: public.avi
     * 
     * conforms to: public.movie
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAVI();

    /**
     * \brief The AIFF audio format
     * 
     * UTI: public.aiff-audio
     * 
     * conforms to: public.aifc-audio
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAIFF();

    /**
     * \brief The Microsoft waveform audio format (.wav).
     * 
     * UTI: com.microsoft.waveform-audio
     * 
     * conforms to: public.audio
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeWAV();

    /**
     * \brief The MIDI audio format.
     * 
     * UTI: public.midi-audio
     * 
     * conforms to: public.audio
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMIDI();

    /**
     * \brief The base type for playlists.
     * 
     * UTI: public.playlist
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePlaylist();

    /**
     * \brief An M3U or M3U8 playlist
     * 
     * UTI: public.m3u-playlist
     * 
     * conforms to: public.text, public.playlist
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeM3UPlaylist();

    /**
     * \brief A user-browsable directory (i.e. not a package.)
     * 
     * UTI: public.folder
     * 
     * conforms to: public.directory
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeFolder();

    /**
     * \brief The root folder of a volume or mount point.
     * 
     * UTI: public.volume
     * 
     * conforms to: public.folder
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeVolume();

    /**
     * \brief A packaged directory.
     * 
     * Bundles differ from packages in that a bundle has an internal file hierarchy
     * that \c CFBundle can read, while packages are displayed to the user as if
     * they were regular files. A single file system object can be both a package
     * and a bundle.
     * 
     * UTI: com.apple.package
     * 
     * conforms to: public.directory
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePackage();

    /**
     * \brief A directory conforming to one of the \c CFBundle layouts.
     * 
     * Bundles differ from packages in that a bundle has an internal file hierarchy
     * that \c CFBundle can read, while packages are displayed to the user as if
     * they were regular files. A single file system object can be both a package
     * and a bundle.
     * 
     * UTI: com.apple.bundle
     * 
     * conforms to: public.directory
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeBundle();

    /**
     * \brief The base type for bundle-based plugins.
     * 
     * UTI: com.apple.plugin
     * 
     * conforms to: com.apple.bundle, com.apple.package
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePluginBundle();

    /**
     * \brief A Spotlight metadata importer bundle.
     * 
     * UTI: com.apple.metadata-importer
     * 
     * conforms to: com.apple.plugin
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSpotlightImporter();

    /**
     * \brief A QuickLook preview generator bundle.
     * 
     * UTI: com.apple.quicklook-generator
     * 
     * conforms to: com.apple.plugin
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeQuickLookGenerator();

    /**
     * \brief An XPC service bundle.
     * 
     * UTI: com.apple.xpc-service
     * 
     * conforms to: com.apple.bundle, com.apple.package
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeXPCService();

    /**
     * \brief A macOS or iOS framework bundle.
     * 
     * UTI: com.apple.framework
     * 
     * conforms to: com.apple.bundle
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeFramework();

    /**
     * \brief The base type for macOS and iOS applications.
     * 
     * UTI: com.apple.application
     * 
     * conforms to: public.executable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeApplication();

    /**
     * \brief A bundled application.
     * 
     * UTI: com.apple.application-bundle
     * 
     * conforms to: com.apple.application, com.apple.bundle, com.apple.package
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeApplicationBundle();

    /**
     * \brief An application extension (.appex).
     * 
     * UTI: com.apple.application-and-system-extension
     * 
     * conforms to: com.apple.xpc-service
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeApplicationExtension();

    /**
     * \brief A UNIX executable (flat file.)
     * 
     * UTI: public.unix-executable
     * 
     * conforms to: public.data, public.executable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeUnixExecutable();

    /**
     * \brief A Windows executable (.exe).
     * 
     * UTI: com.microsoft.windows-executable
     * 
     * conforms to: public.data, public.executable
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeEXE();

    /**
     * \brief A System Preferences pane.
     * 
     * UTI: com.apple.systempreference.prefpane
     * 
     * conforms to: com.apple.package, com.apple.bundle
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSystemPreferencesPane();

    /**
     * \brief an archive of files and directories
     * 
     * UTI: public.archive
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeArchive();

    /**
     * \brief A GNU zip archive.
     * 
     * UTI: org.gnu.gnu-zip-archive
     * 
     * conforms to: public.data, public.archive
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeGZIP();

    /**
     * \brief A bzip2 archive.
     * 
     * UTI: public.bzip2-archive
     * 
     * conforms to: public.data, public.archive
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeBZ2();

    /**
     * \brief A zip archive.
     * 
     * UTI: public.zip-archive
     * 
     * conforms to: com.pkware.zip-archive
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeZIP();

    /**
     * \brief An Apple Archive.
     * 
     * UTI: com.apple.archive
     * 
     * conforms to: public.data, public.archive
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeAppleArchive();

    /**
     * \brief A base type for spreadsheet documents.
     * 
     * UTI: public.spreadsheet
     * 
     * conforms to: public.content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeSpreadsheet();

    /**
     * \brief A base type for presentation documents.
     * 
     * UTI: public.presentation
     * 
     * conforms to: public.composite-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePresentation();

    /**
     * \brief A database store.
     * 
     * UTI: public.database
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeDatabase();

    /**
     * \brief A base type for messages (email, IM, etc.)
     * 
     * UTI: public.message
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeMessage();

    /**
     * \brief contact information, e.g. for a person, group, organization
     * 
     * UTI: public.contact
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeContact();

    /**
     * \brief A vCard file.
     * 
     * UTI: public.vcard
     * 
     * conforms to: public.text, public.contact
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeVCard();

    /**
     * \brief A to-do item.
     * 
     * UTI: public.to-do-item
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeToDoItem();

    /**
     * \brief A calendar event.
     * 
     * UTI: public.calendar-event
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeCalendarEvent();

    /**
     * \brief An e-mail message.
     * 
     * UTI: public.email-message
     * 
     * conforms to: public.message
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeEmailMessage();

    /**
     * \brief A base type for Apple Internet location files.
     * 
     * UTI: com.apple.internet-location
     * 
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeInternetLocation();

    /**
     * \brief Microsoft Internet shortcut files (.url).
     * 
     * UTI: com.apple.internet-location
     * 
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeInternetShortcut();

    /**
     * \brief A base type for fonts.
     * 
     * UTI: public.font
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeFont();

    /**
     * \brief A bookmark.
     * 
     * UTI: public.bookmark
     * 
     * \sa UTTypeURLBookmarkData
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeBookmark();

    /**
     * \brief PKCS#12 data.
     * 
     * UTI: com.rsa.pkcs-12
     * 
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypePKCS12();

    /**
     * \brief An X.509 certificate.
     * 
     * UTI: public.x509-certificate
     * 
     * conforms to: public.data
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeX509Certificate();

    /**
     * \brief The EPUB format.
     * 
     * UTI: org.idpf.epub-container
     * 
     * conforms to: public.data, public.composite-content
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeEPUB();

    /**
     * \brief A base type for console logs.
     * 
     * UTI: public.log
     */
    @Generated
    @CVariable()
    public static native UTType UTTypeLog();
}