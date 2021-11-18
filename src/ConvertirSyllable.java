import java.util.ArrayList;

/**
 * Cette classe permet de convertir un String Syllable en unicode Japonais.
 */
public class ConvertirSyllable {

    private static final String MSG_ERR = "Erreur ligne vide.";
    private static final String MSG_ERR_2 = "Type de syllable inconnu.";

    /**
     * Converti un tableau de String en unicode japonais.
     * @param lignes tableau contenant les lignes du fichier en entree avec leurs syllables.
     * @param katagana Arraylist contenant les unicodes de type katagana pour la convertion.
     * @param hiragana Arraylist contenant les unicodes de type hiragana pour la convertion.
     * @return un nouvel Arraylist avec les syllables du fichier converti en japonais.
     * @throws MessageErrException si la ligne est vide.
     */
    public static ArrayList<ArrayList<String>> convertion(String [] lignes, ArrayList<Lettre> katagana,
                                                          ArrayList<Lettre> hiragana) throws MessageErrException {
        ArrayList<ArrayList<String>> ligneTableau;
        ArrayList<ArrayList<String>> listeUnicodeJaponais = new ArrayList<>();
        int position = 0;
        String unicodeJaponais;
        String syllable;

        for (int i = 0; i < lignes.length; i++) {
            ligneTableau = LectureFichier.lectureFichier(lignes[i]);
            if(lignes[i].isEmpty()){
                throw new MessageErrException(MSG_ERR);
            } else {
            listeUnicodeJaponais.add(new ArrayList<>());
            for (int j = 0; j < ligneTableau.size(); j++) {
                syllable = ligneTableau.get(j).get(position);
                if (syllable.charAt(0) >= 'A' && syllable.charAt(0) <= 'Z') {
                    unicodeJaponais = convertirSyllable(katagana, syllable);
                    listeUnicodeJaponais.get(i).add(unicodeJaponais);
                } else if (syllable.charAt(0) >= 'a' && syllable.charAt(0) <= 'z') {
                    unicodeJaponais = convertirSyllable(hiragana, syllable);
                    listeUnicodeJaponais.get(i).add(unicodeJaponais);
                }
            }
            }
        }
        return listeUnicodeJaponais;
    }

    /**
     * Permet de convertir une syllable en Japonais selon son unicode.
     * @param typeSyllable le type de de caractere Japonais en lequel la syllable sera converti.
     * @param syllable la syllable a convertir en Japonais.
     * @return un String de l'unicode Japonais correspondant a la syllable.
     * @throws MessageErrException si la syllable est introuvable dans la bibliotheque.
     */
    private static String convertirSyllable(ArrayList<Lettre> typeSyllable, String syllable)
            throws MessageErrException {
        Lettre valeurUnicode;
        String syllableConverti = "";

            for (int j = 0; j < typeSyllable.size(); j++) {
                valeurUnicode = typeSyllable.get(j);
                if (syllable.charAt(0) == valeurUnicode.syllable.charAt(0)
                        && valeurUnicode.syllable.length() == 1) {
                    syllableConverti = valeurUnicode.unicode;
                    j = typeSyllable.size();
                } else if (syllable.charAt(0) == valeurUnicode.syllable.charAt(0)
                        && syllable.charAt(1) == valeurUnicode.syllable.charAt(1)
                        && valeurUnicode.syllable.length() == 2) {
                    syllableConverti = valeurUnicode.unicode;
                    j = typeSyllable.size();
                } else if (syllable.charAt(0) == valeurUnicode.syllable.charAt(0)
                        && syllable.charAt(1) == valeurUnicode.syllable.charAt(1)
                        && syllable.charAt(2) == valeurUnicode.syllable.charAt(2)
                        && valeurUnicode.syllable.length() == 3) {
                    syllableConverti = valeurUnicode.unicode;
                    j = typeSyllable.size();
                }
            }
            if(syllableConverti.isEmpty()){
                throw new MessageErrException(MSG_ERR_2);
            }
        return syllableConverti;
    }
}
