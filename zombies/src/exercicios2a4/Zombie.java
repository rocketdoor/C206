package exercicios2a4;

public class Zombie
{
    double vida;
    String nome;

    double mostraVida()
    {
        System.out.println("A vida desse zumbi é: " + vida);
        return vida;
    }

    boolean transfereVida(Zombie zumbiAlvo, double quantia)
    {
        if((vida - quantia) > 0)
        {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            System.out.println(quantia + " de vida foi transferido");
            return true;
        }
        else
        {
            System.out.println("Não há vida o suficiente para transferir");
            return false;
        }
    }
}
