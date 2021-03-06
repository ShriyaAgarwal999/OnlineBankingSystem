package org.bankenterprises.repository;

import java.util.List;

import org.bankenterprises.models.TransactionDetailsModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends MongoRepository<TransactionDetailsModel, String> {


	boolean existsByUserEmail(String userEmail);	
	List<TransactionDetailsModel> findByUserEmail(String userEmail);
}
