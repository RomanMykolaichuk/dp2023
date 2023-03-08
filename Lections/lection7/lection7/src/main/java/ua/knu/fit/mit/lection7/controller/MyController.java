package ua.knu.fit.mit.lection7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;
import ua.knu.fit.mit.lection7.entity.MyEntity;
import ua.knu.fit.mit.lection7.repository.MyRepository;

import java.util.List;

@RestController
@RequestMapping("/lection7/api/my_entity")
public class MyController {

    @Autowired
    MyRepository myRepository;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public MyEntity postEntity(@RequestBody MyEntity myEntity){
        return myRepository.save(myEntity);
    }

    @GetMapping("/retrieve")
    public List<MyEntity> getEntities(){
        return myRepository.findAll();
    }

    @PutMapping("/update/{id}")
    public MyEntity putEntity(@PathVariable long id, @RequestBody MyEntity newEntity){
        MyEntity updatedEntity = myRepository.findById(id)
                .orElseThrow(()-> new ResourceAccessException("Not found MyEntity with id: "+id));
        updatedEntity.setName(newEntity.getName());
        updatedEntity.setAge(newEntity.getAge());
        return myRepository.save(updatedEntity);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEntity(@PathVariable long id){
        myRepository.deleteById(id);
    }




}
