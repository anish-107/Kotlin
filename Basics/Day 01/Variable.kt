fun main() {
    // Variables are declared using the var or val keyword
    // var is mutable, val is immutable
    // Variables must be initialized when declared
    var name : String = "Jhon Doe"
    val age : Int = 25
    println("Name : " + name + "\nAge : " + age)

    // Variables can be reassigner if declared using var
    name = "Jane Doe"
    println("Name : " + name + "\nAge : " + age)

    // Variables cannot be reassigned if declared using val
    // age = 26 // Error: val cannot be reassigned

    // Kotlin can infer the type of a variable
    var country = "India"
    println("Country : " + country)

    // To print variables in a string, use string templates
    println("Name : $name\nAge : $age\nCountry : $country")
}