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

    @Generated
    @CFunction
    public static native NSObject nw_txt_record_create_with_bytes(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String txt_bytes,
            @NUInt long txt_len);

    @Generated
    @CFunction
    public static native NSObject nw_txt_record_create_dictionary();

    @Generated
    @CFunction
    public static native NSObject nw_txt_record_copy(NSObject txt_record);

    @Generated
    @CFunction
    public static native int nw_txt_record_find_key(NSObject txt_record,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

    @Generated
    @CFunction
    public static native boolean nw_txt_record_access_key(NSObject txt_record,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @ObjCBlock(name = "call_nw_txt_record_access_key") Block_nw_txt_record_access_key access_value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_txt_record_access_key {
        @Generated
        boolean call_nw_txt_record_access_key(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String key,
                int found,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String value,
                @NUInt long value_len);
    }

    @Generated
    @CFunction
    public static native boolean nw_txt_record_set_key(NSObject txt_record,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value,
            @NUInt long value_len);

    @Generated
    @CFunction
    public static native boolean nw_txt_record_remove_key(NSObject txt_record,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

    @Generated
    @CFunction
    @NUInt
    public static native long nw_txt_record_get_key_count(NSObject txt_record);

    @Generated
    @CFunction
    public static native boolean nw_txt_record_access_bytes(NSObject txt_record,
            @ObjCBlock(name = "call_nw_txt_record_access_bytes") Block_nw_txt_record_access_bytes access_bytes);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_txt_record_access_bytes {
        @Generated
        boolean call_nw_txt_record_access_bytes(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String raw_txt_record,
                @NUInt long len);
    }

    @Generated
    @CFunction
    public static native boolean nw_txt_record_apply(NSObject txt_record,
            @ObjCBlock(name = "call_nw_txt_record_apply") Block_nw_txt_record_apply applier);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_txt_record_apply {
        @Generated
        boolean call_nw_txt_record_apply(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String key,
                int found,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String value,
                @NUInt long value_len);
    }

    @Generated
    @CFunction
    public static native boolean nw_txt_record_is_equal(NSObject left, NSObject right);

    @Generated
    @CFunction
    public static native boolean nw_txt_record_is_dictionary(NSObject txt_record);

    @Generated
    @CFunction
    public static native NSObject nw_advertise_descriptor_create_bonjour_service(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain);

    @Generated
    @CFunction
    public static native void nw_advertise_descriptor_set_txt_record(NSObject advertise_descriptor,
            ConstVoidPtr txt_record, @NUInt long txt_length);

    @Generated
    @CFunction
    public static native void nw_advertise_descriptor_set_no_auto_rename(NSObject advertise_descriptor,
            boolean no_auto_rename);

    @Generated
    @CFunction
    public static native boolean nw_advertise_descriptor_get_no_auto_rename(NSObject advertise_descriptor);

    @Generated
    @CFunction
    public static native void nw_advertise_descriptor_set_txt_record_object(NSObject advertise_descriptor,
            NSObject txt_record);

    @Generated
    @CFunction
    public static native NSObject nw_advertise_descriptor_copy_txt_record_object(NSObject advertise_descriptor);

    @Generated
    @CFunction
    public static native boolean nw_protocol_definition_is_equal(NSObject definition1, NSObject definition2);

    @Generated
    @CFunction
    public static native NSObject nw_protocol_options_copy_definition(NSObject options);

    @Generated
    @CFunction
    public static native NSObject nw_protocol_metadata_copy_definition(NSObject metadata);

    @Generated
    @CFunction
    public static native int nw_interface_get_type(NSObject interface_);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_interface_get_name(NSObject interface_);

    @Generated
    @CFunction
    public static native int nw_interface_get_index(NSObject interface_);

    @Generated
    @CFunction
    public static native int nw_endpoint_get_type(NSObject endpoint);

    @Generated
    @CFunction
    public static native NSObject nw_endpoint_create_host(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String hostname,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String port);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_endpoint_get_hostname(NSObject endpoint);

    @Generated
    @CFunction
    public static native BytePtr nw_endpoint_copy_port_string(NSObject endpoint);

    @Generated
    @CFunction
    public static native char nw_endpoint_get_port(NSObject endpoint);

    @Generated
    @CFunction
    public static native NSObject nw_endpoint_create_address(
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr address);

    @Generated
    @CFunction
    public static native BytePtr nw_endpoint_copy_address_string(NSObject endpoint);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native sockaddr nw_endpoint_get_address(NSObject endpoint);

    @Generated
    @CFunction
    public static native NSObject nw_endpoint_create_bonjour_service(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_endpoint_get_bonjour_service_name(NSObject endpoint);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_endpoint_get_bonjour_service_type(NSObject endpoint);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_endpoint_get_bonjour_service_domain(NSObject endpoint);

    @Generated
    @CFunction
    public static native NSObject nw_endpoint_create_url(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String url);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_endpoint_get_url(NSObject endpoint);

    @Generated
    @CFunction
    public static native NSObject nw_parameters_create_secure_tcp(
            @ObjCBlock(name = "call_nw_parameters_create_secure_tcp_0") Block_nw_parameters_create_secure_tcp_0 configure_tls,
            @ObjCBlock(name = "call_nw_parameters_create_secure_tcp_1") Block_nw_parameters_create_secure_tcp_1 configure_tcp);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_create_secure_tcp_0 {
        @Generated
        void call_nw_parameters_create_secure_tcp_0(NSObject options);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_create_secure_tcp_1 {
        @Generated
        void call_nw_parameters_create_secure_tcp_1(NSObject options);
    }

    @Generated
    @CFunction
    public static native NSObject nw_parameters_create_secure_udp(
            @ObjCBlock(name = "call_nw_parameters_create_secure_udp_0") Block_nw_parameters_create_secure_udp_0 configure_dtls,
            @ObjCBlock(name = "call_nw_parameters_create_secure_udp_1") Block_nw_parameters_create_secure_udp_1 configure_udp);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_create_secure_udp_0 {
        @Generated
        void call_nw_parameters_create_secure_udp_0(NSObject options);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_create_secure_udp_1 {
        @Generated
        void call_nw_parameters_create_secure_udp_1(NSObject options);
    }

    @Generated
    @CFunction
    public static native NSObject nw_parameters_create();

    @Generated
    @CFunction
    public static native NSObject nw_parameters_copy(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_require_interface(NSObject parameters, NSObject interface_);

    @Generated
    @CFunction
    public static native NSObject nw_parameters_copy_required_interface(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_prohibit_interface(NSObject parameters, NSObject interface_);

    @Generated
    @CFunction
    public static native void nw_parameters_clear_prohibited_interfaces(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_iterate_prohibited_interfaces(NSObject parameters,
            @ObjCBlock(name = "call_nw_parameters_iterate_prohibited_interfaces") Block_nw_parameters_iterate_prohibited_interfaces iterate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_iterate_prohibited_interfaces {
        @Generated
        boolean call_nw_parameters_iterate_prohibited_interfaces(NSObject interface_);
    }

    @Generated
    @CFunction
    public static native void nw_parameters_set_required_interface_type(NSObject parameters, int interface_type);

    @Generated
    @CFunction
    public static native int nw_parameters_get_required_interface_type(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_prohibit_interface_type(NSObject parameters, int interface_type);

    @Generated
    @CFunction
    public static native void nw_parameters_clear_prohibited_interface_types(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_iterate_prohibited_interface_types(NSObject parameters,
            @ObjCBlock(name = "call_nw_parameters_iterate_prohibited_interface_types") Block_nw_parameters_iterate_prohibited_interface_types iterate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_parameters_iterate_prohibited_interface_types {
        @Generated
        boolean call_nw_parameters_iterate_prohibited_interface_types(int interface_type);
    }

    @Generated
    @CFunction
    public static native void nw_parameters_set_prohibit_expensive(NSObject parameters, boolean prohibit_expensive);

    @Generated
    @CFunction
    public static native boolean nw_parameters_get_prohibit_expensive(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_set_prohibit_constrained(NSObject parameters, boolean prohibit_constrained);

    @Generated
    @CFunction
    public static native boolean nw_parameters_get_prohibit_constrained(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_set_reuse_local_address(NSObject parameters, boolean reuse_local_address);

    @Generated
    @CFunction
    public static native boolean nw_parameters_get_reuse_local_address(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_set_local_endpoint(NSObject parameters, NSObject local_endpoint);

    @Generated
    @CFunction
    public static native NSObject nw_parameters_copy_local_endpoint(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_set_include_peer_to_peer(NSObject parameters, boolean include_peer_to_peer);

    @Generated
    @CFunction
    public static native boolean nw_parameters_get_include_peer_to_peer(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_set_fast_open_enabled(NSObject parameters, boolean fast_open_enabled);

    @Generated
    @CFunction
    public static native boolean nw_parameters_get_fast_open_enabled(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_set_service_class(NSObject parameters, int service_class);

    @Generated
    @CFunction
    public static native int nw_parameters_get_service_class(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_set_multipath_service(NSObject parameters, int multipath_service);

    @Generated
    @CFunction
    public static native int nw_parameters_get_multipath_service(NSObject parameters);

    @Generated
    @CFunction
    public static native NSObject nw_parameters_copy_default_protocol_stack(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_protocol_stack_prepend_application_protocol(NSObject stack, NSObject protocol);

    @Generated
    @CFunction
    public static native void nw_protocol_stack_clear_application_protocols(NSObject stack);

    @Generated
    @CFunction
    public static native void nw_protocol_stack_iterate_application_protocols(NSObject stack,
            @ObjCBlock(name = "call_nw_protocol_stack_iterate_application_protocols") Block_nw_protocol_stack_iterate_application_protocols iterate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_protocol_stack_iterate_application_protocols {
        @Generated
        void call_nw_protocol_stack_iterate_application_protocols(NSObject protocol);
    }

    @Generated
    @CFunction
    public static native NSObject nw_protocol_stack_copy_transport_protocol(NSObject stack);

    @Generated
    @CFunction
    public static native void nw_protocol_stack_set_transport_protocol(NSObject stack, NSObject protocol);

    @Generated
    @CFunction
    public static native NSObject nw_protocol_stack_copy_internet_protocol(NSObject stack);

    @Generated
    @CFunction
    public static native void nw_parameters_set_local_only(NSObject parameters, boolean local_only);

    @Generated
    @CFunction
    public static native boolean nw_parameters_get_local_only(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_set_prefer_no_proxy(NSObject parameters, boolean prefer_no_proxy);

    @Generated
    @CFunction
    public static native boolean nw_parameters_get_prefer_no_proxy(NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_parameters_set_expired_dns_behavior(NSObject parameters, int expired_dns_behavior);

    @Generated
    @CFunction
    public static native int nw_parameters_get_expired_dns_behavior(NSObject parameters);

    @Generated
    @CFunction
    public static native NSObject nw_browse_descriptor_create_bonjour_service(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_browse_descriptor_get_bonjour_service_type(NSObject descriptor);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_browse_descriptor_get_bonjour_service_domain(NSObject descriptor);

    @Generated
    @CFunction
    public static native void nw_browse_descriptor_set_include_txt_record(NSObject descriptor,
            boolean include_txt_record);

    @Generated
    @CFunction
    public static native boolean nw_browse_descriptor_get_include_txt_record(NSObject descriptor);

    @Generated
    @CFunction
    public static native NSObject nw_browse_result_copy_endpoint(NSObject result);

    @Generated
    @CFunction
    public static native long nw_browse_result_get_changes(NSObject old_result, NSObject new_result);

    @Generated
    @CFunction
    @NUInt
    public static native long nw_browse_result_get_interfaces_count(NSObject result);

    @Generated
    @CFunction
    public static native NSObject nw_browse_result_copy_txt_record_object(NSObject result);

    @Generated
    @CFunction
    public static native void nw_browse_result_enumerate_interfaces(NSObject result,
            @ObjCBlock(name = "call_nw_browse_result_enumerate_interfaces") Block_nw_browse_result_enumerate_interfaces enumerator);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_browse_result_enumerate_interfaces {
        @Generated
        boolean call_nw_browse_result_enumerate_interfaces(NSObject interface_);
    }

    @Generated
    @CFunction
    public static native int nw_error_get_error_domain(NSObject error);

    @Generated
    @CFunction
    public static native int nw_error_get_error_code(NSObject error);

    @Generated
    @CFunction
    public static native CFErrorRef nw_error_copy_cf_error(NSObject error);

    @Generated
    @CFunction
    public static native NSObject nw_browser_create(NSObject descriptor, NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_browser_set_queue(NSObject browser, NSObject queue);

    @Generated
    @CFunction
    public static native void nw_browser_set_browse_results_changed_handler(NSObject browser,
            @ObjCBlock(name = "call_nw_browser_set_browse_results_changed_handler") Block_nw_browser_set_browse_results_changed_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_browser_set_browse_results_changed_handler {
        @Generated
        void call_nw_browser_set_browse_results_changed_handler(NSObject old_result, NSObject new_result,
                boolean batch_complete);
    }

    @Generated
    @CFunction
    public static native void nw_browser_set_state_changed_handler(NSObject browser,
            @ObjCBlock(name = "call_nw_browser_set_state_changed_handler") Block_nw_browser_set_state_changed_handler state_changed_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_browser_set_state_changed_handler {
        @Generated
        void call_nw_browser_set_state_changed_handler(int state, NSObject error);
    }

    @Generated
    @CFunction
    public static native void nw_browser_start(NSObject browser);

    @Generated
    @CFunction
    public static native void nw_browser_cancel(NSObject browser);

    @Generated
    @CFunction
    public static native NSObject nw_browser_copy_parameters(NSObject browser);

    @Generated
    @CFunction
    public static native NSObject nw_browser_copy_browse_descriptor(NSObject browser);

    @Generated
    @CFunction
    public static native int nw_path_get_status(NSObject path);

    @Generated
    @CFunction
    public static native void nw_path_enumerate_interfaces(NSObject path,
            @ObjCBlock(name = "call_nw_path_enumerate_interfaces") Block_nw_path_enumerate_interfaces enumerate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_path_enumerate_interfaces {
        @Generated
        boolean call_nw_path_enumerate_interfaces(NSObject interface_);
    }

    @Generated
    @CFunction
    public static native boolean nw_path_is_equal(NSObject path, NSObject other_path);

    @Generated
    @CFunction
    public static native boolean nw_path_is_expensive(NSObject path);

    @Generated
    @CFunction
    public static native boolean nw_path_is_constrained(NSObject path);

    @Generated
    @CFunction
    public static native boolean nw_path_has_ipv4(NSObject path);

    @Generated
    @CFunction
    public static native boolean nw_path_has_ipv6(NSObject path);

    @Generated
    @CFunction
    public static native boolean nw_path_has_dns(NSObject path);

    @Generated
    @CFunction
    public static native boolean nw_path_uses_interface_type(NSObject path, int interface_type);

    @Generated
    @CFunction
    public static native NSObject nw_path_copy_effective_local_endpoint(NSObject path);

    @Generated
    @CFunction
    public static native NSObject nw_path_copy_effective_remote_endpoint(NSObject path);

    @Generated
    @CFunction
    public static native void nw_path_enumerate_gateways(NSObject path,
            @ObjCBlock(name = "call_nw_path_enumerate_gateways") Block_nw_path_enumerate_gateways enumerate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_path_enumerate_gateways {
        @Generated
        boolean call_nw_path_enumerate_gateways(NSObject gateway);
    }

    @Generated
    @CFunction
    public static native NSObject nw_content_context_create(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String context_identifier);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_content_context_get_identifier(NSObject context);

    @Generated
    @CFunction
    public static native boolean nw_content_context_get_is_final(NSObject context);

    @Generated
    @CFunction
    public static native void nw_content_context_set_is_final(NSObject context, boolean is_final);

    @Generated
    @CFunction
    public static native long nw_content_context_get_expiration_milliseconds(NSObject context);

    @Generated
    @CFunction
    public static native void nw_content_context_set_expiration_milliseconds(NSObject context,
            long expiration_milliseconds);

    @Generated
    @CFunction
    public static native double nw_content_context_get_relative_priority(NSObject context);

    @Generated
    @CFunction
    public static native void nw_content_context_set_relative_priority(NSObject context, double relative_priority);

    @Generated
    @CFunction
    public static native void nw_content_context_set_antecedent(NSObject context, NSObject antecendent_context);

    @Generated
    @CFunction
    public static native NSObject nw_content_context_copy_antecedent(NSObject context);

    @Generated
    @CFunction
    public static native void nw_content_context_set_metadata_for_protocol(NSObject context,
            NSObject protocol_metadata);

    @Generated
    @CFunction
    public static native NSObject nw_content_context_copy_protocol_metadata(NSObject context, NSObject protocol);

    @Generated
    @CFunction
    public static native void nw_content_context_foreach_protocol_metadata(NSObject context,
            @ObjCBlock(name = "call_nw_content_context_foreach_protocol_metadata") Block_nw_content_context_foreach_protocol_metadata foreach_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_content_context_foreach_protocol_metadata {
        @Generated
        void call_nw_content_context_foreach_protocol_metadata(NSObject arg0, NSObject arg1);
    }

    @Generated
    @CFunction
    public static native NSObject nw_connection_create(NSObject endpoint, NSObject parameters);

    @Generated
    @CFunction
    public static native NSObject nw_connection_copy_endpoint(NSObject connection);

    @Generated
    @CFunction
    public static native NSObject nw_connection_copy_parameters(NSObject connection);

    @Generated
    @CFunction
    public static native void nw_connection_set_state_changed_handler(NSObject connection,
            @ObjCBlock(name = "call_nw_connection_set_state_changed_handler") Block_nw_connection_set_state_changed_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_set_state_changed_handler {
        @Generated
        void call_nw_connection_set_state_changed_handler(int state, NSObject error);
    }

    @Generated
    @CFunction
    public static native void nw_connection_set_viability_changed_handler(NSObject connection,
            @ObjCBlock(name = "call_nw_connection_set_viability_changed_handler") Block_nw_connection_set_viability_changed_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_set_viability_changed_handler {
        @Generated
        void call_nw_connection_set_viability_changed_handler(boolean value);
    }

    @Generated
    @CFunction
    public static native void nw_connection_set_better_path_available_handler(NSObject connection,
            @ObjCBlock(name = "call_nw_connection_set_better_path_available_handler") Block_nw_connection_set_better_path_available_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_set_better_path_available_handler {
        @Generated
        void call_nw_connection_set_better_path_available_handler(boolean value);
    }

    @Generated
    @CFunction
    public static native void nw_connection_set_path_changed_handler(NSObject connection,
            @ObjCBlock(name = "call_nw_connection_set_path_changed_handler") Block_nw_connection_set_path_changed_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_set_path_changed_handler {
        @Generated
        void call_nw_connection_set_path_changed_handler(NSObject path);
    }

    @Generated
    @CFunction
    public static native void nw_connection_set_queue(NSObject connection, NSObject queue);

    @Generated
    @CFunction
    public static native void nw_connection_start(NSObject connection);

    @Generated
    @CFunction
    public static native void nw_connection_restart(NSObject connection);

    @Generated
    @CFunction
    public static native void nw_connection_cancel(NSObject connection);

    @Generated
    @CFunction
    public static native void nw_connection_force_cancel(NSObject connection);

    @Generated
    @CFunction
    public static native void nw_connection_cancel_current_endpoint(NSObject connection);

    @Generated
    @CFunction
    public static native void nw_connection_receive(NSObject connection, int minimum_incomplete_length,
            int maximum_length, @ObjCBlock(name = "call_nw_connection_receive") Block_nw_connection_receive completion);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_receive {
        @Generated
        void call_nw_connection_receive(NSObject content, NSObject context, boolean is_complete, NSObject error);
    }

    @Generated
    @CFunction
    public static native void nw_connection_receive_message(NSObject connection,
            @ObjCBlock(name = "call_nw_connection_receive_message") Block_nw_connection_receive_message completion);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_receive_message {
        @Generated
        void call_nw_connection_receive_message(NSObject content, NSObject context, boolean is_complete,
                NSObject error);
    }

    @Generated
    @CFunction
    public static native void nw_connection_send(NSObject connection, NSObject content, NSObject context,
            boolean is_complete, @ObjCBlock(name = "call_nw_connection_send") Block_nw_connection_send completion);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_send {
        @Generated
        void call_nw_connection_send(NSObject error);
    }

    @Generated
    @CFunction
    public static native void nw_connection_batch(NSObject connection,
            @ObjCBlock(name = "call_nw_connection_batch") Block_nw_connection_batch batch_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_batch {
        @Generated
        void call_nw_connection_batch();
    }

    @Generated
    @CFunction
    public static native BytePtr nw_connection_copy_description(NSObject connection);

    @Generated
    @CFunction
    public static native NSObject nw_connection_copy_current_path(NSObject connection);

    @Generated
    @CFunction
    public static native NSObject nw_connection_copy_protocol_metadata(NSObject connection, NSObject definition);

    @Generated
    @CFunction
    public static native int nw_connection_get_maximum_datagram_size(NSObject connection);

    @Generated
    @CFunction
    public static native void nw_connection_access_establishment_report(NSObject connection, NSObject queue,
            @ObjCBlock(name = "call_nw_connection_access_establishment_report") Block_nw_connection_access_establishment_report access_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_connection_access_establishment_report {
        @Generated
        void call_nw_connection_access_establishment_report(NSObject report);
    }

    @Generated
    @CFunction
    public static native long nw_establishment_report_get_duration_milliseconds(NSObject report);

    @Generated
    @CFunction
    public static native long nw_establishment_report_get_attempt_started_after_milliseconds(NSObject report);

    @Generated
    @CFunction
    public static native int nw_establishment_report_get_previous_attempt_count(NSObject report);

    @Generated
    @CFunction
    public static native boolean nw_establishment_report_get_used_proxy(NSObject report);

    @Generated
    @CFunction
    public static native boolean nw_establishment_report_get_proxy_configured(NSObject report);

    @Generated
    @CFunction
    public static native NSObject nw_establishment_report_copy_proxy_endpoint(NSObject report);

    @Generated
    @CFunction
    public static native void nw_establishment_report_enumerate_resolutions(NSObject report,
            @ObjCBlock(name = "call_nw_establishment_report_enumerate_resolutions") Block_nw_establishment_report_enumerate_resolutions enumerate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_establishment_report_enumerate_resolutions {
        @Generated
        boolean call_nw_establishment_report_enumerate_resolutions(int source, long milliseconds, int endpoint_count,
                NSObject successful_endpoint, NSObject preferred_endpoint);
    }

    @Generated
    @CFunction
    public static native void nw_establishment_report_enumerate_protocols(NSObject report,
            @ObjCBlock(name = "call_nw_establishment_report_enumerate_protocols") Block_nw_establishment_report_enumerate_protocols enumerate_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_establishment_report_enumerate_protocols {
        @Generated
        boolean call_nw_establishment_report_enumerate_protocols(NSObject protocol, long handshake_milliseconds,
                long handshake_rtt_milliseconds);
    }

    @Generated
    @CFunction
    public static native NSObject nw_connection_create_new_data_transfer_report(NSObject connection);

    @Generated
    @CFunction
    public static native int nw_data_transfer_report_get_state(NSObject report);

    @Generated
    @CFunction
    public static native void nw_data_transfer_report_collect(NSObject report, NSObject queue,
            @ObjCBlock(name = "call_nw_data_transfer_report_collect") Block_nw_data_transfer_report_collect collect_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_data_transfer_report_collect {
        @Generated
        void call_nw_data_transfer_report_collect(NSObject report);
    }

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_duration_milliseconds(NSObject report);

    @Generated
    @CFunction
    public static native int nw_data_transfer_report_get_path_count(NSObject report);

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_received_ip_packet_count(NSObject report, int path_index);

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_sent_ip_packet_count(NSObject report, int path_index);

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_received_transport_byte_count(NSObject report,
            int path_index);

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_received_transport_duplicate_byte_count(NSObject report,
            int path_index);

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_received_transport_out_of_order_byte_count(NSObject report,
            int path_index);

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_sent_transport_byte_count(NSObject report, int path_index);

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_sent_transport_retransmitted_byte_count(NSObject report,
            int path_index);

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_transport_smoothed_rtt_milliseconds(NSObject report,
            int path_index);

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_transport_minimum_rtt_milliseconds(NSObject report,
            int path_index);

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_transport_rtt_variance(NSObject report, int path_index);

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_received_application_byte_count(NSObject report,
            int path_index);

    @Generated
    @CFunction
    public static native long nw_data_transfer_report_get_sent_application_byte_count(NSObject report, int path_index);

    @Generated
    @CFunction
    public static native NSObject nw_data_transfer_report_copy_path_interface(NSObject report, int path_index);

    @Generated
    @CFunction
    public static native NSObject nw_framer_protocol_create_message(NSObject definition);

    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_framer_message(NSObject metadata);

    @Generated
    @CFunction
    public static native NSObject nw_framer_message_create(NSObject framer);

    @Generated
    @CFunction
    public static native void nw_framer_message_set_value(NSObject message,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            VoidPtr value,
            @ObjCBlock(name = "call_nw_framer_message_set_value") Block_nw_framer_message_set_value dispose_value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_message_set_value {
        @Generated
        void call_nw_framer_message_set_value(VoidPtr value);
    }

    @Generated
    @CFunction
    public static native boolean nw_framer_message_access_value(NSObject message,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @ObjCBlock(name = "call_nw_framer_message_access_value") Block_nw_framer_message_access_value access_value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_message_access_value {
        @Generated
        boolean call_nw_framer_message_access_value(ConstVoidPtr arg0);
    }

    @Generated
    @CFunction
    public static native void nw_framer_message_set_object_value(NSObject message,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object nw_framer_message_copy_object_value(NSObject message,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

    @Generated
    @CFunction
    public static native NSObject nw_framer_create_definition(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String identifier,
            int flags,
            @ObjCBlock(name = "call_nw_framer_create_definition") Block_nw_framer_create_definition start_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_create_definition {
        @Generated
        int call_nw_framer_create_definition(NSObject framer);
    }

    @Generated
    @CFunction
    public static native NSObject nw_framer_create_options(NSObject framer_definition);

    @Generated
    @CFunction
    public static native void nw_framer_set_input_handler(NSObject framer,
            @ObjCBlock(name = "call_nw_framer_set_input_handler") Block_nw_framer_set_input_handler input_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_set_input_handler {
        @Generated
        @NUInt
        long call_nw_framer_set_input_handler(NSObject framer);
    }

    @Generated
    @CFunction
    public static native void nw_framer_set_output_handler(NSObject framer,
            @ObjCBlock(name = "call_nw_framer_set_output_handler") Block_nw_framer_set_output_handler output_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_set_output_handler {
        @Generated
        void call_nw_framer_set_output_handler(NSObject framer, NSObject message, @NUInt long message_length,
                boolean is_complete);
    }

    @Generated
    @CFunction
    public static native void nw_framer_set_wakeup_handler(NSObject framer,
            @ObjCBlock(name = "call_nw_framer_set_wakeup_handler") Block_nw_framer_set_wakeup_handler wakeup_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_set_wakeup_handler {
        @Generated
        void call_nw_framer_set_wakeup_handler(NSObject framer);
    }

    @Generated
    @CFunction
    public static native void nw_framer_set_stop_handler(NSObject framer,
            @ObjCBlock(name = "call_nw_framer_set_stop_handler") Block_nw_framer_set_stop_handler stop_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_set_stop_handler {
        @Generated
        boolean call_nw_framer_set_stop_handler(NSObject framer);
    }

    @Generated
    @CFunction
    public static native void nw_framer_set_cleanup_handler(NSObject framer,
            @ObjCBlock(name = "call_nw_framer_set_cleanup_handler") Block_nw_framer_set_cleanup_handler cleanup_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_set_cleanup_handler {
        @Generated
        void call_nw_framer_set_cleanup_handler(NSObject framer);
    }

    @Generated
    @CFunction
    public static native void nw_framer_mark_ready(NSObject framer);

    @Generated
    @CFunction
    public static native boolean nw_framer_prepend_application_protocol(NSObject framer, NSObject protocol_options);

    @Generated
    @CFunction
    public static native void nw_framer_mark_failed_with_error(NSObject framer, int error_code);

    @Generated
    @CFunction
    public static native boolean nw_framer_parse_input(NSObject framer, @NUInt long minimum_incomplete_length,
            @NUInt long maximum_length, BytePtr temp_buffer,
            @ObjCBlock(name = "call_nw_framer_parse_input") Block_nw_framer_parse_input parse);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_parse_input {
        @Generated
        @NUInt
        long call_nw_framer_parse_input(BytePtr buffer, @NUInt long buffer_length, boolean is_complete);
    }

    @Generated
    @CFunction
    public static native void nw_framer_deliver_input(NSObject framer,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String input_buffer,
            @NUInt long input_length, NSObject message, boolean is_complete);

    @Generated
    @CFunction
    public static native boolean nw_framer_deliver_input_no_copy(NSObject framer, @NUInt long input_length,
            NSObject message, boolean is_complete);

    @Generated
    @CFunction
    public static native void nw_framer_pass_through_input(NSObject framer);

    @Generated
    @CFunction
    public static native boolean nw_framer_parse_output(NSObject framer, @NUInt long minimum_incomplete_length,
            @NUInt long maximum_length, BytePtr temp_buffer,
            @ObjCBlock(name = "call_nw_framer_parse_output") Block_nw_framer_parse_output parse);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_parse_output {
        @Generated
        @NUInt
        long call_nw_framer_parse_output(BytePtr buffer, @NUInt long buffer_length, boolean is_complete);
    }

    @Generated
    @CFunction
    public static native void nw_framer_write_output(NSObject framer,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String output_buffer,
            @NUInt long output_length);

    @Generated
    @CFunction
    public static native void nw_framer_write_output_data(NSObject framer, NSObject output_data);

    @Generated
    @CFunction
    public static native boolean nw_framer_write_output_no_copy(NSObject framer, @NUInt long output_length);

    @Generated
    @CFunction
    public static native void nw_framer_pass_through_output(NSObject framer);

    @Generated
    @CFunction
    public static native void nw_framer_schedule_wakeup(NSObject framer, long milliseconds);

    @Generated
    @CFunction
    public static native void nw_framer_async(NSObject framer,
            @ObjCBlock(name = "call_nw_framer_async") Block_nw_framer_async async_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_framer_async {
        @Generated
        void call_nw_framer_async();
    }

    @Generated
    @CFunction
    public static native NSObject nw_framer_copy_remote_endpoint(NSObject framer);

    @Generated
    @CFunction
    public static native NSObject nw_framer_copy_local_endpoint(NSObject framer);

    @Generated
    @CFunction
    public static native NSObject nw_framer_copy_parameters(NSObject framer);

    @Generated
    @CFunction
    public static native NSObject nw_protocol_copy_ip_definition();

    @Generated
    @CFunction
    public static native void nw_ip_options_set_version(NSObject options, int version);

    @Generated
    @CFunction
    public static native void nw_ip_options_set_hop_limit(NSObject options, byte hop_limit);

    @Generated
    @CFunction
    public static native void nw_ip_options_set_use_minimum_mtu(NSObject options, boolean use_minimum_mtu);

    @Generated
    @CFunction
    public static native void nw_ip_options_set_disable_fragmentation(NSObject options, boolean disable_fragmentation);

    @Generated
    @CFunction
    public static native void nw_ip_options_set_calculate_receive_time(NSObject options,
            boolean calculate_receive_time);

    @Generated
    @CFunction
    public static native void nw_ip_options_set_local_address_preference(NSObject options, int preference);

    @Generated
    @CFunction
    public static native NSObject nw_ip_create_metadata();

    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_ip(NSObject metadata);

    @Generated
    @CFunction
    public static native void nw_ip_metadata_set_ecn_flag(NSObject metadata, int ecn_flag);

    @Generated
    @CFunction
    public static native int nw_ip_metadata_get_ecn_flag(NSObject metadata);

    @Generated
    @CFunction
    public static native void nw_ip_metadata_set_service_class(NSObject metadata, int service_class);

    @Generated
    @CFunction
    public static native int nw_ip_metadata_get_service_class(NSObject metadata);

    @Generated
    @CFunction
    public static native long nw_ip_metadata_get_receive_time(NSObject metadata);

    @Generated
    @CFunction
    public static native NSObject nw_listener_create_with_port(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String port,
            NSObject parameters);

    @Generated
    @CFunction
    public static native NSObject nw_listener_create(NSObject parameters);

    @Generated
    @CFunction
    public static native NSObject nw_listener_create_with_connection(NSObject connection, NSObject parameters);

    @Generated
    @CFunction
    public static native void nw_listener_set_queue(NSObject listener, NSObject queue);

    @Generated
    @CFunction
    public static native void nw_listener_set_state_changed_handler(NSObject listener,
            @ObjCBlock(name = "call_nw_listener_set_state_changed_handler") Block_nw_listener_set_state_changed_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_listener_set_state_changed_handler {
        @Generated
        void call_nw_listener_set_state_changed_handler(int state, NSObject error);
    }

    @Generated
    @CFunction
    public static native void nw_listener_set_new_connection_handler(NSObject listener,
            @ObjCBlock(name = "call_nw_listener_set_new_connection_handler") Block_nw_listener_set_new_connection_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_listener_set_new_connection_handler {
        @Generated
        void call_nw_listener_set_new_connection_handler(NSObject connection);
    }

    @Generated
    @CFunction
    public static native int nw_listener_get_new_connection_limit(NSObject listener);

    @Generated
    @CFunction
    public static native void nw_listener_set_new_connection_limit(NSObject listener, int new_connection_limit);

    @Generated
    @CFunction
    public static native void nw_listener_set_advertise_descriptor(NSObject listener, NSObject advertise_descriptor);

    @Generated
    @CFunction
    public static native void nw_listener_set_advertised_endpoint_changed_handler(NSObject listener,
            @ObjCBlock(name = "call_nw_listener_set_advertised_endpoint_changed_handler") Block_nw_listener_set_advertised_endpoint_changed_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_listener_set_advertised_endpoint_changed_handler {
        @Generated
        void call_nw_listener_set_advertised_endpoint_changed_handler(NSObject advertised_endpoint, boolean added);
    }

    @Generated
    @CFunction
    public static native char nw_listener_get_port(NSObject listener);

    @Generated
    @CFunction
    public static native void nw_listener_start(NSObject listener);

    @Generated
    @CFunction
    public static native void nw_listener_cancel(NSObject listener);

    @Generated
    @CFunction
    public static native NSObject nw_path_monitor_create();

    @Generated
    @CFunction
    public static native NSObject nw_path_monitor_create_with_type(int required_interface_type);

    @Generated
    @CFunction
    public static native void nw_path_monitor_set_cancel_handler(NSObject monitor,
            @ObjCBlock(name = "call_nw_path_monitor_set_cancel_handler") Block_nw_path_monitor_set_cancel_handler cancel_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_path_monitor_set_cancel_handler {
        @Generated
        void call_nw_path_monitor_set_cancel_handler();
    }

    @Generated
    @CFunction
    public static native void nw_path_monitor_set_update_handler(NSObject monitor,
            @ObjCBlock(name = "call_nw_path_monitor_set_update_handler") Block_nw_path_monitor_set_update_handler update_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_path_monitor_set_update_handler {
        @Generated
        void call_nw_path_monitor_set_update_handler(NSObject path);
    }

    @Generated
    @CFunction
    public static native void nw_path_monitor_set_queue(NSObject monitor, NSObject queue);

    @Generated
    @CFunction
    public static native void nw_path_monitor_start(NSObject monitor);

    @Generated
    @CFunction
    public static native void nw_path_monitor_cancel(NSObject monitor);

    @Generated
    @CFunction
    public static native NSObject nw_protocol_copy_tcp_definition();

    @Generated
    @CFunction
    public static native NSObject nw_tcp_create_options();

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_no_delay(NSObject options, boolean no_delay);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_no_push(NSObject options, boolean no_push);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_no_options(NSObject options, boolean no_options);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_enable_keepalive(NSObject options, boolean enable_keepalive);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_keepalive_count(NSObject options, int keepalive_count);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_keepalive_idle_time(NSObject options, int keepalive_idle_time);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_keepalive_interval(NSObject options, int keepalive_interval);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_maximum_segment_size(NSObject options, int maximum_segment_size);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_connection_timeout(NSObject options, int connection_timeout);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_persist_timeout(NSObject options, int persist_timeout);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_retransmit_connection_drop_time(NSObject options,
            int retransmit_connection_drop_time);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_retransmit_fin_drop(NSObject options, boolean retransmit_fin_drop);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_disable_ack_stretching(NSObject options,
            boolean disable_ack_stretching);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_enable_fast_open(NSObject options, boolean enable_fast_open);

    @Generated
    @CFunction
    public static native void nw_tcp_options_set_disable_ecn(NSObject options, boolean disable_ecn);

    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_tcp(NSObject metadata);

    @Generated
    @CFunction
    public static native int nw_tcp_get_available_receive_buffer(NSObject metadata);

    @Generated
    @CFunction
    public static native int nw_tcp_get_available_send_buffer(NSObject metadata);

    @Generated
    @CFunction
    public static native NSObject nw_protocol_copy_tls_definition();

    @Generated
    @CFunction
    public static native NSObject nw_tls_create_options();

    @Generated
    @CFunction
    public static native NSObject nw_tls_copy_sec_protocol_options(NSObject options);

    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_tls(NSObject metadata);

    @Generated
    @CFunction
    public static native NSObject nw_tls_copy_sec_protocol_metadata(NSObject metadata);

    @Generated
    @CFunction
    public static native NSObject nw_protocol_copy_udp_definition();

    @Generated
    @CFunction
    public static native NSObject nw_udp_create_options();

    @Generated
    @CFunction
    public static native void nw_udp_options_set_prefer_no_checksum(NSObject options, boolean prefer_no_checksum);

    @Generated
    @CFunction
    public static native NSObject nw_udp_create_metadata();

    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_udp(NSObject metadata);

    @Generated
    @CFunction
    public static native NSObject nw_protocol_copy_ws_definition();

    @Generated
    @CFunction
    public static native NSObject nw_ws_create_options(int version);

    @Generated
    @CFunction
    public static native void nw_ws_options_add_additional_header(NSObject options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

    @Generated
    @CFunction
    public static native void nw_ws_options_add_subprotocol(NSObject options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String subprotocol);

    @Generated
    @CFunction
    public static native void nw_ws_options_set_auto_reply_ping(NSObject options, boolean auto_reply_ping);

    @Generated
    @CFunction
    public static native void nw_ws_options_set_skip_handshake(NSObject options, boolean skip_handshake);

    @Generated
    @CFunction
    public static native void nw_ws_options_set_maximum_message_size(NSObject options,
            @NUInt long maximum_message_size);

    @Generated
    @CFunction
    public static native boolean nw_protocol_metadata_is_ws(NSObject metadata);

    @Generated
    @CFunction
    public static native NSObject nw_ws_create_metadata(int opcode);

    @Generated
    @CFunction
    public static native int nw_ws_metadata_get_opcode(NSObject metadata);

    @Generated
    @CFunction
    public static native void nw_ws_metadata_set_close_code(NSObject metadata, int close_code);

    @Generated
    @CFunction
    public static native int nw_ws_metadata_get_close_code(NSObject metadata);

    @Generated
    @CFunction
    public static native void nw_ws_metadata_set_pong_handler(NSObject metadata, NSObject client_queue,
            @ObjCBlock(name = "call_nw_ws_metadata_set_pong_handler") Block_nw_ws_metadata_set_pong_handler pong_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_ws_metadata_set_pong_handler {
        @Generated
        void call_nw_ws_metadata_set_pong_handler(NSObject error);
    }

    @Generated
    @CFunction
    public static native boolean nw_ws_request_enumerate_subprotocols(NSObject request,
            @ObjCBlock(name = "call_nw_ws_request_enumerate_subprotocols") Block_nw_ws_request_enumerate_subprotocols enumerator);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_ws_request_enumerate_subprotocols {
        @Generated
        boolean call_nw_ws_request_enumerate_subprotocols(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String subprotocol);
    }

    @Generated
    @CFunction
    public static native boolean nw_ws_request_enumerate_additional_headers(NSObject request,
            @ObjCBlock(name = "call_nw_ws_request_enumerate_additional_headers") Block_nw_ws_request_enumerate_additional_headers enumerator);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_ws_request_enumerate_additional_headers {
        @Generated
        boolean call_nw_ws_request_enumerate_additional_headers(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String name,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String value);
    }

    @Generated
    @CFunction
    public static native NSObject nw_ws_response_create(int status,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String selected_subprotocol);

    @Generated
    @CFunction
    public static native int nw_ws_response_get_status(NSObject response);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String nw_ws_response_get_selected_subprotocol(NSObject response);

    @Generated
    @CFunction
    public static native void nw_ws_response_add_additional_header(NSObject response,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

    @Generated
    @CFunction
    public static native NSObject nw_ws_metadata_copy_server_response(NSObject metadata);

    @Generated
    @CFunction
    public static native boolean nw_ws_response_enumerate_additional_headers(NSObject response,
            @ObjCBlock(name = "call_nw_ws_response_enumerate_additional_headers") Block_nw_ws_response_enumerate_additional_headers enumerator);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_ws_response_enumerate_additional_headers {
        @Generated
        boolean call_nw_ws_response_enumerate_additional_headers(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String name,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String value);
    }

    @Generated
    @CFunction
    public static native void nw_ws_options_set_client_request_handler(NSObject options, NSObject client_queue,
            @ObjCBlock(name = "call_nw_ws_options_set_client_request_handler") Block_nw_ws_options_set_client_request_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_nw_ws_options_set_client_request_handler {
        @Generated
        NSObject call_nw_ws_options_set_client_request_handler(NSObject request);
    }

    @Generated
    @CVariable()
    public static native CFStringRef kNWErrorDomainPOSIX();

    @Generated
    @CVariable()
    public static native CFStringRef kNWErrorDomainDNS();

    @Generated
    @CVariable()
    public static native CFStringRef kNWErrorDomainTLS();

    @Generated
    @CVariable()
    public static native NSObject _nw_content_context_default_message();

    @Generated
    @CVariable()
    public static native NSObject _nw_content_context_final_send();

    @Generated
    @CVariable()
    public static native NSObject _nw_content_context_default_stream();

    @Generated
    @CVariable()
    public static native int _nw_data_transfer_report_all_paths();
}