package encryptDecrypt;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDecryption {
    public static void decrypt(String fileName, String password) throws Exception{

//        salt
        byte[] salt = {
                (byte) 0xA9, (byte) 0x9B, (byte) 0xC8, (byte) 0x32,
                (byte) 0x56, (byte) 0x35, (byte) 0xE3, (byte) 0x03
        };

//        Iteration count
        int iterationCount = 19;

//        Create PBE parameter set
        PBEParameterSpec pbeParam = new PBEParameterSpec(salt, iterationCount);

        SecretKey pbKey = SecretKeyFactory.getInstance("PBEWithMD5AndTripleDES").generateSecret(new PBEKeySpec(password.toCharArray()));

//        create PBE cipher

        Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndTripleDES");


//        initialize PBE with key and parameters
        pbeCipher.init(Cipher.DECRYPT_MODE,pbKey,pbeParam);

//        read in encrypted files

        FileInputStream fis = new FileInputStream(fileName);
        byte[] input = new byte[fis.available()];

        fis.read(input);

//        decrypt the file
        byte[] decrypted = pbeCipher.doFinal(input);

//        write out the decrypted file

        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(decrypted);
        fos.close();
    }
}
