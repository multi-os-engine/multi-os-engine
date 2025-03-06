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

package apple.c;

import apple.opaque.DNSRecordRef;
import apple.opaque.DNSServiceRef;
import apple.opaque.acl_entry_t;
import apple.opaque.acl_flagset_t;
import apple.opaque.acl_permset_t;
import apple.opaque.acl_t;
import apple.opaque.dispatch_source_type_t;
import apple.opaque.filesec_t;
import apple.opaque.os_workgroup_mpt_attr_t;
import apple.struct.FILE;
import apple.struct._RuneLocale;
import apple.struct._opaque_pthread_t;
import apple.struct.accessx_descriptor;
import apple.struct.audit_token_t;
import apple.struct.auditinfo;
import apple.struct.auditinfo_addr;
import apple.struct.cmsghdr;
import apple.struct.div_t;
import apple.struct.fd_set;
import apple.struct.imaxdiv_t;
import apple.struct.in_addr;
import apple.struct.iovec;
import apple.struct.itimerval;
import apple.struct.lconv;
import apple.struct.ldiv_t;
import apple.struct.lldiv_t;
import apple.struct.mach_header;
import apple.struct.mach_msg_header_t;
import apple.struct.msghdr;
import apple.struct.os_unfair_lock_s;
import apple.struct.os_workgroup_attr_opaque_s;
import apple.struct.os_workgroup_interval_data_opaque_s;
import apple.struct.os_workgroup_join_token_opaque_s;
import apple.struct.rlimit;
import apple.struct.rusage;
import apple.struct.sa_endpoints;
import apple.struct.security_token_t;
import apple.struct.sf_hdtr;
import apple.struct.sigvec;
import apple.struct.sockaddr;
import apple.struct.sockaddr_in;
import apple.struct.sockaddr_storage;
import apple.struct.stack_t;
import apple.struct.timespec;
import apple.struct.timeval;
import apple.struct.timezone;
import apple.struct.tm;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.c.map.CStringArrayMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.general.ptr.ConstLongPtr;
import org.moe.natj.general.ptr.ConstNIntPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.opaque.DNSServiceAttributeRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.opaque.dispatch_data_t;
import apple.opaque.dispatch_group_t;
import apple.opaque.dispatch_io_t;
import apple.opaque.dispatch_queue_attr_t;
import apple.opaque.dispatch_queue_t;
import apple.opaque.dispatch_semaphore_t;
import apple.opaque.dispatch_source_t;
import apple.opaque.os_log_t;
import apple.opaque.os_workgroup_t;
import apple.opaque.voucher_mach_msg_state_t;
import apple.opaque.xpc_connection_t;
import apple.opaque.xpc_endpoint_t;
import apple.opaque.xpc_rich_error_t;
import apple.opaque.xpc_session_t;
import apple.opaque.xpc_type_t;
import apple.struct.NDR_record_t;
import apple.struct.dyld_kernel_image_info;
import apple.struct.dyld_kernel_process_info;
import apple.struct.hash_info_bucket;
import apple.struct.ipc_info_name;
import apple.struct.ipc_info_port;
import apple.struct.ipc_info_space;
import apple.struct.ipc_info_space_basic;
import apple.struct.ipc_info_tree_name;
import apple.struct.lockgroup_info;
import apple.struct.mach_memory_info;
import apple.struct.mach_port_options;
import apple.struct.mach_service_port_info;
import apple.struct.mach_timespec;
import apple.struct.mach_zone_info_data;
import apple.struct.mach_zone_name;
import apple.struct.mig_reply_error_t;
import apple.struct.task_zone_info_data;
import apple.struct.vm_info_object;
import apple.struct.vm_info_region;
import apple.struct.vm_info_region_64;
import apple.struct.vm_purgeable_info;
import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.ptr.ConstDoublePtr;

@Generated
@Runtime(CRuntime.class)
public final class Globals {
    static {
        NatJ.register();
    }

    @Generated
    private Globals() {
    }

    /**
     * Generic byte swapping functions.
     */
    @Generated
    @Inline
    @CFunction
    public static native char _OSSwapInt16(char _data);

    @Generated
    @Inline
    @CFunction
    public static native int _OSSwapInt32(int _data);

    @Generated
    @Inline
    @CFunction
    public static native long _OSSwapInt64(long _data);

    @Generated
    @Inline
    @CFunction
    public static native char OSReadSwapInt16(ConstVoidPtr _base, @NUInt long _offset);

    @Generated
    @Inline
    @CFunction
    public static native int OSReadSwapInt32(ConstVoidPtr _base, @NUInt long _offset);

    @Generated
    @Inline
    @CFunction
    public static native long OSReadSwapInt64(ConstVoidPtr _base, @NUInt long _offset);

    @Generated
    @Inline
    @CFunction
    public static native void OSWriteSwapInt16(VoidPtr _base, @NUInt long _offset, char _data);

    @Generated
    @Inline
    @CFunction
    public static native void OSWriteSwapInt32(VoidPtr _base, @NUInt long _offset, int _data);

    @Generated
    @Inline
    @CFunction
    public static native void OSWriteSwapInt64(VoidPtr _base, @NUInt long _offset, long _data);

    /**
     * This inline avoids argument side-effect issues with FD_ISSET()
     */
    @Generated
    @Inline
    @CFunction
    public static native int __darwin_fd_isset(int _fd,
            @UncertainArgument("Options: reference, array Fallback: reference") fd_set _p);

    /**
     * Returns the name of the method specified by a given selector.
     * 
     * @param sel A pointer of type \c SEL. Pass the selector whose name you wish to determine.
     * 
     * @return A C string indicating the name of the selector.
     * 
     *         API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String sel_getName(@NotNull SEL sel);

    /**
     * Registers a method with the Objective-C runtime system, maps the method
     * name to a selector, and returns the selector value.
     * 
     * [@note] You must register a method name with the Objective-C runtime system to obtain the
     * method’s selector before you can add the method to a class definition. If the method name
     * has already been registered, this function simply returns the selector.
     * 
     * API-Since: 2.0
     * 
     * @param str A pointer to a C string. Pass the name of the method you wish to register.
     * 
     * @return A pointer of type SEL specifying the selector for the named method.
     */
    @NotNull
    @Generated
    @CFunction
    public static native SEL sel_registerName(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String str);

    /**
     * Returns the class name of a given object.
     * 
     * @param obj An Objective-C object.
     * 
     * @return The name of the class of which \e obj is an instance.
     * 
     *         API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String object_getClassName(@Nullable @Mapped(ObjCObjectMapper.class) Object obj);

    /**
     * Identifies a selector as being valid or invalid.
     * 
     * [@warning] On some platforms, an invalid reference (to invalid memory addresses) can cause
     * a crash.
     * 
     * API-Since: 2.0
     * 
     * @param sel The selector you want to identify.
     * 
     * @return YES if selector is valid and has a function implementation, NO otherwise.
     */
    @Generated
    @CFunction
    public static native boolean sel_isMapped(@NotNull SEL sel);

    /**
     * Registers a method name with the Objective-C runtime system.
     * 
     * [@note] The implementation of this method is identical to the implementation of \c sel_registerName.
     * [@note] Prior to OS X version 10.0, this method tried to find the selector mapped to the given name
     * and returned \c NULL if the selector was not found. This was changed for safety, because it was
     * observed that many of the callers of this function did not check the return value for \c NULL.
     * 
     * API-Since: 2.0
     * 
     * @param str A pointer to a C string. Pass the name of the method you wish to register.
     * 
     * @return A pointer of type SEL specifying the selector for the named method.
     */
    @NotNull
    @Generated
    @CFunction
    public static native SEL sel_getUid(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String str);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int getattrlistbulk(int arg1, VoidPtr arg2, VoidPtr arg3, @NUInt long arg4, long arg5);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int faccessat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            int arg4);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int fchownat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            int arg4, int arg5);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int linkat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4, int arg5);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long readlinkat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            BytePtr arg3, @NUInt long arg4);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int symlinkat(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int unlinkat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int getattrlistat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            VoidPtr arg3, VoidPtr arg4, @NUInt long arg5, @NUInt long arg6);

    /**
     * POSIX.1-1990
     */
    @Generated
    @CFunction
    public static native void _exit(int arg1);

    @Generated
    @CFunction
    public static native int access(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2);

    @Generated
    @CFunction
    public static native int alarm(int arg1);

    @Generated
    @CFunction
    public static native int chdir(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int chown(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2,
            int arg3);

    @Generated
    @CFunction
    public static native int close(int arg1);

    @Generated
    @CFunction
    public static native int dup(int arg1);

    @Generated
    @CFunction
    public static native int dup2(int arg1, int arg2);

    @Generated
    @Variadic()
    @CFunction
    public static native int execl(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __path,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __arg0,
            Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native int execle(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __path,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __arg0,
            Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native int execlp(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __file,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __arg0,
            Object... varargs);

    @Generated
    @CFunction
    public static native int execv(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __path,
            ConstPtr<BytePtr> __argv);

    @Generated
    @CFunction
    public static native int execve(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __file,
            ConstPtr<BytePtr> __argv, ConstPtr<BytePtr> __envp);

    @Generated
    @CFunction
    public static native int execvp(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __file,
            ConstPtr<BytePtr> __argv);

    @Generated
    @CFunction
    public static native int fork();

    @Generated
    @CFunction
    @NInt
    public static native long fpathconf(int arg1, int arg2);

    @Generated
    @CFunction
    public static native BytePtr getcwd(BytePtr arg1, @NUInt long arg2);

    @Generated
    @CFunction
    public static native int getegid();

    @Generated
    @CFunction
    public static native int geteuid();

    @Generated
    @CFunction
    public static native int getgid();

    @Generated
    @CFunction
    public static native int getgroups(int arg1, IntPtr arg2);

    @Generated
    @CFunction
    public static native BytePtr getlogin();

    @Generated
    @CFunction
    public static native int getpgrp();

    @Generated
    @CFunction
    public static native int getpid();

    @Generated
    @CFunction
    public static native int getppid();

    @Generated
    @CFunction
    public static native int getuid();

    @Generated
    @CFunction
    public static native int isatty(int arg1);

    @Generated
    @CFunction
    public static native int link(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native long lseek(int arg1, long arg2, int arg3);

    @Generated
    @CFunction
    @NInt
    public static native long pathconf(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2);

    @Generated
    @CFunction
    public static native int pause();

    @Generated
    @CFunction
    @NInt
    public static native long read(int arg1, VoidPtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native int rmdir(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int setgid(int arg1);

    @Generated
    @CFunction
    public static native int setpgid(int arg1, int arg2);

    @Generated
    @CFunction
    public static native int setsid();

    @Generated
    @CFunction
    public static native int setuid(int arg1);

    @Generated
    @CFunction
    public static native int sleep(int arg1);

    @Generated
    @CFunction
    @NInt
    public static native long sysconf(int arg1);

    @Generated
    @CFunction
    public static native int tcgetpgrp(int arg1);

    @Generated
    @CFunction
    public static native int tcsetpgrp(int arg1, int arg2);

    @Generated
    @CFunction
    public static native BytePtr ttyname(int arg1);

    @Generated
    @CFunction
    public static native int ttyname_r(int arg1, BytePtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native int unlink(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    @NInt
    public static native long write(int __fd, ConstVoidPtr __buf, @NUInt long __nbyte);

    @Generated
    @CFunction
    @NUInt
    public static native long confstr(int arg1, BytePtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native int getopt(int arg1, ConstPtr<BytePtr> arg2,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3);

    @Generated
    @CFunction
    public static native VoidPtr brk(ConstVoidPtr arg1);

    @Generated
    @CFunction
    public static native int chroot(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native BytePtr crypt(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native BytePtr ctermid(BytePtr arg1);

    @Generated
    @CFunction
    public static native void encrypt(BytePtr arg1, int arg2);

    @Generated
    @CFunction
    public static native int fchdir(int arg1);

    @Generated
    @CFunction
    @NInt
    public static native long gethostid();

    @Generated
    @CFunction
    public static native int getpgid(int arg1);

    @Generated
    @CFunction
    public static native int getsid(int arg1);

    @Generated
    @CFunction
    public static native int getdtablesize();

    @Generated
    @CFunction
    public static native int getpagesize();

    @Generated
    @CFunction
    public static native BytePtr getpass(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native BytePtr getwd(BytePtr arg1);

    @Generated
    @CFunction
    public static native int lchown(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2,
            int arg3);

    @Generated
    @CFunction
    public static native int lockf(int arg1, int arg2, long arg3);

    @Generated
    @CFunction
    public static native int nice(int arg1);

    @Generated
    @CFunction
    @NInt
    public static native long pread(int __fd, VoidPtr __buf, @NUInt long __nbyte, long __offset);

    @Generated
    @CFunction
    @NInt
    public static native long pwrite(int __fd, ConstVoidPtr __buf, @NUInt long __nbyte, long __offset);

    @Generated
    @CFunction
    public static native VoidPtr sbrk(int arg1);

    @Generated
    @CFunction
    public static native int setpgrp();

    @Generated
    @CFunction
    public static native int setregid(int arg1, int arg2);

    @Generated
    @CFunction
    public static native int setreuid(int arg1, int arg2);

    /**
     * SUS places swab() in unistd.h. It is listed here for source compatibility
     */
    @Generated
    @CFunction
    public static native void swab(ConstVoidPtr arg1, VoidPtr arg2, @NInt long arg3);

    @Generated
    @CFunction
    public static native void sync();

    @Generated
    @CFunction
    public static native int truncate(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, long arg2);

    @Generated
    @CFunction
    public static native int ualarm(int arg1, int arg2);

    @Generated
    @CFunction
    public static native int usleep(int arg1);

    @Generated
    @CFunction
    public static native int vfork();

    /**
     * End XSI
     */
    @Generated
    @CFunction
    public static native int fsync(int arg1);

    @Generated
    @CFunction
    public static native int ftruncate(int arg1, long arg2);

    @Generated
    @CFunction
    public static native int getlogin_r(BytePtr arg1, @NUInt long arg2);

    @Generated
    @CFunction
    public static native int fchown(int arg1, int arg2, int arg3);

    @Generated
    @CFunction
    public static native int gethostname(BytePtr arg1, @NUInt long arg2);

    @Generated
    @CFunction
    @NInt
    public static native long readlink(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            BytePtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native int setegid(int arg1);

    @Generated
    @CFunction
    public static native int seteuid(int arg1);

    @Generated
    @CFunction
    public static native int symlink(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native int pselect(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") fd_set arg2,
            @UncertainArgument("Options: reference, array Fallback: reference") fd_set arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") fd_set arg4,
            @UncertainArgument("Options: reference, array Fallback: reference") timespec arg5, ConstIntPtr arg6);

    @Generated
    @CFunction
    public static native int select(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") fd_set arg2,
            @UncertainArgument("Options: reference, array Fallback: reference") fd_set arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") fd_set arg4,
            @UncertainArgument("Options: reference, array Fallback: reference") timeval arg5);

    @Generated
    @CFunction
    public static native void _Exit(int arg1);

    @Generated
    @CFunction
    public static native int accessx_np(
            @UncertainArgument("Options: reference, array Fallback: reference") accessx_descriptor arg1,
            @NUInt long arg2, IntPtr arg3, int arg4);

    @Generated
    @CFunction
    public static native int acct(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int add_profil(BytePtr arg1, @NUInt long arg2, @NUInt long arg3, int arg4);

    @Generated
    @CFunction
    public static native void endusershell();

    @Generated
    @CFunction
    public static native int execvP(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __file,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __searchpath,
            ConstPtr<BytePtr> __argv);

    @Generated
    @CFunction
    public static native BytePtr fflagstostr(@NUInt long arg1);

    @Generated
    @CFunction
    public static native int getdomainname(BytePtr arg1, int arg2);

    @Generated
    @CFunction
    public static native int getgrouplist(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2,
            IntPtr arg3, IntPtr arg4);

    @Generated
    @CFunction
    public static native char getmode(ConstVoidPtr arg1, char arg2);

    @Generated
    @CFunction
    public static native int getpeereid(int arg1, IntPtr arg2, IntPtr arg3);

    @Generated
    @CFunction
    public static native BytePtr getusershell();

    @Generated
    @CFunction
    public static native int initgroups(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2);

    @Generated
    @CFunction
    public static native int issetugid();

    @Generated
    @CFunction
    public static native BytePtr mkdtemp(BytePtr arg1);

    @Generated
    @CFunction
    public static native int mknod(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, char arg2,
            int arg3);

    /**
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native int mkpath_np(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path, char omode);

    /**
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native int mkpathat_np(int dfd,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path, char omode);

    @Generated
    @CFunction
    public static native int mkstemp(BytePtr arg1);

    @Generated
    @CFunction
    public static native int mkstemps(BytePtr arg1, int arg2);

    @Generated
    @CFunction
    public static native BytePtr mktemp(BytePtr arg1);

    /**
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native int mkostemp(BytePtr path, int oflags);

    /**
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native int mkostemps(BytePtr path, int slen, int oflags);

    /**
     * Non-portable mkstemp that uses open_dprotected_np
     * 
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native int mkstemp_dprotected_np(BytePtr path, int dpclass, int dpflags);

    @Generated
    @CFunction
    public static native int nfssvc(int arg1, VoidPtr arg2);

    @Generated
    @CFunction
    public static native int profil(BytePtr arg1, @NUInt long arg2, @NUInt long arg3, int arg4);

    @Generated
    @CFunction
    public static native int pthread_setugid_np(int arg1, int arg2);

    @Generated
    @CFunction
    public static native int pthread_getugid_np(IntPtr arg1, IntPtr arg2);

    @Generated
    @CFunction
    public static native int reboot(int arg1);

    @Generated
    @CFunction
    public static native int revoke(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int rcmd(Ptr<BytePtr> arg1, int arg2,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg5,
            IntPtr arg6);

    @Generated
    @CFunction
    public static native int rcmd_af(Ptr<BytePtr> arg1, int arg2,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg5, IntPtr arg6,
            int arg7);

    @Generated
    @CFunction
    public static native int rresvport(IntPtr arg1);

    @Generated
    @CFunction
    public static native int rresvport_af(IntPtr arg1, int arg2);

    @Generated
    @CFunction
    public static native int iruserok(@NUInt long arg1, int arg2,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4);

    @Generated
    @CFunction
    public static native int iruserok_sa(ConstVoidPtr arg1, int arg2, int arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg5);

    @Generated
    @CFunction
    public static native int ruserok(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4);

    @Generated
    @CFunction
    public static native int setdomainname(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2);

    @Generated
    @CFunction
    public static native int setgroups(int arg1, ConstIntPtr arg2);

    @Generated
    @CFunction
    public static native void sethostid(@NInt long arg1);

    @Generated
    @CFunction
    public static native int sethostname(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2);

    @Generated
    @CFunction
    public static native void setkey(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int setlogin(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native VoidPtr setmode(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int setrgid(int arg1);

    @Generated
    @CFunction
    public static native int setruid(int arg1);

    @Generated
    @CFunction
    public static native void setusershell();

    @Generated
    @CFunction
    public static native int strtofflags(Ptr<BytePtr> arg1, NUIntPtr arg2, NUIntPtr arg3);

    @Generated
    @CFunction
    public static native int swapon(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int ttyslot();

    @Generated
    @CFunction
    public static native int undelete(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int unwhiteout(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native VoidPtr valloc(@NUInt long __size);

    /**
     * Deprecated-Since: 10.0
     * Deprecated-Message: syscall(2) is unsupported; please switch to a supported interface. For SYS_kdebug_trace use
     * kdebug_signpost().
     */
    @Deprecated
    @Generated
    @Variadic()
    @CFunction
    public static native int syscall(int arg1, Object... varargs);

    @Generated
    @CFunction
    public static native int getsubopt(Ptr<BytePtr> arg1, ConstPtr<BytePtr> arg2, Ptr<BytePtr> arg3);

    /**
     * API-Since: 3.0
     */
    @Generated
    @CFunction
    public static native int fgetattrlist(int arg1, VoidPtr arg2, VoidPtr arg3, @NUInt long arg4, int arg5);

    /**
     * API-Since: 3.0
     */
    @Generated
    @CFunction
    public static native int fsetattrlist(int arg1, VoidPtr arg2, VoidPtr arg3, @NUInt long arg4, int arg5);

    @Generated
    @CFunction
    public static native int getattrlist(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            VoidPtr arg2, VoidPtr arg3, @NUInt long arg4, int arg5);

    @Generated
    @CFunction
    public static native int setattrlist(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            VoidPtr arg2, VoidPtr arg3, @NUInt long arg4, int arg5);

    @Generated
    @CFunction
    public static native int exchangedata(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3);

    @Generated
    @CFunction
    public static native int getdirentriesattr(int arg1, VoidPtr arg2, VoidPtr arg3, @NUInt long arg4, IntPtr arg5,
            IntPtr arg6, IntPtr arg7, int arg8);

    @Generated
    @CFunction
    public static native int searchfs(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            VoidPtr arg2, NUIntPtr arg3, int arg4, int arg5, VoidPtr arg6);

    @Generated
    @CFunction
    public static native int fsctl(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @NUInt long arg2, VoidPtr arg3, int arg4);

    /**
     * API-Since: 3.0
     */
    @Generated
    @CFunction
    public static native int ffsctl(int arg1, @NUInt long arg2, VoidPtr arg3, int arg4);

    /**
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int fsync_volume_np(int arg1, int arg2);

    /**
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native int sync_volume_np(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2);

    @Generated
    @Variadic()
    @CFunction
    public static native int open(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2,
            Object... varargs);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Variadic()
    @CFunction
    public static native int openat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            Object... varargs);

    @Generated
    @CFunction
    public static native int creat(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, char arg2);

    @Generated
    @Variadic()
    @CFunction
    public static native int fcntl(int arg1, int arg2, Object... varargs);

    @Generated
    @CFunction
    public static native int openx_np(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2,
            filesec_t arg3);

    /**
     * data-protected non-portable open(2) :
     * int open_dprotected_np(user_addr_t path, int flags, int class, int dpflags, int mode)
     */
    @Generated
    @Variadic()
    @CFunction
    public static native int open_dprotected_np(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2,
            int arg3, int arg4, Object... varargs);

    @Generated
    @CFunction
    public static native int flock(int arg1, int arg2);

    @Generated
    @CFunction
    public static native filesec_t filesec_init();

    @Generated
    @CFunction
    public static native filesec_t filesec_dup(filesec_t arg1);

    @Generated
    @CFunction
    public static native void filesec_free(filesec_t arg1);

    @Generated
    @CFunction
    public static native int filesec_get_property(filesec_t arg1, int arg2, VoidPtr arg3);

    @Generated
    @CFunction
    public static native int filesec_query_property(filesec_t arg1, int arg2, IntPtr arg3);

    @Generated
    @CFunction
    public static native int filesec_set_property(filesec_t arg1, int arg2, ConstVoidPtr arg3);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native int filesec_unset_property(filesec_t arg1, int arg2);

    /**
     * [@function] os_retain
     * 
     * Increment the reference count of an os_object.
     * 
     * On a platform with the modern Objective-C runtime this is exactly equivalent
     * to sending the object the -[retain] message.
     * 
     * @param object
     *               The object to retain.
     * 
     * @return
     *         The retained object.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native VoidPtr os_retain(VoidPtr object);

    /**
     * [@function] os_release
     * 
     * Decrement the reference count of a os_object.
     * 
     * On a platform with the modern Objective-C runtime this is exactly equivalent
     * to sending the object the -[release] message.
     * 
     * @param object
     *               The object to release.
     * 
     *               API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native void os_release(VoidPtr object);

    /**
     * [@function] dispatch_time
     * 
     * Create a dispatch_time_t relative to the current value of the default or
     * wall time clock, or modify an existing dispatch_time_t.
     * 
     * On Apple platforms, the default clock is based on mach_absolute_time().
     * 
     * @param when
     *              An optional dispatch_time_t to add nanoseconds to. If DISPATCH_TIME_NOW is
     *              passed, then dispatch_time() will use the default clock (which is based on
     *              mach_absolute_time() on Apple platforms). If DISPATCH_WALLTIME_NOW is used,
     *              dispatch_time() will use the value returned by gettimeofday(3).
     *              dispatch_time(DISPATCH_WALLTIME_NOW, delta) is equivalent to
     *              dispatch_walltime(NULL, delta).
     * 
     * @param delta
     *              Nanoseconds to add.
     * 
     * @return
     *         A new dispatch_time_t.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native long dispatch_time(long when, long delta);

    /**
     * [@function] dispatch_walltime
     * 
     * Create a dispatch_time_t using the wall clock.
     * 
     * On Mac OS X the wall clock is based on gettimeofday(3).
     * 
     * @param when
     *              A struct timespec to add time to. If NULL is passed, then
     *              dispatch_walltime() will use the result of gettimeofday(3).
     *              dispatch_walltime(NULL, delta) returns the same value as
     *              dispatch_time(DISPATCH_WALLTIME_NOW, delta).
     * 
     * @param delta
     *              Nanoseconds to add.
     * 
     * @return
     *         A new dispatch_time_t.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native long dispatch_walltime(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") timespec when, long delta);

    /**
     * [@function] qos_class_self
     * 
     * Returns the requested QOS class of the current thread.
     * 
     * @return
     *         One of the QOS class values in qos_class_t.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int qos_class_self();

    /**
     * [@function] qos_class_main
     * 
     * Returns the initial requested QOS class of the main thread.
     * 
     * The QOS class that the main thread of a process is created with depends on
     * the type of process (e.g. application or daemon) and on how it has been
     * launched.
     * 
     * This function returns that initial requested QOS class value chosen by the
     * system to enable propagation of that classification to matching work not
     * executing on the main thread.
     * 
     * @return
     *         One of the QOS class values in qos_class_t.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int qos_class_main();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_async(@NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_async") Block_dispatch_async block);

    /**
     * [@function] dispatch_async_f
     * 
     * Submits a function for asynchronous execution on a dispatch queue.
     * 
     * See dispatch_async() for details.
     * 
     * @param queue
     *                The target dispatch queue to which the function is submitted.
     *                The system will hold a reference on the target queue until the function
     *                has returned.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param context
     *                The application-defined context parameter to pass to the function.
     * 
     * @param work
     *                The application-defined function to invoke on the target queue. The first
     *                parameter passed to this function is the context provided to
     *                dispatch_async_f().
     *                The result of passing NULL in this parameter is undefined.
     * 
     *                API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_async_f(@NotNull dispatch_queue_t queue, @Nullable VoidPtr context,
            @NotNull @FunctionPtr(name = "call_dispatch_async_f") Function_dispatch_async_f work);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_sync(@NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_sync") Block_dispatch_sync block);

    /**
     * [@function] dispatch_sync_f
     * 
     * Submits a function for synchronous execution on a dispatch queue.
     * 
     * See dispatch_sync() for details.
     * 
     * @param queue
     *                The target dispatch queue to which the function is submitted.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param context
     *                The application-defined context parameter to pass to the function.
     * 
     * @param work
     *                The application-defined function to invoke on the target queue. The first
     *                parameter passed to this function is the context provided to
     *                dispatch_sync_f().
     *                The result of passing NULL in this parameter is undefined.
     * 
     *                API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_sync_f(@NotNull dispatch_queue_t queue, @Nullable VoidPtr context,
            @NotNull @FunctionPtr(name = "call_dispatch_sync_f") Function_dispatch_sync_f work);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_apply(@NUInt long iterations, @NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_apply") Block_dispatch_apply block);

    /**
     * [@function] dispatch_apply_f
     * 
     * Submits a function to a dispatch queue for parallel invocation.
     * 
     * See dispatch_apply() for details.
     * 
     * @param iterations
     *                   The number of iterations to perform.
     * 
     * @param queue
     *                   The dispatch queue to which the function is submitted.
     *                   The preferred value to pass is DISPATCH_APPLY_AUTO to automatically use
     *                   a queue appropriate for the calling thread.
     * 
     * @param context
     *                   The application-defined context parameter to pass to the function.
     * 
     * @param work
     *                   The application-defined function to invoke on the specified queue. The first
     *                   parameter passed to this function is the context provided to
     *                   dispatch_apply_f(). The second parameter passed to this function is the
     *                   current index of iteration.
     *                   The result of passing NULL in this parameter is undefined.
     * 
     *                   API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_apply_f(@NUInt long iterations, @NotNull dispatch_queue_t queue,
            @Nullable VoidPtr context,
            @NotNull @FunctionPtr(name = "call_dispatch_apply_f") Function_dispatch_apply_f work);

    /**
     * [@function] dispatch_get_current_queue
     * 
     * Returns the queue on which the currently executing block is running.
     * 
     * Returns the queue on which the currently executing block is running.
     * 
     * When dispatch_get_current_queue() is called outside of the context of a
     * submitted block, it will return the default concurrent queue.
     * 
     * Recommended for debugging and logging purposes only:
     * The code must not make any assumptions about the queue returned, unless it
     * is one of the global queues or a queue the code has itself created.
     * The code must not assume that synchronous execution onto a queue is safe
     * from deadlock if that queue is not the one returned by
     * dispatch_get_current_queue().
     * 
     * When dispatch_get_current_queue() is called on the main thread, it may
     * or may not return the same value as dispatch_get_main_queue(). Comparing
     * the two is not a valid way to test whether code is executing on the
     * main thread (see dispatch_assert_queue() and dispatch_assert_queue_not()).
     * 
     * This function is deprecated and will be removed in a future release.
     * 
     * @return
     *         Returns the current queue.
     * 
     *         API-Since: 4.0
     *         Deprecated-Since: 6.0
     *         Deprecated-Message: unsupported interface
     */
    @NotNull
    @Generated
    @Deprecated
    @CFunction
    public static native dispatch_queue_t dispatch_get_current_queue();

    /**
     * [@function] dispatch_get_main_queue
     * 
     * Returns the default queue that is bound to the main thread.
     * 
     * In order to invoke blocks submitted to the main queue, the application must
     * call dispatch_main(), NSApplicationMain(), or use a CFRunLoop on the main
     * thread.
     * 
     * The main queue is meant to be used in application context to interact with
     * the main thread and the main runloop.
     * 
     * Because the main queue doesn't behave entirely like a regular serial queue,
     * it may have unwanted side-effects when used in processes that are not UI apps
     * (daemons). For such processes, the main queue should be avoided.
     * 
     * @see dispatch_queue_main_t
     * 
     * @return
     *         Returns the main queue. This queue is created automatically on behalf of
     *         the main thread before main() is called.
     */
    @NotNull
    @Generated
    @Inline
    @CFunction
    public static native dispatch_queue_t dispatch_get_main_queue();

    /**
     * [@function] dispatch_get_global_queue
     * 
     * Returns a well-known global concurrent queue of a given quality of service
     * class.
     * 
     * See dispatch_queue_global_t.
     * 
     * @param identifier
     *                   A quality of service class defined in qos_class_t or a priority defined in
     *                   dispatch_queue_priority_t.
     * 
     *                   It is recommended to use quality of service class values to identify the
     *                   well-known global concurrent queues:
     *                   - QOS_CLASS_USER_INTERACTIVE
     *                   - QOS_CLASS_USER_INITIATED
     *                   - QOS_CLASS_DEFAULT
     *                   - QOS_CLASS_UTILITY
     *                   - QOS_CLASS_BACKGROUND
     * 
     *                   The global concurrent queues may still be identified by their priority,
     *                   which map to the following QOS classes:
     *                   - DISPATCH_QUEUE_PRIORITY_HIGH: QOS_CLASS_USER_INITIATED
     *                   - DISPATCH_QUEUE_PRIORITY_DEFAULT: QOS_CLASS_DEFAULT
     *                   - DISPATCH_QUEUE_PRIORITY_LOW: QOS_CLASS_UTILITY
     *                   - DISPATCH_QUEUE_PRIORITY_BACKGROUND: QOS_CLASS_BACKGROUND
     * 
     * @param flags
     *                   Reserved for future use. Passing any value other than zero may result in
     *                   a NULL return value.
     * 
     * @return
     *         Returns the requested global queue or NULL if the requested global queue
     *         does not exist.
     * 
     *         API-Since: 4.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_queue_t dispatch_get_global_queue(@NInt long identifier, @NUInt long flags);

    /**
     * [@function] dispatch_queue_attr_make_initially_inactive
     * 
     * Returns an attribute value which may be provided to dispatch_queue_create()
     * or dispatch_queue_create_with_target(), in order to make the created queue
     * initially inactive.
     * 
     * Dispatch queues may be created in an inactive state. Queues in this state
     * have to be activated before any blocks associated with them will be invoked.
     * 
     * A queue in inactive state cannot be deallocated, dispatch_activate() must be
     * called before the last reference to a queue created with this attribute is
     * released.
     * 
     * The target queue of a queue in inactive state can be changed using
     * dispatch_set_target_queue(). Change of target queue is no longer permitted
     * once an initially inactive queue has been activated.
     * 
     * @param attr
     *             A queue attribute value to be combined with the initially inactive attribute.
     * 
     * @return
     *         Returns an attribute value which may be provided to dispatch_queue_create()
     *         and dispatch_queue_create_with_target().
     *         The new value combines the attributes specified by the 'attr' parameter with
     *         the initially inactive attribute.
     * 
     *         API-Since: 10.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_queue_attr_t dispatch_queue_attr_make_initially_inactive(
            @Nullable dispatch_queue_attr_t attr);

    /**
     * [@function] dispatch_queue_attr_make_with_autorelease_frequency
     * 
     * Returns a dispatch queue attribute value with the autorelease frequency
     * set to the specified value.
     * 
     * When a queue uses the per-workitem autorelease frequency (either directly
     * or inherited from its target queue), any block submitted asynchronously to
     * this queue (via dispatch_async(), dispatch_barrier_async(),
     * dispatch_group_notify(), etc...) is executed as if surrounded by a individual
     * Objective-C <code>@autoreleasepool</code> scope.
     * 
     * Autorelease frequency has no effect on blocks that are submitted
     * synchronously to a queue (via dispatch_sync(), dispatch_barrier_sync()).
     * 
     * The global concurrent queues have the DISPATCH_AUTORELEASE_FREQUENCY_NEVER
     * behavior. Manually created dispatch queues use
     * DISPATCH_AUTORELEASE_FREQUENCY_INHERIT by default.
     * 
     * Queues created with this attribute cannot change target queues after having
     * been activated. See dispatch_set_target_queue() and dispatch_activate().
     * 
     * @param attr
     *                  A queue attribute value to be combined with the specified autorelease
     *                  frequency or NULL.
     * 
     * @param frequency
     *                  The requested autorelease frequency.
     * 
     * @return
     *         Returns an attribute value which may be provided to dispatch_queue_create()
     *         or NULL if an invalid autorelease frequency was requested.
     *         This new value combines the attributes specified by the 'attr' parameter and
     *         the chosen autorelease frequency.
     * 
     *         API-Since: 10.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_queue_attr_t dispatch_queue_attr_make_with_autorelease_frequency(
            @Nullable dispatch_queue_attr_t attr, @NUInt long frequency);

    /**
     * [@function] dispatch_queue_attr_make_with_qos_class
     * 
     * Returns an attribute value which may be provided to dispatch_queue_create()
     * or dispatch_queue_create_with_target(), in order to assign a QOS class and
     * relative priority to the queue.
     * 
     * When specified in this manner, the QOS class and relative priority take
     * precedence over those inherited from the dispatch queue's target queue (if
     * any) as long that does not result in a lower QOS class and relative priority.
     * 
     * The global queue priorities map to the following QOS classes:
     * - DISPATCH_QUEUE_PRIORITY_HIGH: QOS_CLASS_USER_INITIATED
     * - DISPATCH_QUEUE_PRIORITY_DEFAULT: QOS_CLASS_DEFAULT
     * - DISPATCH_QUEUE_PRIORITY_LOW: QOS_CLASS_UTILITY
     * - DISPATCH_QUEUE_PRIORITY_BACKGROUND: QOS_CLASS_BACKGROUND
     * 
     * Example:
     * <code>
     * dispatch_queue_t queue;
     * dispatch_queue_attr_t attr;
     * attr = dispatch_queue_attr_make_with_qos_class(DISPATCH_QUEUE_SERIAL,
     * QOS_CLASS_UTILITY, 0);
     * queue = dispatch_queue_create("com.example.myqueue", attr);
     * </code>
     * 
     * The QOS class and relative priority set this way on a queue have no effect on
     * blocks that are submitted synchronously to a queue (via dispatch_sync(),
     * dispatch_barrier_sync()).
     * 
     * @param attr
     *                          A queue attribute value to be combined with the QOS class, or NULL.
     * 
     * @param qos_class
     *                          A QOS class value:
     *                          - QOS_CLASS_USER_INTERACTIVE
     *                          - QOS_CLASS_USER_INITIATED
     *                          - QOS_CLASS_DEFAULT
     *                          - QOS_CLASS_UTILITY
     *                          - QOS_CLASS_BACKGROUND
     *                          Passing any other value results in NULL being returned.
     * 
     * @param relative_priority
     *                          A relative priority within the QOS class. This value is a negative
     *                          offset from the maximum supported scheduler priority for the given class.
     *                          Passing a value greater than zero or less than QOS_MIN_RELATIVE_PRIORITY
     *                          results in NULL being returned.
     * 
     * @return
     *         Returns an attribute value which may be provided to dispatch_queue_create()
     *         and dispatch_queue_create_with_target(), or NULL if an invalid QOS class was
     *         requested.
     *         The new value combines the attributes specified by the 'attr' parameter and
     *         the new QOS class and relative priority.
     * 
     *         API-Since: 8.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_queue_attr_t dispatch_queue_attr_make_with_qos_class(
            @Nullable dispatch_queue_attr_t attr, int qos_class, int relative_priority);

    /**
     * [@function] dispatch_queue_create_with_target
     * 
     * Creates a new dispatch queue with a specified target queue.
     * 
     * Dispatch queues created with the DISPATCH_QUEUE_SERIAL or a NULL attribute
     * invoke blocks serially in FIFO order.
     * 
     * Dispatch queues created with the DISPATCH_QUEUE_CONCURRENT attribute may
     * invoke blocks concurrently (similarly to the global concurrent queues, but
     * potentially with more overhead), and support barrier blocks submitted with
     * the dispatch barrier API, which e.g. enables the implementation of efficient
     * reader-writer schemes.
     * 
     * When a dispatch queue is no longer needed, it should be released with
     * dispatch_release(). Note that any pending blocks submitted asynchronously to
     * a queue will hold a reference to that queue. Therefore a queue will not be
     * deallocated until all pending blocks have finished.
     * 
     * When using a dispatch queue attribute @a attr specifying a QoS class (derived
     * from the result of dispatch_queue_attr_make_with_qos_class()), passing the
     * result of dispatch_get_global_queue() in @a target will ignore the QoS class
     * of that global queue and will use the global queue with the QoS class
     * specified by attr instead.
     * 
     * Queues created with dispatch_queue_create_with_target() cannot have their
     * target queue changed, unless created inactive (See
     * dispatch_queue_attr_make_initially_inactive()), in which case the target
     * queue can be changed until the newly created queue is activated with
     * dispatch_activate().
     * 
     * @param label
     *               A string label to attach to the queue.
     *               This parameter is optional and may be NULL.
     * 
     * @param attr
     *               A predefined attribute such as DISPATCH_QUEUE_SERIAL,
     *               DISPATCH_QUEUE_CONCURRENT, or the result of a call to
     *               a dispatch_queue_attr_make_with_* function.
     * 
     * @param target
     *               The target queue for the newly created queue. The target queue is retained.
     *               If this parameter is DISPATCH_TARGET_QUEUE_DEFAULT, sets the queue's target
     *               queue to the default target queue for the given queue type.
     * 
     * @return
     *         The newly created dispatch queue.
     * 
     *         API-Since: 10.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_queue_t dispatch_queue_create_with_target(
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label,
            @Nullable dispatch_queue_attr_t attr, @Nullable dispatch_queue_t target);

    /**
     * [@function] dispatch_queue_create
     * 
     * Creates a new dispatch queue to which blocks may be submitted.
     * 
     * Dispatch queues created with the DISPATCH_QUEUE_SERIAL or a NULL attribute
     * invoke blocks serially in FIFO order.
     * 
     * Dispatch queues created with the DISPATCH_QUEUE_CONCURRENT attribute may
     * invoke blocks concurrently (similarly to the global concurrent queues, but
     * potentially with more overhead), and support barrier blocks submitted with
     * the dispatch barrier API, which e.g. enables the implementation of efficient
     * reader-writer schemes.
     * 
     * When a dispatch queue is no longer needed, it should be released with
     * dispatch_release(). Note that any pending blocks submitted asynchronously to
     * a queue will hold a reference to that queue. Therefore a queue will not be
     * deallocated until all pending blocks have finished.
     * 
     * Passing the result of the dispatch_queue_attr_make_with_qos_class() function
     * to the attr parameter of this function allows a quality of service class and
     * relative priority to be specified for the newly created queue.
     * The quality of service class so specified takes precedence over the quality
     * of service class of the newly created dispatch queue's target queue (if any)
     * as long that does not result in a lower QOS class and relative priority.
     * 
     * When no quality of service class is specified, the target queue of a newly
     * created dispatch queue is the default priority global concurrent queue.
     * 
     * Unless explicitly specified via the attribute, queues are created active.
     * 
     * @param label
     *              A string label to attach to the queue.
     *              This parameter is optional and may be NULL.
     * 
     * @param attr
     *              A predefined attribute such as DISPATCH_QUEUE_SERIAL,
     *              DISPATCH_QUEUE_CONCURRENT, or the result of a call to
     *              a dispatch_queue_attr_make_with_* function.
     * 
     * @return
     *         The newly created dispatch queue.
     * 
     *         API-Since: 4.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_queue_t dispatch_queue_create(
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label,
            @Nullable dispatch_queue_attr_t attr);

    /**
     * [@function] dispatch_queue_get_label
     * 
     * Returns the label of the given queue, as specified when the queue was
     * created, or the empty string if a NULL label was specified.
     * 
     * Passing DISPATCH_CURRENT_QUEUE_LABEL will return the label of the current
     * queue.
     * 
     * @param queue
     *              The queue to query, or DISPATCH_CURRENT_QUEUE_LABEL.
     * 
     * @return
     *         The label of the queue.
     * 
     *         API-Since: 4.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String dispatch_queue_get_label(@Nullable dispatch_queue_t queue);

    /**
     * [@function] dispatch_queue_get_qos_class
     * 
     * Returns the QOS class and relative priority of the given queue.
     * 
     * If the given queue was created with an attribute value returned from
     * dispatch_queue_attr_make_with_qos_class(), this function returns the QOS
     * class and relative priority specified at that time; for any other attribute
     * value it returns a QOS class of QOS_CLASS_UNSPECIFIED and a relative
     * priority of 0.
     * 
     * If the given queue is one of the global queues, this function returns its
     * assigned QOS class value as documented under dispatch_get_global_queue() and
     * a relative priority of 0; in the case of the main queue it returns the QOS
     * value provided by qos_class_main() and a relative priority of 0.
     * 
     * @param queue
     *                              The queue to query.
     * 
     * @param relative_priority_ptr
     *                              A pointer to an int variable to be filled with the relative priority offset
     *                              within the QOS class, or NULL.
     * 
     * @return
     *         A QOS class value:
     *         - QOS_CLASS_USER_INTERACTIVE
     *         - QOS_CLASS_USER_INITIATED
     *         - QOS_CLASS_DEFAULT
     *         - QOS_CLASS_UTILITY
     *         - QOS_CLASS_BACKGROUND
     *         - QOS_CLASS_UNSPECIFIED
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int dispatch_queue_get_qos_class(@NotNull dispatch_queue_t queue,
            @Nullable IntPtr relative_priority_ptr);

    /**
     * [@function] dispatch_main
     * 
     * Execute blocks submitted to the main queue.
     * 
     * This function "parks" the main thread and waits for blocks to be submitted
     * to the main queue. This function never returns.
     * 
     * Applications that call NSApplicationMain() or CFRunLoopRun() on the
     * main thread do not need to call dispatch_main().
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_main();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_after(long when, @NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_after") Block_dispatch_after block);

    /**
     * [@function] dispatch_after_f
     * 
     * Schedule a function for execution on a given queue at a specified time.
     * 
     * See dispatch_after() for details.
     * 
     * @param when
     *                A temporal milestone returned by dispatch_time() or dispatch_walltime().
     * 
     * @param queue
     *                A queue to which the given function will be submitted at the specified time.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param context
     *                The application-defined context parameter to pass to the function.
     * 
     * @param work
     *                The application-defined function to invoke on the target queue. The first
     *                parameter passed to this function is the context provided to
     *                dispatch_after_f().
     *                The result of passing NULL in this parameter is undefined.
     * 
     *                API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_after_f(long when, @NotNull dispatch_queue_t queue, @Nullable VoidPtr context,
            @NotNull @FunctionPtr(name = "call_dispatch_after_f") Function_dispatch_after_f work);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native void dispatch_barrier_async(@NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_barrier_async") Block_dispatch_barrier_async block);

    /**
     * [@function] dispatch_barrier_async_f
     * 
     * Submits a barrier function for asynchronous execution on a dispatch queue.
     * 
     * Submits a function to a dispatch queue like dispatch_async_f(), but marks
     * that function as a barrier (relevant only on DISPATCH_QUEUE_CONCURRENT
     * queues).
     * 
     * See dispatch_async_f() for details and "Dispatch Barrier API" for a
     * description of the barrier semantics.
     * 
     * @param queue
     *                The target dispatch queue to which the function is submitted.
     *                The system will hold a reference on the target queue until the function
     *                has returned.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param context
     *                The application-defined context parameter to pass to the function.
     * 
     * @param work
     *                The application-defined function to invoke on the target queue. The first
     *                parameter passed to this function is the context provided to
     *                dispatch_barrier_async_f().
     *                The result of passing NULL in this parameter is undefined.
     * 
     *                API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native void dispatch_barrier_async_f(@NotNull dispatch_queue_t queue, @Nullable VoidPtr context,
            @NotNull @FunctionPtr(name = "call_dispatch_barrier_async_f") Function_dispatch_barrier_async_f work);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native void dispatch_barrier_sync(@NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_barrier_sync") Block_dispatch_barrier_sync block);

    /**
     * [@function] dispatch_barrier_sync_f
     * 
     * Submits a barrier function for synchronous execution on a dispatch queue.
     * 
     * Submits a function to a dispatch queue like dispatch_sync_f(), but marks that
     * fuction as a barrier (relevant only on DISPATCH_QUEUE_CONCURRENT queues).
     * 
     * See dispatch_sync_f() for details.
     * 
     * @param queue
     *                The target dispatch queue to which the function is submitted.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param context
     *                The application-defined context parameter to pass to the function.
     * 
     * @param work
     *                The application-defined function to invoke on the target queue. The first
     *                parameter passed to this function is the context provided to
     *                dispatch_barrier_sync_f().
     *                The result of passing NULL in this parameter is undefined.
     * 
     *                API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native void dispatch_barrier_sync_f(@NotNull dispatch_queue_t queue, @Nullable VoidPtr context,
            @NotNull @FunctionPtr(name = "call_dispatch_barrier_sync_f") Function_dispatch_barrier_sync_f work);

    /**
     * [@function] dispatch_queue_set_specific
     * 
     * Associates a subsystem-specific context with a dispatch queue, for a key
     * unique to the subsystem.
     * 
     * The specified destructor will be invoked with the context on the default
     * priority global concurrent queue when a new context is set for the same key,
     * or after all references to the queue have been released.
     * 
     * @param queue
     *                   The dispatch queue to modify.
     *                   The result of passing NULL in this parameter is undefined.
     * 
     * @param key
     *                   The key to set the context for, typically a pointer to a static variable
     *                   specific to the subsystem. Keys are only compared as pointers and never
     *                   dereferenced. Passing a string constant directly is not recommended.
     *                   The NULL key is reserved and attempts to set a context for it are ignored.
     * 
     * @param context
     *                   The new subsystem-specific context for the object. This may be NULL.
     * 
     * @param destructor
     *                   The destructor function pointer. This may be NULL and is ignored if context
     *                   is NULL.
     * 
     *                   API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void dispatch_queue_set_specific(@NotNull dispatch_queue_t queue, @NotNull ConstVoidPtr key,
            @Nullable VoidPtr context,
            @Nullable @FunctionPtr(name = "call_dispatch_queue_set_specific") Function_dispatch_queue_set_specific destructor);

    /**
     * [@function] dispatch_queue_get_specific
     * 
     * Returns the subsystem-specific context associated with a dispatch queue, for
     * a key unique to the subsystem.
     * 
     * Returns the context for the specified key if it has been set on the specified
     * queue.
     * 
     * @param queue
     *              The dispatch queue to query.
     *              The result of passing NULL in this parameter is undefined.
     * 
     * @param key
     *              The key to get the context for, typically a pointer to a static variable
     *              specific to the subsystem. Keys are only compared as pointers and never
     *              dereferenced. Passing a string constant directly is not recommended.
     * 
     * @return
     *         The context for the specified key or NULL if no context was found.
     * 
     *         API-Since: 5.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native VoidPtr dispatch_queue_get_specific(@NotNull dispatch_queue_t queue,
            @NotNull ConstVoidPtr key);

    /**
     * [@function] dispatch_get_specific
     * 
     * Returns the current subsystem-specific context for a key unique to the
     * subsystem.
     * 
     * When called from a block executing on a queue, returns the context for the
     * specified key if it has been set on the queue, otherwise returns the result
     * of dispatch_get_specific() executed on the queue's target queue or NULL
     * if the current queue is a global concurrent queue.
     * 
     * @param key
     *            The key to get the context for, typically a pointer to a static variable
     *            specific to the subsystem. Keys are only compared as pointers and never
     *            dereferenced. Passing a string constant directly is not recommended.
     * 
     * @return
     *         The context for the specified key or NULL if no context was found.
     * 
     *         API-Since: 5.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native VoidPtr dispatch_get_specific(@NotNull ConstVoidPtr key);

    /**
     * [@function] dispatch_assert_queue
     * 
     * Verifies that the current block is executing on a given dispatch queue.
     * 
     * Some code expects to be run on a specific dispatch queue. This function
     * verifies that that expectation is true.
     * 
     * If the currently executing block was submitted to the specified queue or to
     * any queue targeting it (see dispatch_set_target_queue()), this function
     * returns.
     * 
     * If the currently executing block was submitted with a synchronous API
     * (dispatch_sync(), dispatch_barrier_sync(), ...), the context of the
     * submitting block is also evaluated (recursively).
     * If a synchronously submitting block is found that was itself submitted to
     * the specified queue or to any queue targeting it, this function returns.
     * 
     * Otherwise this function asserts: it logs an explanation to the system log and
     * terminates the application.
     * 
     * Passing the result of dispatch_get_main_queue() to this function verifies
     * that the current block was submitted to the main queue, or to a queue
     * targeting it, or is running on the main thread (in any context).
     * 
     * When dispatch_assert_queue() is called outside of the context of a
     * submitted block (for example from the context of a thread created manually
     * with pthread_create()) then this function will also assert and terminate
     * the application.
     * 
     * The variant dispatch_assert_queue_debug() is compiled out when the
     * preprocessor macro NDEBUG is defined. (See also assert(3)).
     * 
     * @param queue
     *              The dispatch queue that the current block is expected to run on.
     *              The result of passing NULL in this parameter is undefined.
     * 
     *              API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native void dispatch_assert_queue(@NotNull dispatch_queue_t queue);

    /**
     * [@function] dispatch_assert_queue_barrier
     * 
     * Verifies that the current block is executing on a given dispatch queue,
     * and that the block acts as a barrier on that queue.
     * 
     * This behaves exactly like dispatch_assert_queue(), with the additional check
     * that the current block acts as a barrier on the specified queue, which is
     * always true if the specified queue is serial (see DISPATCH_BLOCK_BARRIER or
     * dispatch_barrier_async() for details).
     * 
     * The variant dispatch_assert_queue_barrier_debug() is compiled out when the
     * preprocessor macro NDEBUG is defined. (See also assert()).
     * 
     * @param queue
     *              The dispatch queue that the current block is expected to run as a barrier on.
     *              The result of passing NULL in this parameter is undefined.
     * 
     *              API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native void dispatch_assert_queue_barrier(@NotNull dispatch_queue_t queue);

    /**
     * [@function] dispatch_assert_queue_not
     * 
     * Verifies that the current block is not executing on a given dispatch queue.
     * 
     * This function is the equivalent of dispatch_assert_queue() with the test for
     * equality inverted. That means that it will terminate the application when
     * dispatch_assert_queue() would return, and vice-versa. See discussion there.
     * 
     * The variant dispatch_assert_queue_not_debug() is compiled out when the
     * preprocessor macro NDEBUG is defined. (See also assert(3)).
     * 
     * @param queue
     *              The dispatch queue that the current block is expected not to run on.
     *              The result of passing NULL in this parameter is undefined.
     * 
     *              API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native void dispatch_assert_queue_not(@NotNull dispatch_queue_t queue);

    /**
     * [@function] dispatch_block_create
     * 
     * Create a new dispatch block object on the heap from an existing block and
     * the given flags.
     * 
     * The provided block is Block_copy'ed to the heap and retained by the newly
     * created dispatch block object.
     * 
     * The returned dispatch block object is intended to be submitted to a dispatch
     * queue with dispatch_async() and related functions, but may also be invoked
     * directly. Both operations can be performed an arbitrary number of times but
     * only the first completed execution of a dispatch block object can be waited
     * on with dispatch_block_wait() or observed with dispatch_block_notify().
     * 
     * If the returned dispatch block object is submitted to a dispatch queue, the
     * submitted block instance will be associated with the QOS class current at the
     * time of submission, unless one of the following flags assigned a specific QOS
     * class (or no QOS class) at the time of block creation:
     * - DISPATCH_BLOCK_ASSIGN_CURRENT
     * - DISPATCH_BLOCK_NO_QOS_CLASS
     * - DISPATCH_BLOCK_DETACHED
     * The QOS class the block object will be executed with also depends on the QOS
     * class assigned to the queue and which of the following flags was specified or
     * defaulted to:
     * - DISPATCH_BLOCK_INHERIT_QOS_CLASS (default for asynchronous execution)
     * - DISPATCH_BLOCK_ENFORCE_QOS_CLASS (default for synchronous execution)
     * See description of dispatch_block_flags_t for details.
     * 
     * If the returned dispatch block object is submitted directly to a serial queue
     * and is configured to execute with a specific QOS class, the system will make
     * a best effort to apply the necessary QOS overrides to ensure that blocks
     * submitted earlier to the serial queue are executed at that same QOS class or
     * higher.
     * 
     * @param flags
     *              Configuration flags for the block object.
     *              Passing a value that is not a bitwise OR of flags from dispatch_block_flags_t
     *              results in NULL being returned.
     * 
     * @param block
     *              The block to create the dispatch block object from.
     * 
     * @return
     *         The newly created dispatch block object, or NULL.
     *         When not building with Objective-C ARC, must be released with a -[release]
     *         message or the Block_release() function.
     * 
     *         API-Since: 8.0
     */
    @NotNull
    @Generated
    @CFunction
    @ObjCBlock(name = "call_dispatch_block_create_ret")
    public static native Block_dispatch_block_create_ret dispatch_block_create(@NUInt long flags,
            @NotNull @ObjCBlock(name = "call_dispatch_block_create") Block_dispatch_block_create block);

    /**
     * [@function] dispatch_block_create_with_qos_class
     * 
     * Create a new dispatch block object on the heap from an existing block and
     * the given flags, and assign it the specified QOS class and relative priority.
     * 
     * The provided block is Block_copy'ed to the heap and retained by the newly
     * created dispatch block object.
     * 
     * The returned dispatch block object is intended to be submitted to a dispatch
     * queue with dispatch_async() and related functions, but may also be invoked
     * directly. Both operations can be performed an arbitrary number of times but
     * only the first completed execution of a dispatch block object can be waited
     * on with dispatch_block_wait() or observed with dispatch_block_notify().
     * 
     * If invoked directly, the returned dispatch block object will be executed with
     * the assigned QOS class as long as that does not result in a lower QOS class
     * than what is current on the calling thread.
     * 
     * If the returned dispatch block object is submitted to a dispatch queue, the
     * QOS class it will be executed with depends on the QOS class assigned to the
     * block, the QOS class assigned to the queue and which of the following flags
     * was specified or defaulted to:
     * - DISPATCH_BLOCK_INHERIT_QOS_CLASS: default for asynchronous execution
     * - DISPATCH_BLOCK_ENFORCE_QOS_CLASS: default for synchronous execution
     * See description of dispatch_block_flags_t for details.
     * 
     * If the returned dispatch block object is submitted directly to a serial queue
     * and is configured to execute with a specific QOS class, the system will make
     * a best effort to apply the necessary QOS overrides to ensure that blocks
     * submitted earlier to the serial queue are executed at that same QOS class or
     * higher.
     * 
     * @param flags
     *                          Configuration flags for the new block object.
     *                          Passing a value that is not a bitwise OR of flags from dispatch_block_flags_t
     *                          results in NULL being returned.
     * 
     * @param qos_class
     *                          A QOS class value:
     *                          - QOS_CLASS_USER_INTERACTIVE
     *                          - QOS_CLASS_USER_INITIATED
     *                          - QOS_CLASS_DEFAULT
     *                          - QOS_CLASS_UTILITY
     *                          - QOS_CLASS_BACKGROUND
     *                          - QOS_CLASS_UNSPECIFIED
     *                          Passing QOS_CLASS_UNSPECIFIED is equivalent to specifying the
     *                          DISPATCH_BLOCK_NO_QOS_CLASS flag. Passing any other value results in NULL
     *                          being returned.
     * 
     * @param relative_priority
     *                          A relative priority within the QOS class. This value is a negative
     *                          offset from the maximum supported scheduler priority for the given class.
     *                          Passing a value greater than zero or less than QOS_MIN_RELATIVE_PRIORITY
     *                          results in NULL being returned.
     * 
     * @param block
     *                          The block to create the dispatch block object from.
     * 
     * @return
     *         The newly created dispatch block object, or NULL.
     *         When not building with Objective-C ARC, must be released with a -[release]
     *         message or the Block_release() function.
     * 
     *         API-Since: 8.0
     */
    @NotNull
    @Generated
    @CFunction
    @ObjCBlock(name = "call_dispatch_block_create_with_qos_class_ret")
    public static native Block_dispatch_block_create_with_qos_class_ret dispatch_block_create_with_qos_class(
            @NUInt long flags, int qos_class, int relative_priority,
            @NotNull @ObjCBlock(name = "call_dispatch_block_create_with_qos_class") Block_dispatch_block_create_with_qos_class block);

    /**
     * [@function] dispatch_block_perform
     * 
     * Create, synchronously execute and release a dispatch block object from the
     * specified block and flags.
     * 
     * Behaves identically to the sequence
     * <code>
     * dispatch_block_t b = dispatch_block_create(flags, block);
     * b();
     * Block_release(b);
     * </code>
     * but may be implemented more efficiently internally by not requiring a copy
     * to the heap of the specified block or the allocation of a new block object.
     * 
     * @param flags
     *              Configuration flags for the temporary block object.
     *              The result of passing a value that is not a bitwise OR of flags from
     *              dispatch_block_flags_t is undefined.
     * 
     * @param block
     *              The block to create the temporary block object from.
     * 
     *              API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native void dispatch_block_perform(@NUInt long flags,
            @NotNull @ObjCBlock(name = "call_dispatch_block_perform") Block_dispatch_block_perform block);

    /**
     * [@function] dispatch_block_wait
     * 
     * Wait synchronously until execution of the specified dispatch block object has
     * completed or until the specified timeout has elapsed.
     * 
     * This function will return immediately if execution of the block object has
     * already completed.
     * 
     * It is not possible to wait for multiple executions of the same block object
     * with this interface; use dispatch_group_wait() for that purpose. A single
     * dispatch block object may either be waited on once and executed once,
     * or it may be executed any number of times. The behavior of any other
     * combination is undefined. Submission to a dispatch queue counts as an
     * execution, even if cancellation (dispatch_block_cancel) means the block's
     * code never runs.
     * 
     * The result of calling this function from multiple threads simultaneously
     * with the same dispatch block object is undefined, but note that doing so
     * would violate the rules described in the previous paragraph.
     * 
     * If this function returns indicating that the specified timeout has elapsed,
     * then that invocation does not count as the one allowed wait.
     * 
     * If at the time this function is called, the specified dispatch block object
     * has been submitted directly to a serial queue, the system will make a best
     * effort to apply the necessary QOS overrides to ensure that the block and any
     * blocks submitted earlier to that serial queue are executed at the QOS class
     * (or higher) of the thread calling dispatch_block_wait().
     * 
     * @param block
     *                The dispatch block object to wait on.
     *                The result of passing NULL or a block object not returned by one of the
     *                dispatch_block_create* functions is undefined.
     * 
     * @param timeout
     *                When to timeout (see dispatch_time). As a convenience, there are the
     *                DISPATCH_TIME_NOW and DISPATCH_TIME_FOREVER constants.
     * 
     * @return
     *         Returns zero on success (the dispatch block object completed within the
     *         specified timeout) or non-zero on error (i.e. timed out).
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long dispatch_block_wait(
            @NotNull @ObjCBlock(name = "call_dispatch_block_wait") Block_dispatch_block_wait block, long timeout);

    /**
     * [@function] dispatch_block_notify
     * 
     * Schedule a notification block to be submitted to a queue when the execution
     * of a specified dispatch block object has completed.
     * 
     * This function will submit the notification block immediately if execution of
     * the observed block object has already completed.
     * 
     * It is not possible to be notified of multiple executions of the same block
     * object with this interface, use dispatch_group_notify() for that purpose.
     * 
     * A single dispatch block object may either be observed one or more times
     * and executed once, or it may be executed any number of times. The behavior
     * of any other combination is undefined. Submission to a dispatch queue
     * counts as an execution, even if cancellation (dispatch_block_cancel) means
     * the block's code never runs.
     * 
     * If multiple notification blocks are scheduled for a single block object,
     * there is no defined order in which the notification blocks will be submitted
     * to their associated queues.
     * 
     * @param block
     *                           The dispatch block object to observe.
     *                           The result of passing NULL or a block object not returned by one of the
     *                           dispatch_block_create* functions is undefined.
     * 
     * @param queue
     *                           The queue to which the supplied notification block will be submitted when
     *                           the observed block completes.
     * 
     * @param notification_block
     *                           The notification block to submit when the observed block object completes.
     * 
     *                           API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native void dispatch_block_notify(
            @NotNull @ObjCBlock(name = "call_dispatch_block_notify_0") Block_dispatch_block_notify_0 block,
            @NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_block_notify_2") Block_dispatch_block_notify_2 notification_block);

    /**
     * [@function] dispatch_block_cancel
     * 
     * Asynchronously cancel the specified dispatch block object.
     * 
     * Cancellation causes any future execution of the dispatch block object to
     * return immediately, but does not affect any execution of the block object
     * that is already in progress.
     * 
     * Release of any resources associated with the block object will be delayed
     * until execution of the block object is next attempted (or any execution
     * already in progress completes).
     * 
     * NOTE: care needs to be taken to ensure that a block object that may be
     * canceled does not capture any resources that require execution of the
     * block body in order to be released (e.g. memory allocated with
     * malloc(3) that the block body calls free(3) on). Such resources will
     * be leaked if the block body is never executed due to cancellation.
     * 
     * @param block
     *              The dispatch block object to cancel.
     *              The result of passing NULL or a block object not returned by one of the
     *              dispatch_block_create* functions is undefined.
     * 
     *              API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native void dispatch_block_cancel(
            @NotNull @ObjCBlock(name = "call_dispatch_block_cancel") Block_dispatch_block_cancel block);

    /**
     * [@function] dispatch_block_testcancel
     * 
     * Tests whether the given dispatch block object has been canceled.
     * 
     * @param block
     *              The dispatch block object to test.
     *              The result of passing NULL or a block object not returned by one of the
     *              dispatch_block_create* functions is undefined.
     * 
     * @return
     *         Non-zero if canceled and zero if not canceled.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long dispatch_block_testcancel(
            @NotNull @ObjCBlock(name = "call_dispatch_block_testcancel") Block_dispatch_block_testcancel block);

    /**
     * Routine: mach_msg_overwrite
     * Purpose:
     * Send and/or receive a message. If the message operation
     * is interrupted, and the user did not request an indication
     * of that fact, then restart the appropriate parts of the
     * operation silently (trap version does not restart).
     * 
     * Distinct send and receive buffers may be specified. If
     * no separate receive buffer is specified, the msg parameter
     * will be used for both send and receive operations.
     * 
     * In addition to a distinct receive buffer, that buffer may
     * already contain scatter control information to direct the
     * receiving of the message.
     */
    @Generated
    @CFunction
    public static native int mach_msg_overwrite(
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t msg, int option,
            int send_size, int rcv_size, int rcv_name, int timeout, int notify_,
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t rcv_msg,
            int rcv_limit);

    /**
     * Routine: mach_msg
     * Purpose:
     * Send and/or receive a message. If the message operation
     * is interrupted, and the user did not request an indication
     * of that fact, then restart the appropriate parts of the
     * operation silently (trap version does not restart).
     */
    @Generated
    @CFunction
    public static native int mach_msg(
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t msg, int option,
            int send_size, int rcv_size, int rcv_name, int timeout, int notify_);

    /**
     * Routine: mach_voucher_deallocate
     * Purpose:
     * Deallocate a mach voucher created or received in a message. Drops
     * one (send right) reference to the voucher.
     */
    @Generated
    @CFunction
    public static native int mach_voucher_deallocate(int voucher);

    /**
     * For historical reasons; programs expect signal's return value to be
     * defined by <sys/signal.h>.
     */
    @Generated
    @CFunction
    @FunctionPtr(name = "call_signal_ret")
    public static native Function_signal_ret signal(int arg1, @FunctionPtr(name = "call_signal") Function_signal arg2);

    /**
     * [@function] dispatch_source_create
     * 
     * Creates a new dispatch source to monitor low-level system objects and auto-
     * matically submit a handler block to a dispatch queue in response to events.
     * 
     * Dispatch sources are not reentrant. Any events received while the dispatch
     * source is suspended or while the event handler block is currently executing
     * will be coalesced and delivered after the dispatch source is resumed or the
     * event handler block has returned.
     * 
     * Dispatch sources are created in an inactive state. After creating the
     * source and setting any desired attributes (i.e. the handler, context, etc.),
     * a call must be made to dispatch_activate() in order to begin event delivery.
     * 
     * A source must have been activated before being disposed.
     * 
     * Calling dispatch_set_target_queue() on a source once it has been activated
     * is not allowed (see dispatch_activate() and dispatch_set_target_queue()).
     * 
     * For backward compatibility reasons, dispatch_resume() on an inactive,
     * and not otherwise suspended source has the same effect as calling
     * dispatch_activate(). For new code, using dispatch_activate() is preferred.
     * 
     * @param type
     *               Declares the type of the dispatch source. Must be one of the defined
     *               dispatch_source_type_t constants.
     * 
     * @param handle
     *               The underlying system handle to monitor. The interpretation of this argument
     *               is determined by the constant provided in the type parameter.
     * 
     * @param mask
     *               A mask of flags specifying which events are desired. The interpretation of
     *               this argument is determined by the constant provided in the type parameter.
     * 
     * @param queue
     *               The dispatch queue to which the event handler block will be submitted.
     *               If queue is DISPATCH_TARGET_QUEUE_DEFAULT, the source will submit the event
     *               handler block to the default priority global queue.
     * 
     * @return
     *         The newly created dispatch source. Or NULL if invalid arguments are passed.
     * 
     *         API-Since: 4.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_source_t dispatch_source_create(@NotNull dispatch_source_type_t type,
            @NUInt long handle, @NUInt long mask, @Nullable dispatch_queue_t queue);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_source_set_event_handler(@NotNull dispatch_source_t source,
            @Nullable @ObjCBlock(name = "call_dispatch_source_set_event_handler") Block_dispatch_source_set_event_handler handler);

    /**
     * [@function] dispatch_source_set_event_handler_f
     * 
     * Sets the event handler function for the given dispatch source.
     * 
     * @param source
     *                The dispatch source to modify.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param handler
     *                The event handler function to submit to the source's target queue.
     *                The context parameter passed to the event handler function is the context of
     *                the dispatch source current at the time the event handler was set.
     * 
     *                API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_source_set_event_handler_f(@NotNull dispatch_source_t source,
            @Nullable @FunctionPtr(name = "call_dispatch_source_set_event_handler_f") Function_dispatch_source_set_event_handler_f handler);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_source_set_cancel_handler(@NotNull dispatch_source_t source,
            @Nullable @ObjCBlock(name = "call_dispatch_source_set_cancel_handler") Block_dispatch_source_set_cancel_handler handler);

    /**
     * [@function] dispatch_source_set_cancel_handler_f
     * 
     * Sets the cancellation handler function for the given dispatch source.
     * 
     * See dispatch_source_set_cancel_handler() for more details.
     * 
     * @param source
     *                The dispatch source to modify.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param handler
     *                The cancellation handler function to submit to the source's target queue.
     *                The context parameter passed to the event handler function is the current
     *                context of the dispatch source at the time the handler call is made.
     * 
     *                API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_source_set_cancel_handler_f(@NotNull dispatch_source_t source,
            @Nullable @FunctionPtr(name = "call_dispatch_source_set_cancel_handler_f") Function_dispatch_source_set_cancel_handler_f handler);

    /**
     * [@function] dispatch_source_cancel
     * 
     * Asynchronously cancel the dispatch source, preventing any further invocation
     * of its event handler block.
     * 
     * Cancellation prevents any further invocation of the event handler block for
     * the specified dispatch source, but does not interrupt an event handler
     * block that is already in progress.
     * 
     * The cancellation handler is submitted to the source's target queue once the
     * the source's event handler has finished, indicating it is now safe to close
     * the source's handle (i.e. file descriptor or mach port).
     * 
     * See dispatch_source_set_cancel_handler() for more information.
     * 
     * @param source
     *               The dispatch source to be canceled.
     *               The result of passing NULL in this parameter is undefined.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_source_cancel(@NotNull dispatch_source_t source);

    /**
     * [@function] dispatch_source_testcancel
     * 
     * Tests whether the given dispatch source has been canceled.
     * 
     * @param source
     *               The dispatch source to be tested.
     *               The result of passing NULL in this parameter is undefined.
     * 
     * @return
     *         Non-zero if canceled and zero if not canceled.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long dispatch_source_testcancel(@NotNull dispatch_source_t source);

    /**
     * [@function] dispatch_source_get_handle
     * 
     * Returns the underlying system handle associated with this dispatch source.
     * 
     * @param source
     *               The result of passing NULL in this parameter is undefined.
     * 
     * @return
     *         The return value should be interpreted according to the type of the dispatch
     *         source, and may be one of the following handles:
     * 
     *         DISPATCH_SOURCE_TYPE_DATA_ADD: n/a
     *         DISPATCH_SOURCE_TYPE_DATA_OR: n/a
     *         DISPATCH_SOURCE_TYPE_DATA_REPLACE: n/a
     *         DISPATCH_SOURCE_TYPE_MACH_SEND: mach port (mach_port_t)
     *         DISPATCH_SOURCE_TYPE_MACH_RECV: mach port (mach_port_t)
     *         DISPATCH_SOURCE_TYPE_MEMORYPRESSURE n/a
     *         DISPATCH_SOURCE_TYPE_PROC: process identifier (pid_t)
     *         DISPATCH_SOURCE_TYPE_READ: file descriptor (int)
     *         DISPATCH_SOURCE_TYPE_SIGNAL: signal number (int)
     *         DISPATCH_SOURCE_TYPE_TIMER: n/a
     *         DISPATCH_SOURCE_TYPE_VNODE: file descriptor (int)
     *         DISPATCH_SOURCE_TYPE_WRITE: file descriptor (int)
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long dispatch_source_get_handle(@NotNull dispatch_source_t source);

    /**
     * [@function] dispatch_source_get_mask
     * 
     * Returns the mask of events monitored by the dispatch source.
     * 
     * @param source
     *               The result of passing NULL in this parameter is undefined.
     * 
     * @return
     *         The return value should be interpreted according to the type of the dispatch
     *         source, and may be one of the following flag sets:
     * 
     *         DISPATCH_SOURCE_TYPE_DATA_ADD: n/a
     *         DISPATCH_SOURCE_TYPE_DATA_OR: n/a
     *         DISPATCH_SOURCE_TYPE_DATA_REPLACE: n/a
     *         DISPATCH_SOURCE_TYPE_MACH_SEND: dispatch_source_mach_send_flags_t
     *         DISPATCH_SOURCE_TYPE_MACH_RECV: dispatch_source_mach_recv_flags_t
     *         DISPATCH_SOURCE_TYPE_MEMORYPRESSURE dispatch_source_memorypressure_flags_t
     *         DISPATCH_SOURCE_TYPE_PROC: dispatch_source_proc_flags_t
     *         DISPATCH_SOURCE_TYPE_READ: n/a
     *         DISPATCH_SOURCE_TYPE_SIGNAL: n/a
     *         DISPATCH_SOURCE_TYPE_TIMER: dispatch_source_timer_flags_t
     *         DISPATCH_SOURCE_TYPE_VNODE: dispatch_source_vnode_flags_t
     *         DISPATCH_SOURCE_TYPE_WRITE: n/a
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long dispatch_source_get_mask(@NotNull dispatch_source_t source);

    /**
     * [@function] dispatch_source_get_data
     * 
     * Returns pending data for the dispatch source.
     * 
     * This function is intended to be called from within the event handler block.
     * The result of calling this function outside of the event handler callback is
     * undefined.
     * 
     * @param source
     *               The result of passing NULL in this parameter is undefined.
     * 
     * @return
     *         The return value should be interpreted according to the type of the dispatch
     *         source, and may be one of the following:
     * 
     *         DISPATCH_SOURCE_TYPE_DATA_ADD: application defined data
     *         DISPATCH_SOURCE_TYPE_DATA_OR: application defined data
     *         DISPATCH_SOURCE_TYPE_DATA_REPLACE: application defined data
     *         DISPATCH_SOURCE_TYPE_MACH_SEND: dispatch_source_mach_send_flags_t
     *         DISPATCH_SOURCE_TYPE_MACH_RECV: dispatch_source_mach_recv_flags_t
     *         DISPATCH_SOURCE_TYPE_MEMORYPRESSURE dispatch_source_memorypressure_flags_t
     *         DISPATCH_SOURCE_TYPE_PROC: dispatch_source_proc_flags_t
     *         DISPATCH_SOURCE_TYPE_READ: estimated bytes available to read
     *         DISPATCH_SOURCE_TYPE_SIGNAL: number of signals delivered since
     *         the last handler invocation
     *         DISPATCH_SOURCE_TYPE_TIMER: number of times the timer has fired
     *         since the last handler invocation
     *         DISPATCH_SOURCE_TYPE_VNODE: dispatch_source_vnode_flags_t
     *         DISPATCH_SOURCE_TYPE_WRITE: estimated buffer space available
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long dispatch_source_get_data(@NotNull dispatch_source_t source);

    /**
     * [@function] dispatch_source_merge_data
     * 
     * Merges data into a dispatch source of type DISPATCH_SOURCE_TYPE_DATA_ADD,
     * DISPATCH_SOURCE_TYPE_DATA_OR or DISPATCH_SOURCE_TYPE_DATA_REPLACE,
     * and submits its event handler block to its target queue.
     * 
     * @param source
     *               The result of passing NULL in this parameter is undefined.
     * 
     * @param value
     *               The value to coalesce with the pending data using a logical OR or an ADD
     *               as specified by the dispatch source type. A value of zero has no effect
     *               and will not result in the submission of the event handler block.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_source_merge_data(@NotNull dispatch_source_t source, @NUInt long value);

    /**
     * [@function] dispatch_source_set_timer
     * 
     * Sets a start time, interval, and leeway value for a timer source.
     * 
     * Once this function returns, any pending source data accumulated for the
     * previous timer values has been cleared; the next fire of the timer will
     * occur at 'start', and every 'interval' nanoseconds thereafter until the
     * timer source is canceled.
     * 
     * Any fire of the timer may be delayed by the system in order to improve power
     * consumption and system performance. The upper limit to the allowable delay
     * may be configured with the 'leeway' argument, the lower limit is under the
     * control of the system.
     * 
     * For the initial timer fire at 'start', the upper limit to the allowable
     * delay is set to 'leeway' nanoseconds. For the subsequent timer fires at
     * 'start' + N * 'interval', the upper limit is MIN('leeway','interval'/2).
     * 
     * The lower limit to the allowable delay may vary with process state such as
     * visibility of application UI. If the specified timer source was created with
     * a mask of DISPATCH_TIMER_STRICT, the system will make a best effort to
     * strictly observe the provided 'leeway' value even if it is smaller than the
     * current lower limit. Note that a minimal amount of delay is to be expected
     * even if this flag is specified.
     * 
     * The 'start' argument also determines which clock will be used for the timer:
     * If 'start' is DISPATCH_TIME_NOW or was created with dispatch_time(3), the
     * timer is based on up time (which is obtained from mach_absolute_time() on
     * Apple platforms). If 'start' was created with dispatch_walltime(3), the
     * timer is based on gettimeofday(3).
     * 
     * Calling this function has no effect if the timer source has already been
     * canceled.
     * 
     * @param start
     *                 The start time of the timer. See dispatch_time() and dispatch_walltime()
     *                 for more information.
     * 
     * @param interval
     *                 The nanosecond interval for the timer. Use DISPATCH_TIME_FOREVER for a
     *                 one-shot timer.
     * 
     * @param leeway
     *                 The nanosecond leeway for the timer.
     * 
     *                 API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_source_set_timer(@NotNull dispatch_source_t source, long start, long interval,
            long leeway);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native void dispatch_source_set_registration_handler(@NotNull dispatch_source_t source,
            @Nullable @ObjCBlock(name = "call_dispatch_source_set_registration_handler") Block_dispatch_source_set_registration_handler handler);

    /**
     * [@function] dispatch_source_set_registration_handler_f
     * 
     * Sets the registration handler function for the given dispatch source.
     * 
     * See dispatch_source_set_registration_handler() for more details.
     * 
     * @param source
     *                The dispatch source to modify.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param handler
     *                The registration handler function to submit to the source's target queue.
     *                The context parameter passed to the registration handler function is the
     *                current context of the dispatch source at the time the handler call is made.
     * 
     *                API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native void dispatch_source_set_registration_handler_f(@NotNull dispatch_source_t source,
            @Nullable @FunctionPtr(name = "call_dispatch_source_set_registration_handler_f") Function_dispatch_source_set_registration_handler_f handler);

    /**
     * [@function] dispatch_group_create
     * 
     * Creates new group with which blocks may be associated.
     * 
     * This function creates a new group with which blocks may be associated.
     * The dispatch group may be used to wait for the completion of the blocks it
     * references. The group object memory is freed with dispatch_release().
     * 
     * @return
     *         The newly created group, or NULL on failure.
     * 
     *         API-Since: 4.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_group_t dispatch_group_create();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_group_async(@NotNull dispatch_group_t group, @NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_group_async") Block_dispatch_group_async block);

    /**
     * [@function] dispatch_group_async_f
     * 
     * Submits a function to a dispatch queue and associates the block with the
     * given dispatch group.
     * 
     * See dispatch_group_async() for details.
     * 
     * @param group
     *                A dispatch group to associate with the submitted function.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param queue
     *                The dispatch queue to which the function will be submitted for asynchronous
     *                invocation.
     * 
     * @param context
     *                The application-defined context parameter to pass to the function.
     * 
     * @param work
     *                The application-defined function to invoke on the target queue. The first
     *                parameter passed to this function is the context provided to
     *                dispatch_group_async_f().
     * 
     *                API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_group_async_f(@NotNull dispatch_group_t group, @NotNull dispatch_queue_t queue,
            @Nullable VoidPtr context,
            @NotNull @FunctionPtr(name = "call_dispatch_group_async_f") Function_dispatch_group_async_f work);

    /**
     * [@function] dispatch_group_wait
     * 
     * Wait synchronously until all the blocks associated with a group have
     * completed or until the specified timeout has elapsed.
     * 
     * This function waits for the completion of the blocks associated with the
     * given dispatch group, and returns after all blocks have completed or when
     * the specified timeout has elapsed.
     * 
     * This function will return immediately if there are no blocks associated
     * with the dispatch group (i.e. the group is empty).
     * 
     * The result of calling this function from multiple threads simultaneously
     * with the same dispatch group is undefined.
     * 
     * After the successful return of this function, the dispatch group is empty.
     * It may either be released with dispatch_release() or re-used for additional
     * blocks. See dispatch_group_async() for more information.
     * 
     * @param group
     *                The dispatch group to wait on.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param timeout
     *                When to timeout (see dispatch_time). As a convenience, there are the
     *                DISPATCH_TIME_NOW and DISPATCH_TIME_FOREVER constants.
     * 
     * @return
     *         Returns zero on success (all blocks associated with the group completed
     *         within the specified timeout) or non-zero on error (i.e. timed out).
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long dispatch_group_wait(@NotNull dispatch_group_t group, long timeout);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_group_notify(@NotNull dispatch_group_t group, @NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_group_notify") Block_dispatch_group_notify block);

    /**
     * [@function] dispatch_group_notify_f
     * 
     * Schedule a function to be submitted to a queue when all the blocks
     * associated with a group have completed.
     * 
     * See dispatch_group_notify() for details.
     * 
     * @param group
     *                The dispatch group to observe.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param context
     *                The application-defined context parameter to pass to the function.
     * 
     * @param work
     *                The application-defined function to invoke on the target queue. The first
     *                parameter passed to this function is the context provided to
     *                dispatch_group_notify_f().
     * 
     *                API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_group_notify_f(@NotNull dispatch_group_t group, @NotNull dispatch_queue_t queue,
            @Nullable VoidPtr context,
            @NotNull @FunctionPtr(name = "call_dispatch_group_notify_f") Function_dispatch_group_notify_f work);

    /**
     * [@function] dispatch_group_enter
     * 
     * Manually indicate a block has entered the group
     * 
     * Calling this function indicates another block has joined the group through
     * a means other than dispatch_group_async(). Calls to this function must be
     * balanced with dispatch_group_leave().
     * 
     * @param group
     *              The dispatch group to update.
     *              The result of passing NULL in this parameter is undefined.
     * 
     *              API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_group_enter(@NotNull dispatch_group_t group);

    /**
     * [@function] dispatch_group_leave
     * 
     * Manually indicate a block in the group has completed
     * 
     * Calling this function indicates block has completed and left the dispatch
     * group by a means other than dispatch_group_async().
     * 
     * @param group
     *              The dispatch group to update.
     *              The result of passing NULL in this parameter is undefined.
     * 
     *              API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_group_leave(@NotNull dispatch_group_t group);

    /**
     * [@function] dispatch_semaphore_create
     * 
     * Creates new counting semaphore with an initial value.
     * 
     * Passing zero for the value is useful for when two threads need to reconcile
     * the completion of a particular event. Passing a value greater than zero is
     * useful for managing a finite pool of resources, where the pool size is equal
     * to the value.
     * 
     * @param value
     *              The starting value for the semaphore. Passing a value less than zero will
     *              cause NULL to be returned.
     * 
     * @return
     *         The newly created semaphore, or NULL on failure.
     * 
     *         API-Since: 4.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_semaphore_t dispatch_semaphore_create(@NInt long value);

    /**
     * [@function] dispatch_semaphore_wait
     * 
     * Wait (decrement) for a semaphore.
     * 
     * Decrement the counting semaphore. If the resulting value is less than zero,
     * this function waits for a signal to occur before returning. If the timeout is
     * reached without a signal being received, the semaphore is re-incremented
     * before the function returns.
     * 
     * @param dsema
     *                The semaphore. The result of passing NULL in this parameter is undefined.
     * 
     * @param timeout
     *                When to timeout (see dispatch_time). As a convenience, there are the
     *                DISPATCH_TIME_NOW and DISPATCH_TIME_FOREVER constants.
     * 
     * @return
     *         Returns zero on success, or non-zero if the timeout occurred.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long dispatch_semaphore_wait(@NotNull dispatch_semaphore_t dsema, long timeout);

    /**
     * [@function] dispatch_semaphore_signal
     * 
     * Signal (increment) a semaphore.
     * 
     * Increment the counting semaphore. If the previous value was less than zero,
     * this function wakes a waiting thread before returning.
     * 
     * @param dsema The counting semaphore.
     *              The result of passing NULL in this parameter is undefined.
     * 
     * @return
     *         This function returns non-zero if a thread is woken. Otherwise, zero is
     *         returned.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long dispatch_semaphore_signal(@NotNull dispatch_semaphore_t dsema);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_once(@NotNull NIntPtr predicate,
            @NotNull @ObjCBlock(name = "call_dispatch_once") Block_dispatch_once block);

    @Generated
    @Inline
    @CFunction
    public static native void _dispatch_once(@NotNull NIntPtr predicate,
            @NotNull @ObjCBlock(name = "call__dispatch_once") Block__dispatch_once block);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_once_f(@NotNull NIntPtr predicate, @Nullable VoidPtr context,
            @NotNull @FunctionPtr(name = "call_dispatch_once_f") Function_dispatch_once_f function);

    @Generated
    @Inline
    @CFunction
    public static native void _dispatch_once_f(@NotNull NIntPtr predicate, @Nullable VoidPtr context,
            @NotNull @FunctionPtr(name = "call__dispatch_once_f") Function__dispatch_once_f function);

    /**
     * [@function] dispatch_data_create
     * Creates a dispatch data object from the given contiguous buffer of memory. If
     * a non-default destructor is provided, ownership of the buffer remains with
     * the caller (i.e. the bytes will not be copied). The last release of the data
     * object will result in the invocation of the specified destructor on the
     * specified queue to free the buffer.
     * 
     * If the DISPATCH_DATA_DESTRUCTOR_FREE destructor is provided the buffer will
     * be freed via free(3) and the queue argument ignored.
     * 
     * If the DISPATCH_DATA_DESTRUCTOR_DEFAULT destructor is provided, data object
     * creation will copy the buffer into internal memory managed by the system.
     * 
     * @param buffer     A contiguous buffer of data.
     * @param size       The size of the contiguous buffer of data.
     * @param queue      The queue to which the destructor should be submitted.
     * @param destructor The destructor responsible for freeing the data when it
     *                   is no longer needed.
     * @return A newly created dispatch data object.
     * 
     *         API-Since: 5.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_data_t dispatch_data_create(@NotNull ConstVoidPtr buffer, @NUInt long size,
            @Nullable dispatch_queue_t queue,
            @Nullable @ObjCBlock(name = "call_dispatch_data_create") Block_dispatch_data_create destructor);

    /**
     * [@function] dispatch_data_get_size
     * Returns the logical size of the memory region(s) represented by the specified
     * dispatch data object.
     * 
     * @param data The dispatch data object to query.
     * @return The number of bytes represented by the data object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long dispatch_data_get_size(@NotNull dispatch_data_t data);

    /**
     * [@function] dispatch_data_create_map
     * Maps the memory represented by the specified dispatch data object as a single
     * contiguous memory region and returns a new data object representing it.
     * If non-NULL references to a pointer and a size variable are provided, they
     * are filled with the location and extent of that region. These allow direct
     * read access to the represented memory, but are only valid until the returned
     * object is released. Under ARC, if that object is held in a variable with
     * automatic storage, care needs to be taken to ensure that it is not released
     * by the compiler before memory access via the pointer has been completed.
     * 
     * @param data       The dispatch data object to map.
     * @param buffer_ptr A pointer to a pointer variable to be filled with the
     *                   location of the mapped contiguous memory region, or
     *                   NULL.
     * @param size_ptr   A pointer to a size_t variable to be filled with the
     *                   size of the mapped contiguous memory region, or NULL.
     * @return A newly created dispatch data object.
     * 
     *         API-Since: 5.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_data_t dispatch_data_create_map(@NotNull dispatch_data_t data,
            @Nullable Ptr<ConstVoidPtr> buffer_ptr, @Nullable NUIntPtr size_ptr);

    /**
     * [@function] dispatch_data_create_concat
     * Returns a new dispatch data object representing the concatenation of the
     * specified data objects. Those objects may be released by the application
     * after the call returns (however, the system might not deallocate the memory
     * region(s) described by them until the newly created object has also been
     * released).
     * 
     * @param data1 The data object representing the region(s) of memory to place
     *              at the beginning of the newly created object.
     * @param data2 The data object representing the region(s) of memory to place
     *              at the end of the newly created object.
     * @return A newly created object representing the concatenation of the
     *         data1 and data2 objects.
     * 
     *         API-Since: 5.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_data_t dispatch_data_create_concat(@NotNull dispatch_data_t data1,
            @NotNull dispatch_data_t data2);

    /**
     * [@function] dispatch_data_create_subrange
     * Returns a new dispatch data object representing a subrange of the specified
     * data object, which may be released by the application after the call returns
     * (however, the system might not deallocate the memory region(s) described by
     * that object until the newly created object has also been released).
     * 
     * @param data   The data object representing the region(s) of memory to
     *               create a subrange of.
     * @param offset The offset into the data object where the subrange
     *               starts.
     * @param length The length of the range.
     * @return A newly created object representing the specified
     *         subrange of the data object.
     * 
     *         API-Since: 5.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_data_t dispatch_data_create_subrange(@NotNull dispatch_data_t data,
            @NUInt long offset, @NUInt long length);

    /**
     * [@function] dispatch_data_apply
     * Traverse the memory regions represented by the specified dispatch data object
     * in logical order and invoke the specified block once for every contiguous
     * memory region encountered.
     * 
     * Each invocation of the block is passed a data object representing the current
     * region and its logical offset, along with the memory location and extent of
     * the region. These allow direct read access to the memory region, but are only
     * valid until the passed-in region object is released. Note that the region
     * object is released by the system when the block returns, it is the
     * responsibility of the application to retain it if the region object or the
     * associated memory location are needed after the block returns.
     * 
     * @param data    The data object to traverse.
     * @param applier The block to be invoked for every contiguous memory
     *                region in the data object.
     * @return A Boolean indicating whether traversal completed
     *         successfully.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native boolean dispatch_data_apply(@NotNull dispatch_data_t data,
            @NotNull @ObjCBlock(name = "call_dispatch_data_apply") Block_dispatch_data_apply applier);

    /**
     * [@function] dispatch_data_copy_region
     * Finds the contiguous memory region containing the specified location among
     * the regions represented by the specified object and returns a copy of the
     * internal dispatch data object representing that region along with its logical
     * offset in the specified object.
     * 
     * @param data       The dispatch data object to query.
     * @param location   The logical position in the data object to query.
     * @param offset_ptr A pointer to a size_t variable to be filled with the
     *                   logical offset of the returned region object to the
     *                   start of the queried data object.
     * @return A newly created dispatch data object.
     * 
     *         API-Since: 5.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_data_t dispatch_data_copy_region(@NotNull dispatch_data_t data, @NUInt long location,
            @NotNull NUIntPtr offset_ptr);

    /**
     * [@function] dispatch_read
     * Schedule a read operation for asynchronous execution on the specified file
     * descriptor. The specified handler is enqueued with the data read from the
     * file descriptor when the operation has completed or an error occurs.
     * 
     * The data object passed to the handler will be automatically released by the
     * system when the handler returns. It is the responsibility of the application
     * to retain, concatenate or copy the data object if it is needed after the
     * handler returns.
     * 
     * The data object passed to the handler will only contain as much data as is
     * currently available from the file descriptor (up to the specified length).
     * 
     * If an unrecoverable error occurs on the file descriptor, the handler will be
     * enqueued with the appropriate error code along with a data object of any data
     * that could be read successfully.
     * 
     * An invocation of the handler with an error code of zero and an empty data
     * object indicates that EOF was reached.
     * 
     * The system takes control of the file descriptor until the handler is
     * enqueued, and during this time file descriptor flags such as O_NONBLOCK will
     * be modified by the system on behalf of the application. It is an error for
     * the application to modify a file descriptor directly while it is under the
     * control of the system, but it may create additional dispatch I/O convenience
     * operations or dispatch I/O channels associated with that file descriptor.
     * 
     * @param fd      The file descriptor from which to read the data.
     * @param length  The length of data to read from the file descriptor,
     *                or SIZE_MAX to indicate that all of the data currently
     *                available from the file descriptor should be read.
     * @param queue   The dispatch queue to which the handler should be
     *                submitted.
     * @param handler The handler to enqueue when data is ready to be
     *                delivered.
     *                param data The data read from the file descriptor.
     *                param error An errno condition for the read operation or
     *                zero if the read was successful.
     * 
     *                API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void dispatch_read(int fd, @NUInt long length, @NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_read") Block_dispatch_read handler);

    /**
     * [@function] dispatch_write
     * Schedule a write operation for asynchronous execution on the specified file
     * descriptor. The specified handler is enqueued when the operation has
     * completed or an error occurs.
     * 
     * If an unrecoverable error occurs on the file descriptor, the handler will be
     * enqueued with the appropriate error code along with the data that could not
     * be successfully written.
     * 
     * An invocation of the handler with an error code of zero indicates that the
     * data was fully written to the channel.
     * 
     * The system takes control of the file descriptor until the handler is
     * enqueued, and during this time file descriptor flags such as O_NONBLOCK will
     * be modified by the system on behalf of the application. It is an error for
     * the application to modify a file descriptor directly while it is under the
     * control of the system, but it may create additional dispatch I/O convenience
     * operations or dispatch I/O channels associated with that file descriptor.
     * 
     * @param fd      The file descriptor to which to write the data.
     * @param data    The data object to write to the file descriptor.
     * @param queue   The dispatch queue to which the handler should be
     *                submitted.
     * @param handler The handler to enqueue when the data has been written.
     *                param data The data that could not be written to the I/O
     *                channel, or NULL.
     *                param error An errno condition for the write operation or
     *                zero if the write was successful.
     * 
     *                API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void dispatch_write(int fd, @NotNull dispatch_data_t data, @NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_write") Block_dispatch_write handler);

    /**
     * [@function] dispatch_io_create
     * Create a dispatch I/O channel associated with a file descriptor. The system
     * takes control of the file descriptor until the channel is closed, an error
     * occurs on the file descriptor or all references to the channel are released.
     * At that time the specified cleanup handler will be enqueued and control over
     * the file descriptor relinquished.
     * 
     * While a file descriptor is under the control of a dispatch I/O channel, file
     * descriptor flags such as O_NONBLOCK will be modified by the system on behalf
     * of the application. It is an error for the application to modify a file
     * descriptor directly while it is under the control of a dispatch I/O channel,
     * but it may create additional channels associated with that file descriptor.
     * 
     * @param type            The desired type of I/O channel (DISPATCH_IO_STREAM
     *                        or DISPATCH_IO_RANDOM).
     * @param fd              The file descriptor to associate with the I/O channel.
     * @param queue           The dispatch queue to which the handler should be submitted.
     * @param cleanup_handler The handler to enqueue when the system
     *                        relinquishes control over the file descriptor.
     *                        param error An errno condition if control is relinquished
     *                        because channel creation failed, zero otherwise.
     * @return The newly created dispatch I/O channel or NULL if an error
     *         occurred (invalid type specified).
     * 
     *         API-Since: 5.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_io_t dispatch_io_create(@NUInt long type, int fd, @NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_io_create") Block_dispatch_io_create cleanup_handler);

    /**
     * [@function] dispatch_io_create_with_path
     * Create a dispatch I/O channel associated with a path name. The specified
     * path, oflag and mode parameters will be passed to open(2) when the first I/O
     * operation on the channel is ready to execute and the resulting file
     * descriptor will remain open and under the control of the system until the
     * channel is closed, an error occurs on the file descriptor or all references
     * to the channel are released. At that time the file descriptor will be closed
     * and the specified cleanup handler will be enqueued.
     * 
     * @param type            The desired type of I/O channel (DISPATCH_IO_STREAM
     *                        or DISPATCH_IO_RANDOM).
     * @param path            The absolute path to associate with the I/O channel.
     * @param oflag           The flags to pass to open(2) when opening the file at
     *                        path.
     * @param mode            The mode to pass to open(2) when creating the file at
     *                        path (i.e. with flag O_CREAT), zero otherwise.
     * @param queue           The dispatch queue to which the handler should be
     *                        submitted.
     * @param cleanup_handler The handler to enqueue when the system
     *                        has closed the file at path.
     *                        param error An errno condition if control is relinquished
     *                        because channel creation or opening of the
     *                        specified file failed, zero otherwise.
     * @return The newly created dispatch I/O channel or NULL if an error
     *         occurred (invalid type or non-absolute path specified).
     * 
     *         API-Since: 5.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_io_t dispatch_io_create_with_path(@NUInt long type,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path,
            int oflag, char mode, @NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_io_create_with_path") Block_dispatch_io_create_with_path cleanup_handler);

    /**
     * [@function] dispatch_io_create_with_io
     * Create a new dispatch I/O channel from an existing dispatch I/O channel.
     * The new channel inherits the file descriptor or path name associated with
     * the existing channel, but not its channel type or policies.
     * 
     * If the existing channel is associated with a file descriptor, control by the
     * system over that file descriptor is extended until the new channel is also
     * closed, an error occurs on the file descriptor, or all references to both
     * channels are released. At that time the specified cleanup handler will be
     * enqueued and control over the file descriptor relinquished.
     * 
     * While a file descriptor is under the control of a dispatch I/O channel, file
     * descriptor flags such as O_NONBLOCK will be modified by the system on behalf
     * of the application. It is an error for the application to modify a file
     * descriptor directly while it is under the control of a dispatch I/O channel,
     * but it may create additional channels associated with that file descriptor.
     * 
     * @param type            The desired type of I/O channel (DISPATCH_IO_STREAM
     *                        or DISPATCH_IO_RANDOM).
     * @param io              The existing channel to create the new I/O channel from.
     * @param queue           The dispatch queue to which the handler should be submitted.
     * @param cleanup_handler The handler to enqueue when the system
     *                        relinquishes control over the file descriptor
     *                        (resp. closes the file at path) associated with
     *                        the existing channel.
     *                        param error An errno condition if control is relinquished
     *                        because channel creation failed, zero otherwise.
     * @return The newly created dispatch I/O channel or NULL if an error
     *         occurred (invalid type specified).
     * 
     *         API-Since: 5.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_io_t dispatch_io_create_with_io(@NUInt long type, @NotNull dispatch_io_t io,
            @NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_io_create_with_io") Block_dispatch_io_create_with_io cleanup_handler);

    /**
     * [@function] dispatch_io_read
     * Schedule a read operation for asynchronous execution on the specified I/O
     * channel. The I/O handler is enqueued one or more times depending on the
     * general load of the system and the policy specified on the I/O channel.
     * 
     * Any data read from the channel is described by the dispatch data object
     * passed to the I/O handler. This object will be automatically released by the
     * system when the I/O handler returns. It is the responsibility of the
     * application to retain, concatenate or copy the data object if it is needed
     * after the I/O handler returns.
     * 
     * Dispatch I/O handlers are not reentrant. The system will ensure that no new
     * I/O handler instance is invoked until the previously enqueued handler block
     * has returned.
     * 
     * An invocation of the I/O handler with the done flag set indicates that the
     * read operation is complete and that the handler will not be enqueued again.
     * 
     * If an unrecoverable error occurs on the I/O channel's underlying file
     * descriptor, the I/O handler will be enqueued with the done flag set, the
     * appropriate error code and a NULL data object.
     * 
     * An invocation of the I/O handler with the done flag set, an error code of
     * zero and an empty data object indicates that EOF was reached.
     * 
     * @param channel    The dispatch I/O channel from which to read the data.
     * @param offset     The offset relative to the channel position from which
     *                   to start reading (only for DISPATCH_IO_RANDOM).
     * @param length     The length of data to read from the I/O channel, or
     *                   SIZE_MAX to indicate that data should be read until EOF
     *                   is reached.
     * @param queue      The dispatch queue to which the I/O handler should be
     *                   submitted.
     * @param io_handler The I/O handler to enqueue when data is ready to be
     *                   delivered.
     *                   param done A flag indicating whether the operation is complete.
     *                   param data An object with the data most recently read from the
     *                   I/O channel as part of this read operation, or NULL.
     *                   param error An errno condition for the read operation or zero if
     *                   the read was successful.
     * 
     *                   API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void dispatch_io_read(@NotNull dispatch_io_t channel, long offset, @NUInt long length,
            @NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_io_read") Block_dispatch_io_read io_handler);

    /**
     * [@function] dispatch_io_write
     * Schedule a write operation for asynchronous execution on the specified I/O
     * channel. The I/O handler is enqueued one or more times depending on the
     * general load of the system and the policy specified on the I/O channel.
     * 
     * Any data remaining to be written to the I/O channel is described by the
     * dispatch data object passed to the I/O handler. This object will be
     * automatically released by the system when the I/O handler returns. It is the
     * responsibility of the application to retain, concatenate or copy the data
     * object if it is needed after the I/O handler returns.
     * 
     * Dispatch I/O handlers are not reentrant. The system will ensure that no new
     * I/O handler instance is invoked until the previously enqueued handler block
     * has returned.
     * 
     * An invocation of the I/O handler with the done flag set indicates that the
     * write operation is complete and that the handler will not be enqueued again.
     * 
     * If an unrecoverable error occurs on the I/O channel's underlying file
     * descriptor, the I/O handler will be enqueued with the done flag set, the
     * appropriate error code and an object containing the data that could not be
     * written.
     * 
     * An invocation of the I/O handler with the done flag set and an error code of
     * zero indicates that the data was fully written to the channel.
     * 
     * @param channel    The dispatch I/O channel on which to write the data.
     * @param offset     The offset relative to the channel position from which
     *                   to start writing (only for DISPATCH_IO_RANDOM).
     * @param data       The data to write to the I/O channel. The data object
     *                   will be retained by the system until the write operation
     *                   is complete.
     * @param queue      The dispatch queue to which the I/O handler should be
     *                   submitted.
     * @param io_handler The I/O handler to enqueue when data has been delivered.
     *                   param done A flag indicating whether the operation is complete.
     *                   param data An object of the data remaining to be
     *                   written to the I/O channel as part of this write
     *                   operation, or NULL.
     *                   param error An errno condition for the write operation or zero
     *                   if the write was successful.
     * 
     *                   API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void dispatch_io_write(@NotNull dispatch_io_t channel, long offset,
            @NotNull dispatch_data_t data, @NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_io_write") Block_dispatch_io_write io_handler);

    /**
     * [@function] dispatch_io_close
     * Close the specified I/O channel to new read or write operations; scheduling
     * operations on a closed channel results in their handler returning an error.
     * 
     * If the DISPATCH_IO_STOP flag is provided, the system will make a best effort
     * to interrupt any outstanding read and write operations on the I/O channel,
     * otherwise those operations will run to completion normally.
     * Partial results of read and write operations may be returned even after a
     * channel is closed with the DISPATCH_IO_STOP flag.
     * The final invocation of an I/O handler of an interrupted operation will be
     * passed an ECANCELED error code, as will the I/O handler of an operation
     * scheduled on a closed channel.
     * 
     * @param channel The dispatch I/O channel to close.
     * @param flags   The flags for the close operation.
     * 
     *                API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void dispatch_io_close(@NotNull dispatch_io_t channel, @NUInt long flags);

    /**
     * [@function] dispatch_io_barrier
     * Schedule a barrier operation on the specified I/O channel; all previously
     * scheduled operations on the channel will complete before the provided
     * barrier block is enqueued onto the global queue determined by the channel's
     * target queue, and no subsequently scheduled operations will start until the
     * barrier block has returned.
     * 
     * If multiple channels are associated with the same file descriptor, a barrier
     * operation scheduled on any of these channels will act as a barrier across all
     * channels in question, i.e. all previously scheduled operations on any of the
     * channels will complete before the barrier block is enqueued, and no
     * operations subsequently scheduled on any of the channels will start until the
     * barrier block has returned.
     * 
     * While the barrier block is running, it may safely operate on the channel's
     * underlying file descriptor with fsync(2), lseek(2) etc. (but not close(2)).
     * 
     * @param channel The dispatch I/O channel to schedule the barrier on.
     * @param barrier The barrier block.
     * 
     *                API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void dispatch_io_barrier(@NotNull dispatch_io_t channel,
            @NotNull @ObjCBlock(name = "call_dispatch_io_barrier") Block_dispatch_io_barrier barrier);

    /**
     * [@function] dispatch_io_get_descriptor
     * Returns the file descriptor underlying a dispatch I/O channel.
     * 
     * Will return -1 for a channel closed with dispatch_io_close() and for a
     * channel associated with a path name that has not yet been open(2)ed.
     * 
     * If called from a barrier block scheduled on a channel associated with a path
     * name that has not yet been open(2)ed, this will trigger the channel open(2)
     * operation and return the resulting file descriptor.
     * 
     * @param channel The dispatch I/O channel to query.
     * @return The file descriptor underlying the channel, or -1.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native int dispatch_io_get_descriptor(@NotNull dispatch_io_t channel);

    /**
     * [@function] dispatch_io_set_high_water
     * Set a high water mark on the I/O channel for all operations.
     * 
     * The system will make a best effort to enqueue I/O handlers with partial
     * results as soon the number of bytes processed by an operation (i.e. read or
     * written) reaches the high water mark.
     * 
     * The size of data objects passed to I/O handlers for this channel will never
     * exceed the specified high water mark.
     * 
     * The default value for the high water mark is unlimited (i.e. SIZE_MAX).
     * 
     * @param channel    The dispatch I/O channel on which to set the policy.
     * @param high_water The number of bytes to use as a high water mark.
     * 
     *                   API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void dispatch_io_set_high_water(@NotNull dispatch_io_t channel, @NUInt long high_water);

    /**
     * [@function] dispatch_io_set_low_water
     * Set a low water mark on the I/O channel for all operations.
     * 
     * The system will process (i.e. read or write) at least the low water mark
     * number of bytes for an operation before enqueueing I/O handlers with partial
     * results.
     * 
     * The size of data objects passed to intermediate I/O handler invocations for
     * this channel (i.e. excluding the final invocation) will never be smaller than
     * the specified low water mark, except if the channel has an interval with the
     * DISPATCH_IO_STRICT_INTERVAL flag set or if EOF or an error was encountered.
     * 
     * I/O handlers should be prepared to receive amounts of data significantly
     * larger than the low water mark in general. If an I/O handler requires
     * intermediate results of fixed size, set both the low and and the high water
     * mark to that size.
     * 
     * The default value for the low water mark is unspecified, but must be assumed
     * to be such that intermediate handler invocations may occur.
     * If I/O handler invocations with partial results are not desired, set the
     * low water mark to SIZE_MAX.
     * 
     * @param channel   The dispatch I/O channel on which to set the policy.
     * @param low_water The number of bytes to use as a low water mark.
     * 
     *                  API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void dispatch_io_set_low_water(@NotNull dispatch_io_t channel, @NUInt long low_water);

    /**
     * [@function] dispatch_io_set_interval
     * Set a nanosecond interval at which I/O handlers are to be enqueued on the
     * I/O channel for all operations.
     * 
     * This allows an application to receive periodic feedback on the progress of
     * read and write operations, e.g. for the purposes of displaying progress bars.
     * 
     * If the amount of data ready to be delivered to an I/O handler at the interval
     * is inferior to the channel low water mark, the handler will only be enqueued
     * if the DISPATCH_IO_STRICT_INTERVAL flag is set.
     * 
     * Note that the system may defer enqueueing interval I/O handlers by a small
     * unspecified amount of leeway in order to align with other system activity for
     * improved system performance or power consumption.
     * 
     * @param channel  The dispatch I/O channel on which to set the policy.
     * @param interval The interval in nanoseconds at which delivery of the I/O
     *                 handler is desired.
     * @param flags    Flags indicating desired data delivery behavior at
     *                 interval time.
     * 
     *                 API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void dispatch_io_set_interval(@NotNull dispatch_io_t channel, long interval,
            @NUInt long flags);

    @Generated
    @CFunction
    public static native int __math_errhandling();

    @Generated
    @CFunction
    public static native int __fpclassifyf(float arg1);

    @Generated
    @CFunction
    public static native int __fpclassifyd(double arg1);

    @Generated
    @Inline
    @CFunction
    public static native int __inline_isfinitef(float arg1);

    @Generated
    @Inline
    @CFunction
    public static native int __inline_isfinited(double arg1);

    @Generated
    @Inline
    @CFunction
    public static native int __inline_isinff(float arg1);

    @Generated
    @Inline
    @CFunction
    public static native int __inline_isinfd(double arg1);

    @Generated
    @Inline
    @CFunction
    public static native int __inline_isnanf(float arg1);

    @Generated
    @Inline
    @CFunction
    public static native int __inline_isnand(double arg1);

    @Generated
    @Inline
    @CFunction
    public static native int __inline_isnormalf(float arg1);

    @Generated
    @Inline
    @CFunction
    public static native int __inline_isnormald(double arg1);

    @Generated
    @Inline
    @CFunction
    public static native int __inline_signbitf(float arg1);

    @Generated
    @Inline
    @CFunction
    public static native int __inline_signbitd(double arg1);

    /**
     * *
     * Math Functions *
     * *
     * ****************************************************************************
     */
    @Generated
    @CFunction
    public static native float acosf(float arg1);

    @Generated
    @CFunction
    public static native double acos(double arg1);

    @Generated
    @CFunction
    public static native float asinf(float arg1);

    @Generated
    @CFunction
    public static native double asin(double arg1);

    @Generated
    @CFunction
    public static native float atanf(float arg1);

    @Generated
    @CFunction
    public static native double atan(double arg1);

    @Generated
    @CFunction
    public static native float atan2f(float arg1, float arg2);

    @Generated
    @CFunction
    public static native double atan2(double arg1, double arg2);

    @Generated
    @CFunction
    public static native float cosf(float arg1);

    @Generated
    @CFunction
    public static native double cos(double arg1);

    @Generated
    @CFunction
    public static native float sinf(float arg1);

    @Generated
    @CFunction
    public static native double sin(double arg1);

    @Generated
    @CFunction
    public static native float tanf(float arg1);

    @Generated
    @CFunction
    public static native double tan(double arg1);

    @Generated
    @CFunction
    public static native float acoshf(float arg1);

    @Generated
    @CFunction
    public static native double acosh(double arg1);

    @Generated
    @CFunction
    public static native float asinhf(float arg1);

    @Generated
    @CFunction
    public static native double asinh(double arg1);

    @Generated
    @CFunction
    public static native float atanhf(float arg1);

    @Generated
    @CFunction
    public static native double atanh(double arg1);

    @Generated
    @CFunction
    public static native float coshf(float arg1);

    @Generated
    @CFunction
    public static native double cosh(double arg1);

    @Generated
    @CFunction
    public static native float sinhf(float arg1);

    @Generated
    @CFunction
    public static native double sinh(double arg1);

    @Generated
    @CFunction
    public static native float tanhf(float arg1);

    @Generated
    @CFunction
    public static native double tanh(double arg1);

    @Generated
    @CFunction
    public static native float expf(float arg1);

    @Generated
    @CFunction
    public static native double exp(double arg1);

    @Generated
    @CFunction
    public static native float exp2f(float arg1);

    @Generated
    @CFunction
    public static native double exp2(double arg1);

    @Generated
    @CFunction
    public static native float expm1f(float arg1);

    @Generated
    @CFunction
    public static native double expm1(double arg1);

    @Generated
    @CFunction
    public static native float logf(float arg1);

    @Generated
    @CFunction
    public static native double log(double arg1);

    @Generated
    @CFunction
    public static native float log10f(float arg1);

    @Generated
    @CFunction
    public static native double log10(double arg1);

    @Generated
    @CFunction
    public static native float log2f(float arg1);

    @Generated
    @CFunction
    public static native double log2(double arg1);

    @Generated
    @CFunction
    public static native float log1pf(float arg1);

    @Generated
    @CFunction
    public static native double log1p(double arg1);

    @Generated
    @CFunction
    public static native float logbf(float arg1);

    @Generated
    @CFunction
    public static native double logb(double arg1);

    @Generated
    @CFunction
    public static native float modff(float arg1, FloatPtr arg2);

    @Generated
    @CFunction
    public static native double modf(double arg1, DoublePtr arg2);

    @Generated
    @CFunction
    public static native float ldexpf(float arg1, int arg2);

    @Generated
    @CFunction
    public static native double ldexp(double arg1, int arg2);

    @Generated
    @CFunction
    public static native float frexpf(float arg1, IntPtr arg2);

    @Generated
    @CFunction
    public static native double frexp(double arg1, IntPtr arg2);

    @Generated
    @CFunction
    public static native int ilogbf(float arg1);

    @Generated
    @CFunction
    public static native int ilogb(double arg1);

    @Generated
    @CFunction
    public static native float scalbnf(float arg1, int arg2);

    @Generated
    @CFunction
    public static native double scalbn(double arg1, int arg2);

    @Generated
    @CFunction
    public static native float scalblnf(float arg1, @NInt long arg2);

    @Generated
    @CFunction
    public static native double scalbln(double arg1, @NInt long arg2);

    @Generated
    @CFunction
    public static native float fabsf(float arg1);

    @Generated
    @CFunction
    public static native double fabs(double arg1);

    @Generated
    @CFunction
    public static native float cbrtf(float arg1);

    @Generated
    @CFunction
    public static native double cbrt(double arg1);

    @Generated
    @CFunction
    public static native float hypotf(float arg1, float arg2);

    @Generated
    @CFunction
    public static native double hypot(double arg1, double arg2);

    @Generated
    @CFunction
    public static native float powf(float arg1, float arg2);

    @Generated
    @CFunction
    public static native double pow(double arg1, double arg2);

    @Generated
    @CFunction
    public static native float sqrtf(float arg1);

    @Generated
    @CFunction
    public static native double sqrt(double arg1);

    @Generated
    @CFunction
    public static native float erff(float arg1);

    @Generated
    @CFunction
    public static native double erf(double arg1);

    @Generated
    @CFunction
    public static native float erfcf(float arg1);

    @Generated
    @CFunction
    public static native double erfc(double arg1);

    /**
     * lgammaf, lgamma, and lgammal are not thread-safe. The thread-safe
     * variants lgammaf_r, lgamma_r, and lgammal_r are made available if
     * you define the _REENTRANT symbol before including <math.h>
     */
    @Generated
    @CFunction
    public static native float lgammaf(float arg1);

    @Generated
    @CFunction
    public static native double lgamma(double arg1);

    @Generated
    @CFunction
    public static native float tgammaf(float arg1);

    @Generated
    @CFunction
    public static native double tgamma(double arg1);

    @Generated
    @CFunction
    public static native float ceilf(float arg1);

    @Generated
    @CFunction
    public static native double ceil(double arg1);

    @Generated
    @CFunction
    public static native float floorf(float arg1);

    @Generated
    @CFunction
    public static native double floor(double arg1);

    @Generated
    @CFunction
    public static native float nearbyintf(float arg1);

    @Generated
    @CFunction
    public static native double nearbyint(double arg1);

    @Generated
    @CFunction
    public static native float rintf(float arg1);

    @Generated
    @CFunction
    public static native double rint(double arg1);

    @Generated
    @CFunction
    @NInt
    public static native long lrintf(float arg1);

    @Generated
    @CFunction
    @NInt
    public static native long lrint(double arg1);

    @Generated
    @CFunction
    public static native float roundf(float arg1);

    @Generated
    @CFunction
    public static native double round(double arg1);

    @Generated
    @CFunction
    @NInt
    public static native long lroundf(float arg1);

    @Generated
    @CFunction
    @NInt
    public static native long lround(double arg1);

    @Generated
    @CFunction
    public static native long llrintf(float arg1);

    @Generated
    @CFunction
    public static native long llrint(double arg1);

    @Generated
    @CFunction
    public static native long llroundf(float arg1);

    @Generated
    @CFunction
    public static native long llround(double arg1);

    @Generated
    @CFunction
    public static native float truncf(float arg1);

    @Generated
    @CFunction
    public static native double trunc(double arg1);

    @Generated
    @CFunction
    public static native float fmodf(float arg1, float arg2);

    @Generated
    @CFunction
    public static native double fmod(double arg1, double arg2);

    @Generated
    @CFunction
    public static native float remainderf(float arg1, float arg2);

    @Generated
    @CFunction
    public static native double remainder(double arg1, double arg2);

    @Generated
    @CFunction
    public static native float remquof(float arg1, float arg2, IntPtr arg3);

    @Generated
    @CFunction
    public static native double remquo(double arg1, double arg2, IntPtr arg3);

    @Generated
    @CFunction
    public static native float copysignf(float arg1, float arg2);

    @Generated
    @CFunction
    public static native double copysign(double arg1, double arg2);

    @Generated
    @CFunction
    public static native float nanf(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native double nan(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native float nextafterf(float arg1, float arg2);

    @Generated
    @CFunction
    public static native double nextafter(double arg1, double arg2);

    @Generated
    @CFunction
    public static native float fdimf(float arg1, float arg2);

    @Generated
    @CFunction
    public static native double fdim(double arg1, double arg2);

    @Generated
    @CFunction
    public static native float fmaxf(float arg1, float arg2);

    @Generated
    @CFunction
    public static native double fmax(double arg1, double arg2);

    @Generated
    @CFunction
    public static native float fminf(float arg1, float arg2);

    @Generated
    @CFunction
    public static native double fmin(double arg1, double arg2);

    @Generated
    @CFunction
    public static native float fmaf(float arg1, float arg2, float arg3);

    @Generated
    @CFunction
    public static native double fma(double arg1, double arg2, double arg3);

    /**
     * __exp10(x) returns 10**x. Edge cases match those of exp( ) and exp2( ).
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native float __exp10f(float arg1);

    /**
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native double __exp10(double arg1);

    /**
     * __sincos(x,sinp,cosp) computes the sine and cosine of x with a single
     * function call, storing the sine in the memory pointed to by sinp, and
     * the cosine in the memory pointed to by cosp. Edge cases match those of
     * separate calls to sin( ) and cos( ).
     */
    @Generated
    @Inline
    @CFunction
    public static native void __sincosf(float __x, FloatPtr __sinp, FloatPtr __cosp);

    @Generated
    @Inline
    @CFunction
    public static native void __sincos(double __x, DoublePtr __sinp, DoublePtr __cosp);

    /**
     * __sinpi(x) returns the sine of pi times x; __cospi(x) and __tanpi(x) return
     * the cosine and tangent, respectively. These functions can produce a more
     * accurate answer than expressions of the form sin(M_PI * x) because they
     * avoid any loss of precision that results from rounding the result of the
     * multiplication M_PI * x. They may also be significantly more efficient in
     * some cases because the argument reduction for these functions is easier
     * to compute. Consult the man pages for edge case details.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native float __cospif(float arg1);

    /**
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native double __cospi(double arg1);

    /**
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native float __sinpif(float arg1);

    /**
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native double __sinpi(double arg1);

    /**
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native float __tanpif(float arg1);

    /**
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native double __tanpi(double arg1);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native double j0(double arg1);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native double j1(double arg1);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native double jn(int arg1, double arg2);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native double y0(double arg1);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native double y1(double arg1);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native double yn(int arg1, double arg2);

    @Generated
    @CFunction
    public static native double scalb(double arg1, double arg2);

    /**
     * Create a heap based copy of a Block or simply add a reference to an existing one.
     * This must be paired with Block_release to recover memory, even when running
     * under Objective-C Garbage Collection.
     * 
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native VoidPtr _Block_copy(ConstVoidPtr aBlock);

    /**
     * Lose the reference, and if heap based and last reference, recover the memory
     * 
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native void _Block_release(ConstVoidPtr aBlock);

    /**
     * Used by the compiler. Do not call this function yourself.
     * 
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native void _Block_object_assign(VoidPtr arg1, ConstVoidPtr arg2, int arg3);

    /**
     * Used by the compiler. Do not call this function yourself.
     * 
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native void _Block_object_dispose(ConstVoidPtr arg1, int arg2);

    @Generated
    @CFunction
    public static native void __assert_rtn(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4);

    /**
     * See comments in <machine/_type.h> about __darwin_ct_rune_t.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long ___runetype(int arg1);

    @Generated
    @CFunction
    public static native int ___tolower(int arg1);

    @Generated
    @CFunction
    public static native int ___toupper(int arg1);

    @Generated
    @Inline
    @CFunction
    public static native int isascii(int _c);

    @Generated
    @CFunction
    public static native int __maskrune(int arg1, @NUInt long arg2);

    @Generated
    @Inline
    @CFunction
    public static native int __istype(int _c, @NUInt long _f);

    @Generated
    @Inline
    @CFunction
    public static native int __isctype(int _c, @NUInt long _f);

    @Generated
    @CFunction
    public static native int __toupper(int arg1);

    @Generated
    @CFunction
    public static native int __tolower(int arg1);

    @Generated
    @Inline
    @CFunction
    public static native int __wcwidth(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int isalnum(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int isalpha(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int isblank(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int iscntrl(int _c);

    /**
     * ANSI -- locale independent
     */
    @Generated
    @Inline
    @CFunction
    public static native int isdigit(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int isgraph(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int islower(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int isprint(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int ispunct(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int isspace(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int isupper(int _c);

    /**
     * ANSI -- locale independent
     */
    @Generated
    @Inline
    @CFunction
    public static native int isxdigit(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int toascii(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int tolower(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int toupper(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int digittoint(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int ishexnumber(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int isideogram(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int isnumber(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int isphonogram(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int isrune(int _c);

    @Generated
    @Inline
    @CFunction
    public static native int isspecial(int _c);

    @Generated
    @CFunction
    public static native IntPtr __error();

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native lconv localeconv();

    @Generated
    @CFunction
    public static native BytePtr setlocale(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native int setjmp(IntPtr arg1);

    @Generated
    @CFunction
    public static native void longjmp(IntPtr arg1, int arg2);

    @Generated
    @CFunction
    public static native int _setjmp(IntPtr arg1);

    @Generated
    @CFunction
    public static native int sigsetjmp(IntPtr arg1, int arg2);

    @Generated
    @CFunction
    public static native void longjmperror();

    @Generated
    @CFunction
    public static native int raise(int arg1);

    @Nullable
    @Generated
    @CFunction
    @FunctionPtr(name = "call_bsd_signal_ret")
    public static native Function_bsd_signal_ret bsd_signal(int arg1,
            @Nullable @FunctionPtr(name = "call_bsd_signal") Function_bsd_signal arg2);

    @Generated
    @CFunction
    public static native int kill(int arg1, int arg2);

    @Generated
    @CFunction
    public static native int killpg(int arg1, int arg2);

    @Generated
    @CFunction
    public static native int pthread_kill(
            @UncertainArgument("Options: reference, array Fallback: reference") _opaque_pthread_t arg1, int arg2);

    @Generated
    @CFunction
    public static native int pthread_sigmask(int arg1, ConstIntPtr arg2, IntPtr arg3);

    @Generated
    @CFunction
    public static native int sigaction(int arg1, VoidPtr arg2, VoidPtr arg3);

    @Generated
    @CFunction
    public static native int sigaddset(IntPtr arg1, int arg2);

    @Generated
    @CFunction
    public static native int sigaltstack(
            @UncertainArgument("Options: reference, array Fallback: reference") stack_t arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") stack_t arg2);

    @Generated
    @CFunction
    public static native int sigdelset(IntPtr arg1, int arg2);

    @Generated
    @CFunction
    public static native int sigemptyset(IntPtr arg1);

    @Generated
    @CFunction
    public static native int sigfillset(IntPtr arg1);

    @Generated
    @CFunction
    public static native int sighold(int arg1);

    @Generated
    @CFunction
    public static native int sigignore(int arg1);

    @Generated
    @CFunction
    public static native int siginterrupt(int arg1, int arg2);

    @Generated
    @CFunction
    public static native int sigismember(ConstIntPtr arg1, int arg2);

    @Generated
    @CFunction
    public static native int sigpause(int arg1);

    @Generated
    @CFunction
    public static native int sigpending(IntPtr arg1);

    @Generated
    @CFunction
    public static native int sigprocmask(int arg1, ConstIntPtr arg2, IntPtr arg3);

    @Generated
    @CFunction
    public static native int sigrelse(int arg1);

    @Nullable
    @Generated
    @CFunction
    @FunctionPtr(name = "call_sigset_ret")
    public static native Function_sigset_ret sigset(int arg1,
            @Nullable @FunctionPtr(name = "call_sigset") Function_sigset arg2);

    @Generated
    @CFunction
    public static native int sigsuspend(ConstIntPtr arg1);

    @Generated
    @CFunction
    public static native int sigwait(ConstIntPtr arg1, IntPtr arg2);

    @Generated
    @CFunction
    public static native void psignal(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native int sigblock(int arg1);

    @Generated
    @CFunction
    public static native int sigsetmask(int arg1);

    @Generated
    @CFunction
    public static native int sigvec(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") sigvec arg2,
            @UncertainArgument("Options: reference, array Fallback: reference") sigvec arg3);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int renameat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4);

    /**
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native int renamex_np(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3);

    /**
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native int renameatx_np(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4, int arg5);

    /**
     * ANSI-C
     */
    @Generated
    @CFunction
    public static native void clearerr(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int fclose(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int feof(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int ferror(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int fflush(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int fgetc(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int fgetpos(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            LongPtr arg2);

    @Generated
    @CFunction
    public static native BytePtr fgets(BytePtr arg1, int arg2,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg3);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native FILE fopen(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __filename,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __mode);

    @Generated
    @Variadic()
    @CFunction
    public static native int fprintf(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Object... varargs);

    @Generated
    @CFunction
    public static native int fputc(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

    @Generated
    @CFunction
    public static native int fputs(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

    @Generated
    @CFunction
    @NUInt
    public static native long fread(VoidPtr __ptr, @NUInt long __size, @NUInt long __nitems,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE __stream);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native FILE freopen(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg3);

    @Generated
    @Variadic()
    @CFunction
    public static native int fscanf(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Object... varargs);

    @Generated
    @CFunction
    public static native int fseek(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            @NInt long arg2, int arg3);

    @Generated
    @CFunction
    public static native int fsetpos(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            ConstLongPtr arg2);

    @Generated
    @CFunction
    @NInt
    public static native long ftell(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    @NUInt
    public static native long fwrite(ConstVoidPtr __ptr, @NUInt long __size, @NUInt long __nitems,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE __stream);

    @Generated
    @CFunction
    public static native int getc(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int getchar();

    @Generated
    @CFunction
    public static native BytePtr gets(BytePtr arg1);

    @Generated
    @CFunction
    public static native void perror(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @Variadic()
    @CFunction
    public static native int printf(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            Object... varargs);

    @Generated
    @CFunction
    public static native int putc(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

    @Generated
    @CFunction
    public static native int putchar(int arg1);

    @Generated
    @CFunction
    public static native int puts(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int remove(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int rename(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __old,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __new);

    @Generated
    @CFunction
    public static native void rewind(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @Variadic()
    @CFunction
    public static native int scanf(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            Object... varargs);

    @Generated
    @CFunction
    public static native void setbuf(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            BytePtr arg2);

    @Generated
    @CFunction
    public static native int setvbuf(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            BytePtr arg2, int arg3, @NUInt long arg4);

    @Generated
    @Variadic()
    @CFunction
    public static native int sprintf(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native int sscanf(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Object... varargs);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native FILE tmpfile();

    @Generated
    @CFunction
    public static native BytePtr tmpnam(BytePtr arg1);

    @Generated
    @CFunction
    public static native int ungetc(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

    @Generated
    @CFunction
    public static native int vfprintf(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            BytePtr arg3);

    @Generated
    @CFunction
    public static native int vprintf(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            BytePtr arg2);

    @Generated
    @CFunction
    public static native int vsprintf(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            BytePtr arg3);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native FILE fdopen(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native int fileno(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int pclose(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native FILE popen(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    /**
     * Functions internal to the implementation.
     */
    @Generated
    @CFunction
    public static native int __srget(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int __svfscanf(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            BytePtr arg3);

    @Generated
    @CFunction
    public static native int __swbuf(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

    @Generated
    @Inline
    @CFunction
    public static native int __sputc(int _c,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE _p);

    @Generated
    @CFunction
    public static native void flockfile(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int ftrylockfile(
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native void funlockfile(
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int getc_unlocked(
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int getchar_unlocked();

    @Generated
    @CFunction
    public static native int putc_unlocked(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

    @Generated
    @CFunction
    public static native int putchar_unlocked(int arg1);

    @Generated
    @CFunction
    public static native int getw(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int putw(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

    @Generated
    @CFunction
    public static native BytePtr tempnam(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __dir,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __prefix);

    @Generated
    @CFunction
    public static native int fseeko(@UncertainArgument("Options: reference, array Fallback: reference") FILE __stream,
            long __offset, int __whence);

    @Generated
    @CFunction
    public static native long ftello(@UncertainArgument("Options: reference, array Fallback: reference") FILE __stream);

    @Generated
    @Variadic()
    @CFunction
    public static native int snprintf(BytePtr __str, @NUInt long __size,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __format,
            Object... varargs);

    @Generated
    @CFunction
    public static native int vfscanf(@UncertainArgument("Options: reference, array Fallback: reference") FILE __stream,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __format,
            BytePtr arg3);

    @Generated
    @CFunction
    public static native int vscanf(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __format,
            BytePtr arg2);

    @Generated
    @CFunction
    public static native int vsnprintf(BytePtr __str, @NUInt long __size,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __format,
            BytePtr arg4);

    @Generated
    @CFunction
    public static native int vsscanf(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __str,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __format,
            BytePtr arg3);

    /**
     * API-Since: 4.3
     */
    @Generated
    @Variadic()
    @CFunction
    public static native int dprintf(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Object... varargs);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native int vdprintf(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            BytePtr arg3);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    @NInt
    public static native long getdelim(Ptr<BytePtr> __linep, NUIntPtr __linecapp, int __delimiter,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE __stream);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    @NInt
    public static native long getline(Ptr<BytePtr> __linep, NUIntPtr __linecapp,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE __stream);

    @Generated
    @Variadic()
    @CFunction
    public static native int asprintf(Ptr<BytePtr> arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Object... varargs);

    @Generated
    @CFunction
    public static native BytePtr ctermid_r(BytePtr arg1);

    @Generated
    @CFunction
    public static native BytePtr fgetln(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            NUIntPtr arg2);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String fmtcheck(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native int fpurge(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native void setbuffer(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            BytePtr arg2, int arg3);

    @Generated
    @CFunction
    public static native int setlinebuf(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @CFunction
    public static native int vasprintf(Ptr<BytePtr> arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            BytePtr arg3);

    /**
     * Stdio function-access interface.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native FILE funopen(ConstVoidPtr arg1,
            @Nullable @FunctionPtr(name = "call_funopen_1") Function_funopen_1 arg2,
            @Nullable @FunctionPtr(name = "call_funopen_2") Function_funopen_2 arg3,
            @Nullable @FunctionPtr(name = "call_funopen_3") Function_funopen_3 arg4,
            @Nullable @FunctionPtr(name = "call_funopen_4") Function_funopen_4 arg5);

    @Generated
    @Variadic()
    @CFunction
    public static native int __sprintf_chk(BytePtr arg1, int arg2, @NUInt long arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
            Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native int __snprintf_chk(BytePtr arg1, @NUInt long arg2, int arg3, @NUInt long arg4,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg5,
            Object... varargs);

    @Generated
    @CFunction
    public static native int __vsprintf_chk(BytePtr arg1, int arg2, @NUInt long arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
            BytePtr arg5);

    @Generated
    @CFunction
    public static native int __vsnprintf_chk(BytePtr arg1, @NUInt long arg2, int arg3, @NUInt long arg4,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg5,
            BytePtr arg6);

    @Generated
    @CFunction
    public static native int getpriority(int arg1, int arg2);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int getiopolicy_np(int arg1, int arg2);

    @Generated
    @CFunction
    public static native int getrlimit(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") rlimit arg2);

    @Generated
    @CFunction
    public static native int getrusage(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") rusage arg2);

    @Generated
    @CFunction
    public static native int setpriority(int arg1, int arg2, int arg3);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int setiopolicy_np(int arg1, int arg2, int arg3);

    @Generated
    @CFunction
    public static native int setrlimit(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") rlimit arg2);

    @Generated
    @CFunction("wait")
    public static native int wait_c(IntPtr arg1);

    @Generated
    @CFunction
    public static native int waitpid(int arg1, IntPtr arg2, int arg3);

    @Generated
    @CFunction
    public static native int waitid(int arg1, int arg2, VoidPtr arg3, int arg4);

    @Generated
    @CFunction
    public static native int wait3(IntPtr arg1, int arg2,
            @UncertainArgument("Options: reference, array Fallback: reference") rusage arg3);

    @Generated
    @CFunction
    public static native int wait4(int arg1, IntPtr arg2, int arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") rusage arg4);

    @Generated
    @CFunction
    public static native VoidPtr alloca(@NUInt long arg1);

    @Generated
    @CFunction
    public static native void abort();

    @Generated
    @CFunction
    public static native int abs(int arg1);

    @Generated
    @CFunction
    public static native int atexit(@NotNull @FunctionPtr(name = "call_atexit") Function_atexit arg1);

    @Generated
    @CFunction
    public static native double atof(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int atoi(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    @NInt
    public static native long atol(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native long atoll(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native VoidPtr bsearch(ConstVoidPtr __key, ConstVoidPtr __base, @NUInt long __nel,
            @NUInt long __width, @NotNull @FunctionPtr(name = "call_bsearch") Function_bsearch __compar);

    @Generated
    @CFunction
    public static native VoidPtr calloc(@NUInt long __count, @NUInt long __size);

    /**
     * calloc is now declared in _malloc.h
     */
    @Generated
    @CFunction
    @ByValue
    public static native div_t div(int arg1, int arg2);

    @Generated
    @CFunction
    public static native void exit(int arg1);

    @Generated
    @CFunction
    public static native void free(VoidPtr arg1);

    /**
     * free is now declared in _malloc.h
     */
    @Generated
    @CFunction
    public static native BytePtr getenv(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    @NInt
    public static native long labs(@NInt long arg1);

    @Generated
    @CFunction
    @ByValue
    public static native ldiv_t ldiv(@NInt long arg1, @NInt long arg2);

    @Generated
    @CFunction
    public static native long llabs(long arg1);

    @Generated
    @CFunction
    @ByValue
    public static native lldiv_t lldiv(long arg1, long arg2);

    @Generated
    @CFunction
    public static native VoidPtr malloc(@NUInt long __size);

    /**
     * malloc is now declared in _malloc.h
     */
    @Generated
    @CFunction
    public static native int mblen(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s,
            @NUInt long __n);

    @Generated
    @CFunction
    @NUInt
    public static native long mbstowcs(IntPtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @NUInt long arg3);

    @Generated
    @CFunction
    public static native int mbtowc(IntPtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @NUInt long arg3);

    /**
     * rdar://120689514
     * 
     * API-Since: 3.0
     */
    @Generated
    @CFunction
    public static native int posix_memalign(Ptr<VoidPtr> __memptr, @NUInt long __alignment, @NUInt long __size);

    /**
     * posix_memalign is now declared in _malloc.h
     */
    @Generated
    @CFunction
    public static native void qsort(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @NotNull @FunctionPtr(name = "call_qsort") Function_qsort __compar);

    @Generated
    @CFunction
    public static native int rand();

    @Generated
    @CFunction
    public static native VoidPtr realloc(VoidPtr __ptr, @NUInt long __size);

    /**
     * realloc is now declared in _malloc.h
     */
    @Generated
    @CFunction
    public static native void srand(int arg1);

    @Generated
    @CFunction
    public static native double strtod(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            Ptr<BytePtr> arg2);

    @Generated
    @CFunction
    public static native float strtof(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            Ptr<BytePtr> arg2);

    @Generated
    @CFunction
    @NInt
    public static native long strtol(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __str,
            Ptr<BytePtr> __endptr, int __base);

    @Generated
    @CFunction
    public static native long strtoll(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __str,
            Ptr<BytePtr> __endptr, int __base);

    @Generated
    @CFunction
    @NUInt
    public static native long strtoul(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __str,
            Ptr<BytePtr> __endptr, int __base);

    @Generated
    @CFunction
    public static native long strtoull(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __str,
            Ptr<BytePtr> __endptr, int __base);

    @Generated
    @CFunction
    @NUInt
    public static native long wcstombs(BytePtr arg1, ConstIntPtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native int wctomb(BytePtr arg1, int arg2);

    @Generated
    @CFunction
    @NInt
    public static native long a64l(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native double drand48();

    @Generated
    @CFunction
    public static native BytePtr ecvt(double arg1, int arg2, IntPtr arg3, IntPtr arg4);

    @Generated
    @CFunction
    public static native BytePtr fcvt(double arg1, int arg2, IntPtr arg3, IntPtr arg4);

    @Generated
    @CFunction
    public static native BytePtr gcvt(double arg1, int arg2, BytePtr arg3);

    @Generated
    @CFunction
    public static native int grantpt(int arg1);

    @Generated
    @CFunction
    public static native BytePtr initstate(int arg1, BytePtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native BytePtr l64a(@NInt long arg1);

    @Generated
    @CFunction
    @NInt
    public static native long lrand48();

    @Generated
    @CFunction
    @NInt
    public static native long mrand48();

    @Generated
    @CFunction
    public static native int posix_openpt(int arg1);

    @Generated
    @CFunction
    public static native BytePtr ptsname(int arg1);

    @Generated
    @CFunction
    public static native int putenv(BytePtr arg1);

    @Generated
    @CFunction
    @NInt
    public static native long random();

    @Generated
    @CFunction
    public static native int rand_r(IntPtr arg1);

    @Generated
    @CFunction
    public static native BytePtr realpath(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            BytePtr arg2);

    @Generated
    @CFunction
    public static native int setenv(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __value,
            int __overwrite);

    @Generated
    @CFunction
    public static native BytePtr setstate(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native void srand48(@NInt long arg1);

    @Generated
    @CFunction
    public static native void srandom(int arg1);

    @Generated
    @CFunction
    public static native int unlockpt(int arg1);

    @Generated
    @CFunction
    public static native int unsetenv(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int arc4random();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: use arc4random_stir
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void arc4random_addrandom(BytePtr arg1, int arg2);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native void arc4random_buf(VoidPtr __buf, @NUInt long __nbytes);

    @Generated
    @CFunction
    public static native void arc4random_stir();

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native int arc4random_uniform(int __upper_bound);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native int atexit_b(@NotNull @ObjCBlock(name = "call_atexit_b") Block_atexit_b arg1);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native VoidPtr bsearch_b(ConstVoidPtr __key, ConstVoidPtr __base, @NUInt long __nel,
            @NUInt long __width, @NotNull @ObjCBlock(name = "call_bsearch_b") Block_bsearch_b __compar);

    /**
     * getcap(3) functions
     */
    @Generated
    @CFunction
    public static native BytePtr cgetcap(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3);

    @Generated
    @CFunction
    public static native int cgetclose();

    @Generated
    @CFunction
    public static native int cgetent(Ptr<BytePtr> arg1, Ptr<BytePtr> arg2,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3);

    @Generated
    @CFunction
    public static native int cgetfirst(Ptr<BytePtr> arg1, Ptr<BytePtr> arg2);

    @Generated
    @CFunction
    public static native int cgetmatch(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native int cgetnext(Ptr<BytePtr> arg1, Ptr<BytePtr> arg2);

    @Generated
    @CFunction
    public static native int cgetnum(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            NIntPtr arg3);

    @Generated
    @CFunction
    public static native int cgetset(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int cgetstr(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Ptr<BytePtr> arg3);

    @Generated
    @CFunction
    public static native int cgetustr(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Ptr<BytePtr> arg3);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use posix_spawn APIs instead.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int daemon(int arg1, int arg2);

    @Generated
    @CFunction
    public static native BytePtr devname(int arg1, char arg2);

    @Generated
    @CFunction
    public static native BytePtr devname_r(int arg1, char arg2, BytePtr buf, int len);

    @Generated
    @CFunction
    public static native BytePtr getbsize(IntPtr arg1, NIntPtr arg2);

    @Generated
    @CFunction
    public static native int getloadavg(DoublePtr arg1, int arg2);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String getprogname();

    @Generated
    @CFunction
    public static native int heapsort(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @NotNull @FunctionPtr(name = "call_heapsort") Function_heapsort __compar);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native int heapsort_b(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @NotNull @ObjCBlock(name = "call_heapsort_b") Block_heapsort_b __compar);

    @Generated
    @CFunction
    public static native int mergesort(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @NotNull @FunctionPtr(name = "call_mergesort") Function_mergesort __compar);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native int mergesort_b(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @NotNull @ObjCBlock(name = "call_mergesort_b") Block_mergesort_b __compar);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native void psort(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @NotNull @FunctionPtr(name = "call_psort") Function_psort __compar);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native void psort_b(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @NotNull @ObjCBlock(name = "call_psort_b") Block_psort_b __compar);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native void psort_r(VoidPtr __base, @NUInt long __nel, @NUInt long __width, VoidPtr arg4,
            @NotNull @FunctionPtr(name = "call_psort_r") Function_psort_r __compar);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native void qsort_b(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @NotNull @ObjCBlock(name = "call_qsort_b") Block_qsort_b __compar);

    @Generated
    @CFunction
    public static native void qsort_r(VoidPtr __base, @NUInt long __nel, @NUInt long __width, VoidPtr arg4,
            @NotNull @FunctionPtr(name = "call_qsort_r") Function_qsort_r __compar);

    @Generated
    @CFunction
    public static native int radixsort(
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] __base,
            int __nel,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __table,
            int __endbyte);

    @Generated
    @CFunction
    public static native void setprogname(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int sradixsort(
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] __base,
            int __nel,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __table,
            int __endbyte);

    @Generated
    @CFunction
    public static native void sranddev();

    @Generated
    @CFunction
    public static native void srandomdev();

    @Generated
    @CFunction
    public static native VoidPtr reallocf(VoidPtr __ptr, @NUInt long __size);

    @Generated
    @CFunction
    public static native long strtoq(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __str,
            Ptr<BytePtr> __endptr, int __base);

    @Generated
    @CFunction
    public static native long strtouq(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __str,
            Ptr<BytePtr> __endptr, int __base);

    /**
     * ANSI-C
     */
    @Generated
    @CFunction
    public static native VoidPtr memchr(ConstVoidPtr __s, int __c, @NUInt long __n);

    @Generated
    @CFunction
    public static native int memcmp(ConstVoidPtr __s1, ConstVoidPtr __s2, @NUInt long __n);

    @Generated
    @CFunction
    public static native VoidPtr memcpy(VoidPtr __dst, ConstVoidPtr __src, @NUInt long __n);

    @Generated
    @CFunction
    public static native VoidPtr memmove(VoidPtr __dst, ConstVoidPtr __src, @NUInt long __len);

    @Generated
    @CFunction
    public static native VoidPtr memset(VoidPtr __b, int __c, @NUInt long __len);

    @Generated
    @CFunction
    public static native BytePtr strcat(BytePtr __s1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s2);

    @Generated
    @CFunction
    public static native BytePtr strchr(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s, int __c);

    @Generated
    @CFunction
    public static native int strcmp(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s2);

    @Generated
    @CFunction
    public static native int strcoll(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s2);

    @Generated
    @CFunction
    public static native BytePtr strcpy(BytePtr __dst,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __src);

    @Generated
    @CFunction
    @NUInt
    public static native long strcspn(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __charset);

    @Generated
    @CFunction
    public static native BytePtr strerror(int __errnum);

    @Generated
    @CFunction
    @NUInt
    public static native long strlen(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s);

    @Generated
    @CFunction
    public static native BytePtr strncat(BytePtr __s1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s2,
            @NUInt long __n);

    @Generated
    @CFunction
    public static native int strncmp(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s2,
            @NUInt long __n);

    @Generated
    @CFunction
    public static native BytePtr strncpy(BytePtr __dst,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __src,
            @NUInt long __n);

    @Generated
    @CFunction
    public static native BytePtr strpbrk(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __charset);

    @Generated
    @CFunction
    public static native BytePtr strrchr(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s, int __c);

    @Generated
    @CFunction
    @NUInt
    public static native long strspn(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __charset);

    @Generated
    @CFunction
    public static native BytePtr strstr(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __big,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __little);

    @Generated
    @CFunction
    public static native BytePtr strtok(BytePtr __str,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __sep);

    @Generated
    @CFunction
    @NUInt
    public static native long strxfrm(BytePtr __s1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s2,
            @NUInt long __n);

    @Generated
    @CFunction
    public static native BytePtr strtok_r(BytePtr __str,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __sep,
            Ptr<BytePtr> __lasts);

    @Generated
    @CFunction
    public static native int strerror_r(int __errnum, BytePtr __strerrbuf, @NUInt long __buflen);

    @Generated
    @CFunction
    public static native BytePtr strdup(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s1);

    @Generated
    @CFunction
    public static native VoidPtr memccpy(VoidPtr __dst, ConstVoidPtr __src, int __c, @NUInt long __n);

    @Generated
    @CFunction
    public static native BytePtr stpcpy(BytePtr __dst,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __src);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native BytePtr stpncpy(BytePtr __dst,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __src,
            @NUInt long __n);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native BytePtr strndup(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s1,
            @NUInt long __n);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    @NUInt
    public static native long strnlen(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __s1,
            @NUInt long __n);

    @Generated
    @CFunction
    public static native BytePtr strsignal(int __sig);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native VoidPtr memmem(ConstVoidPtr __big, @NUInt long __big_len, ConstVoidPtr __little,
            @NUInt long __little_len);

    /**
     * API-Since: 3.0
     */
    @Generated
    @CFunction
    public static native void memset_pattern4(VoidPtr __b, ConstVoidPtr __pattern4, @NUInt long __len);

    /**
     * API-Since: 3.0
     */
    @Generated
    @CFunction
    public static native void memset_pattern8(VoidPtr __b, ConstVoidPtr __pattern8, @NUInt long __len);

    /**
     * API-Since: 3.0
     */
    @Generated
    @CFunction
    public static native void memset_pattern16(VoidPtr __b, ConstVoidPtr __pattern16, @NUInt long __len);

    @Generated
    @CFunction
    public static native BytePtr strcasestr(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __big,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __little);

    @Generated
    @CFunction
    public static native BytePtr strnstr(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __big,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __little,
            @NUInt long __len);

    @Generated
    @CFunction
    @NUInt
    public static native long strlcat(BytePtr __dst,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __source,
            @NUInt long __size);

    @Generated
    @CFunction
    @NUInt
    public static native long strlcpy(BytePtr __dst,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __source,
            @NUInt long __size);

    @Generated
    @CFunction
    public static native void strmode(int __mode, BytePtr __bp);

    @Generated
    @CFunction
    public static native BytePtr strsep(Ptr<BytePtr> __stringp,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __delim);

    @Generated
    @CFunction
    public static native int bcmp(ConstVoidPtr arg1, ConstVoidPtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native void bcopy(ConstVoidPtr arg1, VoidPtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native void bzero(VoidPtr arg1, @NUInt long arg2);

    @Generated
    @CFunction
    public static native BytePtr index(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2);

    @Generated
    @CFunction
    public static native BytePtr rindex(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2);

    @Generated
    @CFunction
    public static native int ffs(int arg1);

    @Generated
    @CFunction
    public static native int strcasecmp(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native int strncasecmp(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @NUInt long arg3);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int ffsl(@NInt long arg1);

    /**
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native int ffsll(long arg1);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int fls(int arg1);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int flsl(@NInt long arg1);

    /**
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native int flsll(long arg1);

    @Generated
    @CFunction
    public static native BytePtr asctime(@UncertainArgument("Options: reference, array Fallback: reference") tm arg1);

    @Generated
    @CFunction
    @NUInt
    public static native long clock();

    @Generated
    @CFunction
    public static native BytePtr ctime(ConstNIntPtr arg1);

    @Generated
    @CFunction
    public static native double difftime(@NInt long arg1, @NInt long arg2);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native tm getdate(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native tm gmtime(ConstNIntPtr arg1);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native tm localtime(ConstNIntPtr arg1);

    @Generated
    @CFunction
    @NInt
    public static native long mktime(@UncertainArgument("Options: reference, array Fallback: reference") tm arg1);

    @Generated
    @CFunction
    @NUInt
    public static native long strftime(BytePtr arg1, @NUInt long arg2,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") tm arg4);

    @Generated
    @CFunction
    public static native BytePtr strptime(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @UncertainArgument("Options: reference, array Fallback: reference") tm arg3);

    @Generated
    @CFunction
    @NInt
    public static native long time(NIntPtr arg1);

    @Generated
    @CFunction
    public static native void tzset();

    /**
     * [TSF] Thread safe functions
     */
    @Generated
    @CFunction
    public static native BytePtr asctime_r(@UncertainArgument("Options: reference, array Fallback: reference") tm arg1,
            BytePtr arg2);

    @Generated
    @CFunction
    public static native BytePtr ctime_r(ConstNIntPtr arg1, BytePtr arg2);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native tm gmtime_r(ConstNIntPtr arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") tm arg2);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native tm localtime_r(ConstNIntPtr arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") tm arg2);

    @Generated
    @CFunction
    @NInt
    public static native long posix2time(@NInt long arg1);

    @Generated
    @CFunction
    public static native void tzsetwall();

    @Generated
    @CFunction
    @NInt
    public static native long time2posix(@NInt long arg1);

    @Generated
    @CFunction
    @NInt
    public static native long timelocal(@UncertainArgument("Options: reference, array Fallback: reference") tm arg1);

    @Generated
    @CFunction
    @NInt
    public static native long timegm(@UncertainArgument("Options: reference, array Fallback: reference") tm arg1);

    @Generated
    @CFunction
    public static native int nanosleep(
            @UncertainArgument("Options: reference, array Fallback: reference") timespec __rqtp,
            @UncertainArgument("Options: reference, array Fallback: reference") timespec __rmtp);

    /**
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native int clock_getres(int __clock_id,
            @UncertainArgument("Options: reference, array Fallback: reference") timespec __res);

    /**
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native int clock_gettime(int __clock_id,
            @UncertainArgument("Options: reference, array Fallback: reference") timespec __tp);

    /**
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native long clock_gettime_nsec_np(int __clock_id);

    /**
     * 7.8.2.1
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native long imaxabs(long j);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native imaxdiv_t imaxdiv(long __numer, long __denom);

    /**
     * 7.8.2.3
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native long strtoimax(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __nptr,
            Ptr<BytePtr> __endptr, int __base);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native long strtoumax(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __nptr,
            Ptr<BytePtr> __endptr, int __base);

    /**
     * 7.8.2.4
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native long wcstoimax(ConstIntPtr __nptr, Ptr<IntPtr> __endptr, int __base);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native long wcstoumax(ConstIntPtr __nptr, Ptr<IntPtr> __endptr, int __base);

    @Generated
    @Inline
    @CFunction
    public static native int OSHostByteOrder();

    /**
     * Functions for loading native endian values.
     */
    @Generated
    @Inline
    @CFunction
    public static native char _OSReadInt16(ConstVoidPtr base, @NUInt long byteOffset);

    @Generated
    @Inline
    @CFunction
    public static native int _OSReadInt32(ConstVoidPtr base, @NUInt long byteOffset);

    @Generated
    @Inline
    @CFunction
    public static native long _OSReadInt64(ConstVoidPtr base, @NUInt long byteOffset);

    /**
     * Functions for storing native endian values.
     */
    @Generated
    @Inline
    @CFunction
    public static native void _OSWriteInt16(VoidPtr base, @NUInt long byteOffset, char data);

    @Generated
    @Inline
    @CFunction
    public static native void _OSWriteInt32(VoidPtr base, @NUInt long byteOffset, int data);

    @Generated
    @Inline
    @CFunction
    public static native void _OSWriteInt64(VoidPtr base, @NUInt long byteOffset, long data);

    /**
     * 23.1.6.1 ACL Storage Management
     */
    @Generated
    @CFunction
    public static native acl_t acl_dup(acl_t acl);

    @Generated
    @CFunction
    public static native int acl_free(VoidPtr obj_p);

    @Generated
    @CFunction
    public static native acl_t acl_init(int count);

    /**
     * 23.1.6.2 (1) ACL Entry manipulation
     */
    @Generated
    @CFunction
    public static native int acl_copy_entry(acl_entry_t dest_d, acl_entry_t src_d);

    @Generated
    @CFunction
    public static native int acl_create_entry(Ptr<acl_t> acl_p, Ptr<acl_entry_t> entry_p);

    @Generated
    @CFunction
    public static native int acl_create_entry_np(Ptr<acl_t> acl_p, Ptr<acl_entry_t> entry_p, int entry_index);

    @Generated
    @CFunction
    public static native int acl_delete_entry(acl_t acl, acl_entry_t entry_d);

    @Generated
    @CFunction
    public static native int acl_get_entry(acl_t acl, int entry_id, Ptr<acl_entry_t> entry_p);

    @Generated
    @CFunction
    public static native int acl_valid(acl_t acl);

    @Generated
    @CFunction
    public static native int acl_valid_fd_np(int fd, int type, acl_t acl);

    @Generated
    @CFunction
    public static native int acl_valid_file_np(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path, int type,
            acl_t acl);

    @Generated
    @CFunction
    public static native int acl_valid_link_np(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path, int type,
            acl_t acl);

    /**
     * 23.1.6.2 (2) Manipulate permissions within an ACL entry
     */
    @Generated
    @CFunction
    public static native int acl_add_perm(acl_permset_t permset_d, int perm);

    @Generated
    @CFunction
    public static native int acl_calc_mask(Ptr<acl_t> acl_p);

    @Generated
    @CFunction
    public static native int acl_clear_perms(acl_permset_t permset_d);

    @Generated
    @CFunction
    public static native int acl_delete_perm(acl_permset_t permset_d, int perm);

    @Generated
    @CFunction
    public static native int acl_get_perm_np(acl_permset_t permset_d, int perm);

    @Generated
    @CFunction
    public static native int acl_get_permset(acl_entry_t entry_d, Ptr<acl_permset_t> permset_p);

    @Generated
    @CFunction
    public static native int acl_set_permset(acl_entry_t entry_d, acl_permset_t permset_d);

    /**
     * nonstandard - manipulate permissions within an ACL entry using bitmasks
     * 
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native int acl_maximal_permset_mask_np(LongPtr mask_p);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native int acl_get_permset_mask_np(acl_entry_t entry_d, LongPtr mask_p);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native int acl_set_permset_mask_np(acl_entry_t entry_d, long mask);

    /**
     * nonstandard - manipulate flags on ACLs and entries
     */
    @Generated
    @CFunction
    public static native int acl_add_flag_np(acl_flagset_t flagset_d, int flag);

    @Generated
    @CFunction
    public static native int acl_clear_flags_np(acl_flagset_t flagset_d);

    @Generated
    @CFunction
    public static native int acl_delete_flag_np(acl_flagset_t flagset_d, int flag);

    @Generated
    @CFunction
    public static native int acl_get_flag_np(acl_flagset_t flagset_d, int flag);

    @Generated
    @CFunction
    public static native int acl_get_flagset_np(VoidPtr obj_p, Ptr<acl_flagset_t> flagset_p);

    @Generated
    @CFunction
    public static native int acl_set_flagset_np(VoidPtr obj_p, acl_flagset_t flagset_d);

    /**
     * 23.1.6.2 (3) Manipulate ACL entry tag type and qualifier
     */
    @Generated
    @CFunction
    public static native VoidPtr acl_get_qualifier(acl_entry_t entry_d);

    @Generated
    @CFunction
    public static native int acl_get_tag_type(acl_entry_t entry_d, IntPtr tag_type_p);

    @Generated
    @CFunction
    public static native int acl_set_qualifier(acl_entry_t entry_d, ConstVoidPtr tag_qualifier_p);

    @Generated
    @CFunction
    public static native int acl_set_tag_type(acl_entry_t entry_d, int tag_type);

    /**
     * 23.1.6.3 ACL manipulation on an Object
     */
    @Generated
    @CFunction
    public static native int acl_delete_def_file(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path_p);

    @Generated
    @CFunction
    public static native acl_t acl_get_fd(int fd);

    @Generated
    @CFunction
    public static native acl_t acl_get_fd_np(int fd, int type);

    @Generated
    @CFunction
    public static native acl_t acl_get_file(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path_p, int type);

    @Generated
    @CFunction
    public static native acl_t acl_get_link_np(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path_p, int type);

    @Generated
    @CFunction
    public static native int acl_set_fd(int fd, acl_t acl);

    @Generated
    @CFunction
    public static native int acl_set_fd_np(int fd, acl_t acl, int acl_type);

    @Generated
    @CFunction
    public static native int acl_set_file(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path_p, int type,
            acl_t acl);

    @Generated
    @CFunction
    public static native int acl_set_link_np(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path_p, int type,
            acl_t acl);

    /**
     * 23.1.6.4 ACL Format translation
     */
    @Generated
    @CFunction
    @NInt
    public static native long acl_copy_ext(VoidPtr buf_p, acl_t acl, @NInt long size);

    @Generated
    @CFunction
    @NInt
    public static native long acl_copy_ext_native(VoidPtr buf_p, acl_t acl, @NInt long size);

    @Generated
    @CFunction
    public static native acl_t acl_copy_int(ConstVoidPtr buf_p);

    @Generated
    @CFunction
    public static native acl_t acl_copy_int_native(ConstVoidPtr buf_p);

    @Generated
    @CFunction
    public static native acl_t acl_from_text(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buf_p);

    @Generated
    @CFunction
    @NInt
    public static native long acl_size(acl_t acl);

    @Generated
    @CFunction
    public static native BytePtr acl_to_text(acl_t acl, NIntPtr len_p);

    /**
     * [@function] os_unfair_lock_lock
     * 
     * Locks an os_unfair_lock.
     * 
     * @param lock
     *             Pointer to an os_unfair_lock.
     * 
     *             API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native void os_unfair_lock_lock(
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") os_unfair_lock_s lock);

    /**
     * [@function] os_unfair_lock_trylock
     * 
     * Locks an os_unfair_lock if it is not already locked.
     * 
     * It is invalid to surround this function with a retry loop, if this function
     * returns false, the program must be able to proceed without having acquired
     * the lock, or it must call os_unfair_lock_lock() directly (a retry loop around
     * os_unfair_lock_trylock() amounts to an inefficient implementation of
     * os_unfair_lock_lock() that hides the lock waiter from the system and prevents
     * resolution of priority inversions).
     * 
     * @param lock
     *             Pointer to an os_unfair_lock.
     * 
     * @return
     *         Returns true if the lock was succesfully locked and false if the lock was
     *         already locked.
     * 
     *         API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native boolean os_unfair_lock_trylock(
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") os_unfair_lock_s lock);

    /**
     * [@function] os_unfair_lock_unlock
     * 
     * Unlocks an os_unfair_lock.
     * 
     * @param lock
     *             Pointer to an os_unfair_lock.
     * 
     *             API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native void os_unfair_lock_unlock(
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") os_unfair_lock_s lock);

    @Generated
    @CFunction
    public static native int accept(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr arg2, IntPtr arg3);

    @Generated
    @CFunction
    public static native int bind(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr arg2, int arg3);

    @Generated
    @CFunction
    public static native int connect(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr arg2, int arg3);

    @Generated
    @CFunction
    public static native int getpeername(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr arg2, IntPtr arg3);

    @Generated
    @CFunction
    public static native int getsockname(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr arg2, IntPtr arg3);

    @Generated
    @CFunction
    public static native int getsockopt(int arg1, int arg2, int arg3, VoidPtr arg4, IntPtr arg5);

    @Generated
    @CFunction
    public static native int listen(int arg1, int arg2);

    @Generated
    @CFunction
    @NInt
    public static native long recv(int arg1, VoidPtr arg2, @NUInt long arg3, int arg4);

    @Generated
    @CFunction
    @NInt
    public static native long recvfrom(int arg1, VoidPtr arg2, @NUInt long arg3, int arg4,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr arg5, IntPtr arg6);

    @Generated
    @CFunction
    @NInt
    public static native long recvmsg(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") msghdr arg2, int arg3);

    @Generated
    @CFunction
    @NInt
    public static native long send(int arg1, ConstVoidPtr arg2, @NUInt long arg3, int arg4);

    @Generated
    @CFunction
    @NInt
    public static native long sendmsg(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") msghdr arg2, int arg3);

    @Generated
    @CFunction
    @NInt
    public static native long sendto(int arg1, ConstVoidPtr arg2, @NUInt long arg3, int arg4,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr arg5, int arg6);

    @Generated
    @CFunction
    public static native int setsockopt(int arg1, int arg2, int arg3, ConstVoidPtr arg4, int arg5);

    @Generated
    @CFunction
    public static native int shutdown(int arg1, int arg2);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int sockatmark(int arg1);

    @Generated
    @CFunction
    public static native int socket(int arg1, int arg2, int arg3);

    @Generated
    @CFunction
    public static native int socketpair(int arg1, int arg2, int arg3, IntPtr arg4);

    @Generated
    @CFunction
    public static native int sendfile(int arg1, int arg2, long arg3, LongPtr arg4,
            @UncertainArgument("Options: reference, array Fallback: reference") sf_hdtr arg5, int arg6);

    @Generated
    @CFunction
    public static native void pfctlinput(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr arg2);

    /**
     * API-Since: 9.0
     */
    @Generated
    @CFunction
    public static native int connectx(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") sa_endpoints arg2, int arg3, int arg4,
            @UncertainArgument("Options: reference, array Fallback: reference") iovec arg5, int arg6, NUIntPtr arg7,
            IntPtr arg8);

    /**
     * API-Since: 9.0
     */
    @Generated
    @CFunction
    public static native int disconnectx(int arg1, int arg2, int arg3);

    /**
     * Advanced (Full-state) APIs [RFC3678]
     * The RFC specifies uint_t for the 6th argument to [sg]etsourcefilter().
     * We use uint32_t here to be consistent.
     * 
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native int setipv4sourcefilter(int arg1, @ByValue in_addr arg2, @ByValue in_addr arg3, int arg4,
            int arg5, @UncertainArgument("Options: reference, array Fallback: reference") in_addr arg6);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native int getipv4sourcefilter(int arg1, @ByValue in_addr arg2, @ByValue in_addr arg3, IntPtr arg4,
            IntPtr arg5, @UncertainArgument("Options: reference, array Fallback: reference") in_addr arg6);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native int setsourcefilter(int arg1, int arg2,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr arg3, int arg4, int arg5,
            int arg6, @UncertainArgument("Options: reference, array Fallback: reference") sockaddr_storage arg7);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native int getsourcefilter(int arg1, int arg2,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr arg3, int arg4, IntPtr arg5,
            IntPtr arg6, @UncertainArgument("Options: reference, array Fallback: reference") sockaddr_storage arg7);

    @Generated
    @CFunction
    public static native int inet6_option_space(int arg1);

    @Generated
    @CFunction
    public static native int inet6_option_init(VoidPtr arg1, Ptr<Ptr<cmsghdr>> arg2, int arg3);

    @Generated
    @CFunction
    public static native int inet6_option_append(
            @UncertainArgument("Options: reference, array Fallback: reference") cmsghdr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            int arg4);

    @Generated
    @CFunction
    public static native BytePtr inet6_option_alloc(
            @UncertainArgument("Options: reference, array Fallback: reference") cmsghdr arg1, int arg2, int arg3,
            int arg4);

    @Generated
    @CFunction
    public static native int inet6_option_next(
            @UncertainArgument("Options: reference, array Fallback: reference") cmsghdr arg1, Ptr<BytePtr> arg2);

    @Generated
    @CFunction
    public static native int inet6_option_find(
            @UncertainArgument("Options: reference, array Fallback: reference") cmsghdr arg1, Ptr<BytePtr> arg2,
            int arg3);

    @Generated
    @CFunction
    @NUInt
    public static native long inet6_rthdr_space(int arg1, int arg2);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native cmsghdr inet6_rthdr_init(VoidPtr arg1, int arg2);

    @Generated
    @CFunction
    public static native int inet6_rthdr_add(
            @UncertainArgument("Options: reference, array Fallback: reference") cmsghdr arg1, VoidPtr arg2, int arg3);

    @Generated
    @CFunction
    public static native int inet6_rthdr_lasthop(
            @UncertainArgument("Options: reference, array Fallback: reference") cmsghdr arg1, int arg2);

    @Generated
    @CFunction
    public static native int inet6_rthdr_segments(
            @UncertainArgument("Options: reference, array Fallback: reference") cmsghdr arg1);

    @Generated
    @CFunction
    public static native VoidPtr inet6_rthdr_getaddr(
            @UncertainArgument("Options: reference, array Fallback: reference") cmsghdr arg1, int arg2);

    @Generated
    @CFunction
    public static native int inet6_rthdr_getflags(
            @UncertainArgument("Options: reference, array Fallback: reference") cmsghdr arg1, int arg2);

    @Generated
    @CFunction
    public static native int inet6_opt_init(VoidPtr arg1, int arg2);

    @Generated
    @CFunction
    public static native int inet6_opt_append(VoidPtr arg1, int arg2, int arg3, byte arg4, int arg5, byte arg6,
            Ptr<VoidPtr> arg7);

    @Generated
    @CFunction
    public static native int inet6_opt_finish(VoidPtr arg1, int arg2, int arg3);

    @Generated
    @CFunction
    public static native int inet6_opt_set_val(VoidPtr arg1, int arg2, VoidPtr arg3, int arg4);

    @Generated
    @CFunction
    public static native int inet6_opt_next(VoidPtr arg1, int arg2, int arg3, BytePtr arg4, IntPtr arg5,
            Ptr<VoidPtr> arg6);

    @Generated
    @CFunction
    public static native int inet6_opt_find(VoidPtr arg1, int arg2, int arg3, byte arg4, IntPtr arg5,
            Ptr<VoidPtr> arg6);

    @Generated
    @CFunction
    public static native int inet6_opt_get_val(VoidPtr arg1, int arg2, VoidPtr arg3, int arg4);

    @Generated
    @CFunction
    public static native int inet6_rth_space(int arg1, int arg2);

    @Generated
    @CFunction
    public static native VoidPtr inet6_rth_init(VoidPtr arg1, int arg2, int arg3, int arg4);

    @Generated
    @CFunction
    public static native int inet6_rth_add(VoidPtr arg1, VoidPtr arg2);

    @Generated
    @CFunction
    public static native int inet6_rth_reverse(ConstVoidPtr arg1, VoidPtr arg2);

    @Generated
    @CFunction
    public static native int inet6_rth_segments(ConstVoidPtr arg1);

    @Generated
    @CFunction
    public static native VoidPtr inet6_rth_getaddr(ConstVoidPtr arg1, int arg2);

    @Generated
    @CFunction
    public static native int bindresvport(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr_in arg2);

    @Generated
    @CFunction
    public static native int bindresvport_sa(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") sockaddr arg2);

    /**
     * getopt(3) external variables
     */
    @Generated
    @CVariable()
    public static native BytePtr optarg();

    @Generated
    @CVariable()
    public static native int optind();

    @Generated
    @CVariable()
    public static native int opterr();

    @Generated
    @CVariable()
    public static native int optopt();

    /**
     * getsubopt(3) external variable
     */
    @Generated
    @CVariable()
    public static native BytePtr suboptarg();

    @Generated
    @CVariable()
    public static native int optreset();

    @Generated
    @CVariable()
    @ByValue
    public static native security_token_t KERNEL_SECURITY_TOKEN();

    @Generated
    @CVariable()
    @ByValue
    public static native audit_token_t KERNEL_AUDIT_TOKEN();

    @Generated
    @CVariable()
    public static native int signgam();

    @Generated
    @CVariable()
    @ByValue
    public static native _RuneLocale _DefaultRuneLocale();

    @Generated
    @CVariable()
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native _RuneLocale _CurrentRuneLocale();

    @Generated
    @CVariable()
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native FILE __stdinp();

    @Generated
    @CVariable()
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native FILE __stdoutp();

    @Generated
    @CVariable()
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native FILE __stderrp();

    /**
     * perror(3) external variables
     */
    @Generated
    @CVariable()
    public static native int sys_nerr();

    @Generated
    @CVariable()
    @ReferenceInfo(type = Byte.class, depth = 2)
    public static native ConstPtr<ConstBytePtr> sys_errlist();

    @Generated
    @CVariable()
    public static native int __mb_cur_max();

    @Generated
    @CVariable()
    @ReferenceInfo(type = Byte.class, depth = 2)
    public static native Ptr<BytePtr> tzname();

    @Generated
    @CVariable()
    public static native int getdate_err();

    @Generated
    @CVariable()
    @NInt
    public static native long timezone();

    @Generated
    @CVariable()
    public static native int daylight();

    /**
     * API-Since: 10.1
     */
    @Generated
    @CFunction
    public static native int timingsafe_bcmp(ConstVoidPtr __b1, ConstVoidPtr __b2, @NUInt long __len);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_async {
        @Generated
        void call_dispatch_async();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_async_f {
        @Generated
        void call_dispatch_async_f(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_sync {
        @Generated
        void call_dispatch_sync();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_sync_f {
        @Generated
        void call_dispatch_sync_f(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_apply {
        @Generated
        void call_dispatch_apply(@NUInt long arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_apply_f {
        @Generated
        void call_dispatch_apply_f(@Nullable VoidPtr arg0, @NUInt long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_after {
        @Generated
        void call_dispatch_after();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_after_f {
        @Generated
        void call_dispatch_after_f(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_barrier_async {
        @Generated
        void call_dispatch_barrier_async();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_barrier_async_f {
        @Generated
        void call_dispatch_barrier_async_f(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_barrier_sync {
        @Generated
        void call_dispatch_barrier_sync();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_barrier_sync_f {
        @Generated
        void call_dispatch_barrier_sync_f(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_queue_set_specific {
        @Generated
        void call_dispatch_queue_set_specific(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_block_create_ret {
        @Generated
        void call_dispatch_block_create_ret();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_block_create {
        @Generated
        void call_dispatch_block_create();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_block_create_with_qos_class_ret {
        @Generated
        void call_dispatch_block_create_with_qos_class_ret();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_block_create_with_qos_class {
        @Generated
        void call_dispatch_block_create_with_qos_class();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_block_perform {
        @Generated
        void call_dispatch_block_perform();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_block_wait {
        @Generated
        void call_dispatch_block_wait();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_block_notify_0 {
        @Generated
        void call_dispatch_block_notify_0();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_block_notify_2 {
        @Generated
        void call_dispatch_block_notify_2();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_block_cancel {
        @Generated
        void call_dispatch_block_cancel();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_block_testcancel {
        @Generated
        void call_dispatch_block_testcancel();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_signal_ret {
        @Generated
        void call_signal_ret(int arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_signal {
        @Generated
        void call_signal(int arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_source_set_event_handler {
        @Generated
        void call_dispatch_source_set_event_handler();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_source_set_event_handler_f {
        @Generated
        void call_dispatch_source_set_event_handler_f(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_source_set_cancel_handler {
        @Generated
        void call_dispatch_source_set_cancel_handler();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_source_set_cancel_handler_f {
        @Generated
        void call_dispatch_source_set_cancel_handler_f(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_source_set_registration_handler {
        @Generated
        void call_dispatch_source_set_registration_handler();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_source_set_registration_handler_f {
        @Generated
        void call_dispatch_source_set_registration_handler_f(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_group_async {
        @Generated
        void call_dispatch_group_async();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_group_async_f {
        @Generated
        void call_dispatch_group_async_f(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_group_notify {
        @Generated
        void call_dispatch_group_notify();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_group_notify_f {
        @Generated
        void call_dispatch_group_notify_f(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_once {
        @Generated
        void call_dispatch_once();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block__dispatch_once {
        @Generated
        void call__dispatch_once();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_once_f {
        @Generated
        void call_dispatch_once_f(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function__dispatch_once_f {
        @Generated
        void call__dispatch_once_f(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_data_create {
        @Generated
        void call_dispatch_data_create();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_data_apply {
        @Generated
        boolean call_dispatch_data_apply(@NotNull dispatch_data_t region, @NUInt long offset,
                @NotNull ConstVoidPtr buffer, @NUInt long size);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_read {
        @Generated
        void call_dispatch_read(@NotNull dispatch_data_t arg0, int arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_write {
        @Generated
        void call_dispatch_write(@Nullable dispatch_data_t arg0, int arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_io_create {
        @Generated
        void call_dispatch_io_create(int arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_io_create_with_path {
        @Generated
        void call_dispatch_io_create_with_path(int arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_io_create_with_io {
        @Generated
        void call_dispatch_io_create_with_io(int arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_io_read {
        @Generated
        void call_dispatch_io_read(boolean done, @Nullable dispatch_data_t data, int error);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_io_write {
        @Generated
        void call_dispatch_io_write(boolean done, @Nullable dispatch_data_t data, int error);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_io_barrier {
        @Generated
        void call_dispatch_io_barrier();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_bsd_signal_ret {
        @Generated
        void call_bsd_signal_ret(int arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_bsd_signal {
        @Generated
        void call_bsd_signal(int arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_sigset_ret {
        @Generated
        void call_sigset_ret(int arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_sigset {
        @Generated
        void call_sigset(int arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_funopen_1 {
        @Generated
        int call_funopen_1(VoidPtr arg0, BytePtr arg1, int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_funopen_2 {
        @Generated
        int call_funopen_2(VoidPtr arg0,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
                int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_funopen_3 {
        @Generated
        long call_funopen_3(VoidPtr arg0, long arg1, int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_funopen_4 {
        @Generated
        int call_funopen_4(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_atexit {
        @Generated
        void call_atexit();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_bsearch {
        @Generated
        int call_bsearch(ConstVoidPtr arg0, ConstVoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_qsort {
        @Generated
        int call_qsort(ConstVoidPtr arg0, ConstVoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_atexit_b {
        @Generated
        void call_atexit_b();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_bsearch_b {
        @Generated
        int call_bsearch_b(ConstVoidPtr arg0, ConstVoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_heapsort {
        @Generated
        int call_heapsort(ConstVoidPtr arg0, ConstVoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_heapsort_b {
        @Generated
        int call_heapsort_b(ConstVoidPtr arg0, ConstVoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_mergesort {
        @Generated
        int call_mergesort(ConstVoidPtr arg0, ConstVoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_mergesort_b {
        @Generated
        int call_mergesort_b(ConstVoidPtr arg0, ConstVoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_psort {
        @Generated
        int call_psort(ConstVoidPtr arg0, ConstVoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_psort_b {
        @Generated
        int call_psort_b(ConstVoidPtr arg0, ConstVoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_psort_r {
        @Generated
        int call_psort_r(VoidPtr arg0, ConstVoidPtr arg1, ConstVoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_qsort_b {
        @Generated
        int call_qsort_b(ConstVoidPtr arg0, ConstVoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_qsort_r {
        @Generated
        int call_qsort_r(VoidPtr arg0, ConstVoidPtr arg1, ConstVoidPtr arg2);
    }

    @Generated
    @Inline
    @CFunction
    public static native float vrndns_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vsha1h_u32(int __p0);

    @Generated
    @Inline
    @CFunction
    public static native double vabdd_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native float vabds_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vabsd_s64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vaddd_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vaddd_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcaged_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vcages_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcagtd_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vcagts_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcaled_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vcales_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcaltd_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vcalts_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vceqd_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vceqd_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vceqd_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vceqs_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vceqzd_u64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vceqzd_s64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vceqzd_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vceqzs_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcged_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcged_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcged_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vcges_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcgezd_s64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcgezd_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcgezs_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcgtd_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcgtd_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcgtd_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vcgts_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcgtzd_s64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcgtzd_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcgtzs_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcled_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcled_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcled_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vcles_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vclezd_s64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vclezd_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vclezs_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcltd_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcltd_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcltd_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vclts_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vcltzd_s64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcltzd_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcltzs_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native float vcvts_f32_s32(int __p0);

    @Generated
    @Inline
    @CFunction
    public static native float vcvts_f32_u32(int __p0);

    @Generated
    @Inline
    @CFunction
    public static native double vcvtd_f64_s64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native double vcvtd_f64_u64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcvts_s32_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcvtd_s64_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcvts_u32_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcvtd_u64_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcvtas_s32_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcvtad_s64_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcvtas_u32_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcvtad_u64_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcvtms_s32_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcvtmd_s64_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcvtms_u32_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcvtmd_u64_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcvtns_s32_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcvtnd_s64_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcvtns_u32_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcvtnd_u64_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcvtps_s32_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcvtpd_s64_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vcvtps_u32_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vcvtpd_u64_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native float vcvtxd_f32_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native double vmulxd_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native float vmulxs_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vnegd_s64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native byte vqabsb_s8(byte __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vqabss_s32(int __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vqabsd_s64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native short vqabsh_s16(short __p0);

    @Generated
    @Inline
    @CFunction
    public static native byte vqaddb_u8(byte __p0, byte __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vqadds_u32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vqaddd_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native char vqaddh_u16(char __p0, char __p1);

    @Generated
    @Inline
    @CFunction
    public static native byte vqaddb_s8(byte __p0, byte __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vqadds_s32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vqaddd_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native short vqaddh_s16(short __p0, short __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vqdmlals_s32(long __p0, int __p1, int __p2);

    @Generated
    @Inline
    @CFunction
    public static native int vqdmlalh_s16(int __p0, short __p1, short __p2);

    @Generated
    @Inline
    @CFunction
    public static native long vqdmlsls_s32(long __p0, int __p1, int __p2);

    @Generated
    @Inline
    @CFunction
    public static native int vqdmlslh_s16(int __p0, short __p1, short __p2);

    @Generated
    @Inline
    @CFunction
    public static native int vqdmulhs_s32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native short vqdmulhh_s16(short __p0, short __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vqdmulls_s32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vqdmullh_s16(short __p0, short __p1);

    @Generated
    @Inline
    @CFunction
    public static native short vqmovns_s32(int __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vqmovnd_s64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native byte vqmovnh_s16(short __p0);

    @Generated
    @Inline
    @CFunction
    public static native char vqmovns_u32(int __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vqmovnd_u64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native byte vqmovnh_u16(char __p0);

    @Generated
    @Inline
    @CFunction
    public static native char vqmovuns_s32(int __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vqmovund_s64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native byte vqmovunh_s16(short __p0);

    @Generated
    @Inline
    @CFunction
    public static native byte vqnegb_s8(byte __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vqnegs_s32(int __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vqnegd_s64(long __p0);

    @Generated
    @Inline
    @CFunction
    public static native short vqnegh_s16(short __p0);

    @Generated
    @Inline
    @CFunction
    public static native int vqrdmulhs_s32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native short vqrdmulhh_s16(short __p0, short __p1);

    @Generated
    @Inline
    @CFunction
    public static native byte vqrshlb_u8(byte __p0, byte __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vqrshls_u32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vqrshld_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native char vqrshlh_u16(char __p0, short __p1);

    @Generated
    @Inline
    @CFunction
    public static native byte vqrshlb_s8(byte __p0, byte __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vqrshls_s32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vqrshld_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native short vqrshlh_s16(short __p0, short __p1);

    @Generated
    @Inline
    @CFunction
    public static native byte vqshlb_u8(byte __p0, byte __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vqshls_u32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vqshld_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native char vqshlh_u16(char __p0, short __p1);

    @Generated
    @Inline
    @CFunction
    public static native byte vqshlb_s8(byte __p0, byte __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vqshls_s32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vqshld_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native short vqshlh_s16(short __p0, short __p1);

    @Generated
    @Inline
    @CFunction
    public static native byte vqsubb_u8(byte __p0, byte __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vqsubs_u32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vqsubd_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native char vqsubh_u16(char __p0, char __p1);

    @Generated
    @Inline
    @CFunction
    public static native byte vqsubb_s8(byte __p0, byte __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vqsubs_s32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vqsubd_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native short vqsubh_s16(short __p0, short __p1);

    @Generated
    @Inline
    @CFunction
    public static native double vrecped_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native float vrecpes_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native double vrecpsd_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native float vrecpss_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native double vrecpxd_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native float vrecpxs_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native long vrshld_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vrshld_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native double vrsqrted_f64(double __p0);

    @Generated
    @Inline
    @CFunction
    public static native float vrsqrtes_f32(float __p0);

    @Generated
    @Inline
    @CFunction
    public static native double vrsqrtsd_f64(double __p0, double __p1);

    @Generated
    @Inline
    @CFunction
    public static native float vrsqrtss_f32(float __p0, float __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vshld_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vshld_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native byte vsqaddb_u8(byte __p0, byte __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vsqadds_u32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vsqaddd_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native char vsqaddh_u16(char __p0, short __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vsubd_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vsubd_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vtstd_u64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vtstd_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native byte vuqaddb_s8(byte __p0, byte __p1);

    @Generated
    @Inline
    @CFunction
    public static native int vuqadds_s32(int __p0, int __p1);

    @Generated
    @Inline
    @CFunction
    public static native long vuqaddd_s64(long __p0, long __p1);

    @Generated
    @Inline
    @CFunction
    public static native short vuqaddh_s16(short __p0, char __p1);

    /**
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native int setattrlistat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            VoidPtr arg3, VoidPtr arg4, @NUInt long arg5, int arg6);

    /**
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native BytePtr mkdtempat_np(int dfd, BytePtr path);

    /**
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native int mkstempsat_np(int dfd, BytePtr path, int slen);

    /**
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native int mkostempsat_np(int dfd, BytePtr path, int slen, int oflags);

    /**
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native FILE fmemopen(VoidPtr __buf, @NUInt long __size,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __mode);

    /**
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native FILE open_memstream(Ptr<BytePtr> __bufp, NUIntPtr __sizep);

    @Generated
    @CFunction
    public static native int audit(ConstVoidPtr arg1, int arg2);

    @Generated
    @CFunction
    public static native int auditon(int arg1, VoidPtr arg2, int arg3);

    @Generated
    @CFunction
    public static native int auditctl(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int getauid(IntPtr arg1);

    @Generated
    @CFunction
    public static native int setauid(ConstIntPtr arg1);

    @Generated
    @CFunction
    public static native int getaudit_addr(
            @UncertainArgument("Options: reference, array Fallback: reference") auditinfo_addr arg1, int arg2);

    @Generated
    @CFunction
    public static native int setaudit_addr(
            @UncertainArgument("Options: reference, array Fallback: reference") auditinfo_addr arg1, int arg2);

    /**
     * getaudit()/setaudit() are deprecated and have been replaced with
     * wrappers to the getaudit_addr()/setaudit_addr() syscalls above.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int getaudit(
            @UncertainArgument("Options: reference, array Fallback: reference") auditinfo arg1);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int setaudit(
            @UncertainArgument("Options: reference, array Fallback: reference") auditinfo arg1);

    @Generated
    @CFunction
    public static native int audit_session_self();

    @Generated
    @CFunction
    public static native int audit_session_join(int port);

    @Generated
    @CFunction
    public static native int audit_session_port(int asid, IntPtr portname);

    /**
     * API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void dispatch_async_and_wait(@NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_async_and_wait") Block_dispatch_async_and_wait block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_async_and_wait {
        @Generated
        void call_dispatch_async_and_wait();
    }

    /**
     * [@function] dispatch_async_and_wait_f
     * 
     * Submits a function for synchronous execution on a dispatch queue.
     * 
     * See dispatch_async_and_wait() for details.
     * 
     * @param queue
     *                The target dispatch queue to which the function is submitted.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param context
     *                The application-defined context parameter to pass to the function.
     * 
     * @param work
     *                The application-defined function to invoke on the target queue. The first
     *                parameter passed to this function is the context provided to
     *                dispatch_async_and_wait_f().
     *                The result of passing NULL in this parameter is undefined.
     * 
     *                API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void dispatch_async_and_wait_f(@NotNull dispatch_queue_t queue, @Nullable VoidPtr context,
            @NotNull @FunctionPtr(name = "call_dispatch_async_and_wait_f") Function_dispatch_async_and_wait_f work);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_async_and_wait_f {
        @Generated
        void call_dispatch_async_and_wait_f(@Nullable VoidPtr arg0);
    }

    /**
     * API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void dispatch_barrier_async_and_wait(@NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_dispatch_barrier_async_and_wait") Block_dispatch_barrier_async_and_wait block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_barrier_async_and_wait {
        @Generated
        void call_dispatch_barrier_async_and_wait();
    }

    /**
     * [@function] dispatch_barrier_async_and_wait_f
     * 
     * Submits a function for synchronous execution on a dispatch queue.
     * 
     * Submits a function to a dispatch queue like dispatch_async_and_wait_f(), but
     * marks that function as a barrier (relevant only on DISPATCH_QUEUE_CONCURRENT
     * queues).
     * 
     * See "Dispatch Barrier API" for a description of the barrier semantics.
     * 
     * @param queue
     *                The target dispatch queue to which the function is submitted.
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param context
     *                The application-defined context parameter to pass to the function.
     * 
     * @param work
     *                The application-defined function to invoke on the target queue. The first
     *                parameter passed to this function is the context provided to
     *                dispatch_barrier_async_and_wait_f().
     *                The result of passing NULL in this parameter is undefined.
     * 
     *                API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void dispatch_barrier_async_and_wait_f(@NotNull dispatch_queue_t queue,
            @Nullable VoidPtr context,
            @NotNull @FunctionPtr(name = "call_dispatch_barrier_async_and_wait_f") Function_dispatch_barrier_async_and_wait_f work);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_barrier_async_and_wait_f {
        @Generated
        void call_dispatch_barrier_async_and_wait_f(@Nullable VoidPtr arg0);
    }

    /**
     * [@function] dispatch_workloop_create
     * 
     * Creates a new dispatch workloop to which workitems may be submitted.
     * 
     * @param label
     *              A string label to attach to the workloop.
     * 
     * @return
     *         The newly created dispatch workloop.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_queue_t dispatch_workloop_create(
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    /**
     * [@function] dispatch_workloop_create_inactive
     * 
     * Creates a new inactive dispatch workloop that can be setup and then
     * activated.
     * 
     * Creating an inactive workloop allows for it to receive further configuration
     * before it is activated, and workitems can be submitted to it.
     * 
     * Submitting workitems to an inactive workloop is undefined and will cause the
     * process to be terminated.
     * 
     * @param label
     *              A string label to attach to the workloop.
     * 
     * @return
     *         The newly created dispatch workloop.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native dispatch_queue_t dispatch_workloop_create_inactive(
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    /**
     * [@function] dispatch_workloop_set_autorelease_frequency
     * 
     * Sets the autorelease frequency of the workloop.
     * 
     * See dispatch_queue_attr_make_with_autorelease_frequency().
     * The default policy for a workloop is
     * DISPATCH_AUTORELEASE_FREQUENCY_WORK_ITEM.
     * 
     * @param workloop
     *                  The dispatch workloop to modify.
     * 
     *                  This workloop must be inactive, passing an activated object is undefined
     *                  and will cause the process to be terminated.
     * 
     * @param frequency
     *                  The requested autorelease frequency.
     * 
     *                  API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void dispatch_workloop_set_autorelease_frequency(@NotNull dispatch_queue_t workloop,
            @NUInt long frequency);

    /**
     * API-Since: 11.3
     */
    @Generated
    @CFunction
    public static native int ptsname_r(int fildes, BytePtr buffer, @NUInt long buflen);

    /**
     * API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native int rpmatch(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @Inline
    @CFunction
    public static native char NXSwapShort(char inv);

    @Generated
    @Inline
    @CFunction
    public static native int NXSwapInt(int inv);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NXSwapLong(@NUInt long inv);

    @Generated
    @Inline
    @CFunction
    public static native long NXSwapLongLong(long inv);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NXConvertHostFloatToSwapped(float x);

    @Generated
    @Inline
    @CFunction
    public static native float NXConvertSwappedFloatToHost(@NUInt long x);

    @Generated
    @Inline
    @CFunction
    public static native long NXConvertHostDoubleToSwapped(double x);

    @Generated
    @Inline
    @CFunction
    public static native double NXConvertSwappedDoubleToHost(long x);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NXSwapFloat(@NUInt long x);

    @Generated
    @Inline
    @CFunction
    public static native long NXSwapDouble(long x);

    @Generated
    @Inline
    @CFunction
    public static native int NXHostByteOrder();

    @Generated
    @Inline
    @CFunction
    public static native char NXSwapBigShortToHost(char x);

    @Generated
    @Inline
    @CFunction
    public static native int NXSwapBigIntToHost(int x);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NXSwapBigLongToHost(@NUInt long x);

    @Generated
    @Inline
    @CFunction
    public static native long NXSwapBigLongLongToHost(long x);

    @Generated
    @Inline
    @CFunction
    public static native double NXSwapBigDoubleToHost(long x);

    @Generated
    @Inline
    @CFunction
    public static native float NXSwapBigFloatToHost(@NUInt long x);

    @Generated
    @Inline
    @CFunction
    public static native char NXSwapHostShortToBig(char x);

    @Generated
    @Inline
    @CFunction
    public static native int NXSwapHostIntToBig(int x);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NXSwapHostLongToBig(@NUInt long x);

    @Generated
    @Inline
    @CFunction
    public static native long NXSwapHostLongLongToBig(long x);

    @Generated
    @Inline
    @CFunction
    public static native long NXSwapHostDoubleToBig(double x);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NXSwapHostFloatToBig(float x);

    @Generated
    @Inline
    @CFunction
    public static native char NXSwapLittleShortToHost(char x);

    @Generated
    @Inline
    @CFunction
    public static native int NXSwapLittleIntToHost(int x);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NXSwapLittleLongToHost(@NUInt long x);

    @Generated
    @Inline
    @CFunction
    public static native long NXSwapLittleLongLongToHost(long x);

    @Generated
    @Inline
    @CFunction
    public static native double NXSwapLittleDoubleToHost(long x);

    @Generated
    @Inline
    @CFunction
    public static native float NXSwapLittleFloatToHost(@NUInt long x);

    @Generated
    @Inline
    @CFunction
    public static native char NXSwapHostShortToLittle(char x);

    @Generated
    @Inline
    @CFunction
    public static native int NXSwapHostIntToLittle(int x);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NXSwapHostLongToLittle(@NUInt long x);

    @Generated
    @Inline
    @CFunction
    public static native long NXSwapHostLongLongToLittle(long x);

    @Generated
    @Inline
    @CFunction
    public static native long NXSwapHostDoubleToLittle(double x);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NXSwapHostFloatToLittle(float x);

    @Generated
    @CFunction
    public static native int adjtime(@UncertainArgument("Options: reference, array Fallback: reference") timeval arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") timeval arg2);

    @Generated
    @CFunction
    public static native int futimes(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") timeval arg2);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int lutimes(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") timeval arg2);

    @Generated
    @CFunction
    public static native int settimeofday(
            @UncertainArgument("Options: reference, array Fallback: reference") timeval arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") timezone arg2);

    @Generated
    @CFunction
    public static native int getitimer(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") itimerval arg2);

    @Generated
    @CFunction
    public static native int gettimeofday(
            @UncertainArgument("Options: reference, array Fallback: reference") timeval arg1, VoidPtr arg2);

    @Generated
    @CFunction
    public static native int setitimer(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") itimerval arg2,
            @UncertainArgument("Options: reference, array Fallback: reference") itimerval arg3);

    @Generated
    @CFunction
    public static native int utimes(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") timeval arg2);

    /**
     * [@function] os_trace_info_enabled
     * 
     * Avoid unnecessary work for a trace point by checking if additional
     * information is enabled.
     * 
     * Avoid unnecessary work for a trace point by checking if additional
     * information is enabled. Generally trace points should not involve expensive
     * operations, but some circumstances warrant it. Use this function to avoid
     * doing the work unless debug level trace messages are requested.
     * 
     * <code>
     * if (os_trace_info_enabled()) {
     * os_trace_info("value = %d, average = %d",
     * [[dict objectForKey: @"myKey"] intValue],
     * (int)[self getAverage:dict]);
     * }
     * </code>
     * 
     * @return
     *         Returns true if info types are enabled.
     * 
     *         API-Since: 10.0
     *         Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean os_trace_info_enabled();

    /**
     * [@function] os_trace_debug_enabled
     * 
     * Avoid unnecessary work for a trace point by checking if debug level is
     * enabled.
     * 
     * Avoid unnecessary work for a trace point by checking if debug level is
     * enabled. Generally trace points should not involve expensive operations, but
     * some circumstances warrant it. Use this function to avoid doing the work
     * unless debug level trace messages are requested.
     * 
     * <code>
     * if (os_trace_debug_enabled()) {
     * os_trace_debug("value = %d, average = %d",
     * [[dict objectForKey: @"myKey"] intValue],
     * (int)[self getAverage:dict]);
     * }
     * </code>
     * 
     * @return
     *         Returns true if debug mode is enabled.
     * 
     *         API-Since: 8.0
     *         Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean os_trace_debug_enabled();

    /**
     * [@function] os_trace_type_enabled
     * 
     * Avoid unnecessary work for a trace point by checking a specific type
     * 
     * Avoid unnecessary work for a trace point by checking a specific type
     * 
     * @return
     *         Returns true if type is enabled.
     * 
     *         API-Since: 8.0
     *         Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Inline
    @CFunction
    public static native boolean os_trace_type_enabled(byte type);

    /**
     * [@function] _os_trace_with_buffer
     * 
     * Internal function to support pre-encoded buffer.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: use one of the following calls instead: os_log_info, os_log_debug, os_log_error, os_log_fault
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void _os_trace_with_buffer(VoidPtr dso,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String message,
            byte type, ConstVoidPtr buffer, @NUInt long buffer_size,
            @ObjCBlock(name = "call__os_trace_with_buffer") Block__os_trace_with_buffer payload);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block__os_trace_with_buffer {
        @Generated
        void call__os_trace_with_buffer(VoidPtr xdict);
    }

    /**
     * [@function] os_log_create
     * 
     * Creates a log object to be used with other log related functions.
     * 
     * Creates a log object to be used with other log related functions. The
     * log object serves two purposes: (1) tag related messages by subsystem
     * and category name for easy filtering, and (2) control logging system
     * behavior for messages.
     * 
     * @param subsystem
     *                  The identifier of the given subsystem should be in reverse DNS form
     *                  (i.e., com.company.mysubsystem).
     * 
     * @param category
     *                  The category within the given subsystem that specifies the settings for
     *                  the log object.
     * 
     * @return
     *         Returns an os_log_t value to be passed to other os_log API calls. The
     *         logging runtime maintains a global collection of all os_log_t objects, one
     *         per subsystem/category pair. The os_log_t for a given subsystem/category is
     *         created upon the first call to os_log_create and any subsequent calls return
     *         the same object. These objects are never deallocated, so dynamic creation
     *         (e.g. on a per-operation basis) is generally inappropriate.
     * 
     *         A value will always be returned to allow for dynamic enablement.
     * 
     *         API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native os_log_t os_log_create(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String subsystem,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String category);

    /**
     * [@function] os_log_type_enabled
     * 
     * Evaluate if a specific log type is enabled before doing work
     * 
     * Evaluate if a specific log type is enabled before doing work
     * 
     * @param oslog
     *              Pass OS_LOG_DEFAULT or a log object previously created with os_log_create.
     * 
     * @param type
     *              Pass a valid type from os_log_type_t.
     * 
     * @return
     *         Will return a boolean.
     * 
     *         API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native boolean os_log_type_enabled(os_log_t oslog, byte type);

    /**
     * [@function] _os_log_impl
     * 
     * Internal function that takes compiler generated encoding and captures the necessary content.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native void _os_log_impl(VoidPtr dso, os_log_t log, byte type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String format,
            BytePtr buf, int size);

    /**
     * [@function] _os_log_debug_impl
     * 
     * Internal function that is taken for any debug log emitted in the system.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void _os_log_debug_impl(VoidPtr dso, os_log_t log, byte type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String format,
            BytePtr buf, int size);

    /**
     * [@function] _os_log_error_impl
     * 
     * Internal function that is taken for any error emitted in the system.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native void _os_log_error_impl(VoidPtr dso, os_log_t log, byte type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String format,
            BytePtr buf, int size);

    /**
     * [@function] _os_log_fault_impl
     * 
     * Internal function that is taken for any fault emitted in the system.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native void _os_log_fault_impl(VoidPtr dso, os_log_t log, byte type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String format,
            BytePtr buf, int size);

    /**
     * Support for older iteration of API for source compatibility only...
     * 
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: no longer supported, use os_log_debug(OS_LOG_DEFAULT, ...)
     */
    @Deprecated
    @Generated
    @Variadic()
    @CFunction
    public static native void _os_log_internal(VoidPtr dso, os_log_t log, byte type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String message,
            Object... varargs);

    /**
     * API-Since: 9.0
     */
    @Generated
    @CFunction
    public static native os_log_t _os_log_create(VoidPtr dso,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String subsystem,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String category);

    /**
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: no longer suppored - always returns true
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean os_log_is_enabled(os_log_t log);

    /**
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean os_log_is_debug_enabled(os_log_t log);

    /**
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: no longer supported - use os_log with per-parameter privacy options
     */
    @Deprecated
    @Generated
    @Inline
    @CFunction
    public static native void _os_log_sensitive_deprecated();

    /**
     * [@function] os_unfair_lock_assert_owner
     * 
     * Asserts that the calling thread is the current owner of the specified
     * unfair lock.
     * 
     * If the lock is currently owned by the calling thread, this function returns.
     * 
     * If the lock is unlocked or owned by a different thread, this function
     * asserts and terminates the process.
     * 
     * @param lock
     *             Pointer to an os_unfair_lock.
     * 
     *             API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native void os_unfair_lock_assert_owner(
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") os_unfair_lock_s lock);

    /**
     * [@function] os_unfair_lock_assert_not_owner
     * 
     * Asserts that the calling thread is not the current owner of the specified
     * unfair lock.
     * 
     * If the lock is unlocked or owned by a different thread, this function
     * returns.
     * 
     * If the lock is currently owned by the current thread, this function asserts
     * and terminates the process.
     * 
     * @param lock
     *             Pointer to an os_unfair_lock.
     * 
     *             API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native void os_unfair_lock_assert_not_owner(
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") os_unfair_lock_s lock);

    /**
     * Get value of service property.
     * 
     * @param property
     *                 The requested property.
     *                 Currently the only property defined is kDNSServiceProperty_DaemonVersion.
     * 
     * @param result
     *                 Place to store result.
     *                 For retrieving DaemonVersion, this should be the address of a uint32_t.
     * 
     * @param size
     *                 Pointer to uint32_t containing size of the result location.
     *                 For retrieving DaemonVersion, this should be sizeof(uint32_t).
     *                 On return the uint32_t is updated to the size of the data returned.
     *                 For DaemonVersion, the returned size is always sizeof(uint32_t), but
     *                 future properties could be defined which return variable-sized results.
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success, or kDNSServiceErr_ServiceNotRunning
     *         if the daemon (or "system service" on Windows) is not running.
     */
    @Generated
    @CFunction
    public static native int DNSServiceGetProperty(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String property,
            VoidPtr result, IntPtr size);

    /**
     * Access underlying Unix domain socket for an initialized DNSServiceRef.
     * 
     * The DNS Service Discovery implementation uses this socket to communicate between the client and
     * the daemon. The application MUST NOT directly read from or write to this socket.
     * Access to the socket is provided so that it can be used as a kqueue event source, a CFRunLoop
     * event source, in a select() loop, etc. When the underlying event management subsystem (kqueue/
     * select/CFRunLoop etc.) indicates to the client that data is available for reading on the
     * socket, the client should call DNSServiceProcessResult(), which will extract the daemon's
     * reply from the socket, and pass it to the appropriate application callback. By using a run
     * loop or select(), results from the daemon can be processed asynchronously. Alternatively,
     * a client can choose to fork a thread and have it loop calling "DNSServiceProcessResult(ref);"
     * If DNSServiceProcessResult() is called when no data is available for reading on the socket, it
     * will block until data does become available, and then process the data and return to the caller.
     * The application is responsible for checking the return value of DNSServiceProcessResult()
     * to determine if the socket is valid and if it should continue to process data on the socket.
     * When data arrives on the socket, the client is responsible for calling DNSServiceProcessResult(ref)
     * in a timely fashion -- if the client allows a large backlog of data to build up the daemon
     * may terminate the connection.
     * 
     * @param sdRef
     *              A DNSServiceRef initialized by any of the DNSService calls.
     * 
     * @return
     *         The DNSServiceRef's underlying socket descriptor, or -1 on error.
     */
    @Generated
    @CFunction
    public static native int DNSServiceRefSockFD(DNSServiceRef sdRef);

    /**
     * Read a reply from the daemon, calling the appropriate application callback.
     * 
     * This call will block until the daemon's response is received. Use DNSServiceRefSockFD() in
     * conjunction with a run loop or select() to determine the presence of a response from the
     * server before calling this function to process the reply without blocking. Call this function
     * at any point if it is acceptable to block until the daemon's response arrives. Note that the
     * client is responsible for ensuring that DNSServiceProcessResult() is called whenever there is
     * a reply from the daemon - the daemon may terminate its connection with a client that does not
     * process the daemon's responses.
     * 
     * @param sdRef
     *              A DNSServiceRef initialized by any of the DNSService calls
     *              that take a callback parameter.
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success, otherwise returns
     *         an error code indicating the specific failure that occurred.
     */
    @Generated
    @CFunction
    public static native int DNSServiceProcessResult(DNSServiceRef sdRef);

    /**
     * Terminate a connection with the daemon and free memory associated with the DNSServiceRef.
     * 
     * Any services or records registered with this DNSServiceRef will be deregistered. Any
     * Browse, Resolve, or Query operations called with this reference will be terminated.
     * 
     * Note: If the reference's underlying socket is used in a run loop or select() call, it should
     * be removed BEFORE DNSServiceRefDeallocate() is called, as this function closes the reference's
     * socket.
     * 
     * Note: If the reference was initialized with DNSServiceCreateConnection(), any DNSRecordRefs
     * created via this reference will be invalidated by this call - the resource records are
     * deregistered, and their DNSRecordRefs may not be used in subsequent functions. Similarly,
     * if the reference was initialized with DNSServiceRegister, and an extra resource record was
     * added to the service via DNSServiceAddRecord(), the DNSRecordRef created by the Add() call
     * is invalidated when this function is called - the DNSRecordRef may not be used in subsequent
     * functions.
     * 
     * If the reference was passed to DNSServiceSetDispatchQueue(), DNSServiceRefDeallocate() must
     * be called on the same queue originally passed as an argument to DNSServiceSetDispatchQueue().
     * 
     * Note: This call is to be used only with the DNSServiceRef defined by this API.
     * 
     * @param sdRef
     *              A DNSServiceRef initialized by any of the DNSService calls.
     */
    @Generated
    @CFunction
    public static native void DNSServiceRefDeallocate(DNSServiceRef sdRef);

    /**
     * Asynchronously enumerate domains available for browsing and registration.
     * 
     * The enumeration MUST be cancelled via DNSServiceRefDeallocate() when no more domains
     * are to be found.
     * 
     * Note that the names returned are (like all of DNS-SD) UTF-8 strings,
     * and are escaped using standard DNS escaping rules.
     * (See "Notes on DNS Name Escaping" earlier in this file for more details.)
     * A graphical browser displaying a hierarchical tree-structured view should cut
     * the names at the bare dots to yield individual labels, then de-escape each
     * label according to the escaping rules, and then display the resulting UTF-8 text.
     * 
     * @param sdRef
     *                       A pointer to an uninitialized DNSServiceRef
     *                       (or, if the kDNSServiceFlagsShareConnection flag is used,
     *                       a copy of the shared connection reference that is to be used).
     *                       If the call succeeds then it initializes (or updates) the DNSServiceRef,
     *                       returns kDNSServiceErr_NoError, and the enumeration operation
     *                       will remain active indefinitely until the client terminates it
     *                       by passing this DNSServiceRef to DNSServiceRefDeallocate()
     *                       (or by closing the underlying shared connection, if used).
     * 
     * @param flags
     *                       Possible values are:
     *                       kDNSServiceFlagsShareConnection to use a shared connection.
     *                       kDNSServiceFlagsBrowseDomains to enumerate domains recommended for browsing.
     *                       kDNSServiceFlagsRegistrationDomains to enumerate domains recommended
     *                       for registration.
     * 
     * @param interfaceIndex
     *                       If non-zero, specifies the interface on which to look for domains.
     *                       (the index for a given interface is determined via the if_nametoindex()
     *                       family of calls.) Most applications will pass 0 to enumerate domains on
     *                       all interfaces. See "Constants for specifying an interface index" for more details.
     * 
     * @param callBack
     *                       The function to be called when a domain is found or the call asynchronously
     *                       fails.
     * 
     * @param context
     *                       An application context pointer which is passed to the callback function
     *                       (may be NULL).
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success (any subsequent, asynchronous
     *         errors are delivered to the callback), otherwise returns an error code indicating
     *         the error that occurred (the callback is not invoked and the DNSServiceRef
     *         is not initialized).
     */
    @Generated
    @CFunction
    public static native int DNSServiceEnumerateDomains(Ptr<DNSServiceRef> sdRef, int flags, int interfaceIndex,
            @FunctionPtr(name = "call_DNSServiceEnumerateDomains") Function_DNSServiceEnumerateDomains callBack,
            VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_DNSServiceEnumerateDomains {
        @Generated
        void call_DNSServiceEnumerateDomains(DNSServiceRef arg0, int arg1, int arg2, int arg3,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
                VoidPtr arg5);
    }

    /**
     * Register a service that is discovered via Browse() and Resolve() calls.
     * 
     * @param sdRef
     *                       A pointer to an uninitialized DNSServiceRef
     *                       (or, if the kDNSServiceFlagsShareConnection flag is used,
     *                       a copy of the shared connection reference that is to be used).
     *                       If the call succeeds then it initializes (or updates) the DNSServiceRef,
     *                       returns kDNSServiceErr_NoError, and the service registration
     *                       will remain active indefinitely until the client terminates it
     *                       by passing this DNSServiceRef to DNSServiceRefDeallocate()
     *                       (or by closing the underlying shared connection, if used).
     * 
     * @param flags
     *                       Possible values are:
     *                       kDNSServiceFlagsShareConnection to use a shared connection.
     *                       Other flags indicate the renaming behavior on name conflict
     *                       (not required for most applications).
     *                       See flag definitions above for details.
     * 
     * @param interfaceIndex
     *                       If non-zero, specifies the interface on which to register the service
     *                       (the index for a given interface is determined via the if_nametoindex()
     *                       family of calls.) Most applications will pass 0 to register on all
     *                       available interfaces. See "Constants for specifying an interface index" for more details.
     * 
     * @param name
     *                       If non-NULL, specifies the service name to be registered.
     *                       Most applications will not specify a name, in which case the computer
     *                       name is used (this name is communicated to the client via the callback).
     *                       If a name is specified, it must be 1-63 bytes of UTF-8 text.
     *                       If the name is longer than 63 bytes it will be automatically truncated
     *                       to a legal length, unless the NoAutoRename flag is set,
     *                       in which case kDNSServiceErr_BadParam will be returned.
     * 
     * @param regtype
     *                       The service type followed by the protocol, separated by a dot
     *                       (e.g. "_ftp._tcp"). The service type must be an underscore, followed
     *                       by 1-15 characters, which may be letters, digits, or hyphens.
     *                       The transport protocol must be "_tcp" or "_udp". New service types
     *                       should be registered at <http://www.dns-sd.org/ServiceTypes.html>.
     * 
     *                       Additional subtypes of the primary service type (where a service
     *                       type has defined subtypes) follow the primary service type in a
     *                       comma-separated list, with no additional spaces, e.g.
     *                       "_primarytype._tcp,_subtype1,_subtype2,_subtype3"
     *                       Subtypes provide a mechanism for filtered browsing: A client browsing
     *                       for "_primarytype._tcp" will discover all instances of this type;
     *                       a client browsing for "_primarytype._tcp,_subtype2" will discover only
     *                       those instances that were registered with "_subtype2" in their list of
     *                       registered subtypes.
     * 
     *                       The subtype mechanism can be illustrated with some examples using the
     *                       dns-sd command-line tool:
     * 
     *                       % dns-sd -R Simple _test._tcp "" 1001 &
     *                       % dns-sd -R Better _test._tcp,HasFeatureA "" 1002 &
     *                       % dns-sd -R Best _test._tcp,HasFeatureA,HasFeatureB "" 1003 &
     * 
     *                       Now:
     *                       % dns-sd -B _test._tcp # will find all three services
     *                       % dns-sd -B _test._tcp,HasFeatureA # finds "Better" and "Best"
     *                       % dns-sd -B _test._tcp,HasFeatureB # finds only "Best"
     * 
     *                       Subtype labels may be up to 63 bytes long, and may contain any eight-
     *                       bit byte values, including zero bytes. However, due to the nature of
     *                       using a C-string-based API, conventional DNS escaping must be used for
     *                       dots ('.'), commas (','), backslashes ('\') and zero bytes, as shown below:
     * 
     *                       % dns-sd -R Test '_test._tcp,s\.one,s\,two,s\\three,s\000four' local 123
     * 
     * @param domain
     *                       If non-NULL, specifies the domain on which to advertise the service.
     *                       Most applications will not specify a domain, instead automatically
     *                       registering in the default domain(s).
     * 
     * @param host
     *                       If non-NULL, specifies the SRV target host name. Most applications
     *                       will not specify a host, instead automatically using the machine's
     *                       default host name(s). Note that specifying a non-NULL host does NOT
     *                       create an address record for that host - the application is responsible
     *                       for ensuring that the appropriate address record exists, or creating it
     *                       via DNSServiceRegisterRecord().
     * 
     * @param port
     *                       The port, in network byte order, on which the service accepts connections.
     *                       Pass 0 for a "placeholder" service (i.e. a service that will not be discovered
     *                       by browsing, but will cause a name conflict if another client tries to
     *                       register that same name). Most clients will not use placeholder services.
     * 
     * @param txtLen
     *                       The length of the txtRecord, in bytes. Must be zero if the txtRecord is NULL.
     * 
     * @param txtRecord
     *                       The TXT record rdata. A non-NULL txtRecord MUST be a properly formatted DNS
     *                       TXT record, i.e. <length byte> <data> <length byte> <data> ...
     *                       Passing NULL for the txtRecord is allowed as a synonym for txtLen=1, txtRecord="",
     *                       i.e. it creates a TXT record of length one containing a single empty string.
     *                       RFC 1035 doesn't allow a TXT record to contain *zero* strings, so a single empty
     *                       string is the smallest legal DNS TXT record.
     *                       As with the other parameters, the DNSServiceRegister call copies the txtRecord
     *                       data; e.g. if you allocated the storage for the txtRecord parameter with malloc()
     *                       then you can safely free that memory right after the DNSServiceRegister call returns.
     * 
     * @param callBack
     *                       The function to be called when the registration completes or asynchronously
     *                       fails. The client MAY pass NULL for the callback - The client will NOT be notified
     *                       of the default values picked on its behalf, and the client will NOT be notified of any
     *                       asynchronous errors (e.g. out of memory errors, etc.) that may prevent the registration
     *                       of the service. The client may NOT pass the NoAutoRename flag if the callback is NULL.
     *                       The client may still deregister the service at any time via DNSServiceRefDeallocate().
     * 
     * @param context
     *                       An application context pointer which is passed to the callback function
     *                       (may be NULL).
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success (any subsequent, asynchronous
     *         errors are delivered to the callback), otherwise returns an error code indicating
     *         the error that occurred (the callback is never invoked and the DNSServiceRef
     *         is not initialized).
     */
    @Generated
    @CFunction
    public static native int DNSServiceRegister(Ptr<DNSServiceRef> sdRef, int flags, int interfaceIndex,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String regtype,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String host, char port,
            char txtLen, ConstVoidPtr txtRecord,
            @FunctionPtr(name = "call_DNSServiceRegister") Function_DNSServiceRegister callBack, VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_DNSServiceRegister {
        @Generated
        void call_DNSServiceRegister(DNSServiceRef arg0, int arg1, int arg2,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg5,
                VoidPtr arg6);
    }

    /**
     * Add a record to a registered service.
     * 
     * The name of the record will be the same as the
     * registered service's name.
     * The record can later be updated or deregistered by passing the RecordRef initialized
     * by this function to DNSServiceUpdateRecord() or DNSServiceRemoveRecord().
     * 
     * Note that the DNSServiceAddRecord/UpdateRecord/RemoveRecord are *NOT* thread-safe
     * with respect to a single DNSServiceRef. If you plan to have multiple threads
     * in your program simultaneously add, update, or remove records from the same
     * DNSServiceRef, then it's the caller's responsibility to use a mutex lock
     * or take similar appropriate precautions to serialize those calls.
     * 
     * @param sdRef
     *                  A DNSServiceRef initialized by DNSServiceRegister().
     * 
     * @param RecordRef
     *                  A pointer to an uninitialized DNSRecordRef. Upon succesfull completion of this
     *                  call, this ref may be passed to DNSServiceUpdateRecord() or DNSServiceRemoveRecord().
     *                  If the above DNSServiceRef is passed to DNSServiceRefDeallocate(), RecordRef is also
     *                  invalidated and may not be used further.
     * 
     * @param flags
     *                  Currently ignored, reserved for future use.
     * 
     * @param rrtype
     *                  The type of the record (e.g. kDNSServiceType_TXT, kDNSServiceType_SRV, etc)
     * 
     * @param rdlen
     *                  The length, in bytes, of the rdata.
     * 
     * @param rdata
     *                  The raw rdata to be contained in the added resource record.
     * 
     * @param ttl
     *                  The time to live of the resource record, in seconds.
     *                  Most clients should pass 0 to indicate that the system should
     *                  select a sensible default value.
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success, otherwise returns an
     *         error code indicating the error that occurred (the RecordRef is not initialized).
     */
    @Generated
    @CFunction
    public static native int DNSServiceAddRecord(DNSServiceRef sdRef, Ptr<DNSRecordRef> RecordRef, int flags,
            char rrtype, char rdlen, ConstVoidPtr rdata, int ttl);

    /**
     * Update a registered resource record. This function can update three types of records:
     * 1. The primary txt record for a service that was previously registered.
     * 2. Some other record that was added to the service using DNSServiceAddRecord().
     * 3. A record registered using DNSServiceRegisterRecord().
     * 
     * @param sdRef
     *                  For updates of records associated with a registered service (cases 1 and 2), this is the
     *                  DNSServiceRef returned by DNSServiceRegister(). For updates of records registered with
     *                  DNSServiceRegisterRecord() (case 3), this is the DNSServiceRef that was passed to
     *                  DNSServiceRegisterRecord().
     * 
     * @param recordRef
     *                  For case 1, this is NULL. For case 2, it's a DNSRecordRef returned by DNSServiceAddRecord(). For
     *                  case 3, it's a DNSRecordRef returned by DNSServiceRegisterRecord().
     * 
     * @param flags
     *                  Currently ignored, reserved for future use.
     * 
     * @param rdlen
     *                  The length, in bytes, of the new rdata.
     * 
     * @param rdata
     *                  The new rdata to be contained in the updated resource record.
     * 
     * @param ttl
     *                  The time to live of the updated resource record, in seconds.
     *                  Most clients should pass 0 to indicate that the system should
     *                  select a sensible default value.
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success, otherwise returns an
     *         error code indicating the error that occurred.
     */
    @Generated
    @CFunction
    public static native int DNSServiceUpdateRecord(DNSServiceRef sdRef, DNSRecordRef recordRef, int flags, char rdlen,
            ConstVoidPtr rdata, int ttl);

    /**
     * Remove a record previously added to a service record set via DNSServiceAddRecord(), or deregister
     * a record registered individually via DNSServiceRegisterRecord().
     * 
     * @param sdRef
     *                  A DNSServiceRef initialized by DNSServiceRegister() (if the
     *                  record being removed was registered via DNSServiceAddRecord()) or by
     *                  DNSServiceCreateConnection() (if the record being removed was registered via
     *                  DNSServiceRegisterRecord()).
     * 
     * @param RecordRef
     *                  A DNSRecordRef initialized by a successful call to DNSServiceAddRecord()
     *                  or DNSServiceRegisterRecord().
     * 
     * @param flags
     *                  Currently ignored, reserved for future use.
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success, otherwise returns an
     *         error code indicating the error that occurred.
     */
    @Generated
    @CFunction
    public static native int DNSServiceRemoveRecord(DNSServiceRef sdRef, DNSRecordRef RecordRef, int flags);

    /**
     * Browse for instances of a service.
     * 
     * @param sdRef
     *                       A pointer to an uninitialized DNSServiceRef
     *                       (or, if the kDNSServiceFlagsShareConnection flag is used,
     *                       a copy of the shared connection reference that is to be used).
     *                       If the call succeeds then it initializes (or updates) the DNSServiceRef,
     *                       returns kDNSServiceErr_NoError, and the browse operation
     *                       will remain active indefinitely until the client terminates it
     *                       by passing this DNSServiceRef to DNSServiceRefDeallocate()
     *                       (or by closing the underlying shared connection, if used).
     * 
     * @param flags
     *                       Possible values are:
     *                       kDNSServiceFlagsShareConnection to use a shared connection.
     * 
     * @param interfaceIndex
     *                       If non-zero, specifies the interface on which to browse for services
     *                       (the index for a given interface is determined via the if_nametoindex()
     *                       family of calls.) Most applications will pass 0 to browse on all available
     *                       interfaces. See "Constants for specifying an interface index" for more details.
     * 
     * @param regtype
     *                       The service type being browsed for followed by the protocol, separated by a
     *                       dot (e.g. "_ftp._tcp"). The transport protocol must be "_tcp" or "_udp".
     *                       A client may optionally specify a single subtype to perform filtered browsing:
     *                       e.g. browsing for "_primarytype._tcp,_subtype" will discover only those
     *                       instances of "_primarytype._tcp" that were registered specifying "_subtype"
     *                       in their list of registered subtypes.
     * 
     * @param domain
     *                       If non-NULL, specifies the domain on which to browse for services.
     *                       Most applications will not specify a domain, instead browsing on the
     *                       default domain(s).
     * 
     * @param callBack
     *                       The function to be called when an instance of the service being browsed for
     *                       is found, or if the call asynchronously fails.
     * 
     * @param context
     *                       An application context pointer which is passed to the callback function
     *                       (may be NULL).
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success (any subsequent, asynchronous
     *         errors are delivered to the callback), otherwise returns an error code indicating
     *         the error that occurred (the callback is not invoked and the DNSServiceRef
     *         is not initialized).
     */
    @Generated
    @CFunction
    public static native int DNSServiceBrowse(Ptr<DNSServiceRef> sdRef, int flags, int interfaceIndex,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String regtype,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain,
            @FunctionPtr(name = "call_DNSServiceBrowse") Function_DNSServiceBrowse callBack, VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_DNSServiceBrowse {
        @Generated
        void call_DNSServiceBrowse(DNSServiceRef arg0, int arg1, int arg2, int arg3,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg5,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg6,
                VoidPtr arg7);
    }

    /**
     * Resolve a service name discovered via DNSServiceBrowse() to a target host name, port number, and
     * txt record.
     * 
     * Note: Applications should NOT use DNSServiceResolve() solely for txt record monitoring - use
     * DNSServiceQueryRecord() instead, as it is more efficient for this task.
     * 
     * Note: When the desired results have been returned, the client MUST terminate the resolve by calling
     * DNSServiceRefDeallocate().
     * 
     * Note: DNSServiceResolve() behaves correctly for typical services that have a single SRV record
     * and a single TXT record. To resolve non-standard services with multiple SRV or TXT records,
     * DNSServiceQueryRecord() should be used.
     * 
     * NOTE: In earlier versions of this header file, the txtRecord parameter was declared "const char *"
     * This is incorrect, since it contains length bytes which are values in the range 0 to 255, not -128 to +127.
     * Depending on your compiler settings, this change may cause signed/unsigned mismatch warnings.
     * These should be fixed by updating your own callback function definition to match the corrected
     * function signature using "const unsigned char *txtRecord". Making this change may also fix inadvertent
     * bugs in your callback function, where it could have incorrectly interpreted a length byte with value 250
     * as being -6 instead, with various bad consequences ranging from incorrect operation to software crashes.
     * If you need to maintain portable code that will compile cleanly with both the old and new versions of
     * this header file, you should update your callback function definition to use the correct unsigned value,
     * and then in the place where you pass your callback function to DNSServiceResolve(), use a cast to eliminate
     * the compiler warning, e.g.:
     * DNSServiceResolve(sd, flags, index, name, regtype, domain, (DNSServiceResolveReply)MyCallback, context);
     * This will ensure that your code compiles cleanly without warnings (and more importantly, works correctly)
     * with both the old header and with the new corrected version.
     * 
     * @param sdRef
     *                       A pointer to an uninitialized DNSServiceRef
     *                       (or, if the kDNSServiceFlagsShareConnection flag is used,
     *                       a copy of the shared connection reference that is to be used).
     *                       If the call succeeds then it initializes (or updates) the DNSServiceRef,
     *                       returns kDNSServiceErr_NoError, and the resolve operation
     *                       will remain active indefinitely until the client terminates it
     *                       by passing this DNSServiceRef to DNSServiceRefDeallocate()
     *                       (or by closing the underlying shared connection, if used).
     * 
     * @param flags
     *                       Possible values are:
     *                       kDNSServiceFlagsShareConnection to use a shared connection.
     *                       Specifying kDNSServiceFlagsForceMulticast will cause query to be
     *                       performed with a link-local mDNS query, even if the name is an
     *                       apparently non-local name (i.e. a name not ending in ".local.")
     * 
     * @param interfaceIndex
     *                       The interface on which to resolve the service. If this resolve call is
     *                       as a result of a currently active DNSServiceBrowse() operation, then the
     *                       interfaceIndex should be the index reported in the DNSServiceBrowseReply
     *                       callback. If this resolve call is using information previously saved
     *                       (e.g. in a preference file) for later use, then use interfaceIndex 0, because
     *                       the desired service may now be reachable via a different physical interface.
     *                       See "Constants for specifying an interface index" for more details.
     * 
     * @param name
     *                       The name of the service instance to be resolved, as reported to the
     *                       DNSServiceBrowseReply() callback.
     * 
     * @param regtype
     *                       The type of the service instance to be resolved, as reported to the
     *                       DNSServiceBrowseReply() callback.
     * 
     * @param domain
     *                       The domain of the service instance to be resolved, as reported to the
     *                       DNSServiceBrowseReply() callback.
     * 
     * @param callBack
     *                       The function to be called when a result is found, or if the call
     *                       asynchronously fails.
     * 
     * @param context
     *                       An application context pointer which is passed to the callback function
     *                       (may be NULL).
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success (any subsequent, asynchronous
     *         errors are delivered to the callback), otherwise returns an error code indicating
     *         the error that occurred (the callback is never invoked and the DNSServiceRef
     *         is not initialized).
     */
    @Generated
    @CFunction
    public static native int DNSServiceResolve(Ptr<DNSServiceRef> sdRef, int flags, int interfaceIndex,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String regtype,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain,
            @FunctionPtr(name = "call_DNSServiceResolve") Function_DNSServiceResolve callBack, VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_DNSServiceResolve {
        @Generated
        void call_DNSServiceResolve(DNSServiceRef arg0, int arg1, int arg2, int arg3,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg5,
                char arg6, char arg7,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg8,
                VoidPtr arg9);
    }

    /**
     * Query for an arbitrary DNS record.
     * 
     * @param sdRef
     *                       A pointer to an uninitialized DNSServiceRef
     *                       (or, if the kDNSServiceFlagsShareConnection flag is used,
     *                       a copy of the shared connection reference that is to be used).
     *                       If the call succeeds then it initializes (or updates) the DNSServiceRef,
     *                       returns kDNSServiceErr_NoError, and the query operation
     *                       will remain active indefinitely until the client terminates it
     *                       by passing this DNSServiceRef to DNSServiceRefDeallocate()
     *                       (or by closing the underlying shared connection, if used).
     * 
     * @param flags
     *                       Possible values are:
     *                       kDNSServiceFlagsShareConnection to use a shared connection.
     *                       kDNSServiceFlagsForceMulticast or kDNSServiceFlagsLongLivedQuery.
     *                       Pass kDNSServiceFlagsLongLivedQuery to create a "long-lived" unicast
     *                       query to a unicast DNS server that implements the protocol. This flag
     *                       has no effect on link-local multicast queries.
     * 
     * @param interfaceIndex
     *                       If non-zero, specifies the interface on which to issue the query
     *                       (the index for a given interface is determined via the if_nametoindex()
     *                       family of calls.) Passing 0 causes the name to be queried for on all
     *                       interfaces. See "Constants for specifying an interface index" for more details.
     * 
     * @param fullname
     *                       The full domain name of the resource record to be queried for.
     * 
     * @param rrtype
     *                       The numerical type of the resource record to be queried for
     *                       (e.g. kDNSServiceType_PTR, kDNSServiceType_SRV, etc)
     * 
     * @param rrclass
     *                       The class of the resource record (usually kDNSServiceClass_IN).
     * 
     * @param callBack
     *                       The function to be called when a result is found, or if the call
     *                       asynchronously fails.
     * 
     * @param context
     *                       An application context pointer which is passed to the callback function
     *                       (may be NULL).
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success (any subsequent, asynchronous
     *         errors are delivered to the callback), otherwise returns an error code indicating
     *         the error that occurred (the callback is never invoked and the DNSServiceRef
     *         is not initialized).
     */
    @Generated
    @CFunction
    public static native int DNSServiceQueryRecord(Ptr<DNSServiceRef> sdRef, int flags, int interfaceIndex,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String fullname,
            char rrtype, char rrclass,
            @FunctionPtr(name = "call_DNSServiceQueryRecord") Function_DNSServiceQueryRecord callBack, VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_DNSServiceQueryRecord {
        @Generated
        void call_DNSServiceQueryRecord(DNSServiceRef arg0, int arg1, int arg2, int arg3,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
                char arg5, char arg6, char arg7, ConstVoidPtr arg8, int arg9, VoidPtr arg10);
    }

    /**
     * Queries for the IP address of a hostname by using either Multicast or Unicast DNS.
     * 
     * @param sdRef
     *                       A pointer to an uninitialized DNSServiceRef
     *                       (or, if the kDNSServiceFlagsShareConnection flag is used,
     *                       a copy of the shared connection reference that is to be used).
     *                       If the call succeeds then it initializes (or updates) the DNSServiceRef,
     *                       returns kDNSServiceErr_NoError, and the address query operation
     *                       will remain active indefinitely until the client terminates it
     *                       by passing this DNSServiceRef to DNSServiceRefDeallocate()
     *                       (or by closing the underlying shared connection, if used).
     * 
     * @param flags
     *                       Possible values are:
     *                       kDNSServiceFlagsShareConnection to use a shared connection.
     *                       kDNSServiceFlagsForceMulticast
     * 
     * @param interfaceIndex
     *                       The interface on which to issue the query. Passing 0 causes the query to be
     *                       sent on all active interfaces via Multicast or the primary interface via Unicast.
     * 
     * @param protocol
     *                       Pass in kDNSServiceProtocol_IPv4 to look up IPv4 addresses, or kDNSServiceProtocol_IPv6
     *                       to look up IPv6 addresses, or both to look up both kinds. If neither flag is
     *                       set, the system will apply an intelligent heuristic, which is (currently)
     *                       that it will attempt to look up both, except:
     * 
     *                       * If "hostname" is a wide-area unicast DNS hostname (i.e. not a ".local." name)
     *                       but this host has no routable IPv6 address, then the call will not try to
     *                       look up IPv6 addresses for "hostname", since any addresses it found would be
     *                       unlikely to be of any use anyway. Similarly, if this host has no routable
     *                       IPv4 address, the call will not try to look up IPv4 addresses for "hostname".
     * 
     * @param hostname
     *                       The fully qualified domain name of the host to be queried for.
     * 
     * @param callBack
     *                       The function to be called when the query succeeds or fails asynchronously.
     * 
     * @param context
     *                       An application context pointer which is passed to the callback function
     *                       (may be NULL).
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success (any subsequent, asynchronous
     *         errors are delivered to the callback), otherwise returns an error code indicating
     *         the error that occurred.
     */
    @Generated
    @CFunction
    public static native int DNSServiceGetAddrInfo(Ptr<DNSServiceRef> sdRef, int flags, int interfaceIndex,
            int protocol,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String hostname,
            @FunctionPtr(name = "call_DNSServiceGetAddrInfo") Function_DNSServiceGetAddrInfo callBack, VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_DNSServiceGetAddrInfo {
        @Generated
        void call_DNSServiceGetAddrInfo(DNSServiceRef arg0, int arg1, int arg2, int arg3,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
                @UncertainArgument("Options: reference, array Fallback: reference") sockaddr arg5, int arg6,
                VoidPtr arg7);
    }

    /**
     * Create a connection to the daemon allowing efficient registration of
     * multiple individual records.
     * 
     * @param sdRef
     *              A pointer to an uninitialized DNSServiceRef.
     *              Deallocating the reference (via DNSServiceRefDeallocate())
     *              severs the connection and cancels all operations and
     *              deregisters all records registered on this connection.
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success, otherwise returns
     *         an error code indicating the specific failure that occurred
     *         (in which case the DNSServiceRef is not initialized).
     */
    @Generated
    @CFunction
    public static native int DNSServiceCreateConnection(Ptr<DNSServiceRef> sdRef);

    /**
     * Register an individual resource record on a connected DNSServiceRef.
     * 
     * Note that name conflicts occurring for records registered via this call must be handled
     * by the client in the callback. The RecordRef object returned by the DNSServiceRegisterRecord
     * call in this case is not disposed of as a result of the error. The caller is responsible
     * for disposing of it either calling DNSServiceRemoveRecord on the value returned in RecordRef,
     * or by calling DNSServiceRefDeallocate on the DNSServiceRef value passed in sdRef.
     * 
     * @param sdRef
     *                       A DNSServiceRef initialized by DNSServiceCreateConnection().
     * 
     * @param RecordRef
     *                       A pointer to an uninitialized DNSRecordRef. Upon succesfull completion of this
     *                       call, this ref may be passed to DNSServiceUpdateRecord() or DNSServiceRemoveRecord().
     *                       (To deregister ALL records registered on a single connected DNSServiceRef
     *                       and deallocate each of their corresponding DNSServiceRecordRefs, call
     *                       DNSServiceRefDeallocate()).
     * 
     * @param flags
     *                       Required values are:
     *                       One of kDNSServiceFlagsShared, kDNSServiceFlagsUnique or kDNSServiceFlagsKnownUnique flags.
     * 
     *                       Possible values are:
     *                       kDNSServiceFlagsForceMulticast: If it is specified, the registration will be performed just
     *                       like
     *                       a link-local mDNS registration even if the name is an apparently non-local name (i.e. a
     *                       name not
     *                       ending in ".local.")
     * 
     * @param interfaceIndex
     *                       If non-zero, specifies the interface on which to register the record
     *                       (the index for a given interface is determined via the if_nametoindex()
     *                       family of calls.) Passing 0 causes the record to be registered on all interfaces.
     *                       See "Constants for specifying an interface index" for more details.
     * 
     * @param fullname
     *                       The full domain name of the resource record.
     * 
     * @param rrtype
     *                       The numerical type of the resource record (e.g. kDNSServiceType_PTR, kDNSServiceType_SRV,
     *                       etc)
     * 
     * @param rrclass
     *                       The class of the resource record (usually kDNSServiceClass_IN)
     * 
     * @param rdlen
     *                       Length, in bytes, of the rdata.
     * 
     * @param rdata
     *                       A pointer to the raw rdata, as it is to appear in the DNS record.
     * 
     * @param ttl
     *                       The time to live of the resource record, in seconds.
     *                       Most clients should pass 0 to indicate that the system should
     *                       select a sensible default value.
     * 
     * @param callBack
     *                       The function to be called when a result is found, or if the call
     *                       asynchronously fails (e.g. because of a name conflict.)
     * 
     * @param context
     *                       An application context pointer which is passed to the callback function
     *                       (may be NULL).
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success (any subsequent, asynchronous
     *         errors are delivered to the callback), otherwise returns an error code indicating
     *         the error that occurred (the callback is never invoked and the DNSRecordRef is
     *         not initialized).
     */
    @Generated
    @CFunction
    public static native int DNSServiceRegisterRecord(DNSServiceRef sdRef, Ptr<DNSRecordRef> RecordRef, int flags,
            int interfaceIndex,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String fullname,
            char rrtype, char rrclass, char rdlen, ConstVoidPtr rdata, int ttl,
            @FunctionPtr(name = "call_DNSServiceRegisterRecord") Function_DNSServiceRegisterRecord callBack,
            VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_DNSServiceRegisterRecord {
        @Generated
        void call_DNSServiceRegisterRecord(DNSServiceRef arg0, DNSRecordRef arg1, int arg2, int arg3, VoidPtr arg4);
    }

    /**
     * Instruct the daemon to verify the validity of a resource record that appears
     * to be out of date (e.g. because TCP connection to a service's target failed.)
     * Causes the record to be flushed from the daemon's cache (as well as all other
     * daemons' caches on the network) if the record is determined to be invalid.
     * Use this routine conservatively. Reconfirming a record necessarily consumes
     * network bandwidth, so this should not be done indiscriminately.
     * 
     * @param flags
     *                       Not currently used.
     * 
     * @param interfaceIndex
     *                       Specifies the interface of the record in question.
     *                       The caller must specify the interface.
     *                       This API (by design) causes increased network traffic, so it requires
     *                       the caller to be precise about which record should be reconfirmed.
     *                       It is not possible to pass zero for the interface index to perform
     *                       a "wildcard" reconfirmation, where *all* matching records are reconfirmed.
     * 
     * @param fullname
     *                       The resource record's full domain name.
     * 
     * @param rrtype
     *                       The resource record's type (e.g. kDNSServiceType_PTR, kDNSServiceType_SRV, etc)
     * 
     * @param rrclass
     *                       The class of the resource record (usually kDNSServiceClass_IN).
     * 
     * @param rdlen
     *                       The length, in bytes, of the resource record rdata.
     * 
     * @param rdata
     *                       The raw rdata of the resource record.
     */
    @Generated
    @CFunction
    public static native int DNSServiceReconfirmRecord(int flags, int interfaceIndex,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String fullname,
            char rrtype, char rrclass, char rdlen, ConstVoidPtr rdata);

    /**
     * Release P2P connection resources associated with the service instance.
     * 
     * When a service is resolved over a P2P interface, a connection is brought up to the
     * peer advertising the service instance. This call will free the resources associated
     * with that connection. Note that the reference to the service instance will only
     * be maintained by the daemon while the browse for the service type is still
     * running. Thus the sequence of calls to discover, resolve, and then terminate the connection
     * associated with a given P2P service instance would be:
     * 
     * DNSServiceRef BrowseRef, ResolveRef;
     * DNSServiceBrowse(&BrowseRef, ...) // browse for all instances of the service
     * DNSServiceResolve(&ResolveRef, ...) // resolving a service instance creates a
     * // connection to the peer device advertising that service
     * DNSServiceRefDeallocate(ResolveRef) // Stop the resolve, which does not close the peer connection
     * 
     * // Communicate with the peer application.
     * 
     * PeerConnectionRelease() // release the connection to the peer device for the specified service instance
     * 
     * DNSServiceRefDeallocate(BrowseRef) // stop the browse
     * // Any further calls to PeerConnectionRelease() will have no affect since the
     * // service instance to peer connection relationship is only maintained by the
     * // daemon while the browse is running.
     * 
     * @param flags
     *                Not currently used.
     * 
     * @param name
     *                The name of the service instance to be resolved, as reported to the
     *                DNSServiceBrowseReply() callback.
     * 
     * @param regtype
     *                The type of the service instance to be resolved, as reported to the
     *                DNSServiceBrowseReply() callback.
     * 
     * @param domain
     *                The domain of the service instance to be resolved, as reported to the
     *                DNSServiceBrowseReply() callback.
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success or the error that occurred.
     */
    @Generated
    @CFunction
    public static native int PeerConnectionRelease(int flags,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String regtype,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain);

    /**
     * Request a port mapping in the NAT gateway, which maps a port on the local machine
     * to an external port on the NAT.
     * 
     * The NAT should support either PCP, NAT-PMP or the
     * UPnP/IGD protocol for this API to create a successful mapping. Note that this API
     * currently supports IPv4 addresses/mappings only. If the NAT gateway supports PCP and
     * returns an IPv6 address (incorrectly, since this API specifically requests IPv4
     * addresses), the DNSServiceNATPortMappingReply callback will be invoked with errorCode
     * kDNSServiceErr_NATPortMappingUnsupported.
     * 
     * The port mapping will be renewed indefinitely until the client process exits, or
     * explicitly terminates the port mapping request by calling DNSServiceRefDeallocate().
     * The client callback will be invoked, informing the client of the NAT gateway's
     * external IP address and the external port that has been allocated for this client.
     * The client should then record this external IP address and port using whatever
     * directory service mechanism it is using to enable peers to connect to it.
     * (Clients advertising services using Wide-Area DNS-SD DO NOT need to use this API
     * -- when a client calls DNSServiceRegister() NAT mappings are automatically created
     * and the external IP address and port for the service are recorded in the global DNS.
     * Only clients using some directory mechanism other than Wide-Area DNS-SD need to use
     * this API to explicitly map their own ports.)
     * 
     * It's possible that the client callback could be called multiple times, for example
     * if the NAT gateway's IP address changes, or if a configuration change results in a
     * different external port being mapped for this client. Over the lifetime of any long-lived
     * port mapping, the client should be prepared to handle these notifications of changes
     * in the environment, and should update its recorded address and/or port as appropriate.
     * 
     * NOTE: There are two unusual aspects of how the DNSServiceNATPortMappingCreate API works,
     * which were intentionally designed to help simplify client code:
     * 
     * 1. It's not an error to request a NAT mapping when the machine is not behind a NAT gateway.
     * In other NAT mapping APIs, if you request a NAT mapping and the machine is not behind a NAT
     * gateway, then the API returns an error code -- it can't get you a NAT mapping if there's no
     * NAT gateway. The DNSServiceNATPortMappingCreate API takes a different view. Working out
     * whether or not you need a NAT mapping can be tricky and non-obvious, particularly on
     * a machine with multiple active network interfaces. Rather than make every client recreate
     * this logic for deciding whether a NAT mapping is required, the PortMapping API does that
     * work for you. If the client calls the PortMapping API when the machine already has a
     * routable public IP address, then instead of complaining about it and giving an error,
     * the PortMapping API just invokes your callback, giving the machine's public address
     * and your own port number. This means you don't need to write code to work out whether
     * your client needs to call the PortMapping API -- just call it anyway, and if it wasn't
     * necessary, no harm is done:
     * 
     * - If the machine already has a routable public IP address, then your callback
     * will just be invoked giving your own address and port.
     * - If a NAT mapping is required and obtained, then your callback will be invoked
     * giving you the external address and port.
     * - If a NAT mapping is required but not obtained from the local NAT gateway,
     * or the machine has no network connectivity, then your callback will be
     * invoked giving zero address and port.
     * 
     * 2. In other NAT mapping APIs, if a laptop computer is put to sleep and woken up on a new
     * network, it's the client's job to notice this, and work out whether a NAT mapping
     * is required on the new network, and make a new NAT mapping request if necessary.
     * The DNSServiceNATPortMappingCreate API does this for you, automatically.
     * The client just needs to make one call to the PortMapping API, and its callback will
     * be invoked any time the mapping state changes. This property complements point (1) above.
     * If the client didn't make a NAT mapping request just because it determined that one was
     * not required at that particular moment in time, the client would then have to monitor
     * for network state changes to determine if a NAT port mapping later became necessary.
     * By unconditionally making a NAT mapping request, even when a NAT mapping not to be
     * necessary, the PortMapping API will then begin monitoring network state changes on behalf of
     * the client, and if a NAT mapping later becomes necessary, it will automatically create a NAT
     * mapping and inform the client with a new callback giving the new address and port information.
     * 
     * @param sdRef
     *                       A pointer to an uninitialized DNSServiceRef
     *                       (or, if the kDNSServiceFlagsShareConnection flag is used,
     *                       a copy of the shared connection reference that is to be used).
     *                       If the call succeeds then it initializes (or updates) the DNSServiceRef,
     *                       returns kDNSServiceErr_NoError, and the NAT port mapping
     *                       will remain active indefinitely until the client terminates it
     *                       by passing this DNSServiceRef to DNSServiceRefDeallocate()
     *                       (or by closing the underlying shared connection, if used).
     * 
     * @param flags
     *                       Possible values are:
     *                       kDNSServiceFlagsShareConnection to use a shared connection.
     * 
     * @param interfaceIndex
     *                       The interface on which to create port mappings in a NAT gateway.
     *                       Passing 0 causes the port mapping request to be sent on the primary interface.
     * 
     * @param protocol
     *                       To request a port mapping, pass in kDNSServiceProtocol_UDP, or kDNSServiceProtocol_TCP,
     *                       or (kDNSServiceProtocol_UDP | kDNSServiceProtocol_TCP) to map both.
     *                       The local listening port number must also be specified in the internalPort parameter.
     *                       To just discover the NAT gateway's external IP address, pass zero for protocol,
     *                       internalPort, externalPort and ttl.
     * 
     * @param internalPort
     *                       The port number in network byte order on the local machine which is listening for packets.
     * 
     * @param externalPort
     *                       The requested external port in network byte order in the NAT gateway that you would
     *                       like to map to the internal port. Pass 0 if you don't care which external port is chosen
     *                       for you.
     * 
     * @param ttl
     *                       The requested renewal period of the NAT port mapping, in seconds.
     *                       If the client machine crashes, suffers a power failure, is disconnected from
     *                       the network, or suffers some other unfortunate demise which causes it to vanish
     *                       unexpectedly without explicitly removing its NAT port mappings, then the NAT gateway
     *                       will garbage-collect old stale NAT port mappings when their lifetime expires.
     *                       Requesting a short TTL causes such orphaned mappings to be garbage-collected
     *                       more promptly, but consumes system resources and network bandwidth with
     *                       frequent renewal packets to keep the mapping from expiring.
     *                       Requesting a long TTL is more efficient on the network, but in the event of the
     *                       client vanishing, stale NAT port mappings will not be garbage-collected as quickly.
     *                       Most clients should pass 0 to use a system-wide default value.
     * 
     * @param callBack
     *                       The function to be called when the port mapping request succeeds or fails asynchronously.
     * 
     * @param context
     *                       An application context pointer which is passed to the callback function
     *                       (may be NULL).
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success (any subsequent, asynchronous
     *         errors are delivered to the callback), otherwise returns an error code indicating
     *         the error that occurred.
     * 
     *         If you don't actually want a port mapped, and are just calling the API
     *         because you want to find out the NAT's external IP address (e.g. for UI
     *         display) then pass zero for protocol, internalPort, externalPort and ttl.
     */
    @Generated
    @CFunction
    public static native int DNSServiceNATPortMappingCreate(Ptr<DNSServiceRef> sdRef, int flags, int interfaceIndex,
            int protocol, char internalPort, char externalPort, int ttl,
            @FunctionPtr(name = "call_DNSServiceNATPortMappingCreate") Function_DNSServiceNATPortMappingCreate callBack,
            VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_DNSServiceNATPortMappingCreate {
        @Generated
        void call_DNSServiceNATPortMappingCreate(DNSServiceRef arg0, int arg1, int arg2, int arg3, int arg4, int arg5,
                char arg6, char arg7, int arg8, VoidPtr arg9);
    }

    /**
     * Concatenate a three-part domain name (as returned by the above callbacks) into a
     * properly-escaped full domain name. Note that callbacks in the above functions ALREADY ESCAPE
     * strings where necessary.
     * 
     * @param fullName
     *                 A pointer to a buffer that where the resulting full domain name is to be written.
     *                 The buffer must be kDNSServiceMaxDomainName (1009) bytes in length to
     *                 accommodate the longest legal domain name without buffer overrun.
     * 
     * @param service
     *                 The service name - any dots or backslashes must NOT be escaped.
     *                 May be NULL (to construct a PTR record name, e.g.
     *                 "_ftp._tcp.apple.com.").
     * 
     * @param regtype
     *                 The service type followed by the protocol, separated by a dot
     *                 (e.g. "_ftp._tcp").
     * 
     * @param domain
     *                 The domain name, e.g. "apple.com.". Literal dots or backslashes,
     *                 if any, must be escaped, e.g. "1st\. Floor.apple.com."
     * 
     * @return
     *         Returns kDNSServiceErr_NoError (0) on success, kDNSServiceErr_BadParam on error.
     */
    @Generated
    @CFunction
    public static native int DNSServiceConstructFullName(BytePtr fullName,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String service,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String regtype,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain);

    /**
     * Creates a new empty TXTRecordRef referencing the specified storage.
     * 
     * If the buffer parameter is NULL, or the specified storage size is not
     * large enough to hold a key subsequently added using TXTRecordSetValue(),
     * then additional memory will be added as needed using malloc(). Note that
     * an existing TXT record buffer should not be passed to TXTRecordCreate
     * to create a copy of another TXT Record. The correct way to copy TXTRecordRef
     * is creating an empty TXTRecordRef with TXTRecordCreate() first, and using
     * TXTRecordSetValue to set the same value.
     * 
     * On some platforms, when memory is low, malloc() may fail. In this
     * case, TXTRecordSetValue() will return kDNSServiceErr_NoMemory, and this
     * error condition will need to be handled as appropriate by the caller.
     * 
     * You can avoid the need to handle this error condition if you ensure
     * that the storage you initially provide is large enough to hold all
     * the key/value pairs that are to be added to the record.
     * The caller can precompute the exact length required for all of the
     * key/value pairs to be added, or simply provide a fixed-sized buffer
     * known in advance to be large enough.
     * A no-value (key-only) key requires (1 + key length) bytes.
     * A key with empty value requires (1 + key length + 1) bytes.
     * A key with non-empty value requires (1 + key length + 1 + value length).
     * For most applications, DNS-SD TXT records are generally
     * less than 100 bytes, so in most cases a simple fixed-sized
     * 256-byte buffer will be more than sufficient.
     * Recommended size limits for DNS-SD TXT Records are discussed in RFC 6763
     * <https://tools.ietf.org/html/rfc6763#section-6.2>
     * 
     * Note: When passing parameters to and from these TXT record APIs,
     * the key name does not include the '=' character. The '=' character
     * is the separator between the key and value in the on-the-wire
     * packet format; it is not part of either the key or the value.
     * 
     * @param txtRecord
     *                  A pointer to an uninitialized TXTRecordRef.
     * 
     * @param bufferLen
     *                  The size of the storage provided in the "buffer" parameter.
     * 
     * @param buffer
     *                  Optional caller-supplied storage used to hold the TXTRecord data.
     *                  This storage must remain valid for as long as
     *                  the TXTRecordRef.
     */
    @Generated
    @CFunction
    public static native void TXTRecordCreate(VoidPtr txtRecord, char bufferLen, VoidPtr buffer);

    /**
     * Releases any resources allocated in the course of preparing a TXT Record
     * using TXTRecordCreate()/TXTRecordSetValue()/TXTRecordRemoveValue().
     * Ownership of the buffer provided in TXTRecordCreate() returns to the client.
     * 
     * @param txtRecord
     *                  A TXTRecordRef initialized by calling TXTRecordCreate().
     */
    @Generated
    @CFunction
    public static native void TXTRecordDeallocate(VoidPtr txtRecord);

    /**
     * Adds a key (optionally with value) to a TXTRecordRef.
     * 
     * If the "key" already
     * exists in the TXTRecordRef, then the current value will be replaced with
     * the new value.
     * Keys may exist in four states with respect to a given TXT record:
     * - Absent (key does not appear at all)
     * - Present with no value ("key" appears alone)
     * - Present with empty value ("key=" appears in TXT record)
     * - Present with non-empty value ("key=value" appears in TXT record)
     * For more details refer to "Data Syntax for DNS-SD TXT Records" in RFC 6763
     * <https://tools.ietf.org/html/rfc6763#section-6>
     * 
     * @param txtRecord
     *                  A TXTRecordRef initialized by calling TXTRecordCreate().
     * 
     * @param key
     *                  A null-terminated string which only contains printable ASCII
     *                  values (0x20-0x7E), excluding '=' (0x3D). Keys should be
     *                  9 characters or fewer (not counting the terminating null).
     * 
     * @param valueSize
     *                  The size of the value.
     * 
     * @param value
     *                  Any binary value. For values that represent
     *                  textual data, UTF-8 is STRONGLY recommended.
     *                  For values that represent textual data, valueSize
     *                  should NOT include the terminating null (if any)
     *                  at the end of the string.
     *                  If NULL, then "key" will be added with no value.
     *                  If non-NULL but valueSize is zero, then "key=" will be
     *                  added with empty value.
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success.
     *         Returns kDNSServiceErr_Invalid if the "key" string contains
     *         illegal characters.
     *         Returns kDNSServiceErr_NoMemory if adding this key would
     *         exceed the available storage.
     */
    @Generated
    @CFunction
    public static native int TXTRecordSetValue(VoidPtr txtRecord,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            byte valueSize, ConstVoidPtr value);

    /**
     * Removes a key from a TXTRecordRef. The "key" must be an
     * ASCII string which exists in the TXTRecordRef.
     * 
     * @param txtRecord
     *                  A TXTRecordRef initialized by calling TXTRecordCreate().
     * 
     * @param key
     *                  A key name which exists in the TXTRecordRef.
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success.
     *         Returns kDNSServiceErr_NoSuchKey if the "key" does not
     *         exist in the TXTRecordRef.
     */
    @Generated
    @CFunction
    public static native int TXTRecordRemoveValue(VoidPtr txtRecord,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

    /**
     * Allows you to determine the length of the raw bytes within a TXTRecordRef.
     * 
     * @param txtRecord
     *                  A TXTRecordRef initialized by calling TXTRecordCreate().
     * 
     * @return
     *         Returns the size of the raw bytes inside a TXTRecordRef
     *         which you can pass directly to DNSServiceRegister() or
     *         to DNSServiceUpdateRecord().
     *         Returns 0 if the TXTRecordRef is empty.
     */
    @Generated
    @CFunction
    public static native char TXTRecordGetLength(VoidPtr txtRecord);

    /**
     * Allows you to retrieve a pointer to the raw bytes within a TXTRecordRef.
     * 
     * @param txtRecord
     *                  A TXTRecordRef initialized by calling TXTRecordCreate().
     * 
     * @return
     *         Returns a pointer to the raw bytes inside the TXTRecordRef
     *         which you can pass directly to DNSServiceRegister() or
     *         to DNSServiceUpdateRecord().
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr TXTRecordGetBytesPtr(VoidPtr txtRecord);

    /**
     * Allows you to determine if a given TXT Record contains a specified key.
     * 
     * @param txtLen
     *                  The size of the received TXT Record.
     * 
     * @param txtRecord
     *                  Pointer to the received TXT Record bytes.
     * 
     * @param key
     *                  A null-terminated ASCII string containing the key name.
     * 
     * @return
     *         Returns 1 if the TXT Record contains the specified key.
     *         Otherwise, it returns 0.
     */
    @Generated
    @CFunction
    public static native int TXTRecordContainsKey(char txtLen, ConstVoidPtr txtRecord,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

    /**
     * Allows you to retrieve the value for a given key from a TXT Record.
     * 
     * Returns NULL if the key does not exist in this TXT record,
     * or exists with no value (to differentiate between
     * these two cases use TXTRecordContainsKey()).
     * Returns pointer to location within TXT Record bytes
     * if the key exists with empty or non-empty value.
     * For empty value, valueLen will be zero.
     * For non-empty value, valueLen will be length of value data.
     * 
     * @param txtLen
     *                  The size of the received TXT Record
     * 
     * @param txtRecord
     *                  Pointer to the received TXT Record bytes.
     * 
     * @param key
     *                  A null-terminated ASCII string containing the key name.
     * 
     * @param valueLen
     *                  On output, will be set to the size of the "value" data.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr TXTRecordGetValuePtr(char txtLen, ConstVoidPtr txtRecord,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            BytePtr valueLen);

    /**
     * Returns the number of keys stored in the TXT Record. The count
     * can be used with TXTRecordGetItemAtIndex() to iterate through the keys.
     * 
     * @param txtLen
     *                  The size of the received TXT Record.
     * 
     * @param txtRecord
     *                  Pointer to the received TXT Record bytes.
     * 
     * @return
     *         Returns the total number of keys in the TXT Record.
     */
    @Generated
    @CFunction
    public static native char TXTRecordGetCount(char txtLen, ConstVoidPtr txtRecord);

    /**
     * Allows you to retrieve a key name and value pointer, given an index into
     * a TXT Record. Legal index values range from zero to TXTRecordGetCount()-1.
     * It's also possible to iterate through keys in a TXT record by simply
     * calling TXTRecordGetItemAtIndex() repeatedly, beginning with index zero
     * and increasing until TXTRecordGetItemAtIndex() returns kDNSServiceErr_Invalid.
     * 
     * @param txtLen
     *                  The size of the received TXT Record.
     * 
     * @param txtRecord
     *                  Pointer to the received TXT Record bytes.
     * 
     * @param itemIndex
     *                  An index into the TXT Record.
     * 
     * @param keyBufLen
     *                  The size of the string buffer being supplied.
     * 
     * @param key
     *                  A string buffer used to store the key name.
     *                  On return, the buffer contains a null-terminated C-string
     *                  giving the key name. DNS-SD TXT keys are usually
     *                  9 characters or fewer. To hold the maximum possible
     *                  key name, the buffer should be 256 bytes long.
     * 
     * @param valueLen
     *                  On output, will be set to the size of the "value" data.
     * 
     * @param value
     *                  On output, *value is set to point to location within TXT
     *                  Record bytes that holds the value data.
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success.
     *         Returns kDNSServiceErr_NoMemory if keyBufLen is too short.
     *         Returns kDNSServiceErr_Invalid if index is greater than
     *         TXTRecordGetCount()-1.
     *         On return:
     *         For keys with no value, *value is set to NULL and *valueLen is zero.
     *         For keys with empty value, *value is non-NULL and *valueLen is zero.
     *         For keys with non-empty value, *value is non-NULL and *valueLen is non-zero.
     */
    @Generated
    @CFunction
    public static native int TXTRecordGetItemAtIndex(char txtLen, ConstVoidPtr txtRecord, char itemIndex,
            char keyBufLen, BytePtr key, BytePtr valueLen, Ptr<ConstVoidPtr> value);

    /**
     * Allows you to schedule a DNSServiceRef on a serial dispatch queue for receiving asynchronous
     * callbacks. It's the clients responsibility to ensure that the provided dispatch queue is running.
     * 
     * A typical application that uses CFRunLoopRun or dispatch_main on its main thread will
     * usually schedule DNSServiceRefs on its main queue (which is always a serial queue)
     * using "DNSServiceSetDispatchQueue(sdref, dispatch_get_main_queue());"
     * 
     * If there is any error during the processing of events, the application callback will
     * be called with an error code. For shared connections, each subordinate DNSServiceRef
     * will get its own error callback. Currently these error callbacks only happen
     * if the daemon is manually terminated or crashes, and the error
     * code in this case is kDNSServiceErr_ServiceNotRunning. The application must call
     * DNSServiceRefDeallocate to free the DNSServiceRef when it gets such an error code.
     * These error callbacks are rare and should not normally happen on customer machines,
     * but application code should be written defensively to handle such error callbacks
     * gracefully if they occur.
     * 
     * After using DNSServiceSetDispatchQueue on a DNSServiceRef, calling DNSServiceProcessResult
     * on the same DNSServiceRef will result in undefined behavior and should be avoided.
     * 
     * Once the application successfully schedules a DNSServiceRef on a serial dispatch queue using
     * DNSServiceSetDispatchQueue, it cannot remove the DNSServiceRef from the dispatch queue, or use
     * DNSServiceSetDispatchQueue a second time to schedule the DNSServiceRef onto a different serial dispatch
     * queue. Once scheduled onto a dispatch queue a DNSServiceRef will deliver events to that queue until
     * the application no longer requires that operation and terminates it using DNSServiceRefDeallocate.
     * Note that the call to DNSServiceRefDeallocate() must be done on the same queue originally passed
     * as an argument to DNSServiceSetDispatchQueue().
     * 
     * @param service
     *                DNSServiceRef that was allocated and returned to the application, when the
     *                application calls one of the DNSService API.
     * 
     * @param queue
     *                dispatch queue where the application callback will be scheduled
     * 
     * @return
     *         Returns kDNSServiceErr_NoError on success.
     *         Returns kDNSServiceErr_NoMemory if it cannot create a dispatch source
     *         Returns kDNSServiceErr_BadParam if the service param is invalid or the
     *         queue param is invalid
     */
    @Generated
    @CFunction
    public static native int DNSServiceSetDispatchQueue(DNSServiceRef service, dispatch_queue_t queue);

    @Generated
    @CFunction
    public static native int DNSServiceSleepKeepalive(Ptr<DNSServiceRef> sdRef, int flags, int fd, int timeout,
            @FunctionPtr(name = "call_DNSServiceSleepKeepalive") Function_DNSServiceSleepKeepalive callBack,
            VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_DNSServiceSleepKeepalive {
        @Generated
        void call_DNSServiceSleepKeepalive(DNSServiceRef arg0, int arg1, VoidPtr arg2);
    }

    @Generated
    @CVariable()
    @ByValue
    public static native mach_header __dso_handle();

    /**
     * [@function] os_signpost_id_make_with_pointer
     * 
     * Make an os_signpost_id from a pointer value.
     * 
     * Mangles the pointer to create a valid os_signpost_id, including removing
     * address randomization. Checks that the signpost matching scope is not
     * system-wide.
     * 
     * @param log
     *            Log handle previously created with os_log_create.
     * 
     * @param ptr
     *            Any pointer that disambiguates among concurrent intervals with the same
     *            os_log_t and interval names.
     * 
     * @return
     *         Returns a valid os_signpost_id_t. Returns OS_SIGNPOST_ID_NULL if signposts
     *         are turned off. Returns OS_SIGNPOST_ID_INVALID if the log handle is
     *         system-scoped.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native long os_signpost_id_make_with_pointer(@NotNull os_log_t log, @Nullable ConstVoidPtr ptr);

    /**
     * [@function] os_signpost_id_generate
     * 
     * Generates an ID guaranteed to be unique within the matching scope of the
     * provided log handle.
     * 
     * Each call to os_signpost_id_generate() with a given log handle and its
     * matching scope will return a different os_signpost_id_t.
     * 
     * @param log
     *            Log handle previously created with os_log_create.
     * 
     * @return
     *         Returns a valid os_signpost_id_t. Returns OS_SIGNPOST_ID_NULL if signposts
     *         are disabled.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native long os_signpost_id_generate(@NotNull os_log_t log);

    /**
     * [@function] os_signpost_enabled
     * 
     * Returns true if signpost log messages are enabled for a particular log
     * handle.
     * 
     * Returns true if signpost log messages are enabled for a particular log.
     * Use this to avoid doing expensive argument marshalling leading into a call
     * to os_signpost_*
     * 
     * @param log
     *            Log handle previously created with os_log_create.
     * 
     * @return
     *         Returns ‘true’ if signpost log messages are enabled.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean os_signpost_enabled(@NotNull os_log_t log);

    /**
     * API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void _os_signpost_emit_with_name_impl(@NotNull VoidPtr dso, @NotNull os_log_t log, byte type,
            long spid,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String format,
            @NotNull BytePtr buf, int size);

    /**
     * API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native int __darwin_check_fd_set_overflow(int arg1, ConstVoidPtr arg2, int arg3);

    @Generated
    @Inline
    @CFunction
    public static native int __darwin_check_fd_set(int _a, ConstVoidPtr _b);

    @Generated
    @Inline
    @CFunction
    public static native void __darwin_fd_set(int _fd,
            @UncertainArgument("Options: reference, array Fallback: reference") fd_set _p);

    @Generated
    @Inline
    @CFunction
    public static native void __darwin_fd_clr(int _fd,
            @UncertainArgument("Options: reference, array Fallback: reference") fd_set _p);

    /**
     * Returns a pointer to any extra bytes allocated with an instance given object.
     * 
     * [@note] This function returns a pointer to any extra bytes allocated with the instance
     * (as specified by \c class_createInstance with extraBytes>0). This memory follows the
     * object's ordinary ivars, but may not be adjacent to the last ivar.
     * [@note] The returned pointer is guaranteed to be pointer-size aligned, even if the area following
     * the object's last ivar is less aligned than that. Alignment greater than pointer-size is never
     * guaranteed, even if the area following the object's last ivar is more aligned than that.
     * [@note] In a garbage-collected environment, the memory is scanned conservatively.
     * 
     * API-Since: 2.0
     * 
     * @param obj An Objective-C object.
     * 
     * @return A pointer to any extra bytes allocated with \e obj. If \e obj was
     *         not allocated with any extra bytes, then dereferencing the returned pointer is undefined.
     */
    @Nullable
    @Generated
    @CFunction
    public static native VoidPtr object_getIndexedIvars(@Nullable @Mapped(ObjCObjectMapper.class) Object obj);

    /**
     * API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native VoidPtr aligned_alloc(@NUInt long __alignment, @NUInt long __size);

    /**
     * reallocf is now declared in _malloc.h
     * 
     * API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native long strtonum(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __numstr,
            long __minval, long __maxval,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] __errstrp);

    /**
     * API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native int strsignal_r(int __sig, BytePtr __strsignalbuf, @NUInt long __buflen);

    /**
     * [@function] os_workgroup_create_with_workgroup
     * 
     * Create a new os_workgroup object from an existing os_workgroup.
     * 
     * The newly created os_workgroup has no initial member threads - in particular
     * the creating threaad does not join the os_workgroup_t implicitly.
     * 
     * @param name
     *             A client specified string for labelling the workgroup. This parameter is
     *             optional and can be NULL.
     * 
     * @param wg
     *             The existing workgroup to create a new workgroup object from.
     * 
     *             API-Since: 14.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native os_workgroup_t os_workgroup_create_with_workgroup(
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @NotNull os_workgroup_t wg);

    /**
     * [@function] os_workgroup_join
     * 
     * Joins the current thread to the specified workgroup and populates the join
     * token that has been passed in. This API is real-time safe.
     * 
     * @param wg
     *                  The workgroup that the current thread would like to join
     * 
     * @param token_out
     *                  Pointer to a client allocated struct which the function will populate
     *                  with the join token. This token must be passed in by the thread when it calls
     *                  os_workgroup_leave().
     * 
     *                  Errors will be returned in the following cases:
     * 
     *                  EALREADY The thread is already part of a workgroup that the specified
     *                  workgroup does not nest with
     *                  EINVAL The workgroup has been cancelled
     * 
     *                  API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native int os_workgroup_join(@NotNull os_workgroup_t wg,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_join_token_opaque_s token_out);

    /**
     * [@function] os_workgroup_leave
     * 
     * This removes the current thread from a workgroup it has previously
     * joined. Threads must leave all workgroups in the reverse order that they
     * have joined them. Failing to do so before exiting will result in undefined
     * behavior.
     * 
     * If the join token is malformed, the process will be aborted.
     * 
     * This API is real time safe.
     * 
     * @param wg
     *              The workgroup that the current thread would like to leave.
     * 
     * @param token
     *              This is the join token populated by the most recent call to
     *              os_workgroup_join().
     * 
     *              API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void os_workgroup_leave(@NotNull os_workgroup_t wg,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_join_token_opaque_s token);

    /**
     * [@function] os_workgroup_set_working_arena
     * 
     * Associates a client defined working arena with the workgroup. The arena
     * is local to the workgroup object in the process. This is intended for
     * distributing a manually managed memory allocation between member threads
     * of the workgroup.
     * 
     * This function can be called multiple times and the client specified
     * destructor will be called on the previously assigned arena, if any. This
     * function can only be called when no threads have currently joined the
     * workgroup and all workloops associated with the workgroup are idle.
     * 
     * @param wg
     *                    The workgroup to associate the working arena with
     * 
     * @param arena
     *                    The client managed arena to associate with the workgroup. This value can
     *                    be NULL.
     * 
     * @param max_workers
     *                    The maximum number of threads that will ever query the workgroup for the
     *                    arena and request an index into it. If the arena is not used to partition
     *                    work amongst member threads, then this field can be 0.
     * 
     * @param destructor
     *                    A destructor to call on the previously assigned working arena, if any
     * 
     *                    API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native int os_workgroup_set_working_arena(@NotNull os_workgroup_t wg, @Nullable VoidPtr arena,
            int max_workers,
            @NotNull @FunctionPtr(name = "call_os_workgroup_set_working_arena") Function_os_workgroup_set_working_arena destructor);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_os_workgroup_set_working_arena {
        @Generated
        void call_os_workgroup_set_working_arena(@Nullable VoidPtr arg0);
    }

    /**
     * [@function] os_workgroup_get_working_arena
     * 
     * Returns the working arena associated with the workgroup and the current
     * thread's index in the workgroup. This function can only be called by a member
     * of the workgroup. Multiple calls to this API by a member thread will return
     * the same arena and index until the thread leaves the workgroup.
     * 
     * For workloops with an associated workgroup, every work item on the workloop
     * will receive the same index in the arena.
     * 
     * This method returns NULL if no arena is set on the workgroup. The index
     * returned by this function is zero-based and is namespaced per workgroup
     * object in the process. The indices provided are strictly monotonic and never
     * reused until a future call to os_workgroup_set_working_arena.
     * 
     * @param wg
     *                  The workgroup to get the working arena from.
     * 
     * @param index_out
     *                  A pointer to a os_workgroup_index which will be populated by the caller's
     *                  index in the workgroup.
     * 
     *                  API-Since: 14.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native VoidPtr os_workgroup_get_working_arena(@NotNull os_workgroup_t wg, @Nullable IntPtr index_out);

    /**
     * [@function] os_workgroup_cancel
     * 
     * This API invalidates a workgroup and indicates to the system that the
     * workload is no longer relevant to the caller.
     * 
     * No new work should be initiated for a cancelled workgroup and
     * work that is already underway should periodically check for
     * cancellation with os_workgroup_testcancel and initiate cleanup if needed.
     * 
     * Threads currently in the workgroup continue to be tracked together but no
     * new threads may join this workgroup - the only possible operation allowed is
     * to leave the workgroup. Other actions may have undefined behavior or
     * otherwise fail.
     * 
     * This API is idempotent. Cancellation is local to the workgroup object
     * it is called on and does not affect other workgroups.
     * 
     * @param wg
     *           The workgroup that that the thread would like to cancel
     * 
     *           API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void os_workgroup_cancel(@NotNull os_workgroup_t wg);

    /**
     * [@function] os_workgroup_testcancel
     * 
     * Returns true if the workgroup object has been cancelled. See also
     * os_workgroup_cancel
     * 
     * API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native boolean os_workgroup_testcancel(@NotNull os_workgroup_t wg);

    /**
     * [@function] os_workgroup_max_parallel_threads
     * 
     * Returns the system's recommendation for maximum number of threads the client
     * should make for a multi-threaded workload in a given workgroup.
     * 
     * This API takes into consideration the current hardware the code is running on
     * and the attributes of the workgroup. It does not take into consideration the
     * current load of the system and therefore always provides the most optimal
     * recommendation for the workload.
     * 
     * @param wg
     *             The workgroup in which the multi-threaded workload will be performed in. The
     *             threads performing the multi-threaded workload are expected to join this
     *             workgroup.
     * 
     * @param attr
     *             This value is currently unused and should be NULL.
     * 
     *             API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native int os_workgroup_max_parallel_threads(@NotNull os_workgroup_t wg,
            @Nullable os_workgroup_mpt_attr_t attr);

    /**
     * [@function] os_workgroup_interval_start
     * 
     * Indicates to the system that the member threads of this
     * os_workgroup_interval_t have begun working on an instance of the repeatable
     * interval workload with the specified timestamps. This function is real time
     * safe.
     * 
     * This function will set and return an errno in the following cases:
     * 
     * - The current thread is not a member of the os_workgroup_interval_t
     * - The os_workgroup_interval_t has been cancelled
     * - The timestamps passed in are malformed
     * - os_workgroup_interval_start() was previously called on the
     * os_workgroup_interval_t without an intervening os_workgroup_interval_finish()
     * - A concurrent workgroup interval configuration operation is taking place.
     * 
     * @param start
     *                 Start timestamp specified in the os_clockid_t with which the
     *                 os_workgroup_interval_t was created. This is generally a time in the past and
     *                 indicates when the workgroup started working on an interval period
     * 
     * @param deadline
     *                 Deadline timestamp specified in the os_clockid_t with which the
     *                 os_workgroup_interval_t was created. This specifies the deadline which the
     *                 interval period would like to meet.
     * 
     * @param data
     *                 This field is currently unused and should be NULL
     * 
     *                 API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native int os_workgroup_interval_start(@NotNull os_workgroup_t wg, long start, long deadline,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_interval_data_opaque_s data);

    /**
     * [@function] os_workgroup_interval_update
     * 
     * Updates an already started workgroup interval to have the new
     * deadline specified. This function is real time safe.
     * 
     * This function will return an error in the following cases:
     * - The current thread is not a member of the os_workgroup_interval_t
     * - The os_workgroup_interval_t has been cancelled
     * - The timestamp passed in is malformed
     * - os_workgroup_interval_start() was not previously called on the
     * os_workgroup_interval_t or was already matched with an
     * os_workgroup_interval_finish()
     * - A concurrent workgroup interval configuration operation is taking place
     * 
     * @param deadline
     *                 Timestamp specified in the os_clockid_t with
     *                 which the os_workgroup_interval_t was created.
     * 
     * @param data
     *                 This field is currently unused and should be NULL
     * 
     *                 API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native int os_workgroup_interval_update(@NotNull os_workgroup_t wg, long deadline,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_interval_data_opaque_s data);

    /**
     * [@function] os_workgroup_interval_finish
     * 
     * Indicates to the system that the member threads of
     * this os_workgroup_interval_t have finished working on the current instance
     * of the interval workload. This function is real time safe.
     * 
     * This function will return an error in the following cases:
     * - The current thread is not a member of the os_workgroup_interval_t
     * - os_workgroup_interval_start() was not previously called on the
     * os_workgroup_interval_t or was already matched with an
     * os_workgroup_interval_finish()
     * - A concurrent workgroup interval configuration operation is taking place.
     * 
     * @param data
     *             This field is currently unused and should be NULL
     * 
     *             API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native int os_workgroup_interval_finish(@NotNull os_workgroup_t wg,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_interval_data_opaque_s data);

    /**
     * [@function] os_workgroup_parallel_create
     * 
     * Creates an os_workgroup_t which tracks a parallel workload.
     * A newly created os_workgroup_interval_t has no initial member threads -
     * in particular the creating thread does not join the os_workgroup_parallel_t
     * implicitly.
     * 
     * See also os_workgroup_max_parallel_threads().
     * 
     * @param name
     *             A client specified string for labelling the workgroup. This parameter is
     *             optional and can be NULL.
     * 
     * @param attr
     *             The requested set of workgroup attributes. NULL is to be specified for the
     *             default set of attributes.
     * 
     *             API-Since: 14.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native os_workgroup_t os_workgroup_parallel_create(
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_attr_opaque_s attr);

    /**
     * [@function] dispatch_workloop_set_os_workgroup
     * 
     * Associates an os_workgroup_t with the specified dispatch workloop.
     * 
     * The worker thread will be a member of the specified os_workgroup_t while executing
     * work items submitted to the workloop.
     * 
     * Using both dispatch_workloop_set_scheduler_priority() and
     * dispatch_workloop_set_os_workgroup() will prefer scheduling policies
     * from the workgroup, if they exist.
     * 
     * @param workloop
     *                  The dispatch workloop to modify.
     * 
     *                  This workloop must be inactive, passing an activated object is undefined
     *                  and will cause the process to be terminated.
     * 
     * @param workgroup
     *                  The workgroup to associate with this workloop.
     * 
     *                  The workgroup specified is retained and the previously associated workgroup
     *                  (if any) is released.
     * 
     *                  API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native void dispatch_workloop_set_os_workgroup(@NotNull dispatch_queue_t workloop,
            @NotNull os_workgroup_t workgroup);

    /**
     * List definitions after function declarations, or Reiser cpp gets upset.
     */
    @Generated
    @Inline
    @CFunction
    public static native int __sigbits(int __signo);

    /**
     * API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native int timespec_get(
            @UncertainArgument("Options: reference, array Fallback: reference") timespec ts, int base);

    /**
     * [@function] _os_activity_label_useraction
     * 
     * Internal function for use by os_activity_label_useraction.
     * 
     * [@warning]
     * Do not use directly.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native void _os_activity_label_useraction(@NotNull VoidPtr dso,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    /**
     * [@function] _os_activity_initiate
     * 
     * Do not use directly because your description will not be preserved.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native void _os_activity_initiate(@NotNull VoidPtr dso,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String description,
            int flags,
            @NotNull @ObjCBlock(name = "call__os_activity_initiate") Block__os_activity_initiate activity_block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block__os_activity_initiate {
        @Generated
        void call__os_activity_initiate();
    }

    /**
     * [@function] _os_activity_initiate_f
     * 
     * Do not use directly because your description will not be preserved.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native void _os_activity_initiate_f(@NotNull VoidPtr dso,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String description,
            int flags, @NotNull VoidPtr context,
            @NotNull @FunctionPtr(name = "call__os_activity_initiate_f") Function__os_activity_initiate_f function);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function__os_activity_initiate_f {
        @Generated
        void call__os_activity_initiate_f(@Nullable VoidPtr arg0);
    }

    /**
     * [@function] os_activity_get_active
     * 
     * Returns the stack of nested activities associated with the current thread.
     * 
     * Activities have a sense of nesting and therefore there could be more than
     * one activity involved on the current thread. This should be used by
     * diagnostic tools only for making additional decisions about a situation.
     * 
     * @param entries
     *                Pass a buffer of sufficient size to hold the the number of os_activity_id_t
     *                being requested.
     * 
     * @param count
     *                Pointer to the requested number of activity identifiers.
     *                On output will be filled with the number of activities that are available.
     * 
     * @return
     *         Number of activity identifiers written to 'entries'
     * 
     *         API-Since: 8.0
     *         Deprecated-Since: 10.0
     *         Deprecated-Message: No longer supported
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int os_activity_get_active(@NotNull LongPtr entries, @NotNull IntPtr count);

    /**
     * [@function] os_activity_get_identifier
     * 
     * Returns the current activity ID and will fill the parent_id if present.
     * 
     * Returns the current activity ID and will fill the parent_id if present.
     * 
     * @param parent_id
     *                  If non-null will set the parent activity ID.
     * 
     * @return
     *         The identifier for the provided activity.
     * 
     *         API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native long os_activity_get_identifier(long activity, @Nullable LongPtr parent_id);

    /**
     * [@function] _os_activity_start
     * 
     * Internal function for activity start, do not use directly will not preserve
     * description.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: use combination of os_activity_create and os_activity_apply/os_activity_scope
     */
    @Deprecated
    @Generated
    @CFunction
    public static native long _os_activity_start(@NotNull VoidPtr dso,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String description,
            int flags);

    /**
     * [@function] os_activity_end
     * 
     * [@warning]
     * Deprecated please use new os_activity_create and os_activity_apply.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: use combination of os_activity_create and os_activity_apply/os_activity_scope
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void os_activity_end(long activity);

    /**
     * [@function] _os_activity_set_breadcrumb
     * 
     * [@warning]
     * Deprecated, please use os_activity_label_useraction.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void _os_activity_set_breadcrumb(@NotNull VoidPtr dso,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long freadlink(int arg1, BytePtr arg2, @NUInt long arg3);

    @Generated
    @Variadic()
    @CFunction
    public static native int openat_dprotected_np(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            int arg4, int arg5, Object... varargs);

    @Generated
    @CFunction
    public static native int openat_authenticated_np(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            int arg4);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int DNSServiceUpdateRecordWithAttribute(@Nullable DNSServiceRef sdRef,
            @Nullable DNSRecordRef recordRef, int flags, char rdlen, @Nullable ConstVoidPtr rdata, int ttl,
            @Nullable DNSServiceAttributeRef attr);

    /**
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native DNSServiceAttributeRef DNSServiceAttributeCreate();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int DNSServiceAttributeSetAAAAPolicy(@NotNull DNSServiceAttributeRef attr, int policy);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int DNSServiceAttributeSetTimestamp(@NotNull DNSServiceAttributeRef attr, int timestamp);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native void DNSServiceAttributeDeallocate(@NotNull DNSServiceAttributeRef attr);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int DNSServiceQueryRecordWithAttribute(@Nullable Ptr<DNSServiceRef> sdRef, int flags,
            int ifindex,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            char rrtype, char rrclass, @Nullable VoidPtr attr,
            @Nullable @FunctionPtr(name = "call_DNSServiceQueryRecordWithAttribute") Function_DNSServiceQueryRecordWithAttribute callback,
            @Nullable VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_DNSServiceQueryRecordWithAttribute {
        @Generated
        void call_DNSServiceQueryRecordWithAttribute(DNSServiceRef arg0, int arg1, int arg2, int arg3,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
                char arg5, char arg6, char arg7, ConstVoidPtr arg8, int arg9, VoidPtr arg10);
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int DNSServiceRegisterWithAttribute(@Nullable Ptr<DNSServiceRef> sdRef, int flags,
            int interfaceIndex,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String regtype,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String host,
            char portInNetworkByteOrder, char txtLen, @Nullable ConstVoidPtr txtRecord,
            @Nullable DNSServiceAttributeRef attr,
            @Nullable @FunctionPtr(name = "call_DNSServiceRegisterWithAttribute") Function_DNSServiceRegisterWithAttribute callBack,
            @Nullable VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_DNSServiceRegisterWithAttribute {
        @Generated
        void call_DNSServiceRegisterWithAttribute(DNSServiceRef arg0, int arg1, int arg2,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg5,
                VoidPtr arg6);
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int DNSServiceRegisterRecordWithAttribute(@Nullable DNSServiceRef sdRef,
            @Nullable Ptr<DNSRecordRef> recordRef, int flags, int interfaceIndex,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String fullname,
            char rrtype, char rrclass, char rdlen, @Nullable ConstVoidPtr rdata, int ttl,
            @Nullable DNSServiceAttributeRef attr,
            @Nullable @FunctionPtr(name = "call_DNSServiceRegisterRecordWithAttribute") Function_DNSServiceRegisterRecordWithAttribute callBack,
            @Nullable VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_DNSServiceRegisterRecordWithAttribute {
        @Generated
        void call_DNSServiceRegisterRecordWithAttribute(DNSServiceRef arg0, DNSRecordRef arg1, int arg2, int arg3,
                VoidPtr arg4);
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int DNSServiceSendQueuedRequests(@Nullable DNSServiceRef sdRef);

    @Generated public static final double __DARWIN_ONLY_64_BIT_INO_T = 1.0;
    @Generated public static final double __DARWIN_ONLY_UNIX_CONFORMANCE = 1.0;
    @Generated public static final double __DARWIN_ONLY_VERS_1050 = 1.0;
    @Generated public static final double __DARWIN_UNIX03 = 1.0;
    @Generated public static final double __DARWIN_64_BIT_INO_T = 1.0;
    @Generated public static final double __DARWIN_VERS_1050 = 1.0;
    @Generated public static final double __DARWIN_NON_CANCELABLE = 0.0;
    @Generated public static final double __DARWIN_NO_LONG_LONG = 0.0;
    @Generated public static final double _DARWIN_FEATURE_64_BIT_INODE = 1.0;
    @Generated public static final double _DARWIN_FEATURE_ONLY_64_BIT_INODE = 1.0;
    @Generated public static final double _DARWIN_FEATURE_ONLY_VERS_1050 = 1.0;
    @Generated public static final double _DARWIN_FEATURE_ONLY_UNIX_CONFORMANCE = 1.0;
    @Generated public static final double _DARWIN_FEATURE_UNIX_CONFORMANCE = 3.0;
    @Generated public static final double __has_ptrcheck = 0.0;
    @Generated public static final double __PTHREAD_SIZE__ = 8176.0;
    @Generated public static final double __PTHREAD_ATTR_SIZE__ = 56.0;
    @Generated public static final double __PTHREAD_MUTEXATTR_SIZE__ = 8.0;
    @Generated public static final double __PTHREAD_MUTEX_SIZE__ = 56.0;
    @Generated public static final double __PTHREAD_CONDATTR_SIZE__ = 8.0;
    @Generated public static final double __PTHREAD_COND_SIZE__ = 40.0;
    @Generated public static final double __PTHREAD_ONCE_SIZE__ = 8.0;
    @Generated public static final double __PTHREAD_RWLOCK_SIZE__ = 192.0;
    @Generated public static final double __PTHREAD_RWLOCKATTR_SIZE__ = 16.0;
    @Generated public static final double _QUAD_HIGHWORD = 1.0;
    @Generated public static final double _QUAD_LOWWORD = 0.0;
    @Generated public static final double __DARWIN_LITTLE_ENDIAN = 1234.0;
    @Generated public static final double __DARWIN_BIG_ENDIAN = 4321.0;
    @Generated public static final double __DARWIN_PDP_ENDIAN = 3412.0;
    @Generated public static final double __WORDSIZE = 64.0;
    @Generated public static final double INT8_MAX = 127.0;
    @Generated public static final double INT16_MAX = 32767.0;
    @Generated public static final double INT32_MAX = 2.147483647E9;
    @Generated public static final double INT8_MIN = -128.0;
    @Generated public static final double INT16_MIN = -32768.0;
    @Generated public static final double UINT8_MAX = 255.0;
    @Generated public static final double UINT16_MAX = 65535.0;
    @Generated public static final double __API_TO_BE_DEPRECATED = 100000.0;
    @Generated public static final double __API_TO_BE_DEPRECATED_MACOS = 100000.0;
    @Generated public static final double __API_TO_BE_DEPRECATED_IOS = 100000.0;
    @Generated public static final double __API_TO_BE_DEPRECATED_TVOS = 100000.0;
    @Generated public static final double __API_TO_BE_DEPRECATED_WATCHOS = 100000.0;
    @Generated public static final double __API_TO_BE_DEPRECATED_MACCATALYST = 100000.0;
    @Generated public static final double __API_TO_BE_DEPRECATED_DRIVERKIT = 100000.0;
    @Generated public static final double __MAC_10_0 = 1000.0;
    @Generated public static final double __MAC_10_1 = 1010.0;
    @Generated public static final double __MAC_10_2 = 1020.0;
    @Generated public static final double __MAC_10_3 = 1030.0;
    @Generated public static final double __MAC_10_4 = 1040.0;
    @Generated public static final double __MAC_10_5 = 1050.0;
    @Generated public static final double __MAC_10_6 = 1060.0;
    @Generated public static final double __MAC_10_7 = 1070.0;
    @Generated public static final double __MAC_10_8 = 1080.0;
    @Generated public static final double __MAC_10_9 = 1090.0;
    @Generated public static final double __MAC_10_10 = 101000.0;
    @Generated public static final double __MAC_10_10_2 = 101002.0;
    @Generated public static final double __MAC_10_10_3 = 101003.0;
    @Generated public static final double __MAC_10_11 = 101100.0;
    @Generated public static final double __MAC_10_11_2 = 101102.0;
    @Generated public static final double __MAC_10_11_3 = 101103.0;
    @Generated public static final double __MAC_10_11_4 = 101104.0;
    @Generated public static final double __MAC_10_12 = 101200.0;
    @Generated public static final double __MAC_10_12_1 = 101201.0;
    @Generated public static final double __MAC_10_12_2 = 101202.0;
    @Generated public static final double __MAC_10_12_4 = 101204.0;
    @Generated public static final double __MAC_10_13 = 101300.0;
    @Generated public static final double __MAC_10_13_1 = 101301.0;
    @Generated public static final double __MAC_10_13_2 = 101302.0;
    @Generated public static final double __MAC_10_13_4 = 101304.0;
    @Generated public static final double __MAC_10_14 = 101400.0;
    @Generated public static final double __MAC_10_14_1 = 101401.0;
    @Generated public static final double __MAC_10_14_4 = 101404.0;
    @Generated public static final double __MAC_10_14_6 = 101406.0;
    @Generated public static final double __MAC_10_15 = 101500.0;
    @Generated public static final double __MAC_10_15_1 = 101501.0;
    @Generated public static final double __MAC_10_15_4 = 101504.0;
    @Generated public static final double __MAC_10_16 = 101600.0;
    @Generated public static final double __MAC_11_0 = 110000.0;
    @Generated public static final double __MAC_11_1 = 110100.0;
    @Generated public static final double __MAC_11_3 = 110300.0;
    @Generated public static final double __MAC_11_4 = 110400.0;
    @Generated public static final double __MAC_11_5 = 110500.0;
    @Generated public static final double __MAC_11_6 = 110600.0;
    @Generated public static final double __MAC_12_0 = 120000.0;
    @Generated public static final double __MAC_12_1 = 120100.0;
    @Generated public static final double __MAC_12_2 = 120200.0;
    @Generated public static final double __MAC_12_3 = 120300.0;
    @Generated public static final double __MAC_13_0 = 130000.0;
    @Generated public static final double __MAC_13_1 = 130100.0;
    @Generated public static final double __IPHONE_2_0 = 20000.0;
    @Generated public static final double __IPHONE_2_1 = 20100.0;
    @Generated public static final double __IPHONE_2_2 = 20200.0;
    @Generated public static final double __IPHONE_3_0 = 30000.0;
    @Generated public static final double __IPHONE_3_1 = 30100.0;
    @Generated public static final double __IPHONE_3_2 = 30200.0;
    @Generated public static final double __IPHONE_4_0 = 40000.0;
    @Generated public static final double __IPHONE_4_1 = 40100.0;
    @Generated public static final double __IPHONE_4_2 = 40200.0;
    @Generated public static final double __IPHONE_4_3 = 40300.0;
    @Generated public static final double __IPHONE_5_0 = 50000.0;
    @Generated public static final double __IPHONE_5_1 = 50100.0;
    @Generated public static final double __IPHONE_6_0 = 60000.0;
    @Generated public static final double __IPHONE_6_1 = 60100.0;
    @Generated public static final double __IPHONE_7_0 = 70000.0;
    @Generated public static final double __IPHONE_7_1 = 70100.0;
    @Generated public static final double __IPHONE_8_0 = 80000.0;
    @Generated public static final double __IPHONE_8_1 = 80100.0;
    @Generated public static final double __IPHONE_8_2 = 80200.0;
    @Generated public static final double __IPHONE_8_3 = 80300.0;
    @Generated public static final double __IPHONE_8_4 = 80400.0;
    @Generated public static final double __IPHONE_9_0 = 90000.0;
    @Generated public static final double __IPHONE_9_1 = 90100.0;
    @Generated public static final double __IPHONE_9_2 = 90200.0;
    @Generated public static final double __IPHONE_9_3 = 90300.0;
    @Generated public static final double __IPHONE_10_0 = 100000.0;
    @Generated public static final double __IPHONE_10_1 = 100100.0;
    @Generated public static final double __IPHONE_10_2 = 100200.0;
    @Generated public static final double __IPHONE_10_3 = 100300.0;
    @Generated public static final double __IPHONE_11_0 = 110000.0;
    @Generated public static final double __IPHONE_11_1 = 110100.0;
    @Generated public static final double __IPHONE_11_2 = 110200.0;
    @Generated public static final double __IPHONE_11_3 = 110300.0;
    @Generated public static final double __IPHONE_11_4 = 110400.0;
    @Generated public static final double __IPHONE_12_0 = 120000.0;
    @Generated public static final double __IPHONE_12_1 = 120100.0;
    @Generated public static final double __IPHONE_12_2 = 120200.0;
    @Generated public static final double __IPHONE_12_3 = 120300.0;
    @Generated public static final double __IPHONE_12_4 = 120400.0;
    @Generated public static final double __IPHONE_13_0 = 130000.0;
    @Generated public static final double __IPHONE_13_1 = 130100.0;
    @Generated public static final double __IPHONE_13_2 = 130200.0;
    @Generated public static final double __IPHONE_13_3 = 130300.0;
    @Generated public static final double __IPHONE_13_4 = 130400.0;
    @Generated public static final double __IPHONE_13_5 = 130500.0;
    @Generated public static final double __IPHONE_13_6 = 130600.0;
    @Generated public static final double __IPHONE_13_7 = 130700.0;
    @Generated public static final double __IPHONE_14_0 = 140000.0;
    @Generated public static final double __IPHONE_14_1 = 140100.0;
    @Generated public static final double __IPHONE_14_2 = 140200.0;
    @Generated public static final double __IPHONE_14_3 = 140300.0;
    @Generated public static final double __IPHONE_14_5 = 140500.0;
    @Generated public static final double __IPHONE_14_6 = 140600.0;
    @Generated public static final double __IPHONE_14_7 = 140700.0;
    @Generated public static final double __IPHONE_14_8 = 140800.0;
    @Generated public static final double __IPHONE_15_0 = 150000.0;
    @Generated public static final double __IPHONE_15_1 = 150100.0;
    @Generated public static final double __IPHONE_15_2 = 150200.0;
    @Generated public static final double __IPHONE_15_3 = 150300.0;
    @Generated public static final double __IPHONE_15_4 = 150400.0;
    @Generated public static final double __IPHONE_16_0 = 160000.0;
    @Generated public static final double __IPHONE_16_1 = 160100.0;
    @Generated public static final double __IPHONE_16_2 = 160200.0;
    @Generated public static final double __TVOS_9_0 = 90000.0;
    @Generated public static final double __TVOS_9_1 = 90100.0;
    @Generated public static final double __TVOS_9_2 = 90200.0;
    @Generated public static final double __TVOS_10_0 = 100000.0;
    @Generated public static final double __TVOS_10_0_1 = 100001.0;
    @Generated public static final double __TVOS_10_1 = 100100.0;
    @Generated public static final double __TVOS_10_2 = 100200.0;
    @Generated public static final double __TVOS_11_0 = 110000.0;
    @Generated public static final double __TVOS_11_1 = 110100.0;
    @Generated public static final double __TVOS_11_2 = 110200.0;
    @Generated public static final double __TVOS_11_3 = 110300.0;
    @Generated public static final double __TVOS_11_4 = 110400.0;
    @Generated public static final double __TVOS_12_0 = 120000.0;
    @Generated public static final double __TVOS_12_1 = 120100.0;
    @Generated public static final double __TVOS_12_2 = 120200.0;
    @Generated public static final double __TVOS_12_3 = 120300.0;
    @Generated public static final double __TVOS_12_4 = 120400.0;
    @Generated public static final double __TVOS_13_0 = 130000.0;
    @Generated public static final double __TVOS_13_2 = 130200.0;
    @Generated public static final double __TVOS_13_3 = 130300.0;
    @Generated public static final double __TVOS_13_4 = 130400.0;
    @Generated public static final double __TVOS_14_0 = 140000.0;
    @Generated public static final double __TVOS_14_1 = 140100.0;
    @Generated public static final double __TVOS_14_2 = 140200.0;
    @Generated public static final double __TVOS_14_3 = 140300.0;
    @Generated public static final double __TVOS_14_5 = 140500.0;
    @Generated public static final double __TVOS_14_6 = 140600.0;
    @Generated public static final double __TVOS_14_7 = 140700.0;
    @Generated public static final double __TVOS_15_0 = 150000.0;
    @Generated public static final double __TVOS_15_1 = 150100.0;
    @Generated public static final double __TVOS_15_2 = 150200.0;
    @Generated public static final double __TVOS_15_3 = 150300.0;
    @Generated public static final double __TVOS_15_4 = 150400.0;
    @Generated public static final double __TVOS_16_0 = 160000.0;
    @Generated public static final double __TVOS_16_1 = 160100.0;
    @Generated public static final double __TVOS_16_2 = 160200.0;
    @Generated public static final double __WATCHOS_1_0 = 10000.0;
    @Generated public static final double __WATCHOS_2_0 = 20000.0;
    @Generated public static final double __WATCHOS_2_1 = 20100.0;
    @Generated public static final double __WATCHOS_2_2 = 20200.0;
    @Generated public static final double __WATCHOS_3_0 = 30000.0;
    @Generated public static final double __WATCHOS_3_1 = 30100.0;
    @Generated public static final double __WATCHOS_3_1_1 = 30101.0;
    @Generated public static final double __WATCHOS_3_2 = 30200.0;
    @Generated public static final double __WATCHOS_4_0 = 40000.0;
    @Generated public static final double __WATCHOS_4_1 = 40100.0;
    @Generated public static final double __WATCHOS_4_2 = 40200.0;
    @Generated public static final double __WATCHOS_4_3 = 40300.0;
    @Generated public static final double __WATCHOS_5_0 = 50000.0;
    @Generated public static final double __WATCHOS_5_1 = 50100.0;
    @Generated public static final double __WATCHOS_5_2 = 50200.0;
    @Generated public static final double __WATCHOS_5_3 = 50300.0;
    @Generated public static final double __WATCHOS_6_0 = 60000.0;
    @Generated public static final double __WATCHOS_6_1 = 60100.0;
    @Generated public static final double __WATCHOS_6_2 = 60200.0;
    @Generated public static final double __WATCHOS_7_0 = 70000.0;
    @Generated public static final double __WATCHOS_7_1 = 70100.0;
    @Generated public static final double __WATCHOS_7_2 = 70200.0;
    @Generated public static final double __WATCHOS_7_3 = 70300.0;
    @Generated public static final double __WATCHOS_7_4 = 70400.0;
    @Generated public static final double __WATCHOS_7_5 = 70500.0;
    @Generated public static final double __WATCHOS_7_6 = 70600.0;
    @Generated public static final double __WATCHOS_8_0 = 80000.0;
    @Generated public static final double __WATCHOS_8_1 = 80100.0;
    @Generated public static final double __WATCHOS_8_3 = 80300.0;
    @Generated public static final double __WATCHOS_8_4 = 80400.0;
    @Generated public static final double __WATCHOS_8_5 = 80500.0;
    @Generated public static final double __WATCHOS_9_0 = 90000.0;
    @Generated public static final double __WATCHOS_9_1 = 90100.0;
    @Generated public static final double __WATCHOS_9_2 = 90200.0;
    @Generated public static final double __DRIVERKIT_19_0 = 190000.0;
    @Generated public static final double __DRIVERKIT_20_0 = 200000.0;
    @Generated public static final double __DRIVERKIT_21_0 = 210000.0;
    @Generated public static final double __ENABLE_LEGACY_IPHONE_AVAILABILITY = 1.0;
    @Generated public static final double __DARWIN_FD_SETSIZE = 1024.0;
    @Generated public static final double __DARWIN_NBBY = 8.0;
    @Generated public static final double __GNUC_VA_LIST = 1.0;
    @Generated public static final double _FORTIFY_SOURCE = 2.0;
    @Generated public static final double _CTYPE_SWS = 30.0;
    @Generated public static final double EPERM = 1.0;
    @Generated public static final double ENOENT = 2.0;
    @Generated public static final double ESRCH = 3.0;
    @Generated public static final double EINTR = 4.0;
    @Generated public static final double EIO = 5.0;
    @Generated public static final double ENXIO = 6.0;
    @Generated public static final double E2BIG = 7.0;
    @Generated public static final double ENOEXEC = 8.0;
    @Generated public static final double EBADF = 9.0;
    @Generated public static final double ECHILD = 10.0;
    @Generated public static final double EDEADLK = 11.0;
    @Generated public static final double ENOMEM = 12.0;
    @Generated public static final double EACCES = 13.0;
    @Generated public static final double EFAULT = 14.0;
    @Generated public static final double ENOTBLK = 15.0;
    @Generated public static final double EBUSY = 16.0;
    @Generated public static final double EEXIST = 17.0;
    @Generated public static final double EXDEV = 18.0;
    @Generated public static final double ENODEV = 19.0;
    @Generated public static final double ENOTDIR = 20.0;
    @Generated public static final double EISDIR = 21.0;
    @Generated public static final double EINVAL = 22.0;
    @Generated public static final double ENFILE = 23.0;
    @Generated public static final double EMFILE = 24.0;
    @Generated public static final double ENOTTY = 25.0;
    @Generated public static final double ETXTBSY = 26.0;
    @Generated public static final double EFBIG = 27.0;
    @Generated public static final double ENOSPC = 28.0;
    @Generated public static final double ESPIPE = 29.0;
    @Generated public static final double EROFS = 30.0;
    @Generated public static final double EMLINK = 31.0;
    @Generated public static final double EPIPE = 32.0;
    @Generated public static final double EDOM = 33.0;
    @Generated public static final double ERANGE = 34.0;
    @Generated public static final double EAGAIN = 35.0;
    @Generated public static final double EINPROGRESS = 36.0;
    @Generated public static final double EALREADY = 37.0;
    @Generated public static final double ENOTSOCK = 38.0;
    @Generated public static final double EDESTADDRREQ = 39.0;
    @Generated public static final double EMSGSIZE = 40.0;
    @Generated public static final double EPROTOTYPE = 41.0;
    @Generated public static final double ENOPROTOOPT = 42.0;
    @Generated public static final double EPROTONOSUPPORT = 43.0;
    @Generated public static final double ESOCKTNOSUPPORT = 44.0;
    @Generated public static final double ENOTSUP = 45.0;
    @Generated public static final double EPFNOSUPPORT = 46.0;
    @Generated public static final double EAFNOSUPPORT = 47.0;
    @Generated public static final double EADDRINUSE = 48.0;
    @Generated public static final double EADDRNOTAVAIL = 49.0;
    @Generated public static final double ENETDOWN = 50.0;
    @Generated public static final double ENETUNREACH = 51.0;
    @Generated public static final double ENETRESET = 52.0;
    @Generated public static final double ECONNABORTED = 53.0;
    @Generated public static final double ECONNRESET = 54.0;
    @Generated public static final double ENOBUFS = 55.0;
    @Generated public static final double EISCONN = 56.0;
    @Generated public static final double ENOTCONN = 57.0;
    @Generated public static final double ESHUTDOWN = 58.0;
    @Generated public static final double ETOOMANYREFS = 59.0;
    @Generated public static final double ETIMEDOUT = 60.0;
    @Generated public static final double ECONNREFUSED = 61.0;
    @Generated public static final double ELOOP = 62.0;
    @Generated public static final double ENAMETOOLONG = 63.0;
    @Generated public static final double EHOSTDOWN = 64.0;
    @Generated public static final double EHOSTUNREACH = 65.0;
    @Generated public static final double ENOTEMPTY = 66.0;
    @Generated public static final double EPROCLIM = 67.0;
    @Generated public static final double EUSERS = 68.0;
    @Generated public static final double EDQUOT = 69.0;
    @Generated public static final double ESTALE = 70.0;
    @Generated public static final double EREMOTE = 71.0;
    @Generated public static final double EBADRPC = 72.0;
    @Generated public static final double ERPCMISMATCH = 73.0;
    @Generated public static final double EPROGUNAVAIL = 74.0;
    @Generated public static final double EPROGMISMATCH = 75.0;
    @Generated public static final double EPROCUNAVAIL = 76.0;
    @Generated public static final double ENOLCK = 77.0;
    @Generated public static final double ENOSYS = 78.0;
    @Generated public static final double EFTYPE = 79.0;
    @Generated public static final double EAUTH = 80.0;
    @Generated public static final double ENEEDAUTH = 81.0;
    @Generated public static final double EPWROFF = 82.0;
    @Generated public static final double EDEVERR = 83.0;
    @Generated public static final double EOVERFLOW = 84.0;
    @Generated public static final double EBADEXEC = 85.0;
    @Generated public static final double EBADARCH = 86.0;
    @Generated public static final double ESHLIBVERS = 87.0;
    @Generated public static final double EBADMACHO = 88.0;
    @Generated public static final double ECANCELED = 89.0;
    @Generated public static final double EIDRM = 90.0;
    @Generated public static final double ENOMSG = 91.0;
    @Generated public static final double EILSEQ = 92.0;
    @Generated public static final double ENOATTR = 93.0;
    @Generated public static final double EBADMSG = 94.0;
    @Generated public static final double EMULTIHOP = 95.0;
    @Generated public static final double ENODATA = 96.0;
    @Generated public static final double ENOLINK = 97.0;
    @Generated public static final double ENOSR = 98.0;
    @Generated public static final double ENOSTR = 99.0;
    @Generated public static final double EPROTO = 100.0;
    @Generated public static final double ETIME = 101.0;
    @Generated public static final double EOPNOTSUPP = 102.0;
    @Generated public static final double ENOPOLICY = 103.0;
    @Generated public static final double ENOTRECOVERABLE = 104.0;
    @Generated public static final double EOWNERDEAD = 105.0;
    @Generated public static final double EQFULL = 106.0;
    @Generated public static final double ELAST = 106.0;
    @Generated public static final double __DARWIN_CLK_TCK = 100.0;
    @Generated public static final double CHAR_BIT = 8.0;
    @Generated public static final double MB_LEN_MAX = 6.0;
    @Generated public static final double SCHAR_MAX = 127.0;
    @Generated public static final double UCHAR_MAX = 255.0;
    @Generated public static final double CHAR_MAX = 127.0;
    @Generated public static final double USHRT_MAX = 65535.0;
    @Generated public static final double SHRT_MAX = 32767.0;
    @Generated public static final double INT_MAX = 2.147483647E9;
    @Generated public static final double LONG_BIT = 64.0;
    @Generated public static final double WORD_BIT = 32.0;
    @Generated public static final double CHILD_MAX = 266.0;
    @Generated public static final double LINK_MAX = 32767.0;
    @Generated public static final double MAX_CANON = 1024.0;
    @Generated public static final double MAX_INPUT = 1024.0;
    @Generated public static final double NAME_MAX = 255.0;
    @Generated public static final double NGROUPS_MAX = 16.0;
    @Generated public static final double OPEN_MAX = 10240.0;
    @Generated public static final double PATH_MAX = 1024.0;
    @Generated public static final double PIPE_BUF = 512.0;
    @Generated public static final double BC_BASE_MAX = 99.0;
    @Generated public static final double BC_DIM_MAX = 2048.0;
    @Generated public static final double BC_SCALE_MAX = 99.0;
    @Generated public static final double BC_STRING_MAX = 1000.0;
    @Generated public static final double CHARCLASS_NAME_MAX = 14.0;
    @Generated public static final double COLL_WEIGHTS_MAX = 2.0;
    @Generated public static final double EQUIV_CLASS_MAX = 2.0;
    @Generated public static final double EXPR_NEST_MAX = 32.0;
    @Generated public static final double LINE_MAX = 2048.0;
    @Generated public static final double RE_DUP_MAX = 255.0;
    @Generated public static final double NZERO = 20.0;
    @Generated public static final double _POSIX_ARG_MAX = 4096.0;
    @Generated public static final double _POSIX_CHILD_MAX = 25.0;
    @Generated public static final double _POSIX_LINK_MAX = 8.0;
    @Generated public static final double _POSIX_MAX_CANON = 255.0;
    @Generated public static final double _POSIX_MAX_INPUT = 255.0;
    @Generated public static final double _POSIX_NAME_MAX = 14.0;
    @Generated public static final double _POSIX_NGROUPS_MAX = 8.0;
    @Generated public static final double _POSIX_OPEN_MAX = 20.0;
    @Generated public static final double _POSIX_PATH_MAX = 256.0;
    @Generated public static final double _POSIX_PIPE_BUF = 512.0;
    @Generated public static final double _POSIX_SSIZE_MAX = 32767.0;
    @Generated public static final double _POSIX_STREAM_MAX = 8.0;
    @Generated public static final double _POSIX_TZNAME_MAX = 6.0;
    @Generated public static final double _POSIX2_BC_BASE_MAX = 99.0;
    @Generated public static final double _POSIX2_BC_DIM_MAX = 2048.0;
    @Generated public static final double _POSIX2_BC_SCALE_MAX = 99.0;
    @Generated public static final double _POSIX2_BC_STRING_MAX = 1000.0;
    @Generated public static final double _POSIX2_EQUIV_CLASS_MAX = 2.0;
    @Generated public static final double _POSIX2_EXPR_NEST_MAX = 32.0;
    @Generated public static final double _POSIX2_LINE_MAX = 2048.0;
    @Generated public static final double _POSIX2_RE_DUP_MAX = 255.0;
    @Generated public static final double _POSIX_AIO_LISTIO_MAX = 2.0;
    @Generated public static final double _POSIX_AIO_MAX = 1.0;
    @Generated public static final double _POSIX_DELAYTIMER_MAX = 32.0;
    @Generated public static final double _POSIX_MQ_OPEN_MAX = 8.0;
    @Generated public static final double _POSIX_MQ_PRIO_MAX = 32.0;
    @Generated public static final double _POSIX_RTSIG_MAX = 8.0;
    @Generated public static final double _POSIX_SEM_NSEMS_MAX = 256.0;
    @Generated public static final double _POSIX_SEM_VALUE_MAX = 32767.0;
    @Generated public static final double _POSIX_SIGQUEUE_MAX = 32.0;
    @Generated public static final double _POSIX_TIMER_MAX = 32.0;
    @Generated public static final double _POSIX_CLOCKRES_MIN = 2.0E7;
    @Generated public static final double _POSIX_THREAD_DESTRUCTOR_ITERATIONS = 4.0;
    @Generated public static final double _POSIX_THREAD_KEYS_MAX = 128.0;
    @Generated public static final double _POSIX_THREAD_THREADS_MAX = 64.0;
    @Generated public static final double PTHREAD_DESTRUCTOR_ITERATIONS = 4.0;
    @Generated public static final double PTHREAD_KEYS_MAX = 512.0;
    @Generated public static final double PTHREAD_STACK_MIN = 16384.0;
    @Generated public static final double _POSIX_HOST_NAME_MAX = 255.0;
    @Generated public static final double _POSIX_LOGIN_NAME_MAX = 9.0;
    @Generated public static final double _POSIX_SS_REPL_MAX = 4.0;
    @Generated public static final double _POSIX_SYMLINK_MAX = 255.0;
    @Generated public static final double _POSIX_SYMLOOP_MAX = 8.0;
    @Generated public static final double _POSIX_TRACE_EVENT_NAME_MAX = 30.0;
    @Generated public static final double _POSIX_TRACE_NAME_MAX = 8.0;
    @Generated public static final double _POSIX_TRACE_SYS_MAX = 8.0;
    @Generated public static final double _POSIX_TRACE_USER_EVENT_MAX = 32.0;
    @Generated public static final double _POSIX_TTY_NAME_MAX = 9.0;
    @Generated public static final double _POSIX2_CHARCLASS_NAME_MAX = 14.0;
    @Generated public static final double _POSIX2_COLL_WEIGHTS_MAX = 2.0;
    @Generated public static final double PASS_MAX = 128.0;
    @Generated public static final double NL_ARGMAX = 9.0;
    @Generated public static final double NL_LANGMAX = 14.0;
    @Generated public static final double NL_MSGMAX = 32767.0;
    @Generated public static final double NL_NMAX = 1.0;
    @Generated public static final double NL_SETMAX = 255.0;
    @Generated public static final double NL_TEXTMAX = 2048.0;
    @Generated public static final double _XOPEN_IOV_MAX = 16.0;
    @Generated public static final double IOV_MAX = 1024.0;
    @Generated public static final double _XOPEN_NAME_MAX = 255.0;
    @Generated public static final double _XOPEN_PATH_MAX = 1024.0;
    @Generated public static final double LC_ALL = 0.0;
    @Generated public static final double LC_COLLATE = 1.0;
    @Generated public static final double LC_CTYPE = 2.0;
    @Generated public static final double LC_MONETARY = 3.0;
    @Generated public static final double LC_NUMERIC = 4.0;
    @Generated public static final double LC_TIME = 5.0;
    @Generated public static final double LC_MESSAGES = 6.0;
    @Generated public static final double _LC_LAST = 7.0;
    @Generated public static final double FP_NAN = 1.0;
    @Generated public static final double FP_INFINITE = 2.0;
    @Generated public static final double FP_ZERO = 3.0;
    @Generated public static final double FP_NORMAL = 4.0;
    @Generated public static final double FP_SUBNORMAL = 5.0;
    @Generated public static final double FP_SUPERNORMAL = 6.0;
    @Generated public static final double FP_FAST_FMA = 1.0;
    @Generated public static final double FP_FAST_FMAF = 1.0;
    @Generated public static final double FP_FAST_FMAL = 1.0;
    @Generated public static final double MATH_ERRNO = 1.0;
    @Generated public static final double MATH_ERREXCEPT = 2.0;
    @Generated public static final double M_E = 2.718281828459045;
    @Generated public static final double M_LOG2E = 1.4426950408889634;
    @Generated public static final double M_LOG10E = 0.4342944819032518;
    @Generated public static final double M_LN2 = 0.6931471805599453;
    @Generated public static final double M_LN10 = 2.302585092994046;
    @Generated public static final double M_PI = 3.141592653589793;
    @Generated public static final double M_PI_2 = 1.5707963267948966;
    @Generated public static final double M_PI_4 = 0.7853981633974483;
    @Generated public static final double M_1_PI = 0.3183098861837907;
    @Generated public static final double M_2_PI = 0.6366197723675814;
    @Generated public static final double M_2_SQRTPI = 1.1283791670955126;
    @Generated public static final double M_SQRT2 = 1.4142135623730951;
    @Generated public static final double M_SQRT1_2 = 0.7071067811865476;
    @Generated public static final double MAXFLOAT = 3.4028234663852886E38;
    @Generated public static final double X_TLOSS = 1.414847550405688E16;
    @Generated public static final double DOMAIN = 1.0;
    @Generated public static final double SING = 2.0;
    @Generated public static final double OVERFLOW = 3.0;
    @Generated public static final double UNDERFLOW = 4.0;
    @Generated public static final double TLOSS = 5.0;
    @Generated public static final double PLOSS = 6.0;
    @Generated public static final double __DARWIN_NSIG = 32.0;
    @Generated public static final double _ARM_SIGNAL_ = 1.0;
    @Generated public static final double SIGHUP = 1.0;
    @Generated public static final double SIGINT = 2.0;
    @Generated public static final double SIGQUIT = 3.0;
    @Generated public static final double SIGILL = 4.0;
    @Generated public static final double SIGTRAP = 5.0;
    @Generated public static final double SIGABRT = 6.0;
    @Generated public static final double SIGEMT = 7.0;
    @Generated public static final double SIGFPE = 8.0;
    @Generated public static final double SIGKILL = 9.0;
    @Generated public static final double SIGBUS = 10.0;
    @Generated public static final double SIGSEGV = 11.0;
    @Generated public static final double SIGSYS = 12.0;
    @Generated public static final double SIGPIPE = 13.0;
    @Generated public static final double SIGALRM = 14.0;
    @Generated public static final double SIGTERM = 15.0;
    @Generated public static final double SIGURG = 16.0;
    @Generated public static final double SIGSTOP = 17.0;
    @Generated public static final double SIGTSTP = 18.0;
    @Generated public static final double SIGCONT = 19.0;
    @Generated public static final double SIGCHLD = 20.0;
    @Generated public static final double SIGTTIN = 21.0;
    @Generated public static final double SIGTTOU = 22.0;
    @Generated public static final double SIGIO = 23.0;
    @Generated public static final double SIGXCPU = 24.0;
    @Generated public static final double SIGXFSZ = 25.0;
    @Generated public static final double SIGVTALRM = 26.0;
    @Generated public static final double SIGPROF = 27.0;
    @Generated public static final double SIGWINCH = 28.0;
    @Generated public static final double SIGINFO = 29.0;
    @Generated public static final double SIGUSR1 = 30.0;
    @Generated public static final double SIGUSR2 = 31.0;
    @Generated public static final double __DARWIN_OPAQUE_ARM_THREAD_STATE64 = 0.0;
    @Generated public static final double SIGEV_NONE = 0.0;
    @Generated public static final double SIGEV_SIGNAL = 1.0;
    @Generated public static final double SIGEV_THREAD = 3.0;
    @Generated public static final double ILL_NOOP = 0.0;
    @Generated public static final double ILL_ILLOPC = 1.0;
    @Generated public static final double ILL_ILLTRP = 2.0;
    @Generated public static final double ILL_PRVOPC = 3.0;
    @Generated public static final double ILL_ILLOPN = 4.0;
    @Generated public static final double ILL_ILLADR = 5.0;
    @Generated public static final double ILL_PRVREG = 6.0;
    @Generated public static final double ILL_COPROC = 7.0;
    @Generated public static final double ILL_BADSTK = 8.0;
    @Generated public static final double FPE_NOOP = 0.0;
    @Generated public static final double FPE_FLTDIV = 1.0;
    @Generated public static final double FPE_FLTOVF = 2.0;
    @Generated public static final double FPE_FLTUND = 3.0;
    @Generated public static final double FPE_FLTRES = 4.0;
    @Generated public static final double FPE_FLTINV = 5.0;
    @Generated public static final double FPE_FLTSUB = 6.0;
    @Generated public static final double FPE_INTDIV = 7.0;
    @Generated public static final double FPE_INTOVF = 8.0;
    @Generated public static final double SEGV_NOOP = 0.0;
    @Generated public static final double SEGV_MAPERR = 1.0;
    @Generated public static final double SEGV_ACCERR = 2.0;
    @Generated public static final double BUS_NOOP = 0.0;
    @Generated public static final double BUS_ADRALN = 1.0;
    @Generated public static final double BUS_ADRERR = 2.0;
    @Generated public static final double BUS_OBJERR = 3.0;
    @Generated public static final double TRAP_BRKPT = 1.0;
    @Generated public static final double TRAP_TRACE = 2.0;
    @Generated public static final double CLD_NOOP = 0.0;
    @Generated public static final double CLD_EXITED = 1.0;
    @Generated public static final double CLD_KILLED = 2.0;
    @Generated public static final double CLD_DUMPED = 3.0;
    @Generated public static final double CLD_TRAPPED = 4.0;
    @Generated public static final double CLD_STOPPED = 5.0;
    @Generated public static final double CLD_CONTINUED = 6.0;
    @Generated public static final double POLL_IN = 1.0;
    @Generated public static final double POLL_OUT = 2.0;
    @Generated public static final double POLL_MSG = 3.0;
    @Generated public static final double POLL_ERR = 4.0;
    @Generated public static final double POLL_PRI = 5.0;
    @Generated public static final double POLL_HUP = 6.0;
    @Generated public static final double SA_ONSTACK = 1.0;
    @Generated public static final double SA_RESTART = 2.0;
    @Generated public static final double SA_RESETHAND = 4.0;
    @Generated public static final double SA_NOCLDSTOP = 8.0;
    @Generated public static final double SA_NODEFER = 16.0;
    @Generated public static final double SA_NOCLDWAIT = 32.0;
    @Generated public static final double SA_SIGINFO = 64.0;
    @Generated public static final double SA_USERTRAMP = 256.0;
    @Generated public static final double SA_64REGSET = 512.0;
    @Generated public static final double SIG_BLOCK = 1.0;
    @Generated public static final double SIG_UNBLOCK = 2.0;
    @Generated public static final double SIG_SETMASK = 3.0;
    @Generated public static final double SI_USER = 65537.0;
    @Generated public static final double SI_QUEUE = 65538.0;
    @Generated public static final double SI_TIMER = 65539.0;
    @Generated public static final double SI_ASYNCIO = 65540.0;
    @Generated public static final double SI_MESGQ = 65541.0;
    @Generated public static final double SS_ONSTACK = 1.0;
    @Generated public static final double SS_DISABLE = 4.0;
    @Generated public static final double MINSIGSTKSZ = 32768.0;
    @Generated public static final double SIGSTKSZ = 131072.0;
    @Generated public static final double RENAME_SECLUDE = 1.0;
    @Generated public static final double RENAME_SWAP = 2.0;
    @Generated public static final double RENAME_EXCL = 4.0;
    @Generated public static final double RENAME_RESERVED1 = 8.0;
    @Generated public static final double RENAME_NOFOLLOW_ANY = 16.0;
    @Generated public static final double __SLBF = 1.0;
    @Generated public static final double __SNBF = 2.0;
    @Generated public static final double __SRD = 4.0;
    @Generated public static final double __SWR = 8.0;
    @Generated public static final double __SRW = 16.0;
    @Generated public static final double __SEOF = 32.0;
    @Generated public static final double __SERR = 64.0;
    @Generated public static final double __SMBF = 128.0;
    @Generated public static final double __SAPP = 256.0;
    @Generated public static final double __SSTR = 512.0;
    @Generated public static final double __SOPT = 1024.0;
    @Generated public static final double __SNPT = 2048.0;
    @Generated public static final double __SOFF = 4096.0;
    @Generated public static final double __SMOD = 8192.0;
    @Generated public static final double __SALC = 16384.0;
    @Generated public static final double __SIGN = 32768.0;
    @Generated public static final double _IOFBF = 0.0;
    @Generated public static final double _IOLBF = 1.0;
    @Generated public static final double _IONBF = 2.0;
    @Generated public static final double BUFSIZ = 1024.0;
    @Generated public static final double FOPEN_MAX = 20.0;
    @Generated public static final double FILENAME_MAX = 1024.0;
    @Generated public static final double L_tmpnam = 1024.0;
    @Generated public static final double TMP_MAX = 3.08915776E8;
    @Generated public static final double SEEK_SET = 0.0;
    @Generated public static final double SEEK_CUR = 1.0;
    @Generated public static final double SEEK_END = 2.0;
    @Generated public static final double L_ctermid = 1024.0;
    @Generated public static final double _USE_FORTIFY_LEVEL = 2.0;
    @Generated public static final double PRIO_PROCESS = 0.0;
    @Generated public static final double PRIO_PGRP = 1.0;
    @Generated public static final double PRIO_USER = 2.0;
    @Generated public static final double PRIO_DARWIN_THREAD = 3.0;
    @Generated public static final double PRIO_DARWIN_PROCESS = 4.0;
    @Generated public static final double PRIO_MIN = -20.0;
    @Generated public static final double PRIO_MAX = 20.0;
    @Generated public static final double PRIO_DARWIN_BG = 4096.0;
    @Generated public static final double PRIO_DARWIN_NONUI = 4097.0;
    @Generated public static final double RUSAGE_SELF = 0.0;
    @Generated public static final double RUSAGE_CHILDREN = -1.0;
    @Generated public static final double RUSAGE_INFO_V0 = 0.0;
    @Generated public static final double RUSAGE_INFO_V1 = 1.0;
    @Generated public static final double RUSAGE_INFO_V2 = 2.0;
    @Generated public static final double RUSAGE_INFO_V3 = 3.0;
    @Generated public static final double RUSAGE_INFO_V4 = 4.0;
    @Generated public static final double RUSAGE_INFO_V5 = 5.0;
    @Generated public static final double RUSAGE_INFO_V6 = 6.0;
    @Generated public static final double RU_PROC_RUNS_RESLIDE = 1.0;
    @Generated public static final double RLIMIT_CPU = 0.0;
    @Generated public static final double RLIMIT_FSIZE = 1.0;
    @Generated public static final double RLIMIT_DATA = 2.0;
    @Generated public static final double RLIMIT_STACK = 3.0;
    @Generated public static final double RLIMIT_CORE = 4.0;
    @Generated public static final double RLIMIT_AS = 5.0;
    @Generated public static final double RLIMIT_MEMLOCK = 6.0;
    @Generated public static final double RLIMIT_NPROC = 7.0;
    @Generated public static final double RLIMIT_NOFILE = 8.0;
    @Generated public static final double RLIM_NLIMITS = 9.0;
    @Generated public static final double _RLIMIT_POSIX_FLAG = 4096.0;
    @Generated public static final double RLIMIT_WAKEUPS_MONITOR = 1.0;
    @Generated public static final double RLIMIT_CPU_USAGE_MONITOR = 2.0;
    @Generated public static final double RLIMIT_THREAD_CPULIMITS = 3.0;
    @Generated public static final double RLIMIT_FOOTPRINT_INTERVAL = 4.0;
    @Generated public static final double WAKEMON_ENABLE = 1.0;
    @Generated public static final double WAKEMON_DISABLE = 2.0;
    @Generated public static final double WAKEMON_GET_PARAMS = 4.0;
    @Generated public static final double WAKEMON_SET_DEFAULTS = 8.0;
    @Generated public static final double WAKEMON_MAKE_FATAL = 16.0;
    @Generated public static final double CPUMON_MAKE_FATAL = 4096.0;
    @Generated public static final double FOOTPRINT_INTERVAL_RESET = 1.0;
    @Generated public static final double IOPOL_TYPE_DISK = 0.0;
    @Generated public static final double IOPOL_TYPE_VFS_ATIME_UPDATES = 2.0;
    @Generated public static final double IOPOL_TYPE_VFS_MATERIALIZE_DATALESS_FILES = 3.0;
    @Generated public static final double IOPOL_TYPE_VFS_STATFS_NO_DATA_VOLUME = 4.0;
    @Generated public static final double IOPOL_TYPE_VFS_TRIGGER_RESOLVE = 5.0;
    @Generated public static final double IOPOL_TYPE_VFS_IGNORE_CONTENT_PROTECTION = 6.0;
    @Generated public static final double IOPOL_TYPE_VFS_IGNORE_PERMISSIONS = 7.0;
    @Generated public static final double IOPOL_TYPE_VFS_SKIP_MTIME_UPDATE = 8.0;
    @Generated public static final double IOPOL_TYPE_VFS_ALLOW_LOW_SPACE_WRITES = 9.0;
    @Generated public static final double IOPOL_TYPE_VFS_DISALLOW_RW_FOR_O_EVTONLY = 10.0;
    @Generated public static final double IOPOL_SCOPE_PROCESS = 0.0;
    @Generated public static final double IOPOL_SCOPE_THREAD = 1.0;
    @Generated public static final double IOPOL_SCOPE_DARWIN_BG = 2.0;
    @Generated public static final double IOPOL_DEFAULT = 0.0;
    @Generated public static final double IOPOL_IMPORTANT = 1.0;
    @Generated public static final double IOPOL_PASSIVE = 2.0;
    @Generated public static final double IOPOL_THROTTLE = 3.0;
    @Generated public static final double IOPOL_UTILITY = 4.0;
    @Generated public static final double IOPOL_STANDARD = 5.0;
    @Generated public static final double IOPOL_ATIME_UPDATES_DEFAULT = 0.0;
    @Generated public static final double IOPOL_ATIME_UPDATES_OFF = 1.0;
    @Generated public static final double IOPOL_MATERIALIZE_DATALESS_FILES_DEFAULT = 0.0;
    @Generated public static final double IOPOL_MATERIALIZE_DATALESS_FILES_OFF = 1.0;
    @Generated public static final double IOPOL_MATERIALIZE_DATALESS_FILES_ON = 2.0;
    @Generated public static final double IOPOL_VFS_STATFS_NO_DATA_VOLUME_DEFAULT = 0.0;
    @Generated public static final double IOPOL_VFS_STATFS_FORCE_NO_DATA_VOLUME = 1.0;
    @Generated public static final double IOPOL_VFS_TRIGGER_RESOLVE_DEFAULT = 0.0;
    @Generated public static final double IOPOL_VFS_TRIGGER_RESOLVE_OFF = 1.0;
    @Generated public static final double IOPOL_VFS_CONTENT_PROTECTION_DEFAULT = 0.0;
    @Generated public static final double IOPOL_VFS_CONTENT_PROTECTION_IGNORE = 1.0;
    @Generated public static final double IOPOL_VFS_IGNORE_PERMISSIONS_OFF = 0.0;
    @Generated public static final double IOPOL_VFS_IGNORE_PERMISSIONS_ON = 1.0;
    @Generated public static final double IOPOL_VFS_SKIP_MTIME_UPDATE_OFF = 0.0;
    @Generated public static final double IOPOL_VFS_SKIP_MTIME_UPDATE_ON = 1.0;
    @Generated public static final double IOPOL_VFS_ALLOW_LOW_SPACE_WRITES_OFF = 0.0;
    @Generated public static final double IOPOL_VFS_ALLOW_LOW_SPACE_WRITES_ON = 1.0;
    @Generated public static final double IOPOL_VFS_DISALLOW_RW_FOR_O_EVTONLY_DEFAULT = 0.0;
    @Generated public static final double IOPOL_VFS_DISALLOW_RW_FOR_O_EVTONLY_ON = 1.0;
    @Generated public static final double WNOHANG = 1.0;
    @Generated public static final double WUNTRACED = 2.0;
    @Generated public static final double WCOREFLAG = 200.0;
    @Generated public static final double _WSTOPPED = 177.0;
    @Generated public static final double WEXITED = 4.0;
    @Generated public static final double WSTOPPED = 8.0;
    @Generated public static final double WCONTINUED = 16.0;
    @Generated public static final double WNOWAIT = 32.0;
    @Generated public static final double WAIT_MYPGRP = 0.0;
    @Generated public static final double EXIT_FAILURE = 1.0;
    @Generated public static final double EXIT_SUCCESS = 0.0;
    @Generated public static final double RAND_MAX = 2.147483647E9;
    @Generated public static final double __HAS_FIXED_CHK_PROTOTYPES = 1.0;
    @Generated public static final double TIME_UTC = 1.0;
    @Generated public static final double __bool_true_false_are_defined = 1.0;
    @Generated public static final double DYNAMIC_TARGETS_ENABLED = 0.0;
    @Generated public static final double TARGET_OS_MAC = 1.0;
    @Generated public static final double TARGET_OS_WIN32 = 0.0;
    @Generated public static final double TARGET_OS_WINDOWS = 0.0;
    @Generated public static final double TARGET_OS_UNIX = 0.0;
    @Generated public static final double TARGET_OS_LINUX = 0.0;
    @Generated public static final double TARGET_OS_OSX = 0.0;
    @Generated public static final double TARGET_OS_IPHONE = 1.0;
    @Generated public static final double TARGET_OS_IOS = 1.0;
    @Generated public static final double TARGET_OS_WATCH = 0.0;
    @Generated public static final double TARGET_OS_TV = 0.0;
    @Generated public static final double TARGET_OS_MACCATALYST = 0.0;
    @Generated public static final double TARGET_OS_UIKITFORMAC = 0.0;
    @Generated public static final double TARGET_OS_SIMULATOR = 0.0;
    @Generated public static final double TARGET_OS_EMBEDDED = 1.0;
    @Generated public static final double TARGET_OS_RTKIT = 0.0;
    @Generated public static final double TARGET_OS_DRIVERKIT = 0.0;
    @Generated public static final double TARGET_CPU_PPC = 0.0;
    @Generated public static final double TARGET_CPU_PPC64 = 0.0;
    @Generated public static final double TARGET_CPU_68K = 0.0;
    @Generated public static final double TARGET_CPU_X86 = 0.0;
    @Generated public static final double TARGET_CPU_X86_64 = 0.0;
    @Generated public static final double TARGET_CPU_ARM = 0.0;
    @Generated public static final double TARGET_CPU_ARM64 = 1.0;
    @Generated public static final double TARGET_CPU_MIPS = 0.0;
    @Generated public static final double TARGET_CPU_SPARC = 0.0;
    @Generated public static final double TARGET_CPU_ALPHA = 0.0;
    @Generated public static final double TARGET_RT_MAC_CFM = 0.0;
    @Generated public static final double TARGET_RT_MAC_MACHO = 1.0;
    @Generated public static final double TARGET_RT_LITTLE_ENDIAN = 1.0;
    @Generated public static final double TARGET_RT_BIG_ENDIAN = 0.0;
    @Generated public static final double TARGET_RT_64_BIT = 1.0;
    @Generated public static final double API_TO_BE_DEPRECATED = 100000.0;
    @Generated public static final double API_TO_BE_DEPRECATED_MACOS = 100000.0;
    @Generated public static final double API_TO_BE_DEPRECATED_IOS = 100000.0;
    @Generated public static final double API_TO_BE_DEPRECATED_TVOS = 100000.0;
    @Generated public static final double API_TO_BE_DEPRECATED_WATCHOS = 100000.0;
    @Generated public static final double API_TO_BE_DEPRECATED_DRIVERKIT = 100000.0;
    @Generated public static final double __AVAILABILITY_MACROS_USES_AVAILABILITY = 1.0;
    @Generated public static final double UNIVERSAL_INTERFACES_VERSION = 1024.0;
    @Generated public static final double PRAGMA_IMPORT = 0.0;
    @Generated public static final double PRAGMA_ONCE = 0.0;
    @Generated public static final double PRAGMA_STRUCT_PACK = 1.0;
    @Generated public static final double PRAGMA_STRUCT_PACKPUSH = 1.0;
    @Generated public static final double PRAGMA_STRUCT_ALIGN = 0.0;
    @Generated public static final double PRAGMA_ENUM_PACK = 0.0;
    @Generated public static final double PRAGMA_ENUM_ALWAYSINT = 0.0;
    @Generated public static final double PRAGMA_ENUM_OPTIONS = 0.0;
    @Generated public static final double TYPE_EXTENDED = 0.0;
    @Generated public static final double TYPE_LONGDOUBLE_IS_DOUBLE = 0.0;
    @Generated public static final double TYPE_LONGLONG = 1.0;
    @Generated public static final double FUNCTION_PASCAL = 0.0;
    @Generated public static final double FUNCTION_DECLSPEC = 0.0;
    @Generated public static final double FUNCTION_WIN32CC = 0.0;
    @Generated public static final double TARGET_API_MAC_OS8 = 0.0;
    @Generated public static final double TARGET_API_MAC_CARBON = 1.0;
    @Generated public static final double TARGET_API_MAC_OSX = 1.0;
    @Generated public static final double TARGET_CARBON = 1.0;
    @Generated public static final double OLDROUTINENAMES = 0.0;
    @Generated public static final double OPAQUE_TOOLBOX_STRUCTS = 1.0;
    @Generated public static final double OPAQUE_UPP_TYPES = 1.0;
    @Generated public static final double ACCESSOR_CALLS_ARE_FUNCTIONS = 1.0;
    @Generated public static final double CALL_NOT_IN_CARBON = 0.0;
    @Generated public static final double MIXEDMODE_CALLS_ARE_FUNCTIONS = 1.0;
    @Generated public static final double ALLOW_OBSOLETE_CARBON_MACMEMORY = 0.0;
    @Generated public static final double ALLOW_OBSOLETE_CARBON_OSUTILS = 0.0;
    @Generated public static final double kInvalidID = 0.0;
    @Generated public static final double MACH_PORT_NULL = 0.0;
    @Generated public static final double MACH_PORT_TYPE_SPREQUEST = 1.073741824E9;
    @Generated public static final double MACH_PORT_TYPE_SPREQUEST_DELAYED = 5.36870912E8;
    @Generated public static final double MACH_PORT_SRIGHTS_NONE = 0.0;
    @Generated public static final double MACH_PORT_SRIGHTS_PRESENT = 1.0;
    @Generated public static final double MACH_PORT_STATUS_FLAG_TEMPOWNER = 1.0;
    @Generated public static final double MACH_PORT_STATUS_FLAG_GUARDED = 2.0;
    @Generated public static final double MACH_PORT_STATUS_FLAG_STRICT_GUARD = 4.0;
    @Generated public static final double MACH_PORT_STATUS_FLAG_IMP_DONATION = 8.0;
    @Generated public static final double MACH_PORT_STATUS_FLAG_REVIVE = 16.0;
    @Generated public static final double MACH_PORT_STATUS_FLAG_TASKPTR = 32.0;
    @Generated public static final double MACH_PORT_STATUS_FLAG_GUARD_IMMOVABLE_RECEIVE = 64.0;
    @Generated public static final double MACH_PORT_STATUS_FLAG_NO_GRANT = 128.0;
    @Generated public static final double MACH_PORT_LIMITS_INFO = 1.0;
    @Generated public static final double MACH_PORT_RECEIVE_STATUS = 2.0;
    @Generated public static final double MACH_PORT_DNREQUESTS_SIZE = 3.0;
    @Generated public static final double MACH_PORT_TEMPOWNER = 4.0;
    @Generated public static final double MACH_PORT_IMPORTANCE_RECEIVER = 5.0;
    @Generated public static final double MACH_PORT_DENAP_RECEIVER = 6.0;
    @Generated public static final double MACH_PORT_INFO_EXT = 7.0;
    @Generated public static final double MACH_PORT_GUARD_INFO = 8.0;
    @Generated public static final double MACH_PORT_DNREQUESTS_SIZE_COUNT = 1.0;
    @Generated public static final double MACH_SERVICE_PORT_INFO_STRING_NAME_MAX_BUF_LEN = 255.0;
    @Generated public static final double MPO_CONTEXT_AS_GUARD = 1.0;
    @Generated public static final double MPO_QLIMIT = 2.0;
    @Generated public static final double MPO_TEMPOWNER = 4.0;
    @Generated public static final double MPO_IMPORTANCE_RECEIVER = 8.0;
    @Generated public static final double MPO_INSERT_SEND_RIGHT = 16.0;
    @Generated public static final double MPO_STRICT = 32.0;
    @Generated public static final double MPO_DENAP_RECEIVER = 64.0;
    @Generated public static final double MPO_IMMOVABLE_RECEIVE = 128.0;
    @Generated public static final double MPO_FILTER_MSG = 256.0;
    @Generated public static final double MPO_TG_BLOCK_TRACKING = 512.0;
    @Generated public static final double MPO_SERVICE_PORT = 1024.0;
    @Generated public static final double MPO_CONNECTION_PORT = 2048.0;
    @Generated public static final double MPO_REPLY_PORT = 4096.0;
    @Generated public static final double MPO_ENFORCE_REPLY_PORT_SEMANTICS = 8192.0;
    @Generated public static final double MPO_PROVISIONAL_REPLY_PORT = 16384.0;
    @Generated public static final double GUARD_TYPE_MACH_PORT = 1.0;
    @Generated public static final double MPG_STRICT = 1.0;
    @Generated public static final double MPG_IMMOVABLE_RECEIVE = 2.0;
    @Generated public static final double F_OK = 0.0;
    @Generated public static final double SEEK_HOLE = 3.0;
    @Generated public static final double SEEK_DATA = 4.0;
    @Generated public static final double ACCESSX_MAX_DESCRIPTORS = 100.0;
    @Generated public static final double _PC_LINK_MAX = 1.0;
    @Generated public static final double _PC_MAX_CANON = 2.0;
    @Generated public static final double _PC_MAX_INPUT = 3.0;
    @Generated public static final double _PC_NAME_MAX = 4.0;
    @Generated public static final double _PC_PATH_MAX = 5.0;
    @Generated public static final double _PC_PIPE_BUF = 6.0;
    @Generated public static final double _PC_CHOWN_RESTRICTED = 7.0;
    @Generated public static final double _PC_NO_TRUNC = 8.0;
    @Generated public static final double _PC_VDISABLE = 9.0;
    @Generated public static final double _PC_NAME_CHARS_MAX = 10.0;
    @Generated public static final double _PC_CASE_SENSITIVE = 11.0;
    @Generated public static final double _PC_CASE_PRESERVING = 12.0;
    @Generated public static final double _PC_EXTENDED_SECURITY_NP = 13.0;
    @Generated public static final double _PC_AUTH_OPAQUE_NP = 14.0;
    @Generated public static final double _PC_2_SYMLINKS = 15.0;
    @Generated public static final double _PC_ALLOC_SIZE_MIN = 16.0;
    @Generated public static final double _PC_ASYNC_IO = 17.0;
    @Generated public static final double _PC_FILESIZEBITS = 18.0;
    @Generated public static final double _PC_PRIO_IO = 19.0;
    @Generated public static final double _PC_REC_INCR_XFER_SIZE = 20.0;
    @Generated public static final double _PC_REC_MAX_XFER_SIZE = 21.0;
    @Generated public static final double _PC_REC_MIN_XFER_SIZE = 22.0;
    @Generated public static final double _PC_REC_XFER_ALIGN = 23.0;
    @Generated public static final double _PC_SYMLINK_MAX = 24.0;
    @Generated public static final double _PC_SYNC_IO = 25.0;
    @Generated public static final double _PC_XATTR_SIZE_BITS = 26.0;
    @Generated public static final double _PC_MIN_HOLE_SIZE = 27.0;
    @Generated public static final double _CS_PATH = 1.0;
    @Generated public static final double STDIN_FILENO = 0.0;
    @Generated public static final double STDOUT_FILENO = 1.0;
    @Generated public static final double STDERR_FILENO = 2.0;
    @Generated public static final double _XOPEN_VERSION = 600.0;
    @Generated public static final double _XOPEN_XCU_VERSION = 4.0;
    @Generated public static final double _SC_ARG_MAX = 1.0;
    @Generated public static final double _SC_CHILD_MAX = 2.0;
    @Generated public static final double _SC_CLK_TCK = 3.0;
    @Generated public static final double _SC_NGROUPS_MAX = 4.0;
    @Generated public static final double _SC_OPEN_MAX = 5.0;
    @Generated public static final double _SC_JOB_CONTROL = 6.0;
    @Generated public static final double _SC_SAVED_IDS = 7.0;
    @Generated public static final double _SC_VERSION = 8.0;
    @Generated public static final double _SC_BC_BASE_MAX = 9.0;
    @Generated public static final double _SC_BC_DIM_MAX = 10.0;
    @Generated public static final double _SC_BC_SCALE_MAX = 11.0;
    @Generated public static final double _SC_BC_STRING_MAX = 12.0;
    @Generated public static final double _SC_COLL_WEIGHTS_MAX = 13.0;
    @Generated public static final double _SC_EXPR_NEST_MAX = 14.0;
    @Generated public static final double _SC_LINE_MAX = 15.0;
    @Generated public static final double _SC_RE_DUP_MAX = 16.0;
    @Generated public static final double _SC_2_VERSION = 17.0;
    @Generated public static final double _SC_2_C_BIND = 18.0;
    @Generated public static final double _SC_2_C_DEV = 19.0;
    @Generated public static final double _SC_2_CHAR_TERM = 20.0;
    @Generated public static final double _SC_2_FORT_DEV = 21.0;
    @Generated public static final double _SC_2_FORT_RUN = 22.0;
    @Generated public static final double _SC_2_LOCALEDEF = 23.0;
    @Generated public static final double _SC_2_SW_DEV = 24.0;
    @Generated public static final double _SC_2_UPE = 25.0;
    @Generated public static final double _SC_STREAM_MAX = 26.0;
    @Generated public static final double _SC_TZNAME_MAX = 27.0;
    @Generated public static final double _SC_ASYNCHRONOUS_IO = 28.0;
    @Generated public static final double _SC_PAGESIZE = 29.0;
    @Generated public static final double _SC_MEMLOCK = 30.0;
    @Generated public static final double _SC_MEMLOCK_RANGE = 31.0;
    @Generated public static final double _SC_MEMORY_PROTECTION = 32.0;
    @Generated public static final double _SC_MESSAGE_PASSING = 33.0;
    @Generated public static final double _SC_PRIORITIZED_IO = 34.0;
    @Generated public static final double _SC_PRIORITY_SCHEDULING = 35.0;
    @Generated public static final double _SC_REALTIME_SIGNALS = 36.0;
    @Generated public static final double _SC_SEMAPHORES = 37.0;
    @Generated public static final double _SC_FSYNC = 38.0;
    @Generated public static final double _SC_SHARED_MEMORY_OBJECTS = 39.0;
    @Generated public static final double _SC_SYNCHRONIZED_IO = 40.0;
    @Generated public static final double _SC_TIMERS = 41.0;
    @Generated public static final double _SC_AIO_LISTIO_MAX = 42.0;
    @Generated public static final double _SC_AIO_MAX = 43.0;
    @Generated public static final double _SC_AIO_PRIO_DELTA_MAX = 44.0;
    @Generated public static final double _SC_DELAYTIMER_MAX = 45.0;
    @Generated public static final double _SC_MQ_OPEN_MAX = 46.0;
    @Generated public static final double _SC_MAPPED_FILES = 47.0;
    @Generated public static final double _SC_RTSIG_MAX = 48.0;
    @Generated public static final double _SC_SEM_NSEMS_MAX = 49.0;
    @Generated public static final double _SC_SEM_VALUE_MAX = 50.0;
    @Generated public static final double _SC_SIGQUEUE_MAX = 51.0;
    @Generated public static final double _SC_TIMER_MAX = 52.0;
    @Generated public static final double _SC_NPROCESSORS_CONF = 57.0;
    @Generated public static final double _SC_NPROCESSORS_ONLN = 58.0;
    @Generated public static final double _SC_2_PBS = 59.0;
    @Generated public static final double _SC_2_PBS_ACCOUNTING = 60.0;
    @Generated public static final double _SC_2_PBS_CHECKPOINT = 61.0;
    @Generated public static final double _SC_2_PBS_LOCATE = 62.0;
    @Generated public static final double _SC_2_PBS_MESSAGE = 63.0;
    @Generated public static final double _SC_2_PBS_TRACK = 64.0;
    @Generated public static final double _SC_ADVISORY_INFO = 65.0;
    @Generated public static final double _SC_BARRIERS = 66.0;
    @Generated public static final double _SC_CLOCK_SELECTION = 67.0;
    @Generated public static final double _SC_CPUTIME = 68.0;
    @Generated public static final double _SC_FILE_LOCKING = 69.0;
    @Generated public static final double _SC_GETGR_R_SIZE_MAX = 70.0;
    @Generated public static final double _SC_GETPW_R_SIZE_MAX = 71.0;
    @Generated public static final double _SC_HOST_NAME_MAX = 72.0;
    @Generated public static final double _SC_LOGIN_NAME_MAX = 73.0;
    @Generated public static final double _SC_MONOTONIC_CLOCK = 74.0;
    @Generated public static final double _SC_MQ_PRIO_MAX = 75.0;
    @Generated public static final double _SC_READER_WRITER_LOCKS = 76.0;
    @Generated public static final double _SC_REGEXP = 77.0;
    @Generated public static final double _SC_SHELL = 78.0;
    @Generated public static final double _SC_SPAWN = 79.0;
    @Generated public static final double _SC_SPIN_LOCKS = 80.0;
    @Generated public static final double _SC_SPORADIC_SERVER = 81.0;
    @Generated public static final double _SC_THREAD_ATTR_STACKADDR = 82.0;
    @Generated public static final double _SC_THREAD_ATTR_STACKSIZE = 83.0;
    @Generated public static final double _SC_THREAD_CPUTIME = 84.0;
    @Generated public static final double _SC_THREAD_DESTRUCTOR_ITERATIONS = 85.0;
    @Generated public static final double _SC_THREAD_KEYS_MAX = 86.0;
    @Generated public static final double _SC_THREAD_PRIO_INHERIT = 87.0;
    @Generated public static final double _SC_THREAD_PRIO_PROTECT = 88.0;
    @Generated public static final double _SC_THREAD_PRIORITY_SCHEDULING = 89.0;
    @Generated public static final double _SC_THREAD_PROCESS_SHARED = 90.0;
    @Generated public static final double _SC_THREAD_SAFE_FUNCTIONS = 91.0;
    @Generated public static final double _SC_THREAD_SPORADIC_SERVER = 92.0;
    @Generated public static final double _SC_THREAD_STACK_MIN = 93.0;
    @Generated public static final double _SC_THREAD_THREADS_MAX = 94.0;
    @Generated public static final double _SC_TIMEOUTS = 95.0;
    @Generated public static final double _SC_THREADS = 96.0;
    @Generated public static final double _SC_TRACE = 97.0;
    @Generated public static final double _SC_TRACE_EVENT_FILTER = 98.0;
    @Generated public static final double _SC_TRACE_INHERIT = 99.0;
    @Generated public static final double _SC_TRACE_LOG = 100.0;
    @Generated public static final double _SC_TTY_NAME_MAX = 101.0;
    @Generated public static final double _SC_TYPED_MEMORY_OBJECTS = 102.0;
    @Generated public static final double _SC_V6_ILP32_OFF32 = 103.0;
    @Generated public static final double _SC_V6_ILP32_OFFBIG = 104.0;
    @Generated public static final double _SC_V6_LP64_OFF64 = 105.0;
    @Generated public static final double _SC_V6_LPBIG_OFFBIG = 106.0;
    @Generated public static final double _SC_IPV6 = 118.0;
    @Generated public static final double _SC_RAW_SOCKETS = 119.0;
    @Generated public static final double _SC_SYMLOOP_MAX = 120.0;
    @Generated public static final double _SC_ATEXIT_MAX = 107.0;
    @Generated public static final double _SC_IOV_MAX = 56.0;
    @Generated public static final double _SC_XOPEN_CRYPT = 108.0;
    @Generated public static final double _SC_XOPEN_ENH_I18N = 109.0;
    @Generated public static final double _SC_XOPEN_LEGACY = 110.0;
    @Generated public static final double _SC_XOPEN_REALTIME = 111.0;
    @Generated public static final double _SC_XOPEN_REALTIME_THREADS = 112.0;
    @Generated public static final double _SC_XOPEN_SHM = 113.0;
    @Generated public static final double _SC_XOPEN_STREAMS = 114.0;
    @Generated public static final double _SC_XOPEN_UNIX = 115.0;
    @Generated public static final double _SC_XOPEN_VERSION = 116.0;
    @Generated public static final double _SC_XOPEN_XCU_VERSION = 121.0;
    @Generated public static final double _SC_XBS5_ILP32_OFF32 = 122.0;
    @Generated public static final double _SC_XBS5_ILP32_OFFBIG = 123.0;
    @Generated public static final double _SC_XBS5_LP64_OFF64 = 124.0;
    @Generated public static final double _SC_XBS5_LPBIG_OFFBIG = 125.0;
    @Generated public static final double _SC_SS_REPL_MAX = 126.0;
    @Generated public static final double _SC_TRACE_EVENT_NAME_MAX = 127.0;
    @Generated public static final double _SC_TRACE_NAME_MAX = 128.0;
    @Generated public static final double _SC_TRACE_SYS_MAX = 129.0;
    @Generated public static final double _SC_TRACE_USER_EVENT_MAX = 130.0;
    @Generated public static final double _SC_PASS_MAX = 131.0;
    @Generated public static final double _SC_PHYS_PAGES = 200.0;
    @Generated public static final double _CS_POSIX_V6_ILP32_OFF32_CFLAGS = 2.0;
    @Generated public static final double _CS_POSIX_V6_ILP32_OFF32_LDFLAGS = 3.0;
    @Generated public static final double _CS_POSIX_V6_ILP32_OFF32_LIBS = 4.0;
    @Generated public static final double _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS = 5.0;
    @Generated public static final double _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS = 6.0;
    @Generated public static final double _CS_POSIX_V6_ILP32_OFFBIG_LIBS = 7.0;
    @Generated public static final double _CS_POSIX_V6_LP64_OFF64_CFLAGS = 8.0;
    @Generated public static final double _CS_POSIX_V6_LP64_OFF64_LDFLAGS = 9.0;
    @Generated public static final double _CS_POSIX_V6_LP64_OFF64_LIBS = 10.0;
    @Generated public static final double _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS = 11.0;
    @Generated public static final double _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS = 12.0;
    @Generated public static final double _CS_POSIX_V6_LPBIG_OFFBIG_LIBS = 13.0;
    @Generated public static final double _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS = 14.0;
    @Generated public static final double _CS_XBS5_ILP32_OFF32_CFLAGS = 20.0;
    @Generated public static final double _CS_XBS5_ILP32_OFF32_LDFLAGS = 21.0;
    @Generated public static final double _CS_XBS5_ILP32_OFF32_LIBS = 22.0;
    @Generated public static final double _CS_XBS5_ILP32_OFF32_LINTFLAGS = 23.0;
    @Generated public static final double _CS_XBS5_ILP32_OFFBIG_CFLAGS = 24.0;
    @Generated public static final double _CS_XBS5_ILP32_OFFBIG_LDFLAGS = 25.0;
    @Generated public static final double _CS_XBS5_ILP32_OFFBIG_LIBS = 26.0;
    @Generated public static final double _CS_XBS5_ILP32_OFFBIG_LINTFLAGS = 27.0;
    @Generated public static final double _CS_XBS5_LP64_OFF64_CFLAGS = 28.0;
    @Generated public static final double _CS_XBS5_LP64_OFF64_LDFLAGS = 29.0;
    @Generated public static final double _CS_XBS5_LP64_OFF64_LIBS = 30.0;
    @Generated public static final double _CS_XBS5_LP64_OFF64_LINTFLAGS = 31.0;
    @Generated public static final double _CS_XBS5_LPBIG_OFFBIG_CFLAGS = 32.0;
    @Generated public static final double _CS_XBS5_LPBIG_OFFBIG_LDFLAGS = 33.0;
    @Generated public static final double _CS_XBS5_LPBIG_OFFBIG_LIBS = 34.0;
    @Generated public static final double _CS_XBS5_LPBIG_OFFBIG_LINTFLAGS = 35.0;
    @Generated public static final double _CS_DARWIN_USER_DIR = 65536.0;
    @Generated public static final double _CS_DARWIN_USER_TEMP_DIR = 65537.0;
    @Generated public static final double _CS_DARWIN_USER_CACHE_DIR = 65538.0;
    @Generated public static final double F_ULOCK = 0.0;
    @Generated public static final double F_LOCK = 1.0;
    @Generated public static final double F_TLOCK = 2.0;
    @Generated public static final double F_TEST = 3.0;
    @Generated public static final double SYNC_VOLUME_FULLSYNC = 1.0;
    @Generated public static final double SYNC_VOLUME_WAIT = 2.0;
    @Generated public static final double O_RDONLY = 0.0;
    @Generated public static final double O_WRONLY = 1.0;
    @Generated public static final double O_RDWR = 2.0;
    @Generated public static final double O_ACCMODE = 3.0;
    @Generated public static final double FREAD = 1.0;
    @Generated public static final double FWRITE = 2.0;
    @Generated public static final double O_NONBLOCK = 4.0;
    @Generated public static final double O_APPEND = 8.0;
    @Generated public static final double O_SYNC = 128.0;
    @Generated public static final double O_SHLOCK = 16.0;
    @Generated public static final double O_EXLOCK = 32.0;
    @Generated public static final double O_ASYNC = 64.0;
    @Generated public static final double O_NOFOLLOW = 256.0;
    @Generated public static final double O_CREAT = 512.0;
    @Generated public static final double O_TRUNC = 1024.0;
    @Generated public static final double O_EXCL = 2048.0;
    @Generated public static final double O_EVTONLY = 32768.0;
    @Generated public static final double O_NOCTTY = 131072.0;
    @Generated public static final double O_DIRECTORY = 1048576.0;
    @Generated public static final double O_SYMLINK = 2097152.0;
    @Generated public static final double O_DSYNC = 4194304.0;
    @Generated public static final double O_CLOEXEC = 1.6777216E7;
    @Generated public static final double O_NOFOLLOW_ANY = 5.36870912E8;
    @Generated public static final double O_EXEC = 1.073741824E9;
    @Generated public static final double AT_FDCWD = -2.0;
    @Generated public static final double AT_EACCESS = 16.0;
    @Generated public static final double AT_SYMLINK_NOFOLLOW = 32.0;
    @Generated public static final double AT_SYMLINK_FOLLOW = 64.0;
    @Generated public static final double AT_REMOVEDIR = 128.0;
    @Generated public static final double AT_REALDEV = 512.0;
    @Generated public static final double AT_FDONLY = 1024.0;
    @Generated public static final double AT_SYMLINK_NOFOLLOW_ANY = 2048.0;
    @Generated public static final double O_DP_GETRAWENCRYPTED = 1.0;
    @Generated public static final double O_DP_GETRAWUNENCRYPTED = 2.0;
    @Generated public static final double O_DP_AUTHENTICATE = 4.0;
    @Generated public static final double AUTH_OPEN_NOAUTHFD = -1.0;
    @Generated public static final double CPF_OVERWRITE = 1.0;
    @Generated public static final double CPF_IGNORE_MODE = 2.0;
    @Generated public static final double F_DUPFD = 0.0;
    @Generated public static final double F_GETFD = 1.0;
    @Generated public static final double F_SETFD = 2.0;
    @Generated public static final double F_GETFL = 3.0;
    @Generated public static final double F_SETFL = 4.0;
    @Generated public static final double F_GETOWN = 5.0;
    @Generated public static final double F_SETOWN = 6.0;
    @Generated public static final double F_GETLK = 7.0;
    @Generated public static final double F_SETLK = 8.0;
    @Generated public static final double F_SETLKW = 9.0;
    @Generated public static final double F_SETLKWTIMEOUT = 10.0;
    @Generated public static final double F_FLUSH_DATA = 40.0;
    @Generated public static final double F_CHKCLEAN = 41.0;
    @Generated public static final double F_PREALLOCATE = 42.0;
    @Generated public static final double F_SETSIZE = 43.0;
    @Generated public static final double F_RDADVISE = 44.0;
    @Generated public static final double F_RDAHEAD = 45.0;
    @Generated public static final double F_NOCACHE = 48.0;
    @Generated public static final double F_LOG2PHYS = 49.0;
    @Generated public static final double F_GETPATH = 50.0;
    @Generated public static final double F_FULLFSYNC = 51.0;
    @Generated public static final double F_PATHPKG_CHECK = 52.0;
    @Generated public static final double F_FREEZE_FS = 53.0;
    @Generated public static final double F_THAW_FS = 54.0;
    @Generated public static final double F_GLOBAL_NOCACHE = 55.0;
    @Generated public static final double F_ADDSIGS = 59.0;
    @Generated public static final double F_ADDFILESIGS = 61.0;
    @Generated public static final double F_NODIRECT = 62.0;
    @Generated public static final double F_GETPROTECTIONCLASS = 63.0;
    @Generated public static final double F_SETPROTECTIONCLASS = 64.0;
    @Generated public static final double F_LOG2PHYS_EXT = 65.0;
    @Generated public static final double F_GETLKPID = 66.0;
    @Generated public static final double F_SETBACKINGSTORE = 70.0;
    @Generated public static final double F_GETPATH_MTMINFO = 71.0;
    @Generated public static final double F_GETCODEDIR = 72.0;
    @Generated public static final double F_SETNOSIGPIPE = 73.0;
    @Generated public static final double F_GETNOSIGPIPE = 74.0;
    @Generated public static final double F_TRANSCODEKEY = 75.0;
    @Generated public static final double F_SINGLE_WRITER = 76.0;
    @Generated public static final double F_GETPROTECTIONLEVEL = 77.0;
    @Generated public static final double F_FINDSIGS = 78.0;
    @Generated public static final double F_ADDFILESIGS_FOR_DYLD_SIM = 83.0;
    @Generated public static final double F_BARRIERFSYNC = 85.0;
    @Generated public static final double F_ADDFILESIGS_RETURN = 97.0;
    @Generated public static final double F_CHECK_LV = 98.0;
    @Generated public static final double F_PUNCHHOLE = 99.0;
    @Generated public static final double F_TRIM_ACTIVE_FILE = 100.0;
    @Generated public static final double F_SPECULATIVE_READ = 101.0;
    @Generated public static final double F_GETPATH_NOFIRMLINK = 102.0;
    @Generated public static final double F_ADDFILESIGS_INFO = 103.0;
    @Generated public static final double F_ADDFILESUPPL = 104.0;
    @Generated public static final double F_GETSIGSINFO = 105.0;
    @Generated public static final double F_SETLEASE = 106.0;
    @Generated public static final double F_GETLEASE = 107.0;
    @Generated public static final double F_TRANSFEREXTENTS = 110.0;
    @Generated public static final double FCNTL_FS_SPECIFIC_BASE = 65536.0;
    @Generated public static final double F_DUPFD_CLOEXEC = 67.0;
    @Generated public static final double FD_CLOEXEC = 1.0;
    @Generated public static final double F_RDLCK = 1.0;
    @Generated public static final double F_UNLCK = 2.0;
    @Generated public static final double F_WRLCK = 3.0;
    @Generated public static final double S_IFMT = 170000.0;
    @Generated public static final double S_IFIFO = 10000.0;
    @Generated public static final double S_IFCHR = 20000.0;
    @Generated public static final double S_IFDIR = 40000.0;
    @Generated public static final double S_IFBLK = 60000.0;
    @Generated public static final double S_IFREG = 100000.0;
    @Generated public static final double S_IFLNK = 120000.0;
    @Generated public static final double S_IFSOCK = 140000.0;
    @Generated public static final double S_IFWHT = 160000.0;
    @Generated public static final double S_IRWXU = 700.0;
    @Generated public static final double S_IRUSR = 400.0;
    @Generated public static final double S_IWUSR = 200.0;
    @Generated public static final double S_IXUSR = 100.0;
    @Generated public static final double S_IRWXG = 70.0;
    @Generated public static final double S_IRGRP = 40.0;
    @Generated public static final double S_IWGRP = 20.0;
    @Generated public static final double S_IXGRP = 10.0;
    @Generated public static final double S_IRWXO = 7.0;
    @Generated public static final double S_IROTH = 4.0;
    @Generated public static final double S_IWOTH = 2.0;
    @Generated public static final double S_IXOTH = 1.0;
    @Generated public static final double S_ISUID = 4000.0;
    @Generated public static final double S_ISGID = 2000.0;
    @Generated public static final double S_ISVTX = 1000.0;
    @Generated public static final double F_ALLOCATECONTIG = 2.0;
    @Generated public static final double F_ALLOCATEALL = 4.0;
    @Generated public static final double F_ALLOCATEPERSIST = 8.0;
    @Generated public static final double F_PEOFPOSMODE = 3.0;
    @Generated public static final double F_VOLPOSMODE = 4.0;
    @Generated public static final double USER_FSIGNATURES_CDHASH_LEN = 20.0;
    @Generated public static final double GETSIGSINFO_PLATFORM_BINARY = 1.0;
    @Generated public static final double LOCK_SH = 1.0;
    @Generated public static final double LOCK_EX = 2.0;
    @Generated public static final double LOCK_NB = 4.0;
    @Generated public static final double LOCK_UN = 8.0;
    @Generated public static final double O_ALERT = 5.36870912E8;
    @Generated public static final double DISPATCH_API_VERSION = 2.0181008E7;
    @Generated public static final double OS_OBJECT_HAVE_OBJC_SUPPORT = 0.0;
    @Generated public static final double OS_OBJECT_USE_OBJC = 0.0;
    @Generated public static final double OS_OBJECT_SWIFT3 = 0.0;
    @Generated public static final double OBJC_API_VERSION = 2.0;
    @Generated public static final double OBJC_NO_GC = 1.0;
    @Generated public static final double OBJC_NO_GC_API = 1.0;
    @Generated public static final double NS_ENFORCE_NSOBJECT_DESIGNATED_INITIALIZER = 1.0;
    @Generated public static final double OBJC_OLD_DISPATCH_PROTOTYPES = 0.0;
    @Generated public static final double OBJC_BOOL_IS_BOOL = 1.0;
    @Generated public static final double NSINTEGER_DEFINED = 1.0;
    @Generated public static final double OS_OBJECT_USE_OBJC_RETAIN_RELEASE = 0.0;
    @Generated public static final double __OS_WORKGROUP_ATTR_SIZE__ = 60.0;
    @Generated public static final double __OS_WORKGROUP_INTERVAL_DATA_SIZE__ = 56.0;
    @Generated public static final double __OS_WORKGROUP_JOIN_TOKEN_SIZE__ = 36.0;
    @Generated public static final double _OS_WORKGROUP_ATTR_SIG_DEFAULT_INIT = 7.99564724E8;
    @Generated public static final double _OS_WORKGROUP_ATTR_SIG_EMPTY_INIT = 7.9956474E8;
    @Generated public static final double _OS_WORKGROUP_INTERVAL_DATA_SIG_INIT = 1.386695757E9;
    @Generated public static final double DISPATCH_SWIFT3_OVERLAY = 0.0;
    @Generated public static final double SYSTEM_CLOCK = 0.0;
    @Generated public static final double CALENDAR_CLOCK = 1.0;
    @Generated public static final double REALTIME_CLOCK = 0.0;
    @Generated public static final double CLOCK_GET_TIME_RES = 1.0;
    @Generated public static final double CLOCK_ALARM_CURRES = 3.0;
    @Generated public static final double CLOCK_ALARM_MINRES = 4.0;
    @Generated public static final double CLOCK_ALARM_MAXRES = 5.0;
    @Generated public static final double ALRMTYPE = 255.0;
    @Generated public static final double TIME_ABSOLUTE = 0.0;
    @Generated public static final double TIME_RELATIVE = 1.0;
    @Generated public static final double DISPATCH_APPLY_AUTO_AVAILABLE = 0.0;
    @Generated public static final double DISPATCH_QUEUE_PRIORITY_HIGH = 2.0;
    @Generated public static final double DISPATCH_QUEUE_PRIORITY_DEFAULT = 0.0;
    @Generated public static final double KERN_SUCCESS = 0.0;
    @Generated public static final double KERN_INVALID_ADDRESS = 1.0;
    @Generated public static final double KERN_PROTECTION_FAILURE = 2.0;
    @Generated public static final double KERN_NO_SPACE = 3.0;
    @Generated public static final double KERN_INVALID_ARGUMENT = 4.0;
    @Generated public static final double KERN_FAILURE = 5.0;
    @Generated public static final double KERN_RESOURCE_SHORTAGE = 6.0;
    @Generated public static final double KERN_NOT_RECEIVER = 7.0;
    @Generated public static final double KERN_NO_ACCESS = 8.0;
    @Generated public static final double KERN_MEMORY_FAILURE = 9.0;
    @Generated public static final double KERN_MEMORY_ERROR = 10.0;
    @Generated public static final double KERN_ALREADY_IN_SET = 11.0;
    @Generated public static final double KERN_NOT_IN_SET = 12.0;
    @Generated public static final double KERN_NAME_EXISTS = 13.0;
    @Generated public static final double KERN_ABORTED = 14.0;
    @Generated public static final double KERN_INVALID_NAME = 15.0;
    @Generated public static final double KERN_INVALID_TASK = 16.0;
    @Generated public static final double KERN_INVALID_RIGHT = 17.0;
    @Generated public static final double KERN_INVALID_VALUE = 18.0;
    @Generated public static final double KERN_UREFS_OVERFLOW = 19.0;
    @Generated public static final double KERN_INVALID_CAPABILITY = 20.0;
    @Generated public static final double KERN_RIGHT_EXISTS = 21.0;
    @Generated public static final double KERN_INVALID_HOST = 22.0;
    @Generated public static final double KERN_MEMORY_PRESENT = 23.0;
    @Generated public static final double KERN_MEMORY_DATA_MOVED = 24.0;
    @Generated public static final double KERN_MEMORY_RESTART_COPY = 25.0;
    @Generated public static final double KERN_INVALID_PROCESSOR_SET = 26.0;
    @Generated public static final double KERN_POLICY_LIMIT = 27.0;
    @Generated public static final double KERN_INVALID_POLICY = 28.0;
    @Generated public static final double KERN_INVALID_OBJECT = 29.0;
    @Generated public static final double KERN_ALREADY_WAITING = 30.0;
    @Generated public static final double KERN_DEFAULT_SET = 31.0;
    @Generated public static final double KERN_EXCEPTION_PROTECTED = 32.0;
    @Generated public static final double KERN_INVALID_LEDGER = 33.0;
    @Generated public static final double KERN_INVALID_MEMORY_CONTROL = 34.0;
    @Generated public static final double KERN_INVALID_SECURITY = 35.0;
    @Generated public static final double KERN_NOT_DEPRESSED = 36.0;
    @Generated public static final double KERN_TERMINATED = 37.0;
    @Generated public static final double KERN_LOCK_SET_DESTROYED = 38.0;
    @Generated public static final double KERN_LOCK_UNSTABLE = 39.0;
    @Generated public static final double KERN_LOCK_OWNED = 40.0;
    @Generated public static final double KERN_LOCK_OWNED_SELF = 41.0;
    @Generated public static final double KERN_SEMAPHORE_DESTROYED = 42.0;
    @Generated public static final double KERN_RPC_SERVER_TERMINATED = 43.0;
    @Generated public static final double KERN_RPC_TERMINATE_ORPHAN = 44.0;
    @Generated public static final double KERN_RPC_CONTINUE_ORPHAN = 45.0;
    @Generated public static final double KERN_NOT_SUPPORTED = 46.0;
    @Generated public static final double KERN_NODE_DOWN = 47.0;
    @Generated public static final double KERN_NOT_WAITING = 48.0;
    @Generated public static final double KERN_OPERATION_TIMED_OUT = 49.0;
    @Generated public static final double KERN_CODESIGN_ERROR = 50.0;
    @Generated public static final double KERN_POLICY_STATIC = 51.0;
    @Generated public static final double KERN_INSUFFICIENT_BUFFER_SIZE = 52.0;
    @Generated public static final double KERN_DENIED = 53.0;
    @Generated public static final double KERN_MISSING_KC = 54.0;
    @Generated public static final double KERN_INVALID_KC = 55.0;
    @Generated public static final double KERN_NOT_FOUND = 56.0;
    @Generated public static final double KERN_RETURN_MAX = 256.0;
    @Generated public static final double MACH_MSGH_BITS_ZERO = 0.0;
    @Generated public static final double MACH_MSGH_BITS_REMOTE_MASK = 31.0;
    @Generated public static final double MACH_MSGH_BITS_LOCAL_MASK = 7936.0;
    @Generated public static final double MACH_MSGH_BITS_VOUCHER_MASK = 2031616.0;
    @Generated public static final double MACH_MSG_TYPE_MOVE_RECEIVE = 16.0;
    @Generated public static final double MACH_MSG_TYPE_MOVE_SEND = 17.0;
    @Generated public static final double MACH_MSG_TYPE_MOVE_SEND_ONCE = 18.0;
    @Generated public static final double MACH_MSG_TYPE_COPY_SEND = 19.0;
    @Generated public static final double MACH_MSG_TYPE_MAKE_SEND = 20.0;
    @Generated public static final double MACH_MSG_TYPE_MAKE_SEND_ONCE = 21.0;
    @Generated public static final double MACH_MSG_TYPE_COPY_RECEIVE = 22.0;
    @Generated public static final double MACH_MSG_TYPE_DISPOSE_RECEIVE = 24.0;
    @Generated public static final double MACH_MSG_TYPE_DISPOSE_SEND = 25.0;
    @Generated public static final double MACH_MSG_TYPE_DISPOSE_SEND_ONCE = 26.0;
    @Generated public static final double MACH_MSG_PHYSICAL_COPY = 0.0;
    @Generated public static final double MACH_MSG_VIRTUAL_COPY = 1.0;
    @Generated public static final double MACH_MSG_ALLOCATE = 2.0;
    @Generated public static final double MACH_MSG_OVERWRITE = 3.0;
    @Generated public static final double MACH_MSG_GUARD_FLAGS_NONE = 0.0;
    @Generated public static final double MACH_MSG_GUARD_FLAGS_IMMOVABLE_RECEIVE = 1.0;
    @Generated public static final double MACH_MSG_GUARD_FLAGS_UNGUARDED_ON_SEND = 2.0;
    @Generated public static final double MACH_MSG_GUARD_FLAGS_MASK = 3.0;
    @Generated public static final double MACH_MSG_PORT_DESCRIPTOR = 0.0;
    @Generated public static final double MACH_MSG_OOL_DESCRIPTOR = 1.0;
    @Generated public static final double MACH_MSG_OOL_PORTS_DESCRIPTOR = 2.0;
    @Generated public static final double MACH_MSG_OOL_VOLATILE_DESCRIPTOR = 3.0;
    @Generated public static final double MACH_MSG_GUARDED_PORT_DESCRIPTOR = 4.0;
    @Generated public static final double MACH_MSG_TRAILER_FORMAT_0 = 0.0;
    @Generated public static final double MACH_MSGH_KIND_NORMAL = 0.0;
    @Generated public static final double MACH_MSGH_KIND_NOTIFICATION = 1.0;
    @Generated public static final double MACH_MSG_TYPE_PORT_NONE = 0.0;
    @Generated public static final double MACH_MSG_TYPE_PORT_NAME = 15.0;
    @Generated public static final double MACH_MSG_TYPE_LAST = 22.0;
    @Generated public static final double MACH_MSG_OPTION_NONE = 0.0;
    @Generated public static final double MACH_SEND_MSG = 1.0;
    @Generated public static final double MACH_RCV_MSG = 2.0;
    @Generated public static final double MACH_RCV_LARGE = 4.0;
    @Generated public static final double MACH_RCV_LARGE_IDENTITY = 8.0;
    @Generated public static final double MACH_SEND_TIMEOUT = 16.0;
    @Generated public static final double MACH_SEND_OVERRIDE = 32.0;
    @Generated public static final double MACH_SEND_INTERRUPT = 64.0;
    @Generated public static final double MACH_SEND_NOTIFY = 128.0;
    @Generated public static final double MACH_SEND_ALWAYS = 65536.0;
    @Generated public static final double MACH_SEND_FILTER_NONFATAL = 65536.0;
    @Generated public static final double MACH_SEND_TRAILER = 131072.0;
    @Generated public static final double MACH_SEND_NOIMPORTANCE = 262144.0;
    @Generated public static final double MACH_SEND_IMPORTANCE = 524288.0;
    @Generated public static final double MACH_SEND_SYNC_OVERRIDE = 1048576.0;
    @Generated public static final double MACH_SEND_PROPAGATE_QOS = 2097152.0;
    @Generated public static final double MACH_SEND_KERNEL = 4194304.0;
    @Generated public static final double MACH_SEND_SYNC_BOOTSTRAP_CHECKIN = 8388608.0;
    @Generated public static final double MACH_RCV_TIMEOUT = 256.0;
    @Generated public static final double MACH_RCV_NOTIFY = 0.0;
    @Generated public static final double MACH_RCV_INTERRUPT = 1024.0;
    @Generated public static final double MACH_RCV_VOUCHER = 2048.0;
    @Generated public static final double MACH_RCV_OVERWRITE = 0.0;
    @Generated public static final double MACH_RCV_GUARDED_DESC = 4096.0;
    @Generated public static final double MACH_RCV_SYNC_WAIT = 16384.0;
    @Generated public static final double MACH_RCV_SYNC_PEEK = 32768.0;
    @Generated public static final double MACH_MSG_STRICT_REPLY = 512.0;
    @Generated public static final double MACH_RCV_TRAILER_NULL = 0.0;
    @Generated public static final double MACH_RCV_TRAILER_SEQNO = 1.0;
    @Generated public static final double MACH_RCV_TRAILER_SENDER = 2.0;
    @Generated public static final double MACH_RCV_TRAILER_AUDIT = 3.0;
    @Generated public static final double MACH_RCV_TRAILER_CTX = 4.0;
    @Generated public static final double MACH_RCV_TRAILER_AV = 7.0;
    @Generated public static final double MACH_RCV_TRAILER_LABELS = 8.0;
    @Generated public static final double MACH_MSG_SUCCESS = 0.0;
    @Generated public static final double MACH_MSG_MASK = 15872.0;
    @Generated public static final double MACH_MSG_IPC_SPACE = 8192.0;
    @Generated public static final double MACH_MSG_VM_SPACE = 4096.0;
    @Generated public static final double MACH_MSG_IPC_KERNEL = 2048.0;
    @Generated public static final double MACH_MSG_VM_KERNEL = 1024.0;
    @Generated public static final double MACH_SEND_IN_PROGRESS = 2.68435457E8;
    @Generated public static final double MACH_SEND_INVALID_DATA = 2.68435458E8;
    @Generated public static final double MACH_SEND_INVALID_DEST = 2.68435459E8;
    @Generated public static final double MACH_SEND_TIMED_OUT = 2.6843546E8;
    @Generated public static final double MACH_SEND_INVALID_VOUCHER = 2.68435461E8;
    @Generated public static final double MACH_SEND_INTERRUPTED = 2.68435463E8;
    @Generated public static final double MACH_SEND_MSG_TOO_SMALL = 2.68435464E8;
    @Generated public static final double MACH_SEND_INVALID_REPLY = 2.68435465E8;
    @Generated public static final double MACH_SEND_INVALID_RIGHT = 2.68435466E8;
    @Generated public static final double MACH_SEND_INVALID_NOTIFY = 2.68435467E8;
    @Generated public static final double MACH_SEND_INVALID_MEMORY = 2.68435468E8;
    @Generated public static final double MACH_SEND_NO_BUFFER = 2.68435469E8;
    @Generated public static final double MACH_SEND_TOO_LARGE = 2.6843547E8;
    @Generated public static final double MACH_SEND_INVALID_TYPE = 2.68435471E8;
    @Generated public static final double MACH_SEND_INVALID_HEADER = 2.68435472E8;
    @Generated public static final double MACH_SEND_INVALID_TRAILER = 2.68435473E8;
    @Generated public static final double MACH_SEND_INVALID_CONTEXT = 2.68435474E8;
    @Generated public static final double MACH_SEND_INVALID_OPTIONS = 2.68435475E8;
    @Generated public static final double MACH_SEND_INVALID_RT_OOL_SIZE = 2.68435477E8;
    @Generated public static final double MACH_SEND_NO_GRANT_DEST = 2.68435478E8;
    @Generated public static final double MACH_SEND_MSG_FILTERED = 2.68435479E8;
    @Generated public static final double MACH_SEND_AUX_TOO_SMALL = 2.6843548E8;
    @Generated public static final double MACH_SEND_AUX_TOO_LARGE = 2.68435481E8;
    @Generated public static final double MACH_RCV_IN_PROGRESS = 2.68451841E8;
    @Generated public static final double MACH_RCV_INVALID_NAME = 2.68451842E8;
    @Generated public static final double MACH_RCV_TIMED_OUT = 2.68451843E8;
    @Generated public static final double MACH_RCV_TOO_LARGE = 2.68451844E8;
    @Generated public static final double MACH_RCV_INTERRUPTED = 2.68451845E8;
    @Generated public static final double MACH_RCV_PORT_CHANGED = 2.68451846E8;
    @Generated public static final double MACH_RCV_INVALID_NOTIFY = 2.68451847E8;
    @Generated public static final double MACH_RCV_INVALID_DATA = 2.68451848E8;
    @Generated public static final double MACH_RCV_PORT_DIED = 2.68451849E8;
    @Generated public static final double MACH_RCV_IN_SET = 2.6845185E8;
    @Generated public static final double MACH_RCV_HEADER_ERROR = 2.68451851E8;
    @Generated public static final double MACH_RCV_BODY_ERROR = 2.68451852E8;
    @Generated public static final double MACH_RCV_INVALID_TYPE = 2.68451853E8;
    @Generated public static final double MACH_RCV_SCATTER_SMALL = 2.68451854E8;
    @Generated public static final double MACH_RCV_INVALID_TRAILER = 2.68451855E8;
    @Generated public static final double MACH_RCV_IN_PROGRESS_TIMED = 2.68451857E8;
    @Generated public static final double MACH_RCV_INVALID_REPLY = 2.68451858E8;
    @Generated public static final double MACH_RCV_INVALID_ARGUMENTS = 2.68451859E8;
    @Generated public static final double DISPATCH_MACH_SEND_DEAD = 1.0;
    @Generated public static final double DISPATCH_MEMORYPRESSURE_NORMAL = 1.0;
    @Generated public static final double DISPATCH_MEMORYPRESSURE_WARN = 2.0;
    @Generated public static final double DISPATCH_MEMORYPRESSURE_CRITICAL = 4.0;
    @Generated public static final double DISPATCH_PROC_FORK = 1.073741824E9;
    @Generated public static final double DISPATCH_PROC_EXEC = 5.36870912E8;
    @Generated public static final double DISPATCH_PROC_SIGNAL = 1.34217728E8;
    @Generated public static final double DISPATCH_VNODE_DELETE = 1.0;
    @Generated public static final double DISPATCH_VNODE_WRITE = 2.0;
    @Generated public static final double DISPATCH_VNODE_EXTEND = 4.0;
    @Generated public static final double DISPATCH_VNODE_ATTRIB = 8.0;
    @Generated public static final double DISPATCH_VNODE_LINK = 16.0;
    @Generated public static final double DISPATCH_VNODE_RENAME = 32.0;
    @Generated public static final double DISPATCH_VNODE_REVOKE = 64.0;
    @Generated public static final double DISPATCH_VNODE_FUNLOCK = 256.0;
    @Generated public static final double DISPATCH_TIMER_STRICT = 1.0;
    @Generated public static final double DISPATCH_ONCE_INLINE_FASTPATH = 1.0;
    @Generated public static final double DISPATCH_IO_STREAM = 0.0;
    @Generated public static final double DISPATCH_IO_RANDOM = 1.0;
    @Generated public static final double DISPATCH_IO_STOP = 1.0;
    @Generated public static final double DISPATCH_IO_STRICT_INTERVAL = 1.0;
    @Generated public static final double CPU_STATE_MAX = 4.0;
    @Generated public static final double CPU_STATE_USER = 0.0;
    @Generated public static final double CPU_STATE_SYSTEM = 1.0;
    @Generated public static final double CPU_STATE_IDLE = 2.0;
    @Generated public static final double CPU_STATE_NICE = 3.0;
    @Generated public static final double CPU_ARCH_ABI64 = 1.6777216E7;
    @Generated public static final double CPU_ARCH_ABI64_32 = 3.3554432E7;
    @Generated public static final double CPU_SUBTYPE_INTEL_FAMILY_MAX = 15.0;
    @Generated public static final double CPU_SUBTYPE_INTEL_MODEL_ALL = 0.0;
    @Generated public static final double CPU_SUBTYPE_ARM64_PTR_AUTH_MASK = 2.5165824E8;
    @Generated public static final double CPUFAMILY_UNKNOWN = 0.0;
    @Generated public static final double CPUFAMILY_POWERPC_G4 = 2.009171118E9;
    @Generated public static final double CPUFAMILY_INTEL_PENRYN = 2.028621756E9;
    @Generated public static final double CPUFAMILY_INTEL_NEHALEM = 1.801080018E9;
    @Generated public static final double CPUFAMILY_INTEL_WESTMERE = 1.463508716E9;
    @Generated public static final double CPUFAMILY_INTEL_SANDYBRIDGE = 1.418770316E9;
    @Generated public static final double CPUFAMILY_INTEL_IVYBRIDGE = 5.26772277E8;
    @Generated public static final double CPUFAMILY_INTEL_HASWELL = 2.80134364E8;
    @Generated public static final double CPUFAMILY_INTEL_BROADWELL = 1.479463068E9;
    @Generated public static final double CPUFAMILY_INTEL_SKYLAKE = 9.39270559E8;
    @Generated public static final double CPUFAMILY_INTEL_KABYLAKE = 2.60141638E8;
    @Generated public static final double CPUFAMILY_INTEL_ICELAKE = 9.43936839E8;
    @Generated public static final double CPUFAMILY_ARM_XSCALE = 1.404044789E9;
    @Generated public static final double CPUFAMILY_ARM_13 = 2.14503012E8;
    @Generated public static final double CPUFAMILY_ARM_SWIFT = 5.06291073E8;
    @Generated public static final double CPUFAMILY_ARM_CYCLONE = 9.33271106E8;
    @Generated public static final double CPUFAMILY_ARM_TYPHOON = 7.47742334E8;
    @Generated public static final double CPUFAMILY_ARM_HURRICANE = 1.741614739E9;
    @Generated public static final double CPUFAMILY_ARM_VORTEX_TEMPEST = 1.31287967E8;
    @Generated public static final double CPUFAMILY_ARM_LIGHTNING_THUNDER = 1.176831186E9;
    @Generated public static final double CPUFAMILY_ARM_FIRESTORM_ICESTORM = 4.58787763E8;
    @Generated public static final double CPUSUBFAMILY_UNKNOWN = 0.0;
    @Generated public static final double CPUSUBFAMILY_ARM_HP = 1.0;
    @Generated public static final double CPUSUBFAMILY_ARM_HG = 2.0;
    @Generated public static final double CPUSUBFAMILY_ARM_M = 3.0;
    @Generated public static final double CPUSUBFAMILY_ARM_HS = 4.0;
    @Generated public static final double CPUSUBFAMILY_ARM_HC_HD = 5.0;
    @Generated public static final double KAUTH_GUID_SIZE = 16.0;
    @Generated public static final double KAUTH_NTSID_MAX_AUTHORITIES = 16.0;
    @Generated public static final double KAUTH_EXTLOOKUP_SUCCESS = 0.0;
    @Generated public static final double KAUTH_EXTLOOKUP_BADRQ = 1.0;
    @Generated public static final double KAUTH_EXTLOOKUP_FAILURE = 2.0;
    @Generated public static final double KAUTH_EXTLOOKUP_FATAL = 3.0;
    @Generated public static final double KAUTH_EXTLOOKUP_INPROG = 100.0;
    @Generated public static final double KAUTH_ACE_KINDMASK = 15.0;
    @Generated public static final double KAUTH_ACE_PERMIT = 1.0;
    @Generated public static final double KAUTH_ACE_DENY = 2.0;
    @Generated public static final double KAUTH_ACE_AUDIT = 3.0;
    @Generated public static final double KAUTH_ACE_ALARM = 4.0;
    @Generated public static final double KAUTH_ACL_MAX_ENTRIES = 128.0;
    @Generated public static final double KAUTH_FILESEC_MAGIC = 1.9710317E7;
    @Generated public static final double KAUTH_ENDIAN_HOST = 1.0;
    @Generated public static final double KAUTH_ENDIAN_DISK = 2.0;
    @Generated public static final double __DARWIN_ACL_EXTENDED_ALLOW = 1.0;
    @Generated public static final double __DARWIN_ACL_EXTENDED_DENY = 2.0;
    @Generated public static final double ACL_MAX_ENTRIES = 128.0;
    @Generated public static final double BSD = 199506.0;
    @Generated public static final double BSD4_3 = 1.0;
    @Generated public static final double BSD4_4 = 1.0;
    @Generated public static final double NeXTBSD = 1995064.0;
    @Generated public static final double NeXTBSD4_0 = 0.0;
    @Generated public static final double MAXCOMLEN = 16.0;
    @Generated public static final double MAXINTERP = 64.0;
    @Generated public static final double MAXLOGNAME = 255.0;
    @Generated public static final double NOFILE = 256.0;
    @Generated public static final double NOGROUP = 65535.0;
    @Generated public static final double MAXHOSTNAMELEN = 256.0;
    @Generated public static final double MAXDOMNAMELEN = 256.0;
    @Generated public static final double NBPG = 4096.0;
    @Generated public static final double PGSHIFT = 12.0;
    @Generated public static final double DEV_BSIZE = 512.0;
    @Generated public static final double DEV_BSHIFT = 9.0;
    @Generated public static final double BLKDEV_IOSIZE = 2048.0;
    @Generated public static final double CLSIZE = 1.0;
    @Generated public static final double CLSIZELOG2 = 0.0;
    @Generated public static final double MSIZESHIFT = 8.0;
    @Generated public static final double MCLSHIFT = 11.0;
    @Generated public static final double MBIGCLSHIFT = 12.0;
    @Generated public static final double M16KCLSHIFT = 14.0;
    @Generated public static final double PSWP = 0.0;
    @Generated public static final double PVM = 4.0;
    @Generated public static final double PINOD = 8.0;
    @Generated public static final double PRIBIO = 16.0;
    @Generated public static final double PVFS = 20.0;
    @Generated public static final double PZERO = 22.0;
    @Generated public static final double PSOCK = 24.0;
    @Generated public static final double PWAIT = 32.0;
    @Generated public static final double PLOCK = 36.0;
    @Generated public static final double PPAUSE = 40.0;
    @Generated public static final double PUSER = 50.0;
    @Generated public static final double MAXPRI = 127.0;
    @Generated public static final double PRIMASK = 255.0;
    @Generated public static final double PCATCH = 256.0;
    @Generated public static final double PTTYBLOCK = 512.0;
    @Generated public static final double PDROP = 1024.0;
    @Generated public static final double PSPIN = 2048.0;
    @Generated public static final double CMASK = 22.0;
    @Generated public static final double CBLOCK = 64.0;
    @Generated public static final double MAXFRAG = 8.0;
    @Generated public static final double MAXSYMLINKS = 32.0;
    @Generated public static final double FSHIFT = 11.0;
    @Generated public static final double MAX_AUDIT_RECORDS = 20.0;
    @Generated public static final double AUDIT_HARD_LIMIT_FREE_BLOCKS = 4.0;
    @Generated public static final double AUDIT_TRIGGER_MIN = 1.0;
    @Generated public static final double AUDIT_TRIGGER_LOW_SPACE = 1.0;
    @Generated public static final double AUDIT_TRIGGER_ROTATE_KERNEL = 2.0;
    @Generated public static final double AUDIT_TRIGGER_READ_FILE = 3.0;
    @Generated public static final double AUDIT_TRIGGER_CLOSE_AND_DIE = 4.0;
    @Generated public static final double AUDIT_TRIGGER_NO_SPACE = 5.0;
    @Generated public static final double AUDIT_TRIGGER_ROTATE_USER = 6.0;
    @Generated public static final double AUDIT_TRIGGER_INITIALIZE = 7.0;
    @Generated public static final double AUDIT_TRIGGER_EXPIRE_TRAILS = 8.0;
    @Generated public static final double AUDIT_TRIGGER_MAX = 8.0;
    @Generated public static final double AU_DEFAUDITSID = 0.0;
    @Generated public static final double AU_ASSIGN_ASID = -1.0;
    @Generated public static final double AUC_UNSET = 0.0;
    @Generated public static final double AUC_AUDITING = 1.0;
    @Generated public static final double AUC_NOAUDIT = 2.0;
    @Generated public static final double AUC_DISABLED = -1.0;
    @Generated public static final double A_OLDGETPOLICY = 2.0;
    @Generated public static final double A_OLDSETPOLICY = 3.0;
    @Generated public static final double A_GETKMASK = 4.0;
    @Generated public static final double A_SETKMASK = 5.0;
    @Generated public static final double A_OLDGETQCTRL = 6.0;
    @Generated public static final double A_OLDSETQCTRL = 7.0;
    @Generated public static final double A_GETCWD = 8.0;
    @Generated public static final double A_GETCAR = 9.0;
    @Generated public static final double A_GETSTAT = 12.0;
    @Generated public static final double A_SETSTAT = 13.0;
    @Generated public static final double A_SETUMASK = 14.0;
    @Generated public static final double A_SETSMASK = 15.0;
    @Generated public static final double A_OLDGETCOND = 20.0;
    @Generated public static final double A_OLDSETCOND = 21.0;
    @Generated public static final double A_GETCLASS = 22.0;
    @Generated public static final double A_SETCLASS = 23.0;
    @Generated public static final double A_GETPINFO = 24.0;
    @Generated public static final double A_SETPMASK = 25.0;
    @Generated public static final double A_SETFSIZE = 26.0;
    @Generated public static final double A_GETFSIZE = 27.0;
    @Generated public static final double A_GETPINFO_ADDR = 28.0;
    @Generated public static final double A_GETKAUDIT = 29.0;
    @Generated public static final double A_SETKAUDIT = 30.0;
    @Generated public static final double A_SENDTRIGGER = 31.0;
    @Generated public static final double A_GETSINFO_ADDR = 32.0;
    @Generated public static final double A_GETPOLICY = 33.0;
    @Generated public static final double A_SETPOLICY = 34.0;
    @Generated public static final double A_GETQCTRL = 35.0;
    @Generated public static final double A_SETQCTRL = 36.0;
    @Generated public static final double A_GETCOND = 37.0;
    @Generated public static final double A_SETCOND = 38.0;
    @Generated public static final double A_GETSFLAGS = 39.0;
    @Generated public static final double A_SETSFLAGS = 40.0;
    @Generated public static final double A_GETCTLMODE = 41.0;
    @Generated public static final double A_SETCTLMODE = 42.0;
    @Generated public static final double A_GETEXPAFTER = 43.0;
    @Generated public static final double A_SETEXPAFTER = 44.0;
    @Generated public static final double AUDIT_CNT = 1.0;
    @Generated public static final double AUDIT_AHLT = 2.0;
    @Generated public static final double AUDIT_ARGV = 4.0;
    @Generated public static final double AUDIT_ARGE = 8.0;
    @Generated public static final double AUDIT_SEQ = 16.0;
    @Generated public static final double AUDIT_WINDATA = 32.0;
    @Generated public static final double AUDIT_USER = 64.0;
    @Generated public static final double AUDIT_GROUP = 128.0;
    @Generated public static final double AUDIT_TRAIL = 256.0;
    @Generated public static final double AUDIT_PATH = 512.0;
    @Generated public static final double AUDIT_SCNT = 1024.0;
    @Generated public static final double AUDIT_PUBLIC = 2048.0;
    @Generated public static final double AUDIT_ZONENAME = 4096.0;
    @Generated public static final double AUDIT_PERZONE = 8192.0;
    @Generated public static final double AQ_HIWATER = 100.0;
    @Generated public static final double AQ_MAXHIGH = 10000.0;
    @Generated public static final double AQ_LOWATER = 10.0;
    @Generated public static final double AQ_MAXBUFSZ = 1048576.0;
    @Generated public static final double AU_FS_MINFREE = 20.0;
    @Generated public static final double AU_IPv4 = 4.0;
    @Generated public static final double AU_IPv6 = 16.0;
    @Generated public static final double AU_CLASS_MASK_RESERVED = 2.68435456E8;
    @Generated public static final double SIMD_COMPILER_HAS_REQUIRED_FEATURES = 1.0;
    @Generated public static final double SIMD_LIBRARY_VERSION = 6.0;
    @Generated public static final double KEV_INET_SUBCLASS = 1.0;
    @Generated public static final double KEV_INET_NEW_ADDR = 1.0;
    @Generated public static final double KEV_INET_CHANGED_ADDR = 2.0;
    @Generated public static final double KEV_INET_ADDR_DELETED = 3.0;
    @Generated public static final double KEV_INET_SIFDSTADDR = 4.0;
    @Generated public static final double KEV_INET_SIFBRDADDR = 5.0;
    @Generated public static final double KEV_INET_SIFNETMASK = 6.0;
    @Generated public static final double KEV_INET_ARPCOLLISION = 7.0;
    @Generated public static final double KEV_INET_PORTINUSE = 8.0;
    @Generated public static final double KEV_INET_ARPRTRFAILURE = 9.0;
    @Generated public static final double KEV_INET_ARPRTRALIVE = 10.0;
    @Generated public static final double KEV_DL_SUBCLASS = 2.0;
    @Generated public static final double KEV_DL_SIFFLAGS = 1.0;
    @Generated public static final double KEV_DL_SIFMETRICS = 2.0;
    @Generated public static final double KEV_DL_SIFMTU = 3.0;
    @Generated public static final double KEV_DL_SIFPHYS = 4.0;
    @Generated public static final double KEV_DL_SIFMEDIA = 5.0;
    @Generated public static final double KEV_DL_SIFGENERIC = 6.0;
    @Generated public static final double KEV_DL_ADDMULTI = 7.0;
    @Generated public static final double KEV_DL_DELMULTI = 8.0;
    @Generated public static final double KEV_DL_IF_ATTACHED = 9.0;
    @Generated public static final double KEV_DL_IF_DETACHING = 10.0;
    @Generated public static final double KEV_DL_IF_DETACHED = 11.0;
    @Generated public static final double KEV_DL_LINK_OFF = 12.0;
    @Generated public static final double KEV_DL_LINK_ON = 13.0;
    @Generated public static final double KEV_DL_PROTO_ATTACHED = 14.0;
    @Generated public static final double KEV_DL_PROTO_DETACHED = 15.0;
    @Generated public static final double KEV_DL_LINK_ADDRESS_CHANGED = 16.0;
    @Generated public static final double KEV_DL_WAKEFLAGS_CHANGED = 17.0;
    @Generated public static final double KEV_DL_IF_IDLE_ROUTE_REFCNT = 18.0;
    @Generated public static final double KEV_DL_IFCAP_CHANGED = 19.0;
    @Generated public static final double KEV_DL_LINK_QUALITY_METRIC_CHANGED = 20.0;
    @Generated public static final double KEV_DL_NODE_PRESENCE = 21.0;
    @Generated public static final double KEV_DL_NODE_ABSENCE = 22.0;
    @Generated public static final double KEV_DL_PRIMARY_ELECTED = 23.0;
    @Generated public static final double KEV_DL_ISSUES = 24.0;
    @Generated public static final double KEV_DL_IFDELEGATE_CHANGED = 25.0;
    @Generated public static final double KEV_DL_AWDL_RESTRICTED = 26.0;
    @Generated public static final double KEV_DL_AWDL_UNRESTRICTED = 27.0;
    @Generated public static final double KEV_DL_RRC_STATE_CHANGED = 28.0;
    @Generated public static final double KEV_DL_QOS_MODE_CHANGED = 29.0;
    @Generated public static final double KEV_DL_LOW_POWER_MODE_CHANGED = 30.0;
    @Generated public static final double KEV_INET6_SUBCLASS = 6.0;
    @Generated public static final double KEV_INET6_NEW_USER_ADDR = 1.0;
    @Generated public static final double KEV_INET6_CHANGED_ADDR = 2.0;
    @Generated public static final double KEV_INET6_ADDR_DELETED = 3.0;
    @Generated public static final double KEV_INET6_NEW_LL_ADDR = 4.0;
    @Generated public static final double KEV_INET6_NEW_RTADV_ADDR = 5.0;
    @Generated public static final double KEV_INET6_DEFROUTER = 6.0;
    @Generated public static final double KEV_INET6_REQUEST_NAT64_PREFIX = 7.0;
    @Generated public static final double SOCK_STREAM = 1.0;
    @Generated public static final double SOCK_DGRAM = 2.0;
    @Generated public static final double SOCK_RAW = 3.0;
    @Generated public static final double SOCK_RDM = 4.0;
    @Generated public static final double SOCK_SEQPACKET = 5.0;
    @Generated public static final double SO_DEBUG = 1.0;
    @Generated public static final double SO_ACCEPTCONN = 2.0;
    @Generated public static final double SO_REUSEADDR = 4.0;
    @Generated public static final double SO_KEEPALIVE = 8.0;
    @Generated public static final double SO_DONTROUTE = 16.0;
    @Generated public static final double SO_BROADCAST = 32.0;
    @Generated public static final double SO_USELOOPBACK = 64.0;
    @Generated public static final double SO_LINGER = 128.0;
    @Generated public static final double SO_LINGER_SEC = 4224.0;
    @Generated public static final double SO_OOBINLINE = 256.0;
    @Generated public static final double SO_REUSEPORT = 512.0;
    @Generated public static final double SO_TIMESTAMP = 1024.0;
    @Generated public static final double SO_TIMESTAMP_MONOTONIC = 2048.0;
    @Generated public static final double SO_DONTTRUNC = 8192.0;
    @Generated public static final double SO_WANTMORE = 16384.0;
    @Generated public static final double SO_WANTOOBFLAG = 32768.0;
    @Generated public static final double SO_SNDBUF = 4097.0;
    @Generated public static final double SO_RCVBUF = 4098.0;
    @Generated public static final double SO_SNDLOWAT = 4099.0;
    @Generated public static final double SO_RCVLOWAT = 4100.0;
    @Generated public static final double SO_SNDTIMEO = 4101.0;
    @Generated public static final double SO_RCVTIMEO = 4102.0;
    @Generated public static final double SO_ERROR = 4103.0;
    @Generated public static final double SO_TYPE = 4104.0;
    @Generated public static final double SO_LABEL = 4112.0;
    @Generated public static final double SO_PEERLABEL = 4113.0;
    @Generated public static final double SO_NREAD = 4128.0;
    @Generated public static final double SO_NKE = 4129.0;
    @Generated public static final double SO_NOSIGPIPE = 4130.0;
    @Generated public static final double SO_NOADDRERR = 4131.0;
    @Generated public static final double SO_NWRITE = 4132.0;
    @Generated public static final double SO_REUSESHAREUID = 4133.0;
    @Generated public static final double SO_NOTIFYCONFLICT = 4134.0;
    @Generated public static final double SO_UPCALLCLOSEWAIT = 4135.0;
    @Generated public static final double SO_RANDOMPORT = 4226.0;
    @Generated public static final double SO_NP_EXTENSIONS = 4227.0;
    @Generated public static final double SO_NUMRCVPKT = 4370.0;
    @Generated public static final double SO_NET_SERVICE_TYPE = 4374.0;
    @Generated public static final double SO_NETSVC_MARKING_LEVEL = 4377.0;
    @Generated public static final double SO_RESOLVER_SIGNATURE = 4401.0;
    @Generated public static final double NET_SERVICE_TYPE_BE = 0.0;
    @Generated public static final double NET_SERVICE_TYPE_BK = 1.0;
    @Generated public static final double NET_SERVICE_TYPE_SIG = 2.0;
    @Generated public static final double NET_SERVICE_TYPE_VI = 3.0;
    @Generated public static final double NET_SERVICE_TYPE_VO = 4.0;
    @Generated public static final double NET_SERVICE_TYPE_RV = 5.0;
    @Generated public static final double NET_SERVICE_TYPE_AV = 6.0;
    @Generated public static final double NET_SERVICE_TYPE_OAM = 7.0;
    @Generated public static final double NET_SERVICE_TYPE_RD = 8.0;
    @Generated public static final double NETSVC_MRKNG_UNKNOWN = 0.0;
    @Generated public static final double NETSVC_MRKNG_LVL_L2 = 1.0;
    @Generated public static final double NETSVC_MRKNG_LVL_L3L2_ALL = 2.0;
    @Generated public static final double NETSVC_MRKNG_LVL_L3L2_BK = 3.0;
    @Generated public static final double SAE_ASSOCID_ANY = 0.0;
    @Generated public static final double SAE_CONNID_ANY = 0.0;
    @Generated public static final double CONNECT_RESUME_ON_READ_WRITE = 1.0;
    @Generated public static final double CONNECT_DATA_IDEMPOTENT = 2.0;
    @Generated public static final double CONNECT_DATA_AUTHENTICATED = 4.0;
    @Generated public static final double SONPX_SETOPTSHUT = 1.0;
    @Generated public static final double SOL_SOCKET = 65535.0;
    @Generated public static final double AF_UNSPEC = 0.0;
    @Generated public static final double AF_UNIX = 1.0;
    @Generated public static final double AF_INET = 2.0;
    @Generated public static final double AF_IMPLINK = 3.0;
    @Generated public static final double AF_PUP = 4.0;
    @Generated public static final double AF_CHAOS = 5.0;
    @Generated public static final double AF_NS = 6.0;
    @Generated public static final double AF_ISO = 7.0;
    @Generated public static final double AF_ECMA = 8.0;
    @Generated public static final double AF_DATAKIT = 9.0;
    @Generated public static final double AF_CCITT = 10.0;
    @Generated public static final double AF_SNA = 11.0;
    @Generated public static final double AF_DECnet = 12.0;
    @Generated public static final double AF_DLI = 13.0;
    @Generated public static final double AF_LAT = 14.0;
    @Generated public static final double AF_HYLINK = 15.0;
    @Generated public static final double AF_APPLETALK = 16.0;
    @Generated public static final double AF_ROUTE = 17.0;
    @Generated public static final double AF_LINK = 18.0;
    @Generated public static final double pseudo_AF_XTP = 19.0;
    @Generated public static final double AF_COIP = 20.0;
    @Generated public static final double AF_CNT = 21.0;
    @Generated public static final double pseudo_AF_RTIP = 22.0;
    @Generated public static final double AF_IPX = 23.0;
    @Generated public static final double AF_SIP = 24.0;
    @Generated public static final double pseudo_AF_PIP = 25.0;
    @Generated public static final double AF_NDRV = 27.0;
    @Generated public static final double AF_ISDN = 28.0;
    @Generated public static final double pseudo_AF_KEY = 29.0;
    @Generated public static final double AF_INET6 = 30.0;
    @Generated public static final double AF_NATM = 31.0;
    @Generated public static final double AF_SYSTEM = 32.0;
    @Generated public static final double AF_NETBIOS = 33.0;
    @Generated public static final double AF_PPP = 34.0;
    @Generated public static final double pseudo_AF_HDRCMPLT = 35.0;
    @Generated public static final double AF_RESERVED_36 = 36.0;
    @Generated public static final double AF_IEEE80211 = 37.0;
    @Generated public static final double AF_UTUN = 38.0;
    @Generated public static final double AF_VSOCK = 40.0;
    @Generated public static final double AF_MAX = 41.0;
    @Generated public static final double SOCK_MAXADDRLEN = 255.0;
    @Generated public static final double _SS_MAXSIZE = 128.0;
    @Generated public static final double NET_RT_DUMP = 1.0;
    @Generated public static final double NET_RT_FLAGS = 2.0;
    @Generated public static final double NET_RT_IFLIST = 3.0;
    @Generated public static final double NET_RT_STAT = 4.0;
    @Generated public static final double NET_RT_TRASH = 5.0;
    @Generated public static final double NET_RT_IFLIST2 = 6.0;
    @Generated public static final double NET_RT_DUMP2 = 7.0;
    @Generated public static final double NET_RT_FLAGS_PRIV = 10.0;
    @Generated public static final double NET_RT_MAXID = 11.0;
    @Generated public static final double SOMAXCONN = 128.0;
    @Generated public static final double MSG_OOB = 1.0;
    @Generated public static final double MSG_PEEK = 2.0;
    @Generated public static final double MSG_DONTROUTE = 4.0;
    @Generated public static final double MSG_EOR = 8.0;
    @Generated public static final double MSG_TRUNC = 16.0;
    @Generated public static final double MSG_CTRUNC = 32.0;
    @Generated public static final double MSG_WAITALL = 64.0;
    @Generated public static final double MSG_DONTWAIT = 128.0;
    @Generated public static final double MSG_EOF = 256.0;
    @Generated public static final double MSG_WAITSTREAM = 512.0;
    @Generated public static final double MSG_FLUSH = 1024.0;
    @Generated public static final double MSG_HOLD = 2048.0;
    @Generated public static final double MSG_SEND = 4096.0;
    @Generated public static final double MSG_HAVEMORE = 8192.0;
    @Generated public static final double MSG_RCVMORE = 16384.0;
    @Generated public static final double MSG_NEEDSA = 65536.0;
    @Generated public static final double MSG_NOSIGNAL = 524288.0;
    @Generated public static final double SCM_RIGHTS = 1.0;
    @Generated public static final double SCM_TIMESTAMP = 2.0;
    @Generated public static final double SCM_CREDS = 3.0;
    @Generated public static final double SCM_TIMESTAMP_MONOTONIC = 4.0;
    @Generated public static final double SHUT_RD = 0.0;
    @Generated public static final double SHUT_WR = 1.0;
    @Generated public static final double SHUT_RDWR = 2.0;
    @Generated public static final double _DNS_SD_H = 2.559060039E9;
    @Generated public static final double DNS_SD_ORIGINAL_ENCODING_VERSION_NUMBER_MAX = 1.661E7;
    @Generated public static final double _DNS_SD_LIBDISPATCH = 1.0;
    @Generated public static final double kDNSServiceMaxServiceName = 64.0;
    @Generated public static final double kDNSServiceMaxDomainName = 1009.0;
    @Generated public static final double kDNSServiceInterfaceIndexAny = 0.0;
    @Generated public static final double THREAD_STATE_MAX = 1296.0;
    @Generated public static final double ARM_THREAD_STATE = 1.0;
    @Generated public static final double ARM_VFP_STATE = 2.0;
    @Generated public static final double ARM_EXCEPTION_STATE = 3.0;
    @Generated public static final double ARM_DEBUG_STATE = 4.0;
    @Generated public static final double THREAD_STATE_NONE = 5.0;
    @Generated public static final double ARM_THREAD_STATE64 = 6.0;
    @Generated public static final double ARM_EXCEPTION_STATE64 = 7.0;
    @Generated public static final double ARM_THREAD_STATE32 = 9.0;
    @Generated public static final double ARM_DEBUG_STATE32 = 14.0;
    @Generated public static final double ARM_DEBUG_STATE64 = 15.0;
    @Generated public static final double ARM_NEON_STATE = 16.0;
    @Generated public static final double ARM_NEON_STATE64 = 17.0;
    @Generated public static final double ARM_CPMU_STATE64 = 18.0;
    @Generated public static final double ARM_PAGEIN_STATE = 27.0;
    @Generated public static final double MH_OBJECT = 1.0;
    @Generated public static final double MH_EXECUTE = 2.0;
    @Generated public static final double MH_FVMLIB = 3.0;
    @Generated public static final double MH_CORE = 4.0;
    @Generated public static final double MH_PRELOAD = 5.0;
    @Generated public static final double MH_DYLIB = 6.0;
    @Generated public static final double MH_DYLINKER = 7.0;
    @Generated public static final double MH_BUNDLE = 8.0;
    @Generated public static final double MH_DYLIB_STUB = 9.0;
    @Generated public static final double MH_DSYM = 10.0;
    @Generated public static final double MH_KEXT_BUNDLE = 11.0;
    @Generated public static final double MH_FILESET = 12.0;
    @Generated public static final double MH_GPU_EXECUTE = 13.0;
    @Generated public static final double MH_GPU_DYLIB = 14.0;
    @Generated public static final double MH_NOUNDEFS = 1.0;
    @Generated public static final double MH_INCRLINK = 2.0;
    @Generated public static final double MH_DYLDLINK = 4.0;
    @Generated public static final double MH_BINDATLOAD = 8.0;
    @Generated public static final double MH_PREBOUND = 16.0;
    @Generated public static final double MH_SPLIT_SEGS = 32.0;
    @Generated public static final double MH_LAZY_INIT = 64.0;
    @Generated public static final double MH_TWOLEVEL = 128.0;
    @Generated public static final double MH_FORCE_FLAT = 256.0;
    @Generated public static final double MH_NOMULTIDEFS = 512.0;
    @Generated public static final double MH_NOFIXPREBINDING = 1024.0;
    @Generated public static final double MH_PREBINDABLE = 2048.0;
    @Generated public static final double MH_ALLMODSBOUND = 4096.0;
    @Generated public static final double MH_SUBSECTIONS_VIA_SYMBOLS = 8192.0;
    @Generated public static final double MH_CANONICAL = 16384.0;
    @Generated public static final double MH_WEAK_DEFINES = 32768.0;
    @Generated public static final double MH_BINDS_TO_WEAK = 65536.0;
    @Generated public static final double MH_ALLOW_STACK_EXECUTION = 131072.0;
    @Generated public static final double MH_ROOT_SAFE = 262144.0;
    @Generated public static final double MH_SETUID_SAFE = 524288.0;
    @Generated public static final double MH_NO_REEXPORTED_DYLIBS = 1048576.0;
    @Generated public static final double MH_PIE = 2097152.0;
    @Generated public static final double MH_DEAD_STRIPPABLE_DYLIB = 4194304.0;
    @Generated public static final double MH_HAS_TLV_DESCRIPTORS = 8388608.0;
    @Generated public static final double MH_NO_HEAP_EXECUTION = 1.6777216E7;
    @Generated public static final double MH_APP_EXTENSION_SAFE = 3.3554432E7;
    @Generated public static final double MH_NLIST_OUTOFSYNC_WITH_DYLDINFO = 6.7108864E7;
    @Generated public static final double MH_SIM_SUPPORT = 1.34217728E8;
    @Generated public static final double LC_SEGMENT = 1.0;
    @Generated public static final double LC_SYMTAB = 2.0;
    @Generated public static final double LC_SYMSEG = 3.0;
    @Generated public static final double LC_THREAD = 4.0;
    @Generated public static final double LC_UNIXTHREAD = 5.0;
    @Generated public static final double LC_LOADFVMLIB = 6.0;
    @Generated public static final double LC_IDFVMLIB = 7.0;
    @Generated public static final double LC_IDENT = 8.0;
    @Generated public static final double LC_FVMFILE = 9.0;
    @Generated public static final double LC_PREPAGE = 10.0;
    @Generated public static final double LC_DYSYMTAB = 11.0;
    @Generated public static final double LC_LOAD_DYLIB = 12.0;
    @Generated public static final double LC_ID_DYLIB = 13.0;
    @Generated public static final double LC_LOAD_DYLINKER = 14.0;
    @Generated public static final double LC_ID_DYLINKER = 15.0;
    @Generated public static final double LC_PREBOUND_DYLIB = 16.0;
    @Generated public static final double LC_ROUTINES = 17.0;
    @Generated public static final double LC_SUB_FRAMEWORK = 18.0;
    @Generated public static final double LC_SUB_UMBRELLA = 19.0;
    @Generated public static final double LC_SUB_CLIENT = 20.0;
    @Generated public static final double LC_SUB_LIBRARY = 21.0;
    @Generated public static final double LC_TWOLEVEL_HINTS = 22.0;
    @Generated public static final double LC_PREBIND_CKSUM = 23.0;
    @Generated public static final double LC_SEGMENT_64 = 25.0;
    @Generated public static final double LC_ROUTINES_64 = 26.0;
    @Generated public static final double LC_UUID = 27.0;
    @Generated public static final double LC_CODE_SIGNATURE = 29.0;
    @Generated public static final double LC_SEGMENT_SPLIT_INFO = 30.0;
    @Generated public static final double LC_LAZY_LOAD_DYLIB = 32.0;
    @Generated public static final double LC_ENCRYPTION_INFO = 33.0;
    @Generated public static final double LC_DYLD_INFO = 34.0;
    @Generated public static final double LC_VERSION_MIN_MACOSX = 36.0;
    @Generated public static final double LC_VERSION_MIN_IPHONEOS = 37.0;
    @Generated public static final double LC_FUNCTION_STARTS = 38.0;
    @Generated public static final double LC_DYLD_ENVIRONMENT = 39.0;
    @Generated public static final double LC_DATA_IN_CODE = 41.0;
    @Generated public static final double LC_SOURCE_VERSION = 42.0;
    @Generated public static final double LC_DYLIB_CODE_SIGN_DRS = 43.0;
    @Generated public static final double LC_ENCRYPTION_INFO_64 = 44.0;
    @Generated public static final double LC_LINKER_OPTION = 45.0;
    @Generated public static final double LC_LINKER_OPTIMIZATION_HINT = 46.0;
    @Generated public static final double LC_VERSION_MIN_TVOS = 47.0;
    @Generated public static final double LC_VERSION_MIN_WATCHOS = 48.0;
    @Generated public static final double LC_NOTE = 49.0;
    @Generated public static final double LC_BUILD_VERSION = 50.0;
    @Generated public static final double SG_HIGHVM = 1.0;
    @Generated public static final double SG_FVMLIB = 2.0;
    @Generated public static final double SG_NORELOC = 4.0;
    @Generated public static final double SG_PROTECTED_VERSION_1 = 8.0;
    @Generated public static final double SG_READ_ONLY = 16.0;
    @Generated public static final double SECTION_TYPE = 255.0;
    @Generated public static final double S_REGULAR = 0.0;
    @Generated public static final double S_ZEROFILL = 1.0;
    @Generated public static final double S_CSTRING_LITERALS = 2.0;
    @Generated public static final double S_4BYTE_LITERALS = 3.0;
    @Generated public static final double S_8BYTE_LITERALS = 4.0;
    @Generated public static final double S_LITERAL_POINTERS = 5.0;
    @Generated public static final double S_NON_LAZY_SYMBOL_POINTERS = 6.0;
    @Generated public static final double S_LAZY_SYMBOL_POINTERS = 7.0;
    @Generated public static final double S_SYMBOL_STUBS = 8.0;
    @Generated public static final double S_MOD_INIT_FUNC_POINTERS = 9.0;
    @Generated public static final double S_MOD_TERM_FUNC_POINTERS = 10.0;
    @Generated public static final double S_COALESCED = 11.0;
    @Generated public static final double S_GB_ZEROFILL = 12.0;
    @Generated public static final double S_INTERPOSING = 13.0;
    @Generated public static final double S_16BYTE_LITERALS = 14.0;
    @Generated public static final double S_DTRACE_DOF = 15.0;
    @Generated public static final double S_LAZY_DYLIB_SYMBOL_POINTERS = 16.0;
    @Generated public static final double S_THREAD_LOCAL_REGULAR = 17.0;
    @Generated public static final double S_THREAD_LOCAL_ZEROFILL = 18.0;
    @Generated public static final double S_THREAD_LOCAL_VARIABLES = 19.0;
    @Generated public static final double S_THREAD_LOCAL_VARIABLE_POINTERS = 20.0;
    @Generated public static final double S_THREAD_LOCAL_INIT_FUNCTION_POINTERS = 21.0;
    @Generated public static final double S_INIT_FUNC_OFFSETS = 22.0;
    @Generated public static final double S_ATTR_NO_TOC = 1.073741824E9;
    @Generated public static final double S_ATTR_STRIP_STATIC_SYMS = 5.36870912E8;
    @Generated public static final double S_ATTR_NO_DEAD_STRIP = 2.68435456E8;
    @Generated public static final double S_ATTR_LIVE_SUPPORT = 1.34217728E8;
    @Generated public static final double S_ATTR_SELF_MODIFYING_CODE = 6.7108864E7;
    @Generated public static final double S_ATTR_DEBUG = 3.3554432E7;
    @Generated public static final double SECTION_ATTRIBUTES_SYS = 1.677696E7;
    @Generated public static final double S_ATTR_SOME_INSTRUCTIONS = 1024.0;
    @Generated public static final double S_ATTR_EXT_RELOC = 512.0;
    @Generated public static final double S_ATTR_LOC_RELOC = 256.0;
    @Generated public static final double INDIRECT_SYMBOL_ABS = 1.073741824E9;
    @Generated public static final double PLATFORM_UNKNOWN = 0.0;
    @Generated public static final double PLATFORM_MACOS = 1.0;
    @Generated public static final double PLATFORM_IOS = 2.0;
    @Generated public static final double PLATFORM_TVOS = 3.0;
    @Generated public static final double PLATFORM_WATCHOS = 4.0;
    @Generated public static final double PLATFORM_BRIDGEOS = 5.0;
    @Generated public static final double PLATFORM_MACCATALYST = 6.0;
    @Generated public static final double PLATFORM_IOSSIMULATOR = 7.0;
    @Generated public static final double PLATFORM_TVOSSIMULATOR = 8.0;
    @Generated public static final double PLATFORM_WATCHOSSIMULATOR = 9.0;
    @Generated public static final double PLATFORM_DRIVERKIT = 10.0;
    @Generated public static final double PLATFORM_FIRMWARE = 13.0;
    @Generated public static final double PLATFORM_SEPOS = 14.0;
    @Generated public static final double TOOL_CLANG = 1.0;
    @Generated public static final double TOOL_SWIFT = 2.0;
    @Generated public static final double TOOL_LD = 3.0;
    @Generated public static final double TOOL_LLD = 4.0;
    @Generated public static final double TOOL_METAL = 1024.0;
    @Generated public static final double TOOL_AIRLLD = 1025.0;
    @Generated public static final double TOOL_AIRNT = 1026.0;
    @Generated public static final double TOOL_AIRNT_PLUGIN = 1027.0;
    @Generated public static final double TOOL_AIRPACK = 1028.0;
    @Generated public static final double TOOL_GPUARCHIVER = 1031.0;
    @Generated public static final double TOOL_METAL_FRAMEWORK = 1032.0;
    @Generated public static final double REBASE_TYPE_POINTER = 1.0;
    @Generated public static final double REBASE_TYPE_TEXT_ABSOLUTE32 = 2.0;
    @Generated public static final double REBASE_TYPE_TEXT_PCREL32 = 3.0;
    @Generated public static final double REBASE_OPCODE_MASK = 240.0;
    @Generated public static final double REBASE_IMMEDIATE_MASK = 15.0;
    @Generated public static final double REBASE_OPCODE_DONE = 0.0;
    @Generated public static final double REBASE_OPCODE_SET_TYPE_IMM = 16.0;
    @Generated public static final double REBASE_OPCODE_SET_SEGMENT_AND_OFFSET_ULEB = 32.0;
    @Generated public static final double REBASE_OPCODE_ADD_ADDR_ULEB = 48.0;
    @Generated public static final double REBASE_OPCODE_ADD_ADDR_IMM_SCALED = 64.0;
    @Generated public static final double REBASE_OPCODE_DO_REBASE_IMM_TIMES = 80.0;
    @Generated public static final double REBASE_OPCODE_DO_REBASE_ULEB_TIMES = 96.0;
    @Generated public static final double REBASE_OPCODE_DO_REBASE_ADD_ADDR_ULEB = 112.0;
    @Generated public static final double REBASE_OPCODE_DO_REBASE_ULEB_TIMES_SKIPPING_ULEB = 128.0;
    @Generated public static final double BIND_TYPE_POINTER = 1.0;
    @Generated public static final double BIND_TYPE_TEXT_ABSOLUTE32 = 2.0;
    @Generated public static final double BIND_TYPE_TEXT_PCREL32 = 3.0;
    @Generated public static final double BIND_SPECIAL_DYLIB_SELF = 0.0;
    @Generated public static final double BIND_SPECIAL_DYLIB_MAIN_EXECUTABLE = -1.0;
    @Generated public static final double BIND_SPECIAL_DYLIB_FLAT_LOOKUP = -2.0;
    @Generated public static final double BIND_SPECIAL_DYLIB_WEAK_LOOKUP = -3.0;
    @Generated public static final double BIND_SYMBOL_FLAGS_WEAK_IMPORT = 1.0;
    @Generated public static final double BIND_SYMBOL_FLAGS_NON_WEAK_DEFINITION = 8.0;
    @Generated public static final double BIND_OPCODE_MASK = 240.0;
    @Generated public static final double BIND_IMMEDIATE_MASK = 15.0;
    @Generated public static final double BIND_OPCODE_DONE = 0.0;
    @Generated public static final double BIND_OPCODE_SET_DYLIB_ORDINAL_IMM = 16.0;
    @Generated public static final double BIND_OPCODE_SET_DYLIB_ORDINAL_ULEB = 32.0;
    @Generated public static final double BIND_OPCODE_SET_DYLIB_SPECIAL_IMM = 48.0;
    @Generated public static final double BIND_OPCODE_SET_SYMBOL_TRAILING_FLAGS_IMM = 64.0;
    @Generated public static final double BIND_OPCODE_SET_TYPE_IMM = 80.0;
    @Generated public static final double BIND_OPCODE_SET_ADDEND_SLEB = 96.0;
    @Generated public static final double BIND_OPCODE_SET_SEGMENT_AND_OFFSET_ULEB = 112.0;
    @Generated public static final double BIND_OPCODE_ADD_ADDR_ULEB = 128.0;
    @Generated public static final double BIND_OPCODE_DO_BIND = 144.0;
    @Generated public static final double BIND_OPCODE_DO_BIND_ADD_ADDR_ULEB = 160.0;
    @Generated public static final double BIND_OPCODE_DO_BIND_ADD_ADDR_IMM_SCALED = 176.0;
    @Generated public static final double BIND_OPCODE_DO_BIND_ULEB_TIMES_SKIPPING_ULEB = 192.0;
    @Generated public static final double BIND_OPCODE_THREADED = 208.0;
    @Generated public static final double BIND_SUBOPCODE_THREADED_SET_BIND_ORDINAL_TABLE_SIZE_ULEB = 0.0;
    @Generated public static final double BIND_SUBOPCODE_THREADED_APPLY = 1.0;
    @Generated public static final double EXPORT_SYMBOL_FLAGS_KIND_MASK = 3.0;
    @Generated public static final double EXPORT_SYMBOL_FLAGS_KIND_REGULAR = 0.0;
    @Generated public static final double EXPORT_SYMBOL_FLAGS_KIND_THREAD_LOCAL = 1.0;
    @Generated public static final double EXPORT_SYMBOL_FLAGS_KIND_ABSOLUTE = 2.0;
    @Generated public static final double EXPORT_SYMBOL_FLAGS_WEAK_DEFINITION = 4.0;
    @Generated public static final double EXPORT_SYMBOL_FLAGS_REEXPORT = 8.0;
    @Generated public static final double EXPORT_SYMBOL_FLAGS_STUB_AND_RESOLVER = 16.0;
    @Generated public static final double EXPORT_SYMBOL_FLAGS_STATIC_RESOLVER = 32.0;
    @Generated public static final double DICE_KIND_DATA = 1.0;
    @Generated public static final double DICE_KIND_JUMP_TABLE8 = 2.0;
    @Generated public static final double DICE_KIND_JUMP_TABLE16 = 3.0;
    @Generated public static final double DICE_KIND_JUMP_TABLE32 = 4.0;
    @Generated public static final double DICE_KIND_ABS_JUMP_TABLE32 = 5.0;
    @Generated public static final double ITIMER_REAL = 0.0;
    @Generated public static final double ITIMER_VIRTUAL = 1.0;
    @Generated public static final double ITIMER_PROF = 2.0;
    @Generated public static final double DST_NONE = 0.0;
    @Generated public static final double DST_USA = 1.0;
    @Generated public static final double DST_AUST = 2.0;
    @Generated public static final double DST_WET = 3.0;
    @Generated public static final double DST_MET = 4.0;
    @Generated public static final double DST_EET = 5.0;
    @Generated public static final double DST_CAN = 6.0;
    @Generated public static final double OS_LOG_TARGET_HAS_10_15_FEATURES = 0.0;
    @Generated public static final double OS_LOG_TARGET_HAS_10_14_FEATURES = 0.0;
    @Generated public static final double OS_LOG_TARGET_HAS_10_13_FEATURES = 0.0;
    @Generated public static final double OS_LOG_TARGET_HAS_10_12_FEATURES = 0.0;
    @Generated public static final double OS_LOCK_API_VERSION = 2.0160309E7;
    @Generated public static final double OS_SIGNPOST_TYPE_MASK = 3.0;
    @Generated public static final double IPPROTO_IP = 0.0;
    @Generated public static final double IPPROTO_HOPOPTS = 0.0;
    @Generated public static final double IPPROTO_ICMP = 1.0;
    @Generated public static final double IPPROTO_IGMP = 2.0;
    @Generated public static final double IPPROTO_GGP = 3.0;
    @Generated public static final double IPPROTO_IPV4 = 4.0;
    @Generated public static final double IPPROTO_TCP = 6.0;
    @Generated public static final double IPPROTO_ST = 7.0;
    @Generated public static final double IPPROTO_EGP = 8.0;
    @Generated public static final double IPPROTO_PIGP = 9.0;
    @Generated public static final double IPPROTO_RCCMON = 10.0;
    @Generated public static final double IPPROTO_NVPII = 11.0;
    @Generated public static final double IPPROTO_PUP = 12.0;
    @Generated public static final double IPPROTO_ARGUS = 13.0;
    @Generated public static final double IPPROTO_EMCON = 14.0;
    @Generated public static final double IPPROTO_XNET = 15.0;
    @Generated public static final double IPPROTO_CHAOS = 16.0;
    @Generated public static final double IPPROTO_UDP = 17.0;
    @Generated public static final double IPPROTO_MUX = 18.0;
    @Generated public static final double IPPROTO_MEAS = 19.0;
    @Generated public static final double IPPROTO_HMP = 20.0;
    @Generated public static final double IPPROTO_PRM = 21.0;
    @Generated public static final double IPPROTO_IDP = 22.0;
    @Generated public static final double IPPROTO_TRUNK1 = 23.0;
    @Generated public static final double IPPROTO_TRUNK2 = 24.0;
    @Generated public static final double IPPROTO_LEAF1 = 25.0;
    @Generated public static final double IPPROTO_LEAF2 = 26.0;
    @Generated public static final double IPPROTO_RDP = 27.0;
    @Generated public static final double IPPROTO_IRTP = 28.0;
    @Generated public static final double IPPROTO_TP = 29.0;
    @Generated public static final double IPPROTO_BLT = 30.0;
    @Generated public static final double IPPROTO_NSP = 31.0;
    @Generated public static final double IPPROTO_INP = 32.0;
    @Generated public static final double IPPROTO_SEP = 33.0;
    @Generated public static final double IPPROTO_3PC = 34.0;
    @Generated public static final double IPPROTO_IDPR = 35.0;
    @Generated public static final double IPPROTO_XTP = 36.0;
    @Generated public static final double IPPROTO_DDP = 37.0;
    @Generated public static final double IPPROTO_CMTP = 38.0;
    @Generated public static final double IPPROTO_TPXX = 39.0;
    @Generated public static final double IPPROTO_IL = 40.0;
    @Generated public static final double IPPROTO_IPV6 = 41.0;
    @Generated public static final double IPPROTO_SDRP = 42.0;
    @Generated public static final double IPPROTO_ROUTING = 43.0;
    @Generated public static final double IPPROTO_FRAGMENT = 44.0;
    @Generated public static final double IPPROTO_IDRP = 45.0;
    @Generated public static final double IPPROTO_RSVP = 46.0;
    @Generated public static final double IPPROTO_GRE = 47.0;
    @Generated public static final double IPPROTO_MHRP = 48.0;
    @Generated public static final double IPPROTO_BHA = 49.0;
    @Generated public static final double IPPROTO_ESP = 50.0;
    @Generated public static final double IPPROTO_AH = 51.0;
    @Generated public static final double IPPROTO_INLSP = 52.0;
    @Generated public static final double IPPROTO_SWIPE = 53.0;
    @Generated public static final double IPPROTO_NHRP = 54.0;
    @Generated public static final double IPPROTO_ICMPV6 = 58.0;
    @Generated public static final double IPPROTO_NONE = 59.0;
    @Generated public static final double IPPROTO_DSTOPTS = 60.0;
    @Generated public static final double IPPROTO_AHIP = 61.0;
    @Generated public static final double IPPROTO_CFTP = 62.0;
    @Generated public static final double IPPROTO_HELLO = 63.0;
    @Generated public static final double IPPROTO_SATEXPAK = 64.0;
    @Generated public static final double IPPROTO_KRYPTOLAN = 65.0;
    @Generated public static final double IPPROTO_RVD = 66.0;
    @Generated public static final double IPPROTO_IPPC = 67.0;
    @Generated public static final double IPPROTO_ADFS = 68.0;
    @Generated public static final double IPPROTO_SATMON = 69.0;
    @Generated public static final double IPPROTO_VISA = 70.0;
    @Generated public static final double IPPROTO_IPCV = 71.0;
    @Generated public static final double IPPROTO_CPNX = 72.0;
    @Generated public static final double IPPROTO_CPHB = 73.0;
    @Generated public static final double IPPROTO_WSN = 74.0;
    @Generated public static final double IPPROTO_PVP = 75.0;
    @Generated public static final double IPPROTO_BRSATMON = 76.0;
    @Generated public static final double IPPROTO_ND = 77.0;
    @Generated public static final double IPPROTO_WBMON = 78.0;
    @Generated public static final double IPPROTO_WBEXPAK = 79.0;
    @Generated public static final double IPPROTO_EON = 80.0;
    @Generated public static final double IPPROTO_VMTP = 81.0;
    @Generated public static final double IPPROTO_SVMTP = 82.0;
    @Generated public static final double IPPROTO_VINES = 83.0;
    @Generated public static final double IPPROTO_TTP = 84.0;
    @Generated public static final double IPPROTO_IGP = 85.0;
    @Generated public static final double IPPROTO_DGP = 86.0;
    @Generated public static final double IPPROTO_TCF = 87.0;
    @Generated public static final double IPPROTO_IGRP = 88.0;
    @Generated public static final double IPPROTO_OSPFIGP = 89.0;
    @Generated public static final double IPPROTO_SRPC = 90.0;
    @Generated public static final double IPPROTO_LARP = 91.0;
    @Generated public static final double IPPROTO_MTP = 92.0;
    @Generated public static final double IPPROTO_AX25 = 93.0;
    @Generated public static final double IPPROTO_IPEIP = 94.0;
    @Generated public static final double IPPROTO_MICP = 95.0;
    @Generated public static final double IPPROTO_SCCSP = 96.0;
    @Generated public static final double IPPROTO_ETHERIP = 97.0;
    @Generated public static final double IPPROTO_ENCAP = 98.0;
    @Generated public static final double IPPROTO_APES = 99.0;
    @Generated public static final double IPPROTO_GMTP = 100.0;
    @Generated public static final double IPPROTO_PIM = 103.0;
    @Generated public static final double IPPROTO_IPCOMP = 108.0;
    @Generated public static final double IPPROTO_PGM = 113.0;
    @Generated public static final double IPPROTO_SCTP = 132.0;
    @Generated public static final double IPPROTO_DIVERT = 254.0;
    @Generated public static final double IPPROTO_RAW = 255.0;
    @Generated public static final double IPPROTO_MAX = 256.0;
    @Generated public static final double IPPROTO_DONE = 257.0;
    @Generated public static final double __DARWIN_IPPORT_RESERVED = 1024.0;
    @Generated public static final double IPPORT_USERRESERVED = 5000.0;
    @Generated public static final double IPPORT_HIFIRSTAUTO = 49152.0;
    @Generated public static final double IPPORT_HILASTAUTO = 65535.0;
    @Generated public static final double IPPORT_RESERVEDSTART = 600.0;
    @Generated public static final double IN_CLASSA_NSHIFT = 24.0;
    @Generated public static final double IN_CLASSA_HOST = 1.6777215E7;
    @Generated public static final double IN_CLASSA_MAX = 128.0;
    @Generated public static final double IN_CLASSB_NSHIFT = 16.0;
    @Generated public static final double IN_CLASSB_HOST = 65535.0;
    @Generated public static final double IN_CLASSB_MAX = 65536.0;
    @Generated public static final double IN_CLASSC_NSHIFT = 8.0;
    @Generated public static final double IN_CLASSC_HOST = 255.0;
    @Generated public static final double IN_CLASSD_NSHIFT = 28.0;
    @Generated public static final double IN_CLASSD_HOST = 2.68435455E8;
    @Generated public static final double IN_LOOPBACKNET = 127.0;
    @Generated public static final double INET_ADDRSTRLEN = 16.0;
    @Generated public static final double IP_OPTIONS = 1.0;
    @Generated public static final double IP_HDRINCL = 2.0;
    @Generated public static final double IP_TOS = 3.0;
    @Generated public static final double IP_TTL = 4.0;
    @Generated public static final double IP_RECVOPTS = 5.0;
    @Generated public static final double IP_RECVRETOPTS = 6.0;
    @Generated public static final double IP_RECVDSTADDR = 7.0;
    @Generated public static final double IP_RETOPTS = 8.0;
    @Generated public static final double IP_MULTICAST_IF = 9.0;
    @Generated public static final double IP_MULTICAST_TTL = 10.0;
    @Generated public static final double IP_MULTICAST_LOOP = 11.0;
    @Generated public static final double IP_ADD_MEMBERSHIP = 12.0;
    @Generated public static final double IP_DROP_MEMBERSHIP = 13.0;
    @Generated public static final double IP_MULTICAST_VIF = 14.0;
    @Generated public static final double IP_RSVP_ON = 15.0;
    @Generated public static final double IP_RSVP_OFF = 16.0;
    @Generated public static final double IP_RSVP_VIF_ON = 17.0;
    @Generated public static final double IP_RSVP_VIF_OFF = 18.0;
    @Generated public static final double IP_PORTRANGE = 19.0;
    @Generated public static final double IP_RECVIF = 20.0;
    @Generated public static final double IP_IPSEC_POLICY = 21.0;
    @Generated public static final double IP_FAITH = 22.0;
    @Generated public static final double IP_STRIPHDR = 23.0;
    @Generated public static final double IP_RECVTTL = 24.0;
    @Generated public static final double IP_BOUND_IF = 25.0;
    @Generated public static final double IP_PKTINFO = 26.0;
    @Generated public static final double IP_RECVTOS = 27.0;
    @Generated public static final double IP_DONTFRAG = 28.0;
    @Generated public static final double IP_FW_ADD = 40.0;
    @Generated public static final double IP_FW_DEL = 41.0;
    @Generated public static final double IP_FW_FLUSH = 42.0;
    @Generated public static final double IP_FW_ZERO = 43.0;
    @Generated public static final double IP_FW_GET = 44.0;
    @Generated public static final double IP_FW_RESETLOG = 45.0;
    @Generated public static final double IP_OLD_FW_ADD = 50.0;
    @Generated public static final double IP_OLD_FW_DEL = 51.0;
    @Generated public static final double IP_OLD_FW_FLUSH = 52.0;
    @Generated public static final double IP_OLD_FW_ZERO = 53.0;
    @Generated public static final double IP_OLD_FW_GET = 54.0;
    @Generated public static final double IP_NAT__XXX = 55.0;
    @Generated public static final double IP_OLD_FW_RESETLOG = 56.0;
    @Generated public static final double IP_DUMMYNET_CONFIGURE = 60.0;
    @Generated public static final double IP_DUMMYNET_DEL = 61.0;
    @Generated public static final double IP_DUMMYNET_FLUSH = 62.0;
    @Generated public static final double IP_DUMMYNET_GET = 64.0;
    @Generated public static final double IP_TRAFFIC_MGT_BACKGROUND = 65.0;
    @Generated public static final double IP_MULTICAST_IFINDEX = 66.0;
    @Generated public static final double IP_ADD_SOURCE_MEMBERSHIP = 70.0;
    @Generated public static final double IP_DROP_SOURCE_MEMBERSHIP = 71.0;
    @Generated public static final double IP_BLOCK_SOURCE = 72.0;
    @Generated public static final double IP_UNBLOCK_SOURCE = 73.0;
    @Generated public static final double IP_MSFILTER = 74.0;
    @Generated public static final double MCAST_JOIN_GROUP = 80.0;
    @Generated public static final double MCAST_LEAVE_GROUP = 81.0;
    @Generated public static final double MCAST_JOIN_SOURCE_GROUP = 82.0;
    @Generated public static final double MCAST_LEAVE_SOURCE_GROUP = 83.0;
    @Generated public static final double MCAST_BLOCK_SOURCE = 84.0;
    @Generated public static final double MCAST_UNBLOCK_SOURCE = 85.0;
    @Generated public static final double IP_DEFAULT_MULTICAST_TTL = 1.0;
    @Generated public static final double IP_DEFAULT_MULTICAST_LOOP = 1.0;
    @Generated public static final double IP_MIN_MEMBERSHIPS = 31.0;
    @Generated public static final double IP_MAX_MEMBERSHIPS = 4095.0;
    @Generated public static final double IP_MAX_GROUP_SRC_FILTER = 512.0;
    @Generated public static final double IP_MAX_SOCK_SRC_FILTER = 128.0;
    @Generated public static final double IP_MAX_SOCK_MUTE_FILTER = 128.0;
    @Generated public static final double MCAST_UNDEFINED = 0.0;
    @Generated public static final double MCAST_INCLUDE = 1.0;
    @Generated public static final double MCAST_EXCLUDE = 2.0;
    @Generated public static final double IP_PORTRANGE_DEFAULT = 0.0;
    @Generated public static final double IP_PORTRANGE_HIGH = 1.0;
    @Generated public static final double IP_PORTRANGE_LOW = 2.0;
    @Generated public static final double IPCTL_FORWARDING = 1.0;
    @Generated public static final double IPCTL_SENDREDIRECTS = 2.0;
    @Generated public static final double IPCTL_DEFTTL = 3.0;
    @Generated public static final double IPCTL_RTEXPIRE = 5.0;
    @Generated public static final double IPCTL_RTMINEXPIRE = 6.0;
    @Generated public static final double IPCTL_RTMAXCACHE = 7.0;
    @Generated public static final double IPCTL_SOURCEROUTE = 8.0;
    @Generated public static final double IPCTL_DIRECTEDBROADCAST = 9.0;
    @Generated public static final double IPCTL_INTRQMAXLEN = 10.0;
    @Generated public static final double IPCTL_INTRQDROPS = 11.0;
    @Generated public static final double IPCTL_STATS = 12.0;
    @Generated public static final double IPCTL_ACCEPTSOURCEROUTE = 13.0;
    @Generated public static final double IPCTL_FASTFORWARDING = 14.0;
    @Generated public static final double IPCTL_KEEPFAITH = 15.0;
    @Generated public static final double IPCTL_GIF_TTL = 16.0;
    @Generated public static final double IPCTL_MAXID = 17.0;
    @Generated public static final double IPV6PORT_RESERVED = 1024.0;
    @Generated public static final double IPV6PORT_ANONMIN = 49152.0;
    @Generated public static final double IPV6PORT_ANONMAX = 65535.0;
    @Generated public static final double IPV6PORT_RESERVEDMIN = 600.0;
    @Generated public static final double INET6_ADDRSTRLEN = 46.0;
    @Generated public static final double __IPV6_ADDR_SCOPE_NODELOCAL = 1.0;
    @Generated public static final double __IPV6_ADDR_SCOPE_INTFACELOCAL = 1.0;
    @Generated public static final double __IPV6_ADDR_SCOPE_LINKLOCAL = 2.0;
    @Generated public static final double __IPV6_ADDR_SCOPE_SITELOCAL = 5.0;
    @Generated public static final double __IPV6_ADDR_SCOPE_ORGLOCAL = 8.0;
    @Generated public static final double __IPV6_ADDR_SCOPE_GLOBAL = 14.0;
    @Generated public static final double IPV6_ADDR_MC_FLAGS_TRANSIENT = 16.0;
    @Generated public static final double IPV6_ADDR_MC_FLAGS_PREFIX = 32.0;
    @Generated public static final double IPV6_SOCKOPT_RESERVED1 = 3.0;
    @Generated public static final double IPV6_UNICAST_HOPS = 4.0;
    @Generated public static final double IPV6_MULTICAST_IF = 9.0;
    @Generated public static final double IPV6_MULTICAST_HOPS = 10.0;
    @Generated public static final double IPV6_MULTICAST_LOOP = 11.0;
    @Generated public static final double IPV6_JOIN_GROUP = 12.0;
    @Generated public static final double IPV6_LEAVE_GROUP = 13.0;
    @Generated public static final double IPV6_PORTRANGE = 14.0;
    @Generated public static final double ICMP6_FILTER = 18.0;
    @Generated public static final double IPV6_2292PKTINFO = 19.0;
    @Generated public static final double IPV6_2292HOPLIMIT = 20.0;
    @Generated public static final double IPV6_2292NEXTHOP = 21.0;
    @Generated public static final double IPV6_2292HOPOPTS = 22.0;
    @Generated public static final double IPV6_2292DSTOPTS = 23.0;
    @Generated public static final double IPV6_2292RTHDR = 24.0;
    @Generated public static final double IPV6_2292PKTOPTIONS = 25.0;
    @Generated public static final double IPV6_CHECKSUM = 26.0;
    @Generated public static final double IPV6_V6ONLY = 27.0;
    @Generated public static final double IPV6_IPSEC_POLICY = 28.0;
    @Generated public static final double IPV6_FAITH = 29.0;
    @Generated public static final double IPV6_FW_ADD = 30.0;
    @Generated public static final double IPV6_FW_DEL = 31.0;
    @Generated public static final double IPV6_FW_FLUSH = 32.0;
    @Generated public static final double IPV6_FW_ZERO = 33.0;
    @Generated public static final double IPV6_FW_GET = 34.0;
    @Generated public static final double IPV6_RECVTCLASS = 35.0;
    @Generated public static final double IPV6_TCLASS = 36.0;
    @Generated public static final double IPV6_BOUND_IF = 125.0;
    @Generated public static final double IPV6_RTHDR_LOOSE = 0.0;
    @Generated public static final double IPV6_RTHDR_STRICT = 1.0;
    @Generated public static final double IPV6_RTHDR_TYPE_0 = 0.0;
    @Generated public static final double IPV6_DEFAULT_MULTICAST_HOPS = 1.0;
    @Generated public static final double IPV6_DEFAULT_MULTICAST_LOOP = 1.0;
    @Generated public static final double IPV6_MIN_MEMBERSHIPS = 31.0;
    @Generated public static final double IPV6_MAX_MEMBERSHIPS = 4095.0;
    @Generated public static final double IPV6_MAX_GROUP_SRC_FILTER = 512.0;
    @Generated public static final double IPV6_MAX_SOCK_SRC_FILTER = 128.0;
    @Generated public static final double IPV6_PORTRANGE_DEFAULT = 0.0;
    @Generated public static final double IPV6_PORTRANGE_HIGH = 1.0;
    @Generated public static final double IPV6_PORTRANGE_LOW = 2.0;
    @Generated public static final double IPV6CTL_FORWARDING = 1.0;
    @Generated public static final double IPV6CTL_SENDREDIRECTS = 2.0;
    @Generated public static final double IPV6CTL_DEFHLIM = 3.0;
    @Generated public static final double IPV6CTL_FORWSRCRT = 5.0;
    @Generated public static final double IPV6CTL_STATS = 6.0;
    @Generated public static final double IPV6CTL_MRTSTATS = 7.0;
    @Generated public static final double IPV6CTL_MRTPROTO = 8.0;
    @Generated public static final double IPV6CTL_MAXFRAGPACKETS = 9.0;
    @Generated public static final double IPV6CTL_SOURCECHECK = 10.0;
    @Generated public static final double IPV6CTL_SOURCECHECK_LOGINT = 11.0;
    @Generated public static final double IPV6CTL_ACCEPT_RTADV = 12.0;
    @Generated public static final double IPV6CTL_KEEPFAITH = 13.0;
    @Generated public static final double IPV6CTL_LOG_INTERVAL = 14.0;
    @Generated public static final double IPV6CTL_HDRNESTLIMIT = 15.0;
    @Generated public static final double IPV6CTL_DAD_COUNT = 16.0;
    @Generated public static final double IPV6CTL_AUTO_FLOWLABEL = 17.0;
    @Generated public static final double IPV6CTL_DEFMCASTHLIM = 18.0;
    @Generated public static final double IPV6CTL_GIF_HLIM = 19.0;
    @Generated public static final double IPV6CTL_KAME_VERSION = 20.0;
    @Generated public static final double IPV6CTL_USE_DEPRECATED = 21.0;
    @Generated public static final double IPV6CTL_RR_PRUNE = 22.0;
    @Generated public static final double IPV6CTL_V6ONLY = 24.0;
    @Generated public static final double IPV6CTL_RTEXPIRE = 25.0;
    @Generated public static final double IPV6CTL_RTMINEXPIRE = 26.0;
    @Generated public static final double IPV6CTL_RTMAXCACHE = 27.0;
    @Generated public static final double IPV6CTL_USETEMPADDR = 32.0;
    @Generated public static final double IPV6CTL_TEMPPLTIME = 33.0;
    @Generated public static final double IPV6CTL_TEMPVLTIME = 34.0;
    @Generated public static final double IPV6CTL_AUTO_LINKLOCAL = 35.0;
    @Generated public static final double IPV6CTL_RIP6STATS = 36.0;
    @Generated public static final double IPV6CTL_PREFER_TEMPADDR = 37.0;
    @Generated public static final double IPV6CTL_ADDRCTLPOLICY = 38.0;
    @Generated public static final double IPV6CTL_USE_DEFAULTZONE = 39.0;
    @Generated public static final double IPV6CTL_MAXFRAGS = 41.0;
    @Generated public static final double IPV6CTL_MCAST_PMTU = 44.0;
    @Generated public static final double IPV6CTL_NEIGHBORGCTHRESH = 46.0;
    @Generated public static final double IPV6CTL_MAXIFPREFIXES = 47.0;
    @Generated public static final double IPV6CTL_MAXIFDEFROUTERS = 48.0;
    @Generated public static final double IPV6CTL_MAXDYNROUTES = 49.0;
    @Generated public static final double ICMPV6CTL_ND6_ONLINKNSRFC4861 = 50.0;
    @Generated public static final double IPV6CTL_ULA_USETEMPADDR = 51.0;
    @Generated public static final double IPV6CTL_MAXID = 51.0;
    @Generated public static final double OS_ACTIVITY_OBJECT_API = 0.0;
    @Generated public static final double OS_ACTIVITY_NULL = 0.0;
    @Generated public static final double TARGET_OS_VISION = 0.0;
    @Generated public static final double __API_TO_BE_DEPRECATED_VISIONOS = 100000.0;
    @Generated public static final double __MAC_10_14_5 = 101405.0;
    @Generated public static final double __MAC_12_4 = 120400.0;
    @Generated public static final double __MAC_12_5 = 120500.0;
    @Generated public static final double __MAC_12_6 = 120600.0;
    @Generated public static final double __MAC_12_7 = 120700.0;
    @Generated public static final double __MAC_13_2 = 130200.0;
    @Generated public static final double __MAC_13_3 = 130300.0;
    @Generated public static final double __MAC_13_4 = 130400.0;
    @Generated public static final double __MAC_13_5 = 130500.0;
    @Generated public static final double __MAC_13_6 = 130600.0;
    @Generated public static final double __MAC_14_0 = 140000.0;
    @Generated public static final double __MAC_14_1 = 140100.0;
    @Generated public static final double __MAC_14_2 = 140200.0;
    @Generated public static final double __IPHONE_14_4 = 140400.0;
    @Generated public static final double __IPHONE_15_5 = 150500.0;
    @Generated public static final double __IPHONE_15_6 = 150600.0;
    @Generated public static final double __IPHONE_16_3 = 160300.0;
    @Generated public static final double __IPHONE_16_4 = 160400.0;
    @Generated public static final double __IPHONE_16_5 = 160500.0;
    @Generated public static final double __IPHONE_16_6 = 160600.0;
    @Generated public static final double __IPHONE_16_7 = 160700.0;
    @Generated public static final double __IPHONE_17_0 = 170000.0;
    @Generated public static final double __IPHONE_17_1 = 170100.0;
    @Generated public static final double __IPHONE_17_2 = 170200.0;
    @Generated public static final double __WATCHOS_8_6 = 80600.0;
    @Generated public static final double __WATCHOS_8_7 = 80700.0;
    @Generated public static final double __WATCHOS_9_3 = 90300.0;
    @Generated public static final double __WATCHOS_9_4 = 90400.0;
    @Generated public static final double __WATCHOS_9_5 = 90500.0;
    @Generated public static final double __WATCHOS_9_6 = 90600.0;
    @Generated public static final double __WATCHOS_10_0 = 100000.0;
    @Generated public static final double __WATCHOS_10_1 = 100100.0;
    @Generated public static final double __WATCHOS_10_2 = 100200.0;
    @Generated public static final double __TVOS_15_5 = 150500.0;
    @Generated public static final double __TVOS_15_6 = 150600.0;
    @Generated public static final double __TVOS_16_3 = 160300.0;
    @Generated public static final double __TVOS_16_4 = 160400.0;
    @Generated public static final double __TVOS_16_5 = 160500.0;
    @Generated public static final double __TVOS_16_6 = 160600.0;
    @Generated public static final double __TVOS_17_0 = 170000.0;
    @Generated public static final double __TVOS_17_1 = 170100.0;
    @Generated public static final double __TVOS_17_2 = 170200.0;
    @Generated public static final double __BRIDGEOS_2_0 = 20000.0;
    @Generated public static final double __BRIDGEOS_3_0 = 30000.0;
    @Generated public static final double __BRIDGEOS_3_1 = 30100.0;
    @Generated public static final double __BRIDGEOS_3_4 = 30400.0;
    @Generated public static final double __BRIDGEOS_4_0 = 40000.0;
    @Generated public static final double __BRIDGEOS_4_1 = 40100.0;
    @Generated public static final double __BRIDGEOS_5_0 = 50000.0;
    @Generated public static final double __BRIDGEOS_5_1 = 50100.0;
    @Generated public static final double __BRIDGEOS_5_3 = 50300.0;
    @Generated public static final double __BRIDGEOS_6_0 = 60000.0;
    @Generated public static final double __BRIDGEOS_6_2 = 60200.0;
    @Generated public static final double __BRIDGEOS_6_4 = 60400.0;
    @Generated public static final double __BRIDGEOS_6_5 = 60500.0;
    @Generated public static final double __BRIDGEOS_6_6 = 60600.0;
    @Generated public static final double __BRIDGEOS_7_0 = 70000.0;
    @Generated public static final double __BRIDGEOS_7_1 = 70100.0;
    @Generated public static final double __BRIDGEOS_7_2 = 70200.0;
    @Generated public static final double __BRIDGEOS_7_3 = 70300.0;
    @Generated public static final double __BRIDGEOS_7_4 = 70400.0;
    @Generated public static final double __BRIDGEOS_7_6 = 70600.0;
    @Generated public static final double __BRIDGEOS_8_0 = 80000.0;
    @Generated public static final double __BRIDGEOS_8_1 = 80100.0;
    @Generated public static final double __BRIDGEOS_8_2 = 80200.0;
    @Generated public static final double __DRIVERKIT_22_0 = 220000.0;
    @Generated public static final double __DRIVERKIT_22_4 = 220400.0;
    @Generated public static final double __DRIVERKIT_22_5 = 220500.0;
    @Generated public static final double __DRIVERKIT_22_6 = 220600.0;
    @Generated public static final double __DRIVERKIT_23_0 = 230000.0;
    @Generated public static final double __DRIVERKIT_23_1 = 230100.0;
    @Generated public static final double __DRIVERKIT_23_2 = 230200.0;
    @Generated public static final double __VISIONOS_1_0 = 10000.0;
    @Generated public static final double IOPOL_VFS_NOCACHE_WRITE_FS_BLKSIZE_DEFAULT = 0.0;
    @Generated public static final double IOPOL_VFS_NOCACHE_WRITE_FS_BLKSIZE_ON = 1.0;
    @Generated public static final double API_TO_BE_DEPRECATED_VISIONOS = 100000.0;
    @Generated public static final double MACH_PORT_SERVICE_THROTTLED = 9.0;
    @Generated public static final double MACH_PORT_SERVICE_THROTTLED_COUNT = 1.0;
    @Generated public static final double F_OFD_SETLK = 90.0;
    @Generated public static final double F_OFD_SETLKW = 91.0;
    @Generated public static final double F_OFD_GETLK = 92.0;
    @Generated public static final double F_OFD_SETLKWTIMEOUT = 93.0;
    @Generated public static final double F_ATTRIBUTION_TAG = 111.0;
    @Generated public static final double ATTRIBUTION_NAME_MAX = 255.0;
    @Generated public static final double F_CREATE_TAG = 1.0;
    @Generated public static final double F_DELETE_TAG = 2.0;
    @Generated public static final double F_QUERY_TAG = 4.0;
    @Generated public static final double CPUFAMILY_INTEL_COMETLAKE = 4.86055998E8;
    @Generated public static final double CPUFAMILY_ARM_PALMA = 1.912690738E9;
    @Generated public static final double CPUFAMILY_ARM_COLL = 6.78884789E8;
    @Generated public static final double CPUFAMILY_ARM_LOBOS = 1.598941843E9;
    @Generated public static final double CPUSUBFAMILY_ARM_HA = 6.0;
    @Generated public static final double LC_ATOM_INFO = 54.0;
    @Generated public static final double PLATFORM_VISIONOS = 11.0;
    @Generated public static final double PLATFORM_VISIONOSSIMULATOR = 12.0;

    /**
     * <malloc/_malloc.h>
     * 
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native VoidPtr malloc_type_malloc(long size, long type_id);

    /**
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native VoidPtr malloc_type_calloc(long count, long size, long type_id);

    /**
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native void malloc_type_free(VoidPtr ptr, long type_id);

    /**
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native VoidPtr malloc_type_realloc(VoidPtr ptr, long size, long type_id);

    /**
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native VoidPtr malloc_type_valloc(long size, long type_id);

    /**
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native VoidPtr malloc_type_aligned_alloc(long alignment, long size, long type_id);

    /**
     * rdar://120689514
     * 
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native int malloc_type_posix_memalign(Ptr<VoidPtr> memptr, long alignment, long size, long type_id);

    /**
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native VoidPtr malloc_type_zone_malloc(VoidPtr zone, long size, long type_id);

    /**
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native VoidPtr malloc_type_zone_calloc(VoidPtr zone, long count, long size, long type_id);

    /**
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native void malloc_type_zone_free(VoidPtr zone, VoidPtr ptr, long type_id);

    /**
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native VoidPtr malloc_type_zone_realloc(VoidPtr zone, VoidPtr ptr, long size, long type_id);

    /**
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native VoidPtr malloc_type_zone_valloc(VoidPtr zone, long size, long type_id);

    /**
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native VoidPtr malloc_type_zone_memalign(VoidPtr zone, long alignment, long size, long type_id);

    @Generated
    @CFunction
    public static native int at_quick_exit(@FunctionPtr(name = "call_at_quick_exit") Function_at_quick_exit arg1);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_at_quick_exit {
        @Generated
        void call_at_quick_exit();
    }

    @Generated
    @CFunction
    public static native void quick_exit(int arg1);

    /**
     * [@function] dispatch_allow_send_signals
     * 
     * This function provides the calling process an ability to send signals to
     * it's pthread worker threads created to service incoming work to dispatch,
     * including those which were already created prior to this function call
     * and those who may be created in the future. After a call to this function
     * returns successfully, this ability is retained for the lifetime of the
     * calling process.
     * Regular UNIX calls still need to be used to manipulate signal mask of
     * each individual pthread worker thread to allow delivery of a specific
     * signal to that thread.
     * 
     * @param preserve_signum
     *                        Dispatch and its kernel runtime subsystem manages a pool of pthread
     *                        worker threads which are reused for handling incoming work to dispatch.
     *                        The signal number specified here is used internally by this subsystem to
     *                        preserve sigmask of the pthread worker threads across their reuse.
     * 
     *                        In other words, if a pthread worker thread unblocks delivery of
     * @preserve_signum using regular UNIX calls after a call to this
     *                  function using the same @preserve_signum returns successfully,
     *                  that @preserve_signum remains unblocked across that thread's
     *                  reuse until it is further modified by regular UNIX calls.
     *                  Therefore, it avoids the need to call regular UNIX calls to
     *                  unblock delivery of @preserve_signum every time that thread
     *                  is reused. The specific signal @preserve_signum can be sent
     *                  to that specific pthread worker thread using pthread_kill().
     * 
     *                  The following code illustrates an expected usage of this API.
     * 
     *                  <code>
     * 
     *                  // Enable sending signals to dispatch pthread worker threads.
     *                  int ret = dispatch_allow_send_signals(sig);
     *                  // Validate ret.
     * 
     *                  dispatch_async(q, ^{
     *                  // Unblock sig for this worker thread if not already done.
     *                  // Such a state could be saved in TSD or globally.
     *                  mask = sigmask(sig);
     *                  pthread_sigmask(SIG_UNBLOCK, &mask, NULL);
     *                  // busy with some work. Can receive signal sig.
     *                  // If this worker thread is re-used later, it does not
     *                  // not need to call pthread_sigmask again to unblock delivery
     *                  // of signal sig.
     *                  }
     * 
     *                  This function returns 0 upon success and -1 with an errno otherwise.
     *                  Possible error codes are as below :
     * 
     *                  EINVAL : @preserve_signum is prohibited and is not allowed to be preserved
     *                  across the thread's reuse.
     *                  ENOTSUP : The underlying kernel does not support this functionality.
     * 
     *                  </code>
     * 
     *                  API-Since: 17.4
     */
    @Generated
    @CFunction
    public static native int dispatch_allow_send_signals(int preserve_signum);

    /**
     * [ML]
     */
    @Generated
    @CFunction
    public static native int mlockall(int arg1);

    @Generated
    @CFunction
    public static native int munlockall();

    /**
     * [MR]
     */
    @Generated
    @CFunction
    public static native int mlock(ConstVoidPtr arg1, @NUInt long arg2);

    /**
     * [MC3]
     */
    @Generated
    @CFunction
    public static native VoidPtr mmap(VoidPtr arg1, @NUInt long arg2, int arg3, int arg4, int arg5, long arg6);

    /**
     * [MPR]
     */
    @Generated
    @CFunction
    public static native int mprotect(VoidPtr arg1, @NUInt long arg2, int arg3);

    /**
     * [MF|SIO]
     */
    @Generated
    @CFunction
    public static native int msync(VoidPtr arg1, @NUInt long arg2, int arg3);

    /**
     * [MR]
     */
    @Generated
    @CFunction
    public static native int munlock(ConstVoidPtr arg1, @NUInt long arg2);

    /**
     * [MC3]
     */
    @Generated
    @CFunction
    public static native int munmap(VoidPtr arg1, @NUInt long arg2);

    /**
     * [SHM]
     */
    @Generated
    @Variadic()
    @CFunction
    public static native int shm_open(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2,
            Object... varargs);

    @Generated
    @CFunction
    public static native int shm_unlink(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    /**
     * [ADV]
     */
    @Generated
    @CFunction
    public static native int posix_madvise(VoidPtr arg1, @NUInt long arg2, int arg3);

    @Generated
    @CFunction
    public static native int madvise(VoidPtr arg1, @NUInt long arg2, int arg3);

    @Generated
    @CFunction
    public static native int mincore(ConstVoidPtr arg1, @NUInt long arg2, BytePtr arg3);

    @Generated
    @CFunction
    public static native int minherit(VoidPtr arg1, @NUInt long arg2, int arg3);

    /**
     * [@function] xpc_endpoint_create
     * Creates a new endpoint from a connection that is suitable for embedding into
     * messages.
     * 
     * @param connection
     *                   Only connections obtained through calls to xpc_connection_create*() may be
     *                   given to this API. Passing any other type of connection is not supported and
     *                   will result in undefined behavior.
     * 
     * @return
     *         A new endpoint object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native xpc_endpoint_t xpc_endpoint_create(@NotNull xpc_connection_t connection);

    /**
     * [@function] xpc_debugger_api_misuse_info
     * Returns a pointer to a string describing the reason XPC aborted the calling
     * process. On OS X, this will be the same string present in the "Application
     * Specific Information" section of the crash report.
     * 
     * This function is only callable from within a debugger. It is not meant to be
     * called by the program directly.
     * 
     * @return
     *         A pointer to the human-readable string describing the reason the caller was
     *         aborted. If XPC was not responsible for the program's termination, NULL will
     *         be returned.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String xpc_debugger_api_misuse_info();

    /**
     * [@function] xpc_connection_create
     * Creates a new connection object.
     * 
     * This method will succeed even if the named service does not exist. This is
     * because the XPC namespace is not queried for the service name until the
     * connection has been activated. See {@link xpc_connection_activate()}.
     * 
     * XPC connections, like dispatch sources, are returned in an inactive state, so
     * you must call {@link xpc_connection_activate()} in order to begin receiving
     * events from the connection. Also like dispatch sources, connections must be
     * activated and not suspended in order to be safely released. It is
     * a programming error to release an inactive or suspended connection.
     * 
     * API-Since: 5.0
     * 
     * @param name
     *                If non-NULL, the name of the service with which to connect. The returned
     *                connection will be a peer.
     * 
     *                If NULL, an anonymous listener connection will be created. You can embed the
     *                ability to create new peer connections in an endpoint, which can be inserted
     *                into a message and sent to another process .
     * 
     * @param targetq
     *                The GCD queue to which the event handler block will be submitted. This
     *                parameter may be NULL, in which case the connection's target queue will be
     *                libdispatch's default target queue, defined as DISPATCH_TARGET_QUEUE_DEFAULT.
     *                The target queue may be changed later with a call to
     *                xpc_connection_set_target_queue().
     * 
     * @return
     *         A new connection object. The caller is responsible for disposing of the
     *         returned object with {@link xpc_release} when it is no longer needed.
     */
    @Generated
    @CFunction
    @NotNull
    public static native xpc_connection_t xpc_connection_create(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Nullable String name,
            @Nullable dispatch_queue_t targetq);

    /**
     * [@function] xpc_connection_create_from_endpoint
     * Creates a new connection from the given endpoint.
     * 
     * @param endpoint
     *                 The endpoint from which to create the new connection.
     * 
     * @return
     *         A new peer connection to the listener represented by the given endpoint.
     * 
     *         The same responsibilities of setting an event handler and activating the
     *         connection after calling xpc_connection_create() apply to the connection
     *         returned by this API. Since the connection yielded by this API is not
     *         associated with a name (and therefore is not rediscoverable), this connection
     *         will receive XPC_ERROR_CONNECTION_INVALID if the listening side crashes,
     *         exits or cancels the listener connection.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native xpc_connection_t xpc_connection_create_from_endpoint(@NotNull xpc_endpoint_t endpoint);

    /**
     * [@function] xpc_connection_set_target_queue
     * Sets the target queue of the given connection.
     * 
     * Setting the target queue is asynchronous and non-preemptive and therefore
     * this method will not interrupt the execution of an already-running event
     * handler block. Setting the target queue may be likened to issuing a barrier
     * to the connection which does the actual work of changing the target queue.
     * 
     * The XPC runtime guarantees this non-preemptiveness even for concurrent target
     * queues. If the target queue is a concurrent queue, then XPC still guarantees
     * that there will never be more than one invocation of the connection's event
     * handler block executing concurrently. If you wish to process events
     * concurrently, you can dispatch_async(3) to a concurrent queue from within
     * the event handler.
     * 
     * IMPORTANT: When called from within the event handler block,
     * dispatch_get_current_queue(3) is NOT guaranteed to return a pointer to the
     * queue set with this method.
     * 
     * Despite this seeming inconsistency, the XPC runtime guarantees that, when the
     * target queue is a serial queue, the event handler block will execute
     * synchronously with respect to other blocks submitted to that same queue. When
     * the target queue is a concurrent queue, the event handler block may run
     * concurrently with other blocks submitted to that queue, but it will never run
     * concurrently with other invocations of itself for the same connection, as
     * discussed previously.
     * 
     * API-Since: 5.0
     * 
     * @param connection
     *                   The connection object which is to be manipulated.
     * 
     * @param targetq
     *                   The GCD queue to which the event handler block will be submitted. This
     *                   parameter may be NULL, in which case the connection's target queue will be
     *                   libdispatch's default target queue, defined as DISPATCH_TARGET_QUEUE_DEFAULT.
     */
    @Generated
    @CFunction
    public static native void xpc_connection_set_target_queue(@NotNull xpc_connection_t connection,
            @Nullable dispatch_queue_t targetq);

    /**
     * [@function] xpc_connection_set_event_handler
     * Sets the event handler block for the connection.
     * 
     * Setting the event handler is asynchronous and non-preemptive, and therefore
     * this method will not interrupt the execution of an already-running event
     * handler block. If the event handler is executing at the time of this call, it
     * will finish, and then the connection's event handler will be changed before
     * the next invocation of the event handler. The XPC runtime guarantees this
     * non-preemptiveness even for concurrent target queues.
     * 
     * Connection event handlers are non-reentrant, so it is safe to call
     * xpc_connection_set_event_handler() from within the event handler block.
     * 
     * The event handler's execution should be treated as a barrier to all
     * connection activity. When it is executing, the connection will not attempt to
     * send or receive messages, including reply messages. Thus, it is not safe to
     * call xpc_connection_send_message_with_reply_sync() on the connection from
     * within the event handler.
     * 
     * You do not hold a reference on the object received as the event handler's
     * only argument. Regardless of the type of object received, it is safe to call
     * xpc_retain() on the object to obtain a reference to it.
     * 
     * A connection may receive different events depending upon whether it is a
     * listener or not. Any connection may receive an error in its event handler.
     * But while normal connections may receive messages in addition to errors,
     * listener connections will receive connections and and not messages.
     * 
     * Connections received by listeners are equivalent to those returned by
     * xpc_connection_create() with a non-NULL name argument and a NULL targetq
     * argument with the exception that you do not hold a reference on them.
     * You must set an event handler and activate the connection. If you do not wish
     * to accept the connection, you may simply call xpc_connection_cancel() on it
     * and return. The runtime will dispose of it for you.
     * 
     * If there is an error in the connection, this handler will be invoked with the
     * error dictionary as its argument. This dictionary will be one of the well-
     * known XPC_ERROR_* dictionaries.
     * 
     * Regardless of the type of event, ownership of the event object is NOT
     * implicitly transferred. Thus, the object will be released and deallocated at
     * some point in the future after the event handler returns. If you wish the
     * event's lifetime to persist, you must retain it with xpc_retain().
     * 
     * Connections received through the event handler will be released and
     * deallocated after the connection has gone invalid and delivered that event to
     * its event handler.
     * 
     * API-Since: 5.0
     * 
     * @param connection
     *                   The connection object which is to be manipulated.
     * 
     * @param handler
     *                   The event handler block.
     */
    @Generated
    @CFunction
    public static native void xpc_connection_set_event_handler(@NotNull xpc_connection_t connection,
            @ObjCBlock(name = "call_xpc_connection_set_event_handler") @NotNull Block_xpc_connection_set_event_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_xpc_connection_set_event_handler {
        @Generated
        void call_xpc_connection_set_event_handler(@NotNull VoidPtr object);
    }

    /**
     * [@function] xpc_connection_activate
     * Activates the connection. Connections start in an inactive state, so you must
     * call xpc_connection_activate() on a connection before it will send or receive
     * any messages.
     * 
     * Calling xpc_connection_activate() on an active connection has no effect.
     * Releasing the last reference on an inactive connection that was created with
     * an xpc_connection_create*() call is undefined.
     * 
     * For backward compatibility reasons, xpc_connection_resume() on an inactive
     * and not otherwise suspended xpc connection has the same effect as calling
     * xpc_connection_activate(). For new code, using xpc_connection_activate()
     * is preferred.
     * 
     * API-Since: 10.0
     * 
     * @param connection
     *                   The connection object which is to be manipulated.
     */
    @Generated
    @CFunction
    public static native void xpc_connection_activate(@NotNull xpc_connection_t connection);

    /**
     * [@function] xpc_connection_suspend
     * Suspends the connection so that the event handler block will not fire and
     * that the connection will not attempt to send any messages it has in its
     * queue. All calls to xpc_connection_suspend() must be balanced with calls to
     * xpc_connection_resume() before releasing the last reference to the
     * connection.
     * 
     * Suspension is asynchronous and non-preemptive, and therefore this method will
     * not interrupt the execution of an already-running event handler block. If
     * the event handler is executing at the time of this call, it will finish, and
     * then the connection will be suspended before the next scheduled invocation
     * of the event handler. The XPC runtime guarantees this non-preemptiveness even
     * for concurrent target queues.
     * 
     * Connection event handlers are non-reentrant, so it is safe to call
     * xpc_connection_suspend() from within the event handler block.
     * 
     * API-Since: 5.0
     * 
     * @param connection
     *                   The connection object which is to be manipulated.
     */
    @Generated
    @CFunction
    public static native void xpc_connection_suspend(@NotNull xpc_connection_t connection);

    /**
     * [@function] xpc_connection_resume
     * Resumes the connection.
     * 
     * In order for a connection to become live, every call to
     * xpc_connection_suspend() must be balanced with a call to
     * xpc_connection_resume().
     * 
     * For backward compatibility reasons, xpc_connection_resume() on an inactive
     * and not otherwise suspended xpc connection has the same effect as calling
     * xpc_connection_activate(). For new code, using xpc_connection_activate()
     * is preferred.
     * 
     * Calling xpc_connection_resume() more times than xpc_connection_suspend()
     * has been called is otherwise considered an error.
     * 
     * API-Since: 5.0
     * 
     * @param connection
     *                   The connection object which is to be manipulated.
     */
    @Generated
    @CFunction
    public static native void xpc_connection_resume(@NotNull xpc_connection_t connection);

    /**
     * [@function] xpc_connection_send_message
     * Sends a message over the connection to the destination service.
     * 
     * Messages are delivered in FIFO order. This API is safe to call from multiple
     * GCD queues. There is no indication that a message was delivered successfully.
     * This is because even once the message has been successfully enqueued on the
     * remote end, there are no guarantees about when the runtime will dequeue the
     * message and invoke the other connection's event handler block.
     * 
     * If this API is used to send a message that is in reply to another message,
     * there is no guarantee of ordering between the invocations of the connection's
     * event handler and the reply handler for that message, even if they are
     * targeted to the same queue.
     * 
     * After extensive study, we have found that clients who are interested in
     * the state of the message on the server end are typically holding open
     * transactions related to that message. And the only reliable way to track the
     * lifetime of that transaction is at the protocol layer. So the server should
     * send a reply message, which upon receiving, will cause the client to close
     * its transaction.
     * 
     * API-Since: 5.0
     * 
     * @param connection
     *                   The connection over which the message shall be sent.
     * 
     * @param message
     *                   The message to send. This must be a dictionary object. This dictionary is
     *                   logically copied by the connection, so it is safe to modify the dictionary
     *                   after this call.
     */
    @Generated
    @CFunction
    public static native void xpc_connection_send_message(@NotNull xpc_connection_t connection,
            @NotNull VoidPtr message);

    /**
     * [@function] xpc_connection_send_barrier
     * Issues a barrier against the connection's message-send activity.
     * 
     * XPC guarantees that, even if the connection's target queue is a concurrent
     * queue, there are no other messages being sent concurrently while the barrier
     * block is executing. XPC does not guarantee that the receipt of messages
     * (either through the connection's event handler or through reply handlers)
     * will be suspended while the barrier is executing.
     * 
     * A barrier is issued relative to the message-send queue. Thus, if you call
     * xpc_connection_send_message() five times and then call
     * xpc_connection_send_barrier(), the barrier will be invoked after the fifth
     * message has been sent and its memory disposed of. You may safely cancel a
     * connection from within a barrier block.
     * 
     * If a barrier is issued after sending a message which expects a reply, the
     * behavior is the same as described above. The receipt of a reply message will
     * not influence when the barrier runs.
     * 
     * A barrier block can be useful for throttling resource consumption on the
     * connected side of a connection. For example, if your connection sends many
     * large messages, you can use a barrier to limit the number of messages that
     * are inflight at any given time. This can be particularly useful for messages
     * that contain kernel resources (like file descriptors) which have a system-
     * wide limit.
     * 
     * If a barrier is issued on a canceled connection, it will be invoked
     * immediately. If a connection has been canceled and still has outstanding
     * barriers, those barriers will be invoked as part of the connection's
     * unwinding process.
     * 
     * It is important to note that a barrier block's execution order is not
     * guaranteed with respect to other blocks that have been scheduled on the
     * target queue of the connection. Or said differently,
     * xpc_connection_send_barrier(3) is not equivalent to dispatch_async(3).
     * 
     * API-Since: 5.0
     * 
     * @param connection
     *                   The connection against which the barrier is to be issued.
     * 
     * @param barrier
     *                   The barrier block to issue. This barrier prevents concurrent message-send
     *                   activity on the connection. No messages will be sent while the barrier block
     *                   is executing.
     */
    @Generated
    @CFunction
    public static native void xpc_connection_send_barrier(@NotNull xpc_connection_t connection,
            @ObjCBlock(name = "call_xpc_connection_send_barrier") @NotNull Block_xpc_connection_send_barrier barrier);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_xpc_connection_send_barrier {
        @Generated
        void call_xpc_connection_send_barrier();
    }

    /**
     * [@function] xpc_connection_send_message_with_reply
     * Sends a message over the connection to the destination service and associates
     * a handler to be invoked when the remote service sends a reply message.
     * 
     * If the given GCD queue is a concurrent queue, XPC cannot guarantee that there
     * will not be multiple reply handlers being invoked concurrently. XPC does not
     * guarantee any ordering for the invocation of reply handlers. So if multiple
     * messages are waiting for replies and the connection goes invalid, there is no
     * guarantee that the reply handlers will be invoked in FIFO order. Similarly,
     * XPC does not guarantee that reply handlers will not run concurrently with
     * the connection's event handler in the case that the reply queue and the
     * connection's target queue are the same concurrent queue.
     * 
     * API-Since: 5.0
     * 
     * @param connection
     *                   The connection over which the message shall be sent.
     * 
     * @param message
     *                   The message to send. This must be a dictionary object.
     * 
     * @param replyq
     *                   The GCD queue to which the reply handler will be submitted. This may be a
     *                   concurrent queue.
     * 
     * @param handler
     *                   The handler block to invoke when a reply to the message is received from
     *                   the connection. If the remote service exits prematurely before the reply was
     *                   received, the XPC_ERROR_CONNECTION_INTERRUPTED error will be returned.
     *                   If the connection went invalid before the message could be sent, the
     *                   XPC_ERROR_CONNECTION_INVALID error will be returned.
     */
    @Generated
    @CFunction
    public static native void xpc_connection_send_message_with_reply(@NotNull xpc_connection_t connection,
            @NotNull VoidPtr message, @Nullable dispatch_queue_t replyq,
            @ObjCBlock(name = "call_xpc_connection_send_message_with_reply") @NotNull Block_xpc_connection_send_message_with_reply handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_xpc_connection_send_message_with_reply {
        @Generated
        void call_xpc_connection_send_message_with_reply(@NotNull VoidPtr object);
    }

    /**
     * [@function] xpc_connection_send_message_with_reply_sync
     * Sends a message over the connection and blocks the caller until a reply is
     * received.
     * 
     * This API supports priority inversion avoidance, and should be used instead of
     * combining xpc_connection_send_message_with_reply() with a semaphore.
     * 
     * Invoking this API from a queue that is a part of the target queue hierarchy
     * results in deadlocks under certain conditions.
     * 
     * Be judicious about your use of this API. It can block indefinitely, so if you
     * are using it to implement an API that can be called from the main thread, you
     * may wish to consider allowing the API to take a queue and callback block so
     * that results may be delivered asynchronously if possible.
     * 
     * API-Since: 5.0
     * 
     * @param connection
     *                   The connection over which the message shall be sent.
     * 
     * @param message
     *                   The message to send. This must be a dictionary object.
     * 
     * @return
     *         The message that the remote service sent in reply to the original message.
     *         If the remote service exits prematurely before the reply was received, the
     *         XPC_ERROR_CONNECTION_INTERRUPTED error will be returned. If the connection
     *         went invalid before the message could be sent, the
     *         XPC_ERROR_CONNECTION_INVALID error will be returned.
     * 
     *         You are responsible for releasing the returned object.
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_connection_send_message_with_reply_sync(@NotNull xpc_connection_t connection,
            @NotNull VoidPtr message);

    /**
     * [@function] xpc_connection_cancel
     * Cancels the connection and ensures that its event handler will not fire
     * again. After this call, any messages that have not yet been sent will be
     * discarded, and the connection will be unwound. If there are messages that are
     * awaiting replies, they will have their reply handlers invoked with the
     * XPC_ERROR_CONNECTION_INVALID error.
     * 
     * Cancellation is asynchronous and non-preemptive and therefore this method
     * will not interrupt the execution of an already-running event handler block.
     * If the event handler is executing at the time of this call, it will finish,
     * and then the connection will be canceled, causing a final invocation of the
     * event handler to be scheduled with the XPC_ERROR_CONNECTION_INVALID error.
     * After that invocation, there will be no further invocations of the event
     * handler.
     * 
     * The XPC runtime guarantees this non-preemptiveness even for concurrent target
     * queues.
     * 
     * API-Since: 5.0
     * 
     * @param connection
     *                   The connection object which is to be manipulated.
     */
    @Generated
    @CFunction
    public static native void xpc_connection_cancel(@NotNull xpc_connection_t connection);

    /**
     * [@function] xpc_connection_get_name
     * Returns the name of the service with which the connections was created.
     * 
     * @param connection
     *                   The connection object which is to be examined.
     * 
     * @return
     *         The name of the remote service. If you obtained the connection through an
     *         invocation of another connection's event handler, NULL is returned.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Nullable
    public static native String xpc_connection_get_name(@NotNull xpc_connection_t connection);

    /**
     * [@function] xpc_connection_get_euid
     * Returns the EUID of the remote peer.
     * 
     * @param connection
     *                   The connection object which is to be examined.
     * 
     * @return
     *         The EUID of the remote peer at the time the connection was made.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native int xpc_connection_get_euid(@NotNull xpc_connection_t connection);

    /**
     * [@function] xpc_connection_get_egid
     * Returns the EGID of the remote peer.
     * 
     * @param connection
     *                   The connection object which is to be examined.
     * 
     * @return
     *         The EGID of the remote peer at the time the connection was made.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native int xpc_connection_get_egid(@NotNull xpc_connection_t connection);

    /**
     * [@function] xpc_connection_set_context
     * Sets context on an connection.
     * 
     * If you must manage the memory of the context object, you must set a finalizer
     * to dispose of it. If this method is called on a connection which already has
     * context associated with it, the finalizer will NOT be invoked. The finalizer
     * is only invoked when the connection is being deallocated.
     * 
     * It is recommended that, instead of changing the actual context pointer
     * associated with the object, you instead change the state of the context
     * object itself.
     * 
     * API-Since: 5.0
     * 
     * @param connection
     *                   The connection which is to be manipulated.
     * 
     * @param context
     *                   The context to associate with the connection.
     */
    @Generated
    @CFunction
    public static native void xpc_connection_set_context(@NotNull xpc_connection_t connection,
            @Nullable VoidPtr context);

    /**
     * [@function] xpc_connection_get_context
     * Returns the context associated with the connection.
     * 
     * @param connection
     *                   The connection which is to be examined.
     * 
     * @return
     *         The context associated with the connection. NULL if there has been no context
     *         associated with the object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native VoidPtr xpc_connection_get_context(@NotNull xpc_connection_t connection);

    /**
     * [@function] xpc_connection_set_finalizer_f
     * Sets the finalizer for the given connection.
     * 
     * This method disposes of the context value associated with a connection, as
     * set by {@link xpc_connection_set_context}.
     * 
     * For many uses of context objects, this API allows for a convenient shorthand
     * for freeing them. For example, for a context object allocated with malloc(3):
     * 
     * xpc_connection_set_finalizer_f(object, free);
     * 
     * API-Since: 5.0
     * 
     * @param connection
     *                   The connection on which to set the finalizer.
     * 
     * @param finalizer
     *                   The function that will be invoked when the connection's retain count has
     *                   dropped to zero and is being torn down.
     */
    @Generated
    @CFunction
    public static native void xpc_connection_set_finalizer_f(@NotNull xpc_connection_t connection,
            @FunctionPtr(name = "call_xpc_connection_set_finalizer_f") @Nullable Function_xpc_connection_set_finalizer_f finalizer);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_xpc_connection_set_finalizer_f {
        @Generated
        void call_xpc_connection_set_finalizer_f(@Nullable VoidPtr arg0);
    }

    /**
     * [@function] xpc_connection_set_peer_entitlement_exists_requirement
     * Requires that the connection peer has the specified entitlement
     * 
     * This function will return an error promptly if the entitlement requirement is invalid.
     * 
     * It is a programming error to call multiple of the `xpc_connection_set_peer_*_requirement` family of functions on
     * the same
     * connection. If more complex combinations of requirements are required, use
     * `xpc_connection_set_peer_lightweight_code_requirement`.
     * 
     * All messages received on this connection will be checked to ensure that they come from a peer who satisfies the
     * requirement. For a listener connection, requests that do not satisfy the requirement are dropped. When a reply
     * is expected on the connection and the peer does not satisfy the requirement
     * `XPC_ERROR_PEER_CODE_SIGNING_REQUIREMENT`
     * will be delivered instead of the reply.
     * 
     * API-Since: 17.4
     * 
     * @param connection
     *                    The connection object which is to be modified
     * 
     * @param entitlement
     *                    The entitlement the peer must have
     *                    It is safe to deallocate the entitlement string after calling
     *                    `xpc_connection_set_peer_entitlement_exists_requirement`
     * 
     * @return
     *         0 on success, non-zero on error
     */
    @Generated
    @CFunction
    public static native int xpc_connection_set_peer_entitlement_exists_requirement(
            @NotNull xpc_connection_t connection,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String entitlement);

    /**
     * [@function] xpc_connection_set_peer_entitlement_matches_value_requirement
     * Requires that the connection peer has the specified entitlement with the matching value
     * 
     * This function will return an error promptly if the entitlement requirement is invalid.
     * 
     * It is a programming error to call multiple of the `xpc_connection_set_peer_*_requirement` family of functions on
     * the same
     * connection. If more complex combinations of requirements are required, use
     * `xpc_connection_set_peer_lightweight_code_requirement`.
     * 
     * All messages received on this connection will be checked to ensure that they come from a peer who satisfies the
     * requirement. For a listener connection, requests that do not satisfy the requirement are dropped. When a reply
     * is expected on the connection and the peer does not satisfy the requirement
     * `XPC_ERROR_PEER_CODE_SIGNING_REQUIREMENT`
     * will be delivered instead of the reply.
     * 
     * API-Since: 17.4
     * 
     * @param connection
     *                    The connection object which is to be modified
     * 
     * @param entitlement
     *                    The entitlement the peer must have
     *                    It is safe to deallocate the entitlement string after calling
     *                    `xpc_connection_set_peer_entitlement_matches_value_requirement`
     * 
     * @param value
     *                    The value that the entitlement must match
     *                    It is safe to deallocate the value object after calling
     *                    `xpc_connection_set_peer_entitlement_matches_value_requirement`.
     *                    Valid xpc types for this object are `XPC_TYPE_BOOL`, `XPC_TYPE_STRING` and `XPC_TYPE_INT64`.
     * 
     * @return
     *         0 on success, non-zero on error
     */
    @Generated
    @CFunction
    public static native int xpc_connection_set_peer_entitlement_matches_value_requirement(
            @NotNull xpc_connection_t connection,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String entitlement,
            @NotNull VoidPtr value);

    /**
     * [@function] xpc_connection_set_peer_team_identity_requirement
     * Requires that the connection peer has the specified identity and is signed with the same team identifier
     * as the current process
     * 
     * This function will return an error promptly if the identity requirement is invalid.
     * 
     * The peer process must be signed as either a Testflight app or an App store app,
     * or be signed by an apple issued development certificate, an enterprise distributed
     * certificate (embedded only), or a Developer ID certificate (macOS only)
     * 
     * It is a programming error to call multiple of the `xpc_connection_set_peer_*_requirement` family of functions on
     * the same
     * connection. If more complex combinations of requirements are required, use
     * `xpc_connection_set_peer_lightweight_code_requirement`.
     * 
     * All messages received on this connection will be checked to ensure that they come from a peer who satisfies the
     * requirement. For a listener connection, requests that do not satisfy the requirement are dropped. When a reply
     * is expected on the connection and the peer does not satisfy the requirement
     * `XPC_ERROR_PEER_CODE_SIGNING_REQUIREMENT`
     * will be delivered instead of the reply.
     * 
     * API-Since: 17.4
     * 
     * @param connection
     *                           The connection object which is to be modified
     * 
     * @param signing_identifier
     *                           The optional signing identifier the peer must have
     *                           It is safe to deallocate the signing identifier string after calling
     *                           `xpc_connection_set_peer_identity_requirement`
     * 
     * @return
     *         0 on success, non-zero on error
     */
    @Generated
    @CFunction
    public static native int xpc_connection_set_peer_team_identity_requirement(@NotNull xpc_connection_t connection,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Nullable String signing_identifier);

    /**
     * [@function] xpc_connection_set_peer_platform_identity_requirement
     * Requires that the connection peer has the specified identity and is signed by Apple
     * 
     * This function will return an error promptly if the identity requirement is invalid.
     * 
     * The peer process must be signed by Apple. Use `xpc_connection_set_peer_identity_requirement` if the peer
     * is not part of the OS.
     * 
     * It is a programming error to call multiple of the `xpc_connection_set_peer_*_requirement` family of functions on
     * the same
     * connection. If more complex combinations of requirements are required, use
     * `xpc_connection_set_peer_lightweight_code_requirement`.
     * 
     * All messages received on this connection will be checked to ensure that they come from a peer who satisfies the
     * requirement. For a listener connection, requests that do not satisfy the requirement are dropped. When a reply
     * is expected on the connection and the peer does not satisfy the requirement
     * `XPC_ERROR_PEER_CODE_SIGNING_REQUIREMENT`
     * will be delivered instead of the reply.
     * 
     * API-Since: 17.4
     * 
     * @param connection
     *                           The connection object which is to be modified
     * 
     * @param signing_identifier
     *                           The optional signing identifier the peer must have. If not specified, this function
     *                           ensures that the peer is signed by Apple
     *                           It is safe to deallocate the signing identifier string after calling
     *                           `xpc_connection_set_peer_identity_requirement`
     * 
     * @return
     *         0 on success, non-zero on error
     */
    @Generated
    @CFunction
    public static native int xpc_connection_set_peer_platform_identity_requirement(@NotNull xpc_connection_t connection,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Nullable String signing_identifier);

    /**
     * [@function] xpc_connection_set_peer_lightweight_code_requirement
     * Requires that the connection peer has the specified lightweight code requirement
     * 
     * This function will return an error promptly if the lightweight code requirement is invalid.
     * 
     * The lightweight code requirement must be an `xpc_dictionary_t` equivalent of an LWCR constraint (see
     * https://developer.apple.com/documentation/security/defining_launch_environment_and_library_constraints
     * for details on the contents of the dictionary)
     * 
     * The lightweight code requirement in the example below uses the $or operator to require that an
     * executable’s either signed with the Team ID 8XCUU22SN2, or is an operating system executable:
     * ```c
     * xpc_object_t or_val = xpc_dictionary_create_empty();
     * xpc_dictionary_set_string(or_val, "team-identifier", "8XCUU22SN2");
     * xpc_dictionary_set_int64(or_val, "validation-category", 1);
     * 
     * xpc_object_t lwcr = xpc_dictionary_create_empty();
     * xpc_dictionary_set_value(lwcr, "$or", or_val);
     * 
     * xpc_connection_set_peer_lightweight_code_requirement(connection, lwcr);
     * ```
     * 
     * It is a programming error to call multiple of the `xpc_connection_set_peer_*_requirement` family of functions on
     * the same
     * connection.
     * 
     * All messages received on this connection will be checked to ensure that they come from a peer who satisfies the
     * requirement. For a listener connection, requests that do not satisfy the requirement are dropped. When a reply
     * is expected on the connection and the peer does not satisfy the requirement
     * `XPC_ERROR_PEER_CODE_SIGNING_REQUIREMENT`
     * will be delivered instead of the reply.
     * 
     * API-Since: 17.4
     * 
     * @param connection
     *                   The connection object which is to be modified
     * 
     * @param lwcr
     *                   The lightweight code requirement the peer must have
     *                   It is safe to deallocate the lightweight code requirement object after calling
     *                   `xpc_connection_set_peer_lightweight_code_requirement`
     * 
     * @return
     *         0 on success, non-zero on error
     */
    @Generated
    @CFunction
    public static native int xpc_connection_set_peer_lightweight_code_requirement(@NotNull xpc_connection_t connection,
            @NotNull VoidPtr lwcr);

    /**
     * [@function] xpc_connection_copy_invalidation_reason
     * Returns a description of why the connection was invalidated.
     * 
     * @param connection
     *                   The connection object to inspect
     * 
     * @return
     *         Null if the connection has not been invalidated, otherwise a description for why the connection was
     *         invalidated.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native BytePtr xpc_connection_copy_invalidation_reason(@NotNull xpc_connection_t connection);

    /**
     * [@function] xpc_rich_error_copy_description
     * Copy the string description of an error.
     * 
     * @param error
     *              The error to be examined.
     * 
     * @return
     *         The underlying C string for the provided error. This string should be
     *         disposed of with free(3) when done.
     * 
     *         This will return NULL if a string description could not be generated.
     */
    @Generated
    @CFunction
    @Nullable
    public static native BytePtr xpc_rich_error_copy_description(@NotNull xpc_rich_error_t error);

    /**
     * [@function] xpc_rich_error_can_retry
     * Whether the operation the error originated from can be retried.
     * 
     * @param error
     *              The error to be inspected.
     * 
     * @return
     *         Whether the operation the error originated from can be retried.
     */
    @Generated
    @CFunction
    public static native boolean xpc_rich_error_can_retry(@NotNull xpc_rich_error_t error);

    /**
     * [@function] xpc_session_copy_description
     * Copy the string description of the session.
     * 
     * @param session
     *                The session to be examined.
     * 
     * @return
     *         The underlying C string description for the provided session. This string
     *         should be disposed of with free(3) when done. This will return NULL if a
     *         string description could not be generated.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native BytePtr xpc_session_copy_description(@NotNull xpc_session_t session);

    /**
     * [@function] xpc_session_set_incoming_message_handler
     * Set an incoming message handler for a session.
     * 
     * This can only be called on an inactive session. Calling this on a session
     * with an existing event handler will replace it.
     * 
     * API-Since: 16.0
     * 
     * @param session
     *                The session to set the handler for.
     * 
     * @param handler
     *                The handler block to be called when a message originated by the peer is
     *                received through the provided session.
     */
    @Generated
    @CFunction
    public static native void xpc_session_set_incoming_message_handler(@NotNull xpc_session_t session,
            @ObjCBlock(name = "call_xpc_session_set_incoming_message_handler") @NotNull Block_xpc_session_set_incoming_message_handler handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_xpc_session_set_incoming_message_handler {
        @Generated
        void call_xpc_session_set_incoming_message_handler(@NotNull VoidPtr message);
    }

    /**
     * [@function] xpc_session_set_cancel_handler
     * Set the cancel handler for a session.
     * 
     * This can only be called on an inactive session. Calling this on a session
     * with an existing cancel handler will replace the existing cancel handler with
     * the one provided.
     * 
     * API-Since: 16.0
     * 
     * @param session
     *                       The session to set the cancel handler for.
     * 
     * @param cancel_handler
     *                       The cancel handler block that will be executed when this session is canceled.
     */
    @Generated
    @CFunction
    public static native void xpc_session_set_cancel_handler(@NotNull xpc_session_t session,
            @ObjCBlock(name = "call_xpc_session_set_cancel_handler") @NotNull Block_xpc_session_set_cancel_handler cancel_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_xpc_session_set_cancel_handler {
        @Generated
        void call_xpc_session_set_cancel_handler(@NotNull xpc_rich_error_t error);
    }

    /**
     * [@function] xpc_session_set_target_queue
     * Set the target queue for a session.
     * 
     * This can only be called on an inactive session. Calling this on a session
     * with an existing target queue will replace the existing target queue with
     * the one provided.
     * 
     * API-Since: 17.0
     * 
     * @param session
     *                     The session to set the target queue for.
     * 
     * @param target_queue
     *                     The GCD queue onto which session events will be submitted. This may be a
     *                     concurrent queue. This parameter may be NULL, in which case the target queue
     *                     will be libdispatch's default target queue, defined as
     *                     DISPATCH_TARGET_QUEUE_DEFAULT.
     */
    @Generated
    @CFunction
    public static native void xpc_session_set_target_queue(@NotNull xpc_session_t session,
            @Nullable dispatch_queue_t target_queue);

    /**
     * [@function] xpc_session_activate
     * Activates a session.
     * 
     * xpc_session_activate must not be called on a session that has been already
     * activated. Releasing the last reference on an inactive session that was
     * created with an xpc_session_create*() will trigger an API misuse crash.
     * 
     * If activation fails, the session is automatically cancelled.
     * 
     * API-Since: 16.0
     * 
     * @param session
     *                  The session object to activate.
     * 
     * @param error_out
     *                  An out-parameter that, if set and in the event of an error, will point to an
     *                  {@link xpc_rich_error_t} describing the details of any errors that occurred.
     * 
     * @return
     *         Returns whether session activation succeeded.
     */
    @Generated
    @CFunction
    public static native boolean xpc_session_activate(@NotNull xpc_session_t session,
            @Nullable Ptr<xpc_rich_error_t> error_out);

    /**
     * [@function] xpc_session_cancel
     * Cancels the session. After this call, any messages that have not yet been
     * sent will be discarded, and the connection will be unwound. If there are
     * messages that are awaiting replies, they will have their reply handlers
     * invoked with an appropriate {@link xpc_rich_error_t}.
     * 
     * Session must have been activated to be canceled. Cancellation is asynchronous
     * and non-preemptive.
     * 
     * API-Since: 16.0
     * 
     * @param session
     *                The session object to cancel.
     */
    @Generated
    @CFunction
    public static native void xpc_session_cancel(@NotNull xpc_session_t session);

    /**
     * [@function] xpc_session_send_message
     * Sends a message over the session to the destination service.
     * 
     * Messages are delivered in FIFO order. This API is safe to call from multiple
     * GCD queues. There is no indication that a message was delivered successfully.
     * This is because even once the message has been successfully enqueued on the
     * remote end, there are no guarantees about when the runtime will dequeue the
     * message and invoke the other session's event handler block.
     * 
     * If this is invoked on an inactive session, one created using the
     * XPC_SESSION_CREATE_INACTIVE flag and hasn't yet been activated, the process
     * will crash.
     * 
     * API-Since: 16.0
     * 
     * @param session
     *                The session to send the message over.
     * 
     * @param message
     *                The message to send. This must be a dictionary object.
     * 
     * @return
     *         In the event of an error this will return an {@link xpc_rich_error_t}
     *         detailing the reasons for the failure. On success this return value will be
     *         NULL.
     */
    @Generated
    @CFunction
    @Nullable
    public static native xpc_rich_error_t xpc_session_send_message(@NotNull xpc_session_t session,
            @NotNull VoidPtr message);

    /**
     * [@function] xpc_session_send_message_with_reply_sync
     * Sends a message over the session to the destination service and blocks the
     * caller until a reply is received.
     * 
     * This API supports priority inversion avoidance and should be used instead of
     * combining xpc_session_send_message_with_reply_async with a semaphore.
     * 
     * If this is invoked on an inactive session, for example one created using the
     * XPC_SESSION_CREATE_INACTIVE flag that hasn't yet been activated, the process
     * will crash.
     * 
     * Invoking this API while the target queue is blocked would lead to deadlocks
     * in certain scenarios. For that reason, invoking it from the target queue
     * results in a crash.
     * 
     * Be judicious about your use of this API. It can block indefinitely, so if you
     * are using it to implement an API that can be called from the main queue, you
     * may wish to consider allowing the API to take a queue and callback block so
     * that results may be delivered asynchronously if possible.
     * 
     * API-Since: 16.0
     * 
     * @param session
     *                  The session over which the message will be sent.
     * 
     * @param message
     *                  The message to send. This must be a dictionary object.
     * 
     * @param error_out
     *                  If this parameter is provided, in the event of a failure it will point to an
     *                  {@link xpc_rich_error_t} describing the details of the error.
     * 
     * @return
     *         On success, this will return the reply message as an {@link xpc_object_t}.
     *         Otherwise NULL is returned.
     */
    @Generated
    @CFunction
    @Nullable
    public static native VoidPtr xpc_session_send_message_with_reply_sync(@NotNull xpc_session_t session,
            @NotNull VoidPtr message, @Nullable Ptr<xpc_rich_error_t> error_out);

    /**
     * [@function] xpc_session_send_message_with_reply_async
     * Sends a message over the session to the destination service and executes the
     * provided callback when a reply is received.
     * 
     * If this is invoked on an inactive session, for example one created using the
     * XPC_SESSION_CREATE_INACTIVE flag that hasn't yet been activated, the process
     * will crash.
     * 
     * If this is invoked on a cancelled session, this will generate a simulated
     * crash.
     * 
     * API-Since: 16.0
     * 
     * @param session
     *                      The session over which the message will be sent.
     * 
     * @param message
     *                      The message to send. This must be a dictionary object.
     * 
     * @param reply_handler
     *                      The handler block to invoke when a reply to the message is received from the
     *                      session. If the session is torn down before the reply was received, for
     *                      example if the remote service exits prematurely, this handler will be
     *                      executed and passed an appropriate {@link xpc_rich_error_t} object describing
     *                      the failure.
     */
    @Generated
    @CFunction
    public static native void xpc_session_send_message_with_reply_async(@NotNull xpc_session_t session,
            @NotNull VoidPtr message,
            @ObjCBlock(name = "call_xpc_session_send_message_with_reply_async") @NotNull Block_xpc_session_send_message_with_reply_async reply_handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_xpc_session_send_message_with_reply_async {
        @Generated
        void call_xpc_session_send_message_with_reply_async(@Nullable VoidPtr reply, @Nullable xpc_rich_error_t error);
    }

    /**
     * [@function] xpc_retain
     * 
     * Increments the reference count of an object.
     * 
     * Calls to xpc_retain() must be balanced with calls to xpc_release()
     * to avoid leaking memory.
     * 
     * API-Since: 5.0
     * 
     * @param object
     *               The object which is to be manipulated.
     * 
     * @return
     *         The object which was given.
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_retain(@NotNull VoidPtr object);

    /**
     * [@function] xpc_release
     * 
     * Decrements the reference count of an object.
     * 
     * The caller must take care to balance retains and releases. When creating or
     * retaining XPC objects, the creator obtains a reference on the object. Thus,
     * it is the caller's responsibility to call xpc_release() on those objects when
     * they are no longer needed.
     * 
     * API-Since: 5.0
     * 
     * @param object
     *               The object which is to be manipulated.
     */
    @Generated
    @CFunction
    public static native void xpc_release(@NotNull VoidPtr object);

    /**
     * [@function] xpc_get_type
     * 
     * Returns the type of an object.
     * 
     * @param object
     *               The object to examine.
     * 
     * @return
     *         An opaque pointer describing the type of the object. This pointer is suitable
     *         direct comparison to exported type constants with the equality operator.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native xpc_type_t xpc_get_type(@NotNull VoidPtr object);

    /**
     * [@function] xpc_type_get_name
     * 
     * Returns a string describing an XPC object type.
     * 
     * @param type
     *             The type to describe.
     * 
     * @return
     *         A string describing the type of an object, like "string" or "int64".
     *         This string should not be freed or modified.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @NotNull
    public static native String xpc_type_get_name(@NotNull xpc_type_t type);

    /**
     * [@function] xpc_copy
     * 
     * Creates a copy of the object.
     * 
     * When called on an array or dictionary, xpc_copy() will perform a deep copy.
     * 
     * The object returned is not necessarily guaranteed to be a new object, and
     * whether it is will depend on the implementation of the object being copied.
     * 
     * API-Since: 5.0
     * 
     * @param object
     *               The object to copy.
     * 
     * @return
     *         The new object. NULL if the object type does not support copying or if
     *         sufficient memory for the copy could not be allocated. Service objects do
     *         not support copying.
     */
    @Generated
    @CFunction
    @Nullable
    public static native VoidPtr xpc_copy(@NotNull VoidPtr object);

    /**
     * [@function] xpc_equal
     * 
     * Compares two objects for equality.
     * 
     * @param object1
     *                The first object to compare.
     * 
     * @param object2
     *                The second object to compare.
     * 
     * @return
     *         Returns true if the objects are equal, otherwise false. Two objects must be
     *         of the same type in order to be equal.
     * 
     *         For two arrays to be equal, they must contain the same values at the
     *         same indexes. For two dictionaries to be equal, they must contain the same
     *         values for the same keys.
     * 
     *         Two objects being equal implies that their hashes (as returned by xpc_hash())
     *         are also equal.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native boolean xpc_equal(@NotNull VoidPtr object1, @NotNull VoidPtr object2);

    /**
     * [@function] xpc_hash
     * 
     * Calculates a hash value for the given object.
     * 
     * Note that the computed hash values for any particular type and value of an
     * object can change from across releases and platforms and should not be
     * assumed to be constant across all time and space or stored persistently.
     * 
     * API-Since: 5.0
     * 
     * @param object
     *               The object for which to calculate a hash value. This value may be modded
     *               with a table size for insertion into a dictionary-like data structure.
     * 
     * @return
     *         The calculated hash value.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long xpc_hash(@NotNull VoidPtr object);

    /**
     * [@function] xpc_copy_description
     * 
     * Copies a debug string describing the object.
     * 
     * @param object
     *               The object which is to be examined.
     * 
     * @return
     *         A string describing object which contains information useful for debugging.
     *         This string should be disposed of with free(3) when done.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native BytePtr xpc_copy_description(@NotNull VoidPtr object);

    /**
     * [@function] xpc_null_create
     * 
     * Creates an XPC object representing the null object.
     * 
     * @return
     *         A new null object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_null_create();

    /**
     * [@function] xpc_bool_create
     * 
     * Creates an XPC Boolean object.
     * 
     * @param value
     *              The Boolean primitive value which is to be boxed.
     * 
     * @return
     *         A new Boolean object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_bool_create(boolean value);

    /**
     * [@function] xpc_bool_get_value
     * 
     * Returns the underlying Boolean value from the object.
     * 
     * @param xbool
     *              The Boolean object which is to be examined.
     * 
     * @return
     *         The underlying Boolean value or false if the given object was not an XPC
     *         Boolean object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native boolean xpc_bool_get_value(@NotNull VoidPtr xbool);

    /**
     * [@function] xpc_int64_create
     * 
     * Creates an XPC signed integer object.
     * 
     * @param value
     *              The signed integer value which is to be boxed.
     * 
     * @return
     *         A new signed integer object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_int64_create(long value);

    /**
     * [@function] xpc_int64_get_value
     * 
     * Returns the underlying signed 64-bit integer value from an object.
     * 
     * @param xint
     *             The signed integer object which is to be examined.
     * 
     * @return
     *         The underlying signed 64-bit value or 0 if the given object was not an XPC
     *         integer object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native long xpc_int64_get_value(@NotNull VoidPtr xint);

    /**
     * [@function] xpc_uint64_create
     * 
     * Creates an XPC unsigned integer object.
     * 
     * @param value
     *              The unsigned integer value which is to be boxed.
     * 
     * @return
     *         A new unsigned integer object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_uint64_create(long value);

    /**
     * [@function] xpc_uint64_get_value
     * 
     * Returns the underlying unsigned 64-bit integer value from an object.
     * 
     * @param xuint
     *              The unsigned integer object which is to be examined.
     * 
     * @return
     *         The underlying unsigned integer value or 0 if the given object was not an XPC
     *         unsigned integer object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native long xpc_uint64_get_value(@NotNull VoidPtr xuint);

    /**
     * [@function] xpc_double_create
     * 
     * Creates an XPC double object.
     * 
     * @param value
     *              The floating point quantity which is to be boxed.
     * 
     * @return
     *         A new floating point object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_double_create(double value);

    /**
     * [@function] xpc_double_get_value
     * 
     * Returns the underlying double-precision floating point value from an object.
     * 
     * @param xdouble
     *                The floating point object which is to be examined.
     * 
     * @return
     *         The underlying floating point value or NAN if the given object was not an XPC
     *         floating point object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native double xpc_double_get_value(@NotNull VoidPtr xdouble);

    /**
     * [@function] xpc_date_create
     * 
     * Creates an XPC date object.
     * 
     * @param interval
     *                 The date interval which is to be boxed. Negative values indicate the number
     *                 of nanoseconds before the epoch. Positive values indicate the number of
     *                 nanoseconds after the epoch.
     * 
     * @return
     *         A new date object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_date_create(long interval);

    /**
     * [@function] xpc_date_create_from_current
     * 
     * Creates an XPC date object representing the current date.
     * 
     * @return
     *         A new date object representing the current date.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_date_create_from_current();

    /**
     * [@function] xpc_date_get_value
     * 
     * Returns the underlying date interval from an object.
     * 
     * @param xdate
     *              The date object which is to be examined.
     * 
     * @return
     *         The underlying date interval or 0 if the given object was not an XPC date
     *         object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native long xpc_date_get_value(@NotNull VoidPtr xdate);

    /**
     * [@function] xpc_data_create
     * 
     * Creates an XPC object representing buffer of bytes.
     * 
     * This method will copy the buffer given into internal storage. After calling
     * this method, it is safe to dispose of the given buffer.
     * 
     * API-Since: 5.0
     * 
     * @param bytes
     *               The buffer of bytes which is to be boxed. You may create an empty data object
     *               by passing NULL for this parameter and 0 for the length. Passing NULL with
     *               any other length will result in undefined behavior.
     * 
     * @param length
     *               The number of bytes which are to be boxed.
     * 
     * @return
     *         A new data object.
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_data_create(@Nullable ConstVoidPtr bytes, @NUInt long length);

    /**
     * [@function] xpc_data_create_with_dispatch_data
     * 
     * Creates an XPC object representing buffer of bytes described by the given GCD
     * data object.
     * 
     * The object returned by this method will refer to the buffer returned by
     * dispatch_data_create_map(). The point where XPC will make the call to
     * dispatch_data_create_map() is undefined.
     * 
     * API-Since: 5.0
     * 
     * @param ddata
     *              The GCD data object containing the bytes which are to be boxed. This object
     *              is retained by the data object.
     * 
     * @return
     *         A new data object.
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_data_create_with_dispatch_data(@NotNull dispatch_data_t ddata);

    /**
     * [@function] xpc_data_get_length
     * 
     * Returns the length of the data encapsulated by an XPC data object.
     * 
     * @param xdata
     *              The data object which is to be examined.
     * 
     * @return
     *         The length of the underlying boxed data or 0 if the given object was not an
     *         XPC data object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long xpc_data_get_length(@NotNull VoidPtr xdata);

    /**
     * [@function] xpc_data_get_bytes_ptr
     * 
     * Returns a pointer to the internal storage of a data object.
     * 
     * @param xdata
     *              The data object which is to be examined.
     * 
     * @return
     *         A pointer to the underlying boxed data or NULL if the given object was not an
     *         XPC data object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native ConstVoidPtr xpc_data_get_bytes_ptr(@NotNull VoidPtr xdata);

    /**
     * [@function] xpc_data_get_bytes
     * 
     * Copies the bytes stored in an data objects into the specified buffer.
     * 
     * @param xdata
     *               The data object which is to be examined.
     * 
     * @param buffer
     *               The buffer in which to copy the data object's bytes.
     * 
     * @param off
     *               The offset at which to begin the copy. If this offset is greater than the
     *               length of the data element, nothing is copied. Pass 0 to start the copy
     *               at the beginning of the buffer.
     * 
     * @param length
     *               The length of the destination buffer.
     * 
     * @return
     *         The number of bytes that were copied into the buffer or 0 if the given object
     *         was not an XPC data object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long xpc_data_get_bytes(@NotNull VoidPtr xdata, @NotNull VoidPtr buffer, @NUInt long off,
            @NUInt long length);

    /**
     * [@function] xpc_string_create
     * 
     * Creates an XPC object representing a NUL-terminated C-string.
     * 
     * @param string
     *               The C-string which is to be boxed.
     * 
     * @return
     *         A new string object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_string_create(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String string);

    /**
     * [@function] xpc_string_create_with_format
     * 
     * Creates an XPC object representing a C-string that is generated from the
     * given format string and arguments.
     * 
     * @param fmt
     *            The printf(3)-style format string from which to construct the final C-string
     *            to be boxed.
     * 
     * @param ...
     *            The arguments which correspond to those specified in the format string.
     * 
     * @return
     *         A new string object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @Variadic()
    @CFunction
    @NotNull
    public static native VoidPtr xpc_string_create_with_format(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String fmt,
            Object... varargs);

    /**
     * [@function] xpc_string_create_with_format_and_arguments
     * 
     * Creates an XPC object representing a C-string that is generated from the
     * given format string and argument list pointer.
     * 
     * @param fmt
     *            The printf(3)-style format string from which to construct the final C-string
     *            to be boxed.
     * 
     * @param ap
     *            A pointer to the arguments which correspond to those specified in the format
     *            string.
     * 
     * @return
     *         A new string object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_string_create_with_format_and_arguments(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String fmt,
            BytePtr ap);

    /**
     * [@function] xpc_string_get_length
     * 
     * Returns the length of the underlying string.
     * 
     * @param xstring
     *                The string object which is to be examined.
     * 
     * @return
     *         The length of the underlying string, not including the NUL-terminator, or 0
     *         if the given object was not an XPC string object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long xpc_string_get_length(@NotNull VoidPtr xstring);

    /**
     * [@function] xpc_string_get_string_ptr
     * 
     * Returns a pointer to the internal storage of a string object.
     * 
     * @param xstring
     *                The string object which is to be examined.
     * 
     * @return
     *         A pointer to the string object's internal storage or NULL if the given object
     *         was not an XPC string object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Nullable
    public static native String xpc_string_get_string_ptr(@NotNull VoidPtr xstring);

    /**
     * [@function] xpc_uuid_get_bytes
     * 
     * Returns a pointer to the the boxed UUID bytes in an XPC UUID object.
     * 
     * @param xuuid
     *              The UUID object which is to be examined.
     * 
     * @return
     *         The underlying <code>uuid_t</code> bytes or NULL if the given object was not
     *         an XPC UUID object. The returned pointer may be safely passed to the uuid(3)
     *         APIs.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Nullable
    public static native String xpc_uuid_get_bytes(@NotNull VoidPtr xuuid);

    /**
     * [@function] xpc_fd_create
     * 
     * Creates an XPC object representing a POSIX file descriptor.
     * 
     * This method performs the equivalent of a dup(2) on the descriptor, and thus
     * it is safe to call close(2) on the descriptor after boxing it with a file
     * descriptor object.
     * 
     * IMPORTANT: Pointer equality is the ONLY valid test for equality between two
     * file descriptor objects. There is no reliable way to determine whether two
     * file descriptors refer to the same inode with the same capabilities, so two
     * file descriptor objects created from the same underlying file descriptor
     * number will not compare equally with xpc_equal(). This is also true of a
     * file descriptor object created using xpc_copy() and the original.
     * 
     * This also implies that two collections containing file descriptor objects
     * cannot be equal unless the exact same object was inserted into both.
     * 
     * API-Since: 5.0
     * 
     * @param fd
     *           The file descriptor which is to be boxed.
     * 
     * @return
     *         A new file descriptor object. NULL if sufficient memory could not be
     *         allocated or if the given file descriptor was not valid.
     */
    @Generated
    @CFunction
    @Nullable
    public static native VoidPtr xpc_fd_create(int fd);

    /**
     * [@function] xpc_fd_dup
     * 
     * Returns a file descriptor that is equivalent to the one boxed by the file
     * file descriptor object.
     * 
     * Multiple invocations of xpc_fd_dup() will not return the same file descriptor
     * number, but they will return descriptors that are equivalent, as though they
     * had been created by dup(2).
     * 
     * The caller is responsible for calling close(2) on the returned descriptor.
     * 
     * API-Since: 5.0
     * 
     * @param xfd
     *            The file descriptor object which is to be examined.
     * 
     * @return
     *         A file descriptor that is equivalent to the one originally given to
     *         xpc_fd_create(). If the descriptor could not be created or if the given
     *         object was not an XPC file descriptor, -1 is returned.
     */
    @Generated
    @CFunction
    public static native int xpc_fd_dup(@NotNull VoidPtr xfd);

    /**
     * [@function] xpc_shmem_create
     * 
     * Creates an XPC object representing the given shared memory region.
     * 
     * Only memory regions whose exact characteristics are known to the caller
     * should be boxed using this API. Memory returned from malloc(3) may not be
     * safely shared on either OS X or iOS because the underlying virtual memory
     * objects for malloc(3)ed allocations are owned by the malloc(3) subsystem and
     * not the caller of malloc(3).
     * 
     * If you wish to share a memory region that you receive from another subsystem,
     * part of the interface contract with that other subsystem must include how to
     * create the region of memory, or sharing it may be unsafe.
     * 
     * Certain operations may internally fragment a region of memory in a way that
     * would truncate the range detected by the shared memory object. vm_copy(), for
     * example, may split the region into multiple parts to avoid copying certain
     * page ranges. For this reason, it is recommended that you delay all VM
     * operations until the shared memory object has been created so that the VM
     * system knows that the entire range is intended for sharing.
     * 
     * API-Since: 5.0
     * 
     * @param region
     *               A pointer to a region of shared memory, created through a call to mmap(2)
     *               with the MAP_SHARED flag, which is to be boxed.
     * 
     * @param length
     *               The length of the region.
     * 
     * @return
     *         A new shared memory object.
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_shmem_create(@NotNull VoidPtr region, @NUInt long length);

    /**
     * [@function] xpc_shmem_map
     * 
     * Maps the region boxed by the XPC shared memory object into the caller's
     * address space.
     * 
     * The resulting region must be disposed of with munmap(2).
     * 
     * It is the responsibility of the caller to manage protections on the new
     * region accordingly.
     * 
     * API-Since: 5.0
     * 
     * @param xshmem
     *               The shared memory object to be examined.
     * 
     * @param region
     *               On return, this will point to the region at which the shared memory was
     *               mapped.
     * 
     * @return
     *         The length of the region that was mapped. If the mapping failed or if the
     *         given object was not an XPC shared memory object, 0 is returned. The length
     *         of the mapped region will always be an integral page size, even if the
     *         creator of the region specified a non-integral page size.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long xpc_shmem_map(@NotNull VoidPtr xshmem, @NotNull Ptr<VoidPtr> region);

    /**
     * [@function] xpc_array_create
     * 
     * Creates an XPC object representing an array of XPC objects.
     * 
     * This array must be contiguous and cannot contain any NULL values. If you
     * wish to insert the equivalent of a NULL value, you may use the result of
     * {@link xpc_null_create}.
     * 
     * @param objects
     *                An array of XPC objects which is to be boxed. The order of this array is
     *                preserved in the object. If this array contains a NULL value, the behavior
     *                is undefined. This parameter may be NULL only if the count is 0.
     * 
     * @param count
     *                The number of objects in the given array. If the number passed is less than
     *                the actual number of values in the array, only the specified number of items
     *                are inserted into the resulting array. If the number passed is more than
     *                the the actual number of values, the behavior is undefined.
     * 
     * @return
     *         A new array object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_array_create(@Nullable ConstPtr<VoidPtr> objects, @NUInt long count);

    /**
     * [@function] xpc_array_create_empty
     * 
     * Creates an XPC object representing an array of XPC objects.
     * 
     * @return
     *         A new array object.
     * 
     * @see
     *      xpc_array_create
     * 
     *      API-Since: 14.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_array_create_empty();

    /**
     * [@function] xpc_array_set_value
     * 
     * Inserts the specified object into the array at the specified index.
     * 
     * @param xarray
     *               The array object which is to be manipulated.
     * 
     * @param index
     *               The index at which to insert the value. This value must lie within the index
     *               space of the array (0 to N-1 inclusive, where N is the count of the array).
     *               If the index is outside that range, the behavior is undefined.
     * 
     * @param value
     *               The object to insert. This value is retained by the array and cannot be
     *               NULL. If there is already a value at the specified index, it is released,
     *               and the new value is inserted in its place.
     * 
     *               API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_array_set_value(@NotNull VoidPtr xarray, @NUInt long index, @NotNull VoidPtr value);

    /**
     * [@function] xpc_array_append_value
     * 
     * Appends an object to an XPC array.
     * 
     * @param xarray
     *               The array object which is to be manipulated.
     * 
     * @param value
     *               The object to append. This object is retained by the array.
     * 
     *               API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_array_append_value(@NotNull VoidPtr xarray, @NotNull VoidPtr value);

    /**
     * [@function] xpc_array_get_count
     * 
     * Returns the count of values currently in the array.
     * 
     * @param xarray
     *               The array object which is to be examined.
     * 
     * @return
     *         The count of values in the array or 0 if the given object was not an XPC
     *         array.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long xpc_array_get_count(@NotNull VoidPtr xarray);

    /**
     * [@function] xpc_array_get_value
     * 
     * Returns the value at the specified index in the array.
     * 
     * This method does not grant the caller a reference to the underlying object,
     * and thus the caller is not responsible for releasing the object.
     * 
     * API-Since: 5.0
     * 
     * @param xarray
     *               The array object which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the range of
     *               indexes as specified in xpc_array_set_value().
     * 
     * @return
     *         The object at the specified index within the array or NULL if the given
     *         object was not an XPC array.
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_array_get_value(@NotNull VoidPtr xarray, @NUInt long index);

    /**
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native boolean xpc_array_apply(@NotNull VoidPtr xarray,
            @ObjCBlock(name = "call_xpc_array_apply") @NotNull Block_xpc_array_apply applier);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_xpc_array_apply {
        @Generated
        boolean call_xpc_array_apply(@NUInt long index, @NotNull VoidPtr value);
    }

    /**
     * [@function] xpc_array_set_bool
     * 
     * Inserts a <code>bool</code> (primitive) value into an array.
     * 
     * @param xarray
     *               The array object which is to be manipulated.
     * 
     * @param index
     *               The index at which to insert the value. This value must lie within the index
     *               space of the array (0 to N-1 inclusive, where N is the count of the array) or
     *               be XPC_ARRAY_APPEND. If the index is outside that range, the behavior is
     *               undefined.
     * 
     * @param value
     *               The <code>bool</code> value to insert. After calling this method, the XPC
     *               object corresponding to the primitive value inserted may be safely retrieved
     *               with {@link xpc_array_get_value()}.
     * 
     *               API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_array_set_bool(@NotNull VoidPtr xarray, @NUInt long index, boolean value);

    /**
     * [@function] xpc_array_set_int64
     * 
     * Inserts an <code>int64_t</code> (primitive) value into an array.
     * 
     * @param xarray
     *               The array object which is to be manipulated.
     * 
     * @param index
     *               The index at which to insert the value. This value must lie within the index
     *               space of the array (0 to N-1 inclusive, where N is the count of the array) or
     *               be XPC_ARRAY_APPEND. If the index is outside that range, the behavior is
     *               undefined.
     * 
     * @param value
     *               The <code>int64_t</code> value to insert. After calling this method, the XPC
     *               object corresponding to the primitive value inserted may be safely retrieved
     *               with {@link xpc_array_get_value()}.
     * 
     *               API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_array_set_int64(@NotNull VoidPtr xarray, @NUInt long index, long value);

    /**
     * [@function] xpc_array_set_uint64
     * 
     * Inserts a <code>uint64_t</code> (primitive) value into an array.
     * 
     * @param xarray
     *               The array object which is to be manipulated.
     * 
     * @param index
     *               The index at which to insert the value. This value must lie within the index
     *               space of the array (0 to N-1 inclusive, where N is the count of the array) or
     *               be XPC_ARRAY_APPEND. If the index is outside that range, the behavior is
     *               undefined.
     * 
     * @param value
     *               The <code>uint64_t</code> value to insert. After calling this method, the XPC
     *               object corresponding to the primitive value inserted may be safely retrieved
     *               with {@link xpc_array_get_value()}.
     * 
     *               API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_array_set_uint64(@NotNull VoidPtr xarray, @NUInt long index, long value);

    /**
     * [@function] xpc_array_set_double
     * 
     * Inserts a <code>double</code> (primitive) value into an array.
     * 
     * @param xarray
     *               The array object which is to be manipulated.
     * 
     * @param index
     *               The index at which to insert the value. This value must lie within the index
     *               space of the array (0 to N-1 inclusive, where N is the count of the array) or
     *               be XPC_ARRAY_APPEND. If the index is outside that range, the behavior is
     *               undefined.
     * 
     * @param value
     *               The <code>double</code> value to insert. After calling this method, the XPC
     *               object corresponding to the primitive value inserted may be safely retrieved
     *               with {@link xpc_array_get_value()}.
     * 
     *               API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_array_set_double(@NotNull VoidPtr xarray, @NUInt long index, double value);

    /**
     * [@function] xpc_array_set_date
     * 
     * Inserts a date value into an array.
     * 
     * @param xarray
     *               The array object which is to be manipulated.
     * 
     * @param index
     *               The index at which to insert the value. This value must lie within the index
     *               space of the array (0 to N-1 inclusive, where N is the count of the array) or
     *               be XPC_ARRAY_APPEND. If the index is outside that range, the behavior is
     *               undefined.
     * 
     * @param value
     *               The date value to insert, represented as an <code>int64_t</code>. After
     *               calling this method, the XPC object corresponding to the primitive value
     *               inserted may be safely retrieved with {@link xpc_array_get_value()}.
     * 
     *               API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_array_set_date(@NotNull VoidPtr xarray, @NUInt long index, long value);

    /**
     * [@function] xpc_array_set_data
     * 
     * Inserts a raw data value into an array.
     * 
     * @param xarray
     *               The array object which is to be manipulated.
     * 
     * @param index
     *               The index at which to insert the value. This value must lie within the index
     *               space of the array (0 to N-1 inclusive, where N is the count of the array) or
     *               be XPC_ARRAY_APPEND. If the index is outside that range, the behavior is
     *               undefined.
     * 
     * @param bytes
     *               The raw data to insert. After calling this method, the XPC object
     *               corresponding to the primitive value inserted may be safely retrieved with
     *               {@link xpc_array_get_value()}.
     * 
     * @param length
     *               The length of the data.
     * 
     *               API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_array_set_data(@NotNull VoidPtr xarray, @NUInt long index,
            @NotNull ConstVoidPtr bytes, @NUInt long length);

    /**
     * [@function] xpc_array_set_string
     * 
     * Inserts a C string into an array.
     * 
     * @param xarray
     *               The array object which is to be manipulated.
     * 
     * @param index
     *               The index at which to insert the value. This value must lie within the index
     *               space of the array (0 to N-1 inclusive, where N is the count of the array) or
     *               be XPC_ARRAY_APPEND. If the index is outside that range, the behavior is
     *               undefined.
     * 
     * @param string
     *               The C string to insert. After calling this method, the XPC object
     *               corresponding to the primitive value inserted may be safely retrieved with
     *               {@link xpc_array_get_value()}.
     * 
     *               API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_array_set_string(@NotNull VoidPtr xarray, @NUInt long index,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String string);

    /**
     * [@function] xpc_array_set_fd
     * 
     * Inserts a file descriptor into an array.
     * 
     * @param xarray
     *               The array object which is to be manipulated.
     * 
     * @param index
     *               The index at which to insert the value. This value must lie within the index
     *               space of the array (0 to N-1 inclusive, where N is the count of the array) or
     *               be XPC_ARRAY_APPEND. If the index is outside that range, the behavior is
     *               undefined.
     * 
     * @param fd
     *               The file descriptor to insert. After calling this method, the XPC object
     *               corresponding to the primitive value inserted may be safely retrieved with
     *               {@link xpc_array_get_value()}.
     * 
     *               API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_array_set_fd(@NotNull VoidPtr xarray, @NUInt long index, int fd);

    /**
     * [@function] xpc_array_set_connection
     * 
     * Inserts a connection into an array.
     * 
     * @param xarray
     *                   The array object which is to be manipulated.
     * 
     * @param index
     *                   The index at which to insert the value. This value must lie within the index
     *                   space of the array (0 to N-1 inclusive, where N is the count of the array) or
     *                   be XPC_ARRAY_APPEND. If the index is outside that range, the behavior is
     *                   undefined.
     * 
     * @param connection
     *                   The connection to insert. After calling this method, the XPC object
     *                   corresponding to the primitive value inserted may be safely retrieved with
     *                   {@link xpc_array_get_value()}. The connection is NOT retained by the array.
     * 
     *                   API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_array_set_connection(@NotNull VoidPtr xarray, @NUInt long index,
            @NotNull xpc_connection_t connection);

    /**
     * [@function] xpc_array_get_bool
     * 
     * Gets a <code>bool</code> primitive value from an array directly.
     * 
     * @param xarray
     *               The array which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the index space
     *               of the array (0 to N-1 inclusive, where N is the count of the array). If the
     *               index is outside that range, the behavior is undefined.
     * 
     * @return
     *         The underlying <code>bool</code> value at the specified index. false if the
     *         value at the specified index is not a Boolean value.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native boolean xpc_array_get_bool(@NotNull VoidPtr xarray, @NUInt long index);

    /**
     * [@function] xpc_array_get_int64
     * 
     * Gets an <code>int64_t</code> primitive value from an array directly.
     * 
     * @param xarray
     *               The array which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the index space
     *               of the array (0 to N-1 inclusive, where N is the count of the array). If the
     *               index is outside that range, the behavior is undefined.
     * 
     * @return
     *         The underlying <code>int64_t</code> value at the specified index. 0 if the
     *         value at the specified index is not a signed integer value.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native long xpc_array_get_int64(@NotNull VoidPtr xarray, @NUInt long index);

    /**
     * [@function] xpc_array_get_uint64
     * 
     * Gets a <code>uint64_t</code> primitive value from an array directly.
     * 
     * @param xarray
     *               The array which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the index space
     *               of the array (0 to N-1 inclusive, where N is the count of the array). If the
     *               index is outside that range, the behavior is undefined.
     * 
     * @return
     *         The underlying <code>uint64_t</code> value at the specified index. 0 if the
     *         value at the specified index is not an unsigned integer value.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native long xpc_array_get_uint64(@NotNull VoidPtr xarray, @NUInt long index);

    /**
     * [@function] xpc_array_get_double
     * 
     * Gets a <code>double</code> primitive value from an array directly.
     * 
     * @param xarray
     *               The array which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the index space
     *               of the array (0 to N-1 inclusive, where N is the count of the array). If the
     *               index is outside that range, the behavior is undefined.
     * 
     * @return
     *         The underlying <code>double</code> value at the specified index. NAN if the
     *         value at the specified index is not a floating point value.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native double xpc_array_get_double(@NotNull VoidPtr xarray, @NUInt long index);

    /**
     * [@function] xpc_array_get_date
     * 
     * Gets a date interval from an array directly.
     * 
     * @param xarray
     *               The array which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the index space
     *               of the array (0 to N-1 inclusive, where N is the count of the array). If the
     *               index is outside that range, the behavior is undefined.
     * 
     * @return
     *         The underlying date interval at the specified index. 0 if the value at the
     *         specified index is not a date value.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native long xpc_array_get_date(@NotNull VoidPtr xarray, @NUInt long index);

    /**
     * [@function] xpc_array_get_data
     * 
     * Gets a pointer to the raw bytes of a data object from an array directly.
     * 
     * @param xarray
     *               The array which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the index space
     *               of the array (0 to N-1 inclusive, where N is the count of the array). If the
     *               index is outside that range, the behavior is undefined.
     * 
     * @param length
     *               Upon return output, will contain the length of the data corresponding to the
     *               specified key.
     * 
     * @return
     *         The underlying bytes at the specified index. NULL if the value at the
     *         specified index is not a data value.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native ConstVoidPtr xpc_array_get_data(@NotNull VoidPtr xarray, @NUInt long index,
            @Nullable NUIntPtr length);

    /**
     * [@function] xpc_array_get_string
     * 
     * Gets a C string value from an array directly.
     * 
     * @param xarray
     *               The array which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the index space
     *               of the array (0 to N-1 inclusive, where N is the count of the array). If the
     *               index is outside that range, the behavior is undefined.
     * 
     * @return
     *         The underlying C string at the specified index. NULL if the value at the
     *         specified index is not a C string value.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Nullable
    public static native String xpc_array_get_string(@NotNull VoidPtr xarray, @NUInt long index);

    /**
     * [@function] xpc_array_get_uuid
     * 
     * Gets a <code>uuid_t</code> value from an array directly.
     * 
     * @param xarray
     *               The array which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the index space
     *               of the array (0 to N-1 inclusive, where N is the count of the array). If the
     *               index is outside that range, the behavior is undefined.
     * 
     * @return
     *         The underlying <code>uuid_t</code> value at the specified index. The null
     *         UUID if the value at the specified index is not a UUID value. The returned
     *         pointer may be safely passed to the uuid(3) APIs.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Nullable
    public static native String xpc_array_get_uuid(@NotNull VoidPtr xarray, @NUInt long index);

    /**
     * [@function] xpc_array_dup_fd
     * 
     * Gets a file descriptor from an array directly.
     * 
     * @param xarray
     *               The array which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the index space
     *               of the array (0 to N-1 inclusive, where N is the count of the array). If the
     *               index is outside that range, the behavior is undefined.
     * 
     * @return
     *         A new file descriptor created from the value at the specified index. You are
     *         responsible for close(2)ing this descriptor. -1 if the value at the specified
     *         index is not a file descriptor value.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native int xpc_array_dup_fd(@NotNull VoidPtr xarray, @NUInt long index);

    /**
     * [@function] xpc_array_create_connection
     * 
     * Creates a connection object from an array directly.
     * 
     * @param xarray
     *               The array which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the index space
     *               of the array (0 to N-1 inclusive, where N is the count of the array). If the
     *               index is outside that range, the behavior is undefined.
     * 
     * @return
     *         A new connection created from the value at the specified index. You are
     *         responsible for calling xpc_release() on the returned connection. NULL if the
     *         value at the specified index is not an endpoint containing a connection. Each
     *         call to this method for the same index in the same array will yield a
     *         different connection. See {@link xpc_connection_create_from_endpoint()} for
     *         discussion as to the responsibilities when dealing with the returned
     *         connection.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native xpc_connection_t xpc_array_create_connection(@NotNull VoidPtr xarray, @NUInt long index);

    /**
     * [@function] xpc_array_get_dictionary
     * 
     * Returns the dictionary at the specified index in the array.
     * 
     * This method does not grant the caller a reference to the underlying object,
     * and thus the caller is not responsible for releasing the object.
     * 
     * API-Since: 9.0
     * 
     * @param xarray
     *               The array object which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the range of
     *               indexes as specified in xpc_array_set_value().
     * 
     * @return
     *         The object at the specified index within the array or NULL if the given
     *         object was not an XPC array or if the the value at the specified index was
     *         not a dictionary.
     */
    @Generated
    @CFunction
    @Nullable
    public static native VoidPtr xpc_array_get_dictionary(@NotNull VoidPtr xarray, @NUInt long index);

    /**
     * [@function] xpc_array_get_array
     * 
     * Returns the array at the specified index in the array.
     * 
     * This method does not grant the caller a reference to the underlying object,
     * and thus the caller is not responsible for releasing the object.
     * 
     * API-Since: 9.0
     * 
     * @param xarray
     *               The array object which is to be examined.
     * 
     * @param index
     *               The index of the value to obtain. This value must lie within the range of
     *               indexes as specified in xpc_array_set_value().
     * 
     * @return
     *         The object at the specified index within the array or NULL if the given
     *         object was not an XPC array or if the the value at the specified index was
     *         not an array.
     */
    @Generated
    @CFunction
    @Nullable
    public static native VoidPtr xpc_array_get_array(@NotNull VoidPtr xarray, @NUInt long index);

    /**
     * [@function] xpc_dictionary_create
     * 
     * Creates an XPC object representing a dictionary of XPC objects keyed to
     * C-strings.
     * 
     * @param keys
     *               An array of C-strings that are to be the keys for the values to be inserted.
     *               Each element of this array is copied into the dictionary's internal storage.
     *               Elements of this array may NOT be NULL.
     * 
     * @param values
     *               A C-array that is parallel to the array of keys, consisting of objects that
     *               are to be inserted. Each element in this array is retained. Elements in this
     *               array may be NULL.
     * 
     * @param count
     *               The number of key/value pairs in the given arrays. If the count is less than
     *               the actual count of values, only that many key/value pairs will be inserted
     *               into the dictionary.
     * 
     *               If the count is more than the the actual count of key/value pairs, the
     *               behavior is undefined. If one array is NULL and the other is not, the
     *               behavior is undefined. If both arrays are NULL and the count is non-0, the
     *               behavior is undefined.
     * 
     * @return
     *         The new dictionary object.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_dictionary_create(
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) @Nullable String[] keys,
            @Nullable ConstPtr<VoidPtr> values, @NUInt long count);

    /**
     * [@function] xpc_dictionary_create_empty
     * 
     * Creates an XPC object representing a dictionary of XPC objects keyed to
     * C-strings.
     * 
     * @return
     *         The new dictionary object.
     * 
     * @see
     *      xpc_dictionary_create
     * 
     *      API-Since: 14.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native VoidPtr xpc_dictionary_create_empty();

    /**
     * [@function] xpc_dictionary_create_reply
     * 
     * Creates a dictionary that is in reply to the given dictionary.
     * 
     * After completing successfully on a dictionary, this method may not be called
     * again on that same dictionary. Attempts to do so will return NULL.
     * 
     * When this dictionary is sent across the reply connection, the remote end's
     * reply handler is invoked.
     * 
     * API-Since: 5.0
     * 
     * @param original
     *                 The original dictionary that is to be replied to.
     * 
     * @return
     *         The new dictionary object. NULL if the object was not a dictionary with a
     *         reply context.
     */
    @Generated
    @CFunction
    @Nullable
    public static native VoidPtr xpc_dictionary_create_reply(@NotNull VoidPtr original);

    /**
     * [@function] xpc_dictionary_set_value
     * 
     * Sets the value for the specified key to the specified object.
     * 
     * @param xdict
     *              The dictionary object which is to be manipulated.
     * 
     * @param key
     *              The key for which the value shall be set.
     * 
     * @param value
     *              The object to insert. The object is retained by the dictionary. If there
     *              already exists a value for the specified key, the old value is released
     *              and overwritten by the new value. This parameter may be NULL, in which case
     *              the value corresponding to the specified key is deleted if present.
     * 
     *              API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_dictionary_set_value(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key,
            @Nullable VoidPtr value);

    /**
     * [@function] xpc_dictionary_get_value
     * 
     * Returns the value for the specified key.
     * 
     * This method does not grant the caller a reference to the underlying object,
     * and thus the caller is not responsible for releasing the object.
     * 
     * API-Since: 5.0
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         The object for the specified key within the dictionary. NULL if there is no
     *         value associated with the specified key or if the given object was not an
     *         XPC dictionary.
     */
    @Generated
    @CFunction
    @Nullable
    public static native VoidPtr xpc_dictionary_get_value(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    /**
     * [@function] xpc_dictionary_get_count
     * 
     * Returns the number of values stored in the dictionary.
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @return
     *         The number of values stored in the dictionary or 0 if the given object was
     *         not an XPC dictionary. Calling xpc_dictionary_set_value() with a non-NULL
     *         value will increment the count. Calling xpc_dictionary_set_value() with a
     *         NULL value will decrement the count.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long xpc_dictionary_get_count(@NotNull VoidPtr xdict);

    /**
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native boolean xpc_dictionary_apply(@NotNull VoidPtr xdict,
            @ObjCBlock(name = "call_xpc_dictionary_apply") @NotNull Block_xpc_dictionary_apply applier);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_xpc_dictionary_apply {
        @Generated
        boolean call_xpc_dictionary_apply(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) @NotNull String key,
                @NotNull VoidPtr value);
    }

    /**
     * [@function] xpc_dictionary_get_remote_connection
     * 
     * Returns the connection from which the dictionary was received.
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @return
     *         If the dictionary was received by a connection event handler or a dictionary
     *         created through xpc_dictionary_create_reply(), a connection object over which
     *         a reply message can be sent is returned. For any other dictionary, NULL is
     *         returned.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native xpc_connection_t xpc_dictionary_get_remote_connection(@NotNull VoidPtr xdict);

    /**
     * [@function] xpc_dictionary_set_bool
     * 
     * Inserts a <code>bool</code> (primitive) value into a dictionary.
     * 
     * @param xdict
     *              The dictionary which is to be manipulated.
     * 
     * @param key
     *              The key for which the primitive value shall be set.
     * 
     * @param value
     *              The <code>bool</code> value to insert. After calling this method, the XPC
     *              object corresponding to the primitive value inserted may be safely retrieved
     *              with {@link xpc_dictionary_get_value()}.
     * 
     *              API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_dictionary_set_bool(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key,
            boolean value);

    /**
     * [@function] xpc_dictionary_set_int64
     * 
     * Inserts an <code>int64_t</code> (primitive) value into a dictionary.
     * 
     * @param xdict
     *              The dictionary which is to be manipulated.
     * 
     * @param key
     *              The key for which the primitive value shall be set.
     * 
     * @param value
     *              The <code>int64_t</code> value to insert. After calling this method, the XPC
     *              object corresponding to the primitive value inserted may be safely retrieved
     *              with {@link xpc_dictionary_get_value()}.
     * 
     *              API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_dictionary_set_int64(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key,
            long value);

    /**
     * [@function] xpc_dictionary_set_uint64
     * 
     * Inserts a <code>uint64_t</code> (primitive) value into a dictionary.
     * 
     * @param xdict
     *              The dictionary which is to be manipulated.
     * 
     * @param key
     *              The key for which the primitive value shall be set.
     * 
     * @param value
     *              The <code>uint64_t</code> value to insert. After calling this method, the XPC
     *              object corresponding to the primitive value inserted may be safely retrieved
     *              with {@link xpc_dictionary_get_value()}.
     * 
     *              API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_dictionary_set_uint64(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key,
            long value);

    /**
     * [@function] xpc_dictionary_set_double
     * 
     * Inserts a <code>double</code> (primitive) value into a dictionary.
     * 
     * @param xdict
     *              The dictionary which is to be manipulated.
     * 
     * @param key
     *              The key for which the primitive value shall be set.
     * 
     * @param value
     *              The <code>double</code> value to insert. After calling this method, the XPC
     *              object corresponding to the primitive value inserted may be safely retrieved
     *              with {@link xpc_dictionary_get_value()}.
     * 
     *              API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_dictionary_set_double(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key,
            double value);

    /**
     * [@function] xpc_dictionary_set_date
     * 
     * Inserts a date (primitive) value into a dictionary.
     * 
     * @param xdict
     *              The dictionary which is to be manipulated.
     * 
     * @param key
     *              The key for which the primitive value shall be set.
     * 
     * @param value
     *              The date value to insert. After calling this method, the XPC object
     *              corresponding to the primitive value inserted may be safely retrieved with
     *              {@link xpc_dictionary_get_value()}.
     * 
     *              API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_dictionary_set_date(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key,
            long value);

    /**
     * [@function] xpc_dictionary_set_data
     * 
     * Inserts a raw data value into a dictionary.
     * 
     * @param xdict
     *               The dictionary which is to be manipulated.
     * 
     * @param key
     *               The key for which the primitive value shall be set.
     * 
     * @param bytes
     *               The bytes to insert. After calling this method, the XPC object corresponding
     *               to the primitive value inserted may be safely retrieved with
     *               {@link xpc_dictionary_get_value()}.
     * 
     * @param length
     *               The length of the data.
     * 
     *               API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_dictionary_set_data(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key,
            @NotNull ConstVoidPtr bytes, @NUInt long length);

    /**
     * [@function] xpc_dictionary_set_string
     * 
     * Inserts a C string value into a dictionary.
     * 
     * @param xdict
     *               The dictionary which is to be manipulated.
     * 
     * @param key
     *               The key for which the primitive value shall be set.
     * 
     * @param string
     *               The C string to insert. After calling this method, the XPC object
     *               corresponding to the primitive value inserted may be safely retrieved with
     *               {@link xpc_dictionary_get_value()}.
     * 
     *               API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_dictionary_set_string(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String string);

    /**
     * [@function] xpc_dictionary_set_fd
     * 
     * Inserts a file descriptor into a dictionary.
     * 
     * @param xdict
     *              The dictionary which is to be manipulated.
     * 
     * @param key
     *              The key for which the primitive value shall be set.
     * 
     * @param fd
     *              The file descriptor to insert. After calling this method, the XPC object
     *              corresponding to the primitive value inserted may be safely retrieved
     *              with {@link xpc_dictionary_get_value()}.
     * 
     *              API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_dictionary_set_fd(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key,
            int fd);

    /**
     * [@function] xpc_dictionary_set_connection
     * 
     * Inserts a connection into a dictionary.
     * 
     * @param xdict
     *                   The dictionary which is to be manipulated.
     * 
     * @param key
     *                   The key for which the primitive value shall be set.
     * 
     * @param connection
     *                   The connection to insert. After calling this method, the XPC object
     *                   corresponding to the primitive value inserted may be safely retrieved
     *                   with {@link xpc_dictionary_get_value()}. The connection is NOT retained by
     *                   the dictionary.
     * 
     *                   API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void xpc_dictionary_set_connection(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key,
            @NotNull xpc_connection_t connection);

    /**
     * [@function] xpc_dictionary_set_mach_send
     * 
     * Inserts a send right into a dictionary.
     * 
     * The XPC runtime sends the port with disposition `MACH_MSG_TYPE_COPY_SEND`
     * 
     * API-Since: 5.0
     * 
     * @param xdict
     *              The dictionary which is to be manipulated.
     * 
     * @param key
     *              The key for which the primitive value shall be set.
     * 
     * @param p
     *              The port to insert. After calling this method, the XPC object
     *              corresponding to the primitive value inserted may be safely retrieved
     *              with {@link xpc_dictionary_copy_mach_send()}.
     */
    @Generated
    @CFunction
    public static native void xpc_dictionary_set_mach_send(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key,
            int p);

    /**
     * [@function] xpc_dictionary_get_bool
     * 
     * Gets a <code>bool</code> primitive value from a dictionary directly.
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         The underlying <code>bool</code> value for the specified key. false if the
     *         the value for the specified key is not a Boolean value or if there is no
     *         value for the specified key.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native boolean xpc_dictionary_get_bool(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    /**
     * [@function] xpc_dictionary_get_int64
     * 
     * Gets an <code>int64</code> primitive value from a dictionary directly.
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         The underlying <code>int64_t</code> value for the specified key. 0 if the
     *         value for the specified key is not a signed integer value or if there is no
     *         value for the specified key.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native long xpc_dictionary_get_int64(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    /**
     * [@function] xpc_dictionary_get_uint64
     * 
     * Gets a <code>uint64</code> primitive value from a dictionary directly.
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         The underlying <code>uint64_t</code> value for the specified key. 0 if the
     *         value for the specified key is not an unsigned integer value or if there is
     *         no value for the specified key.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native long xpc_dictionary_get_uint64(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    /**
     * [@function] xpc_dictionary_get_double
     * 
     * Gets a <code>double</code> primitive value from a dictionary directly.
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         The underlying <code>double</code> value for the specified key. NAN if the
     *         value for the specified key is not a floating point value or if there is no
     *         value for the specified key.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native double xpc_dictionary_get_double(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    /**
     * [@function] xpc_dictionary_get_date
     * 
     * Gets a date value from a dictionary directly.
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         The underlying date interval for the specified key. 0 if the value for the
     *         specified key is not a date value or if there is no value for the specified
     *         key.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native long xpc_dictionary_get_date(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    /**
     * [@function] xpc_dictionary_get_data
     * 
     * Gets a raw data value from a dictionary directly.
     * 
     * @param xdict
     *               The dictionary object which is to be examined.
     * 
     * @param key
     *               The key whose value is to be obtained.
     * 
     * @param length
     *               For the data type, the third parameter, upon output, will contain the length
     *               of the data corresponding to the specified key. May be NULL.
     * 
     * @return
     *         The underlying raw data for the specified key. NULL if the value for the
     *         specified key is not a data value or if there is no value for the specified
     *         key.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native ConstVoidPtr xpc_dictionary_get_data(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key,
            @Nullable NUIntPtr length);

    /**
     * [@function] xpc_dictionary_get_string
     * 
     * Gets a C string value from a dictionary directly.
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         The underlying C string for the specified key. NULL if the value for the
     *         specified key is not a C string value or if there is no value for the
     *         specified key.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Nullable
    public static native String xpc_dictionary_get_string(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    /**
     * [@function] xpc_dictionary_get_uuid
     * 
     * Gets a uuid value from a dictionary directly.
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         The underlying <code>uuid_t</code> value for the specified key. NULL if the
     *         value at the specified index is not a UUID value. The returned pointer may be
     *         safely passed to the uuid(3) APIs.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Nullable
    public static native String xpc_dictionary_get_uuid(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    /**
     * [@function] xpc_dictionary_dup_fd
     * 
     * Creates a file descriptor from a dictionary directly.
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         A new file descriptor created from the value for the specified key. You are
     *         responsible for close(2)ing this descriptor. -1 if the value for the
     *         specified key is not a file descriptor value or if there is no value for the
     *         specified key.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native int xpc_dictionary_dup_fd(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    /**
     * [@function] xpc_dictionary_create_connection
     * 
     * Creates a connection from a dictionary directly.
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         A new connection created from the value for the specified key. You are
     *         responsible for calling xpc_release() on the returned connection. NULL if the
     *         value for the specified key is not an endpoint containing a connection or if
     *         there is no value for the specified key. Each call to this method for the
     *         same key in the same dictionary will yield a different connection. See
     *         {@link xpc_connection_create_from_endpoint()} for discussion as to the
     *         responsibilities when dealing with the returned connection.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native xpc_connection_t xpc_dictionary_create_connection(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    /**
     * [@function] xpc_dictionary_get_dictionary
     * 
     * Returns the dictionary value for the specified key.
     * 
     * This method does not grant the caller a reference to the underlying object,
     * and thus the caller is not responsible for releasing the object.
     * 
     * API-Since: 9.0
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         The object for the specified key within the dictionary. NULL if there is no
     *         value associated with the specified key, if the given object was not an
     *         XPC dictionary, or if the object for the specified key is not a dictionary.
     */
    @Generated
    @CFunction
    @Nullable
    public static native VoidPtr xpc_dictionary_get_dictionary(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    /**
     * [@function] xpc_dictionary_get_array
     * 
     * Returns the array value for the specified key.
     * 
     * This method does not grant the caller a reference to the underlying object,
     * and thus the caller is not responsible for releasing the object.
     * 
     * API-Since: 9.0
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         The object for the specified key within the dictionary. NULL if there is no
     *         value associated with the specified key, if the given object was not an
     *         XPC dictionary, or if the object for the specified key is not an array.
     */
    @Generated
    @CFunction
    @Nullable
    public static native VoidPtr xpc_dictionary_get_array(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    /**
     * [@function] xpc_dictionary_copy_mach_send
     * 
     * Returns a send right to the mach port.
     * 
     * The XPC runtime will copy the send right using `mach_port_mod_refs`
     * before returning the port
     * 
     * API-Since: 5.0
     * 
     * @param xdict
     *              The dictionary object which is to be examined.
     * 
     * @param key
     *              The key whose value is to be obtained.
     * 
     * @return
     *         The object for the specified key within the dictionary. `MACH_PORT_NULL`
     *         if there is no value associated with the specified key, if the given object
     *         was not an XPC dictionary, or if the object for the specified key is not a send
     *         right.
     */
    @Generated
    @CFunction
    public static native int xpc_dictionary_copy_mach_send(@NotNull VoidPtr xdict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @NotNull String key);

    @Generated
    @CFunction
    public static native int vm_stats(VoidPtr info, IntPtr count);

    /**
     * The double3 variants of these functions take their arguments in a buffer
     * to workaround the fact that double3 calling conventions are different
     * depending on whether or not the executable has been compiled with AVX
     * enabled.
     */
    @Generated
    @CFunction
    public static native double _simd_orient_vd3(ConstDoublePtr arg1);

    @Generated
    @CFunction
    public static native double _simd_orient_pd3(ConstDoublePtr arg1);

    @Generated
    @CFunction
    public static native double _simd_insphere_pd3(ConstDoublePtr arg1);

    /**
     * Client side reply port allocate
     */
    @Generated
    @CFunction
    public static native int mig_get_reply_port();

    /**
     * Client side reply port deallocate
     */
    @Generated
    @CFunction
    public static native void mig_dealloc_reply_port(int reply_port);

    /**
     * Client side reply port "deallocation"
     */
    @Generated
    @CFunction
    public static native void mig_put_reply_port(int reply_port);

    /**
     * Bounded string copy
     */
    @Generated
    @CFunction
    public static native int mig_strncpy(BytePtr dest,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String src, int len);

    @Generated
    @CFunction
    public static native int mig_strncpy_zerofill(BytePtr dest,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String src, int len);

    /**
     * Allocate memory for out-of-line mig structures
     */
    @Generated
    @CFunction
    public static native void mig_allocate(NUIntPtr arg1, @NUInt long arg2);

    /**
     * Deallocate memory used for out-of-line mig structures
     */
    @Generated
    @CFunction
    public static native void mig_deallocate(@NUInt long arg1, @NUInt long arg2);

    @Generated
    @Inline
    @CFunction
    public static native void __NDR_convert__mig_reply_error_t(
            @UncertainArgument("Options: reference, array Fallback: reference") mig_reply_error_t x);

    @Generated
    @CFunction
    public static native int clock_set_time(int clock_ctrl, @ByValue mach_timespec new_time);

    @Generated
    @CFunction
    public static native int clock_set_attributes(int clock_ctrl, int flavor, IntPtr clock_attr, int clock_attrCnt);

    @Generated
    @CFunction
    public static native int host_reboot(int host_priv, int options);

    @Generated
    @CFunction
    public static native int host_priv_statistics(int host_priv, int flavor, IntPtr host_info_out,
            IntPtr host_info_outCnt);

    @Generated
    @CFunction
    public static native int host_default_memory_manager(int host_priv, IntPtr default_manager, int cluster_size);

    @Generated
    @CFunction
    public static native int vm_wire(int host_priv, int task, @NUInt long address, @NUInt long size,
            int desired_access);

    @Generated
    @CFunction
    public static native int thread_wire(int host_priv, int thread, int wired);

    @Generated
    @CFunction
    public static native int vm_allocate_cpm(int host_priv, int task, NUIntPtr address, @NUInt long size, int flags);

    @Generated
    @CFunction
    public static native int host_processors(int host_priv, Ptr<IntPtr> out_processor_list,
            IntPtr out_processor_listCnt);

    @Generated
    @CFunction
    public static native int host_get_clock_control(int host_priv, int clock_id, IntPtr clock_ctrl);

    @Generated
    @CFunction
    public static native int kmod_create(int host_priv, @NUInt long info, IntPtr module);

    @Generated
    @CFunction
    public static native int kmod_destroy(int host_priv, int module);

    @Generated
    @CFunction
    public static native int kmod_control(int host_priv, int module, int flavor, Ptr<VoidPtr> data, IntPtr dataCnt);

    @Generated
    @CFunction
    public static native int host_get_special_port(int host_priv, int node, int which, IntPtr port);

    @Generated
    @CFunction
    public static native int host_set_special_port(int host_priv, int which, int port);

    @Generated
    @CFunction
    public static native int host_set_exception_ports(int host_priv, int exception_mask, int new_port, int behavior,
            int new_flavor);

    @Generated
    @CFunction
    public static native int host_get_exception_ports(int host_priv, int exception_mask, IntPtr masks, IntPtr masksCnt,
            IntPtr old_handlers, IntPtr old_behaviors, IntPtr old_flavors);

    @Generated
    @CFunction
    public static native int host_swap_exception_ports(int host_priv, int exception_mask, int new_port, int behavior,
            int new_flavor, IntPtr masks, IntPtr masksCnt, IntPtr old_handlerss, IntPtr old_behaviors,
            IntPtr old_flavors);

    @Generated
    @CFunction
    public static native int mach_vm_wire(int host_priv, int task, @NUInt long address, @NUInt long size,
            int desired_access);

    @Generated
    @CFunction
    public static native int host_processor_sets(int host_priv, Ptr<IntPtr> processor_sets, IntPtr processor_setsCnt);

    @Generated
    @CFunction
    public static native int host_processor_set_priv(int host_priv, int set_name, IntPtr set);

    @Generated
    @CFunction
    public static native int host_set_UNDServer(int host, int server);

    @Generated
    @CFunction
    public static native int host_get_UNDServer(int host, IntPtr server);

    @Generated
    @CFunction
    public static native int kext_request(int host_priv, int user_log_flags, @NUInt long request_data,
            int request_dataCnt, NUIntPtr response_data, IntPtr response_dataCnt, NUIntPtr log_data, IntPtr log_dataCnt,
            IntPtr op_result);

    @Generated
    @CFunction
    public static native int host_security_create_task_token(int host_security, int parent_task,
            @ByValue security_token_t sec_token, @ByValue audit_token_t audit_token, int host, IntPtr ledgers,
            int ledgersCnt, int inherit_memory, IntPtr child_task);

    @Generated
    @CFunction
    public static native int host_security_set_task_token(int host_security, int target_task,
            @ByValue security_token_t sec_token, @ByValue audit_token_t audit_token, int host);

    @Generated
    @CFunction
    public static native int processor_start(int processor);

    @Generated
    @CFunction
    public static native int processor_exit(int processor);

    @Generated
    @CFunction
    public static native int processor_info(int processor, int flavor, IntPtr host, IntPtr processor_info_out,
            IntPtr processor_info_outCnt);

    @Generated
    @CFunction
    public static native int processor_control(int processor, IntPtr processor_cmd, int processor_cmdCnt);

    @Generated
    @CFunction
    public static native int processor_assign(int processor, int new_set, int wait_);

    @Generated
    @CFunction
    public static native int processor_get_assignment(int processor, IntPtr assigned_set);

    @Generated
    @CFunction
    public static native int processor_set_statistics(int pset, int flavor, IntPtr info_out, IntPtr info_outCnt);

    @Generated
    @CFunction
    public static native int processor_set_destroy(int set);

    @Generated
    @CFunction
    public static native int processor_set_max_priority(int processor_set, int max_priority, int change_threads);

    @Generated
    @CFunction
    public static native int processor_set_policy_enable(int processor_set, int policy);

    @Generated
    @CFunction
    public static native int processor_set_policy_disable(int processor_set, int policy, int change_threads);

    @Generated
    @CFunction
    public static native int processor_set_tasks(int processor_set, Ptr<IntPtr> task_list, IntPtr task_listCnt);

    @Generated
    @CFunction
    public static native int processor_set_threads(int processor_set, Ptr<IntPtr> thread_list, IntPtr thread_listCnt);

    @Generated
    @CFunction
    public static native int processor_set_policy_control(int pset, int flavor, IntPtr policy_info, int policy_infoCnt,
            int change);

    @Generated
    @CFunction
    public static native int processor_set_stack_usage(int pset, IntPtr ltotal, NUIntPtr space, NUIntPtr resident,
            NUIntPtr maxusage, NUIntPtr maxstack);

    @Generated
    @CFunction
    public static native int processor_set_info(int set_name, int flavor, IntPtr host, IntPtr info_out,
            IntPtr info_outCnt);

    @Generated
    @CFunction
    public static native int processor_set_tasks_with_flavor(int processor_set, int flavor, Ptr<IntPtr> task_list,
            IntPtr task_listCnt);

    @Generated
    @CFunction
    public static native int semaphore_signal(int semaphore);

    @Generated
    @CFunction
    public static native int semaphore_signal_all(int semaphore);

    @Generated
    @CFunction
    public static native int semaphore_wait(int semaphore);

    @Generated
    @CFunction
    public static native int semaphore_timedwait(int semaphore, @ByValue mach_timespec wait_time);

    @Generated
    @CFunction
    public static native int semaphore_timedwait_signal(int wait_semaphore, int signal_semaphore,
            @ByValue mach_timespec wait_time);

    @Generated
    @CFunction
    public static native int semaphore_wait_signal(int wait_semaphore, int signal_semaphore);

    @Generated
    @CFunction
    public static native int semaphore_signal_thread(int semaphore, int thread);

    @Generated
    @CFunction
    public static native int task_create(int target_task, IntPtr ledgers, int ledgersCnt, int inherit_memory,
            IntPtr child_task);

    @Generated
    @CFunction
    public static native int task_terminate(int target_task);

    @Generated
    @CFunction
    public static native int task_threads(int target_task, Ptr<IntPtr> act_list, IntPtr act_listCnt);

    @Generated
    @CFunction
    public static native int mach_ports_register(int target_task, IntPtr init_port_set, int init_port_setCnt);

    @Generated
    @CFunction
    public static native int mach_ports_lookup(int target_task, Ptr<IntPtr> init_port_set, IntPtr init_port_setCnt);

    @Generated
    @CFunction
    public static native int task_info(int target_task, int flavor, IntPtr task_info_out, IntPtr task_info_outCnt);

    @Generated
    @CFunction
    public static native int task_set_info(int target_task, int flavor, IntPtr task_info_in, int task_info_inCnt);

    @Generated
    @CFunction
    public static native int task_suspend(int target_task);

    @Generated
    @CFunction
    public static native int task_resume(int target_task);

    @Generated
    @CFunction
    public static native int task_get_special_port(int task, int which_port, IntPtr special_port);

    @Generated
    @CFunction
    public static native int task_set_special_port(int task, int which_port, int special_port);

    @Generated
    @CFunction
    public static native int thread_create(int parent_task, IntPtr child_act);

    @Generated
    @CFunction
    public static native int thread_create_running(int parent_task, int flavor, IntPtr new_state, int new_stateCnt,
            IntPtr child_act);

    @Generated
    @CFunction
    public static native int task_set_exception_ports(int task, int exception_mask, int new_port, int behavior,
            int new_flavor);

    @Generated
    @CFunction
    public static native int task_get_exception_ports(int task, int exception_mask, IntPtr masks, IntPtr masksCnt,
            IntPtr old_handlers, IntPtr old_behaviors, IntPtr old_flavors);

    @Generated
    @CFunction
    public static native int task_swap_exception_ports(int task, int exception_mask, int new_port, int behavior,
            int new_flavor, IntPtr masks, IntPtr masksCnt, IntPtr old_handlers, IntPtr old_behaviors,
            IntPtr old_flavors);

    @Generated
    @CFunction
    public static native int lock_set_create(int task, IntPtr new_lock_set, int n_ulocks, int policy);

    @Generated
    @CFunction
    public static native int lock_set_destroy(int task, int lock_set);

    @Generated
    @CFunction
    public static native int semaphore_create(int task, IntPtr semaphore, int policy, int value);

    @Generated
    @CFunction
    public static native int semaphore_destroy(int task, int semaphore);

    @Generated
    @CFunction
    public static native int task_policy_set(int task, int flavor, IntPtr policy_info, int policy_infoCnt);

    @Generated
    @CFunction
    public static native int task_policy_get(int task, int flavor, IntPtr policy_info, IntPtr policy_infoCnt,
            IntPtr get_default);

    @Generated
    @CFunction
    public static native int task_sample(int task, int reply);

    @Generated
    @CFunction
    public static native int task_policy(int task, int policy, IntPtr base, int baseCnt, int set_limit, int change);

    @Generated
    @CFunction
    public static native int task_set_emulation(int target_port, @NUInt long routine_entry_pt, int routine_number);

    @Generated
    @CFunction
    public static native int task_get_emulation_vector(int task, IntPtr vector_start, Ptr<NUIntPtr> emulation_vector,
            IntPtr emulation_vectorCnt);

    @Generated
    @CFunction
    public static native int task_set_emulation_vector(int task, int vector_start, NUIntPtr emulation_vector,
            int emulation_vectorCnt);

    @Generated
    @CFunction
    public static native int task_set_ras_pc(int target_task, @NUInt long basepc, @NUInt long boundspc);

    @Generated
    @CFunction
    public static native int task_zone_info(int target_task, Ptr<Ptr<mach_zone_name>> names, IntPtr namesCnt,
            Ptr<Ptr<task_zone_info_data>> info, IntPtr infoCnt);

    @Generated
    @CFunction
    public static native int task_assign(int task, int new_set, int assign_threads);

    @Generated
    @CFunction
    public static native int task_assign_default(int task, int assign_threads);

    @Generated
    @CFunction
    public static native int task_get_assignment(int task, IntPtr assigned_set);

    @Generated
    @CFunction
    public static native int task_set_policy(int task, int pset, int policy, IntPtr base, int baseCnt, IntPtr limit,
            int limitCnt, int change);

    @Generated
    @CFunction
    public static native int task_get_state(int task, int flavor, IntPtr old_state, IntPtr old_stateCnt);

    @Generated
    @CFunction
    public static native int task_set_state(int task, int flavor, IntPtr new_state, int new_stateCnt);

    @Generated
    @CFunction
    public static native int task_set_phys_footprint_limit(int task, int new_limit, IntPtr old_limit);

    @Generated
    @CFunction
    public static native int task_suspend2(int target_task, IntPtr suspend_token);

    @Generated
    @CFunction
    public static native int task_resume2(int suspend_token);

    @Generated
    @CFunction
    public static native int task_purgable_info(int task,
            @UncertainArgument("Options: reference, array Fallback: reference") vm_purgeable_info stats);

    @Generated
    @CFunction
    public static native int task_get_mach_voucher(int task, int which, IntPtr voucher);

    @Generated
    @CFunction
    public static native int task_set_mach_voucher(int task, int voucher);

    @Generated
    @CFunction
    public static native int task_swap_mach_voucher(int task, int new_voucher, IntPtr old_voucher);

    @Generated
    @CFunction
    public static native int task_generate_corpse(int task, IntPtr corpse_task_port);

    @Generated
    @CFunction
    public static native int task_map_corpse_info(int task, int corspe_task, NUIntPtr kcd_addr_begin, IntPtr kcd_size);

    @Generated
    @CFunction
    public static native int task_register_dyld_image_infos(int task,
            @UncertainArgument("Options: reference, array Fallback: reference") dyld_kernel_image_info dyld_images,
            int dyld_imagesCnt);

    @Generated
    @CFunction
    public static native int task_unregister_dyld_image_infos(int task,
            @UncertainArgument("Options: reference, array Fallback: reference") dyld_kernel_image_info dyld_images,
            int dyld_imagesCnt);

    @Generated
    @CFunction
    public static native int task_get_dyld_image_infos(int task, Ptr<Ptr<dyld_kernel_image_info>> dyld_images,
            IntPtr dyld_imagesCnt);

    @Generated
    @CFunction
    public static native int task_register_dyld_shared_cache_image_info(int task,
            @ByValue dyld_kernel_image_info dyld_cache_image, int no_cache, int private_cache);

    @Generated
    @CFunction
    public static native int task_register_dyld_set_dyld_state(int task, byte dyld_state);

    @Generated
    @CFunction
    public static native int task_register_dyld_get_process_state(int task,
            @UncertainArgument("Options: reference, array Fallback: reference") dyld_kernel_process_info dyld_process_state);

    @Generated
    @CFunction
    public static native int task_map_corpse_info_64(int task, int corspe_task, NUIntPtr kcd_addr_begin,
            NUIntPtr kcd_size);

    @Generated
    @CFunction
    public static native int task_inspect(int task, int flavor, IntPtr info_out, IntPtr info_outCnt);

    @Generated
    @CFunction
    public static native int task_get_exc_guard_behavior(int task, IntPtr behavior);

    @Generated
    @CFunction
    public static native int task_set_exc_guard_behavior(int task, int behavior);

    @Generated
    @CFunction
    public static native int task_dyld_process_info_notify_register(int target_task, int notify_);

    @Generated
    @CFunction
    public static native int task_create_identity_token(int task, IntPtr token);

    @Generated
    @CFunction
    public static native int task_identity_token_get_task_port(int token, int flavor, IntPtr task_port);

    @Generated
    @CFunction
    public static native int task_dyld_process_info_notify_deregister(int target_task, int notify_);

    @Generated
    @CFunction
    public static native int task_get_exception_ports_info(int port, int exception_mask, IntPtr masks, IntPtr masksCnt,
            @UncertainArgument("Options: reference, array Fallback: reference") ipc_info_port old_handlers_info,
            IntPtr old_behaviors, IntPtr old_flavors);

    @Generated
    @CFunction
    public static native int task_test_sync_upcall(int task, int port);

    @Generated
    @CFunction
    public static native int task_set_corpse_forking_behavior(int task, int behavior);

    @Generated
    @CFunction
    public static native int task_test_async_upcall_propagation(int task, int port, int qos, int iotier);

    @Generated
    @CFunction
    public static native int task_map_kcdata_object_64(int task, int kcdata_object, NUIntPtr kcd_addr_begin,
            NUIntPtr kcd_size);

    @Generated
    @CFunction
    public static native int task_register_hardened_exception_handler(int task, int signed_pc_key,
            int exceptions_allowed, int behaviors_allowed, int flavors_allowed, int new_exception_port);

    @Generated
    @CFunction
    public static native int thread_terminate(int target_act);

    @Generated
    @CFunction
    public static native int act_get_state(int target_act, int flavor, IntPtr old_state, IntPtr old_stateCnt);

    @Generated
    @CFunction
    public static native int act_set_state(int target_act, int flavor, IntPtr new_state, int new_stateCnt);

    @Generated
    @CFunction
    public static native int thread_get_state(int target_act, int flavor, IntPtr old_state, IntPtr old_stateCnt);

    @Generated
    @CFunction
    public static native int thread_set_state(int target_act, int flavor, IntPtr new_state, int new_stateCnt);

    @Generated
    @CFunction
    public static native int thread_suspend(int target_act);

    @Generated
    @CFunction
    public static native int thread_resume(int target_act);

    @Generated
    @CFunction
    public static native int thread_abort(int target_act);

    @Generated
    @CFunction
    public static native int thread_abort_safely(int target_act);

    @Generated
    @CFunction
    public static native int thread_depress_abort(int thread);

    @Generated
    @CFunction
    public static native int thread_get_special_port(int thr_act, int which_port, IntPtr special_port);

    @Generated
    @CFunction
    public static native int thread_set_special_port(int thr_act, int which_port, int special_port);

    @Generated
    @CFunction
    public static native int thread_info(int target_act, int flavor, IntPtr thread_info_out, IntPtr thread_info_outCnt);

    @Generated
    @CFunction
    public static native int thread_set_exception_ports(int thread, int exception_mask, int new_port, int behavior,
            int new_flavor);

    @Generated
    @CFunction
    public static native int thread_get_exception_ports(int thread, int exception_mask, IntPtr masks, IntPtr masksCnt,
            IntPtr old_handlers, IntPtr old_behaviors, IntPtr old_flavors);

    @Generated
    @CFunction
    public static native int thread_swap_exception_ports(int thread, int exception_mask, int new_port, int behavior,
            int new_flavor, IntPtr masks, IntPtr masksCnt, IntPtr old_handlers, IntPtr old_behaviors,
            IntPtr old_flavors);

    @Generated
    @CFunction
    public static native int thread_policy(int thr_act, int policy, IntPtr base, int baseCnt, int set_limit);

    @Generated
    @CFunction
    public static native int thread_policy_set(int thread, int flavor, IntPtr policy_info, int policy_infoCnt);

    @Generated
    @CFunction
    public static native int thread_policy_get(int thread, int flavor, IntPtr policy_info, IntPtr policy_infoCnt,
            IntPtr get_default);

    @Generated
    @CFunction
    public static native int thread_sample(int thread, int reply);

    @Generated
    @CFunction
    public static native int etap_trace_thread(int target_act, int trace_status);

    @Generated
    @CFunction
    public static native int thread_assign(int thread, int new_set);

    @Generated
    @CFunction
    public static native int thread_assign_default(int thread);

    @Generated
    @CFunction
    public static native int thread_get_assignment(int thread, IntPtr assigned_set);

    @Generated
    @CFunction
    public static native int thread_set_policy(int thr_act, int pset, int policy, IntPtr base, int baseCnt,
            IntPtr limit, int limitCnt);

    @Generated
    @CFunction
    public static native int thread_get_mach_voucher(int thr_act, int which, IntPtr voucher);

    @Generated
    @CFunction
    public static native int thread_set_mach_voucher(int thr_act, int voucher);

    @Generated
    @CFunction
    public static native int thread_swap_mach_voucher(int thr_act, int new_voucher, IntPtr old_voucher);

    @Generated
    @CFunction
    public static native int thread_convert_thread_state(int thread, int direction, int flavor, IntPtr in_state,
            int in_stateCnt, IntPtr out_state, IntPtr out_stateCnt);

    @Generated
    @CFunction
    public static native int thread_get_exception_ports_info(int port, int exception_mask, IntPtr masks,
            IntPtr masksCnt,
            @UncertainArgument("Options: reference, array Fallback: reference") ipc_info_port old_handlers_info,
            IntPtr old_behaviors, IntPtr old_flavors);

    @Generated
    @CFunction
    public static native int thread_adopt_exception_handler(int thread, int exc_port, int exc_mask, int behavior_mask,
            int flavor_mask);

    @Generated
    @CFunction
    public static native int vm_region(int target_task, NUIntPtr address, NUIntPtr size, int flavor, IntPtr info,
            IntPtr infoCnt, IntPtr object_name);

    @Generated
    @CFunction
    public static native int vm_allocate(int target_task, NUIntPtr address, @NUInt long size, int flags);

    @Generated
    @CFunction
    public static native int vm_deallocate(int target_task, @NUInt long address, @NUInt long size);

    @Generated
    @CFunction
    public static native int vm_protect(int target_task, @NUInt long address, @NUInt long size, int set_maximum,
            int new_protection);

    @Generated
    @CFunction
    public static native int vm_inherit(int target_task, @NUInt long address, @NUInt long size, int new_inheritance);

    @Generated
    @CFunction
    public static native int vm_read(int target_task, @NUInt long address, @NUInt long size, NUIntPtr data,
            IntPtr dataCnt);

    @Generated
    @CFunction
    public static native int vm_write(int target_task, @NUInt long address, @NUInt long data, int dataCnt);

    @Generated
    @CFunction
    public static native int vm_copy(int target_task, @NUInt long source_address, @NUInt long size,
            @NUInt long dest_address);

    @Generated
    @CFunction
    public static native int vm_read_overwrite(int target_task, @NUInt long address, @NUInt long size, @NUInt long data,
            NUIntPtr outsize);

    @Generated
    @CFunction
    public static native int vm_msync(int target_task, @NUInt long address, @NUInt long size, int sync_flags);

    @Generated
    @CFunction
    public static native int vm_behavior_set(int target_task, @NUInt long address, @NUInt long size, int new_behavior);

    @Generated
    @CFunction
    public static native int vm_map(int target_task, NUIntPtr address, @NUInt long size, @NUInt long mask, int flags,
            int object, @NUInt long offset, int copy, int cur_protection, int max_protection, int inheritance);

    @Generated
    @CFunction
    public static native int vm_machine_attribute(int target_task, @NUInt long address, @NUInt long size, int attribute,
            IntPtr value);

    @Generated
    @CFunction
    public static native int vm_remap(int target_task, NUIntPtr target_address, @NUInt long size, @NUInt long mask,
            int flags, int src_task, @NUInt long src_address, int copy, IntPtr cur_protection, IntPtr max_protection,
            int inheritance);

    @Generated
    @CFunction
    public static native int task_wire(int target_task, int must_wire);

    @Generated
    @CFunction
    public static native int mach_make_memory_entry(int target_task, NUIntPtr size, @NUInt long offset, int permission,
            IntPtr object_handle, int parent_entry);

    @Generated
    @CFunction
    public static native int vm_map_page_query(int target_map, @NUInt long offset, IntPtr disposition,
            IntPtr ref_count);

    @Generated
    @CFunction
    public static native int mach_vm_region_info(int task, @NUInt long address,
            @UncertainArgument("Options: reference, array Fallback: reference") vm_info_region region,
            Ptr<Ptr<vm_info_object>> objects, IntPtr objectsCnt);

    @Generated
    @CFunction
    public static native int vm_mapped_pages_info(int task, Ptr<NUIntPtr> pages, IntPtr pagesCnt);

    @Generated
    @CFunction
    public static native int vm_region_recurse(int target_task, NUIntPtr address, NUIntPtr size, IntPtr nesting_depth,
            IntPtr info, IntPtr infoCnt);

    @Generated
    @CFunction
    public static native int vm_region_recurse_64(int target_task, NUIntPtr address, NUIntPtr size,
            IntPtr nesting_depth, IntPtr info, IntPtr infoCnt);

    @Generated
    @CFunction
    public static native int mach_vm_region_info_64(int task, @NUInt long address,
            @UncertainArgument("Options: reference, array Fallback: reference") vm_info_region_64 region,
            Ptr<Ptr<vm_info_object>> objects, IntPtr objectsCnt);

    @Generated
    @CFunction
    public static native int vm_region_64(int target_task, NUIntPtr address, NUIntPtr size, int flavor, IntPtr info,
            IntPtr infoCnt, IntPtr object_name);

    @Generated
    @CFunction
    public static native int mach_make_memory_entry_64(int target_task, LongPtr size, long offset, int permission,
            IntPtr object_handle, int parent_entry);

    @Generated
    @CFunction
    public static native int vm_map_64(int target_task, NUIntPtr address, @NUInt long size, @NUInt long mask, int flags,
            int object, long offset, int copy, int cur_protection, int max_protection, int inheritance);

    @Generated
    @CFunction
    public static native int vm_purgable_control(int target_task, @NUInt long address, int control, IntPtr state);

    @Generated
    @CFunction
    public static native int vm_map_exec_lockdown(int target_task);

    @Generated
    @CFunction
    public static native int vm_remap_new(int target_task, NUIntPtr target_address, @NUInt long size, @NUInt long mask,
            int flags, int src_task, @NUInt long src_address, int copy, IntPtr cur_protection, IntPtr max_protection,
            int inheritance);

    @Generated
    @CFunction
    public static native int mach_port_names(int task, Ptr<IntPtr> names, IntPtr namesCnt, Ptr<IntPtr> types,
            IntPtr typesCnt);

    @Generated
    @CFunction
    public static native int mach_port_type(int task, int name, IntPtr ptype);

    @Generated
    @CFunction
    public static native int mach_port_rename(int task, int old_name, int new_name);

    @Generated
    @CFunction
    public static native int mach_port_allocate_name(int task, int right, int name);

    @Generated
    @CFunction
    public static native int mach_port_allocate(int task, int right, IntPtr name);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Inherently unsafe API: instead manage rights with mach_port_destruct(),
     * mach_port_deallocate() or mach_port_mod_refs()
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int mach_port_destroy(int task, int name);

    @Generated
    @CFunction
    public static native int mach_port_deallocate(int task, int name);

    @Generated
    @CFunction
    public static native int mach_port_get_refs(int task, int name, int right, IntPtr refs);

    @Generated
    @CFunction
    public static native int mach_port_mod_refs(int task, int name, int right, int delta);

    @Generated
    @CFunction
    public static native int mach_port_peek(int task, int name, int trailer_type, IntPtr request_seqnop,
            IntPtr msg_sizep, IntPtr msg_idp, BytePtr trailer_infop, IntPtr trailer_infopCnt);

    @Generated
    @CFunction
    public static native int mach_port_set_mscount(int task, int name, int mscount);

    @Generated
    @CFunction
    public static native int mach_port_get_set_status(int task, int name, Ptr<IntPtr> members, IntPtr membersCnt);

    @Generated
    @CFunction
    public static native int mach_port_move_member(int task, int member, int after);

    @Generated
    @CFunction
    public static native int mach_port_request_notification(int task, int name, int msgid, int sync, int notify_,
            int notifyPoly, IntPtr previous);

    @Generated
    @CFunction
    public static native int mach_port_insert_right(int task, int name, int poly, int polyPoly);

    @Generated
    @CFunction
    public static native int mach_port_extract_right(int task, int name, int msgt_name, IntPtr poly, IntPtr polyPoly);

    @Generated
    @CFunction
    public static native int mach_port_set_seqno(int task, int name, int seqno);

    @Generated
    @CFunction
    public static native int mach_port_get_attributes(int task, int name, int flavor, IntPtr port_info_out,
            IntPtr port_info_outCnt);

    @Generated
    @CFunction
    public static native int mach_port_set_attributes(int task, int name, int flavor, IntPtr port_info,
            int port_infoCnt);

    @Generated
    @CFunction
    public static native int mach_port_allocate_qos(int task, int right, VoidPtr qos, IntPtr name);

    @Generated
    @CFunction
    public static native int mach_port_allocate_full(int task, int right, int proto, VoidPtr qos, IntPtr name);

    @Generated
    @CFunction
    public static native int task_set_port_space(int task, int table_entries);

    @Generated
    @CFunction
    public static native int mach_port_get_srights(int task, int name, IntPtr srights);

    @Generated
    @CFunction
    public static native int mach_port_space_info(int space,
            @UncertainArgument("Options: reference, array Fallback: reference") ipc_info_space space_info,
            Ptr<Ptr<ipc_info_name>> table_info, IntPtr table_infoCnt, Ptr<Ptr<ipc_info_tree_name>> tree_info,
            IntPtr tree_infoCnt);

    @Generated
    @CFunction
    public static native int mach_port_dnrequest_info(int task, int name, IntPtr dnr_total, IntPtr dnr_used);

    @Generated
    @CFunction
    public static native int mach_port_kernel_object(int task, int name, IntPtr object_type, IntPtr object_addr);

    @Generated
    @CFunction
    public static native int mach_port_insert_member(int task, int name, int pset);

    @Generated
    @CFunction
    public static native int mach_port_extract_member(int task, int name, int pset);

    @Generated
    @CFunction
    public static native int mach_port_get_context(int task, int name, NUIntPtr context);

    @Generated
    @CFunction
    public static native int mach_port_set_context(int task, int name, @NUInt long context);

    @Generated
    @CFunction
    public static native int mach_port_kobject(int task, int name, IntPtr object_type, NUIntPtr object_addr);

    @Generated
    @CFunction
    public static native int mach_port_construct(int task,
            @UncertainArgument("Options: reference, array Fallback: reference") mach_port_options options,
            @NUInt long context, IntPtr name);

    @Generated
    @CFunction
    public static native int mach_port_destruct(int task, int name, int srdelta, @NUInt long guard);

    @Generated
    @CFunction
    public static native int mach_port_guard(int task, int name, @NUInt long guard, int strict);

    @Generated
    @CFunction
    public static native int mach_port_unguard(int task, int name, @NUInt long guard);

    @Generated
    @CFunction
    public static native int mach_port_space_basic_info(int task,
            @UncertainArgument("Options: reference, array Fallback: reference") ipc_info_space_basic basic_info);

    @Generated
    @CFunction
    public static native int mach_port_guard_with_flags(int task, int name, @NUInt long guard, long flags);

    @Generated
    @CFunction
    public static native int mach_port_swap_guard(int task, int name, @NUInt long old_guard, @NUInt long new_guard);

    @Generated
    @CFunction
    public static native int mach_port_is_connection_for_service(int task, int connection_port, int service_port,
            LongPtr filter_policy_id);

    @Generated
    @CFunction
    public static native int mach_port_get_service_port_info(int task, int name,
            @UncertainArgument("Options: reference, array Fallback: reference") mach_service_port_info sp_info_out);

    @Generated
    @CFunction
    public static native int mach_port_assert_attributes(int task, int name, int flavor, IntPtr info, int infoCnt);

    /**
     * Kernel-related ports; how a task/thread controls itself
     */
    @Generated
    @CFunction
    public static native int mach_host_self();

    @Generated
    @CFunction
    public static native int mach_thread_self();

    /**
     * API-Since: 14.5
     */
    @Generated
    @CFunction
    public static native int mach_task_is_self(int task);

    @Generated
    @CFunction
    public static native int host_page_size(int arg1, NUIntPtr arg2);

    @Generated
    @CFunction
    public static native int clock_sleep_trap(int clock_name, int sleep_type, int sleep_sec, int sleep_nsec,
            @UncertainArgument("Options: reference, array Fallback: reference") mach_timespec wakeup_time);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_vm_allocate_trap(int target, NUIntPtr addr, @NUInt long size, int flags);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_vm_deallocate_trap(int target, @NUInt long address, @NUInt long size);

    @Generated
    @CFunction
    public static native int task_dyld_process_info_notify_get(IntPtr names_addr, IntPtr names_count_addr);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_vm_protect_trap(int target, @NUInt long address, @NUInt long size,
            int set_maximum, int new_protection);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_vm_map_trap(int target, NUIntPtr address, @NUInt long size,
            @NUInt long mask, int flags, int cur_protection);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_vm_purgable_control_trap(int target, @NUInt long address, int control,
            IntPtr state);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_allocate_trap(int target, int right, IntPtr name);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_deallocate_trap(int target, int name);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_mod_refs_trap(int target, int name, int right, int delta);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_move_member_trap(int target, int member, int after);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_insert_right_trap(int target, int name, int poly, int polyPoly);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_get_attributes_trap(int target, int name, int flavor,
            IntPtr port_info_out, IntPtr port_info_outCnt);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_insert_member_trap(int target, int name, int pset);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_extract_member_trap(int target, int name, int pset);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_construct_trap(int target,
            @UncertainArgument("Options: reference, array Fallback: reference") mach_port_options options, long context,
            IntPtr name);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_destruct_trap(int target, int name, int srdelta, long guard);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_guard_trap(int target, int name, long guard, int strict);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_unguard_trap(int target, int name, long guard);

    @Generated
    @CFunction
    public static native int mach_generate_activity_id(int target, int count, LongPtr activity_id);

    @Generated
    @CFunction
    public static native int macx_swapon(long filename, int flags, int size, int priority);

    @Generated
    @CFunction
    public static native int macx_swapoff(long filename, int flags);

    @Generated
    @CFunction
    public static native int macx_triggers(int hi_water, int low_water, int flags, int alert_port);

    @Generated
    @CFunction
    public static native int macx_backing_store_suspend(int suspend);

    @Generated
    @CFunction
    public static native int macx_backing_store_recovery(int pid);

    @Generated
    @CFunction
    public static native int swtch_pri(int pri);

    @Generated
    @CFunction
    public static native int swtch();

    @Generated
    @CFunction
    public static native int thread_switch(int thread_name, int option, int option_time);

    @Generated
    @CFunction
    public static native int task_self_trap();

    @Generated
    @CFunction
    public static native int host_create_mach_voucher_trap(int host, BytePtr recipes, int recipes_size, IntPtr voucher);

    @Generated
    @CFunction
    public static native int mach_voucher_extract_attr_recipe_trap(int voucher_name, int key, BytePtr recipe,
            IntPtr recipe_size);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_type_trap(int task, int name, IntPtr ptype);

    @Generated
    @CFunction
    public static native int _kernelrpc_mach_port_request_notification_trap(int task, int name, int msgid, int sync,
            int notify_, int notifyPoly, IntPtr previous);

    /**
     * Obsolete interfaces.
     */
    @Generated
    @CFunction
    public static native int task_for_pid(int target_tport, int pid, IntPtr t);

    @Generated
    @CFunction
    public static native int task_name_for_pid(int target_tport, int pid, IntPtr tn);

    @Generated
    @CFunction
    public static native int pid_for_task(int t, IntPtr x);

    @Generated
    @CFunction
    public static native int debug_control_port_for_pid(int target_tport, int pid, IntPtr t);

    @Generated
    @CFunction
    public static native int host_info(int host, int flavor, IntPtr host_info_out, IntPtr host_info_outCnt);

    @Generated
    @CFunction
    public static native int _host_page_size(int host, NUIntPtr out_page_size);

    @Generated
    @CFunction
    public static native int mach_memory_object_memory_entry(int host, int internal, @NUInt long size, int permission,
            int pager, IntPtr entry_handle);

    @Generated
    @CFunction
    public static native int host_processor_info(int host, int flavor, IntPtr out_processor_count,
            Ptr<IntPtr> out_processor_info, IntPtr out_processor_infoCnt);

    @Generated
    @CFunction
    public static native int host_get_io_main(int host, IntPtr io_main);

    @Generated
    @CFunction
    public static native int host_get_clock_service(int host, int clock_id, IntPtr clock_serv);

    @Generated
    @CFunction
    public static native int kmod_get_info(int host, Ptr<VoidPtr> modules, IntPtr modulesCnt);

    @Generated
    @CFunction
    public static native int host_virtual_physical_table_info(int host, Ptr<Ptr<hash_info_bucket>> info,
            IntPtr infoCnt);

    @Generated
    @CFunction
    public static native int processor_set_default(int host, IntPtr default_set);

    @Generated
    @CFunction
    public static native int processor_set_create(int host, IntPtr new_set, IntPtr new_name);

    @Generated
    @CFunction
    public static native int mach_memory_object_memory_entry_64(int host, int internal, long size, int permission,
            int pager, IntPtr entry_handle);

    @Generated
    @CFunction
    public static native int host_statistics(int host_priv, int flavor, IntPtr host_info_out, IntPtr host_info_outCnt);

    @Generated
    @CFunction
    public static native int host_request_notification(int host, int notify_type, int notify_port);

    @Generated
    @CFunction
    public static native int host_lockgroup_info(int host, Ptr<Ptr<lockgroup_info>> lockgroup_info,
            IntPtr lockgroup_infoCnt);

    @Generated
    @CFunction
    public static native int host_statistics64(int host_priv, int flavor, IntPtr host_info64_out,
            IntPtr host_info64_outCnt);

    @Generated
    @CFunction
    public static native int mach_zone_info(int host, Ptr<Ptr<mach_zone_name>> names, IntPtr namesCnt,
            Ptr<Ptr<mach_zone_info_data>> info, IntPtr infoCnt);

    @Generated
    @CFunction
    public static native int host_create_mach_voucher(int host, BytePtr recipes, int recipesCnt, IntPtr voucher);

    @Generated
    @CFunction
    public static native int host_register_mach_voucher_attr_manager(int host, int attr_manager, long default_value,
            IntPtr new_key, IntPtr new_attr_control);

    @Generated
    @CFunction
    public static native int host_register_well_known_mach_voucher_attr_manager(int host, int attr_manager,
            long default_value, int key, IntPtr new_attr_control);

    @Generated
    @CFunction
    public static native int host_set_atm_diagnostic_flag(int host, int diagnostic_flag);

    @Generated
    @CFunction
    public static native int host_get_atm_diagnostic_flag(int host, IntPtr diagnostic_flag);

    @Generated
    @CFunction
    public static native int mach_memory_info(int host, Ptr<Ptr<mach_zone_name>> names, IntPtr namesCnt,
            Ptr<Ptr<mach_zone_info_data>> info, IntPtr infoCnt, Ptr<Ptr<mach_memory_info>> memory_info,
            IntPtr memory_infoCnt);

    @Generated
    @CFunction
    public static native int host_set_multiuser_config_flags(int host_priv, int multiuser_flags);

    @Generated
    @CFunction
    public static native int host_get_multiuser_config_flags(int host, IntPtr multiuser_flags);

    @Generated
    @CFunction
    public static native int host_check_multiuser_mode(int host, IntPtr multiuser_mode);

    @Generated
    @CFunction
    public static native int mach_zone_info_for_zone(int host, @ByValue mach_zone_name name,
            @UncertainArgument("Options: reference, array Fallback: reference") mach_zone_info_data info);

    @Generated
    @CFunction
    public static native BytePtr mach_error_string(int error_value);

    @Generated
    @CFunction
    public static native void mach_error(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String str,
            int error_value);

    @Generated
    @CFunction
    public static native BytePtr mach_error_type(int error_value);

    /**
     * Standard prototypes
     */
    @Generated
    @CFunction
    public static native void panic_init(int arg1);

    @Generated
    @Variadic()
    @CFunction
    public static native void panic(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            Object... varargs);

    @Generated
    @CFunction
    public static native void slot_name(int arg1, int arg2, Ptr<BytePtr> arg3, Ptr<BytePtr> arg4);

    @Generated
    @CFunction
    public static native void mig_reply_setup(
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg2);

    @Generated
    @CFunction
    public static native void mach_msg_destroy(
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg1);

    @Generated
    @CFunction
    public static native int mach_msg_receive(
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg1);

    @Generated
    @CFunction
    public static native int mach_msg_send(
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg1);

    @Generated
    @CFunction
    public static native int mach_msg_server_once(
            @FunctionPtr(name = "call_mach_msg_server_once") Function_mach_msg_server_once arg1, int arg2, int arg3,
            int arg4);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_mach_msg_server_once {
        @Generated
        int call_mach_msg_server_once(
                @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg1);
    }

    @Generated
    @CFunction
    public static native int mach_msg_server(@FunctionPtr(name = "call_mach_msg_server") Function_mach_msg_server arg1,
            int arg2, int arg3, int arg4);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_mach_msg_server {
        @Generated
        int call_mach_msg_server(
                @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg1);
    }

    @Generated
    @CFunction
    public static native int mach_msg_server_importance(
            @FunctionPtr(name = "call_mach_msg_server_importance") Function_mach_msg_server_importance arg1, int arg2,
            int arg3, int arg4);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_mach_msg_server_importance {
        @Generated
        int call_mach_msg_server_importance(
                @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg1);
    }

    /**
     * Prototypes for compatibility
     */
    @Generated
    @CFunction
    public static native int clock_get_res(int arg1, IntPtr arg2);

    @Generated
    @CFunction
    public static native int clock_set_res(int arg1, int arg2);

    @Generated
    @CFunction
    public static native int clock_sleep(int arg1, int arg2, @ByValue mach_timespec arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") mach_timespec arg4);

    /**
     * [@function] voucher_mach_msg_set
     * 
     * Change specified message header to contain current mach voucher with a
     * COPY_SEND disposition.
     * Does not change message if it already has non-zero MACH_MSGH_BITS_VOUCHER.
     * 
     * Borrows reference to current thread voucher so message should be sent
     * immediately (without intervening calls that might change that voucher).
     * 
     * @param msg
     *            The message to modify.
     * 
     * @return
     *         True if header was changed.
     */
    @Generated
    @CFunction
    public static native int voucher_mach_msg_set(
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t msg);

    /**
     * [@function] voucher_mach_msg_clear
     * 
     * Removes changes made to specified message header by voucher_mach_msg_set()
     * and any mach_msg() send operations (successful or not).
     * If the message is not needed further, mach_msg_destroy() should be called
     * instead.
     * 
     * Not intended to be called if voucher_mach_msg_set() returned false.
     * Releases reference to message mach voucher if an extra reference was
     * acquired due to an unsuccessful send operation (pseudo-receive).
     * 
     * @param msg
     *            The message to modify.
     */
    @Generated
    @CFunction
    public static native void voucher_mach_msg_clear(
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t msg);

    /**
     * [@function] voucher_mach_msg_adopt
     * 
     * Adopt the voucher contained in the specified message on the current thread
     * and return the previous thread voucher state.
     * 
     * Ownership of the mach voucher in the message is transferred to the current
     * thread and the message header voucher fields are cleared.
     * 
     * @param msg
     *            The message to query and modify.
     * 
     * @return
     *         The previous thread voucher state or VOUCHER_MACH_MSG_STATE_UNCHANGED if no
     *         state change occurred.
     */
    @Generated
    @CFunction
    public static native voucher_mach_msg_state_t voucher_mach_msg_adopt(
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t msg);

    /**
     * [@function] voucher_mach_msg_revert
     * 
     * Restore thread voucher state previously modified by voucher_mach_msg_adopt().
     * 
     * Current thread voucher reference is released.
     * No change to thread voucher state if passed VOUCHER_MACH_MSG_STATE_UNCHANGED.
     * 
     * @param state
     *              The thread voucher state to restore.
     */
    @Generated
    @CFunction
    public static native void voucher_mach_msg_revert(voucher_mach_msg_state_t state);

    /**
     * API-Since: 18.0
     */
    @Generated
    @CFunction
    public static native int DNSServiceAttributeSetHostKeyHash(@NotNull DNSServiceAttributeRef attr, int hostkeyhash);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     */
    @Generated
    @Variadic()
    @Deprecated
    @CFunction
    public static native void os_trace_info_with_payload(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String format,
            Object... varargs);

    /**
     * [@function] os_unfair_lock_lock_with_flags
     * 
     * Locks an os_unfair_lock.
     * 
     * @param lock
     *              Pointer to an os_unfair_lock.
     * 
     * @param flags
     *              Flags to alter the behavior of the lock. See os_unfair_lock_flags_t.
     * 
     *              API-Since: 18.0
     */
    @Generated
    @CFunction
    public static native void os_unfair_lock_lock_with_flags(
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull os_unfair_lock_s lock,
            int flags);

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @NotNull
    public static native String _xpc_error_key_description();

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @NotNull
    public static native String _xpc_event_key_name();

    /**
     * int (%)
     * 
     * API-Since: 7.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: REQUIRE_BATTERY_LEVEL is not implemented
     */
    @Generated
    @Deprecated
    @CVariable()
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @NotNull
    public static native String XPC_ACTIVITY_REQUIRE_BATTERY_LEVEL();

    /**
     * bool
     * 
     * API-Since: 7.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: REQUIRE_HDD_SPINNING is not implemented
     */
    @Generated
    @Deprecated
    @CVariable()
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @NotNull
    public static native String XPC_ACTIVITY_REQUIRE_HDD_SPINNING();

    /**
     * Globally interesting numbers.
     * These macros assume vm_page_size is a power-of-2.
     */
    @Generated
    @CVariable()
    @NUInt
    public static native long vm_page_size();

    @Generated
    @CVariable()
    @NUInt
    public static native long vm_page_mask();

    @Generated
    @CVariable()
    public static native int vm_page_shift();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @NUInt
    public static native long vm_kernel_page_size();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @NUInt
    public static native long vm_kernel_page_mask();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native int vm_kernel_page_shift();

    @Generated
    @CVariable()
    @ByValue
    public static native NDR_record_t NDR_record();

    @Generated
    @CVariable()
    public static native int mach_task_self_();

    /**
     * Other important ports in the Mach user environment
     */
    @Generated
    @CVariable()
    public static native int bootstrap_port();

    @Generated public static final double __has_safe_buffers = 0.0;
    @Generated public static final double USE_CLANG_TYPES = 0.0;
    @Generated public static final double USE_CLANG_STDDEF = 0.0;
    @Generated public static final double __MAC_14_3 = 140300.0;
    @Generated public static final double __MAC_14_4 = 140400.0;
    @Generated public static final double __MAC_14_5 = 140500.0;
    @Generated public static final double __MAC_15_0 = 150000.0;
    @Generated public static final double __MAC_15_1 = 150100.0;
    @Generated public static final double __MAC_15_2 = 150200.0;
    @Generated public static final double __IPHONE_15_7 = 150700.0;
    @Generated public static final double __IPHONE_15_8 = 150800.0;
    @Generated public static final double __IPHONE_17_3 = 170300.0;
    @Generated public static final double __IPHONE_17_4 = 170400.0;
    @Generated public static final double __IPHONE_17_5 = 170500.0;
    @Generated public static final double __IPHONE_18_0 = 180000.0;
    @Generated public static final double __IPHONE_18_1 = 180100.0;
    @Generated public static final double __IPHONE_18_2 = 180200.0;
    @Generated public static final double __WATCHOS_8_8 = 80800.0;
    @Generated public static final double __WATCHOS_10_3 = 100300.0;
    @Generated public static final double __WATCHOS_10_4 = 100400.0;
    @Generated public static final double __WATCHOS_10_5 = 100500.0;
    @Generated public static final double __WATCHOS_11_0 = 110000.0;
    @Generated public static final double __WATCHOS_11_1 = 110100.0;
    @Generated public static final double __WATCHOS_11_2 = 110200.0;
    @Generated public static final double __TVOS_17_3 = 170300.0;
    @Generated public static final double __TVOS_17_4 = 170400.0;
    @Generated public static final double __TVOS_17_5 = 170500.0;
    @Generated public static final double __TVOS_18_0 = 180000.0;
    @Generated public static final double __TVOS_18_1 = 180100.0;
    @Generated public static final double __TVOS_18_2 = 180200.0;
    @Generated public static final double __BRIDGEOS_8_3 = 80300.0;
    @Generated public static final double __BRIDGEOS_8_4 = 80400.0;
    @Generated public static final double __BRIDGEOS_8_5 = 80500.0;
    @Generated public static final double __BRIDGEOS_9_0 = 90000.0;
    @Generated public static final double __BRIDGEOS_9_1 = 90100.0;
    @Generated public static final double __BRIDGEOS_9_2 = 90200.0;
    @Generated public static final double __DRIVERKIT_23_3 = 230300.0;
    @Generated public static final double __DRIVERKIT_23_4 = 230400.0;
    @Generated public static final double __DRIVERKIT_23_5 = 230500.0;
    @Generated public static final double __DRIVERKIT_24_0 = 240000.0;
    @Generated public static final double __DRIVERKIT_24_1 = 240100.0;
    @Generated public static final double __DRIVERKIT_24_2 = 240200.0;
    @Generated public static final double __VISIONOS_1_1 = 10100.0;
    @Generated public static final double __VISIONOS_1_2 = 10200.0;
    @Generated public static final double __VISIONOS_2_0 = 20000.0;
    @Generated public static final double __VISIONOS_2_1 = 20100.0;
    @Generated public static final double __VISIONOS_2_2 = 20200.0;
    @Generated public static final double USE_CLANG_LIMITS = 0.0;
    @Generated public static final double USE_CLANG_STDARG = 0.0;
    @Generated public static final double MPO_EXCEPTION_PORT = 32768.0;
    @Generated public static final double F_ADDSIGS_MAIN_BINARY = 113.0;
    @Generated public static final double CPUFAMILY_ARM_DONAN = 1.86759006E9;
    @Generated public static final double CPUFAMILY_ARM_BRAVA = 3.99882554E8;
    @Generated public static final double CPUFAMILY_ARM_TAHITI = 1.976872121E9;
    @Generated public static final double CPUFAMILY_ARM_TUPAI = 5.41402832E8;
    @Generated public static final double PROT_NONE = 0.0;
    @Generated public static final double PROT_READ = 1.0;
    @Generated public static final double PROT_WRITE = 2.0;
    @Generated public static final double PROT_EXEC = 4.0;
    @Generated public static final double MAP_SHARED = 1.0;
    @Generated public static final double MAP_PRIVATE = 2.0;
    @Generated public static final double MAP_FIXED = 16.0;
    @Generated public static final double MAP_RENAME = 32.0;
    @Generated public static final double MAP_NORESERVE = 64.0;
    @Generated public static final double MAP_RESERVED0080 = 128.0;
    @Generated public static final double MAP_NOEXTEND = 256.0;
    @Generated public static final double MAP_HASSEMAPHORE = 512.0;
    @Generated public static final double MAP_NOCACHE = 1024.0;
    @Generated public static final double MAP_JIT = 2048.0;
    @Generated public static final double MAP_FILE = 0.0;
    @Generated public static final double MAP_ANON = 4096.0;
    @Generated public static final double MAP_RESILIENT_CODESIGN = 8192.0;
    @Generated public static final double MAP_RESILIENT_MEDIA = 16384.0;
    @Generated public static final double MAP_TRANSLATED_ALLOW_EXECUTE = 131072.0;
    @Generated public static final double MAP_UNIX03 = 262144.0;
    @Generated public static final double MAP_TPRO = 524288.0;
    @Generated public static final double MCL_CURRENT = 1.0;
    @Generated public static final double MCL_FUTURE = 2.0;
    @Generated public static final double MS_ASYNC = 1.0;
    @Generated public static final double MS_INVALIDATE = 2.0;
    @Generated public static final double MS_SYNC = 16.0;
    @Generated public static final double MS_KILLPAGES = 4.0;
    @Generated public static final double MS_DEACTIVATE = 8.0;
    @Generated public static final double POSIX_MADV_NORMAL = 0.0;
    @Generated public static final double POSIX_MADV_RANDOM = 1.0;
    @Generated public static final double POSIX_MADV_SEQUENTIAL = 2.0;
    @Generated public static final double POSIX_MADV_WILLNEED = 3.0;
    @Generated public static final double POSIX_MADV_DONTNEED = 4.0;
    @Generated public static final double MADV_FREE = 5.0;
    @Generated public static final double MADV_ZERO_WIRED_PAGES = 6.0;
    @Generated public static final double MADV_FREE_REUSABLE = 7.0;
    @Generated public static final double MADV_FREE_REUSE = 8.0;
    @Generated public static final double MADV_CAN_REUSE = 9.0;
    @Generated public static final double MADV_PAGEOUT = 10.0;
    @Generated public static final double MADV_ZERO = 11.0;
    @Generated public static final double MINCORE_INCORE = 1.0;
    @Generated public static final double MINCORE_REFERENCED = 2.0;
    @Generated public static final double MINCORE_MODIFIED = 4.0;
    @Generated public static final double MINCORE_REFERENCED_OTHER = 8.0;
    @Generated public static final double MINCORE_MODIFIED_OTHER = 16.0;
    @Generated public static final double MINCORE_PAGED_OUT = 32.0;
    @Generated public static final double MINCORE_COPIED = 64.0;
    @Generated public static final double MINCORE_ANONYMOUS = 128.0;
    @Generated public static final double IPHONE_SIMULATOR_HOST_MIN_VERSION_REQUIRED = 999999.0;
    @Generated public static final double XPC_API_VERSION = 2.020061E7;
    @Generated public static final double VM_PAGE_QUERY_PAGE_PRESENT = 1.0;
    @Generated public static final double VM_PAGE_QUERY_PAGE_FICTITIOUS = 2.0;
    @Generated public static final double VM_PAGE_QUERY_PAGE_REF = 4.0;
    @Generated public static final double VM_PAGE_QUERY_PAGE_DIRTY = 8.0;
    @Generated public static final double VM_PAGE_QUERY_PAGE_PAGED_OUT = 16.0;
    @Generated public static final double VM_PAGE_QUERY_PAGE_COPIED = 32.0;
    @Generated public static final double VM_PAGE_QUERY_PAGE_SPECULATIVE = 64.0;
    @Generated public static final double VM_PAGE_QUERY_PAGE_EXTERNAL = 128.0;
    @Generated public static final double VM_PAGE_QUERY_PAGE_CS_VALIDATED = 256.0;
    @Generated public static final double VM_PAGE_QUERY_PAGE_CS_TAINTED = 512.0;
    @Generated public static final double VM_PAGE_QUERY_PAGE_CS_NX = 1024.0;
    @Generated public static final double VM_PAGE_QUERY_PAGE_REUSABLE = 2048.0;
    @Generated public static final double VM_FLAGS_FIXED = 0.0;
    @Generated public static final double VM_FLAGS_ANYWHERE = 1.0;
    @Generated public static final double VM_FLAGS_PURGABLE = 2.0;
    @Generated public static final double VM_FLAGS_4GB_CHUNK = 4.0;
    @Generated public static final double VM_FLAGS_RANDOM_ADDR = 8.0;
    @Generated public static final double VM_FLAGS_NO_CACHE = 16.0;
    @Generated public static final double VM_FLAGS_RESILIENT_CODESIGN = 32.0;
    @Generated public static final double VM_FLAGS_RESILIENT_MEDIA = 64.0;
    @Generated public static final double VM_FLAGS_PERMANENT = 128.0;
    @Generated public static final double VM_FLAGS_TPRO = 4096.0;
    @Generated public static final double VM_FLAGS_OVERWRITE = 16384.0;
    @Generated public static final double VM_FLAGS_SUPERPAGE_MASK = 458752.0;
    @Generated public static final double VM_FLAGS_RETURN_DATA_ADDR = 1048576.0;
    @Generated public static final double VM_FLAGS_RETURN_4K_DATA_ADDR = 8388608.0;
    @Generated public static final double VM_FLAGS_SUPERPAGE_SHIFT = 16.0;
    @Generated public static final double SUPERPAGE_NONE = 0.0;
    @Generated public static final double SUPERPAGE_SIZE_ANY = 1.0;
    @Generated public static final double SUPERPAGE_SIZE_2MB = 2.0;
    @Generated public static final double GUARD_TYPE_VIRT_MEMORY = 5.0;
    @Generated public static final double __VM_LEDGER_ACCOUNTING_POSTMARK = 2.0190326E9;
    @Generated public static final double VM_LEDGER_TAG_NONE = 0.0;
    @Generated public static final double VM_LEDGER_TAG_DEFAULT = 1.0;
    @Generated public static final double VM_LEDGER_TAG_NETWORK = 2.0;
    @Generated public static final double VM_LEDGER_TAG_MEDIA = 3.0;
    @Generated public static final double VM_LEDGER_TAG_GRAPHICS = 4.0;
    @Generated public static final double VM_LEDGER_TAG_NEURAL = 5.0;
    @Generated public static final double VM_LEDGER_TAG_MAX = 5.0;
    @Generated public static final double VM_MEMORY_MALLOC = 1.0;
    @Generated public static final double VM_MEMORY_MALLOC_SMALL = 2.0;
    @Generated public static final double VM_MEMORY_MALLOC_LARGE = 3.0;
    @Generated public static final double VM_MEMORY_MALLOC_HUGE = 4.0;
    @Generated public static final double VM_MEMORY_SBRK = 5.0;
    @Generated public static final double VM_MEMORY_REALLOC = 6.0;
    @Generated public static final double VM_MEMORY_MALLOC_TINY = 7.0;
    @Generated public static final double VM_MEMORY_MALLOC_LARGE_REUSABLE = 8.0;
    @Generated public static final double VM_MEMORY_MALLOC_LARGE_REUSED = 9.0;
    @Generated public static final double VM_MEMORY_ANALYSIS_TOOL = 10.0;
    @Generated public static final double VM_MEMORY_MALLOC_NANO = 11.0;
    @Generated public static final double VM_MEMORY_MALLOC_MEDIUM = 12.0;
    @Generated public static final double VM_MEMORY_MALLOC_PROB_GUARD = 13.0;
    @Generated public static final double VM_MEMORY_MACH_MSG = 20.0;
    @Generated public static final double VM_MEMORY_IOKIT = 21.0;
    @Generated public static final double VM_MEMORY_STACK = 30.0;
    @Generated public static final double VM_MEMORY_GUARD = 31.0;
    @Generated public static final double VM_MEMORY_SHARED_PMAP = 32.0;
    @Generated public static final double VM_MEMORY_DYLIB = 33.0;
    @Generated public static final double VM_MEMORY_OBJC_DISPATCHERS = 34.0;
    @Generated public static final double VM_MEMORY_UNSHARED_PMAP = 35.0;
    @Generated public static final double VM_MEMORY_APPKIT = 40.0;
    @Generated public static final double VM_MEMORY_FOUNDATION = 41.0;
    @Generated public static final double VM_MEMORY_COREGRAPHICS = 42.0;
    @Generated public static final double VM_MEMORY_CORESERVICES = 43.0;
    @Generated public static final double VM_MEMORY_JAVA = 44.0;
    @Generated public static final double VM_MEMORY_COREDATA = 45.0;
    @Generated public static final double VM_MEMORY_COREDATA_OBJECTIDS = 46.0;
    @Generated public static final double VM_MEMORY_ATS = 50.0;
    @Generated public static final double VM_MEMORY_LAYERKIT = 51.0;
    @Generated public static final double VM_MEMORY_CGIMAGE = 52.0;
    @Generated public static final double VM_MEMORY_TCMALLOC = 53.0;
    @Generated public static final double VM_MEMORY_COREGRAPHICS_DATA = 54.0;
    @Generated public static final double VM_MEMORY_COREGRAPHICS_SHARED = 55.0;
    @Generated public static final double VM_MEMORY_COREGRAPHICS_FRAMEBUFFERS = 56.0;
    @Generated public static final double VM_MEMORY_COREGRAPHICS_BACKINGSTORES = 57.0;
    @Generated public static final double VM_MEMORY_COREGRAPHICS_XALLOC = 58.0;
    @Generated public static final double VM_MEMORY_DYLD = 60.0;
    @Generated public static final double VM_MEMORY_DYLD_MALLOC = 61.0;
    @Generated public static final double VM_MEMORY_SQLITE = 62.0;
    @Generated public static final double VM_MEMORY_JAVASCRIPT_CORE = 63.0;
    @Generated public static final double VM_MEMORY_JAVASCRIPT_JIT_EXECUTABLE_ALLOCATOR = 64.0;
    @Generated public static final double VM_MEMORY_JAVASCRIPT_JIT_REGISTER_FILE = 65.0;
    @Generated public static final double VM_MEMORY_GLSL = 66.0;
    @Generated public static final double VM_MEMORY_OPENCL = 67.0;
    @Generated public static final double VM_MEMORY_COREIMAGE = 68.0;
    @Generated public static final double VM_MEMORY_WEBCORE_PURGEABLE_BUFFERS = 69.0;
    @Generated public static final double VM_MEMORY_IMAGEIO = 70.0;
    @Generated public static final double VM_MEMORY_COREPROFILE = 71.0;
    @Generated public static final double VM_MEMORY_ASSETSD = 72.0;
    @Generated public static final double VM_MEMORY_OS_ALLOC_ONCE = 73.0;
    @Generated public static final double VM_MEMORY_LIBDISPATCH = 74.0;
    @Generated public static final double VM_MEMORY_ACCELERATE = 75.0;
    @Generated public static final double VM_MEMORY_COREUI = 76.0;
    @Generated public static final double VM_MEMORY_COREUIFILE = 77.0;
    @Generated public static final double VM_MEMORY_GENEALOGY = 78.0;
    @Generated public static final double VM_MEMORY_RAWCAMERA = 79.0;
    @Generated public static final double VM_MEMORY_CORPSEINFO = 80.0;
    @Generated public static final double VM_MEMORY_ASL = 81.0;
    @Generated public static final double VM_MEMORY_SWIFT_RUNTIME = 82.0;
    @Generated public static final double VM_MEMORY_SWIFT_METADATA = 83.0;
    @Generated public static final double VM_MEMORY_DHMM = 84.0;
    @Generated public static final double VM_MEMORY_SCENEKIT = 86.0;
    @Generated public static final double VM_MEMORY_SKYWALK = 87.0;
    @Generated public static final double VM_MEMORY_IOSURFACE = 88.0;
    @Generated public static final double VM_MEMORY_LIBNETWORK = 89.0;
    @Generated public static final double VM_MEMORY_AUDIO = 90.0;
    @Generated public static final double VM_MEMORY_VIDEOBITSTREAM = 91.0;
    @Generated public static final double VM_MEMORY_CM_XPC = 92.0;
    @Generated public static final double VM_MEMORY_CM_RPC = 93.0;
    @Generated public static final double VM_MEMORY_CM_MEMORYPOOL = 94.0;
    @Generated public static final double VM_MEMORY_CM_READCACHE = 95.0;
    @Generated public static final double VM_MEMORY_CM_CRABS = 96.0;
    @Generated public static final double VM_MEMORY_QUICKLOOK_THUMBNAILS = 97.0;
    @Generated public static final double VM_MEMORY_ACCOUNTS = 98.0;
    @Generated public static final double VM_MEMORY_SANITIZER = 99.0;
    @Generated public static final double VM_MEMORY_IOACCELERATOR = 100.0;
    @Generated public static final double VM_MEMORY_CM_REGWARP = 101.0;
    @Generated public static final double VM_MEMORY_EAR_DECODER = 102.0;
    @Generated public static final double VM_MEMORY_COREUI_CACHED_IMAGE_DATA = 103.0;
    @Generated public static final double VM_MEMORY_COLORSYNC = 104.0;
    @Generated public static final double VM_MEMORY_BTINFO = 105.0;
    @Generated public static final double VM_MEMORY_CM_HLS = 106.0;
    @Generated public static final double VM_MEMORY_ROSETTA = 230.0;
    @Generated public static final double VM_MEMORY_ROSETTA_THREAD_CONTEXT = 231.0;
    @Generated public static final double VM_MEMORY_ROSETTA_INDIRECT_BRANCH_MAP = 232.0;
    @Generated public static final double VM_MEMORY_ROSETTA_RETURN_STACK = 233.0;
    @Generated public static final double VM_MEMORY_ROSETTA_EXECUTABLE_HEAP = 234.0;
    @Generated public static final double VM_MEMORY_ROSETTA_USER_LDT = 235.0;
    @Generated public static final double VM_MEMORY_ROSETTA_ARENA = 236.0;
    @Generated public static final double VM_MEMORY_ROSETTA_10 = 239.0;
    @Generated public static final double VM_MEMORY_APPLICATION_SPECIFIC_1 = 240.0;
    @Generated public static final double VM_MEMORY_APPLICATION_SPECIFIC_16 = 255.0;
    @Generated public static final double VM_MEMORY_COUNT = 256.0;
    @Generated public static final double HOST_BASIC_INFO = 1.0;
    @Generated public static final double HOST_SCHED_INFO = 3.0;
    @Generated public static final double HOST_RESOURCE_SIZES = 4.0;
    @Generated public static final double HOST_PRIORITY_INFO = 5.0;
    @Generated public static final double HOST_SEMAPHORE_TRAPS = 7.0;
    @Generated public static final double HOST_MACH_MSG_TRAP = 8.0;
    @Generated public static final double HOST_VM_PURGABLE = 9.0;
    @Generated public static final double HOST_DEBUG_INFO_INTERNAL = 10.0;
    @Generated public static final double HOST_CAN_HAS_DEBUGGER = 11.0;
    @Generated public static final double HOST_PREFERRED_USER_ARCH = 12.0;
    @Generated public static final double HOST_LOAD_INFO = 1.0;
    @Generated public static final double HOST_VM_INFO = 2.0;
    @Generated public static final double HOST_CPU_LOAD_INFO = 3.0;
    @Generated public static final double HOST_VM_INFO64 = 4.0;
    @Generated public static final double HOST_EXTMOD_INFO64 = 5.0;
    @Generated public static final double HOST_EXPIRED_TASK_INFO = 6.0;
    @Generated public static final double HOST_NOTIFY_CALENDAR_CHANGE = 0.0;
    @Generated public static final double HOST_NOTIFY_CALENDAR_SET = 1.0;
    @Generated public static final double HOST_NOTIFY_TYPE_MAX = 1.0;
    @Generated public static final double HOST_CALENDAR_CHANGED_REPLYID = 950.0;
    @Generated public static final double HOST_CALENDAR_SET_REPLYID = 951.0;
    @Generated public static final double HOST_SECURITY_PORT = 0.0;
    @Generated public static final double HOST_PORT = 1.0;
    @Generated public static final double HOST_PRIV_PORT = 2.0;
    @Generated public static final double HOST_IO_MAIN_PORT = 3.0;
    @Generated public static final double HOST_MAX_SPECIAL_KERNEL_PORT = 7.0;
    @Generated public static final double HOST_LOCAL_NODE = -1.0;
    @Generated public static final double MEMORY_OBJECT_COPY_NONE = 0.0;
    @Generated public static final double MEMORY_OBJECT_COPY_CALL = 1.0;
    @Generated public static final double MEMORY_OBJECT_COPY_DELAY = 2.0;
    @Generated public static final double MEMORY_OBJECT_COPY_TEMPORARY = 3.0;
    @Generated public static final double MEMORY_OBJECT_COPY_SYMMETRIC = 4.0;
    @Generated public static final double MEMORY_OBJECT_COPY_INVALID = 5.0;
    @Generated public static final double MEMORY_OBJECT_COPY_DELAY_FORK = 6.0;
    @Generated public static final double MEMORY_OBJECT_RETURN_NONE = 0.0;
    @Generated public static final double MEMORY_OBJECT_RETURN_DIRTY = 1.0;
    @Generated public static final double MEMORY_OBJECT_RETURN_ALL = 2.0;
    @Generated public static final double MEMORY_OBJECT_RETURN_ANYTHING = 3.0;
    @Generated public static final double MEMORY_OBJECT_DATA_FLUSH = 1.0;
    @Generated public static final double MEMORY_OBJECT_DATA_NO_CHANGE = 2.0;
    @Generated public static final double MEMORY_OBJECT_DATA_PURGE = 4.0;
    @Generated public static final double MEMORY_OBJECT_COPY_SYNC = 8.0;
    @Generated public static final double MEMORY_OBJECT_DATA_SYNC = 16.0;
    @Generated public static final double MEMORY_OBJECT_IO_SYNC = 32.0;
    @Generated public static final double MEMORY_OBJECT_DATA_FLUSH_ALL = 64.0;
    @Generated public static final double MEMORY_OBJECT_PERFORMANCE_INFO = 11.0;
    @Generated public static final double MEMORY_OBJECT_ATTRIBUTE_INFO = 14.0;
    @Generated public static final double MEMORY_OBJECT_BEHAVIOR_INFO = 15.0;
    @Generated public static final double MEMORY_OBJECT_TERMINATE_IDLE = 1.0;
    @Generated public static final double MEMORY_OBJECT_RESPECT_CACHE = 2.0;
    @Generated public static final double MEMORY_OBJECT_RELEASE_NO_OP = 4.0;
    @Generated public static final double MAP_MEM_NOOP = 0.0;
    @Generated public static final double MAP_MEM_COPYBACK = 1.0;
    @Generated public static final double MAP_MEM_IO = 2.0;
    @Generated public static final double MAP_MEM_WTHRU = 3.0;
    @Generated public static final double MAP_MEM_WCOMB = 4.0;
    @Generated public static final double MAP_MEM_INNERWBACK = 5.0;
    @Generated public static final double MAP_MEM_POSTED = 6.0;
    @Generated public static final double MAP_MEM_RT = 7.0;
    @Generated public static final double MAP_MEM_POSTED_REORDERED = 8.0;
    @Generated public static final double MAP_MEM_POSTED_COMBINED_REORDERED = 9.0;
    @Generated public static final double MAP_MEM_PROT_MASK = 255.0;
    @Generated public static final double MAP_MEM_LEDGER_TAGGED = 8192.0;
    @Generated public static final double MAP_MEM_PURGABLE_KERNEL_ONLY = 16384.0;
    @Generated public static final double MAP_MEM_GRAB_SECLUDED = 32768.0;
    @Generated public static final double MAP_MEM_ONLY = 65536.0;
    @Generated public static final double MAP_MEM_NAMED_CREATE = 131072.0;
    @Generated public static final double MAP_MEM_PURGABLE = 262144.0;
    @Generated public static final double MAP_MEM_NAMED_REUSE = 524288.0;
    @Generated public static final double MAP_MEM_USE_DATA_ADDR = 1048576.0;
    @Generated public static final double MAP_MEM_VM_COPY = 2097152.0;
    @Generated public static final double MAP_MEM_VM_SHARE = 4194304.0;
    @Generated public static final double MAP_MEM_4K_DATA_ADDR = 8388608.0;
    @Generated public static final double MAP_MEM_FLAGS_MASK = 1.677696E7;
    @Generated public static final double EXC_TYPES_COUNT = 14.0;
    @Generated public static final double EXC_MASK_MACHINE = 0.0;
    @Generated public static final double EXCEPTION_CODE_MAX = 2.0;
    @Generated public static final double EXC_ARM_UNDEFINED = 1.0;
    @Generated public static final double EXC_ARM_SME_DISALLOWED = 2.0;
    @Generated public static final double EXC_ARM_FP_UNDEFINED = 0.0;
    @Generated public static final double EXC_ARM_FP_IO = 1.0;
    @Generated public static final double EXC_ARM_FP_DZ = 2.0;
    @Generated public static final double EXC_ARM_FP_OF = 3.0;
    @Generated public static final double EXC_ARM_FP_UF = 4.0;
    @Generated public static final double EXC_ARM_FP_IX = 5.0;
    @Generated public static final double EXC_ARM_FP_ID = 6.0;
    @Generated public static final double EXC_ARM_DA_ALIGN = 257.0;
    @Generated public static final double EXC_ARM_DA_DEBUG = 258.0;
    @Generated public static final double EXC_ARM_SP_ALIGN = 259.0;
    @Generated public static final double EXC_ARM_SWP = 260.0;
    @Generated public static final double EXC_ARM_PAC_FAIL = 261.0;
    @Generated public static final double EXC_ARM_BREAKPOINT = 1.0;
    @Generated public static final double EXC_BAD_ACCESS = 1.0;
    @Generated public static final double EXC_BAD_INSTRUCTION = 2.0;
    @Generated public static final double EXC_ARITHMETIC = 3.0;
    @Generated public static final double EXC_EMULATION = 4.0;
    @Generated public static final double EXC_SOFTWARE = 5.0;
    @Generated public static final double EXC_BREAKPOINT = 6.0;
    @Generated public static final double EXC_SYSCALL = 7.0;
    @Generated public static final double EXC_MACH_SYSCALL = 8.0;
    @Generated public static final double EXC_RPC_ALERT = 9.0;
    @Generated public static final double EXC_CRASH = 10.0;
    @Generated public static final double EXC_RESOURCE = 11.0;
    @Generated public static final double EXC_GUARD = 12.0;
    @Generated public static final double EXC_CORPSE_NOTIFY = 13.0;
    @Generated public static final double EXCEPTION_DEFAULT = 1.0;
    @Generated public static final double EXCEPTION_STATE = 2.0;
    @Generated public static final double EXCEPTION_STATE_IDENTITY = 3.0;
    @Generated public static final double EXCEPTION_IDENTITY_PROTECTED = 4.0;
    @Generated public static final double EXCEPTION_STATE_IDENTITY_PROTECTED = 5.0;
    @Generated public static final double MACH_EXCEPTION_BACKTRACE_PREFERRED = 5.36870912E8;
    @Generated public static final double MACH_EXCEPTION_ERRORS = 1.073741824E9;
    @Generated public static final double FIRST_EXCEPTION = 1.0;
    @Generated public static final double EXC_SOFT_SIGNAL = 65539.0;
    @Generated public static final double EXC_MACF_MIN = 131072.0;
    @Generated public static final double EXC_MACF_MAX = 196607.0;
    @Generated public static final double ARM_EXCEPTION_STATE64_V2 = 10.0;
    @Generated public static final double THREAD_STATE_FLAVORS = 29.0;
    @Generated public static final double THREAD_STATE_FLAVOR_LIST = 0.0;
    @Generated public static final double THREAD_STATE_FLAVOR_LIST_NEW = 128.0;
    @Generated public static final double THREAD_STATE_FLAVOR_LIST_10_9 = 129.0;
    @Generated public static final double THREAD_STATE_FLAVOR_LIST_10_13 = 130.0;
    @Generated public static final double THREAD_STATE_FLAVOR_LIST_10_15 = 131.0;
    @Generated public static final double THREAD_CONVERT_THREAD_STATE_TO_SELF = 1.0;
    @Generated public static final double THREAD_CONVERT_THREAD_STATE_FROM_SELF = 2.0;
    @Generated public static final double MACH_VOUCHER_ATTR_MAX_RAW_RECIPE_ARRAY_SIZE = 5120.0;
    @Generated public static final double MACH_VOUCHER_TRAP_STACK_LIMIT = 256.0;
    @Generated public static final double MACH_VOUCHER_IMPORTANCE_ATTR_ADD_EXTERNAL = 1.0;
    @Generated public static final double MACH_VOUCHER_IMPORTANCE_ATTR_DROP_EXTERNAL = 2.0;
    @Generated public static final double MACH_ACTIVITY_ID_COUNT_MAX = 16.0;
    @Generated public static final double PROCESSOR_CPU_STAT = 2.68435459E8;
    @Generated public static final double PROCESSOR_CPU_STAT64 = 2.6843546E8;
    @Generated public static final double PROCESSOR_BASIC_INFO = 1.0;
    @Generated public static final double PROCESSOR_CPU_LOAD_INFO = 2.0;
    @Generated public static final double PROCESSOR_PM_REGS_INFO = 2.68435457E8;
    @Generated public static final double PROCESSOR_TEMPERATURE = 2.68435458E8;
    @Generated public static final double LOAD_SCALE = 1000.0;
    @Generated public static final double PROCESSOR_SET_BASIC_INFO = 5.0;
    @Generated public static final double PROCESSOR_SET_LOAD_INFO = 4.0;
    @Generated public static final double POLICY_NULL = 0.0;
    @Generated public static final double POLICY_TIMESHARE = 1.0;
    @Generated public static final double POLICY_RR = 2.0;
    @Generated public static final double POLICY_FIFO = 4.0;
    @Generated public static final double TASK_BASIC_INFO_32 = 4.0;
    @Generated public static final double TASK_BASIC2_INFO_32 = 6.0;
    @Generated public static final double TASK_EVENTS_INFO = 2.0;
    @Generated public static final double TASK_THREAD_TIMES_INFO = 3.0;
    @Generated public static final double TASK_ABSOLUTETIME_INFO = 1.0;
    @Generated public static final double TASK_KERNELMEMORY_INFO = 7.0;
    @Generated public static final double TASK_SECURITY_TOKEN = 13.0;
    @Generated public static final double TASK_AUDIT_TOKEN = 15.0;
    @Generated public static final double TASK_AFFINITY_TAG_INFO = 16.0;
    @Generated public static final double TASK_DYLD_INFO = 17.0;
    @Generated public static final double TASK_DYLD_ALL_IMAGE_INFO_32 = 0.0;
    @Generated public static final double TASK_DYLD_ALL_IMAGE_INFO_64 = 1.0;
    @Generated public static final double TASK_BASIC_INFO_64_2 = 18.0;
    @Generated public static final double TASK_EXTMOD_INFO = 19.0;
    @Generated public static final double MACH_TASK_BASIC_INFO = 20.0;
    @Generated public static final double TASK_POWER_INFO = 21.0;
    @Generated public static final double TASK_VM_INFO = 22.0;
    @Generated public static final double TASK_VM_INFO_PURGEABLE = 23.0;
    @Generated public static final double TASK_TRACE_MEMORY_INFO = 24.0;
    @Generated public static final double TASK_WAIT_STATE_INFO = 25.0;
    @Generated public static final double TASK_POWER_INFO_V2 = 26.0;
    @Generated public static final double TASK_VM_INFO_PURGEABLE_ACCOUNT = 27.0;
    @Generated public static final double TASK_FLAGS_INFO = 28.0;
    @Generated public static final double TF_LP64 = 1.0;
    @Generated public static final double TF_64B_DATA = 2.0;
    @Generated public static final double TASK_DEBUG_INFO_INTERNAL = 29.0;
    @Generated public static final double TASK_EXC_GUARD_NONE = 0.0;
    @Generated public static final double TASK_EXC_GUARD_VM_DELIVER = 1.0;
    @Generated public static final double TASK_EXC_GUARD_VM_ONCE = 2.0;
    @Generated public static final double TASK_EXC_GUARD_VM_CORPSE = 4.0;
    @Generated public static final double TASK_EXC_GUARD_VM_FATAL = 8.0;
    @Generated public static final double TASK_EXC_GUARD_VM_ALL = 15.0;
    @Generated public static final double TASK_EXC_GUARD_MP_DELIVER = 16.0;
    @Generated public static final double TASK_EXC_GUARD_MP_ONCE = 32.0;
    @Generated public static final double TASK_EXC_GUARD_MP_CORPSE = 64.0;
    @Generated public static final double TASK_EXC_GUARD_MP_FATAL = 128.0;
    @Generated public static final double TASK_EXC_GUARD_MP_ALL = 240.0;
    @Generated public static final double TASK_EXC_GUARD_ALL = 255.0;
    @Generated public static final double TASK_CORPSE_FORKING_DISABLED_MEM_DIAG = 1.0;
    @Generated public static final double TASK_SCHED_TIMESHARE_INFO = 10.0;
    @Generated public static final double TASK_SCHED_RR_INFO = 11.0;
    @Generated public static final double TASK_SCHED_FIFO_INFO = 12.0;
    @Generated public static final double TASK_SCHED_INFO = 14.0;
    @Generated public static final double TASK_CATEGORY_POLICY = 1.0;
    @Generated public static final double TASK_SUPPRESSION_POLICY = 3.0;
    @Generated public static final double TASK_POLICY_STATE = 4.0;
    @Generated public static final double TASK_BASE_QOS_POLICY = 8.0;
    @Generated public static final double TASK_OVERRIDE_QOS_POLICY = 9.0;
    @Generated public static final double TASK_BASE_LATENCY_QOS_POLICY = 10.0;
    @Generated public static final double TASK_BASE_THROUGHPUT_QOS_POLICY = 11.0;
    @Generated public static final double PROC_FLAG_DARWINBG = 32768.0;
    @Generated public static final double PROC_FLAG_EXT_DARWINBG = 65536.0;
    @Generated public static final double PROC_FLAG_IOS_APPLEDAEMON = 131072.0;
    @Generated public static final double PROC_FLAG_IOS_IMPPROMOTION = 524288.0;
    @Generated public static final double PROC_FLAG_ADAPTIVE = 1048576.0;
    @Generated public static final double PROC_FLAG_ADAPTIVE_IMPORTANT = 2097152.0;
    @Generated public static final double PROC_FLAG_IMPORTANCE_DONOR = 4194304.0;
    @Generated public static final double PROC_FLAG_SUPPRESSED = 8388608.0;
    @Generated public static final double PROC_FLAG_APPLICATION = 1.6777216E7;
    @Generated public static final double TASK_KERNEL_PORT = 1.0;
    @Generated public static final double TASK_HOST_PORT = 2.0;
    @Generated public static final double TASK_NAME_PORT = 3.0;
    @Generated public static final double TASK_BOOTSTRAP_PORT = 4.0;
    @Generated public static final double TASK_INSPECT_PORT = 5.0;
    @Generated public static final double TASK_READ_PORT = 6.0;
    @Generated public static final double TASK_ACCESS_PORT = 9.0;
    @Generated public static final double TASK_DEBUG_CONTROL_PORT = 10.0;
    @Generated public static final double TASK_RESOURCE_NOTIFY_PORT = 11.0;
    @Generated public static final double THREAD_BASIC_INFO = 3.0;
    @Generated public static final double THREAD_IDENTIFIER_INFO = 4.0;
    @Generated public static final double TH_USAGE_SCALE = 1000.0;
    @Generated public static final double TH_STATE_RUNNING = 1.0;
    @Generated public static final double TH_STATE_STOPPED = 2.0;
    @Generated public static final double TH_STATE_WAITING = 3.0;
    @Generated public static final double TH_STATE_UNINTERRUPTIBLE = 4.0;
    @Generated public static final double TH_STATE_HALTED = 5.0;
    @Generated public static final double TH_FLAGS_SWAPPED = 1.0;
    @Generated public static final double TH_FLAGS_IDLE = 2.0;
    @Generated public static final double TH_FLAGS_GLOBAL_FORCED_IDLE = 4.0;
    @Generated public static final double THREAD_EXTENDED_INFO = 5.0;
    @Generated public static final double MAXTHREADNAMESIZE = 64.0;
    @Generated public static final double THREAD_DEBUG_INFO_INTERNAL = 6.0;
    @Generated public static final double IO_NUM_PRIORITIES = 4.0;
    @Generated public static final double THREAD_SCHED_TIMESHARE_INFO = 10.0;
    @Generated public static final double THREAD_SCHED_RR_INFO = 11.0;
    @Generated public static final double THREAD_SCHED_FIFO_INFO = 12.0;
    @Generated public static final double THREAD_STANDARD_POLICY = 1.0;
    @Generated public static final double THREAD_STANDARD_POLICY_COUNT = 0.0;
    @Generated public static final double THREAD_EXTENDED_POLICY = 1.0;
    @Generated public static final double THREAD_TIME_CONSTRAINT_POLICY = 2.0;
    @Generated public static final double THREAD_PRECEDENCE_POLICY = 3.0;
    @Generated public static final double THREAD_AFFINITY_POLICY = 4.0;
    @Generated public static final double THREAD_AFFINITY_TAG_NULL = 0.0;
    @Generated public static final double THREAD_BACKGROUND_POLICY = 5.0;
    @Generated public static final double THREAD_BACKGROUND_POLICY_DARWIN_BG = 4096.0;
    @Generated public static final double THREAD_LATENCY_QOS_POLICY = 7.0;
    @Generated public static final double THREAD_THROUGHPUT_QOS_POLICY = 8.0;
    @Generated public static final double THREAD_KERNEL_PORT = 1.0;
    @Generated public static final double THREAD_INSPECT_PORT = 2.0;
    @Generated public static final double THREAD_READ_PORT = 3.0;
    @Generated public static final double MATTR_CACHE = 1.0;
    @Generated public static final double MATTR_MIGRATE = 2.0;
    @Generated public static final double MATTR_REPLICATE = 4.0;
    @Generated public static final double MATTR_VAL_OFF = 0.0;
    @Generated public static final double MATTR_VAL_ON = 1.0;
    @Generated public static final double MATTR_VAL_GET = 2.0;
    @Generated public static final double MATTR_VAL_CACHE_FLUSH = 6.0;
    @Generated public static final double MATTR_VAL_DCACHE_FLUSH = 7.0;
    @Generated public static final double MATTR_VAL_ICACHE_FLUSH = 8.0;
    @Generated public static final double MATTR_VAL_CACHE_SYNC = 9.0;
    @Generated public static final double MATTR_VAL_GET_INFO = 10.0;
    @Generated public static final double VM_PURGABLE_NO_AGING_SHIFT = 16.0;
    @Generated public static final double VM_PURGABLE_DEBUG_SHIFT = 12.0;
    @Generated public static final double VM_VOLATILE_GROUP_SHIFT = 8.0;
    @Generated public static final double VM_PURGABLE_BEHAVIOR_SHIFT = 6.0;
    @Generated public static final double VM_PURGABLE_ORDERING_SHIFT = 5.0;
    @Generated public static final double VM_VOLATILE_ORDER_SHIFT = 4.0;
    @Generated public static final double VM_PURGABLE_STATE_MIN = 0.0;
    @Generated public static final double VM_PURGABLE_STATE_MAX = 3.0;
    @Generated public static final double VM_PURGABLE_STATE_MASK = 3.0;
    @Generated public static final double VM_PURGABLE_NONVOLATILE = 0.0;
    @Generated public static final double VM_PURGABLE_VOLATILE = 1.0;
    @Generated public static final double VM_PURGABLE_EMPTY = 2.0;
    @Generated public static final double VM_PURGABLE_DENY = 3.0;
    @Generated public static final double BYTE_SIZE = 8.0;
    @Generated public static final double PAGE_MAX_SHIFT = 14.0;
    @Generated public static final double PAGE_MIN_SHIFT = 12.0;
    @Generated public static final double SWI_SYSCALL = 128.0;
    @Generated public static final double VM_REGION_BASIC_INFO_64 = 9.0;
    @Generated public static final double VM_REGION_BASIC_INFO = 10.0;
    @Generated public static final double SM_COW = 1.0;
    @Generated public static final double SM_PRIVATE = 2.0;
    @Generated public static final double SM_EMPTY = 3.0;
    @Generated public static final double SM_SHARED = 4.0;
    @Generated public static final double SM_TRUESHARED = 5.0;
    @Generated public static final double SM_PRIVATE_ALIASED = 6.0;
    @Generated public static final double SM_SHARED_ALIASED = 7.0;
    @Generated public static final double SM_LARGE_PAGE = 8.0;
    @Generated public static final double VM_REGION_EXTENDED_INFO = 13.0;
    @Generated public static final double VM_REGION_TOP_INFO = 12.0;
    @Generated public static final double VM_PAGE_INFO_BASIC = 1.0;
    @Generated public static final double KMOD_MAX_NAME = 64.0;
    @Generated public static final double KMOD_INFO_VERSION = 1.0;
    @Generated public static final double TASK_FLAVOR_CONTROL = 0.0;
    @Generated public static final double TASK_FLAVOR_READ = 1.0;
    @Generated public static final double TASK_FLAVOR_INSPECT = 2.0;
    @Generated public static final double TASK_FLAVOR_NAME = 3.0;
    @Generated public static final double THREAD_FLAVOR_CONTROL = 0.0;
    @Generated public static final double THREAD_FLAVOR_READ = 1.0;
    @Generated public static final double THREAD_FLAVOR_INSPECT = 2.0;
    @Generated public static final double SIMD_CURRENT_LIBRARY_VERSION = 6.0;
    @Generated public static final double NDR_PROTOCOL_2_0 = 0.0;
    @Generated public static final double NDR_INT_BIG_ENDIAN = 0.0;
    @Generated public static final double NDR_INT_LITTLE_ENDIAN = 1.0;
    @Generated public static final double NDR_FLOAT_IEEE = 0.0;
    @Generated public static final double NDR_FLOAT_VAX = 1.0;
    @Generated public static final double NDR_FLOAT_CRAY = 2.0;
    @Generated public static final double NDR_FLOAT_IBM = 3.0;
    @Generated public static final double NDR_CHAR_ASCII = 0.0;
    @Generated public static final double NDR_CHAR_EBCDIC = 1.0;
    @Generated public static final double __NDR_convert__ = 0.0;
    @Generated public static final double __NDR_convert__char_rep__ = 0.0;
    @Generated public static final double __NDR_convert__float_rep__ = 0.0;
    @Generated public static final double MACH_NOTIFY_FIRST = 100.0;
    @Generated public static final double __MigTypeCheck = 1.0;
    @Generated public static final double __MigPackStructs = 1.0;
    @Generated public static final double MIG_TYPE_ERROR = -300.0;
    @Generated public static final double MIG_REPLY_MISMATCH = -301.0;
    @Generated public static final double MIG_REMOTE_ERROR = -302.0;
    @Generated public static final double MIG_BAD_ID = -303.0;
    @Generated public static final double MIG_BAD_ARGUMENTS = -304.0;
    @Generated public static final double MIG_NO_REPLY = -305.0;
    @Generated public static final double MIG_EXCEPTION = -306.0;
    @Generated public static final double MIG_ARRAY_TOO_LARGE = -307.0;
    @Generated public static final double MIG_SERVER_DIED = -308.0;
    @Generated public static final double MIG_TRAILER_ERROR = -309.0;
    @Generated public static final double clock_priv_MSG_COUNT = 2.0;
    @Generated public static final double host_priv_MSG_COUNT = 26.0;
    @Generated public static final double ZONE_NAME_MAX_LEN = 80.0;
    @Generated public static final double MACH_ZONE_NAME_MAX_LEN = 80.0;
    @Generated public static final double MACH_MEMORY_INFO_NAME_MAX_LEN = 80.0;
    @Generated public static final double MAX_ZTRACE_DEPTH = 15.0;
    @Generated public static final double ZOP_ALLOC = 1.0;
    @Generated public static final double ZOP_FREE = 0.0;
    @Generated public static final double LOCKGROUP_MAX_NAME = 64.0;
    @Generated public static final double MACH_CORE_FILEHEADER_MAXFILES = 16.0;
    @Generated public static final double MACH_CORE_FILEHEADER_NAMELEN = 16.0;
    @Generated public static final double KOBJECT_DESCRIPTION_LENGTH = 512.0;
    @Generated public static final double host_security_MSG_COUNT = 2.0;
    @Generated public static final double processor_MSG_COUNT = 6.0;
    @Generated public static final double processor_set_MSG_COUNT = 11.0;
    @Generated public static final double SYNC_POLICY_FIFO = 0.0;
    @Generated public static final double SYNC_POLICY_FIXED_PRIORITY = 1.0;
    @Generated public static final double SYNC_POLICY_REVERSED = 2.0;
    @Generated public static final double SYNC_POLICY_ORDER_MASK = 3.0;
    @Generated public static final double task_MSG_COUNT = 66.0;
    @Generated public static final double thread_act_MSG_COUNT = 32.0;
    @Generated public static final double vm_map_MSG_COUNT = 33.0;
    @Generated public static final double mach_port_MSG_COUNT = 43.0;
    @Generated public static final double _MACH_INIT_ = 1.0;
    @Generated public static final double NAME_SERVER_SLOT = 0.0;
    @Generated public static final double ENVIRONMENT_SLOT = 1.0;
    @Generated public static final double SERVICE_SLOT = 2.0;
    @Generated public static final double MACH_PORTS_SLOTS_USED = 3.0;
    @Generated public static final double mach_host_MSG_COUNT = 35.0;
    @Generated public static final double SWITCH_OPTION_NONE = 0.0;
    @Generated public static final double SWITCH_OPTION_DEPRESS = 1.0;
    @Generated public static final double SWITCH_OPTION_WAIT = 2.0;
    @Generated public static final double RPC_SIGBUF_SIZE = 8.0;
    @Generated public static final double _MACH_ERROR_ = 1.0;
    @Generated public static final double err_max_system = 63.0;
    @Generated public static final double VOUCHER_MACH_MSG_API_VERSION = 2.0140205E7;
    @Generated public static final double SO_BINDTODEVICE = 4404.0;
    @Generated public static final double MH_IMPLICIT_PAGEZERO = 2.68435456E8;
    @Generated public static final double DYLIB_USE_WEAK_LINK = 1.0;
    @Generated public static final double DYLIB_USE_REEXPORT = 2.0;
    @Generated public static final double DYLIB_USE_UPWARD = 4.0;
    @Generated public static final double DYLIB_USE_DELAYED_INIT = 8.0;
    @Generated public static final double DYLIB_USE_MARKER = 4.43815936E8;
}
