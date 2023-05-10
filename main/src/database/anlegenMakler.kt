package klassen.utils.database

import klassen.*
import utils.*
import database.*


fun anlegenMakler(index: Int): MutableList<Makler> {


    var maklerListe = mutableListOf<Makler>()

    maklerListe.add(index,Makler(
        index,
        "B615Y3Z56",
        KontoTyp.Makler,
        "bastgen@bastgen-berlin.com",
        "Cologne4711",
        "Bastgen BERLIN IMMOBILIEN",
        Rechtsform.Einzelkaufmann,
        "Bettina",
        "Bastgen",
        "Bettina Bastgen",
        "Auguststraße",
        "36",
        "Büro Berlin",
        "10119",
        "Berlin",
        "030 - 28 04 03 09",
        "0173 - 7 65 81 81",
        "",
        "bastgen@bastgen-berlin.com",
        "www.bastgen-berlin.com",
        "Bettina Bastgen ist Ihre persönliche Immobilienmaklerin für Berlin & Neuruppin\n" +
                "Die Vermittlung hochwertiger und exklusiver Privat-Immobilien, insbesondere im Raum Neuruppin und Berlin, sind unser Spezialgebiet als Ihr persönlicher Immobilienmakler. An unseren beiden Standorten in Neuruppin und Berlin Mitte beraten wir Interessenten und Kunden ausführlich zu aktuellen Angeboten.\n" +
                "\n" +
                "Gerne begleiten wir als Makler mit juristischem Sachverstand den Verkauf Ihrer Immobilie. Wir vermitteln Häuser und Grundstücke, Landhäuser, Bauernhöfe, Einfamilienhäuser oder Mehrfamilienhäuser auch als Kapitalanlagen in Neuruppin, Berlin und Brandenburg.\n" +
                "\n" +
                "Bastgen Berlin Immobilien ist ein persönlich geführtes Unternehmen mit über 10 Jahren Erfahrung als Immobilienmaklerin.\n" +
                "\n" +
                "Ihre ganzheitliche und professionelle Beratung vor und nach dem Verkauf steht bei uns im Vordergrund. Hochwertige Privat-Immobilien von Ihrem Immobilienmakler in Berlin-Neuruppin."
        ))
    return maklerListe
}