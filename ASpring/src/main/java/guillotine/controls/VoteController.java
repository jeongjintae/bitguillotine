package guillotine.controls;

import guillotine.dao.VoteDao;
import guillotine.vo.Vote;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/vote")
public class VoteController {
	@Autowired
	ServletContext servletContext;
	
	@Autowired(required=false)
	VoteDao voteDao;
	
//	@RequestMapping(value="/add",method=RequestMethod.GET)
//	public String form() {
//		return "member/addForm";
//	}
//	
//	@RequestMapping(value="/add",method=RequestMethod.GET)
//	public String form() {
//		return "v/addForm";
//	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String insert(Vote vote) throws Exception {
		voteDao.insert(voteDao);
		return "vote/add";
	}
	
	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		model.addAttribute("votes", voteDao.selectList());
		return "vote/list";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	  public String update(Vote vote, 
	  		Model model) throws Exception {
		voteDao.update(voteDao);
		return "vote/update";
	}
}

