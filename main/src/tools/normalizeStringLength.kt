package klassen.utils.database.tools

fun normalizeStringLength(str: String, nr_chars: Int = 20): String {
    return if (str.length < nr_chars)
        str.padEnd(nr_chars, ' ')
    else if (str.length > nr_chars)
        str.substring(0, nr_chars)
    else
        str
}