package models

class Pessoa(val nome:String, val idade:Int) {
    override fun toString(): String {
        return "Nome: $nome, Idade: $idade"
    }
}