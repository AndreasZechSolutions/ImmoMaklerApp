package utils

fun eingabeKonsole(): Int{

    var zahl: Int? = null

    while(zahl == null){
        ausgabeKonsoleMenu()
        print("Eingabe 1 für Impressum: ")
        try {
            zahl = readln().toInt()
        } catch (ex: Exception){
            // Entsprechende Fehlermeldung ausgeben
        }

        if (zahl != null) {
            if (zahl < 0)
                zahl = null
            else if (zahl > 1)
                zahl = null
        }
    }

    return zahl
}