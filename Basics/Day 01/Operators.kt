fun main() {
    // Expression : A Combination of variables, operators, and value that produces a result
    // Operators are used to perform operations on variables and values
    // Operand : The varibles or values on which the operation is performed

    // Arithmetic Operators : +, -, *, /, %
    // Addition : +
    val sum = 10 + 20
    println("Sum : $sum")

    // Subtraction : -
    val difference = 20 - 10
    println("Difference : $difference")

    // Multiplication : *
    val product = 10 * 20
    println("Product : $product")

    // Division : /
    val quotient = 20 / 6 // The result will be an Int, because both the operands are Int, the result will be rounded off to the floor value, to prevent this, convert one of the operands to Double
    println("Quotient : $quotient")

    // Modulus : % (Remainder)
    val remainder = 20 % 6
    println("Remainder : $remainder")


    // Assignment Operators : =, +=, -=, *=, /=, %=
    // Assignment : = (Assigns the value of the right operand to the left operand)
    var num = 10 // Assigns 10 to num
    println("Num : $num")

    // Addition Assignment : += (Adds the value of the right operand to the left operand and assigns the result to the left operand)
    num += 20 // num = num + 20
    println("Num : $num")

    // Subtraction Assignment : -= (Subtracts the value of the right operand from the left operand and assigns the result to the left operand)
    num -= 20 // num = num - 20
    println("Num : $num")

    // Multiplication Assignment : *= (Multiplies the value of the right operand with the left operand and assigns the result to the left operand)
    num *= 2 // num = num * 2
    println("Num : $num")

    // Division Assignment : /= (Divides the value of the left operand by the right operand and assigns the result to the left operand)
    num /= 2 // num = num / 2
    println("Num : $num")

    // Modulus Assignment : %= (Calculates the modulus of the left operand by the right operand and assigns the result to the left operand)
    num %= 3 // num = num % 3
    println("Num : $num")


    // Increment and Decrement Operators : ++ , -- (Used to increase or decrease the value of a variable by 1)
    // Pre Increment : ++variable (First increases the value of the variable and then uses it)
    // Post Increment : variable++ (First uses the value of the variable and then increases it)
    // Pre Decrement : --variable (First decreases the value of the variable and then uses it)
    // Post Decrement : variable-- (First uses the value of the variable and then decreases it)

    var count = 10
    println("Count : $count")

    // Pre Increment
    println("Pre Increment : ${++count}") // Placeholder : ${expression} (Used to evaluate the expression and print the result)

    // Post Increment
    println("Post Increment : ${count++}")

    println("Count : $count")

    // Pre Decrement
    println("Pre Decrement : ${--count}")

    // Post Decrement
    println("Post Decrement : ${count--}")

    println("Count : $count")


    // Comparison Operators : ==, !=, >, <, >=, <= (Used to compare two values)
    // Equal to : == (Returns true if the values of the two operands are equal)
    val isEqual = (10 == 20)
    println("Is Equal : $isEqual")

    // Not Equal to : != (Returns true if the values of the two operands are not equal)
    val isNotEqual = (10 != 20)
    println("Is Not Equal : $isNotEqual")

    // Greater than : > (Returns true if the value of the left operand is greater than the value of the right operand)
    val isGreater = (20 > 10)
    println("Is Greater : $isGreater")

    // Less than : < (Returns true if the value of the left operand is less than the value of the right operand)
    val isLess = (10 < 20)
    println("Is Less : $isLess")

    // Greater than or equal to : >= (Returns true if the value of the left operand is greater than or equal to the value of the right operand)
    val isGreaterOrEqual = (20 >= 20)
    println("Is Greater Or Equal : $isGreaterOrEqual")

    // Less than or equal to : <= (Returns true if the value of the left operand is less than or equal to the value of the right operand)
    val isLessOrEqual = (10 <= 20)
    println("Is Less Or Equal : $isLessOrEqual")


    // Logical Operators : &&, ||, ! (Used to combine multiple conditions)
    // Logical AND : && (Returns true if both the conditions are true)
    val andResult = (10 > 5 && 20 > 15)
    println("Logical AND : $andResult")

    // Logical OR : || (Returns true if at least one of the conditions is true)
    val orResult = (10 > 5 || 20 < 15)
    println("Logical OR : $orResult")

    // Logical NOT : ! (Reverses the result of the condition)
    val notResult = !(10 > 5)
    println("Logical NOT : $notResult")


    // Bitwise Operators : &, |, ^, ~, <<, >>, >>> (Used to perform bitwise operations)
    // Bitwise AND : & (Performs bitwise AND operation on the binary representation of the operands)
    val bitwiseAnd = 5 and 3 // 0101 & 0011 = 0001
    println("Bitwise AND : $bitwiseAnd")

    // Bitwise OR : | (Performs bitwise OR operation on the binary representation of the operands)
    val bitwiseOr = 5 or 3 // 0101 | 0011 = 0111
    println("Bitwise OR : $bitwiseOr")

    // Bitwise XOR : ^ (Performs bitwise XOR operation on the binary representation of the operands)
    val bitwiseXor = 5 xor 3 // 0101 ^ 0011 = 0110
    println("Bitwise XOR : $bitwiseXor")

    // Bitwise NOT : inv (Inverts the bits of the operand)
    val bitwiseNot = 5.inv() // ~0101 = 1010 (in 32-bit representation)
    println("Bitwise NOT : $bitwiseNot")

    // Bitwise Left Shift : shl (Shifts the bits of the operand to the left by the specified number of positions)
    val leftShift = 5 shl 1 // 0101 << 1 = 1010
    println("Left Shift : $leftShift")

    // Bitwise Right Shift : shr (Shifts the bits of the operand to the right by the specified number of positions)
    val rightShift = 5 shr 1 // 0101 >> 1 = 0010
    println("Right Shift : $rightShift")

    // Unsigned Right Shift : ushr (Shifts the bits of the operand to the right by the specified number of positions, filling the leftmost bits with zeros)
    val unsignedRightShift = 5 ushr 1 // 0101 >>> 1 = 0010
    println("Unsigned Right Shift : $unsignedRightShift")


    // Identity Operators : ===, !== (Used to compare the reference of two objects)
    // Identity Equal to : === (Returns true if the reference of the two objects are equal)
    val obj1 = "Hello"
    val obj2 = "Hello"

    val isIdentical = obj1 === obj2
    println("Is Identical : $isIdentical")

    // Identity Not Equal to : !== (Returns true if the reference of the two objects are not equal)
    val isNotIdentical = obj1 !== obj2
    println("Is Not Identical : $isNotIdentical")


    // Range Operator : .. (Used to create a range of values)
    // Inclusive Range : .. (Includes the last value of the range)
    for (i in 1..5) {
        println("Value of i : $i")
    }

    // Exclusive Range : until (Excludes the last value of the range)
    for (i in 1 until 5) {
        println("Value of i : $i")
    }

    // Down To : downTo (Used to iterate in reverse order)
    for (i in 5 downTo 1) {
        println("Value of i : $i")
    }

    // Step : step (Used to skip values in the range)
    for (i in 1..10 step 2) {
        println("Value of i : $i")
    }

    // Down To with Step
    for (i in 10 downTo 1 step 2) {
        println("Value of i : $i")
    }


    // Elvis Operator : ?: (Used to provide a default value if the variable is null)
    var name : String? = null
    val defaultName = name ?: "John Doe"
    println("Name : $defaultName")

    name = "Jane Doe"
    val newName = name ?: "John Doe"
    println("Name : $newName")


    // Safe Call Operator : ?. (Used to call a method or access a property of a nullable object)
    var str : String? = null
    println("Length : ${str?.length}")

    str = "Hello, World!"
    println("Length : ${str?.length}")

    // Not Null Assertion Operator : !!. (Used to throw a NullPointerException if the object is null)
    // println("Length : ${str!!.length}") // Uncomment this line to see the NullPointerException


    // Type Check Operator : is (Used to check the type of an object)
    // val obj : Any = "Hello, World!"
    // if (obj is String) {
    //     println("Length : ${obj.length}")
    // }

    // Type Cast Operator : as (Used to cast an object to a specific type)
    val obj : Any = "Hello, World!"
    if (obj is String) {
        val str = obj as String
        println("Length : ${str.length}")
    }


    // Smart Cast : (Used to automatically cast an object to a specific type)
    if (obj is String) {
        println("Length : ${obj.length}")
    }
}