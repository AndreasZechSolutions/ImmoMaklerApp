package utils

fun eingabeKonsole(): Int {

    var zahl: Int? = null

    while(zahl == null){
       ausgabeKonsoleMenu()
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