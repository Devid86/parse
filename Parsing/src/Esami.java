import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Esami implements Serializable {
	private static final long serialVersionUID = 1234556; 
	private int cont;
	public List <String> materia;
	public List <Integer> voto;
	
	public Esami() {
		cont = 0;
		materia = new ArrayList<String>();
		voto = new ArrayList<Integer>();
	}
	
	public boolean Aggiungi (int c, String mat, int voto) {
		if(c<cont) {
			materia.add(c, mat);
			this.voto.add(c,voto);
			return true;
		}
		return false;
	}
	
	public void Aggiungi (String mat, int voto) {
		materia.add(cont, mat);
		this.voto.add(cont,voto);
		cont++;
	}
	
	public int getCont() {
		return cont;
	}

	public void Stampa () {
		for (int i=0; i<cont; i++) {
			System.out.println(materia.get(i) + "  " + voto.get(i));
		}
	}
	
}
