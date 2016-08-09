package java.lang.invoke;

public class SwitchPoint {
	public SwitchPoint() {
	}

	public boolean hasBeenInvalidated() {
		return false;
	}

	public MethodHandle guardWithTest(MethodHandle target, MethodHandle fallback) {
		return null;
	}

	public static void invalidateAll(SwitchPoint[] switchPoints) {
	}
}
