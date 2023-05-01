package klassen

class Interessent(
    kontoId: Int = 0,
    kontoBezeichnung: KontoTyp,
    email: String = "",
    passwort: String = "",
    var rolle: Anrede): Konto(kontoId, email, passwort) {
}