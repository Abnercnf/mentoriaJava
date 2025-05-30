package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAndBuffered {

    public static void main(String[] args) {
        long inicio = System.nanoTime();
        String filePath = "c:\\temp\\in.txt";
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            br.lines()
                    .filter(line -> line.matches(String.valueOf(RegexPattern.EMAIL)))
                    .forEach(System.out::println);

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