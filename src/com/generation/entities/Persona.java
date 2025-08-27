package com.generation.entities;

import com.generation.library.BaseEntity;

public class Persona extends BaseEntity
{
	//rende un membro visibile nel package + ovunque all'interno delle sottoclassi
	protected String nome,cognome;
	protected int eta;

	//annotazione facoltativa ma utile per far capire che questa roba non
	//l'ho inventata, ma è una sovrascrittura
	//Override -> riscrittura all'interno di un sottotipo di un metodo ereditato dal supertipo

	@Override
	public String toString()
	{
		return id+" "+ nominativo()+" anni "+eta;
	}

	public String nominativo()
	{
		return nome+ " "+cognome;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCognome()
	{
		return cognome;
	}

	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}

	public int getEta()
	{
		return eta;
	}

	public void setEta(int eta)
	{
		this.eta = eta;
	}
}
