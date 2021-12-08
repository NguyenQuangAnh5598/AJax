package com.service;

import com.model.Smartphone;

import java.util.Optional;

public interface ISmartPhoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartphone);

    void remove(Long id);
}
