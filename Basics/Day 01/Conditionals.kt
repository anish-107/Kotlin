// Comment : Comments are used to explain the code. Single line comments are created using // and multi-line comments are created using /* ... */, comments are ignored by the compiler
// This is a single line comment
/*
* This is a 
* multi-line comment
*/

/// This is a documentation comment
// Documentation comments are used to generate documentation from the code
// Documentation comments are created using /// or /** */

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


fun main() {
    // Conditional Statements are used to make decisions based on conditions
    
    // If Statement
    // If the condition is true, the block of code inside executes
    // If the condition is false, the block of code inside does not execute
    // Syntax : if (condition) {code block}

    val num1 = 10
    val num2 = 20

    if (num1 > num2) {
        println("$num1 is greater than $num2")
    }

    // If-Else Statement
    // If the condition is true, the block of code inside the if block executes
    // If the condition is false, the block of code inside the else block executes
    // Syntax : if (condition) {code block} else {code block}

    if (num1 > num2) {
        println("$num1 is greater than $num2")
    }
    else {
        println("$num1 is not greater than $num2")
    }

    // If-Else If-Else Statement
    // If the first condition is true, the block of code inside the if block executes
    // If the first condition is false, the block of code inside the else if block executes, given it is true
    // Otherwise the else block executes
    // Syntax : if (condition) {code block} else if (condition) {code block} else {code block}

    if (num1 > num2) {
        println("$num1 is greater than $num2")
    }
    else if (num1 < num2) {
        println("$num1 is less than $num2")
    }
    else {
        println("$num1 is equal to $num2")
    }


    // When Statement
    // When statement is used to replace large If-Else If-Else Statements
    // When statement is similar to switch statement in other programming languages
    // Syntax : when (variable) { condition - 1 -> code block - 1 condition -2 -> code block - 2 ... else -> code block}
    // When statement is used to check the value of a variable against multiple values
    
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
    // When statement can be used to check multiple values in a single code block
    // Syntax : when (variable) { condition - 1, condition - 2 -> code block condition - 3 -> code block ... else -> code block}

    val month = 2

    when (month) {
        1, 3, 5, 7, 8, 10, 12 -> println("31 Days")
        4, 6, 9, 11 -> println("30 Days")
        2 -> println("28/29 Days")
        else -> println("Invalid Month")
    }

}