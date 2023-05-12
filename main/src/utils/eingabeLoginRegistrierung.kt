package klassen.utils.database.utils
import utils.ausgabeKonsole

fun eingabeLoginRegistrierung(): Int {

    var zahl: Int? = null

    while(zahl == null){
        ausgabeKonsoleMenuStart()
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