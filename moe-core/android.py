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

# This programe depends on PrettyTable, you can install it by `sudo easy_install prettytable`

import subprocess
import glob
import os
import re
import sys
import datetime
from prettytable import PrettyTable

root = sys.argv[1]
root_len = len(root)
if not root.endswith("/"):
	root_len += 1

year = str(datetime.datetime.now().year)

header_apache20 = """<BEGIN>
<LINE> Copyright (c) <YEAR> Intel Corporation
<LINE>
<LINE> Licensed under the Apache License, Version 2.0 (the "License");
<LINE> you may not use this file except in compliance with the License.
<LINE> You may obtain a copy of the License at
<LINE>
<LINE>      http://www.apache.org/licenses/LICENSE-2.0
<LINE>
<LINE> Unless required by applicable law or agreed to in writing, software
<LINE> distributed under the License is distributed on an "AS IS" BASIS,
<LINE> WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
<LINE> See the License for the specific language governing permissions and
<LINE> limitations under the License.
<END>
"""

header_epl10 = """<BEGIN>
<LINE> Copyright (C) <YEAR> Intel Corporation
<LINE>
<LINE> Licensed under the Eclipse Public License, Version 1.0 (the "License");
<LINE> you may not use this file except in compliance with the License.
<LINE> You may obtain a copy of the License at
<LINE>
<LINE>      http://www.eclipse.org/org/documents/epl-v10.php
<LINE>
<LINE> Unless required by applicable law or agreed to in writing, software
<LINE> distributed under the License is distributed on an "AS IS" BASIS,
<LINE> WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
<LINE> See the License for the specific language governing permissions and
<LINE> limitations under the License.
<END>
"""

header_rst = """<BEGIN>
<LINE>Copyright (C) <YEAR> Intel Corporation
<END>
"""

c = {"<BEGIN>":"/*", "<END>":" */", "<LINE>":" *"}
p = {"<BEGIN>":"#", "<END>":"#", "<LINE>":"#"}
s = {"<BEGIN>":"..", "<END>":"", "<LINE>":"\t"}

extensions = {"cpp":c, "h":c, "mm":c, "m":c, "c":c, "cc":c, "cxx":c, "hh":c, "hpp":c, "hxx":c, "inc":c, "pch":c, "s":c, "sh":p, "py":p, "java":c, "rst":s, "gradle":c, "groovy":c}
moe_skip = ["libffi", "libimobiledevice", "retrolambda", 'proguard', "samples"]
moe_epl10 = ["idea-ide", "eclipse-ide","tools/master", "tools/moe.appium.cucumber", "tools/moe.binding.clang", "tools/moe.binding.libimobiledevice", \
					"tools/moe.build.gradle", "tools/moe.document.pbxproj", "tools/moe.document.xib", "tools/moe.generator.project", \
					"tools/moe.ios.device.launcher", "tools/moe.maven.core", \
					"tools/moe.protocol.gdbremote", "tools/moe.tools.common"]
moe_apache20 = ["test", "tools/moe.mac.core"]
moe_rst = ["doc"]

reg_android_license = re.compile(r'Copyright[ \t]*\(C\)[ \t]*\d{4}[ \t]*The[ \t]*Android[ \t]*Open[ \t]*Source[ \t]*Project', re.IGNORECASE);
reg_intel_license = re.compile(r'Copyright[ \t]*\(C\)[ \t]*\d{4}[ \t]*Intel[ \t]*Corporation', re.IGNORECASE)
reg_moe_license = re.compile(r'Copyright[ \t]*\(C\)[ \t]*\d{4}[ \t]*Intel[ \t]*Corporation', re.IGNORECASE)
reg_copyright = re.compile(r'Copyright', re.IGNORECASE)
reg_moe_derived = re.compile(r'MOE')

def _collectFiles(path):
	ret = []
	for filename in glob.iglob(path+"/*"):
		if os.path.isdir(filename) and not filename.endswith("art/test/moeArtTest/moeArtTest"):
			ret.extend(_collectFiles(filename))
		else:
			for extension in extensions:
				if filename.lower().endswith("."+extension):
					ret.append(filename)
					break
	return ret

def collectNonMoeFiles():
	ret = []
	for filename in glob.iglob(root+"/*"):
		if os.path.isdir(filename):
			if os.path.basename(filename) != "moe":
				ret.extend(_collectFiles(filename))
	return ret

def collectMoeFiles(subdirs):
	ret = []

	if subdirs is None:
		for filename in glob.iglob(os.path.join(root, "moe")+"/*"):
			if os.path.isdir(filename):
				if os.path.basename(filename) not in moe_skip:
					ret.extend(_collectFiles(filename))
		ret.extend(_collectFiles(os.path.join(root, "art/test/moeArtTest/moeArtTest")))

	else:
		for subdir in subdirs:
			for filename in glob.iglob(os.path.join(root, "moe", subdir)+"/*"):
				if os.path.isdir(filename):
					ret.extend(_collectFiles(filename))

	return ret

x = PrettyTable(["AOSP", "moe", "Intel", "Derived", "Fixed", "File"])
x.align["File"] = "l"
x.padding_width = 1

# Analyze Android repositories
for file in collectNonMoeFiles():
	old = open(file, "r").read()

	android_licensed = reg_android_license.search(old) is not None
	intel_licensed = reg_intel_license.search(old) is not None
	moe_licensed = reg_moe_license.search(old) is not None
	derived = reg_moe_derived.search(old) is not None

	if not ((derived and moe_licensed) or (not derived and not moe_licensed and not intel_licensed)):
		x.add_row([android_licensed, moe_licensed, intel_licensed, derived, False, file[root_len::]])

moe_patched_repos = {}
moe_patched_files = {}

def fixMoeFiles(repos, name, header):
	for file in collectMoeFiles(repos):
		old = open(file, "r").read()

		has_copyright = reg_copyright.search(old) is not None

		if not has_copyright and not old.startswith("/*"):
			(_, ext) = os.path.splitext(file)
			ext = ext[1:]

			if ext == "rst":
				continue

			moe_patched_files[file] = name

			for repo in repos:
				if file.startswith(os.path.join(root, "moe", repo)):
					prev = moe_patched_repos.get(repo)
					if prev is None:
						moe_patched_repos[repo] = name
					elif prev != name and name not in prev.split("&"):
						moe_patched_repos[repo] = prev + "&" + name
					break

			with open(file, "w") as text_file:
				header_r = header.replace("<YEAR>", year)
				for k, v in extensions[ext].iteritems():
					header_r = header_r.replace(k, v)

				if ext == "sh" and old.startswith("#!"):
					l = old.split('\n', 1)
					header_r = l[0] + "\n\n" + header_r
					old = l[1]

				text_file.write(header_r + "\n" + old)

# Patch EPL10 license headers in moe repositories wherever it is possible
fixMoeFiles(moe_epl10, "EPL10", header_epl10)

# Patch APACHE20 license headers in moe repositories wherever it is possible
fixMoeFiles(moe_apache20, "APACHE20", header_apache20)

# Patch rst license headers in moe repositories wherever it is possible
for file in collectMoeFiles(moe_rst):
	old = open(file, "r").read()

	has_copyright = reg_copyright.search(old) is not None

	if not has_copyright and not old.startswith("/*"):
		(_, ext) = os.path.splitext(file)
		ext = ext[1:]

		if ext != "rst":
			continue

		moe_patched_files[file] = "CUSTOM"

		for repo in moe_rst:
			if file.startswith(os.path.join(root, "moe", repo)):
				prev = moe_patched_repos.get(repo)
				if prev is None:
					moe_patched_repos[repo] = "CUSTOM"
				elif prev != "CUSTOM" and "CUSTOM" not in prev.split("&"):
					moe_patched_repos[repo] = prev + "&" + "CUSTOM"
				break

		with open(file, "w") as text_file:
			header_rst_r = header_rst.replace("<YEAR>", year)
			for k, v in extensions[ext].iteritems():
				header_rst_r = header_rst_r.replace(k, v)

			text_file.write(header_rst_r + "\n" + old)

# Analyze moe repositories
for file in collectMoeFiles(None):
	old = open(file, "r").read()

	intel_licensed = reg_intel_license.search(old) is not None
	moe_licensed = reg_moe_license.search(old) is not None

	patch = moe_patched_files.get(file, "False")

	if patch != "False" or not moe_licensed:
		x.add_row(["-", moe_licensed, intel_licensed, "-", patch, file[root_len::]])

print "Patched repos are:"
for k, v in moe_patched_repos.iteritems():
	print "\t" + os.path.join(root, "moe", k) + " (" + v + ")"
print "\n"

print x
