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

#ifndef MINGW_CONDITIONAL_VARIABLE_H
#define MINGW_CONDITIONAL_VARIABLE_H
#include <atomic>
#include <assert.h>
#include <condition_variable>
namespace std
{

enum class cv_status { no_timeout, timeout };
class condition_variable_any
{
protected:
    recursive_mutex mMutex;
    atomic<int> mNumWaiters;
    HANDLE mSemaphore;
    HANDLE mWakeEvent;
public:
    typedef HANDLE native_handle_type;
    native_handle_type native_handle() {return mSemaphore;}
    condition_variable_any(const condition_variable_any&) = delete;
    condition_variable_any& operator=(const condition_variable_any&) = delete;
    condition_variable_any()
        :mNumWaiters(0), mSemaphore(CreateSemaphore(NULL, 0, 0xFFFF, NULL)),
         mWakeEvent(CreateEvent(NULL, FALSE, FALSE, NULL))
    {}
    ~condition_variable_any() {  CloseHandle(mWakeEvent); CloseHandle(mSemaphore);  }
protected:
    template <class M>
    bool wait_impl(M& lock, DWORD timeout)
    {
        {
            lock_guard<recursive_mutex> guard(mMutex);
            mNumWaiters++;
        }
        lock.unlock();
            DWORD ret = WaitForSingleObject(mSemaphore, timeout);

        mNumWaiters--;
        SetEvent(mWakeEvent);
        lock.lock();
        if (ret == WAIT_OBJECT_0)
            return true;
        else if (ret == WAIT_TIMEOUT)
            return false;
//2 possible cases:
//1)The point in notify_all() where we determine the count to
//increment the semaphore with has not been reached yet:
//we just need to decrement mNumWaiters, but setting the event does not hurt
//
//2)Semaphore has just been released with mNumWaiters just before
//we decremented it. This means that the semaphore count
//after all waiters finish won't be 0 - because not all waiters
//woke up by acquiring the semaphore - we woke up by a timeout.
//The notify_all() must handle this grafecully
//
        else
            throw system_error(EPROTO, generic_category());
    }
public:
    template <class M>
    void wait(M& lock)
    {
        wait_impl(lock, INFINITE);
    }
    template <class M, class Predicate>
    void wait(M& lock, Predicate pred)
    {
        while(!pred())
        {
            wait(lock);
        };
    }

    void notify_all() noexcept
    {
        lock_guard<recursive_mutex> lock(mMutex); //block any further wait requests until all current waiters are unblocked
        if (mNumWaiters.load() <= 0)
            return;

        ReleaseSemaphore(mSemaphore, mNumWaiters, NULL);
        while(mNumWaiters > 0)
        {
            auto ret = WaitForSingleObject(mWakeEvent, 1000);
            if ((ret == WAIT_FAILED) || (ret == WAIT_ABANDONED))
                throw system_error(EPROTO, generic_category());
        }
        assert(mNumWaiters == 0);
//in case some of the waiters timed out just after we released the
//semaphore by mNumWaiters, it won't be zero now, because not all waiters
//woke up by acquiring the semaphore. So we must zero the semaphore before
//we accept waiters for the next event
//See _wait_impl for details
        while(WaitForSingleObject(mSemaphore, 0) == WAIT_OBJECT_0);
    }
    void notify_one() noexcept
    {
        lock_guard<recursive_mutex> lock(mMutex);
        if (!mNumWaiters)
            return;
        int targetWaiters = mNumWaiters.load() - 1;
        ReleaseSemaphore(mSemaphore, 1, NULL);
        while(mNumWaiters > targetWaiters)
        {
            auto ret = WaitForSingleObject(mWakeEvent, 1000);
            if ((ret == WAIT_FAILED) || (ret == WAIT_ABANDONED))
                throw system_error(EPROTO, generic_category());
        }
        assert(mNumWaiters == targetWaiters);
    }
    template <class M, class Rep, class Period>
    std::cv_status wait_for(M& lock,
      const std::chrono::duration<Rep, Period>& rel_time)
    {
        long long timeout = chrono::duration_cast<chrono::milliseconds>(rel_time).count();
        if (timeout < 0)
            timeout = 0;
        bool ret = wait_impl(lock, (DWORD)timeout);
        return ret?cv_status::no_timeout:cv_status::timeout;
    }

    template <class M, class Rep, class Period, class Predicate>
    bool wait_for(M& lock,
       const std::chrono::duration<Rep, Period>& rel_time, Predicate pred)
    {
        wait_for(lock, rel_time);
        return pred();
    }
    template <class M, class Clock, class Duration>
    cv_status wait_until (M& lock,
      const chrono::time_point<Clock,Duration>& abs_time)
    {
        return wait_for(lock, abs_time - Clock::now());
    }
    template <class M, class Clock, class Duration, class Predicate>
    bool wait_until (M& lock,
      const std::chrono::time_point<Clock, Duration>& abs_time,
      Predicate pred)
    {
        auto time = abs_time - Clock::now();
        if (time < 0)
            return pred();
        else
            return wait_for(lock, time, pred);
    }
};
class condition_variable: protected condition_variable_any
{
protected:
    typedef condition_variable_any base;
public:
    using base::native_handle_type;
    using base::native_handle;
    using base::base;
    using base::notify_all;
    using base::notify_one;
    void wait(unique_lock<mutex> &lock)
    {       base::wait(lock);                               }
    template <class Predicate>
    void wait(unique_lock<mutex>& lock, Predicate pred)
    {       base::wait(lock, pred);                         }
    template <class Rep, class Period>
    std::cv_status wait_for(unique_lock<mutex>& lock, const std::chrono::duration<Rep, Period>& rel_time)
    {      return base::wait_for(lock, rel_time);           }
    template <class Rep, class Period, class Predicate>
    bool wait_for(unique_lock<mutex>& lock, const std::chrono::duration<Rep, Period>& rel_time, Predicate pred)
    {        return base::wait_for(lock, rel_time, pred);   }
    template <class Clock, class Duration>
    cv_status wait_until (unique_lock<mutex>& lock, const chrono::time_point<Clock,Duration>& abs_time)
    {        return base::wait_for(lock, abs_time);         }
    template <class Clock, class Duration, class Predicate>
    bool wait_until (unique_lock<mutex>& lock, const std::chrono::time_point<Clock, Duration>& abs_time, Predicate pred)
    {        return base::wait_until(lock, abs_time, pred); }
};
}
#endif // MINGW_CONDITIONAL_VARIABLE_H
