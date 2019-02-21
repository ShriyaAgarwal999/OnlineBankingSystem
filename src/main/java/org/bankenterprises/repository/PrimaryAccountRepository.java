package org.bankenterprises.repository;

import org.bankenterprises.models.PrimaryAccountModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryAccountRepository extends MongoRepository<PrimaryAccountModel, String>{


	PrimaryAccountModel findByUserEmail(String userEmail);

	boolean existsByUserEmail(String userEmail);

}
