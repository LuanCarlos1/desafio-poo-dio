import br.com.upgrade.desafio.dominio.Curso;
import br.com.upgrade.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso("Curso Java", "Descrição curso java", 8);
        Curso cursoJavascript = new Curso("Curso Javascript", "Descrição curso javascript", 4);
        Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Descrição mentoria java", LocalDate.now());


        System.out.println(cursoJava);
        System.out.println(cursoJavascript);
        System.out.println(mentoriaJava);
    }
}
