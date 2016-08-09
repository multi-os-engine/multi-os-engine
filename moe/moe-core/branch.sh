#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

REMOTE="moe"

FILE=`cat $DIR/branch_inner.sh`
COMMAND=${FILE//\$1/$2}
COMMAND=${COMMAND//\$2/$3}
COMMAND=${COMMAND//\$REMOTE/$REMOTE}

cd $1

repo forall -c "$COMMAND"
