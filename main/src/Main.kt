package klassen.utils.database
import database.anlegenMakler
import klassen.utils.database.utils.eingabeLoginRegistrierung
import database.einlesenObjekte
import klassen.utils.database.utils.anzeigenAllerObjekte
import utils.*

// Globale Variablen
const val qm = "m²"
const val mwSt = "MwSt."

fun main() {
    var maklerIndex = 0
    var maklerListe = anlegenMakler(maklerIndex)
    var objektIndex = 0
    var objektListe = einlesenObjekte()
    var wahr = true

    eingabeLoginRegistrierung()

    var auswahl: Int

    while(wahr){
        auswahl = eingabeKonsole()
        when(auswahl){
            1 -> anzeigenAllerObjekte(0,2, objektListe)
            2 -> ausgabeKonsoleMakler(maklerIndex, maklerListe)
        }
    }
}
