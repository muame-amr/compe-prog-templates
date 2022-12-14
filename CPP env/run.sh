#!/bin/bash
if [[ $# -eq 1 ]]; then
    g++ -o exec $1 && ./exec
else
    echo "Usage: ./run.sh <file>" >&2
fi