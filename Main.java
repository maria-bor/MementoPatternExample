public class Main {

	public static void main(String[] args) {
		
		Author author = new Author();
		Repo repo  = new Repo();
	
		author.setValueCommit("First change.");
		author.setValueCommit("Second change.");
		repo.addCommitToRepo(author.addCommitToRepo());
		
		author.setValueCommit("Third change.");
		repo.addCommitToRepo(author.addCommitToRepo());
		
		author.setValueCommit("Fourth change.");
	    System.out.println("Current commit: " + author.getCommit());
	    
	    author.getCommitFromRepo(repo.getCommitFromRepo(0));
	    System.out.println("First saved commit: [ " + author.getCommit() + " ]");
	    author.getCommitFromRepo(repo.getCommitFromRepo(1));
	    System.out.println("Second saved commit: [" + author.getCommit() + " ]");
	}
}