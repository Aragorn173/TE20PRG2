import javax.swing.*;

public class Kattis_hiss {
    public static void main(String[] args) {
        int x = 0;

        String input = JOptionPane.showInputDialog("input");
        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i) == 's' && input.charAt(i+1) == 's') {
                x = 1;
            } else {
                x = 0;
            }
        }
        if (x==1) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}