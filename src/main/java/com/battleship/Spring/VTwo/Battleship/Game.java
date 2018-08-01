package com.battleship.Spring.VTwo.Battleship;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date creationDate;

    @OneToMany(mappedBy = "game")
    private Set<GamePlayer> gamePlayers = new HashSet<>();

    public Game(){
        this.creationDate = new Date();
    }

    public long getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
