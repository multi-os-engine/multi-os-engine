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

public class UnSupportedAnnotationException extends Exception {

    private static final long serialVersionUID = 1L;

    public UnSupportedAnnotationException() {
        super();
    }

    public UnSupportedAnnotationException(String message) {
        super(message);
    }

    public UnSupportedAnnotationException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnSupportedAnnotationException(Throwable cause) {
        super(cause);
    }

    protected UnSupportedAnnotationException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
