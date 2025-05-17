package com.GuilhermeF.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class ProdutosApiApplication {

	/* @GetMapping("/hello-world")// mapeando o retorno do metodo para uma chamada GET
	public String helloWord(){
		return "Hello World";
	}*/

	public static void main(String[] args) {

		SpringApplication.run(ProdutosApiApplication.class, args);
	}

}
