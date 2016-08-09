#!/usr/bin/python

import sys
import base64
import zlib
import os
import tempfile
import subprocess
import shutil
import xml.etree.cElementTree as ET

commit_env = os.environ
commit_date = '2015-06-30T15:00:00-0700'
commit_env['GIT_COMMITTER_DATE'] = commit_date
commit_env['GIT_AUTHOR_DATE'] = commit_date

android_path = "https://android.googlesource.com/"
review_path = "https://r.android.com"

dst_path = sys.argv[1]
if not dst_path.endswith("/"):
    dst_path = dst_path + "/"

mf = ET.Element("manifest")

ET.SubElement(mf, "remote", name="moe", fetch="..", review=review_path)
ET.SubElement(mf, "default", revision="moe", remote="moe")

input = """
<TEMPLATE_INPUT>
"""

content = zlib.decompress(base64.b64decode(input))
root = ET.fromstring(content)
version = root.find("version").text
repositories = root.find("repositories")

if not os.path.exists(dst_path+"platform"):
    os.makedirs(dst_path+"platform")

tmp = tempfile.mkdtemp()
if not tmp.endswith("/"):
    tmp = tmp + "/"

for repo in repositories:
    path = "platform/" + repo.attrib["path"]
    if not os.path.exists(dst_path+path+".git"):
        os.makedirs(dst_path+path+".git")

    ET.SubElement(mf, "project", name=path, path=repo.attrib["path"])

    patch = None
    base = None
    if repo.tag == "moe_project":
        proc = subprocess.Popen(['git', 'init', '--bare'], cwd=dst_path+path+".git")
        proc.wait()
        patch = base64.b64decode(repo.text)
    elif repo.tag == "android_project":
        proc = subprocess.Popen(['git', 'clone', '--mirror', android_path+path, dst_path+path+".git"])
        proc.wait()
        base = repo.attrib["base"]
    elif repo.tag == "external_project":
        proc = subprocess.Popen(['git', 'clone', '--mirror', repo.attrib["url"], dst_path+path+".git"])
        proc.wait()
        base = repo.attrib["base"]
    elif repo.tag == "external_patched_project":
        proc = subprocess.Popen(['git', 'clone', '--mirror', repo.attrib["url"], dst_path+path+".git"])
        proc.wait()
        patch = base64.b64decode(repo.text)
        base = repo.attrib["base"]
    else:
        proc = subprocess.Popen(['git', 'clone', '--mirror', android_path+path, dst_path+path+".git"])
        proc.wait()
        patch = base64.b64decode(repo.text)
        base = repo.attrib["base"]

    os.makedirs(tmp+path)
    proc = subprocess.Popen(['git', 'clone', dst_path+path+".git", tmp+path])
    proc.wait()

    # Configure User name and email for repository
    proc = subprocess.Popen(['git', 'config', 'user.name', 'MOE Release'], cwd=tmp+path)
    proc.wait()

    proc = subprocess.Popen(['git', 'config', 'user.email', 'my@moe.com'], cwd=tmp+path)
    proc.wait()

    if base is not None:
        proc = subprocess.Popen(['git', 'tag', 'moe-'+version+'-base', repo.attrib["base"]], cwd=tmp+path)
        proc.wait()
        proc = subprocess.Popen(['git', 'checkout', '-b', 'moe', 'moe-'+version+'-base'], cwd=tmp+path)
        proc.wait()
    else:
        proc = subprocess.Popen(['git', 'checkout', '-b', 'moe'], cwd=tmp+path)
        proc.wait()

    if patch is not None:
        patch_file_name = tmp + path.replace("/", "_") + ".patch"
        with open(patch_file_name, "w") as patch_file:
            patch_file.write(patch)
        proc = subprocess.Popen(['git', 'apply', '--whitespace=nowarn', patch_file_name], cwd=tmp+path)
        proc.wait()

        proc = subprocess.Popen(['git', 'add', '--all'], cwd=tmp+path)
        proc.wait()

        proc = subprocess.Popen(['git', 'commit', '-m', 'MOE Base Commit - ' + version], cwd=tmp+path, env=commit_env)
        proc.wait()

    proc = subprocess.Popen(['git', 'push', 'origin', 'moe'], cwd=tmp+path)
    proc.wait()

os.makedirs(dst_path+"platform/manifest.git")
proc = subprocess.Popen(['git', 'init', '--bare'], cwd=dst_path+"platform/manifest.git")
proc.wait()

os.makedirs(tmp+"manifest")
proc = subprocess.Popen(['git', 'clone', dst_path+"platform/manifest.git", tmp+"manifest"])
proc.wait()

proc = subprocess.Popen(['git', 'checkout', '-b', 'moe'], cwd=tmp+"manifest")
proc.wait()

tree = ET.ElementTree(mf)
tree.write(tmp+"manifest/default.xml")

# Configure User name and email for repository
proc = subprocess.Popen(['git', 'config', 'user.name', 'MOE Release'], cwd=tmp+"manifest")
proc.wait()

proc = subprocess.Popen(['git', 'config', 'user.email', 'my@moe.com'], cwd=tmp+"manifest")
proc.wait()

proc = subprocess.Popen(['git', 'add', '--all'], cwd=tmp+"manifest")
proc.wait()

proc = subprocess.Popen(['git', 'commit', '-m', 'MOE Base Commit - ' + version], cwd=tmp+"manifest", env=commit_env)
proc.wait()

proc = subprocess.Popen(['git', 'push', 'origin', 'moe'], cwd=tmp+"manifest")
proc.wait()

shutil.rmtree(tmp)
