package com.generation.entities;

public class Stipendiato extends Persona
{
	private int soldiMensili;

	public int getSoldiMensili()
	{
		return soldiMensili;
	}

	public void setSoldiMensili(int soldiMensili)
	{
		this.soldiMensili = soldiMensili;
	}

	@Override
	public String toString()
	{
		return nominativo()+" anni "+getEta()+" e prende "+soldiMensili+ " euro al mese";
	}
}
