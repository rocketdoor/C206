public class Personagem
{
    String nome;
    int pontos;
    Arma arma;
    Arma armaUsada;

    void usarArma()
    {
        this.arma.resistencia -= 2;
    }

    void tomarDano()
    {
        this.pontos -= armaUsada.poder;
    }

    //nao estava na UML, mas achei importante para mostrar os PV
    void mostrarVida()
    {
        System.out.println("A vida atual desse personagem é de: " + this.pontos + " pontos de vida");
    }
}
