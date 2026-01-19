/**
 * Exercício 01: Calculadora Simples
 * 
 * Objetivo: Criar uma calculadora simples que realiza operações básicas.
 * 
 * Conceitos: Funções, parâmetros, tipos de dados, operações matemáticas.
 * 
 * @author R-TENORIO
 * @date 2026-01-19
 */

// Nível: Básico (Fácil)

// Funções para operações matemáticas
fun soma(a: Double, b: Double): Double = a + b

fun subtracao(a: Double, b: Double): Double = a - b

fun multiplicacao(a: Double, b: Double): Double = a * b

fun divisao(a: Double, b: Double): Double {
    return if (b != 0.0) {
        a / b
    } else {
        throw IllegalArgumentException("Divisão por zero não é permitida!")
    }
}

fun main() {
    println("=== Calculadora Simples ===")
    println()
    
    val num1 = 10.0
    val num2 = 5.0
    
    println("Número 1: $num1")
    println("Número 2: $num2")
    println()
    
    // Testando as operações
    println("Soma: ${soma(num1, num2)}")
    println("Subtração: ${subtracao(num1, num2)}")
    println("Multiplicação: ${multiplicacao(num1, num2)}")
    println("Divisão: ${divisao(num1, num2)}")
    
    println()
    println("Saída esperada:")
    println("Soma: 15.0")
    println("Subtração: 5.0")
    println("Multiplicação: 50.0")
    println("Divisão: 2.0")
}

/*
 * EXPLICAÇÃO:
 * 
 * 1. Definiímos 4 funções: soma(), subtracao(), multiplicacao() e divisao()
 * 2. Cada função recebe dois parâmetros do tipo Double
 * 3. A função divisao() verifica se o divisor é zero para evitar erros
 * 4. A função main() testa todas as operações
 * 
 * DESAFIO:
 * - Crie uma função que calcula o resto da divisão (módulo)
 * - Crie uma função que calcula a potência de um número
 * - Melhore a função main() para aceitar entrada do usuário
 */
