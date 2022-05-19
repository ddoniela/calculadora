fun main(){

    println("Digite o primeiro valor: ")
    val num1 = readln().toInt()

    println()("Digite o segundo valor: ")
    val num2 = readln().toInt()

    /*
    println("Digite o expoente: ")
    val num2 = readln().toDouble()

     */

    println("A soma entre $num1 e $num2 é: ${soma(num1 + num2)}")
    println("A subtração entre $num1 e $num2 é: ${sub(num1 - num2)}")
    println("A divisão entre $num1 e $num2 é: ${div(num1 / num2)}")
    println("A multiplicação entre $num1 e $num2 é: ${mult(num1 * num2)}")
    /*
    println("O resultado da potência é: ${pot(num1, num2)}")
     */
}

fun soma(n1: Int, n2: Int): Int{
    return n1 + n2
}

fun sub(n1: Int, n2: Int): Int{
    return n1 - n2
}

fun div(n1: Int, n2: Int): Int{
    return n1 / n2
}

fun mult(n1: Int, n2: Int): Int{
    return n1 * n2
}

/*
fun pot(valor: Double, exp: Double): Double{
    return valor.pow(exp)
 */
}