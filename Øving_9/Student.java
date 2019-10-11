class Student{


    private String navn;
    private int antOppg;

    public Student(String navn, int antOppg){
        this.navn=navn;
        this.antOppg=antOppg;
    }

    public String getName(){
        return navn;
    }

    public int getAntOppg(){

    }



    public void okAntOppg(int Okning){

    }


    public String ToString(){
        String s = (navn + " " + antOppg);
        return s;
    }




}