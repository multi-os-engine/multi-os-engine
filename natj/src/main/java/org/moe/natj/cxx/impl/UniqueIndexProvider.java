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

package org.moe.natj.cxx.impl;

import java.util.concurrent.atomic.AtomicBoolean;

public class UniqueIndexProvider {

    private final AtomicBoolean mLock = new AtomicBoolean(false);
    private final Slice mSlice = new Slice(1);

    public long acquire() {
        Slice slice = mSlice;
        while (true) {
            long index = slice.acquire();
            if (index != 0) {
                return index;
            }
            while (mLock.compareAndSet(false, true))
                ;
            try {
                Slice next = slice.mNext;
                if (next == null) {
                    next = new Slice(slice.mStart + Slice.CAPACITY);
                    slice.mNext = next;
                } else if (next.mStart != slice.mStart + Slice.CAPACITY) {
                    next = new Slice(slice.mStart + Slice.CAPACITY);
                    next.mNext = slice.mNext;
                    slice.mNext = next;
                }
                slice = next;
            } finally {
                mLock.set(false);
            }
        }
    }

    public void release(long index) {
        if (index == 0) {
            throw new IllegalArgumentException();
        }
        Slice slice = mSlice;
        while (!slice.release(index)) {
            while (mLock.compareAndSet(false, true))
                ;
            try {
                slice = slice.mNext;
            } finally {
                mLock.set(false);
            }
        }
    }

    public void optimize() {
        while (mLock.compareAndSet(false, true))
            ;
        try {
            Slice current = mSlice;
            Slice next = current.mNext;
            while (next != null) {
                if (next.isEmpty()) {
                    current.mNext = next.mNext;
                    next = next.mNext;
                } else {
                    current = next;
                    next = next.mNext;
                }
            }
        } finally {
            mLock.set(false);
        }
    }

    private final static class Slice {
        private static final int CAPACITY = 256;

        private final AtomicBoolean mLock = new AtomicBoolean(false);
        private final long mStart;
        private long mTable0 = 0L;
        private long mTable1 = 0L;
        private long mTable2 = 0L;
        private long mTable3 = 0L;
        private Slice mNext = null;

        private Slice(long start) {
            mStart = start;
        }

        public long acquire() {
            while (mLock.compareAndSet(false, true))
                ;
            try {
                if (mTable0 != 0xFFFFFFFFFFFFFFFFL) {
                    int index = 0;
                    long table = mTable0;
                    while ((table & 1) != 0) {
                        table >>>= 1;
                        index++;
                    }
                    mTable0 |= 1L << index;
                    return mStart + index;
                } else if (mTable1 != 0xFFFFFFFFFFFFFFFFL) {
                    int index = 0;
                    long table = mTable1;
                    while ((table & 1) != 0) {
                        table >>>= 1;
                        index++;
                    }
                    mTable1 |= 1L << index;
                    return mStart + 64 + index;
                } else if (mTable2 != 0xFFFFFFFFFFFFFFFFL) {
                    int index = 0;
                    long table = mTable2;
                    while ((table & 1) != 0) {
                        table >>>= 1;
                        index++;
                    }
                    mTable2 |= 1L << index;
                    return mStart + 128 + index;
                } else if (mTable3 != 0xFFFFFFFFFFFFFFFFL) {
                    int index = 0;
                    long table = mTable3;
                    while ((table & 1) != 0) {
                        table >>>= 1;
                        index++;
                    }
                    mTable3 |= 1L << index;
                    return mStart + 192 + index;
                }
            } finally {
                mLock.set(false);
            }
            return 0;
        }

        public boolean release(long index) {
            if (index >= mStart + CAPACITY) {
                return false;
            }
            while (mLock.compareAndSet(false, true))
                ;
            try {
                final int offset = (int) (index - mStart);
                final int tIndex = offset >> 6;
                switch (tIndex) {
                    case 0:
                        mTable0 &= ~(1L << (offset - (tIndex << 6)));
                        return true;
                    case 1:
                        mTable1 &= ~(1L << (offset - (tIndex << 6)));
                        return true;
                    case 2:
                        mTable2 &= ~(1L << (offset - (tIndex << 6)));
                        return true;
                    case 3:
                        mTable3 &= ~(1L << (offset - (tIndex << 6)));
                        return true;
                    default:
                        throw new IllegalStateException();
                }
            } finally {
                mLock.set(false);
            }
        }

        public boolean isEmpty() {
            return mTable0 == 0L && mTable1 == 0L && mTable2 == 0L && mTable3 == 0;
        }
    }
}
