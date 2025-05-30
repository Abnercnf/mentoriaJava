package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBuffered {

    public static void main(String[] args) {
        long inicio = System.nanoTime();


        String filePath = "c:\\temp\\out.txt";
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        String[] lines =  new String[] {"Gmnoring", "Gevening", "Gnight"};


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

//        for (int i = 0; i < 1_000_000; i++) {
//            Math.sqrt(i);
//        }

        long fim = System.nanoTime();
        long duracao = fim - inicio; // em nanossegundos

        System.out.println("Tempo de execução: " + duracao / 1_000_000.0 + " ms");
    }
}