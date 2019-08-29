import static javax.swing.JOptionPane.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Valuta{
    public static void main(String[] args){
        //* Valuta Conversion Table //
        double dollar=9.00;
        double euro=9.992;
        double sek=0.930;
        //* Valuta Conversion Table //
        String[] options = {"Dollar", "Euro", "SEK", "Avslutt"};
        int svar = JOptionPane.showOptionDialog(null, "Velg valuta som skal konverteres", "Click a Button", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if(svar==0){
            double test = 0;
            do{
                JFrame frame = new JFrame("InputDialog Example #1");
                String kroner =JOptionPane.showInputDialog(frame, "Hvor mange Kroner vil du konverter?");
                try{
                    test = Double.parseDouble(kroner);
                }catch (NumberFormatException nfe){
                    JFrame frames = new JFrame("InputDialog Example #2");
                    JOptionPane.showMessageDialog(frames, "Dette er ikke et nummber");
            }
            }while(test==0);
            double resultat;
            resultat=test/dollar;
            JFrame frames = new JFrame("InputDialog Example #2");
            JOptionPane.showMessageDialog(frames, "Dette Blir tilregnet til : " + resultat + " Dollar");
            System.exit(1);
        }else if(svar==1){
            double test = 0;
            do{
                JFrame frame = new JFrame("InputDialog Example #1");
                String kroner =JOptionPane.showInputDialog(frame, "Hvor mange Kroner vil du konverter?");
                try{
                    test = Double.parseDouble(kroner);
                }catch (NumberFormatException nfe){
                    JFrame frames = new JFrame("InputDialog Example #2");
                    JOptionPane.showMessageDialog(frames, "Dette er ikke et nummber");
            }
            }while(test==0);
            double resultat;
            resultat=test/euro;
            JFrame frames = new JFrame("InputDialog Example #2");
            JOptionPane.showMessageDialog(frames, "Dette Blir tilregnet til : " + resultat + " Euro");
            System.exit(1);
        }else if(svar==2){
            double test = 0;
            do{
                JFrame frame = new JFrame("InputDialog Example #1");
                String kroner =JOptionPane.showInputDialog(frame, "Hvor mange Kroner vil du konverter?");
                try{
                    test = Double.parseDouble(kroner);
                }catch (NumberFormatException nfe){
                    JFrame frames = new JFrame("InputDialog Example #2");
                    JOptionPane.showMessageDialog(frames, "Dette er ikke et nummber");
            }
            }while(test==0);
            double resultat;
            resultat=test/sek;
            JFrame frames = new JFrame("InputDialog Example #2");
            JOptionPane.showMessageDialog(frames, "Dette Blir tilregnet til : " + resultat + " SEK");
            System.exit(1);
        }else if(svar==3){
            System.exit(1);
        }
    }
}