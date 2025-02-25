# Java Exercises

This repository contains various Java exercises organized into different directories. Each exercise demonstrates different concepts and functionalities in Java as an OOP language. The exercises are a part of the
"Object-Oriented Programming" course at LUT University. 

## Exercises

### Exercise 1

- **Demo10**: A simple "Hello World" application.
- **Exercise**: Another "Hello World" application with the same structure.

### Exercise 2

- **App**: A console application that interacts with a `Hedgehog` class.
- **Hedgehog**: A class representing a hedgehog with methods to speak and run.

### Exercise 3

- **App**: A console application that interacts with a `Zoo` class.
- **Zoo**: A class representing a zoo containing multiple `Animal` objects.
- **Animal**: A class representing an animal with methods to run.

### Exercise 4

- **App**: A console application for managing students and their course completions.
- **University**: A class representing a university containing multiple `Student` objects.
- **Student**: A class representing a student with a list of `Grade` objects.
- **Grade**: A class representing a grade for a course.
- **Calculator**: A utility class for calculating average and median grades.

### Exercise 5-1

- **Main**: A console application that interacts with `Course` and `Student` classes.
- **Course**: A class representing a course with a name and maximum number of students.
- **Student**: A class representing a student with a name and student ID.

### Exercise 5-2

- **Main**: A console application that interacts with `Bookshelf`, `Book`, and `Author` classes.
- **Bookshelf**: A class representing a bookshelf containing multiple `Book` objects.
- **Book**: A class representing a book with a title, ISBN, and an `Author`.
- **Author**: A class representing an author with a name and nationality.

### Exercise 6
- **App**: A console application that interacts with various `Vehicle` classes.
- **Vehicle**: An abstract class representing a generic vehicle with properties like type, manufacturer, model, and max speed.
- **Car**: A class representing a car, extending the `Vehicle` class, with a method to drive.
- **Plane**: A class representing a plane, extending the `Vehicle` class, with a method to fly.
- **Ship**: A class representing a ship, extending the `Vehicle` class, with a method to sail.
- **Engine**: A class representing an engine with properties like name and power.

## How to Run

Each exercise is a Maven project. To run any of the exercises, navigate to the respective directory and use the following Maven commands:

```sh
mvn clean install
mvn exec:java -Dexec.mainClass="main.App"
```

The `main.App` class is the entry point for each exercise.

