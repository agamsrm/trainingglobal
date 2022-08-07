package cam.globallogic.spring;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/home")
public class HomeController1 {
	@RequestMapping(value = "/gethome", method = RequestMethod.GET)
	public ModelAndView getHome(@RequestParam Map<String,String> map)
	{	
		//
		map.forEach((K,V)->System.out.println(K+"  Stocks "+V));
		ModelAndView model=new ModelAndView("home");  //view name
		model.addObject("msg","Welcome this is message one");  //key and value
		model.addObject("msg2","Welcome this is message two"); //key and value
        return model;
	}
}