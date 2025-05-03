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

class Substitution_Cipher extends Cipher {
    String ori = "abcdefghijklmnopqrstuvwxyz";
    String cip = "qazwsxedcrfvtgbyhnujmikolp";

    Substitution_Cipher(String p, int k) {
        super(p, k);
    }

    String Encryption() {
        String ans = "";
        for (int i = 0; i < plainText.length(); i++)
            ans += cip.charAt(ori.indexOf(plainText.charAt(i)));
        plainText = ans;
        return ans;
    }

    String Decryption() {
        String ans = "";
        for (int i = 0; i < plainText.length(); i++)
            ans += ori.charAt(cip.indexOf(plainText.charAt(i)));
        plainText = ans;
        return ans;
    }
}

class Caeser_Cipher extends Cipher {

    Caeser_Cipher(String p, int k) {
        super(p, k);
    }

    String Encryption() {
        String enc = "";
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            c += key;
            enc += c;
        }
        plainText = enc;
        return enc;
    }

    String Decryption() {
        String dec = "";
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            c -= key;
            dec += c;
        }
        plainText = dec;
        return dec;
    }
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