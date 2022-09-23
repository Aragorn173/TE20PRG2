import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class modell_kryptering {
    public static void main(String[] args) {
        int c;
        int a = 647766;
        int key = '(';
        c = a ^ key;
        System.out.println(c);
    }

}

class Filereading {

    public static void main(String[] args) throws IOException {
        String message = "";
        int m;
        int k = '(';
        String krypt = "";
        String hex = "";
        String result = new String();


        FileReader file = new FileReader("info.txt");

        BufferedReader bufferedreader = new BufferedReader(file);
        String line = "";
        Scanner scanner = new Scanner(bufferedreader);

        while (scanner.hasNextLine()) {
            //System.out.println(scanner.nextLine());
            message = message + scanner.nextLine();
        }
        bufferedreader.close();
        System.out.println(message);

        for (int i = 0; i < message.length(); i++) {
            m = message.charAt(i);
            hex = Integer.toHexString(encrypt(k,m));
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


