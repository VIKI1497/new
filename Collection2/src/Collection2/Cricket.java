package Collection2;

public class Cricket {
	private String playerName;
	private int age;
	private boolean isBatsman;
	private int playerScore;
	private int playerWickets;
	public void setPlayerName(String playerName) {
		this.playerName=playerName;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setIsBatsman(boolean isBatsman) {
		this.isBatsman=isBatsman;
	}
	public boolean getIsBatsman() {
		return isBatsman;
	}
	public void setPlayerScore(int playerScore) {
		this.playerScore=playerScore;
	}
	public int getPlayerScore() {
		return playerScore;
	}
	public void setPlayerWickets(int playerWickets) {
		this.playerWickets=playerWickets;
	}
	public int getPlayerWickets() {
		return playerWickets;
	}
	public Cricket(String playerName,int age,boolean isBatsman,int playerScore,int playerWickets) {
		this.playerName=playerName;
		this.age=age;
		this.isBatsman=isBatsman;
		this.playerScore=playerScore;
		this.playerWickets=playerWickets;
	}
	public String toString() {
		return playerName+" "+age+" "+isBatsman+" "+playerScore+" "+playerWickets;
	}

}
