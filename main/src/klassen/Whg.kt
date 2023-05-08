package klassen

open class Whg(
    immoId: Int = 0,
    objektNr: String = "",
    immoObjektArt: ObjektArt,
    bauJahr: Int = 0,
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
    link_expose: String = "",
    link_images: String = "",

    var objektTyp: String = "Wohnung"

): Immo(immoId,objektNr,immoObjektArt,bauJahr,gesamtFlaeche,preisNetto,geldTyp,provision,steuer,typ,art,dachTyp,heizungsTyp,eAusweis,abwasser,frei,ort,kreis,bundesland,region,link_expose,link_images) {
}