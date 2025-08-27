package com.generation;

import com.generation.entities.Persona;

public class Studente extends Persona
{

	private int annoDiStudi;

	public int getAnnoDiStudi()
	{
		return annoDiStudi;
	}

	public void setAnnoDiStudi(int annoDiStudi)
	{
		this.annoDiStudi = annoDiStudi;
	}

	@Override
	public String toString()
	{
		return nominativo()+" anni "+eta+" e studia da "+annoDiStudi;
	}
}
