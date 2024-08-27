package java.lang.invoke;

public class ConstantCallSite extends CallSite {
	public ConstantCallSite(MethodHandle target) {
	}

	protected ConstantCallSite(MethodType targetType, MethodHandle createTargetHook) throws Throwable {
	}

	@Override
	public final MethodHandle getTarget() {
		return null;
	}

	@Override
	public final void setTarget(MethodHandle ignore) {
	}

	@Override
	public final MethodHandle dynamicInvoker() {
		return null;
	}
}
