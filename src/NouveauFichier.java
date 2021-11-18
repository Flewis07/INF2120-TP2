import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Cette classe permet d'écrire un nouveau fichier HTML a partir des éléments du fichier text.
 */
public class NouveauFichier {

    /**
     * Permet d'ecrire un fichier de type html avec le contenu d'un Arraylist de type Arraylist de type String.
     * @param nomFichier nom du fichier qui sera defini pour le nouveau fichier.
     * @param listeSyllables Arraylist contenant les Arraylist qui contient les Strings unicode Japonais a mettre dans
     *                       le nouveau fichier.
     * @return un nouveau fichier HTML de type FileWriter.
     * @throws IOException
     */
    public static FileWriter newFile(String nomFichier, ArrayList<ArrayList<String>> listeSyllables)
            throws IOException {
        nomFichier = nomFichier.replaceAll(".txt", ".html");
        FileWriter nouveauFichier = new FileWriter(nomFichier);
        nouveauFichier.write("<!DOCTYPE html>\n" +
                "<html>\n" +
                " <head>\n" +
                " <title>TP 2</title>\n" +
                " </head>\n" +
                " <body>\n" +
                    " <hr>\n" +
                    " <table>\n" +
                NouveauFichier.blocLignes(listeSyllables) +
                    " </table>\n" +
                    "<hr>\n" +
                    "</body> \n" +
                    "</html>");
        nouveauFichier.close();
        return nouveauFichier;
    }

    /**
     * Permet d'ajouter les caracteres au un String de l'unicode japonais qui sera mis dans le fichier HTML.
     * @param ligne ligne de String auquel seront ajoutes les caracteres '&#'.
     * @return le nouveau String avec les caracteres '&#' au debut.
     */
    private static String ligneString(ArrayList<ArrayList<String>> ligne, int j) {
        String newString = "<tr>";

            for (int i = ligne.size() - 1; i >= 0; i--) {
                try {
                newString = newString + "<td>" + ligne.get(i).get(j) + "</td>";
                } catch (IndexOutOfBoundsException e) {
                    newString = newString + "<td> </td>";
                }
            }
            newString = newString + "</tr>\n";
        return newString;
    }

    /**
     * Permet de mettre les Strings d'unicode d'une ligne dans un bloc de ligne qui sera dans le fichier HTML.
     *
     * @param listeSyllables la liste des syllables en unicode Japonais qui sera mise dans le fichier HTML.
     * @return un String de la ligne qui sera mise dans le fichier HTML.
     */
    private static String blocLignes(ArrayList<ArrayList<String>> listeSyllables) {
        String bloc = "";
        int j = 0;
        int longueurLigne = 0;

        for (int i = 0; i < listeSyllables.size(); i++){
            if(longueurLigne < listeSyllables.get(i).size()){
                longueurLigne = listeSyllables.get(i).size();
            }
        }
            while (j < longueurLigne) {
                try {
                    bloc = bloc + ligneString(listeSyllables, j);
                    j++;
                } catch (IndexOutOfBoundsException e) {
                }
            }
        return bloc;
    }
}


