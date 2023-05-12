package klassen.utils.database.utils

import utils.ausgabeKonsole
import utils.ausgabeKonsoleSuche

fun eingabeKonsoleSuche(): Int {

    var zahl: Int? = null

    while(zahl == null){
        ausgabeKonsoleSuche()
        print("Wähle ein Zahl: ")

        try {
            zahl = readln().toInt()
        } catch (ex: Exception){
            // Fehlermeldung
            ausgabeKonsole("Keine Zahl. Bitte wiederhole die Eingabe: ")
        }

        if (zahl != null) {
            if (zahl < 0)
                zahl = null
            else if (zahl > 2)
                zahl = null
        }
    }

    return zahl
}
