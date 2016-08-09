package java.lang.invoke;

import java.util.List;

public final class MethodType implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public MethodType appendParameterTypes(Class<?>... ptypesToInsert) {
		return null;
	}

	public MethodType appendParameterTypes(List<Class<?>> ptypesToInsert) {
		return null;
	}

	public MethodType changeParameterType(int num, Class<?> nptype) {
		return null;
	}

	public MethodType changeReturnType(Class<?> nrtype) {
		return null;
	}

	public MethodType dropParameterTypes(int start, int end) {
		return null;
	}

	public boolean equals(Object x) {
		return false;
	}

	public MethodType erase() {
		return null;
	}

	public static MethodType fromMethodDescriptorString(String descriptor, ClassLoader loader) {
		return null;
	}

	public MethodType generic() {
		return null;
	}

	public static MethodType genericMethodType(int objectArgCount) {
		return null;
	}

	public static MethodType genericMethodType(int objectArgCount, boolean finalArray) {
		return null;
	}

	public int hashCode() {
		return 0;
	}

	public boolean hasPrimitives() {
		return false;
	}

	public boolean hasWrappers() {
		return false;
	}

	public MethodType insertParameterTypes(int num, Class<?>... ptypesToInsert) {
		return null;
	}

	public MethodType insertParameterTypes(int num, List<Class<?>> ptypesToInsert) {
		return null;
	}

	public static MethodType methodType(Class<?> rtype) {
		return null;
	}

	public static MethodType methodType(Class<?> rtype, Class<?> ptype0) {
		return null;
	}

	public static MethodType methodType(Class<?> rtype, Class<?>[] ptypes) {
		return null;
	}

	public static MethodType methodType(Class<?> rtype, Class<?> ptype0, Class<?>... ptypes) {
		return null;
	}

	public static MethodType methodType(Class<?> rtype, List<Class<?>> ptypes) {
		return null;
	}

	public static MethodType methodType(Class<?> rtype, MethodType ptypes) {
		return null;
	}

	public Class<?>[] parameterArray() {
		return null;
	}

	public int parameterCount() {
		return 0;
	}

	public List<Class<?>> parameterList() {
		return null;
	}

	public Class<?> parameterType(int num) {
		return null;
	}

	public Class<?> returnType() {
		return null;
	}

	public String toMethodDescriptorString() {
		return null;
	}

	public String toString() {
		return null;
	}

	public MethodType unwrap() {
		return null;
	}

	public MethodType wrap() {
		return null;
	}

}
