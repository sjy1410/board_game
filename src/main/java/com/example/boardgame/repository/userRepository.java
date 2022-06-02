package com.example.boardgame.repository;

import com.example.boardgame.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface userRepository extends JpaRepository <User,Long> {//<Entitiy, id유형>

}

