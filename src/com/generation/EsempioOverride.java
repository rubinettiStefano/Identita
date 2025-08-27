package com.generation;

import com.generation.entities.Persona;
import com.generation.entities.Stipendiato;

import java.util.ArrayList;

public class EsempioOverride
{
	public static void main(String[] args)
	{
		Studente p = new Studente();
		p.setNome("Simone");
		p.setCognome("Brusa");
		p.setEta(23);
		p.setAnnoDiStudi(17);



		//Prendo l'oggetto a cui la variabile p fa riferimento
		//e lo collego ANCHE alla variabile o
//		Persona elemento = p;


		Stipendiato s = new Stipendiato();
		s.setNome("Pippo");
		s.setCognome("Franco");
		s.setSoldiMensili(100000);

		ArrayList<Persona> tutti = new ArrayList<>();
		tutti.add(p);
		tutti.add(s);

		for(Persona per : tutti)
			System.out.println(per.toString());
	}
}
