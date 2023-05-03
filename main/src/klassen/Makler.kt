package klassen

class Makler(
    kontoId: Int = 0,
    ausweisNr: String = "",
    kontoBezeichnung: KontoTyp,
    email: String = "",
    passwort: String = "",
    var firmaName: String = "",
    var firmaTyp: Rechtsform,
    var adresse: Anschrift,
    var angestellte: Mitarbeiter,
    var objekte: Immo
    ) : Konto(kontoId, ausweisNr, kontoBezeichnung, email, passwort) {
}