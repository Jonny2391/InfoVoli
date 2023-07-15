package it.jobinformatica.infoVoli;

import it.jobinformatica.infoVoli.repository.VoloRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan
public class InfoVoliApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfoVoliApplication.class, args);

		Esecuzione e = new Esecuzione();
		e.start("Venezia");
	}

}
