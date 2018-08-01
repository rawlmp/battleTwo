package com.battleship.Spring.VTwo.Battleship;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GamePlayerRepo extends JpaRepository<GamePlayer, Long> {
}
