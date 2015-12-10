package pacifica.archi.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by PUR on 27/11/2015.
 */
@Controller
public class HelloController{

  @RequestMapping("/hello/{name}")
  public String helloName(@PathVariable(value = "name") String name, Model model) {
    model.addAttribute("name", name);
    return "hello";
  }

  @RequestMapping("/hello")
  public ResponseEntity<String> hello() {
    return new ResponseEntity("Hello !", HttpStatus.OK);
  }
}
