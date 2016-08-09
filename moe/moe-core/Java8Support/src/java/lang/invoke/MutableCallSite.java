package java.lang.invoke;

public class MutableCallSite extends CallSite {
	public MutableCallSite(MethodType type) {
	}

	public MutableCallSite(MethodHandle target) {
	}

	@Override
	public final MethodHandle getTarget() {
		return null;
	}

	@Override
	public void setTarget(MethodHandle newTarget) {
	}

	@Override
	public final MethodHandle dynamicInvoker() {
		return null;
	}

	public static void syncAll(MutableCallSite[] sites) {
	}
}
