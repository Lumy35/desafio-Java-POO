import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso1");
        curso1.setDescricao("Descrição1");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso2");
        curso2.setDescricao("Descrição2");
        curso2.setCargaHoraria(30);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria curso1");
        mentoria1.setDescricao("Descrição mentoria curso1");
        mentoria1.setData(LocalDate.now());

        System.out.println("Curso 1: "+curso1.toString());
        System.out.println("Curso 2: "+curso2.toString());
        System.out.println("Mentoria curso 1: "+mentoria1.toString());
    }
}