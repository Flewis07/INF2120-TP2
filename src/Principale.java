import java.io.IOException;
import java.util.ArrayList;

public class Principale {

    public static ArrayList<ArrayList<String>> listeSyllables = new ArrayList();

    /**
     * Methode main du programme.
     * @param args
     * @throws MessageErrException un message d'erreur apparait si l'entree n'est pas valide.
     * @throws IOException
     */
    public static void main (String [] args) throws MessageErrException, IOException {

        String nomFichier = LectureClavier.lectureClavier();

        String contenuFichier = LectureFichier.convertirString(nomFichier);

        String [] tableauLignes = contenuFichier.split("\n");
        tableauLignes = LectureFichier.trimerString(tableauLignes);

        ArrayList<Lettre> hiragana = ListeHiragana.hiragana();
        ArrayList<Lettre> katagana = ListeKatagana.katagana();

        listeSyllables = ConvertirSyllable.convertion(tableauLignes, katagana, hiragana);

        NouveauFichier.newFile(nomFichier, listeSyllables);
    }
}
