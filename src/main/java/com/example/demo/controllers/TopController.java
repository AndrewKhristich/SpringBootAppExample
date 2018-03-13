package com.example.demo.controllers;

import com.example.demo.Service.TopService;
import com.example.demo.obj.Top;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TopController {

    @Autowired
    private TopService service;

    @RequestMapping(value = "/tops", method = RequestMethod.GET)
    public List<Top> findAll(){
        return service.getAllTops();
    }

    @RequestMapping(value = "/tops", params = "name", method = RequestMethod.GET)
    public List<Top> findAllByName(@RequestParam String name){
        return service.getAllTopByName(name);
    }

    @RequestMapping(value = "/tops", params = "id",method = RequestMethod.GET)
    public Top findOneById(@RequestParam int id){
        return service.getTop(id);
    }

    @RequestMapping(value = "/tops/find", params = "name",method = RequestMethod.GET)
    public Top findOneByName(@RequestParam String name){
        return service.getTopByName(name);
    }

    @RequestMapping(value = "tops/save", method = RequestMethod.POST)
    public void saveOneTop(@Valid @RequestBody Top top){
        service.saveTop(top);
    }

    @RequestMapping(value = "/tops/update", method = RequestMethod.PUT)
    public void updateTop(@Valid @RequestBody Top top){
        service.updateTop(top);
    }

    @RequestMapping(value = "/tops/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTop(@PathVariable int id){
        service.deleteTop(id);
    }


}
