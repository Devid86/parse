import java.io.*;
import java.util.Scanner;

public class Parse {

	public static void main (String[] args) {
		Struttura aziende = new Struttura ();
		try {
			Scanner leggo = new Scanner (new FileReader ("eser.txt"));
			while(leggo.hasNext()) {
				leggo.useDelimiter(",|\\n");
				aziende.name.add(leggo.next());
				aziende.kind.add(leggo.next());
				aziende.address.add(leggo.next());
				aziende.employees.add(leggo.next());
			}
			leggo.close();
		}
		catch(IOException e) {
			System.out.println("Errore di I/O");
			System.out.println(e);
		}
		for (int i=0; i<aziende.name.size(); i++) {
			System.out.print((i+1) + " : " + aziende.name.get(i) + " | ");
			System.out.print(aziende.kind.get(i) + " | ");
			System.out.print(aziende.address.get(i) + " | ");
			System.out.println(aziende.employees.get(i));
		}
	}
}