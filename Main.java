import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		Teilnehmer t1 = new Teilnehmer();
		Teilnehmer t2 = new Teilnehmer();
		Teilnehmer t3 = new Teilnehmer();
		Teilnehmer t4 = new Teilnehmer();
		Teilnehmer t5 = new Teilnehmer();
		
		Teilnehmer[] tX = new Teilnehmer[300];
		
		for(int i=0;i<300;i++) {
			tX[i] = new Teilnehmer();
		}
		
		HashSet <Teilnehmer> teilnehmer0 = new HashSet<Teilnehmer>();
		HashSet <Teilnehmer> teilnehmer1 = new HashSet<Teilnehmer>();
		HashSet <Teilnehmer> teilnehmer2 = new HashSet<Teilnehmer>();
		
		for(int i=0;i<30;i++) {
			teilnehmer1.add(tX[i]);
		}
		
		for(int i=0;i<8;i++) {
			teilnehmer2.add(tX[i+100]);
		}
		
		teilnehmer0.add(t1);
		teilnehmer0.add(t2);
		teilnehmer0.add(t3);
//		teilnehmer0.add(t4);
//		teilnehmer0.add(t5);
		
		�bungsgruppe group0 = null;
		�bungsgruppe group1 = null;
		�bungsgruppe group2 = null;
		
		try {
			group0 = new �bungsgruppe(teilnehmer0);
			group1 = new �bungsgruppe(teilnehmer1);
			group2 = new �bungsgruppe(teilnehmer2);
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Vorlesung v1 = new Vorlesung();
		
		v1.add�bungsgruppe(group0);
//		v1.add�bungsgruppe(group1);
//		v1.add�bungsgruppe(group2);
		
		System.out.println(v1.getTeilnehmer());
		
	}
	
}
