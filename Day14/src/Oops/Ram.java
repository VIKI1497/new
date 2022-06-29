package Oops;

public class Ram {
	private String model;
	private int gb;
	public Ram(String model,int gb) {
		this.model=model;
		this.gb=gb;
	}
	public String toString() {
		return "RAM MODEL="+model+","+"RAM SIZE="+gb;
	}

}
