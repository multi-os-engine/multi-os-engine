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

#ifndef WIN32STDMUTEX_H
#define WIN32STDMUTEX_H

#if !defined(STDTHREAD_STRICT_NONRECURSIVE_LOCKS) && !defined(NDEBUG)
    #define STDTHREAD_STRICT_NONRECURSIVE_LOCKS
#endif

namespace std
{
class recursive_mutex
{
protected:
    CRITICAL_SECTION mHandle;
public:
    typedef LPCRITICAL_SECTION native_handle_type;
    native_handle_type native_handle() {return &mHandle;}
    recursive_mutex() noexcept
    {
        InitializeCriticalSection(&mHandle);
    }
    recursive_mutex (const recursive_mutex&) = delete;
    ~recursive_mutex() noexcept
    {
        DeleteCriticalSection(&mHandle);
    }
    void lock()
    {
        EnterCriticalSection(&mHandle);
    }
    void unlock()
    {
        LeaveCriticalSection(&mHandle);
    }
    bool try_lock()
    {
        return (TryEnterCriticalSection(&mHandle)!=0);
    }
};
template <class B>
class _NonRecursiveMutex: protected B
{
protected:
    typedef B base;
#ifdef STDTHREAD_STRICT_NONRECURSIVE_LOCKS
    DWORD mOwnerThread;
#endif
public:
    using base::native_handle_type;
    using base::native_handle;
    _NonRecursiveMutex() noexcept :base()
#ifdef STDTHREAD_STRICT_NONRECURSIVE_LOCKS
    , mOwnerThread(0)
#endif
    {}
    _NonRecursiveMutex (const _NonRecursiveMutex<B>&) = delete;
    void lock()
    {
        base::lock();
#ifdef STDTHREAD_STRICT_NONRECURSIVE_LOCKS
        checkSetOwnerAfterLock();
#endif
    }
protected:
#ifdef STDTHREAD_STRICT_NONRECURSIVE_LOCKS
    void checkSetOwnerAfterLock()
    {
        DWORD self = GetCurrentThreadId();
        if (mOwnerThread == self)
        {
            fprintf(stderr, "FATAL: Recursive locking or non-recursive mutex detected. Throwing sysetm exception\n");
            fflush(stderr);
            throw system_error(EDEADLK, generic_category());
        }
        mOwnerThread = self;
    }
    void checkSetOwnerBeforeUnlock()
    {
        DWORD self = GetCurrentThreadId();
        if (mOwnerThread != self)
        {
            fprintf(stderr, "FATAL: Recursive unlocking of non-recursive mutex detected. Throwing system exception\n");
            fflush(stderr);
            throw system_error(EDEADLK, generic_category());
        }
        mOwnerThread = 0;
    }
#endif
public:
    void unlock()
    {
#ifdef STDTHREAD_STRICT_NONRECURSIVE_LOCKS
        checkSetOwnerBeforeUnlock();
#endif
        base::unlock();
    }
    bool try_lock()
    {
        bool ret = base::try_lock();
#ifdef STDTHREAD_STRICT_NONRECURSIVE_LOCKS
        if (ret)
            checkSetOwnerAfterLock();
#endif
        return ret;
    }
};

typedef _NonRecursiveMutex<recursive_mutex> mutex;

class recursive_timed_mutex
{
protected:
    HANDLE mHandle;
public:
    typedef HANDLE native_handle_type;
    native_handle_type native_handle() const {return mHandle;}
    recursive_timed_mutex(const recursive_timed_mutex&) = delete;
    recursive_timed_mutex(): mHandle(CreateMutex(NULL, FALSE, NULL)){}
    ~recursive_timed_mutex()
    {
        CloseHandle(mHandle);
    }
    void lock()
    {
        DWORD ret = WaitForSingleObject(mHandle, INFINITE);
        if (ret != WAIT_OBJECT_0)
        {
            if (ret == WAIT_ABANDONED)
                throw system_error(EOWNERDEAD, generic_category());
            else
                throw system_error(EPROTO, generic_category());
        }
    }
    void unlock()
    {
        if (!ReleaseMutex(mHandle))
            throw system_error(EDEADLK, generic_category());
    }
    bool try_lock()
    {
        DWORD ret = WaitForSingleObject(mHandle, 0);
        if (ret == WAIT_TIMEOUT)
            return false;
        else if (ret == WAIT_OBJECT_0)
            return true;
        else if (ret == WAIT_ABANDONED)
            throw system_error(EOWNERDEAD, generic_category());
        else
            throw system_error(EPROTO, generic_category());
    }
    template <class Rep, class Period>
    bool try_lock_for(const std::chrono::duration<Rep,Period>& dur)
    {
        DWORD timeout = (DWORD)chrono::duration_cast<chrono::milliseconds>(dur).count();

        DWORD ret = WaitForSingleObject(mHandle, timeout);
        if (ret == WAIT_TIMEOUT)
            return false;
        else if (ret == WAIT_OBJECT_0)
            return true;
        else if (ret == WAIT_ABANDONED)
            throw system_error(EOWNERDEAD, generic_category());
        else
            throw system_error(EPROTO, generic_category());
    }
    template <class Clock, class Duration>
    bool try_lock_until(const std::chrono::time_point<Clock,Duration>& timeout_time)
    {
        return try_lock_for(timeout_time - Clock::now());
    }
};
class timed_mutex: public _NonRecursiveMutex<recursive_timed_mutex>
{
protected:
    typedef _NonRecursiveMutex<recursive_timed_mutex> base;
public:
    using base::base;
    template <class Rep, class Period>
    void try_lock_for(const std::chrono::duration<Rep,Period>& dur)
    {
        bool ret = base::try_lock_for(dur);
#ifdef STDTHREAD_STRICT_NONRECURSIVE_LOCKS
        if (ret)
            checkSetOwnerAfterLock();
#endif
        return ret;
    }
public:
    template <class Clock, class Duration>
    bool try_lock_until(const std::chrono::time_point<Clock,Duration>& timeout_time)
    {
        bool ret = base::try_lock_until(timeout_time);
#ifdef STDTHREAD_STRICT_NONRECURSIVE_LOCKS
        if (ret)
            checkSetOwnerAfterLock();
#endif
        return ret;
    }
};
// You can use the scoped locks and other helpers that are still provided by <mutex>
// In that case, you must include <mutex> before inclusing this file, so that this
// file will not try to redefine them
#ifndef _GLIBCXX_MUTEX

/// Do not acquire ownership of the mutex.
struct defer_lock_t { };

 /// Try to acquire ownership of the mutex without blocking.
struct try_to_lock_t { };

 /// Assume the calling thread has already obtained mutex ownership
 /// and manage it.
struct adopt_lock_t { };

constexpr defer_lock_t	defer_lock { };
constexpr try_to_lock_t	try_to_lock { };
constexpr adopt_lock_t	adopt_lock { };

template <class M>
class lock_guard
{
protected:
    M& mMutex;
public:
    typedef M mutex_type;
    lock_guard(const lock_guard&) = delete;
    lock_guard& operator=(const lock_guard&) = delete;
    explicit lock_guard(mutex_type& m): mMutex(m) { mMutex.lock();  }
    lock_guard(mutex_type& m, std::adopt_lock_t):mMutex(m){}
    ~lock_guard() {  mMutex.unlock();   }
};

#endif
}
#endif // WIN32STDMUTEX_H
