
class Arrangement implements Comparable<Arrangement>{
    private String nummer;
    private String sted;
    private String arrangor;
    private String type;
    private String tidspunkt;


    public Arrangement(String nummer, String sted, String arrangor, String type, String tidspunkt){
        this.nummer=nummer;
        this.sted=sted;
        this.arrangor=arrangor;
        this.type=type;
        this.tidspunkt=tidspunkt;
    }





    public String getNummer(){
        return nummer;
    }



    public String getSted(){
        return sted;
    }



    public String getArrangor(){
        return arrangor;
    }



    public String getType(){
        return type;
    }



    public String getTidspunkt(){
        return tidspunkt;
    }




    public String tostring(){
        return getTidspunkt() + " " + getType() + " " + getSted() + " " + getArrangor() + " " + getNummer();
    }

    public int compareTo(Arrangement tidspunkt1){
        int result;
        if(this.sted.equals(((Arrangement)tidspunkt1).sted)){
            result=this.type.compareTo(tidspunkt1.getType());
        }
        else{
            result=this.sted.compareTo(tidspunkt1.getSted());
        }
        return result;
    }
}