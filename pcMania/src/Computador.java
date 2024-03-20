public class Computador
{
    String marca;
    float preco;
    HardwareBasico processador = new HardwareBasico();
    HardwareBasico memoriaRAM = new HardwareBasico();
    HardwareBasico memoriaHD = new HardwareBasico();
    SistemaOperacional sistemaOperacional = new SistemaOperacional();
    MemoriaUSB memoriasUSB[] = new MemoriaUSB[50];
    int aux = 0;

    void mostraPCConfigs()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Processador: " + processador.nome + "(" + processador.capacidade + " Mhz)");
        System.out.println(memoriaRAM.capacidade + " GB de RAM disponível");

        if (memoriaHD.capacidade < 1000)
            System.out.print(memoriaHD.capacidade + "GB");
        else if (memoriaHD.capacidade >= 1000)
            System.out.print(memoriaHD.capacidade/1000 + "TB");

        System.out.print(" de HD" + "\n");

        System.out.println("Sistema Operacional " + sistemaOperacional.nome + "(" + sistemaOperacional.tipo + " bits)");

        for (int i = 0; i < memoriasUSB.length; i++)
        {
            if (memoriasUSB[i] != null)
            {
                System.out.print("Acompanha " + memoriasUSB[i].nome + " de ");

                if (memoriasUSB[i].capacidade < 1000)
                    System.out.print(memoriasUSB[i].capacidade + "GB");

                else if (memoriasUSB[i].capacidade >= 1000)
                    System.out.print(memoriasUSB[i].capacidade/1000 + "TB");

            }
        }

    }

    void addMemoriaUSB(MemoriaUSB mUSB)
    {
        memoriasUSB[aux] = mUSB;
        aux++;
    }
}
