package demo;

import org.thymeleaf.spring4.resourceresolver.SpringResourceResourceResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public TemplateResolver customTemplateResolver(SpringResourceResourceResolver resourceResolver) {
		TemplateResolver resolver = new TemplateResolver();
		resolver.setResourceResolver(resourceResolver);
		resolver.setPrefix("classpath:/templates/specific/");
		resolver.setSuffix(".html");
		resolver.setTemplateMode("HTML5");
		resolver.setCharacterEncoding("UTF-8");
		resolver.setOrder(5);

		return resolver;
	}

}
