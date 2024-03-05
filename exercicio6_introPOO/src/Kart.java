public class Kart
{
    String nome;
    Motor motor;

    public Kart()
    {
        motor =  new Motor();
    }

    void pular() {
        System.out.print("O kart pulou ");

        switch (this.motor.cilindradas)
        {
        case "50":
        System.out.print("2");
        break;

        case "100":
        System.out.print("3");
        break;

        case "150":
        System.out.print("4");
        break;
        }
        System.out.print(" metros" + "\n");
    }


    void soltarTurbo()
    {
        System.out.print("O kart chegou a " + this.motor.velocidadeMaxima +" km/h!" + "\n");
    }

    void fazerDrift()
    {
        System.out.println("skrtttttttttt");
    }

    void mostraInfo()
    {
        System.out.println("O nome do kart é: " + this.nome);
        System.out.println("Esse motor é de " + this.motor.cilindradas + " cilindradas");
        System.out.println("Chegando a " + this.motor.velocidadeMaxima + " km/h");
    }}
