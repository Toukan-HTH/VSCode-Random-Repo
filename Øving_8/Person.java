import java.io.*; 
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


class Person{
    private String fornavn;
    private String etternavn;
    private String birthYear;


    public Person(String Fornavnny, String etternavnny, String Fodselsdatony){
        this.fornavn=Fornavnny;
        this.etternavn=etternavnny;
        this.birthYear=Fodselsdatony;
    }


    public String getFornav(){
        return fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public String getFodselsdato(){
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

    public void setFodselsor(String nyAAr){
        this.birthYear=nyAAr;
    }
}