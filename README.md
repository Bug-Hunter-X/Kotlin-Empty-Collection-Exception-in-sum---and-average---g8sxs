# Kotlin Empty Collection Exception Handling

This repository demonstrates a common error in Kotlin when using collection functions like `sum()` and `average()` on empty collections.  The code throws an exception because these functions are not designed to handle empty inputs gracefully. The solution provides a robust way to address this issue.

## Problem

The `sum()` and `average()` functions in Kotlin throw `UnsupportedOperationException` when applied to empty lists. This is unexpected behavior, which can crash the application.

## Solution

The solution addresses this by adding a check for empty collections before applying the `sum()` and `average()` functions. This is achieved using the `isNullOrEmpty()` check and the elvis operator (`?:`). If the collection is empty, default values (0 for sum and 0.0 for average) are returned, preventing the exception.
