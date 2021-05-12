// Operações possíveis na calculadora
// Opção deve ser atribuída a constante 'operation' na função main
const val PLUS = 0 // Soma
const val MINUS = 1 // Subtração
const val DIV = 2 // Divisão
const val TIMES = 3 // Multiplicação
const val MOD = 4 // Resto da Divisão

// Função principal
fun main() {
    val firstNumber:Float? = 10.0f
    val secondNumber:Float? = 20.0f
    val operation = MOD
    
    if (firstNumber === null) {
        println("Primeiro número é nulo")
    } else if (secondNumber === null) {
        println("Segundo número é nulo")
    } else {
        println(calculate(firstNumber, secondNumber, operation))
    }
}

// Função de cálculo.
// Recebe os dois números além do valor identificador da expressão.
// Retorna o resultado da expressão correspondente
fun calculate(n1:Float?, n2:Float?, expression:Int):Float {
    return when(expression) {
        0 -> {n1.plus(n2)}
        1 -> {n1.minus(n2)}
        2 -> {n1.div(n2)}
        3 -> {n1.times(n2)}
        4 -> {n1.mod(n2)}
        else -> {0.0.toFloat()}
    }
}
