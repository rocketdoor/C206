package funcionamento;
import java.util.HashSet;

//Não consegui implementar as exceções

public class Main {
    public static void main(String[] args)
    {
        HashSet<RedeSocial> redesSociais = new HashSet<RedeSocial>();
        RedeSocial facebook = new Facebook();
        RedeSocial twitter = new Twitter();

            redesSociais.add(facebook);
            redesSociais.add(twitter);

            Usuario usuario = new Usuario(redesSociais);

            for (RedeSocial redeSocial : usuario.redesSociais) {
                if (redeSocial instanceof Facebook) {
                    redeSocial.curtirPublicacao();
                    ((Facebook) redeSocial).fazConferencia();
                    redeSocial.postarFoto();
                } else if (redeSocial instanceof Twitter) {
                    redeSocial.postarVideo();
                    redeSocial.postarComentario();
                    ((Twitter) redeSocial).compartilhar();
                }
            }
    }
}