package klassen

open class Konto(
    private var kontoId: Int,
    var kTyp: KontoTyp,
    private var email: String,
    private var passwort: String) {
}