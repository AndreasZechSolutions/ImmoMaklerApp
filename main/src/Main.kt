package klassen.utils.database

import klassen.*
import utils.*
import database.*

// Globale Variablen
var maklerIndex = 0

fun main() {
    var maklerListe = anlegenMakler(maklerIndex)
    var objekte = einlesenImmo()

    ausgabeKonsoleMakler(maklerIndex, maklerListe)
}