class Oving10_1{
    public static void main(String[] args){
        ArrangementRegister doot = new ArrangementRegister();
        doot.registrerArrangement("111", "by1", "Henrik", "1", "2400");
        doot.registrerArrangement("222", "by1", "Henrik", "1", "2300");
        doot.registrerArrangement("333", "by2", "Henrik", "2", "2200");
        doot.registrerArrangement("334", "by1", "Henrik", "1", "2100");
        doot.registrerArrangement("335", "by1", "Henrik", "1", "2000");
        doot.registrerArrangement("112", "by2", "Henrik", "3", "1900");
        doot.registrerArrangement("113", "by2", "Henrik", "2", "1800");
        doot.registrerArrangement("114", "by1", "Henrik", "1", "1700");
        doot.registrerArrangement("223", "by2", "Henrik", "1", "1600");
        doot.registrerArrangement("225", "by2", "Henrik", "1", "1500");
        doot.registrerArrangement("226", "by1", "Henrik", "1", "1400");

        //doot.finnArangementerVGS("by1");
        doot.sort();

    }
}