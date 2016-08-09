The main.py python script creates a compact patch file.

The third argument will tell what tags should be used for base, in case of "1.0"
the biggest "moe-1.0-base-*" match will be used. Repositories under the "moe"
subdirectory will be treated as MOE specific repositories. Other repositories
without a matching tag will be threated as unmodified Android repositories.

Usage: python main.py <original moe repo> <output path> <version>
Example: python main.py /path/to/moe/repo /path/to/output_script 1.0

The output is a python script that applies the compact patch file embedded within it.
The final product is a local mirror containing every MOE specific modifications.

Usage: output_script <output mirror path>
Example: chmod +x output_script && ./output_script /path/to/output_mirror
