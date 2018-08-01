package com.battleship.Spring.VTwo.Battleship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class GameController {

    @Autowired
    private GameRepo gameRepo;

    @RequestMapping("/games")
    public List<Long> showMeTheGames(){
        return
                gameRepo.findAll()
                .stream().map(game -> game.getId())
                .collect(Collectors.toList());
    }
}
