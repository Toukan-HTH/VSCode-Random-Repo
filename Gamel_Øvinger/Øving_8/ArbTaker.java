import java.io.*; 
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
class ArbTaker{
    //* attributter personalia //

/*

    //* Variabler fra classen "Person" ///////////
    String etterNavn = person.getEtternavn();    //*
    String forNavn = person.getFornav();         //*
    String fodselsDato = person.getFodselsdato();//*                
    //* / / / / / / / / / / / / / / / / / / /  //* */





    //* Variabler fra Main class /////////////////
    private String arbtakernr;                 //*
    private String ansettelsesYear;            //*
    private double monthlyPay;                 //*
    private double taxPercent;                 //*
    private int antallYearsAnsatt=0;  
    private Person person;
    private double brutto;
    private double skattetrekk;
    private int alder;

    public ArbTaker(Person person,String arbtakernr, String ansettelsesYear, double monthlyPay, double taxPercent){                         //*
        this.arbtakernr=arbtakernr;
        this.ansettelsesYear=ansettelsesYear;
        this.monthlyPay=monthlyPay;
        this.taxPercent=taxPercent;
        this.person=person;

    }





    public void setMonthlyPay(double s){
        this.monthlyPay=s;
    }


    public void setTaxPercent(double t){
        this.taxPercent=t;
    }














    //* Get metode for hvor mye trekkes i skatt hver måned //
    public double getTaxMoney(){
        double returnMoney = monthlyPay*taxPercent;
        return returnMoney;
    }



    //* Get metode for brutto lønn per år //
    public double getBrutto(){
        double returnMoney = monthlyPay*12;
        this.brutto=returnMoney;
       return returnMoney;
    }



    //* Skattetrekk per år //
    public double getSkatteTrekk(){
        double returnMoney = ((monthlyPay*taxPercent)*10)+((monthlyPay*taxPercent)*0.5);
        this.skattetrekk=returnMoney;
        return returnMoney;
    }



    //* Navn på formen etternavn, fornavn //
    public String getNavn(){
        String s = person.getEtternavn() + " " + person.getFornav();
        return s;
    }



    //* Get metode for alder //
    public int getAlder(){
        int age = person.getAlder(); 
        this.alder=age;
        return age;
    }



    //* Get metode for Antall år ansatt i bedriften //
    public int getAnsattAge(){
        GregorianCalendar gc = new GregorianCalendar();
        int year = gc.get(Calendar.YEAR);
        Integer result = Integer.valueOf(ansettelsesYear);
        int alder=year-result;
        this.antallYearsAnsatt=alder;
        return alder;
    }





    //* Get metode om personen har vært ansatt i en gitt antall år (parameter) //
    public String getCompare(int Parameter){

        if(getAnsattAge()<Parameter){
            String s = "Personen har ikke vert ansatt over gitt parameter antall Ar";
            return s;
        }
        else if(getAnsattAge()>Parameter){
            String t = "Personen har vert ansatt over gitt parameter antall Ar";
            return t;
        }else{
            String r = "Personen har vert ansatt like mange Ar som gitt parameter";
            return r;
        }
    }




    public String toString(){
        return(monthlyPay + " " + arbtakernr + " " + brutto + " " + skattetrekk + " " + alder);
    }
}