/*
 * Java binding for libimobiledevice and libplist.
 * 
 * Copyright 2014-2016 Intel Corporation
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.libimobiledevice.c;

import org.libimobiledevice.opaque.afc_client_t;
import org.libimobiledevice.opaque.debugserver_client_t;
import org.libimobiledevice.opaque.debugserver_command_t;
import org.libimobiledevice.opaque.diagnostics_relay_client_t;
import org.libimobiledevice.opaque.file_relay_client_t;
import org.libimobiledevice.opaque.heartbeat_client_t;
import org.libimobiledevice.opaque.house_arrest_client_t;
import org.libimobiledevice.opaque.idevice_connection_t;
import org.libimobiledevice.opaque.idevice_t;
import org.libimobiledevice.opaque.instproxy_client_t;
import org.libimobiledevice.opaque.lockdownd_client_t;
import org.libimobiledevice.opaque.misagent_client_t;
import org.libimobiledevice.opaque.mobile_image_mounter_client_t;
import org.libimobiledevice.opaque.mobilebackup2_client_t;
import org.libimobiledevice.opaque.mobilebackup_client_t;
import org.libimobiledevice.opaque.mobilesync_client_t;
import org.libimobiledevice.opaque.np_client_t;
import org.libimobiledevice.opaque.property_list_service_client_t;
import org.libimobiledevice.opaque.restored_client_t;
import org.libimobiledevice.opaque.sbservices_client_t;
import org.libimobiledevice.opaque.screenshotr_client_t;
import org.libimobiledevice.opaque.service_client_t;
import org.libimobiledevice.opaque.syslog_relay_client_t;
import org.libimobiledevice.opaque.webinspector_client_t;
import org.libimobiledevice.struct.idevice_event_t;
import org.libimobiledevice.struct.lockdownd_pair_record;
import org.libimobiledevice.struct.lockdownd_service_descriptor;
import org.libimobiledevice.struct.mobilesync_anchors;
import org.libplist.opaque.plist_t;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.c.map.CStringArrayMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Runtime(CRuntime.class)
public final class Globals {
    static {
        NatJ.register();
    }

    @Generated
    private Globals() {
    }

    @Generated
    @CFunction
    public static native void idevice_set_debug_level(int level);

    @Generated
    @CFunction
    public static native int idevice_event_subscribe(
            @FunctionPtr(name = "call_idevice_event_subscribe") Function_idevice_event_subscribe callback,
            VoidPtr user_data);

    @Generated
    @CFunction
    public static native int idevice_event_unsubscribe();

    @Generated
    @CFunction
    public static native int idevice_get_device_list(Ptr<Ptr<BytePtr>> devices, IntPtr count);

    @Generated
    @CFunction
    public static native int idevice_device_list_free(Ptr<BytePtr> devices);

    @Generated
    @CFunction
    public static native int idevice_new(Ptr<idevice_t> device,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String udid);

    @Generated
    @CFunction
    public static native int idevice_new_with_connection(Ptr<idevice_t> device,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String udid,
            int conn_type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String conn_subtype);

    @Generated
    @CFunction
    public static native int idevice_free(idevice_t device);

    @Generated
    @CFunction
    public static native int idevice_connect(idevice_t device, short port, Ptr<idevice_connection_t> connection);

    @Generated
    @CFunction
    public static native int idevice_disconnect(idevice_connection_t connection);

    @Generated
    @CFunction
    public static native int idevice_connection_send(idevice_connection_t connection, ConstBytePtr data, int len,
            IntPtr sent_bytes);

    @Generated
    @CFunction
    public static native int idevice_connection_receive_timeout(idevice_connection_t connection, BytePtr data, int len,
            IntPtr recv_bytes, int timeout);

    @Generated
    @CFunction
    public static native int idevice_connection_receive(idevice_connection_t connection, BytePtr data, int len,
            IntPtr recv_bytes);

    @Generated
    @CFunction
    public static native int idevice_connection_enable_ssl(idevice_connection_t connection);

    @Generated
    @CFunction
    public static native int idevice_connection_disable_ssl(idevice_connection_t connection);

    @Generated
    @CFunction
    public static native int idevice_get_handle(idevice_t device, IntPtr handle);

    @Generated
    @CFunction
    public static native int idevice_get_udid(idevice_t device, Ptr<BytePtr> udid);

    @Generated
    @CFunction
    public static native int lockdownd_client_new(idevice_t device, Ptr<lockdownd_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int lockdownd_client_new_with_handshake(idevice_t device, Ptr<lockdownd_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int lockdownd_client_free(lockdownd_client_t client);

    @Generated
    @CFunction
    public static native int lockdownd_query_type(lockdownd_client_t client, Ptr<BytePtr> type);

    @Generated
    @CFunction
    public static native int lockdownd_get_value(lockdownd_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<plist_t> value);

    @Generated
    @CFunction
    public static native int lockdownd_set_value(lockdownd_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            plist_t value);

    @Generated
    @CFunction
    public static native int lockdownd_remove_value(lockdownd_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

    @Generated
    @CFunction
    public static native int lockdownd_start_service(lockdownd_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String identifier,
            Ptr<Ptr<lockdownd_service_descriptor>> service);

    @Generated
    @CFunction
    public static native int lockdownd_start_service_with_escrow_bag(lockdownd_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String identifier,
            Ptr<Ptr<lockdownd_service_descriptor>> service);

    @Generated
    @CFunction
    public static native int lockdownd_start_session(lockdownd_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String host_id,
            Ptr<BytePtr> session_id, IntPtr ssl_enabled);

    @Generated
    @CFunction
    public static native int lockdownd_stop_session(lockdownd_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String session_id);

    @Generated
    @CFunction
    public static native int lockdownd_send(lockdownd_client_t client, plist_t plist);

    @Generated
    @CFunction
    public static native int lockdownd_receive(lockdownd_client_t client, Ptr<plist_t> plist);

    @Generated
    @CFunction
    public static native int lockdownd_pair(lockdownd_client_t client,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_pair_record pair_record);

    @Generated
    @CFunction
    public static native int lockdownd_validate_pair(lockdownd_client_t client,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_pair_record pair_record);

    @Generated
    @CFunction
    public static native int lockdownd_unpair(lockdownd_client_t client,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_pair_record pair_record);

    @Generated
    @CFunction
    public static native int lockdownd_activate(lockdownd_client_t client, plist_t activation_record);

    @Generated
    @CFunction
    public static native int lockdownd_deactivate(lockdownd_client_t client);

    @Generated
    @CFunction
    public static native int lockdownd_enter_recovery(lockdownd_client_t client);

    @Generated
    @CFunction
    public static native int lockdownd_goodbye(lockdownd_client_t client);

    @Generated
    @CFunction
    public static native void lockdownd_client_set_label(lockdownd_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int lockdownd_get_device_udid(lockdownd_client_t control, Ptr<BytePtr> udid);

    @Generated
    @CFunction
    public static native int lockdownd_get_device_name(lockdownd_client_t client, Ptr<BytePtr> device_name);

    @Generated
    @CFunction
    public static native int lockdownd_get_sync_data_classes(lockdownd_client_t client, Ptr<Ptr<BytePtr>> classes,
            IntPtr count);

    @Generated
    @CFunction
    public static native int lockdownd_data_classes_free(Ptr<BytePtr> classes);

    @Generated
    @CFunction
    public static native int lockdownd_service_descriptor_free(
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service);

    @Generated
    @CFunction
    public static native int afc_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<afc_client_t> client);

    @Generated
    @CFunction
    public static native int afc_client_start_service(idevice_t device, Ptr<afc_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int afc_client_free(afc_client_t client);

    @Generated
    @CFunction
    public static native int afc_get_device_info(afc_client_t client, Ptr<Ptr<BytePtr>> device_information);

    @Generated
    @CFunction
    public static native int afc_read_directory(afc_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path,
            Ptr<Ptr<BytePtr>> directory_information);

    @Generated
    @CFunction
    public static native int afc_get_file_info(afc_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String filename,
            Ptr<Ptr<BytePtr>> file_information);

    @Generated
    @CFunction
    public static native int afc_file_open(afc_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String filename,
            int file_mode, LongPtr handle);

    @Generated
    @CFunction
    public static native int afc_file_close(afc_client_t client, long handle);

    @Generated
    @CFunction
    public static native int afc_file_lock(afc_client_t client, long handle, int operation);

    @Generated
    @CFunction
    public static native int afc_file_read(afc_client_t client, long handle, BytePtr data, int length,
            IntPtr bytes_read);

    @Generated
    @CFunction
    public static native int afc_file_write(afc_client_t client, long handle, ConstBytePtr data, int length,
            IntPtr bytes_written);

    @Generated
    @CFunction
    public static native int afc_file_seek(afc_client_t client, long handle, long offset, int whence);

    @Generated
    @CFunction
    public static native int afc_file_tell(afc_client_t client, long handle, LongPtr position);

    @Generated
    @CFunction
    public static native int afc_file_truncate(afc_client_t client, long handle, long newsize);

    @Generated
    @CFunction
    public static native int afc_remove_path(afc_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path);

    @Generated
    @CFunction
    public static native int afc_rename_path(afc_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String from,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String to);

    @Generated
    @CFunction
    public static native int afc_make_directory(afc_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path);

    @Generated
    @CFunction
    public static native int afc_truncate(afc_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path,
            long newsize);

    @Generated
    @CFunction
    public static native int afc_make_link(afc_client_t client, int linktype,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String target,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String linkname);

    @Generated
    @CFunction
    public static native int afc_set_file_time(afc_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path, long mtime);

    @Generated
    @CFunction
    public static native int afc_remove_path_and_contents(afc_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path);

    @Generated
    @CFunction
    public static native int afc_get_device_info_key(afc_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<BytePtr> value);

    @Generated
    @CFunction
    public static native int afc_dictionary_free(Ptr<BytePtr> dictionary);

    @Generated
    @CFunction
    public static native int debugserver_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<debugserver_client_t> client);

    @Generated
    @CFunction
    public static native int debugserver_client_start_service(idevice_t device, Ptr<debugserver_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int debugserver_client_free(debugserver_client_t client);

    @Generated
    @CFunction
    public static native int debugserver_client_send(debugserver_client_t client, ConstBytePtr data, int size,
            IntPtr sent);

    @Generated
    @CFunction
    public static native int debugserver_client_receive_with_timeout(debugserver_client_t client, BytePtr data,
            int size, IntPtr received, int timeout);

    @Generated
    @CFunction
    public static native int debugserver_client_receive(debugserver_client_t client, BytePtr data, int size,
            IntPtr received);

    @Generated
    @CFunction
    public static native int debugserver_client_send_command(debugserver_client_t client, debugserver_command_t command,
            Ptr<BytePtr> response);

    @Generated
    @CFunction
    public static native int debugserver_client_receive_response(debugserver_client_t client, Ptr<BytePtr> response);

    @Generated
    @CFunction
    public static native int debugserver_client_set_argv(debugserver_client_t client, int argc, Ptr<BytePtr> argv,
            Ptr<BytePtr> response);

    @Generated
    @CFunction
    public static native int debugserver_client_set_environment_hex_encoded(debugserver_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String env,
            Ptr<BytePtr> response);

    @Generated
    @CFunction
    public static native int debugserver_command_new(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name, int argc,
            Ptr<BytePtr> argv, Ptr<debugserver_command_t> command);

    @Generated
    @CFunction
    public static native int debugserver_command_free(debugserver_command_t command);

    @Generated
    @CFunction
    public static native void debugserver_encode_string(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
            Ptr<BytePtr> encoded_buffer, IntPtr encoded_length);

    @Generated
    @CFunction
    public static native void debugserver_decode_string(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String encoded_buffer,
            long encoded_length, Ptr<BytePtr> buffer);

    @Generated
    @CFunction
    public static native int diagnostics_relay_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<diagnostics_relay_client_t> client);

    @Generated
    @CFunction
    public static native int diagnostics_relay_client_start_service(idevice_t device,
            Ptr<diagnostics_relay_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int diagnostics_relay_client_free(diagnostics_relay_client_t client);

    @Generated
    @CFunction
    public static native int diagnostics_relay_goodbye(diagnostics_relay_client_t client);

    @Generated
    @CFunction
    public static native int diagnostics_relay_sleep(diagnostics_relay_client_t client);

    @Generated
    @CFunction
    public static native int diagnostics_relay_restart(diagnostics_relay_client_t client, int flags);

    @Generated
    @CFunction
    public static native int diagnostics_relay_shutdown(diagnostics_relay_client_t client, int flags);

    @Generated
    @CFunction
    public static native int diagnostics_relay_request_diagnostics(diagnostics_relay_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String type,
            Ptr<plist_t> diagnostics);

    @Generated
    @CFunction
    public static native int diagnostics_relay_query_mobilegestalt(diagnostics_relay_client_t client, plist_t keys,
            Ptr<plist_t> result);

    @Generated
    @CFunction
    public static native int diagnostics_relay_query_ioregistry_entry(diagnostics_relay_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String class_,
            Ptr<plist_t> result);

    @Generated
    @CFunction
    public static native int diagnostics_relay_query_ioregistry_plane(diagnostics_relay_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String plane,
            Ptr<plist_t> result);

    @Generated
    @CFunction
    public static native int file_relay_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<file_relay_client_t> client);

    @Generated
    @CFunction
    public static native int file_relay_client_start_service(idevice_t device, Ptr<file_relay_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int file_relay_client_free(file_relay_client_t client);

    @Generated
    @CFunction
    public static native int file_relay_request_sources(file_relay_client_t client,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] sources,
            Ptr<idevice_connection_t> connection);

    @Generated
    @CFunction
    public static native int file_relay_request_sources_timeout(file_relay_client_t client,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] sources,
            Ptr<idevice_connection_t> connection, int timeout);

    @Generated
    @CFunction
    public static native int heartbeat_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<heartbeat_client_t> client);

    @Generated
    @CFunction
    public static native int heartbeat_client_start_service(idevice_t device, Ptr<heartbeat_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int heartbeat_client_free(heartbeat_client_t client);

    @Generated
    @CFunction
    public static native int heartbeat_send(heartbeat_client_t client, plist_t plist);

    @Generated
    @CFunction
    public static native int heartbeat_receive(heartbeat_client_t client, Ptr<plist_t> plist);

    @Generated
    @CFunction
    public static native int heartbeat_receive_with_timeout(heartbeat_client_t client, Ptr<plist_t> plist,
            int timeout_ms);

    @Generated
    @CFunction
    public static native int house_arrest_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<house_arrest_client_t> client);

    @Generated
    @CFunction
    public static native int house_arrest_client_start_service(idevice_t device, Ptr<house_arrest_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int house_arrest_client_free(house_arrest_client_t client);

    @Generated
    @CFunction
    public static native int house_arrest_send_request(house_arrest_client_t client, plist_t dict);

    @Generated
    @CFunction
    public static native int house_arrest_send_command(house_arrest_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String command,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String appid);

    @Generated
    @CFunction
    public static native int house_arrest_get_result(house_arrest_client_t client, Ptr<plist_t> dict);

    @Generated
    @CFunction
    public static native int afc_client_new_from_house_arrest_client(house_arrest_client_t client,
            Ptr<afc_client_t> afc_client);

    @Generated
    @CFunction
    public static native int instproxy_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<instproxy_client_t> client);

    @Generated
    @CFunction
    public static native int instproxy_client_start_service(idevice_t device, Ptr<instproxy_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int instproxy_client_free(instproxy_client_t client);

    @Generated
    @CFunction
    public static native int instproxy_browse(instproxy_client_t client, plist_t client_options, Ptr<plist_t> result);

    @Generated
    @CFunction
    public static native int instproxy_install(instproxy_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pkg_path,
            plist_t client_options, @FunctionPtr(name = "call_instproxy_install") Function_instproxy_install status_cb,
            VoidPtr user_data);

    @Generated
    @CFunction
    public static native int instproxy_upgrade(instproxy_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pkg_path,
            plist_t client_options, @FunctionPtr(name = "call_instproxy_upgrade") Function_instproxy_upgrade status_cb,
            VoidPtr user_data);

    @Generated
    @CFunction
    public static native int instproxy_uninstall(instproxy_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String appid,
            plist_t client_options,
            @FunctionPtr(name = "call_instproxy_uninstall") Function_instproxy_uninstall status_cb, VoidPtr user_data);

    @Generated
    @CFunction
    public static native int instproxy_lookup_archives(instproxy_client_t client, plist_t client_options,
            Ptr<plist_t> result);

    @Generated
    @CFunction
    public static native int instproxy_archive(instproxy_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String appid,
            plist_t client_options, @FunctionPtr(name = "call_instproxy_archive") Function_instproxy_archive status_cb,
            VoidPtr user_data);

    @Generated
    @CFunction
    public static native int instproxy_restore(instproxy_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String appid,
            plist_t client_options, @FunctionPtr(name = "call_instproxy_restore") Function_instproxy_restore status_cb,
            VoidPtr user_data);

    @Generated
    @CFunction
    public static native int instproxy_remove_archive(instproxy_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String appid,
            plist_t client_options,
            @FunctionPtr(name = "call_instproxy_remove_archive") Function_instproxy_remove_archive status_cb,
            VoidPtr user_data);

    @Generated
    @CFunction
    public static native plist_t instproxy_client_options_new();

    @Generated
    @CFunction
    public static native void instproxy_client_option_add(plist_t client_options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

    @Generated
    @CFunction
    public static native void instproxy_client_options_free(plist_t client_options);

    @Generated
    @CFunction
    public static native int instproxy_client_get_path_for_bundle_identifier(instproxy_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bundle_id,
            Ptr<BytePtr> path);

    @Generated
    @CFunction
    public static native int misagent_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<misagent_client_t> client);

    @Generated
    @CFunction
    public static native int misagent_client_start_service(idevice_t device, Ptr<misagent_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int misagent_client_free(misagent_client_t client);

    @Generated
    @CFunction
    public static native int misagent_install(misagent_client_t client, plist_t profile);

    @Generated
    @CFunction
    public static native int misagent_copy(misagent_client_t client, Ptr<plist_t> profiles);

    @Generated
    @CFunction
    public static native int misagent_remove(misagent_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String profileID);

    @Generated
    @CFunction
    public static native int misagent_get_status_code(misagent_client_t client);

    @Generated
    @CFunction
    public static native int mobile_image_mounter_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<mobile_image_mounter_client_t> client);

    @Generated
    @CFunction
    public static native int mobile_image_mounter_start_service(idevice_t device,
            Ptr<mobile_image_mounter_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int mobile_image_mounter_free(mobile_image_mounter_client_t client);

    @Generated
    @CFunction
    public static native int mobile_image_mounter_lookup_image(mobile_image_mounter_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String image_type,
            Ptr<plist_t> result);

    @Generated
    @CFunction
    public static native int mobile_image_mounter_upload_image(mobile_image_mounter_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String image_type,
            long image_size,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String signature,
            short signature_size,
            @FunctionPtr(name = "call_mobile_image_mounter_upload_image") Function_mobile_image_mounter_upload_image upload_cb,
            VoidPtr userdata);

    @Generated
    @CFunction
    public static native int mobile_image_mounter_mount_image(mobile_image_mounter_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String image_path,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String signature,
            short signature_size,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String image_type,
            Ptr<plist_t> result);

    @Generated
    @CFunction
    public static native int mobile_image_mounter_hangup(mobile_image_mounter_client_t client);

    @Generated
    @CFunction
    public static native int mobilebackup_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<mobilebackup_client_t> client);

    @Generated
    @CFunction
    public static native int mobilebackup_client_start_service(idevice_t device, Ptr<mobilebackup_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int mobilebackup_client_free(mobilebackup_client_t client);

    @Generated
    @CFunction
    public static native int mobilebackup_receive(mobilebackup_client_t client, Ptr<plist_t> plist);

    @Generated
    @CFunction
    public static native int mobilebackup_send(mobilebackup_client_t client, plist_t plist);

    @Generated
    @CFunction
    public static native int mobilebackup_request_backup(mobilebackup_client_t client, plist_t backup_manifest,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String base_path,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String proto_version);

    @Generated
    @CFunction
    public static native int mobilebackup_send_backup_file_received(mobilebackup_client_t client);

    @Generated
    @CFunction
    public static native int mobilebackup_request_restore(mobilebackup_client_t client, plist_t backup_manifest,
            int flags,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String proto_version);

    @Generated
    @CFunction
    public static native int mobilebackup_receive_restore_file_received(mobilebackup_client_t client,
            Ptr<plist_t> result);

    @Generated
    @CFunction
    public static native int mobilebackup_receive_restore_application_received(mobilebackup_client_t client,
            Ptr<plist_t> result);

    @Generated
    @CFunction
    public static native int mobilebackup_send_restore_complete(mobilebackup_client_t client);

    @Generated
    @CFunction
    public static native int mobilebackup_send_error(mobilebackup_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String reason);

    @Generated
    @CFunction
    public static native int mobilebackup2_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<mobilebackup2_client_t> client);

    @Generated
    @CFunction
    public static native int mobilebackup2_client_start_service(idevice_t device, Ptr<mobilebackup2_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int mobilebackup2_client_free(mobilebackup2_client_t client);

    @Generated
    @CFunction
    public static native int mobilebackup2_send_message(mobilebackup2_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String message,
            plist_t options);

    @Generated
    @CFunction
    public static native int mobilebackup2_receive_message(mobilebackup2_client_t client, Ptr<plist_t> msg_plist,
            Ptr<BytePtr> dlmessage);

    @Generated
    @CFunction
    public static native int mobilebackup2_send_raw(mobilebackup2_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String data, int length,
            IntPtr bytes);

    @Generated
    @CFunction
    public static native int mobilebackup2_receive_raw(mobilebackup2_client_t client, BytePtr data, int length,
            IntPtr bytes);

    @Generated
    @CFunction
    public static native int mobilebackup2_version_exchange(mobilebackup2_client_t client, DoublePtr local_versions,
            byte count, DoublePtr remote_version);

    @Generated
    @CFunction
    public static native int mobilebackup2_send_request(mobilebackup2_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String request,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String target_identifier,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String source_identifier,
            plist_t options);

    @Generated
    @CFunction
    public static native int mobilebackup2_send_status_response(mobilebackup2_client_t client, int status_code,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String status1,
            plist_t status2);

    @Generated
    @CFunction
    public static native int mobilesync_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<mobilesync_client_t> client);

    @Generated
    @CFunction
    public static native int mobilesync_client_start_service(idevice_t device, Ptr<mobilesync_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int mobilesync_client_free(mobilesync_client_t client);

    @Generated
    @CFunction
    public static native int mobilesync_receive(mobilesync_client_t client, Ptr<plist_t> plist);

    @Generated
    @CFunction
    public static native int mobilesync_send(mobilesync_client_t client, plist_t plist);

    @Generated
    @CFunction
    public static native int mobilesync_start(mobilesync_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String data_class,
            @UncertainArgument("Options: reference, array Fallback: reference") mobilesync_anchors anchors,
            long computer_data_class_version, IntPtr sync_type, LongPtr device_data_class_version,
            Ptr<BytePtr> error_description);

    @Generated
    @CFunction
    public static native int mobilesync_cancel(mobilesync_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String reason);

    @Generated
    @CFunction
    public static native int mobilesync_finish(mobilesync_client_t client);

    @Generated
    @CFunction
    public static native int mobilesync_get_all_records_from_device(mobilesync_client_t client);

    @Generated
    @CFunction
    public static native int mobilesync_get_changes_from_device(mobilesync_client_t client);

    @Generated
    @CFunction
    public static native int mobilesync_clear_all_records_on_device(mobilesync_client_t client);

    @Generated
    @CFunction
    public static native int mobilesync_receive_changes(mobilesync_client_t client, Ptr<plist_t> entities,
            BytePtr is_last_record, Ptr<plist_t> actions);

    @Generated
    @CFunction
    public static native int mobilesync_acknowledge_changes_from_device(mobilesync_client_t client);

    @Generated
    @CFunction
    public static native int mobilesync_ready_to_send_changes_from_computer(mobilesync_client_t client);

    @Generated
    @CFunction
    public static native int mobilesync_send_changes(mobilesync_client_t client, plist_t entities, byte is_last_record,
            plist_t actions);

    @Generated
    @CFunction
    public static native int mobilesync_remap_identifiers(mobilesync_client_t client, Ptr<plist_t> mapping);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native mobilesync_anchors mobilesync_anchors_new(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String device_anchor,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String computer_anchor);

    @Generated
    @CFunction
    public static native void mobilesync_anchors_free(
            @UncertainArgument("Options: reference, array Fallback: reference") mobilesync_anchors anchors);

    @Generated
    @CFunction
    public static native plist_t mobilesync_actions_new();

    @Generated
    @CFunction
    public static native void mobilesync_actions_free(plist_t actions);

    @Generated
    @CFunction
    public static native int np_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<np_client_t> client);

    @Generated
    @CFunction
    public static native int np_client_start_service(idevice_t device, Ptr<np_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int np_client_free(np_client_t client);

    @Generated
    @CFunction
    public static native int np_post_notification(np_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String notification);

    @Generated
    @CFunction
    public static native int np_observe_notification(np_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String notification);

    @Generated
    @CFunction
    public static native int np_observe_notifications(np_client_t client,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] notification_spec);

    @Generated
    @CFunction
    public static native int np_set_notify_callback(np_client_t client,
            @FunctionPtr(name = "call_np_set_notify_callback") Function_np_set_notify_callback notify_cb,
            VoidPtr userdata);

    @Generated
    @CFunction
    public static native int property_list_service_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<property_list_service_client_t> client);

    @Generated
    @CFunction
    public static native int property_list_service_client_free(property_list_service_client_t client);

    @Generated
    @CFunction
    public static native int property_list_service_send_xml_plist(property_list_service_client_t client, plist_t plist);

    @Generated
    @CFunction
    public static native int property_list_service_send_binary_plist(property_list_service_client_t client,
            plist_t plist);

    @Generated
    @CFunction
    public static native int property_list_service_receive_plist_with_timeout(property_list_service_client_t client,
            Ptr<plist_t> plist, int timeout);

    @Generated
    @CFunction
    public static native int property_list_service_receive_plist(property_list_service_client_t client,
            Ptr<plist_t> plist);

    @Generated
    @CFunction
    public static native int property_list_service_enable_ssl(property_list_service_client_t client);

    @Generated
    @CFunction
    public static native int property_list_service_disable_ssl(property_list_service_client_t client);

    @Generated
    @CFunction
    public static native int restored_client_new(idevice_t device, Ptr<restored_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int restored_client_free(restored_client_t client);

    @Generated
    @CFunction
    public static native int restored_query_type(restored_client_t client, Ptr<BytePtr> type, LongPtr version);

    @Generated
    @CFunction
    public static native int restored_query_value(restored_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<plist_t> value);

    @Generated
    @CFunction
    public static native int restored_get_value(restored_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<plist_t> value);

    @Generated
    @CFunction
    public static native int restored_send(restored_client_t client, plist_t plist);

    @Generated
    @CFunction
    public static native int restored_receive(restored_client_t client, Ptr<plist_t> plist);

    @Generated
    @CFunction
    public static native int restored_goodbye(restored_client_t client);

    @Generated
    @CFunction
    public static native int restored_start_restore(restored_client_t client, plist_t options, long version);

    @Generated
    @CFunction
    public static native int restored_reboot(restored_client_t client);

    @Generated
    @CFunction
    public static native void restored_client_set_label(restored_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int sbservices_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<sbservices_client_t> client);

    @Generated
    @CFunction
    public static native int sbservices_client_start_service(idevice_t device, Ptr<sbservices_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int sbservices_client_free(sbservices_client_t client);

    @Generated
    @CFunction
    public static native int sbservices_get_icon_state(sbservices_client_t client, Ptr<plist_t> state,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String format_version);

    @Generated
    @CFunction
    public static native int sbservices_set_icon_state(sbservices_client_t client, plist_t newstate);

    @Generated
    @CFunction
    public static native int sbservices_get_icon_pngdata(sbservices_client_t client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bundleId,
            Ptr<BytePtr> pngdata, LongPtr pngsize);

    @Generated
    @CFunction
    public static native int sbservices_get_interface_orientation(sbservices_client_t client,
            IntPtr interface_orientation);

    @Generated
    @CFunction
    public static native int sbservices_get_home_screen_wallpaper_pngdata(sbservices_client_t client,
            Ptr<BytePtr> pngdata, LongPtr pngsize);

    @Generated
    @CFunction
    public static native int screenshotr_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<screenshotr_client_t> client);

    @Generated
    @CFunction
    public static native int screenshotr_client_start_service(idevice_t device, Ptr<screenshotr_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int screenshotr_client_free(screenshotr_client_t client);

    @Generated
    @CFunction
    public static native int screenshotr_take_screenshot(screenshotr_client_t client, Ptr<BytePtr> imgdata,
            LongPtr imgsize);

    @Generated
    @CFunction
    public static native int service_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<service_client_t> client);

    @Generated
    @CFunction
    public static native int service_client_factory_start_service(idevice_t device,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String service_name,
            Ptr<VoidPtr> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label,
            @FunctionPtr(name = "call_service_client_factory_start_service") Function_service_client_factory_start_service constructor_func,
            IntPtr error_code);

    @Generated
    @CFunction
    public static native int service_client_free(service_client_t client);

    @Generated
    @CFunction
    public static native int service_send(service_client_t client, ConstBytePtr data, int size, IntPtr sent);

    @Generated
    @CFunction
    public static native int service_receive_with_timeout(service_client_t client, BytePtr data, int size,
            IntPtr received, int timeout);

    @Generated
    @CFunction
    public static native int service_receive(service_client_t client, BytePtr data, int size, IntPtr received);

    @Generated
    @CFunction
    public static native int service_enable_ssl(service_client_t client);

    @Generated
    @CFunction
    public static native int service_disable_ssl(service_client_t client);

    @Generated
    @CFunction
    public static native int syslog_relay_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<syslog_relay_client_t> client);

    @Generated
    @CFunction
    public static native int syslog_relay_client_start_service(idevice_t device, Ptr<syslog_relay_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int syslog_relay_client_free(syslog_relay_client_t client);

    @Generated
    @CFunction
    public static native int syslog_relay_start_capture(syslog_relay_client_t client,
            @FunctionPtr(name = "call_syslog_relay_start_capture") Function_syslog_relay_start_capture callback,
            VoidPtr user_data);

    @Generated
    @CFunction
    public static native int syslog_relay_stop_capture(syslog_relay_client_t client);

    @Generated
    @CFunction
    public static native int syslog_relay_receive_with_timeout(syslog_relay_client_t client, BytePtr data, int size,
            IntPtr received, int timeout);

    @Generated
    @CFunction
    public static native int syslog_relay_receive(syslog_relay_client_t client, BytePtr data, int size,
            IntPtr received);

    @Generated
    @CFunction
    public static native int webinspector_client_new(idevice_t device,
            @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor service,
            Ptr<webinspector_client_t> client);

    @Generated
    @CFunction
    public static native int webinspector_client_start_service(idevice_t device, Ptr<webinspector_client_t> client,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native int webinspector_client_free(webinspector_client_t client);

    @Generated
    @CFunction
    public static native int webinspector_send(webinspector_client_t client, plist_t plist);

    @Generated
    @CFunction
    public static native int webinspector_receive(webinspector_client_t client, Ptr<plist_t> plist);

    @Generated
    @CFunction
    public static native int webinspector_receive_with_timeout(webinspector_client_t client, Ptr<plist_t> plist,
            int timeout_ms);

    @Generated
    @CFunction
    public static native int idevice_get_device_list_with_connection(Ptr<Ptr<BytePtr>> devices, IntPtr count,
            int conn_type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String conn_subtype);

    @Generated
    @CFunction
    public static native int debugserver_client_set_ack_mode(debugserver_client_t client, int enabled);

    @Generated
    @CFunction
    public static native int instproxy_browse_with_callback(instproxy_client_t client, plist_t client_options,
            @FunctionPtr(name = "call_instproxy_browse_with_callback") Function_instproxy_browse_with_callback status_cb,
            VoidPtr user_data);

    @Generated
    @CFunction
    public static native int instproxy_lookup(instproxy_client_t client,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] appids,
            plist_t client_options, Ptr<plist_t> result);

    @Generated
    @CFunction
    public static native int instproxy_check_capabilities_match(instproxy_client_t client,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] capabilities,
            plist_t client_options, Ptr<plist_t> result);

    @Generated
    @CFunction
    public static native void instproxy_command_get_name(plist_t command, Ptr<BytePtr> name);

    @Generated
    @CFunction
    public static native void instproxy_status_get_name(plist_t status, Ptr<BytePtr> name);

    @Generated
    @CFunction
    public static native int instproxy_status_get_error(plist_t status, Ptr<BytePtr> name, Ptr<BytePtr> description,
            LongPtr code);

    @Generated
    @CFunction
    public static native void instproxy_status_get_current_list(plist_t status, LongPtr total, LongPtr current_index,
            LongPtr current_amount, Ptr<plist_t> list);

    @Generated
    @CFunction
    public static native void instproxy_status_get_percent_complete(plist_t status, IntPtr percent);

    @Generated
    @Variadic()
    @CFunction
    public static native void instproxy_client_options_add(plist_t client_options, Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native void instproxy_client_options_set_return_attributes(plist_t client_options, Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native void mobilesync_actions_add(plist_t actions, Object... varargs);

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_idevice_event_subscribe {
        @Generated
        public void call_idevice_event_subscribe(
                @UncertainArgument("Options: reference, array Fallback: reference") idevice_event_t arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_instproxy_install {
        @Generated
        public void call_instproxy_install(plist_t arg0, plist_t arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_instproxy_upgrade {
        @Generated
        public void call_instproxy_upgrade(plist_t arg0, plist_t arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_instproxy_uninstall {
        @Generated
        public void call_instproxy_uninstall(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_instproxy_archive {
        @Generated
        public void call_instproxy_archive(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_instproxy_restore {
        @Generated
        public void call_instproxy_restore(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_instproxy_remove_archive {
        @Generated
        public void call_instproxy_remove_archive(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_mobile_image_mounter_upload_image {
        @Generated
        public long call_mobile_image_mounter_upload_image(VoidPtr arg0, long arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_np_set_notify_callback {
        @Generated
        public void call_np_set_notify_callback(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg0,
                VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_service_client_factory_start_service {
        @Generated
        public int call_service_client_factory_start_service(VoidPtr arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") lockdownd_service_descriptor arg1,
                Ptr<VoidPtr> arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_syslog_relay_start_capture {
        @Generated
        public void call_syslog_relay_start_capture(byte arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_instproxy_browse_with_callback {
        @Generated
        public void call_instproxy_browse_with_callback(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
    }
}
