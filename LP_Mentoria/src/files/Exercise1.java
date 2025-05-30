package files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        long inicio = System.nanoTime();

        List<Product> list = new ArrayList<>();
        String filePath = "c:\\temp\\";
        File path = new File(filePath);
        String srcFile = "stock.csv";
        String dstFolder = filePath + "out\\";
        String dstFile = dstFolder + "summary.csv";
        String desc = "";
        Double price, stockAmount = 0.00;
        Integer qtty = 0;

        File outFolder = new File(dstFolder);
        if(!outFolder.exists()){
            outFolder.mkdir();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filePath+srcFile))){
            String line = br.readLine();

            while(line != null){
                String[] prodLine = line.split("\\,");
                desc = prodLine[0];
                price = Double.parseDouble(prodLine[1]);
                qtty = Integer.parseInt(prodLine[2]);
                stockAmount = price*qtty;
                line = br.readLine();

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(dstFile,true))){
                    bw.newLine();
                    bw.write("Produto: "+desc + "; " + "Montante Total: "+ stockAmount);
                }
            }
            System.out.println("Arquivo " + dstFile + " atualizado com sucesso.");

        } catch (IOException e) {
            e.printStackTrace();
        }




        long fim = System.nanoTime();
        long duracao = fim - inicio; // em nanossegundos

        System.out.println("Tempo de execução: " + duracao / 1_000_000.0 + " ms");
    }
}