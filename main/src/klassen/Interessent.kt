package klassen

class Interessent(
    kontoId: Int = 0,
    ausweisNr: String = "",
    kontoBezeichnung: KontoTyp,
    email: String = "",
    passwort: String = "",
    var rolle: Anrede,
): Konto(kontoId, ausweisNr, kontoBezeichnung, email, passwort) {
}