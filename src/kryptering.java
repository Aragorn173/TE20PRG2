import javax.swing.*;

public class kryptering {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("vad vill du kryptera?");
        String krypt = "";
        int n = '(';
        String hex = "";

        for (int i = 0; i < input.length(); i++) {
            int a = input.charAt(i);
            System.out.println(hex);
            hex = Integer.toHexString(crypt(a,n));
            krypt += hex;
        }
        System.out.println(krypt);

    }
    static int crypt(int m, int k) {
        int c = m ^ k;
        return c;
    }
}

