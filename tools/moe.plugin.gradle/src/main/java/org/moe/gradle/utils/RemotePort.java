package org.moe.gradle.utils;

import org.moe.gradle.anns.Nullable;

public class RemotePort {
    private final int local;

    @Nullable
    private final Integer remote;

    public RemotePort(int local, @Nullable Integer remote) {
        this.local = local;
        this.remote = remote;
    }

    public int getLocal() {
        return local;
    }

    @Nullable
    public Integer getRemote() {
        return remote;
    }

    @Override
    public String toString() {
        return remote == null ? Integer.toString(local) : (local + ":" + remote);
    }
}
