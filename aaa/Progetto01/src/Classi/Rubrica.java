package Classi;

import java.util.Vector;

public class Rubrica {
	private Vector elenco;
	public Rubrica()
	{
		elenco= new Vector(1,1);
		
	}
	public void aggiungiVoce(Voce v)
	{
		elenco.addElement(v);
	}
	public void eliminaVoce(int indice)
	{
		try
		{
			elenco.removeElementAt(indice);
		}
		catch(Exception e)
		{
			System.out.println("Eliminazione non possibile");
			return;
		}
		System.out.println("Eliminazione effettuata");
	}
	public void visualizza()
	{
		Voce v;
		
		System.out.println("\nRUBRICA");
		for(int i=0; i<elenco.size(); i++)
		{
			System.out.println("posizione " + i + " ->");
			v=(Voce) elenco.elementAt(i);
			v.stampa();
		}
	}

}

