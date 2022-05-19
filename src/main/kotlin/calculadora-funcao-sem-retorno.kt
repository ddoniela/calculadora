fun main(){

    println("Digite o valor 1: ")
    val num1 = readln().toInt()

    println("Digite o valor 2: ")
    val num2 = readln().toInt()

    soma(num1, num2)
    sub(num1, num2)
    mult(num1, num2)
    div(num1, num2)


}

fun soma(n1: Int, n2: Int){

    println("A soma entre $n1 e $n2 é: ${n1 + n2}")
}

fun sub(n1: Int, n2: Int){

    println("A subtração entre $n1 e $n2 é: ${n1 - n2}")
}

fun mult(n1: Int, n2: Int){

    println("A multiplicação entre $n1 e $n2 é: ${n1 * n2}")
}

fun div(n1: Int, n2: Int){

    println("A divisão entre $n1 e $n2 é: ${n1 / n2}")
}
