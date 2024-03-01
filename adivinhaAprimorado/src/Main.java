import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();
        int numGenerated;
        int numGuessed;
        //    int maximo = 50;

        numGenerated = rand.nextInt(10) + 1;
        //rand.nextInt(LIMITE);

        do
        {
            System.out.println("Qual o numero que estou pensando?");
            numGuessed = entrada.nextInt();

            if (numGuessed != numGenerated)
            {
                System.out.println("Errou");
                if (numGuessed > numGenerated)
                    System.out.println("Meu numero e menor");

                else if (numGuessed < numGenerated)
                    System.out.println("Meu numero e maior");
            }
        } while(numGenerated != numGuessed);

        System.out.println("Parabens voce acertou");

        System.out.println(numGenerated);
    }
}
