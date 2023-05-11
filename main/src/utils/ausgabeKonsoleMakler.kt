package utils
import klassen.*

fun ausgabeKonsoleMakler(index: Int, maklerListe: List<Makler>) {

    if(maklerListe[index].firmaName != "")
        println(maklerListe[index].firmaName)

    println(maklerListe[index].firmaTyp)

    if((maklerListe[index].vorname != "") && (maklerListe[index].nachname != "") )
        println(maklerListe[index].vorname + " " + maklerListe[index].nachname)

    if((maklerListe[index].strasse != "") && (maklerListe[index].nummer != ""))
        println(maklerListe[index].strasse + " " + maklerListe[index].nummer  + " " + maklerListe[index].zusatz)

    if((maklerListe[index].postleitzahl != "") && (maklerListe[index].ort != ""))
        println(maklerListe[index].postleitzahl + " " + maklerListe[index].ort)


    for(i in 1..2)
        print("\n")

    if(maklerListe[index].festnetz != "")
        println("Festnetz: " + maklerListe[index].festnetz)

    if(maklerListe[index].mobil != "")
        println("Mobil: " + maklerListe[index].mobil)

    if(maklerListe[index].fax != "")
        println("Fax: " + maklerListe[index].fax)

    if(maklerListe[index].eMail != "")
        println("E-Mail: " + maklerListe[index].eMail)

    if(maklerListe[index].web != "")
        println("Web: " + maklerListe[index].web)

    for(i in 1..2)
        print("\n")

    if(maklerListe[index].bio != "")
        println("Über uns:\n" +
                "=========\n" +
                maklerListe[index].bio
        )
}
