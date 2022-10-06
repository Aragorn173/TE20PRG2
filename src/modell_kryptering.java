import jdk.nashorn.internal.ir.IfNode;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.toHexString;


class Filereading {

    public static void main(String[] args) throws IOException {
        String message = "";
        int m;
        int k = '(';
        String krypt = "";
        String hex = "";
        String result = new String();

        int key = JOptionPane.showConfirmDialog(null, "vill du skriva din egen nyckel?");
        if (key == 0) {
            k = Integer.parseInt(JOptionPane.showInputDialog("nyckel?"));
        }

        int välj = JOptionPane.showConfirmDialog(null, "vill du läsa från fil");
        if (välj == 0) {
            FileReader file = new FileReader("info.txt");


            BufferedReader bufferedreader = new BufferedReader(file);
            Scanner scanner = new Scanner(bufferedreader);

            while (scanner.hasNextLine()) {
                //System.out.println(scanner.nextLine());
                message = message + scanner.nextLine();
            }
            bufferedreader.close();
            System.out.println(message);
        } else if (välj == 1) {
            message = JOptionPane.showInputDialog("vad vill du kryptera?");
            System.out.println(message);
        }

        for (int i = 0; i < message.length(); i++) {
            m = message.charAt(i);
            hex = toHexString(encrypt(k,m));
            krypt += hex;
        }
        char[] charArray = krypt.toCharArray();
        for(int i = 0; i < charArray.length; i=i+2) {
            String st = ""+charArray[i]+""+charArray[i+1];
            char ch = (char)Integer.parseInt(st, 16);
            result = result + ch;
        }
        System.out.println(krypt);
        System.out.println(result);
    }

    private static int encrypt(int m, int k) {
        int c = m ^ k;
        return c;
    }
}


