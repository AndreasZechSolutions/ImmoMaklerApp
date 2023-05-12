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

    anlegenInteressent(interessentIndex)

    var auswahl: Int

    var wahr = true
    while(wahr){
        auswahl = eingabeLoginRegistrierung()
        when(auswahl){
            1 -> wahr = false
            2 -> wahr = false
        }

    }
    wahr = true
    while(wahr){
        auswahl = eingabeKonsole()
        when(auswahl){
            1 -> anzeigenAllerObjekte(0,objektListe.size-1, objektListe)
            2 -> ausgabeKonsoleMakler(maklerIndex, maklerListe)
        }
    }
}
