package sg.edu.iss.CA1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.iss.CA1.domain.Inventory;
import sg.edu.iss.CA1.repository.InventoryRepository;

@Service
public class InventoryServiceImplementation implements InventoryService {

	@Autowired
	InventoryRepository irepo;

//	@Override
//	public List<Inventory> listAll(String keyword) {
//		if (keyword != null) {
//			return irepo.findInventoryItem(keyword);
//		}
//		return irepo.findAll();
//	}
	
	@Override
	public List<Inventory> listAll() {
		return irepo.findAll();
	}
}
