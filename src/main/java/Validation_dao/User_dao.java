package Validation_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Validation_dto.User_dto;

public class User_dao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void signup(User_dto dto){
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
	}
	public User_dto login(String email)
	{
		User_dto dto=entityManager.find(User_dto.class, email);
		return dto;
	}
}
