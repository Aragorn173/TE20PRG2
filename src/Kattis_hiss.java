import javax.swing.*;

public class Kattis_hiss {
    public static void main(String[] args) {
        int x = 0;
        int z = 0;
        String input = JOptionPane.showInputDialog("input");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 's') {
                z = i;
                i =10000;
            }
        }
        if (z == input.length()){
            x = 0;
        } else if (input.charAt(z) == 's' && input.charAt(z+1) == 's') {
            x = 1;
        }


            /*if (input.charAt(z) == 's' && input.charAt(z+1) == 's') {
                x = 1;
            } else {
                x = 0;
            }*/
            if (x == 1) {
                System.out.println("hiss");
            } else {
                System.out.println("no hiss");
            }
        }
    }