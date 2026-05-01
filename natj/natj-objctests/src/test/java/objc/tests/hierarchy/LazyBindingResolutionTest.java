package objc.tests.hierarchy;

import objc.binding.LazyParent;
import objc.binding.c.LazyBindingHelper;
import org.junit.Assert;
import org.junit.Test;
import org.moe.natj.general.NatJ;
import org.moe.natj.objc.ObjCRuntime;

/**
 * Pins issue #185 fix: when an ObjC subclass arrives whose Java binding has not
 * been loaded yet, NatJ must consult {@code unloadedObjCBindings} and load the
 * binding via {@code Class.forName} instead of falling back to the parent type.
 *
 * <p>Crucially, this class never references {@link objc.binding.LazyChild} —
 * loading it eagerly would populate the resolution cache and short-circuit the
 * branch under test. The assertion compares class names rather than using
 * {@code instanceof}.
 *
 * <p>No paired "without registration → returns parent" test: JUnit runs all
 * tests in one JVM, and the parent-fallback caches its answer in
 * {@code resolvedObjCClasses}, which would poison whichever test ran second.
 * If someone deletes the new {@code unloadedObjCBindings} branch in
 * {@code ObjCRuntime.resolveObjCClass}, this test fails — that is the
 * regression detector.
 */
public class LazyBindingResolutionTest {

    @Test
    public void resolves_lazy_binding_to_correct_subclass() {
        ObjCRuntime rt = (ObjCRuntime) NatJ.getOrCreateInstanceOfRuntimeClass(
                ObjCRuntime.class);
        rt.registerUnloadedObjCBinding("LazyChild", "objc.binding.LazyChild");

        LazyParent obj = LazyBindingHelper.createLazyChildAsParent();

        Assert.assertNotNull(obj);
        Assert.assertEquals("objc.binding.LazyChild", obj.getClass().getName());
    }
}
