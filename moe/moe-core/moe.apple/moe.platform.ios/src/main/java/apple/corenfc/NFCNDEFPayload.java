package apple.corenfc;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class NFCNDEFPayload
 * 
 * @discussion  A NDEF message payload consists of Type Name Format, Type, Payload Identifier, and Payload data.
 *              The NDEF payload cannot result into a record that is greater than 128KB in size.
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NFCNDEFPayload extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NFCNDEFPayload(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NFCNDEFPayload alloc();

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("identifier")
    public native NSData identifier();

    @Generated
    @Selector("init")
    public native NFCNDEFPayload init();

    @Generated
    @Selector("initWithCoder:")
    public native NFCNDEFPayload initWithCoder(NSCoder coder);

    /**
     * @method initWithFormat:type:identifier:paylaod:
     * 
     * @param format        NFCTypeNameFormat value.
     * @param type          Identifier describing the type of the payload.  Empty data indicates field is absent from the payload.
     * @param identifier    Identifier in the form of a URI reference.  Empty data indicates field is absent from the payload.
     * @param payload       Payload data.  Empty data indicates field is absent from the payload.
     * 
     * This initializer uses the maximum payload chunk size defined by the NFC NDEF specification, i.e. 2^32-1 octets.
     */
    @Generated
    @Selector("initWithFormat:type:identifier:payload:")
    public native NFCNDEFPayload initWithFormatTypeIdentifierPayload(byte format, NSData type, NSData identifier,
            NSData payload);

    /**
     * @method initWithFormat:type:identifier:paylaod:
     * 
     * @param format        NFCTypeNameFormat value.
     * @param type          Identifier describing the type of the payload.  Empty data indicates field is absent from the payload.
     * @param identifier    Identifier in the form of a URI reference.  Empty data indicates field is absent from the payload.
     * @param payload       Payload data.  Empty data indicates field is absent from the payload.
     * @param chunkSize     Maximum size of a payload chunk.  0 means no chunking on the payload, i.e. payload is fit in a single record.
     */
    @Generated
    @Selector("initWithFormat:type:identifier:payload:chunkSize:")
    public native NFCNDEFPayload initWithFormatTypeIdentifierPayloadChunkSize(byte format, NSData type,
            NSData identifier, NSData payload, @NUInt long chunkSize);

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
    @Selector("payload")
    public native NSData payload();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(NSData value);

    @Generated
    @Selector("setPayload:")
    public native void setPayload(NSData value);

    @Generated
    @Selector("setType:")
    public native void setType(NSData value);

    @Generated
    @Selector("setTypeNameFormat:")
    public native void setTypeNameFormat(byte value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("type")
    public native NSData type();

    @Generated
    @Selector("typeNameFormat")
    public native byte typeNameFormat();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("wellKnowTypeTextPayloadWithString:locale:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object wellKnowTypeTextPayloadWithStringLocale(String text, NSLocale locale);

    /**
     * @method wellKnownTypeTextPayloadWithLocale:
     * 
     * @param locale    Returns NSLocale object that is constructed from the IANA language code stored with the text payload.
     * @return          NSString object base on a valid Well Known Type Text payload.  nil if payload is not a text.
     */
    @Generated
    @Selector("wellKnownTypeTextPayloadWithLocale:")
    public native String wellKnownTypeTextPayloadWithLocale(@ReferenceInfo(type = NSLocale.class) Ptr<NSLocale> locale);

    /**
     * @method wellKnownTypeTextPayloadWithString:locale:
     * 
     * @param text      Text message.
     * @param locale    NSLocale object.  IANA language code specified by the locale will be saved with the payload.
     */
    @Generated
    @Selector("wellKnownTypeTextPayloadWithString:locale:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object wellKnownTypeTextPayloadWithStringLocale(String text, NSLocale locale);

    /**
     * @method      wellKnownTypeURIPayload
     * 
     * @return      NSURL object base on a valid Well Known Type URI payload. nil if payload is not a URI.
     */
    @Generated
    @Selector("wellKnownTypeURIPayload")
    public native NSURL wellKnownTypeURIPayload();

    /**
     * @method wellKnownTypeURIRecordWithString:
     * 
     * @param uri       URI string.  UTF-8 encoding representation will be used.
     * 
     * @discussion      Used for creating NDEF URI payloads which cannot be represented with NSURL object.  These are URIs that contain characters
     *                  such as 'ä' and 'ö' which cannot be represent by the 7 bits ASCII encoding.
     */
    @Generated
    @Selector("wellKnownTypeURIPayloadWithString:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object wellKnownTypeURIPayloadWithString(String uri);

    /**
     * @method wellKnownTypeURIPayloadWithURL:
     * 
     * @param url       NSURL object.
     * 
     * @discussion      Preferred convenience function for creating NDEF URI payload with common URLs such as "https://www.apple.com" or "tel:+1-555-555-5555".
     */
    @Generated
    @Selector("wellKnownTypeURIPayloadWithURL:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object wellKnownTypeURIPayloadWithURL(NSURL url);
}