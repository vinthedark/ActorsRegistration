package com.actorregistration.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class TestMain {

	public static void main(String[] args) {
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("ActorsRegistration");

	}

}
