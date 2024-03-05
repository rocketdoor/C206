public class Arma
{
    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostraInfoArma()
    {
        System.out.println("O nome dessa arma é: " + this.nome);
        System.out.println("Seu poder é: " + this.poder);
        System.out.println("Sua resistencia atual é de: " + this.resistencia);
        System.out.println(this.descricao);
    }
}
