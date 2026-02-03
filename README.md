📌 **Exercise Statement**

This module focuses on the use of annotations in Java as a mechanism for adding metadata to source code. The exercises cover standard Java annotations, custom annotations, and runtime inspection through reflection, with emphasis on their impact on behavior, readability, and extensibility.

**Level 1 — Basic Annotations**

This level introduces built-in Java annotations within a class hierarchy, reinforcing inheritance and polymorphism while improving code clarity and maintenance.

**Level 1 — Exercise 1: Override**

A class hierarchy is created with `Worker`, `OnlineWorker`, and `OnsiteWorker`.

The `Worker` class defines the attributes `name`, `surname`, and `hourlyRate`, along with a `calculateSalary()` method that receives the number of worked hours. The child classes override this method using the `@Override` annotation.

From the `main()` method, the overridden methods are invoked to demonstrate polymorphic behavior.

For onsite workers, salary calculation multiplies worked hours by the hourly rate and adds a static attribute named `fuel`.  
For online workers, salary calculation multiplies worked hours by the hourly rate and adds a constant flat Internet fee defined in `OnlineWorker`.

**Level 1 — Exercise 2: Deprecated**

Deprecated methods are added to the child classes and marked with the `@Deprecated` annotation.

These methods are invoked from an external class, and compiler warnings related to deprecation are suppressed using the appropriate annotation.

<br>

✨ **Features**

Use of standard Java annotations, method overriding, polymorphism, static and constant members, deprecated API marking, and warning suppression.

<br>

🛠 **Technologies**

Backend: Java 25.
