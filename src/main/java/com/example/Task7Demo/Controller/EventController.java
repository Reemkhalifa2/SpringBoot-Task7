package com.example.Task7Demo.Controller;

import com.example.Task7Demo.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;

    @DeleteMapping("/registrations")
    public String deleteRegistrations(@RequestBody List<Integer> ids){
        return eventService.deleteMultipleByIds(ids);
    }
}
