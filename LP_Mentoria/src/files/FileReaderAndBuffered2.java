package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderAndBuffered2 {

    public static void main(String[] args) {
        long inicio = System.nanoTime();

        String filePath = "c:\\temp\\in.txt";
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))){

            String line = br.readLine();
            while(line != null){
                if(RegexPattern.EMAIL.matches(line)) {
                    System.out.println(line);
                }
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < 1_000_000; i++) {
            Math.sqrt(i);
        }

        long fim = System.nanoTime();
        long duracao = fim - inicio; // em nanossegundos

        System.out.println("Tempo de execução: " + duracao / 1_000_000.0 + " ms");
    }
}