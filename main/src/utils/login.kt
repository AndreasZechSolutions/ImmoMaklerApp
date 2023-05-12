package klassen.utils.database.utils

import klassen.Interessenten

fun login(interessentenListe: MutableList<Interessenten>): Boolean {

    var index = 0
    var statusLogin = false
    var email = ""
    var passwort = ""


    while(!statusLogin) {
        print("\nDeine E-Mail Adresse: ")
        email = readln()
        print("\nDein Passwort: ")
        passwort = readln()



        if(interessentenListe.isNotEmpty() && interessentenListe.size < 2)
            if((interessentenListe[index].email == email) && (interessentenListe[index].passwort == passwort))
                statusLogin = true
            else
                print("\nFalsche Eingabe! Neuer Versuch ...")
    }

    return false
}