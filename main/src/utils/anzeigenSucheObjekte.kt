package klassen.utils.database.utils

import klassen.Immo

fun anzeigenSucheObjekte(objektListe: List<Immo>) {

    var auswahl = 0
    var wahr = true
    while(wahr){
        auswahl = eingabeKonsoleSuche()
        when(auswahl){
            1 -> sucheObjekte("Haus", objektListe)
            2 -> sucheObjekte("Wohnung", objektListe)
        }
    }

}