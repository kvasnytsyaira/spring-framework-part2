package com.controller;

import com.service.NumberService;
import com.wire.GameResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    NumberService numberService;

    @Autowired
    public GameController(NumberService numberService) {
        this.numberService = numberService;
    }

    @GetMapping("/")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello!", HttpStatus.OK);
    }

    @GetMapping("/{number}")
    public ResponseEntity<GameResult> playGame(@PathVariable int number) {
        GameResult game = numberService.game(number);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

}

