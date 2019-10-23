import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
class Oving_9{  
    public static void main(String[] args){
        OppgaveOversikt stud = new OppgaveOversikt();






        int s = 0;
        while(s==0){
            Object[] options = {"Finn Ant Stud Registrert", "Finn Ant Oppg til Bestemt Stud", "Registrer ny student", "Increase tasks for certain student", "Exit", "To String"}; 
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            int response = JOptionPane.showOptionDialog(null, "What do you want to do?", "Title",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
            if(response==0){
                JOptionPane.showMessageDialog(frame, stud.getAntStudenter() + " Studenter");

            }

            if(response==1){
                Student[] getlenght = stud.getArray();
                String[] newOptions = new String[getlenght.length];
                for(int i=0; i<newOptions.length;i++){
                    newOptions[i]=stud.getName(i);
                }
                int response2 = JOptionPane.showOptionDialog(null, "Hvilken Student?", "Title",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, newOptions, newOptions[0]);
                JOptionPane.showMessageDialog(frame, stud.getStudOppgaverSolved(response2));
            }


            if(response==2){
                String navn = JOptionPane.showInputDialog(frame, "Ny Student Navn");
                String oppgaver = JOptionPane.showInputDialog(frame, "Hvor mange oppgaver har denne studenten gjort?");
                int oppgaverr = Integer.parseInt(oppgaver);
                stud.registerStudent(navn, oppgaverr);
            }








            if(response==3){
                Student[] getlenght = stud.getArray();
                String[] newOptions = new String[getlenght.length];
                for(int i=0; i<newOptions.length;i++){
                    newOptions[i]=stud.getName(i);
                }
                int response2 = JOptionPane.showOptionDialog(null, "Hvilken Student?", "Title",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, newOptions, newOptions[0]);
                String Okning = JOptionPane.showInputDialog(frame, "Ok oppgaver med hva?");
                int p = Integer.parseInt(Okning);
                stud.increaseTasks(response2, p);




            }
            if(response==4){
                s++;
            }

            if(response==5){
                for(int i =0; i<stud.getArray().length;i++){
                    System.out.println(stud.ToString(i));
                }
            }
        }
        System.exit(1);

    }


}