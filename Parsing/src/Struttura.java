import java.util.List;
import java.util.ArrayList;

public class Struttura {
	List <String> name;
	List <String> kind;
	List <String> address;
	List <String> employees;

	public Struttura () {
		name = new ArrayList<String>();
		kind = new ArrayList <String> ();
		address = new ArrayList <String> ();
		employees = new ArrayList <String> ();
	}
}