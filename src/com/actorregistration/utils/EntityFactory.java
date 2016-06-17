package com.actorregistration.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityFactory {
	
	
	
	private static EntityManagerFactory factory=null;
	
	private EntityFactory()
	{
		
	}
	
	public static EntityManagerFactory getEntityManagerFactory()
	{
		return ((factory==null)?factory=Persistence.createEntityManagerFactory("ActorsRegistration"):factory);
	}

}