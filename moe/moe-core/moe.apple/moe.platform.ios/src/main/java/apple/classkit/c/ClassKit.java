package apple.classkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("ClassKit")
@Runtime(CRuntime.class)
public final class ClassKit {
    static {
        NatJ.register();
    }

    @Generated
    private ClassKit() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSErrorCodeDomain();

    /**
     * Any object that caused a failure will be available in - [NSError userInfo]; under this key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSErrorObjectKey();

    /**
     * If multiple objects cause errors we return an error with code `CLSErrorCodePartialFailure` which will contain an array of errors in - [NSError userInfo]; under this key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSErrorUnderlyingErrorsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSPredicateKeyPathDateCreated();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSPredicateKeyPathIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSPredicateKeyPathTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSPredicateKeyPathUniversalLinkURL();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSPredicateKeyPathTopic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSPredicateKeyPathParent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicMath();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicScience();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicLiteracyAndWriting();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicWorldLanguage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicSocialScience();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicComputerScienceAndEngineering();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicArtsAndMusic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicHealthAndFitness();
}