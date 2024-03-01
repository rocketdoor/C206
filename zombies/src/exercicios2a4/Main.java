package exercicios2a4;

public class Main
{
    public static void main(String[] args)
    {
        //exercicios 2 e 3
        Zombie zombie1 = new Zombie();
        Zombie zombie2 = new Zombie();

        zombie1.vida = 500D;
        zombie2.vida = 300D;
        zombie1.mostraVida();
        zombie2.mostraVida();

        zombie1 = zombie2;

        zombie1.vida = 400D;
        zombie1.mostraVida();
        zombie2.mostraVida();

        zombie2.vida = 800D;
        zombie1.mostraVida();
        zombie2.mostraVida();

        // exercicio 4
        Zombie zombie3 = new Zombie();
        Zombie zombie4 = new Zombie();

        zombie3.vida = 500D;
        zombie4.vida = 100D;

        zombie4.transfereVida(zombie3, 50);

        /*
        Zumbi
        ---------------
        + double: vida
        + nome: String
        ---------------
        + mostraVida(): double
        + transfereVida(zumbiAlvo: Zumbi, quantia: double): boolean
         */


    }
}
