package terrainSimulator;

public class Player2 extends Characters {
		
//////////////attributes///////////////

	String Name;
	String Gender;

/////////////constructors/////////////

	public Player2(String vName, String vGender) {
		super(vName, vGender);
		this.Name = "Wendy";
		this.Gender = "Female";
}


////////////methods//////////////////

	public String toString() {
		return "This player is called "+ this.Name + ". Its gender is "+ this.Gender;
	
	
	
	
	
	
	}	
}
