package java.lang.invoke;

import java.util.List;

public abstract class MethodHandle {
	public MethodHandle asCollector(Class<?> arrayType, int arrayLength) {
		return null;
	}

	public MethodHandle asFixedArity() {
		return null;
	}

	public MethodHandle asSpreader(Class<?> arrayType, int arrayLength) {
		return null;
	}

	public MethodHandle asType(MethodType newType) {
		return null;
	}

	public MethodHandle asVarargsCollector(Class<?> arrayType) {
		return null;
	}

	public MethodHandle bindTo(Object x) {
		return null;
	}

	public Object invoke(Object... args) {
		return null;
	}

	public Object invokeExact(Object... args) {
		return null;
	}

	public Object invokeWithArguments(List<?> arguments) {
		return null;
	}

	public Object invokeWithArguments(Object... arguments) {
		return null;
	}

	public boolean isVarargsCollector() {
		return false;
	}

	public String toString() {
		return null;
	}

	public MethodType type() {
		return null;
	}
}
