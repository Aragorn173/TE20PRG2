import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class kryptering {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("vad vill du kryptera?");
        String crypt = "";
        char n = '(';

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (a == ' '){
                crypt += ' ';
            } else {
                crypt += (char)(a ^ n);
            }
        }
        System.out.println(crypt);

    }
}
