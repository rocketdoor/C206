package funcionamento;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    @Override
    public void compartilhar()
    {
        System.out.println("O usuário compartilhou uma publicação no Google+!");
    }

    @Override
    public void fazConferencia()
    {
        System.out.println("O usuário fez uma live no Google+!");
    }

    @Override
    public void postarFoto()
    {
        System.out.println("O usuário postou uma foto no Google+!");
    }

    @Override
    public void postarVideo()
    {
        System.out.println("O usuário postou um vídeo no Google+!");
    }

    @Override
    public void postarComentario()
    {
        System.out.println("O usuário comentou em uma publicação no Google+!");
    }

    @Override
    public void curtirPublicacao()
    {
        System.out.println("O usuario curtiu uma publicação no Google+!");
    }
}
