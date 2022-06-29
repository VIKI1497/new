package collection1;

public class State {
	private String cmName;
	private String stateName;
	private String capital;
	private String language;
	private int totDistrict;
	public void setCmName(String cmName) {
		this.cmName=cmName;
	}
	public String getCmName() {
		return cmName;
	}
	public void setStateName(String stateName) {
		this.stateName=stateName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setCapital(String capital) {
		this.capital=capital;
	}
	public String getCapital() {
		return capital;
	}
	public void setLanguage(String language) {
		this.language=language;
	}
	public String getLanguage() {
		return language;
	}
	public void setTotDistrict(int totDistrict) {
		this.totDistrict=totDistrict;
	}
	public int getTotDistrict() {
		return totDistrict;
	}
	public State(String cmName,String stateName,String capital,String language,int totDistrict) {
		this.cmName=cmName;
		this.stateName=stateName;
		this.capital=capital;
		this.language=language;
		this.totDistrict=totDistrict;
	}
	public String toString() {
		return cmName+""+stateName+""+capital+""+language+""+totDistrict;
	}

}
