package pacifica.archi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import pacifica.archi.configuration.WebConfiguration;

/**
 * Just a sample.
 */
@SpringBootApplication
@Import(value = {WebConfiguration.class})
public class SampleWebApplication{

  public static void main(String[] args) {
    SpringApplication.run(SampleWebApplication.class, args);
  }
}
