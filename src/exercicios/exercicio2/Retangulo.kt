package exercicios.exercicio2

open class Retangulo(private val largura: Float, private val altura: Float): Forma() {
    open val forma = "retângulo"
    override fun calcularArea() {
        val area = largura * altura
        println("A área do $forma é de $area")
        println()
    }

    override fun calcularPerimetro() {
        val perimetro = 2f * (largura + altura)
        println("O perímetro do $forma é de $perimetro.")
        println()
    }
}