import br.com.upgrade.desafio.dominio.Conteudo;
import br.com.upgrade.desafio.dominio.Curso;
import br.com.upgrade.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Conteudo cursoJava = new Curso("Curso Java", "Descrição curso java", 8);
        Conteudo cursoJavascript = new Curso("Curso Javascript", "Descrição curso javascript", 4);
        Conteudo mentoriaJava = new Mentoria("Mentoria Java", "Descrição mentoria java", LocalDate.now());


        System.out.println(cursoJava);
        System.out.println(cursoJavascript);
        System.out.println(mentoriaJava);
    }
}
