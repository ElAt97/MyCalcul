import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
       Dop dop=new Dop();
        String w = scanner.nextLine();//вычитывания слов с консоли
        String[] words = new String[2]; //  Между вводными данными должен быть отступ
        try {
            words = w.split(" ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Между вводными даннми должен быть отступ ");
        }
        Kurs kurs = new Kurs();
        Man man = new Man();

        if (kurs.chack(words[0]) == true) {
            if (kurs.chack(words[2]) == true) {
                String k = (words[0]);
                String s = words[1];
                String c = (words[2]);
                Pro pro = new Pro();
                pro.Pro(k, c, s);
            }
        } else {

            System.out.println(dop.z[man.Nan(words[0], words[2], words[1])-2]);





        }


    }
}


