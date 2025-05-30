package string;

public class Reverse {

    public static void main(String[] args) throws InterruptedException {

        //Approach1
        String s = "welcome";
        String r = "";

        for(int i = s.length()-1; i>=0; i--){
            r += s.charAt(i);
        }
        System.out.println("Approach1: " + r);

        //Approach2
        String s2 = "welcome";
        String r2 = "";

        char a[]= s2.toCharArray();

        for(int i = s2.length()-1; i>=0; i--){
            r2 += a[i];
        }
        System.out.println("Approach2: " + r2);

        //Approach3
        StringBuffer sb = new StringBuffer("welcome");
        System.out.println("Approach3: " + sb.reverse());


        //Approach4
        StringBuilder sbd = new StringBuilder("welcome");
        System.out.println("Approach3: " + sbd.reverse());


    }
}
