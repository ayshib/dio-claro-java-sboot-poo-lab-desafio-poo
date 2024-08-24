import java.time.LocalDate;

import javax.crypto.spec.DESKeySpec;

import br.ays.dio.desafio.dominio.Bootcamp;
import br.ays.dio.desafio.dominio.Curso;
import br.ays.dio.desafio.dominio.Dev;
import br.ays.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        System.out.println("-- bootcamp -----------------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.conteudoAdicionar(curso1);
        bootcamp.conteudoAdicionar(curso2);
        bootcamp.conteudoAdicionar(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudoInscritos());
        System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudosConcluidos());
        devCamila.progredir();
        System.out.println("progredir Camila");
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudoInscritos());
        System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Camila XP: " + devCamila.calcularTotalXp());
        devCamila.progredir();
        System.out.println("progredir Camila");
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudoInscritos());
        System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Camila XP: " + devCamila.calcularTotalXp());
        devCamila.progredir();
        System.out.println("progredir Camila");
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudoInscritos());
        System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Camila XP: " + devCamila.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudoInscritos());
        System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("Joao XP: " + devJoao.calcularTotalXp());
    }
}
