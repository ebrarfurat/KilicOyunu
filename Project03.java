import java.util.LinkedList;
import java.util.Random;

public class Project03 {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<String> iskambilDestesi = new LinkedList<String>();
        LinkedList<String> oyuncu1 = new LinkedList<String>();
        LinkedList<String> oyuncu2 = new LinkedList<String>();

        String[] tur = {"sinek", "kalp", "karo", "maça"};
        String[] deger = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String t : tur) {
            for (String d : deger) {
                iskambilDestesi.add(d + t);
            }
        }

        int m = random.nextInt(iskambilDestesi.size());
        String secilenKart = iskambilDestesi.get(m);
        System.out.println("Seçilen Kart: " + secilenKart);


        for (int i = 0; i < 26; i++) {
            int n = random.nextInt(iskambilDestesi.size());
            oyuncu1.add(iskambilDestesi.get(n));
            iskambilDestesi.remove(n);

            int a = random.nextInt(iskambilDestesi.size());
            oyuncu2.add(iskambilDestesi.get(a));
            iskambilDestesi.remove(a);
        }

        for (int i = 0; i < 26; i++) {
            String kart1 = oyuncu1.get(i);
            String kart2 = oyuncu2.get(i);

            System.out.println("1. Oyuncu Seçilen Kart: " + kart1);
            System.out.println("2. Oyuncu Seçilen Kart: " + kart2);

            if (kart1.equals(secilenKart)) {
                System.out.println("1. Oyuncu Kazandı.");
                System.out.println("Açılan Kart Sayısı: " + (i + 1) * 2);
                break;
            } else if (kart2.equals(secilenKart)) {
                System.out.println("2. Oyuncu Kazandı.");
                System.out.println("Açılan Kart Sayısı: " + (i + 1) * 2);
                break;
            }
        }
    }
}
