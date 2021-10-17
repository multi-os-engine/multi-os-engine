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

package apple.foundation;

import apple.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Because NSBundle caches allocated instances, subclasses should be prepared
 * to receive an already initialized object back from [super initWithPath:]
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSBundle extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSBundle(Pointer peer) {
        super(peer);
    }

    /**
     * Methods for locating bundle resources.  Instance methods locate resources in the bundle indicated by the receiver; class methods take an argument pointing to a bundle on disk.  In the class methods, bundleURL is a URL pointing to the location of a bundle on disk, and may not be nil; bundlePath is the path equivalent of bundleURL, an absolute path pointing to the location of a bundle on disk.  By contrast, subpath is a relative path to a subdirectory inside the relevant global or localized resource directory, and should be nil if the resource file in question is not in a subdirectory.  Where appropriate, localizationName is the name of a .lproj directory in the bundle, minus the .lproj extension; passing nil for localizationName retrieves only global resources, whereas using a method without this argument retrieves both global and localized resources (using the standard localization search algorithm).
     */
    @Generated
    @Selector("URLForResource:withExtension:subdirectory:inBundleWithURL:")
    public static native NSURL URLForResourceWithExtensionSubdirectoryInBundleWithURL(String name, String ext,
            String subpath, NSURL bundleURL);

    @Generated
    @Selector("URLsForResourcesWithExtension:subdirectory:inBundleWithURL:")
    public static native NSArray<? extends NSURL> URLsForResourcesWithExtensionSubdirectoryInBundleWithURL(String ext,
            String subpath, NSURL bundleURL);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allBundles")
    public static native NSArray<? extends NSBundle> allBundles();

    @Generated
    @Selector("allFrameworks")
    public static native NSArray<? extends NSBundle> allFrameworks();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSBundle alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSBundle allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("bundleForClass:")
    public static native NSBundle bundleForClass(Class aClass);

    @Generated
    @Selector("bundleWithIdentifier:")
    public static native NSBundle bundleWithIdentifier(String identifier);

    @Generated
    @Selector("bundleWithPath:")
    public static native NSBundle bundleWithPath(String path);

    @Generated
    @Selector("bundleWithURL:")
    public static native NSBundle bundleWithURL(NSURL url);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Methods for creating or retrieving bundle instances.
     */
    @Generated
    @Selector("mainBundle")
    public static native NSBundle mainBundle();

    @Generated
    @Owned
    @Selector("new")
    public static native NSBundle new_objc();

    @Generated
    @Selector("pathForResource:ofType:inDirectory:")
    public static native String pathForResourceOfTypeInDirectory_static(String name, String ext, String bundlePath);

    @Generated
    @Selector("pathsForResourcesOfType:inDirectory:")
    public static native NSArray<String> pathsForResourcesOfTypeInDirectory_static(String ext, String bundlePath);

    @Generated
    @Selector("preferredLocalizationsFromArray:")
    public static native NSArray<String> preferredLocalizationsFromArray(NSArray<String> localizationsArray);

    @Generated
    @Selector("preferredLocalizationsFromArray:forPreferences:")
    public static native NSArray<String> preferredLocalizationsFromArrayForPreferences(
            NSArray<String> localizationsArray, NSArray<String> preferencesArray);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("URLForAuxiliaryExecutable:")
    public native NSURL URLForAuxiliaryExecutable(String executableName);

    @Generated
    @Selector("URLForResource:withExtension:")
    public native NSURL URLForResourceWithExtension(String name, String ext);

    @Generated
    @Selector("URLForResource:withExtension:subdirectory:")
    public native NSURL URLForResourceWithExtensionSubdirectory(String name, String ext, String subpath);

    @Generated
    @Selector("URLForResource:withExtension:subdirectory:localization:")
    public native NSURL URLForResourceWithExtensionSubdirectoryLocalization(String name, String ext, String subpath,
            String localizationName);

    @Generated
    @Selector("URLsForResourcesWithExtension:subdirectory:")
    public native NSArray<? extends NSURL> URLsForResourcesWithExtensionSubdirectory(String ext, String subpath);

    @Generated
    @Selector("URLsForResourcesWithExtension:subdirectory:localization:")
    public native NSArray<? extends NSURL> URLsForResourcesWithExtensionSubdirectoryLocalization(String ext,
            String subpath, String localizationName);

    @Generated
    @Selector("appStoreReceiptURL")
    public native NSURL appStoreReceiptURL();

    @Generated
    @Selector("builtInPlugInsPath")
    public native String builtInPlugInsPath();

    @Generated
    @Selector("builtInPlugInsURL")
    public native NSURL builtInPlugInsURL();

    /**
     * Methods for obtaining various information about a bundle.
     */
    @Generated
    @Selector("bundleIdentifier")
    public native String bundleIdentifier();

    @Generated
    @Selector("bundlePath")
    public native String bundlePath();

    /**
     * Methods for locating various components of a bundle.
     */
    @Generated
    @Selector("bundleURL")
    public native NSURL bundleURL();

    @Generated
    @Selector("classNamed:")
    public native Class classNamed(String className);

    @Generated
    @Selector("developmentLocalization")
    public native String developmentLocalization();

    @Generated
    @Selector("executableArchitectures")
    public native NSArray<? extends NSNumber> executableArchitectures();

    @Generated
    @Selector("executablePath")
    public native String executablePath();

    @Generated
    @Selector("executableURL")
    public native NSURL executableURL();

    @Generated
    @Selector("infoDictionary")
    public native NSDictionary<String, ?> infoDictionary();

    @Generated
    @Selector("init")
    public native NSBundle init();

    @Generated
    @Selector("initWithPath:")
    public native NSBundle initWithPath(String path);

    @Generated
    @Selector("initWithURL:")
    public native NSBundle initWithURL(NSURL url);

    @Generated
    @Selector("isLoaded")
    public native boolean isLoaded();

    /**
     * Methods for loading and unloading bundles.
     */
    @Generated
    @Selector("load")
    public native boolean load_objc();

    @Generated
    @Selector("loadAndReturnError:")
    public native boolean loadAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("loadNibNamed:owner:options:")
    public native NSArray<?> loadNibNamedOwnerOptions(String name, @Mapped(ObjCObjectMapper.class) Object owner,
            NSDictionary<String, ?> options);

    /**
     * list of language names this bundle appears to be localized to
     */
    @Generated
    @Selector("localizations")
    public native NSArray<String> localizations();

    @Generated
    @Selector("localizedInfoDictionary")
    public native NSDictionary<String, ?> localizedInfoDictionary();

    /**
     * Methods for retrieving localized strings.
     */
    @Generated
    @Selector("localizedStringForKey:value:table:")
    public native String localizedStringForKeyValueTable(String key, String value, String tableName);

    @Generated
    @Selector("objectForInfoDictionaryKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForInfoDictionaryKey(String key);

    @Generated
    @Selector("pathForAuxiliaryExecutable:")
    public native String pathForAuxiliaryExecutable(String executableName);

    @Generated
    @Selector("pathForResource:ofType:")
    public native String pathForResourceOfType(String name, String ext);

    @Generated
    @Selector("pathForResource:ofType:inDirectory:")
    public native String pathForResourceOfTypeInDirectory(String name, String ext, String subpath);

    @Generated
    @Selector("pathForResource:ofType:inDirectory:forLocalization:")
    public native String pathForResourceOfTypeInDirectoryForLocalization(String name, String ext, String subpath,
            String localizationName);

    @Generated
    @Selector("pathsForResourcesOfType:inDirectory:")
    public native NSArray<String> pathsForResourcesOfTypeInDirectory(String ext, String subpath);

    @Generated
    @Selector("pathsForResourcesOfType:inDirectory:forLocalization:")
    public native NSArray<String> pathsForResourcesOfTypeInDirectoryForLocalization(String ext, String subpath,
            String localizationName);

    /**
     * a subset of this bundle's localizations, re-ordered into the preferred order for this process's current execution environment; the main bundle's preferred localizations indicate the language (of text) the user is most likely seeing in the UI
     */
    @Generated
    @Selector("preferredLocalizations")
    public native NSArray<String> preferredLocalizations();

    @Generated
    @Selector("preflightAndReturnError:")
    public native boolean preflightAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("preservationPriorityForTag:")
    public native double preservationPriorityForTag(String tag);

    @Generated
    @Selector("principalClass")
    public native Class principalClass();

    @Generated
    @Selector("privateFrameworksPath")
    public native String privateFrameworksPath();

    @Generated
    @Selector("privateFrameworksURL")
    public native NSURL privateFrameworksURL();

    @Generated
    @Selector("resourcePath")
    public native String resourcePath();

    @Generated
    @Selector("resourceURL")
    public native NSURL resourceURL();

    /**
     * Set a preservation priority for tags that are included in this bundle for the On Demand Resources system. Preservation priorities may be between 0.0 and 1.0, with higher values being the last choice for purging by the system. The exact meaning of this value is up to your application as it only has meaning within the set of tags your application uses.
     * <p>
     * The default value is 0.0.
     * <p>
     * This method will throw an exception if the receiver bundle has no on demand resource tag information.
     */
    @Generated
    @Selector("setPreservationPriority:forTags:")
    public native void setPreservationPriorityForTags(double priority, NSSet<String> tags);

    @Generated
    @Selector("sharedFrameworksPath")
    public native String sharedFrameworksPath();

    @Generated
    @Selector("sharedFrameworksURL")
    public native NSURL sharedFrameworksURL();

    @Generated
    @Selector("sharedSupportPath")
    public native String sharedSupportPath();

    @Generated
    @Selector("sharedSupportURL")
    public native NSURL sharedSupportURL();

    @Generated
    @Selector("unload")
    public native boolean unload();

    @Generated
    @Selector("localizedAttributedStringForKey:value:table:")
    public native NSAttributedString localizedAttributedStringForKeyValueTable(String key, String value,
            String tableName);
}
