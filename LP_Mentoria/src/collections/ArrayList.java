package collections;

import java.util.List;

public class ArrayList {
    public static void main( String[] args ) throws InterruptedException {

//        ArrayList myAl = new ArrayList();
//        List myLi = new ArrayList();
        List<String> myList = new java.util.ArrayList<>();
//        ArrayList <String>myList = new ArrayList<String>();

        myList.add("Abner");

        String name = myList.get(0);
        System.out.println(name);

    }
}
