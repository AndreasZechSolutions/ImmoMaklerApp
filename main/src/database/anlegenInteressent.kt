package database
import klassen.*

fun anlegenInteressent(index: Int): MutableList<Interessenten> {

    val listeInteressenten = mutableListOf<Interessenten>()

    listeInteressenten.add(index, Interessenten(
        index,
        "Z70AZ3Z56",
        KontoTyp.Interessent,
        "andreaszech.privat@gmail.com",
        "Cologne4711",
        Anrede.Mann,
        "Andreas",
        "Zech",
        "Andreas Zech",
        "Von-Holstein-Straße 8",
        "8",
        "2. OG - links",
        "40764",
        "Langenfeld (Rheinland)",
        "",
        "",
        "",
        "andreaszech.privat@gmail.com",
        "",
        "",
        ))

    return listeInteressenten
}