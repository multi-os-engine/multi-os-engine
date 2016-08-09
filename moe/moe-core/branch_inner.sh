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

echo "checking `pwd` for $1"
exists=`git branch -r | grep -x " *$REMOTE/$1"`
if [ -z "$exists" ]; then
	echo "branch $1 does not exist in this reposotiry, looking for $2"
	exists=`git branch -r | grep -x " *$REMOTE/$2"`
	if [ -z "$exists" ]; then
		echo "parent branch $2 does not exist, brancing from master"
		git branch $1 $REMOTE/master
		git push $REMOTE $1:$1
	else
		echo "parent branch $2 exist, branching from it"
		git branch $1 $REMOTE/$2
		git push $REMOTE $1:$1
	fi
else
	echo "branch $1 already exists"
fi
git checkout $1
echo "-----------------------------------------------"
