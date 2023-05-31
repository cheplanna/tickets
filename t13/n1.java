// import javax.crypto.Cipher;
//import javax.crypto.spec.SecretKeySpec;
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.security.Key;
//
//public class AESEncryption {
//    private static final String ALGORITHM = "AES";
//    private static final String TRANSFORMATION = "AES/ECB/PKCS5Padding";
//
//    public static void main(String[] args) {
//        String inputFile = "input.txt";
//        String encryptedFile = "encrypted.txt";
//        String decryptedFile = "decrypted.txt";
//
//        String key = "ThisIsASecretKey";
//
//        try {
//            encryptFile(inputFile, encryptedFile, key);
//            System.out.println("Файл зашифрован: " + encryptedFile);
//
//            decryptFile(encryptedFile, decryptedFile, key);
//            System.out.println("Файл дешифрован: " + decryptedFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void encryptFile(String inputFile, String encryptedFile, String key) throws IOException {
//        byte[] fileBytes = readBytesFromFile(inputFile);
//        byte[] encryptedBytes = processBytes(fileBytes, key, Cipher.ENCRYPT_MODE);
//        writeBytesToFile(encryptedFile, encryptedBytes);
//    }
//
//    public static void decryptFile(String inputFile, String decryptedFile, String key) throws IOException {
//        byte[] encryptedBytes = readBytesFromFile(inputFile);
//        byte[] decryptedBytes = processBytes(encryptedBytes, key, Cipher.DECRYPT_MODE);
//        writeBytesToFile(decryptedFile, decryptedBytes);
//    }
//
//    private static byte[] processBytes(byte[] inputBytes, String key, int mode) {
//        try {
//            Key secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
//            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
//            cipher.init(mode, secretKey);
//
//            return cipher.doFinal(inputBytes);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    private static byte[] readBytesFromFile(String filename) throws IOException {
//        Path path = Paths.get(filename);
//        return Files.readAllBytes(path);
//    }
//
//    private static void writeBytesToFile(String filename, byte[] bytes) throws IOException {
//        try (FileOutputStream fos = new FileOutputStream(filename)) {
//            fos.write(bytes);
//        }
//    }
//}
//В этой программе:
//
//Указываются имена файлов входного файла (inputFile), зашифрованного файла (encryptedFile) и дешифрованного файла (decryptedFile).
//Указывается ключ (key) для шифрования и дешифрования. Ключ должен быть 16-байтовым (128 бит).
//В методе encryptFile считываются байты из входного файла, а затем вызывается метод processBytes для шифрования байтов и получения зашифрованных байтов.
//Зашифрованные байты записываются в выходной файл с помощью метода writeBytesToFile.
//В методе decryptFile происходит аналогичный процесс, но на этот раз выполняется дешифрование.
//Метод processBytes инициализирует Cipher с указанным ключом и режимом (шифрование или дешифрование). Затем вызывается doFinal для обработки байтов.
//Методы readBytesFromFile и writeBytesToFile используются для чтения и записи байтов из/в файлы.
//Примечание:
//Для работы данного кода необходимо, чтобы в вашем проекте была настроена правильная конфигурация политики шифрования. Вы можете использовать Unlimited Strength Jurisdiction Policy Files для вашей версии JDK, чтобы обеспечить поддержку AES-128.