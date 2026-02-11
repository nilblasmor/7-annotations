## 📌 Exercise Statement

This module focuses on **Java annotations**, a powerful feature that allows adding metadata to your code to influence behavior or enrich it with additional information. Each exercise has been completed and documented following the **Conventional Commits** standard.

- Exercises cover both **built-in annotations** and **custom annotations**.
- Java Reflection is used to read annotations at runtime and act accordingly.
- This module improves code **readability, maintainability, and extensibility**, and prepares for frameworks like Spring or JPA.

---

### Level 1 — Exercise 1: @Override

- A class hierarchy was implemented with three classes: `Worker`, `OnlineWorker`, and `OnSiteWorker`.
- The base class `Worker` includes attributes `name`, `surname`, `hourlySalary` and a method `calculateSalary(int hours)`.
- The subclasses **override** `calculateSalary()` using the `@Override` annotation:
  - `OnSiteWorker` calculates salary as `hours * hourlySalary + gasCost` (static attribute).
  - `TreballadorOnline` calculates salary as `hours * hourlySalary * internetFlatRate` (constant of the class).
- The `main()` method demonstrates the behavior of overridden methods and the use of `@Override`.

---

### Level 1 — Exercise 2: @Deprecated

- Some methods in the subclasses were marked as **deprecated** using the `@Deprecated` annotation.
- An external class calls these deprecated methods while using the `@SuppressWarnings` annotation to ignore warnings.
- This exercise illustrates when and why to mark methods as obsolete, and how annotations improve code maintainability and developer awareness.

---

## ✨ Features

- Practical use of **built-in Java annotations**: `@Override`, `@Deprecated`, `@SuppressWarnings`
- Demonstration of **inheritance and polymorphism** in combination with annotations
- Understanding how annotations affect **code execution, readability, and maintainability**
- Experience with **declaring constants and static attributes** for class-specific behavior

---

## 🛠 Technologies

- **Backend**: Java 21 (LTS)

---

## 🚀 Installation & Execution

1. Clone the repository by running `git clone <repository-url>` and navigate to the project folder.
2. Compile all Java source files using `javac -d out src/**/*.java`. This will create `.class` files in the `out` directory.
3. Run the program with `java -cp out Main`. This executes the main program demonstrating Java annotations and overridden/deprecated methods.
