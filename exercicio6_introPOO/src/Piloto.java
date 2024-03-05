public class Piloto
{
    String nome;
    boolean vilao;
    Kart kart;

    void soltaSuperPoder()
    {
       if (this.vilao == true)
       {
           System.out.print("O vilão " + this.nome);
       }

       else if (this.vilao == false)
       {
           System.out.print("O personagem " + this.nome);
       }

        System.out.print(" utilizou seu poder!" + "\n");
    }
}
