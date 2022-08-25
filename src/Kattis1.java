import javax.swing.*;

public class Kattis1 {
    String input;

    public static void main(String[] args) {
        String text = "h";
        String input = JOptionPane.showInputDialog("input");
        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) == 'e') {
                text += "ee";
            }
        }
        text += 'y';
        System.out.println(text);
    }
}
