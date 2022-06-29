package collection;

public class Election {
	private String candidateName;
	private int candidateAge;
	private int candidateId;
	private int candidateVotes;
	private String candidateParty;
	public void setCandidateName(String name) {
		this.candidateName=name;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateAge(int age) {
		this.candidateAge=age;
	}
	public int getCandidateAge() {
		return candidateAge;
	}
	public void setCandidateId(int id) {
		this.candidateId=id;
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateVotes(int votes) {
		this.candidateVotes=votes;
	}
	public int getCandidateVotes() {
		return candidateVotes;
	}
	public void setCandidateParty(String party) {
		this.candidateParty=party;
	}
	public String getCandidateParty() {
		return candidateParty;
	}
	public Election(String name,int age,int id,int votes,String party) {
		this.candidateName=name;
		this.candidateAge=age;
		this.candidateId=id;
		this.candidateVotes=votes;
		this.candidateParty=party;
	}
	public String toString() {
		return candidateName+""+candidateAge+""+candidateId+""+candidateVotes+""+candidateParty;
		}
}
