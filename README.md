# Java 12 Features Project

This project demonstrates and explores the new features introduced in Java 12. It is intended as a learning resource and reference for developers interested in understanding what's new in this Java release.

## Getting Started

1. **Prerequisites:**
   - Java 12 or later installed. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html) or use OpenJDK 12.
   - (Optional) An IDE such as IntelliJ IDEA, Eclipse, or VS Code.

2. **Building and Running:**
   - Clone this repository:
     ```sh
     git clone <repo-url>
     cd java12
     ```
   - Compile the code:
     ```sh
     javac <YourMainClass>.java
     ```
   - Run the code:
     ```sh
     java <YourMainClass>
     ```

## Java 12 Key Features

Java 12 introduced several new features and enhancements, including:

### 1. Switch Expressions (Preview)
- Allows switch statements to be used as expressions, returning a value.
- Simplifies multi-branch logic and reduces boilerplate code.

### 2. New String Methods
- `indent(int n)`: Adjusts the indentation of each line in a string.
- `transform(Function)`: Applies a function to the string.

### 3. Compact Number Formatting
- New `NumberFormat` style for compact representations (e.g., 1K, 1M).

### 4. Teeing Collector
- New `Collectors.teeing()` method allows collecting a stream into two collections and then merging the results.

### 5. JVM and Performance Improvements
- Shenandoah and ZGC garbage collectors enhancements.
- Default CDS archives for faster startup.

### 6. File Mismatch Method
- `Files.mismatch(Path, Path)`: Finds the position of the first mismatch between two files.

For a full list of features, see the [Java 12 Release Notes](https://www.oracle.com/java/technologies/javase/12-relnote-issues.html).

## License

This project is for educational purposes.
