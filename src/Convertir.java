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

        for (int i = 0; i < lignes.length; i++) {
            c = LectureFichier.lectureFichier(lignes[i]);
            for (int j = 0; j < c.get(i).size(); j++) {
                if (c.get(i).get(j).charAt(0) >= 'A' && c.get(i).get(j).charAt(0) <= 'Z') {
                    d.add(convertirUnicode(katagana, c));
                } else if (c.get(i).get(j).charAt(0) >= 'a' && c.get(i).get(j).charAt(0) <= 'z') {
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
        Lettre valeur;
        String syllable1 = "";
        String syllable2 = "";
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
                } else {
                    j++;
                }
            }

        return d;
    }
}
