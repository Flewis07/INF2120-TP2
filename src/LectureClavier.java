import java.util.Scanner;

/**
 * Cette classe permet de lire un fichier en entrée au clavier.
 */
public class LectureClavier {

    private static final String MSG_ERR_1 = "Mauvais type de fichier.";

        /**
         * Permet de lire une commande au clavier entrée par l'utilisateur.
         *
         * @return le nom du fichier sous forme de String.
         * @throws MessageErrException si le nom du fichier ne termine pas par '.txt'.
         */
        public static String lectureClavier() throws MessageErrException {
            String seq = ".txt";

            Scanner clavier = new Scanner(System.in);
            String nom = clavier.nextLine();
            clavier.close();

            if(!nom.endsWith(seq)){
                throw new MessageErrException(MSG_ERR_1);
            }
            return nom;
        }
}
