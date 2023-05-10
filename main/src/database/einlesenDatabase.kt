package klassen.utils.database

import klassen.Immo
import klassen.Einfamilien
import klassen.ObjektArt
import klassen.Waehrung
import klassen.ImmoTyp
import klassen.ImmoArt
import klassen.Dach
import klassen.Heizung
import klassen.EnergieAusweis
import klassen.BlandAbk
import klassen.Land

fun einlesenDatabase() {

    var objekte = mutableListOf<Immo>()

    objekte.add(0, Einfamilien(
        0,
        "BBI-1",
        ObjektArt.Altbau,
        "ca. 1938",
        453.00,
        385000.00,
        Waehrung.EUR,
        3.57,
        19,
        ImmoTyp.Kauf,
        ImmoArt.Privat,
        Dach.Satteldach,
        Heizung.Gas,
        EnergieAusweis.inVorbereitung,
        "",
        "",
        "nach Vereinbarung",
        "Alt Ruppin",
        "Ostprignitz-Ruppin",
        BlandAbk.BB,
        Land.Deutschland,
        "",
        "",
        "Haus",
        "2018",
        "3 Zimmer",
        "zwischen ca. 2,60 m bis 3,80 m",
        "",
        "1 Gäste WC, ein Ensuite Bad",
        "Wohnküche",
        "Ja, unter der Terrasse",
        "Zentralheizung",
        "Ja",
        "1 Garage für 1 kleinen PKW, Außenstellplatz",
        0.00,
        0.00,
        0.00,
        0.00,
        "Einfamilienhaus",
        "Stylisches Haus in Alt Ruppin",
        "",
        ))

}