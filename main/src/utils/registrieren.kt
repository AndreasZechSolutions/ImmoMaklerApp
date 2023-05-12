package database
import klassen.Interessenten

fun registrieren(liste: MutableList<Interessenten>): MutableList<Interessenten>  {

    var interessensListe = liste
    var index = 0
    var statusLogin = false
    var email = ""
    var passwort = ""

    while(!statusLogin) {
        print("\nDeine E-Mail Adresse: ")
        email = readln()
        print("\nDein Passwort: ")
        passwort = readln()

        if(interessensListe.isEmpty())

            index = 0





        index = interessensListe.size


    return interessensListe
}