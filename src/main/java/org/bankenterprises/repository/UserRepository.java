package org.bankenterprises.repository;

import org.bankenterprises.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {

	UserModel findByUserId(int userId);
	
	boolean existsByUserEmail(String userEmail);
	
	UserModel findByUserEmail(String userEmail);
}
