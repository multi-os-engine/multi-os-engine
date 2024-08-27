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

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INIntentErrorDomain();

    /**
     * Identifier for INStartAudioCallIntent class.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: INStartAudioCallIntentIdentifier is deprecated. Please adopt INStartCallIntentIdentifier
     * instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartAudioCallIntentIdentifier();

    /**
     * Identifier for INStartVideoCallIntent class.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: INStartVideoCallIntentIdentifier is deprecated. Please adopt INStartCallIntentIdentifier
     * instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartVideoCallIntentIdentifier();

    /**
     * Identifier for INSearchCallHistoryIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSearchCallHistoryIntentIdentifier();

    /**
     * Identifier for INSetAudioSourceInCarIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetAudioSourceInCarIntentIdentifier();

    /**
     * Identifier for INSetClimateSettingsInCarIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetClimateSettingsInCarIntentIdentifier();

    /**
     * Identifier for INSetDefrosterSettingsInCarIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetDefrosterSettingsInCarIntentIdentifier();

    /**
     * Identifier for INSetSeatSettingsInCarIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetSeatSettingsInCarIntentIdentifier();

    /**
     * Identifier for INSetProfileInCarIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetProfileInCarIntentIdentifier();

    /**
     * Identifier for INSaveProfileInCarIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSaveProfileInCarIntentIdentifier();

    /**
     * Identifier for INStartWorkoutIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartWorkoutIntentIdentifier();

    /**
     * Identifier for INPauseWorkoutIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPauseWorkoutIntentIdentifier();

    /**
     * Identifier for INEndWorkoutIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INEndWorkoutIntentIdentifier();

    /**
     * Identifier for INCancelWorkoutIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCancelWorkoutIntentIdentifier();

    /**
     * Identifier for INResumeWorkoutIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INResumeWorkoutIntentIdentifier();

    /**
     * Identifier for INSetRadioStationIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetRadioStationIntentIdentifier();

    /**
     * Identifier for INSendMessageIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSendMessageIntentIdentifier();

    /**
     * Identifier for INSearchForMessagesIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSearchForMessagesIntentIdentifier();

    /**
     * Identifier for INSetMessageAttributeIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSetMessageAttributeIntentIdentifier();

    /**
     * Identifier for INSendPaymentIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSendPaymentIntentIdentifier();

    /**
     * Identifier for INRequestPaymentIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INRequestPaymentIntentIdentifier();

    /**
     * Identifier for INSearchForPhotosIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INSearchForPhotosIntentIdentifier();

    /**
     * Identifier for INStartPhotoPlaybackIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartPhotoPlaybackIntentIdentifier();

    /**
     * Identifier for INListRideOptionsIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INListRideOptionsIntentIdentifier();

    /**
     * Identifier for INRequestRideIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INRequestRideIntentIdentifier();

    /**
     * Identifier for INGetRideStatusIntent class.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INGetRideStatusIntentIdentifier();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelHome();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelWork();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabeliPhone();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelMobile();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelMain();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelHomeFax();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelWorkFax();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelPager();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelOther();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipFather();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipMother();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipParent();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipBrother();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipSister();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipChild();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipFriend();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipSpouse();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipPartner();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipAssistant();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipManager();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierRun();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierSit();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierSteps();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierStand();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierMove();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierWalk();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierYoga();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierDance();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierCrosstraining();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierElliptical();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierRower();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierCycle();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierStairs();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierOther();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierIndoorrun();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierIndoorcycle();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierIndoorwalk();

    /**
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierExercise();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipSon();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonRelationshipDaughter();

    /**
     * API-Since: 12.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierHike();

    /**
     * API-Since: 12.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierHighIntensityIntervalTraining();

    /**
     * API-Since: 12.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INWorkoutNameIdentifierSwim();

    /**
     * Identifier for INStartCallIntent class.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INStartCallIntentIdentifier();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeJ1772();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeCCS1();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeCCS2();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeCHAdeMO();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeGBTAC();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeGBTDC();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeTesla();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INCarChargingConnectorTypeMennekes();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INPersonHandleLabelSchool();

    /**
     * Identifier for INAnswerCallIntent class.
     * 
     * API-Since: 16.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INAnswerCallIntentIdentifier();

    /**
     * Identifier for INHangUpCallIntent class.
     * 
     * API-Since: 16.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String INHangUpCallIntentIdentifier();
}
