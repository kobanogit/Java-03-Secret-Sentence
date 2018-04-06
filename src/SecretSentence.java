import javax.swing.*;
import java.awt.*;

public class SecretSentence {

    String word1 = "la lune";
    String word2 = "le soleil";

    // Méthode réunissant les entrée String en un return String
    public String writeSecretSentence(String PARAMETRE_1, String PARAMETRE_2){
        String ret = PARAMETRE_1 + " s'incline devant " + PARAMETRE_2;
        return ret;
    }

    // Méthode affichant un cadre JFrame (utilisée lors du 1ere quête)
    // Contenant un JLabel (afficha texte)
    // du String créé par la méthode writeSecretSentence
    public void showSecretSentence(){

        JFrame jf = new JFrame("Gotcha!");
        jf.setPreferredSize(new Dimension(400, 300));
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);

        String sincline = writeSecretSentence(word1 , word2);

        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.add(new JLabel(sincline, SwingConstants.CENTER));
        jf.pack();
        jf.setVisible(true);
    }
}
