package klassen

class Passiv(
    immoId: Int = 0,
    objektNr: String = "",
    gesamtFlaeche: Double = 0.0,
    preisNetto: Double = 0.0,
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
    link_images: List<String>,
    objektTyp: String = "Haus",

    var hausTyp: String = "Passivhaus"
    ): Haus(immoId,objektNr,gesamtFlaeche,preisNetto,provision,steuer,typ,art,dachTyp,heizungsTyp,eAusweis,abwasser,frei,ort,kreis,bundesland,region,link_expose,link_images,objektTyp) {
}