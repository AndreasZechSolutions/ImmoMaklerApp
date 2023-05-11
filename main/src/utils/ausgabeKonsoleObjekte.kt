package klassen.utils.database.utils
import klassen.*
import klassen.utils.database.qm

fun ausgabeKonsoleObjekte(index: Int, objektListe: List<Immo>)  {

    if(objektListe[index].objektNr != "")
        println("ObjektNr.: ${objektListe[index].objektNr} ")

    println("ObjektArt.: ${objektListe[index].immoObjektArt} ")

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

}

