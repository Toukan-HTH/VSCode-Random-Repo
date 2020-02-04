import java.time.LocalDate;
import java.util.*;
class MemberArchive{
    ArrayList<BonusMember> members;

    public MemberArchive() {
        members = new ArrayList<BonusMember>();
    }

    public boolean registerPoints(int membernr, int poeng){
        boolean result = true;
        for(int i =0;i<members.size();i++){
            if(membernr==members.get(i).getMemberNo()){
                members.get(i).registerPoints(poeng);
                result = false;
            }
        }
        if(!result){
            return true;
        }else{
            return false;
        }
    }

    public int newMember(Personals personalstuff, LocalDate enrollmentDate) {
        int membernr = findAvailableNo();
        members.add(new BasicMember(membernr, personalstuff, enrollmentDate));
        return membernr;
    }

    private int findAvailableNo(){
        boolean loop = true;
        int random =0;
        if(loop){
            random = (int)(Math.random() * ((99999-0+1)))+0;
            for(int i =0; i<members.size();i++){
                if(random==members.get(i).getMemberNo()){
                    loop = false;;
                }
            }
            if(!loop){
                loop=true;
            }else{
                loop=false;
            }
        }
        return random;
    }

    public int findPoints(String password, int membernr){
        int result = -1;
        for(int i = 0; i<members.size();i++){
            if(membernr==members.get(i).getMemberNo()){
                if(members.get(i).okPassword(password)){
                    result=members.get(i).getPoints();
                }
            }
        }
        return result;
    }






    public void checkMembers(){
        for(int i = 0; i<members.size();i++){

            if(members.get(i).findQualificationPoints(LocalDate.now())>=25000 && members.get(i).findQualificationPoints(LocalDate.now())<=74999){
                members.set(i, new SilverMember(members.get(i).getMemberNo(), members.get(i).getPersonals(), members.get(i).getEnrolledDate()));
            }

            if(members.get(i).findQualificationPoints(LocalDate.now())>=75000){
                members.set(i, new GoldMember(members.get(i).getMemberNo(), members.get(i).getPersonals(), members.get(i).getEnrolledDate()));
            }
        }









    }



    public static void main(String[] args) throws Exception{
        MemberArchive poop = new MemberArchive();
        Personals beep = new Personals("Hafso", "Henrik", "Henrik.t.h@outlook.com", "123456789");
        //BonusMember boop = new BasicMember(1123, new Personals("Hafso", "Henrik", "Henrik.t.h@outlook.com", "123456789"), LocalDate.of(2002, 5, 5));
        //System.out.println(boop.getEnrolledDate());
        //BonusMember beepdiboop = new GoldMember(1122, beep, LocalDate.of(2012, 2, 21));
        //boop.registerPoints(5000);
        //System.out.println(boop.getPoints());
        //LocalDate boof = LocalDate.of(2003, 5, 5);
        //System.out.println(boop.findQualificationPoints(boof));
        //System.out.println(boop.okPassword("123456789"));
        //ArrayList<BonusMember> members = new ArrayList<BonusMember>();
        //list.add(new BasicMember(11111, new Personals("Tellefsen","Ole","Ole.email@outlook.com","password123"), LocalDate.of(2015, 2, 6)));
        //list.add(new BasicMember(22222, new Personals("Tellefsen","Tove","Tove.email@outlook.com","password1"), LocalDate.of(2005, 3, 7)));
        //list.add(new SilverMember(33333, new Personals("Tellefsen","Tove","Tove.email@outlook.com","password2"), LocalDate.of(2005, 1, 7)));
        //list.add(new GoldMember(44444, new Personals("Tellefsen","Tove","Tove.email@outlook.com","password3"), LocalDate.of(2010, 8, 7)));
        //System.out.println(findPoints("password123", 11111));
        //System.out.println(poop.newMember(beep,LocalDate.of(2015, 2, 6)));
    }
}