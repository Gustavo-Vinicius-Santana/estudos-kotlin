package apps
import java.util.Scanner

class Calculator {
    private val scanner = Scanner(System.`in`)
    private val listaPares = mutableListOf<Int>()
    private val listaImpares = mutableListOf<Int>()
    fun listaImparPar(){
        for(i in 1..10){
            println("\nInforme um numero: ")
            var numero = scanner.nextInt()

            if(numero % 2 == 0){
                listaPares.add(numero)
            }else{
                listaImpares.add(numero)
            }
        }

        println("Lista dos numeros pares: $listaPares")
        println("Lista dos numeros impares: $listaImpares")
    }

    init {
        println("1-lista impar e par")
        var escolha = scanner.nextInt()

        if(escolha == 1){
            listaImparPar()
        }
        scanner.close()
    }

}