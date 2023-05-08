package klassen

class Garage(
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
    energierWert: String = "",
    abwasser: String = "",
    frei: String = "",
    ort: String = "",
    kreis: String = "",
    bundesland: BlandAbk,
    region: Land,
    link_expose: String = "",
    link_images: String = "",

    var objektTyp: String = "Garage",
    var objektTitel: String = "",
    var objektText: String = "",
    var garageTyp: GaragenTyp,
    var garageArt: GaragenArt,
    var garageTor: GaragenTor,
    var breite: Double = 0.0,
    var laenge: Double = 0.0
): Immo(immoId,objektNr,immoObjektArt,bauJahr,gesamtFlaeche,preisNetto,geldTyp,provision,steuer,typ,art,dachTyp,heizungsTyp,eAusweis,energierWert,abwasser,frei,ort,kreis,bundesland,region,link_expose,link_images) {
}