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

package org.moe.natj.general;

/**
 * Nil exception used for handling native nil exceptions.
 */
public class NilException extends NativeException {

    private static final long serialVersionUID = 1L;

    /**
     * Construct a nil reference with a null pointer.
     */
    protected NilException() {
        super(null);
    }

    /**
     * Returns {@code "NIL"} as a description.
     */
    @Override
    public String getMessage() {
        return "NIL";
    }

}
