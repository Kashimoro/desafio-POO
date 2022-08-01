package dio;

import java.time.LocalDate;

import dio.dominio.Curso;
import dio.dominio.Mentoria;

public class Application {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso poo");
		curso2.setDescricao("descricao curso poo");
		curso2.setCargaHoraria(8);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria de java");
		mentoria1.setDescricao("descricao mentoria java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
	}

}
