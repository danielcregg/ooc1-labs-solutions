package ie.gmit.javalabs.revision.winter1617.phone;

public class Phone { 
	private String phoneBrand;	
	private double phonePrice;
	private int phoneRamGb;
	 
	 //constructor - not necessary to write constructor
	public Phone(String carName, double phonePrice, int phoneRamGb){
		this.phoneBrand = carName;
		this.phonePrice = phonePrice;
		this.phoneRamGb = phoneRamGb;
	}
	
	 //Getter methods
	 public String getPhoneBrand() {
		 return phoneBrand;
	 }	

	 public double getPhonePrice() {
		 return phonePrice;
	 }
	 
	 public int getphoneRamGb() {
		 return phoneRamGb;
	 }
	 
	 //Setter methods
	 public void setphoneBrand(String phoneBrand) {
		 this.phoneBrand = phoneBrand;
	 }	

	 public void setCarValue(double phonePrice) {
		 this.phonePrice = phonePrice;
	 }
	 
	 public void setCarMileage(int phoneRamGb) {
		 this.phoneRamGb = phoneRamGb; 
	 }	
	 
	 // Method to reduce price by percentage
	 public void reducePrice(double precentageReduction) {
		 // code to reduce price of phone by precentageReduction - not necessary.
		 double fullValueOfPhoneInPercent = 100;
		 this.phonePrice = (fullValueOfPhoneInPercent - precentageReduction) / 100 * this.phonePrice;
	} 
}
