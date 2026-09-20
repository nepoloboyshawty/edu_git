fun main() {
    val res = fact(5)
    print("$res\n")
}

fun fact(n: Int): Int {
    if(n == 1)
        return 1
    return fact(n - 1) * n
}