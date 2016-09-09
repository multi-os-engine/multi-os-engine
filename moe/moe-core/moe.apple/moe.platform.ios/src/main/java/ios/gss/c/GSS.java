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

package ios.gss.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.map.CStringArrayMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;

import ios.corefoundation.opaque.CFDictionaryRef;
import ios.corefoundation.opaque.CFErrorRef;
import ios.corefoundation.opaque.CFStringRef;
import ios.corefoundation.opaque.CFUUIDRef;
import ios.gss.opaque.gss_cred_id_t;
import ios.gss.opaque.gss_ctx_id_t;
import ios.gss.opaque.gss_name_t;

@Generated
@Library("GSS")
@Runtime(CRuntime.class)
public final class GSS {
	static {
		NatJ.register();
	}

	@Generated
	private GSS() {
	}

	@Generated
	@CFunction
	public static native int gss_accept_sec_context(IntPtr minor_status,
			Ptr<gss_ctx_id_t> context_handle,
			gss_cred_id_t acceptor_cred_handle, VoidPtr input_token,
			VoidPtr input_chan_bindings, Ptr<gss_name_t> src_name,
			Ptr<VoidPtr> mech_type, VoidPtr output_token, IntPtr ret_flags,
			IntPtr time_rec, Ptr<gss_cred_id_t> delegated_cred_handle);

	@Generated
	@CFunction
	public static native int gss_acquire_cred(IntPtr minor_status,
			gss_name_t desired_name, int time_req, VoidPtr desired_mechs,
			int cred_usage, Ptr<gss_cred_id_t> output_cred_handle,
			Ptr<VoidPtr> actual_mechs, IntPtr time_rec);

	@Generated
	@CFunction
	public static native int gss_acquire_cred_with_password(
			IntPtr minor_status, gss_name_t desired_name, VoidPtr password,
			int time_req, VoidPtr desired_mechs, int cred_usage,
			Ptr<gss_cred_id_t> output_cred_handle, Ptr<VoidPtr> actual_mechs,
			IntPtr time_rec);

	@Generated
	@CFunction
	public static native int gss_add_buffer_set_member(IntPtr minor_status,
			VoidPtr member_buffer, Ptr<VoidPtr> buffer_set);

	@Generated
	@CFunction
	public static native int gss_add_cred(IntPtr minor_status,
			gss_cred_id_t input_cred_handle, gss_name_t desired_name,
			VoidPtr desired_mech, int cred_usage, int initiator_time_req,
			int acceptor_time_req, Ptr<gss_cred_id_t> output_cred_handle,
			Ptr<VoidPtr> actual_mechs, IntPtr initiator_time_rec,
			IntPtr acceptor_time_rec);

	@Generated
	@CFunction
	public static native int gss_add_oid_set_member(IntPtr minor_status,
			VoidPtr member_oid, Ptr<VoidPtr> oid_set);

	@Generated
	@CFunction
	public static native int gss_canonicalize_name(IntPtr minor_status,
			gss_name_t input_name, VoidPtr mech_type,
			Ptr<gss_name_t> output_name);

	@Generated
	@CFunction
	public static native int gss_compare_name(IntPtr minor_status,
			gss_name_t name1_arg, gss_name_t name2_arg, IntPtr name_equal);

	@Generated
	@CFunction
	public static native int gss_context_time(IntPtr minor_status,
			gss_ctx_id_t context_handle, IntPtr time_rec);

	@Generated
	@CFunction
	public static native int gss_create_empty_buffer_set(IntPtr minor_status,
			Ptr<VoidPtr> buffer_set);

	@Generated
	@CFunction
	public static native int gss_create_empty_oid_set(IntPtr minor_status,
			Ptr<VoidPtr> oid_set);

	@Generated
	@CFunction
	public static native int gss_decapsulate_token(VoidPtr input_token,
			VoidPtr oid, VoidPtr output_token);

	@Generated
	@CFunction
	public static native int gss_delete_sec_context(IntPtr minor_status,
			Ptr<gss_ctx_id_t> context_handle, VoidPtr output_token);

	@Generated
	@CFunction
	public static native int gss_destroy_cred(IntPtr min_stat,
			Ptr<gss_cred_id_t> cred_handle);

	@Generated
	@CFunction
	public static native int gss_display_mech_attr(IntPtr minor_status,
			VoidPtr mech_attr, VoidPtr name, VoidPtr short_desc,
			VoidPtr long_desc);

	@Generated
	@CFunction
	public static native int gss_display_name(IntPtr minor_status,
			gss_name_t input_name, VoidPtr output_name_buffer,
			Ptr<VoidPtr> output_name_type);

	@Generated
	@CFunction
	public static native int gss_display_status(IntPtr minor_status,
			int status_value, int status_type, VoidPtr mech_type,
			IntPtr message_content, VoidPtr status_string);

	@Generated
	@CFunction
	public static native int gss_duplicate_name(IntPtr minor_status,
			gss_name_t src_name, Ptr<gss_name_t> dest_name);

	@Generated
	@Deprecated
	@CFunction
	public static native int gss_duplicate_oid(IntPtr minor_status,
			VoidPtr src_oid, Ptr<VoidPtr> dest_oid);

	@Generated
	@CFunction
	public static native int gss_encapsulate_token(VoidPtr input_token,
			VoidPtr oid, VoidPtr output_token);

	@Generated
	@CFunction
	public static native int gss_export_cred(IntPtr minor_status,
			gss_cred_id_t cred_handle, VoidPtr token);

	@Generated
	@CFunction
	public static native int gss_export_name(IntPtr minor_status,
			gss_name_t input_name, VoidPtr exported_name);

	@Generated
	@CFunction
	public static native int gss_export_sec_context(IntPtr minor_status,
			Ptr<gss_ctx_id_t> context_handle, VoidPtr interprocess_token);

	@Generated
	@CFunction
	public static native int gss_get_mic(IntPtr minor_status,
			gss_ctx_id_t context_handle, int qop_req, VoidPtr message_buffer,
			VoidPtr message_token);

	@Generated
	@CFunction
	public static native int gss_import_cred(IntPtr minor_status,
			VoidPtr token, Ptr<gss_cred_id_t> cred_handle);

	@Generated
	@CFunction
	public static native int gss_import_name(IntPtr minor_status,
			VoidPtr input_name_buffer, VoidPtr input_name_type,
			Ptr<gss_name_t> output_name);

	@Generated
	@CFunction
	public static native int gss_import_sec_context(IntPtr minor_status,
			VoidPtr interprocess_token, Ptr<gss_ctx_id_t> context_handle);

	@Generated
	@CFunction
	public static native int gss_indicate_mechs(IntPtr minor_status,
			Ptr<VoidPtr> mech_set);

	@Generated
	@CFunction
	public static native int gss_indicate_mechs_by_attrs(IntPtr minor_status,
			VoidPtr desired_mech_attrs, VoidPtr except_mech_attrs,
			VoidPtr critical_mech_attrs, Ptr<VoidPtr> mechs);

	@Generated
	@CFunction
	public static native int gss_init_sec_context(IntPtr minor_status,
			gss_cred_id_t initiator_cred_handle,
			Ptr<gss_ctx_id_t> context_handle, gss_name_t target_name,
			VoidPtr input_mech_type, int req_flags, int time_req,
			VoidPtr input_chan_bindings, VoidPtr input_token,
			Ptr<VoidPtr> actual_mech_type, VoidPtr output_token,
			IntPtr ret_flags, IntPtr time_rec);

	@Generated
	@CFunction
	public static native int gss_inquire_attrs_for_mech(IntPtr minor_status,
			VoidPtr mech, Ptr<VoidPtr> mech_attr, Ptr<VoidPtr> known_mech_attrs);

	@Generated
	@CFunction
	public static native int gss_inquire_context(IntPtr minor_status,
			gss_ctx_id_t context_handle, Ptr<gss_name_t> src_name,
			Ptr<gss_name_t> targ_name, IntPtr lifetime_rec,
			Ptr<VoidPtr> mech_type, IntPtr ctx_flags, IntPtr locally_initiated,
			IntPtr xopen);

	@Generated
	@CFunction
	public static native int gss_inquire_cred(IntPtr minor_status,
			gss_cred_id_t cred_handle, Ptr<gss_name_t> name_ret,
			IntPtr lifetime, IntPtr cred_usage, Ptr<VoidPtr> mechanisms);

	@Generated
	@CFunction
	public static native int gss_inquire_cred_by_mech(IntPtr minor_status,
			gss_cred_id_t cred_handle, VoidPtr mech_type,
			Ptr<gss_name_t> cred_name, IntPtr initiator_lifetime,
			IntPtr acceptor_lifetime, IntPtr cred_usage);

	@Generated
	@CFunction
	public static native int gss_inquire_cred_by_oid(IntPtr minor_status,
			gss_cred_id_t cred_handle, VoidPtr desired_object,
			Ptr<VoidPtr> data_set);

	@Generated
	@CFunction
	public static native int gss_inquire_mech_for_saslname(IntPtr minor_status,
			VoidPtr sasl_mech_name, Ptr<VoidPtr> mech_type);

	@Generated
	@CFunction
	public static native int gss_inquire_mechs_for_name(IntPtr minor_status,
			gss_name_t input_name, Ptr<VoidPtr> mech_types);

	@Generated
	@CFunction
	public static native int gss_inquire_name(IntPtr minor_status,
			gss_name_t input_name, IntPtr name_is_MN, Ptr<VoidPtr> MN_mech,
			Ptr<VoidPtr> attrs);

	@Generated
	@CFunction
	public static native int gss_inquire_names_for_mech(IntPtr minor_status,
			VoidPtr mechanism, Ptr<VoidPtr> name_types);

	@Generated
	@CFunction
	public static native int gss_inquire_saslname_for_mech(IntPtr minor_status,
			VoidPtr desired_mech, VoidPtr sasl_mech_name, VoidPtr mech_name,
			VoidPtr mech_description);

	@Generated
	@CFunction
	public static native int gss_inquire_sec_context_by_oid(
			IntPtr minor_status, gss_ctx_id_t context_handle,
			VoidPtr desired_object, Ptr<VoidPtr> data_set);

	@Generated
	@CFunction
	public static native int gss_iter_creds(
			IntPtr min_stat,
			int flags,
			VoidPtr mech,
			@ObjCBlock(name = "call_gss_iter_creds") Block_gss_iter_creds useriter);

	@Runtime(CRuntime.class)
	@Generated
	public interface Block_gss_iter_creds {
		@Generated
		void call_gss_iter_creds(VoidPtr arg0, gss_cred_id_t arg1);
	}

	@Generated
	@CFunction
	public static native int gss_iter_creds_f(
			IntPtr min_stat,
			int flags,
			VoidPtr mech,
			VoidPtr userctx,
			@FunctionPtr(name = "call_gss_iter_creds_f") Function_gss_iter_creds_f useriter);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_gss_iter_creds_f {
		@Generated
		void call_gss_iter_creds_f(VoidPtr arg0, VoidPtr arg1,
				VoidPtr arg2);
	}

	@Generated
	@CFunction
	public static native int gss_krb5_ccache_name(
			IntPtr minor_status,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] out_name);

	@Generated
	@Deprecated
	@CFunction
	public static native int gss_krb5_copy_ccache(IntPtr minor_status,
			gss_cred_id_t cred, VoidPtr out);

	@Generated
	@CFunction
	public static native int gss_krb5_export_lucid_sec_context(
			IntPtr minor_status, Ptr<gss_ctx_id_t> context_handle, int version,
			Ptr<VoidPtr> rctx);

	@Generated
	@CFunction
	public static native int gss_krb5_free_lucid_sec_context(
			IntPtr minor_status, VoidPtr c);

	@Generated
	@CFunction
	public static native int gss_krb5_set_allowable_enctypes(
			IntPtr minor_status, gss_cred_id_t cred, int num_enctypes,
			IntPtr enctypes);

	@Generated
	@CFunction
	public static native int gss_oid_equal(VoidPtr a, VoidPtr b);

	@Generated
	@CFunction
	public static native int gss_oid_to_str(IntPtr minor_status, VoidPtr oid,
			VoidPtr oid_str);

	@Generated
	@CFunction
	public static native int gss_process_context_token(IntPtr minor_status,
			gss_ctx_id_t context_handle, VoidPtr token_buffer);

	@Generated
	@CFunction
	public static native int gss_pseudo_random(IntPtr minor_status,
			gss_ctx_id_t context, int prf_key, VoidPtr prf_in,
			@NInt long desired_output_len, VoidPtr prf_out);

	@Generated
	@CFunction
	public static native int gss_release_buffer(IntPtr minor_status,
			VoidPtr buffer);

	@Generated
	@CFunction
	public static native int gss_release_buffer_set(IntPtr minor_status,
			Ptr<VoidPtr> buffer_set);

	@Generated
	@CFunction
	public static native int gss_release_cred(IntPtr minor_status,
			Ptr<gss_cred_id_t> cred_handle);

	@Generated
	@CFunction
	public static native int gss_release_name(IntPtr minor_status,
			Ptr<gss_name_t> input_name);

	@Generated
	@Deprecated
	@CFunction
	public static native int gss_release_oid(IntPtr minor_status,
			Ptr<VoidPtr> oid);

	@Generated
	@CFunction
	public static native int gss_release_oid_set(IntPtr minor_status,
			Ptr<VoidPtr> set);

	@Generated
	@Deprecated
	@CFunction
	public static native int gss_seal(IntPtr minor_status,
			gss_ctx_id_t context_handle, int conf_req_flag, int qop_req,
			VoidPtr input_message_buffer, IntPtr conf_state,
			VoidPtr output_message_buffer);

	@Generated
	@CFunction
	public static native int gss_set_cred_option(IntPtr minor_status,
			Ptr<gss_cred_id_t> cred_handle, VoidPtr object, VoidPtr value);

	@Generated
	@CFunction
	public static native int gss_set_sec_context_option(IntPtr minor_status,
			Ptr<gss_ctx_id_t> context_handle, VoidPtr object, VoidPtr value);

	@Generated
	@Deprecated
	@CFunction
	public static native int gss_sign(IntPtr minor_status,
			gss_ctx_id_t context_handle, int qop_req, VoidPtr message_buffer,
			VoidPtr message_token);

	@Generated
	@CFunction
	public static native int gss_test_oid_set_member(IntPtr minor_status,
			VoidPtr member, VoidPtr set, IntPtr present);

	@Generated
	@Deprecated
	@CFunction
	public static native int gss_unseal(IntPtr minor_status,
			gss_ctx_id_t context_handle, VoidPtr input_message_buffer,
			VoidPtr output_message_buffer, IntPtr conf_state, IntPtr qop_state);

	@Generated
	@CFunction
	public static native int gss_unwrap(IntPtr minor_status,
			gss_ctx_id_t context_handle, VoidPtr input_message_buffer,
			VoidPtr output_message_buffer, IntPtr conf_state, IntPtr qop_state);

	@Generated
	@CFunction
	public static native int gss_userok(
			gss_name_t name,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String user);

	@Generated
	@Deprecated
	@CFunction
	public static native int gss_verify(IntPtr minor_status,
			gss_ctx_id_t context_handle, VoidPtr message_buffer,
			VoidPtr token_buffer, IntPtr qop_state);

	@Generated
	@CFunction
	public static native int gss_verify_mic(IntPtr minor_status,
			gss_ctx_id_t context_handle, VoidPtr message_buffer,
			VoidPtr token_buffer, IntPtr qop_state);

	@Generated
	@CFunction
	public static native int gss_wrap(IntPtr minor_status,
			gss_ctx_id_t context_handle, int conf_req_flag, int qop_req,
			VoidPtr input_message_buffer, IntPtr conf_state,
			VoidPtr output_message_buffer);

	@Generated
	@CFunction
	public static native int gss_wrap_size_limit(IntPtr minor_status,
			gss_ctx_id_t context_handle, int conf_req_flag, int qop_req,
			int req_output_size, IntPtr max_input_size);

	@Generated
	@CFunction
	public static native int gsskrb5_extract_authz_data_from_sec_context(
			IntPtr minor_status, gss_ctx_id_t context_handle, int ad_type,
			VoidPtr ad_data);

	@Generated
	@CFunction
	public static native int gsskrb5_register_acceptor_identity(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String identity);

	@Generated
	@CFunction
	public static native int krb5_gss_register_acceptor_identity(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String identity);

	@Generated
	@CFunction
	public static native gss_cred_id_t GSSCreateCredentialFromUUID(
			CFUUIDRef uuid);

	@Generated
	@CFunction
	public static native CFErrorRef GSSCreateError(VoidPtr mech,
			int major_status, int minor_status);

	@Generated
	@CFunction
	public static native gss_name_t GSSCreateName(ConstVoidPtr name,
			VoidPtr name_type, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native gss_name_t GSSCredentialCopyName(gss_cred_id_t cred);

	@Generated
	@CFunction
	public static native CFUUIDRef GSSCredentialCopyUUID(
			gss_cred_id_t credential);

	@Generated
	@CFunction
	public static native int GSSCredentialGetLifetime(gss_cred_id_t cred);

	@Generated
	@CFunction
	public static native CFStringRef GSSNameCreateDisplayString(gss_name_t name);

	@Generated
	@CFunction
	public static native int gss_aapl_change_password(gss_name_t name,
			VoidPtr mech, CFDictionaryRef attributes, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native int gss_aapl_initial_cred(gss_name_t desired_name,
			VoidPtr desired_mech, CFDictionaryRef attributes,
			Ptr<gss_cred_id_t> output_cred_handle, Ptr<CFErrorRef> error);
}
