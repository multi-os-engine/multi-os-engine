#!/bin/bash

#
# Copyright 2014-2016 Intel Corporation
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

TO_SKIP="art,libnativehelper,system/core,libcore,external/okhttp,external/expat,external/bouncycastle,external/icu,external/conscrypt,external/apache-harmony,dalvik"

LENGTH=`python -c "
prefix = \"$1\"
dir = \"$PWD\"
prefix_length = len(prefix)
if not prefix.endswith(\"/\"):
	prefix_length = prefix_length + 1
print(prefix_length)
"`

cd $1

COMMAND="
python -c \"
import os
to_skip = \\\"$TO_SKIP\\\".split(\\\",\\\");
dir = \\\"\$PWD\\\"
actual = dir[$LENGTH:]
if any(actual in s for s in to_skip) or actual.startswith(\\\"moe/\\\"):
	print(\\\"Skipping repo \\\" + actual + \\\"\\n\\n-----------------------------------------------\\n\\\")
else:
	print(\\\"Handling repo \\\" + actual + \\\"\\n\\\")
  	if os.system(\\\"git fetch moe && git checkout $2 && git merge --ff-only moe/master && git push moe\\\") != 0:
  		os._exit(1)
  	print(\\\"\\n-----------------------------------------------\\n\\\")
\""

repo forall -c "$COMMAND"
