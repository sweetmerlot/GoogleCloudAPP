package com.gcu.service;

import com.gcu.data.entity.SnakeEntity;
import com.gcu.data.repository.SnakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SnakeService {
    @Autowired
    SnakeRepository repo;

    public Iterable<SnakeEntity> getAll() {
        return repo.findAll();
    }

    public SnakeEntity createSnake(SnakeEntity snake) {

        return repo.save(snake);
    }
}
