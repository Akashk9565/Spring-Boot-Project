package com.crud.dao;

import org.springframework.data.repository.CrudRepository;

import com.crud.entities.Quote;
public interface QuoteRepository extends CrudRepository<Quote, Integer>{

}
