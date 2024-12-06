package UKL;

public class Mudah3 {
    public static void main(String[] args) {
        System.out.println("<<-------------------->>\n--  -------  -------  --");
        for (int i = 50; i >= 1; i--) {

            System.out.print(i + ". ");
            if (i % 3 == 0) {
                System.out.println("Saya Angkatan 33");
            } else if (i == 1) {
                System.out.println("Saya Senang");
            } else if (i % 2 == 0) {
                System.out.println("Saya Anak Moklet");
            } else {
                System.out.println("Saya Anak Wikusama");
            }
        }
        System.out.println("--  -------  -------  --\n<<-------------------->>");
    }
}