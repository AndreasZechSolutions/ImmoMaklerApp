package klassen

open class Konto(
    var kontoId: Int = 0,
    var ausweisNr: String = "",
    var kontoBezeichnung: KontoTyp,
    var email: String = "",
    var passwort: String = "") {
}