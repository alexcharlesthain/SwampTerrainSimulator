package terrainSimulator;

public class Player1 extends Characters {
	

//////////////attributes///////////////

	String Name;
	String Gender;

/////////////constructors/////////////

	public Player1(String vName, String vGender) {
		super(vName, vGender);
		this.Name = "Archibold";
		this.Gender = "Male";
}


////////////methods//////////////////

public String toString() {
	return "This player is called "+ this.Name + ". Its gender is "+ this.Gender;
}
		

	}


