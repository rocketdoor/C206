package funcionamento;

public class Instagram extends RedeSocial{
    @Override
    public void postarFoto()
    {
        System.out.println("O usuário postou uma foto no Instagram!");
    }

    @Override
    public void postarVideo()
    {
        System.out.println("O usuário postou um vídeo no Instagram!");
    }

    @Override
    public void postarComentario()
    {
        System.out.println("O usuário comentou em uma publicação no Instagram!");
    }

    @Override
    public void curtirPublicacao()
    {
        System.out.println("O usuario curtiu uma publicação no Instagram!");
    }
}
