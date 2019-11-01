class Oving10_1{
    public static void main(String[] args){
        ArrangementRegister doot = new ArrangementRegister();
        doot.registrerArrangement("111345", "by1", "Henrik", "fest", "201911301800");
        doot.registrerArrangement("222234", "by1", "Geir", "ikke fest", "201909301700");
        doot.registrerArrangement("333253", "by2", "Henrik", "ikke fest", "201908301300");
        doot.registrerArrangement("334123", "by1", "Henrik", "fest", "201905301100");
        doot.registrerArrangement("335764", "by1", "Henrik", "fest", "201907251800");
        doot.registrerArrangement("112345", "by2", "Geir", "ikke fest", "201906191700");
        doot.registrerArrangement("113223", "by2", "Henrik", "ikke fest", "201902011900");
        doot.registrerArrangement("115674", "by1", "Geir", "ikke fest", "201910291500");
        doot.registrerArrangement("245623", "by2", "Geir", "fest", "201910281300");
        doot.registrerArrangement("225234", "by2", "Henrik", "fest", "201904031500");
        doot.registrerArrangement("226456", "by1", "Geir", "fest", "201904021600");

        //doot.finnArangementerVGS("by1");
        doot.sort2();
        System.out.println("");
        doot.sort();
    }
}