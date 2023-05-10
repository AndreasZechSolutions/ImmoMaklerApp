package klassen

class Interessenten(

    kontoId: Int = 0,
    ausweisNr: String = "",
    kontoBezeichnung: KontoTyp,
    email: String = "",
    passwort: String = "",

    var rolle: Anrede,
    var vorname: String = "",
    var nachname: String = "",
    var anzeigename: String = "",

    var strasse: String = "",
    var nummer: String = "",
    var zusatz: String = "",
    var postleitzahl: String = "",
    var ort: String = "",

    var festnetz: String = "",
    var mobil: String = "",
    var fax: String = "",
    var eMail: String = "",
    var web: String = "",

    var bio: String = "",

): Konto(kontoId, ausweisNr, kontoBezeichnung, email, passwort) {
}