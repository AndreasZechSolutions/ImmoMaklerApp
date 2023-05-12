package klassen

open class Immo(
    var immoId: Int = 0,
    var objektNr: String = "",
    var immoObjektArt: ObjektArt,
    var bauJahr: String = "",
    var gesamtFlaeche: Double = 0.0,
    var preisNetto: Double = 0.0,
    var geldTyp: Waehrung,
    var provision: Double = 0.0,
    var steuer: Int = 19,
    var typ: ImmoTyp,
    var art: ImmoArt,
    var dachTyp: Dach,
    var heizungsTyp: Heizung,
    var eAusweis: EnergieAusweis,
    var energierWert: String = "",
    var abwasser: String = "",
    var frei: String = "",
    var ort: String = "",
    var kreis: String = "",
    var bundesland: BlandAbk,
    var region: Land = Land.Deutschland,
    var linkExpose: String = "",
    var linkImages: String = "",
    var objektTyp: String = "",
    var hausTyp: String = "",
    var objektTitel: String = "",
    var objektText: String = "",
) {
    fun preisProQm(gesamtFlaeche: Double, preisNetto: Double): Double {

        var flaeche = gesamtFlaeche
        var preis = preisNetto
        var quadratmeterPreis = preis / flaeche

        return (quadratmeterPreis)
    }
}