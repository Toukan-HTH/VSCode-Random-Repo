
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
class Oving_7_1{
    public static void main(String[] args){
        String text = "øDette er en eksempeltekst!";
        char remove = 'e';


        NyString test = new NyString(text);
        String one = test.getNyString();
        String two = test.getFjernTegn(remove);  //* Fjerner variabel fra text
        String three = test.getText(); //* Henter teksten ut

        System.out.println(one + "\n" + two + "\n" + three);
        System.exit(1);
        //JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        //JOptionPane.showMessageDialog(frame, three);

    }
}