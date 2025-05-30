package arrays;

public class Arrays {

    public static void main( String[] args ) throws InterruptedException {

        //Declaring array variable
        int i[] = new int[5];
        //initializing the variable
        i[0] = 3;
        i[1] = 2;
        i[2] = 23;
        i[3] = 32;
        i[4] = 4;

        int a[] = {3,5,8,9,7};

        //find the length of the array
        System.out.println(a.length);

        //read a sigle value
        System.out.println(a[0]);

        //read all the values
        for(int array : a){
            System.out.println("Array: " + array);
        }
    }
}
