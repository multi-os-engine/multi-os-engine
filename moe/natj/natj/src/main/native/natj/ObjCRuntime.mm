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

#include "CRuntime.h"

#include "ObjCRuntime.h"
#include "ObjCHandlers.h"
#include "ObjCImplementations.h"
#include "ObjCInstanceContainer.h"
#include "ObjCException.h"

#import <objc/runtime.h>
#import <objc/message.h>
#import <objc/objc-sync.h>
#import <dispatch/dispatch.h>
#import <libkern/OSAtomic.h>

#import <Foundation/NSDictionary.h>
#import <Foundation/NSString.h>
#import <Foundation/NSArray.h>
#import <Foundation/NSThread.h>
#import <Foundation/NSValue.h>
#import <Foundation/NSAutoreleasePool.h>
#import "ObjCProperties.h"

#include <map>

#if __LP64__
#define MAX_STRUCT_REG_SIZE 16
#elif __arm__
#define MAX_STRUCT_REG_SIZE 4
#else
#define MAX_STRUCT_REG_SIZE 8
#endif

static NSString* gFoundationJavaPath = @"" NATJ_PLATFORM_ROOT_PACKAGE "/foundation/";

static char gInstanceContainerKey;
static char gAssociationKey;

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wundeclared-selector"
const SEL gObjCOriginalInitializeSelector = @selector(initialize_original);
#pragma clang diagnostic pop

NSMutableDictionary* gObjCAllocMap = NULL;
NSMutableDictionary* gObjCHybridMap = NULL;
NSMutableDictionary* gObjCTypeMap = NULL;

static NSString* gInitTargetKey = @"NATJ_OBJC_INIT_TARGET";
void setCurrentInitTargetOnCurrentThread(jobject);
void unsetCurrentInitTargetOnCurrentThread();

ObjCInstanceContainer* getBindingInstanceContainer(id);
void setBindingInstanceContainer(id, ObjCInstanceContainer*);
ObjCInstanceContainer* getCustomInstanceContainer(id);
ObjCInstanceContainer* getJavaBlockInstanceContainer(id);
void setCustomInstanceContainer(id, ObjCInstanceContainer*);

BOOL isInheritedClass(Class);
BOOL isProxyClass(Class);
BOOL isHybridClass(Class);
BOOL isBindingClass(Class);
ObjCAllocInfo* getAllocInfoForClass(Class);
ProxyExtensionInfo* getExtensionInfoForProxyClass(Class);

int8_t getDefaultVariadicUnboxPolicy();

// For some reason these are hidden from the public headers
void (*_objc_destroyWeak)(id*);
id (*_objc_loadWeakRetained)(id*);

static Class gBlockClass = NSClassFromString(@"NSBlock");
static Class gStackBlockClass = NSClassFromString(@"__NSStackBlock");

static int8_t gDefaultUnboxPolicy;

struct JavaBlockData {
  ffi_closure* closure;
  void* code;
};

struct BlockLayout {
  void* unused1;
  int flags;
  int unused2;
  IMP callback;
  void* unused3;
};

struct DummyJavaBlockLayout : public BlockLayout {
  ObjCInstanceContainer* container;
};

IMP getBlockCallback(id block);
std::tuple<void*, void*> getSelectorCallback(ffi_type* type);

jobject getObjCRuntime();

static jobject gRuntime = NULL;

jclass gObjCRuntimeClass = NULL;
jclass gNSObjectClass = NULL;
jclass gSelectorClass = NULL;
jclass gCategoryClassMethodClass = NULL;
jclass gInstanceVariableClass = NULL;
jclass gNotImplementedClass = NULL;
jclass gPropertyClass = NULL;
jclass gObjCClassBindingClass = NULL;
jclass gObjCClassNameClass = NULL;
jclass gObjCProtocolNameClass = NULL;
jclass gObjCCategoryClass = NULL;
jclass gObjCObjectMapperClass = NULL;
jclass gSELClass = NULL;
jclass gObjCExceptionClass = NULL;
jclass gIFrameworkInitializerClass = NULL;
jclass gObjCObjectClass = NULL;
jclass gProtocolClassMethodClass = NULL;
jclass gSelectorFinderClass = NULL;
jclass gUnsupportedAnnotationExceptionClass = NULL;

jmethodID gGetSelectorMethod = NULL;
jmethodID gGetIvarNameMethod = NULL;
jmethodID gGetIvarIsGetterMethod = NULL;
jmethodID gGetObjCClassNameMethod = NULL;
jmethodID gGetObjCProtocolNameMethod = NULL;
jmethodID gGetObjCCategoryClassMethod = NULL;
jmethodID gObjCExceptionConstructorMethod = NULL;
jmethodID gCleanupObjCProxyMethod = NULL;
jmethodID gCleanupObjCBlockMethod = NULL;
jmethodID gHandleFrameworkInitializerMethod = NULL;
jmethodID gGetExceptionStacktraceStaticMethod = NULL;
jmethodID gGetProtocolClassMethodSelectorMethod = NULL;
jmethodID gSelectorFinderConstructorMethod = NULL;
jmethodID gPrepareParentsSelectorsListMethod = NULL;
jmethodID gGetSelectorForMethodMethod = NULL;

@interface CountedAssociationHolder : NSObject
@end

@implementation CountedAssociationHolder {
  std::map<id, NSUInteger> associations;
}

- (void)addObject:(id)object {
  auto it = associations.emplace(object, 1);
  if (it.second) {
    [object retain];
  } else {
    it.first->second++;
  }
}

- (void)removeObject:(id)object {
  auto it = associations.find(object);
  if (it != associations.end()) {
    if (it->second == 1) {
      associations.erase(it);
      [object release];
    } else {
      it->second--;
    }
  }
}

- (void)dealloc {
  for (auto entry : associations) {
    [entry.first release];
  }
  [super dealloc];
}

@end

static NSString* createObjCTypeEncoding(ffi_type*);
static NSString* createObjCMethodDescriptor(ffi_type*, unsigned, ffi_type**);

static bool isSelectorOfInitMethod(const char*);

static Class registerObjCClass(JNIEnv*, jclass, bool, jstring, jclass);

// Accept only hybrid classes and package initializers
bool handleObjCStartup(JNIEnv* env, jclass clazz) {
  {
    jclass runtime = env->FindClass("org/moe/natj/objc/ObjCRuntime");
    forceInitClass(env, runtime);
    env->DeleteLocalRef(runtime);
  }

  if (env->IsAssignableFrom(clazz, gIFrameworkInitializerClass)) {
    jmethodID constructor = env->GetMethodID(clazz, "<init>", "()V");
    jobject initializer = env->NewObject(clazz, constructor);
    jobject runtime = env->CallStaticObjectMethod(
        gNatJClass, gGetOrCreateInstanceOfRuntimeClassStaticMethod,
        gObjCRuntimeClass);
    env->CallVoidMethod(runtime, gHandleFrameworkInitializerMethod,
                        initializer);
    env->DeleteLocalRef(runtime);
    env->DeleteLocalRef(initializer);
    return true;
  }

  if (!env->IsAssignableFrom(clazz, gNSObjectClass)) {
    return false;
  }

  if (env->CallBooleanMethod(clazz, gIsAnnotationPresentMethod,
                             gObjCClassBindingClass)) {
    return false;
  }

  jobject ann =
      env->CallObjectMethod(clazz, gGetAnnotationMethod, gObjCClassNameClass);
  jstring nativeName;
  if (env->IsSameObject(ann, NULL)) {
    nativeName = (jstring)env->CallObjectMethod(clazz, gGetClassNameMethod);
  } else {
    nativeName = (jstring)env->CallObjectMethod(ann, gGetObjCClassNameMethod);
    env->DeleteLocalRef(ann);
  }

  const char* nativeCName = env->GetStringUTFChars(nativeName, NULL);
  Class objcClass = objc_getClass(nativeCName);

  if (objcClass != nil) {
    Class objcMetaClass = object_getClass(objcClass);

    // Swizzle the initializer
    IMP original = class_replaceMethod(objcMetaClass, @selector(initialize),
                                       (IMP)initialize_hybrid, "v@:");
    if (original) {
      class_addMethod(objcMetaClass, gObjCOriginalInitializeSelector, original,
                      "v@:");
    }

    // Store Java name
    @synchronized(gObjCHybridMap) {
      jstring javaName =
          (jstring)env->CallObjectMethod(clazz, gGetClassNameMethod);
      const char* javaCName = env->GetStringUTFChars(javaName, NULL);
      @autoreleasepool {
        // We use NSValue to avoid invokation of +initialize
        [gObjCHybridMap setObject:[[NSString stringWithUTF8String:javaCName]
                                      stringByReplacingOccurrencesOfString:@"."
                                                                withString:@"/"]
                           forKey:[NSValue valueWithPointer:objcClass]];
      }
      env->ReleaseStringUTFChars(javaName, javaCName);
      env->DeleteLocalRef(javaName);
    }
  }

  env->ReleaseStringUTFChars(nativeName, nativeCName);
  env->DeleteLocalRef(nativeName);

  return objcClass != nil;
}

void Java_org_moe_natj_objc_ObjCRuntime_initialize(JNIEnv* env,
                                                       jclass clazz,
                                                       jobject instance) {
  gObjCRuntimeClass = (jclass)env->NewGlobalRef(clazz);

  env->PushLocalFrame(50);

  gNSObjectClass =
      (jclass)env->NewGlobalRef(env->FindClass(NATJ_PLATFORM_ROOT_PACKAGE "/NSObject"));
  gSelectorClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ann/Selector"));
  gCategoryClassMethodClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ann/CategoryClassMethod"));
  gInstanceVariableClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ann/InstanceVariable"));
  gNotImplementedClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ann/NotImplemented"));
  gPropertyClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ann/Property"));
  gObjCClassBindingClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ann/ObjCClassBinding"));
  gObjCClassNameClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ann/ObjCClassName"));
  gObjCProtocolNameClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ann/ObjCProtocolName"));
  gObjCCategoryClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ann/ObjCCategory"));
  gObjCObjectMapperClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/map/ObjCObjectMapper"));
  gSELClass =
      (jclass)env->NewGlobalRef(env->FindClass("org/moe/natj/objc/SEL"));
  gObjCExceptionClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ObjCException"));
  gIFrameworkInitializerClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/IFrameworkInitializer"));
  gObjCObjectClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ObjCObject"));
  gProtocolClassMethodClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ann/ProtocolClassMethod"));
  gSelectorFinderClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/objc/ObjCSelectorsFinder"));
  gUnsupportedAnnotationExceptionClass = (jclass)env->NewGlobalRef(
      env->FindClass("org/moe/natj/general/UnSupportedAnnotationException"));

  env->PopLocalFrame(NULL);

  gGetSelectorMethod =
      env->GetMethodID(gSelectorClass, "value", "()Ljava/lang/String;");
  gGetIvarNameMethod =
      env->GetMethodID(gInstanceVariableClass, "name", "()Ljava/lang/String;");
  gGetIvarIsGetterMethod =
      env->GetMethodID(gInstanceVariableClass, "isGetter", "()Z");
  gGetObjCClassNameMethod =
      env->GetMethodID(gObjCClassNameClass, "value", "()Ljava/lang/String;");
  gGetObjCProtocolNameMethod =
      env->GetMethodID(gObjCProtocolNameClass, "value", "()Ljava/lang/String;");
  gGetObjCCategoryClassMethod =
      env->GetMethodID(gObjCCategoryClass, "value", "()Ljava/lang/Class;");
  gObjCExceptionConstructorMethod = env->GetMethodID(
      gObjCExceptionClass, "<init>", "(Lorg/moe/natj/objc/ObjCObject;)V");
  gCleanupObjCProxyMethod = env->GetMethodID(
      gObjCRuntimeClass, "cleanupObjCProxy", "(Ljava/lang/Object;)V");
  gCleanupObjCBlockMethod =
      env->GetMethodID(gObjCRuntimeClass, "cleanupObjCBlock",
                       "(Ljava/lang/Object;Ljava/lang/reflect/Method;)V");
  gHandleFrameworkInitializerMethod =
      env->GetMethodID(gObjCRuntimeClass, "handleFrameworkInitializer",
                       "(Lorg/moe/natj/objc/IFrameworkInitializer;)V");
  gGetExceptionStacktraceStaticMethod =
      env->GetStaticMethodID(gObjCRuntimeClass, "getExceptionStacktrace",
                             "(Ljava/lang/Throwable;)Ljava/lang/String;");
  gGetProtocolClassMethodSelectorMethod =
      env->GetMethodID(gProtocolClassMethodClass, "value", "()Ljava/lang/String;");
  gSelectorFinderConstructorMethod =
      env->GetMethodID(gSelectorFinderClass, "<init>", "()V");
  gPrepareParentsSelectorsListMethod = env->GetMethodID(
      gSelectorFinderClass, "prepareParentsSelectorsList", "(Ljava/lang/Class;)V");
  gGetSelectorForMethodMethod = env->GetMethodID(gSelectorFinderClass, "getSelectorForMethod",
      "(Ljava/lang/reflect/Method;)Lorg/moe/natj/objc/ann/Selector;");

  gObjCAllocMap = [[NSMutableDictionary alloc] initWithCapacity:100];
  gObjCHybridMap = [[NSMutableDictionary alloc] initWithCapacity:100];
  gObjCTypeMap = [[NSMutableDictionary alloc] initWithCapacity:100];

  void* handle = dlopen(0, RTLD_LAZY);
  _objc_destroyWeak = (void (*)(id*))dlsym(handle, "objc_destroyWeak");
  _objc_loadWeakRetained = (id (*)(id*))dlsym(handle, "objc_loadWeakRetained");

  gDefaultUnboxPolicy =
      env->CallByteMethod(instance, gGetDefaultUnboxPolicyMethod);
  if (gDefaultUnboxPolicy == gUnboxVariadicPolicyValue) {
    gDefaultUnboxPolicy = kUnboxVariadic;
  } else if (gDefaultUnboxPolicy == gBoxVariadicPolicyValue) {
    gDefaultUnboxPolicy = kBoxVariadic;
  } else {
    assert(!"Invalid default unbox policy for the Objective-C runtime!");
  }

  gRuntime = env->NewGlobalRef(instance);
}

jlong Java_org_moe_natj_objc_ObjCRuntime_registerClass(JNIEnv* env,
                                                           jclass clazz,
                                                           jclass type) {
  return reinterpret_cast<jlong>(registerObjCClass(env, type, false, nullptr, nullptr));
}

void Java_org_moe_natj_objc_ObjCRuntime_retainObject(JNIEnv* env,
                                                         jclass clazz,
                                                         jlong object) {
  [reinterpret_cast<id>(object) retain];
}

void Java_org_moe_natj_objc_ObjCRuntime_releaseObject(JNIEnv* env,
                                                          jclass clazz,
                                                          jlong object) {
  [reinterpret_cast<id>(object) release];
}

void Java_org_moe_natj_objc_ObjCRuntime_autoreleaseObject(JNIEnv* env,
                                                              jclass clazz,
                                                              jlong object) {
  [reinterpret_cast<id>(object) autorelease];
}

jlong Java_org_moe_natj_objc_ObjCRuntime_createAutoreleasePool(JNIEnv* env,
                                                                     jclass clazz) {
  return reinterpret_cast<jlong>([[NSAutoreleasePool alloc] init]);
}

void Java_org_moe_natj_objc_ObjCRuntime_releaseAutoreleasePool(JNIEnv* env,
                                                                     jclass clazz,
                                                                     jlong peer) {
  [reinterpret_cast<NSAutoreleasePool*>(peer) release];
}

jstring Java_org_moe_natj_objc_ObjCRuntime_createJavaString(JNIEnv* env,
                                                                jclass clazz,
                                                                jlong address) {
  const char* cStr = [reinterpret_cast<NSString*>(address) UTF8String];
  return env->NewStringUTF(cStr);
}

@interface _NatJObjCCastProxy : NSObject
- (instancetype)initWithInstance:(id)object
                 withTargetClass:(Class)target
                 andTransparency:(BOOL)transparent;
@property (retain, readonly) id instance;
@property (readonly) Class target;
@property (readonly) BOOL transparent;
@end

@implementation _NatJObjCCastProxy
- (instancetype)initWithInstance:(id)object
                 withTargetClass:(Class)target
                 andTransparency:(BOOL)transparent {
  self = [super init];
  if (self) {
    _instance = [object retain];
    _target = target ? target : [_NatJObjCCastProxy class];
    _transparent = transparent;
  }
  return self;
}
- (void)dealloc {
  [_instance release];
  [super dealloc];
}
- (id)forwardingTargetForSelector:(SEL)aSelector {
  return _instance;
}
- (NSMethodSignature *)methodSignatureForSelector:(SEL)aSelector {
  return [_instance methodSignatureForSelector:aSelector];
}
- (void)forwardInvocation:(NSInvocation *)anInvocation {
  [anInvocation setTarget:_instance];
  [anInvocation invoke];
}
- (Class)class {
  return _target;
}
@end

jlong Java_org_moe_natj_objc_ObjCRuntime_createObjCCastProxy(JNIEnv* env,
                                                                jclass clazz,
                                                                jlong instance,
                                                                jlong target,
                                                                jboolean transparent) {
  id inst = reinterpret_cast<id>(instance);
  Class targ = reinterpret_cast<id>(target);
  id proxy = [[_NatJObjCCastProxy alloc] initWithInstance:inst
                                          withTargetClass:targ
                                          andTransparency:transparent];
  return reinterpret_cast<jlong>(proxy);
}

jlong Java_org_moe_natj_objc_ObjCRuntime_getObjCCastProxyPeer(JNIEnv* env,
                                                                jclass clazz,
                                                                jlong instance) {
  _NatJObjCCastProxy* i = reinterpret_cast<_NatJObjCCastProxy*>(instance);
  if ([object_getClass(i) isSubclassOfClass:[_NatJObjCCastProxy class]] && [i transparent]) {
    return reinterpret_cast<jlong>([i instance]);
  } else {
    return 0L;
  }
}

jlong Java_org_moe_natj_objc_ObjCRuntime_createNativeString(
    JNIEnv* env, jclass clazz, jstring string) {
  const char* cStr = env->GetStringUTFChars(string, NULL);
  NSString* str = [[NSString alloc] initWithUTF8String:cStr];
  env->ReleaseStringUTFChars(string, cStr);
  return reinterpret_cast<jlong>(str);
}

jlong Java_org_moe_natj_objc_ObjCRuntime_createProxyClass(JNIEnv* env,
                                                              jclass clazz,
                                                              jclass type) {
  return reinterpret_cast<jlong>(registerObjCClass(env, type, true, nullptr, nullptr));
}

jlong Java_org_moe_natj_objc_ObjCRuntime_createProxyClassWithExtension(JNIEnv* env,
                                                              jclass clazz,
                                                              jclass type,
                                                              jstring base,
                                                              jclass extension) {
  return reinterpret_cast<jlong>(registerObjCClass(env, type, true, base, extension));
}

jlong Java_org_moe_natj_objc_ObjCRuntime_createProxyInstance(
    JNIEnv* env, jclass clazz, jlong clazzObject, jobject instance) {
  Class objcClass = reinterpret_cast<Class>(clazzObject);
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-method-access"
  id obj = [[objcClass alloc] initWithEnv:env javaInstance:instance];
#pragma clang diagnostic pop
  return reinterpret_cast<jlong>(obj);
}

jlong Java_org_moe_natj_objc_ObjCRuntime_createDataForNativeBlock(
    JNIEnv* env, jclass clazz, jobject method) {
  ToNativeProxyInfo* info = new ToNativeProxyInfo;
  info->cached = false;
  info->method = env->NewGlobalRef(method);
  return reinterpret_cast<jlong>(info);
}

#define TYPED_BLOCK_CALL_FORWARDER(type, name)                                                  \
  type Java_org_moe_natj_objc_ObjCRuntime_forward##name##BlockCall(                       \
      JNIEnv* env, jclass clazz, jlong peer, jlong data, jobjectArray args) {                   \
    id object = reinterpret_cast<id>(peer);                                                     \
    void* preArgs[] = {object};                                                                 \
    void* prePtrs[] = {&preArgs[0]};                                                            \
    ffi_type* preTypes[] = {&ffi_type_pointer};                                                 \
    unsigned preNumber = 1;                                                                     \
    void* callback = (void*)getBlockCallback(object);                                           \
    type result;                                                                                \
    javaToNativeProxyHandler(env, data, args, &result, callback, preNumber, preTypes, prePtrs); \
    return result;                                                                              \
  }

TYPED_BLOCK_CALL_FORWARDER(jboolean, Boolean)
TYPED_BLOCK_CALL_FORWARDER(jbyte, Byte)
TYPED_BLOCK_CALL_FORWARDER(jchar, Char)
TYPED_BLOCK_CALL_FORWARDER(jshort, Short)
TYPED_BLOCK_CALL_FORWARDER(jint, Int)
TYPED_BLOCK_CALL_FORWARDER(jlong, Long)
TYPED_BLOCK_CALL_FORWARDER(jfloat, Float)
TYPED_BLOCK_CALL_FORWARDER(jdouble, Double)
TYPED_BLOCK_CALL_FORWARDER(jobject, Object)

#undef TYPED_BLOCK_CALL_FORWARDER

void Java_org_moe_natj_objc_ObjCRuntime_forwardVoidBlockCall(
    JNIEnv* env, jclass clazz, jlong peer, jlong data, jobjectArray args) {
  id object = reinterpret_cast<id>(peer);
  void* preArgs[] = {object};
  void* prePtrs[] = {&preArgs[0]};
  ffi_type* preTypes[] = {&ffi_type_pointer};
  unsigned preNumber = 1;
  void* callback = (void*)getBlockCallback(object);
  
  javaToNativeProxyHandler(env, data, args, NULL, callback, preNumber, preTypes, prePtrs);
}

jobjectArray Java_org_moe_natj_objc_ObjCRuntime_createDataForNativeProtocolProxy(
    JNIEnv* env, jclass clazz, jclass interface) {
  jobjectArray methods = (jobjectArray)env->CallObjectMethod(interface, gGetMethodsMethod);
  jsize methodCount = env->GetArrayLength(methods);
  
  jobject* protocolMethods = (jobject*)alloca(sizeof(void*) * methodCount);
  size_t protocolMethodCount = 0;
  
  // Collect protocol methods
  for (jsize i = 0; i < methodCount; i++) {
    jobject method = env->GetObjectArrayElement(methods, i);
    if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod, gProtocolClassMethodClass) ||
        env->CallBooleanMethod(method, gIsAnnotationPresentMethod, gSelectorClass)) {
      protocolMethods[protocolMethodCount++] = method;
    } else {
      env->DeleteLocalRef(method);
    }
  }
  env->DeleteLocalRef(methods);
  
  // Create return array
  // Objects at even indices are methods, others are the associated data.
  jobjectArray protocolData = env->NewObjectArray(protocolMethodCount * 2, gObjectClass, NULL);
  
  for (jsize i = 0; i < protocolMethodCount; i++) {
      jobject method = protocolMethods[i];
  
      bool isStatic;
  
      // Look for methods with selectors
      jstring selector;
      jobject ann =
        env->CallObjectMethod(method, gGetAnnotationMethod, gProtocolClassMethodClass);
      if (!env->IsSameObject(ann, NULL)) {
        selector = (jstring)env->CallObjectMethod(ann, gGetProtocolClassMethodSelectorMethod);
        env->DeleteLocalRef(ann);
        isStatic = true;
      } else {
        ann =
          env->CallObjectMethod(method, gGetAnnotationMethod, gSelectorClass);
        if (!env->IsSameObject(ann, NULL)) {
          selector = (jstring)env->CallObjectMethod(ann, gGetSelectorMethod);
          env->DeleteLocalRef(ann);
          isStatic = false;
        } else {
          env->DeleteLocalRef(method);
          continue;
        }
      }
    
      ToNativeProtocolProxyInfo* info = new ToNativeProtocolProxyInfo;
    
      // Is this static?
      info->isStatic = isStatic;
    
      // Store the selector and whether this is an initializer method
      const char* cSelector = env->GetStringUTFChars(selector, NULL);
      info->sel = sel_registerName(cSelector);
      info->isInit = isSelectorOfInitMethod(cSelector);
      env->ReleaseStringUTFChars(selector, cSelector);
  
      // We will cache later
      info->cached = false;
    
      // We will generate cache from this
      info->method = env->NewGlobalRef(method);
    
      // Select the appropriate message handlers
      jclass returnType =
          (jclass)env->CallObjectMethod(method, gGetReturnTypeMethod);
      jboolean byValue = env->CallBooleanMethod(
          method, gIsAnnotationPresentMethod, gByValueClass);
      ffi_type* rtype = getFFIType(env, returnType, byValue);
      env->DeleteLocalRef(returnType);
      info->callback = std::get<0>(getSelectorCallback(rtype));
    
      // Save the method with its data
      env->SetObjectArrayElement(protocolData, i * 2, method);
      jobject boxedData = env->NewObject(gBoxedLongClass,
          gBoxedLongConstructorMethod, reinterpret_cast<jlong>(info));
      env->SetObjectArrayElement(protocolData, i * 2 + 1, boxedData);
      env->DeleteLocalRef(boxedData);
    
      env->DeleteLocalRef(method);
  }
  
  return protocolData;
}

#define TYPED_PROTOCOL_CALL_FORWARDER(type, name)                                               \
  type Java_org_moe_natj_objc_ObjCRuntime_forward##name##ProtocolCall(                    \
      JNIEnv* env, jclass clazz, jlong peer, jlong data, jobjectArray args) {                   \
    ToNativeProtocolProxyInfo* info = reinterpret_cast<ToNativeProtocolProxyInfo*>(data);       \
                                                                                                \
    id object = reinterpret_cast<id>(peer);                                                     \
    void* preArgs[] = {info->isStatic ? object_getClass(object) : object, info->sel};           \
    void* prePtrs[] = {&preArgs[0], &preArgs[1]};                                               \
    ffi_type* preTypes[] = {&ffi_type_pointer, &ffi_type_pointer};                              \
    unsigned preNumber = 2;                                                                     \
                                                                                                \
    type result;                                                                                \
    javaToNativeProxyHandler(env, data, args, &result, info->callback,                          \
                             preNumber, preTypes, prePtrs);                                     \
    return result;                                                                              \
  }

TYPED_PROTOCOL_CALL_FORWARDER(jboolean, Boolean)
TYPED_PROTOCOL_CALL_FORWARDER(jbyte, Byte)
TYPED_PROTOCOL_CALL_FORWARDER(jchar, Char)
TYPED_PROTOCOL_CALL_FORWARDER(jshort, Short)
TYPED_PROTOCOL_CALL_FORWARDER(jint, Int)
TYPED_PROTOCOL_CALL_FORWARDER(jlong, Long)
TYPED_PROTOCOL_CALL_FORWARDER(jfloat, Float)
TYPED_PROTOCOL_CALL_FORWARDER(jdouble, Double)
TYPED_PROTOCOL_CALL_FORWARDER(jobject, Object)

#undef TYPED_BLOCK_CALL_FORWARDER

void Java_org_moe_natj_objc_ObjCRuntime_forwardVoidProtocolCall(
    JNIEnv* env, jclass clazz, jlong peer, jlong data, jobjectArray args) {
  ToNativeProtocolProxyInfo* info = reinterpret_cast<ToNativeProtocolProxyInfo*>(data);
  
  id object = reinterpret_cast<id>(peer);
  void* preArgs[] = {info->isStatic ? object_getClass(object) : object, info->sel};
  void* prePtrs[] = {&preArgs[0], &preArgs[1]};
  ffi_type* preTypes[] = {&ffi_type_pointer, &ffi_type_pointer};
  unsigned preNumber = 2;
  
  javaToNativeProxyHandler(env, data, args, NULL, info->callback, preNumber, preTypes, prePtrs);
}

jlong Java_org_moe_natj_objc_ObjCRuntime_createDataForJavaBlock(
    JNIEnv* env, jclass clazz, jobject method) {
  // Create the closure
  ToJavaBlockInfo* info = new ToJavaBlockInfo;

  // Is this static?
  jint modifiers = env->CallIntMethod(method, gGetModifiersMethod);
  bool isStatic = modifiers & ACC_STATIC;
  info->isStatic = isStatic;

  // We will cache later
  info->cached = false;

  // We will generate cache from this
  info->method = env->NewGlobalRef(method);

  // In case of static methods we will use this object
  jclass objectClass =
      (jclass)env->CallObjectMethod(method, gGetDeclaringClassMethod);
  info->clazz = (jclass)env->NewGlobalRef(objectClass);
  env->DeleteLocalRef(objectClass);

  // Generate ffi type for the method
  jboolean byValue =
      env->CallBooleanMethod(method, gIsAnnotationPresentMethod, gByValueClass);
  info->byValue = byValue;
  jclass returnType =
      (jclass)env->CallObjectMethod(method, gGetReturnTypeMethod);
  ffi_type* returnCType = getFFIType(env, returnType, false);
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
  ffi_type* nativeReturnCType = getFFIType(env, returnType, byValue);
#else
  NativeSizedType nativeSized = kNo;
  if (!byValue) {
    if (false) {}
#if !__NATJ_IS_64BIT__
    else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                    gNFloatClass)) {
      nativeSized = kNFloat;
    } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                      gNUIntClass)) {
      nativeSized = kNUInt;
    } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                      gNIntClass)) {
      nativeSized = kNInt;
    }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
      else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                      gNLongClass)) {
          nativeSized = kNLong;
      } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                        gNULongClass)) {
          nativeSized = kNULong;
      }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
      else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                      gWCharTClass)) {
          nativeSized = kWCharT;
      }
#endif
  }
  ffi_type* nativeReturnCType =
      getFFIType(env, returnType, byValue, false, nativeSized);
#endif
  env->DeleteLocalRef(returnType);

  // Select the appropriate jni method
  info->callback = getJNICallFunction(env, returnCType, isStatic);

  // Generate ffi types for the parameters
  jobjectArray parameterAnns = (jobjectArray)env->CallObjectMethod(
      method, gGetParameterAnnotationsMethod);
  jobjectArray parameterTypes =
      (jobjectArray)env->CallObjectMethod(method, gGetParameterTypesMethod);
  jsize nativeParameterCount = env->GetArrayLength(parameterTypes) + 1;
  jsize parameterCount = nativeParameterCount + 2;
  ffi_type** parameterCTypes = new ffi_type* [parameterCount];
  ffi_type** nativeParameterCTypes = new ffi_type* [nativeParameterCount];
  nativeParameterCTypes[0] = &ffi_type_pointer;  // id
  parameterCTypes[0] = &ffi_type_pointer;        // JNIEnv*
  parameterCTypes[1] = &ffi_type_pointer;        // jclass/jobject
  parameterCTypes[2] = &ffi_type_pointer;        // jmethodID
  for (jsize j = 3; j < parameterCount; j++) {
    jclass parameterType =
        (jclass)env->GetObjectArrayElement(parameterTypes, j - 3);
    jobjectArray paramAnns =
        (jobjectArray)env->GetObjectArrayElement(parameterAnns, j - 3);
    jsize annCount = env->GetArrayLength(paramAnns);
    jboolean byValue = false;
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
    for (jsize k = 0; k < annCount && !byValue; k++) {
#else
    NativeSizedType nativeSized = kNo;
    for (jsize k = 0; k < annCount && !byValue && nativeSized == kNo; k++) {
#endif
      jobject paramAnn = env->GetObjectArrayElement(paramAnns, k);
      if (env->IsInstanceOf(paramAnn, gByValueClass)) {
        byValue = true;
#if !__NATJ_IS_64BIT__
      } else if (env->IsInstanceOf(paramAnn, gNFloatClass)) {
        nativeSized = kNFloat;
      } else if (env->IsInstanceOf(paramAnn, gNUIntClass)) {
        nativeSized = kNUInt;
      } else if (env->IsInstanceOf(paramAnn, gNIntClass)) {
        nativeSized = kNInt;
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
      } else if (env->IsInstanceOf(paramAnn, gNLongClass)) {
        nativeSized = kNLong;
      } else if (env->IsInstanceOf(paramAnn, gNULongClass)) {
        nativeSized = kNULong;
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
      } else if (env->IsInstanceOf(paramAnn, gWCharTClass)) {
        nativeSized = kWCharT;
#endif
      }
      env->DeleteLocalRef(paramAnn);
    }
    parameterCTypes[j] = getFFIType(env, parameterType, false, true);
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
    nativeParameterCTypes[j - 2] = getFFIType(env, parameterType, byValue);
#else
    nativeParameterCTypes[j - 2] =
        getFFIType(env, parameterType, byValue, false, nativeSized);
#endif
    env->DeleteLocalRef(parameterType);
    env->DeleteLocalRef(paramAnns);
  }
  env->DeleteLocalRef(parameterAnns);
  env->DeleteLocalRef(parameterTypes);

  // Prepare ffi_cif for the Java method call
  ffi_prep_cif_var(&info->cif, FFI_DEFAULT_ABI, 3, parameterCount, returnCType,
                   parameterCTypes);

  // Create the Java block data
  JavaBlockData* data = new JavaBlockData;
  ffi_cif* cif = new ffi_cif;
  data->closure =
      (ffi_closure*)ffi_closure_alloc(sizeof(ffi_closure), &data->code);
  ffi_prep_cif(cif, FFI_DEFAULT_ABI, nativeParameterCount, nativeReturnCType,
               nativeParameterCTypes);
  ffi_prep_closure_loc(data->closure, cif, nativeToJavaBlockHandler, info,
                       data->code);

  return reinterpret_cast<jlong>(data);
}

jlong
Java_org_moe_natj_objc_ObjCRuntime_createNativeCallbackFromJavaInstance(
    JNIEnv* env, jclass clazz, jobject instance, jlong data) {
  JavaBlockData* javaBlockData = reinterpret_cast<JavaBlockData*>(data);

  id block;
  @autoreleasepool {
    // Assign an instance container to the block with this trick
    ObjCInstanceContainer* container =
        [ObjCInstanceContainer blockContainerWithEnv:env
                                       javaReference:instance
                                             closure:javaBlockData->closure];
    void (^dummy)() = ^void() {
        NSLog(
            @"%@",
            container);  // A reference to a variable will import that variable
    };

    // Create a malloc block with reference counting
    block = [dummy copy];

    // Associate the block releaser to the malloc block
    objc_setAssociatedObject(block, &gInstanceContainerKey, container,
                             OBJC_ASSOCIATION_RETAIN_NONATOMIC);
  }

  DummyJavaBlockLayout* ptr = (DummyJavaBlockLayout*)block;

  ptr->flags &= ~(1 << 30);  // Unset BLOCK_HAS_SIGNATURE flag
  ptr->flags |= ((ToJavaBlockInfo*)javaBlockData->closure->user_data)->byValue
                << 29;    // Set stret flag
  ptr->flags |= 1 << 16;  // This bit is used for recognizing block that we made

  ptr->callback = (IMP)javaBlockData->code;

  return reinterpret_cast<jlong>(block);
}

jobject Java_org_moe_natj_objc_ObjCRuntime_getInstanceForJavaBlock(
    JNIEnv* env, jclass clazz, jlong callback) {
  BlockLayout* ptr = reinterpret_cast<BlockLayout*>(callback);
  if (ptr->flags & (1 << 16)) {
    return [getJavaBlockInstanceContainer(reinterpret_cast<id>(callback))
        javaReferenceWithEnv:env];
  }
  return NULL;
}

jobject Java_org_moe_natj_objc_ObjCRuntime_getJavaReferenceOfBindingObject(
    JNIEnv* env, jclass clazz, jlong object) {
  return [getBindingInstanceContainer(reinterpret_cast<id>(object))
      javaReferenceWithEnv:env];
}

void Java_org_moe_natj_objc_ObjCRuntime_setJavaReferenceOfBindingObject(
    JNIEnv* env, jclass clazz, jlong object, jobject newRef) {
  id obj = reinterpret_cast<id>(object);
  if (env->IsSameObject(newRef, NULL)) {
    setBindingInstanceContainer(obj, nil);
    return;
  }
  ObjCInstanceContainer* container = getBindingInstanceContainer(obj);
  if (container) {
    [container setJavaReference:newRef withEnv:env];
  } else {
    @autoreleasepool {
      container = [ObjCInstanceContainer bindingContainerWithEnv:env
                                                   javaReference:newRef];
      setBindingInstanceContainer(obj, container);
    }
  }
}

jobject Java_org_moe_natj_objc_ObjCRuntime_getJavaReferenceOfCustomObject(
    JNIEnv* env, jclass clazz, jlong object) {
  return [getCustomInstanceContainer(reinterpret_cast<id>(object))
      javaReferenceWithEnv:env];
}

void Java_org_moe_natj_objc_ObjCRuntime_setJavaReferenceOfCustomObject(
    JNIEnv* env, jclass clazz, jlong object, jobject newRef) {
  id obj = reinterpret_cast<id>(object);
  ObjCInstanceContainer* container = getCustomInstanceContainer(obj);
  if (container) {
    [container setJavaReference:newRef withEnv:env];
  }
}

jboolean Java_org_moe_natj_objc_ObjCRuntime_isKindOfInheritedClass(
    JNIEnv* env, jclass clazz, jlong ptr) {
  return isInheritedClass([reinterpret_cast<id>(ptr) class]);
}

jboolean Java_org_moe_natj_objc_ObjCRuntime_isKindOfProxyClass(JNIEnv* env,
                                                                   jclass clazz,
                                                                   jlong ptr) {
  return isProxyClass([reinterpret_cast<id>(ptr) class]);
}

jboolean Java_org_moe_natj_objc_ObjCRuntime_isKindOfHybridClass(
    JNIEnv* env, jclass clazz, jlong ptr) {
  return isHybridClass([reinterpret_cast<id>(ptr) class]);
}

jstring Java_org_moe_natj_objc_ObjCRuntime_getObjectDescription(
    JNIEnv* env, jclass clazz, jlong ptr) {
  id object = reinterpret_cast<id>(ptr);
  @autoreleasepool {
    return env->NewStringUTF([[object description] UTF8String]);
  }
}

jlong Java_org_moe_natj_objc_ObjCRuntime_getObjectClass(JNIEnv* env,
                                                            jclass clazz,
                                                            jlong object) {
  return reinterpret_cast<jlong>([reinterpret_cast<id>(object) class]);
}

jlong Java_org_moe_natj_objc_ObjCRuntime_getClassParent(JNIEnv* env,
                                                            jclass clazz,
                                                            jlong object) {
  return reinterpret_cast<jlong>(
      class_getSuperclass(reinterpret_cast<id>(object)));
}

jlong Java_org_moe_natj_objc_ObjCRuntime_getClassByName(JNIEnv* env,
                                                            jclass clazz,
                                                            jstring name) {
  const char* cName = env->GetStringUTFChars(name, NULL);
  Class cls = objc_getClass(cName);
  env->ReleaseStringUTFChars(name, cName);
  return reinterpret_cast<jlong>(cls);
}

jboolean Java_org_moe_natj_objc_ObjCRuntime_isObjectString(JNIEnv* env,
                                                               jclass clazz,
                                                               jlong object) {
  return [reinterpret_cast<id>(object) isKindOfClass:[NSString class]];
}

jboolean Java_org_moe_natj_objc_ObjCRuntime_isObjectBlock(JNIEnv* env,
                                                              jclass clazz,
                                                              jlong object) {
  return [reinterpret_cast<id>(object) isKindOfClass:gBlockClass];
}

jboolean Java_org_moe_natj_objc_ObjCRuntime_isStackBlock(JNIEnv* env,
                                                             jclass clazz,
                                                             jlong object) {
  return [reinterpret_cast<id>(object) isKindOfClass:gStackBlockClass];
}

jlong Java_org_moe_natj_objc_ObjCRuntime_copyBlock(JNIEnv* env,
                                                       jclass clazz,
                                                       jlong object) {
  return reinterpret_cast<jlong>(Block_copy(reinterpret_cast<id>(object)));
}

jstring Java_org_moe_natj_objc_ObjCRuntime_getClassName(JNIEnv* env,
                                                            jclass clazz,
                                                            jlong cls) {
  return env->NewStringUTF(class_getName(reinterpret_cast<Class>(cls)));
}

jobject Java_org_moe_natj_objc_ObjCRuntime_getInitTargetOnCurrentThread(
    JNIEnv* env, jclass clazz) {
  @autoreleasepool {
    NSValue* value = [[[NSThread currentThread] threadDictionary]
        objectForKey:gInitTargetKey];
    if (value) {
      jobject target;
      [value getValue:&target];
      return target;
    }
    return NULL;
  }
}

jlong Java_org_moe_natj_objc_ObjCRuntime_registerSelector(JNIEnv* env,
                                                              jclass clazz,
                                                              jstring string) {
  const char* cStr = env->GetStringUTFChars(string, NULL);
  SEL sel = sel_registerName(cStr);
  env->ReleaseStringUTFChars(string, cStr);
  return reinterpret_cast<jlong>(sel);
}

void Java_org_moe_natj_objc_ObjCRuntime_lockObject(JNIEnv* env,
                                                       jclass clazz,
                                                       jlong object) {
  objc_sync_enter(reinterpret_cast<id>(object));
}

void Java_org_moe_natj_objc_ObjCRuntime_unlockObject(JNIEnv* env,
                                                         jclass clazz,
                                                         jlong object) {
  objc_sync_exit(reinterpret_cast<id>(object));
}

jclass Java_org_moe_natj_objc_ObjCRuntime_getJavaTypeForHybridClass(
    JNIEnv* env, jclass clazz, jlong object) {
  @autoreleasepool {
    NSValue* value = [gObjCTypeMap objectForKey:reinterpret_cast<id>(object)];
    return (jclass)[value pointerValue];
  }
}

void Java_org_moe_natj_objc_ObjCRuntime_storeWeak(JNIEnv* env, jclass clazz,
                                                      jlong object,
                                                      jlong location) {
  objc_storeWeak(reinterpret_cast<id*>(location), reinterpret_cast<id>(object));
}

jlong Java_org_moe_natj_objc_ObjCRuntime_loadWeak(JNIEnv* env, jclass clazz,
                                                      jlong location) {
  return reinterpret_cast<jlong>(
      _objc_loadWeakRetained(reinterpret_cast<id*>(location)));
}

void Java_org_moe_natj_objc_ObjCRuntime_destroyWeak(JNIEnv* env,
                                                        jclass clazz,
                                                        jlong location) {
  _objc_destroyWeak(reinterpret_cast<id*>(location));
}

void Java_org_moe_natj_objc_ObjCRuntime_associateObjCObject(
    JNIEnv* env, jclass clazz, jlong object, jlong instance) {
  if (object == instance)
    return;
  id obj = reinterpret_cast<id>(object);
  @synchronized(obj) {
    CountedAssociationHolder* associationHolder =
        objc_getAssociatedObject(obj, &gAssociationKey);
    if (!associationHolder) {
      associationHolder = [[CountedAssociationHolder alloc] init];
      objc_setAssociatedObject(obj, &gAssociationKey, associationHolder,
                               OBJC_ASSOCIATION_RETAIN_NONATOMIC);
      [associationHolder release];
    }
    [associationHolder addObject:reinterpret_cast<id>(instance)];
  }
}

void Java_org_moe_natj_objc_ObjCRuntime_dissociateObjCObject(
    JNIEnv* env, jclass clazz, jlong object, jlong instance) {
  if (object == instance)
    return;
  id obj = reinterpret_cast<id>(object);
  @synchronized(obj) {
    CountedAssociationHolder* associationHolder =
        objc_getAssociatedObject(obj, &gAssociationKey);
    if (associationHolder) {
      [associationHolder removeObject:reinterpret_cast<id>(instance)];
    }
  }
}

jlong Java_org_moe_natj_objc_ObjCRuntime_createAutoReleasePool(
    JNIEnv* env, jclass clazz, jlong location) {
  return reinterpret_cast<jlong>([[NSAutoreleasePool alloc] init]);
}

void Java_org_moe_natj_objc_ObjCRuntime_releaseAutoReleasePool(JNIEnv* env,
                                                                   jclass clazz,
                                                                   jlong pool) {
  [reinterpret_cast<NSAutoreleasePool*>(pool) release];
}

void setCurrentInitTargetOnCurrentThread(jobject target) {
  @autoreleasepool {
    [[[NSThread currentThread] threadDictionary]
        setObject:[NSValue value:&target withObjCType:@encode(jobject)]
           forKey:gInitTargetKey];
  }
}

void unsetCurrentInitTargetOnCurrentThread() {
  @autoreleasepool {
    [[[NSThread currentThread] threadDictionary]
        removeObjectForKey:gInitTargetKey];
  }
}

ObjCInstanceContainer* getBindingInstanceContainer(id obj) {
  return objc_getAssociatedObject(obj, &gInstanceContainerKey);
}

void setBindingInstanceContainer(id obj, ObjCInstanceContainer* container) {
  objc_setAssociatedObject(obj, &gInstanceContainerKey, container,
                           OBJC_ASSOCIATION_RETAIN_NONATOMIC);
}

ObjCInstanceContainer* getCustomInstanceContainer(id obj) {
  return *(ObjCInstanceContainer**)object_getIndexedIvars(obj);
}

ObjCInstanceContainer* getJavaBlockInstanceContainer(id obj) {
  DummyJavaBlockLayout* dummy = reinterpret_cast<DummyJavaBlockLayout*>(obj);
  return dummy->container;
}

void setCustomInstanceContainer(id obj, ObjCInstanceContainer* container) {
  *(ObjCInstanceContainer**)object_getIndexedIvars(obj) = container;
  objc_setAssociatedObject(obj, &gInstanceContainerKey, container,
                           OBJC_ASSOCIATION_RETAIN_NONATOMIC);
}

static char NatJClassTypeKey;
static int NatJClassTypeLock = 0;

#define SPIN_LOCK_LOCK(x) while (OSAtomicCompareAndSwapInt(0, 1, x) == false)

#define SPIN_LOCK_UNLOCK(x) *x = 0

NatJClassType getNatJClassType(Class cls) {
  SPIN_LOCK_LOCK(&NatJClassTypeLock);
  NSNumber* objval = objc_getAssociatedObject(cls, &NatJClassTypeKey);
  SPIN_LOCK_UNLOCK(&NatJClassTypeLock);

  return objval.integerValue;
}

inline void addNatJClassType(Class cls, NatJClassType value) {
  SPIN_LOCK_LOCK(&NatJClassTypeLock);
  NSNumber* origval = objc_getAssociatedObject(cls, &NatJClassTypeKey);
  NSNumber* objval =
      [[NSNumber alloc] initWithInteger:value | origval.integerValue];
  objc_setAssociatedObject(cls, &NatJClassTypeKey, objval,
                           OBJC_ASSOCIATION_ASSIGN);
  if (origval) {
    [origval release];
  }
  SPIN_LOCK_UNLOCK(&NatJClassTypeLock);
}

inline BOOL checkNatJClassType(Class cls, NatJClassType mask,
                               NatJClassType expected) {
  SPIN_LOCK_LOCK(&NatJClassTypeLock);
  NSNumber* objval = objc_getAssociatedObject(cls, &NatJClassTypeKey);
  SPIN_LOCK_UNLOCK(&NatJClassTypeLock);

  return (objval.integerValue & mask) == expected;
}

#undef SPIN_LOCK_LOCK
#undef SPIN_LOCK_UNLOCK

BOOL isInheritedClass(Class cls) {
  return isInheritedNatJClass(getNatJClassType(cls));
}

BOOL isProxyClass(Class cls) { return isProxyNatJClass(getNatJClassType(cls)); }

BOOL isHybridClass(Class cls) {
  return isHybridNatJClass(getNatJClassType(cls));
}

BOOL isBindingClass(Class cls) {
  return isBindingNatJClass(getNatJClassType(cls));
}

void cleanupObjCProxy(JNIEnv* env, jobject peer) {
  env->CallVoidMethod(gRuntime, gCleanupObjCProxyMethod, peer);
}

void cleanupObjCBlock(JNIEnv* env, jobject peer, jobject method) {
  env->CallVoidMethod(gRuntime, gCleanupObjCBlockMethod, peer, method);
}

IMP getBlockCallback(id block) {
  return reinterpret_cast<BlockLayout*>(block)->callback;
}

std::tuple<void*, void*> getSelectorCallback(ffi_type* type) {
#ifdef __arm__
  if (type->type == FFI_TYPE_STRUCT &&
      type->size > MAX_STRUCT_REG_SIZE) {
    return std::make_tuple((void*)objc_msgSend_stret, (void*)objc_msgSendSuper_stret);
  } else {
    return std::make_tuple((void*)objc_msgSend, (void*)objc_msgSendSuper);
  }
#elif defined(__arm64__)
  return std::make_tuple((void*)objc_msgSend, (void*)objc_msgSendSuper);
#else
  if (type->type == FFI_TYPE_FLOAT ||
      type->type == FFI_TYPE_DOUBLE) {
    return std::make_tuple((void*)objc_msgSend_fpret, (void*)objc_msgSendSuper);
  } else if (type->type == FFI_TYPE_STRUCT &&
             type->size > MAX_STRUCT_REG_SIZE) {
    return std::make_tuple((void*)objc_msgSend_stret, (void*)objc_msgSendSuper_stret);
  } else {
    return std::make_tuple((void*)objc_msgSend, (void*)objc_msgSendSuper);
  }
#endif
}

jobject getObjCRuntime() {
  return gRuntime;
}

ObjCAllocInfo* getAllocInfoForClass(Class cls) {
  return (ObjCAllocInfo*)object_getIndexedIvars(cls);
}

ProxyExtensionInfo* getExtensionInfoForProxyClass(Class cls) {
  return (ProxyExtensionInfo*)object_getIndexedIvars(cls);
}

int8_t getDefaultVariadicUnboxPolicy() { return gDefaultUnboxPolicy; }

NSString* getExceptionStacktrace(JNIEnv* env, jthrowable thr) {
  jstring jReason = (jstring)env->CallStaticObjectMethod(gObjCRuntimeClass, gGetExceptionStacktraceStaticMethod, thr);
  NSString* reason = nil;

  if (!env->IsSameObject(jReason, NULL)) {
    const char* cReason = env->GetStringUTFChars(jReason, NULL);
    reason = [[NSString alloc] initWithUTF8String:cReason];

    env->ReleaseStringUTFChars(jReason, cReason);
    env->DeleteLocalRef(jReason);
  }

  return reason;
}

jthrowable handleObjCException(JNIEnv* env, void* exception) {
  id obj = (id)exception;
  Class ncls = [obj class];

  // Handle wrapped Java exceptions specially
  if (ncls == [ObjCException class]) {
    return (jthrowable)env->NewLocalRef([obj javaException]);
  }

  // Get NativeObject construction info
  ObjCAllocInfo info;
  @autoreleasepool {
    NSValue* value = [gObjCAllocMap objectForKey:ncls];
    if (value == nil) {
      // Handle NSString exceptions specially
      NSString* clsName;
      if ([ncls isSubclassOfClass:[NSString class]]) {
        clsName = @"NSString";
      } else {
        clsName = NSStringFromClass(ncls);
      }
      NSString* javaName =
          [gFoundationJavaPath stringByAppendingString:clsName];
      jclass cls = env->FindClass([javaName UTF8String]);

      // Build and store the construction info
      jobject buildInfo = env->CallStaticObjectMethod(
          gNatJClass, gBuildJavaObjectInfoStaticMethod, gRuntime, cls,
          gObjCObjectMapperClass, NULL, NULL, false, false, false);
      info.constructionInfo = env->NewGlobalRef(buildInfo);
      env->DeleteLocalRef(buildInfo);
      [gObjCAllocMap
          setObject:[NSValue value:&info withObjCType:@encode(ObjCAllocInfo)]
             forKey:ncls];

      // Release local ref
      env->DeleteLocalRef(cls);
    } else {
      [value getValue:&info];
    }
  }

  // Create NativeObject
  jobject nobj = env->CallStaticObjectMethod(gNatJClass, gToJavaStaticMethod,
                                             reinterpret_cast<jlong>(exception),
                                             info.constructionInfo);

  // Wrap it into an ObjCException instance
  jthrowable exc = (jthrowable)env->NewObject(
      gObjCExceptionClass, gObjCExceptionConstructorMethod, nobj);

  // Release local ref
  env->DeleteLocalRef(nobj);

  return exc;
}

void* createObjCException(JNIEnv* env, jthrowable exc) {
  return
      [[[ObjCException alloc] initWithEnv:env javaException:exc] autorelease];
}

void throwObjCException(void* exception) { @throw(id) exception; }

extern bool hasObjCRuntimeBeenInitialized() { return gRuntime; }

NSString* createObjCTypeEncoding(ffi_type* type) {
  switch (type->type) {
    case FFI_TYPE_VOID:
      return [NSString stringWithUTF8String:@encode(void)];
    case FFI_TYPE_INT:
      return [NSString stringWithUTF8String:@encode(int)];
    case FFI_TYPE_FLOAT:
      return [NSString stringWithUTF8String:@encode(float)];
    case FFI_TYPE_DOUBLE:
      return [NSString stringWithUTF8String:@encode(double)];
    case FFI_TYPE_UINT8:
      return [NSString stringWithUTF8String:@encode(uint8_t)];
    case FFI_TYPE_SINT8:
      return [NSString stringWithUTF8String:@encode(int8_t)];
    case FFI_TYPE_UINT16:
      return [NSString stringWithUTF8String:@encode(uint16_t)];
    case FFI_TYPE_SINT16:
      return [NSString stringWithUTF8String:@encode(int16_t)];
    case FFI_TYPE_SINT32:
      return [NSString stringWithUTF8String:@encode(uint32_t)];
    case FFI_TYPE_UINT32:
      return [NSString stringWithUTF8String:@encode(int32_t)];
    case FFI_TYPE_UINT64:
      return [NSString stringWithUTF8String:@encode(uint64_t)];
    case FFI_TYPE_SINT64:
      return [NSString stringWithUTF8String:@encode(int64_t)];
    case FFI_TYPE_POINTER:
      return [NSString stringWithUTF8String:@encode(id)];
    case FFI_TYPE_STRUCT: {
      unsigned count;
      for (count = 0; type->elements[count]; count++)
        ;
      NSMutableArray* array =
          [[NSMutableArray alloc] initWithCapacity:count + 2];
      [array addObject:@"{"];
      for (unsigned i = 0; i < count; i++) {
        [array addObject:createObjCTypeEncoding(type->elements[i])];
      }
      [array addObject:@"}"];
      NSString* string = [array componentsJoinedByString:@""];
      [array release];
      return string;
    }
    default:
      return NULL;
  }
}

NSString* createObjCMethodDescriptor(ffi_type* rtype, unsigned nargs,
                                     ffi_type** atypes) {
  unsigned count = nargs + 1;
  NSMutableArray* array = [[NSMutableArray alloc] initWithCapacity:count];
  @autoreleasepool {
    [array addObject:createObjCTypeEncoding(rtype)];
    [array addObject:@"@"];
    [array addObject:@":"];
    for (unsigned i = 2; i < nargs; i++) {
      [array addObject:createObjCTypeEncoding(atypes[i])];
    }
  }
  NSString* string = [array componentsJoinedByString:@""];
  [array release];
  return string;
}

bool isSelectorOfInitMethod(const char* selector) {
  const char* i = selector;
  return *(i++) == 'i' && *(i++) == 'n' && *(i++) == 'i' && *(i++) == 't' &&
         (*i < 'a' || *i > 'z');
}

Class registerObjCClass(JNIEnv* env, jclass type, bool isProxy, jstring baseClass,
                        jclass extension) {
  // Is it a category?
  bool isCategory = false;
  jclass categClass = NULL;
  if (!isProxy) {
    jobject categAnn =
        env->CallObjectMethod(type, gGetAnnotationMethod, gObjCCategoryClass);
    if (!env->IsSameObject(categAnn, NULL)) {
      categClass =
          (jclass)env->CallObjectMethod(categAnn, gGetObjCCategoryClassMethod);
      env->DeleteLocalRef(categAnn);
      if (!env->IsAssignableFrom(categClass, gNSObjectClass)) {
        jstring categClassName =
            (jstring)env->CallObjectMethod(categClass, gGetClassNameMethod);
        const char* categClassCName =
            env->GetStringUTFChars(categClassName, NULL);
        LOGF << "Extending class " << categClassCName << " by a category is not"
             << " acceptable, because it is not an NSObject descendant.";
      }
      forceInitClass(env, categClass);
      isCategory = true;
    }
  }

  // Is it a binding or a category to a binding?
  bool isOriginalBinding = env->CallBooleanMethod(
      isCategory ? categClass : type, gIsAnnotationPresentMethod,
      gObjCClassBindingClass);

  // Will be used for Objective-C runtime registrations
  Class objcClass = nil;
  Class objcMetaClass = nil;

  // Determine class name
  const char* classCName;
  jstring classJName;
  {
    if (isProxy) {
      classJName = (jstring)env->CallObjectMethod(type, gGetClassNameMethod);
    } else {
      jclass originalClass = isCategory ? categClass : type;
      jobject classAnn = env->CallObjectMethod(
          originalClass, gGetAnnotationMethod, gObjCClassNameClass);
      if (!env->IsSameObject(classAnn, NULL)) {
        classJName =
            (jstring)env->CallObjectMethod(classAnn, gGetObjCClassNameMethod);
        env->DeleteLocalRef(classAnn);
      } else {
        if (isOriginalBinding) {
          classJName = (jstring)env->CallObjectMethod(
              originalClass, gGetClassSimpleNameMethod);
        } else {
          classJName = (jstring)env->CallObjectMethod(originalClass,
                                                      gGetClassNameMethod);
        }
      }
    }
    classCName = env->GetStringUTFChars(classJName, NULL);
  }

  // Check wheter the Objective-C class is already present
  if (!isProxy) {
    objcClass = objc_getClass(classCName);
  }

  // A category must refer to an existing class.
  // We don't need to give a proper log in case of a failure,
  // because this can not be caused by invalid use of NatJ.
  assert(!(isCategory && !objcClass));

  // A binding must refer to an existing class.
  if (!isCategory && isOriginalBinding && !objcClass) {
    LOGF << "Binding class refers to class " << classCName
         << ", but it can not be found.";
  }

  id superClass;
  if (isCategory) {
    // For categories we don't need this information
    superClass = nil;
  } else if (objcClass) {
    superClass = class_getSuperclass(objcClass);
  } else {
    // Determine who should be the parent
    superClass = NULL;
    if (baseClass) {
      const char* cBaseClass = env->GetStringUTFChars(baseClass, NULL);
      superClass = objc_lookUpClass(cBaseClass);
      env->ReleaseStringUTFChars(baseClass, cBaseClass);
    } else if (!isProxy) {
      jclass superJClass = env->GetSuperclass(type);
      jobject ann = env->CallObjectMethod(superJClass, gGetAnnotationMethod,
                                          gObjCClassNameClass);
      if (!env->IsSameObject(ann, NULL)) {
        jstring superName =
            (jstring)env->CallObjectMethod(ann, gGetObjCClassNameMethod);
        const char* superCName = env->GetStringUTFChars(superName, NULL);
        superClass = objc_lookUpClass(superCName);
        env->ReleaseStringUTFChars(superName, superCName);
        env->DeleteLocalRef(superName);
        env->DeleteLocalRef(ann);
      } else if (env->IsAssignableFrom(superJClass, gNSObjectClass)) {
        jstring superName;
        if (env->CallBooleanMethod(superJClass, gIsAnnotationPresentMethod,
                                   gObjCClassBindingClass)) {
          superName = (jstring)env->CallObjectMethod(superJClass,
                                                     gGetClassSimpleNameMethod);
        } else {
          superName =
              (jstring)env->CallObjectMethod(superJClass, gGetClassNameMethod);
        }
        const char* superCName = env->GetStringUTFChars(superName, NULL);
        superClass = objc_lookUpClass(superCName);
        env->ReleaseStringUTFChars(superName, superCName);
        env->DeleteLocalRef(superName);
      }
    }
    if (!superClass) {
      superClass = [NSObject class];
    }
  }

  // Is it a new class?
  jboolean isNewClass = !isCategory && (isProxy || !isOriginalBinding ||
                                        isHybridClass(superClass));

  // If we are about to create a new class and this query
  // results in a non-nil value, then we switch to hybrid mode.
  bool isHybrid = !isProxy && isNewClass && objcClass != nil;

  // Also construct construction info if needed
  ObjCAllocInfo allocInfo;
  if (!isProxy && isNewClass) {
    // For inherited classes we are going to do a retaining from native side
    // when allocationg the Objective-C object, so we pass true for the
    // argument owned to avoid the Objective-C object being overretained by
    // the Java side.
    jobject buildInfo = env->CallStaticObjectMethod(
        gNatJClass, gBuildJavaObjectInfoStaticMethod, gRuntime, type,
        gObjCObjectMapperClass, NULL, NULL, !isHybrid, false, false);
    allocInfo.constructionInfo = env->NewGlobalRef(buildInfo);
    env->DeleteLocalRef(buildInfo);
  }

  // If it is a new class, then create and register it with the Objective-C
  // runtime
  if (isHybrid) {
    objcMetaClass = object_getClass(objcClass);

    // Store the Java class object into the Objective-C class object
    @autoreleasepool {
      [gObjCTypeMap setObject:[NSValue valueWithPointer:env->NewGlobalRef(type)]
                       forKey:objcClass];
    }

    // Add hybrid class marker protocol
    addNatJClassType(objcClass, NatJClassHybridType);

    // Add main methods
    if (!isHybridClass(superClass)) {
      class_addMethod(objcMetaClass, @selector(alloc), (IMP)alloc_objc, "@@:");
      class_addMethod(objcClass, @selector(retain), (IMP)retain_common, "@@:");
      class_addMethod(objcClass, @selector(retainWeakReference),
                      (IMP)retainWeakReference_common, "c@:");
      class_addMethod(objcClass, @selector(release), (IMP)release_common,
                      "v@:");
    }
  } else if (isNewClass) {
    // Create and register our class with the given super class
    id newClass = objc_allocateClassPair(superClass, classCName,
                                         isProxy ? sizeof(ProxyExtensionInfo) :
                                                   sizeof(ObjCAllocInfo));
    Class newMetaClass = object_getClass(newClass);

    // Add custom class marker protocol
    if (isProxy) {
      addNatJClassType(newClass, NatJClassProxyType);
    } else {
      addNatJClassType(newClass, NatJClassInheritedType);
    }

    // Get and add protocols
    jobjectArray interfaces =
        (jobjectArray)env->CallObjectMethod(type, gGetClassInterfacesMethod);
    jsize interfaceCount = env->GetArrayLength(interfaces);
    for (jsize i = 0; i < interfaceCount; i++) {
      env->PushLocalFrame(10);
      jclass interface = (jclass)env->GetObjectArrayElement(interfaces, i);
      jobject protocol = env->CallObjectMethod(interface, gGetAnnotationMethod,
                                               gObjCProtocolNameClass);
      if (!env->IsSameObject(protocol, NULL)) {
        jstring protocolName = (jstring)env->CallObjectMethod(
            protocol, gGetObjCProtocolNameMethod);
        const char* protocolCName = env->GetStringUTFChars(protocolName, NULL);
        Protocol* protocol = objc_getProtocol(protocolCName);
        env->ReleaseStringUTFChars(protocolName, protocolCName);
        if (protocol) {
          class_addProtocol(newClass, protocol);
        }
      }
      env->PopLocalFrame(NULL);
    }
    env->DeleteLocalRef(interfaces);

    // Add main methods
    if (isProxy) {
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wundeclared-selector"
      class_addMethod(newClass, @selector(initWithEnv:javaInstance:),
                      (IMP)init_java, "@@:^v^v");
#pragma clang diagnostic pop
      class_addMethod(newMetaClass, @selector(alloc), (IMP)alloc_java, "@@:");
      class_addMethod(newClass, @selector(retain), (IMP)retain_common, "@@:");
      class_addMethod(newClass, @selector(retainWeakReference),
                      (IMP)retainWeakReference_common, "c@:");
      class_addMethod(newClass, @selector(release), (IMP)release_common, "v@:");
      
      // Store the extension info
      *getExtensionInfoForProxyClass(newClass) = {
        .extensionClass = (jclass)env->NewGlobalRef(extension),
        .extensionConstructor = extension ? env->GetMethodID(extension, "<init>", "(Ljava/lang/Object;)V") : nullptr
      };
    } else {
      if (isBindingClass(superClass)) {
        class_addMethod(newMetaClass, @selector(alloc), (IMP)alloc_objc, "@@:");
        class_addMethod(newClass, @selector(retain), (IMP)retain_common, "@@:");
        class_addMethod(newClass, @selector(retainWeakReference),
                        (IMP)retainWeakReference_common, "c@:");
        class_addMethod(newClass, @selector(release), (IMP)release_common,
                        "v@:");
      }

      // Store the construction info
      *getAllocInfoForClass(newClass) = allocInfo;
    }

    // Save class
    objcClass = newClass;
    objcMetaClass = newMetaClass;
  } else {
    addNatJClassType(objcClass, NatJClassBindingType);
  }

  // Release strings
  env->ReleaseStringUTFChars(classJName, classCName);
  env->DeleteLocalRef(classJName);

  // Handle members
  jobjectArray methods[2];
  methods[0] = (jobjectArray)env->CallObjectMethod(
      type, isProxy ? gGetMethodsMethod : gGetDeclaredMethodsMethod);
  jsize methodCount[2];
  methodCount[0] = env->GetArrayLength(methods[0]);
  
  // Handle proxy extensions
  if (isProxy && extension) {
    methods[1] = (jobjectArray)env->CallObjectMethod(extension, gGetMethodsMethod);
    methodCount[1] = env->GetArrayLength(methods[1]);
  } else {
    methods[1] = nullptr;
    methodCount[1] = 0;
  }
  
  // Initialize selector finder
  jobject selectorFinder = env->NewObject(gSelectorFinderClass, gSelectorFinderConstructorMethod);
  env->CallVoidMethod(selectorFinder, gPrepareParentsSelectorsListMethod, type);
  
  for (jsize k = 0; k < 2; k++) {
    for (jsize i = 0; i < methodCount[k]; i++) {
      env->PushLocalFrame(100);
      jobject method = env->GetObjectArrayElement(methods[k], i);

      jint modifiers = env->CallIntMethod(method, gGetModifiersMethod);
      bool isNative = modifiers & ACC_NATIVE;
      bool isStatic = modifiers & ACC_STATIC;
      bool isAbstract = modifiers & ACC_ABSTRACT;

      // We are handling native methods only of original classes
      if (isAbstract || (!isNewClass && !isNative) ||
          env->CallBooleanMethod(method, gIsSyntheticMethodMethod) ||
          (gIsDefaultMethodMethod != nullptr &&
           env->CallBooleanMethod(method, gIsDefaultMethodMethod))) {
        env->PopLocalFrame(NULL);
        continue;
      }

      // Skip not implemented methods
      if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                 gNotImplementedClass)) {
        if (!isNative) {
          jstring methodJName =
              (jstring)env->CallObjectMethod(method, gGetMethodNameMethod);
          const char* methodCName = env->GetStringUTFChars(methodJName, NULL);
          LOGW << "Method " << methodCName
               << " is not native but is marked as not implemented.";
          env->ReleaseStringUTFChars(methodJName, methodCName);
          env->DeleteLocalRef(methodJName);
        }
        env->PopLocalFrame(NULL);
        continue;
      }

      jclass returnType =
      (jclass)env->CallObjectMethod(method, gGetReturnTypeMethod);
      // Add All Properties with setters and getters to register them further
      if (isNewClass && isNative && env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                                         gPropertyClass)) {
        if (env->IsAssignableFrom(gNativeObjectClass, returnType)) {
            env->ThrowNew(gUnsupportedAnnotationExceptionClass,
                "Property annotation is supported for getters "
                "returning only subclasses of NSObject");
            return;
        }
        
        jobject propAnn = env->CallObjectMethod(method, gGetAnnotationMethod, gSelectorClass);
        
        jstring propName = (jstring)env->CallObjectMethod(propAnn, gGetSelectorMethod);
        
        const char* cPorpName = env->GetStringUTFChars(propName, NULL);
        
        NSString *propNSName = [NSString stringWithUTF8String:cPorpName];
        [ObjCProperties addProperty:propNSName withClass:objcClass];
        env->ReleaseStringUTFChars(propName, cPorpName);
      }
        

      // Fetch informations
      void* code = NULL;
      ffi_type* returnCType;
      jsize parameterCount;
      ffi_type** parameterCTypes;
      void (*handler)(ffi_cif*, void*, void**, void*);
      void* userinfo;

      jobject ann = env->CallObjectMethod(method, gGetAnnotationMethod,
                                          gSelectorClass);
        
      if (env->IsSameObject(ann, NULL)) {
        ann = env->CallObjectMethod(selectorFinder, gGetSelectorForMethodMethod, method);
      }
        
      if (!env->IsSameObject(ann, NULL)) {
        // Handle methods
        if (isNewClass && !isNative) {
          ToJavaMessageInfo* info = new ToJavaMessageInfo;
          userinfo = info;

          // We will cache later
          info->cached = false;

          // We will generate cache from this
          info->method = env->NewGlobalRef(method);

          // Save the class variable
          info->clazz = (jclass)env->NewGlobalRef(type);

          // If this method is static, then we will call it on the jclass object
          info->isStatic = isStatic;

          // Save whether this method is a hybrid one
          info->isHybrid = isHybrid;

          // Save alloc info if needed
          if (isHybrid) {
            info->allocInfo = allocInfo;
          }
          
          // Save info for proxy extension
          if (k == 1) {
            info->proxyExtensionClazz = extension;
          } else {
            info->proxyExtensionClazz = nullptr;
          }

          // Store whether this is an initializer method
          jstring selector =
              (jstring)env->CallObjectMethod(ann, gGetSelectorMethod);
          const char* cSelector = env->GetStringUTFChars(selector, NULL);
          info->isInit = isSelectorOfInitMethod(cSelector);
          env->ReleaseStringUTFChars(selector, cSelector);

          // Generate ffi_type fot the method

          jboolean byValue = env->CallBooleanMethod(
              method, gIsAnnotationPresentMethod, gByValueClass);
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
          returnCType = getFFIType(env, returnType, byValue);
#else
          NativeSizedType nativeSized = kNo;
          if (!byValue) {
            if (false) {}
#if !__NATJ_IS_64BIT__
            else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNFloatClass)) {
              nativeSized = kNFloat;
            } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                              gNUIntClass)) {
              nativeSized = kNUInt;
            } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                              gNIntClass)) {
              nativeSized = kNInt;
            }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
            else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNLongClass)) {
              nativeSized = kNLong;
            } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                              gNULongClass)) {
              nativeSized = kNULong;
            }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
            else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gWCharTClass)) {
              nativeSized = kWCharT;
            }
#endif
          }
          returnCType = getFFIType(env, returnType, byValue, false, nativeSized);
#endif
          ffi_type* javaReturnCType = getFFIType(env, returnType, false);

          // Select the appropriate jni method
          info->callback = getJNICallFunction(env, javaReturnCType, isStatic);

          // Generate parameter types
          jobjectArray parameterTypes = (jobjectArray)env->CallObjectMethod(
              method, gGetParameterTypesMethod);
          jobjectArray parameterAnns = (jobjectArray)env->CallObjectMethod(
              method, gGetParameterAnnotationsMethod);
          parameterCount = env->GetArrayLength(parameterTypes) + 2;
          jsize javaParameterCount = parameterCount + 1;
          parameterCTypes = new ffi_type* [parameterCount];
          ffi_type** javaParameterCTypes = new ffi_type* [javaParameterCount];
          parameterCTypes[0] = &ffi_type_pointer;      // self
          javaParameterCTypes[0] = &ffi_type_pointer;  // JNIEnv*
          parameterCTypes[1] = &ffi_type_pointer;      // _cmd
          javaParameterCTypes[1] = &ffi_type_pointer;  // jclass/jobject
          javaParameterCTypes[2] = &ffi_type_pointer;  // jmethodID
          for (jsize j = 2; j < parameterCount; j++) {
            jclass parameterType =
                (jclass)env->GetObjectArrayElement(parameterTypes, j - 2);
            jobjectArray paramAnns =
                (jobjectArray)env->GetObjectArrayElement(parameterAnns, j - 2);
            jsize annCount = env->GetArrayLength(paramAnns);
            jboolean byValue = false;
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
            for (jsize k = 0; k < annCount && !byValue; k++) {
#else
            NativeSizedType nativeSized = kNo;
            for (jsize k = 0; k < annCount && !byValue && nativeSized == kNo;
                 k++) {
#endif
              jobject paramAnn = env->GetObjectArrayElement(paramAnns, k);
              if (env->IsInstanceOf(paramAnn, gByValueClass)) {
                byValue = true;
#if !__NATJ_IS_64BIT__
              } else if (env->IsInstanceOf(paramAnn, gNFloatClass)) {
                nativeSized = kNFloat;
              } else if (env->IsInstanceOf(paramAnn, gNUIntClass)) {
                nativeSized = kNUInt;
              } else if (env->IsInstanceOf(paramAnn, gNIntClass)) {
                nativeSized = kNInt;
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
              } else if (env->IsInstanceOf(paramAnn, gNLongClass)) {
                nativeSized = kNLong;
              } else if (env->IsInstanceOf(paramAnn, gNULongClass)) {
                nativeSized = kNULong;
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
              } else if (env->IsInstanceOf(paramAnn, gWCharTClass)) {
                nativeSized = kWCharT;
#endif
              }
            }
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
            parameterCTypes[j] = getFFIType(env, parameterType, byValue, false);
#else
            parameterCTypes[j] =
                getFFIType(env, parameterType, byValue, false, nativeSized);
#endif
            javaParameterCTypes[j + 1] =
                getFFIType(env, parameterType, false, true);
          }

          // Prepare ffi_cif for the jni method call
          ffi_prep_cif_var(&info->cif, FFI_DEFAULT_ABI, 3, javaParameterCount,
                           javaReturnCType, javaParameterCTypes);

          // Set the callback handler
          handler = nativeToJavaMessageHandler;
        } else if (isNative) {
          ToNativeMessageInfo* info = new ToNativeMessageInfo;
          userinfo = info;

          // We will cache later
          info->cached = false;

          // We will generate cache from this
          info->method = env->NewGlobalRef(method);

          // Get variadic info
          jobject var =
              env->CallObjectMethod(method, gGetAnnotationMethod, gVariadicClass);
          if (env->IsSameObject(var, NULL)) {
            info->variadic = kNotVariadic;
          } else {
            info->variadic =
                env->CallByteMethod(var, gGetVariadicUnboxPolicyMethod);
            if (info->variadic == gRuntimeVariadicPolicyValue) {
              info->variadic = gDefaultUnboxPolicy;
            } else if (info->variadic == gUnboxVariadicPolicyValue) {
              info->variadic = kUnboxVariadic;
            } else {
              info->variadic = kBoxVariadic;
            }
            env->DeleteLocalRef(var);
          }

          // Save the class variable
          info->clazz = objcClass;

          // Is it a category method?
          info->isCategory = isCategory;

          // If this method is static, then we will call it on the Class object
          info->isStatic = isStatic;
          if (isCategory) {
            info->isStatic = !env->IsSameObject(
                env->CallObjectMethod(method, gGetAnnotationMethod,
                                      gCategoryClassMethodClass),
                NULL);
          } else {
            info->isStatic = isStatic;
          }

          // Store the selector and whether this is an initializer method
          jstring selector =
              (jstring)env->CallObjectMethod(ann, gGetSelectorMethod);
          const char* cSelector = env->GetStringUTFChars(selector, NULL);
          info->sel = sel_registerName(cSelector);
          info->isInit = isSelectorOfInitMethod(cSelector);
          env->ReleaseStringUTFChars(selector, cSelector);

          // Generate ffi_type for the method
          jclass returnType =
              (jclass)env->CallObjectMethod(method, gGetReturnTypeMethod);
          jboolean byValue = env->CallBooleanMethod(
              method, gIsAnnotationPresentMethod, gByValueClass);
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
          ffi_type* nativeReturnCType = getFFIType(env, returnType, byValue);
#else
          NativeSizedType nativeSized = kNo;
          if (!byValue) {
            if (false) {}
#if !__NATJ_IS_64BIT__
            else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNFloatClass)) {
              nativeSized = kNFloat;
            } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                              gNUIntClass)) {
              nativeSized = kNUInt;
            } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                              gNIntClass)) {
              nativeSized = kNInt;
            }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
            else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNLongClass)) {
              nativeSized = kNLong;
            } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                              gNULongClass)) {
              nativeSized = kNULong;
            }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
            else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gWCharTClass)) {
              nativeSized = kWCharT;
            }
#endif
          }
          ffi_type* nativeReturnCType =
              getFFIType(env, returnType, byValue, false, nativeSized);
#endif
          returnCType = getFFIType(env, returnType, false);

          // Select the appropriate message handlers
          auto callbacks = getSelectorCallback(nativeReturnCType);
          info->callback = std::get<0>(callbacks);
          info->superCallback = std::get<1>(callbacks);

          // Generate parameter types
          bool createCIF = info->variadic == kNotVariadic;
          bool toSkipFirst = isCategory && !info->isStatic;
          jobjectArray parameterTypes = (jobjectArray)env->CallObjectMethod(
              method, gGetParameterTypesMethod);
          jobjectArray parameterAnns = (jobjectArray)env->CallObjectMethod(
              method, gGetParameterAnnotationsMethod);
          parameterCount = env->GetArrayLength(parameterTypes) + 2;
          parameterCTypes = new ffi_type* [parameterCount];
          jsize nativeParameterCount =
              toSkipFirst ? parameterCount - 1 : parameterCount;
          if (!createCIF) {
            nativeParameterCount--;
          }
          ffi_type** nativeParameterCTypes = new ffi_type* [nativeParameterCount];
          parameterCTypes[0] = &ffi_type_pointer;        // JNIEnv*
          nativeParameterCTypes[0] = &ffi_type_pointer;  // self
          parameterCTypes[1] = &ffi_type_pointer;        // jclass/jobject
          nativeParameterCTypes[1] = &ffi_type_pointer;  // _cmd
          for (jsize j = 2; j < parameterCount; j++) {
            jclass parameterType =
                (jclass)env->GetObjectArrayElement(parameterTypes, j - 2);
            parameterCTypes[j] = getFFIType(env, parameterType, false);
            if (createCIF || j < parameterCount - 1) {
              jobjectArray paramAnns =
                  (jobjectArray)env->GetObjectArrayElement(parameterAnns, j - 2);
              jsize annCount = env->GetArrayLength(paramAnns);
              jboolean byValue = false;
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
              for (jsize k = 0; k < annCount && !byValue; k++) {
#else
              NativeSizedType nativeSized = kNo;
              for (jsize k = 0; k < annCount && !byValue && nativeSized == kNo;
                   k++) {
#endif
                jobject paramAnn = env->GetObjectArrayElement(paramAnns, k);
                if (env->IsInstanceOf(paramAnn, gByValueClass)) {
                  byValue = true;
#if !__NATJ_IS_64BIT__
                } else if (env->IsInstanceOf(paramAnn, gNFloatClass)) {
                  nativeSized = kNFloat;
                } else if (env->IsInstanceOf(paramAnn, gNUIntClass)) {
                  nativeSized = kNUInt;
                } else if (env->IsInstanceOf(paramAnn, gNIntClass)) {
                  nativeSized = kNInt;
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
                } else if (env->IsInstanceOf(paramAnn, gNLongClass)) {
                  nativeSized = kNLong;
                } else if (env->IsInstanceOf(paramAnn, gNULongClass)) {
                  nativeSized = kNULong;
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
                } else if (env->IsInstanceOf(paramAnn, gWCharTClass)) {
                  nativeSized = kWCharT;
#endif
                }
              }
              if (toSkipFirst) {
                if (j != 2) {
                  nativeParameterCTypes[j - 1] =
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
                      getFFIType(env, parameterType, byValue);
#else
                      getFFIType(env, parameterType, byValue, false, nativeSized);
#endif
                }
              } else {
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
                nativeParameterCTypes[j] =
                    getFFIType(env, parameterType, byValue);
#else
                nativeParameterCTypes[j] =
                    getFFIType(env, parameterType, byValue, false, nativeSized);
#endif
              }
            }
          }

          // Prepare ffi_cif for the Objective-C method call
          if (createCIF) {
            ffi_prep_cif(&info->cif, FFI_DEFAULT_ABI, nativeParameterCount,
                         nativeReturnCType, nativeParameterCTypes);
          } else {
            info->cif.arg_types = nativeParameterCTypes;
            info->cif.rtype = nativeReturnCType;
            info->cif.abi = FFI_DEFAULT_ABI;
            info->cif.nargs = nativeParameterCount;
          }

          // Set the callback handler
          handler = javaToNativeMessageHandler;
        } else {
          env->PopLocalFrame(NULL);
          continue;
        }
      } else if ((ann = env->CallObjectMethod(method, gGetAnnotationMethod,
                                              gInstanceVariableClass)) &&
                 !env->IsSameObject(ann, NULL)) {
        // Handle ivar getter/setters
        IvarInfo* info = new IvarInfo;
        userinfo = info;

        // We will cache it later
        info->cached = false;

        // Store the Objective-C class variable
        info->clazz = objcClass;

        // We will generate cache from this
        info->method = env->NewGlobalRef(method);

        // Ivar name will be used for caching
        jstring ivarName =
            (jstring)env->CallObjectMethod(ann, gGetIvarNameMethod);
        const char* ivarCName = env->GetStringUTFChars(ivarName, NULL);
        jsize ivarNameLength = env->GetStringUTFLength(ivarName) + 1;
        info->name = (char*)malloc(ivarNameLength);
        memcpy((void*)info->name, ivarCName, ivarNameLength);
        env->ReleaseStringUTFChars(ivarName, ivarCName);

        // We will use different functions to set or get an ivar
        info->isGetter = env->CallBooleanMethod(ann, gGetIvarIsGetterMethod);

        // Generate ffi types
        jclass returnType =
            (jclass)env->CallObjectMethod(method, gGetReturnTypeMethod);
        jboolean byValue = env->CallBooleanMethod(
            method, gIsAnnotationPresentMethod, gByValueClass);
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
        returnCType = getFFIType(env, returnType, byValue);
#else
        NativeSizedType nativeSized = kNo;
        if (!byValue) {
            if (false) {}
#if !__NATJ_IS_64BIT__
          else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                          gNFloatClass)) {
            nativeSized = kNFloat;
          } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNUIntClass)) {
            nativeSized = kNUInt;
          } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNIntClass)) {
            nativeSized = kNInt;
          }
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
          else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                          gNLongClass)) {
            nativeSized = kNLong;
          } else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                            gNULongClass)) {
            nativeSized = kNULong;
          }
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
          else if (env->CallBooleanMethod(method, gIsAnnotationPresentMethod,
                                          gWCharTClass)) {
            nativeSized = kWCharT;
          }
#endif
        }
        returnCType = getFFIType(env, returnType, byValue, false, nativeSized);
#endif
        if (info->isGetter) {
          parameterCTypes = new ffi_type* [2];
          parameterCount = 2;
          info->ivarType = returnCType;
        } else {
          jobjectArray parameterTypes = (jobjectArray)env->CallObjectMethod(
              method, gGetParameterTypesMethod);
          jclass parameterType =
              (jclass)env->GetObjectArrayElement(parameterTypes, 0);
          jobjectArray parameterAnns = (jobjectArray)env->CallObjectMethod(
              method, gGetParameterAnnotationsMethod);
          jobjectArray paramAnns =
              (jobjectArray)env->GetObjectArrayElement(parameterAnns, 0);
          jsize annCount = env->GetArrayLength(paramAnns);
          jboolean byValue = false;
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
          for (jsize j = 0; j < annCount && !byValue; j++) {
#else
          NativeSizedType nativeSized = kNo;
          for (jsize j = 0; j < annCount && !byValue && nativeSized == kNo; j++) {
#endif
            jobject paramAnn = env->GetObjectArrayElement(paramAnns, j);
            if (env->IsInstanceOf(paramAnn, gByValueClass)) {
              byValue = true;
#if !__NATJ_IS_64BIT__
            } else if (env->IsInstanceOf(paramAnn, gNFloatClass)) {
              nativeSized = kNFloat;
            } else if (env->IsInstanceOf(paramAnn, gNUIntClass)) {
              nativeSized = kNUInt;
            } else if (env->IsInstanceOf(paramAnn, gNIntClass)) {
              nativeSized = kNInt;
#endif
#if !__NATJ_LONG_TYPE_IS_64BIT__
            } else if (env->IsInstanceOf(paramAnn, gNLongClass)) {
              nativeSized = kNLong;
            } else if (env->IsInstanceOf(paramAnn, gNULongClass)) {
              nativeSized = kNULong;
#endif
#if !__NATJ_WCHART_TYPE_IS_32BIT__
            } else if (env->IsInstanceOf(paramAnn, gWCharTClass)) {
              nativeSized = kWCharT;
#endif
            }
          }
          parameterCTypes = new ffi_type* [3];
#if !__NATJ_HAS_NATIVE_SIZED_TYPES__
          parameterCTypes[2] = getFFIType(env, parameterType, byValue);
#else
          parameterCTypes[2] =
              getFFIType(env, parameterType, byValue, false, nativeSized);
#endif
          parameterCount = 3;
          info->ivarType = parameterCTypes[2];
        }

        // Default parameters
        parameterCTypes[0] = &ffi_type_pointer;  // JNIEnv*
        parameterCTypes[1] = &ffi_type_pointer;  // jobject

        // Create ivar if needed
        if (isNewClass && !isHybrid) {
          @autoreleasepool {
            NSString* type = createObjCTypeEncoding(info->ivarType);
            class_addIvar(objcClass, info->name, info->ivarType->size,
                          info->ivarType->alignment, [type UTF8String]);
          }
        }

        // Set the callback handler
        handler = javaToNativeIvarHandler;
      } else {
        env->PopLocalFrame(NULL);
        continue;
      }

      // Create the closure
      ffi_cif* cif = new ffi_cif;
      ffi_closure* closure =
          (ffi_closure*)ffi_closure_alloc(sizeof(ffi_closure), &code);
      ffi_prep_cif(cif, FFI_DEFAULT_ABI, parameterCount, returnCType,
                   parameterCTypes);
      ffi_prep_closure_loc(closure, cif, handler, userinfo, code);

      // Register method
      if (isNative) {
        jstring methodName =
            (jstring)env->CallObjectMethod(method, gGetMethodNameMethod);
        const char* methodCName = env->GetStringUTFChars(methodName, NULL);
        jstring methodDesc = (jstring)env->CallStaticObjectMethod(
            gAsmTypeClass, gGetMethodDescriptorStaticMethod, method);
        const char* methodCDesc = env->GetStringUTFChars(methodDesc, NULL);
        JNINativeMethod nativeMethod;
        nativeMethod.name = methodCName;
        nativeMethod.signature = methodCDesc;
        nativeMethod.fnPtr = code;
        env->RegisterNatives(type, &nativeMethod, 1);
        env->ReleaseStringUTFChars(methodDesc, methodCDesc);
        env->ReleaseStringUTFChars(methodName, methodCName);
      } else {  // If this is not a native method, then it is a method implemented
                // by Java side
        @autoreleasepool {
          jstring selector =
              (jstring)env->CallObjectMethod(ann, gGetSelectorMethod);
          const char* cSelector = env->GetStringUTFChars(selector, NULL);
          NSString* descriptor = createObjCMethodDescriptor(
              returnCType, parameterCount, parameterCTypes);
          if (isHybrid) {
            class_replaceMethod((isStatic ? objcMetaClass : objcClass),
                                sel_registerName(cSelector), (IMP)code,
                                [descriptor UTF8String]);
          } else {
            class_addMethod((isStatic ? objcMetaClass : objcClass),
                            sel_registerName(cSelector), (IMP)code,
                            [descriptor UTF8String]);
          }
          env->ReleaseStringUTFChars(selector, cSelector);
        }
      }

      env->PopLocalFrame(NULL);
    }
  }

  if (isNewClass && !isHybrid) {
    objc_registerClassPair(objcClass);
  }

  env->DeleteLocalRef(selectorFinder);

  for (jsize k = 0; k < 2; k++) {
    if (methods[k]) {
      env->DeleteLocalRef(methods[k]);
    }
  }

  return objcClass;
}
