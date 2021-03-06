import java.util.HashSet;
import java.util.Set;

public class Teilnehmer {
	
	//set of all the exercise group a member attends
	private Set<Übungsgruppe> gruppen;
	
	public Teilnehmer() {
		
		//initialising the set
		gruppen = new HashSet<Übungsgruppe>();
	}
	
	public void addÜbungsgruppe(Übungsgruppe gruppe) {
		gruppen.add(gruppe);
	}
	
	public void removeÜbungsgruppe(Übungsgruppe gruppe) {
		gruppen.remove(gruppe);
	}
}
