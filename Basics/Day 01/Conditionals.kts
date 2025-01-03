// Comment : Comments are used to explain the code. Single line comments are created using // and multi-line comments are created using /* ... */, comments are ignored by the compiler
// This is a single line comment
/*
* This is a 
* multi-line comment
*/

// Documentation comments are used to generate documentation from the code
// Documentation comments are created using /// or /** */
/// This is a documentation comment, it is used to generate docs from the code.

/**
 * This is a documentation comment for the main function.
 * It describes what this function is doing.
 *
 * The main function demonstrates conditional statements:
 * - If statement
 * - If-else statement
 * - If-else-if-else statement
 * - When statement
 *
 * @param args command line arguments
 */


// Conditional Statements are used to make decisions based on conditions
    
// If Statement
val num1 = 10
val num2 = 20

if (num1 > num2) {
    println("$num1 is greater than $num2")
}

// If-Else Statement
if (num1 > num2) {
    println("$num1 is greater than $num2")
} else {
    println("$num1 is not greater than $num2")
}

// If-Else If-Else Statement
if (num1 > num2) {
    println("$num1 is greater than $num2")
} else if (num1 < num2) {
    println("$num1 is less than $num2")
} else {
    println("$num1 is equal to $num2")
}

// When Statement
val day = 1
when (day) {
    1 -> println("Sunday")
    2 -> println("Monday")
    3 -> println("Tuesday")
    4 -> println("Wednesday")
    5 -> println("Thursday")
    6 -> println("Friday")
    7 -> println("Saturday")
    else -> println("Invalid day")
}

// When Statement with Multiple Values
val month = 2
when (month) {
    1, 3, 5, 7, 8, 10, 12 -> println("31 Days")
    4, 6, 9, 11 -> println("30 Days")
    2 -> println("28/29 Days")
    else -> println("Invalid Month")
}
