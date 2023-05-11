package klassen.utils.database
import klassen.Immo
import klassen.utils.database.utils.eingabeLoginRegistrierung
import klassen.utils.database.utils.einlesenObjekte
import utils.*

// Globale Variablen
var maklerIndex = 0
var maklerListe = anlegenMakler(maklerIndex)
var objektIndex = 0
var objektListe = einlesenObjekte()
val wahr = true
val qm = "m²"

fun main() {

    ausgabeKonsoleObjekte(0, objektListe)

    eingabeLoginRegistrierung()

    var auswahl: Int

    while(wahr){
        auswahl = eingabeKonsole()
        when(auswahl){
            1 -> ausgabeKonsoleMakler(maklerIndex, maklerListe)
        }
    }
}

// ausgabeKonsoleMakler(maklerIndex, maklerListe)  ==>  Test erfolgreich
// eingabeKonsole()  ==>  Test erfolgreich