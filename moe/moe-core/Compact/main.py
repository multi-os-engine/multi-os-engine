import sys
import base64
import zlib
import os
import subprocess
import xml.etree.cElementTree as ET

src_path = sys.argv[1]
if not src_path.endswith("/"):
    src_path = src_path + "/"
dst_path = sys.argv[2]
version = sys.argv[3]

exts = {'moe/libimobiledevice/libimobiledevice': 'https://github.com/libimobiledevice/libimobiledevice.git', \
        'moe/libimobiledevice/libplist': 'https://github.com/libimobiledevice/libplist.git', \
        'moe/libimobiledevice/libusbmuxd': 'https://github.com/libimobiledevice/libusbmuxd.git', \
        'moe/libimobiledevice/libxml2': 'https://github.com/GNOME/libxml2.git', \
        'moe/retrolambda': 'https://github.com/orfjackal/retrolambda.git', \
        'moe/libffi': 'https://github.com/atgreen/libffi.git'}

root = ET.Element("compactpatch")
ET.SubElement(root, "version").text = version
patches = ET.SubElement(root, "repositories")

with open (src_path+".repo/manifest.xml", "r") as manifest:
    content = manifest.read()
    for child in ET.fromstring(content):
        if child.tag == "default":
            default_remote = child.attrib["remote"]
            default_revision = child.attrib["revision"]
        if child.tag == "project":
            path = child.attrib["path"]
            remote = child.attrib.get("remote", default_remote)
            revision = child.attrib.get("revision", default_revision)
            branch = remote + '/' + revision

            ext = exts.get(path)

            if ext is None and path.startswith("moe/"):
                proc = subprocess.Popen(['git', 'diff-tree', '--binary', '-p', '4b825dc642cb6eb9a060e54bf8d69288fbee4904', branch], stdout=subprocess.PIPE, cwd=src_path+path)
                patch = ""
                while proc.poll() is None:
                    patch += proc.stdout.read()
                patch += proc.stdout.read()
                ET.SubElement(patches, "moe_project", path=path).text = base64.b64encode(patch)
                continue

            proc = subprocess.Popen(['git', 'show-ref', '--tags'], stdout=subprocess.PIPE, cwd=src_path+path)
            proc.wait()
            tag = None
            base = None
            split = proc.stdout.read().split("\n")
            if len(split) == 1:
                proc = subprocess.Popen(['git', 'fetch', '--tags', 'moe-aosp'], stdout=subprocess.PIPE, cwd=src_path+path)
                proc.wait()
                proc = subprocess.Popen(['git', 'show-ref', '--tags'], stdout=subprocess.PIPE, cwd=src_path+path)
                proc.wait()
                split = proc.stdout.read().split("\n")
            for ctag in split:
                if len(ctag) == 0:
                    continue
                ctagp = ctag.split(" ")
                name = ctagp[1][len("refs/tags/"):]
                if name.startswith("moe-"+version+"-base-"):
                    if tag is None or tag < ctagp[1]:
                        tag = name
                        base = ctagp[0]

            if tag is not None:
                proc = subprocess.Popen(['git', 'diff', '--binary', base, branch], stdout=subprocess.PIPE, cwd=src_path+path)
                patch = ""
                while proc.poll() is None:
                    patch += proc.stdout.read()
                patch += proc.stdout.read()
                proc = subprocess.Popen(['git', 'rev-parse', tag+"^{commit}"], stdout=subprocess.PIPE, cwd=src_path+path)
                proc.wait()
                base = proc.stdout.read().strip()
                if len(patch) == 0:
                    if ext is None:
                        ET.SubElement(patches, "android_project", path=path, base=base)
                    else:
                        ET.SubElement(patches, "external_project", path=path, base=base, url=ext)
                else:
                    if ext is None:
                        ET.SubElement(patches, "patched_project", path=path, base=base).text = base64.b64encode(patch)
                    else:
                        ET.SubElement(patches, "external_patched_project", path=path, base=base, url=ext).text = base64.b64encode(patch)
            else:
                proc = subprocess.Popen(['git', 'rev-parse', branch], stdout=subprocess.PIPE, cwd=src_path+path)
                proc.wait()
                commit = proc.stdout.read().strip()
                if ext is None:
                    ET.SubElement(patches, "android_project", path=path, base=commit)
                else:
                    ET.SubElement(patches, "external_project", path=path, base=commit, url=ext)

with open(dst_path, "w") as output:
    with open(os.path.join(os.path.dirname(os.path.realpath(__file__)), 'apply.py'), "r") as script:
        output.write(script.read().replace("<TEMPLATE_INPUT>", base64.b64encode(zlib.compress(ET.tostring(root)))))
