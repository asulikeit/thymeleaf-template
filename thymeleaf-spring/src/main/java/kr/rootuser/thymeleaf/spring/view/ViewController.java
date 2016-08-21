package kr.rootuser.thymeleaf.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
	private Logger LOG = LoggerFactory.getLogger(ViewController.class);
		
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(){
		LOG.info("##### Someone has visited INDEX.");
		return "index";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(){
		LOG.info("##### Someone has visited HOME.");
		return "home";
	}
}
