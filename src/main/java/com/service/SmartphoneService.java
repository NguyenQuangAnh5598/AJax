package com.service;

import com.model.Smartphone;
import com.repo.ISmartPhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartphoneService implements ISmartPhoneService {
    @Autowired
    ISmartPhoneRepo smartPhoneRepo;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartPhoneRepo.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return smartPhoneRepo.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartphone) {
        return smartPhoneRepo.save(smartphone);
    }

    @Override
    public void remove(Long id) {
        smartPhoneRepo.deleteById(id);
    }
}
