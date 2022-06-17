package bankController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.BankLoanAppDao;
import dto.BankLoanAppDto;

@Controller
public class BankAppController {

	@Autowired
	 BankLoanAppDao bankLoanAppDao;
	
	@RequestMapping("/createBankLoanAppDto")
	public ModelAndView createBankLoanAppDto() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createBankLoanApp.jsp");
		mv.addObject("BankLoanAppDto",new BankLoanAppDto());
		return mv;
	}
	
	@RequestMapping("/saveBankLoanAppDto")
	public ModelAndView saveBankLoanAppDto(@ModelAttribute BankLoanAppDto bankLoanAppDto) {
		bankLoanAppDao.saveBankLoanAppDto(bankLoanAppDto);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("message.jsp");
		mv.addObject("message",bankLoanAppDto.getFullName()+" is saved");
		return mv;
	}
	
	@RequestMapping("/viewbankLoanAppDto")
	public ModelAndView getAllbankLoanAppDto() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displaybankLoanAppDto.jsp");
		mv.addObject("bankLoanAppDtos",bankLoanAppDao.getAllBankLoanAppDto());
		return mv;
	}
	
	@RequestMapping("/edit")
	public ModelAndView editStudent(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("editbankLoanAppDto.jsp");
		mv.addObject("bankLoanAppDto",bankLoanAppDao.getBankLoanAppDtoById(id));
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteStudent(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		bankLoanAppDao.deleteBankLoanAppDto(id);
		mv.setViewName("message.jsp");
		mv.addObject("message","student is updated");
		return mv;
	}
	
	@RequestMapping("/updatebankLoanAppDto")
	public ModelAndView updateStudent(@ModelAttribute BankLoanAppDto bankLoanAppDto) {
		bankLoanAppDao.updateBankLoanAppDto(bankLoanAppDto);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("message.jsp");
		mv.addObject("message","bankLoanAppDto is updated");
		return mv;
	}

}
