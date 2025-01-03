fun main() {
    // Variables have a particular datatype
    // Kotlin has a rich set of datatypes
    // Data Type for whole numbers : Int, Byte, Short, Long

    // Int : 32 bit, range : 2^-31 to 2^31 - 1
    var intVar : Int = 10
    val maxIntVar : Int = Int.MAX_VALUE
    val minIntVar : Int = Int.MIN_VALUE

    println("Int : $intVar\nMax Int : $maxIntVar\nMin Int : $minIntVar")

    // Byte : 8 bit, range : -128 to 127
    var byteVar : Byte = 10
    val maxByteVar : Byte = Byte.MAX_VALUE
    val minByteVar : Byte = Byte.MIN_VALUE

    println("Byte : $byteVar\nMax Byte : $maxByteVar\nMin Byte : $minByteVar")

    // Short : 16 bit, range : -32768 to 32767
    var shortVar : Short = 10
    val maxShortVar : Short = Short.MAX_VALUE
    val minShortVar : Short = Short.MIN_VALUE

    println("Short : $shortVar\nMax Short : $maxShortVar\nMin Short : $minShortVar")

    // Long : 64 bit, range : 2^-63 to 2^63 - 1
    var longVar : Long = 10L // L is used to specify Long datatype, otherwise it will be inferred as Int, if the value is within the range of Int
    val maxLongVar : Long = Long.MAX_VALUE
    val minLongVar : Long = Long.MIN_VALUE

    println("Long : $longVar\nMax Long : $maxLongVar\nMin Long : $minLongVar")

    // var number = 25 // This will be inferred as Int because Int is the default datatype for whole numbers


    // Data Type for decimal numbers : Float, Double

    // Float : 32 bit, refers to the IEEE 754 single-precision floating-point number
    var floatVar : Float = 10.0F // F is used to specify Float datatype, otherwise it will be inferred as Double, because Double is the default datatype for decimal numbers
    val floatMax : Float = Float.MAX_VALUE
    val floatMin : Float = Float.MIN_VALUE

    println("Float : $floatVar\nMax Float : $floatMax\nMin Float : $floatMin")

    // Double : 64 bit, refers to the IEEE 754 double-precision floating-point number
    var doubleVar : Double = 10.0
    val doubleMax : Double = Double.MAX_VALUE
    val doubleMin : Double = Double.MIN_VALUE

    println("Double : $doubleVar\nMax Double : $doubleMax\nMin Double : $doubleMin")

    // val testNum : Double = 10 // This will be inferred as Int and will result in a comilation error


    // Data Type for characters : Char
    
    // Char : 16 bit, represents a single 16-bit Unicode character
    var charVar : Char = 'A'
    val unicodeChar : Char = '\u0041'

    println("Char : $charVar\nUnicode Char : $unicodeChar")


    // Data type for boolean values : Boolean

    // Boolean : represents a value which is either true or false
    // Boolean : 1 byte, it can be stored in 1 bit but due to memory addressing techniques, it is stored in 1 byte
    var boolChar : Boolean = true
    val boolChar2 : Boolean = false

    println("Boolean : $boolChar\nBoolean : $boolChar2")


    // Data type for strings : String 
    // Unlike other data type in Kotlin, String is not a primitive data type
    // String is a class in kotlin
    // String : represents a sequence of characters
    // String : immutable, once created, cannot be changes
    var str : String = "Hello, World!"
    println("String : $str")

    str = "Hello, Kotlin!" // Created a new string and assigned it to the variable
    println("String : $str")

    // String templates can be used to print variables in a string


}