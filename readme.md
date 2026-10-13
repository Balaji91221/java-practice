# Java Practice

**Small, focused programs for learning Java and object-oriented programming.**

This collection brings together console exercises, pattern printing, numeric problems, OOP examples, and STS3006 coursework. It is useful for practicing one concept at a time and inspecting how a program's input becomes its output.

## Explore the collection

| Path | What to study |
|---|---|
| `java/` | Basic input, arithmetic, conditions, loops, and pattern programs |
| `java/Patterns/` | Additional pattern and arithmetic practice |
| `java/oops/` | Class-based examples |
| `java/oops/encapsulation/` | Encapsulation exercises |
| `java/oops/inheritance/` | Inheritance examples and notes |
| `java/STS_3006/` | Course exercises, including number and matrix problems |

## Run an example

Download and extract the repository. Install a JDK so `javac` and `java` are available, then run from the repository root:

```bash
cd java
javac character.java
java character
```

Enter a single character. The program prints `1` for an uppercase Latin letter, `0` for a lowercase Latin letter, and `-1` for another character.

```text
Input:  V
Output: 1
```

For an example without input, compile and run `Hill_pattern.java` to print a five-row star pattern.

## Organization and scope

Each exercise has its own entry point. This is not one combined application or a Maven/Gradle project. Check package declarations and class names before running other files; avoid compiling every folder together because names and setup assumptions can differ.

The repository contains some `.class` files, but compiling the `.java` source yourself makes the exercise easier to inspect and adapt. Examples are learning work and should be checked against boundary cases rather than treated as a verified reference library.

## Contributing

Include the exercise name, example input, expected output, and a short explanation when proposing a correction. Keep each program focused on the concept it demonstrates and preserve course context where present.
