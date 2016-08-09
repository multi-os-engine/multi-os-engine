package java.lang.invoke;

abstract public class CallSite {
	public abstract MethodHandle dynamicInvoker();

	public abstract MethodHandle getTarget();

	public abstract void setTarget(MethodHandle newTarget);

	public MethodType type() {
		return null;
	}
}
