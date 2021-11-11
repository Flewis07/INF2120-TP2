import java.io.IOException;
import java.util.ArrayList;

public class Convertir {

    /**
     * Converti un tableau de String en unicode japonais.
     * @param lignes tableau contenant les lignes du fichier en entree avec leurs syllables.
     * @param katagana Arraylist contenant les unicodes de type katagana pour la convertion.
     * @param hiragana Arraylist contenant les unicodes de type hiragana pour la convertion.
     * @return un nouvel Arraylist avec les lignes du fichier converti en japonais.
     * @throws IOException
     */
    public static ArrayList<ArrayList<String>> convertion(String [] lignes, ArrayList<Lettre> katagana,
                                                          ArrayList<Lettre> hiragana) throws IOException {
        ArrayList<ArrayList<String>> c;
        ArrayList<ArrayList<String>> d = new ArrayList<>();

        int k = 0;

        for (int i = 0; i < lignes.length; i++) {
            c = LectureFichier.lectureFichier(lignes[i]);
            for (int j = 0; j < c.get(k).size(); j++) {
                if (c.get(k).get(j).charAt(0) >= 'A' && c.get(k).get(j).charAt(0) <= 'Z') {
                    d.add(convertirUnicode(katagana, c));
                } else if (c.get(k).get(j).charAt(0) >= 'a' && c.get(k).get(j).charAt(0) <= 'z') {
                    d.add(convertirUnicode(hiragana, c));
                }
            }
        }
        return d;
    }

    /**
     * Permet de retourner les syllables d'une ligne en unicode japonais.
     * @param typeCaracteres le type de caractere dont seront converti les syllables.
     * @param ligneSyllables la ligne contenant les syllables a convertir.
     * @return un Arraylist de type String contenant les syllables convertis avec leurs unicodes Japonais.
     */
    private static ArrayList<String> convertirUnicode(ArrayList<Lettre> typeCaracteres,
                                                      ArrayList<ArrayList<String>> ligneSyllables) {
        ArrayList<String> d = new ArrayList<>();
        ArrayList<ArrayList<String>> syllable1 = new ArrayList<>();
        ArrayList<String> syllable2 = new ArrayList<>();
        String nouvelSyllable = "";
        Lettre valeur;
        char y = 'y';
        int j = 0;
        int k = 0;
        int i = 0;


            while (j < typeCaracteres.size() && i < ligneSyllables.size()) {
                valeur = typeCaracteres.get(j);
                if (ligneSyllables.get(i).get(k).charAt(0) == valeur.a.charAt(0) && valeur.a.length() == 1) {
                    d.add(valeur.unicode);
                    j = 0;
                    i++;
                } else if (ligneSyllables.get(i).get(k).charAt(0) == valeur.a.charAt(0)
                        && ligneSyllables.get(i).get(k).charAt(1) == valeur.a.charAt(1) && valeur.a.length() == 2) {
                    d.add(valeur.unicode);
                    j = 0;
                    i++;
                } else if (ligneSyllables.get(i).get(k).charAt(0) == valeur.a.charAt(0)
                        && ligneSyllables.get(i).get(k).charAt(1) == valeur.a.charAt(1)
                        && ligneSyllables.get(i).get(k).charAt(2) == valeur.a.charAt(2) && valeur.a.length() == 3) {
                    d.add(valeur.unicode);
                    j = 0;
                    i++;
                /**} else if (ligneSyllables.get(i).get(k).charAt(1) == y && ligneSyllables.get(i).size() == 3) {
                    nouvelSyllable = ligneSyllables.get(i).get(k).charAt(0) + "i";
                    syllable1.add(new ArrayList<String>());
                    syllable1.get(0).add(nouvelSyllable);
                    syllable2 = convertirUnicode(typeCaracteres, syllable1);
                    d.add(syllable2.get(0));
                    nouvelSyllable = "";
                    nouvelSyllable = nouvelSyllable + ligneSyllables.get(i).get(k).charAt(1) + ligneSyllables.get(i).get(k).charAt(2);
                    syllable1.get(0).add(nouvelSyllable);
                    syllable2 = convertirUnicode(typeCaracteres, syllable1);
                    d.add(syllable2.get(0));
                    j = 0;
                    i++;*/
                } else {
                    j++;
                }
            }

        return d;
    }
}
