
public 	class Commit { //Memento
	private String commit;
	
	public Commit(String commitPush) {
		this.commit = commitPush;
	}
	public String getPushedCommit() {
		return commit;
	}
}
