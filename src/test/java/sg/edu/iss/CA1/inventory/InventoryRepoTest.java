package sg.edu.iss.CA1.inventory;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import sg.edu.iss.CA1.domain.Inventory;
import sg.edu.iss.CA1.repository.InventoryRepository;

public class InventoryRepoTest {

	@Autowired
	private InventoryRepository irepo;

	@Test
	void findInventoryItem() {
		System.out.println("Reading from database");
		System.out.println("FindALL");
		ArrayList<Inventory> list = new ArrayList<Inventory>();
		list = (ArrayList<Inventory>) irepo.findAll();
		for (Iterator<Inventory> iterator = list.iterator(); iterator.hasNext();) {
			Inventory inv = iterator.next();
			System.out.println(inv.toString());
		}
	}
}
