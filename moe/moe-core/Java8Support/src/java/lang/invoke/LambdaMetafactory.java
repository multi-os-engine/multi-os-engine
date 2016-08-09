package java.lang.invoke;

public class LambdaMetafactory {
	public static final int FLAG_SERIALIZABLE = 1 << 0;
	public static final int FLAG_MARKERS = 1 << 1;
	public static final int FLAG_BRIDGES = 1 << 2;

	public static CallSite altMetafactory(MethodHandles.Lookup caller, String invokedName, MethodType invokedType,
			Object... args) {
		return null;
	}

	public static CallSite metafactory(MethodHandles.Lookup caller, String invokedName, MethodType invokedType,
			MethodType samMethodType, MethodHandle implMethod, MethodType instantiatedMethodType) {
		return null;
	}
}
