import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
class OppgaveOversikt{
    private Student[] studentArray; ; //* tabellen opprettes i konstrukt�ren
    private int antStud =0;    //* �kes med 1 for hver ny student


    public OppgaveOversikt(){
        this.studentArray = new Student[0];
        /*studentArray[0]=new Student("Hanne", 6);
        studentArray[1]=new Student("Arne", 4);
        studentArray[2]=new Student("Geir", 9);*/
        this.antStud=this.studentArray.length;
        
    }

    public String getName(int i){
        return studentArray[i].getName();
    }





    public int getAntStudenter(){
        this.antStud=studentArray.length;
        return antStud;
    }



    public int getStudOppgaverSolved(int s){
        int t = studentArray[s].getAntOppg();
        return t;
    }



    public void registerStudent(String navn, int oppgaver){
     Student[] newStudentArray = new Student[studentArray.length+1];
     for (int i = 0; i<studentArray.length; i++){
         newStudentArray[i]=studentArray[i];
     }


     newStudentArray[newStudentArray.length-1] = new Student(navn, oppgaver);
     this.studentArray=newStudentArray;
    }

    public void increaseTasks(int index, int f){
        int tidligere = studentArray[index].getAntOppg();
        studentArray[index].okAntOppg(f, tidligere);
    }

    public Student[] getArray(){
        return studentArray;
    }


    public String ToString(int t){
        return studentArray[t].ToString();
    }
}