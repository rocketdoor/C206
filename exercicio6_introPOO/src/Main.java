public class Main {
    public static void main(String[] args)
    {
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();
        Piloto piloto3 = new Piloto();

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        piloto1.kart = kart1;
        piloto2.kart = kart2;

        piloto1.nome = "Vanellope";
        piloto1.vilao = false;
        piloto1.kart.nome = "Candy Kart";
        piloto1.kart.motor.velocidadeMaxima = 120;
        piloto1.kart.motor.cilindradas = "50";

        piloto2.nome = "King Candy";
        piloto2.vilao = true;
        piloto2.kart.nome = "Royal Racer";
        piloto2.kart.motor.velocidadeMaxima = 150;
        piloto2.kart.motor.cilindradas = "150";

        piloto3.nome = "Crumbellina";
        piloto3.vilao = false;

        piloto1.soltaSuperPoder();
        piloto1.kart.soltarTurbo();
        piloto1.kart.fazerDrift();
        piloto1.kart.pular();
        piloto1.kart.mostraInfo();

        System.out.println("\n");

        piloto2.soltaSuperPoder();
        piloto2.kart.soltarTurbo();
        piloto2.kart.fazerDrift();
        piloto2.kart.pular();
        piloto2.kart.mostraInfo();

    }
}