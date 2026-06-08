/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.remote.file;

/**
 * Selects how UNIX executable permissions are handled on the remote build server for an upload.
 * <p>
 * On a POSIX driving host the real file modes are embedded directly into the zip and restored by
 * the remote {@code unzip}, so this policy is <em>ignored</em> there — Unix just preserves the local
 * exec bits. The policy only takes effect on a no-bit (Windows) driving host:
 * <ul>
 *   <li>{@link #EXPLICIT}: only files whose remote path matches a {@code moe.remotebuild.executablePaths}
 *       glob are made executable. The default; used for the user's project tree.</li>
 *   <li>{@link #ALL}: blanket {@code chmod -R +x <target>}. For the opaque MOE SDK / GraalVM trees.</li>
 * </ul>
 */
public enum ExecPolicy {
    EXPLICIT,
    ALL
}
