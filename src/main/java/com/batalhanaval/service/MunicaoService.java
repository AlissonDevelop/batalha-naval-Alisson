package com.batalhanaval.service;

import com.batalhanaval.entity.Municao;
import com.batalhanaval.entity.User;
import com.batalhanaval.repository.MunicaoRepository;
import com.batalhanaval.repository.UserRepository;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicaoService {

    private final MunicaoRepository municaoRepository;
    private LogManager MunicaoRepository;

    public MunicaoService(MunicaoRepository municaoRepository) {
        this.municaoRepository = municaoRepository;
    }

    public Municao saveMunicao(Municao municao) {
        return this.municaoRepository.save(municao);
    }

    public Municao getMunicao(Long userId) {
        return this.municaoRepository.findById(userId).orElse(null);
    }

    public List<Municao> getMunicao() {
        return this.municaoRepository.findAll();
    }


}
