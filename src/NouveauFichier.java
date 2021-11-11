import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class NouveauFichier {

    /**
     * Permet d'ecrire un fichier de type html avec le contenu d'un Arraylist de type Arraylist de type String.
     * @param nomFichier nom du fichier qui sera defini pour le nouveau fichier.
     * @param d Arraylist contenant les Arraylist qui contient les Strings unicode Japonais a mettre dans le nouveau
     *          fichier.
     * @return un noveau fichier HTML de type FileWriter.
     * @throws IOException
     */
    public static FileWriter newFile(String nomFichier, ArrayList<ArrayList<String>> d) throws IOException {
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
                NouveauFichier.blocLignes(d) +
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
    public static String ligneString(ArrayList<ArrayList<String>> ligne, int j) {
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
     * @param d La ligne de String unicode qui sera mise dans le fichier HTML.
     * @return un String de la ligne qui sera mise dans le fichier HTML.
     */
    public static String blocLignes(ArrayList<ArrayList<String>> d) {
        String bloc = "";
        int j = 0;
        int longueurLigne = 0;

        for (int i = 0; i < d.size(); i++){
            if(longueurLigne < d.get(i).size()){
                longueurLigne = d.get(i).size();
            }
        }
            while (j < longueurLigne) {
                try {
                    bloc = bloc + ligneString(d, j);
                    j++;
                } catch (IndexOutOfBoundsException e) {
                }
            }
        return bloc;
    }
}


