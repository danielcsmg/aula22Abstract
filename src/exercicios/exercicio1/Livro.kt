package exercicios.exercicio1

class Livro(nome: String, preco: Double, codigoDeBarras: Int, private val autor: String): Item(nome, preco, codigoDeBarras) {
    override fun mostrarDetalhesDoItem() {
        println("Nome do livro: $nome;")
        println("Preço do livro: $preco;")
        println("Código de Barras: $codigoDeBarras;")
        println("Autor do livro: $autor.")
        println("----###----###----###----###----###----")
        println()
    }
}