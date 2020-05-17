package com.meritamerica.assignment6.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.assignment6.models.AccountHolderContactDetails;

public interface AccountHolderContactDetailsRepository extends JpaRepository<AccountHolderContactDetails, Long> {

	List<AccountHolderContactDetails> findById(long id);
	//AccountHolderContactDetails findById(long id); (Rufaro edit 5.16)
}
