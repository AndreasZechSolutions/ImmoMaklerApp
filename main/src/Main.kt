package klassen.utils.database
import utils.*

// Globale Variablen
var maklerIndex = 0
var maklerListe = anlegenMakler(maklerIndex)
var objekte = einlesenObjekte()
val wahr = true

fun main() {
    var auswahl: Int

    while(wahr){
        auswahl = eingabeKonsole()
        when(auswahl){
            1 -> ausgabeKonsoleMakler(maklerIndex, maklerListe)
        }
    }
}

// ausgabeKonsoleMakler(maklerIndex, maklerListe)  ==>  Test erfolgreich