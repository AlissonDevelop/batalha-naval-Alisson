package com.batalhanaval.service;

import com.batalhanaval.entity.Moeda;
import com.batalhanaval.repository.MoedaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoedaService {

    private final MoedaRepository moedaRepository;

    public MoedaService(MoedaRepository moedaRepository) {
        this.moedaRepository = moedaRepository;
    }

    public Moeda saveMoeda(Moeda moeda) {
        return this.moedaRepository.save(moeda);
    }

    public Moeda getMoeda(Long moedaId) {
        return this.moedaRepository.findById(moedaId).orElse(null);
    }

    public List<Moeda> getMoeda() {
        return this.moedaRepository.findAll();
    }

    public void deleteMoeda(Long moedaId) {
        this.moedaRepository.deleteById(moedaId);
    }
}
