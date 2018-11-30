package terrainSimulator;

public abstract class Characters {

////instances/////
	protected String Name;
	protected String Gender;	

	///constructors////
	public Characters(String vName) {
		this.Name = vName;
		this.Gender = "Neutral";
	
	}

	public Characters(String vName, String vGender) {
		this.Name = vName;
		this.Gender = vGender;

	}

}
