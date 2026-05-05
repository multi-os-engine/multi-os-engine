package org.moe.tools.classvalidator.fixtures;

import org.moe.natj.general.ann.ByValue;
import org.moe.natj.objc.ann.IBOutlet;
import org.moe.natj.objc.ann.Selector;

/**
 * Test fixture: a "parent" binding class with @Selector-annotated methods.
 * Used by AddMissingAnnotationsTest to verify the visitor copies annotations
 * down to overriding methods that lack them.
 */
public abstract class SelectorParent {
    @Selector("doIt")
    public abstract void doIt();

    @Selector("getView")
    @IBOutlet
    public abstract Object getView();

    @Selector("rect")
    @ByValue
    public abstract Object rect();
}
