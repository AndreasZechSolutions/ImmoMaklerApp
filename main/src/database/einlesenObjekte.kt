package klassen.utils.database.utils
import klassen.*

fun einlesenObjekte(index: Int): MutableList<Immo> {

    var objekte = mutableListOf<Immo>()

    if(index == 0)
        objekte.add(0, Einfamilien(
            1,
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

    if(index == 1)
        objekte.add(1, Mehrfamilien(
            2,
            "BBI-2",
            ObjektArt.Altbau,
            "1901",
            501.00,
            449000.00,
            Waehrung.EUR,
            3.57,
            19,
            ImmoTyp.Kauf,
            ImmoArt.Privat,
            Dach.Satteldach,
            Heizung.Gas,
            EnergieAusweis.inVorbereitung,
            "139,2 kWH",
            "",
            "",
            "Fürstenberg/Havel",
            "Oberhavel",
            BlandAbk.BB,
            Land.Deutschland,
            "",
            "",
            "Haus",
            "",
            "",
            "",
            "",
            "5 Bäder",
            "",
            "50 % unterkellert, Kappendecke",
            "Gastherme",
            "",
            "",
            1523.00,
            0.00,
            18276.00,
            23940.00,
            "Mehrfamilienhaus",
            "Mehrfamilienhaus in ruhiger Parklage",
            "",
        ))

    if(index == 2)
    objekte.add(2, Mehrfamilien(
        3,
        "BBI-3",
        ObjektArt.Neubau,
        "2010",
        84.00,
        607050.00,
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
        "nach Auszug der Untermieterin",
        "",
        "",
        BlandAbk.BB,
        Land.Deutschland,
        "",
        "",
        "Haus",
        "",
        "2 Zimmer",
        "3,00 m",
        "3 OG",
        "1 mod. Bad, 1 Gäste WC",
        "",
        "",
        "Zentral, Fußbodenheizung",
        "",
        "Ja, 35.000 EUR",
        0.00,
        0.00,
        0.00,
        0.00,
        "Mehrfamilienhaus",
        "Repräsentative Luxuswohnung",
        "Perfekte Citywohnung mit Designerküche, Balkon und Stellplatz in 1A Kiez nördlich der Torstraße. Diese Wohnung kann als Kapitalanlage oder als private Cityresidenz erworben werden.",
    ))
    return objekte
}