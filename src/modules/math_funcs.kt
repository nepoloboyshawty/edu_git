fun fact(n: Int): Int {
    if(n == 1)
        return 1
    return fact(n - 1) * n
}

fun sum(a: Int, b: Int) = a + b
fun sum(a: Int, b: Double) = a + b
fun sum(a: Double, b: Double) = a + b