package exercicios.exercicio2

class Circulo(private var raio: Float): Forma() {
    override fun calcularArea(): Float {
        return 3.14f * raio * raio
    }

    override fun mostrarArea() {
        println("A área do círculo é de ${calcularArea()}")
        println()
    }

    override fun calcularPerimetro(): Float {
        return 3.14f * 2.0f * raio
    }

    override fun mostrarPerimetro() {
        println("O perímetro do círculo é de ${calcularPerimetro()}.")
        println()
    }
}