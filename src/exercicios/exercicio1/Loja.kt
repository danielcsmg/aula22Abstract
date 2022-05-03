package exercicios.exercicio1

fun main() {
    val itens: ArrayList<Item> = ArrayList()
    val cd1: Item = CD("Modas de Viola", 40.00, 1234, 20)
    val livro1: Item = Livro("O Príncipe", 50.00, 1235, "Maquiavel")
    val livro2: Item = Livro("Os Sertões", 30.00, 1236, "Euclides da Cunha")
    val dvd1: Item = DVD("Novos Horizontes", 20.00, 1237, 120)
    val cd2: Item = CD("Pena Branca e Xavantinho", 60.00, 1235, 15)
    val dvd2: Item = DVD("Galinha Pintadinha", 50.00, 1235, 1000000)


    itens.add(cd1)
    itens.add(livro1)
    itens.add(livro2)
    itens.add(dvd1)
    itens.add(cd2)
    itens.add(dvd2)

    itens.forEach{
        it.mostrarDetalhesDoItem()
        val codigoExemplo = 1234
        println("Item tem código de barras igual a '$codigoExemplo': ${it.equals(codigoExemplo)}.")
        println()
        println()
    }
}