package exercicio1;

public class Main
{
    public static void main(String[] args)
    {
        Zombie zombie = new Zombie();
        zombie.forca = 100;
        zombie.vida = 200;
        zombie.altura = 1.50f;
        zombie.nome = "Chris";

        Zombie zombie2 = new Zombie();
        zombie2.nome = "Lara";

        System.out.println("O nome do zumbi é: " +zombie.nome);
        System.out.println("O nome do zumbi é: " +zombie2.nome);

        zombie.andar();
        zombie.seAlimentar();
        zombie.iniciar();
        System.out.println("O nome do zumbi é: " +zombie.nome);

    }
}
