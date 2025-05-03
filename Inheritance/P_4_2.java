abstract class Cipher {
    String plainText;
    int key;

    Cipher() {
    }

    Cipher(String plainText, int key) {
        this.plainText = plainText;
        this.key = key;
    }

    abstract String Encryption();

    abstract String Decryption();
}

public class P_4_2 {
    public static void main(String... args) {
        Substitution_Cipher sc = new Substitution_Cipher("kathan", 0);
        Caeser_Cipher cc = new Caeser_Cipher("kathan", 3);

        System.out.println("Plaintext : " + sc.plainText);
        System.out.println("Substituted encryption : " + sc.Encryption());
        System.out.println("Substituted decryption : " + sc.Decryption());
        System.out.println("Caeser encryption : " + cc.Encryption());
        System.out.println("Caeser decryption : " + cc.Decryption());
    }
}