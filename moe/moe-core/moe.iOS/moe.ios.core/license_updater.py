import datetime
import glob
import os

header = """/*
 * Copyright (c) <YEAR> Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
"""

def collectFiles(extensions, path):
	ret = []
	for filename in glob.iglob(path+"/*"):
		if os.path.isdir(filename):
			ret.extend(collectFiles(extensions, filename))
		else:
			for extension in extensions:
				if filename.endswith("."+extension):
					ret.append(filename)
					break
	return ret

for file in collectFiles(["java"], "src/main/java"):
	year = str(datetime.datetime.now().year)
	old = open(file, "r").read()
	if not old.startswith('/*'):
		print "Appending file " + file + " with license header of year " + year
		with open(file, "w") as text_file:
			text_file.write(header.replace("<YEAR>", year) + "\n" + old)
