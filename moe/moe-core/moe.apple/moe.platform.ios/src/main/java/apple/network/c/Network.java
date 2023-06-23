package apple.network.c;

import apple.NSObject;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.struct.sockaddr;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.general.ptr.NUIntPtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("Network")
@Runtime(CRuntime.class)
public final class Network {
    static {
        NatJ.register();
    }

    @Generated
    private Network() {
    }

    /**
     * [@function] nw_txt_record_create_with_bytes
     * 
     * Create a new TXT record object from a buffer of bytes. If the buffer
     * follows the key-value pair format as defined in RFC 1464, the TXT record
     * object will be created as a dictionary. Otherwise, it is created as a
     * TXT record buffer.
     * 
     * @param txt_bytes
     *                  The pointer to the buffer.
     * 
     * @param txt_len
     *                  The length of the buffer.
     * 
     * @return
     *         An instantiated TXT record object.
     *         Callers are responsible for deallocating using nw_release(obj) or
     *         [obj release]. These objects support ARC.
     *         Returns NULL on failure. Fails if txt_bytes is NULL or if txt_len is 0.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_txt_record_create_with_bytes(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String txt_bytes,
            @NUInt long txt_len);

    /**
     * [@function] nw_txt_record_create_dictionary
     * 
     * Create an empty TXT record dictionary.
     * 
     * @return
     *         An empty TXT record dictionary.
     *         Callers are responsible for deallocating using nw_release(obj) or
     *         [obj release]. These objects support ARC.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_txt_record_create_dictionary();

    /**
     * [@function] nw_txt_record_copy
     * 
     * Create a deep copy of an existing TXT record object.
     * 
     * @param txt_record
     *                   The TXT record object to be copied.
     * 
     * @return
     *         A deep copy of the TXT record object.
     *         Callers are responsible for deallocating using nw_release(obj) or
     *         [obj release]. These objects support ARC.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_txt_record_copy(@Nullable NSObject txt_record);

    /**
     * [@function] nw_txt_record_find_key
     * 
     * Find a key-value pair in the TXT record object.
     * 
     * @param txt_record
     *                   The TXT record object.
     * 
     * @param key
     *                   The key of the key-value pair.
     * 
     * @return
     *         An nw_txt_record_find_key_t representing the type of the key-value pair found.
     *         The key may be invalid, may not exist, have no associated value, have an
     *         empty associated value, or have a non-empty associated value.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native int nw_txt_record_find_key(@NotNull NSObject txt_record,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

    /**
     * [@function] nw_txt_record_access_key
     * 
     * Access a value in the TXT record object with its key. Attempts to access
     * or modify the TXT record object from within the block are prohibited.
     * 
     * @param txt_record
     *                     The TXT record object.
     * 
     * @param access_value
     *                     The block that will be used to access the value of the given key.
     * 
     * @return
     *         The return value of the access_value block. This is an arbitrary return
     *         value defined by the user.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_txt_record_access_key(@NotNull NSObject txt_record,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @NotNull @ObjCBlock(name = "call_nw_txt_record_access_key") Block_nw_txt_record_access_key access_value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_txt_record_access_key {
        @Generated
        boolean call_nw_txt_record_access_key(
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String key,
                int found,
                @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String value,
                @NUInt long value_len);
    }

    /**
     * [@function] nw_txt_record_set_key
     * 
     * Set a key-value pair on the TXT record object.
     * 
     * @param txt_record
     *                   The TXT record object.
     * 
     * @param key
     *                   The key that will be inserted. If the key already exists in the TXT
     *                   record object, the existing key-value pair will be replaced.
     * 
     * @param value
     *                   The value that will be inserted. If value is set to NULL, then the key
     *                   will be inserted with no value.
     * 
     * @param value_len
     *                   The length of the value will be inserted. If value is set to zero, then the
     *                   key will be inserted with a zero-length value. Inserting a NULL value
     *                   with a non-zero length will fail.
     * 
     * @return
     *         A boolean indicating if the key-value pair was inserted successfully.
     *         Returns false if the key is invalid. A key is invalid if it is an empty
     *         string, contains non-ASCII characters, or has length greater than
     *         UINT8_MAX.
     * 
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_txt_record_set_key(@NotNull NSObject txt_record,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value,
            @NUInt long value_len);

    /**
     * [@function] nw_txt_record_remove_key
     * 
     * Removes a key-value pair in the TXT record object given its key.
     * 
     * @param txt_record
     *                   The TXT record object.
     * 
     * @param key
     *                   The key corresponding to the key-value pair.
     * 
     * @return
     *         A boolean indicating if the key-value pair specified by the given key
     *         was removed. Returns false if the key is invalid or not present in the
     *         TXT dictionary. A key is invalid if it is an empty string, contains
     *         non-ASCII characters, or has length greater than UINT8_MAX.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_txt_record_remove_key(@NotNull NSObject txt_record,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

    /**
     * [@function] nw_txt_record_get_key_count
     * 
     * Count the number of keys in the TXT record object.
     * 
     * @param txt_record
     *                   A TXT record object.
     * 
     * @return
     *         The number of keys in the TXT record object.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long nw_txt_record_get_key_count(@Nullable NSObject txt_record);

    /**
     * [@function] nw_txt_record_access_bytes
     * 
     * Access the raw TXT record inside the TXT record object.
     * 
     * @param txt_record
     *                     The TXT record object.
     * 
     * @param access_bytes
     *                     The block that will be used to access the raw TXT record inside the TXT
     *                     record object.
     * 
     * @return
     *         The return value of the access_bytes block, which is defined by the user.
     *         For example, the user may want to return a boolean indicating if the
     *         operation succeeds.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_txt_record_access_bytes(@NotNull NSObject txt_record,
            @NotNull @ObjCBlock(name = "call_nw_txt_record_access_bytes") Block_nw_txt_record_access_bytes access_bytes);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_txt_record_access_bytes {
        @Generated
        boolean call_nw_txt_record_access_bytes(
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String raw_txt_record,
                @NUInt long len);
    }

    /**
     * [@function] nw_txt_record_apply
     * 
     * Apply the block to every key-value pair in the TXT record object.
     * 
     * @param txt_record
     *                   The TXT record object.
     * 
     * @param applier
     *                   The block that will be applied to the entire TXT record object.
     * 
     * @return
     *         A boolean indicating whether iteration of the TXT record object
     *         completed successfully. Iteration will only fail if the applier block
     *         returns false.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_txt_record_apply(@NotNull NSObject txt_record,
            @NotNull @ObjCBlock(name = "call_nw_txt_record_apply") Block_nw_txt_record_apply applier);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_txt_record_apply {
        @Generated
        boolean call_nw_txt_record_apply(
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String key,
                int found,
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String value,
                @NUInt long value_len);
    }

    /**
     * [@function] nw_txt_record_is_equal
     * 
     * Check if the two TXT record objects are equal.
     * 
     * @param left
     *              The first TXT record object to be compared.
     * 
     * @param right
     *              The second TXT record object to be compared.
     * 
     * @return
     *         A boolean indicating if the two TXT record objects are equal. Two TXT
     *         record objects are equal if they contain the same set of key-value pairs,
     *         where keys are compared case-insensitively. For example, "ABC=1" and
     *         "abc=1" are identical key-value pairs. The ordering of the key-value
     *         pairs does not matter.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_txt_record_is_equal(@Nullable NSObject left, @Nullable NSObject right);

    /**
     * [@function] nw_txt_record_is_dictionary
     * 
     * Check whether the TXT record is a dictionary or a buffer.
     * 
     * @param txt_record
     *                   The TXT record object.
     * 
     * @return
     *         A boolean indicating whether the TXT record is a dictionary or a buffer.
     *         If true, the TXT record is a dictionary. If false, the TXT record is a
     *         buffer.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_txt_record_is_dictionary(@NotNull NSObject txt_record);

    /**
     * [@function] nw_advertise_descriptor_create_bonjour_service
     * 
     * Creates a new advertise descriptor object based on a Bonjour service type
     * and optional domain. This object can be used with listener objects to
     * specify the service the listener should advertise.
     * 
     * If the name is unspecified, the default name for the device will be used.
     * If the domain is unspecified, the default domains for registration will be
     * used. If the listener is local only, the domain 'local.' will be used
     * regardless of the parameter passed to domain.
     * 
     * @param name
     *               An optional Bonjour service name.
     * 
     * @param type
     *               A Bonjour service type.
     * 
     * @param domain
     *               An optional Bonjour service domain.
     * 
     * @return
     *         An instantiated browse descriptor object.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_advertise_descriptor_create_bonjour_service(
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String type,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain);

    /**
     * [@function] nw_advertise_descriptor_set_txt_record
     * 
     * Set the TXT record for the advertise descriptor's service. You must call
     * nw_listener_set_advertise_descriptor to update the listener's advertising
     * afterwards in order for these changes to take effect.
     * 
     * @param advertise_descriptor
     *                             The advertise descriptor to modify.
     * 
     * @param txt_record
     *                             A pointer to the TXT record.
     * 
     * @param txt_length
     *                             The length of the TXT record. The total size of a typical DNS-SD TXT record
     *                             is intended to be small - 200 bytes or less. Using TXT records larger than
     *                             1300 bytes is not recommended at this time.
     * 
     *                             API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_advertise_descriptor_set_txt_record(@NotNull NSObject advertise_descriptor,
            @Nullable ConstVoidPtr txt_record, @NUInt long txt_length);

    /**
     * [@function] nw_advertise_descriptor_set_no_auto_rename
     * 
     * Disable auto-rename for the Bonjour service registration.
     * Auto-rename is enabled by default.
     * 
     * @param advertise_descriptor
     *                             The advertise descriptor to modify.
     * 
     * @param no_auto_rename
     *                             A boolean indicating if auto-rename should be disabled.
     * 
     *                             API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_advertise_descriptor_set_no_auto_rename(@NotNull NSObject advertise_descriptor,
            boolean no_auto_rename);

    /**
     * [@function] nw_advertise_descriptor_get_no_auto_rename
     * 
     * Check if auto-rename has been disabled for the Bonjour service
     * registration.
     * 
     * @param advertise_descriptor
     *                             The advertise descriptor object.
     * 
     * @return A boolean indicating if auto-rename is disabled.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_advertise_descriptor_get_no_auto_rename(@NotNull NSObject advertise_descriptor);

    /**
     * [@function] nw_advertise_descriptor_set_txt_record_object
     * 
     * Set the TXT record object on the advertise descriptor.
     * 
     * @param advertise_descriptor
     *                             The advertise descriptor object.
     * 
     * @param txt_record
     *                             The TXT record object. If txt_record is NULL, the advertise_descriptor's
     *                             current TXT record object will be removed.
     * 
     *                             API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_advertise_descriptor_set_txt_record_object(@NotNull NSObject advertise_descriptor,
            @Nullable NSObject txt_record);

    /**
     * [@function] nw_advertise_descriptor_copy_txt_record_object
     * 
     * Copies the TXT record object from the advertise descriptor.
     * 
     * @param advertise_descriptor
     *                             The advertise descriptor object.
     * 
     * @return
     *         A copy of the TXT record object, or NULL if the advertise descriptor
     *         does not have an associated TXT record.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_advertise_descriptor_copy_txt_record_object(
            @NotNull NSObject advertise_descriptor);

    /**
     * [@function] nw_protocol_definition_is_equal
     * 
     * Compare two protocol definitions to check if they represent the same protocol.
     * 
     * @param definition1
     *                    The first definition to compare
     * 
     * @param definition2
     *                    The second definition to compare
     * 
     * @return
     *         Returns true if the definitions represent the same protocol, false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_protocol_definition_is_equal(@NotNull NSObject definition1,
            @NotNull NSObject definition2);

    /**
     * [@function] nw_protocol_options_copy_definition
     * 
     * Retrieve the protocol definition for a given options object.
     * 
     * @param options
     *                The protocol options to check
     * 
     * @return
     *         Returns a reference-counted protocol definition object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_protocol_options_copy_definition(@NotNull NSObject options);

    /**
     * [@function] nw_protocol_metadata_copy_definition
     * 
     * Retrieve the protocol definition for a given metadata object.
     * 
     * @param metadata
     *                 The protocol metadata to check
     * 
     * @return
     *         Returns a reference-counted protocol definition object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_protocol_metadata_copy_definition(@NotNull NSObject metadata);

    /**
     * [@function] nw_interface_get_type
     * 
     * Retrieves the type of an interface. This only accesses the type of the specific
     * interface being queried, and will not take into account types used by interfaces
     * that traffic will eventually be routed through. That is, if the interface is a virtual
     * interface (such as a VPN) that eventually forwards traffic through Wi-Fi, the type
     * will be nw_interface_type_other, not nw_interface_type_wifi.
     * 
     * @param interface
     *                  The interface object to check.
     * 
     * @return
     *         Returns the type of the interface.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_interface_get_type(@NotNull NSObject interface_);

    /**
     * [@function] nw_interface_get_name
     * 
     * Retrieves the name of an interface, to be used for reference or logging
     * purposes.
     * 
     * @param interface
     *                  The interface object to check.
     * 
     * @return
     *         Returns the name of the interface as a NULL-terminated C string,
     *         or NULL if the interface is NULL.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_interface_get_name(@NotNull NSObject interface_);

    /**
     * [@function] nw_interface_get_index
     * 
     * Retrieves the index of an interface, to be used for reference or logging
     * purposes. This is the same value as provided by if_nametoindex.
     * 
     * @param interface
     *                  The interface object to check.
     * 
     * @return
     *         Returns the index of the interface, or 0 if the interface is NULL.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_interface_get_index(@NotNull NSObject interface_);

    /**
     * [@function] nw_endpoint_get_type
     * 
     * Retrieves the type of a network endpoint.
     * 
     * @param endpoint
     *                 The endpoint object for which to get the type.
     * 
     * @return
     *         Returns the type of the network endpoint.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_endpoint_get_type(@NotNull NSObject endpoint);

    /**
     * [@function] nw_endpoint_create_host
     * 
     * Creates a network endpoint with a hostname and port. The hostname
     * may be a string-encoding of an IP address, in which case the
     * the endpoint will be treated as an endpoint with the type
     * nw_endpoint_type_address. Otherwise, the endpoint will have the
     * type nw_endpoint_type_host.
     * 
     * @param hostname
     *                 A hostname, such as "www.example.com", or "2607:ffff::1234:abcd".
     * 
     * @param port
     *                 A port number as a C string, such as "443", or a service
     *                 name, such as "https".
     * 
     * @return
     *         Returns an allocated nw_endpoint_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_endpoint_create_host(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String hostname,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String port);

    /**
     * [@function] nw_endpoint_get_hostname
     * 
     * Retrieves the hostname string for a network endpoint with
     * the type nw_endpoint_type_host or nw_endpoint_type_url.
     * 
     * @param endpoint
     *                 The endpoint object.
     * 
     * @return
     *         Returns the hostname string for the endpoint, or NULL
     *         if the endpoint is not of type nw_endpoint_type_host.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_endpoint_get_hostname(@NotNull NSObject endpoint);

    /**
     * [@function] nw_endpoint_copy_port_string
     * 
     * Returns an allocated port string for a network endpoint with
     * the type nw_endpoint_type_host or nw_endpoint_type_address.
     * 
     * @param endpoint
     *                 The endpoint object.
     * 
     * @return
     *         Returns the port string for the endpoint, or NULL
     *         if the endpoint is not of type nw_endpoint_type_host or
     *         nw_endpoint_type_address. This string must be freed with free().
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native BytePtr nw_endpoint_copy_port_string(@NotNull NSObject endpoint);

    /**
     * [@function] nw_endpoint_get_port
     * 
     * Retrieves the port for a network endpoint with the type
     * nw_endpoint_type_url, nw_endpoint_type_host, or nw_endpoint_type_address.
     * The port will be returned in Host Byte Order.
     * 
     * @param endpoint
     *                 The endpoint object.
     * 
     * @return
     *         Returns the port for the endpoint, or 0 if the endpoint is not
     *         of type nw_endpoint_type_host or nw_endpoint_type_address.
     *         The port will be returned in Host Byte Order.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native char nw_endpoint_get_port(@NotNull NSObject endpoint);

    /**
     * [@function] nw_endpoint_create_address
     * 
     * Creates a network endpoint with a sockaddr struct. The endpoint
     * will have the type nw_endpoint_type_address.
     * 
     * @param address
     *                An address stored as a sockaddr.
     * 
     * @return
     *         Returns an allocated nw_endpoint_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_endpoint_create_address(
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") sockaddr address);

    /**
     * [@function] nw_endpoint_copy_address_string
     * 
     * Returns an allocated IP address string for a network endpoint with
     * the type nw_endpoint_type_address.
     * 
     * @param endpoint
     *                 The endpoint object.
     * 
     * @return
     *         Returns the IP address string for the endpoint, or NULL
     *         if the endpoint is not of type nw_endpoint_type_address.
     *         This string must be freed with free().
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native BytePtr nw_endpoint_copy_address_string(@NotNull NSObject endpoint);

    /**
     * [@function] nw_endpoint_get_address
     * 
     * Retrieves the sockaddr struct for a network endpoint with
     * the type nw_endpoint_type_address.
     * 
     * @param endpoint
     *                 The endpoint object.
     * 
     * @return
     *         Returns the sockaddr struct for the endpoint, or NULL
     *         if the endpoint is not of type nw_endpoint_type_address.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native sockaddr nw_endpoint_get_address(@NotNull NSObject endpoint);

    /**
     * [@function] nw_endpoint_create_bonjour_service
     * 
     * Creates a network endpoint for a Bonjour Service name, type, and
     * domain. The endpoint will have the type nw_endpoint_type_bonjour_service.
     * 
     * @param name
     *               The Bonjour Service name, such as "example".
     * 
     * @param type
     *               The Bonjour Service type, such as "_http._tcp".
     * 
     * @param domain
     *               The Bonjour Service domain, such as "local".
     * 
     * @return
     *         Returns an allocated nw_endpoint_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_endpoint_create_bonjour_service(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String type,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain);

    /**
     * [@function] nw_endpoint_get_bonjour_service_name
     * 
     * Retrieves the Bonjour Service name string for a network
     * endpoint with the type nw_endpoint_type_bonjour_service.
     * 
     * @param endpoint
     *                 The endpoint object.
     * 
     * @return
     *         Returns the Bonjour Service name string for the endpoint, or NULL
     *         if the endpoint is not of type nw_endpoint_type_bonjour_service.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_endpoint_get_bonjour_service_name(@NotNull NSObject endpoint);

    /**
     * [@function] nw_endpoint_get_bonjour_service_type
     * 
     * Retrieves the Bonjour Service type string for a network
     * endpoint with the type nw_endpoint_type_bonjour_service.
     * 
     * @param endpoint
     *                 The endpoint object.
     * 
     * @return
     *         Returns the Bonjour Service type string for the endpoint, or NULL
     *         if the endpoint is not of type nw_endpoint_type_bonjour_service.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_endpoint_get_bonjour_service_type(@NotNull NSObject endpoint);

    /**
     * [@function] nw_endpoint_get_bonjour_service_domain
     * 
     * Retrieves the Bonjour Service domain string for a network
     * endpoint with the type nw_endpoint_type_bonjour_service.
     * 
     * @param endpoint
     *                 The endpoint object.
     * 
     * @return
     *         Returns the Bonjour Service domain string for the endpoint, or NULL
     *         if the endpoint is not of type nw_endpoint_type_bonjour_service.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_endpoint_get_bonjour_service_domain(@NotNull NSObject endpoint);

    /**
     * [@function] nw_endpoint_create_url
     * 
     * Creates a network endpoint with a URL. The endpoint will have the type
     * nw_endpoint_type_url.
     * 
     * @param url
     *            The URL string.
     * 
     * @return
     *         Returns an allocated nw_endpoint_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters, or due to URL parsing failure.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_endpoint_create_url(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String url);

    /**
     * [@function] nw_endpoint_get_url
     * 
     * Retrieves the URL string from a network endpoint of type
     * nw_endpoint_type_url.
     * 
     * @param endpoint
     *                 The endpoint object.
     * 
     * @return
     *         The URL string, or NULL if the endpoint is not of type
     *         nw_endpoint_type_url.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_endpoint_get_url(@NotNull NSObject endpoint);

    /**
     * [@function] nw_parameters_create_secure_tcp
     * 
     * Creates a parameters object that is configured for TLS and TCP. The caller can use
     * the default configuration for TLS and TCP, or set specific options for each protocol,
     * or disable TLS.
     * 
     * @param configure_tls
     *                      A block to configure TLS. To use the default TLS configuration, pass
     *                      NW_PARAMETERS_DEFAULT_CONFIGURATION. To configure specific options, pass a custom
     *                      block and operate on the nw_protocol_options_t object. To disable TLS, pass
     *                      NW_PARAMETERS_DISABLE_PROTOCOL.
     * 
     * @param configure_tcp
     *                      A block to configure TCP. To use the default TCP configuration, pass
     *                      NW_PARAMETERS_DEFAULT_CONFIGURATION. To configure specific options, pass a custom
     *                      block and operate on the nw_protocol_options_t object. It is invalid to try
     *                      to disable TCP using NW_PARAMETERS_DISABLE_PROTOCOL.
     * 
     * @return
     *         Returns an allocated nw_parameters_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_parameters_create_secure_tcp(
            @NotNull @ObjCBlock(name = "call_nw_parameters_create_secure_tcp_0") Block_nw_parameters_create_secure_tcp_0 configure_tls,
            @NotNull @ObjCBlock(name = "call_nw_parameters_create_secure_tcp_1") Block_nw_parameters_create_secure_tcp_1 configure_tcp);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_create_secure_tcp_0 {
        @Generated
        void call_nw_parameters_create_secure_tcp_0(@NotNull NSObject options);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_create_secure_tcp_1 {
        @Generated
        void call_nw_parameters_create_secure_tcp_1(@NotNull NSObject options);
    }

    /**
     * [@function] nw_parameters_create_secure_udp
     * 
     * Creates a parameters object that is configured for DTLS and UDP. The caller can use
     * the default configuration for DTLS and UDP, or set specific options for each protocol,
     * or disable DTLS.
     * 
     * @param configure_dtls
     *                       A block to configure DTLS. To use the default DTLS configuration, pass
     *                       NW_PARAMETERS_DEFAULT_CONFIGURATION. To configure specific options, pass a custom
     *                       block and operate on the nw_protocol_options_t object. To disable DTLS, pass
     *                       NW_PARAMETERS_DISABLE_PROTOCOL.
     * 
     * @param configure_udp
     *                       A block to configure UDP. To use the default UDP configuration, pass
     *                       NW_PARAMETERS_DEFAULT_CONFIGURATION. To configure specific options, pass a custom
     *                       block and operate on the nw_protocol_options_t object. It is invalid to try
     *                       to disable UDP using NW_PARAMETERS_DISABLE_PROTOCOL.
     * 
     * @return
     *         Returns an allocated nw_parameters_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_parameters_create_secure_udp(
            @NotNull @ObjCBlock(name = "call_nw_parameters_create_secure_udp_0") Block_nw_parameters_create_secure_udp_0 configure_dtls,
            @NotNull @ObjCBlock(name = "call_nw_parameters_create_secure_udp_1") Block_nw_parameters_create_secure_udp_1 configure_udp);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_create_secure_udp_0 {
        @Generated
        void call_nw_parameters_create_secure_udp_0(@NotNull NSObject options);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_create_secure_udp_1 {
        @Generated
        void call_nw_parameters_create_secure_udp_1(@NotNull NSObject options);
    }

    /**
     * [@function] nw_parameters_create
     * 
     * Creates a generic parameters object. Note that in order to use parameters
     * with an nw_connection_t or an nw_listener_t, the parameters must have protocols
     * added into the default nw_protocol_stack_t. Clients using standard protocol
     * configurations should use nw_parameters_create_secure_tcp() or
     * nw_parameters_create_secure_udp().
     * 
     * @return
     *         Returns an allocated nw_parameters_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_parameters_create();

    /**
     * [@function] nw_parameters_copy
     * 
     * Creates a deep copy of a parameters object that can be modified.
     * 
     * @param parameters
     *                   The existing parameters object to copy
     * 
     * @return
     *         Returns a newly allocated nw_parameters_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_parameters_copy(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_require_interface
     * 
     * Require any connections or listeners using these parameters to use
     * the provided network interface, or none if NULL is passed.
     * 
     * @param parameters
     *                   The parameters object to configure
     * 
     * @param interface
     *                   The interface to require for connections or listeners, or NULL to
     *                   allow any interface.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_require_interface(@NotNull NSObject parameters,
            @Nullable NSObject interface_);

    /**
     * [@function] nw_parameters_copy_required_interface
     * 
     * Access the required network interface set on the parameters.
     * 
     * @param parameters
     *                   The parameters object to check
     * 
     * @return
     *         Returns the interface that is required by the parameters, or
     *         NULL if no interface is required.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_parameters_copy_required_interface(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_prohibit_interface
     * 
     * Prohibit any connections or listeners using these parameters from using
     * the provided network interface.
     * 
     * @param parameters
     *                   The parameters object to configure
     * 
     * @param interface
     *                   The interface to prohibit for connections or listeners.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_prohibit_interface(@NotNull NSObject parameters,
            @NotNull NSObject interface_);

    /**
     * [@function] nw_parameters_clear_prohibited_interfaces
     * 
     * Clear any interfaces that had been prohibited.
     * 
     * @param parameters
     *                   The parameters object to modify
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_clear_prohibited_interfaces(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_iterate_prohibited_interfaces
     * 
     * List all prohibited network interfaces.
     * 
     * @param parameters
     *                      The parameters object to check
     * 
     * @param iterate_block
     *                      A block that will return the interfaces prohibited by the parameters. Returning
     *                      true from the block will continue to iterate, and returning false will stop
     *                      iterating.
     * 
     *                      API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_iterate_prohibited_interfaces(@NotNull NSObject parameters,
            @NotNull @ObjCBlock(name = "call_nw_parameters_iterate_prohibited_interfaces") Block_nw_parameters_iterate_prohibited_interfaces iterate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_iterate_prohibited_interfaces {
        @Generated
        boolean call_nw_parameters_iterate_prohibited_interfaces(@NotNull NSObject interface_);
    }

    /**
     * [@function] nw_parameters_set_required_interface_type
     * 
     * Require any connections or listeners using these parameters to use
     * the provided network interface type.
     * 
     * @param parameters
     *                       The parameters object to configure
     * 
     * @param interface_type
     *                       The interface type to require for connections or listeners.
     * 
     *                       API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_required_interface_type(@NotNull NSObject parameters,
            int interface_type);

    /**
     * [@function] nw_parameters_get_required_interface_type
     * 
     * Access the required network interface type set on the parameters.
     * 
     * @param parameters
     *                   The parameters object to check
     * 
     * @return
     *         Returns the interface type that is required by the parameters, or
     *         nw_interface_type_other_t if no interface type is required.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_parameters_get_required_interface_type(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_prohibit_interface_type
     * 
     * Prohibit any connections or listeners using these parameters from using
     * the provided network interface type.
     * 
     * @param parameters
     *                       The parameters object to configure
     * 
     * @param interface_type
     *                       The interface type to prohibit for connections or listeners.
     * 
     *                       API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_prohibit_interface_type(@NotNull NSObject parameters, int interface_type);

    /**
     * [@function] nw_parameters_clear_prohibited_interface_types
     * 
     * Clear any interface types that had been prohibited.
     * 
     * @param parameters
     *                   The parameters object to modify
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_clear_prohibited_interface_types(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_iterate_prohibited_interface_types
     * 
     * List all prohibited network interface types.
     * 
     * @param parameters
     *                      The parameters object to check
     * 
     * @param iterate_block
     *                      A block that will return the interface types prohibited by the parameters. Returning
     *                      true from the block will continue to iterate, and returning false will stop
     *                      iterating.
     * 
     *                      API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_iterate_prohibited_interface_types(@NotNull NSObject parameters,
            @NotNull @ObjCBlock(name = "call_nw_parameters_iterate_prohibited_interface_types") Block_nw_parameters_iterate_prohibited_interface_types iterate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_iterate_prohibited_interface_types {
        @Generated
        boolean call_nw_parameters_iterate_prohibited_interface_types(int interface_type);
    }

    /**
     * [@function] nw_parameters_set_prohibit_expensive
     * 
     * Prohibit any connections or listeners using these parameters from using
     * a network interface that is considered expensive by the system.
     * 
     * @param parameters
     *                           The parameters object to configure
     * 
     * @param prohibit_expensive
     *                           If true, prohibit the use of any expensive interfaces. If false,
     *                           allow expensive interfaces. Defaults to false.
     * 
     *                           API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_prohibit_expensive(@NotNull NSObject parameters,
            boolean prohibit_expensive);

    /**
     * [@function] nw_parameters_get_prohibit_expensive
     * 
     * Check if the parameters prohibit expensive interfaces.
     * 
     * @param parameters
     *                   The parameters object to check
     * 
     * @return
     *         Returns true if expensive interfaces are prohibited, or
     *         false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_parameters_get_prohibit_expensive(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_set_prohibit_constrained
     * 
     * Prohibit any connections or listeners using these parameters from using
     * a network interface that is considered constrained by the system.
     * 
     * @param parameters
     *                             The parameters object to configure
     * 
     * @param prohibit_constrained
     *                             If true, prohibit the use of any constrained interfaces. If false,
     *                             allow constrained interfaces. Defaults to false.
     * 
     *                             API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_prohibit_constrained(@NotNull NSObject parameters,
            boolean prohibit_constrained);

    /**
     * [@function] nw_parameters_get_prohibit_constrained
     * 
     * Check if the parameters prohibit constrained interfaces.
     * 
     * @param parameters
     *                   The parameters object to check
     * 
     * @return
     *         Returns true if constrained interfaces are prohibited, or
     *         false otherwise.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_parameters_get_prohibit_constrained(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_set_reuse_local_address
     * 
     * Allow any connections using these parameters to reuse
     * local addresses already in use by other connections.
     * 
     * @param parameters
     *                            The parameters object to configure
     * 
     * @param reuse_local_address
     *                            If true, allow the reuse of local addresses. If false,
     *                            disallow the reuse of local addresses. Defaults to false.
     * 
     *                            API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_reuse_local_address(@NotNull NSObject parameters,
            boolean reuse_local_address);

    /**
     * [@function] nw_parameters_get_reuse_local_address
     * 
     * Check if the parameters allow local address reuse.
     * 
     * @param parameters
     *                   The parameters object to check
     * 
     * @return
     *         Returns true if local address reuse is allowed, or
     *         false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_parameters_get_reuse_local_address(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_set_local_endpoint
     * 
     * Specify a specific endpoint to use as the local endpoint.
     * For connections, this will be used to initiate traffic;
     * for listeners, this will be used for receiving incoming
     * connections.
     * 
     * @param parameters
     *                       The parameters object to configure
     * 
     * @param local_endpoint
     *                       The endpoint to set as the local endpoint. Pass NULL to
     *                       clear the local endpoint.
     * 
     *                       API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_local_endpoint(@NotNull NSObject parameters,
            @Nullable NSObject local_endpoint);

    /**
     * [@function] nw_parameters_copy_local_endpoint
     * 
     * Extract the local endpoint set on the connection.
     * 
     * @param parameters
     *                   The parameters object to configure
     * 
     * @return
     *         Returns the endpoint that is set in the parameters, or
     *         NULL if no local endpoint is set.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_parameters_copy_local_endpoint(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_set_include_peer_to_peer
     * 
     * Allow the inclusion of peer-to-peer interfaces when
     * listening or establishing outbound connections. This parameter
     * will not take effect if a specific interface is required.
     * This parameter is applicable when advertising a Bonjour service
     * on a listener, or connecting to a Bonjour service.
     * 
     * @param parameters
     *                             The parameters object to configure
     * 
     * @param include_peer_to_peer
     *                             If true, allow advertising, resolving, and connecting over
     *                             peer-to-peer interfaces. Defaults to false.
     * 
     *                             API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_include_peer_to_peer(@NotNull NSObject parameters,
            boolean include_peer_to_peer);

    /**
     * [@function] nw_parameters_get_include_peer_to_peer
     * 
     * Check if the parameters allow the inclusion of
     * peer-to-peer interfaces.
     * 
     * @param parameters
     *                   The parameters object to check
     * 
     * @return
     *         Returns true if peer-to-peer interfaces are allowed,
     *         or false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_parameters_get_include_peer_to_peer(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_set_fast_open_enabled
     * 
     * Use fast open for an outbound connection, which may be done at any
     * protocol level. Use of fast open requires that the caller send
     * idempotent data on the connection before the connection may move
     * into the ready state. As a side effect, this may implicitly enable
     * fast open or early data for protocols in the stack, even if they did not
     * have fast open explicitly enabled on them (such as the option to enable
     * TCP Fast Open).
     * 
     * NOTE: Use of this API may have security implications for application data.
     * In particular, TLS early data is replayable by a network attacker. Callers must
     * account for this when sending data before the handshake is confirmed. See
     * RFC 8446 for more information. Callers MUST NOT enable fast open without
     * a specific application profile that defines its use.
     * 
     * @param parameters
     *                          The parameters object to configure
     * 
     * @param fast_open_enabled
     *                          If true, indicate that fast open is requested and that idempotent data
     *                          MUST be sent by the caller on the connection. If false,
     *                          disallow the fast open at the top level protocol. Defaults to false.
     * 
     *                          API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_fast_open_enabled(@NotNull NSObject parameters,
            boolean fast_open_enabled);

    /**
     * [@function] nw_parameters_get_fast_open_enabled
     * 
     * Check if the parameters allow the use of fast open for the top level
     * protocol.
     * 
     * @param parameters
     *                   The parameters object to check
     * 
     * @return
     *         Returns true if fast open is allowed for the top level protocol, or
     *         false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_parameters_get_fast_open_enabled(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_set_service_class
     * 
     * Set the data service class to use for connections.
     * 
     * @param parameters
     *                      The parameters object to configure
     * 
     * @param service_class
     *                      The service class value to use for connections. Defaults to nw_service_class_best_effort.
     * 
     *                      API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_service_class(@NotNull NSObject parameters, int service_class);

    /**
     * [@function] nw_parameters_get_service_class
     * 
     * Check the service class configured on the parameters.
     * 
     * @param parameters
     *                   The parameters object to check
     * 
     * @return
     *         Returns the effective service class configured on the parameters.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_parameters_get_service_class(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_set_multipath_service
     * 
     * Set the multipath service to use for connections.
     * 
     * @param parameters
     *                          The parameters object to configure
     * 
     * @param multipath_service
     *                          The multipath service value to use for connections. Defaults to
     *                          nw_multipath_service_disabled.
     * 
     *                          API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_multipath_service(@NotNull NSObject parameters, int multipath_service);

    /**
     * [@function] nw_parameters_get_multipath_service
     * 
     * Check the multipath service mode configured on the parameters.
     * 
     * @param parameters
     *                   The parameters object to check
     * 
     * @return
     *         Returns the multipath service configured on the parameters.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_parameters_get_multipath_service(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_copy_default_protocol_stack
     * 
     * Retrieve the default protocol stack from a parameters object.
     * Every parameters object will have a default protocol stack. For
     * parameters created with a convenience initializer, this protocol
     * stack will be pre-populated. For parameters created with the generic
     * initializers, the stack will be empty.
     * 
     * @param parameters
     *                   The parameters object to check
     * 
     * @return
     *         Returns an nw_protocol_stack_t object that can be inspected and modified.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_parameters_copy_default_protocol_stack(@NotNull NSObject parameters);

    /**
     * [@function] nw_protocol_stack_prepend_application_protocol
     * 
     * Prepend an application-layer protocol onto the top of a protocol stack.
     * 
     * @param stack
     *                 The protocol stack to modify
     * 
     * @param protocol
     *                 The protocol options to add to the stack, which contain the definition of the
     *                 protocol to add.
     * 
     *                 API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_protocol_stack_prepend_application_protocol(@NotNull NSObject stack,
            @NotNull NSObject protocol);

    /**
     * [@function] nw_protocol_stack_clear_application_protocols
     * 
     * Remove all application-layer protocols from a protocol stack.
     * 
     * @param stack
     *              The protocol stack to modify
     * 
     *              API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_protocol_stack_clear_application_protocols(@NotNull NSObject stack);

    /**
     * [@function] nw_protocol_stack_iterate_application_protocols
     * 
     * List all application protocols attached to a protocol stack.
     * 
     * @param stack
     *                      The protocol stack to check
     * 
     * @param iterate_block
     *                      A block that will return the protocols attached to the stack.
     * 
     *                      API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_protocol_stack_iterate_application_protocols(@NotNull NSObject stack,
            @NotNull @ObjCBlock(name = "call_nw_protocol_stack_iterate_application_protocols") Block_nw_protocol_stack_iterate_application_protocols iterate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_protocol_stack_iterate_application_protocols {
        @Generated
        void call_nw_protocol_stack_iterate_application_protocols(@NotNull NSObject protocol);
    }

    /**
     * [@function] nw_protocol_stack_copy_transport_protocol
     * 
     * Access the transport-layer protocol used in a protocol stack.
     * 
     * @param stack
     *              The protocol stack to check
     * 
     * @return
     *         Returns the transport protocol currently set in the protocol stack,
     *         or NULL if no transport protocol is set.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_protocol_stack_copy_transport_protocol(@NotNull NSObject stack);

    /**
     * [@function] nw_protocol_stack_set_transport_protocol
     * 
     * Set the transport-layer protocol to use for a protocol stack.
     * 
     * @param stack
     *                 The protocol stack to modify
     * 
     * @param protocol
     *                 The protocol options to set into the stack, which contain the definition of the
     *                 protocol.
     * 
     *                 API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_protocol_stack_set_transport_protocol(@NotNull NSObject stack,
            @NotNull NSObject protocol);

    /**
     * [@function] nw_protocol_stack_copy_internet_protocol
     * 
     * Access the internet-layer protocol used in a protocol stack.
     * 
     * @param stack
     *              The protocol stack to check
     * 
     * @return
     *         Returns the internet protocol currently set in the protocol stack,
     *         or NULL if no internet protocol is set. Note that this will generally
     *         be NULL, unless a specific IP family is being selected.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_protocol_stack_copy_internet_protocol(@NotNull NSObject stack);

    /**
     * [@function] nw_parameters_set_local_only
     * 
     * Set to true to limit inbound connections to peers attached to the
     * local link only. Defaults to false.
     * 
     * @param parameters
     *                   The parameters object to configure
     * 
     * @param local_only
     *                   True to limit connections to the local link only.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_local_only(@NotNull NSObject parameters, boolean local_only);

    /**
     * [@function] nw_parameters_get_local_only
     * 
     * Indicates whether or not the parameters limit connections to the local
     * link only.
     * 
     * @param parameters
     *                   The parameters object to check
     * 
     * @return
     *         Returns true if the parameters limit inbound connections to the local link.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_parameters_get_local_only(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_set_prefer_no_proxy
     * 
     * Set to true to attempt connections without using proxies, only using any configured proxies if the connections
     * cannot otherwise be completed. Defaults to false.
     * 
     * @param parameters
     *                        The parameters to modify.
     * 
     * @param prefer_no_proxy
     *                        True to cause connections to be attempted without proxies.
     * 
     *                        API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_prefer_no_proxy(@NotNull NSObject parameters, boolean prefer_no_proxy);

    /**
     * [@function] nw_parameters_get_prefer_no_proxy
     * 
     * Indicates whether or not the parameters cause connections to be attempted without proxies, only using proxies
     * if connections cannot otherwise be completed.
     * 
     * @param parameters
     *                   The parameters to get the property from.
     * 
     * @return
     *         Returns true if the parameters cause connections to be attempted without proxies, only using proxies if
     *         connections cannot otherwise be completed.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_parameters_get_prefer_no_proxy(@NotNull NSObject parameters);

    /**
     * [@function] nw_parameters_set_expired_dns_behavior
     * 
     * Allow or prohibit the use of expired DNS answers during connection establishment.
     * If allowed, a DNS answer that was previously returned may be re-used for new
     * connections even after the answers are considered expired. A query for fresh answers
     * will be sent in parallel, and the fresh answers will be used as alternate addresses
     * in case the expired answers do not result in successful connections.
     * 
     * By default, this value is nw_parameters_expired_dns_behavior_default, which allows
     * the system to determine if it is appropriate to use expired answers.
     * 
     * @param parameters
     *                             The parameters to modify.
     * 
     * @param expired_dns_behavior
     *                             Allow, prohibit, or use system default behavior for expired DNS answers.
     * 
     *                             API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_expired_dns_behavior(@NotNull NSObject parameters,
            int expired_dns_behavior);

    /**
     * [@function] nw_parameters_get_expired_dns_behavior
     * 
     * Check the effective expired DNS behavior of a connection.
     * See nw_parameters_set_expired_dns_behavior() for a discussion on the use of expired
     * DNS answers.
     * 
     * @param parameters
     *                   The parameters to check.
     * 
     * @return
     *         Returns the current effective expired DNS answer behavior.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_parameters_get_expired_dns_behavior(@NotNull NSObject parameters);

    /**
     * [@function] nw_browse_descriptor_create_bonjour_service
     * 
     * Creates a new browse descriptor object on a Bonjour service type and
     * domain.
     * 
     * @param type
     *               A Bonjour service type.
     * 
     * @param domain
     *               An optional Bonjour service domain. If the domain is unspecified, the
     *               default domains for browsing will be used.
     * 
     * @return
     *         An instantiated browse descriptor object.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_browse_descriptor_create_bonjour_service(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String type,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain);

    /**
     * [@function] nw_browse_descriptor_get_bonjour_service_type
     * 
     * Returns the service type of a browse descriptor.
     * 
     * @param descriptor
     *                   A browse descriptor object.
     * 
     * @return
     *         The service type.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_browse_descriptor_get_bonjour_service_type(@NotNull NSObject descriptor);

    /**
     * [@function] nw_browse_descriptor_get_bonjour_service_domain
     * 
     * Returns the service domain of a browse descriptor, or NULL if NULL was
     * provided while creating the descriptor.
     * 
     * @param descriptor
     *                   A browse descriptor object.
     * 
     * @return
     *         The service domain.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_browse_descriptor_get_bonjour_service_domain(@NotNull NSObject descriptor);

    /**
     * [@function] nw_browse_descriptor_set_include_txt_record
     * 
     * Set a flag to allow or prohibit the browser from querying for TXT records
     * while browsing. This flag should only be set if the client needs information
     * from the TXT record during browsing, and may increase network traffic. By
     * default, the browser will not automatically query for TXT records.
     * 
     * @param descriptor
     *                           The browse descriptor object.
     * 
     * @param include_txt_record
     *                           A flag indicating whether results should include a TXT record. If true,
     *                           the browser will query for TXT records. If false, the browser will not
     *                           query for TXT records.
     * 
     *                           API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_browse_descriptor_set_include_txt_record(@NotNull NSObject descriptor,
            boolean include_txt_record);

    /**
     * [@function] nw_browse_descriptor_get_include_txt_record
     * 
     * Check whether the browser is allowed to query for TXT records.
     * 
     * @param descriptor
     *                   The browse descriptor to check.
     * 
     * @return
     *         Whether the browser is allowed to query for TXT records.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_browse_descriptor_get_include_txt_record(@NotNull NSObject descriptor);

    /**
     * [@function] nw_browse_result_copy_endpoint
     * 
     * Copies the endpoint associated with the browse result object.
     * 
     * @param result
     *               The browse result object.
     * 
     * @return
     *         The associated endpoint.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_browse_result_copy_endpoint(@NotNull NSObject result);

    /**
     * [@function] nw_browse_result_get_changes
     * 
     * Determines the set of all changes that occurred between an old and a new
     * browse result. For example, if the return value of this function matches
     * with nw_browse_result_change_interface_added and nw_browse_result_change_txt_record_changed,
     * the caller can expect new_result to include a new interface and an updated
     * txt record that was not present in old_result.
     * 
     * @param old_result
     *                   The old result.
     * 
     * @param new_result
     *                   The new result.
     * 
     * @return
     *         A nw_browse_result_change_t describing all changes that occurred.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_browse_result_get_changes(@Nullable NSObject old_result,
            @Nullable NSObject new_result);

    /**
     * [@function] nw_browse_result_get_interfaces_count
     * 
     * Returns the number of interfaces on this browse result.
     * 
     * @param result
     *               The browse result object.
     * 
     * @return
     *         The number of interfaces available.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long nw_browse_result_get_interfaces_count(@NotNull NSObject result);

    /**
     * [@function] nw_browse_result_copy_txt_record_object
     * 
     * Copies the TXT record object from the browse result.
     * 
     * @param result
     *               The browse result object.
     * 
     * @return
     *         A copy of the TXT record object, or NULL if the browse result does not
     *         have an associated TXT record.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_browse_result_copy_txt_record_object(@NotNull NSObject result);

    /**
     * [@function] nw_browse_result_enumerate_interfaces
     * 
     * Enumerates the list of interfaces on this browse result.
     * 
     * @param result
     *                   The browse result object.
     * 
     * @param enumerator
     *                   The enumerator block.
     * 
     *                   API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_browse_result_enumerate_interfaces(@NotNull NSObject result,
            @NotNull @ObjCBlock(name = "call_nw_browse_result_enumerate_interfaces") Block_nw_browse_result_enumerate_interfaces enumerator);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_browse_result_enumerate_interfaces {
        @Generated
        boolean call_nw_browse_result_enumerate_interfaces(@NotNull NSObject interface_);
    }

    /**
     * [@function] nw_error_get_error_domain
     * 
     * Given a reference to a nw_error, returns the error domain.
     * 
     * [@returns]
     * The error domain.
     * 
     * API-Since: 12.0
     * 
     * @param error
     *              A reference to the nw_error.
     */
    @Generated
    @CFunction
    public static native int nw_error_get_error_domain(@NotNull NSObject error);

    /**
     * [@function] nw_error_get_error_code
     * 
     * Given a reference to a nw_error, returns the error code.
     * 
     * [@returns]
     * The error code.
     * 
     * API-Since: 12.0
     * 
     * @param error
     *              A reference to the nw_error.
     */
    @Generated
    @CFunction
    public static native int nw_error_get_error_code(@NotNull NSObject error);

    /**
     * [@function] nw_error_copy_cf_error
     * 
     * Given a reference to nw_error, returns a CFErrorRef representing the same error.
     * 
     * [@returns]
     * The CFErrorRef. The caller is responsible for calling CFRelease on the returned value.
     * 
     * API-Since: 12.0
     * 
     * @param error
     *              A reference to the nw_error.
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFErrorRef nw_error_copy_cf_error(@NotNull NSObject error);

    /**
     * [@function] nw_browser_create
     * 
     * Creates a new browser object, which can be used to browse for results
     * matching a browse descriptor.
     * 
     * @param descriptor
     *                   A browse descriptor object that describes the type of service for which
     *                   to browse.
     * 
     * @param parameters
     *                   Optional parameters to use for the new browser. If NULL, an empty parameters
     *                   object is created internally.
     * 
     * @return
     *         An instantiated browser object.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_browser_create(@NotNull NSObject descriptor, @Nullable NSObject parameters);

    /**
     * [@function] nw_browser_set_queue
     * 
     * Sets the client callback queue, on which blocks for events will
     * be scheduled. This must be done before calling nw_browser_start().
     * 
     * @param browser
     *                The browser object.
     * 
     * @param queue
     *                The client's callback queue.
     * 
     *                API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_browser_set_queue(@NotNull NSObject browser, @NotNull NSObject queue);

    /**
     * [@function] nw_browser_set_browse_results_changed_handler
     * 
     * Sets a callback handler to be invoked when the browser gets an update
     * for changed browse results. This function must be called before starting
     * the browser and must not be called after starting the browser.
     * 
     * @param browser
     *                The browser object.
     * 
     * @param handler
     *                The callback handler that fires when the browser gets an update for a
     *                changed browse result.
     * 
     *                API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_browser_set_browse_results_changed_handler(@NotNull NSObject browser,
            @Nullable @ObjCBlock(name = "call_nw_browser_set_browse_results_changed_handler") Block_nw_browser_set_browse_results_changed_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_browser_set_browse_results_changed_handler {
        @Generated
        void call_nw_browser_set_browse_results_changed_handler(@NotNull NSObject old_result,
                @NotNull NSObject new_result, boolean batch_complete);
    }

    /**
     * [@function] nw_browser_set_state_changed_handler
     * 
     * Sets the state changed handler. For clients that need to perform cleanup
     * when the browser has been cancelled, the nw_browser_state_cancelled state
     * will be delivered last. This function must be called before starting the
     * browser and must not be called after starting the browser.
     * 
     * @param browser
     *                              The browser object.
     * 
     * @param state_changed_handler
     *                              The state changed handler to call when the browser state changes.
     *                              Pass NULL to remove the event handler.
     * 
     *                              API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_browser_set_state_changed_handler(@NotNull NSObject browser,
            @Nullable @ObjCBlock(name = "call_nw_browser_set_state_changed_handler") Block_nw_browser_set_state_changed_handler state_changed_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_browser_set_state_changed_handler {
        @Generated
        void call_nw_browser_set_state_changed_handler(int state, @Nullable NSObject error);
    }

    /**
     * [@function] nw_browser_start
     * 
     * Starts the browser, which begins browsing for available endpoints.
     * You must call nw_browser_set_queue() before starting the browser.
     * 
     * @param browser
     *                The browser object.
     * 
     *                API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_browser_start(@NotNull NSObject browser);

    /**
     * [@function] nw_browser_cancel
     * 
     * Cancels the browser. The process of cancellation will be completed
     * asynchronously, and the final callback event delivered to the caller
     * will be a state update with a value of nw_browser_state_cancelled.
     * Once this update is delivered, the caller may clean up any associated
     * memory or objects.
     * 
     * @param browser
     *                The browser object.
     * 
     *                API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_browser_cancel(@NotNull NSObject browser);

    /**
     * [@function] nw_browser_copy_parameters
     * 
     * Returns a copy of the parameters passed to nw_browser_create().
     * 
     * @param browser
     *                The browser object.
     * 
     * @return
     *         Returns an nw_parameters_t object.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_browser_copy_parameters(@NotNull NSObject browser);

    /**
     * [@function] nw_browser_copy_browse_descriptor
     * 
     * Returns a copy of the browse_descriptor passed to nw_browser_create().
     * 
     * @param browser
     *                The browser object.
     * 
     * @return
     *         Returns a copy of the browse_descriptor passed to nw_browser_create().
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_browser_copy_browse_descriptor(@NotNull NSObject browser);

    /**
     * [@function] nw_path_get_status
     * 
     * Retrieves the status of a path. The status of a specific path object will never
     * change, as the path object itself is static. If there is a network change, the
     * object that generated the path object will generate a new path object.
     * 
     * @param path
     *             The path object to check.
     * 
     * @return
     *         Returns the status of the path, or nw_path_status_invalid if the object is NULL.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_path_get_status(@NotNull NSObject path);

    /**
     * [@function] nw_path_enumerate_interfaces
     * 
     * List all interfaces associated with the path.
     * 
     * @param path
     *                        The path object to check.
     * 
     * @param enumerate_block
     *                        A block that will return the interfaces associated with the path. Returning
     *                        true from the block will continue to enumerate, and returning false will stop
     *                        enumerating.
     * 
     *                        API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_path_enumerate_interfaces(@NotNull NSObject path,
            @NotNull @ObjCBlock(name = "call_nw_path_enumerate_interfaces") Block_nw_path_enumerate_interfaces enumerate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_path_enumerate_interfaces {
        @Generated
        boolean call_nw_path_enumerate_interfaces(@NotNull NSObject interface_);
    }

    /**
     * [@function] nw_path_is_equal
     * 
     * Compares two network path objects and checks if their content is equal.
     * If they are not equal, they represent two different network states.
     * 
     * @param path
     *                   The first path object to compare.
     * 
     * @param other_path
     *                   The second path object to compare.
     * 
     * @return
     *         Returns true if the paths are equivalent, or false if there is any difference
     *         between the paths.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_path_is_equal(@NotNull NSObject path, @NotNull NSObject other_path);

    /**
     * [@function] nw_path_is_expensive
     * 
     * Checks if the path uses any network interfaces that are considered expensive
     * to the user, such as, but not limited to, a cellular network.
     * 
     * @param path
     *             The path object to check.
     * 
     * @return
     *         Returns true if the path uses any network interface that is considered expensive,
     *         false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_path_is_expensive(@NotNull NSObject path);

    /**
     * [@function] nw_path_is_constrained
     * 
     * Checks if the path uses any network interfaces that are considered constrained
     * to the user.
     * 
     * @param path
     *             The path object to check.
     * 
     * @return
     *         Returns true if the path uses any network interface that is considered constrained,
     *         false otherwise.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_path_is_constrained(@NotNull NSObject path);

    /**
     * [@function] nw_path_has_ipv4
     * 
     * Checks if the path uses a network interface that supports IPv4 connectivity.
     * 
     * @param path
     *             The path object to check.
     * 
     * @return
     *         Returns true if the path uses a network interface that supports IPv4,
     *         false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_path_has_ipv4(@NotNull NSObject path);

    /**
     * [@function] nw_path_has_ipv6
     * 
     * Checks if the path uses a network interface that supports IPv6 connectivity.
     * 
     * @param path
     *             The path object to check.
     * 
     * @return
     *         Returns true if the path uses a network interface that supports IPv6,
     *         false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_path_has_ipv6(@NotNull NSObject path);

    /**
     * [@function] nw_path_has_dns
     * 
     * Checks if the path has a DNS server configuration set.
     * 
     * @param path
     *             The path object to check.
     * 
     * @return
     *         Returns true if the path has a DNS server configuration set,
     *         false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_path_has_dns(@NotNull NSObject path);

    /**
     * [@function] nw_path_uses_interface_type
     * 
     * Checks if the path uses a network interface with the specified type.
     * 
     * @param path
     *             The path object to check.
     * 
     * @return
     *         Returns true if the path uses any network interface with the specified type,
     *         false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_path_uses_interface_type(@NotNull NSObject path, int interface_type);

    /**
     * [@function] nw_path_copy_effective_local_endpoint
     * 
     * Retrieve the local endpoint that is being used, if present. If this path
     * is the path from an nw_connection_t, it represents the address that data
     * is sent from.
     * 
     * @param path
     *             The path object to check.
     * 
     * @return
     *         Returns an endpoint that is assigned as the local endpoint for this path,
     *         or NULL if the path does not have a fixed local endpoint.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_path_copy_effective_local_endpoint(@NotNull NSObject path);

    /**
     * [@function] nw_path_copy_effective_remote_endpoint
     * 
     * Retrieve the remote endpoint that is being used, if present. If this path
     * is the path from an nw_connection_t, it represents the address that data
     * is sent to.
     * 
     * @param path
     *             The path object to check.
     * 
     * @return
     *         Returns an endpoint that is assigned as the remote endpoint for this path,
     *         or NULL if the path does not have a fixed remote endpoint.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_path_copy_effective_remote_endpoint(@NotNull NSObject path);

    /**
     * [@function] nw_path_enumerate_gateways
     * 
     * List the IP addresses of the routers acting as the gateways for the path.
     * 
     * @param path
     *                        The path object to check.
     * 
     * @param enumerate_block
     *                        A block that will return the gateways associated with the path. Returning
     *                        true from the block will continue to enumerate, and returning false will stop
     *                        enumerating.
     * 
     *                        API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_path_enumerate_gateways(@NotNull NSObject path,
            @NotNull @ObjCBlock(name = "call_nw_path_enumerate_gateways") Block_nw_path_enumerate_gateways enumerate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_path_enumerate_gateways {
        @Generated
        boolean call_nw_path_enumerate_gateways(@NotNull NSObject gateway);
    }

    /**
     * [@function] nw_content_context_create
     * 
     * Create a context object to represent properties associated with
     * networking content. If the same context object is associated with multiple
     * content blobs, then those pieces of content will be considered to be continuations
     * of the same message.
     * 
     * @param context_identifier A string description of the context
     * @return Returns a new context context object
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_content_context_create(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String context_identifier);

    /**
     * [@function] nw_content_context_get_identifier
     * 
     * Access the identifier description.
     * 
     * @return Returns the context's identifier string.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_content_context_get_identifier(@NotNull NSObject context);

    /**
     * [@function] nw_content_context_get_is_final
     * 
     * Check if this is the final context for a connection. When receiving,
     * once a final context is complete, the connection is "read closed" and will not
     * receive more content. See nw_content_context_set_is_final() for a description
     * of how to set is_final for sending contexts.
     * 
     * @param context The context object
     * @return Returns true if the context is the final context for a connection.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_content_context_get_is_final(@NotNull NSObject context);

    /**
     * [@function] nw_content_context_set_is_final
     * 
     * Mark whether or not this context is the final context for a
     * connection. When sending, marking a context as final will perform
     * a "write close" once the context is complete, indicating that no more content
     * will be sent. As a convenience for sending a final context, use
     * NW_CONNECTION_FINAL_MESSAGE_CONTEXT.
     * 
     * @param context  The context object
     * @param is_final If set to true, mark the context as the final context to send on a connection.
     * 
     *                 API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_content_context_set_is_final(@NotNull NSObject context, boolean is_final);

    /**
     * [@function] nw_content_context_get_expiration_milliseconds
     * 
     * Retrieve the number of milliseconds after which the content will expire.
     * See nw_content_context_set_expiration_milliseconds for further discussion.
     * 
     * @param context The context object
     * @return Returns content expiration, or 0 if not set.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native long nw_content_context_get_expiration_milliseconds(@NotNull NSObject context);

    /**
     * [@function] nw_content_context_set_expiration_milliseconds
     * 
     * Set an expiration (in milliseconds) after which content may be dropped.
     * If the expiration time is reached, the content may not be sent. If the value is
     * 0, there is no expiration for the content. The expiration timer starts when the
     * content is enqueued using nw_connection_send().
     * 
     * @param context                 The context object
     * @param expiration_milliseconds The number of milliseconds after which content will expire
     * 
     *                                API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_content_context_set_expiration_milliseconds(@NotNull NSObject context,
            long expiration_milliseconds);

    /**
     * [@function] nw_content_context_get_relative_priority
     * 
     * Get the relative priority for the content. See
     * nw_content_context_set_relative_priority for further discussion.
     * 
     * @param context The context object
     * @return Returns the relative priority, between 0.0 (lowest priority)
     *         to 1.0 (highest priority). The default value is 0.5.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native double nw_content_context_get_relative_priority(@NotNull NSObject context);

    /**
     * [@function] nw_content_context_set_relative_priority
     * 
     * Set A relative priority of the content, compared to other
     * content on the same connection. Priorities range from 0.0 (lowest
     * priority) to 1.0 (highest priority), where content with higher
     * priority will scheduled first if all else is equal.
     * The default value is 0.5.
     * 
     * @param context           The context object
     * @param relative_priority The relative priority of the content, between
     *                          0.0 (lowest priority) to 1.0 (highest priority).
     * 
     *                          API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_content_context_set_relative_priority(@NotNull NSObject context,
            double relative_priority);

    /**
     * [@function] nw_content_context_set_antecedent
     * 
     * Set a context as an antecedent to this content context.
     * The associated content will not be sent until all of its antecedents have been
     * completed. If any of the antecedents fail with an error, this content will
     * fail as well.
     * 
     * @param context            The context object
     * @param antecedent_context A context associated with content that should precede
     *                           this content.
     * 
     *                           API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_content_context_set_antecedent(@NotNull NSObject context,
            @Nullable NSObject antecedent_context);

    /**
     * [@function] nw_content_context_copy_antecedent
     * 
     * Copy the optional content context that must be sent prior to this
     * content. See nw_content_context_set_antecedent for further discussion.
     * 
     * @param context The context object
     * @return Returns a context object set as the antecedent, or NULL.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_content_context_copy_antecedent(@NotNull NSObject context);

    /**
     * [@function] nw_content_context_set_metadata_for_protocol
     * 
     * Set protocol-specific metadata to a parent content context. If
     * metadata for the same protocol is set multiple times, the most recently
     * set metadata will be applied.
     * 
     * @param context           The context context parent object
     * @param protocol_metadata The per-protocol metadata context object to set
     * 
     *                          API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_content_context_set_metadata_for_protocol(@NotNull NSObject context,
            @NotNull NSObject protocol_metadata);

    /**
     * [@function] nw_content_context_copy_protocol_metadata
     * 
     * Copy the per-protocol metadata from a parent content context
     * 
     * @param context  The context context parent object
     * @param protocol The definition identifier of the protocol to retrieve metadata for
     * @return Returns the metadata registered for the protocol, or NULL if there is none
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_content_context_copy_protocol_metadata(@NotNull NSObject context,
            @NotNull NSObject protocol);

    /**
     * [@function] nw_content_context_foreach_protocol_metadata
     * 
     * Access all per-protocol metadata objects from a parent content context
     * 
     * @param context       The context context parent object
     * @param foreach_block A block in which protocol definition and metadata will be sent
     * 
     *                      API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_content_context_foreach_protocol_metadata(@NotNull NSObject context,
            @NotNull @ObjCBlock(name = "call_nw_content_context_foreach_protocol_metadata") Block_nw_content_context_foreach_protocol_metadata foreach_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_content_context_foreach_protocol_metadata {
        @Generated
        void call_nw_content_context_foreach_protocol_metadata(@NotNull NSObject arg0, @NotNull NSObject arg1);
    }

    /**
     * [@function] nw_connection_create
     * 
     * Creates a networking connection to an endpoint.
     * 
     * @param endpoint
     *                   The remote endpoint to connect to.
     * 
     * @param parameters
     *                   The parameters to use for the connection. The data mode,
     *                   either datagram or stream, must be set.
     * 
     * @return
     *         Returns an allocated nw_connection_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_connection_create(@NotNull NSObject endpoint, @NotNull NSObject parameters);

    /**
     * [@function] nw_connection_copy_endpoint
     * 
     * Retrieves the remote endpoint for a connection.
     * 
     * @param connection
     *                   The connection object.
     * 
     * @return
     *         Returns an nw_endpoint_t object on success.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_connection_copy_endpoint(@NotNull NSObject connection);

    /**
     * [@function] nw_connection_copy_parameters
     * 
     * Retrieves the parameters for a connection.
     * 
     * @param connection
     *                   The connection object.
     * 
     * @return
     *         Returns an nw_parameters_t object on success.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_connection_copy_parameters(@NotNull NSObject connection);

    /**
     * [@function] nw_connection_set_state_changed_handler
     * 
     * Sets the state change handler. For clients that need to perform cleanup when the
     * connection has been cancelled, the nw_connection_state_cancelled state will
     * be delivered last.
     * 
     * @param connection
     *                   The connection object.
     * 
     * @param handler
     *                   The state changed handler to call when the connection state changes.
     *                   Pass NULL to remove the state changed handler.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_set_state_changed_handler(@NotNull NSObject connection,
            @Nullable @ObjCBlock(name = "call_nw_connection_set_state_changed_handler") Block_nw_connection_set_state_changed_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_set_state_changed_handler {
        @Generated
        void call_nw_connection_set_state_changed_handler(int state, @Nullable NSObject error);
    }

    /**
     * [@function] nw_connection_set_viability_changed_handler
     * 
     * Define a callback to be fired when the viability of the connection changes.
     * This indicates whether or not read and write calls will succeed on a ready
     * connection.
     * 
     * @param connection
     *                   The connection object.
     * 
     * @param handler
     *                   The event handler to call when the connection viability changes. The value will
     *                   be true when the connection is viable, and false otherwise.
     *                   Pass NULL to remove the event handler.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_set_viability_changed_handler(@NotNull NSObject connection,
            @Nullable @ObjCBlock(name = "call_nw_connection_set_viability_changed_handler") Block_nw_connection_set_viability_changed_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_set_viability_changed_handler {
        @Generated
        void call_nw_connection_set_viability_changed_handler(boolean value);
    }

    /**
     * [@function] nw_connection_set_better_path_available_handler
     * 
     * Define a callback to be fired when a better path is available or not.
     * This indicates whether or not a preferred path is available for the
     * connection.
     * 
     * @param connection
     *                   The connection object.
     * 
     * @param handler
     *                   The event handler to call when the better path availability changes. The value
     *                   will be true when a better path is available, and false otherwise.
     *                   Pass NULL to remove the event handler.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_set_better_path_available_handler(@NotNull NSObject connection,
            @Nullable @ObjCBlock(name = "call_nw_connection_set_better_path_available_handler") Block_nw_connection_set_better_path_available_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_set_better_path_available_handler {
        @Generated
        void call_nw_connection_set_better_path_available_handler(boolean value);
    }

    /**
     * [@function] nw_connection_set_path_changed_handler
     * 
     * Define a callback to be fired when the connection's path changes.
     * 
     * @param connection
     *                   The connection object.
     * 
     * @param handler
     *                   The event handler to call when the connection's path changes.
     *                   Pass NULL to remove the event handler.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_set_path_changed_handler(@NotNull NSObject connection,
            @Nullable @ObjCBlock(name = "call_nw_connection_set_path_changed_handler") Block_nw_connection_set_path_changed_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_set_path_changed_handler {
        @Generated
        void call_nw_connection_set_path_changed_handler(@NotNull NSObject path);
    }

    /**
     * [@function] nw_connection_set_queue
     * 
     * Sets the client callback queue, on which blocks for events will
     * be scheduled. This must be done before calling nw_connection_start().
     * 
     * @param connection
     *                   The connection object.
     * 
     * @param queue
     *                   The client's dispatch queue.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_set_queue(@NotNull NSObject connection, @NotNull NSObject queue);

    /**
     * [@function] nw_connection_start
     * 
     * Starts the connection, which will cause the connection
     * to evaluate its path, do resolution, and try to become
     * readable and writable. Once started, a connection
     * must be cancelled using nw_connection_cancel() or
     * nw_connection_force_cancel() when it is no longer needed.
     * 
     * @param connection
     *                   The connection object.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_start(@NotNull NSObject connection);

    /**
     * [@function] nw_connection_restart
     * 
     * Connections in the waiting state will normally re-attempt
     * on network changes. Call nw_connection_restart() to force
     * a connection in the waiting state to retry connection
     * establishment even without a network change. Calls to restart
     * for connections that are not in the waiting state will be
     * ignored.
     * 
     * @param connection
     *                   The connection object.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_restart(@NotNull NSObject connection);

    /**
     * [@function] nw_connection_cancel
     * 
     * Cancel the connection. This will close the connection, and negotiate over the network
     * if applicable for the protocol. The process of cancellation will be completed
     * asynchronously, and the final callback event delivered to the caller will be a state
     * update with a value of nw_connection_state_cancelled. Once this update is delivered, the
     * caller may clean up any associated memory or objects.
     * 
     * Outstanding sends and receives will receive errors before the state changes to cancelled.
     * There is no guarantee that any outstanding sends that have not yet delivered send completion handlers
     * will send data before the connection is closed.
     * 
     * @param connection
     *                   The connection object.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_cancel(@NotNull NSObject connection);

    /**
     * [@function] nw_connection_force_cancel
     * 
     * A variant of nw_connection_cancel() that indicates that the protocol stack should
     * not close gracefully, but close as quickly as possible without negotiation. For example,
     * a force close would lead to TCP RST packets being sent, as opposed to negotiating with
     * FIN packets.
     * 
     * @param connection
     *                   The connection object.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_force_cancel(@NotNull NSObject connection);

    /**
     * [@function] nw_connection_cancel_current_endpoint
     * 
     * Cancel the currently connected endpoint, causing the connection
     * to fall through to the next endpoint if available, or fail if no
     * more endpoints are available. This is primarily useful for connections
     * which do not have reliable handshakes, such as UDP. If data is sent
     * on the connection with no response, canceling the current endpoint
     * will allow another address or interface to be attempted.
     * 
     * @param connection
     *                   The connection object.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_cancel_current_endpoint(@NotNull NSObject connection);

    /**
     * [@function] nw_connection_receive
     * 
     * Receive data from a connection. This may be called before the connection
     * is ready, in which case the receive request will be queued until the
     * connection is ready. The completion handler will be invoked exactly
     * once for each call, so the client must call this function multiple
     * times to receive multiple chunks of data. For protocols that
     * support flow control, such as TCP, calling receive opens the receive
     * window. If the client stops calling receive, the receive window will
     * fill up and the remote peer will stop sending.
     * 
     * @param connection
     *                                  The connection object on which to receive data. The connection should
     *                                  be in the ready state.
     * 
     * @param minimum_incomplete_length
     *                                  The minimum length to receive from the connection, until the content
     *                                  is complete. Content will be delivered when at least the minimum is available,
     *                                  or the content is complete, whichever comes first.
     * 
     * @param maximum_length
     *                                  The maximum length to receive from the connection.
     * 
     * @param completion
     *                                  A callback to be called when content has been received.
     * 
     *                                  API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_receive(@NotNull NSObject connection, int minimum_incomplete_length,
            int maximum_length,
            @NotNull @ObjCBlock(name = "call_nw_connection_receive") Block_nw_connection_receive completion);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_receive {
        @Generated
        void call_nw_connection_receive(@Nullable NSObject content, @Nullable NSObject context, boolean is_complete,
                @Nullable NSObject error);
    }

    /**
     * [@function] nw_connection_receive_message
     * 
     * Receive a single atomic message from a connection. The completion
     * handler will be invoked exactly once for each call, so the client
     * must call this function multiple times to receive multiple messages.
     * 
     * @param connection
     *                   The connection object on which to receive the message. The connection
     *                   should be in the ready state.
     * 
     * @param completion
     *                   A callback to be called when the message has been received, or an error
     *                   has occurred.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_receive_message(@NotNull NSObject connection,
            @NotNull @ObjCBlock(name = "call_nw_connection_receive_message") Block_nw_connection_receive_message completion);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_receive_message {
        @Generated
        void call_nw_connection_receive_message(@Nullable NSObject content, @Nullable NSObject context,
                boolean is_complete, @Nullable NSObject error);
    }

    /**
     * [@function] nw_connection_send
     * 
     * Send data on a connection. This may be called before the connection is ready,
     * in which case the send will be enqueued until the connection is ready to send.
     * This is an asynchronous send and the completion block can be used to
     * determine when the send is complete. There is nothing preventing a client
     * from issuing an excessive number of outstanding sends. To minimize memory
     * footprint and excessive latency as a consequence of buffer bloat, it is
     * advisable to keep a low number of outstanding sends. The completion block
     * can be used to pace subsequent sends.
     * 
     * @param connection
     *                    The connection object on which to send data.
     * 
     * @param content
     *                    A data object to send. This may be NULL only if this send is marking a context
     *                    (a message or complete connection) as complete in the sending direction.
     * 
     * @param context
     *                    The context associated with the content, which represents a logical message
     *                    to be sent on the connection. All content sent within a single context will
     *                    be sent as an in-order unit, up until the point that the context is marked
     *                    complete (see is_complete). Once a context is marked complete, it may be re-used
     *                    as a new logical message. Protocols like TCP that cannot send multiple
     *                    independent messages at once (serial streams) will only start processing a new
     *                    context once the prior context has been marked complete.
     * 
     *                    The context can hold protocol metadata to define how to send content, such
     *                    as flags for IP packets.
     * 
     *                    The context also can define properties that allow a message to ordered relative
     *                    to other messages if multiple messages are queued. These properties include
     *                    relative priority, expiration, and antecedent relationships. Some protocols
     *                    support re-ordering messages within a single connection. For other protocols
     *                    that do not, like TCP, these properties still take effect when enqueuing data
     *                    into the stream's send buffer. The ordering of messages applies to the first
     *                    calls to send on a given context.
     * 
     *                    In order to close a connection on the sending side (a "write close"), send
     *                    a context that is marked as "final" and mark is_complete. The convenience definition
     *                    NW_CONNECTION_FINAL_MESSAGE_CONTEXT may be used to define the default final context
     *                    for a connection. If the caller wants to treat the entire connection as a single
     *                    stream, with only one context, set NW_CONNECTION_FINAL_MESSAGE_CONTEXT for all
     *                    sends; marking is_complete on the final send call will send a "write close".
     *                    Using NW_CONNECTION_DEFAULT_STREAM_CONTEXT has the same behavior as sending
     *                    NW_CONNECTION_FINAL_MESSAGE_CONTEXT.
     * 
     *                    To send basic datagrams on a connection, use NW_CONNECTION_DEFAULT_MESSAGE_CONTEXT
     *                    and pass is_complete as true for each datagram.
     * 
     *                    To send data as a single stream on a connection, use NW_CONNECTION_DEFAULT_STREAM_CONTEXT
     *                    and pass is_complete as true only to mark the end of the stream.
     * 
     * @param is_complete
     *                    A flag indicating if the caller's sending context (logical message) is now complete.
     * 
     *                    Until a context is marked complete, content sent for other contexts may not
     *                    be sent immediately (if the protocol requires sending bytes serially, like TCP).
     * 
     *                    For datagram protocols, like UDP, is_complete indicates that the content represents
     *                    a complete datagram.
     * 
     *                    When sending directly on streaming protocols like TCP, is_complete can be used to
     *                    indicate that the connection should send a "write close" (a TCP FIN) if the sending
     *                    context is the final context on the connection. Specifically, to send a "write close",
     *                    pass NW_CONNECTION_FINAL_MESSAGE_CONTEXT or NW_CONNECTION_DEFAULT_STREAM_CONTEXT for the
     *                    context (or create a custom context and set nw_content_context_set_is_final()), and pass
     *                    true for is_complete.
     * 
     * @param completion
     *                    A callback to be called when the data has been sent, or an error has occurred.
     *                    This callback does not indicate that the remote side has acknowledged the data.
     *                    This callback does indicate that the data has either been sent or it has been
     *                    enqueued to be sent.
     * 
     *                    API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_send(@NotNull NSObject connection, @Nullable NSObject content,
            @NotNull NSObject context, boolean is_complete,
            @NotNull @ObjCBlock(name = "call_nw_connection_send") Block_nw_connection_send completion);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_send {
        @Generated
        void call_nw_connection_send(@Nullable NSObject error);
    }

    /**
     * [@function] nw_connection_batch
     * 
     * Batch several send and/or receive operations together, to hint to
     * the connection that multiple send or receive operations are expected
     * in quick succession.
     * 
     * @param connection
     *                    The connection object.
     * 
     * @param batch_block
     *                    The batch block will be invoked immediately upon calling this function.
     *                    The client may call nw_connection_send() or nw_connection_receive()
     *                    multiple times within the block, and the connection will attempt to
     *                    batch these operations when the block returns.
     * 
     *                    API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_batch(@NotNull NSObject connection,
            @NotNull @ObjCBlock(name = "call_nw_connection_batch") Block_nw_connection_batch batch_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_batch {
        @Generated
        void call_nw_connection_batch();
    }

    /**
     * [@function] nw_connection_copy_description
     * 
     * Copy a human-readable description of the connection.
     * 
     * @param connection
     *                   The connection object.
     * 
     * @return
     *         Returns a human-readable string description of the connection.
     *         The caller must call free() on the string.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native BytePtr nw_connection_copy_description(@NotNull NSObject connection);

    /**
     * [@function] nw_connection_copy_current_path
     * 
     * Copy the current path for a connection. If a connection is
     * established, this will reflect the connected path.
     * 
     * @param connection
     *                   The connection object.
     * 
     * @return
     *         Returns a retained path object, or NULL if the connection
     *         has not been started or has been cancelled.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_connection_copy_current_path(@NotNull NSObject connection);

    /**
     * [@function] nw_connection_copy_protocol_metadata
     * 
     * Copy the connection-wide metadata for a specific protocol.
     * This allows the caller to introspect per-protocol state,
     * only once the connection has been established. This
     * metadata is also available when receiving data through
     * the content context.
     * 
     * @param connection
     *                   The connection object.
     * 
     * @param definition
     *                   The protocol definition for which metadata will be returned.
     * 
     * @return
     *         Returns a retained protocol metadata object, or NULL if the connection
     *         has not been established yet or is cancelled.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_connection_copy_protocol_metadata(@NotNull NSObject connection,
            @NotNull NSObject definition);

    /**
     * [@function] nw_connection_get_maximum_datagram_size
     * 
     * Check for the maximum datagram size that can be written
     * on the connection. Any datagrams written should be less
     * than or equal to this size.
     * 
     * @param connection
     *                   The connection object.
     * 
     * @return
     *         Returns a datagram size based on the current MTU and the
     *         overhead of the protocols being used.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_connection_get_maximum_datagram_size(@NotNull NSObject connection);

    /**
     * [@function] nw_connection_access_establishment_report
     * 
     * Access the establishment report for a connection. The report will be
     * NULL until the connection is in the "ready" state.
     * 
     * The callback block will be invoked exactly once on the provided queue.
     * 
     * @param connection
     *                     An established connection.
     * 
     * @param queue
     *                     The dispatch queue on which to call the access_block.
     * 
     * @param access_block
     *                     A block to invoke with the establishment report, which may be NULL if the
     *                     connection not ready.
     * 
     *                     API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_access_establishment_report(@NotNull NSObject connection,
            @NotNull NSObject queue,
            @NotNull @ObjCBlock(name = "call_nw_connection_access_establishment_report") Block_nw_connection_access_establishment_report access_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_access_establishment_report {
        @Generated
        void call_nw_connection_access_establishment_report(@Nullable NSObject report);
    }

    /**
     * [@function] nw_establishment_report_get_duration_milliseconds
     * 
     * Retrieve the duration of the connection's establishment. This is
     * the total time in milliseconds from when the connection attempt began
     * until the connection becomes ready, including resolution, proxy
     * evaluation, and protocol handshakes.
     * 
     * @param report
     *               An establishment report.
     * 
     * @return
     *         Returns the number of milliseconds the connection took to establish.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_establishment_report_get_duration_milliseconds(@NotNull NSObject report);

    /**
     * [@function] nw_establishment_report_get_attempt_started_after_milliseconds
     * 
     * Retrieve the delay from calling start() after which the successful connection
     * attempt began. For connections that succeed on the first attempt, this value
     * will be 0. For connections that move into the "waiting" state, this
     * value will be greater than 0.
     * 
     * @param report
     *               An establishment report.
     * 
     * @return
     *         Returns the number of milliseconds from connection start to the beginning
     *         of the successful connection attempt.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_establishment_report_get_attempt_started_after_milliseconds(@NotNull NSObject report);

    /**
     * [@function] nw_establishment_report_get_previous_attempt_count
     * 
     * Retrieve the number of connection attempts made before the successful
     * attempt. For connections that succeed on the first attempt, this value
     * will be 0. For connections that move into the "waiting" state, this
     * value will be greater than 0.
     * 
     * @param report
     *               An establishment report.
     * 
     * @return
     *         Returns the number of connection attempts made before the successful attempt.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native int nw_establishment_report_get_previous_attempt_count(@NotNull NSObject report);

    /**
     * [@function] nw_establishment_report_get_used_proxy
     * 
     * Check if the connection used a proxy during establishment.
     * 
     * @param report
     *               An establishment report.
     * 
     * @return
     *         Returns true if the connection used a proxy, false otherwise.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_establishment_report_get_used_proxy(@NotNull NSObject report);

    /**
     * [@function] nw_establishment_report_get_proxy_configured
     * 
     * Check if a proxy configuration applied to the connection,
     * even if the connection did not end up using a proxy for the
     * successful attempt.
     * 
     * @param report
     *               An establishment report.
     * 
     * @return
     *         Returns true if a proxy configuration applied to the connection,
     *         false otherwise.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_establishment_report_get_proxy_configured(@NotNull NSObject report);

    /**
     * [@function] nw_establishment_report_copy_proxy_endpoint
     * 
     * Access the endpoint of the proxy used by a connection, if applicable.
     * 
     * @param report
     *               An establishment report.
     * 
     * @return
     *         Returns an allocated endpoint object if a proxy was used by the connection,
     *         or NULL if no proxy was used.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_establishment_report_copy_proxy_endpoint(@NotNull NSObject report);

    /**
     * [@function] nw_establishment_report_enumerate_resolutions
     * 
     * Enumerate the steps of connection establishment that involved endpoint
     * resolution, such as DNS hostname resolution and Bonjour service resolution.
     * The provided block will be called inline zero or more times.
     * 
     * @param report
     *                        An establishment report.
     * 
     * @param enumerate_block
     *                        A block to be invoked zero or more times, once for each step of resolution
     *                        used during connection establishment.
     * 
     *                        The values passed to the enumerator are:
     *                        - source: The source of the resolution (query or cache).
     *                        - milliseconds: The number of milliseconds spent on this resolution step.
     *                        - endpoint_count: The number of resolved endpoints discovered by the resolution step.
     *                        - successful_endpoint: The resolved endpoint that led to a successful connection.
     *                        - preferred_endpoint: The first resolved endpoint attempted, which may be the same as the
     *                        successful_endpoint.
     * 
     *                        Returning true from the block indicates that the enumeration should continue.
     *                        Returning false indicates that the enumeration should stop.
     * 
     *                        API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_establishment_report_enumerate_resolutions(@NotNull NSObject report,
            @NotNull @ObjCBlock(name = "call_nw_establishment_report_enumerate_resolutions") Block_nw_establishment_report_enumerate_resolutions enumerate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_establishment_report_enumerate_resolutions {
        @Generated
        boolean call_nw_establishment_report_enumerate_resolutions(int source, long milliseconds, int endpoint_count,
                @NotNull NSObject successful_endpoint, @NotNull NSObject preferred_endpoint);
    }

    /**
     * [@function] nw_establishment_report_enumerate_protocols
     * 
     * Enumerate the protocols used in the established connection.
     * The provided block will be called inline zero or more times.
     * 
     * @param report
     *                        An establishment report.
     * 
     * @param enumerate_block
     *                        A block to be invoked zero or more times, once for each protocol
     *                        used in the established connection.
     * 
     *                        The values passed to the enumerator are:
     *                        - protocol: The protocol definition.
     *                        - handshake_milliseconds: The number of milliseconds spent on the protocol's handshake.
     *                        - handshake_rtt_milliseconds: The round trip time in milliseconds measured by the
     *                        protocol's handshake.
     * 
     *                        Returning true from the block indicates that the enumeration should continue.
     *                        Returning false indicates that the enumeration should stop.
     * 
     *                        API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_establishment_report_enumerate_protocols(@NotNull NSObject report,
            @NotNull @ObjCBlock(name = "call_nw_establishment_report_enumerate_protocols") Block_nw_establishment_report_enumerate_protocols enumerate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_establishment_report_enumerate_protocols {
        @Generated
        boolean call_nw_establishment_report_enumerate_protocols(@NotNull NSObject protocol,
                long handshake_milliseconds, long handshake_rtt_milliseconds);
    }

    /**
     * [@function] nw_connection_create_new_data_transfer_report
     * 
     * Create a new data transfer report on a connection. Multiple
     * reports may be created for a single connection. The report begins
     * capturing data when the connection becomes ready, or when the
     * report is created (whichever occurs last).
     * 
     * Call nw_data_transfer_report_collect() to complete collection of
     * report, after which point the details of the report will be available.
     * 
     * @param connection
     *                   A connection object, in or before the ready state.
     * 
     * @return
     *         Returns an allocated nw_data_transfer_report_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_connection_create_new_data_transfer_report(@NotNull NSObject connection);

    /**
     * [@function] nw_data_transfer_report_get_state
     * 
     * Access the state of a data transfer report. Once a report
     * is "collected", individual fields may be read.
     * 
     * @param report
     *               A data transfer report to check.
     * 
     * @return
     *         Returns the current state of the data transfer report.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native int nw_data_transfer_report_get_state(@NotNull NSObject report);

    /**
     * [@function] nw_data_transfer_report_collect
     * 
     * Mark a data transfer report as complete, and request collection of
     * values. Once the report has been collected, the callback block
     * will be invoked exactly once on the provided dispatch queue.
     * 
     * If a connection is cancelled or fails prior to the report being collected,
     * the report will automatically be collected. Calling
     * nw_data_transfer_report_collect() will be redundant but not harmful.
     * 
     * @param report
     *                      A data transfer report to check.
     * 
     * @param queue
     *                      The dispatch queue on which to call the collect_block.
     * 
     * @param collect_block
     *                      A block to invoke once the report has been collected.
     * 
     *                      API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_data_transfer_report_collect(@NotNull NSObject report, @NotNull NSObject queue,
            @NotNull @ObjCBlock(name = "call_nw_data_transfer_report_collect") Block_nw_data_transfer_report_collect collect_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_data_transfer_report_collect {
        @Generated
        void call_nw_data_transfer_report_collect(@NotNull NSObject report);
    }

    /**
     * [@function] nw_data_transfer_report_get_duration_milliseconds
     * 
     * Retrieve the duration of the data transfer report. This is a length
     * of time in milliseconds which can be used to calculate throughput
     * when compared to application and transport byte counts.
     * 
     * The start time is calculated from when the report was created, or the connection
     * became ready if the connection was not ready when the report was created.
     * The duration ends when the report is collected, or the connection fails
     * or is cancelled.
     * 
     * @param report
     *               A data transfer report in the "collected" state.
     * 
     * @return
     *         Returns the duration of the data transport report in milliseconds, or 0
     *         if the report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_duration_milliseconds(@NotNull NSObject report);

    /**
     * [@function] nw_data_transfer_report_get_path_count
     * 
     * Retrieve the number of paths used by the connection for the
     * duration of the report. Any value greater than or equal to 0 and
     * less than this count may be used as a "path_index" for retrieving
     * specific details from the report.
     * 
     * @param report
     *               A data transfer report in the "collected" state.
     * 
     * @return
     *         Returns the number of paths used by the connection, which
     *         limits the value of the "path_index" parameter used in other report
     *         functions. Returns 0 if the report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native int nw_data_transfer_report_get_path_count(@NotNull NSObject report);

    /**
     * [@function] nw_data_transfer_report_get_received_ip_packet_count
     * 
     * Retrieve the number of IP packets received on a given path for the
     * duration of the report.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   Passing NW_ALL_PATHS for this function returns
     *                   the sum of all paths.
     * 
     * @return
     *         Returns the number of IP packets received, or 0
     *         if the report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_received_ip_packet_count(@NotNull NSObject report,
            int path_index);

    /**
     * [@function] nw_data_transfer_report_get_sent_ip_packet_count
     * 
     * Retrieve the number of IP packets sent on a given path for the
     * duration of the report.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   Passing NW_ALL_PATHS for this function returns
     *                   the sum of all paths.
     * 
     * @return
     *         Returns the number of IP packets sent, or 0 if the report is not
     *         in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_sent_ip_packet_count(@NotNull NSObject report,
            int path_index);

    /**
     * [@function] nw_data_transfer_report_get_received_transport_byte_count
     * 
     * Retrieve the number of transport protocol bytes (such as TCP stream bytes)
     * received on a given path for the duration of the report.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   Passing NW_ALL_PATHS for this function returns
     *                   the sum of all paths.
     * 
     * @return
     *         Returns the number of transport protocol bytes received, or 0 if the
     *         report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_received_transport_byte_count(@NotNull NSObject report,
            int path_index);

    /**
     * [@function] nw_data_transfer_report_get_received_transport_duplicate_byte_count
     * 
     * Retrieve the number of duplicate transport protocol bytes (such as
     * duplicate TCP bytes) received on a given path for the duration of the report.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   Passing NW_ALL_PATHS for this function returns
     *                   the sum of all paths.
     * 
     * @return
     *         Returns the number of duplicate transport protocol bytes received, or 0
     *         if the report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_received_transport_duplicate_byte_count(
            @NotNull NSObject report, int path_index);

    /**
     * [@function] nw_data_transfer_report_get_received_transport_out_of_order_byte_count
     * 
     * Retrieve the number of out-of-order transport protocol bytes (such as
     * out-of-order TCP bytes) received on a given path for the duration of the report.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   Passing NW_ALL_PATHS for this function returns
     *                   the sum of all paths.
     * 
     * @return
     *         Returns the number of out-of-order transport protocol bytes received, or 0
     *         if the report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_received_transport_out_of_order_byte_count(
            @NotNull NSObject report, int path_index);

    /**
     * [@function] nw_data_transfer_report_get_sent_transport_byte_count
     * 
     * Retrieve the number of transport protocol bytes (such as TCP stream bytes)
     * sent on a given path for the duration of the report.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   Passing NW_ALL_PATHS for this function returns
     *                   the sum of all paths.
     * 
     * @return
     *         Returns the number of transport protocol bytes sent, or 0
     *         if the report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_sent_transport_byte_count(@NotNull NSObject report,
            int path_index);

    /**
     * [@function] nw_data_transfer_report_get_sent_transport_retransmitted_byte_count
     * 
     * Retrieve the number of retransmitted transport protocol bytes (such as
     * retransmitted TCP bytes) sent on a given path for the duration of the report.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   Passing NW_ALL_PATHS for this function returns
     *                   the sum of all paths.
     * 
     * @return
     *         Returns the number of retransmitted transport protocol bytes sent, or 0
     *         if the report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_sent_transport_retransmitted_byte_count(
            @NotNull NSObject report, int path_index);

    /**
     * [@function] nw_data_transfer_report_get_transport_smoothed_rtt_milliseconds
     * 
     * Retrieve the smoothed average for the transport protocol's round trip time
     * (RTT) on a given path for the duration of the report, measured in milliseconds.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   For non-multipath connections, pass 0 as the path index to access
     *                   the single path. Passing NW_ALL_PATHS for this function is
     *                   equivalent to passing 0.
     * 
     * @return
     *         Returns the smoothed RTT as measured by the transport protocol, or 0
     *         if the report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_transport_smoothed_rtt_milliseconds(@NotNull NSObject report,
            int path_index);

    /**
     * [@function] nw_data_transfer_report_get_transport_minimum_rtt_milliseconds
     * 
     * Retrieve the minimum (best) round trip time (RTT) on a given path for
     * the duration of the report, measured in milliseconds.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   For non-multipath connections, pass 0 as the path index to access
     *                   the single path. Passing NW_ALL_PATHS for this function is
     *                   equivalent to passing 0.
     * 
     * @return
     *         Returns the minimum RTT as measured by the transport protocol, or 0
     *         if the report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_transport_minimum_rtt_milliseconds(@NotNull NSObject report,
            int path_index);

    /**
     * [@function] nw_data_transfer_report_get_transport_rtt_variance
     * 
     * Retrieve the variance of the round trip time (RTT) on a given path for
     * the duration of the report.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   For non-multipath connections, pass 0 as the path index to access
     *                   the single path. Passing NW_ALL_PATHS for this function is
     *                   equivalent to passing 0.
     * 
     * @return
     *         Returns the RTT variance as measured by the transport protocol, or 0
     *         if the report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_transport_rtt_variance(@NotNull NSObject report,
            int path_index);

    /**
     * [@function] nw_data_transfer_report_get_received_application_byte_count
     * 
     * Retrieve the number of application bytes received on a given
     * path for the duration of the report.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   Passing NW_ALL_PATHS for this function returns
     *                   the sum of all paths.
     * 
     * @return
     *         Returns the number of application bytes received, or 0
     *         if the report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_received_application_byte_count(@NotNull NSObject report,
            int path_index);

    /**
     * [@function] nw_data_transfer_report_get_sent_application_byte_count
     * 
     * Retrieve the number of application bytes sent on a given
     * path for the duration of the report.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   Passing NW_ALL_PATHS for this function returns
     *                   the sum of all paths.
     * 
     * @return
     *         Returns the number of application bytes sent, or 0
     *         if the report is not in the "collected" state.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_sent_application_byte_count(@NotNull NSObject report,
            int path_index);

    /**
     * [@function] nw_data_transfer_report_copy_path_interface
     * 
     * Retrieve the interface used for data transfer for a given
     * path used by a connection.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   Passing NW_ALL_PATHS for this function is
     *                   equivalent to passing 0.
     * 
     * @return
     *         Returns a retained nw_interface_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails if the report is not yet collected.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_data_transfer_report_copy_path_interface(@NotNull NSObject report, int path_index);

    /**
     * [@function] nw_framer_protocol_create_message
     * 
     * Create an instance of a framer message on which per-
     * message options can be configured when sending data
     * on a connection. This is intended to be used by the
     * application above the connection to send message data
     * down to the framer protocol instance.
     * 
     * @param definition
     *                   The framer protocol definition, as retrieved from
     *                   nw_protocol_options_copy_definition() on the framer options.
     * 
     * @return
     *         Returns a retained protocol metadata object.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_framer_protocol_create_message(@NotNull NSObject definition);

    /**
     * [@function] nw_protocol_metadata_is_framer_message
     * 
     * Checks if a protocol metadata object is a framer protocol
     * message. This indicates whether or not it is compatible
     * with the framer message setters and accessors.
     * 
     * @param metadata
     *                 The protocol metadata to check.
     * 
     * @return
     *         Returns true if the metadata is associated with a framer
     *         protocol definition, false otherwise.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_framer_message(@NotNull NSObject metadata);

    /**
     * [@function] nw_framer_message_create
     * 
     * Create a framer message, given a framer instance. This
     * is intended to be used within the implementation of
     * the framer protocol to create messages that are delivered
     * as input to the application.
     * 
     * @param framer
     *               The framer instance object.
     * 
     * @return
     *         Returns a retained framer message object.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_framer_message_create(@NotNull NSObject framer);

    /**
     * [@function] nw_framer_message_set_value
     * 
     * Set a key-value pair on a framer message, with a custom
     * dispose function for the value.
     * 
     * @param message
     *                      The framer message object.
     * 
     * @param key
     *                      The string key to identify the value.
     * 
     * @param value
     *                      A pointer to the value to store.
     * 
     * @param dispose_value
     *                      A block to invoke to dispose the stored value.
     * 
     *                      API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_message_set_value(@NotNull NSObject message,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable VoidPtr value,
            @Nullable @ObjCBlock(name = "call_nw_framer_message_set_value") Block_nw_framer_message_set_value dispose_value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_message_set_value {
        @Generated
        void call_nw_framer_message_set_value(@NotNull VoidPtr value);
    }

    /**
     * [@function] nw_framer_message_access_value
     * 
     * Access the value with a key on a framer message.
     * 
     * @param message
     *                     The framer message object.
     * 
     * @param key
     *                     The string key to identify the value.
     * 
     * @param access_value
     *                     A block to invoke inline with the pointer to the stored value.
     *                     This pointer may be NULL if no value is stored for the key.
     * 
     * @return
     *         Returns the boolean value returned by the access_value block,
     *         or else false if the parameters were invalid.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_framer_message_access_value(@NotNull NSObject message,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @NotNull @ObjCBlock(name = "call_nw_framer_message_access_value") Block_nw_framer_message_access_value access_value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_message_access_value {
        @Generated
        boolean call_nw_framer_message_access_value(@Nullable ConstVoidPtr arg0);
    }

    /**
     * [@function] nw_framer_message_set_object_value
     * 
     * Set a key-value pair on a framer message, where the
     * value is a reference-counted object.
     * 
     * @param message
     *                The framer message object.
     * 
     * @param key
     *                The string key to identify the value.
     * 
     * @param value
     *                A reference counted object to store.
     * 
     *                API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_message_set_object_value(@NotNull NSObject message,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * [@function] nw_framer_message_copy_object_value
     * 
     * Copy the stored object value using a key on a framer message.
     * 
     * @param message
     *                The framer message object.
     * 
     * @param key
     *                The string key to identify the value.
     * 
     * @return
     *         Returns a reference counted object with a +1 reference count,
     *         or NULL if no value was found for the specified key.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object nw_framer_message_copy_object_value(@NotNull NSObject message,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

    /**
     * [@function] nw_framer_create_definition
     * 
     * Create a protocol definition for a custom framer protocol.
     * 
     * @param identifier
     *                      A string identifier used to name this framer protocol. This does not
     *                      define uniqueness, and is primarily used for logging and debugging.
     * 
     * @param flags
     *                      Flags to describe extended options on framer protocol behavior,
     *                      all prefixed with "NW_FRAMER_CREATE_FLAGS_".
     * 
     * @param start_handler
     *                      A block to be invoked when starting a new instance of the framer
     *                      protocol. This may occur more than once for a single nw_connection.
     * 
     * @return
     *         Returns a retained protocol definition that can be used with protocol
     *         options and metadata.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_framer_create_definition(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String identifier,
            int flags,
            @NotNull @ObjCBlock(name = "call_nw_framer_create_definition") Block_nw_framer_create_definition start_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_create_definition {
        @Generated
        int call_nw_framer_create_definition(@NotNull NSObject framer);
    }

    /**
     * [@function] nw_framer_create_options
     * 
     * Create protocol options from a framer definition. This object can
     * be added to an nw_protocol_stack_t to be used in an nw_connection_t
     * or an nw_listener_t.
     * 
     * @param framer_definition
     *                          A protocol definition created with nw_framer_create_definition().
     * 
     * @return
     *         Returns a retained protocol options object to add into a protocol
     *         stack.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_framer_create_options(@NotNull NSObject framer_definition);

    /**
     * [@function] nw_framer_set_input_handler
     * 
     * Set a handler block to be invoked whenever new input
     * data is available to be parsed. When this block is
     * run, the implementation should call functions like
     * nw_framer_parse_input() and nw_framer_deliver_input().
     * 
     * Input events are edge triggered. The input_handler block
     * should continue to call nw_framer_parse_input()
     * until nw_framer_parse_input() can no longer produce
     * enough bytes to satisfy the request, or the protocol
     * needs to wait for some other event to continue processing
     * later.
     * 
     * This setter is required, and must only be set from within
     * the invocation of a nw_framer_start_handler_t.
     * 
     * @param framer
     *                      The framer instance object, passed via the
     *                      nw_framer_start_handler_t block.
     * 
     * @param input_handler
     *                      The block to invoke whenever new input data is available.
     * 
     *                      API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_set_input_handler(@NotNull NSObject framer,
            @NotNull @ObjCBlock(name = "call_nw_framer_set_input_handler") Block_nw_framer_set_input_handler input_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_set_input_handler {
        @Generated
        @NUInt
        long call_nw_framer_set_input_handler(@NotNull NSObject framer);
    }

    /**
     * [@function] nw_framer_set_output_handler
     * 
     * Set a handler block to be invoked whenever an output
     * message is ready to be sent. When this block is
     * run, the implementation should call functions like
     * nw_framer_parse_output() and nw_framer_write_output().
     * 
     * This setter is required, and must only be set from within
     * the invocation of a nw_framer_start_handler_t.
     * 
     * @param framer
     *                       The framer instance object, passed via the
     *                       nw_framer_start_handler_t block.
     * 
     * @param output_handler
     *                       The block to invoke whenever a new output message is ready
     *                       to be sent.
     * 
     *                       API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_set_output_handler(@NotNull NSObject framer,
            @NotNull @ObjCBlock(name = "call_nw_framer_set_output_handler") Block_nw_framer_set_output_handler output_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_set_output_handler {
        @Generated
        void call_nw_framer_set_output_handler(@NotNull NSObject framer, @NotNull NSObject message,
                @NUInt long message_length, boolean is_complete);
    }

    /**
     * [@function] nw_framer_set_wakeup_handler
     * 
     * Set a handler block to be invoked whenever the wakeup timer
     * set via nw_framer_schedule_wakeup() fires. This is intended to
     * be used for sending keepalives or other control traffic.
     * 
     * This setter is optional, and must only be set from within
     * the invocation of a nw_framer_start_handler_t.
     * 
     * @param framer
     *                       The framer instance object, passed via the
     *                       nw_framer_start_handler_t block.
     * 
     * @param wakeup_handler
     *                       The block to invoke whenever the timeout set by
     *                       nw_framer_schedule_wakeup() is reached.
     * 
     *                       API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_set_wakeup_handler(@NotNull NSObject framer,
            @NotNull @ObjCBlock(name = "call_nw_framer_set_wakeup_handler") Block_nw_framer_set_wakeup_handler wakeup_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_set_wakeup_handler {
        @Generated
        void call_nw_framer_set_wakeup_handler(@NotNull NSObject framer);
    }

    /**
     * [@function] nw_framer_set_stop_handler
     * 
     * Set a handler block to be invoked when the connection
     * is being disconnected, to allow the framer implementation
     * a chance to send any final data.
     * 
     * This setter is optional, and must only be set from within
     * the invocation of a nw_framer_start_handler_t.
     * 
     * @param framer
     *                     The framer instance object, passed via the
     *                     nw_framer_start_handler_t block.
     * 
     * @param stop_handler
     *                     The block to invoke when the connection is disconnected.
     * 
     *                     API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_set_stop_handler(@NotNull NSObject framer,
            @NotNull @ObjCBlock(name = "call_nw_framer_set_stop_handler") Block_nw_framer_set_stop_handler stop_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_set_stop_handler {
        @Generated
        boolean call_nw_framer_set_stop_handler(@NotNull NSObject framer);
    }

    /**
     * [@function] nw_framer_set_cleanup_handler
     * 
     * Set a handler block to be invoked when the protocol stack
     * is being torn down and deallocated. This is the opportunity
     * for the framer implementation to release any state it may
     * have saved.
     * 
     * This setter is optional, and must only be set from within
     * the invocation of a nw_framer_start_handler_t.
     * 
     * @param framer
     *                        The framer instance object, passed via the
     *                        nw_framer_start_handler_t block.
     * 
     * @param cleanup_handler
     *                        The block to invoke when the protocol stack is being deallocated.
     * 
     *                        API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_set_cleanup_handler(@NotNull NSObject framer,
            @NotNull @ObjCBlock(name = "call_nw_framer_set_cleanup_handler") Block_nw_framer_set_cleanup_handler cleanup_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_set_cleanup_handler {
        @Generated
        void call_nw_framer_set_cleanup_handler(@NotNull NSObject framer);
    }

    /**
     * [@function] nw_framer_mark_ready
     * 
     * Mark the connection associated with the framer instance
     * as ready (see nw_connection_state_ready). This is intended
     * to be used by protocols that require a handshake before being
     * able to send application data. This should only be called
     * if the return value to the nw_framer_start_handler_t block
     * was nw_framer_start_result_will_call_ready.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *               The framer instance object.
     * 
     *               API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_mark_ready(@NotNull NSObject framer);

    /**
     * [@function] nw_framer_prepend_application_protocol
     * 
     * Dynamically add a protocol to a connection establishment
     * attempt "above" the framer protocol. This means that the
     * protocol above will start running once the framer becomes
     * ready by calling nw_framer_mark_ready(). This can only
     * be used with framers that return a value of
     * nw_framer_start_result_will_call_ready to their start
     * handlers. An example of using this functionality is
     * adding a security protocol, like TLS, above a framer
     * once that framer completes its initial handshake.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *                         The framer instance object.
     * 
     * @param protocol_options
     *                         Protocol options for an application protocol to dynamically
     *                         add "above" the framer.
     * 
     * @return Returns true if the protocol was successfully added,
     *         or false it it could not be added. This will fail if
     *         the framer is already marked ready.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_framer_prepend_application_protocol(@NotNull NSObject framer,
            @NotNull NSObject protocol_options);

    /**
     * [@function] nw_framer_mark_failed_with_error
     * 
     * Mark the connection associated with the framer instance
     * as failed (see nw_connection_state_failed).
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *                   The framer instance object.
     * 
     * @param error_code
     *                   An error code to describe why the connection failed.
     * 
     *                   API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_mark_failed_with_error(@NotNull NSObject framer, int error_code);

    /**
     * [@function] nw_framer_parse_input
     * 
     * Parse currently available input from the location of the input
     * cursor in the stream or message being parsed.
     * 
     * The parse completion block will always be invoked inline exactly once.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *                                  The framer instance object.
     * 
     * @param minimum_incomplete_length
     *                                  The minimum number of bytes to parse. If this amount is
     *                                  not available, the parse completion block will be invoked
     *                                  with 0 bytes.
     * 
     * @param maximum_length
     *                                  The maximum number of bytes to parse as a contiguous buffer.
     *                                  If temp_buffer is not NULL, then this represents the length
     *                                  of valid bytes in temp_buffer.
     * 
     * @param temp_buffer
     *                                  A buffer provided by the caller to copy parse bytes into.
     *                                  If it is not NULL, it must have at least maximum_length bytes
     *                                  available, and any parsed bytes will be copied into the buffer.
     *                                  Any data stored in temp_buffer will be overwritten.
     *                                  If it is NULL, the buffer provided in the completion will not
     *                                  copy unless a copy is required to provide the minimum bytes
     *                                  as a contiguous buffer. The temp_buffer allows the caller to
     *                                  guarantee alignment properties of the buffer it parses.
     * 
     * @param parse
     *                                  The completion that provides the bytes to parse, which will
     *                                  be called exactly once.
     * 
     * @return
     *         Returns true if the parse succeeded, or false if not enough
     *         bytes were available.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_framer_parse_input(@NotNull NSObject framer, @NUInt long minimum_incomplete_length,
            @NUInt long maximum_length, @Nullable BytePtr temp_buffer,
            @NotNull @ObjCBlock(name = "call_nw_framer_parse_input") Block_nw_framer_parse_input parse);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_parse_input {
        @Generated
        @NUInt
        long call_nw_framer_parse_input(@Nullable BytePtr buffer, @NUInt long buffer_length, boolean is_complete);
    }

    /**
     * [@function] nw_framer_deliver_input
     * 
     * Deliver arbitrary data to the application. This is intended to
     * deliver any data that is generated or transformed by the
     * protocol instance. It will incur a copy of bytes.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *                     The framer instance object.
     * 
     * @param input_buffer
     *                     The bytes to deliver to the application. This must be non-NULL.
     *                     If an empty message needs to be delivered, use
     *                     nw_framer_deliver_input_no_copy().
     * 
     * @param input_length
     *                     The length of input_buffer. This must be non-zero.
     * 
     * @param message
     *                     The message to associate with the received data.
     * 
     * @param is_complete
     *                     A boolean indicating whether or not this data represents
     *                     the end of the message.
     * 
     *                     API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_deliver_input(@NotNull NSObject framer,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String input_buffer,
            @NUInt long input_length, @NotNull NSObject message, boolean is_complete);

    /**
     * [@function] nw_framer_deliver_input_no_copy
     * 
     * Deliver bytes directly to the application without any
     * transformation or copy. The bytes will start at the current
     * input cursor used for parsing, and will implicitly advance
     * the cursor by the length being delivered.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *                     The framer instance object.
     * 
     * @param input_length
     *                     The number of input bytes to deliver. This will advance
     *                     the parsing cursor by the specified number of bytes.
     * 
     *                     The length may be 0, which can be used to indicate the
     *                     end of the message if is_complete is set.
     * 
     * @param message
     *                     The message to associate with the received data.
     * 
     * @param is_complete
     *                     A boolean indicating whether or not this data represents
     *                     the end of the message.
     * 
     * @return
     *         Returns true if the input was delivered immediately, or
     *         false if it will be delivered once more bytes become available.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_framer_deliver_input_no_copy(@NotNull NSObject framer, @NUInt long input_length,
            @NotNull NSObject message, boolean is_complete);

    /**
     * [@function] nw_framer_pass_through_input
     * 
     * Mark the input side of the framer as a pass-through, which
     * means the framer will not be notified of any further input
     * data.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *               The framer instance object.
     * 
     *               API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_pass_through_input(@NotNull NSObject framer);

    /**
     * [@function] nw_framer_parse_output
     * 
     * Parse currently available output from a message from the location
     * of the output cursor in the message being parsed.
     * 
     * The parse completion block will always be invoked inline exactly once.
     * 
     * This function must only be called from within the output handler
     * set with nw_framer_set_output_handler().
     * 
     * @param framer
     *                                  The framer instance object.
     * 
     * @param minimum_incomplete_length
     *                                  The minimum number of bytes to parse. If this amount is
     *                                  not available, the parse completion block will be invoked
     *                                  with 0 bytes.
     * 
     * @param maximum_length
     *                                  The maximum number of bytes to parse as a contiguous buffer.
     *                                  If temp_buffer is not NULL, then this represents the length
     *                                  of valid bytes in temp_buffer.
     * 
     * @param temp_buffer
     *                                  A buffer provided by the caller to copy parse bytes into.
     *                                  If it is not NULL, it must have at least maximum_length bytes
     *                                  available, and any parsed bytes will be copied into the buffer.
     *                                  Any data stored in temp_buffer will be overwritten.
     *                                  If it is NULL, the buffer provided in the completion will not
     *                                  copy unless a copy is required to provide the minimum bytes
     *                                  as a contiguous buffer. The temp_buffer allows the caller to
     *                                  guarantee alignment properties of the buffer it parses.
     * 
     * @param parse
     *                                  The completion that provides the bytes to parse, which will
     *                                  be called exactly once.
     * 
     * @return
     *         Returns true if the parse succeeded, or false if not enough
     *         bytes were available.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_framer_parse_output(@NotNull NSObject framer, @NUInt long minimum_incomplete_length,
            @NUInt long maximum_length, @Nullable BytePtr temp_buffer,
            @NotNull @ObjCBlock(name = "call_nw_framer_parse_output") Block_nw_framer_parse_output parse);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_parse_output {
        @Generated
        @NUInt
        long call_nw_framer_parse_output(@Nullable BytePtr buffer, @NUInt long buffer_length, boolean is_complete);
    }

    /**
     * [@function] nw_framer_write_output
     * 
     * Write arbitrary bytes as part of an outbound message. This
     * is intended to be used for adding headers around application
     * data, or writing any other data that is generated or transformed
     * by the protocol instance. It does not pass along data directly
     * from the application.
     * 
     * This variant will copy bytes.
     * 
     * This function may be called as part of any framer callback,
     * not just the output handler.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *                      The framer instance object.
     * 
     * @param output_buffer
     *                      The bytes to write.
     * 
     * @param output_length
     *                      The length of output_buffer.
     * 
     *                      API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_write_output(@NotNull NSObject framer,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String output_buffer,
            @NUInt long output_length);

    /**
     * [@function] nw_framer_write_output_data
     * 
     * Write arbitrary bytes as part of an outbound message. This
     * is intended to be used for adding headers around application
     * data, or writing any other data that is generated or transformed
     * by the protocol instance. It does not pass along data directly
     * from the application.
     * 
     * This variant is the same as nw_framer_write_output(), but allows
     * the implementation to pass its buffer as a dispatch_data_t to
     * avoid a copy.
     * 
     * This function may be called as part of any framer callback,
     * not just the output handler.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *                    The framer instance object.
     * 
     * @param output_data
     *                    A dispatch_data_t to write.
     * 
     *                    API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_write_output_data(@NotNull NSObject framer, @NotNull NSObject output_data);

    /**
     * [@function] nw_framer_write_output_no_copy
     * 
     * Write bytes directly from the application without any
     * transformation or copy. The bytes will start at the current
     * output cursor used for parsing, and will implicitly advance
     * the cursor by the length being written.
     * 
     * This function must only be called from within the output handler
     * set with nw_framer_set_output_handler().
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *                      The framer instance object.
     * 
     * @param output_length
     *                      The number of application bytes to write. This will advance
     *                      the parsing cursor by the specified number of bytes.
     * 
     * @return
     *         Returns true if the write could be completed, otherwise
     *         false if the call was made from an invalid context
     *         or with an invalid number of bytes.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_framer_write_output_no_copy(@NotNull NSObject framer, @NUInt long output_length);

    /**
     * [@function] nw_framer_pass_through_output
     * 
     * Mark the output side of the framer as a pass-through, which
     * means the framer will not be notified of any further output
     * data.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *               The framer instance object.
     * 
     *               API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_pass_through_output(@NotNull NSObject framer);

    /**
     * [@function] nw_framer_schedule_wakeup
     * 
     * Schedule a wakeup on the framer instance for a number of
     * milliseconds into the future. If this is called multiple
     * times before the timeout is reached, the new value replaces
     * the previous value.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *                     The framer instance object.
     * 
     * @param milliseconds
     *                     The number of milliseconds into the future at which to
     *                     invoke the wakeup handler. Pass the reserved value
     *                     NW_FRAMER_WAKEUP_TIME_FOREVER to push the wakeup timer
     *                     out to "forever", effectively unscheduling the timer.
     * 
     *                     API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_schedule_wakeup(@NotNull NSObject framer, long milliseconds);

    /**
     * [@function] nw_framer_async
     * 
     * Schedule a block asynchronously on the framer instance. This
     * must be used anytime the caller wants to perform any other
     * action on the framer instance while not directly in the call stack
     * of a callback from the framer.
     * 
     * @param framer
     *                    The framer instance object.
     * 
     * @param async_block
     *                    A block to execute on the correct scheduling context for the
     *                    framer instance.
     * 
     *                    API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_framer_async(@NotNull NSObject framer,
            @NotNull @ObjCBlock(name = "call_nw_framer_async") Block_nw_framer_async async_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_async {
        @Generated
        void call_nw_framer_async();
    }

    /**
     * [@function] nw_framer_copy_remote_endpoint
     * 
     * Access the remote endpoint being used for a given
     * instance of a framer.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *               The framer instance.
     * 
     * @return
     *         Returns a retained endpoint object representing
     *         the remote side of a connection.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_framer_copy_remote_endpoint(@NotNull NSObject framer);

    /**
     * [@function] nw_framer_copy_local_endpoint
     * 
     * Access the local endpoint being used for a given
     * instance of a framer.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *               The framer instance.
     * 
     * @return
     *         Returns a retained endpoint object representing
     *         the local side of a connection.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_framer_copy_local_endpoint(@NotNull NSObject framer);

    /**
     * [@function] nw_framer_copy_parameters
     * 
     * Access the parameters being used for a given
     * instance of a framer.
     * 
     * To ensure thread safety, this function can only be called
     * in one of the callback blocks invoked on the framer, or
     * in a block passed to nw_framer_async().
     * 
     * @param framer
     *               The framer instance.
     * 
     * @return
     *         Returns a retained parameters object.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_framer_copy_parameters(@NotNull NSObject framer);

    /**
     * [@function] nw_protocol_copy_ip_definition
     * 
     * Access the definition of the default system protocol implementation
     * of IP (Internet Protocol). This protocol can be used
     * as part of a connection's protocol stack as the internet protocol.
     * 
     * @return
     *         Returns a retained protocol definition object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_protocol_copy_ip_definition();

    /**
     * [@function] nw_ip_options_set_version
     * 
     * Specify a single version of the Internet Protocol to allow.
     * Setting this value will constrain which address endpoints can
     * be used, and will filter DNS results during connection establishment.
     * 
     * @param options
     *                An IP protocol options object.
     * 
     * @param version
     *                A specific, restricted IP version.
     * 
     *                API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_ip_options_set_version(@NotNull NSObject options, int version);

    /**
     * [@function] nw_ip_options_set_hop_limit
     * 
     * Configure the IP hop limit (or 'TTL' for IPv4).
     * 
     * @param options
     *                  An IP protocol options object.
     * 
     * @param hop_limit
     *                  The hop limit to set on outgoing IP packets.
     * 
     *                  API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_ip_options_set_hop_limit(@NotNull NSObject options, byte hop_limit);

    /**
     * [@function] nw_ip_options_set_use_minimum_mtu
     * 
     * Configure IP to use the minimum MTU value, which
     * is 1280 bytes for IPv6. This value has no effect for
     * IPv4.
     * 
     * @param options
     *                        An IP protocol options object.
     * 
     * @param use_minimum_mtu
     *                        A boolean indicating that the IP should use
     *                        its minimum MTU value.
     * 
     *                        API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_ip_options_set_use_minimum_mtu(@NotNull NSObject options, boolean use_minimum_mtu);

    /**
     * [@function] nw_ip_options_set_disable_fragmentation
     * 
     * Configure IP to disable fragmentation on outgoing
     * packets.
     * 
     * @param options
     *                              An IP protocol options object.
     * 
     * @param disable_fragmentation
     *                              A boolean indicating that the IP should use
     *                              disable fragmentation on outgoing packets.
     * 
     *                              API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_ip_options_set_disable_fragmentation(@NotNull NSObject options,
            boolean disable_fragmentation);

    /**
     * [@function] nw_ip_options_set_calculate_receive_time
     * 
     * Configure IP to calculate receive time for inbound
     * packets.
     * 
     * @param options
     *                               An IP protocol options object.
     * 
     * @param calculate_receive_time
     *                               A boolean indicating that the IP packets
     *                               should mark their receive time in IP metadata.
     * 
     *                               API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_ip_options_set_calculate_receive_time(@NotNull NSObject options,
            boolean calculate_receive_time);

    /**
     * [@function] nw_ip_options_set_local_address_preference
     * 
     * Specify a preference for how to select local addresses for outbound
     * connections.
     * 
     * @param options
     *                   An IP protocol options object.
     * 
     * @param preference
     *                   Preference for how to select local addresses.
     * 
     *                   API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_ip_options_set_local_address_preference(@NotNull NSObject options, int preference);

    /**
     * [@function] nw_ip_create_metadata
     * 
     * Create an instance of IP metadata that can be used
     * to configure per-packet options when sending data
     * on a connection.
     * 
     * @return
     *         Returns a retained protocol metadata object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_ip_create_metadata();

    /**
     * [@function] nw_protocol_metadata_is_ip
     * 
     * Checks if a protocol metadata object is compatible with the
     * accessors defined in this file for the default system
     * implementation of IP.
     * 
     * @return
     *         Returns true if the metadata is for the default system IP,
     *         false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_ip(@NotNull NSObject metadata);

    /**
     * [@function] nw_ip_metadata_set_ecn_flag
     * 
     * Sets ECN flags on IP metadata. This will take effect if
     * applied to any sent content.
     * 
     * @param metadata
     *                 An IP metadata object.
     * 
     * @param ecn_flag
     *                 The ECN flag to apply to packets.
     * 
     *                 API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_ip_metadata_set_ecn_flag(@NotNull NSObject metadata, int ecn_flag);

    /**
     * [@function] nw_ip_metadata_get_ecn_flag
     * 
     * Gets ECN flags from IP metadata. This will be set only
     * for metadata associated with received content.
     * 
     * @param metadata
     *                 An IP metadata object.
     * 
     * @return
     *         Returns the ECN flag received from a packet.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_ip_metadata_get_ecn_flag(@NotNull NSObject metadata);

    /**
     * [@function] nw_ip_metadata_set_service_class
     * 
     * Sets service class on IP metadata. This will not generally
     * translate into TOS or Traffic Class bits unless the network
     * explicitly supports it, but it will impact local queuing of
     * packets.
     * 
     * @param metadata
     *                      An IP metadata object.
     * 
     * @param service_class
     *                      The service class to apply to packets.
     * 
     *                      API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_ip_metadata_set_service_class(@NotNull NSObject metadata, int service_class);

    /**
     * [@function] nw_ip_metadata_get_service_class
     * 
     * Gets service class from IP metadata. This reflects the value
     * set using nw_ip_metadata_set_service_class. It will not
     * be received from the network.
     * 
     * @param metadata
     *                 An IP metadata object.
     * 
     * @return
     *         Returns the service class set on a packet.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_ip_metadata_get_service_class(@NotNull NSObject metadata);

    /**
     * [@function] nw_ip_metadata_get_receive_time
     * 
     * Access the time at which a packet was received. This is
     * useful for calculating precise timing for round-trip-time
     * estimates. Same as clock_gettime_nsec_np(CLOCK_MONOTONIC_RAW).
     * 
     * The receive time will be 0 unless timestamps have been enabled
     * using nw_ip_options_set_calculate_receive_time().
     * 
     * @param metadata
     *                 An IP metadata object.
     * 
     * @return
     *         Returns the time that the packet was received.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native long nw_ip_metadata_get_receive_time(@NotNull NSObject metadata);

    /**
     * [@function] nw_listener_create_with_port
     * 
     * Creates a networking listener bound to a specified local port.
     * 
     * @param port
     *                   A port number as a C string, such as "443", or a service
     *                   name, such as "https".
     * 
     * @param parameters
     *                   The parameters to use for the listener. These include the protocols to be
     *                   used for the listener.
     * 
     * @return
     *         Returns an allocated nw_listener_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_listener_create_with_port(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String port,
            @NotNull NSObject parameters);

    /**
     * [@function] nw_listener_create
     * 
     * Creates a networking listener. The listener will be assigned a random
     * port upon which to listen unless otherwise specified by the parameters.
     * 
     * @param parameters
     *                   The parameters to use for the listener. These include the protocols to be
     *                   used for the listener.
     * 
     * @return
     *         Returns an allocated nw_listener_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_listener_create(@NotNull NSObject parameters);

    /**
     * [@function] nw_listener_create_with_connection
     * 
     * Creates a networking listener based on an existing
     * multiplexing connection. If there are multiple protocols
     * in the connection that support listening for incoming flows,
     * the listener will be hooked up the highest in the stack
     * (the closest to the reading and writing of the client data).
     * 
     * @param connection
     *                   An existing connection that has a multiplexing protocol
     *                   that supports receiving new connections.
     * 
     * @param parameters
     *                   The parameters to use for the listener. The protocol stack
     *                   defined in the parameters must be able to join a protocol
     *                   in the connection that supports listening protocols.
     * 
     * @return
     *         Returns an allocated nw_listener_t object on success. Use nw_release() to deallocate.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_listener_create_with_connection(@NotNull NSObject connection,
            @NotNull NSObject parameters);

    /**
     * [@function] nw_listener_set_queue
     * 
     * Sets the client callback queue, on which blocks for events will
     * be scheduled. This must be done before calling nw_listener_start().
     * 
     * @param listener
     *                 The listener object.
     * 
     * @param queue
     *                 The client's dispatch queue.
     * 
     *                 API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_listener_set_queue(@NotNull NSObject listener, @NotNull NSObject queue);

    /**
     * [@function] nw_listener_set_state_changed_handler
     * 
     * Sets the state change handler. For clients that need to perform cleanup when the
     * connection has been cancelled, the nw_listener_state_cancelled state will
     * be delivered last.
     * 
     * @param listener
     *                 The listener object.
     * 
     * @param handler
     *                 The state changed handler to call when the listener state changes.
     *                 Pass NULL to remove the event handler.
     * 
     *                 API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_listener_set_state_changed_handler(@NotNull NSObject listener,
            @Nullable @ObjCBlock(name = "call_nw_listener_set_state_changed_handler") Block_nw_listener_set_state_changed_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_listener_set_state_changed_handler {
        @Generated
        void call_nw_listener_set_state_changed_handler(int state, @Nullable NSObject error);
    }

    /**
     * [@function] nw_listener_set_new_connection_handler
     * 
     * Sets the client new connection handler. Must be called before
     * nw_listener_start.
     * 
     * @param listener
     *                 The listener object.
     * 
     * @param handler
     *                 The event handler to call when the listener receives a new connection.
     *                 Pass NULL to remove the new connection handler.
     * 
     *                 API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_listener_set_new_connection_handler(@NotNull NSObject listener,
            @Nullable @ObjCBlock(name = "call_nw_listener_set_new_connection_handler") Block_nw_listener_set_new_connection_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_listener_set_new_connection_handler {
        @Generated
        void call_nw_listener_set_new_connection_handler(@NotNull NSObject connection);
    }

    /**
     * [@function] nw_listener_get_new_connection_limit
     * 
     * Gets the listener new connection limit. The default value is
     * NW_LISTENER_INFINITE_CONNECTION_LIMIT which indicates that
     * the listener should not limit incoming connections. If the value
     * is not NW_LISTENER_INFINITE_CONNECTION_LIMIT, it will be decremented
     * by 1 every time a new connection is created. When the value becomes
     * 0, new connection handlers will no longer be invoked until
     * nw_listener_set_new_connection_limit() is invoked with a value
     * that is greater than 0. Incoming connections will eventually be rejected
     * if nw_listener_set_new_connection_limit() is not called after the connection
     * limit reaches 0.
     * 
     * @param listener
     *                 The listener object.
     * 
     * @return
     *         Returns current new connection limit
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_listener_get_new_connection_limit(@NotNull NSObject listener);

    /**
     * [@function] nw_listener_set_new_connection_limit
     * 
     * Sets the listener new connection limit. Use the value NW_LISTENER_INFINITE_CONNECTION_LIMIT
     * to disable connection limits. If the value is not NW_LISTENER_INFINITE_CONNECTION_LIMIT,
     * it will be decremented by 1 every time a new connection is created. When the value becomes
     * 0, new connection handlers will no longer be invoked until
     * nw_listener_set_new_connection_limit() is invoked with a value
     * that is greater than 0. Incoming connections will eventually be rejected
     * if nw_listener_set_new_connection_limit() is not called after the connection
     * limit reaches 0.
     * 
     * @param listener
     *                             The listener object.
     * 
     * @param new_connection_limit
     *                             The new connection limit. Pass NW_LISTENER_INFINITE_CONNECTION_LIMIT
     *                             to disable new connection limiting.
     * 
     *                             API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_listener_set_new_connection_limit(@NotNull NSObject listener,
            int new_connection_limit);

    /**
     * [@function] nw_listener_set_advertise_descriptor
     * 
     * Describes the bonjour service the listener should register. Setting the
     * advertise descriptor more than once may be used to update the TXT record.
     * 
     * @param listener
     *                             The listener object.
     * 
     * @param advertise_descriptor
     *                             The advertise_descriptor or NULL to prevent or remove registration of a service.
     * 
     *                             API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_listener_set_advertise_descriptor(@NotNull NSObject listener,
            @Nullable NSObject advertise_descriptor);

    /**
     * [@function] nw_listener_set_advertised_endpoint_changed_handler
     * 
     * Sets the client advertised endpoint changed handler. The handler will be
     * invoked for listeners which have called nw_listener_set_advertise_descriptor().
     * 
     * @param listener
     *                 The listener object.
     * 
     * @param handler
     *                 The event handler to call when the listener adds or removes an advertised endpoint.
     *                 Pass NULL to remove the handler.
     * 
     *                 API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_listener_set_advertised_endpoint_changed_handler(@NotNull NSObject listener,
            @Nullable @ObjCBlock(name = "call_nw_listener_set_advertised_endpoint_changed_handler") Block_nw_listener_set_advertised_endpoint_changed_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_listener_set_advertised_endpoint_changed_handler {
        @Generated
        void call_nw_listener_set_advertised_endpoint_changed_handler(@NotNull NSObject advertised_endpoint,
                boolean added);
    }

    /**
     * [@function] nw_listener_get_port
     * 
     * Gets the local port as a number in host byte order. If the listener was created with a
     * port of 0 (let the system assign a port), nw_listener_get_port will return 0 until the
     * listener is in the ready state.
     * 
     * @param listener
     *                 The listener to get the local port of.
     * 
     * @return
     *         Returns a port in host byte order.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native char nw_listener_get_port(@NotNull NSObject listener);

    /**
     * [@function] nw_listener_start
     * 
     * Starts the listener, which will cause the listener
     * to start listening for inbound connections.
     * 
     * @param listener
     *                 The listener object.
     * 
     *                 API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_listener_start(@NotNull NSObject listener);

    /**
     * [@function] nw_listener_cancel
     * 
     * Cancel the listener. This will de-register the listener from the system. The process
     * of cancellation will be completed asynchronously, and the final callback event
     * delivered to the caller will be a state update with a value of nw_listener_state_cancelled.
     * Once this update is delivered, the caller may clean up any associated memory or objects.
     * 
     * @param listener
     *                 The listener object.
     * 
     *                 API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_listener_cancel(@NotNull NSObject listener);

    /**
     * [@function] nw_path_monitor_create
     * 
     * Create a default path monitor, that will allow the enumeration of all available
     * interfaces on the system.
     * 
     * @return
     *         Returns an allocated nw_path_monitor_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_path_monitor_create();

    /**
     * [@function] nw_path_monitor_create_with_type
     * 
     * Create a path monitor specific to an interface type, that will allow the enumeration
     * of any interface that matches the type on the system.
     * 
     * @param required_interface_type
     *                                An interface type that will filter any results that the path monitor returns.
     * 
     * @return
     *         Returns an allocated nw_path_monitor_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_path_monitor_create_with_type(int required_interface_type);

    /**
     * [@function] nw_path_monitor_set_cancel_handler
     * 
     * Set a handler to be called on the queue provided to nw_path_monitor_set_queue
     * once cancellation has completed. Once the cancel handler has been called, the
     * update handler will not fire again.
     * 
     * @param monitor
     *                       The path monitor object.
     * 
     * @param cancel_handler
     *                       The block to call upon cancellation. Pass NULL to remove the cancel handler.
     * 
     *                       API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_path_monitor_set_cancel_handler(@NotNull NSObject monitor,
            @NotNull @ObjCBlock(name = "call_nw_path_monitor_set_cancel_handler") Block_nw_path_monitor_set_cancel_handler cancel_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_path_monitor_set_cancel_handler {
        @Generated
        void call_nw_path_monitor_set_cancel_handler();
    }

    /**
     * [@function] nw_path_monitor_set_update_handler
     * 
     * Sets the client update handler. This block will be called with the
     * current path when start is called and any time the path changes.
     * 
     * @param monitor
     *                       The path monitor object.
     * 
     * @param update_handler
     *                       The block to call when the path changes.
     * 
     *                       API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_path_monitor_set_update_handler(@NotNull NSObject monitor,
            @NotNull @ObjCBlock(name = "call_nw_path_monitor_set_update_handler") Block_nw_path_monitor_set_update_handler update_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_path_monitor_set_update_handler {
        @Generated
        void call_nw_path_monitor_set_update_handler(@NotNull NSObject path);
    }

    /**
     * [@function] nw_path_monitor_set_queue
     * 
     * Sets the client update queue. All blocks will be scheduled on
     * this queue. Call before calling nw_path_monitor_start.
     * 
     * @param monitor
     *                The path monitor object.
     * 
     * @param queue
     *                The dispatch queue on which to call the update and cancel handlers.
     * 
     *                API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_path_monitor_set_queue(@NotNull NSObject monitor, @NotNull NSObject queue);

    /**
     * [@function] nw_path_monitor_start
     * 
     * Starts the path monitor.
     * 
     * @param monitor
     *                The path monitor object.
     * 
     *                API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_path_monitor_start(@NotNull NSObject monitor);

    /**
     * [@function] nw_path_monitor_cancel
     * 
     * Cancel the path monitor.
     * 
     * @param monitor
     *                The path monitor object.
     * 
     *                API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_path_monitor_cancel(@NotNull NSObject monitor);

    /**
     * [@function] nw_protocol_copy_tcp_definition
     * 
     * Access the definition of the default system protocol implementation
     * of TCP (Transmission Control Protocol). This protocol can be used
     * as part of a connection's protocol stack as the transport protocol.
     * 
     * @return
     *         Returns a retained protocol definition object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_protocol_copy_tcp_definition();

    /**
     * [@function] nw_tcp_create_options
     * 
     * Create an instance of TCP protocol options. This object can be added
     * to an nw_protocol_stack_t to be used in an nw_connection_t or
     * an nw_listener_t.
     * 
     * @return
     *         Returns a retained protocol options object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_tcp_create_options();

    /**
     * [@function] nw_tcp_options_set_no_delay
     * 
     * Configure TCP to disable Nagle's algorithm, which will
     * delay sending packets to coalesce sending.
     * 
     * @param options
     *                 A TCP protocol options object.
     * 
     * @param no_delay
     *                 A boolean indicating that TCP should disable
     *                 Nagle's algorithm.
     * 
     *                 API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_no_delay(@NotNull NSObject options, boolean no_delay);

    /**
     * [@function] nw_tcp_options_set_no_push
     * 
     * Wait to send TCP data until the connection has finished
     * writing, or else the TCP send buffer is full.
     * 
     * @param options
     *                A TCP protocol options object.
     * 
     * @param no_push
     *                A boolean indicating that TCP should be set into
     *                no-push mode.
     * 
     *                API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_no_push(@NotNull NSObject options, boolean no_push);

    /**
     * [@function] nw_tcp_options_set_no_options
     * 
     * Disable sending TCP options and extensions.
     * 
     * @param options
     *                   A TCP protocol options object.
     * 
     * @param no_options
     *                   A boolean indicating that TCP should be set into
     *                   no-options mode.
     * 
     *                   API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_no_options(@NotNull NSObject options, boolean no_options);

    /**
     * [@function] nw_tcp_options_set_enable_keepalive
     * 
     * Enable sending TCP keepalive probes.
     * 
     * @param options
     *                         A TCP protocol options object.
     * 
     * @param enable_keepalive
     *                         A boolean indicating that TCP should send keepalives.
     * 
     *                         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_enable_keepalive(@NotNull NSObject options, boolean enable_keepalive);

    /**
     * [@function] nw_tcp_options_set_keepalive_count
     * 
     * Configure the number of times TCP keepalive probes
     * should be sent without reply before terminating
     * the connection.
     * 
     * @param options
     *                        A TCP protocol options object.
     * 
     * @param keepalive_count
     *                        The number of keepalive probes to send before terminating
     *                        the connection.
     * 
     *                        API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_keepalive_count(@NotNull NSObject options, int keepalive_count);

    /**
     * [@function] nw_tcp_options_set_keepalive_idle_time
     * 
     * Configure the amount of time that a connection must be
     * idle before TCP should start sending keepalive probes.
     * 
     * @param options
     *                            A TCP protocol options object.
     * 
     * @param keepalive_idle_time
     *                            The number of seconds of idleness to wait before keepalive
     *                            probes are sent by TCP.
     * 
     *                            API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_keepalive_idle_time(@NotNull NSObject options,
            int keepalive_idle_time);

    /**
     * [@function] nw_tcp_options_set_keepalive_interval
     * 
     * Configure the amount of time between sending TCP keepalive
     * probes when the peer is not responding.
     * 
     * @param options
     *                           A TCP protocol options object.
     * 
     * @param keepalive_interval
     *                           The number of seconds of to wait before resending TCP
     *                           keepalive probes.
     * 
     *                           API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_keepalive_interval(@NotNull NSObject options, int keepalive_interval);

    /**
     * [@function] nw_tcp_options_set_maximum_segment_size
     * 
     * Directly configure the maximum segment size (MSS)
     * TCP will use.
     * 
     * @param options
     *                             A TCP protocol options object.
     * 
     * @param maximum_segment_size
     *                             The maximum segment size in bytes.
     * 
     *                             API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_maximum_segment_size(@NotNull NSObject options,
            int maximum_segment_size);

    /**
     * [@function] nw_tcp_options_set_connection_timeout
     * 
     * Define a timeout value after which TCP connection
     * establishment will give up.
     * 
     * @param options
     *                           A TCP protocol options object.
     * 
     * @param connection_timeout
     *                           A timeout for TCP connection establishment, in seconds.
     * 
     *                           API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_connection_timeout(@NotNull NSObject options, int connection_timeout);

    /**
     * [@function] nw_tcp_options_set_persist_timeout
     * 
     * Define a timeout value after which TCP connections
     * in the persist state will terminate. See RFC 6429.
     * 
     * @param options
     *                        A TCP protocol options object.
     * 
     * @param persist_timeout
     *                        The TCP persist timeout, in seconds.
     * 
     *                        API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_persist_timeout(@NotNull NSObject options, int persist_timeout);

    /**
     * [@function] nw_tcp_options_set_retransmit_connection_drop_time
     * 
     * Define a timeout value after which TCP will drop
     * a connection with unacknowledged retransmissions.
     * 
     * @param options
     *                                        A TCP protocol options object.
     * 
     * @param retransmit_connection_drop_time
     *                                        A timeout for TCP retransmission attempts, in seconds.
     * 
     *                                        API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_retransmit_connection_drop_time(@NotNull NSObject options,
            int retransmit_connection_drop_time);

    /**
     * [@function] nw_tcp_options_set_retransmit_fin_drop
     * 
     * Cause TCP to drop connections after not receiving
     * an ACK multiple times after a FIN, currently set at three.
     * 
     * @param options
     *                            A TCP protocol options object.
     * 
     * @param retransmit_fin_drop
     *                            A boolean to cause TCP to drop its connection after
     *                            not receiving an ACK after a FIN.
     * 
     *                            API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_retransmit_fin_drop(@NotNull NSObject options,
            boolean retransmit_fin_drop);

    /**
     * [@function] nw_tcp_options_set_disable_ack_stretching
     * 
     * Configure TCP to disable ACK stretching. ACKs will be sent
     * for every other data packet.
     * 
     * @param options
     *                               A TCP protocol options object.
     * 
     * @param disable_ack_stretching
     *                               A boolean to cause TCP to disable ACK stretching.
     * 
     *                               API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_disable_ack_stretching(@NotNull NSObject options,
            boolean disable_ack_stretching);

    /**
     * [@function] nw_tcp_options_set_enable_fast_open
     * 
     * Configure TCP to enable TCP Fast Open (TFO). This may take effect
     * even when TCP is not the top-level protocol in the protocol stack.
     * For example, if TLS is running over TCP, the Client Hello message
     * may be sent as fast open data.
     * 
     * If TCP is the top-level protocol in the stack (the one the application
     * directly interacts with), TFO will be disabled unless the application
     * indicated that it will provide its own fast open data by calling
     * nw_parameters_set_fast_open_enabled().
     * 
     * @param options
     *                         A TCP protocol options object.
     * 
     * @param enable_fast_open
     *                         A boolean to enable TFO.
     * 
     *                         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_enable_fast_open(@NotNull NSObject options, boolean enable_fast_open);

    /**
     * [@function] nw_tcp_options_set_disable_ecn
     * 
     * Configure TCP to disable default Explicit Congestion
     * Notification (ECN) behavior.
     * 
     * @param options
     *                    A TCP protocol options object.
     * 
     * @param disable_ecn
     *                    A boolean to disable ECN support in TCP.
     * 
     *                    API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_disable_ecn(@NotNull NSObject options, boolean disable_ecn);

    /**
     * [@function] nw_protocol_metadata_is_tcp
     * 
     * Checks if a protocol metadata object is compatible with the
     * accessors defined in this file for the default system
     * implementation of TCP.
     * 
     * @return
     *         Returns true if the metadata is for the default system TCP,
     *         false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_tcp(@NotNull NSObject metadata);

    /**
     * [@function] nw_tcp_get_available_receive_buffer
     * 
     * Fetch the number of bytes waiting to be read from the receive buffer.
     * 
     * @return
     *         The number of bytes available in the receive buffer.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_tcp_get_available_receive_buffer(@NotNull NSObject metadata);

    /**
     * [@function] nw_tcp_get_available_send_buffer
     * 
     * Fetch the number of bytes waiting to be acknowledged in the send buffer.
     * 
     * @return
     *         The number of bytes waiting to be acknowledged.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int nw_tcp_get_available_send_buffer(@NotNull NSObject metadata);

    /**
     * [@function] nw_protocol_copy_tls_definition
     * 
     * Access the definition of the default system protocol implementation
     * of TLS (Transport Layer Security). This protocol can be used
     * as part of a connection's protocol stack as an application protocol.
     * 
     * @return
     *         Returns a retained protocol definition object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_protocol_copy_tls_definition();

    /**
     * [@function] nw_tls_create_options
     * 
     * Create an instance of TLS protocol options. This object can be added
     * to an nw_protocol_stack_t to be used in an nw_connection_t or
     * an nw_listener_t.
     * 
     * @return
     *         Returns a retained protocol options object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_tls_create_options();

    /**
     * [@function] nw_tls_copy_sec_protocol_options
     * 
     * Access the sec_protocol_options_t for a given network protocol
     * options instance. See <Security/SecProtocolOptions.h> for functions
     * to further configure security options.
     * 
     * @param options
     *                An nw_protocol_options_t that has been created for TLS.
     * 
     * @return
     *         Returns a retained sec_protocol_options_t object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_tls_copy_sec_protocol_options(@NotNull NSObject options);

    /**
     * [@function] nw_protocol_metadata_is_tls
     * 
     * Checks if a protocol metadata object is compatible with the
     * accessors defined in this file for the default system
     * implementation of TLS.
     * 
     * @return
     *         Returns true if the metadata is for the default system TLS,
     *         false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_tls(@NotNull NSObject metadata);

    /**
     * [@function] nw_tls_copy_sec_protocol_metadata
     * 
     * Access the sec_protocol_metadata_t for a given network protocol
     * metadata instance. See <Security/SecProtocolMetadata.h> for functions
     * to access security properties.
     * 
     * @param metadata
     *                 An nw_protocol_metadata_t for the TLS protocol.
     * 
     * @return
     *         Returns a retained sec_protocol_metadata_t object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_tls_copy_sec_protocol_metadata(@NotNull NSObject metadata);

    /**
     * [@function] nw_protocol_copy_udp_definition
     * 
     * Access the definition of the default system protocol implementation
     * of UDP (User Datagram Protocol). This protocol can be used
     * as part of a connection's protocol stack as the transport protocol.
     * 
     * @return
     *         Returns a retained protocol definition object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_protocol_copy_udp_definition();

    /**
     * [@function] nw_udp_create_options
     * 
     * Create an instance of UDP protocol options. This object can be added
     * to an nw_protocol_stack_t to be used in an nw_connection_t or
     * an nw_listener_t.
     * 
     * @return
     *         Returns a retained protocol options object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_udp_create_options();

    /**
     * [@function] nw_udp_options_set_prefer_no_checksum
     * 
     * Configure UDP to skip computing checksums when sending.
     * This will only take effect when running over IPv4.
     * 
     * @param options
     *                           A UDP protocol options object.
     * 
     * @param prefer_no_checksum
     *                           A boolean that indicates if UDP is allowed to skip computing
     *                           its checksum.
     * 
     *                           API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void nw_udp_options_set_prefer_no_checksum(@NotNull NSObject options,
            boolean prefer_no_checksum);

    /**
     * [@function] nw_udp_create_metadata
     * 
     * Create an instance of UDP metadata that can be used
     * to configure per-datagram options when sending data
     * on a connection.
     * 
     * @return
     *         Returns a retained protocol metadata object.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_udp_create_metadata();

    /**
     * [@function] nw_protocol_metadata_is_udp
     * 
     * Checks if a protocol metadata object is compatible with the
     * accessors defined in this file for the default system
     * implementation of UDP.
     * 
     * @return
     *         Returns true if the metadata is for the default system UDP,
     *         false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_udp(@NotNull NSObject metadata);

    /**
     * [@function] nw_protocol_copy_ws_definition
     * 
     * Access the definition of the default system implementation of the
     * WebSocket protocol. This protocol can be appended to a connection's
     * protocol stack.
     * 
     * @return
     *         Returns a retained protocol definition object.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_protocol_copy_ws_definition();

    /**
     * [@function] nw_ws_create_options
     * 
     * Create an instance of WebSocket protocol options. This object can be
     * added to an nw_protocol_stack_t to be used in an nw_connection_t or
     * an nw_listener_t.
     * 
     * @return
     *         Returns a retained protocol options object.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_ws_create_options(int version);

    /**
     * [@function] nw_ws_options_add_additional_header
     * 
     * Set additional HTTP headers to be sent by the client during the
     * WebSocket handshake.
     * 
     * @param options
     *                The WebSocket protocol options object.
     * 
     * @param name
     *                The HTTP header name.
     * 
     * @param value
     *                The HTTP header value.
     * 
     *                API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_ws_options_add_additional_header(@NotNull NSObject options,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

    /**
     * [@function] nw_ws_options_add_subprotocol
     * 
     * Add to the list of subprotocols that will be presented to a
     * WebSocket server during connection establishment.
     * 
     * @param options
     *                    The WebSocket protocol options object.
     * 
     * @param subprotocol
     *                    The subprotocol supported by the client.
     * 
     *                    API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_ws_options_add_subprotocol(@NotNull NSObject options,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String subprotocol);

    /**
     * [@function] nw_ws_options_set_auto_reply_ping
     * 
     * Set whether the WebSocket connection should automatically reply to all
     * incoming pings. If set to true, the WebSocket protocol will automatically
     * reply to incoming pings and will deliver the pings to receive requests
     * on the connection.
     * 
     * @param options
     *                        The WebSocket protocol options object.
     * 
     * @param auto_reply_ping
     *                        Whether the WebSocket connection should automatically reply to all
     *                        incoming pings.
     * 
     *                        API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_ws_options_set_auto_reply_ping(@NotNull NSObject options, boolean auto_reply_ping);

    /**
     * [@function] nw_ws_options_set_skip_handshake
     * 
     * Set whether the WebSocket protocol should skip the opening handshake
     * and begin framing data as soon as a connection is established.
     * 
     * @param options
     *                       The WebSocket protocol options object.
     * 
     * @param skip_handshake
     *                       Whether the WebSocket connection should skip the opening handshake.
     * 
     *                       API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_ws_options_set_skip_handshake(@NotNull NSObject options, boolean skip_handshake);

    /**
     * [@function] nw_ws_options_set_maximum_message_size
     * 
     * Set the maximum allowed message size to be received by the WebSocket
     * connection. This does not limit the sending message size.
     * 
     * @param options
     *                             The WebSocket protocol options object.
     * 
     * @param maximum_message_size
     *                             The maximum message size in bytes. A maximum message size of 0 means
     *                             there is no receive limit. The default maximum message size is 0.
     * 
     *                             API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_ws_options_set_maximum_message_size(@NotNull NSObject options,
            @NUInt long maximum_message_size);

    /**
     * [@function] nw_protocol_metadata_is_ws
     * 
     * Checks if a protocol metadata object is compatible with the
     * accessors defined in this file for the default system
     * implementation of WebSocket.
     * 
     * @return
     *         Returns true if the metadata is for the default system
     *         implementation of WebSocket, false otherwise.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_ws(@NotNull NSObject metadata);

    /**
     * [@function] nw_ws_create_metadata
     * 
     * Creates a protocol metadata object that can be used to define the
     * content context of messages sent over a WebSocket connection.
     * 
     * @param opcode
     *               Set the opcode on a WebSocket frame. This must be defined on create.
     * 
     * @return
     *         Returns a retained metadata object representing the WebSocket frame.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_ws_create_metadata(int opcode);

    /**
     * [@function] nw_ws_metadata_get_opcode
     * 
     * Get the opcode on a WebSocket frame.
     * 
     * @param metadata
     *                 The metadata object representing the WebSocket frame.
     * 
     * @return
     *         The opcode on the WebSocket frame.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native int nw_ws_metadata_get_opcode(@NotNull NSObject metadata);

    /**
     * [@function] nw_ws_metadata_set_close_code
     * 
     * Set the close code on a WebSocket frame. The WebSocket frame's opcode
     * should be nw_ws_opcode_close.
     * 
     * @param metadata
     *                   The metadata object representing the WebSocket frame.
     * 
     * @param close_code
     *                   The close code on the WebSocket frame.
     * 
     *                   API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_ws_metadata_set_close_code(@NotNull NSObject metadata, int close_code);

    /**
     * [@function] nw_ws_metadata_get_close_code
     * 
     * Get the close code from a WebSocket frame. If the close code is equal
     * to nw_ws_close_code_no_status_received, it means that a close code
     * was not actually present in the WebSocket frame.
     * 
     * @param metadata
     *                 The metadata object representing the WebSocket frame.
     * 
     * @return
     *         The close code on the WebSocket frame.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native int nw_ws_metadata_get_close_code(@NotNull NSObject metadata);

    /**
     * [@function] nw_ws_metadata_set_pong_handler
     * 
     * Set a callback that will notify the client when a pong message has been
     * received for a ping message sent. The metadata object's associated
     * opcode should be nw_ws_opcode_ping.
     * 
     * @param metadata
     *                     The WebSocket metadata object.
     * 
     * @param client_queue
     *                     The queue on which the pong handler will be delivered.
     * 
     * @param pong_handler
     *                     The handler that gets called when a pong reply is received.
     * 
     *                     API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_ws_metadata_set_pong_handler(@NotNull NSObject metadata,
            @NotNull NSObject client_queue,
            @NotNull @ObjCBlock(name = "call_nw_ws_metadata_set_pong_handler") Block_nw_ws_metadata_set_pong_handler pong_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_ws_metadata_set_pong_handler {
        @Generated
        void call_nw_ws_metadata_set_pong_handler(@Nullable NSObject error);
    }

    /**
     * [@function] nw_ws_request_enumerate_subprotocols
     * 
     * Enumerates the list of subprotocols on the client's request.
     * 
     * @param request
     *                   The client request.
     * 
     * @param enumerator
     *                   The enumerator block.
     * 
     * @return
     *         Whether the enumeration completed.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_ws_request_enumerate_subprotocols(@NotNull NSObject request,
            @NotNull @ObjCBlock(name = "call_nw_ws_request_enumerate_subprotocols") Block_nw_ws_request_enumerate_subprotocols enumerator);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_ws_request_enumerate_subprotocols {
        @Generated
        boolean call_nw_ws_request_enumerate_subprotocols(
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String subprotocol);
    }

    /**
     * [@function] nw_ws_request_enumerate_additional_headers
     * 
     * Enumerates the list of additional headers on the client's request.
     * 
     * @param request
     *                   The client request.
     * 
     * @param enumerator
     *                   The enumerator block.
     * 
     * @return
     *         Whether the enumeration completed.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_ws_request_enumerate_additional_headers(@NotNull NSObject request,
            @NotNull @ObjCBlock(name = "call_nw_ws_request_enumerate_additional_headers") Block_nw_ws_request_enumerate_additional_headers enumerator);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_ws_request_enumerate_additional_headers {
        @Generated
        boolean call_nw_ws_request_enumerate_additional_headers(
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String name,
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String value);
    }

    /**
     * [@function] nw_ws_response_create
     * 
     * Create a server response to a WebSocket client's opening handshake.
     * 
     * @param status
     *                             The status of the response. If the status is nw_ws_response_status_accept,
     *                             the server will accept the handshake and open the WebSocket connection.
     *                             If the status is nw_ws_response_status_reject, the server will reject the
     *                             handshake and respond with the HTTP error 400 Bad Request.
     * 
     * @param selected_subprotocol
     *                             The server's selected protocol from the client's list of proposed
     *                             subprotocols. If the status of this response is nw_ws_response_status_reject,
     *                             this parameter is ignored. Pass NULL to indicate the server did not find
     *                             a suitable subprotocol, but has accepted the handshake anyways.
     *                             Passing an empty string is prohibited by the WebSocket protocol.
     * 
     * @return
     *         An instantiated WebSocket server response object.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_ws_response_create(int status,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String selected_subprotocol);

    /**
     * [@function] nw_ws_response_get_status
     * 
     * Get the status from a WebSocket server's response. If the response is
     * nil, the return value will be nw_ws_response_status_invalid.
     * 
     * @param response
     *                 The server response.
     * 
     * @return
     *         The status of the server's response.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native int nw_ws_response_get_status(@Nullable NSObject response);

    /**
     * [@function] nw_ws_response_get_selected_subprotocol
     * 
     * Get the selected subprotocol from a WebSocket server's response.
     * 
     * @param response
     *                 The server response.
     * 
     * @return
     *         The status of the server's response.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_ws_response_get_selected_subprotocol(@NotNull NSObject response);

    /**
     * [@function] nw_ws_response_add_additional_header
     * 
     * Add additional HTTP headers to be sent back to the WebSocket client in
     * the server's response.
     * 
     * @param response
     *                 The server response.
     * 
     * @param name
     *                 The HTTP name.
     * 
     * @param value
     *                 The HTTP value.
     * 
     *                 API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_ws_response_add_additional_header(@NotNull NSObject response,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

    /**
     * [@function] nw_ws_metadata_copy_server_response
     * 
     * Copy the WebSocket server's response to a client's request to connect.
     * If this is called on a WebSocket server, the response object will contain
     * the server's own response to the client.
     * 
     * @param metadata
     *                 The metadata object representing the WebSocket connection.
     * 
     * @return
     *         The server response.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_ws_metadata_copy_server_response(@NotNull NSObject metadata);

    /**
     * [@function] nw_ws_response_enumerate_additional_headers
     * 
     * Enumerates the list of additional headers on the server's response.
     * 
     * @param response
     *                   The server response.
     * 
     * @param enumerator
     *                   The enumerator block.
     * 
     * @return
     *         Whether the enumeration completed.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean nw_ws_response_enumerate_additional_headers(@NotNull NSObject response,
            @NotNull @ObjCBlock(name = "call_nw_ws_response_enumerate_additional_headers") Block_nw_ws_response_enumerate_additional_headers enumerator);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_ws_response_enumerate_additional_headers {
        @Generated
        boolean call_nw_ws_response_enumerate_additional_headers(
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String name,
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String value);
    }

    /**
     * [@typedef] nw_ws_options_set_client_request_handler
     * 
     * Set callback handler to be invoked when a WebSocket server receives a
     * WebSocket client's request to connect.
     * 
     * @param options
     *                     The protocol options object.
     * 
     * @param client_queue
     *                     The queue on which the client request handler will be delivered.
     * 
     * @param handler
     *                     The callback handler.
     * 
     *                     API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void nw_ws_options_set_client_request_handler(@NotNull NSObject options,
            @NotNull NSObject client_queue,
            @NotNull @ObjCBlock(name = "call_nw_ws_options_set_client_request_handler") Block_nw_ws_options_set_client_request_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_ws_options_set_client_request_handler {
        @NotNull
        @Generated
        NSObject call_nw_ws_options_set_client_request_handler(@NotNull NSObject request);
    }

    /**
     * Values will be POSIX errors
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kNWErrorDomainPOSIX();

    /**
     * Values will be DNSServiceErrorType errors
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kNWErrorDomainDNS();

    /**
     * Values will be errSSL* errors
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kNWErrorDomainTLS();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native NSObject _nw_content_context_default_message();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native NSObject _nw_content_context_final_send();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native NSObject _nw_content_context_default_stream();

    /**
     * [@const] NW_ALL_PATHS
     * 
     * Pass NW_ALL_PATHS to data transfer report accessors to sum
     * values across paths where applicable. For values that cannot
     * sum, the value of the primary path is used.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    public static native int _nw_data_transfer_report_all_paths();

    /**
     * [@function] nw_resolver_config_create_https
     * 
     * Creates a DNS-over-HTTPS (DoH) resolver configuration. The provided
     * URL describes the location of the DNS server, such as
     * "https://dnsserver.example.net/dns-query". See RFC 8484.
     * 
     * @param url_endpoint
     *                     The URL template of the DoH server as an endpoint.
     * 
     * @return
     *         Returns an allocated nw_resolver_config_t object on success.
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_resolver_config_create_https(@NotNull NSObject url_endpoint);

    /**
     * [@function] nw_resolver_config_create_tls
     * 
     * Creates a DNS-over-TLS (DoT) resolver configuration. The hostname
     * of the provided endpoint will be used to validate the TLS certificate of the server.
     * See RFC 7858.
     * 
     * @param server_endpoint
     *                        A host endpoint identifying the DoT server.
     * 
     * @return
     *         Returns an allocated nw_resolver_config_t object on success.
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_resolver_config_create_tls(@NotNull NSObject server_endpoint);

    /**
     * [@function] nw_resolver_config_add_name_server
     * 
     * Modifies the resolver configuration by adding a DNS server address as an endpoint.
     * 
     * @param config
     *                       A resolver config object.
     * 
     * @param server_address
     *                       A server address to assign to the configuration, as an endpoint.
     * 
     *                       API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_resolver_config_add_server_address(@NotNull NSObject config,
            @NotNull NSObject server_address);

    /**
     * [@function] nw_privacy_context_create
     * 
     * Create a new privacy context. This object can be added to connections and listeners
     * by setting the privacy context on the nw_parameters_t. Each privacy context can have
     * unique settings for logging and resolution, and implicitly has an isolated cache for
     * items like TLS sessions.
     * 
     * @param description
     *                    A string description used for logging.
     * 
     * @return
     *         Returns an allocated nw_privacy_context_t object on success.
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_privacy_context_create(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String description);

    /**
     * [@function] nw_privacy_context_flush_cache
     * 
     * Flush any cached state stored in this privacy context. The act of flushing the
     * cache may be asynchronous, which means that it will take effect shortly after the
     * function is invoked.
     * 
     * @param privacy_context
     *                        A privacy context to flush.
     * 
     *                        API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_privacy_context_flush_cache(@NotNull NSObject privacy_context);

    /**
     * [@function] nw_privacy_context_disable_logging
     * 
     * Disable logging for connections and listeners associated with this context. Logging
     * may not be disabled on the default privacy context.
     * 
     * @param privacy_context
     *                        A privacy context on which to disable logging.
     * 
     *                        API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_privacy_context_disable_logging(@NotNull NSObject privacy_context);

    /**
     * [@function] nw_privacy_context_require_encrypted_name_resolution
     * 
     * Require that any DNS name resolution occurring for connections
     * associated with this context use encrypted transports, such as TLS or HTTPS.
     * Any unencrypted queries will be blocked if require_encrypted_name_resolution
     * is set to true. Optionally, a fallback resolver config can be provided to use
     * instead of blocking queries when require_encrypted_name_resolution is set to
     * true.
     * 
     * @param privacy_context
     *                                          A privacy context to modify. This can include the default privacy
     *                                          context.
     * 
     * @param require_encrypted_name_resolution
     *                                          If true, require that any name resolution using DNS is performed
     *                                          with encryption. If false, allow cleartext resolution. Defaults to
     *                                          false.
     * 
     * @param fallback_resolver_config
     *                                          An optional resolver configuration to use if no other encrypted DNS
     *                                          resolver
     *                                          is already configured for the query. This will only take effect if
     *                                          require_encrypted_name_resolution is set to true. If this configuration
     *                                          is
     *                                          NULL and require_encrypted_name_resolution is set to true, all cleartext
     *                                          name resolution will be blocked.
     * 
     *                                          API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_privacy_context_require_encrypted_name_resolution(@NotNull NSObject privacy_context,
            boolean require_encrypted_name_resolution, @Nullable NSObject fallback_resolver_config);

    /**
     * [@function] nw_parameters_set_privacy_context
     * 
     * Set a privacy context on the parameters, which will be associated
     * with connections and listeners. The privacy context allows
     * using separate caches for different sets of connections, as well as
     * restricting how connection-specific information is logged and shared
     * on the network.
     * 
     * @param parameters
     *                        The parameters object to configure
     * 
     * @param privacy_context
     *                        The privacy context to associate with connections and listeners that use
     *                        these parameters.
     * 
     *                        API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_privacy_context(@NotNull NSObject parameters,
            @NotNull NSObject privacy_context);

    /**
     * [@function] nw_group_descriptor_create_multicast
     * 
     * Creates a new group descriptor object based on a multicast group,
     * represented as an address endpoint.
     * 
     * @param multicast_group
     *                        An address endpoint that contains a multicast group to join.
     * 
     * @return
     *         An instantiated group descriptor object or nil if the specified
     *         endpoint is not an address endpoint representing a valid multicast
     *         group.
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_group_descriptor_create_multicast(@NotNull NSObject multicast_group);

    /**
     * [@function] nw_group_descriptor_add_endpoint
     * 
     * Add an additional endpoint to a given group descriptor.
     * 
     * @param descriptor
     *                   A group descriptor.
     * 
     * @param endpoint
     *                   An endpoint to add to the group.
     * 
     * @return Returns true if the endpoint was added, false if the endpoint was
     *         not of a valid type and therefore not added.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native boolean nw_group_descriptor_add_endpoint(@NotNull NSObject descriptor,
            @NotNull NSObject endpoint);

    /**
     * [@function] nw_group_descriptor_enumerate_endpoints
     * 
     * List all endpoints associated with the group descriptor.
     * 
     * @param descriptor
     *                        The group descriptor object to check.
     * 
     * @param enumerate_block
     *                        A block to which the endpoints associated with the descriptor will be passed.
     *                        Returning true from the block will continue to enumerate, and returning false will stop
     *                        enumerating.
     * 
     *                        API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_group_descriptor_enumerate_endpoints(@NotNull NSObject descriptor,
            @NotNull @ObjCBlock(name = "call_nw_group_descriptor_enumerate_endpoints") Block_nw_group_descriptor_enumerate_endpoints enumerate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_group_descriptor_enumerate_endpoints {
        @Generated
        boolean call_nw_group_descriptor_enumerate_endpoints(@NotNull NSObject endpoint);
    }

    /**
     * [@function] nw_multicast_group_descriptor_set_specific_source
     * 
     * Require a particular source for this multicast group descriptor.
     * 
     * @param multicast_descriptor
     *                             The multicast group descriptor to modify.
     * 
     * @param source
     *                             An endpoint describing the source for this descriptor.
     * 
     *                             API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_multicast_group_descriptor_set_specific_source(@NotNull NSObject multicast_descriptor,
            @NotNull NSObject source);

    /**
     * [@function] nw_multicast_group_descriptor_set_disable_unicast_traffic
     * 
     * Disable receiving unicast traffic for a connection group that is also receiving multicast traffic.
     * 
     * @param multicast_descriptor
     *                                The multicast group descriptor to modify.
     * 
     * @param disable_unicast_traffic
     *                                A boolean indicating if receiving unicast traffic should be disabled.
     * 
     *                                API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_multicast_group_descriptor_set_disable_unicast_traffic(
            @NotNull NSObject multicast_descriptor, boolean disable_unicast_traffic);

    /**
     * [@function] nw_multicast_group_descriptor_get_disable_unicast_traffic
     * 
     * Check if receiving unicast traffic has been disabled for a multicast connection group.
     * 
     * @param multicast_descriptor
     *                             The multicast group descriptor to check.
     * 
     * @return A boolean indicating if receiving unicast traffic should be disabled.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native boolean nw_multicast_group_descriptor_get_disable_unicast_traffic(
            @NotNull NSObject multicast_descriptor);

    /**
     * [@function] nw_connection_group_create
     * 
     * Creates a new connection group object to use for communication with
     * a group descriptor using protocols described by parameters.
     * 
     * @param group_descriptor
     *                         A group descriptor. For example, a descriptor of type nw_group_type_multicast
     *                         defines one or more multicast groups to automatically join.
     * 
     * @param parameters
     *                         Parameters to use for the new connection group. This includes the protocols that
     *                         will be used to delineate complete messages for processing. For multicast
     *                         joining, all available interfaces will be joined as prohibited or required.
     * 
     * @return
     *         Returns an allocated nw_connection_group_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_connection_group_create(@NotNull NSObject group_descriptor,
            @NotNull NSObject parameters);

    /**
     * [@function] nw_connection_group_copy_descriptor
     * 
     * Gets the group descriptor with which the connection group was created.
     * 
     * @param group
     *              The connection group to check.
     * 
     * @return
     *         Returns the descriptor with which the connection group was created.
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_connection_group_copy_descriptor(@NotNull NSObject group);

    /**
     * [@function] nw_connection_group_copy_parameters
     * 
     * Returns a copy of the parameters passed to nw_connection_group_create.
     * 
     * @param group
     *              The connection group object.
     * 
     * @return
     *         Returns an nw_parameters_t object.
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_connection_group_copy_parameters(@NotNull NSObject group);

    /**
     * [@function] nw_connection_group_set_queue
     * 
     * Sets the client callback queue, on which blocks for events will
     * be scheduled. This must be done before calling nw_connection_group_start().
     * 
     * @param group
     *              The connection group object.
     * 
     * @param queue
     *              The client's callback queue.
     * 
     *              API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_group_set_queue(@NotNull NSObject group, @NotNull NSObject queue);

    /**
     * [@function] nw_connection_group_set_state_changed_handler
     * 
     * Sets the state changed handler. For clients that need to perform cleanup
     * when the connection group has been cancelled, the nw_connection_group_state_cancelled state
     * will be delivered last. This function must not be called after starting the connection group.
     * 
     * @param group
     *                              The connection group object.
     * 
     * @param state_changed_handler
     *                              The state changed handler to call when the connection group state changes.
     *                              Pass NULL to remove the event handler.
     * 
     *                              API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_group_set_state_changed_handler(@NotNull NSObject group,
            @Nullable @ObjCBlock(name = "call_nw_connection_group_set_state_changed_handler") Block_nw_connection_group_set_state_changed_handler state_changed_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_group_set_state_changed_handler {
        @Generated
        void call_nw_connection_group_set_state_changed_handler(int state, @Nullable NSObject error);
    }

    /**
     * [@function] nw_connection_group_set_receive_handler
     * 
     * Sets the handler to be invoked whenever a new inbound message
     * arrives at the connection group. This function must not be called after starting the connection group.
     * 
     * @param group
     *                                  The connection group object.
     * 
     * @param maximum_message_size
     *                                  The maximum message size that should be delivered as a complete message. Any
     *                                  inbound messages larger than this size will be delivered as a partial message
     *                                  and
     *                                  an application may convert the inbound message to an `nw_connection` to read
     *                                  any remaining data for that message until it is complete.
     * 
     * @param reject_oversized_messages
     *                                  True if messages larger than maximum_message_size should be treated as errors
     *                                  and the connection group should automatically reply to such messages. False if
     *                                  the
     *                                  connection group should deliver such messages as incomplete and allow the
     *                                  application
     *                                  to inspect the message prior to accepting or rejecting it.
     * 
     * @param receive_handler
     *                                  The handler to call upon arrival of a new inbound message.
     *                                  Pass NULL to remove the handler.
     * 
     *                                  API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_group_set_receive_handler(@NotNull NSObject group, int maximum_message_size,
            boolean reject_oversized_messages,
            @Nullable @ObjCBlock(name = "call_nw_connection_group_set_receive_handler") Block_nw_connection_group_set_receive_handler receive_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_group_set_receive_handler {
        @Generated
        void call_nw_connection_group_set_receive_handler(@Nullable NSObject content, @NotNull NSObject context,
                boolean is_complete);
    }

    /**
     * [@function] nw_connection_group_start
     * 
     * Starts the connection group, which begins listening for and processing incoming messages.
     * You must call nw_connection_group_set_queue() and set a receive handler with
     * nw_connection_group_set_receive_handler() before starting the connection group.
     * 
     * @param group
     *              The connection group object.
     * 
     *              API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_group_start(@NotNull NSObject group);

    /**
     * [@function] nw_connection_group_cancel
     * 
     * Cancels the connection group. The process of cancellation will be completed
     * asynchronously, and the final callback event delivered to the caller
     * will be a state update with a value of nw_connection_group_state_cancelled.
     * Once this update is delivered, the caller may clean up any associated
     * memory or objects.
     * 
     * @param group
     *              The connection group object.
     * 
     *              API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_group_cancel(@NotNull NSObject group);

    /**
     * [@function] nw_connection_group_copy_remote_endpoint_for_message
     * 
     * Copy the remote endpoint corresponding to a given inbound connection group message.
     * 
     * @param group
     *                The connection group object.
     * 
     * @param context
     *                A content context representing an inbound message received from this connection group.
     * 
     * @return
     *         Returns the remote endpoint, or nil if the context is not a valid
     *         inbound message received from this connection group.
     * 
     *         API-Since: 14.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_connection_group_copy_remote_endpoint_for_message(@NotNull NSObject group,
            @NotNull NSObject context);

    /**
     * [@function] nw_connection_group_copy_local_endpoint_for_message
     * 
     * Copy the local endpoint corresponding to a given inbound connection group message.
     * 
     * @param group
     *                The connection group object.
     * 
     * @param context
     *                A content context representing an inbound message received from this connection group.
     * 
     * @return
     *         Returns the local endpoint, or nil if the context is not a valid
     *         inbound message received from this connection group.
     * 
     *         API-Since: 14.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_connection_group_copy_local_endpoint_for_message(@NotNull NSObject group,
            @NotNull NSObject context);

    /**
     * [@function] nw_connection_group_copy_path_for_message
     * 
     * Copy the path associated with a given inbound connection group message.
     * 
     * @param group
     *                The connection group object.
     * 
     * @param context
     *                A content context representing an inbound message received from this connection group.
     * 
     * @return
     *         Returns the path associated with the provided message, or nil if the context
     *         is not a valid inbound message received from this connection group.
     * 
     *         API-Since: 14.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_connection_group_copy_path_for_message(@NotNull NSObject group,
            @NotNull NSObject context);

    /**
     * [@function] nw_connection_group_reply
     * 
     * Send data in response to an inbound message received by a connection group.
     * 
     * @param group
     *                         The connection group object from which the reply_context was received.
     * 
     * @param inbound_message
     *                         The inbound message received by the connection group for which this is a response.
     *                         An inbound message may be replied to exactly once.
     * 
     * @param outbound_message
     *                         The outbound message to send in response to the message received by the connection group.
     * 
     *                         The response context can also hold protocol metadata to define how to
     *                         send content, such as flags for IP packets.
     * 
     *                         If the context is marked as "final", the connection group will expect that no further
     *                         communication is
     *                         expected during this connection with the peer and may close the underlying transport.
     *                         Subsequent connection attempts from the peer will continue to be delivered as incoming
     *                         messages.
     * 
     * @param content
     *                         A data object to send as the message body. This may be NULL if the outgoing
     *                         context represents a metadata only message that contains no body data.
     * 
     * 
     *                         API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_group_reply(@NotNull NSObject group, @NotNull NSObject inbound_message,
            @NotNull NSObject outbound_message, @Nullable NSObject content);

    /**
     * [@function] nw_connection_group_extract_connection_for_message
     * 
     * Extract a connection corresponding to an inbound message from the
     * connection group. Once extracted, subsequent messages from this
     * remote endpoint on this connection will no longer be handled by the
     * connection group. The connection may be used to read the remainder
     * of a partial message or to send a large response with support for partial
     * messages and backpressure.
     * Any incoming messages from this remote endpoint which were saved from
     * the receive handler may no longer be valid after a connection is returned.
     * An extracted connection must have a queue set and be started before it can be used.
     * 
     * @param group
     *                The connection group object from which the context was received. If the context was
     *                not received from this connection group, the extraction will fail.
     * 
     * @param context
     *                A content context representing an inbound message received from this connection group.
     * 
     * @return
     *         Returns the connection associated with the provided message, or nil if the extraction
     *         fails. Extraction will fail if the provided message is not an inbound message from
     *         this connection group.
     * 
     *         API-Since: 14.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_connection_group_extract_connection_for_message(@NotNull NSObject group,
            @NotNull NSObject context);

    /**
     * [@function] nw_connection_group_send_message
     * 
     * Send data that is not in response to an inbound message. This outgoing
     * message will be sent from the local endpoint on which the connection group is
     * listening for incoming messages.
     * 
     * This is an asynchronous send and the completion block can be used to
     * determine when the send is complete. There is nothing preventing a client
     * from issuing an excessive number of outstanding sends. To minimize memory
     * footprint and excessive latency as a consequence of buffer bloat, it is
     * advisable to keep a low number of outstanding sends. The completion block
     * can be used to pace subsequent sends.
     * 
     * @param group
     *                   The connection group object from which to send the outbound data.
     * 
     * @param content
     *                   A data object to send as the message body. This may be NULL if the outgoing
     *                   context represents a metadata only message that contains no body data.
     * 
     * @param endpoint
     *                   The destination endpoint to which the outbound message should be sent. If the
     *                   endpoint is NULL, the message will be sent to all members of the group.
     * 
     * @param context
     *                   An outbound message to send from the connection group.
     * 
     *                   The context can also hold protocol metadata to define how to send content,
     *                   such as flags for IP packets.
     * 
     *                   If the context is marked as "final", the connection group will expect that no further
     *                   communication is
     *                   expected during this connection with the peer and may close the underlying transport.
     *                   Subsequent connection attempts from the peer will be delivered as incoming messages.
     * 
     * @param completion
     *                   A callback to be called when the message has been sent, or an error has occurred.
     *                   This callback does not indicate that the remote side has acknowledged the data.
     *                   This callback does indicate that the data has either been sent or it has been
     *                   enqueued to be sent.
     * 
     *                   API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_group_send_message(@NotNull NSObject group, @Nullable NSObject content,
            @Nullable NSObject endpoint, @NotNull NSObject context,
            @NotNull @ObjCBlock(name = "call_nw_connection_group_send_message") Block_nw_connection_group_send_message completion);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_group_send_message {
        @Generated
        void call_nw_connection_group_send_message(@Nullable NSObject error);
    }

    /**
     * [@function] nw_resolution_report_get_source
     * 
     * Check the source of a resolution, such as query or cache.
     * 
     * @param resolution_report
     *                          A resolution report.
     * 
     * @return
     *         The source of the resolution (query or cache).
     * 
     *         API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native int nw_resolution_report_get_source(@NotNull NSObject resolution_report);

    /**
     * [@function] nw_resolution_report_get_milliseconds
     * 
     * Get the number of milliseconds spent on this resolution step.
     * 
     * @param resolution_report
     *                          A resolution report.
     * 
     * @return
     *         The number of milliseconds spent on this resolution step.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native long nw_resolution_report_get_milliseconds(@NotNull NSObject resolution_report);

    /**
     * [@function] nw_resolution_report_get_endpoint_count
     * 
     * Get the number of resolved endpoints discovered by the resolution step.
     * 
     * @param resolution_report
     *                          A resolution report.
     * 
     * @return
     *         The number of resolved endpoints discovered by the resolution step.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native int nw_resolution_report_get_endpoint_count(@NotNull NSObject resolution_report);

    /**
     * [@function] nw_resolution_report_copy_successful_endpoint
     * 
     * Copy the resolved endpoint that led to a successful connection.
     * 
     * @param resolution_report
     *                          A resolution report.
     * 
     * @return
     *         The resolved endpoint that led to a successful connection.
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_resolution_report_copy_successful_endpoint(@NotNull NSObject resolution_report);

    /**
     * [@function] nw_resolution_report_copy_preferred_endpoint
     * 
     * Copy first resolved endpoint attempted, which may be the same as the successful endpoint.
     * 
     * @param resolution_report
     *                          A resolution report.
     * 
     * @return
     *         The first resolved endpoint attempted.
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_resolution_report_copy_preferred_endpoint(@NotNull NSObject resolution_report);

    /**
     * [@function] nw_resolution_report_get_protocol
     * 
     * Check the protocol used for endpoint resolution.
     * 
     * @param resolution_report
     *                          A resolution report.
     * 
     * @return
     *         The protocol used for endpoint resolution.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native int nw_resolution_report_get_protocol(@NotNull NSObject resolution_report);

    /**
     * [@function] nw_establishment_report_enumerate_resolution_reports
     * 
     * Enumerate the steps of connection establishment that involved endpoint
     * resolution, such as DNS hostname resolution and Bonjour service resolution.
     * This variant provides resolution report objects, which allow more detailed
     * access to information.
     * 
     * The provided block will be called inline zero or more times.
     * 
     * @param report
     *                        An establishment report.
     * 
     * @param enumerate_block
     *                        A block to be invoked zero or more times, once for each step of resolution
     *                        used during connection establishment. Each block contains a nw_resolution_report_t.
     * 
     *                        Returning true from the block indicates that the enumeration should continue.
     *                        Returning false indicates that the enumeration should stop.
     * 
     *                        API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_establishment_report_enumerate_resolution_reports(@NotNull NSObject report,
            @NotNull @ObjCBlock(name = "call_nw_establishment_report_enumerate_resolution_reports") Block_nw_establishment_report_enumerate_resolution_reports enumerate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_establishment_report_enumerate_resolution_reports {
        @Generated
        boolean call_nw_establishment_report_enumerate_resolution_reports(@NotNull NSObject resolution_report);
    }

    /**
     * [@function] nw_ip_options_set_disable_multicast_loopback
     * 
     * If a multicast packet is sent to a group to which the sending host itself
     * belongs (on the outgoing interface), a copy of the datagram is, by default,
     * looped back by the IP layer for local delivery.
     * Setting the disable_multicast_loopback option disables this behavior and,
     * if set, multicast packets will not be looped back to the sender.
     * Only applies to multicast packets.
     * 
     * @param options
     *                                   An IP protocol options object.
     * 
     * @param disable_multicast_loopback
     *                                   If multicast loopback should be disabled.
     * 
     *                                   API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_ip_options_set_disable_multicast_loopback(@NotNull NSObject options,
            boolean disable_multicast_loopback);

    /**
     * [@function] nw_path_monitor_prohibit_interface_type
     * 
     * Prohibit this path monitor from using the provided network interface type.
     * Call before calling nw_path_monitor_start.
     * 
     * @param monitor
     *                       The path monitor object.
     * 
     * @param interface_type
     *                       The interface type to prohibit for the path monitor.
     * 
     *                       API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void nw_path_monitor_prohibit_interface_type(@NotNull NSObject monitor, int interface_type);

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native NSObject _nw_privacy_context_default_context();

    /**
     * [@function] nw_path_get_unsatisfied_reason
     * 
     * Retrieves a reason the path is not satisfied. In some cases, the reason helps to
     * determine why the path is not satisfied. While the path may be unsatisfied for more
     * than one reason, only the first reason will be given. In many cases, the path may be
     * unsatisfied with no reason available.
     * 
     * @param path
     *             The path object to check.
     * 
     * @return
     *         Returns a reason the path is unsatisfied or nw_path_unsatisfied_reason_not_available if a reason is not
     *         available.
     * 
     *         API-Since: 14.2
     */
    @Generated
    @CFunction
    public static native int nw_path_get_unsatisfied_reason(@NotNull NSObject path);

    /**
     * [@function] nw_parameters_create_quic
     * 
     * Creates a parameters object that is configured for QUIC. The caller must
     * pass in a block to configure options.
     * 
     * @param configure_quic
     *                       A block to configure QUIC. The caller must pass a custom
     *                       block to configure the QUIC options.
     * 
     * @return
     *         Returns an allocated nw_parameters_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     *         Returns NULL on failure. Fails due to invalid parameters.
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_parameters_create_quic(
            @NotNull @ObjCBlock(name = "call_nw_parameters_create_quic") Block_nw_parameters_create_quic configure_quic);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_create_quic {
        @Generated
        void call_nw_parameters_create_quic(@NotNull NSObject options);
    }

    /**
     * [@function] nw_parameters_set_attribution
     * 
     * In order to help differentiate communication with domains requested by the user from those requested by the
     * developer, attribution may be used. Attribution defaults to nw_parameters_attribution_developer. Setting
     * attribution to nw_parameters_attribution_user indicates that the networking performed using these parameters
     * is directed to content specified by the user, not the developer.
     * 
     * @param parameters
     *                    The parameters to modify.
     * 
     * @param attribution
     *                    The entity to attribute the network operations to.
     * 
     *                    API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_attribution(@NotNull NSObject parameters, byte attribution);

    /**
     * [@function] nw_parameters_get_attribution
     * 
     * Returns the attribution set on the parameters.
     * 
     * @param parameters
     *                   The parameters to check.
     * 
     * @return
     *         Returns the attribution property of the parameters.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native byte nw_parameters_get_attribution(@NotNull NSObject parameters);

    /**
     * [@function] nw_group_descriptor_create_multiplex
     * 
     * Creates a new group descriptor object based on an endpoint
     * to which communication will be established using a multiplexing protocol,
     * represented as an nw_endpoint containing the remote endpoint
     * to use for communication.
     * 
     * @param remote_endpoint
     *                        An endpoint that can be used for communication over a multiplexing protocol.
     * 
     * @return
     *         An instantiated group descriptor object or nil if the specified
     *         endpoint is not valid.
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_group_descriptor_create_multiplex(@NotNull NSObject remote_endpoint);

    /**
     * [@function] nw_connection_group_copy_protocol_metadata_for_message
     * 
     * Copy the metadata corresponding to a given inbound connection group message.
     * 
     * @param group
     *                   The connection group object.
     * 
     * @param definition
     *                   The protocol definition for which metadata will be returned.
     * 
     * @return
     *         Returns a retained protocol metadata object, or NULL if not found.
     * 
     *         API-Since: 15.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_connection_group_copy_protocol_metadata_for_message(@NotNull NSObject group,
            @NotNull NSObject context, @NotNull NSObject definition);

    /**
     * [@function] nw_connection_group_extract_connection
     * 
     * Extract a connection from the connection group. For a multiplex connection group, this means that
     * a new stream is opened and the corresponding nw_connection_t object is returned. For non-multiplex
     * connection groups, a connection to the specified endpoint will be returned if allowed by the group descriptor.
     * 
     * The connection can be re-inserted into the group later. Once reinserted, the connection group
     * will handle subsequent messages from this remote endpoint.
     * An extracted connection must have a queue set and be started before it can be used.
     * 
     * @param group
     *                         The connection group object from which to extract a connection.
     * 
     * @param endpoint
     *                         The endpoint to use as the remote endpoint for the extracted connection, if applicable.
     *                         For connection groups with multiplex group descriptors, this should be nil.
     * 
     * @param protocol_options
     *                         The protocol options to apply to the extracted connection. May be nil if not applicable.
     * 
     * @return
     *         Returns the connection from the connection group.
     * 
     *         API-Since: 15.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_connection_group_extract_connection(@NotNull NSObject group,
            @Nullable NSObject endpoint, @Nullable NSObject protocol_options);

    /**
     * [@function] nw_connection_group_reinsert_extracted_connection
     * 
     * Reinsert a connection into a connection group. Once reinserted, the connection group
     * will handle subsequent messages from this remote endpoint, and any outstanding reads on
     * the connection will be cancelled.
     * 
     * @param group
     *                   The connection group object from which the connection was extracted. If the connection was
     *                   not extracted from this connection group, the reinsertion will fail.
     * 
     * @param connection
     *                   A connection that was extracted from this connection group.
     * 
     * @return
     *         Returns true if the reinsertion was successful. Reinsertion will fail if the provided connection was
     *         not extracted from this connection group.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native boolean nw_connection_group_reinsert_extracted_connection(@NotNull NSObject group,
            @NotNull NSObject connection);

    /**
     * [@function] nw_connection_group_set_new_connection_handler
     * 
     * Sets the new connection handler to be invoked whenever a new inbound connection
     * is received by the connection group. This function must not be called
     * after starting the connection group.
     * 
     * @param group
     *                               The connection group object.
     * 
     * @param new_connection_handler
     *                               The new connection handler to call upon receipt of a new inbound connection.
     *                               Pass NULL to remove the handler.
     * 
     *                               API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_connection_group_set_new_connection_handler(@NotNull NSObject group,
            @Nullable @ObjCBlock(name = "call_nw_connection_group_set_new_connection_handler") Block_nw_connection_group_set_new_connection_handler new_connection_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_group_set_new_connection_handler {
        @Generated
        void call_nw_connection_group_set_new_connection_handler(@NotNull NSObject connection);
    }

    /**
     * [@function] nw_connection_group_copy_protocol_metadata
     * 
     * Copy the metadata corresponding to a given inbound connection group message.
     * 
     * @param group
     *                   The connection group object.
     * 
     * @param definition
     *                   The protocol definition for which metadata will be returned.
     * 
     * @return
     *         Returns a retained protocol metadata object, or NULL if the connection
     *         group has not been established yet or is cancelled.
     * 
     *         API-Since: 15.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_connection_group_copy_protocol_metadata(@NotNull NSObject group,
            @NotNull NSObject definition);

    /**
     * [@function] nw_data_transfer_report_get_path_radio_type
     * 
     * Retrieve the radio type used for data transfer for a given
     * path used by a connection.
     * 
     * @param report
     *                   A data transfer report in the "collected" state.
     * 
     * @param path_index
     *                   The index for the path over which data is transferred.
     *                   Passing NW_ALL_PATHS for this function is
     *                   equivalent to passing 0.
     * 
     * @return
     *         Returns the radio type used for the specified path.
     *         Returns nw_interface_radio_type_unknown on failure.
     *         Fails if the report is not yet collected.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native int nw_data_transfer_report_get_path_radio_type(@NotNull NSObject report, int path_index);

    /**
     * [@function] nw_listener_set_new_connection_group_handler
     * 
     * Sets a new connection group handler to be called upon receiving an incoming
     * connection that has a multiplexing protocol in its connected protocol stack.
     * Must be called before nw_listener_start. Note that this handler is mutually
     * exclusive with the new connection handler that is set via
     * nw_listener_set_new_connection_handler. Only one of these handlers may
     * be set at one time.
     * 
     * @param listener
     *                 The listener object.
     * 
     * @param handler
     *                 The event handler to call when the listener receives a new connection group.
     *                 Pass NULL to remove the new connection group handler.
     * 
     *                 API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_listener_set_new_connection_group_handler(@NotNull NSObject listener,
            @Nullable @ObjCBlock(name = "call_nw_listener_set_new_connection_group_handler") Block_nw_listener_set_new_connection_group_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_listener_set_new_connection_group_handler {
        @Generated
        void call_nw_listener_set_new_connection_group_handler(@NotNull NSObject connection_group);
    }

    /**
     * [@function] nw_protocol_copy_quic_definition
     * 
     * Access the definition of the default system protocol implementation
     * of QUIC. This protocol can be used as part of a
     * connection's protocol stack as a transport protocol.
     * 
     * @return
     *         Returns a retained protocol definition object.
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_protocol_copy_quic_definition();

    /**
     * [@function] nw_quic_create_options
     * 
     * Create an instance of QUIC protocol options. This object can be added
     * to an nw_protocol_stack_t to be used in an nw_connection_t or
     * an nw_listener_t.
     * 
     * @return
     *         Returns a retained protocol options object.
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_quic_create_options();

    /**
     * [@function] nw_protocol_options_is_quic
     * 
     * Checks whether the given protocol options define a QUIC protocol.
     * 
     * @return
     *         Returns true if the protocol options are for QUIC, false otherwise.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native boolean nw_protocol_options_is_quic(@NotNull NSObject options);

    /**
     * [@function] nw_quic_add_tls_application_protocol
     * 
     * Adds an Application-Layer Protocol Negotiation (ALPN) value to present in the TLS handshake.
     * 
     * @param options
     *                An nw_protocol_options_t for QUIC.
     * 
     *                API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_add_tls_application_protocol(@NotNull NSObject options,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String application_protocol);

    /**
     * [@function] nw_quic_copy_sec_protocol_options
     * 
     * Access the sec_protocol_options_t for a given QUIC
     * options instance. See <Security/SecProtocolOptions.h> for functions
     * to further configure security options.
     * 
     * @param options
     *                An nw_protocol_options_t for QUIC.
     * 
     * @return
     *         Returns a retained sec_protocol_options_t object.
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_quic_copy_sec_protocol_options(@NotNull NSObject options);

    /**
     * [@function] nw_quic_get_stream_is_unidirectional
     * 
     * Returns whether or not a QUIC stream is unidirectional.
     * 
     * @param options
     *                An nw_protocol_options_t for a QUIC stream.
     * 
     * @return
     *         True if the stream is unidirectional, false otherwise.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native boolean nw_quic_get_stream_is_unidirectional(@NotNull NSObject options);

    /**
     * [@function] nw_quic_set_stream_is_unidirectional
     * 
     * Set whether or not a QUIC stream should be unidirectional.
     * 
     * @param options
     *                          An nw_protocol_options_t for a QUIC stream.
     * 
     * @param is_unidirectional
     *                          True if the stream is unidirectional, false otherwise.
     * 
     *                          API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_stream_is_unidirectional(@NotNull NSObject options,
            boolean is_unidirectional);

    /**
     * [@function] nw_quic_get_initial_max_data
     * 
     * Get the initial_max_data transport parameter on a QUIC
     * connection.
     * 
     * @param options
     *                An nw_protocol_options_t for QUIC.
     * 
     * @return
     *         The initial_max_data that a client
     *         is willing to receive on a connection.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_initial_max_data(@NotNull NSObject options);

    /**
     * [@function] nw_quic_set_initial_max_data
     * 
     * Set the initial_max_data transport parameter on a QUIC
     * connection. Setting this option requires
     * initial_max_stream_data_bidirectional_local,
     * initial_max_stream_data_bidirectional_remote and
     * initial_max_stream_data_unidirectional also to be set.
     * 
     * @param options
     *                         An nw_protocol_options_t for QUIC.
     * 
     * @param initial_max_data
     *                         The initial_max_data controls how much data, in bytes, a client
     *                         is willing to receive on a connection.
     * 
     *                         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_initial_max_data(@NotNull NSObject options, long initial_max_data);

    /**
     * [@function] nw_quic_get_max_udp_payload_size
     * 
     * Get the maximum length of a QUIC packet (UDP payload)
     * that the client is willing to receive on a connection, in bytes.
     * 
     * @param options
     *                An nw_protocol_options_t for QUIC.
     * 
     * @return
     *         The max_udp_payload_size value, in bytes.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native char nw_quic_get_max_udp_payload_size(@NotNull NSObject options);

    /**
     * [@function] nw_quic_set_max_udp_payload_size
     * 
     * Define the maximum length of a QUIC packet (UDP payload)
     * that the client is willing to receive on a connection, in bytes.
     * 
     * @param options
     *                             An nw_protocol_options_t for QUIC.
     * 
     * @param max_udp_payload_size
     *                             The max_udp_payload_size value, in bytes.
     * 
     *                             API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_max_udp_payload_size(@NotNull NSObject options, char max_udp_payload_size);

    /**
     * [@function] nw_quic_get_idle_timeout
     * 
     * Get the idle timeout value for the QUIC connection. If no packets are sent or received
     * within this timeout, the QUIC connection will be closed.
     * 
     * @param options
     *                An nw_protocol_options_t for QUIC.
     * 
     * @return
     *         The idle_timeout value, in milliseconds.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native int nw_quic_get_idle_timeout(@NotNull NSObject options);

    /**
     * [@function] nw_quic_set_idle_timeout
     * 
     * Define an idle timeout value for the QUIC connection. If no packets are sent or received
     * within this timeout, the QUIC connection will be closed.
     * 
     * @param options
     *                     An nw_protocol_options_t for QUIC.
     * 
     * @param idle_timeout
     *                     The idle_timeout value, in milliseconds.
     * 
     *                     API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_idle_timeout(@NotNull NSObject options, int idle_timeout);

    /**
     * [@function] nw_quic_get_initial_max_streams_bidirectional
     * 
     * Get the initial value of maximum bidirectional streams
     * that the peer can initiate on a QUIC connection.
     * 
     * @param options
     *                An nw_protocol_options_t for QUIC.
     * 
     * @return
     *         The initial value for the maximum concurrent bidirectional streams.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_initial_max_streams_bidirectional(@NotNull NSObject options);

    /**
     * [@function] nw_quic_set_initial_max_streams_bidirectional
     * 
     * Set the initial value of maximum bidirectional streams
     * that the peer can initiate on a QUIC connection.
     * 
     * @param options
     *                                          An nw_protocol_options_t for QUIC.
     * 
     * @param initial_max_streams_bidirectional
     *                                          The initial value for the maximum concurrent bidirectional streams.
     * 
     *                                          API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_initial_max_streams_bidirectional(@NotNull NSObject options,
            long initial_max_streams_bidirectional);

    /**
     * [@function] nw_quic_get_initial_max_streams_unidirectional
     * 
     * Get the initial value of maximum unidirectional streams
     * that the peer can initiate on a QUIC connection.
     * 
     * @param options
     *                An nw_protocol_options_t for QUIC.
     * 
     * @return
     *         The initial value for the maximum concurrent unidirectional streams.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_initial_max_streams_unidirectional(@NotNull NSObject options);

    /**
     * [@function] nw_quic_set_initial_max_streams_unidirectional
     * 
     * Set the initial value of maximum unidirectional streams
     * that the peer can initiate on a QUIC connection.
     * 
     * @param options
     *                                           An nw_protocol_options_t for QUIC.
     * 
     * @param initial_max_streams_unidirectional
     *                                           The initial value for the maximum concurrent unidirectional streams.
     * 
     *                                           API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_initial_max_streams_unidirectional(@NotNull NSObject options,
            long initial_max_streams_unidirectional);

    /**
     * [@function] nw_quic_get_initial_max_stream_data_bidirectional_local
     * 
     * Get the initial_max_stream_data_bidi_local transport parameter
     * on a QUIC connection.
     * 
     * @param options
     *                An nw_protocol_options_t for QUIC.
     * 
     * @return
     *         How much data the client is willing to receive on a locally initiated stream.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_initial_max_stream_data_bidirectional_local(@NotNull NSObject options);

    /**
     * [@function] nw_quic_set_initial_max_stream_data_bidirectional_local
     * 
     * Set the initial_max_stream_data_bidi_local transport parameter
     * on a QUIC connection.
     * 
     * @param options
     *                                                    An nw_protocol_options_t for QUIC.
     * 
     * @param initial_max_stream_data_bidirectional_local
     *                                                    The initial_max_stream_data_bidi_local controls how much data
     *                                                    the client is willing to receive on a locally initiated
     *                                                    stream.
     * 
     *                                                    API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_initial_max_stream_data_bidirectional_local(@NotNull NSObject options,
            long initial_max_stream_data_bidirectional_local);

    /**
     * [@function] nw_quic_get_initial_max_stream_data_bidirectional_remote
     * 
     * Get the initial_max_stream_data_bidi_remote transport parameter
     * on a QUIC connection.
     * 
     * @param options
     *                An nw_protocol_options_t for QUIC.
     * 
     * @return
     *         How much data the client is willing to receive on a remotely initiated stream.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_initial_max_stream_data_bidirectional_remote(@NotNull NSObject options);

    /**
     * [@function] nw_quic_set_initial_max_stream_data_bidirectional_remote
     * 
     * Set the initial_max_stream_data_bidi_remote transport parameter
     * on a QUIC connection.
     * 
     * @param options
     *                                                     An nw_protocol_options_t for QUIC.
     * 
     * @param initial_max_stream_data_bidirectional_remote
     *                                                     The initial_max_stream_data_bidi_remote controls how much
     *                                                     data
     *                                                     the client is willing to receive on a remotely initiated
     *                                                     stream.
     * 
     *                                                     API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_initial_max_stream_data_bidirectional_remote(@NotNull NSObject options,
            long initial_max_stream_data_bidirectional_remote);

    /**
     * [@function] nw_quic_get_initial_max_stream_data_unidirectional
     * 
     * Get the initial_max_stream_data_uni transport parameter
     * on a QUIC connection.
     * 
     * @param options
     *                An nw_protocol_options_t for QUIC.
     * 
     * @return
     *         How much data the client is willing to receive on a unidirectional stream.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_initial_max_stream_data_unidirectional(@NotNull NSObject options);

    /**
     * [@function] nw_quic_set_initial_max_stream_data_unidirectional
     * 
     * Set the initial_max_stream_data_uni transport parameter
     * on a QUIC connection.
     * 
     * @param options
     *                                               An nw_protocol_options_t for QUIC.
     * 
     * @param initial_max_stream_data_unidirectional
     *                                               The initial_max_stream_data_uni controls how much data
     *                                               the client is willing to receive on a unidirectional stream.
     * 
     *                                               API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_initial_max_stream_data_unidirectional(@NotNull NSObject options,
            long initial_max_stream_data_unidirectional);

    /**
     * [@function] nw_protocol_metadata_is_quic
     * 
     * Checks if a protocol metadata object is compatible with the
     * accessors defined in this file for the default system
     * implementation of QUIC.
     * 
     * @return
     *         Returns true if the metadata is for the default system QUIC,
     *         false otherwise.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_quic(@NotNull NSObject metadata);

    /**
     * [@function] nw_quic_copy_sec_protocol_metadata
     * 
     * Access the sec_protocol_metadata_t for a given QUIC connection
     * metadata instance. See <Security/SecProtocolOptions.h> for functions
     * to further configure security options.
     * 
     * Will be filled out on connected instances of QUIC for metadata
     * returned by nw_connection_copy_protocol_metadata.
     * 
     * @param metadata
     *                 An nw_protocol_metadata_t for QUIC.
     * 
     * @return
     *         Returns a retained sec_protocol_metadata_t object.
     * 
     *         API-Since: 15.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_quic_copy_sec_protocol_metadata(@NotNull NSObject metadata);

    /**
     * [@function] nw_quic_get_stream_id
     * 
     * Get the QUIC stream ID.
     * 
     * @param metadata
     *                 A nw_protocol_metadata_t for a QUIC stream.
     * 
     * @return
     *         Returns the QUIC stream id.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_stream_id(@NotNull NSObject metadata);

    /**
     * [@function] nw_quic_get_stream_application_error
     * 
     * Access the Application Error value received from the peer in a stream close
     * message.
     * 
     * @param metadata
     *                 A nw_protocol_metadata_t for a QUIC stream.
     * 
     * @return
     *         Returns the Application Error code value received from by the peer,
     *         or UINT64_MAX if no error has been received.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_stream_application_error(@NotNull NSObject metadata);

    /**
     * [@function] nw_quic_set_stream_application_error
     * 
     * Set an Application Error value to send to the peer when the stream
     * is closed.
     * 
     * @param metadata
     *                          A nw_protocol_metadata_t for a QUIC stream.
     * 
     * @param application_error
     *                          An application-specific error code value.
     * 
     *                          API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_stream_application_error(@NotNull NSObject metadata, long application_error);

    /**
     * [@function] nw_quic_get_local_max_streams_bidirectional
     * 
     * Get the most recent value of the maximum number of bidirectional streams that the peer can create.
     * 
     * @param metadata
     *                 A nw_protocol_metadata_t for QUIC.
     * 
     * @return
     *         Returns the most recent value of the peer's max number of bidirectional streams.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_local_max_streams_bidirectional(@NotNull NSObject metadata);

    /**
     * [@function] nw_quic_set_local_max_streams_bidirectional
     * 
     * Sets the maximum number of bidirectional streams that the peer can create.
     * 
     * @param metadata
     *                                  A nw_protocol_metadata_t for QUIC.
     * 
     * @param max_streams_bidirectional
     *                                  The new number of maximum bidirectional streams.
     * 
     *                                  API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_local_max_streams_bidirectional(@NotNull NSObject metadata,
            long max_streams_bidirectional);

    /**
     * [@function] nw_quic_get_local_max_streams_unidirectional
     * 
     * Get the most recent value of the maximum number of unidirectional streams that the peer can create.
     * 
     * @param metadata
     *                 A nw_protocol_metadata_t for QUIC.
     * 
     * @return
     *         Returns the most recent value of the peer's max number of unidirectional streams.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_local_max_streams_unidirectional(@NotNull NSObject metadata);

    /**
     * [@function] nw_quic_set_local_max_streams_unidirectional
     * 
     * Sets the maximum number of unidirectional streams that the peer can create.
     * 
     * @param metadata
     *                                   A nw_protocol_metadata_t for QUIC.
     * 
     * @param max_streams_unidirectional
     *                                   The new number of maximum unidirectional streams.
     * 
     *                                   API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_local_max_streams_unidirectional(@NotNull NSObject metadata,
            long max_streams_unidirectional);

    /**
     * [@function] nw_quic_get_remote_max_streams_bidirectional
     * 
     * Get the maximum number of bidirectional streams advertised by peer that an application
     * is allowed to create.
     * 
     * Note that while attempts to create streams above this limit will
     * be blocked until the server increases the limit, these blocked
     * attempts will cause a STREAMS_BLOCKED frame to be sent to the
     * server. This informs the server that the client has more streams
     * it would like to create. As a result, the caller should attempt to
     * create streams over this limit if it desires more streams.
     * 
     * @param metadata
     *                 A nw_protocol_metadata_t for QUIC.
     * 
     * @return
     *         Returns the most recent value of the peer's advertised max number of bidirectional streams.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_remote_max_streams_bidirectional(@NotNull NSObject metadata);

    /**
     * [@function] nw_quic_get_remote_max_streams_unidirectional
     * 
     * Get the maximum number of unidirectional streams advertised by peer that an application
     * is allowed to create.
     * 
     * Note that while attempts to create streams above this limit will
     * be blocked until the server increases the limit, these blocked
     * attempts will cause a STREAMS_BLOCKED frame to be sent to the
     * server. This informs the server that the client has more streams
     * it would like to create. As a result, the caller should attempt to
     * create streams over this limit if it desires more streams.
     * 
     * @param metadata
     *                 A nw_protocol_metadata_t for QUIC.
     * 
     * @return
     *         Returns the most recent value of the peer's advertised max number of unidirectional streams.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_remote_max_streams_unidirectional(@NotNull NSObject metadata);

    /**
     * [@function] nw_quic_get_application_error
     * 
     * Access the Application Error value received from the peer in a connection close
     * message.
     * 
     * @param metadata
     *                 A nw_protocol_metadata_t for QUIC.
     * 
     * @return
     *         Returns the Application Error code value received from by the peer,
     *         or UINT64_MAX if no error has been received.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_application_error(@NotNull NSObject metadata);

    /**
     * [@function] nw_quic_get_application_error_reason
     * 
     * Access the Application Error reason string received from the peer in a connection
     * close message.
     * 
     * @param metadata
     *                 A nw_protocol_metadata_t for QUIC.
     * 
     * @return
     *         Returns the Application Error reason received from by the peer,
     *         or NULL if no error reason has been received.
     * 
     *         API-Since: 15.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_quic_get_application_error_reason(@NotNull NSObject metadata);

    /**
     * [@function] nw_quic_set_application_error
     * 
     * Set the Application Error value to send to the peer in a connection close
     * message.
     * 
     * @param metadata
     *                          A nw_protocol_metadata_t for QUIC.
     * 
     * @param application_error
     *                          Sets the Application Error code value.
     * 
     * @param reason
     *                          An optional reason string to associate with the error.
     * 
     *                          API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_application_error(@NotNull NSObject metadata, long application_error,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String reason);

    /**
     * [@function] nw_quic_get_keepalive_interval
     * 
     * Retrieves the keep-alive interval set on a QUIC connection.
     * 
     * @param metadata
     *                 A nw_protocol_metadata_t for QUIC.
     * 
     * @return
     *         Returns value of the keep-alive interval, in seconds,
     *         or 0 if the keep-alive timer is disabled.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native char nw_quic_get_keepalive_interval(@NotNull NSObject metadata);

    /**
     * [@function] nw_quic_set_keepalive_interval
     * 
     * Changes the keep-alive interval for QUIC.
     * 
     * QUIC connections are encrypted and operate over the UDP protocol
     * which makes it hard for Network Address Translators and firewalls
     * to track their state. For this reason, these middleboxes may
     * use short timeouts for QUIC flows. By sending keep-alive packets
     * (QUIC PING frames), the endpoint can maintain
     * state of the flow across the network.
     * Keep-alives should only be enabled while there is an outstanding
     * exchange of information with the remote endpoint that has not yet
     * completed, it is not recommended to enable keep-alive packets on an
     * idle connection that is not expecting to send or receive data in
     * the near future.
     * 
     * @param metadata
     *                           A nw_protocol_metadata_t for QUIC.
     * 
     * @param keepalive_interval
     *                           The keep-alive interval for QUIC, in seconds,
     *                           or 0 if the keep-alive timer is disabled.
     *                           Pass `NW_QUIC_CONNECTION_DEFAULT_KEEPALIVE` to use the default
     *                           keep-alive interval.
     * 
     *                           API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_keepalive_interval(@NotNull NSObject metadata, char keepalive_interval);

    /**
     * [@function] nw_quic_get_remote_idle_timeout
     * 
     * Access the idle_timeout value in milliseconds received from the peer
     * in the transport parameters.
     * 
     * @param metadata
     *                 A nw_protocol_metadata_t for QUIC.
     * 
     * @return
     *         Returns the idle_timeout value in milliseconds received from the peer.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native long nw_quic_get_remote_idle_timeout(@NotNull NSObject metadata);

    /**
     * [@function] nw_tcp_options_set_multipath_force_version
     * 
     * Configure MPTCP to use a specified MPTCP standard version.
     * This ignores the cached value from MPTCP version discovery.
     * 
     * @param options
     *                                A TCP protocol options object.
     * 
     * @param multipath_force_version
     *                                The MPTCP version.
     * 
     *                                API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native void nw_tcp_options_set_multipath_force_version(@NotNull NSObject options,
            int multipath_force_version);

    /**
     * [@function] nw_advertise_descriptor_create_application_service
     * 
     * Creates an advertise descriptor for application service discovery.
     * 
     * @param application_service_name
     *                                 The service name to advertise.
     * 
     * @return
     *         An instantiated advertise descriptor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_advertise_descriptor_create_application_service(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String application_service_name);

    /**
     * [@function] nw_advertise_descriptor_get_application_service_name
     * 
     * Returns the service name of an application service advertise descriptor.
     * 
     * @param advertise_descriptor
     *                             An advertise descriptor object.
     * 
     * @return
     *         The service name or NULL if the advertise descriptor is not of the correct type.
     * 
     *         API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_advertise_descriptor_get_application_service_name(
            @NotNull NSObject advertise_descriptor);

    /**
     * [@function] nw_endpoint_copy_txt_record
     * 
     * Retrieves the TXT record associated with the endpoint, if present.
     * TXT records can be populated during browsing and connection
     * establishment.
     * 
     * @param endpoint
     *                 The endpoint object.
     * 
     * @return
     *         Returns a retained nw_txt_record_t object if a TXT record
     *         is associated with this endpoint, or NULL otherwise.
     * 
     *         API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native NSObject nw_endpoint_copy_txt_record(@NotNull NSObject endpoint);

    /**
     * [@function] nw_endpoint_get_signature
     * 
     * Retrieves a signed data blob associated with an endpoint.
     * 
     * @param endpoint
     *                             The endpoint to modify.
     * 
     * @param out_signature_length
     *                             A pointer to a size_t that will take the length of the signature.
     * 
     * @return
     *         Returns a pointer to a buffer of bytes containing a signature,
     *         or NULL if the endpoint is not signed.
     * 
     *         API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_endpoint_get_signature(@NotNull NSObject endpoint,
            @NotNull NUIntPtr out_signature_length);

    /**
     * [@function] nw_parameters_create_application_service
     * 
     * Creates default parameters for use with application services.
     * 
     * @return
     *         Returns an allocated nw_parameters_t object on success.
     *         Callers are responsible for deallocating using nw_release(obj) or [obj release].
     *         These objects support ARC.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_parameters_create_application_service();

    /**
     * [@function] nw_parameters_set_requires_dnssec_validation
     * 
     * Require to do or not to do DNSSEC validation when resolving the endpoint, before
     * making a connection.
     * 
     * DNSSEC validation only takes effect if making a connection to an
     * endpoint that requires domain name resolution, such as:
     * <code>nw_endpoint_type_host</code>
     * <code>nw_endpoint_type_url</code>
     * 
     * 1. If this property is not set or is set to false on the parameters, DNSSEC
     * validation will not be required.
     * 
     * 2. If this property is set to true and no additional DNSSEC
     * configuration is set on the parameters, the default behavior will be
     * followed: Only DNSSEC secure and DNSSEC insecure resolved result will be
     * used to establish a connection.
     * 
     * 3. If this property is set to true and additional DNSSEC configuration
     * is set on the parameters, the behavior specified by that configuration
     * will be followed.
     * 
     * API-Since: 16.0
     * 
     * @param parameters
     *                                   The parameters object to configure.
     * 
     * @param requires_dnssec_validation
     *                                   A boolean value that indicates if DNSSEC validation should be required
     *                                   when doing DNS resolution for the endpoint.
     */
    @Generated
    @CFunction
    public static native void nw_parameters_set_requires_dnssec_validation(@NotNull NSObject parameters,
            boolean requires_dnssec_validation);

    /**
     * [@function] nw_parameters_requires_dnssec_validation
     * 
     * Check if DNSSEC validation is required.
     * 
     * @param parameters
     *                   The parameters object to check.
     * 
     * @return
     *         Returns true if DNSSEC validation is required, false otherwise.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native boolean nw_parameters_requires_dnssec_validation(@NotNull NSObject parameters);

    /**
     * [@function] nw_browse_descriptor_create_application_service
     * 
     * Creates a browse descriptor for application service discovery.
     * 
     * @param application_service_name
     *                                 The service name to browse for.
     * 
     * @return
     *         An instantiated browse descriptor object.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_browse_descriptor_create_application_service(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String application_service_name);

    /**
     * [@function] nw_browse_descriptor_get_application_service_name
     * 
     * Returns the service name of an application service browse descriptor.
     * 
     * @param descriptor
     *                   A browse descriptor object.
     * 
     * @return
     *         The service name.
     * 
     *         API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_browse_descriptor_get_application_service_name(@NotNull NSObject descriptor);

    /**
     * [@function] nw_framer_options_set_object_value
     * 
     * Set a key-value pair on framer options, where the
     * value is a reference-counted object.
     * 
     * @param options
     *                The framer options object.
     * 
     * @param key
     *                The string key to identify the value.
     * 
     * @param value
     *                A reference counted object to store.
     * 
     *                API-Since: 15.4
     */
    @Generated
    @CFunction
    public static native void nw_framer_options_set_object_value(@NotNull NSObject options,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * [@function] nw_framer_options_copy_object_value
     * 
     * Copy the stored object value using a key on framer options.
     * 
     * @param options
     *                The framer options object.
     * 
     * @param key
     *                The string key to identify the value.
     * 
     * @return
     *         Returns a reference counted object with a +1 reference count,
     *         or NULL if no value was found for the specified key.
     * 
     *         API-Since: 15.4
     */
    @Nullable
    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object nw_framer_options_copy_object_value(@NotNull NSObject options,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

    /**
     * [@function] nw_framer_copy_options
     * 
     * Access the protocol options being used for a given
     * instance of a framer.
     * 
     * @param framer
     *               The framer instance.
     * 
     * @return
     *         Returns a retained protocol options object.
     * 
     *         API-Since: 15.4
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSObject nw_framer_copy_options(@NotNull NSObject framer);

    /**
     * [@function] nw_quic_get_stream_is_datagram
     * 
     * Get whether or not the QUIC stream is a QUIC datagram flow.
     * 
     * @param options
     *                An nw_protocol_options_t for QUIC.
     * 
     * @return is_datagram
     *         True if the QUIC stream is a QUIC datagram flow.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native boolean nw_quic_get_stream_is_datagram(@NotNull NSObject options);

    /**
     * [@function] nw_quic_set_stream_is_datagram
     * 
     * Set whether or not the QUIC stream should be a QUIC datagram flow.
     * Only one QUIC datagram flow can be created per connection.
     * 
     * @param options
     *                    An nw_protocol_options_t for QUIC.
     * 
     * @param is_datagram
     *                    A boolean to indicate whether or not the QUIC stream should be a QUIC datagram flow.
     * 
     *                    API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_stream_is_datagram(@NotNull NSObject options, boolean is_datagram);

    /**
     * [@function] nw_quic_get_max_datagram_frame_size
     * 
     * Get the max_datagram_frame_size transport parameter
     * on a QUIC connection.
     * 
     * @param options
     *                An nw_protocol_options_t for QUIC.
     * 
     * @return
     *         If greater than zero, the max_datagram_frame_size value indicates that
     *         DATAGRAM frames are supported, and describes the maximum number
     *         of bytes that a single DATAGRAM frame can contain.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native char nw_quic_get_max_datagram_frame_size(@NotNull NSObject options);

    /**
     * [@function] nw_quic_set_max_datagram_frame_size
     * 
     * Set the max_datagram_frame_size transport parameter
     * on a QUIC connection.
     * 
     * @param options
     *                                An nw_protocol_options_t for QUIC.
     * 
     * @param max_datagram_frame_size
     *                                If greater than zero, the max_datagram_frame_size value indicates that
     *                                DATAGRAM frames are supported, and describes the maximum number
     *                                of bytes that a single DATAGRAM frame can contain.
     * 
     *                                API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native void nw_quic_set_max_datagram_frame_size(@NotNull NSObject options,
            char max_datagram_frame_size);

    /**
     * [@function] nw_quic_stream_get_type
     * 
     * Describes the type of the QUIC stream.
     * 
     * @param stream_metadata
     *                        A nw_protocol_metadata_t for a QUIC stream.
     * 
     * @return
     *         Returns the type of the QUIC stream, stored in nw_quic_stream_type_t.
     *         If the type can not be determined, returns nw_quic_stream_type_unknown.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native byte nw_quic_get_stream_type(@NotNull NSObject stream_metadata);

    /**
     * [@function] nw_quic_get_stream_usable_datagram_frame_size
     * 
     * Get the usable size of a datagram frame from a QUIC datagram flow.
     * 
     * @param metadata
     *                 A nw_protocol_metadata_t for QUIC.
     * 
     * @return
     *         Returns the usable datagram frame size.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native char nw_quic_get_stream_usable_datagram_frame_size(@NotNull NSObject metadata);

    @Generated public static final double NW_NOT_i386_MAC = 1.0;
    @Generated public static final double NW_FRAMER_CREATE_FLAGS_DEFAULT = 0.0;
}
