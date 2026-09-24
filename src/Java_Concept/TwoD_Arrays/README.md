# 2D Arrays

A 2D array is basically an array made up of other arrays.

I think of it like a table with rows and columns.

For example:

1  2  3  4
5  6  7  8
9  10 11 12

Here, we have 3 rows and 4 columns.

## Creating a 2D Array

The basic syntax is:

    int[][] arr = new int[3][4];

This creates an array with 3 rows and 4 columns.

The index starts from 0.

So:

    arr[0][0]

means the element in the first row and first column.

## Accessing Elements

To access an element, we use:

    arr[row][column]

For example:

    System.out.println(arr[1][2]);

This accesses the element in the second row and third column.

## Traversing a 2D Array

To go through every element, we normally use nested loops.

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }

The outer loop handles the rows and the inner loop handles the columns.

An important thing to remember:

    arr.length

gives the number of rows.

    arr[i].length

gives the number of columns in that particular row.

## My Example

In `TwoD_array.java`, I created a 3 × 4 array and filled it with numbers from 1 to 12.

The array is created like this:

    int[][] arr = new int[3][4];

Then I use nested loops to fill it:

    int value = 1;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = value;
            value++;
        }
    }

The nested loops visit every position in the array.

`value` starts from 1, gets stored in the current position, and then increases by 1.

The output is:

    1 2 3 4
    5 6 7 8
    9 10 11 12

## Important Things to Remember

- Indexing starts from 0.
- `arr.length` gives the number of rows.
- `arr[i].length` gives the number of columns in row `i`.
- Nested loops are normally used to traverse a 2D array.
- A 2D array in Java is actually an array of arrays.
- Because of this, different rows can technically have different lengths.

## DSA Connection

2D arrays are important for matrix and grid problems.

They are commonly used in:

- Matrix traversal
- Grid problems
- Dynamic Programming
- BFS and DFS on grids

If there are `r` rows and `c` columns, visiting every element takes:

Time: O(r × c)

Extra Space: O(1) if we are only traversing the array.

## What I Learned

The main thing I learned here is how to create, access, fill, and traverse a 2D array using nested loops.

The most important idea is:

Outer loop → rows

Inner loop → columns

This nested-loop pattern will be useful later when solving matrix and grid-based DSA problems.
