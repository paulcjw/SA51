package sg.edu.iss.CA1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.CA1.domain.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer>{
//	@Query("SELECT i FROM Inventory i WHERE i.itemName LIKE %:keyword%")
//	public List<Inventory> findInventoryItem(@Param("keyword") String keyword);
	
//	@Query("SELECT i FROM Inventory i WHERE CONCAT(i.productId, '', i.supplierName, '', i.brandId, '', i.brandName, '', i.itemName, '', i.invdescription, '', invtype) LIKE %:keyword%")
//	public List<Inventory> findInventoryItem(@Param("keyword") String keyword);
	
	
	@Query(value="SELECT * FROM invms.inventory i WHERE concat(i.productId, '', i.supplierName, '', i.brandId, '', i.itemName, '', i.invdescription, '', invtype) LIKE '%:keyword%'",
			nativeQuery = true)
	public List<Inventory> findInventoryItem(@Param("keyword") String keyword);
}
