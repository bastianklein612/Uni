import java.util.Set;
import java.util.HashSet;

public class ‹bungsgruppe {

	//the lecture this exercise group is associated with
	//there does not have to be a lecture this group belongs to, 
	//but if there is there can only be one
	private Vorlesung vorlesung;
	
	//set of all the members that attend this exercise group
	private Set<Teilnehmer> teilnehmer;
	
	public ‹bungsgruppe(HashSet<Teilnehmer> teilnehmer) throws Exception{
		
		this.teilnehmer = teilnehmer;
		
		//check if the group size is inside the defined constrains(3-30 members per group)
		checkGroupSize();
		
		vorlesung = null;
	}
	
	
	public void setVorlesung(Vorlesung v) {
		vorlesung = v;
	}
	public void removeVorlesung() {
		vorlesung = null;
	}
	
	//adds a member to the group and adds this 
	//group to the members set of exercise groups
	public void addTeilnehmer(Teilnehmer t) {
		teilnehmer.add(t);
		t.add‹bungsgruppe(this);
	}
	
	//removes the given member from the set of all members and removes this group 
	//from the members set of all groups
	//after the members is removed the size of this group gets checked to see if its still inside the defined constrains
	public void removeTeilnehmer(Teilnehmer t) throws Exception {
		teilnehmer.remove(t);
		t.remove‹bungsgruppe(this);
		
		checkGroupSize();
	}
	
	public Set<Teilnehmer> getTeilnehmer(){
		return teilnehmer;
	}
	
	//checks the size of the member-set to see if the number of members is inside of the defined constrains(3-30 members per group)
	private void checkGroupSize() throws Exception {
		
		//if there are less than 3 members in an exercise group, it can not exist
		if(teilnehmer.size() < 3) {
			throw new Exception("Es sind weniger als 3 Teilnehmer dieser Gruppe zugeordnet");
		}
		
		//otherwise, if there are more than 30 members in an exercise group, it also can not exist
		if(teilnehmer.size() > 30) {
			throw new Exception("Es sind weniger als 30 Teilnehmer dieser Gruppe zugeordnet");
		}
		
	}
}
