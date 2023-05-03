package klassen

class Mitarbeiter(
    var rolle: Anrede,
    var bezeichnung: Name,
    var adresse: Anschrift,
    var kommunikation: Kontakt,
    var bio: String = ""
) {
}