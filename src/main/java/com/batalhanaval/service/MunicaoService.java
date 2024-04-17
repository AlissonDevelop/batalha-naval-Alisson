package com.batalhanaval.service;

import com.batalhanaval.entity.Municao;
import com.batalhanaval.repository.MunicaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicaoService {

    private final MunicaoRepository municaoRepository;

    public MunicaoService(MunicaoRepository municaoRepository) {
        this.municaoRepository = municaoRepository;
    }

    public Municao saveMunicao(Municao municao) {
        return this.municaoRepository.save(municao);
    }

    public Municao getMunicao(Long municaoId) {
        return this.municaoRepository.findById(municaoId).orElse(null);
    }

    public List<Municao> getMunicao() {
        return this.municaoRepository.findAll();
    }

    public void deleteMunicao(Long municaoId) {
        this.municaoRepository.deleteById(municaoId);
    }
}
