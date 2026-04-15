package org.moe.gradle.utils;

import org.gradle.api.file.RegularFile;
import org.gradle.api.provider.Provider;
import org.gradle.api.tasks.bundling.AbstractArchiveTask;
import org.gradle.util.GradleVersion;

import java.io.File;
import java.util.Arrays;

public class GradleCompatUtils {

    @SuppressWarnings("unchecked")
    public static <T> T legacyCall(Object obj, String method, Object... params) {
        Require.nonNull(obj);
        Require.nonNull(method);

        try {
            return (T)obj.getClass().getMethod(method, Arrays.stream(params).map(Object::getClass).toArray(Class[]::new)).invoke(obj, params);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static File archiveFile(AbstractArchiveTask task) {
        Require.nonNull(task);
        if (GradleVersion.current().compareTo(GradleVersion.version("5.1")) >= 0) {
            return task.getArchiveFile().get().getAsFile();
        } else {
            return legacyCall(task, "getArchivePath");
        }
    }
}
