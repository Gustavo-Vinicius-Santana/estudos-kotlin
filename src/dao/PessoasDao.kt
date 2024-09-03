package dao
import models.Pessoa

class PessoasDao {
    private val listaPessoas = mutableListOf<Pessoa>()
    fun adicionarPessoa(pessoa: Pessoa) {
        listaPessoas.add(pessoa)
    }

    // Lista todas as pessoas
    fun listarPessoas() {
        if (listaPessoas.isEmpty()) {
            println("Nenhuma pessoa cadastrada.")
        } else {
            println("Lista de Pessoas:")
            listaPessoas.forEach { println(it) }
        }
    }
}