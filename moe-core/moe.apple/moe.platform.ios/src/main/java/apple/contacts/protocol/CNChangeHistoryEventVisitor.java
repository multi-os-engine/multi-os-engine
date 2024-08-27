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
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 13.0
 */
@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CNChangeHistoryEventVisitor")
public interface CNChangeHistoryEventVisitor {
    @Generated
    @Selector("visitAddContactEvent:")
    void visitAddContactEvent(@NotNull CNChangeHistoryAddContactEvent event);

    @Generated
    @IsOptional
    @Selector("visitAddGroupEvent:")
    default void visitAddGroupEvent(@NotNull CNChangeHistoryAddGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("visitAddMemberToGroupEvent:")
    default void visitAddMemberToGroupEvent(@NotNull CNChangeHistoryAddMemberToGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("visitAddSubgroupToGroupEvent:")
    default void visitAddSubgroupToGroupEvent(@NotNull CNChangeHistoryAddSubgroupToGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("visitDeleteContactEvent:")
    void visitDeleteContactEvent(@NotNull CNChangeHistoryDeleteContactEvent event);

    @Generated
    @IsOptional
    @Selector("visitDeleteGroupEvent:")
    default void visitDeleteGroupEvent(@NotNull CNChangeHistoryDeleteGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("visitDropEverythingEvent:")
    void visitDropEverythingEvent(@NotNull CNChangeHistoryDropEverythingEvent event);

    @Generated
    @IsOptional
    @Selector("visitRemoveMemberFromGroupEvent:")
    default void visitRemoveMemberFromGroupEvent(@NotNull CNChangeHistoryRemoveMemberFromGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("visitRemoveSubgroupFromGroupEvent:")
    default void visitRemoveSubgroupFromGroupEvent(@NotNull CNChangeHistoryRemoveSubgroupFromGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("visitUpdateContactEvent:")
    void visitUpdateContactEvent(@NotNull CNChangeHistoryUpdateContactEvent event);

    @Generated
    @IsOptional
    @Selector("visitUpdateGroupEvent:")
    default void visitUpdateGroupEvent(@NotNull CNChangeHistoryUpdateGroupEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }
}