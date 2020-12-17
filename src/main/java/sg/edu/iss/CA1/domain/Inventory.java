package sg.edu.iss.CA1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int productId;
	
	String supplierName;
	int brandId;
	String brandName;
	String itemName;
	String invdescription;
	String invtype;
	String category;
	String subCategory;
	Double originalPrice;
	Double wholesalePrice;
	Double retailPrice;
	Double partnerPrice;
	int units;


	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventory(int productId, String supplierName, int brandId, String brandName,
			String itemName, String invdescription, String invtype, String category,
			String subCategory, Double originalPrice, Double wholesalePrice,
			Double retailPrice, Double partnerPrice, int units) {
		super();
		this.productId = productId;
		this.supplierName = supplierName;
		this.brandId = brandId;
		this.brandName = brandName;
		this.itemName = itemName;
		this.invdescription = invdescription;
		this.invtype = invtype;
		this.category = category;
		this.subCategory = subCategory;
		this.originalPrice = originalPrice;
		this.wholesalePrice = wholesalePrice;
		this.retailPrice = retailPrice;
		this.partnerPrice = partnerPrice;
		this.units = units;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getInvdescription() {
		return invdescription;
	}

	public void setInvdescription(String invdescription) {
		this.invdescription = invdescription;
	}

	public String getInvtype() {
		return invtype;
	}

	public void setInvtype(String invtype) {
		this.invtype = invtype;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public Double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Double getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(Double wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Double getPartnerPrice() {
		return partnerPrice;
	}

	public void setPartnerPrice(Double partnerPrice) {
		this.partnerPrice = partnerPrice;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	@Override
	public String toString() {
		return "Inventory [productId=" + productId + ", supplierName=" + supplierName + ", brandId=" + brandId
				+ ", brandName=" + brandName + ", itemName=" + itemName + ", invdescription=" + invdescription
				+ ", invtype=" + invtype + ", category=" + category + ", subCategory=" + subCategory
				+ ", originalPrice=" + originalPrice + ", wholesalePrice=" + wholesalePrice + ", retailPrice="
				+ retailPrice + ", partnerPrice=" + partnerPrice + ", units=" + units + "]";
	}

}
