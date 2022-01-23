package org.moe.tools.classvalidator.natj

import org.moe.tools.classvalidator.natj.NatJRuntime.getDescriptor


class AnnotationHelper(
    parentAnnotations: Array<out Annotation>,
    private val hasOptionals: Boolean,
) {
    private val parentAnnotations: List<String> = parentAnnotations.map {
        it.annotationClass.java.getDescriptor()
    }
    private val annotations: MutableList<String> = mutableListOf()

    fun add(ann: String) {
        annotations.add(ann)
    }

    fun hasSelectorAnnotation(): Boolean = annotations.any {
        it == NatJRuntime.Annotations.SELECTOR_DESC
    }

    private fun getNewCompleteList(): List<String> = if(hasOptionals) {
        NatJRuntime.Annotations.OPTIONALS_DESC
    } else {
        NatJRuntime.Annotations.NON_OPTIONALS_DESC
    }

    fun getInjectList(): List<String> {
        val parentAnns = getNewCompleteList().intersect(parentAnnotations).toMutableSet()
        // Protocol class method does not require @Selector annotation
        if (NatJRuntime.Annotations.PROTOCOL_CLASS_METHOD_DESC in parentAnns) {
            parentAnns.remove(NatJRuntime.Annotations.SELECTOR_DESC)
        }

        return (parentAnns - annotations).toList()
    }

    fun validate(method: String, index: Int) {
        val allAnns = annotations - parentAnnotations + parentAnnotations
        val isReturn = index == -1

        validateAnnotationTypes(method, allAnns, isReturn)
        validateAnnotationCollision(method, allAnns, isReturn)
    }

    private fun validateAnnotationTypes(
        method: String, allAnns: List<String>, isReturn: Boolean
    ) {
        val enabledAnns = if (isReturn) {
            NatJRuntime.Annotations.RETURN_ANNS_DESC
        } else {
            NatJRuntime.Annotations.PARAM_ANNS_DESC
        }

        allAnns.forEach {
            if (it !in enabledAnns && it in NatJRuntime.Annotations.ALL_ANNS_DESC) {
                throw RuntimeException(
                    "Annotation $it is not allowed on ${
                        if (isReturn) {
                            "return type/method"
                        } else {
                            "parameter"
                        }
                    }! Method: $method"
                )
            }
        }
    }

    private fun validateAnnotationCollision(
        method: String, allAnns: List<String>, isReturn: Boolean
    ) {
        NatJRuntime.Annotations.COLLIDING_ANNS_DESC.forEach { anns ->
            val intersect = allAnns.intersect(anns)
            if (intersect.size > 1) {
                throw RuntimeException(
                    "Annotations $intersect can't be specified at the same time! Method: $method"
                )
            }
        }
    }
}
