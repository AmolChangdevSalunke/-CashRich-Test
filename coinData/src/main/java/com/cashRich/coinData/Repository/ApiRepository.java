package com.cashRich.coinData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cashRich.coinData.entity.ApiData;

public interface ApiRepository extends JpaRepository<ApiData, Long> {

}