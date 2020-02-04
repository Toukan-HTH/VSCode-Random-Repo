import java.util.*;
import java.time.*;
class BonusMember{
    private final int memberNo;
    private final LocalDate enrolledDate;
    private final Personals personals;
    private int point = 0;
    public BonusMember(int memberNo, Personals personals, LocalDate enrolledDate){
        this.memberNo = memberNo;
        this.enrolledDate=enrolledDate;
        this.personals=personals;
    }

    public int getMemberNo(){
        return memberNo;
    }

    public LocalDate getEnrolledDate(){
        return enrolledDate;
    }

    public int getPoints(){
        return point;
    }

    public void registerPoints(int pointss){
        this.point=point+pointss;
    }

    public Personals getPersonals(){
        return personals;
    }


    public int findQualificationPoints(LocalDate idag){
        int dagerMellom = Period.between(enrolledDate, idag).getDays();
        int monthsMellom = Period.between(enrolledDate, idag).getMonths();
        int yearsMellom = Period.between(enrolledDate, idag).getYears();
        int totalDays = dagerMellom+monthsMellom*31+yearsMellom*365;
        if(totalDays<=365){
            return point;
        }else{
            return 5;
        }
    }


    public boolean okPassword(String password){
        return this.personals.okPassword(password);
    }

}