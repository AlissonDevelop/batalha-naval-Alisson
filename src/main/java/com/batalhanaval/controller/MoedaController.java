package com.batalhanaval.controller;

import com.batalhanaval.entity.Moeda;
import com.batalhanaval.service.MoedaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("moedas")
public class MoedaController {

    private final MoedaService moedaService;

    public MoedaController(MoedaService moedaService) {
        this.moedaService = moedaService;
    }

    @PostMapping
    public ResponseEntity<Moeda> addMoeda(@RequestBody Moeda moeda) {
        moeda = this.moedaService.saveMoeda(moeda);

        return ResponseEntity.status(HttpStatus.CREATED).body(moeda);
    }

    @GetMapping("{moedaId}")
    public ResponseEntity<Moeda> getMoeda(@PathVariable Long moedaId) {
        Moeda moeda = this.moedaService.getMoeda(moedaId);

        return ResponseEntity.ok(moeda);
    }

    @GetMapping
    public ResponseEntity<List<Moeda>> getMoeda() {
        List<Moeda> moeda = this.moedaService.getMoeda();

        return ResponseEntity.ok(moeda);
    }

    @DeleteMapping("{moedaId}")
    public void deleteMoeda(@PathVariable Long moedaId) {
        this.moedaService.deleteMoeda(moedaId);
    }


}
