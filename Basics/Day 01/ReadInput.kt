import java.util.Scanner

fun main() {
    // Read Input from the User
    // To read input from the user, use the readLine() or readln() function

    // readLine() function reads input as a String
    // To convert the input to other data types, use the toInt(), toDouble(), toFloat(), etc. functions
    print("Enter your name : ")
    val name = readLine()
    println("Hello, $name")

    print("Enter your age : ")
    val age = readLine()?.toInt()
    println("You are $age years old")

    // readln() function reads input as a String and throws an exception if input is not provided
    print("Enter your name : ")
    val name1 = readln()
    println("Hello, $name1")

    print("Enter your age : ")
    val age1 = readln().toInt()
    println("You are $age1 years old")

     // readlnOrNull() function reads input as an Optional<String> : String? (nullable String (String or null))
    // To convert the input to other data types, use the toInt(), toDouble(), toFloat(), etc. functions
    print("Enter your name : ")
    val name5 = readlnOrNull()
    println("Hello, $name5")

    print("Enter your age : ")
    val age5= readlnOrNull()?.toInt()
    println("You are $age5 years old")

    // Scanner class can also be used to read input from the user
    // To use the Scanner class, import the java.util.Scanner package
    // Create an instance of the Scanner class
    // Use the next() or nextLine() method to read input
    // Use the nextInt(), nextDouble(), nextFloat(), etc. methods to convert the input to other data types

    // Create an instance of the Scanner class
    val scanner = Scanner(System.`in`)

    // Use the next() method to read input as a String
    print("Enter your name : ")
    val name2 = scanner.next()
    println("Hello, $name2")

    // Use the nextInt() method to read input as an Int
    print("Enter your age : ")
    val age2 = scanner.nextInt()
    println("You are $age2 years old")

    // Use the nextLine() method to read input as a String (use this after nextInt() or next() to avoid input issues)
    print("Enter your name : ")
    val name3 = scanner.nextLine()
    println("Hello, $name3")

    // Use the nextDouble() method to read input as a Double
    print("Enter your height : ")
    val height = scanner.nextDouble()
    println("You are $age2 years old and $height cm tall")

    // Close the Scanner object
    scanner.close()
}
