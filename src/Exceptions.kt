import java.lang.IllegalArgumentException

fun main() {
    val porcentagem = porcentagem(98)
    print(porcentagem)
}

fun porcentagem(numero: Int): String {
    return if(numero in 1..100) {
        "$numero%"
    } else {
        throw IllegalArgumentException("Número deve estar entre 1 e 100")
    }
}
