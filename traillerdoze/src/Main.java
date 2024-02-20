public class Main
{
    public static void main(String[] args)
    {
        int lanche1 = 10;
        int lanche2 = 4;
        int lanche3 = 2;
        int soma;
        float media;

        soma = lanche1 + lanche2 + lanche3;

        media = soma/3.0f;

        //para fazer operações com float, precisa colocar o numero com f no final
        //tipo 3.0f

        System.out.println("O numero de lanches foi: "+soma);
        System.out.println("A media de lanches por hora foi: "+media);

        //para fazer saida de dados no Java, usar sout + tab
    }
}