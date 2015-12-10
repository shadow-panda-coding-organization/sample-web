package pacifica.archi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pacifica.archi.web.HelloController;

/**
 * Sample Configuration
 * <p>
 * Created by Michel on 27/11/2015.
 * </p>
 */
@Configuration
@ComponentScan(basePackageClasses = {HelloController.class})
public class WebConfiguration{

}
