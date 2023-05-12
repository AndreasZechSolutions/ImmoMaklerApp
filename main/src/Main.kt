package klassen.utils.database
import database.anlegenInteressent
import database.anlegenMakler
import database.einlesenObjekte
import klassen.Interessenten
import klassen.utils.database.utils.anzeigenAllerObjekte
import klassen.utils.database.utils.eingabeLoginRegistrierung
import klassen.utils.database.utils.login
import utils.ausgabeKonsoleMakler
import utils.eingabeKonsole

// Globale Variablen
const val qm = "m²"
const val mwSt = "MwSt."

var kontoId = 0


fun main() {
    var maklerIndex = 0
    var maklerListe = anlegenMakler(maklerIndex)
    var objektIndex = 0
    var objektListe = einlesenObjekte()
    var interessentIndex = 0
    var interessentenListe = anlegenInteressent(interessentIndex)
    var merkListe = mutableListOf<Interessenten>()

    anlegenInteressent(interessentIndex)

    var auswahl: Int

    var wahr = true
    while(wahr){
        auswahl = eingabeLoginRegistrierung()
        if(auswahl == 1)
            wahr = login(interessentenListe)
        else if (auswahl == 2) {
            // interessentenListe = registrieren(interessentenListe)
            wahr = false
        }
    }
    wahr = true
    while(wahr){
        auswahl = eingabeKonsole()
        when(auswahl){
            1 -> anzeigenAllerObjekte(0,objektListe.size-1, objektListe)
            2 -> wahr = false
            3 -> ausgabeKonsoleMakler(maklerIndex, maklerListe)
        }
    }
}
