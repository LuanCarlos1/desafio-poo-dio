import br.com.upgrade.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Conteudo cursoJava = new Curso("Curso Java", "Descrição curso java", 8);
        Conteudo cursoJavascript = new Curso("Curso Javascript", "Descrição curso javascript", 4);
        Conteudo mentoriaJava = new Mentoria("Mentoria Java", "Descrição mentoria java", LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Developer", "Descrição Java Developer");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(cursoJavascript);
        bootcampJava.getConteudos().add(mentoriaJava);

        Dev devLuan = new Dev("Luan Carlos");
        devLuan.inscreverBootcamp(bootcampJava);
        Dev devIsa = new Dev("Isadora Vale");
        devIsa.inscreverBootcamp(bootcampJava);

        System.out.printf("Conteúdos Inscritos %s: %s \n", devLuan.getNome(), devLuan.getConteudosInscritos());
        System.out.printf("Conteúdos Inscritos %s: %s \n", devIsa.getNome(), devIsa.getConteudosInscritos());

        devLuan.progredir();
        devIsa.progredir();

        System.out.println("------------------------------------");

        System.out.printf("Conteúdos Concluídos %s: %s \n", devLuan.getNome(), devLuan.getConteudosInscritos());
        System.out.printf("Conteúdos Concluídos %s: %s \n", devIsa.getNome(), devIsa.getConteudosInscritos());

        System.out.println("\n------------------------------------");

        System.out.printf("Conteúdos Inscritos %s: %s \n", devLuan.getNome(), devLuan.getConteudosInscritos());
        System.out.printf("Conteúdos Inscritos %s: %s \n", devIsa.getNome(), devIsa.getConteudosInscritos());

        System.out.println("XP: " + devLuan.calcularTotalXp());
        System.out.println("XP: " + devIsa.calcularTotalXp());
    }
}
