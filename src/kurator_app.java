import java.util.Scanner;

public class kurator_app {
    public static void main(String[] args) {
        int respons = -1;
         int tid = (int) (Math.random() * 5 +5 );
        String a = "Therapist: Ingen chans!";
        String b = "Therapist: Jag bryr mig inte";
        String c = "Therapist: Tack gode gud";
        String d = "Therapist: Är du säker?";
        String e = "Therapist: Nääääää!";
        String f = "Therapist: 💀";
        String g = "Therapist: Tänk dig!";
        String h = "Therapist: Nej!";
        String j = "Therapist: Ja!";
        String k = "Therapist: Gå härifrån, försvinn!";
        String l = "Therapist: Usch!";
        String m = "Therapist: är du dum eller?";
        String n = "Agel: Japaneser!";
        String o = "Föräldrar: Vi älskar dig inte";
        String p = "Therapist: Skynda på jag slutar snart";
        String q = "Therapist: jaha";







        for (int i = 0; i < tid; i++) {
            if (respons == -1) {
                System.out.println("Therapist: Vad vill du prata om?");
            } else if (respons == 0){
                System.out.println(a);
            } else if (respons == 1){
                System.out.println(b);
            } else if (respons == 2){
                System.out.println(c);
            } else if (respons == 3){
                System.out.println(d);
            } else if (respons == 4){
                System.out.println(e);
            } else if (respons == 5){
                System.out.println(f);
            } else if (respons == 6){
                System.out.println(g);
            } else if (respons == 7){
                System.out.println(h);
            } else if (respons == 8){
                System.out.println(j);
            } else if (respons == 9){
                System.out.println(k);
            } else if (respons == 10){
                System.out.println(l);
            } else if (respons == 11){
                System.out.println(m);
            } else if (respons == 12){
                System.out.println(n);
            } else if (respons == 13){
                System.out.println(o);
            } else if (respons == 14){
                System.out.println(p);
            }  else if (respons == 15){
                System.out.println(q);
            }
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            respons = (int) (Math.random() * 15);

        }
        System.out.println("Therapisten gick iväg");
    }
}
