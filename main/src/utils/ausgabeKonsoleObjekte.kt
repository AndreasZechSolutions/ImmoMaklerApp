package klassen.utils.database.utils
import klassen.*
import klassen.utils.database.qm

fun ausgabeKonsoleObjekte(index: Int, objektListe: List<Immo>)  {

    if(objektListe[index].objektNr != "")
        println(objektListe[index].objektNr)

    println(objektListe[index].immoObjektArt)

    if(objektListe[index].bauJahr != "")
        println(objektListe[index].bauJahr)

    if(objektListe[index].gesamtFlaeche != 0.00)
        println("${objektListe[index].gesamtFlaeche} $qm")

    if(objektListe[index].preisNetto != 0.00)
        print("${objektListe[index].preisNetto} ${objektListe[index].geldTyp}")

}

