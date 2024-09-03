import apps.PessoasApp
fun main() {
    fun escolha(escolhaOpt:String){
        if(escolhaOpt == "1"){
            print("Você escolheu a função de pessoas.")
            PessoasApp()
        }else if(escolhaOpt == "2"){
            print("App encerrado")
        }else{
            print("Numero invalido, tente novamente")
            val escoNova:String = readln()
            escolha(escoNova)
        }
    }

    println("1-sistema de pessoas\n2-sair\nDigite o numero referente a funcionalidade:")
    val esco = readln()
    escolha(esco)

}