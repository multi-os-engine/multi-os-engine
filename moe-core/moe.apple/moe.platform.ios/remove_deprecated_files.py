#!/usr/bin/env python3
import os
import re


def main():
    active_files = set()
    p = re.compile('.*(?:Getting compilation unit from |Creating compilation unit at )(.*)$')
    # 'out.log' is the output of the moe.generator.natjgen.jar
    with open('out.log') as f:
        for line in f:
            m = p.match(line)
            if m:
                active_files.add(m.group(1))

    inactive_files = set()

    for r, d, f in os.walk('./src/main/java/apple'):
        for file in f:
            full_path = os.path.abspath(os.path.join(r, file))
            if full_path not in active_files:
                with open(full_path) as ff:
                    if '@Generated' in ff.read():
                        inactive_files.add(full_path)

    print(inactive_files)
    for f in inactive_files:
        os.remove(f)


if __name__ == '__main__':
    main()
