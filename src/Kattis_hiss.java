import javax.swing.*;

public class Kattis_hiss {
    public static void main(String[] args) {
        int x = 0;

        String input = JOptionPane.showInputDialog("input");
        for (int i=0; i<input.length(); i++) {
         if (input.charAt(i) =='s' && input.charAt(i+1) =='s') {
              x = 0;
         } else {
              x = 1;
         }
        }
        if (x == 0) {
            System.out.println("hiss");
        } else if (x == 1){
            System.out.println("no hiss");
        }
    }
}

