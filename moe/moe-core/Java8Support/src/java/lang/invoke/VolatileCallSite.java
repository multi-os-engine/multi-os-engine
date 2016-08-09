package java.lang.invoke;

public class VolatileCallSite extends CallSite {
	public VolatileCallSite(MethodType type) {
	}

	public VolatileCallSite(MethodHandle target) {
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
}
