package apple.naturallanguage.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * NLModel is a class representing a custom model that has been trained for tagging. Currently supported models follow
 * one of two types. Classifier models, of type NLModelTypeClassifier, tag text at the sentence or higher level.
 * Sequence models, of type NLModelTypeSequence, tag text at the token level. Currently NLModel objects can be created
 * only from model files on disk or from MLModel objects. Each NLModel object has an associated NLModelConfiguration,
 * which contains all the metadata about the model, including specifying whether it is a sequence or classifier model.
 */
@Generated
public final class NLModelType {
    @Generated
    private NLModelType() {
    }

    @Generated @NInt public static final long Classifier = 0x0000000000000000L;
    @Generated @NInt public static final long Sequence = 0x0000000000000001L;
}