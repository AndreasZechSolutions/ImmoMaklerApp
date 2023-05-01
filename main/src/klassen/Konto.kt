package klassen

open class Konto (
    private var kontoId: Int,
    private kontoTyp: Map<KontoTyp>,
    private var email: String,
    private var passwort: String) {
}