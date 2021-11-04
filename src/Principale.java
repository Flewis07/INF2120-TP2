import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Principale {

    public static ArrayList c = new ArrayList();
    public static ArrayList d = new ArrayList();



    public static void main (String [] args) throws MessageErrException, IOException {

        //Lire un fichier a partir de la methode main. Le fichier doit etre en .txt sinon un message d'erreur survient.
        String nomFichier = LectureClavier.lectureClavier();
        //Methode qui permet de convertir le contenu du fichier en un string.
        String contenu = LectureFichier.convertirString(nomFichier);
        //Methode qui permet de diviser le contenu du fichier en differentes lignes
        String [] lignes = contenu.split("\n");
        //Methode qui permet de retirer les espaces du fichier.
        lignes = LectureFichier.trimerString(lignes);

        ArrayList<Lettre> hiragana = Hiragana.hiragana();
        ArrayList<Lettre> katagana = Katagana.katagana();

        d = Convertir.convertion(lignes, katagana, hiragana);

        for (int i= 0; i < d.size(); i++) {
            System.out.println(d.get(i));
        }


        FileWriter a1 = NouveauFichier.newFile(nomFichier, d);






    }
}
