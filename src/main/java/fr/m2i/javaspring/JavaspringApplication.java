package fr.m2i.javaspring;

import fr.m2i.javaspring.config.DataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaspringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JavaspringApplication.class, args);
                
                DataSourceConfig dataConfig = ctx.getBean(DataSourceConfig.class);
                dataConfig.setup();
	}

}
