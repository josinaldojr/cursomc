package com.naldosuri.cursomc.com.naldosuri.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.naldosuri.cursomc.com.naldosuri.cursomc.domain.Categoria;
import com.naldosuri.cursomc.com.naldosuri.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	//Realizando a decalaração, e o uso do @AutoWired para instanciar automáticamente
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		//Salvando as categorias do banco
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
