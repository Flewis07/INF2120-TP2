import java.util.Scanner;

public class LectureClavier {

    private static final String MESSAGE_ERR_1 = "Mauvais type de fichier.";

        /**
         * Permet de lire une commande au clavier entrée par l'utilisateur.
         */
        public static String lectureClavier() throws MessageErrException {
            String seq = ".txt";

            Scanner clavier = new Scanner(System.in);
            String nom = clavier.nextLine();
            clavier.close();

            if(!nom.endsWith(seq)){
                throw new MessageErrException(MESSAGE_ERR_1);
            }
            return nom;
        }
}
