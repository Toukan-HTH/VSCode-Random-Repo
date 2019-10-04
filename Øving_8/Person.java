import java.io.*; 
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


class Person{
    private String fornavn;
    private String etternavn;
    private String birthYear;


    public Person(String Fornavnny, String etternavnny, String Fødselsdatony){
        this.fornavn=Fornavnny;
        this.etternavn=etternavnny;
        this.birthYear=Fødselsdatony;
    }


    public String getFornav(){
        return fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public String getFødselsdato(){
        return birthYear;
    }

    public int getAlder(){
        GregorianCalendar gc = new GregorianCalendar();
        int year = gc.get(Calendar.YEAR);
        Integer result = Integer.valueOf(birthYear);
        int alder=year-result;
        return alder;
    }

    public void setFornavn(String nyFornavn){
        this.fornavn=nyFornavn;
    }

    public void setEtternavn(String nyEtternavn){
        this.etternavn=nyEtternavn;
    }

    public void setFødselsår(String nyAAr){
        this.birthYear=nyAAr;
    }
}