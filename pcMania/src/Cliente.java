public class Cliente
{
    String nome;
    long cpf;
    Computador[] computadores = new Computador[50];
    int i = 0;
    int aux;
    float total = 0;

    float calculaTotalCompra()
    {
        for (aux = 0; aux < computadores.length; aux++)
        {
            if (computadores[aux] != null)
            {
                total = total + computadores[aux].preco;
            }
        }

        return total;
    }
}
