package exercicio1;

public class Zombie {
    int vida;
    String nome;
    float altura;
    int forca;

    void iniciar()
    {
        vida = 100;
        nome = "Anna";
        altura = 1.40F;
        forca = 99999;
    }

    void andar()
    {
        System.out.println(nome + " está andando...");
    }

    void seAlimentar()
    {
        System.out.println(nome + " se alimentando...");
    }
}
