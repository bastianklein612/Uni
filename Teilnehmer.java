import java.util.HashSet;
import java.util.Set;

public class Teilnehmer {
	
	//set of all the exercise group a member attends
	private Set<‹bungsgruppe> gruppen;
	
	public Teilnehmer() {
		
		//initialising the set
		gruppen = new HashSet<‹bungsgruppe>();
	}
	
	public void add‹bungsgruppe(‹bungsgruppe gruppe) {
		gruppen.add(gruppe);
	}
	
	public void remove‹bungsgruppe(‹bungsgruppe gruppe) {
		gruppen.remove(gruppe);
	}
}
