package Doan.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Doan.Service.user.ImplMenusService;

@Controller
public class homecontroller extends BaseController {

	@RequestMapping(value = {"/trang-chu","/"})
	public ModelAndView hienthi() {
		_mv.setViewName("user/index");
		return _mv;
		
	}
	

}
