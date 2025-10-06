# Problem Solving and Data Structures (Java)

This repository is a hands-on collection of classic data structures and algorithm/problem-solving implementations written in Java. It's designed as a study / practice repository for learning core computer science concepts and preparing for coding interviews.

Top-level layout
----------------
- `DataStructures/` — Implementations of common data structures and related algorithms. Subfolders include:
  - `BST/` — Binary Search Tree utilities and traversal algorithms (insert, depth/height, in-order, pre-order, post-order, views, validations).
  - `GraphDataStructure/` — Graph algorithms (for example `BFSGraph.java`).
  - `Hashing/` — Hashing techniques and collision resolution demos.
  - `List/` — Linked list problems and utilities.
  - `Queue/` — Queue-related implementations.
  - `Searching/` — Searching algorithms.
  - `SortingAlgorithms/` — Classic sorting implementations (QuickSort, MergeSort, etc.).
  - `Stack/` — Stack-related problems and utilities.

- `ProblemSolving/` — Algorithmic problems and solutions grouped by topic:
  - `Backtracking/` — Backtracking problems (Sudoku solver, maze, combinations, knight's tour, etc.).
  - `BitManipulation/` — Bitwise algorithm problems.
  - `DynamicProgramming/` — DP problems and patterns (can-sum, coin change, rod cutting, etc.).
  - `LogicalThinking/` — Various logical and counting problems organized into subfolders like `Counting/`.

Purpose and audience
--------------------
- Students and learners who want concrete Java examples of algorithms and data structures.
- Developers preparing for interviews who want quick access to canonical solutions.
- Anyone who wants to read, run, and adapt small Java programs that implement common CS building blocks.

Build & run notes
-----------------
This repository currently contains plain Java source files organized in folders. There is no centralized build tool (Maven/Gradle) or project layout (no `pom.xml` or `build.gradle`) detected.

Suggested local quick-compile (Windows PowerShell)
1. Install JDK 21 (recommended LTS) and set `JAVA_HOME` or add `javac` to your PATH.
2. From the repository root open PowerShell and run the commands below to compile every `.java` file into an `out` folder using Java 21 features (or compatibility mode):

```powershell
# collect all java files into a variable
$files = Get-ChildItem -Path . -Recurse -Filter *.java | ForEach-Object { $_.FullName }

# create (or refresh) output folder
if (Test-Path out) { Remove-Item -Recurse -Force out }
New-Item -ItemType Directory -Path out | Out-Null

# compile using Java 21 (use --release 21 to target JDK 21 compatibility)
javac --release 21 -d out $files

# if compilation succeeds, run a class (example)
# java -cp out fully.qualified.MainClass
```

Notes:
- If your `javac` does not support `--release 21` (older JDK), install JDK 21 or invoke the JDK 21 `javac` directly using `%JAVA_HOME%\bin\javac`.
- Because there's no package / project layout enforced, you may need to run specific `java -cp out <ClassName>` commands for classes with `main` methods. Some files are meant as algorithm snippets rather than runnable applications.

Recommended next steps
----------------------
- Add a build tool (Maven or Gradle) and convert this into a standard Java project layout (`src/main/java`, `src/test/java`) to enable reproducible builds and CI.
- Add unit tests (JUnit) for core algorithms and set up CI to run tests on every PR.
- Optionally, add a small README inside large subfolders (for example `DataStructures/BST/README.md`) describing each file's purpose and example usage.
