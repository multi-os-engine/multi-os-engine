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

package apple.gss.c;

import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFUUIDRef;
import apple.gss.opaque.gss_cred_id_t;
import apple.gss.opaque.gss_ctx_id_t;
import apple.gss.opaque.gss_name_t;
import apple.gss.struct.gss_OID_desc_struct;
import apple.gss.struct.gss_OID_set_desc_struct;
import apple.gss.struct.gss_buffer_desc_struct;
import apple.gss.struct.gss_buffer_set_desc_struct;
import apple.gss.struct.gss_channel_bindings_struct;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.map.CStringArrayMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
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
    public static native int gss_accept_sec_context(IntPtr minor_status, Ptr<gss_ctx_id_t> context_handle,
            gss_cred_id_t acceptor_cred_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct input_token,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_channel_bindings_struct input_chan_bindings,
            Ptr<gss_name_t> src_name, Ptr<Ptr<gss_OID_desc_struct>> mech_type,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct output_token,
            IntPtr ret_flags, IntPtr time_rec, Ptr<gss_cred_id_t> delegated_cred_handle);

    @Generated
    @CFunction
    public static native int gss_acquire_cred(IntPtr minor_status, gss_name_t desired_name, int time_req,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_set_desc_struct desired_mechs,
            int cred_usage, Ptr<gss_cred_id_t> output_cred_handle, Ptr<Ptr<gss_OID_set_desc_struct>> actual_mechs,
            IntPtr time_rec);

    @Generated
    @CFunction
    public static native int gss_acquire_cred_with_password(IntPtr minor_status, gss_name_t desired_name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct password,
            int time_req,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_set_desc_struct desired_mechs,
            int cred_usage, Ptr<gss_cred_id_t> output_cred_handle, Ptr<Ptr<gss_OID_set_desc_struct>> actual_mechs,
            IntPtr time_rec);

    @Generated
    @CFunction
    public static native int gss_add_buffer_set_member(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct member_buffer,
            Ptr<Ptr<gss_buffer_set_desc_struct>> buffer_set);

    @Generated
    @CFunction
    public static native int gss_add_cred(IntPtr minor_status, gss_cred_id_t input_cred_handle, gss_name_t desired_name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct desired_mech,
            int cred_usage, int initiator_time_req, int acceptor_time_req, Ptr<gss_cred_id_t> output_cred_handle,
            Ptr<Ptr<gss_OID_set_desc_struct>> actual_mechs, IntPtr initiator_time_rec, IntPtr acceptor_time_rec);

    @Generated
    @CFunction
    public static native int gss_add_oid_set_member(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct member_oid,
            Ptr<Ptr<gss_OID_set_desc_struct>> oid_set);

    @Generated
    @CFunction
    public static native int gss_canonicalize_name(IntPtr minor_status, gss_name_t input_name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mech_type,
            Ptr<gss_name_t> output_name);

    @Generated
    @CFunction
    public static native int gss_compare_name(IntPtr minor_status, gss_name_t name1_arg, gss_name_t name2_arg,
            IntPtr name_equal);

    @Generated
    @CFunction
    public static native int gss_context_time(IntPtr minor_status, gss_ctx_id_t context_handle, IntPtr time_rec);

    @Generated
    @CFunction
    public static native int gss_create_empty_buffer_set(IntPtr minor_status,
            Ptr<Ptr<gss_buffer_set_desc_struct>> buffer_set);

    @Generated
    @CFunction
    public static native int gss_create_empty_oid_set(IntPtr minor_status, Ptr<Ptr<gss_OID_set_desc_struct>> oid_set);

    @Generated
    @CFunction
    public static native int gss_decapsulate_token(
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct input_token,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct oid,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct output_token);

    @Generated
    @CFunction
    public static native int gss_delete_sec_context(IntPtr minor_status, Ptr<gss_ctx_id_t> context_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct output_token);

    @Generated
    @CFunction
    public static native int gss_destroy_cred(IntPtr min_stat, Ptr<gss_cred_id_t> cred_handle);

    @Generated
    @CFunction
    public static native int gss_display_mech_attr(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mech_attr,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct short_desc,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct long_desc);

    @Generated
    @CFunction
    public static native int gss_display_name(IntPtr minor_status, gss_name_t input_name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct output_name_buffer,
            Ptr<Ptr<gss_OID_desc_struct>> output_name_type);

    @Generated
    @CFunction
    public static native int gss_display_status(IntPtr minor_status, int status_value, int status_type,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mech_type,
            IntPtr message_content,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct status_string);

    @Generated
    @CFunction
    public static native int gss_duplicate_name(IntPtr minor_status, gss_name_t src_name, Ptr<gss_name_t> dest_name);

    @Generated
    @Deprecated
    @CFunction
    public static native int gss_duplicate_oid(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct src_oid,
            Ptr<Ptr<gss_OID_desc_struct>> dest_oid);

    @Generated
    @CFunction
    public static native int gss_encapsulate_token(
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct input_token,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct oid,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct output_token);

    @Generated
    @CFunction
    public static native int gss_export_cred(IntPtr minor_status, gss_cred_id_t cred_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct token);

    @Generated
    @CFunction
    public static native int gss_export_name(IntPtr minor_status, gss_name_t input_name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct exported_name);

    @Generated
    @CFunction
    public static native int gss_export_sec_context(IntPtr minor_status, Ptr<gss_ctx_id_t> context_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct interprocess_token);

    @Generated
    @CFunction
    public static native int gss_get_mic(IntPtr minor_status, gss_ctx_id_t context_handle, int qop_req,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct message_buffer,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct message_token);

    @Generated
    @CFunction
    public static native int gss_import_cred(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct token,
            Ptr<gss_cred_id_t> cred_handle);

    @Generated
    @CFunction
    public static native int gss_import_name(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct input_name_buffer,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct input_name_type,
            Ptr<gss_name_t> output_name);

    @Generated
    @CFunction
    public static native int gss_import_sec_context(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct interprocess_token,
            Ptr<gss_ctx_id_t> context_handle);

    @Generated
    @CFunction
    public static native int gss_indicate_mechs(IntPtr minor_status, Ptr<Ptr<gss_OID_set_desc_struct>> mech_set);

    @Generated
    @CFunction
    public static native int gss_indicate_mechs_by_attrs(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_set_desc_struct desired_mech_attrs,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_set_desc_struct except_mech_attrs,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_set_desc_struct critical_mech_attrs,
            Ptr<Ptr<gss_OID_set_desc_struct>> mechs);

    @Generated
    @CFunction
    public static native int gss_init_sec_context(IntPtr minor_status, gss_cred_id_t initiator_cred_handle,
            Ptr<gss_ctx_id_t> context_handle, gss_name_t target_name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct input_mech_type,
            int req_flags, int time_req,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_channel_bindings_struct input_chan_bindings,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct input_token,
            Ptr<Ptr<gss_OID_desc_struct>> actual_mech_type,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct output_token,
            IntPtr ret_flags, IntPtr time_rec);

    @Generated
    @CFunction
    public static native int gss_inquire_attrs_for_mech(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mech,
            Ptr<Ptr<gss_OID_set_desc_struct>> mech_attr, Ptr<Ptr<gss_OID_set_desc_struct>> known_mech_attrs);

    @Generated
    @CFunction
    public static native int gss_inquire_context(IntPtr minor_status, gss_ctx_id_t context_handle,
            Ptr<gss_name_t> src_name, Ptr<gss_name_t> targ_name, IntPtr lifetime_rec,
            Ptr<Ptr<gss_OID_desc_struct>> mech_type, IntPtr ctx_flags, IntPtr locally_initiated, IntPtr xopen);

    @Generated
    @CFunction
    public static native int gss_inquire_cred(IntPtr minor_status, gss_cred_id_t cred_handle, Ptr<gss_name_t> name_ret,
            IntPtr lifetime, IntPtr cred_usage, Ptr<Ptr<gss_OID_set_desc_struct>> mechanisms);

    @Generated
    @CFunction
    public static native int gss_inquire_cred_by_mech(IntPtr minor_status, gss_cred_id_t cred_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mech_type,
            Ptr<gss_name_t> cred_name, IntPtr initiator_lifetime, IntPtr acceptor_lifetime, IntPtr cred_usage);

    @Generated
    @CFunction
    public static native int gss_inquire_cred_by_oid(IntPtr minor_status, gss_cred_id_t cred_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct desired_object,
            Ptr<Ptr<gss_buffer_set_desc_struct>> data_set);

    @Generated
    @CFunction
    public static native int gss_inquire_mech_for_saslname(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct sasl_mech_name,
            Ptr<Ptr<gss_OID_desc_struct>> mech_type);

    @Generated
    @CFunction
    public static native int gss_inquire_mechs_for_name(IntPtr minor_status, gss_name_t input_name,
            Ptr<Ptr<gss_OID_set_desc_struct>> mech_types);

    @Generated
    @CFunction
    public static native int gss_inquire_name(IntPtr minor_status, gss_name_t input_name, IntPtr name_is_MN,
            Ptr<Ptr<gss_OID_desc_struct>> MN_mech, Ptr<Ptr<gss_buffer_set_desc_struct>> attrs);

    @Generated
    @CFunction
    public static native int gss_inquire_names_for_mech(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mechanism,
            Ptr<Ptr<gss_OID_set_desc_struct>> name_types);

    @Generated
    @CFunction
    public static native int gss_inquire_saslname_for_mech(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct desired_mech,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct sasl_mech_name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct mech_name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct mech_description);

    @Generated
    @CFunction
    public static native int gss_inquire_sec_context_by_oid(IntPtr minor_status, gss_ctx_id_t context_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct desired_object,
            Ptr<Ptr<gss_buffer_set_desc_struct>> data_set);

    @Generated
    @CFunction
    public static native int gss_iter_creds(IntPtr min_stat, int flags,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mech,
            @ObjCBlock(name = "call_gss_iter_creds") Block_gss_iter_creds useriter);

    @Generated
    @CFunction
    public static native int gss_iter_creds_f(IntPtr min_stat, int flags,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mech,
            VoidPtr userctx, @FunctionPtr(name = "call_gss_iter_creds_f") Function_gss_iter_creds_f useriter);

    @Generated
    @CFunction
    public static native int gss_krb5_ccache_name(IntPtr minor_status,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] out_name);

    @Generated
    @Deprecated
    @CFunction
    public static native int gss_krb5_copy_ccache(IntPtr minor_status, gss_cred_id_t cred, VoidPtr out);

    @Generated
    @CFunction
    public static native int gss_krb5_export_lucid_sec_context(IntPtr minor_status, Ptr<gss_ctx_id_t> context_handle,
            int version, Ptr<VoidPtr> rctx);

    @Generated
    @CFunction
    public static native int gss_krb5_free_lucid_sec_context(IntPtr minor_status, VoidPtr c);

    @Generated
    @CFunction
    public static native int gss_krb5_set_allowable_enctypes(IntPtr minor_status, gss_cred_id_t cred, int num_enctypes,
            IntPtr enctypes);

    @Generated
    @CFunction
    public static native int gss_oid_equal(
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct a,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct b);

    @Generated
    @CFunction
    public static native int gss_oid_to_str(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct oid,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct oid_str);

    @Generated
    @CFunction
    public static native int gss_process_context_token(IntPtr minor_status, gss_ctx_id_t context_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct token_buffer);

    @Generated
    @CFunction
    public static native int gss_pseudo_random(IntPtr minor_status, gss_ctx_id_t context, int prf_key,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct prf_in,
            @NInt long desired_output_len,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct prf_out);

    @Generated
    @CFunction
    public static native int gss_release_buffer(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct buffer);

    @Generated
    @CFunction
    public static native int gss_release_buffer_set(IntPtr minor_status,
            Ptr<Ptr<gss_buffer_set_desc_struct>> buffer_set);

    @Generated
    @CFunction
    public static native int gss_release_cred(IntPtr minor_status, Ptr<gss_cred_id_t> cred_handle);

    @Generated
    @CFunction
    public static native int gss_release_name(IntPtr minor_status, Ptr<gss_name_t> input_name);

    @Generated
    @Deprecated
    @CFunction
    public static native int gss_release_oid(IntPtr minor_status, Ptr<Ptr<gss_OID_desc_struct>> oid);

    @Generated
    @CFunction
    public static native int gss_release_oid_set(IntPtr minor_status, Ptr<Ptr<gss_OID_set_desc_struct>> set);

    @Generated
    @Deprecated
    @CFunction
    public static native int gss_seal(IntPtr minor_status, gss_ctx_id_t context_handle, int conf_req_flag, int qop_req,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct input_message_buffer,
            IntPtr conf_state,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct output_message_buffer);

    @Generated
    @CFunction
    public static native int gss_set_cred_option(IntPtr minor_status, Ptr<gss_cred_id_t> cred_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct object,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct value);

    @Generated
    @CFunction
    public static native int gss_set_sec_context_option(IntPtr minor_status, Ptr<gss_ctx_id_t> context_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct object,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct value);

    @Generated
    @Deprecated
    @CFunction
    public static native int gss_sign(IntPtr minor_status, gss_ctx_id_t context_handle, int qop_req,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct message_buffer,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct message_token);

    @Generated
    @CFunction
    public static native int gss_test_oid_set_member(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct member,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_set_desc_struct set,
            IntPtr present);

    @Generated
    @Deprecated
    @CFunction
    public static native int gss_unseal(IntPtr minor_status, gss_ctx_id_t context_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct input_message_buffer,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct output_message_buffer,
            IntPtr conf_state, IntPtr qop_state);

    @Generated
    @CFunction
    public static native int gss_unwrap(IntPtr minor_status, gss_ctx_id_t context_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct input_message_buffer,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct output_message_buffer,
            IntPtr conf_state, IntPtr qop_state);

    @Generated
    @CFunction
    public static native int gss_userok(gss_name_t name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String user);

    @Generated
    @Deprecated
    @CFunction
    public static native int gss_verify(IntPtr minor_status, gss_ctx_id_t context_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct message_buffer,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct token_buffer,
            IntPtr qop_state);

    @Generated
    @CFunction
    public static native int gss_verify_mic(IntPtr minor_status, gss_ctx_id_t context_handle,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct message_buffer,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct token_buffer,
            IntPtr qop_state);

    @Generated
    @CFunction
    public static native int gss_wrap(IntPtr minor_status, gss_ctx_id_t context_handle, int conf_req_flag, int qop_req,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct input_message_buffer,
            IntPtr conf_state,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct output_message_buffer);

    @Generated
    @CFunction
    public static native int gss_wrap_size_limit(IntPtr minor_status, gss_ctx_id_t context_handle, int conf_req_flag,
            int qop_req, int req_output_size, IntPtr max_input_size);

    @Generated
    @CFunction
    public static native int gsskrb5_extract_authz_data_from_sec_context(IntPtr minor_status,
            gss_ctx_id_t context_handle, int ad_type,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct ad_data);

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
    public static native gss_cred_id_t GSSCreateCredentialFromUUID(CFUUIDRef uuid);

    @Generated
    @CFunction
    public static native CFErrorRef GSSCreateError(
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mech,
            int major_status, int minor_status);

    @Generated
    @CFunction
    public static native gss_name_t GSSCreateName(ConstVoidPtr name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct name_type,
            Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native gss_name_t GSSCredentialCopyName(gss_cred_id_t cred);

    @Generated
    @CFunction
    public static native CFUUIDRef GSSCredentialCopyUUID(gss_cred_id_t credential);

    @Generated
    @CFunction
    public static native int GSSCredentialGetLifetime(gss_cred_id_t cred);

    @Generated
    @CFunction
    public static native CFStringRef GSSNameCreateDisplayString(gss_name_t name);

    @Generated
    @CFunction
    public static native int gss_aapl_change_password(gss_name_t name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mech,
            CFDictionaryRef attributes, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native int gss_aapl_initial_cred(gss_name_t desired_name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct desired_mech,
            CFDictionaryRef attributes, Ptr<gss_cred_id_t> output_cred_handle, Ptr<CFErrorRef> error);

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_copy_ccache_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_get_tkt_flags_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_extract_authz_data_from_sec_context_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_compat_des3_mic_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_register_acceptor_identity_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_export_lucid_context_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_export_lucid_context_v1_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_set_dns_canonicalize_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_get_subkey_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_get_initiator_subkey_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_get_acceptor_subkey_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_send_to_kdc_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_get_authtime_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_get_service_keyblock_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_set_allowable_enctypes_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_set_default_realm_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_ccache_name_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_set_time_offset_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_get_time_offset_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_plugin_register_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_ntlm_get_session_key_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_nt_ntlm_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_nt_dn_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_nt_principal_name_referral_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ntlm_guest_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ntlm_v1_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ntlm_v2_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ntlm_session_key_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ntlm_force_v1_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_cred_no_ci_flags_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_nt_uuid_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ntlm_support_channelbindings_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ntlm_support_lm2_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_import_cred_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ntlm_reset_keys_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_cred_diag_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_cred_validate_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_cred_set_default_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_cred_get_default_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_cred_renew_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ctx_pfs_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_sasl_mech_name_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_mech_name_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_mech_description_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_cred_password_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_cred_certificate_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_cred_secidentity_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_cred_heimbase_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_sasl_digest_md5_mechanism_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_netlogon_mechanism_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_appl_lkdc_supported_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_netlogon_set_session_key_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_netlogon_set_sign_algorithm_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_netlogon_nt_netbios_dns_name_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_inq_win2k_pac_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_inq_sspi_session_key_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_mechanism_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_ntlm_mechanism_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_iakerb_mechanism_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_pku2u_mechanism_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_spnego_mechanism_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_scram_mechanism_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_nt_user_name_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_nt_machine_uid_name_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_nt_string_uid_name_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_nt_hostbased_service_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_nt_hostbased_service_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_nt_anonymous_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_nt_export_name_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_nt_principal_name_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_krb5_nt_principal_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_peer_has_updated_spnego_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_mech_concrete_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_mech_pseudo_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_mech_composite_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_mech_nego_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_mech_glue_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_not_mech_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_deprecated_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_not_dflt_mech_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_itok_framed_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_auth_init_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_auth_targ_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_auth_init_init_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_auth_targ_init_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_auth_init_anon_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_auth_targ_anon_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_deleg_cred_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_integ_prot_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_conf_prot_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_mic_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_wrap_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_prot_ready_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_replay_det_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_oos_det_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_cbindings_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_pfs_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_compress_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_ma_ctx_trans_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_buffer_desc_struct __gss_c_attr_local_login_user();

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_gss_iter_creds {
        @Generated
        void call_gss_iter_creds(
                @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct arg0,
                gss_cred_id_t arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_gss_iter_creds_f {
        @Generated
        void call_gss_iter_creds_f(VoidPtr arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct arg1,
                VoidPtr arg2);
    }
}
