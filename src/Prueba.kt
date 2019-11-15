fun main(){
    println("Hello World!")
    println(sum(5, 5))
    println(sum(4,4))
    println(printSum(3,5))
    println(printSum2(4,5))
}
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}