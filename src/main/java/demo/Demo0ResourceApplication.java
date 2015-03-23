package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;

@SpringBootApplication
@RestController
public class Demo0ResourceApplication {

	  @RequestMapping("/")
	  public Map<String,Object> home() {
	    Map<String,Object> model = new HashMap<String,Object>();
	    model.put("id", UUID.randomUUID().toString());
	    model.put("content", "Hello wwwwWorld");
	    return model;
	  }
	  
	  @Bean
	  HeaderHttpSessionStrategy sessionStrategy() {
	    return new HeaderHttpSessionStrategy();
	  }
	  public static void main(String[] args) {
	    SpringApplication.run(Demo0ResourceApplication.class, args);
	  }
}
