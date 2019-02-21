package org.bankenterprises.repository;

import org.bankenterprises.models.SavingsAccountModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsAccountRepository extends MongoRepository<SavingsAccountModel, String> {

	SavingsAccountModel findByUserId(int userId);

	boolean existsByUserEmail(String userEmail);	
	SavingsAccountModel findByUserEmail(String userEmail);

}
