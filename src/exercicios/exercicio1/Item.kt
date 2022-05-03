package exercicios.exercicio1

abstract class Item(val nome: String, val preco: Double, val codigoDeBarras: Int) {
    abstract fun mostrarDetalhesDoItem()

    override fun equals(other: Any?): Boolean {
        return codigoDeBarras == other
    }
}