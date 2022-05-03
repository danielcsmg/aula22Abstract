package exercicios.exercicio1

class CD(nome: String, preco: Double, codigoDeBarras: Int, private val numFaixas: Int): Item(nome, preco, codigoDeBarras) {
    override fun mostrarDetalhesDoItem() {
        println("Nome do CD: $nome;")
        println("Preço do CD: $preco;")
        println("Código de Barras: $codigoDeBarras;")
        println("Número de faixas do CD: $numFaixas.")
        println("----###----###----###----###----###----")
        println()
    }
}