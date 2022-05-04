package exercicios.exercicio2

fun main() {
    val formas: ArrayList<Forma> = ArrayList()

    val circulo1: Forma = Circulo(10f)
    val retangulo1: Forma = Retangulo(10f, 20f)
    val quadrado1: Forma = Quadrado(10f)
    val circulo2: Forma = Circulo(20f)
    val retangulo2: Forma = Retangulo(20f, 30f)
    val quadrado2: Forma = Quadrado(20f)

    formas.add(circulo1)
    formas.add(retangulo1)
    formas.add(quadrado1)
    formas.add(circulo2)
    formas.add(retangulo2)
    formas.add(quadrado2)

    formas.forEach{
        it.mostrarArea()
        it.mostrarPerimetro()
    }
}