package loop;

public class While {
    public static void main( String[] args ) throws InterruptedException {
        int i = 10;
        while(i >= 0){
            System.out.println(i);
            i--;
            Thread.sleep(1000);

        }
    }
}
