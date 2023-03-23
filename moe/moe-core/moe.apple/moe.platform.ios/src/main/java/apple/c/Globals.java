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

import apple.NSObject;
import apple.OS_os_workgroup;
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
import apple.struct.__double2;
import apple.struct.__float2;
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
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String sel_getName(SEL sel);

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
    @Generated
    @CFunction
    public static native SEL sel_registerName(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String str);

    /**
     * Returns the class name of a given object.
     * 
     * @param obj An Objective-C object.
     * 
     * @return The name of the class of which \e obj is an instance.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String object_getClassName(@Mapped(ObjCObjectMapper.class) Object obj);

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
    public static native boolean sel_isMapped(SEL sel);

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
    @Generated
    @CFunction
    public static native SEL sel_getUid(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String str);

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
    public static native VoidPtr valloc(@NUInt long arg1);

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
            @UncertainArgument("Options: reference, array Fallback: reference") timespec when, long delta);

    @Generated
    @Inline
    @CFunction
    public static native void _dispatch_object_validate(NSObject object);

    /**
     * [@function] dispatch_retain
     * 
     * Increment the reference count of a dispatch object.
     * 
     * Calls to dispatch_retain() must be balanced with calls to
     * dispatch_release().
     * 
     * @param object
     *               The object to retain.
     *               The result of passing NULL in this parameter is undefined.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_retain(NSObject object);

    /**
     * [@function] dispatch_release
     * 
     * Decrement the reference count of a dispatch object.
     * 
     * A dispatch object is asynchronously deallocated once all references are
     * released (i.e. the reference count becomes zero). The system does not
     * guarantee that a given client is the last or only reference to a given
     * object.
     * 
     * @param object
     *               The object to release.
     *               The result of passing NULL in this parameter is undefined.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_release(NSObject object);

    /**
     * [@function] dispatch_get_context
     * 
     * Returns the application defined context of the object.
     * 
     * @param object
     *               The result of passing NULL in this parameter is undefined.
     * 
     * @return
     *         The context of the object; may be NULL.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native VoidPtr dispatch_get_context(NSObject object);

    /**
     * [@function] dispatch_set_context
     * 
     * Associates an application defined context with the object.
     * 
     * @param object
     *                The result of passing NULL in this parameter is undefined.
     * 
     * @param context
     *                The new client defined context for the object. This may be NULL.
     * 
     * 
     *                API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_set_context(NSObject object, VoidPtr context);

    /**
     * [@function] dispatch_set_finalizer_f
     * 
     * Set the finalizer function for a dispatch object.
     * 
     * A dispatch object's finalizer will be invoked on the object's target queue
     * after all references to the object have been released. This finalizer may be
     * used by the application to release any resources associated with the object,
     * such as freeing the object's context.
     * The context parameter passed to the finalizer function is the current
     * context of the dispatch object at the time the finalizer call is made.
     * 
     * API-Since: 4.0
     * 
     * @param object
     *                  The dispatch object to modify.
     *                  The result of passing NULL in this parameter is undefined.
     * 
     * @param finalizer
     *                  The finalizer function pointer.
     */
    @Generated
    @CFunction
    public static native void dispatch_set_finalizer_f(NSObject object,
            @FunctionPtr(name = "call_dispatch_set_finalizer_f") Function_dispatch_set_finalizer_f finalizer);

    /**
     * [@function] dispatch_activate
     * 
     * Activates the specified dispatch object.
     * 
     * Dispatch objects such as queues and sources may be created in an inactive
     * state. Objects in this state have to be activated before any blocks
     * associated with them will be invoked.
     * 
     * The target queue of inactive objects can be changed using
     * dispatch_set_target_queue(). Change of target queue is no longer permitted
     * once an initially inactive object has been activated.
     * 
     * Calling dispatch_activate() on an active object has no effect.
     * Releasing the last reference count on an inactive object is undefined.
     * 
     * @param object
     *               The object to be activated.
     *               The result of passing NULL in this parameter is undefined.
     * 
     *               API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native void dispatch_activate(NSObject object);

    /**
     * [@function] dispatch_suspend
     * 
     * Suspends the invocation of blocks on a dispatch object.
     * 
     * A suspended object will not invoke any blocks associated with it. The
     * suspension of an object will occur after any running block associated with
     * the object completes.
     * 
     * Calls to dispatch_suspend() must be balanced with calls
     * to dispatch_resume().
     * 
     * @param object
     *               The object to be suspended.
     *               The result of passing NULL in this parameter is undefined.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_suspend(NSObject object);

    /**
     * [@function] dispatch_resume
     * 
     * Resumes the invocation of blocks on a dispatch object.
     * 
     * Dispatch objects can be suspended with dispatch_suspend(), which increments
     * an internal suspension count. dispatch_resume() is the inverse operation,
     * and consumes suspension counts. When the last suspension count is consumed,
     * blocks associated with the object will be invoked again.
     * 
     * For backward compatibility reasons, dispatch_resume() on an inactive and not
     * otherwise suspended dispatch source object has the same effect as calling
     * dispatch_activate(). For new code, using dispatch_activate() is preferred.
     * 
     * If the specified object has zero suspension count and is not an inactive
     * source, this function will result in an assertion and the process being
     * terminated.
     * 
     * @param object
     *               The object to be resumed.
     *               The result of passing NULL in this parameter is undefined.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_resume(NSObject object);

    /**
     * [@function] dispatch_debug
     * 
     * Programmatically log debug information about a dispatch object.
     * 
     * Programmatically log debug information about a dispatch object. By default,
     * the log output is sent to syslog at notice level. In the debug version of
     * the library, the log output is sent to a file in /var/tmp.
     * The log output destination can be configured via the LIBDISPATCH_LOG
     * environment variable, valid values are: YES, NO, syslog, stderr, file.
     * 
     * This function is deprecated and will be removed in a future release.
     * Objective-C callers may use -debugDescription instead.
     * 
     * @param object
     *                The object to introspect.
     * 
     * @param message
     *                The message to log above and beyond the introspection.
     * 
     *                API-Since: 4.0
     *                Deprecated-Since: 6.0
     *                Deprecated-Message: unsupported interface
     */
    @Generated
    @Variadic()
    @Deprecated
    @CFunction
    public static native void dispatch_debug(NSObject object,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String message,
            Object... varargs);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 6.0
     * Deprecated-Message: unsupported interface
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void dispatch_debugv(NSObject object,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String message,
            BytePtr ap);

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
    public static native void dispatch_async(NSObject queue,
            @ObjCBlock(name = "call_dispatch_async") Block_dispatch_async block);

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
    public static native void dispatch_async_f(NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_async_f") Function_dispatch_async_f work);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_sync(NSObject queue,
            @ObjCBlock(name = "call_dispatch_sync") Block_dispatch_sync block);

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
    public static native void dispatch_sync_f(NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_sync_f") Function_dispatch_sync_f work);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_apply(@NUInt long iterations, NSObject queue,
            @ObjCBlock(name = "call_dispatch_apply") Block_dispatch_apply block);

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
    public static native void dispatch_apply_f(@NUInt long iterations, NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_apply_f") Function_dispatch_apply_f work);

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
    @Generated
    @Deprecated
    @CFunction
    public static native NSObject dispatch_get_current_queue();

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
    @Generated
    @Inline
    @CFunction
    public static native NSObject dispatch_get_main_queue();

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
    @Generated
    @CFunction
    public static native NSObject dispatch_get_global_queue(@NInt long identifier, @NUInt long flags);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_queue_attr_make_initially_inactive(NSObject attr);

    /**
     * [@function] dispatch_queue_attr_make_with_autorelease_frequency
     * 
     * Returns a dispatch queue attribute value with the autorelease frequency
     * set to the specified value.
     * 
     * When a queue uses the per-workitem autorelease frequency (either directly
     * or inherithed from its target queue), any block submitted asynchronously to
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
    @Generated
    @CFunction
    public static native NSObject dispatch_queue_attr_make_with_autorelease_frequency(NSObject attr,
            @NUInt long frequency);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_queue_attr_make_with_qos_class(NSObject attr, int qos_class,
            int relative_priority);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_queue_create_with_target(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label,
            NSObject attr, NSObject target);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_queue_create(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label,
            NSObject attr);

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
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String dispatch_queue_get_label(NSObject queue);

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
    public static native int dispatch_queue_get_qos_class(NSObject queue, IntPtr relative_priority_ptr);

    /**
     * [@function] dispatch_set_target_queue
     * 
     * Sets the target queue for the given object.
     * 
     * An object's target queue is responsible for processing the object.
     * 
     * When no quality of service class and relative priority is specified for a
     * dispatch queue at the time of creation, a dispatch queue's quality of service
     * class is inherited from its target queue. The dispatch_get_global_queue()
     * function may be used to obtain a target queue of a specific quality of
     * service class, however the use of dispatch_queue_attr_make_with_qos_class()
     * is recommended instead.
     * 
     * Blocks submitted to a serial queue whose target queue is another serial
     * queue will not be invoked concurrently with blocks submitted to the target
     * queue or to any other queue with that same target queue.
     * 
     * The result of introducing a cycle into the hierarchy of target queues is
     * undefined.
     * 
     * A dispatch source's target queue specifies where its event handler and
     * cancellation handler blocks will be submitted.
     * 
     * A dispatch I/O channel's target queue specifies where where its I/O
     * operations are executed. If the channel's target queue's priority is set to
     * DISPATCH_QUEUE_PRIORITY_BACKGROUND, then the I/O operations performed by
     * dispatch_io_read() or dispatch_io_write() on that queue will be
     * throttled when there is I/O contention.
     * 
     * For all other dispatch object types, the only function of the target queue
     * is to determine where an object's finalizer function is invoked.
     * 
     * In general, changing the target queue of an object is an asynchronous
     * operation that doesn't take effect immediately, and doesn't affect blocks
     * already associated with the specified object.
     * 
     * However, if an object is inactive at the time dispatch_set_target_queue() is
     * called, then the target queue change takes effect immediately, and will
     * affect blocks already associated with the specified object. After an
     * initially inactive object has been activated, calling
     * dispatch_set_target_queue() results in an assertion and the process being
     * terminated.
     * 
     * If a dispatch queue is active and targeted by other dispatch objects,
     * changing its target queue results in undefined behavior. Instead, it is
     * recommended to create dispatch objects in an inactive state, set up the
     * relevant target queues and then activate them.
     * 
     * @param object
     *               The object to modify.
     *               The result of passing NULL in this parameter is undefined.
     * 
     * @param queue
     *               The new target queue for the object. The queue is retained, and the
     *               previous target queue, if any, is released.
     *               If queue is DISPATCH_TARGET_QUEUE_DEFAULT, set the object's target queue
     *               to the default target queue for the given object type.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_set_target_queue(NSObject object, NSObject queue);

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
    public static native void dispatch_after(long when, NSObject queue,
            @ObjCBlock(name = "call_dispatch_after") Block_dispatch_after block);

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
    public static native void dispatch_after_f(long when, NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_after_f") Function_dispatch_after_f work);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native void dispatch_barrier_async(NSObject queue,
            @ObjCBlock(name = "call_dispatch_barrier_async") Block_dispatch_barrier_async block);

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
    public static native void dispatch_barrier_async_f(NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_barrier_async_f") Function_dispatch_barrier_async_f work);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native void dispatch_barrier_sync(NSObject queue,
            @ObjCBlock(name = "call_dispatch_barrier_sync") Block_dispatch_barrier_sync block);

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
    public static native void dispatch_barrier_sync_f(NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_barrier_sync_f") Function_dispatch_barrier_sync_f work);

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
    public static native void dispatch_queue_set_specific(NSObject queue, ConstVoidPtr key, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_queue_set_specific") Function_dispatch_queue_set_specific destructor);

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
    @Generated
    @CFunction
    public static native VoidPtr dispatch_queue_get_specific(NSObject queue, ConstVoidPtr key);

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
    @Generated
    @CFunction
    public static native VoidPtr dispatch_get_specific(ConstVoidPtr key);

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
    public static native void dispatch_assert_queue(NSObject queue);

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
    public static native void dispatch_assert_queue_barrier(NSObject queue);

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
    public static native void dispatch_assert_queue_not(NSObject queue);

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
    @Generated
    @CFunction
    @ObjCBlock(name = "call_dispatch_block_create_ret")
    public static native Block_dispatch_block_create_ret dispatch_block_create(@NUInt long flags,
            @ObjCBlock(name = "call_dispatch_block_create") Block_dispatch_block_create block);

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
    @Generated
    @CFunction
    @ObjCBlock(name = "call_dispatch_block_create_with_qos_class_ret")
    public static native Block_dispatch_block_create_with_qos_class_ret dispatch_block_create_with_qos_class(
            @NUInt long flags, int qos_class, int relative_priority,
            @ObjCBlock(name = "call_dispatch_block_create_with_qos_class") Block_dispatch_block_create_with_qos_class block);

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
            @ObjCBlock(name = "call_dispatch_block_perform") Block_dispatch_block_perform block);

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
            @ObjCBlock(name = "call_dispatch_block_wait") Block_dispatch_block_wait block, long timeout);

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
            @ObjCBlock(name = "call_dispatch_block_notify_0") Block_dispatch_block_notify_0 block, NSObject queue,
            @ObjCBlock(name = "call_dispatch_block_notify_2") Block_dispatch_block_notify_2 notification_block);

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
            @ObjCBlock(name = "call_dispatch_block_cancel") Block_dispatch_block_cancel block);

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
            @ObjCBlock(name = "call_dispatch_block_testcancel") Block_dispatch_block_testcancel block);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_source_create(dispatch_source_type_t type, @NUInt long handle,
            @NUInt long mask, NSObject queue);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_source_set_event_handler(NSObject source,
            @ObjCBlock(name = "call_dispatch_source_set_event_handler") Block_dispatch_source_set_event_handler handler);

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
    public static native void dispatch_source_set_event_handler_f(NSObject source,
            @FunctionPtr(name = "call_dispatch_source_set_event_handler_f") Function_dispatch_source_set_event_handler_f handler);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_source_set_cancel_handler(NSObject source,
            @ObjCBlock(name = "call_dispatch_source_set_cancel_handler") Block_dispatch_source_set_cancel_handler handler);

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
    public static native void dispatch_source_set_cancel_handler_f(NSObject source,
            @FunctionPtr(name = "call_dispatch_source_set_cancel_handler_f") Function_dispatch_source_set_cancel_handler_f handler);

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
    public static native void dispatch_source_cancel(NSObject source);

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
    public static native long dispatch_source_testcancel(NSObject source);

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
    public static native long dispatch_source_get_handle(NSObject source);

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
    public static native long dispatch_source_get_mask(NSObject source);

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
    public static native long dispatch_source_get_data(NSObject source);

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
    public static native void dispatch_source_merge_data(NSObject source, @NUInt long value);

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
    public static native void dispatch_source_set_timer(NSObject source, long start, long interval, long leeway);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native void dispatch_source_set_registration_handler(NSObject source,
            @ObjCBlock(name = "call_dispatch_source_set_registration_handler") Block_dispatch_source_set_registration_handler handler);

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
    public static native void dispatch_source_set_registration_handler_f(NSObject source,
            @FunctionPtr(name = "call_dispatch_source_set_registration_handler_f") Function_dispatch_source_set_registration_handler_f handler);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_group_create();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_group_async(NSObject group, NSObject queue,
            @ObjCBlock(name = "call_dispatch_group_async") Block_dispatch_group_async block);

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
    public static native void dispatch_group_async_f(NSObject group, NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_group_async_f") Function_dispatch_group_async_f work);

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
    public static native long dispatch_group_wait(NSObject group, long timeout);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_group_notify(NSObject group, NSObject queue,
            @ObjCBlock(name = "call_dispatch_group_notify") Block_dispatch_group_notify block);

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
    public static native void dispatch_group_notify_f(NSObject group, NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_group_notify_f") Function_dispatch_group_notify_f work);

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
    public static native void dispatch_group_enter(NSObject group);

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
    public static native void dispatch_group_leave(NSObject group);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_semaphore_create(@NInt long value);

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
    public static native long dispatch_semaphore_wait(NSObject dsema, long timeout);

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
    public static native long dispatch_semaphore_signal(NSObject dsema);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_once(NIntPtr predicate,
            @ObjCBlock(name = "call_dispatch_once") Block_dispatch_once block);

    @Generated
    @Inline
    @CFunction
    public static native void _dispatch_once(NIntPtr predicate,
            @ObjCBlock(name = "call__dispatch_once") Block__dispatch_once block);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void dispatch_once_f(NIntPtr predicate, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_once_f") Function_dispatch_once_f function);

    @Generated
    @Inline
    @CFunction
    public static native void _dispatch_once_f(NIntPtr predicate, VoidPtr context,
            @FunctionPtr(name = "call__dispatch_once_f") Function__dispatch_once_f function);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_data_create(ConstVoidPtr buffer, @NUInt long size, NSObject queue,
            @ObjCBlock(name = "call_dispatch_data_create") Block_dispatch_data_create destructor);

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
    public static native long dispatch_data_get_size(NSObject data);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_data_create_map(NSObject data, Ptr<ConstVoidPtr> buffer_ptr,
            NUIntPtr size_ptr);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_data_create_concat(NSObject data1, NSObject data2);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_data_create_subrange(NSObject data, @NUInt long offset, @NUInt long length);

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
    public static native boolean dispatch_data_apply(NSObject data,
            @ObjCBlock(name = "call_dispatch_data_apply") Block_dispatch_data_apply applier);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_data_copy_region(NSObject data, @NUInt long location, NUIntPtr offset_ptr);

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
    public static native void dispatch_read(int fd, @NUInt long length, NSObject queue,
            @ObjCBlock(name = "call_dispatch_read") Block_dispatch_read handler);

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
    public static native void dispatch_write(int fd, NSObject data, NSObject queue,
            @ObjCBlock(name = "call_dispatch_write") Block_dispatch_write handler);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_io_create(@NUInt long type, int fd, NSObject queue,
            @ObjCBlock(name = "call_dispatch_io_create") Block_dispatch_io_create cleanup_handler);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_io_create_with_path(@NUInt long type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path, int oflag,
            char mode, NSObject queue,
            @ObjCBlock(name = "call_dispatch_io_create_with_path") Block_dispatch_io_create_with_path cleanup_handler);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_io_create_with_io(@NUInt long type, NSObject io, NSObject queue,
            @ObjCBlock(name = "call_dispatch_io_create_with_io") Block_dispatch_io_create_with_io cleanup_handler);

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
    public static native void dispatch_io_read(NSObject channel, long offset, @NUInt long length, NSObject queue,
            @ObjCBlock(name = "call_dispatch_io_read") Block_dispatch_io_read io_handler);

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
    public static native void dispatch_io_write(NSObject channel, long offset, NSObject data, NSObject queue,
            @ObjCBlock(name = "call_dispatch_io_write") Block_dispatch_io_write io_handler);

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
    public static native void dispatch_io_close(NSObject channel, @NUInt long flags);

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
    public static native void dispatch_io_barrier(NSObject channel,
            @ObjCBlock(name = "call_dispatch_io_barrier") Block_dispatch_io_barrier barrier);

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
    public static native int dispatch_io_get_descriptor(NSObject channel);

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
    public static native void dispatch_io_set_high_water(NSObject channel, @NUInt long high_water);

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
    public static native void dispatch_io_set_low_water(NSObject channel, @NUInt long low_water);

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
    public static native void dispatch_io_set_interval(NSObject channel, long interval, @NUInt long flags);

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
     * __sincospi(x,sinp,cosp) computes the sine and cosine of pi times x with a
     * single function call, storing the sine in the memory pointed to by sinp,
     * and the cosine in the memory pointed to by cosp. Edge cases match those
     * of separate calls to __sinpi( ) and __cospi( ), and are documented in the
     * man pages.
     * 
     * These functions were introduced in OSX 10.9 and iOS 7.0. Because they are
     * implemented as header inlines, weak-linking does not function as normal,
     * and they are simply hidden when targeting earlier OS versions.
     */
    @Generated
    @Inline
    @CFunction
    public static native void __sincospif(float __x, FloatPtr __sinp, FloatPtr __cosp);

    @Generated
    @Inline
    @CFunction
    public static native void __sincospi(double __x, DoublePtr __sinp, DoublePtr __cosp);

    @Generated
    @CFunction
    @ByValue
    public static native __float2 __sincosf_stret(float arg1);

    @Generated
    @CFunction
    @ByValue
    public static native __double2 __sincos_stret(double arg1);

    @Generated
    @CFunction
    @ByValue
    public static native __float2 __sincospif_stret(float arg1);

    @Generated
    @CFunction
    @ByValue
    public static native __double2 __sincospi_stret(double arg1);

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

    @Generated
    @CFunction
    @FunctionPtr(name = "call_bsd_signal_ret")
    public static native Function_bsd_signal_ret bsd_signal(int arg1,
            @FunctionPtr(name = "call_bsd_signal") Function_bsd_signal arg2);

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

    @Generated
    @CFunction
    @FunctionPtr(name = "call_sigset_ret")
    public static native Function_sigset_ret sigset(int arg1, @FunctionPtr(name = "call_sigset") Function_sigset arg2);

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
    public static native FILE funopen(ConstVoidPtr arg1, @FunctionPtr(name = "call_funopen_1") Function_funopen_1 arg2,
            @FunctionPtr(name = "call_funopen_2") Function_funopen_2 arg3,
            @FunctionPtr(name = "call_funopen_3") Function_funopen_3 arg4,
            @FunctionPtr(name = "call_funopen_4") Function_funopen_4 arg5);

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
    public static native int atexit(@FunctionPtr(name = "call_atexit") Function_atexit arg1);

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
            @NUInt long __width, @FunctionPtr(name = "call_bsearch") Function_bsearch __compar);

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
            @FunctionPtr(name = "call_qsort") Function_qsort __compar);

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
    public static native int atexit_b(@ObjCBlock(name = "call_atexit_b") Block_atexit_b arg1);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native VoidPtr bsearch_b(ConstVoidPtr __key, ConstVoidPtr __base, @NUInt long __nel,
            @NUInt long __width, @ObjCBlock(name = "call_bsearch_b") Block_bsearch_b __compar);

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
            @FunctionPtr(name = "call_heapsort") Function_heapsort __compar);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native int heapsort_b(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @ObjCBlock(name = "call_heapsort_b") Block_heapsort_b __compar);

    @Generated
    @CFunction
    public static native int mergesort(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @FunctionPtr(name = "call_mergesort") Function_mergesort __compar);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native int mergesort_b(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @ObjCBlock(name = "call_mergesort_b") Block_mergesort_b __compar);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native void psort(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @FunctionPtr(name = "call_psort") Function_psort __compar);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native void psort_b(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @ObjCBlock(name = "call_psort_b") Block_psort_b __compar);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native void psort_r(VoidPtr __base, @NUInt long __nel, @NUInt long __width, VoidPtr arg4,
            @FunctionPtr(name = "call_psort_r") Function_psort_r __compar);

    /**
     * API-Since: 3.2
     */
    @Generated
    @CFunction
    public static native void qsort_b(VoidPtr __base, @NUInt long __nel, @NUInt long __width,
            @ObjCBlock(name = "call_qsort_b") Block_qsort_b __compar);

    @Generated
    @CFunction
    public static native void qsort_r(VoidPtr __base, @NUInt long __nel, @NUInt long __width, VoidPtr arg4,
            @FunctionPtr(name = "call_qsort_r") Function_qsort_r __compar);

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
            @UncertainArgument("Options: reference, array Fallback: reference") os_unfair_lock_s lock);

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
            @UncertainArgument("Options: reference, array Fallback: reference") os_unfair_lock_s lock);

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
            @UncertainArgument("Options: reference, array Fallback: reference") os_unfair_lock_s lock);

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
    public interface Function_dispatch_set_finalizer_f {
        @Generated
        void call_dispatch_set_finalizer_f(VoidPtr arg0);
    }

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
        void call_dispatch_async_f(VoidPtr arg0);
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
        void call_dispatch_sync_f(VoidPtr arg0);
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
        void call_dispatch_apply_f(VoidPtr arg0, @NUInt long arg1);
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
        void call_dispatch_after_f(VoidPtr arg0);
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
        void call_dispatch_barrier_async_f(VoidPtr arg0);
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
        void call_dispatch_barrier_sync_f(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_queue_set_specific {
        @Generated
        void call_dispatch_queue_set_specific(VoidPtr arg0);
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
        void call_dispatch_source_set_event_handler_f(VoidPtr arg0);
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
        void call_dispatch_source_set_cancel_handler_f(VoidPtr arg0);
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
        void call_dispatch_source_set_registration_handler_f(VoidPtr arg0);
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
        void call_dispatch_group_async_f(VoidPtr arg0);
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
        void call_dispatch_group_notify_f(VoidPtr arg0);
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
        void call_dispatch_once_f(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function__dispatch_once_f {
        @Generated
        void call__dispatch_once_f(VoidPtr arg0);
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
        boolean call_dispatch_data_apply(NSObject region, @NUInt long offset, ConstVoidPtr buffer, @NUInt long size);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_read {
        @Generated
        void call_dispatch_read(NSObject arg0, int arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_write {
        @Generated
        void call_dispatch_write(NSObject arg0, int arg1);
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
        void call_dispatch_io_read(boolean done, NSObject data, int error);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_io_write {
        @Generated
        void call_dispatch_io_write(boolean done, NSObject data, int error);
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
     * Computes accum + x*y by the most efficient means available;
     * either a fused multiply add or separate multiply and add instructions.
     */
    @Generated
    @Inline
    @CFunction
    public static native float simd_muladd(float x, float y, float z);

    /**
     * -1 if x is negative, +1 if x is positive, and 0 otherwise.
     */
    @Generated
    @Inline
    @CFunction
    public static native float simd_sign(float x);

    /**
     * Linearly interpolates between x and y, taking the value x when
     * t=0 and y when t=1
     */
    @Generated
    @Inline
    @CFunction
    public static native float simd_mix(float x, float y, float t);

    /**
     * A good approximation to 1/x.
     * 
     * If x is very close to the limits of representation, the
     * result may overflow or underflow; otherwise this function is accurate to
     * a few units in the last place (ULPs).
     */
    @Generated
    @Inline
    @CFunction
    public static native float simd_precise_recip(float x);

    /**
     * A fast approximation to 1/x.
     * 
     * If x is very close to the limits of representation, the
     * result may overflow or underflow; otherwise this function is accurate to
     * at least 11 bits for float and 22 bits for double.
     */
    @Generated
    @Inline
    @CFunction
    public static native float simd_fast_recip(float x);

    /**
     * An approximation to 1/x.
     * 
     * If x is very close to the limits of representation, the
     * result may overflow or underflow. This function maps to
     * simd_fast_recip(x) if -ffast-math is specified, and to
     * simd_precise_recip(x) otherwise.
     */
    @Generated
    @Inline
    @CFunction
    public static native float simd_recip(float x);

    /**
     * A good approximation to 1/sqrt(x).
     * 
     * This function is accurate to a few units in the last place
     * (ULPs).
     */
    @Generated
    @Inline
    @CFunction
    public static native float simd_precise_rsqrt(float x);

    /**
     * A fast approximation to 1/sqrt(x).
     * 
     * This function is accurate to at least 11 bits for float and
     * 22 bits for double.
     */
    @Generated
    @Inline
    @CFunction
    public static native float simd_fast_rsqrt(float x);

    /**
     * An approximation to 1/sqrt(x).
     * 
     * This function maps to simd_fast_recip(x) if -ffast-math is
     * specified, and to simd_precise_recip(x) otherwise.
     */
    @Generated
    @Inline
    @CFunction
    public static native float simd_rsqrt(float x);

    /**
     * The "fractional part" of x, lying in the range [0, 1).
     * 
     * floor(x) + fract(x) is *approximately* equal to x. If x is
     * positive and finite, then the two values are exactly equal.
     */
    @Generated
    @Inline
    @CFunction
    public static native float simd_fract(float x);

    /**
     * 0 if x < edge, and 1 otherwise.
     * 
     * Use a scalar value for edge if you want to apply the same
     * threshold to all lanes.
     */
    @Generated
    @Inline
    @CFunction
    public static native float simd_step(float edge, float x);

    /**
     * Interpolates smoothly between 0 at edge0 and 1 at edge1
     * 
     * You can use a scalar value for edge0 and edge1 if you want
     * to clamp all lanes at the same points.
     */
    @Generated
    @Inline
    @CFunction
    public static native float simd_smoothstep(float edge0, float edge1, float x);

    /**
     * [@function] dispatch_set_qos_class_floor
     * 
     * Sets the QOS class floor on a dispatch queue, source or workloop.
     * 
     * The QOS class of workitems submitted to this object asynchronously will be
     * elevated to at least the specified QOS class floor. The QOS of the workitem
     * will be used if higher than the floor even when the workitem has been created
     * without "ENFORCE" semantics.
     * 
     * Setting the QOS class floor is equivalent to the QOS effects of configuring
     * a queue whose target queue has a QoS class set to the same value.
     * 
     * @param object
     *                          A dispatch queue, workloop, or source to configure.
     *                          The object must be inactive.
     * 
     *                          Passing another object type or an object that has been activated is undefined
     *                          and will cause the process to be terminated.
     * 
     * @param qos_class
     *                          A QOS class value:
     *                          - QOS_CLASS_USER_INTERACTIVE
     *                          - QOS_CLASS_USER_INITIATED
     *                          - QOS_CLASS_DEFAULT
     *                          - QOS_CLASS_UTILITY
     *                          - QOS_CLASS_BACKGROUND
     *                          Passing any other value is undefined.
     * 
     * @param relative_priority
     *                          A relative priority within the QOS class. This value is a negative
     *                          offset from the maximum supported scheduler priority for the given class.
     *                          Passing a value greater than zero or less than QOS_MIN_RELATIVE_PRIORITY
     *                          is undefined.
     * 
     *                          API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void dispatch_set_qos_class_floor(NSObject object, int qos_class, int relative_priority);

    /**
     * API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void dispatch_async_and_wait(NSObject queue,
            @ObjCBlock(name = "call_dispatch_async_and_wait") Block_dispatch_async_and_wait block);

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
    public static native void dispatch_async_and_wait_f(NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_async_and_wait_f") Function_dispatch_async_and_wait_f work);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_async_and_wait_f {
        @Generated
        void call_dispatch_async_and_wait_f(VoidPtr arg0);
    }

    /**
     * API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void dispatch_barrier_async_and_wait(NSObject queue,
            @ObjCBlock(name = "call_dispatch_barrier_async_and_wait") Block_dispatch_barrier_async_and_wait block);

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
    public static native void dispatch_barrier_async_and_wait_f(NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_barrier_async_and_wait_f") Function_dispatch_barrier_async_and_wait_f work);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_dispatch_barrier_async_and_wait_f {
        @Generated
        void call_dispatch_barrier_async_and_wait_f(VoidPtr arg0);
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
    @Generated
    @CFunction
    public static native NSObject dispatch_workloop_create(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

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
    @Generated
    @CFunction
    public static native NSObject dispatch_workloop_create_inactive(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

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
    public static native void dispatch_workloop_set_autorelease_frequency(NSObject workloop, @NUInt long frequency);

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
    public static native NSObject os_log_create(
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
    public static native boolean os_log_type_enabled(NSObject oslog, byte type);

    /**
     * [@function] _os_log_impl
     * 
     * Internal function that takes compiler generated encoding and captures the necessary content.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native void _os_log_impl(VoidPtr dso, NSObject log, byte type,
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
    public static native void _os_log_debug_impl(VoidPtr dso, NSObject log, byte type,
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
    public static native void _os_log_error_impl(VoidPtr dso, NSObject log, byte type,
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
    public static native void _os_log_fault_impl(VoidPtr dso, NSObject log, byte type,
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
    public static native void _os_log_internal(VoidPtr dso, NSObject log, byte type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String message,
            Object... varargs);

    /**
     * API-Since: 9.0
     */
    @Generated
    @CFunction
    public static native NSObject _os_log_create(VoidPtr dso,
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
    public static native boolean os_log_is_enabled(NSObject log);

    /**
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean os_log_is_debug_enabled(NSObject log);

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
            @UncertainArgument("Options: reference, array Fallback: reference") os_unfair_lock_s lock);

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
            @UncertainArgument("Options: reference, array Fallback: reference") os_unfair_lock_s lock);

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
     * Update a registered resource record.
     * 
     * The record must either be:
     * - The primary txt record of a service registered via DNSServiceRegister()
     * - A record added to a registered service via DNSServiceAddRecord()
     * - An individual record registered by DNSServiceRegisterRecord()
     * 
     * @param sdRef
     *                  A DNSServiceRef that was initialized by DNSServiceRegister()
     *                  or DNSServiceCreateConnection().
     * 
     * @param recordRef
     *                  A DNSRecordRef initialized by DNSServiceAddRecord, or NULL to update the
     *                  service's primary txt record.
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
     * by the client in the callback.
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
    public static native int DNSServiceSetDispatchQueue(DNSServiceRef service, NSObject queue);

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
    public static native long os_signpost_id_make_with_pointer(NSObject log, ConstVoidPtr ptr);

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
    public static native long os_signpost_id_generate(NSObject log);

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
    public static native boolean os_signpost_enabled(NSObject log);

    /**
     * API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void _os_signpost_emit_with_name_impl(VoidPtr dso, NSObject log, byte type, long spid,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String format,
            BytePtr buf, int size);

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
    @Generated
    @CFunction
    public static native VoidPtr object_getIndexedIvars(@Mapped(ObjCObjectMapper.class) Object obj);

    /**
     * API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native VoidPtr aligned_alloc(@NUInt long __alignment, @NUInt long __size);

    /**
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
    @Generated
    @CFunction
    public static native OS_os_workgroup os_workgroup_create_with_workgroup(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            OS_os_workgroup wg);

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
    public static native int os_workgroup_join(OS_os_workgroup wg,
            @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_join_token_opaque_s token_out);

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
    public static native void os_workgroup_leave(OS_os_workgroup wg,
            @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_join_token_opaque_s token);

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
    public static native int os_workgroup_set_working_arena(OS_os_workgroup wg, VoidPtr arena, int max_workers,
            @FunctionPtr(name = "call_os_workgroup_set_working_arena") Function_os_workgroup_set_working_arena destructor);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_os_workgroup_set_working_arena {
        @Generated
        void call_os_workgroup_set_working_arena(VoidPtr arg0);
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
    @Generated
    @CFunction
    public static native VoidPtr os_workgroup_get_working_arena(OS_os_workgroup wg, IntPtr index_out);

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
    public static native void os_workgroup_cancel(OS_os_workgroup wg);

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
    public static native boolean os_workgroup_testcancel(OS_os_workgroup wg);

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
    public static native int os_workgroup_max_parallel_threads(OS_os_workgroup wg, os_workgroup_mpt_attr_t attr);

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
    public static native int os_workgroup_interval_start(OS_os_workgroup wg, long start, long deadline,
            @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_interval_data_opaque_s data);

    /**
     * [@function] os_workgroup_interval_update
     * 
     * Updates an already started interval workgroup to have the new
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
    public static native int os_workgroup_interval_update(OS_os_workgroup wg, long deadline,
            @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_interval_data_opaque_s data);

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
     * 
     *             API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native int os_workgroup_interval_finish(OS_os_workgroup wg,
            @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_interval_data_opaque_s data);

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
    @Generated
    @CFunction
    public static native OS_os_workgroup os_workgroup_parallel_create(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @UncertainArgument("Options: reference, array Fallback: reference") os_workgroup_attr_opaque_s attr);

    /**
     * [@function] dispatch_workloop_set_os_workgroup
     * 
     * Associates an os_workgroup_t with the specified dispatch workloop.
     * 
     * The worker thread will be a member of the specified os_workgroup_t while executing
     * work items submitted to the workloop.
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
    public static native void dispatch_workloop_set_os_workgroup(NSObject workloop, OS_os_workgroup workgroup);

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
    public static native void _os_activity_label_useraction(VoidPtr dso,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    /**
     * [@function] _os_activity_initiate
     * 
     * Do not use directly because your description will not be preserved.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native void _os_activity_initiate(VoidPtr dso,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String description,
            int flags, @ObjCBlock(name = "call__os_activity_initiate") Block__os_activity_initiate activity_block);

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
    public static native void _os_activity_initiate_f(VoidPtr dso,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String description,
            int flags, VoidPtr context,
            @FunctionPtr(name = "call__os_activity_initiate_f") Function__os_activity_initiate_f function);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function__os_activity_initiate_f {
        @Generated
        void call__os_activity_initiate_f(VoidPtr arg0);
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
    public static native int os_activity_get_active(LongPtr entries, IntPtr count);

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
    public static native long os_activity_get_identifier(long activity, LongPtr parent_id);

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
    public static native long _os_activity_start(VoidPtr dso,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String description,
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
    public static native void _os_activity_set_breadcrumb(VoidPtr dso,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

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
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int DNSServiceUpdateRecordWithAttribute(DNSServiceRef sdRef, DNSRecordRef recordRef, int flags,
            char rdlen, ConstVoidPtr rdata, int ttl, DNSServiceAttributeRef attr);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native DNSServiceAttributeRef DNSServiceAttributeCreate();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int DNSServiceAttributeSetAAAAPolicy(DNSServiceAttributeRef attr, int policy);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int DNSServiceAttributeSetTimestamp(DNSServiceAttributeRef attr, int timestamp);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native void DNSServiceAttributeDeallocate(DNSServiceAttributeRef attr);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int DNSServiceQueryRecordWithAttribute(Ptr<DNSServiceRef> sdRef, int flags, int ifindex,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name, char rrtype,
            char rrclass, VoidPtr attr,
            @FunctionPtr(name = "call_DNSServiceQueryRecordWithAttribute") Function_DNSServiceQueryRecordWithAttribute callback,
            VoidPtr context);

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
    public static native int DNSServiceRegisterWithAttribute(Ptr<DNSServiceRef> sdRef, int flags, int interfaceIndex,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String regtype,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String domain,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String host,
            char portInNetworkByteOrder, char txtLen, ConstVoidPtr txtRecord, DNSServiceAttributeRef attr,
            @FunctionPtr(name = "call_DNSServiceRegisterWithAttribute") Function_DNSServiceRegisterWithAttribute callBack,
            VoidPtr context);

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
    public static native int DNSServiceRegisterRecordWithAttribute(DNSServiceRef sdRef, Ptr<DNSRecordRef> recordRef,
            int flags, int interfaceIndex,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String fullname,
            char rrtype, char rrclass, char rdlen, ConstVoidPtr rdata, int ttl, DNSServiceAttributeRef attr,
            @FunctionPtr(name = "call_DNSServiceRegisterRecordWithAttribute") Function_DNSServiceRegisterRecordWithAttribute callBack,
            VoidPtr context);

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
    public static native int DNSServiceSendQueuedRequests(DNSServiceRef sdRef);
}
