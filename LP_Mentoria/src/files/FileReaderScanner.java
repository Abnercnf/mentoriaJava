package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderScanner {

    public static void main(String[] args) throws InterruptedException {

        String filePath = "c:\\temp\\in.txt";
        File txtFile = new File(filePath);

        Scanner sc = null;

        try {
            sc = new Scanner(txtFile);
            while (sc.hasNextLine()){
                    System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            e.getStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            if(sc != null) {
                sc.close();
            }
        }
    }
}
