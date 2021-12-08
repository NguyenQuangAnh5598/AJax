package com.repo;

import com.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartPhoneRepo extends CrudRepository<Smartphone,Long> {
}
