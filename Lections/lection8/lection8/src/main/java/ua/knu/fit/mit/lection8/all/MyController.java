package ua.knu.fit.mit.lection8.all;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/things")
@Slf4j
public class MyController {

    @Autowired
    MyRepository myRepository;

    @GetMapping("/get")
    public List<MyEntity> getAll(){
        List<MyEntity> list;
        log.info("[MY CONTROLLER] Before GET");
        list = myRepository.findAll();
        log.info("[MY CONTROLLER] After GET Found {} things",list.size());
        return list;
    }
}
