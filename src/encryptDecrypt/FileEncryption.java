package encryptDecrypt;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileEncryption {

    public static void encrypt(String fileName, String password) throws Exception{

//        Salt
        byte[] salt = {
                (byte) 0xA9, (byte) 0x9B, (byte) 0xC8, (byte) 0x32,
                (byte) 0x56, (byte) 0x35, (byte) 0xE3, (byte) 0x03
        };

//        Iteration count
        int iterationCount = 10;

//        create PBE parameter set

        PBEParameterSpec pbeparamspec = new PBEParameterSpec(salt,iterationCount);

        SecretKey pbKey = SecretKeyFactory.getInstance("PBEWithMD5AndTripleDES").generateSecret(new PBEKeySpec(password.toCharArray()));

//        create a PBE cipher

        Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndTripleDES");

//        initialize PBE Cipher with key and parameters
        pbeCipher.init(Cipher.ENCRYPT_MODE,pbKey,pbeparamspec);

//        read in file

        FileInputStream fis = new FileInputStream(fileName);
        byte[] input = new byte[fis.available()];
        fis.read(input);

//        encrypt the file

        byte[] encrypted = pbeCipher.doFinal(input);

//        write out encrypted file

        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(encrypted);
        fos.close();
    }
}
