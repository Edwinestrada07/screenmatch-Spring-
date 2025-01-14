package com.aluracursos.screenmatch;

//import com.aluracursos.screenmatch.principal.EjemploStreams;
import com.aluracursos.screenmatch.principal.Principal;
import com.aluracursos.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplicationConsola implements CommandLineRunner {

	@Autowired //Inyeccion de dependencias
	private SerieRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplicationConsola.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Ejecutar la clase principal que muestra el menú de opciones
		Principal principal = new Principal(repository);
		principal.muestraElMenu();

//		EjemploStreams ejemploStreams = new EjemploStreams();
//		ejemploStreams.muestraEjemplo();
	}
}

