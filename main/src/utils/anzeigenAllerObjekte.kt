package klassen.utils.database.utils

import klassen.Immo


fun anzeigenAllerObjekte(min: Int, max: Int, objektListe: List<Immo>) {

        for (i in min..max) {
            ausgabeKonsoleObjekte(i, objektListe)
            for (i in 1..2)
                println()
            if(i < max) {
                println("Drücke eine Enter-/Return-Taste für weiter ...")
                readln()
            }
        }
}