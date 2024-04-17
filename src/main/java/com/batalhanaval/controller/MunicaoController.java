package com.batalhanaval.controller;

import com.batalhanaval.entity.Municao;
import com.batalhanaval.service.MunicaoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("municoes")
public class MunicaoController {

    private final MunicaoService municaoService;

    public MunicaoController(MunicaoService municaoService) {
        this.municaoService = municaoService;
    }

    @PostMapping
    public ResponseEntity<Municao> addMunicao(@RequestBody Municao municao) {
        municao = this.municaoService.saveMunicao(municao);

        return ResponseEntity.status(HttpStatus.CREATED).body(municao);
    }

    @GetMapping("{municaoId}")
    public ResponseEntity<Municao> getMunicao(@PathVariable Long municaoId) {
        Municao municao = this.municaoService.getMunicao(municaoId);

        return ResponseEntity.ok(municao);
    }

    @GetMapping
    public ResponseEntity<List<Municao>> getMunicao() {
        List<Municao> municao = this.municaoService.getMunicao();

        return ResponseEntity.ok(municao);
    }

    @DeleteMapping("{municaoId}")
    public void deleteMunicao(@PathVariable Long municaoId) {
        this.municaoService.deleteMunicao(municaoId);
    }


}
