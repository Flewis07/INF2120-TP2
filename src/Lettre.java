public class Lettre {

    String a;
    String unicode;

    /**
     * Constructeur de la classe lettre.
     * @param a Syllable
     * @param unicode Unicode Japonais correspondant a la Syllable.
     */
    public Lettre(String a, String unicode) {
        this.a = a;
        this.unicode = unicode;
    }

    /**
     * Permet d'aller chercher le a d'un objet de type Lettre.
     * @return le a de l'objet de type Lettre.
     */
    public String getA() {
        return a;
    }

    /**
     * Permet de definir le a de l'objet de type Lettre.
     * @return Defini le nouveau a de l'objet de type Lettre.
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * Permet d'aller chercher l'unicode d'un objet de type Lettre.
     * @return l'unicode de l'objet de type Lettre.
     */
    public String getUnicode() {
        return unicode;
    }

    /**
     * Permet de definir l'unicode de l'objet de type Lettre.
     * @return Defini le nouvel unicode de l'objet de type Lettre.
     */
    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }
}
