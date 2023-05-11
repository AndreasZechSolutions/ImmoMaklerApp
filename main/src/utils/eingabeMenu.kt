package klassen.utils.database

import utils.ausgabeKonsole


fun eingabeMenu(): Int {

    var eingabeZahl: Int? = null

    while(eingabeZahl == null){
        println("Geben sie ihr Alter ein:")
        try {
            eingabeZahl = readln().toInt()
        } catch (ex: Exception){
            // Fehlermeldung
            ausgabeKonsole("Keine Zahl. Wiederhole die Eingabe:\n")
        }

        if (eingabeZahl != null) {
            if (eingabeZahl < 0)
                eingabeZahl = null
            else if (eingabeZahl > 1)
                eingabeZahl = null
        }
    }

    return eingabeZahl


}