package textEditor;


import java.util.Scanner;

public class Main extends TextEditor{
    public static void main(String[] args) {
        Scanner scan  =new Scanner(System.in);
        String fileName, fileContent  = "";
        boolean isFileExist = false;
        while(true){
            System.out.println("1. Create a new file");
            System.out.println("2. Edit an existing file.");
            System.out.println("3. Exit.");
            System.out.println("4. Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine(); // to consume the newline character after reading the int value

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the file name: ");
                    fileName = scan.nextLine();
                    System.out.println("Enter the file content: ");
                    fileContent = scan.nextLine();
                    createNewFile(fileName, fileContent);
                }
                case 2 -> {
                    System.out.println("Enter the file name: ");
                    fileName = scan.nextLine();
                    isFileExist = checkFileExist(fileName);
                    if (isFileExist) {
                        System.out.println("File content: ");
                        printFileContent(fileName);
                        System.out.println("Enter the new content: ");
                        fileContent = scan.nextLine();
                        editFile(fileName, fileContent);
                    } else {
                        System.out.println("File does not exist.");
                    }
                }
                case 3 -> {
                    System.out.println("Exiting the editor...");
                    System.out.println(0);
                    break;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
