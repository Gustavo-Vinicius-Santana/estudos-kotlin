import apps.PessoasApp
import apps.Calculator
fun main() {
    fun escolha(escolhaOpt:String){
        if(escolhaOpt == "1"){
            print("Você escolheu a função de pessoas.")
            PessoasApp()
        }else if(escolhaOpt == "2"){
            print("Você escolheu a função de calculadora")
            Calculator()
        }
        else if(escolhaOpt == "3"){
            print("App encerrado")
        }else{
            print("Numero invalido, tente novamente")
            val escoNova:String = readln()
            escolha(escoNova)
        }
    }

    println("1-sistema de pessoas\n2-calculaor\n3-encerrar\nDigite o numero referente a funcionalidade:")
    val esco = readln()

    escolha(esco)
}