package exercicios.exercicio2

open class Retangulo(private val largura: Float, private val altura: Float): Forma() {
    open val forma = "retângulo"
    override fun calcularArea(): Float {
        return largura * altura
    }

    override fun mostrarArea(){
        println("A área do $forma é de ${calcularArea()}.")
        println()
    }

    override fun calcularPerimetro(): Float {
        return 2f * (largura + altura)
    }

    override fun mostrarPerimetro(){
        println("O perímetro do $forma é de ${calcularPerimetro()}.")
        println()
    }
}