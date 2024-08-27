#!/usr/bin/env python3
import os


def main():
    files = []

    base_dir = './src/main/resources/org/clang/util'
    for r, d, f in os.walk(base_dir):
        for file in f:
            if file != "std_headers.txt" and file != ".DS_Store":
                rel_dir = os.path.relpath(r, base_dir)
                if rel_dir == '.':
                    files.append(file)
                else:
                    files.append(os.path.join(rel_dir, file))

    files.sort()

    print(files)
    with open('./src/main/resources/org/clang/util/std_headers.txt', 'w') as f:
        for h in files:
            f.write(h)
            f.write('\n')


if __name__ == '__main__':
    main()
