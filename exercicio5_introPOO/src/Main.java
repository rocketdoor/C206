public class Main {
    public static void main(String[] args)
    {
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();


        personagem1.nome = "David";
        personagem1.pontos = 200;
        personagem2.nome = "Dirty Dan";
        personagem2.pontos = 60;


        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        arma1.nome = "Arma1";
        arma1.poder = 3;
        arma1.resistencia = 800;
        arma1.descricao = "Essa é uma arma confiável e durável, porem com pouco dano";

        arma2.nome = "Arma2";
        arma2.poder = (int)(Math.floor(Math.random() *(25 - 20 + 1) + 20)) ;
        arma2.resistencia = 50;
        arma2.descricao = "Essa é uma arma pouco confiavel e com baixa durabilidade";

        personagem1.arma = arma1;
        personagem2.arma = arma2;

        personagem1.usarArma();
        personagem2.armaUsada = personagem1.arma;
        personagem2.tomarDano();

        personagem2.usarArma();
        personagem1.armaUsada = personagem2.arma;
        personagem1.tomarDano();

        personagem1.mostrarVida();
        personagem1.arma.mostraInfoArma();

        personagem2.mostrarVida();
        personagem2.arma.mostraInfoArma();

    }
}