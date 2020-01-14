import java.util.Comparator;

public class SorteringEtterTid implements Comparator<Arrangement>{
    public int compare(Arrangement sort1, Arrangement sort2){
        return sort1.getTidspunkt().compareTo(sort2.getTidspunkt());
    }
}