import java.util.*;
import java.util.ArrayList;
class OppgaveOversikt{
    //private Student studenter; //* tabellen opprettes i konstrukt�ren
    private int antStud =0;    //* �kes med 1 for hver ny student


    public OppgaveOversikt(){
        Student[] studentArray = new Student[7];
        studentArray[0] = new Student("test", 5);
        System.out.println(studentArray[0].getName());
    }


}