package apple.contacts.protocol;

import apple.contacts.CNChangeHistoryAddContactEvent;
import apple.contacts.CNChangeHistoryAddGroupEvent;
import apple.contacts.CNChangeHistoryAddMemberToGroupEvent;
import apple.contacts.CNChangeHistoryAddSubgroupToGroupEvent;
import apple.contacts.CNChangeHistoryDeleteContactEvent;
import apple.contacts.CNChangeHistoryDeleteGroupEvent;
import apple.contacts.CNChangeHistoryDropEverythingEvent;
import apple.contacts.CNChangeHistoryRemoveMemberFromGroupEvent;
import apple.contacts.CNChangeHistoryRemoveSubgroupFromGroupEvent;
import apple.contacts.CNChangeHistoryUpdateContactEvent;
import apple.contacts.CNChangeHistoryUpdateGroupEvent;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CNChangeHistoryEventVisitor")
public interface CNChangeHistoryEventVisitor {
    @Generated
    @Selector("visitAddContactEvent:")
    void visitAddContactEvent(CNChangeHistoryAddContactEvent event);

    @Generated
    @IsOptional
    @Selector("visitAddGroupEvent:")
    default void visitAddGroupEvent(CNChangeHistoryAddGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("visitAddMemberToGroupEvent:")
    default void visitAddMemberToGroupEvent(CNChangeHistoryAddMemberToGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("visitAddSubgroupToGroupEvent:")
    default void visitAddSubgroupToGroupEvent(CNChangeHistoryAddSubgroupToGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("visitDeleteContactEvent:")
    void visitDeleteContactEvent(CNChangeHistoryDeleteContactEvent event);

    @Generated
    @IsOptional
    @Selector("visitDeleteGroupEvent:")
    default void visitDeleteGroupEvent(CNChangeHistoryDeleteGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("visitDropEverythingEvent:")
    void visitDropEverythingEvent(CNChangeHistoryDropEverythingEvent event);

    @Generated
    @IsOptional
    @Selector("visitRemoveMemberFromGroupEvent:")
    default void visitRemoveMemberFromGroupEvent(CNChangeHistoryRemoveMemberFromGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("visitRemoveSubgroupFromGroupEvent:")
    default void visitRemoveSubgroupFromGroupEvent(CNChangeHistoryRemoveSubgroupFromGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("visitUpdateContactEvent:")
    void visitUpdateContactEvent(CNChangeHistoryUpdateContactEvent event);

    @Generated
    @IsOptional
    @Selector("visitUpdateGroupEvent:")
    default void visitUpdateGroupEvent(CNChangeHistoryUpdateGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }
}