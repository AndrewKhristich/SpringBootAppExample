package com.example.demo.repository;

import com.example.demo.obj.Top;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface TopRepository extends CrudRepository<Top, Integer> {
    List<Top> findAllByOrderByIdAsc();
    Optional<Top> findById(int id);
    List<Top> findAllByName(String name);
    Optional<Top> findFirstByName(String name);
}
