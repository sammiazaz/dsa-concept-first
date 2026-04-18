#!/bin/bash

# DSA Learning Repo - Folder Scaffold Script
# Run this from the root of your cloned GitHub repo
# Usage: bash setup_dsa_repo.sh

set -e

declare -A DAYS=(
  ["day01"]="arrays"
  ["day02"]="crud-on-arrays"
  ["day03"]="array-questions"
  ["day04"]="linked-list"
  ["day05"]="crud-on-linked-list"
  ["day06"]="linked-list-questions"
  ["day07"]="stack"
  ["day08"]="crud-on-stack"
  ["day09"]="stack-questions"
  ["day10"]="queue"
  ["day11"]="crud-on-queue"
  ["day12"]="queue-questions"
  ["day13"]="trees-bst"
  ["day14"]="crud-on-bst"
  ["day15"]="tree-questions"
  ["day16"]="hashmap"
  ["day17"]="crud-on-hashmap"
  ["day18"]="hashmap-questions"
)

declare -A TITLES=(
  ["day01"]="Arrays — Introduction"
  ["day02"]="CRUD Operations on Arrays"
  ["day03"]="Array Practice Questions"
  ["day04"]="Linked List — Introduction"
  ["day05"]="CRUD Operations on Linked List"
  ["day06"]="Linked List Practice Questions"
  ["day07"]="Stack — Introduction"
  ["day08"]="CRUD Operations on Stack"
  ["day09"]="Stack Practice Questions"
  ["day10"]="Queue — Introduction"
  ["day11"]="CRUD Operations on Queue"
  ["day12"]="Queue Practice Questions"
  ["day13"]="Trees & BST — Introduction"
  ["day14"]="CRUD Operations on BST"
  ["day15"]="Tree Practice Questions"
  ["day16"]="HashMap — Introduction"
  ["day17"]="CRUD Operations on HashMap"
  ["day18"]="HashMap Practice Questions"
)

declare -A DESC=(
  ["day01"]="Understand arrays, indexing, traversal, and memory layout."
  ["day02"]="Implement Create, Read, Update and Delete operations on arrays from scratch."
  ["day03"]="Solve array-based problems (two-sum, reverse, rotate, etc.)."
  ["day04"]="Understand singly and doubly linked lists, nodes and pointers."
  ["day05"]="Implement Create, Read, Update and Delete operations on a linked list."
  ["day06"]="Solve linked list problems (reverse, detect cycle, merge, etc.)."
  ["day07"]="Understand the Stack data structure — LIFO, push, pop, peek."
  ["day08"]="Implement a Stack from scratch and all its core operations."
  ["day09"]="Solve Stack problems (balanced brackets, min stack, etc.)."
  ["day10"]="Understand the Queue data structure — FIFO, enqueue, dequeue."
  ["day11"]="Implement a Queue from scratch including circular queue."
  ["day12"]="Solve Queue problems (sliding window max, task scheduler, etc.)."
  ["day13"]="Understand Binary Trees, Binary Search Trees, and tree traversals."
  ["day14"]="Implement BST insert, search, delete, and all traversals."
  ["day15"]="Solve tree problems (height, LCA, level-order traversal, etc.)."
  ["day16"]="Understand hashing, hash functions, and collision resolution."
  ["day17"]="Implement a HashMap with put, get, remove, and resize."
  ["day18"]="Solve HashMap problems (two-sum, group anagrams, frequency count, etc.)."
)

echo "🚀 Setting up DSA learning repo structure..."
echo ""

for day in $(echo "${!DAYS[@]}" | tr ' ' '\n' | sort); do
  topic="${DAYS[$day]}"
  folder="${day}-${topic}"
  title="${TITLES[$day]}"
  desc="${DESC[$day]}"

  mkdir -p "$folder"

  cat > "$folder/README.md" <<EOF
# ${day^^} — ${title}

## Goal
${desc}

## Notes
> Write your notes, observations, and key takeaways here.

## Code
Add your implementation files in this folder alongside this README.

## Resources
- [ ] Add links to articles, videos, or documentation you found helpful.

## Status
- [ ] In progress
- [ ] Done
EOF

  echo "✅  Created: $folder/"
done

# Create root README
cat > README.md <<'EOF'
# DSA Learning Journey 🧠

A day-by-day study of Data Structures & Algorithms with CRUD implementations and practice questions.

## Structure

Each topic follows a 3-day cycle:

| Day Pattern | Focus |
|-------------|-------|
| Day N       | Concept — theory, visuals, key ideas |
| Day N+1     | CRUD — implement core operations from scratch |
| Day N+2     | Questions — solve problems using that structure |

## Topics Covered

| Days | Topic |
|------|-------|
| 01–03 | Arrays |
| 04–06 | Linked List |
| 07–09 | Stack |
| 10–12 | Queue |
| 13–15 | Trees & BST |
| 16–18 | HashMap |

## Progress Tracker

- [ ] Day 01 — Arrays
- [ ] Day 02 — CRUD on Arrays
- [ ] Day 03 — Array Questions
- [ ] Day 04 — Linked List
- [ ] Day 05 — CRUD on Linked List
- [ ] Day 06 — Linked List Questions
- [ ] Day 07 — Stack
- [ ] Day 08 — CRUD on Stack
- [ ] Day 09 — Stack Questions
- [ ] Day 10 — Queue
- [ ] Day 11 — CRUD on Queue
- [ ] Day 12 — Queue Questions
- [ ] Day 13 — Trees & BST
- [ ] Day 14 — CRUD on BST
- [ ] Day 15 — Tree Questions
- [ ] Day 16 — HashMap
- [ ] Day 17 — CRUD on HashMap
- [ ] Day 18 — HashMap Questions

---

*Consistency > Intensity. One day at a time.*
EOF

echo ""
echo "📁 Root README.md created."
echo ""
echo "✨ Done! Run the following to push to GitHub:"
echo ""
echo "   git add ."
echo "   git commit -m \"chore: scaffold DSA learning folder structure\""
echo "   git push"
echo ""
