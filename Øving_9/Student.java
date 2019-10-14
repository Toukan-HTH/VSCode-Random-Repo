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
        return antOppg;
    }



    public void okAntOppg(int Okning, int tidligerepoeng){
        antOppg=tidligerepoeng+Okning;
        this.antOppg=antOppg;
    }


    public String ToString(){
        String s = (navn + " " + antOppg);
        return s;
    }




}