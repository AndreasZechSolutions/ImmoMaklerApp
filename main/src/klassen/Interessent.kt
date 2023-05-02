package klassen

class Interessent(
    kontoId: Int = 0,
    ausweisNr: String = "",
    kontoBezeichnung: KontoTyp,
    email: String = "",
    passwort: String = "",
    var rolle: Anrede,
    var bezeichnung: Name
): Konto(kontoId, ausweisNr, kontoBezeichnung, email, passwort) {
}