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



    public void okAntOppg(int Okning){
        this.antOppg+=Okning;
    }


    public String ToString(){
        String s = ("Navn " + navn + " " + "Ant Oppgaver " + antOppg);
        return s;
    }




}