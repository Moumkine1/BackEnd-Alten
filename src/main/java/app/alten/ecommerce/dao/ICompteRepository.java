package app.alten.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import app.alten.ecommerce.model.Compte;

public interface ICompteRepository extends JpaRepository<Compte, Integer> {
	
	@Query("select c from Compte c where c.username = :username and c.password = :password")
	public  Compte findByUserNameAndPassword(@Param("username") String username ,@Param("password") String password);

}
