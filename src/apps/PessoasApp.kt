package apps
import dao.PessoasDao
import models.Pessoa
class PessoasApp {
    private val pessoasDao = PessoasDao()

    init {
        // Adiciona algumas pessoas
        pessoasDao.adicionarPessoa(Pessoa("João", 30))
        pessoasDao.adicionarPessoa(Pessoa("Ana", 25))
        pessoasDao.adicionarPessoa(Pessoa("Carlos", 40))

        // Lista todas as pessoas
        pessoasDao.listarPessoas()
    }
}