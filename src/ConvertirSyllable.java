import java.io.IOException;
import java.util.ArrayList;

public class ConvertirSyllable {

    /**
     * Converti un tableau de String en unicode japonais.
     * @param lignes tableau contenant les lignes du fichier en entree avec leurs syllables.
     * @param katagana Arraylist contenant les unicodes de type katagana pour la convertion.
     * @param hiragana Arraylist contenant les unicodes de type hiragana pour la convertion.
     * @return un nouvel Arraylist avec les syllables du fichier converti en japonais.
     * @throws IOException
     */
    public static ArrayList<ArrayList<String>> convertion(String [] lignes, ArrayList<Lettre> katagana,
                                                          ArrayList<Lettre> hiragana) throws MessageErrException {
        ArrayList<ArrayList<String>> c;
        ArrayList<ArrayList<String>> d = new ArrayList<>();
        int k = 0;
        String e;
        String syllable;

        for (int i = 0; i < lignes.length; i++) {
            c = LectureFichier.lectureFichier(lignes[i]);
            if(lignes[i].isEmpty()){
                throw new MessageErrException("Erreur ligne vide.");
            } else {
            d.add(new ArrayList<>());
            for (int j = 0; j < c.size(); j++) {
                syllable = c.get(j).get(k);
                if (syllable.charAt(0) >= 'A' && syllable.charAt(0) <= 'Z') {
                    e = convertirSyllable(katagana, syllable);
                    d.get(i).add(e);
                } else if (syllable.charAt(0) >= 'a' && syllable.charAt(0) <= 'z') {
                    e = convertirSyllable(hiragana, syllable);
                    d.get(i).add(e);
                }
            }
            }
        }
        return d;
    }

    /**
     * Permet de convertir une syllable en Japonais selon son unicode.
     * @param typeSyllable le type de de caractere Japonais en lequel la syllable sera converti.
     * @param syllable la syllable a convertir en Japonais.
     * @return un String de l'unicode Japonais correspondant a la syllable.
     */
    private static String convertirSyllable(ArrayList<Lettre> typeSyllable, String syllable) throws MessageErrException {
        Lettre valeurUnicode;
        String syllableConverti = "";

            for (int j = 0; j < typeSyllable.size(); j++) {
                valeurUnicode = typeSyllable.get(j);
                if (syllable.charAt(0) == valeurUnicode.syllable.charAt(0) && valeurUnicode.syllable.length() == 1) {
                    syllableConverti = valeurUnicode.unicode;
                    j = typeSyllable.size();
                } else if (syllable.charAt(0) == valeurUnicode.syllable.charAt(0)
                        && syllable.charAt(1) == valeurUnicode.syllable.charAt(1) && valeurUnicode.syllable.length() == 2) {
                    syllableConverti = valeurUnicode.unicode;
                    j = typeSyllable.size();
                } else if (syllable.charAt(0) == valeurUnicode.syllable.charAt(0)
                        && syllable.charAt(1) == valeurUnicode.syllable.charAt(1)
                        && syllable.charAt(2) == valeurUnicode.syllable.charAt(2) && valeurUnicode.syllable.length() == 3) {
                    syllableConverti = valeurUnicode.unicode;
                    j = typeSyllable.size();
                }
            }
            if(syllableConverti.isEmpty()){
                throw new MessageErrException("Type de syllable inconnu.");
            }
        return syllableConverti;
    }
}
