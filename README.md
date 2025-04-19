#### student-manager
# Student Data Entry System (With Custom Exceptions)

## Overview
This system uses custom exception handling to manage various runtime scenarios and maintain functionality.
---

## Variable Summary

| Variable Name | Data Type | Purpose |
|---------------|-----------|---------|
| `prn`         | `long`    | Stores the unique PRN number of the student |
| `name`        | `String`  | Stores the full name of the student |
| `dob`         | `String`  | Stores the date of birth of the student |
| `marks`       | `double`  | Stores the marks obtained by the student |
| `students`    | `ArrayList<Student>` | Holds the list of all student records |
| `sc`          | `Scanner` | Used to read input from the console |
| `ch`          | `int`     | Stores the user's menu choice |

---

## Function Summary

| Function Name         | Return Type | Purpose |
|------------------------|-------------|---------|
| `addStudent(Student)`  | `void`      | Adds a new student to the list, throws exceptions for duplicate or invalid data |
| `displayStudents()`    | `void`      | Displays all students; throws an exception if the list is empty |
| `searchByPRN(long)`    | `Student`   | Searches for a student using PRN; throws exception if not found |
| `updateStudent(...)`   | `void`      | Updates student details; throws exceptions for invalid data or missing record |
| `deleteStudent(long)`  | `void`      | Removes a student from the list; throws exception if PRN is not found |

---

## Custom Exceptions

The following custom exceptions are defined to enhance the performance and reliability of the program:

- `DuplicateStudentException`
- `StudentNotFoundException`
- `InvalidDataException`
- `EmptyStudentListException`

These exceptions help ensure that the user receives clear feedback in case of incorrect or inconsistent input.

---

## Directory Structure

