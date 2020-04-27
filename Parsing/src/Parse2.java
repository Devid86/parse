import java.io.*;
import java.util.Scanner;

public class Parse2 {

	public static void main (String[] args) {
		Esami esami = new Esami();
		String apps;
		int appi;
		try {
			Scanner leggo = new Scanner (new FileReader ("esami.txt"));
			while(leggo.hasNext()) {
				apps = leggo.next();
				appi = leggo.nextInt();
				esami.Aggiungi(apps, appi);
				}
			leggo.close();

		}
		catch(IOException e) {
			System.out.println("Errore di I/O");
			System.out.println(e);
		} 
		esami.Stampa();

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output.txt"));
			out.writeObject(esami);
			out.close();
		}
		catch(IOException e) {
			System.out.println("Errore di I/O");
			System.out.println(e);
		}
		esami.Aggiungi(3, "stocazzo", 25);
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.txt"));
			esami=(Esami)in.readObject();
			in.close();
		}
		catch(IOException e) {
			System.out.println("Errore di I/O");	
			System.out.println(e);
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not Found");	
			System.out.println(e);
		}
		System.out.println("\n deserializzato : \n");
		esami.Stampa();
		}
	} 
