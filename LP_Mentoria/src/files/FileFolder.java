package files;

import java.io.File;

public class FileFolder {

    public static void main(String[] args) throws InterruptedException {
        long inicio = System.nanoTime();

        String strPath = "c:\\temp\\in.txt";
        File path = new File(strPath);

//        boolean newFolder = new File(strPath + "\\subFolder").mkdir();
//        System.out.println("New Folder Created.");

        //EXIBINDO APENAS PASTAS
//        File[] folders = path.listFiles(File::isDirectory);
//        System.out.println("FOLDERS: ");
//        for (File folder : folders){
//            System.out.println(folder);
//        }

//        //EXIBINDO APENAS ARQUIVOS
//        File[] files = path.listFiles(File::isFile);
//        System.out.println("FILES: ");
//        for (File file : files){
//            System.out.println(file);
//        }

        //CAPTURANDO O NOME E A EXTENSÃO
        File[] files = path.listFiles(File::isFile);
        String fileName = path.getName();
        String ext = fileName.substring(fileName.lastIndexOf('.') + 1);
        if (ext == ext){
            System.out.println("Extensão válida");
        }
//        String[] name = fileName.split("\\.");
//        String nam = name[0];
//        String ext = name[1];
        System.out.println(ext);


        long fim = System.nanoTime();
        long duracao = fim - inicio; // em nanossegundos

        System.out.println("Tempo de execução: " + duracao / 1_000_000.0 + " ms");
    }
}
