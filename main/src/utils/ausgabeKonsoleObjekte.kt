package klassen.utils.database.utils
import klassen.*
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
        println("Frei ab: ${objektListe[index].ort} ")

    println("Bundesland: ${objektListe[index].bundesland} ")

    println("Bundesland: ${objektListe[index].region} ")

    if(objektListe[index].linkExpose != "")
        println("Frei ab: ${objektListe[index].linkImages} ")











}

