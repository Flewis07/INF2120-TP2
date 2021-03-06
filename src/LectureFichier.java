import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Cette classe permet de lire le contenu d'un fichier converti en String.
 */
public class LectureFichier {

    private static final String MSG_ERR_1 = "Mauvais type de caractere.";
    private static final String MSG_ERR_2 = "Type de syllable inconnu.";

    /**
     * Permet de lire une ligne de String et de la separer en syllables.
     *
     * @param texte ligne de String a separer.
     * @return un Arraylist contenant un Arraylist de Syllables en String.
     * @throws MessageErrException s'il y a un caractere autre qu'une lettre.
     */
    public static ArrayList<ArrayList<String>> lectureFichier(String texte) throws MessageErrException {
        ArrayList<ArrayList<String>> listeSyllables = new ArrayList<>();
        String syllable = "";
        int position = 0;

        for (int i = 0; i < texte.length(); i++) {

            if(texte.charAt(i) < 'A' || texte.charAt(i) > 'Z' && texte.charAt(i) < 'a' || texte.charAt(i) > 'z'){
                if(texte.charAt(i) != 0x0027) {
                    throw new MessageErrException(MSG_ERR_1);
                }
            }

            switch (texte.charAt(i)) {
                case '\n':
                    syllable = syllable + " ";
                    listeSyllables.add(new ArrayList<>());
                    listeSyllables.get(position).add(syllable);
                    position++;
                    break;
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 0x0027:
                    syllable = syllable + texte.charAt(i);
                    listeSyllables.add(new ArrayList<>());
                    listeSyllables.get(position).add(syllable);
                    syllable = "";
                    position++;
                    break;
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                        listeSyllables.add(new ArrayList<>());
                        listeSyllables.get(position).add(LectureFichier.validerFormatSyllable(syllable, texte, i));
                        syllable = "";
                        position++;
                    break;
                default:
                    if (i == texte.length() - 1) {
                        throw new MessageErrException(MSG_ERR_2);
                    }else if(syllable.isEmpty()) {
                        syllable = syllable + texte.charAt(i);
                    } else {
                        syllable = syllable + Character.toLowerCase(texte.charAt(i));
                    }
                    break;
            }
        }
        return listeSyllables;
    }

    /**
     * Permet de convertir un fichier texte en String.
     *
     * @param nomFichier nom du fichier dont le contenu sera converti en String.
     * @return le contenu du fichier sous forme de String.
     * @throws IOException
     */
    public static String convertirString (String nomFichier) throws IOException {

        Path filePath = Paths.get(nomFichier);
        String contenu = Files.readString(filePath);

        return contenu;
    }

    /**
     * Retire les espace du tableau String.
     *
     * @param lignes tableau de String dans lequel il faut retirer les espace blancs.
     * @return un tableau de String sans espaces blancs.
     */
    public static String [] trimerString (String [] lignes){

        String [] tableau2 = new String[lignes.length];

        for (int i = 0; i < lignes.length; i++){
            tableau2[i] = lignes[i].replaceAll("\\s", "");
        }
        return tableau2;
    }

    /**
     * Permet de valider si la syllable majuscule doit etre converti en minuscule ou non.
     *
     * @param syllable la syllable que l'on doit valider.
     * @param texte le text dans lequel on va chercher les caracteres.
     * @param i la position a laquelle on va chercher le caractere.
     * @return une nouvelle syllable conforme.
     */
    private static String validerFormatSyllable(String syllable, String texte, int i){

        if(syllable.isEmpty()){
            syllable = syllable + texte.charAt(i);
        } else {
            syllable = syllable + Character.toLowerCase(texte.charAt(i));
        }
        return syllable;
    }
}
