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
import apple.opaque.acl_entry_t;
import apple.opaque.acl_flagset_t;
import apple.opaque.acl_permset_t;
import apple.opaque.acl_t;
import apple.opaque.dispatch_source_type_t;
import apple.opaque.filesec_t;
import apple.struct.FILE;
import apple.struct._RuneLocale;
import apple.struct.__double2;
import apple.struct.__float2;
import apple.struct._opaque_pthread_t;
import apple.struct.accessx_descriptor;
import apple.struct.audit_token_t;
import apple.struct.div_t;
import apple.struct.fd_set;
import apple.struct.imaxdiv_t;
import apple.struct.iovec;
import apple.struct.lconv;
import apple.struct.ldiv_t;
import apple.struct.lldiv_t;
import apple.struct.mach_msg_header_t;
import apple.struct.msghdr;
import apple.struct.rlimit;
import apple.struct.rusage;
import apple.struct.sa_endpoints;
import apple.struct.security_token_t;
import apple.struct.sf_hdtr;
import apple.struct.sigvec;
import apple.struct.sockaddr;
import apple.struct.stack_t;
import apple.struct.timespec;
import apple.struct.timeval;
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
    public static native int getattrlistbulk(int arg1, VoidPtr arg2, VoidPtr arg3, @NUInt long arg4, long arg5);

    @Generated
    @CFunction
    public static native int faccessat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            int arg4);

    @Generated
    @CFunction
    public static native int fchownat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            int arg4, int arg5);

    @Generated
    @CFunction
    public static native int linkat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4, int arg5);

    @Generated
    @CFunction
    @NInt
    public static native long readlinkat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            BytePtr arg3, @NUInt long arg4);

    @Generated
    @CFunction
    public static native int symlinkat(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3);

    @Generated
    @CFunction
    public static native int unlinkat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3);

    @Generated
    @CFunction
    public static native int getattrlistat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            VoidPtr arg3, VoidPtr arg4, @NUInt long arg5, @NUInt long arg6);

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
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native int execle(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native int execlp(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Object... varargs);

    @Generated
    @CFunction
    public static native int execv(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            ConstPtr<BytePtr> arg2);

    @Generated
    @CFunction
    public static native int execve(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            ConstPtr<BytePtr> arg2, ConstPtr<BytePtr> arg3);

    @Generated
    @CFunction
    public static native int execvp(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            ConstPtr<BytePtr> arg2);

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
    public static native long write(int arg1, ConstVoidPtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    @NUInt
    public static native long confstr(int arg1, BytePtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native int getopt(int arg1, ConstPtr<BytePtr> arg2,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3);

    @Generated
    @Deprecated
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
    public static native long pread(int arg1, VoidPtr arg2, @NUInt long arg3, long arg4);

    @Generated
    @CFunction
    @NInt
    public static native long pwrite(int arg1, ConstVoidPtr arg2, @NUInt long arg3, long arg4);

    @Generated
    @Deprecated
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
    @Inline
    @CFunction
    public static native int __darwin_fd_isset(int _n,
            @UncertainArgument("Options: reference, array Fallback: reference") fd_set _p);

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
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            ConstPtr<BytePtr> arg3);

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
    public static native int issetugid();

    @Generated
    @CFunction
    public static native BytePtr mkdtemp(BytePtr arg1);

    @Generated
    @CFunction
    public static native int mknod(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, char arg2,
            int arg3);

    @Generated
    @CFunction
    public static native int mkpath_np(
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
    public static native int reboot(int arg1);

    @Generated
    @CFunction
    public static native int revoke(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int rresvport(IntPtr arg1);

    @Generated
    @CFunction
    public static native int rresvport_af(IntPtr arg1, int arg2);

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
    @Variadic()
    @CFunction
    public static native int syscall(int arg1, Object... varargs);

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

    @Generated
    @CFunction
    public static native int getsubopt(Ptr<BytePtr> arg1, ConstPtr<BytePtr> arg2, Ptr<BytePtr> arg3);

    @Generated
    @CFunction
    public static native int fgetattrlist(int arg1, VoidPtr arg2, VoidPtr arg3, @NUInt long arg4, int arg5);

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

    @Generated
    @CFunction
    public static native int ffsctl(int arg1, @NUInt long arg2, VoidPtr arg3, int arg4);

    @Generated
    @CFunction
    public static native int fsync_volume_np(int arg1, int arg2);

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

    @Generated
    @CFunction
    public static native int filesec_unset_property(filesec_t arg1, int arg2);

    @Generated
    @Inline
    @CFunction
    public static native char _OSSwapInt16(char data);

    @Generated
    @Inline
    @CFunction
    public static native int _OSSwapInt32(int data);

    @Generated
    @Inline
    @CFunction
    public static native long _OSSwapInt64(long data);

    @Generated
    @Inline
    @CFunction
    public static native char OSReadSwapInt16(ConstVoidPtr base, @NUInt long offset);

    @Generated
    @Inline
    @CFunction
    public static native int OSReadSwapInt32(ConstVoidPtr base, @NUInt long offset);

    @Generated
    @Inline
    @CFunction
    public static native long OSReadSwapInt64(ConstVoidPtr base, @NUInt long offset);

    @Generated
    @Inline
    @CFunction
    public static native void OSWriteSwapInt16(VoidPtr base, @NUInt long offset, char data);

    @Generated
    @Inline
    @CFunction
    public static native void OSWriteSwapInt32(VoidPtr base, @NUInt long offset, int data);

    @Generated
    @Inline
    @CFunction
    public static native void OSWriteSwapInt64(VoidPtr base, @NUInt long offset, long data);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String sel_getName(SEL sel);

    @Generated
    @CFunction
    public static native SEL sel_registerName(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String str);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String object_getClassName(@Mapped(ObjCObjectMapper.class) Object obj);

    @Generated
    @CFunction
    public static native VoidPtr object_getIndexedIvars(@Mapped(ObjCObjectMapper.class) Object obj);

    @Generated
    @CFunction
    public static native boolean sel_isMapped(SEL sel);

    @Generated
    @CFunction
    public static native SEL sel_getUid(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String str);

    @Generated
    @CFunction
    public static native VoidPtr os_retain(VoidPtr object);

    @Generated
    @CFunction
    public static native void os_release(VoidPtr object);

    @Generated
    @CFunction
    public static native long dispatch_time(long when, long delta);

    @Generated
    @CFunction
    public static native long dispatch_walltime(
            @UncertainArgument("Options: reference, array Fallback: reference") timespec when, long delta);

    @Generated
    @Inline
    @CFunction
    public static native void _dispatch_object_validate(NSObject object);

    @Generated
    @CFunction
    public static native void dispatch_retain(NSObject object);

    @Generated
    @CFunction
    public static native void dispatch_release(NSObject object);

    @Generated
    @CFunction
    public static native VoidPtr dispatch_get_context(NSObject object);

    @Generated
    @CFunction
    public static native void dispatch_set_context(NSObject object, VoidPtr context);

    @Generated
    @CFunction
    public static native void dispatch_set_finalizer_f(NSObject object,
            @FunctionPtr(name = "call_dispatch_set_finalizer_f") Function_dispatch_set_finalizer_f finalizer);

    @Generated
    @CFunction
    public static native void dispatch_suspend(NSObject object);

    @Generated
    @CFunction
    public static native void dispatch_resume(NSObject object);

    @Generated
    @Variadic()
    @Deprecated
    @CFunction
    public static native void dispatch_debug(NSObject object,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String message,
            Object... varargs);

    @Generated
    @Deprecated
    @CFunction
    public static native void dispatch_debugv(NSObject object,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String message,
            BytePtr ap);

    @Generated
    @CFunction
    public static native void dispatch_async(NSObject queue,
            @ObjCBlock(name = "call_dispatch_async") Block_dispatch_async block);

    @Generated
    @CFunction
    public static native void dispatch_async_f(NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_async_f") Function_dispatch_async_f work);

    @Generated
    @CFunction
    public static native void dispatch_sync(NSObject queue,
            @ObjCBlock(name = "call_dispatch_sync") Block_dispatch_sync block);

    @Generated
    @CFunction
    public static native void dispatch_sync_f(NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_sync_f") Function_dispatch_sync_f work);

    @Generated
    @CFunction
    public static native void dispatch_apply(@NUInt long iterations, NSObject queue,
            @ObjCBlock(name = "call_dispatch_apply") Block_dispatch_apply block);

    @Generated
    @CFunction
    public static native void dispatch_apply_f(@NUInt long iterations, NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_apply_f") Function_dispatch_apply_f work);

    @Generated
    @Deprecated
    @CFunction
    public static native NSObject dispatch_get_current_queue();

    @Generated
    @Inline
    @CFunction
    public static native NSObject dispatch_get_main_queue();

    @Generated
    @CFunction
    public static native int qos_class_self();

    @Generated
    @CFunction
    public static native int qos_class_main();

    @Generated
    @CFunction
    public static native NSObject dispatch_get_global_queue(@NInt long identifier, @NUInt long flags);

    @Generated
    @CFunction
    public static native NSObject dispatch_queue_attr_make_with_qos_class(NSObject attr, int qos_class,
            int relative_priority);

    @Generated
    @CFunction
    public static native NSObject dispatch_queue_create(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label,
            NSObject attr);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String dispatch_queue_get_label(NSObject queue);

    @Generated
    @CFunction
    public static native int dispatch_queue_get_qos_class(NSObject queue, IntPtr relative_priority_ptr);

    @Generated
    @CFunction
    public static native void dispatch_set_target_queue(NSObject object, NSObject queue);

    @Generated
    @CFunction
    public static native void dispatch_main();

    @Generated
    @CFunction
    public static native void dispatch_after(long when, NSObject queue,
            @ObjCBlock(name = "call_dispatch_after") Block_dispatch_after block);

    @Generated
    @CFunction
    public static native void dispatch_after_f(long when, NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_after_f") Function_dispatch_after_f work);

    @Generated
    @CFunction
    public static native void dispatch_barrier_async(NSObject queue,
            @ObjCBlock(name = "call_dispatch_barrier_async") Block_dispatch_barrier_async block);

    @Generated
    @CFunction
    public static native void dispatch_barrier_async_f(NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_barrier_async_f") Function_dispatch_barrier_async_f work);

    @Generated
    @CFunction
    public static native void dispatch_barrier_sync(NSObject queue,
            @ObjCBlock(name = "call_dispatch_barrier_sync") Block_dispatch_barrier_sync block);

    @Generated
    @CFunction
    public static native void dispatch_barrier_sync_f(NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_barrier_sync_f") Function_dispatch_barrier_sync_f work);

    @Generated
    @CFunction
    public static native void dispatch_queue_set_specific(NSObject queue, ConstVoidPtr key, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_queue_set_specific") Function_dispatch_queue_set_specific destructor);

    @Generated
    @CFunction
    public static native VoidPtr dispatch_queue_get_specific(NSObject queue, ConstVoidPtr key);

    @Generated
    @CFunction
    public static native VoidPtr dispatch_get_specific(ConstVoidPtr key);

    @Generated
    @CFunction
    public static native void dispatch_block_perform(@NUInt long flags,
            @ObjCBlock(name = "call_dispatch_block_perform") Block_dispatch_block_perform block);

    @Generated
    @CFunction
    @NInt
    public static native long dispatch_block_wait(
            @ObjCBlock(name = "call_dispatch_block_wait") Block_dispatch_block_wait block, long timeout);

    @Generated
    @CFunction
    public static native void dispatch_block_notify(
            @ObjCBlock(name = "call_dispatch_block_notify_0") Block_dispatch_block_notify_0 block, NSObject queue,
            @ObjCBlock(name = "call_dispatch_block_notify_2") Block_dispatch_block_notify_2 notification_block);

    @Generated
    @CFunction
    public static native void dispatch_block_cancel(
            @ObjCBlock(name = "call_dispatch_block_cancel") Block_dispatch_block_cancel block);

    @Generated
    @CFunction
    @NInt
    public static native long dispatch_block_testcancel(
            @ObjCBlock(name = "call_dispatch_block_testcancel") Block_dispatch_block_testcancel block);

    @Generated
    @CFunction
    public static native int mach_msg_overwrite(
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t msg, int option,
            int send_size, int rcv_size, int rcv_name, int timeout, int notify_,
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t rcv_msg,
            int rcv_limit);

    @Generated
    @CFunction
    public static native int mach_msg(
            @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t msg, int option,
            int send_size, int rcv_size, int rcv_name, int timeout, int notify_);

    @Generated
    @CFunction
    public static native int mach_voucher_deallocate(int voucher);

    @Generated
    @CFunction
    public static native NSObject dispatch_source_create(dispatch_source_type_t type, @NUInt long handle,
            @NUInt long mask, NSObject queue);

    @Generated
    @CFunction
    public static native void dispatch_source_set_event_handler(NSObject source,
            @ObjCBlock(name = "call_dispatch_source_set_event_handler") Block_dispatch_source_set_event_handler handler);

    @Generated
    @CFunction
    public static native void dispatch_source_set_event_handler_f(NSObject source,
            @FunctionPtr(name = "call_dispatch_source_set_event_handler_f") Function_dispatch_source_set_event_handler_f handler);

    @Generated
    @CFunction
    public static native void dispatch_source_set_cancel_handler(NSObject source,
            @ObjCBlock(name = "call_dispatch_source_set_cancel_handler") Block_dispatch_source_set_cancel_handler handler);

    @Generated
    @CFunction
    public static native void dispatch_source_set_cancel_handler_f(NSObject source,
            @FunctionPtr(name = "call_dispatch_source_set_cancel_handler_f") Function_dispatch_source_set_cancel_handler_f handler);

    @Generated
    @CFunction
    public static native void dispatch_source_cancel(NSObject source);

    @Generated
    @CFunction
    @NInt
    public static native long dispatch_source_testcancel(NSObject source);

    @Generated
    @CFunction
    @NUInt
    public static native long dispatch_source_get_handle(NSObject source);

    @Generated
    @CFunction
    @NUInt
    public static native long dispatch_source_get_mask(NSObject source);

    @Generated
    @CFunction
    @NUInt
    public static native long dispatch_source_get_data(NSObject source);

    @Generated
    @CFunction
    public static native void dispatch_source_merge_data(NSObject source, @NUInt long value);

    @Generated
    @CFunction
    public static native void dispatch_source_set_timer(NSObject source, long start, long interval, long leeway);

    @Generated
    @CFunction
    public static native void dispatch_source_set_registration_handler(NSObject source,
            @ObjCBlock(name = "call_dispatch_source_set_registration_handler") Block_dispatch_source_set_registration_handler handler);

    @Generated
    @CFunction
    public static native void dispatch_source_set_registration_handler_f(NSObject source,
            @FunctionPtr(name = "call_dispatch_source_set_registration_handler_f") Function_dispatch_source_set_registration_handler_f handler);

    @Generated
    @CFunction
    public static native NSObject dispatch_group_create();

    @Generated
    @CFunction
    public static native void dispatch_group_async(NSObject group, NSObject queue,
            @ObjCBlock(name = "call_dispatch_group_async") Block_dispatch_group_async block);

    @Generated
    @CFunction
    public static native void dispatch_group_async_f(NSObject group, NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_group_async_f") Function_dispatch_group_async_f work);

    @Generated
    @CFunction
    @NInt
    public static native long dispatch_group_wait(NSObject group, long timeout);

    @Generated
    @CFunction
    public static native void dispatch_group_notify(NSObject group, NSObject queue,
            @ObjCBlock(name = "call_dispatch_group_notify") Block_dispatch_group_notify block);

    @Generated
    @CFunction
    public static native void dispatch_group_notify_f(NSObject group, NSObject queue, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_group_notify_f") Function_dispatch_group_notify_f work);

    @Generated
    @CFunction
    public static native void dispatch_group_enter(NSObject group);

    @Generated
    @CFunction
    public static native void dispatch_group_leave(NSObject group);

    @Generated
    @CFunction
    public static native NSObject dispatch_semaphore_create(@NInt long value);

    @Generated
    @CFunction
    @NInt
    public static native long dispatch_semaphore_wait(NSObject dsema, long timeout);

    @Generated
    @CFunction
    @NInt
    public static native long dispatch_semaphore_signal(NSObject dsema);

    @Generated
    @CFunction
    public static native void dispatch_once(NIntPtr predicate,
            @ObjCBlock(name = "call_dispatch_once") Block_dispatch_once block);

    @Generated
    @Inline
    @CFunction
    public static native void _dispatch_once(NIntPtr predicate,
            @ObjCBlock(name = "call__dispatch_once") Block__dispatch_once block);

    @Generated
    @CFunction
    public static native void dispatch_once_f(NIntPtr predicate, VoidPtr context,
            @FunctionPtr(name = "call_dispatch_once_f") Function_dispatch_once_f function);

    @Generated
    @Inline
    @CFunction
    public static native void _dispatch_once_f(NIntPtr predicate, VoidPtr context,
            @FunctionPtr(name = "call__dispatch_once_f") Function__dispatch_once_f function);

    @Generated
    @CFunction
    public static native NSObject dispatch_data_create(ConstVoidPtr buffer, @NUInt long size, NSObject queue,
            @ObjCBlock(name = "call_dispatch_data_create") Block_dispatch_data_create destructor);

    @Generated
    @CFunction
    @NUInt
    public static native long dispatch_data_get_size(NSObject data);

    @Generated
    @CFunction
    public static native NSObject dispatch_data_create_map(NSObject data, Ptr<ConstVoidPtr> buffer_ptr,
            NUIntPtr size_ptr);

    @Generated
    @CFunction
    public static native NSObject dispatch_data_create_concat(NSObject data1, NSObject data2);

    @Generated
    @CFunction
    public static native NSObject dispatch_data_create_subrange(NSObject data, @NUInt long offset, @NUInt long length);

    @Generated
    @CFunction
    public static native boolean dispatch_data_apply(NSObject data,
            @ObjCBlock(name = "call_dispatch_data_apply") Block_dispatch_data_apply applier);

    @Generated
    @CFunction
    public static native NSObject dispatch_data_copy_region(NSObject data, @NUInt long location, NUIntPtr offset_ptr);

    @Generated
    @CFunction
    public static native void dispatch_read(int fd, @NUInt long length, NSObject queue,
            @ObjCBlock(name = "call_dispatch_read") Block_dispatch_read handler);

    @Generated
    @CFunction
    public static native void dispatch_write(int fd, NSObject data, NSObject queue,
            @ObjCBlock(name = "call_dispatch_write") Block_dispatch_write handler);

    @Generated
    @CFunction
    public static native NSObject dispatch_io_create(@NUInt long type, int fd, NSObject queue,
            @ObjCBlock(name = "call_dispatch_io_create") Block_dispatch_io_create cleanup_handler);

    @Generated
    @CFunction
    public static native NSObject dispatch_io_create_with_path(@NUInt long type,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path, int oflag,
            char mode, NSObject queue,
            @ObjCBlock(name = "call_dispatch_io_create_with_path") Block_dispatch_io_create_with_path cleanup_handler);

    @Generated
    @CFunction
    public static native NSObject dispatch_io_create_with_io(@NUInt long type, NSObject io, NSObject queue,
            @ObjCBlock(name = "call_dispatch_io_create_with_io") Block_dispatch_io_create_with_io cleanup_handler);

    @Generated
    @CFunction
    public static native void dispatch_io_read(NSObject channel, long offset, @NUInt long length, NSObject queue,
            @ObjCBlock(name = "call_dispatch_io_read") Block_dispatch_io_read io_handler);

    @Generated
    @CFunction
    public static native void dispatch_io_write(NSObject channel, long offset, NSObject data, NSObject queue,
            @ObjCBlock(name = "call_dispatch_io_write") Block_dispatch_io_write io_handler);

    @Generated
    @CFunction
    public static native void dispatch_io_close(NSObject channel, @NUInt long flags);

    @Generated
    @CFunction
    public static native void dispatch_io_barrier(NSObject channel,
            @ObjCBlock(name = "call_dispatch_io_barrier") Block_dispatch_io_barrier barrier);

    @Generated
    @CFunction
    public static native int dispatch_io_get_descriptor(NSObject channel);

    @Generated
    @CFunction
    public static native void dispatch_io_set_high_water(NSObject channel, @NUInt long high_water);

    @Generated
    @CFunction
    public static native void dispatch_io_set_low_water(NSObject channel, @NUInt long low_water);

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

    @Generated
    @CFunction
    public static native float __exp10f(float arg1);

    @Generated
    @CFunction
    public static native double __exp10(double arg1);

    @Generated
    @Inline
    @CFunction
    public static native void __sincosf(float __x, FloatPtr __sinp, FloatPtr __cosp);

    @Generated
    @Inline
    @CFunction
    public static native void __sincos(double __x, DoublePtr __sinp, DoublePtr __cosp);

    @Generated
    @CFunction
    public static native float __cospif(float arg1);

    @Generated
    @CFunction
    public static native double __cospi(double arg1);

    @Generated
    @CFunction
    public static native float __sinpif(float arg1);

    @Generated
    @CFunction
    public static native double __sinpi(double arg1);

    @Generated
    @CFunction
    public static native float __tanpif(float arg1);

    @Generated
    @CFunction
    public static native double __tanpi(double arg1);

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

    @Generated
    @CFunction
    public static native double j0(double arg1);

    @Generated
    @CFunction
    public static native double j1(double arg1);

    @Generated
    @CFunction
    public static native double jn(int arg1, double arg2);

    @Generated
    @CFunction
    public static native double y0(double arg1);

    @Generated
    @CFunction
    public static native double y1(double arg1);

    @Generated
    @CFunction
    public static native double yn(int arg1, double arg2);

    @Generated
    @CFunction
    public static native double scalb(double arg1, double arg2);

    @Generated
    @CFunction
    public static native VoidPtr _Block_copy(ConstVoidPtr aBlock);

    @Generated
    @CFunction
    public static native void _Block_release(ConstVoidPtr aBlock);

    @Generated
    @CFunction
    public static native void _Block_object_assign(VoidPtr arg1, ConstVoidPtr arg2, int arg3);

    @Generated
    @CFunction
    public static native void _Block_object_dispose(ConstVoidPtr arg1, int arg2);

    @Generated
    @CFunction
    public static native void __assert_rtn(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4);

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
    public static native void longjmperror();

    @Generated
    @CFunction
    public static native int raise(int arg1);

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

    @Generated
    @CFunction
    public static native int renameat(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4);

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
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

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
    public static native long fread(VoidPtr arg1, @NUInt long arg2, @NUInt long arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg4);

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
    public static native long fwrite(ConstVoidPtr arg1, @NUInt long arg2, @NUInt long arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg4);

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
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

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
    @Deprecated
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
    @Deprecated
    @CFunction
    public static native BytePtr tempnam(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native int fseeko(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            long arg2, int arg3);

    @Generated
    @CFunction
    public static native long ftello(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

    @Generated
    @Variadic()
    @CFunction
    public static native int snprintf(BytePtr arg1, @NUInt long arg2,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
            Object... varargs);

    @Generated
    @CFunction
    public static native int vfscanf(@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            BytePtr arg3);

    @Generated
    @CFunction
    public static native int vscanf(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            BytePtr arg2);

    @Generated
    @CFunction
    public static native int vsnprintf(BytePtr arg1, @NUInt long arg2,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
            BytePtr arg4);

    @Generated
    @CFunction
    public static native int vsscanf(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            BytePtr arg3);

    @Generated
    @Variadic()
    @CFunction
    public static native int dprintf(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Object... varargs);

    @Generated
    @CFunction
    public static native int vdprintf(int arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            BytePtr arg3);

    @Generated
    @CFunction
    @NInt
    public static native long getdelim(Ptr<BytePtr> arg1, NUIntPtr arg2, int arg3,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg4);

    @Generated
    @CFunction
    @NInt
    public static native long getline(Ptr<BytePtr> arg1, NUIntPtr arg2,
            @UncertainArgument("Options: reference, array Fallback: reference") FILE arg3);

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

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native FILE zopen(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3);

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
    public static native VoidPtr bsearch(ConstVoidPtr arg1, ConstVoidPtr arg2, @NUInt long arg3, @NUInt long arg4,
            @FunctionPtr(name = "call_bsearch") Function_bsearch arg5);

    @Generated
    @CFunction
    public static native VoidPtr calloc(@NUInt long arg1, @NUInt long arg2);

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
    public static native VoidPtr malloc(@NUInt long arg1);

    @Generated
    @CFunction
    public static native int mblen(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @NUInt long arg2);

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

    @Generated
    @CFunction
    public static native int posix_memalign(Ptr<VoidPtr> arg1, @NUInt long arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native void qsort(VoidPtr arg1, @NUInt long arg2, @NUInt long arg3,
            @FunctionPtr(name = "call_qsort") Function_qsort arg4);

    @Generated
    @CFunction
    public static native int rand();

    @Generated
    @CFunction
    public static native VoidPtr realloc(VoidPtr arg1, @NUInt long arg2);

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
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            Ptr<BytePtr> arg2, int arg3);

    @Generated
    @CFunction
    public static native long strtoll(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            Ptr<BytePtr> arg2, int arg3);

    @Generated
    @CFunction
    @NUInt
    public static native long strtoul(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            Ptr<BytePtr> arg2, int arg3);

    @Generated
    @CFunction
    public static native long strtoull(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            Ptr<BytePtr> arg2, int arg3);

    @Generated
    @Deprecated
    @CFunction
    public static native int system(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

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
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2, int arg3);

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

    @Generated
    @CFunction
    public static native void arc4random_addrandom(BytePtr arg1, int arg2);

    @Generated
    @CFunction
    public static native void arc4random_buf(VoidPtr arg1, @NUInt long arg2);

    @Generated
    @CFunction
    public static native void arc4random_stir();

    @Generated
    @CFunction
    public static native int arc4random_uniform(int arg1);

    @Generated
    @CFunction
    public static native int atexit_b(@ObjCBlock(name = "call_atexit_b") Block_atexit_b arg1);

    @Generated
    @CFunction
    public static native VoidPtr bsearch_b(ConstVoidPtr arg1, ConstVoidPtr arg2, @NUInt long arg3, @NUInt long arg4,
            @ObjCBlock(name = "call_bsearch_b") Block_bsearch_b arg5);

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
    public static native int heapsort(VoidPtr arg1, @NUInt long arg2, @NUInt long arg3,
            @FunctionPtr(name = "call_heapsort") Function_heapsort arg4);

    @Generated
    @CFunction
    public static native int heapsort_b(VoidPtr arg1, @NUInt long arg2, @NUInt long arg3,
            @ObjCBlock(name = "call_heapsort_b") Block_heapsort_b arg4);

    @Generated
    @CFunction
    public static native int mergesort(VoidPtr arg1, @NUInt long arg2, @NUInt long arg3,
            @FunctionPtr(name = "call_mergesort") Function_mergesort arg4);

    @Generated
    @CFunction
    public static native int mergesort_b(VoidPtr arg1, @NUInt long arg2, @NUInt long arg3,
            @ObjCBlock(name = "call_mergesort_b") Block_mergesort_b arg4);

    @Generated
    @CFunction
    public static native void psort(VoidPtr arg1, @NUInt long arg2, @NUInt long arg3,
            @FunctionPtr(name = "call_psort") Function_psort arg4);

    @Generated
    @CFunction
    public static native void psort_b(VoidPtr arg1, @NUInt long arg2, @NUInt long arg3,
            @ObjCBlock(name = "call_psort_b") Block_psort_b arg4);

    @Generated
    @CFunction
    public static native void psort_r(VoidPtr arg1, @NUInt long arg2, @NUInt long arg3, VoidPtr arg4,
            @FunctionPtr(name = "call_psort_r") Function_psort_r arg5);

    @Generated
    @CFunction
    public static native void qsort_b(VoidPtr arg1, @NUInt long arg2, @NUInt long arg3,
            @ObjCBlock(name = "call_qsort_b") Block_qsort_b arg4);

    @Generated
    @CFunction
    public static native void qsort_r(VoidPtr arg1, @NUInt long arg2, @NUInt long arg3, VoidPtr arg4,
            @FunctionPtr(name = "call_qsort_r") Function_qsort_r arg5);

    @Generated
    @CFunction
    public static native int radixsort(
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] arg1,
            int arg2, @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
            int arg4);

    @Generated
    @CFunction
    public static native void setprogname(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native int sradixsort(
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] arg1,
            int arg2, @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
            int arg4);

    @Generated
    @CFunction
    public static native void sranddev();

    @Generated
    @CFunction
    public static native void srandomdev();

    @Generated
    @CFunction
    public static native VoidPtr reallocf(VoidPtr arg1, @NUInt long arg2);

    @Generated
    @CFunction
    public static native long strtoq(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            Ptr<BytePtr> arg2, int arg3);

    @Generated
    @CFunction
    public static native long strtouq(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            Ptr<BytePtr> arg2, int arg3);

    @Generated
    @CFunction
    public static native VoidPtr memchr(ConstVoidPtr arg1, int arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native int memcmp(ConstVoidPtr arg1, ConstVoidPtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native VoidPtr memcpy(VoidPtr arg1, ConstVoidPtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native VoidPtr memmove(VoidPtr arg1, ConstVoidPtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native VoidPtr memset(VoidPtr arg1, int arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native BytePtr strcat(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native BytePtr strchr(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2);

    @Generated
    @CFunction
    public static native int strcmp(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native int strcoll(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native BytePtr strcpy(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    @NUInt
    public static native long strcspn(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native BytePtr strerror(int arg1);

    @Generated
    @CFunction
    @NUInt
    public static native long strlen(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native BytePtr strncat(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @NUInt long arg3);

    @Generated
    @CFunction
    public static native int strncmp(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @NUInt long arg3);

    @Generated
    @CFunction
    public static native BytePtr strncpy(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @NUInt long arg3);

    @Generated
    @CFunction
    public static native BytePtr strpbrk(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native BytePtr strrchr(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1, int arg2);

    @Generated
    @CFunction
    @NUInt
    public static native long strspn(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native BytePtr strstr(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native BytePtr strtok(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    @NUInt
    public static native long strxfrm(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @NUInt long arg3);

    @Generated
    @CFunction
    public static native BytePtr strtok_r(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            Ptr<BytePtr> arg3);

    @Generated
    @CFunction
    public static native int strerror_r(int arg1, BytePtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native BytePtr strdup(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

    @Generated
    @CFunction
    public static native VoidPtr memccpy(VoidPtr arg1, ConstVoidPtr arg2, int arg3, @NUInt long arg4);

    @Generated
    @CFunction
    public static native BytePtr stpcpy(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native BytePtr stpncpy(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @NUInt long arg3);

    @Generated
    @CFunction
    public static native BytePtr strndup(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @NUInt long arg2);

    @Generated
    @CFunction
    @NUInt
    public static native long strnlen(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @NUInt long arg2);

    @Generated
    @CFunction
    public static native BytePtr strsignal(int sig);

    @Generated
    @CFunction
    public static native VoidPtr memmem(ConstVoidPtr arg1, @NUInt long arg2, ConstVoidPtr arg3, @NUInt long arg4);

    @Generated
    @CFunction
    public static native void memset_pattern4(VoidPtr arg1, ConstVoidPtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native void memset_pattern8(VoidPtr arg1, ConstVoidPtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native void memset_pattern16(VoidPtr arg1, ConstVoidPtr arg2, @NUInt long arg3);

    @Generated
    @CFunction
    public static native BytePtr strcasestr(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

    @Generated
    @CFunction
    public static native BytePtr strnstr(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @NUInt long arg3);

    @Generated
    @CFunction
    @NUInt
    public static native long strlcat(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @NUInt long arg3);

    @Generated
    @CFunction
    @NUInt
    public static native long strlcpy(BytePtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
            @NUInt long arg3);

    @Generated
    @CFunction
    public static native void strmode(int arg1, BytePtr arg2);

    @Generated
    @CFunction
    public static native BytePtr strsep(Ptr<BytePtr> arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

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

    @Generated
    @CFunction
    public static native int ffsl(@NInt long arg1);

    @Generated
    @CFunction
    public static native int ffsll(long arg1);

    @Generated
    @CFunction
    public static native int fls(int arg1);

    @Generated
    @CFunction
    public static native int flsl(@NInt long arg1);

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
            @UncertainArgument("Options: reference, array Fallback: reference") timespec arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") timespec arg2);

    @Generated
    @CFunction
    public static native long imaxabs(long j);

    @Generated
    @CFunction
    @ByValue
    public static native imaxdiv_t imaxdiv(long __numer, long __denom);

    @Generated
    @CFunction
    public static native long strtoimax(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __nptr,
            Ptr<BytePtr> __endptr, int __base);

    @Generated
    @CFunction
    public static native long strtoumax(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __nptr,
            Ptr<BytePtr> __endptr, int __base);

    @Generated
    @CFunction
    public static native long wcstoimax(ConstIntPtr __nptr, Ptr<IntPtr> __endptr, int __base);

    @Generated
    @CFunction
    public static native long wcstoumax(ConstIntPtr __nptr, Ptr<IntPtr> __endptr, int __base);

    @Generated
    @Inline
    @CFunction
    public static native int OSHostByteOrder();

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

    @Generated
    @CFunction
    public static native acl_t acl_dup(acl_t acl);

    @Generated
    @CFunction
    public static native int acl_free(VoidPtr obj_p);

    @Generated
    @CFunction
    public static native acl_t acl_init(int count);

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

    @Generated
    @CFunction
    public static native int acl_maximal_permset_mask_np(LongPtr mask_p);

    @Generated
    @CFunction
    public static native int acl_get_permset_mask_np(acl_entry_t entry_d, LongPtr mask_p);

    @Generated
    @CFunction
    public static native int acl_set_permset_mask_np(acl_entry_t entry_d, long mask);

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

    @Generated
    @CFunction
    @ObjCBlock(name = "call_dispatch_block_create_ret")
    public static native Block_dispatch_block_create_ret dispatch_block_create(@NUInt long flags,
            @ObjCBlock(name = "call_dispatch_block_create") Block_dispatch_block_create block);

    @Generated
    @CFunction
    @ObjCBlock(name = "call_dispatch_block_create_with_qos_class_ret")
    public static native Block_dispatch_block_create_with_qos_class_ret dispatch_block_create_with_qos_class(
            @NUInt long flags, int qos_class, int relative_priority,
            @ObjCBlock(name = "call_dispatch_block_create_with_qos_class") Block_dispatch_block_create_with_qos_class block);

    @Generated
    @CFunction
    @FunctionPtr(name = "call_signal_ret")
    public static native Function_signal_ret signal(int arg1, @FunctionPtr(name = "call_signal") Function_signal arg2);

    @Generated
    @CFunction
    @FunctionPtr(name = "call_bsd_signal_ret")
    public static native Function_bsd_signal_ret bsd_signal(int arg1,
            @FunctionPtr(name = "call_bsd_signal") Function_bsd_signal arg2);

    @Generated
    @CFunction
    @FunctionPtr(name = "call_sigset_ret")
    public static native Function_sigset_ret sigset(int arg1, @FunctionPtr(name = "call_sigset") Function_sigset arg2);

    @Generated
    @CFunction
    public static native int connectx(int arg1,
            @UncertainArgument("Options: reference, array Fallback: reference") sa_endpoints arg2, int arg3, int arg4,
            @UncertainArgument("Options: reference, array Fallback: reference") iovec arg5, int arg6, NUIntPtr arg7,
            IntPtr arg8);

    @Generated
    @CFunction
    public static native int disconnectx(int arg1, int arg2, int arg3);

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
    public static native short vqmovuns_s32(int __p0);

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
    public static native char vqrshlh_u16(char __p0, char __p1);

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
    public static native char vqshlh_u16(char __p0, char __p1);

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
    public static native char vsqaddh_u16(char __p0, char __p1);

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
    public static native short vuqaddh_s16(short __p0, short __p1);

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
        boolean call_dispatch_data_apply(NSObject arg0, @NUInt long arg1, ConstVoidPtr arg2, @NUInt long arg3);
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
        void call_dispatch_io_read(boolean arg0, NSObject arg1, int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_io_write {
        @Generated
        void call_dispatch_io_write(boolean arg0, NSObject arg1, int arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_io_barrier {
        @Generated
        void call_dispatch_io_barrier();
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
}
