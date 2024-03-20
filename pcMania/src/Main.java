import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int i;
        int escolha;
        int nComputadores = 0;

        Scanner escolhido = new Scanner(System.in);

        Cliente cliente = new Cliente();

        Computador promocao1 = new Computador();
        Computador promocao2 = new Computador();
        Computador promocao3 = new Computador();
        MemoriaUSB mUSB1 = new MemoriaUSB();
        MemoriaUSB mUSB2 = new MemoriaUSB();
        MemoriaUSB mUSB3 = new MemoriaUSB();

        promocao1.marca = "Positivo";
        promocao1.preco = 3300;
        promocao1.processador.nome = "Pentium Core i3";
        promocao1.processador.capacidade = 2200;
        promocao1.memoriaRAM.capacidade = 8;
        promocao1.memoriaHD.capacidade = 500;
        promocao1.sistemaOperacional.nome = "Linux Ubuntu";
        promocao1.sistemaOperacional.tipo = 32;
        mUSB1.nome = "Pen-drive";
        mUSB1.capacidade = 16;
        promocao1.addMemoriaUSB(mUSB1);

        promocao2.marca = "Acer";
        promocao2.preco = 8800;
        promocao2.processador.nome = "Pentium Core i5";
        promocao2.processador.capacidade = 3370;
        promocao2.memoriaRAM.capacidade = 16;
        promocao2.memoriaHD.capacidade = 1000;
        promocao2.sistemaOperacional.nome = "Windows 8";
        promocao2.sistemaOperacional.tipo = 64;
        mUSB2.nome = "Pen-drive";
        mUSB2.capacidade = 32;
        promocao2.addMemoriaUSB(mUSB2);

        promocao3.marca = "Vaio";
        promocao3.preco = 4800;
        promocao3.processador.nome = "Pentium Core i7";
        promocao3.processador.capacidade = 4500;
        promocao3.memoriaRAM.capacidade = 32;
        promocao3.memoriaHD.capacidade = 2000;
        promocao3.sistemaOperacional.nome = "Windows 10";
        promocao3.sistemaOperacional.tipo = 64;
        mUSB3.nome = "HD Externo";
        mUSB3.capacidade = 1000;
        promocao3.addMemoriaUSB(mUSB3);

        System.out.println("Boas-vindas à PC Mania!!");
        System.out.println("Estamos com três promoções de computadores!");
        System.out.println("Promoção 1");
        promocao1.mostraPCConfigs();
        System.out.println(" ");
        System.out.println("Promoção 2");
        promocao2.mostraPCConfigs();
        System.out.println(" ");
        System.out.println("Promoção 3");
        promocao3.mostraPCConfigs();
        System.out.println(" ");

        System.out.println("Para realizar a compra, apenas digite o código do computador que deseja");
        System.out.println("Você ainda pode comprar múltiplos computadores!!");
        System.out.println("Quando terminar de escolher, é só digitar 0");

        do
        {
           escolha = escolhido.nextInt();
           if (escolha == 1)
               cliente.computadores[nComputadores] = promocao1;

           if (escolha == 2)
               cliente.computadores[nComputadores] = promocao2;

           if (escolha == 3)
               cliente.computadores[nComputadores] = promocao3;


           nComputadores++;
           System.out.println("Lembrando: para sair é só digitar 0");
           System.out.println("Se quiser continuar, só digitar o código da promoção (1, 2 ou 3)");
        }   while(escolha > 0 && escolha < 4);

        cliente.calculaTotalCompra();

        System.out.println("Resumo da compra:");
        for (i = 0; i < cliente.computadores.length; i++)
        {
            if (cliente.computadores[i] != null)
                System.out.println(cliente.computadores[i].marca + " R$" +cliente.computadores[i].preco);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Total: R$" + cliente.total);

        System.out.println("Qual vai ser a forma de pagamento?");
        System.out.println("1 - Boleto Bancário");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Cartão de Débito");
        System.out.println("4 - Alma dos condenados");
        System.out.println("5 - PIX");
    }
}