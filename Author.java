
public class Author { //Originator
	private String commit;
	
	public void setValueCommit(String newCommit) {
		System.out.println("Current version of Commit: [ " + newCommit + " ]\n");
		commit = newCommit;
	}
	
	public String getCommit() {
		return commit;
	}
	
	public Commit addCommitToRepo() {
		System.out.println("Saved in Repo.");
		return new Commit(commit);
	}
	
	public String getCommitFromRepo(Commit repo) {
		commit = repo.getPushedCommit();
		System.out.println("Previous Commit pushed to Repo: [ " + commit + " ]\n");
		return commit;
	}
}
