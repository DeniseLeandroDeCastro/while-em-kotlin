/**
 * Crie um programa que calcule e exiba o resultado
 * da média de temperaturas informadas pelo usuário
 */

fun main() {
    var temperatura:    Int = 0
    var somatorio:      Int = 0
    var quantidade:     Int = 0

    while (temperatura != 999) {
        print("Digite uma temperatura ou 999 para sair: ")
        temperatura = readLine()!!.toInt()

        if (temperatura != 999) {
            somatorio += temperatura //somatorio = somatorio + temperatura
            quantidade++ //quantidade = quantidade + 1
        }
    }
    print("A média das temperaturas é = ${somatorio/quantidade}")
}