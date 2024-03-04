import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    println("Escolha o tipo de área que deseja calcular:")
    println("1. Retângulo")
    println("2. Triângulo")
    println("3. Triângulo Equilátero")
    println("4. Triângulo Isósceles")
    println("5. Circunferência")
    println("6. Losango")
    println("7. Trapézio")
    print("Opção: ")

    val opcao = readLine()?.toIntOrNull()

    when (opcao) {
        1 -> {
            print("Digite o valor da base do retângulo: ")
            val base = readLine()?.toDoubleOrNull() ?: return
            print("Digite o valor da altura do retângulo: ")
            val altura = readLine()?.toDoubleOrNull() ?: return
            println("Área do Retângulo: ${areaRetangulo(base, altura)}")
        }
        2 -> {
            print("Digite o valor da base do triângulo: ")
            val base = readLine()?.toDoubleOrNull() ?: return
            print("Digite o valor da altura do triângulo: ")
            val altura = readLine()?.toDoubleOrNull() ?: return
            println("Área do Triângulo: ${areaTriangulo(base, altura)}")
        }
        3 -> {
            print("Digite o valor do lado do triângulo equilátero: ")
            val lado = readLine()?.toDoubleOrNull() ?: return
            println("Área do Triângulo Equilátero: ${areaTrianguloEquilatero(lado)}")
        }
        4 -> {
            print("Digite o valor da base do triângulo isósceles: ")
            val base = readLine()?.toDoubleOrNull() ?: return
            print("Digite o valor do lado do triângulo isósceles: ")
            val lado = readLine()?.toDoubleOrNull() ?: return
            println("Área do Triângulo Isósceles: ${areaTrianguloIsosceles(base, lado)}")
        }
        5 -> {
            print("Digite o valor do raio da circunferência: ")
            val raio = readLine()?.toDoubleOrNull() ?: return
            println("Área da Circunferência: ${areaCircunferencia(raio)}")
        }
        6 -> {
            print("Digite o valor da diagonal maior do losango: ")
            val diagonalMaior = readLine()?.toDoubleOrNull() ?: return
            print("Digite o valor da diagonal menor do losango: ")
            val diagonalMenor = readLine()?.toDoubleOrNull() ?: return
            println("Área do Losango: ${areaLosango(diagonalMaior, diagonalMenor)}")
        }
        7 -> {
            print("Digite o valor da base maior do trapézio: ")
            val baseMaior = readLine()?.toDoubleOrNull() ?: return
            print("Digite o valor da base menor do trapézio: ")
            val baseMenor = readLine()?.toDoubleOrNull() ?: return
            print("Digite o valor da altura do trapézio: ")
            val altura = readLine()?.toDoubleOrNull() ?: return
            println("Área do Trapézio: ${areaTrapezio(baseMaior, baseMenor, altura)}")
        }
        else -> {
            println("Opção inválida.")
        }
    }
}

fun areaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun areaTriangulo(base: Double, altura: Double): Double {
    return 0.5 * base * altura
}

fun areaTrianguloEquilatero(lado: Double): Double {
    return (sqrt(3.0) / 4) * lado.pow(2)
}

fun areaTrianguloIsosceles(base: Double, lado: Double): Double {
    val altura = sqrt(lado.pow(2) - (base / 2).pow(2))
    return 0.5 * base * altura
}

fun areaCircunferencia(raio: Double): Double {
    return PI * raio.pow(2)
}

fun areaLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    return (diagonalMaior * diagonalMenor) / 2
}

fun areaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) / 2) * altura
}
