package acorn.com.mysqlbatis;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsersController {

	@Autowired
	UsersRepository rep;
	
	@ResponseBody
	@RequestMapping("/selectuserlist")
	public List<UsersDTO> selectall (HttpServletRequest request) throws Exception {
		System.out.println("ok");
		List<UsersDTO> result = rep.selectAll();
		return result ;
		
	}
	

	@RequestMapping("/selectalluser1")
	public String selectall (HttpServletRequest request, Model model) throws Exception {
		System.out.println("ok");
		List<UsersDTO> result = rep.selectAll();
		model.addAttribute("list", result);
		return "selectall" ;
		
	}
	
	@RequestMapping( value="/selectalluser12" , method=RequestMethod.GET )
	public String  main(Model model ) throws Exception {		
		List<UsersDTO> result = rep.selectAll();
		model.addAttribute("list", result);
		return "selectall";
	}
	
	@GetMapping("/selectalluser13")
	public String selectAll( Model model) {
		UsersDTO result  = rep.select("1");
		model.addAttribute("user", result);
		System.out.println( result);
		return "select";
		}
	
	@GetMapping("/selectalluser14")
	public String selectAll( ) {
		UsersDTO result  = rep.select("1");
		//model.addAttribute("user", result);
		System.out.println( result);
		return "select";
		
	}
	
	
}
