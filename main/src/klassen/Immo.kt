package klassen

open class Immo(
    var immoId: Int = 0,
    var objektNr: String = "",
    var gesamtFlaeche: Double = 0.0,
    var preisNetto: Double = 0.0,
    var provision: Double = 0.0,
    var steuer: Int = 19,
    var typ: ImmoTyp,
    var art: ImmoArt,
    var dachTyp: Dach,
    var heizungsTyp: Heizung,
    var eAusweis: EnergieAusweis,
    var abwasser: String = "",
    var frei: String = "",
    var ort: String = "",
    var kreis: String = "",
    var bundesland: BlandAbk,
    var region: Land,
    var link_expose: String = "",
    var link_images: List<String>
    ) {
}