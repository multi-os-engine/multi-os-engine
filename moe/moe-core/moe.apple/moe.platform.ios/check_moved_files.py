import subprocess
import sys

def get_moved_files(commit_id):
    # Command to get the list of changes for the commit
    cmd = f'git diff-tree --no-commit-id --name-status -r {commit_id}'

    # Execute the git command
    result = subprocess.run(cmd.split(), stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)

    # Check for errors
    if result.returncode != 0:
        print("Error running git command:", result.stderr)
        return

    # Process the output
    moved_files = []
    created_files = {}
    deleted_files = {}

    for line in result.stdout.split('\n'):
        if line:
            status, path = line.split(maxsplit=1)
            if "/apple/" not in path:
                continue
            path = path[path.index("/apple/") + 1:]
            path = path[:path.index(".java")]
            if status == 'A':  # Added
                created_files[path] = True
            elif status == 'D':  # Deleted
                deleted_files[path] = True

    # Match deleted and created files to identify moved files
    for path in deleted_files:
        name = path.split('/')[-1]  # Extract the file name
        for c_path in created_files:
            if c_path.endswith(name):  # Match found
                moved_files.append(f"\"{path}\" to \"{c_path}\",")
                break  # Move to the next deleted file

    return moved_files


if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python3 check_moved_files.py <commit_id>")
        sys.exit(1)

    commit_id = sys.argv[1]
    moved_files = get_moved_files(commit_id)
    for file in moved_files:
        print(file)