package klassen

class Einfamilien(
    immoId: Int = 0,
    objektNr: String = "",
    immoObjektArt: ObjektArt,
    bauJahr: String = "",
    gesamtFlaeche: Double = 0.0,
    preisNetto: Double = 0.0,
    geldTyp: Waehrung,
    provision: Double = 0.0,
    steuer: Int = 19,
    typ: ImmoTyp,
    art: ImmoArt,
    dachTyp: Dach,
    heizungsTyp: Heizung,
    eAusweis: EnergieAusweis,
    abwasser: String = "",
    frei: String = "",
    ort: String = "",
    kreis: String = "",
    bundesland: BlandAbk,
    region: Land,
    linkExpose: String = "",
    linkImages: String = "",
    objektTyp: String = "Haus",

    var hausTyp: String = "Einfamilienhaus",
    var objektTitel: String = "",
    var objektText: String = "",
    ): Haus(immoId,objektNr,immoObjektArt,bauJahr,gesamtFlaeche,preisNetto,geldTyp,provision,steuer,typ,art,dachTyp,heizungsTyp,eAusweis,abwasser,frei,ort,kreis,BlandAbk,region,linkExpose,linkImages,objektTyp) {
}