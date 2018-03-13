package com.example.demo;

import com.example.demo.obj.Top;
import com.example.demo.repository.TopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = TopRepository.class)
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer implements CommandLineRunner {

	@Autowired
	private TopRepository repository;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		Top top1 = new Top();
		top1.setId(1);
		top1.setName("a");
		top1.setDescription("a1");

		Top top2 = new Top();
		top2.setId(2);
		top2.setName("b");
		top2.setDescription("b2");

		Top top3 = new Top();
		top3.setId(3);
		top3.setName("c");
		top3.setDescription("c3");

		Top top4 = new Top();
		top4.setId(4);
		top4.setName("b");
		top4.setDescription("c3");

		repository.save(top1);
		repository.save(top2);
		repository.save(top3);
		repository.save(top4);

	}
}
