package klassen.utils.database

import klassen.*
import utils.*
import database.*

// Globale Variablen
var maklerIndex = 0
var maklerListe = anlegenMakler(maklerIndex)
var objekte = einlesenImmo()


fun main() {
    var auswahl: Int
    val wahr = true

    while(wahr){
        auswahl = eingabeKonsole()
        when(auswahl){
            1 -> ausgabeKonsoleMakler(maklerIndex, maklerListe)
        }
    }



}

// ausgabeKonsoleMakler(maklerIndex, maklerListe)  ==>  Test erfolgreich