package dio;

import java.time.LocalDate;

import dio.dominio.Bootcamp;
import dio.dominio.Curso;
import dio.dominio.Dev;
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
		
		System.out.println("\n------Conteudos existentes------");
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Spring Framework Experience");
		bootcamp.setDescricao("A DIO dá Boas-vindas ao Bootcamp: Spring Framework Experience! Um programa repleto de cursos, desafio de código e desafios de projeto nas tecnologias Java - Spring Framework. Participe também de mentorias ao vivo, com conteúdos exclusivos sobre tecnologia e soft skills. Domine Java - Spring Framework como ninguém! Inscreva-se já.");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		System.out.println("\n------Bootcamps existentes------");
		System.out.println(bootcamp.getNome());
		
		Dev yuri = new Dev();
		yuri.setNome("Yuri");
				
		Dev maria = new Dev();
		maria.setNome("Maria");
		
		System.out.println("\n------Desenvolvedores existentes---------");
		System.out.println(yuri.getNome());
		System.out.println(maria.getNome());
		
		System.out.println("\n------Yuri: conteudos já inscritos---------");
		System.out.println(yuri.getConteudosInscritos());
		System.out.println("------Maria: conteudos já inscritos---------");
		System.out.println(maria.getConteudosInscritos());
		
		System.out.println("\n------Yuri e Maria realizaram a inscrição no bootcamp---------");
		yuri.inscreverBootcamp(bootcamp);
		maria.inscreverBootcamp(bootcamp);
		System.out.println("------Devs matriculados no bootcamp "+ bootcamp.getNome() +"---------");
		bootcamp.getDevsInscritos().forEach(dev -> System.out.println(dev.getNome()));
		
		System.out.println("\n------Yuri: conteudos inscritos---------");
		System.out.println(yuri.getConteudosInscritos());
		System.out.println("------Maria: conteudos inscritos---------");
		System.out.println(maria.getConteudosInscritos());
		
		
		System.out.println("\n------Yuri: realizou o curso de poo do bootcamp, conteudos inscritos não finalizados---------");
		yuri.progredir(curso2);
		System.out.println(yuri.getConteudosInscritos());
		System.out.println("\n------Yuri: Conteudos finalizados---------");
		System.out.println(yuri.getConteudosConcluidos());
		System.out.println("Experiencia conquistada: " + yuri.calcularTotalXp() + " exp");
		
		System.out.println("\n------Yuri: realizou a mentoria de java do bootcamp, conteudos inscritos não finalizados---------");
		yuri.progredir(mentoria1);
		System.out.println(yuri.getConteudosInscritos());
		System.out.println("\n------Yuri: Conteudos finalizados---------");
		System.out.println(yuri.getConteudosConcluidos());
		System.out.println("Experiencia conquistada: " + yuri.calcularTotalXp() + " exp");
		
		System.out.println("\n------Yuri: realizou o curso de java do bootcamp, conteudos inscritos não finalizados---------");
		yuri.progredir(curso1);
		System.out.println(yuri.getConteudosInscritos());
		System.out.println("\n------Yuri: Conteudos finalizados---------");
		System.out.println(yuri.getConteudosConcluidos());
		System.out.println("Experiencia conquistada: " + yuri.calcularTotalXp() + " exp");
		
		System.out.println("\n------Maria: Conteudos finalizados---------");
		System.out.println(maria.getConteudosConcluidos());
		System.out.println("Experiencia conquistada: " + maria.calcularTotalXp() + " exp");
		
		
	}

}
