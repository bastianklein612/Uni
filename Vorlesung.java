import java.util.HashSet;
import java.util.Set;

public class Vorlesung {

	//set which contains all exercise groups that belong to this lecture
	private Set<‹bungsgruppe> gruppen;

	
	public Vorlesung(){
		
		//initialising the exercise group set
		gruppen = new HashSet<‹bungsgruppe>();
	}
	
	
	//adds an exercise group to the set and sets the lecture of
	//the added group to this lecture
	public void add‹bungsgruppe(‹bungsgruppe gruppe) {
		gruppe.setVorlesung(this);
		gruppen.add(gruppe);
	}

	//removes the given exercise group from the lecture¥s set and
	//removes the connection between the group and the lecture(sets the lecture attribute to "null")
	public void remove‹bungsgruppe(‹bungsgruppe gruppe) {
		gruppen.remove(gruppe);
		gruppe.setVorlesung(null);
	}
	
	//method that sums up the members of all exercise groups associated with the lecture into
	//one single set and returns it
	public Set<Teilnehmer> getTeilnehmer() {
		
		Set<Teilnehmer> allTeilnehmer = new HashSet<Teilnehmer>();
		
		//create a temporary array and drop all exercise groups into this array
		//so it is possible to iterate through them
		‹bungsgruppe[] temp = new ‹bungsgruppe[gruppen.size()];
		gruppen.toArray(temp);
		
		//iterate through the groups and add the members to the "allTeilnehmer"-set
		for(int i=0;i<gruppen.size();i++) {
			
			allTeilnehmer.addAll(temp[i].getTeilnehmer());
		}
		
		return allTeilnehmer;
	}
}
