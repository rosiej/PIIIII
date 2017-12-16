import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i <5; i++) {
            int r = random.nextInt(15);
            System.out.println(PiExtension.PiRepresentative(r));

        }


    }
}
