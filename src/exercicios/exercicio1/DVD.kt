package exercicios.exercicio1

class DVD(nome: String, preco: Double, codigoDeBarras: Int, private val duracao: Int): Item(nome, preco, codigoDeBarras) {
    override fun mostrarDetalhesDoItem() {
        println("Nome do DVD: $nome;")
        println("Preço do DVD: $preco;")
        println("Código de Barras: $codigoDeBarras;")
        println("Duração do DVD: $duracao.")
        println("----###----###----###----###----###----")
        println()
    }
}