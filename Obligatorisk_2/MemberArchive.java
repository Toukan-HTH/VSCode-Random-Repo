import java.time.LocalDate;

class MemberArchive{
    public static void main(String[] args) throws Exception{
        Personals beep = new Personals("Hafso", "Henrik", "Henrik.t.h@outlook.com", "123456789");
        SilverMember boop = new SilverMember(1123, beep, LocalDate.of(2006, 2, 15));
        System.out.println(boop.getEnrolledDate());
    }
}