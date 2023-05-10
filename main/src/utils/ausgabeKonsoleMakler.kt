package klassen.utils.database

import klassen.*
import utils.*
import database.*

fun ausgabeKonsoleMakler(index: Int, maklerListe: MutableList<Makler>) {

    if(maklerListe[index].firmaName != "")
        println(maklerListe[index].firmaName)

    println(maklerListe[index].firmaTyp)

    if((maklerListe[index].vorname != "") && (maklerListe[index].nachname != "") )
        print(maklerListe[index].vorname + " " + println(maklerListe[index].nachname))

    if((maklerListe[index].strasse != "") && (maklerListe[index].nummer != ""))
        print(maklerListe[index].strasse + " " + maklerListe[index].nummer  + " " + maklerListe[index].zusatz)



}
