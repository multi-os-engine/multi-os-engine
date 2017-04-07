package java.lang.invoke;

public interface LambdaMetafactory {

    static CallSite metafactory(MethodHandles.Lookup caller, String invokedName, MethodType
            invokedType, MethodType samMethodType, MethodHandle implMethod, MethodType
            instantiatedMethodType) {
        return null;
    }
}
