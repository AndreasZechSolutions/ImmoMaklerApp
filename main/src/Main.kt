package klassen.utils.database
import database.anlegenInteressent
import database.anlegenMakler
import klassen.utils.database.utils.eingabeLoginRegistrierung
import database.einlesenObjekte
import klassen.Immo
import klassen.Interessenten
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
    var interessentIndex = 0
    var merkListe = mutableListOf<Interessenten>()
    var wahr = true

    anlegenInteressent(interessentIndex)

    eingabeLoginRegistrierung()

    var auswahl: Int

    while(wahr){
        auswahl = eingabeLoginRegistrierung()
        when(auswahl){
            1 -> println("")
            2 -> println("")
        }
        wahr = false
    }

    while(wahr){
        auswahl = eingabeKonsole()
        when(auswahl){
            1 -> anzeigenAllerObjekte(0,objektListe.size-1, objektListe)
            2 -> ausgabeKonsoleMakler(maklerIndex, maklerListe)
        }
    }
}
