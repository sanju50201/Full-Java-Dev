
package encryptDecrypt;
import encryptDecrypt.FileEncryption.*;

public class Main extends FileEncryption{
    public static void main(String[] args) throws Exception {
        if(args.length != 3){

        System.out.println("Usage: java Main <encrypt/decrypt> <file> <password>");
        System.exit(1);
        }

        String action = args[0];
        String fileName = args[1];
        String password = args[2];

        try{
            if(action.equals("encrypt")){
                FileEncryption.encrypt(fileName,password);
                System.out.println("File encrypted Successfully.");
            }else if (action.equals("decrypt")){
                FileDecryption.decrypt(fileName,password);
                System.out.println("File name decrypted successfully.");
            }else {
                System.out.println("Invalid action specified. Use 'encrypt' or 'decrypt'.");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("An error occurred during the encryption/decryption process.");
        }
    }
}
