package dudinbi3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by student on 3/6/17.
 */
@Controller
public class WebController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/")
    public ModelAndView peopleList() {
        return new ModelAndView("home", "people", personRepository.findAll());
    }
}
