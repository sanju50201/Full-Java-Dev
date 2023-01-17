package textEditor;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor {
    public static void createNewFile(String fileName, String fileContent){
        try{
            FileWriter fw = new FileWriter(fileName);
            fw.write(fileContent);
            fw.close();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("Error while creating the file: "+e.getMessage());
        }
    }

    public static void editFile(String fileName, String fileContent){
        try{
            FileWriter fw = new FileWriter(fileName);
            fw.write(fileContent);
            fw.close();
            System.out.println("File edited successfully.");
        }catch (IOException e){
            System.out.println("Error while editing the file: "+ e.getMessage());
        }
    }

    public static boolean checkFileExist(String filename){
        File file = new File(filename);
        return file.exists();
    }

    public static void printFileContent(String fileName){
        try{
            FileReader fr = new FileReader(fileName);
            int i;
            while((i = fr.read()) != -1){
                System.out.println((char) i);
            }
            fr.close();
        }catch (IOException e){
            System.out.println("Error while reading the file: "+e.getMessage());
        }
    }
}
