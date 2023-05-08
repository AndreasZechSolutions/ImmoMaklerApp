package klassen

class Interessenten(
    kontoId: Int = 0,
    ausweisNr: String = "",
    kontoBezeichnung: KontoTyp,
    email: String = "",
    passwort: String = "",

    var rolle: Anrede,
    var bezeichnung: Name,
    var adresse: Anschrift,
    var kommunikation: Kontakt,
    var bio: String = "",
    var merkListe: Immo
): Konto(kontoId, ausweisNr, kontoBezeichnung, email, passwort) {
}