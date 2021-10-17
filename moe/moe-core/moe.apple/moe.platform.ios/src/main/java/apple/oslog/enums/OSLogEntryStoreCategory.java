package apple.oslog.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] OSLogEntryStoreCategory
 * <p>
 * A classification of how the entry was to be stored and
 * rotated at the point when it was created.
 * <p>
 * The unified logging system keeps entries in one of two
 * places: a ring buffer in memory and a persisted data store.
 * Entries are rotated out of both places to free up resources.
 * This rotation is not strictly aligned with entries'
 * timestamps --- in particular, they can be rotated in bulk,
 * and they are rotated according to a series of heuristics that
 * take into account space, time, and how the entries were
 * classified.
 * <p>
 * [@constant] OSLogEntryStoreCategoryMetadata
 * This entry was generated as information about the other
 * entries or about the sequence of entries as a whole.
 * <p>
 * [@constant] OSLogEntryStoreCategoryShortTerm
 * This entry was not intended to be long-lived and was captured
 * in the ring buffer.
 * <p>
 * [@constant] OSLogEntryStoreCategoryLongTermAuto
 * The entry was intended to be persisted in a filesystem-backed
 * data store and kept mainly based on the amount of space
 * available.
 * <p>
 * [@constant] OSLogEntryStoreCategoryLongTerm1
 * [@constant] OSLogEntryStoreCategoryLongTerm3
 * [@constant] OSLogEntryStoreCategoryLongTerm7
 * [@constant] OSLogEntryStoreCategoryLongTerm14
 * [@constant] OSLogEntryStoreCategoryLongTerm30
 * The entry was tagged with a hint indicating that the system
 * should try to preserve it for a certain amount of time. It
 * was persisted in the filesystem-backed data store, and
 * rotation of these entries was based on both time and space
 * considerations.
 */
@Generated
public final class OSLogEntryStoreCategory {
    @Generated
    private OSLogEntryStoreCategory() {
    }

    @Generated @NInt public static final long Undefined = 0x0000000000000000L;
    @Generated @NInt public static final long Metadata = 0x0000000000000001L;
    @Generated @NInt public static final long ShortTerm = 0x0000000000000002L;
    @Generated @NInt public static final long LongTermAuto = 0x0000000000000003L;
    @Generated @NInt public static final long LongTerm1 = 0x0000000000000004L;
    @Generated @NInt public static final long LongTerm3 = 0x0000000000000005L;
    @Generated @NInt public static final long LongTerm7 = 0x0000000000000006L;
    @Generated @NInt public static final long LongTerm14 = 0x0000000000000007L;
    @Generated @NInt public static final long LongTerm30 = 0x0000000000000008L;
}
