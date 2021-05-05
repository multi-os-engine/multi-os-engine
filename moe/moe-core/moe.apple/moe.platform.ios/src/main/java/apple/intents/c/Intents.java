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

    /**
     * ! Project version number for Intents.
     */
    @Generated
    @CVariable()
    public static native double IntentsVersionNumber();

    /**
     * ! Project version string for Intents.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr IntentsVersionString();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INIntentErrorDomain();

    /**
     * Identifier for INStartAudioCallIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartAudioCallIntentIdentifier();

    /**
     * Identifier for INStartVideoCallIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartVideoCallIntentIdentifier();

    /**
     * Identifier for INSearchCallHistoryIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSearchCallHistoryIntentIdentifier();

    /**
     * Identifier for INSetAudioSourceInCarIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetAudioSourceInCarIntentIdentifier();

    /**
     * Identifier for INSetClimateSettingsInCarIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetClimateSettingsInCarIntentIdentifier();

    /**
     * Identifier for INSetDefrosterSettingsInCarIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetDefrosterSettingsInCarIntentIdentifier();

    /**
     * Identifier for INSetSeatSettingsInCarIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetSeatSettingsInCarIntentIdentifier();

    /**
     * Identifier for INSetProfileInCarIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetProfileInCarIntentIdentifier();

    /**
     * Identifier for INSaveProfileInCarIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSaveProfileInCarIntentIdentifier();

    /**
     * Identifier for INStartWorkoutIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartWorkoutIntentIdentifier();

    /**
     * Identifier for INPauseWorkoutIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPauseWorkoutIntentIdentifier();

    /**
     * Identifier for INEndWorkoutIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INEndWorkoutIntentIdentifier();

    /**
     * Identifier for INCancelWorkoutIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCancelWorkoutIntentIdentifier();

    /**
     * Identifier for INResumeWorkoutIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INResumeWorkoutIntentIdentifier();

    /**
     * Identifier for INSetRadioStationIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetRadioStationIntentIdentifier();

    /**
     * Identifier for INSendMessageIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSendMessageIntentIdentifier();

    /**
     * Identifier for INSearchForMessagesIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSearchForMessagesIntentIdentifier();

    /**
     * Identifier for INSetMessageAttributeIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetMessageAttributeIntentIdentifier();

    /**
     * Identifier for INSendPaymentIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSendPaymentIntentIdentifier();

    /**
     * Identifier for INRequestPaymentIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INRequestPaymentIntentIdentifier();

    /**
     * Identifier for INSearchForPhotosIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSearchForPhotosIntentIdentifier();

    /**
     * Identifier for INStartPhotoPlaybackIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartPhotoPlaybackIntentIdentifier();

    /**
     * Identifier for INListRideOptionsIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INListRideOptionsIntentIdentifier();

    /**
     * Identifier for INRequestRideIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INRequestRideIntentIdentifier();

    /**
     * Identifier for INGetRideStatusIntent class.
     */
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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipSon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipDaughter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierHike();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierHighIntensityIntervalTraining();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierSwim();

    /**
     * Identifier for INStartCallIntent class.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartCallIntentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeJ1772();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeCCS1();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeCCS2();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeCHAdeMO();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeGBTAC();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeGBTDC();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeTesla();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeMennekes();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelSchool();
}
