package klassen.utils.database.utils

import klassen.Immo


fun anzeigenAllerObjekte(min: Int, max: Int, objektListe: List<Immo>) {

    for (i in 0..2) {
        ausgabeKonsoleObjekte(i, objektListe)
        for (i in 1..4)
            println()
        println("Drücke eine Enter-/Return-Taste für weiter ...")
        readln()
    }
}