package klassen.utils.database.utils

import klassen.Interessenten

fun login(interessentenListe: MutableList<Interessenten>): Boolean {

    var statusLogin = false
    var email = ""
    var passwort = ""


    while(!statusLogin) {
        print("\nDeine E-Mail Adresse: ")
        email = readln()
        print("\nDein Passwort")
        passwort = readln()

        for(i in 0.. interessentenListe.count())
            if(interessentenListe[i].email == email && interessentenListe[i].passwort == passwort)
                statusLogin = true
            else
                print("\nFalsche Eingabe! Neuer Versuch ...")
    }

    return false
}