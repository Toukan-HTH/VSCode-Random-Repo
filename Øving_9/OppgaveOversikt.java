import java.util.*;
import java.util.ArrayList;
class OppgaveOversikt{
    private Student[] studentArray; ; //* tabellen opprettes i konstruktøren
    private int antStud =0;    //* økes med 1 for hver ny student


    public OppgaveOversikt(){
        Student[] studentArray = new Student[3];
        studentArray[0]=new Student("Hanne", 6);
        studentArray[1]=new Student("Arne", 4);
        studentArray[2]=new Student("Geir", 9);
        this.studentArray=studentArray;
    }

    public String getName(int i){
        return studentArray[i].getName();
    }


}