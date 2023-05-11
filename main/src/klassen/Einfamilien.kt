package klassen
import klassen.utils.database.Haus

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
    energierWert: String = "",
    abwasser: String = "",
    frei: String = "",
    ort: String = "",
    kreis: String = "",
    bundesland: BlandAbk,
    region: Land,
    linkExpose: String = "",
    linkImages: String = "",
    objektTyp: String = "Haus",
    hausTyp: String = "Einfamilienhaus",
    objektTitel: String = "",
    objektText: String = "",
    renovierung: String = "",
    zimmer: String = "",
    raumHoehe: String = "",
    lageImHaus: String = "",
    bad: String = "",
    kueche: String = "",
    keller: String = "",
    heizungsArt: String = "",
    garten: String = "",
    stellPlatz: String = "",
    nettoMieteKaltWohnen: Double = 0.0,
    nettoMieteKaltGewerbe: Double = 0.0,
    nettoMieteIstJahr: Double = 0.0,
    nettoMieteSollJahr: Double = 0.0,

    ): Haus(
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
    hausTyp,
    objektTitel,
    objektText,
    renovierung,
    zimmer,
    raumHoehe,
    lageImHaus,
    bad,
    kueche,
    keller,
    heizungsArt,
    garten,
    stellPlatz,
    nettoMieteKaltWohnen,
    nettoMieteKaltGewerbe,
    nettoMieteIstJahr,
    nettoMieteSollJahr,) {
}