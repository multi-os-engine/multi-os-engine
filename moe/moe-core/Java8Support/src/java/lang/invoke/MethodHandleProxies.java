package java.lang.invoke;

public class MethodHandleProxies {
	public static <T> T asInterfaceInstance(Class<T> intfc, MethodHandle target) {
		return null;
	}

	public static boolean isWrapperInstance(Object x) {
		return false;
	}

	public static MethodHandle wrapperInstanceTarget(Object x) {
		return null;
	}

	public static Class<?> wrapperInstanceType(Object x) {
		return null;
	}
}
