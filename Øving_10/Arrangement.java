class Arrangement{
    private long nummer;
    private String sted;
    private String arrangor;
    private String type;
    private long tidspunkt;






    public Arrangement(long nummer, String sted, String arrangor, String type, long tidspunkt){
        this.nummer=nummer;
        this.sted=sted;
        this.arrangor=arrangor;
        this.type=type;
        this.tidspunkt=tidspunkt;
    }





    public long getNummer(){
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



    public long getTidspunkt(){
        return tidspunkt;
    }



}