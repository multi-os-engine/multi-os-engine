package java.lang.invoke;

import java.lang.reflect.*;
import java.util.List;

public class MethodHandles {

	public static final class Lookup {
		public static final int PUBLIC = Modifier.PUBLIC;
		public static final int PRIVATE = Modifier.PRIVATE;
		public static final int PROTECTED = Modifier.PROTECTED;
		public static final int PACKAGE = Modifier.STATIC;

		public MethodHandle bind(Object receiver, String name, MethodType type) {
			return null;
		}

		public MethodHandle findConstructor(Class<?> refc, MethodType type) {
			return null;
		}

		public MethodHandle findGetter(Class<?> refc, String name, Class<?> type) {
			return null;
		}

		public MethodHandle findSetter(Class<?> refc, String name, Class<?> type) {
			return null;
		}

		public MethodHandle findSpecial(Class<?> refc, String name, MethodType type, Class<?> specialCaller) {
			return null;
		}

		public MethodHandle findStatic(Class<?> refc, String name, MethodType type) {
			return null;
		}

		public MethodHandle findStaticGetter(Class<?> refc, String name, Class<?> type) {
			return null;
		}

		public MethodHandle findStaticSetter(Class<?> refc, String name, Class<?> type) {
			return null;
		}

		public MethodHandle findVirtual(Class<?> refc, String name, MethodType type) {
			return null;
		}

		public MethodHandles.Lookup in(Class<?> requestedLookupClass) {
			return null;
		}

		public Class<?> lookupClass() {
			return null;
		}

		public int lookupModes() {
			return 0;
		}

		public MethodHandleInfo revealDirect(MethodHandle target) {
			return null;
		}

		public String toString() {
			return null;
		}

		public MethodHandle unreflect(Method m) {
			return null;
		}

		public MethodHandle unreflectConstructor(Constructor<?> c) {
			return null;
		}

		public MethodHandle unreflectGetter(Field f) {
			return null;
		}

		public MethodHandle unreflectSetter(Field f) {
			return null;
		}

		public MethodHandle unreflectSpecial(Method m, Class<?> specialCaller) {
			return null;
		}

	}

	public static MethodHandle arrayElementGetter(Class<?> arrayClass) {
		return null;
	}

	public static MethodHandle arrayElementSetter(Class<?> arrayClass) {
		return null;
	}

	public static MethodHandle catchException(MethodHandle target, Class<? extends Throwable> exType,
			MethodHandle handler) {
		return null;
	}

	public static MethodHandle collectArguments(MethodHandle target, int pos, MethodHandle filter) {
		return null;
	}

	public static MethodHandle constant(Class<?> type, Object value) {
		return null;
	}

	public static MethodHandle dropArguments(MethodHandle target, int pos, Class<?>... valueTypes) {
		return null;
	}

	public static MethodHandle dropArguments(MethodHandle target, int pos, List<Class<?>> valueTypes) {
		return null;
	}

	public static MethodHandle exactInvoker(MethodType type) {
		return null;
	}

	public static MethodHandle explicitCastArguments(MethodHandle target, MethodType newType) {
		return null;
	}

	public static MethodHandle filterArguments(MethodHandle target, int pos, MethodHandle... filters) {
		return null;
	}

	public static MethodHandle filterReturnValue(MethodHandle target, MethodHandle filter) {
		return null;
	}

	public static MethodHandle foldArguments(MethodHandle target, MethodHandle combiner) {
		return null;
	}

	public static MethodHandle guardWithTest(MethodHandle test, MethodHandle target, MethodHandle fallback) {
		return null;
	}

	public static MethodHandle identity(Class<?> type) {
		return null;
	}

	public static MethodHandle insertArguments(MethodHandle target, int pos, Object... values) {
		return null;
	}

	public static MethodHandle invoker(MethodType type) {
		return null;
	}

	public static MethodHandles.Lookup lookup() {
		return null;
	}

	public static MethodHandle permuteArguments(MethodHandle target, MethodType newType, int... reorder) {
		return null;
	}

	public static MethodHandles.Lookup publicLookup() {
		return null;
	}

	public static <T extends Member> T reflectAs(Class<T> expected, MethodHandle target) {
		return null;
	}

	public static MethodHandle spreadInvoker(MethodType type, int leadingArgCount) {
		return null;
	}

	public static MethodHandle throwException(Class<?> returnType, Class<? extends Throwable> exType) {
		return null;
	}
}
