public class Lettre {

    String syllable;
    String unicode;

    /**
     * Constructeur de la classe lettre.
     * @param syllable Syllable
     * @param unicode Unicode Japonais correspondant a la Syllable.
     */
    public Lettre(String syllable, String unicode) {
        this.syllable = syllable;
        this.unicode = unicode;
    }

    /**
     * Permet d'aller chercher le a d'un objet de type Lettre.
     * @return le a de l'objet de type Lettre.
     */
    public String getSyllable() {
        return syllable;
    }

    /**
     * Permet de definir le a de l'objet de type Lettre.
     * @return Defini le nouveau a de l'objet de type Lettre.
     */
    public void setSyllable(String syllable) {
        this.syllable = syllable;
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
