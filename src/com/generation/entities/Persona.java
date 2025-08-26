package com.generation.entities;

public class Persona
{
	public String nome,cognome;
	public int eta;

	public String nominativo()
	{
		return nome+ " "+cognome;
	}
}
