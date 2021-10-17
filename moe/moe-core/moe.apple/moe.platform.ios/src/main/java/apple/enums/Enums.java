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

package apple.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class Enums {
    @Generated public static final int noErr = 0x00000000;
    @Generated public static final int kNilOptions = 0x00000000;
    @Generated public static final int OSUnknownByteOrder = 0x00000000;
    @Generated public static final int OSLittleEndian = 0x00000001;
    @Generated public static final int OSBigEndian = 0x00000002;
    /**
     * Version Release Stage Codes
     */
    @Generated public static final int developStage = 0x00000020;
    /**
     * Version Release Stage Codes
     */
    @Generated public static final int alphaStage = 0x00000040;
    /**
     * Version Release Stage Codes
     */
    @Generated public static final int betaStage = 0x00000060;
    /**
     * Version Release Stage Codes
     */
    @Generated public static final int finalStage = 0x00000080;
    /**
     * "????" QuickTime 3.0: default unknown ResType or OSType
     */
    @Generated public static final int kUnknownType = 0x3F3F3F3F;
    @Generated public static final int normal = 0x00000000;
    @Generated public static final int bold = 0x00000001;
    @Generated public static final int italic = 0x00000002;
    @Generated public static final int underline = 0x00000004;
    @Generated public static final int outline = 0x00000008;
    @Generated public static final int shadow = 0x00000010;
    @Generated public static final int condense = 0x00000020;
    @Generated public static final int extend = 0x00000040;
    @Generated public static final int kVariableLengthArray = 0x00000001;

    @Generated
    private Enums() {
    }

    @Generated public static final long DISPATCH_WALLTIME_NOW = 0xFFFFFFFFFFFFFFFEL;
    /**
     * Internet
     */
    @Generated public static final int kDNSServiceClass_IN = 0x00000001;
    /**
     * for DNSServiceGetAddrInfo()
     */
    @Generated public static final int kDNSServiceProtocol_IPv4 = 0x00000001;
    /**
     * for DNSServiceGetAddrInfo()
     */
    @Generated public static final int kDNSServiceProtocol_IPv6 = 0x00000002;
    /**
     * for DNSServiceNATPortMappingCreate()
     */
    @Generated public static final int kDNSServiceProtocol_UDP = 0x00000010;
    /**
     * for DNSServiceNATPortMappingCreate()
     */
    @Generated public static final int kDNSServiceProtocol_TCP = 0x00000020;
    @Generated public static final int kDNSServiceFlagsMoreComing = 0x00000001;
    /**
     * MoreComing indicates to a callback that at least one more result is
     * queued and will be delivered following immediately after this one.
     * When the MoreComing flag is set, applications should not immediately
     * update their UI, because this can result in a great deal of ugly flickering
     * on the screen, and can waste a great deal of CPU time repeatedly updating
     * the screen with content that is then immediately erased, over and over.
     * Applications should wait until MoreComing is not set, and then
     * update their UI when no more changes are imminent.
     * When MoreComing is not set, that doesn't mean there will be no more
     * answers EVER, just that there are no more answers immediately
     * available right now at this instant. If more answers become available
     * in the future they will be delivered as usual.
     */
    @Generated public static final int kDNSServiceFlagsAutoTrigger = 0x00000001;
    /**
     * Valid for browses using kDNSServiceInterfaceIndexAny.
     * Will auto trigger the browse over AWDL as well once the service is discovered
     * over BLE.
     * This flag is an input value to DNSServiceBrowse(), which is why we can
     * use the same value as kDNSServiceFlagsMoreComing, which is an output flag
     * for various client callbacks.
     */
    @Generated public static final int kDNSServiceFlagsAdd = 0x00000002;
    /**
     * Valid for browses using kDNSServiceInterfaceIndexAny.
     * Will auto trigger the browse over AWDL as well once the service is discovered
     * over BLE.
     * This flag is an input value to DNSServiceBrowse(), which is why we can
     * use the same value as kDNSServiceFlagsMoreComing, which is an output flag
     * for various client callbacks.
     */
    @Generated public static final int kDNSServiceFlagsDefault = 0x00000004;
    /**
     * Flags for domain enumeration and browse/query reply callbacks.
     * "Default" applies only to enumeration and is only valid in
     * conjunction with "Add". An enumeration callback with the "Add"
     * flag NOT set indicates a "Remove", i.e. the domain is no longer
     * valid.
     */
    @Generated public static final int kDNSServiceFlagsNoAutoRename = 0x00000008;
    /**
     * Flag for specifying renaming behavior on name conflict when registering
     * non-shared records. By default, name conflicts are automatically handled
     * by renaming the service. NoAutoRename overrides this behavior - with this
     * flag set, name conflicts will result in a callback. The NoAutorename flag
     * is only valid if a name is explicitly specified when registering a service
     * (i.e. the default name is not used.)
     */
    @Generated public static final int kDNSServiceFlagsShared = 0x00000010;
    /**
     * Flag for specifying renaming behavior on name conflict when registering
     * non-shared records. By default, name conflicts are automatically handled
     * by renaming the service. NoAutoRename overrides this behavior - with this
     * flag set, name conflicts will result in a callback. The NoAutorename flag
     * is only valid if a name is explicitly specified when registering a service
     * (i.e. the default name is not used.)
     */
    @Generated public static final int kDNSServiceFlagsUnique = 0x00000020;
    /**
     * Flag for registering individual records on a connected
     * DNSServiceRef. Shared indicates that there may be multiple records
     * with this name on the network (e.g. PTR records). Unique indicates that the
     * record's name is to be unique on the network (e.g. SRV records).
     */
    @Generated public static final int kDNSServiceFlagsBrowseDomains = 0x00000040;
    /**
     * Flag for registering individual records on a connected
     * DNSServiceRef. Shared indicates that there may be multiple records
     * with this name on the network (e.g. PTR records). Unique indicates that the
     * record's name is to be unique on the network (e.g. SRV records).
     */
    @Generated public static final int kDNSServiceFlagsRegistrationDomains = 0x00000080;
    /**
     * Flags for specifying domain enumeration type in DNSServiceEnumerateDomains.
     * BrowseDomains enumerates domains recommended for browsing, RegistrationDomains
     * enumerates domains recommended for registration.
     */
    @Generated public static final int kDNSServiceFlagsLongLivedQuery = 0x00000100;
    /**
     * Flag for creating a long-lived unicast query for the DNSServiceQueryRecord call.
     */
    @Generated public static final int kDNSServiceFlagsAllowRemoteQuery = 0x00000200;
    /**
     * Flag for creating a record for which we will answer remote queries
     * (queries from hosts more than one hop away; hosts not directly connected to the local link).
     */
    @Generated public static final int kDNSServiceFlagsForceMulticast = 0x00000400;
    /**
     * This flag is deprecated.
     */
    @Generated public static final int kDNSServiceFlagsForce = 0x00000800;
    @Generated public static final int kDNSServiceFlagsKnownUnique = 0x00000800;
    /**
     * Client guarantees that record names are unique, so we can skip sending out initial
     * probe messages.  Standard name conflict resolution is still done if a conflict is discovered.
     */
    @Generated public static final int kDNSServiceFlagsReturnIntermediates = 0x00001000;
    /**
     * Flag for returning intermediate results.
     * For example, if a query results in an authoritative NXDomain (name does not exist)
     * then that result is returned to the client. However the query is not implicitly
     * cancelled -- it remains active and if the answer subsequently changes
     * (e.g. because a VPN tunnel is subsequently established) then that positive
     * result will still be returned to the client.
     * Similarly, if a query results in a CNAME record, then in addition to following
     * the CNAME referral, the intermediate CNAME result is also returned to the client.
     * When this flag is not set, NXDomain errors are not returned, and CNAME records
     * are followed silently without informing the client of the intermediate steps.
     * (In earlier builds this flag was briefly calledkDNSServiceFlagsReturnCNAME)
     */
    @Generated public static final int kDNSServiceFlagsShareConnection = 0x00004000;
    /**
     * For efficiency, clients that perform many concurrent operations may want to use a
     * single Unix Domain Socket connection with the background daemon, instead of having a
     * separate connection for each independent operation. To use this mode, clients first
     * call DNSServiceCreateConnection(&SharedRef) to initialize the main DNSServiceRef.
     * For each subsequent operation that is to share that same connection, the client copies
     * the SharedRef, and then passes the address of that copy, setting the ShareConnection flag
     * to tell the library that this DNSServiceRef is not a typical uninitialized DNSServiceRef;
     * it's a copy of an existing DNSServiceRef whose connection information should be reused.
     * <p>
     * For example:
     * <p>
     * DNSServiceErrorType error;
     * DNSServiceRef SharedRef;
     * error = DNSServiceCreateConnection(&SharedRef);
     * if (error) ...
     * DNSServiceRef BrowseRef = SharedRef;  // Important: COPY the primary DNSServiceRef first...
     * error = DNSServiceBrowse(&BrowseRef, kDNSServiceFlagsShareConnection, ...); // then use the copy
     * if (error) ...
     * ...
     * DNSServiceRefDeallocate(BrowseRef); // Terminate the browse operation
     * DNSServiceRefDeallocate(SharedRef); // Terminate the shared connection
     * <p>
     * Notes:
     * <p>
     * 1. Collective kDNSServiceFlagsMoreComing flag
     * When callbacks are invoked using a shared DNSServiceRef, the
     * kDNSServiceFlagsMoreComing flag applies collectively to *all* active
     * operations sharing the same parent DNSServiceRef. If the MoreComing flag is
     * set it means that there are more results queued on this parent DNSServiceRef,
     * but not necessarily more results for this particular callback function.
     * The implication of this for client programmers is that when a callback
     * is invoked with the MoreComing flag set, the code should update its
     * internal data structures with the new result, and set a variable indicating
     * that its UI needs to be updated. Then, later when a callback is eventually
     * invoked with the MoreComing flag not set, the code should update *all*
     * stale UI elements related to that shared parent DNSServiceRef that need
     * updating, not just the UI elements related to the particular callback
     * that happened to be the last one to be invoked.
     * <p>
     * 2. Canceling operations and kDNSServiceFlagsMoreComing
     * Whenever you cancel any operation for which you had deferred UI updates
     * waiting because of a kDNSServiceFlagsMoreComing flag, you should perform
     * those deferred UI updates. This is because, after cancelling the operation,
     * you can no longer wait for a callback *without* MoreComing set, to tell
     * you do perform your deferred UI updates (the operation has been canceled,
     * so there will be no more callbacks). An implication of the collective
     * kDNSServiceFlagsMoreComing flag for shared connections is that this
     * guideline applies more broadly -- any time you cancel an operation on
     * a shared connection, you should perform all deferred UI updates for all
     * operations sharing that connection. This is because the MoreComing flag
     * might have been referring to events coming for the operation you canceled,
     * which will now not be coming because the operation has been canceled.
     * <p>
     * 3. Only share DNSServiceRef's created with DNSServiceCreateConnection
     * Calling DNSServiceCreateConnection(&ref) creates a special shareable DNSServiceRef.
     * DNSServiceRef's created by other calls like DNSServiceBrowse() or DNSServiceResolve()
     * cannot be shared by copying them and using kDNSServiceFlagsShareConnection.
     * <p>
     * 4. Don't Double-Deallocate
     * Calling DNSServiceRefDeallocate(OpRef) for a particular operation's DNSServiceRef terminates
     * just that operation. Calling DNSServiceRefDeallocate(SharedRef) for the main shared DNSServiceRef
     * (the parent DNSServiceRef, originally created by DNSServiceCreateConnection(&SharedRef))
     * automatically terminates the shared connection *and* all operations that were still using it.
     * After doing this, DO NOT then attempt to deallocate any remaining subordinate DNSServiceRef's.
     * The memory used by those subordinate DNSServiceRef's has already been freed, so any attempt
     * to do a DNSServiceRefDeallocate (or any other operation) on them will result in accesses
     * to freed memory, leading to crashes or other equally undesirable results.
     * You can deallocate individual operations first and then deallocate the parent DNSServiceRef last,
     * but if you deallocate the parent DNSServiceRef first, then all of the subordinate DNSServiceRef's
     * are implicitly deallocated, and explicitly deallocating them a second time will lead to crashes.
     * <p>
     * 5. Thread Safety
     * The dns_sd.h API does not presuppose any particular threading model, and consequently
     * does no locking internally (which would require linking with a specific threading library).
     * If the client concurrently, from multiple threads (or contexts), calls API routines using
     * the same DNSServiceRef, it is the client's responsibility to provide mutual exclusion for
     * that DNSServiceRef.
     * <p>
     * For example, use of DNSServiceRefDeallocate requires caution. A common mistake is as follows:
     * Thread B calls DNSServiceRefDeallocate to deallocate sdRef while Thread A is processing events
     * using sdRef. Doing this will lead to intermittent crashes on thread A if the sdRef is used after
     * it was deallocated.
     * <p>
     * A telltale sign of this crash type is to see DNSServiceProcessResult on the stack preceding the
     * actual crash location.
     * <p>
     * To state this more explicitly, mDNSResponder does not queue DNSServiceRefDeallocate so
     * that it occurs discretely before or after an event is handled.
     */
    @Generated public static final int kDNSServiceFlagsSuppressUnusable = 0x00008000;
    /**
     * This flag is meaningful only in DNSServiceQueryRecord which suppresses unusable queries on the
     * wire. If "hostname" is a wide-area unicast DNS hostname (i.e. not a ".local." name)
     * but this host has no routable IPv6 address, then the call will not try to look up IPv6 addresses
     * for "hostname", since any addresses it found would be unlikely to be of any use anyway. Similarly,
     * if this host has no routable IPv4 address, the call will not try to look up IPv4 addresses for
     * "hostname".
     */
    @Generated public static final int kDNSServiceFlagsTimeout = 0x00010000;
    /**
     * When kDNServiceFlagsTimeout is passed to DNSServiceQueryRecord or DNSServiceGetAddrInfo, the query is
     * stopped after a certain number of seconds have elapsed. The time at which the query will be stopped
     * is determined by the system and cannot be configured by the user. The query will be stopped irrespective
     * of whether a response was given earlier or not. When the query is stopped, the callback will be called
     * with an error code of kDNSServiceErr_Timeout and a NULL sockaddr will be returned for DNSServiceGetAddrInfo
     * and zero length rdata will be returned for DNSServiceQueryRecord.
     */
    @Generated public static final int kDNSServiceFlagsIncludeP2P = 0x00020000;
    /**
     * Include P2P interfaces when kDNSServiceInterfaceIndexAny is specified.
     * By default, specifying kDNSServiceInterfaceIndexAny does not include P2P interfaces.
     */
    @Generated public static final int kDNSServiceFlagsWakeOnResolve = 0x00040000;
    /**
     * This flag is meaningful only in DNSServiceResolve. When set, it tries to send a magic packet
     * to wake up the client.
     */
    @Generated public static final int kDNSServiceFlagsBackgroundTrafficClass = 0x00080000;
    /**
     * This flag is meaningful for Unicast DNS queries. When set, it uses the background traffic
     * class for packets that service the request.
     */
    @Generated public static final int kDNSServiceFlagsIncludeAWDL = 0x00100000;
    /**
     * Perform DNSSEC validation on the client request when kDNSServiceFlagsEnableDNSSEC is specified
     * Since the client API has not been finalized, we will use it as a temporary flag to turn on the DNSSEC validation.
     */
    @Generated public static final int kDNSServiceFlagsValidate = 0x00200000;
    /**
     * This flag is meaningful in DNSServiceGetAddrInfo and DNSServiceQueryRecord. This is the ONLY flag to be valid
     * as an input to the APIs and also an output through the callbacks in the APIs.
     * <p>
     * When this flag is passed to DNSServiceQueryRecord and DNSServiceGetAddrInfo to resolve unicast names,
     * the response  will be validated using DNSSEC. The validation results are delivered using the flags field in
     * the callback and kDNSServiceFlagsValidate is marked in the flags to indicate that DNSSEC status is also available.
     * When the callback is called to deliver the query results, the validation results may or may not be available.
     * If it is not delivered along with the results, the validation status is delivered when the validation completes.
     * <p>
     * When the validation results are delivered in the callback, it is indicated by marking the flags with
     * kDNSServiceFlagsValidate and kDNSServiceFlagsAdd along with the DNSSEC status flags (described below) and a NULL
     * sockaddr will be returned for DNSServiceGetAddrInfo and zero length rdata will be returned for DNSServiceQueryRecord.
     * DNSSEC validation results are for the whole RRSet and not just individual records delivered in the callback. When
     * kDNSServiceFlagsAdd is not set in the flags, applications should implicitly assume that the DNSSEC status of the
     * RRSet that has been delivered up until that point is not valid anymore, till another callback is called with
     * kDNSServiceFlagsAdd and kDNSServiceFlagsValidate.
     * <p>
     * The following four flags indicate the status of the DNSSEC validation and marked in the flags field of the callback.
     * When any of the four flags is set, kDNSServiceFlagsValidate will also be set. To check the validation status, the
     * other applicable output flags should be masked.
     */
    @Generated public static final int kDNSServiceFlagsSecure = 0x00200010;
    /**
     * The response has been validated by verifying all the signatures in the response and was able to
     * build a successful authentication chain starting from a known trust anchor.
     */
    @Generated public static final int kDNSServiceFlagsInsecure = 0x00200020;
    /**
     * A chain of trust cannot be built starting from a known trust anchor to the response.
     */
    @Generated public static final int kDNSServiceFlagsBogus = 0x00200040;
    /**
     * If the response cannot be verified to be secure due to expired signatures, missing signatures etc.,
     * then the results are considered to be bogus.
     */
    @Generated public static final int kDNSServiceFlagsIndeterminate = 0x00200080;
    /**
     * There is no valid trust anchor that can be used to determine whether a response is secure or not.
     */
    @Generated public static final int kDNSServiceFlagsUnicastResponse = 0x00400000;
    /**
     * Request unicast response to query.
     */
    @Generated public static final int kDNSServiceFlagsValidateOptional = 0x00800000;
    /**
     * This flag is identical to kDNSServiceFlagsValidate except for the case where the response
     * cannot be validated. If this flag is set in DNSServiceQueryRecord or DNSServiceGetAddrInfo,
     * the DNSSEC records will be requested for validation. If they cannot be received for some reason
     * during the validation (e.g., zone is not signed, zone is signed but cannot be traced back to
     * root, recursive server does not understand DNSSEC etc.), then this will fallback to the default
     * behavior where the validation will not be performed and no DNSSEC results will be provided.
     * <p>
     * If the zone is signed and there is a valid path to a known trust anchor configured in the system
     * and the application requires DNSSEC validation irrespective of the DNSSEC awareness in the current
     * network, then this option MUST not be used. This is only intended to be used during the transition
     * period where the different nodes participating in the DNS resolution may not understand DNSSEC or
     * managed properly (e.g. missing DS record) but still want to be able to resolve DNS successfully.
     */
    @Generated public static final int kDNSServiceFlagsWakeOnlyService = 0x01000000;
    /**
     * This flag is meaningful only in DNSServiceRegister. When set, the service will not be registered
     * with sleep proxy server during sleep.
     */
    @Generated public static final int kDNSServiceFlagsThresholdOne = 0x02000000;
    /**
     * This flag is meaningful only in DNSServiceRegister. When set, the service will not be registered
     * with sleep proxy server during sleep.
     */
    @Generated public static final int kDNSServiceFlagsThresholdFinder = 0x04000000;
    /**
     * This flag is meaningful only in DNSServiceRegister. When set, the service will not be registered
     * with sleep proxy server during sleep.
     */
    @Generated public static final int kDNSServiceFlagsThresholdReached = 0x02000000;
    /**
     * kDNSServiceFlagsThresholdOne is used only with DNSServiceBrowse, and is not meaningful
     * with any other API call. This flag limits the number of retries that are performed when
     * doing mDNS service discovery. As soon as a single answer is received, retransmission
     * is discontinued. This allows the caller to determine whether or not a particular service
     * is present on the network in as efficient a way as possible. As answers expire from the
     * cache or are explicitly removed as a consequence of the service being discontinued, if
     * the number of still-valid answers reaches zero, mDNSResponder will resume periodic querying
     * on the network until at least one valid answer is present. Because this flag only controls
     * retransmission, when more than one service of the type being browsed is present on the
     * network, it is quite likely that more than one answer will be delivered to the callback.
     * <p>
     * kDNSServiceFlagsThresholdFinder is used only in DNSServiceBrowse, and is not meaningful
     * in other API calls. When set, this flag limits the number of retries that are performed
     * when doing mDNS service discovery, similar to kDNSServiceFlagsThresholdOne. The difference
     * is that the threshold here is higher: retransmissions will continue until some system-
     * dependent number of answers are present, or the retransmission process is complete.
     * Because the number of answers that ends retransmission varies, developers should not
     * depend on there being some specific threshold; rather, this flag can be used in cases
     * where it is preferred to give the user a choice, but where once a small number of
     * such services are discovered, retransmission is discontinued.
     * <p>
     * When kDNSServiceFlagsThresholdReached is set in the client callback add or remove event,
     * it indicates that the browse answer threshold has been reached and no
     * browse requests will be generated on the network until the number of answers falls
     * below the threshold value.  Add and remove events can still occur based
     * on incoming Bonjour traffic observed by the system.
     * The set of services return to the client is not guaranteed to represent the
     * entire set of services present on the network once the threshold has been reached.
     * <p>
     * Note, while kDNSServiceFlagsThresholdReached and kDNSServiceFlagsThresholdOne
     * have the same value, there  isn't a conflict because kDNSServiceFlagsThresholdReached
     * is only set in the callbacks and kDNSServiceFlagsThresholdOne is only set on
     * input to a DNSServiceBrowse call.
     */
    @Generated public static final int kDNSServiceFlagsPrivateOne = 0x00002000;
    /**
     * This flag is private and should not be used.
     */
    @Generated public static final int kDNSServiceFlagsPrivateTwo = 0x08000000;
    /**
     * This flag is private and should not be used.
     */
    @Generated public static final int kDNSServiceFlagsPrivateThree = 0x10000000;
    /**
     * This flag is private and should not be used.
     */
    @Generated public static final int kDNSServiceFlagsPrivateFour = 0x20000000;
    /**
     * This flag is private and should not be used.
     */
    @Generated public static final int kDNSServiceFlagsPrivateFive = 0x40000000;
    /**
     * This flag is private and should not be used.
     */
    @Generated public static final int kDNSServiceFlagAnsweredFromCache = 0x40000000;
    /**
     * When kDNSServiceFlagAnsweredFromCache is passed back in the flags parameter of DNSServiceQueryRecordReply or DNSServiceGetAddrInfoReply,
     * an answer will have this flag set if it was answered from the cache.
     */
    @Generated public static final int kDNSServiceFlagsAllowExpiredAnswers = 0x80000000;
    /**
     * When kDNSServiceFlagsAllowExpiredAnswers is passed to DNSServiceQueryRecord or DNSServiceGetAddrInfo,
     * if there are matching expired records still in the cache, then they are immediately returned to the
     * client, and in parallel a network query for that name is issued. All returned records from the query will
     * remain in the cache after expiration.
     */
    @Generated public static final int kDNSServiceFlagsExpiredAnswer = 0x80000000;
    /**
     * Host address.
     */
    @Generated public static final int kDNSServiceType_A = 0x00000001;
    /**
     * Authoritative server.
     */
    @Generated public static final int kDNSServiceType_NS = 0x00000002;
    /**
     * Mail destination.
     */
    @Generated public static final int kDNSServiceType_MD = 0x00000003;
    /**
     * Mail forwarder.
     */
    @Generated public static final int kDNSServiceType_MF = 0x00000004;
    /**
     * Canonical name.
     */
    @Generated public static final int kDNSServiceType_CNAME = 0x00000005;
    /**
     * Start of authority zone.
     */
    @Generated public static final int kDNSServiceType_SOA = 0x00000006;
    /**
     * Mailbox domain name.
     */
    @Generated public static final int kDNSServiceType_MB = 0x00000007;
    /**
     * Mail group member.
     */
    @Generated public static final int kDNSServiceType_MG = 0x00000008;
    /**
     * Mail rename name.
     */
    @Generated public static final int kDNSServiceType_MR = 0x00000009;
    /**
     * Null resource record.
     */
    @Generated public static final int kDNSServiceType_NULL = 0x0000000A;
    /**
     * Well known service.
     */
    @Generated public static final int kDNSServiceType_WKS = 0x0000000B;
    /**
     * Domain name pointer.
     */
    @Generated public static final int kDNSServiceType_PTR = 0x0000000C;
    /**
     * Host information.
     */
    @Generated public static final int kDNSServiceType_HINFO = 0x0000000D;
    /**
     * Mailbox information.
     */
    @Generated public static final int kDNSServiceType_MINFO = 0x0000000E;
    /**
     * Mail routing information.
     */
    @Generated public static final int kDNSServiceType_MX = 0x0000000F;
    /**
     * One or more text strings (NOT "zero or more...").
     */
    @Generated public static final int kDNSServiceType_TXT = 0x00000010;
    /**
     * Responsible person.
     */
    @Generated public static final int kDNSServiceType_RP = 0x00000011;
    /**
     * AFS cell database.
     */
    @Generated public static final int kDNSServiceType_AFSDB = 0x00000012;
    /**
     * X_25 calling address.
     */
    @Generated public static final int kDNSServiceType_X25 = 0x00000013;
    /**
     * ISDN calling address.
     */
    @Generated public static final int kDNSServiceType_ISDN = 0x00000014;
    /**
     * Router.
     */
    @Generated public static final int kDNSServiceType_RT = 0x00000015;
    /**
     * NSAP address.
     */
    @Generated public static final int kDNSServiceType_NSAP = 0x00000016;
    /**
     * Reverse NSAP lookup (deprecated).
     */
    @Generated public static final int kDNSServiceType_NSAP_PTR = 0x00000017;
    /**
     * Security signature.
     */
    @Generated public static final int kDNSServiceType_SIG = 0x00000018;
    /**
     * Security key.
     */
    @Generated public static final int kDNSServiceType_KEY = 0x00000019;
    /**
     * X.400 mail mapping.
     */
    @Generated public static final int kDNSServiceType_PX = 0x0000001A;
    /**
     * Geographical position (withdrawn).
     */
    @Generated public static final int kDNSServiceType_GPOS = 0x0000001B;
    /**
     * IPv6 Address.
     */
    @Generated public static final int kDNSServiceType_AAAA = 0x0000001C;
    /**
     * Location Information.
     */
    @Generated public static final int kDNSServiceType_LOC = 0x0000001D;
    /**
     * Next domain (security).
     */
    @Generated public static final int kDNSServiceType_NXT = 0x0000001E;
    /**
     * Endpoint identifier.
     */
    @Generated public static final int kDNSServiceType_EID = 0x0000001F;
    /**
     * Nimrod Locator.
     */
    @Generated public static final int kDNSServiceType_NIMLOC = 0x00000020;
    /**
     * Server Selection.
     */
    @Generated public static final int kDNSServiceType_SRV = 0x00000021;
    /**
     * ATM Address
     */
    @Generated public static final int kDNSServiceType_ATMA = 0x00000022;
    /**
     * Naming Authority PoinTeR
     */
    @Generated public static final int kDNSServiceType_NAPTR = 0x00000023;
    /**
     * Key Exchange
     */
    @Generated public static final int kDNSServiceType_KX = 0x00000024;
    /**
     * Certification record
     */
    @Generated public static final int kDNSServiceType_CERT = 0x00000025;
    /**
     * IPv6 Address (deprecated)
     */
    @Generated public static final int kDNSServiceType_A6 = 0x00000026;
    /**
     * Non-terminal DNAME (for IPv6)
     */
    @Generated public static final int kDNSServiceType_DNAME = 0x00000027;
    /**
     * Kitchen sink (experimental)
     */
    @Generated public static final int kDNSServiceType_SINK = 0x00000028;
    /**
     * EDNS0 option (meta-RR)
     */
    @Generated public static final int kDNSServiceType_OPT = 0x00000029;
    /**
     * Address Prefix List
     */
    @Generated public static final int kDNSServiceType_APL = 0x0000002A;
    /**
     * Delegation Signer
     */
    @Generated public static final int kDNSServiceType_DS = 0x0000002B;
    /**
     * SSH Key Fingerprint
     */
    @Generated public static final int kDNSServiceType_SSHFP = 0x0000002C;
    /**
     * IPSECKEY
     */
    @Generated public static final int kDNSServiceType_IPSECKEY = 0x0000002D;
    /**
     * RRSIG
     */
    @Generated public static final int kDNSServiceType_RRSIG = 0x0000002E;
    /**
     * Denial of Existence
     */
    @Generated public static final int kDNSServiceType_NSEC = 0x0000002F;
    /**
     * DNSKEY
     */
    @Generated public static final int kDNSServiceType_DNSKEY = 0x00000030;
    /**
     * DHCP Client Identifier
     */
    @Generated public static final int kDNSServiceType_DHCID = 0x00000031;
    /**
     * Hashed Authenticated Denial of Existence
     */
    @Generated public static final int kDNSServiceType_NSEC3 = 0x00000032;
    /**
     * Hashed Authenticated Denial of Existence
     */
    @Generated public static final int kDNSServiceType_NSEC3PARAM = 0x00000033;
    /**
     * Host Identity Protocol
     */
    @Generated public static final int kDNSServiceType_HIP = 0x00000037;
    /**
     * Sender Policy Framework for E-Mail
     */
    @Generated public static final int kDNSServiceType_SPF = 0x00000063;
    /**
     * IANA-Reserved
     */
    @Generated public static final int kDNSServiceType_UINFO = 0x00000064;
    /**
     * IANA-Reserved
     */
    @Generated public static final int kDNSServiceType_UID = 0x00000065;
    /**
     * IANA-Reserved
     */
    @Generated public static final int kDNSServiceType_GID = 0x00000066;
    /**
     * IANA-Reserved
     */
    @Generated public static final int kDNSServiceType_UNSPEC = 0x00000067;
    /**
     * Transaction key
     */
    @Generated public static final int kDNSServiceType_TKEY = 0x000000F9;
    /**
     * Transaction signature.
     */
    @Generated public static final int kDNSServiceType_TSIG = 0x000000FA;
    /**
     * Incremental zone transfer.
     */
    @Generated public static final int kDNSServiceType_IXFR = 0x000000FB;
    /**
     * Transfer zone of authority.
     */
    @Generated public static final int kDNSServiceType_AXFR = 0x000000FC;
    /**
     * Transfer mailbox records.
     */
    @Generated public static final int kDNSServiceType_MAILB = 0x000000FD;
    /**
     * Transfer mail agent records.
     */
    @Generated public static final int kDNSServiceType_MAILA = 0x000000FE;
    /**
     * Wildcard match.
     */
    @Generated public static final int kDNSServiceType_ANY = 0x000000FF;
    @Generated public static final int kDNSServiceErr_NoError = 0x00000000;
    /**
     * 0xFFFE FFFF
     */
    @Generated public static final int kDNSServiceErr_Unknown = 0xFFFEFFFF;
    @Generated public static final int kDNSServiceErr_NoSuchName = 0xFFFEFFFE;
    @Generated public static final int kDNSServiceErr_NoMemory = 0xFFFEFFFD;
    @Generated public static final int kDNSServiceErr_BadParam = 0xFFFEFFFC;
    @Generated public static final int kDNSServiceErr_BadReference = 0xFFFEFFFB;
    @Generated public static final int kDNSServiceErr_BadState = 0xFFFEFFFA;
    @Generated public static final int kDNSServiceErr_BadFlags = 0xFFFEFFF9;
    @Generated public static final int kDNSServiceErr_Unsupported = 0xFFFEFFF8;
    @Generated public static final int kDNSServiceErr_NotInitialized = 0xFFFEFFF7;
    @Generated public static final int kDNSServiceErr_AlreadyRegistered = 0xFFFEFFF5;
    @Generated public static final int kDNSServiceErr_NameConflict = 0xFFFEFFF4;
    @Generated public static final int kDNSServiceErr_Invalid = 0xFFFEFFF3;
    @Generated public static final int kDNSServiceErr_Firewall = 0xFFFEFFF2;
    /**
     * client library incompatible with daemon
     */
    @Generated public static final int kDNSServiceErr_Incompatible = 0xFFFEFFF1;
    @Generated public static final int kDNSServiceErr_BadInterfaceIndex = 0xFFFEFFF0;
    @Generated public static final int kDNSServiceErr_Refused = 0xFFFEFFEF;
    @Generated public static final int kDNSServiceErr_NoSuchRecord = 0xFFFEFFEE;
    @Generated public static final int kDNSServiceErr_NoAuth = 0xFFFEFFED;
    @Generated public static final int kDNSServiceErr_NoSuchKey = 0xFFFEFFEC;
    @Generated public static final int kDNSServiceErr_NATTraversal = 0xFFFEFFEB;
    @Generated public static final int kDNSServiceErr_DoubleNAT = 0xFFFEFFEA;
    /**
     * Codes up to here existed in Tiger
     */
    @Generated public static final int kDNSServiceErr_BadTime = 0xFFFEFFE9;
    @Generated public static final int kDNSServiceErr_BadSig = 0xFFFEFFE8;
    @Generated public static final int kDNSServiceErr_BadKey = 0xFFFEFFE7;
    @Generated public static final int kDNSServiceErr_Transient = 0xFFFEFFE6;
    /**
     * Background daemon not running
     */
    @Generated public static final int kDNSServiceErr_ServiceNotRunning = 0xFFFEFFE5;
    /**
     * NAT doesn't support PCP, NAT-PMP or UPnP
     */
    @Generated public static final int kDNSServiceErr_NATPortMappingUnsupported = 0xFFFEFFE4;
    /**
     * NAT supports PCP, NAT-PMP or UPnP, but it's disabled by the administrator
     */
    @Generated public static final int kDNSServiceErr_NATPortMappingDisabled = 0xFFFEFFE3;
    /**
     * No router currently configured (probably no network connectivity)
     */
    @Generated public static final int kDNSServiceErr_NoRouter = 0xFFFEFFE2;
    @Generated public static final int kDNSServiceErr_PollingMode = 0xFFFEFFE1;
    @Generated public static final int kDNSServiceErr_Timeout = 0xFFFEFFE0;
    /**
     * Connection to daemon returned a SO_ISDEFUNCT error result
     */
    @Generated public static final int kDNSServiceErr_DefunctConnection = 0xFFFEFFDF;
    @Generated public static final int kDNSServiceErr_PolicyDenied = 0xFFFEFFDE;
    /**
     * Include AWDL interface when kDNSServiceInterfaceIndexAny is specified.
     */
    @Generated public static final int kDNSServiceFlagsEnableDNSSEC = 0x00200000;
    /**
     * Service Binding.
     */
    @Generated public static final int kDNSServiceType_SVCB = 0x00000040;
    /**
     * HTTPS Service Binding.
     */
    @Generated public static final int kDNSServiceType_HTTPS = 0x00000041;
    @Generated public static final int kDNSServiceErr_NotPermitted = 0xFFFEFFDD;
}
