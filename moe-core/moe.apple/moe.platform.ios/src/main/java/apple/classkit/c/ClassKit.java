package apple.classkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

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

    /**
     * API-Since: 11.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSErrorCodeDomain();

    /**
     * Any object that caused a failure will be available in - [NSError userInfo]; under this key.
     * 
     * API-Since: 11.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSErrorObjectKey();

    /**
     * If multiple objects cause errors we return an error with code `CLSErrorCodePartialFailure` which will contain an
     * array of errors in - [NSError userInfo]; under this key.
     * 
     * API-Since: 11.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSErrorUnderlyingErrorsKey();

    /**
     * API-Since: 11.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSPredicateKeyPathDateCreated();

    /**
     * API-Since: 11.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSPredicateKeyPathIdentifier();

    /**
     * API-Since: 11.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSPredicateKeyPathTitle();

    /**
     * API-Since: 11.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSPredicateKeyPathUniversalLinkURL();

    /**
     * API-Since: 11.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSPredicateKeyPathTopic();

    /**
     * API-Since: 11.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSPredicateKeyPathParent();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicMath();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicScience();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicLiteracyAndWriting();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicWorldLanguage();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicSocialScience();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicComputerScienceAndEngineering();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicArtsAndMusic();

    /**
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSContextTopicHealthAndFitness();

    /**
     * Errors with the code `CLSErrorCodePartialFailure` may contain an array of successful entities in - [NSError
     * userInfo]; under this key.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CLSErrorSuccessfulObjectsKey();
}