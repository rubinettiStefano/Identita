package com.generation.entities;

public class Player
{
	private Long id;


	//riferimento al padre, alla parte 1
	private Team team;
	//fk, id del team da collegare
	private Long teamId;

	//metodo per collegare un Team al Player

	public void setTeam(Team team)
	{
		if(team==this.team)
			return;

		this.team=team;
		this.teamId=team.getId();
		team.addPlayer(this);
	}
}
