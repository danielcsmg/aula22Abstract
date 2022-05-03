package exercicios.exercicio2

class Circulo(private var raio: Float): Forma() {
    override fun calcularArea() {
        val area = 3.14f * raio * raio
        println("A área do círculo é de $area")
        println()
    }

    override fun calcularPerimetro() {
        val perimetro = 3.14f * 2.0f * raio
        println("O perímetro do círculo é de $perimetro.")
        println()
    }
}