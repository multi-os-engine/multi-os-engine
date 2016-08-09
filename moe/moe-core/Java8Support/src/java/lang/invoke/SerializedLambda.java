package java.lang.invoke;

import java.io.Serializable;

public final class SerializedLambda implements Serializable {
	private static final long serialVersionUID = 1L;

	public SerializedLambda(Class<?> capturingClass, String functionalInterfaceClass,
			String functionalInterfaceMethodName, String functionalInterfaceMethodSignature, int implMethodKind,
			String implClass, String implMethodName, String implMethodSignature, String instantiatedMethodType,
			Object[] capturedArgs) {
	}

	public String getCapturingClass() {
		return null;
	}

	public String getFunctionalInterfaceClass() {
		return null;
	}

	public String getFunctionalInterfaceMethodName() {
		return null;
	}

	public String getFunctionalInterfaceMethodSignature() {
		return null;
	}

	public String getImplClass() {
		return null;
	}

	public String getImplMethodName() {
		return null;
	}

	public String getImplMethodSignature() {
		return null;
	}

	public int getImplMethodKind() {
		return 0;
	}

	public final String getInstantiatedMethodType() {
		return null;
	}

	public int getCapturedArgCount() {
		return 0;
	}

	public Object getCapturedArg(int i) {
		return i;
	}
}
