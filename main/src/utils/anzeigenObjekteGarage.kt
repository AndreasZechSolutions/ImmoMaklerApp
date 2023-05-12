package klassen.utils.database.utils

import klassen.Immo

fun anzeigenObjekteGarage(min: Int, max: Int, objektListe: List<Immo>) {

    for (i in min..max) {
        if(objektListe[i].objektTyp == "Garage")
            ausgabeKonsoleObjekte(i, objektListe)
        else
            println("Sorry, wir haben aktuell keine Häuser im Portfolio.")
        for (i in 1..2)
            println()
        if(i < max) {
            println("Drücke eine Enter-/Return-Taste für weiter ...")
            readln()
        }
    }
}