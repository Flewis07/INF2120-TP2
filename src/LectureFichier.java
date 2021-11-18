import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LectureFichier {

    /**
     * Permet de lire une ligne de String et de la separer en syllables.
     * @param texte ligne de String a separer.
     * @return un Arraylist contenant un Arraylist de Syllables en String.
     * @throws IOException
     */
    public static ArrayList<ArrayList<String>> lectureFichier(String texte) throws MessageErrException {
        ArrayList<ArrayList<String>> listeSyllables = new ArrayList<>();
        String syllable = "";
        int position = 0;

            for (int i = 0; i < texte.length(); i++) {
                if(texte.charAt(i) < 'A' || texte.charAt(i) > 'Z' && texte.charAt(i) < 'a' || texte.charAt(i) > 'z'){
                    if(texte.charAt(i) != 0x0027) {
                        throw new MessageErrException("Mauvais type de caractere.");
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
                        listeSyllables.add(new ArrayList<String>());
                        listeSyllables.get(position).add(syllable);
                        syllable = "";
                        position++;
                        break;
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        if(syllable.isEmpty()){
                            syllable = syllable + texte.charAt(i);
                            listeSyllables.add(new ArrayList<>());
                            listeSyllables.get(position).add(syllable);
                            syllable = "";
                            position++;
                        } else {
                            syllable = syllable + Character.toLowerCase(texte.charAt(i));
                            listeSyllables.add(new ArrayList<>());
                            listeSyllables.get(position).add(syllable);
                            syllable = "";
                            position++;
                        }
                        break;
                    default:
                        if(syllable.isEmpty()){
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
}
