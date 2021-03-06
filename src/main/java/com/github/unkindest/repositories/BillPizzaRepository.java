package com.github.unkindest.repositories;

import com.github.unkindest.entities.BillPizza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by paul on 26.04.16.
 */

@RepositoryRestResource(collectionResourceRel = "billPizza", path = "billpizza")
public interface BillPizzaRepository extends CrudRepository<BillPizza, Integer> {}
