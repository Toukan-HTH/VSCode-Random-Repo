class test{
    public static void main(String[] args){
        int a = 20;
        int b = 30;
        if(a<b){
            b = 10;
            a = b;
        }
        int p = 20;
        int q = 40;
        if(p==20){
            q=13;
        }else{
            q=17;
        }
        int s = 15;
        int r = 30;
        if(r>s){
            q=100;
        }else{
            s=200;
        }

        System.out.println("a = " + a);
        System.out.println(b);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
    }
}