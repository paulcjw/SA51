package sg.edu.iss.CA1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.iss.CA1.domain.Inventory;
import sg.edu.iss.CA1.service.InventoryService;
import sg.edu.iss.CA1.service.InventoryServiceImplementation;

@Controller
public class InventoryController {

	@Autowired
	private InventoryService iservice;
	
	@Autowired
	public void setInventoryService(InventoryServiceImplementation iimpl) {
		this.iservice = iimpl;
	}
	
	
//	@RequestMapping("/")
//	public String indexPage(Model model, @Param("keyword") String keyword) {
//		List<Inventory> listInventory = iservice.listAll(keyword);
//		model.addAttribute("listInventory", listInventory);
//		model.addAttribute("keyword", keyword);
//		return "index";
//	}
	
	@RequestMapping("/")
	public String indexPage(Model model) {
		List<Inventory> listInventory = iservice.listAll();
		model.addAttribute("listInventory", listInventory);
		return "index";
	}
}
