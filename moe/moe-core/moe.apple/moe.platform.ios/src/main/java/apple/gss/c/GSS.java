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

    /**
     * @page internalVSmechname Internal names and mechanism names
     * @section gssapi_api_INvsMN Name forms
     * 
     * There are two forms of name in GSS-API, Internal form and
     * Contiguous string ("flat") form. gss_export_name() and
     * gss_import_name() can be used to convert between the two forms.
     * 
     * - The contiguous string form is described by an oid specificing the
     *   type and an octet string. A special form of the contiguous
     *   string form is the exported name object. The exported name
     *   defined for each mechanism, is something that can be stored and
     *   complared later. The exported name is what should be used for
     *   ACLs comparisons.
     * 
     * - The Internal form
     * 
     *   There is also special form of the Internal Name (IN), and that is
     *   the Mechanism Name (MN). In the mechanism name all the generic
     *   information is stripped of and only contain the information for
     *   one mechanism.  In GSS-API some function return MN and some
     *   require MN as input. Each of these function is marked up as such.
     * 
     * 
     * Describe relationship between import_name, canonicalize_name,
     * export_name and friends.
     */
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

    /**
     * Add a oid to the oid set, function does not make a copy of the oid,
     * so the pointer to member_oid needs to be stable for the whole time
     * oid_set is used.
     * 
     * If there is a duplicate member of the oid, the new member is not
     * added to to the set.
     * 
     * @param minor_status minor status code.
     * @param member_oid member to add to the oid set
     * @param oid_set oid set to add the member too
     * 
     * @returns a gss_error code, see gss_display_status() about printing
     *          the error code.
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native int gss_add_oid_set_member(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct member_oid,
            Ptr<Ptr<gss_OID_set_desc_struct>> oid_set);

    /**
     * gss_canonicalize_name takes a Internal Name (IN) and converts in into a
     * mechanism specific Mechanism Name (MN).
     * 
     * The input name may multiple name, or generic name types.
     * 
     * If the input_name if of the GSS_C_NT_USER_NAME, and the Kerberos
     * mechanism is specified, the resulting MN type is a
     * GSS_KRB5_NT_PRINCIPAL_NAME.
     * 
     * For more information about @ref internalVSmechname.
     * 
     * @param minor_status minor status code.
     * @param input_name name to covert, unchanged by gss_canonicalize_name().
     * @param mech_type the type to convert Name too.
     * @param output_name the resulting type, release with
     *        gss_release_name(), independent of input_name.
     * 
     * @returns a gss_error code, see gss_display_status() about printing
     *        the error code.
     * 
     * @ingroup gssapi
     */
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

    /**
     * Destroy a credential
     * 
     * gss_release_cred() frees the memory, gss_destroy_cred() removes the credentials from memory/disk and then call gss_release_cred() on the credential.
     * 
     * @param min_stat minor status code
     * @param cred_handle credentail to destory
     * 
     * @returns a gss_error code, see gss_display_status() about printing
     *          the error code.
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native int gss_destroy_cred(IntPtr min_stat, Ptr<gss_cred_id_t> cred_handle);

    /**
     * Return names and descriptions of mech attributes
     * 
     * @param minor_status minor status code
     * @param mech_attr attributes wanted
     * @param name name of attribute
     * @param short_desc short description
     * @param long_desc long description
     * 
     * @return returns GSS_S_COMPLETE or an error code.
     */
    @Generated
    @CFunction
    public static native int gss_display_mech_attr(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mech_attr,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct short_desc,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct long_desc);

    /**
     * Create a representstion of a name suitable for display
     * 
     * A name that is useful to print to user, not suitable for
     * authorization. For authorization use gss_authorize_localname(), or
     * gss_userok().
     * 
     * @param minor_status minor status code returned
     * @param input_name name to be converted into a name
     * @param output_name_buffer output buffer with name, must be released with gss_release_buffer() on success.
     * @param output_name_type type OID of then name
     * 
     * @returns GSS major status code
     * 
     * @ingroup gssapi
     */
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

    /**
     * Import a name internal or mechanism name
     * 
     * Type of name and their format:
     * - GSS_C_NO_OID
     * - GSS_C_NT_USER_NAME
     * - GSS_C_NT_HOSTBASED_SERVICE
     * - GSS_C_NT_EXPORT_NAME
     * - GSS_C_NT_ANONYMOUS
     * - GSS_KRB5_NT_PRINCIPAL_NAME
     * 
     * For more information about @ref internalVSmechname.
     * 
     * @param minor_status minor status code
     * @param input_name_buffer import name buffer
     * @param input_name_type type of the import name buffer
     * @param output_name the resulting type, release with
     *        gss_release_name(), independent of input_name
     * 
     * @returns a gss_error code, see gss_display_status() about printing
     *        the error code.
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native int gss_import_name(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct input_name_buffer,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct input_name_type,
            Ptr<gss_name_t> output_name);

    /**
     * If we can't find a mechanism name for the name, we fail though.
     */
    @Generated
    @CFunction
    public static native int gss_import_sec_context(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_buffer_desc_struct interprocess_token,
            Ptr<gss_ctx_id_t> context_handle);

    @Generated
    @CFunction
    public static native int gss_indicate_mechs(IntPtr minor_status, Ptr<Ptr<gss_OID_set_desc_struct>> mech_set);

    /**
     * Return set of mechanism that fullfill the criteria
     * 
     * @return returns GSS_S_COMPLETE or an error code.
     */
    @Generated
    @CFunction
    public static native int gss_indicate_mechs_by_attrs(IntPtr minor_status,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_set_desc_struct desired_mech_attrs,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_set_desc_struct except_mech_attrs,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_set_desc_struct critical_mech_attrs,
            Ptr<Ptr<gss_OID_set_desc_struct>> mechs);

    /**
     * As the initiator build a context with an acceptor.
     * 
     * This function is blocking and should not be used on threads blocking UI updates.
     * 
     * Returns in the major
     * - GSS_S_COMPLETE - if the context if build
     * - GSS_S_CONTINUE_NEEDED -  if the caller needs  to continue another
     * round of gss_i nit_sec_context
     * - error code - any other error code
     * 
     * @param minor_status minor status code.
     * 
     * @param initiator_cred_handle the credential to use when building
     *        the context, if GSS_C_NO_CREDENTIAL is passed, the default
     *        credential for the mechanism will be used.
     * 
     * @param context_handle a pointer to a context handle, will be
     * 	  returned as long as there is not an error.
     * 
     * @param target_name the target name of acceptor, created using
     * 	  gss_import_name(). The name is can be of any name types the
     * 	  mechanism supports, check supported name types with
     * 	  gss_inquire_names_for_mech().
     * 
     * @param input_mech_type mechanism type to use, if GSS_C_NO_OID is
     *        used, Kerberos (GSS_KRB5_MECHANISM) will be tried. Other
     *        available mechanism are listed in the @ref gssapi_mechs_intro
     *        section.
     * 
     * @param req_flags flags using when building the context, see @ref
     *        gssapi_context_flags
     * 
     * @param time_req time requested this context should be valid in
     *        seconds, common used value is GSS_C_INDEFINITE
     * 
     * @param input_chan_bindings Channel bindings used, if not exepected
     *        otherwise, used GSS_C_NO_CHANNEL_BINDINGS
     * 
     * @param input_token input token sent from the acceptor, for the
     * 	  initial packet the buffer of { NULL, 0 } should be used.
     * 
     * @param actual_mech_type the actual mech used, MUST NOT be freed
     *        since it pointing to static memory.
     * 
     * @param output_token if there is an output token, regardless of
     * 	  complete, continue_needed, or error it should be sent to the
     * 	  acceptor
     * 
     * @param ret_flags return what flags was negotitated, caller should
     * 	  check if they are accetable. For example, if
     * 	  GSS_C_MUTUAL_FLAG was negotiated with the acceptor or not.
     * 
     * @param time_rec amount of time this context is valid for
     * 
     * @returns a gss_error code, see gss_display_status() about printing
     *          the error code.
     * 
     * @ingroup gssapi
     */
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

    /**
     * List support attributes for a mech and/or all mechanisms.
     * 
     * @param minor_status minor status code
     * @param mech given together with mech_attr will return the list of
     *        attributes for mechanism, can optionally be GSS_C_NO_OID.
     * @param mech_attr see mech parameter, can optionally be NULL,
     *        release with gss_release_oid_set().
     * @param known_mech_attrs all attributes for mechanisms supported,
     *        release with gss_release_oid_set().
     * 
     * @ingroup gssapi
     */
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

    /**
     * Find a mech for a sasl name
     * 
     * @param minor_status minor status code
     * @param sasl_mech_name sasl mech name
     * @param mech_type mech type
     * 
     * @return returns GSS_S_COMPLETE or an error code.
     */
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

    /**
     * Returns different protocol names and description of the mechanism.
     * 
     * @param minor_status minor status code
     * @param desired_mech mech list query
     * @param sasl_mech_name SASL GS2 protocol name
     * @param mech_name gssapi protocol name
     * @param mech_description description of gssapi mech
     * 
     * @return returns GSS_S_COMPLETE or a error code.
     * 
     * @ingroup gssapi
     */
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

    /**
     * Iterate over all credentials
     * 
     * @param min_stat set to minor status in case of an error
     * @param flags flags argument, no flags currently defined, pass in 0 (zero)
     * @param mech the mechanism type of credentials to iterate over, by passing in GSS_C_NO_OID, the function will iterate over all credentails
     * @param userctx user context passed to the useriter funcion
     * @param useriter function that will be called on each gss_cred_id_t, when NULL is passed the list is completed. Must free the credential with gss_release_cred().
     * 
     * @ingroup gssapi
     */
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

    /**
     * Compare two GSS-API OIDs with each other.
     * 
     * GSS_C_NO_OID matches nothing, not even it-self.
     * 
     * @param a first oid to compare
     * @param b second oid to compare
     * 
     * @return non-zero when both oid are the same OID, zero when they are
     *         not the same.
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native int gss_oid_equal(
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct a,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct b);

    /**
     * Turn an mech OID into an name
     * 
     * Try to turn a OID into a mechanism name. If a matching OID can't be
     * found, this function will return NULL.
     * 
     * The caller must free the oid_str buffer with gss_release_buffer()
     * when done with the string.
     * 
     * @param minor_status an minor status code
     * @param oid an oid
     * @param oid_str buffer that will point to a NUL terminated string that is the numreric OID
     * 
     * @returns a gss major status code
     * 
     * @ingroup gssapi
     */
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

    /**
     * Release a credentials
     * 
     * Its ok to release the GSS_C_NO_CREDENTIAL/NULL credential, it will
     * return a GSS_S_COMPLETE error code. On return cred_handle is set ot
     * GSS_C_NO_CREDENTIAL.
     * 
     * Example:
     * 
     * @code
     * gss_cred_id_t cred = GSS_C_NO_CREDENTIAL;
     * major = gss_release_cred(&minor, &cred);
     * @endcode
     * 
     * @param minor_status minor status return code, mech specific
     * @param cred_handle a pointer to the credential too release
     * 
     * @return an gssapi error code
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native int gss_release_cred(IntPtr minor_status, Ptr<gss_cred_id_t> cred_handle);

    /**
     * Free a name
     * 
     * import_name can point to NULL or be NULL, or a pointer to a
     * gss_name_t structure. If it was a pointer to gss_name_t, the
     * pointer will be set to NULL on success and failure.
     * 
     * @param minor_status minor status code
     * @param input_name name to free
     * 
     * @returns a gss_error code, see gss_display_status() about printing
     *        the error code.
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native int gss_release_name(IntPtr minor_status, Ptr<gss_name_t> input_name);

    /**
     * Release a gss_OID
     * 
     * This function should never be used, this is since many of the
     * gss_OID objects passed around are stack and data objected that are
     * not free-able.
     * 
     * The function tries to find internal OIDs that are static and avoid
     * trying to free them.
     * 
     * One could guess that gss_name_to_oid() might return an allocated
     * OID.  In this implementation it wont, so there is no need to call
     * gss_release_oid().
     * 
     * @param minor_status minor status code returned
     * @param oid oid to be released/freed.
     * 
     * @returns GSS major status code
     * 
     * @ingroup gssapi
     */
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

    /**
     * Wrap a message using either confidentiality (encryption +
     * signature) or sealing (signature).
     * 
     * @param minor_status minor status code.
     * @param context_handle context handle.
     * @param conf_req_flag if non zero, confidentiality is requestd.
     * @param qop_req type of protection needed, in most cases it GSS_C_QOP_DEFAULT should be passed in.
     * @param input_message_buffer messages to wrap
     * @param conf_state returns non zero if confidentiality was honoured.
     * @param output_message_buffer the resulting buffer, release with gss_release_buffer().
     * 
     * @ingroup gssapi
     */
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

    /**
     * Returns a GSS credential for a given UUID if the credential exists.
     * 
     * @param uuid the UUID of the credential to fetch
     * 
     * @returns a gss_cred_id_t, normal CoreFoundaton rules for rules
     * applies so the CFUUIDRef needs to be released with either CFRelease() or gss_release_name().
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native gss_cred_id_t GSSCreateCredentialFromUUID(CFUUIDRef uuid);

    @Generated
    @CFunction
    public static native CFErrorRef GSSCreateError(
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mech,
            int major_status, int minor_status);

    /**
     * Create a GSS name from a buffer and type.
     * 
     * @param name name buffer describing a credential, can be either a CFDataRef or CFStringRef of a name.
     * @param name_type on OID of the GSS_C_NT_* OIDs constants specifiy the name type.
     * @param error if an error happen, this may be set to a CFErrorRef describing the failure futher.
     * 
     * @returns returns gss_name_t or NULL on failure. Must be freed using gss_release_name() or CFRelease(). Follows CoreFoundation Create/Copy rule.
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native gss_name_t GSSCreateName(ConstVoidPtr name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct name_type,
            Ptr<CFErrorRef> error);

    /**
     * Copy the name describing the credential
     * 
     * @param cred the credential to get the name from
     * 
     * @returns returns gss_name_t or NULL on failure. Must be freed using gss_release_name() or CFRelease(). Follows CoreFoundation Create/Copy rule.
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native gss_name_t GSSCredentialCopyName(gss_cred_id_t cred);

    /**
     * Returns a copy of the UUID of the GSS credential
     * 
     * @param credential credential
     * 
     * @returns CFUUIDRef that can be used to turn into a credential,
     * normal CoreFoundaton rules for rules applies so the CFUUIDRef needs
     * to be released.
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native CFUUIDRef GSSCredentialCopyUUID(gss_cred_id_t credential);

    /**
     * Return the lifetime (in seconds) left of the credential.
     * 
     * @param cred the credential to get the name from
     * 
     * @returns the lifetime of the credentials. 0 on failure and
     * GSS_C_INDEFINITE on credentials that never expire.
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native int GSSCredentialGetLifetime(gss_cred_id_t cred);

    /**
     * Returns a string that is suitable for displaying to user, must not
     * be used for verify subjects on an ACLs.
     * 
     * @param name to get a display strings from
     * 
     * @returns a string that is printable. Follows CoreFoundation Create/Copy rule.
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native CFStringRef GSSNameCreateDisplayString(gss_name_t name);

    /**
     * Change pasword for a gss name
     * 
     * @param name name to change password for
     * @param mech mechanism to use
     * @param attributes old and new password (kGSSChangePasswordOldPassword and kGSSChangePasswordNewPassword) and other attributes.
     * @param error if not NULL, error might be set case function doesn't
     *       return GSS_S_COMPLETE, in that case is must be released with
     *       CFRelease().
     * 
     * @returns returns GSS_S_COMPLETE on success, error might be set if passed in.
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native int gss_aapl_change_password(gss_name_t name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct mech,
            CFDictionaryRef attributes, Ptr<CFErrorRef> error);

    /**
     * Acquire a new initial credentials using long term credentials (password, certificate).
     * 
     * Credentials acquired should be free-ed with gss_release_cred() or
     * destroyed with (removed from storage) gss_destroy_cred().
     * 
     * Some mechanism types can not directly acquire or validate
     * credential (for example PK-U2U, SCRAM, NTLM or IAKERB), for those
     * mechanisms its instead the gss_init_sec_context() that will either acquire or
     * force validation of the credential.
     * 
     * This function is blocking and should not be used on threads used for UI updates.
     * 
     * @param desired_name name to use to acquire credential. Import the name using gss_import_name(). The type of the name has to be supported by the desired_mech used.
     * 
     * @param desired_mech mechanism to use to acquire credential. GSS_C_NO_OID is not valid input and a mechanism must be selected. For example GSS_KRB5_MECHANISM, GSS_NTLM_MECHNISM or any other mechanisms supported by the implementation. See gss_indicate_mechs().
     * 
     * @param attributes CFDictionary that contains how to acquire the credential, see below for examples
     * 
     * @param output_cred_handle the resulting credential handle, value is set to GSS_C_NO_CREDENTIAL on failure.
     * 
     * @param error an CFErrorRef returned in case of an error, that needs to be released with CFRelease() by the caller, input can be NULL.
     * 
     * @returns a gss_error code, see the CFErrorRef passed back in error for the failure message.
     * 
     * attributes must contains one of the following keys
     * * kGSSICPassword - CFStringRef password
     * * kGSSICCertificate - SecIdentityRef, SecCertificate, or CFDataRef[data of a Keychain Persistent Reference] to the certificate to use with PKINIT/PKU2U
     * 
     * optional keys
     * * kGSSCredentialUsage - one of kGSS_C_INITIATE, kGSS_C_ACCEPT, kGSS_C_BOTH, default if not given is kGSS_C_INITIATE
     * * kGSSICVerifyCredential - validate the credential with a trusted source that there was no MITM
     * * kGSSICLKDCHostname - CFStringRef hostname of LKDC hostname
     * * kGSSICKerberosCacheName - CFStringRef name of cache that will be created (including type)
     * * kGSSICSiteName - CFStringRef name of site (you are authenticating too) used for load balancing in DNS in Kerberos)
     * * kGSSICAppIdentifierACL - CFArrayRef[CFStringRef] prefix of bundle ID allowed to access this credential
     * * kGSSICCreateNewCredential - CFBooleanRef if set caller wants to create a new credential and not overwrite a credential with the same name
     * * kGSSICAuthenticationContext - CFBooleanRef/YES to allow authentication UI, or LAContext to pass a pre-evaluated authentication context
     * 
     * * kGSSICAppleSourceApp - CFDictionaryRef application we are performing this on behalf of (only applies to AppVPN)
     * 
     * Keys for kGSSICAppleSourceApp dictionary:
     * 
     * - kGSSICAppleSourceAppAuditToken - audit token of process this is
     *  		preformed on behalf of, the audit_token_t is wrapped
     *  		in a CFDataRef.
     * - kGSSICAppleSourceAppPID - PID in a CFNumberRef of process this is
     *              preformed on behalf of
     * - kGSSICAppleSourceAppUUID - UUID of the application
     * - kGSSICAppleSourceAppSigningIdentity - bundle/signing identity of the application
     * 
     * 
     * @ingroup gssapi
     */
    @Generated
    @CFunction
    public static native int gss_aapl_initial_cred(gss_name_t desired_name,
            @UncertainArgument("Options: reference, array Fallback: reference") gss_OID_desc_struct desired_mech,
            CFDictionaryRef attributes, Ptr<gss_cred_id_t> output_cred_handle, Ptr<CFErrorRef> error);

    /**
     * contact Love Hörnquist Åstrand <lha@h5l.org> for new oid arcs
     * 1.2.752.43.13 Heimdal GSS-API Extentions
     */
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

    /**
     * .34 was GSS_APPL_LKDC_SUPPORTED
     */
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

    /**
     * glue for gss_inquire_saslname_for_mech
     */
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

    /**
     * credential types
     */
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

    /**
     * Heimdal mechanisms - 1.2.752.43.14
     */
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

    /**
     * GSS_NETLOGON_SET_.* should move to some other location
     */
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

    /**
     * GSS_KRB5_EXTRACT_AUTHZ_DATA_FROM_SEC_CONTEXT_X.128
     */
    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_inq_win2k_pac_x_oid_desc();

    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_inq_sspi_session_key_oid_desc();

    /**
     * "Standard" mechs
     */
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

    /**
     * GSS names
     */
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

    /**
     * From Luke Howard
     */
    @Generated
    @CVariable()
    @ByValue
    public static native gss_OID_desc_struct __gss_c_peer_has_updated_spnego_oid_desc();

    /**
     * OID mappings with name and short description and and slightly longer description
     * RFC5587
     */
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
                gss_cred_id_t arg2);
    }
}
