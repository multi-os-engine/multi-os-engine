package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MTREventIDType {
    @Generated
    private MTREventIDType() {
    }

    /**
     * Cluster AccessControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterAccessControlEventAccessControlEntryChangedID
     */
    @Generated @Deprecated public static final int ClusterAccessControlEventAccessControlEntryChangedID = 0x00000000;
    /**
     * Cluster AccessControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterAccessControlEventAccessControlExtensionChangedID
     */
    @Generated @Deprecated public static final int ClusterAccessControlEventAccessControlExtensionChangedID = 0x00000001;
    /**
     * Cluster AccessControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterAccessControlEventAccessControlEntryChangedID = 0x00000000;
    /**
     * Cluster AccessControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterAccessControlEventAccessControlExtensionChangedID = 0x00000001;
    /**
     * Cluster Actions deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterActionsEventStateChangedID
     */
    @Generated @Deprecated public static final int ClusterActionsEventStateChangedID = 0x00000000;
    /**
     * Cluster Actions deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterActionsEventActionFailedID
     */
    @Generated @Deprecated public static final int ClusterActionsEventActionFailedID = 0x00000001;
    /**
     * Cluster Actions events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterActionsEventStateChangedID = 0x00000000;
    /**
     * Cluster Actions events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterActionsEventActionFailedID = 0x00000001;
    /**
     * Cluster Basic deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterBasicInformationEventStartUpID
     */
    @Generated @Deprecated public static final int ClusterBasicEventStartUpID = 0x00000000;
    /**
     * Cluster Basic deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterBasicInformationEventShutDownID
     */
    @Generated @Deprecated public static final int ClusterBasicEventShutDownID = 0x00000001;
    /**
     * Cluster Basic deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterBasicInformationEventLeaveID
     */
    @Generated @Deprecated public static final int ClusterBasicEventLeaveID = 0x00000002;
    /**
     * Cluster Basic deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterBasicInformationEventReachableChangedID
     */
    @Generated @Deprecated public static final int ClusterBasicEventReachableChangedID = 0x00000003;
    /**
     * Cluster BasicInformation events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterBasicInformationEventStartUpID = 0x00000000;
    /**
     * Cluster BasicInformation events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterBasicInformationEventShutDownID = 0x00000001;
    /**
     * Cluster BasicInformation events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterBasicInformationEventLeaveID = 0x00000002;
    /**
     * Cluster BasicInformation events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterBasicInformationEventReachableChangedID = 0x00000003;
    /**
     * Cluster OtaSoftwareUpdateRequestor deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterOTASoftwareUpdateRequestorEventStateTransitionID
     */
    @Generated @Deprecated public static final int ClusterOtaSoftwareUpdateRequestorEventStateTransitionID = 0x00000000;
    /**
     * Cluster OtaSoftwareUpdateRequestor deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterOTASoftwareUpdateRequestorEventVersionAppliedID
     */
    @Generated @Deprecated public static final int ClusterOtaSoftwareUpdateRequestorEventVersionAppliedID = 0x00000001;
    /**
     * Cluster OtaSoftwareUpdateRequestor deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterOTASoftwareUpdateRequestorEventDownloadErrorID
     */
    @Generated @Deprecated public static final int ClusterOtaSoftwareUpdateRequestorEventDownloadErrorID = 0x00000002;
    /**
     * Cluster OTASoftwareUpdateRequestor events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterOTASoftwareUpdateRequestorEventStateTransitionID = 0x00000000;
    /**
     * Cluster OTASoftwareUpdateRequestor events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterOTASoftwareUpdateRequestorEventVersionAppliedID = 0x00000001;
    /**
     * Cluster OTASoftwareUpdateRequestor events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterOTASoftwareUpdateRequestorEventDownloadErrorID = 0x00000002;
    /**
     * Cluster PowerSource events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPowerSourceEventWiredFaultChangeID = 0x00000000;
    /**
     * Cluster PowerSource events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPowerSourceEventBatFaultChangeID = 0x00000001;
    /**
     * Cluster PowerSource events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPowerSourceEventBatChargeFaultChangeID = 0x00000002;
    /**
     * Cluster GeneralDiagnostics deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterGeneralDiagnosticsEventHardwareFaultChangeID
     */
    @Generated @Deprecated public static final int ClusterGeneralDiagnosticsEventHardwareFaultChangeID = 0x00000000;
    /**
     * Cluster GeneralDiagnostics deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterGeneralDiagnosticsEventRadioFaultChangeID
     */
    @Generated @Deprecated public static final int ClusterGeneralDiagnosticsEventRadioFaultChangeID = 0x00000001;
    /**
     * Cluster GeneralDiagnostics deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterGeneralDiagnosticsEventNetworkFaultChangeID
     */
    @Generated @Deprecated public static final int ClusterGeneralDiagnosticsEventNetworkFaultChangeID = 0x00000002;
    /**
     * Cluster GeneralDiagnostics deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterGeneralDiagnosticsEventBootReasonID
     */
    @Generated @Deprecated public static final int ClusterGeneralDiagnosticsEventBootReasonID = 0x00000003;
    /**
     * Cluster GeneralDiagnostics events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterGeneralDiagnosticsEventHardwareFaultChangeID = 0x00000000;
    /**
     * Cluster GeneralDiagnostics events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterGeneralDiagnosticsEventRadioFaultChangeID = 0x00000001;
    /**
     * Cluster GeneralDiagnostics events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterGeneralDiagnosticsEventNetworkFaultChangeID = 0x00000002;
    /**
     * Cluster GeneralDiagnostics events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterGeneralDiagnosticsEventBootReasonID = 0x00000003;
    /**
     * Cluster SoftwareDiagnostics deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterSoftwareDiagnosticsEventSoftwareFaultID
     */
    @Generated @Deprecated public static final int ClusterSoftwareDiagnosticsEventSoftwareFaultID = 0x00000000;
    /**
     * Cluster SoftwareDiagnostics events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterSoftwareDiagnosticsEventSoftwareFaultID = 0x00000000;
    /**
     * Cluster ThreadNetworkDiagnostics deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterThreadNetworkDiagnosticsEventConnectionStatusID
     */
    @Generated @Deprecated public static final int ClusterThreadNetworkDiagnosticsEventConnectionStatusID = 0x00000000;
    /**
     * Cluster ThreadNetworkDiagnostics deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterThreadNetworkDiagnosticsEventNetworkFaultChangeID
     */
    @Generated @Deprecated public static final int ClusterThreadNetworkDiagnosticsEventNetworkFaultChangeID = 0x00000001;
    /**
     * Cluster ThreadNetworkDiagnostics events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterThreadNetworkDiagnosticsEventConnectionStatusID = 0x00000000;
    /**
     * Cluster ThreadNetworkDiagnostics events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterThreadNetworkDiagnosticsEventNetworkFaultChangeID = 0x00000001;
    /**
     * Cluster WiFiNetworkDiagnostics deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterWiFiNetworkDiagnosticsEventDisconnectionID
     */
    @Generated @Deprecated public static final int ClusterWiFiNetworkDiagnosticsEventDisconnectionID = 0x00000000;
    /**
     * Cluster WiFiNetworkDiagnostics deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterWiFiNetworkDiagnosticsEventAssociationFailureID
     */
    @Generated @Deprecated public static final int ClusterWiFiNetworkDiagnosticsEventAssociationFailureID = 0x00000001;
    /**
     * Cluster WiFiNetworkDiagnostics deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterWiFiNetworkDiagnosticsEventConnectionStatusID
     */
    @Generated @Deprecated public static final int ClusterWiFiNetworkDiagnosticsEventConnectionStatusID = 0x00000002;
    /**
     * Cluster WiFiNetworkDiagnostics events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterWiFiNetworkDiagnosticsEventDisconnectionID = 0x00000000;
    /**
     * Cluster WiFiNetworkDiagnostics events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterWiFiNetworkDiagnosticsEventAssociationFailureID = 0x00000001;
    /**
     * Cluster WiFiNetworkDiagnostics events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterWiFiNetworkDiagnosticsEventConnectionStatusID = 0x00000002;
    /**
     * Cluster BridgedDeviceBasic deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterBridgedDeviceBasicInformationEventStartUpID
     */
    @Generated @Deprecated public static final int ClusterBridgedDeviceBasicEventStartUpID = 0x00000000;
    /**
     * Cluster BridgedDeviceBasic deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterBridgedDeviceBasicInformationEventShutDownID
     */
    @Generated @Deprecated public static final int ClusterBridgedDeviceBasicEventShutDownID = 0x00000001;
    /**
     * Cluster BridgedDeviceBasic deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterBridgedDeviceBasicInformationEventLeaveID
     */
    @Generated @Deprecated public static final int ClusterBridgedDeviceBasicEventLeaveID = 0x00000002;
    /**
     * Cluster BridgedDeviceBasic deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterBridgedDeviceBasicInformationEventReachableChangedID
     */
    @Generated @Deprecated public static final int ClusterBridgedDeviceBasicEventReachableChangedID = 0x00000003;
    /**
     * Cluster BridgedDeviceBasicInformation events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterBridgedDeviceBasicInformationEventStartUpID = 0x00000000;
    /**
     * Cluster BridgedDeviceBasicInformation events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterBridgedDeviceBasicInformationEventShutDownID = 0x00000001;
    /**
     * Cluster BridgedDeviceBasicInformation events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterBridgedDeviceBasicInformationEventLeaveID = 0x00000002;
    /**
     * Cluster BridgedDeviceBasicInformation events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterBridgedDeviceBasicInformationEventReachableChangedID = 0x00000003;
    /**
     * Cluster Switch deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterSwitchEventSwitchLatchedID
     */
    @Generated @Deprecated public static final int ClusterSwitchEventSwitchLatchedID = 0x00000000;
    /**
     * Cluster Switch deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterSwitchEventInitialPressID
     */
    @Generated @Deprecated public static final int ClusterSwitchEventInitialPressID = 0x00000001;
    /**
     * Cluster Switch deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterSwitchEventLongPressID
     */
    @Generated @Deprecated public static final int ClusterSwitchEventLongPressID = 0x00000002;
    /**
     * Cluster Switch deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterSwitchEventShortReleaseID
     */
    @Generated @Deprecated public static final int ClusterSwitchEventShortReleaseID = 0x00000003;
    /**
     * Cluster Switch deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterSwitchEventLongReleaseID
     */
    @Generated @Deprecated public static final int ClusterSwitchEventLongReleaseID = 0x00000004;
    /**
     * Cluster Switch deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterSwitchEventMultiPressOngoingID
     */
    @Generated @Deprecated public static final int ClusterSwitchEventMultiPressOngoingID = 0x00000005;
    /**
     * Cluster Switch deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterSwitchEventMultiPressCompleteID
     */
    @Generated @Deprecated public static final int ClusterSwitchEventMultiPressCompleteID = 0x00000006;
    /**
     * Cluster Switch events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterSwitchEventSwitchLatchedID = 0x00000000;
    /**
     * Cluster Switch events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterSwitchEventInitialPressID = 0x00000001;
    /**
     * Cluster Switch events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterSwitchEventLongPressID = 0x00000002;
    /**
     * Cluster Switch events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterSwitchEventShortReleaseID = 0x00000003;
    /**
     * Cluster Switch events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterSwitchEventLongReleaseID = 0x00000004;
    /**
     * Cluster Switch events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterSwitchEventMultiPressOngoingID = 0x00000005;
    /**
     * Cluster Switch events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterSwitchEventMultiPressCompleteID = 0x00000006;
    /**
     * Cluster BooleanState deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterBooleanStateEventStateChangeID
     */
    @Generated @Deprecated public static final int ClusterBooleanStateEventStateChangeID = 0x00000000;
    /**
     * Cluster BooleanState events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterBooleanStateEventStateChangeID = 0x00000000;
    /**
     * Cluster DoorLock deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterDoorLockEventDoorLockAlarmID
     */
    @Generated @Deprecated public static final int ClusterDoorLockEventDoorLockAlarmID = 0x00000000;
    /**
     * Cluster DoorLock deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterDoorLockEventDoorStateChangeID
     */
    @Generated @Deprecated public static final int ClusterDoorLockEventDoorStateChangeID = 0x00000001;
    /**
     * Cluster DoorLock deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterDoorLockEventLockOperationID
     */
    @Generated @Deprecated public static final int ClusterDoorLockEventLockOperationID = 0x00000002;
    /**
     * Cluster DoorLock deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterDoorLockEventLockOperationErrorID
     */
    @Generated @Deprecated public static final int ClusterDoorLockEventLockOperationErrorID = 0x00000003;
    /**
     * Cluster DoorLock deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterDoorLockEventLockUserChangeID
     */
    @Generated @Deprecated public static final int ClusterDoorLockEventLockUserChangeID = 0x00000004;
    /**
     * Cluster DoorLock events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterDoorLockEventDoorLockAlarmID = 0x00000000;
    /**
     * Cluster DoorLock events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterDoorLockEventDoorStateChangeID = 0x00000001;
    /**
     * Cluster DoorLock events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterDoorLockEventLockOperationID = 0x00000002;
    /**
     * Cluster DoorLock events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterDoorLockEventLockOperationErrorID = 0x00000003;
    /**
     * Cluster DoorLock events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterDoorLockEventLockUserChangeID = 0x00000004;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventSupplyVoltageLowID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventSupplyVoltageLowID = 0x00000000;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventSupplyVoltageHighID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventSupplyVoltageHighID = 0x00000001;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventPowerMissingPhaseID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventPowerMissingPhaseID = 0x00000002;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventSystemPressureLowID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventSystemPressureLowID = 0x00000003;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventSystemPressureHighID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventSystemPressureHighID = 0x00000004;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventDryRunningID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventDryRunningID = 0x00000005;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventMotorTemperatureHighID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventMotorTemperatureHighID = 0x00000006;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventPumpMotorFatalFailureID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventPumpMotorFatalFailureID = 0x00000007;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventElectronicTemperatureHighID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventElectronicTemperatureHighID = 0x00000008;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventPumpBlockedID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventPumpBlockedID = 0x00000009;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventSensorFailureID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventSensorFailureID = 0x0000000A;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventElectronicNonFatalFailureID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventElectronicNonFatalFailureID = 0x0000000B;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventElectronicFatalFailureID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventElectronicFatalFailureID = 0x0000000C;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventGeneralFaultID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventGeneralFaultID = 0x0000000D;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventLeakageID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventLeakageID = 0x0000000E;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventAirDetectionID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventAirDetectionID = 0x0000000F;
    /**
     * Cluster PumpConfigurationAndControl deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterPumpConfigurationAndControlEventTurbineOperationID
     */
    @Generated @Deprecated public static final int ClusterPumpConfigurationAndControlEventTurbineOperationID = 0x00000010;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventSupplyVoltageLowID = 0x00000000;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventSupplyVoltageHighID = 0x00000001;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventPowerMissingPhaseID = 0x00000002;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventSystemPressureLowID = 0x00000003;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventSystemPressureHighID = 0x00000004;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventDryRunningID = 0x00000005;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventMotorTemperatureHighID = 0x00000006;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventPumpMotorFatalFailureID = 0x00000007;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventElectronicTemperatureHighID = 0x00000008;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventPumpBlockedID = 0x00000009;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventSensorFailureID = 0x0000000A;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventElectronicNonFatalFailureID = 0x0000000B;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventElectronicFatalFailureID = 0x0000000C;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventGeneralFaultID = 0x0000000D;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventLeakageID = 0x0000000E;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventAirDetectionID = 0x0000000F;
    /**
     * Cluster PumpConfigurationAndControl events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterPumpConfigurationAndControlEventTurbineOperationID = 0x00000010;
    /**
     * Cluster TestCluster deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterUnitTestingEventTestEventID
     */
    @Generated @Deprecated public static final int ClusterTestClusterEventTestEventID = 0x00000001;
    /**
     * Cluster TestCluster deprecated event names
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTREventIDTypeClusterUnitTestingEventTestFabricScopedEventID
     */
    @Generated @Deprecated public static final int ClusterTestClusterEventTestFabricScopedEventID = 0x00000002;
    /**
     * Cluster UnitTesting events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterUnitTestingEventTestEventID = 0x00000001;
    /**
     * Cluster UnitTesting events
     * 
     * API-Since: 16.4
     */
    @Generated public static final int EventIDTypeClusterUnitTestingEventTestFabricScopedEventID = 0x00000002;
}