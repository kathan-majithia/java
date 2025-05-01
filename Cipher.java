
class Cipher{
    String plaintext;
    int key;

    Cipher(String plaintext, int key){
        this.plaintext = plaintext;
        this.key = key;
    }
    String Encryption(){
        String enc = "";
        for(int i=0;i<plaintext.length();i++){
            char c = plaintext.charAt(i);
            c += key;
            enc += c;
        }
        plaintext = enc;
        return enc;
    }
    public static void main(String... args) {
        Cipher c = new Cipher(args[0], Integer.parseInt(args[1]));

        System.err.println("Encrypted text : " + c.Encryption());
        System.err.println("Decrypted text : " + c.Decryption());
    }
}