package klassen.utils.database
import database.anlegenMakler
import klassen.utils.database.utils.ausgabeKonsoleObjekte
import klassen.utils.database.utils.eingabeLoginRegistrierung
import database.einlesenObjekte
import utils.*

// Globale Variablen
var maklerIndex = 0
var maklerListe = anlegenMakler(maklerIndex)
var objektIndex = 0
var objektListe = einlesenObjekte()
const val wahr = true
const val qm = "m²"
const val mwSt = "MwSt."

fun main() {

    ausgabeKonsoleObjekte(0, objektListe) // Testphase

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