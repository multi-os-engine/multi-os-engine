/*
Copyright (C) 2017 Migeran

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe;

import apple.NSObject;
import apple.avfoundation.protocol.AVAudioPlayerDelegate;
import apple.uikit.UIEvent;
import apple.uikit.UILabel;
import apple.uikit.UIViewController;
import apple.uikit.protocol.UIApplicationDelegate;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ann.IBAction;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

@ObjCClassName("ValidController")
public class ValidController extends UIViewController {

    @Owned
    @Selector("alloc")
    public static native ValidController alloc();

    @Selector("init")
    public native ValidController init();

    protected ValidController(Pointer peer) {
        super(peer);
    }

    @Property
    public native ObjCObject bad_property_missingSelector();

    @Property
    @Selector("bad_hasArguments:")
    public native ObjCObject bad_property_hasArguments(int arg0);

    @Property
    @Selector("bad_nonObjectReturn")
    public native void bad_property_nonObjectReturn();

    @Property
    @Selector("ok_property_1")
    public native ObjCObject ok_property_1();

    @Property
    @Selector("ok_property_2")
    public native NSObject ok_property_2();

    @Property
    @Selector("ok_property_3")
    public native UILabel ok_property_3();

    @Property
    @Selector("ok_property_4")
    public native UIApplicationDelegate ok_property_4();

    @Property
    @Selector("ok_property_5")
    public native AVAudioPlayerDelegate ok_property_5();

    @IBAction
    @Selector("bad_action_intReturnType")
    public int bad_action_intReturnType() {
        return 0;
    }

    @IBAction
    @Selector("ok_action_1")
    public void ok_action_1() { }

    @IBAction
    @Selector("bad_action_intFirstArg:")
    public void bad_action_intFirstArg(int arg0) { }

    @IBAction
    @Selector("bad_action_unsupportedFirstArg:")
    public void bad_action_unsupportedFirstArg(Object arg0) { }

    @IBAction
    @Selector("bad_action_badSelector")
    public void bad_action_badSelector0(ObjCObject arg0) { }

    @IBAction
    @Selector("bad_action_bad:Selector")
    public void bad_action_badSelector1(ObjCObject arg0) { }

    @IBAction
    @Selector("bad_action_bad:Selector:")
    public void bad_action_badSelector2(ObjCObject arg0) { }

    @IBAction
    @Selector("ok_action_2:")
    public void ok_action_2(ObjCObject arg0) { }

    @IBAction
    @Selector("bad_action_intSecondArg::")
    public void bad_action_intSecondArg(ObjCObject arg0, int arg1) { }

    @IBAction
    @Selector("bad_action_intSecondArg::")
    public void bad_action_nonUIEventSecondArg(ObjCObject arg0, ObjCObject arg1) { }

    @IBAction
    @Selector("bad_action_badSelector")
    public void bad_action_badSelector3(ObjCObject arg0, UIEvent arg1) { }

    @IBAction
    @Selector("bad_action_badSelector:")
    public void bad_action_badSelector4(ObjCObject arg0, UIEvent arg1) { }

    @IBAction
    @Selector("ok_action_3::")
    public void ok_action_3(ObjCObject arg0, UIEvent arg1) { }

    @IBAction
    @Selector("ok_action_3:a:")
    public void ok_action_3a(ObjCObject arg0, UIEvent arg1) { }
}
