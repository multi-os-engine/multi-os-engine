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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
     * URLForResource:withExtension:subdirectory:inBundleWithURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/URLForResource:withExtension:subdirectory:inBundleWithURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLForResource:withExtension:subdirectory:inBundleWithURL:")
    public static native NSURL URLForResourceWithExtensionSubdirectoryInBundleWithURL(String name, String ext,
            String subpath, NSURL bundleURL);

    /**
     * URLsForResourcesWithExtension:subdirectory:inBundleWithURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/URLsForResourcesWithExtension:subdirectory:inBundleWithURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLsForResourcesWithExtension:subdirectory:inBundleWithURL:")
    public static native NSArray<? extends NSURL> URLsForResourcesWithExtensionSubdirectoryInBundleWithURL(String ext,
            String subpath, NSURL bundleURL);

    /**
     * allBundles</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/allBundles">iOS Dev Center</a>
     */
    @Generated
    @Selector("allBundles")
    public static native NSArray<? extends NSBundle> allBundles();

    /**
     * allFrameworks</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/allFrameworks">iOS Dev Center</a>
     */
    @Generated
    @Selector("allFrameworks")
    public static native NSArray<? extends NSBundle> allFrameworks();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSBundle alloc();

    /**
     * bundleForClass:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/bundleForClass:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bundleForClass:")
    public static native NSBundle bundleForClass(Class aClass);

    /**
     * bundleWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/bundleWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bundleWithIdentifier:")
    public static native NSBundle bundleWithIdentifier(String identifier);

    /**
     * bundleWithPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/bundleWithPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bundleWithPath:")
    public static native NSBundle bundleWithPath(String path);

    /**
     * bundleWithURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/bundleWithURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bundleWithURL:")
    public static native NSBundle bundleWithURL(NSURL url);

    /**
     * mainBundle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/mainBundle">iOS Dev Center</a>
     */
    @Generated
    @Selector("mainBundle")
    public static native NSBundle mainBundle();

    /**
     * pathForResource:ofType:inDirectory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/pathForResource:ofType:inDirectory:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathForResource:ofType:inDirectory:")
    public static native String pathForResourceOfTypeInDirectory_static(String name, String ext, String bundlePath);

    /**
     * pathsForResourcesOfType:inDirectory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/pathsForResourcesOfType:inDirectory:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathsForResourcesOfType:inDirectory:")
    public static native NSArray<String> pathsForResourcesOfTypeInDirectory_static(String ext, String bundlePath);

    /**
     * preferredLocalizationsFromArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/preferredLocalizationsFromArray:">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredLocalizationsFromArray:")
    public static native NSArray<String> preferredLocalizationsFromArray(NSArray<String> localizationsArray);

    /**
     * preferredLocalizationsFromArray:forPreferences:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/clm/NSBundle/preferredLocalizationsFromArray:forPreferences:">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredLocalizationsFromArray:forPreferences:")
    public static native NSArray<String> preferredLocalizationsFromArrayForPreferences(
            NSArray<String> localizationsArray, NSArray<String> preferencesArray);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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
    @Selector("initialize")
    public static native void initialize();

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

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * URLForAuxiliaryExecutable:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/URLForAuxiliaryExecutable:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLForAuxiliaryExecutable:")
    public native NSURL URLForAuxiliaryExecutable(String executableName);

    /**
     * URLForResource:withExtension:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/URLForResource:withExtension:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLForResource:withExtension:")
    public native NSURL URLForResourceWithExtension(String name, String ext);

    /**
     * URLForResource:withExtension:subdirectory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/URLForResource:withExtension:subdirectory:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLForResource:withExtension:subdirectory:")
    public native NSURL URLForResourceWithExtensionSubdirectory(String name, String ext, String subpath);

    /**
     * URLForResource:withExtension:subdirectory:localization:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/URLForResource:withExtension:subdirectory:localization:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLForResource:withExtension:subdirectory:localization:")
    public native NSURL URLForResourceWithExtensionSubdirectoryLocalization(String name, String ext, String subpath,
            String localizationName);

    /**
     * URLsForResourcesWithExtension:subdirectory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/URLsForResourcesWithExtension:subdirectory:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLsForResourcesWithExtension:subdirectory:")
    public native NSArray<? extends NSURL> URLsForResourcesWithExtensionSubdirectory(String ext, String subpath);

    /**
     * URLsForResourcesWithExtension:subdirectory:localization:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/URLsForResourcesWithExtension:subdirectory:localization:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLsForResourcesWithExtension:subdirectory:localization:")
    public native NSArray<? extends NSURL> URLsForResourcesWithExtensionSubdirectoryLocalization(String ext,
            String subpath, String localizationName);

    /**
     * appStoreReceiptURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/appStoreReceiptURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("appStoreReceiptURL")
    public native NSURL appStoreReceiptURL();

    /**
     * builtInPlugInsPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/builtInPlugInsPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("builtInPlugInsPath")
    public native String builtInPlugInsPath();

    /**
     * builtInPlugInsURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/builtInPlugInsURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("builtInPlugInsURL")
    public native NSURL builtInPlugInsURL();

    /**
     * bundleIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/bundleIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("bundleIdentifier")
    public native String bundleIdentifier();

    /**
     * bundlePath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/bundlePath">iOS Dev Center</a>
     */
    @Generated
    @Selector("bundlePath")
    public native String bundlePath();

    /**
     * bundleURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/bundleURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("bundleURL")
    public native NSURL bundleURL();

    /**
     * classNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/classNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("classNamed:")
    public native Class classNamed(String className);

    /**
     * developmentLocalization</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/developmentLocalization">iOS Dev Center</a>
     */
    @Generated
    @Selector("developmentLocalization")
    public native String developmentLocalization();

    /**
     * executableArchitectures</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/executableArchitectures">iOS Dev Center</a>
     */
    @Generated
    @Selector("executableArchitectures")
    public native NSArray<? extends NSNumber> executableArchitectures();

    /**
     * executablePath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/executablePath">iOS Dev Center</a>
     */
    @Generated
    @Selector("executablePath")
    public native String executablePath();

    /**
     * executableURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/executableURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("executableURL")
    public native NSURL executableURL();

    /**
     * infoDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/infoDictionary">iOS Dev Center</a>
     */
    @Generated
    @Selector("infoDictionary")
    public native NSDictionary<String, ?> infoDictionary();

    @Generated
    @Selector("init")
    public native NSBundle init();

    /**
     * initWithPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/initWithPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithPath:")
    public native NSBundle initWithPath(String path);

    /**
     * initWithURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/initWithURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURL:")
    public native NSBundle initWithURL(NSURL url);

    /**
     * loaded</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/loaded">iOS Dev Center</a>
     */
    @Generated
    @Selector("isLoaded")
    public native boolean isLoaded();

    /**
     * load</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/load">iOS Dev Center</a>
     */
    @Generated
    @Selector("load")
    public native boolean load_objc();

    /**
     * loadAndReturnError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/loadAndReturnError:">iOS Dev Center</a>
     */
    @Generated
    @Selector("loadAndReturnError:")
    public native boolean loadAndReturnError(Ptr<NSError> error);

    /**
     * loadNibNamed:owner:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSBundle_UIKitAdditions/index.html#//apple_ref/occ/instm/NSBundle/loadNibNamed:owner:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("loadNibNamed:owner:options:")
    public native NSArray<?> loadNibNamedOwnerOptions(String name, @Mapped(ObjCObjectMapper.class) Object owner,
            NSDictionary<?, ?> options);

    /**
     * localizations</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/localizations">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizations")
    public native NSArray<String> localizations();

    /**
     * localizedInfoDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/localizedInfoDictionary">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedInfoDictionary")
    public native NSDictionary<String, ?> localizedInfoDictionary();

    /**
     * localizedStringForKey:value:table:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/localizedStringForKey:value:table:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedStringForKey:value:table:")
    public native String localizedStringForKeyValueTable(String key, String value, String tableName);

    /**
     * objectForInfoDictionaryKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/objectForInfoDictionaryKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectForInfoDictionaryKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForInfoDictionaryKey(String key);

    /**
     * pathForAuxiliaryExecutable:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/pathForAuxiliaryExecutable:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathForAuxiliaryExecutable:")
    public native String pathForAuxiliaryExecutable(String executableName);

    /**
     * pathForResource:ofType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/pathForResource:ofType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathForResource:ofType:")
    public native String pathForResourceOfType(String name, String ext);

    /**
     * pathForResource:ofType:inDirectory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/pathForResource:ofType:inDirectory:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathForResource:ofType:inDirectory:")
    public native String pathForResourceOfTypeInDirectory(String name, String ext, String subpath);

    /**
     * pathForResource:ofType:inDirectory:forLocalization:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/pathForResource:ofType:inDirectory:forLocalization:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathForResource:ofType:inDirectory:forLocalization:")
    public native String pathForResourceOfTypeInDirectoryForLocalization(String name, String ext, String subpath,
            String localizationName);

    /**
     * pathsForResourcesOfType:inDirectory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/pathsForResourcesOfType:inDirectory:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathsForResourcesOfType:inDirectory:")
    public native NSArray<String> pathsForResourcesOfTypeInDirectory(String ext, String subpath);

    /**
     * pathsForResourcesOfType:inDirectory:forLocalization:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/pathsForResourcesOfType:inDirectory:forLocalization:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pathsForResourcesOfType:inDirectory:forLocalization:")
    public native NSArray<String> pathsForResourcesOfTypeInDirectoryForLocalization(String ext, String subpath,
            String localizationName);

    /**
     * preferredLocalizations</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/preferredLocalizations">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredLocalizations")
    public native NSArray<String> preferredLocalizations();

    /**
     * preflightAndReturnError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/preflightAndReturnError:">iOS Dev Center</a>
     */
    @Generated
    @Selector("preflightAndReturnError:")
    public native boolean preflightAndReturnError(Ptr<NSError> error);

    /**
     * principalClass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/principalClass">iOS Dev Center</a>
     */
    @Generated
    @Selector("principalClass")
    public native Class principalClass();

    /**
     * privateFrameworksPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/privateFrameworksPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("privateFrameworksPath")
    public native String privateFrameworksPath();

    /**
     * privateFrameworksURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/privateFrameworksURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("privateFrameworksURL")
    public native NSURL privateFrameworksURL();

    /**
     * resourcePath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/resourcePath">iOS Dev Center</a>
     */
    @Generated
    @Selector("resourcePath")
    public native String resourcePath();

    /**
     * resourceURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/resourceURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("resourceURL")
    public native NSURL resourceURL();

    /**
     * sharedFrameworksPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/sharedFrameworksPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("sharedFrameworksPath")
    public native String sharedFrameworksPath();

    /**
     * sharedFrameworksURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/sharedFrameworksURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("sharedFrameworksURL")
    public native NSURL sharedFrameworksURL();

    /**
     * sharedSupportPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/sharedSupportPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("sharedSupportPath")
    public native String sharedSupportPath();

    /**
     * sharedSupportURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instp/NSBundle/sharedSupportURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("sharedSupportURL")
    public native NSURL sharedSupportURL();

    /**
     * unload</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/unload">iOS Dev Center</a>
     */
    @Generated
    @Selector("unload")
    public native boolean unload();

    /**
     * preservationPriorityForTag:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/preservationPriorityForTag:">iOS Dev Center</a>
     */
    @Generated
    @Selector("preservationPriorityForTag:")
    public native double preservationPriorityForTag(String tag);

    /**
     * setPreservationPriority:forTags:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSBundle_Class/index.html#//apple_ref/occ/instm/NSBundle/setPreservationPriority:forTags:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreservationPriority:forTags:")
    public native void setPreservationPriorityForTags(double priority, NSSet<String> tags);
}
