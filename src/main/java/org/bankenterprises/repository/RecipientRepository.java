package org.bankenterprises.repository;

import java.util.List;

import org.bankenterprises.models.RecipientModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientRepository extends MongoRepository<RecipientModel, String> {

	List<RecipientModel> findAllByUserEmail(String userEmail);

	RecipientModel findByUserEmail(String userEmail);

}
