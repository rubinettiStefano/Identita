package com.generation.entities;

import java.util.ArrayList;

public class Team
{

	//pk
	private Long id;

	//LISTA DI FIGLI - OGGETTI COLLEGATI N
	private ArrayList<Player> players = new ArrayList<>();

	//metodo per collegare un Player al team
	//collegare un player significa inserirlo nella lista

	public void addPlayer(Player p)
	{
		if(players.contains(p))//se è gia presente
			return;//termino senza fare nulla

		players.add(p);
		p.setTeam(this);
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}
}
