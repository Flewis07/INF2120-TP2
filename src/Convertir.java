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
        ArrayList<ArrayList<String>> e = new ArrayList<>();
        String d = "";
        String syllable;

        int k = 0;

        for (int i = 0; i < lignes.length; i++) {
            c = LectureFichier.lectureFichier(lignes[i]);
            e.add(new ArrayList<>());
            for (int j = 0; j < c.size(); j++) {
                syllable = c.get(j).get(k);
                if (syllable.charAt(0) >= 'A' && syllable.charAt(0) <= 'Z') {
                    d = convertirUnicode(katagana, syllable);
                    e.get(i).add(d);
                } else if (syllable.charAt(0) >= 'a' && syllable.charAt(0) <= 'z') {
                    d = convertirUnicode(hiragana, syllable);
                    e.get(i).add(d);
                }
            }
        }
        return e;
    }

    /**
     * Permet de retourner les syllables d'une ligne en unicode japonais.
     * @param typeCaracteres le type de caractere dont seront converti les syllables.
     * @param syllable la ligne contenant les syllables a convertir.
     * @return un Arraylist de type String contenant les syllables convertis avec leurs unicodes Japonais.
     */
    private static String convertirUnicode(ArrayList<Lettre> typeCaracteres,
                                                      String syllable) {
        String d = "";
        Lettre valeur;
        int j = 0;
        int k = 0;
        int i = 0;


            while (j < typeCaracteres.size()) {
                valeur = typeCaracteres.get(j);
                if (syllable.charAt(0) == valeur.a.charAt(0) && valeur.a.length() == 1) {
                    d = valeur.unicode;
                    j = typeCaracteres.size();
                } else if (syllable.charAt(0) == valeur.a.charAt(0)
                        && syllable.charAt(1) == valeur.a.charAt(1) && valeur.a.length() == 2) {
                    d = valeur.unicode;
                    j = typeCaracteres.size();
                } else if (syllable.charAt(0) == valeur.a.charAt(0)
                        && syllable.charAt(1) == valeur.a.charAt(1)
                        && syllable.charAt(2) == valeur.a.charAt(2) && valeur.a.length() == 3) {
                    d = valeur.unicode;
                    j = typeCaracteres.size();
                } else {
                    j++;
                }
            }
        return d;
    }
}
