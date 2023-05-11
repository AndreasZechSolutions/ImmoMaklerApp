package klassen

class Terrassenwohnung(
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
    bundesland: BlandAbk = BlandAbk.BB,
    region: Land = Land.Deutschland,
    linkExpose: String = "",
    linkImages: String = "",
    objektTyp: String = "Wohnung",
    whgTyp: String = "Terrassenwohnung",
    objektTitel: String = "",
    objektText: String = "",
    renovierung: String = "",
    zimmer: String = "",
    raumHoehe: String = "",
    lageImHaus: String = "",
    bad: String = "",
    heizungsArt: String = "",
    garten: String = "",
    stellplatz: String = "",
    wohnGeld: String = "",
    wohnflaeche: String = "",
    nutzFlaeche: String = "",

    ): Whg(
    immoId,
    objektNr,
    immoObjektArt,
    bauJahr,
    gesamtFlaeche,
    preisNetto,
    geldTyp,
    provision,
    steuer,
    typ,
    art,
    dachTyp,
    heizungsTyp,
    eAusweis,
    energierWert,
    abwasser,
    frei,
    ort,
    kreis,
    bundesland,
    region,
    linkExpose,
    linkImages,
    objektTyp,
    whgTyp,
    objektTitel,
    objektText,
    renovierung,
    zimmer,
    raumHoehe,
    lageImHaus,
    bad,
    heizungsArt,
    garten,
    stellplatz,
    wohnGeld,
    wohnflaeche,
    nutzFlaeche,) {

}