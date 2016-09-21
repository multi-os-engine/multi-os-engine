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

package org.moe.natjgen.cli.executor;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.compressors.CompressorException;
import org.moe.natjgen.cli.exceptions.CheckArchitectureException;
import org.moe.natjgen.cli.exceptions.UnsupportedTypeException;
import org.moe.natjgen.cli.exceptions.WrapNatJGenException;

import javax.management.OperationsException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.spec.InvalidParameterSpecException;

public interface IExecutor {
    public void execute() throws //TODO: Special exceptions
            IOException, URISyntaxException, InterruptedException, CheckArchitectureException, OperationsException,
            InvalidParameterSpecException, CompressorException, ArchiveException, UnsupportedTypeException,
            WrapNatJGenException;
}
