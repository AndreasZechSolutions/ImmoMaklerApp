package klassen

class Interessent(
    kontoId: Int,
    kontoBezeichnung: KontoTyp,
    email: String,
    passwort: String,
    var rolle: Anrede): Konto(kontoId, kontoBezeichnung, email, passwort) {
}