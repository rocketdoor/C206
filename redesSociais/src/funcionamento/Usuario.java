package funcionamento;

import java.util.HashSet;

public class Usuario
{
    private String nome;
    private String email;
    public HashSet<RedeSocial> redesSociais;

    public Usuario(HashSet<RedeSocial> redesSociais)
    {
        this.redesSociais = redesSociais;
    }
}
