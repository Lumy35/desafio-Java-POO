import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição Curso de Java");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descrição Curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Curso de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Desenvolvedor Java");
        bootcamp.setDescricao("Descricao Bootcamp Desenvolvedor Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuan =  new Dev();
        devLuan.setNome("Luan");
        devLuan.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Luan: " + devLuan.getConteudosInscritos());

        System.out.println("-");
        devLuan.progredir();
        devLuan.progredir();
        System.out.println("Conteudos concluídos Luan: " + devLuan.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Luan: " + devLuan.getConteudosInscritos());
        System.out.println("XP: "+devLuan.calcularTotalXP());

        System.out.println("---------------------");

        Dev devEduarda = new Dev();
        devEduarda.setNome("Eduarda");
        devEduarda.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Eduarda: " + devEduarda.getConteudosInscritos());

        System.out.println("-");
        devEduarda.progredir();
        devEduarda.progredir();
        devEduarda.progredir();
        System.out.println("Conteudos concluídos Eduarda: " + devEduarda.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Eduarda: " + devEduarda.getConteudosInscritos());
        System.out.println("XP: "+devEduarda.calcularTotalXP());

        System.out.println("---------------------");
    }
}