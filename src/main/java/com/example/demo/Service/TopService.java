package com.example.demo.Service;

import com.example.demo.exceptions.TopNotFoundException;
import com.example.demo.obj.Top;
import com.example.demo.repository.TopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopService {

    @Autowired
    private TopRepository repository;

    public List<Top> getAllTops() {
        return repository.findAllByOrderByIdAsc();
    }

    public Top getTop(int id) {
        return repository.findById(id)
                .orElseThrow(TopNotFoundException::new);
    }

    public void saveTop(Top top) {
        List<Top> list = getAllTops();
        for (Top top1 : list) {
            if (top1.getId() == top.getId()) {
                throw new IllegalArgumentException();
            }
        }
        repository.save(top);
    }

    public void updateTop(Top top) {
        if (top.getId() <= 0) {
            throw new IllegalArgumentException();
        }
        repository.save(top);

    }

    public Top getTopByName(String name) {
        return repository.findFirstByName(name).orElseThrow(TopNotFoundException::new);
    }

    public List<Top> getAllTopByName(String name) {
        return repository.findAllByName(name);
    }

    public void deleteTop(int id) {
        repository.deleteById(id);
    }
}
