package klassen.utils.database.utils
import klassen.*
import klassen.utils.database.Haus
import klassen.utils.database.qm


fun ausgabeKonsoleObjekte(index: Int, objektListe: List<Immo>)  {

    if(objektListe[index].objektNr != "")
        println("ObjektNr.: ${objektListe[index].objektNr} ")

    println("Objektart.: ${objektListe[index].immoObjektArt} ")

    if(objektListe[index].bauJahr != "")
        println("Baujahr: ${objektListe[index].bauJahr} ")

    if(objektListe[index].gesamtFlaeche != 0.00)
        println("Gesamtfläche: ${objektListe[index].gesamtFlaeche} $qm")

    if(objektListe[index].preisNetto != 0.00)
        println("Preis Netto: ${objektListe[index].preisNetto} ${objektListe[index].geldTyp}")

    println("Preis pro ${qm}: ${objektListe[index].preisProQm(objektListe[index].gesamtFlaeche,objektListe[index].preisNetto)}")

    if(objektListe[index].provision != 0.00)
        println("Provision: ${objektListe[index].provision} ")

    if(objektListe[index].steuer != 0)
        println("Mehrwertsteuer:  ${objektListe[index].steuer} ")

    println("Kauf/Miete: ${objektListe[index].typ} ")

    println("Privat/Gewerbe: ${objektListe[index].art} ")

    println("Dachtyp: ${objektListe[index].dachTyp} ")

    println("Heizungstyp: ${objektListe[index].heizungsTyp} ")

    println("Energie-Ausweis: ${objektListe[index].eAusweis} ")

    if(objektListe[index].energierWert != "")
        println("Energiewert: ${objektListe[index].energierWert} ")

    if(objektListe[index].abwasser != "")
        println("Abwasser: ${objektListe[index].abwasser} ")

    if(objektListe[index].frei != "")
        println("Frei ab: ${objektListe[index].frei} ")

    if(objektListe[index].ort != "")
        println("Ort: ${objektListe[index].ort} ")

    println("Bundesland: ${objektListe[index].bundesland} ")

    println("Land: ${objektListe[index].region} ")

    if(objektListe[index].linkExpose != "")
        println("Exposé: ${objektListe[index].linkExpose} ")

    if(objektListe[index].linkImages != "")
        println("Bilder: ${objektListe[index].linkImages} ")

    if(objektListe[index].objektTitel != "")
        println("Haustyp: ${objektListe[index].objektTitel} ")

    if(objektListe[index].objektText != "")
        println("Haustyp: ${objektListe[index].objektText} ")

    if (objektListe[index].objektTyp == "Haus") {
        val hausObjekt: Haus = objektListe[index] as Haus

        if (hausObjekt.renovierung != "")
            println("Renovierung: ${hausObjekt.renovierung} ")

        if (hausObjekt.zimmer != "")
            println("Zimmer: ${hausObjekt.zimmer} ")

        if (hausObjekt.raumHoehe != "")
            println("Raumhöhe: ${hausObjekt.raumHoehe} ")

        if (hausObjekt.lageImHaus != "")
            println("Raumhöhe: ${hausObjekt.lageImHaus} ")

        if (hausObjekt.bad != "")
            println("Bad: ${hausObjekt.bad} ")

        if (hausObjekt.kueche != "")
            println("Küche: ${hausObjekt.kueche} ")

        if (hausObjekt.keller != "")
            println("Keller: ${hausObjekt.keller} ")

        if (hausObjekt.heizungsArt != "")
            println("Heizungsart: ${hausObjekt.heizungsArt} ")

        if (hausObjekt.garten != "")
            println("Garten: ${hausObjekt.garten} ")

        if (hausObjekt.stellPlatz != "")
            println("Stellplatz: ${hausObjekt.stellPlatz} ")

        if (hausObjekt.nettoMieteKaltGewerbe != 0.00)
            println("n: ${hausObjekt.nettoMieteKaltGewerbe} ${objektListe[index].geldTyp}")

        if (hausObjekt.nettoMieteIstJahr != 0.00)
            println("Bad: ${hausObjekt.nettoMieteIstJahr} ${objektListe[index].geldTyp}")

        if (hausObjekt.nettoMieteSollJahr != 0.00)
            println("Bad: ${hausObjekt.nettoMieteSollJahr} ${objektListe[index].geldTyp}")
    }
    if (objektListe[index].objektTyp == "Wohnung") {
        val whgObjekt: Whg = objektListe[index] as Whg

        if (whgObjekt.renovierung != "")
            println("Renovierung: ${whgObjekt.renovierung} ")

        if (whgObjekt.zimmer != "")
            println("Zimmer: ${whgObjekt.zimmer} ")

        if (whgObjekt.raumHoehe != "")
            println("Raumhöhe: ${whgObjekt.raumHoehe} ")

        if (whgObjekt.lageImHaus != "")
            println("Raumhöhe: ${whgObjekt.lageImHaus} ")

        if (whgObjekt.bad != "")
            println("Bad: ${whgObjekt.bad} ")

        if (whgObjekt.heizungsArt != "")
            println("Heizungsart: ${whgObjekt.heizungsArt} ")

        if (whgObjekt.garten != "")
            println("Garten: ${whgObjekt.garten} ")

        if (whgObjekt.wohnGeld != "")
            println("Wohngeld: ${whgObjekt.wohnGeld} ${objektListe[index].geldTyp}")

        if (whgObjekt.wohnflaeche != "")
            println("Wohnfläche: ${whgObjekt.wohnflaeche} $qm")

        if (whgObjekt.nutzFlaeche != "")
            println("Nutzfläche: ${whgObjekt.nutzFlaeche} $qm")

        if (whgObjekt.miete != 0.0)
            println("Miete: ${whgObjekt.miete} ${objektListe[index].geldTyp}")

        if (whgObjekt.nebenKosten != 0.0)
            println("Nebenkosten: ${whgObjekt.nebenKosten} ${objektListe[index].geldTyp}")

        if (whgObjekt.stellplatzPreis != 0.0)
            println("Stellplatzpreis: ${whgObjekt.stellplatzPreis} ${objektListe[index].geldTyp}")
    }
}

