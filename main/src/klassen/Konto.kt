package klassen

open class Konto (kontoid: Int, email: String, passwort: String){

    private var id: Int = 0
    private var mail: String = ""
    private var pass: String = ""

    init  {
        this.id = kontoid
        this.mail = email
        this.pass = passwort
    }
}