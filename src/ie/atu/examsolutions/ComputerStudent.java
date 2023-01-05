package ie.atu.examsolutions;

public class ComputerStudent extends Student {

	String programmingLanguage;

	public ComputerStudent(String name, int age, String favouriteProgrammingLanguage) {
		super(name, age);
		this.programmingLanguage = favouriteProgrammingLanguage;
	}

	public String getFavouriteProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setFavouriteProgrammingLanguage(String favouriteProgrammingLanguage) {
		this.programmingLanguage = favouriteProgrammingLanguage;
	}
	
}
