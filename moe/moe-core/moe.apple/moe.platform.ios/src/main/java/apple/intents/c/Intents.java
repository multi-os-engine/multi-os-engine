/*
Copyright 2014-2016 Intel Corporation

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

package apple.intents.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("Intents")
@Runtime(CRuntime.class)
public final class Intents {
    static {
        NatJ.register();
    }

    @Generated
    private Intents() {
    }

    @Generated
    @CVariable()
    public static native double IntentsVersionNumber();

    @Generated
    @CVariable()
    public static native ConstBytePtr IntentsVersionString();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INIntentErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartAudioCallIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartVideoCallIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSearchCallHistoryIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetAudioSourceInCarIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetClimateSettingsInCarIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetDefrosterSettingsInCarIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetSeatSettingsInCarIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetProfileInCarIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSaveProfileInCarIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartWorkoutIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPauseWorkoutIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INEndWorkoutIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCancelWorkoutIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INResumeWorkoutIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetRadioStationIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSendMessageIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSearchForMessagesIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetMessageAttributeIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSendPaymentIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INRequestPaymentIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSearchForPhotosIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartPhotoPlaybackIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INListRideOptionsIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INRequestRideIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INGetRideStatusIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelHome();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelWork();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabeliPhone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelMobile();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelMain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelHomeFax();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelWorkFax();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelPager();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelOther();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipFather();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipMother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipParent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipBrother();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipSister();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipChild();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipFriend();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipSpouse();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipPartner();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipAssistant();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipManager();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierRun();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierSit();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierSteps();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierStand();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierMove();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierWalk();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierYoga();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierDance();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierCrosstraining();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierElliptical();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierRower();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierCycle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierStairs();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierOther();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierIndoorrun();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierIndoorcycle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierIndoorwalk();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierExercise();
}
