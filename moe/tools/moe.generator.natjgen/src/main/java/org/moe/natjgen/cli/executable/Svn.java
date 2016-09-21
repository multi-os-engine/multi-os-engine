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

package org.moe.natjgen.cli.executable;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.moe.natjgen.cli.exceptions.ExecutionException;
import org.moe.natjgen.cli.utils.Utils;

import java.io.File;

public class Svn {

    private static final String TRUSTED_REPOSITORY = "https://github.com/NatJPods/Specs/trunk";

    /**
     * svn --non-interactive --trust-server-cert export ...
     *
     * @param dir     directory export to; it will be overwritten if already exists
     * @param sources repositories export from
     * @throws NotDirectoryException       if dir isn't a directory
     * @throws SvnNotFoundException        if svn isn't installed
     * @throws ConnectionException         if proxy doesn't set or something like this
     * @throws RepositoryNotFoundException if one of repositories doesn't exists
     */
    public static void export(@Nullable File dir, @NonNull String... sources)
            throws SvnNotFoundException, ConnectionException, RepositoryNotFoundException, NotDirectoryException {
        String error = null;
        if (dir != null && !dir.isDirectory()) {
            throw new NotDirectoryException(dir.toString() + " is not a directory!");
        }
        checkEnvironment();
        for (String source : sources) {
            ls(source); //check if repository exists
            error = Utils.execute(dir, "svn --non-interactive --trust-server-cert export " + source, null)[1];
            if (error != null) throw new RuntimeException(error); //Something wrong
        }
    }

    /**
     * svn --non-interactive --trust-server-cert ls ...
     *
     * @param source
     * @throws SvnNotFoundException        if svn isn't installed
     * @throws ConnectionException         if proxy doesn't set or something like this
     * @throws RepositoryNotFoundException if one of repositories doesn't exists
     */
    public static void ls(String source) throws SvnNotFoundException, ConnectionException, RepositoryNotFoundException {
        String error = null;
        checkEnvironment();
        error = Utils.execute(null, "svn --non-interactive --trust-server-cert ls " + source, null)[1];
        if (error != null) throw new RepositoryNotFoundException(error);
    }

    private static void checkEnvironment() throws SvnNotFoundException, ConnectionException {
        String error = null;
        error = Utils.execute(null, "svn --version", null)[1];
        if (error != null) throw new SvnNotFoundException(error);
        error = Utils.execute(null, "svn --non-interactive --trust-server-cert ls " + Svn.TRUSTED_REPOSITORY, null)[1];
        if (error != null) throw new ConnectionException(error);
    }

    public static class NotDirectoryException extends ExecutionException {

        private static final long serialVersionUID = -5780800004209177387L;

        public NotDirectoryException(String string) {
            super(string);
        }

    }

    public static class SvnNotFoundException extends ExecutionException {

        private static final long serialVersionUID = -7533692008282230536L;

        public SvnNotFoundException(String string) {
            super(string);
        }

    }

    public static class ConnectionException extends ExecutionException {

        private static final long serialVersionUID = -6966656939889904294L;

        public ConnectionException(String string) {
            super(string);
        }

    }

    public static class RepositoryNotFoundException extends ExecutionException {

        private static final long serialVersionUID = 2716387131752224893L;

        public RepositoryNotFoundException(String string) {
            super(string);
        }

    }

}
