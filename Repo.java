import java.util.ArrayList;

public class Repo { //Caretaker
		ArrayList<Commit> pushedCommits = new ArrayList<Commit>();
		
		public void addCommitToRepo(Commit memento) {
			pushedCommits.add(memento);
		}
		
		public Commit getCommitFromRepo(int index) {
			return pushedCommits.get(index);
		}
	}