package funcionamento;

import excecoes.HashVazioException;

import java.util.HashSet;

public abstract class RedeSocial
{
    protected String senha;
    protected int numeroAmigos;

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicacao()
    {
        System.out.println("O usuario curtiu uma publicacao!");
    }

    public void ChecaHash(HashSet hashSet) throws HashVazioException
    {
        if (hashSet == null)
            throw new HashVazioException("Hash vazio!");
    }


}
