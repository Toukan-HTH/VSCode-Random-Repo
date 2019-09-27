import java.util.Scanner;
import java.util.regex.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
class TekstBehandling{
    String enTekst;
    public TekstBehandling(String enTekst){
        this.enTekst=enTekst;
    }


    public int getAntallOrd(){
        int count=0;
        String[] parts =enTekst.split(" ");
        for(int i=0;i<parts.length;i++){
            count++;
        }
        return count;
}

    public double getGjennomsnittOrdlengde(){
        double count = 0;
        double average = 0;
        double sum = 0;

        String[] parts =enTekst.split("[ .,?!\n?';  ]");
        //ArrayList<String> gfg = new ArrayList<String>(parts); 
        List<String> list = new ArrayList<String>(Arrays.asList(parts));
        list.removeAll(Arrays.asList("", null));

        String[] parts2 = new String[list.size()];
        for(int j = 0; j<list.size();j++){
            parts2[j]=list.get(j);
        }
        for(int i = 0; i<parts2.length;i++){
            double charsum=parts2[i].length();
            sum=charsum+sum;
            count++;
        }
        average=sum/count;
        System.out.println(list);
        return average;
    }

    public double getGjennomsnittOrdLengdeiPeriode(){
        double average=0;
        int count = 0;
        String[] parts =enTekst.split("[.!:?]");
        for(int i = 0; i<parts.length;i++){
            String test = parts[i];
            String[] parts2 =test.split(" ");
            for(int j = 0; j<parts2.length;j++){
                count++;
            }

        }
        average=count/parts.length;
        return average;




    }

    public String getSkifteUtOrd(String gammeltOrd, String nyttOrd){
        String newString = enTekst.replaceAll(gammeltOrd, nyttOrd);
        return newString;
    }
    
    public String getEnTekst(){
        return enTekst;
    }

    public String getEnTekstMedStoreBokstaver(){
        String newString = enTekst.toUpperCase();
        return newString;
    }
}