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

    public Personals getPersonals(){
        return personals;
    }

}