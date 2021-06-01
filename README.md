# Economist-unit-testing-assignment

## Table of contents
* [Introduction](#introduction)
* [Folder Structure](#folder-structure)
* [Running Tests](#running-tests)

## Introduction

This is the Part-2 of the assignment given by The Economist. We have used java to implement the below mentioned basic Arithmetic Operations and TestNg for unit testing.

 * Add two numbers together and return the result
 * Multiply two numbers together and return the result
 * Subtract one number from another and return the result
 * Dividing one number by another and return the result


## Folder structure

- All the tests have been placed under `src/test/java` folder in `TestArithmeticOperations.java` file
- Basic arithmetic operations have been implemented in `ArithmeticOperations.java` file under `src/main/java` folder
- TestNg assertions have been used which takes actualValue and expectedValue as arguments.
- `Assert.assertEquals(ArithmeticOperations.add(16,8), 24);`
- For the actual value, we are calling the repective methods present in `ArithmeticOperations.java` which is taking two parameters.


## Running tests
- Tests can be executed via testng.xml file present at the root of the project.
- To disable any test to execute, change `enabled=false` after the @Test annotation in the `TestArithmeticOperations.java` file

