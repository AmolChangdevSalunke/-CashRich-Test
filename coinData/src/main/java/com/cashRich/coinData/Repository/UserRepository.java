package com.cashRich.coinData.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cashRich.coinData.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	

	Optional<User> findById(Long id);

}
