package org.bankenterprises.repository;

import java.util.List;
import org.bankenterprises.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {

	UserModel findByUserId(long userId);
	
	boolean existsByUserEmail(String userEmail);
	
	UserModel findByUserEmail(String userEmail);
	
	List<UserModel> findAll();	
	
	UserModel findTop1ByOrderByUserIdDesc();
	
	
}
