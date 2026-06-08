package com.example.Task7Demo.Service;

import com.example.Task7Demo.Entity.EventRegistration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class EventService {
    HashMap<Integer, EventRegistration> registrations = new HashMap<>();
    public EventService() {
        LoadSampleEvent();
    }

    public void LoadSampleEvent(){
        registrations.put(1,new EventRegistration(1,"Mohammed"));
        registrations.put(2,new EventRegistration(2,"Khalid"));
        registrations.put(3,new EventRegistration(3,"Asma"));
    }

    public String deleteMultipleByIds(List<Integer> ids) {
        List<Integer> deletedIds = new ArrayList<>();
        List<Integer> notFoundIds = new ArrayList<>();


        for (Integer id : ids) {

            if (registrations.containsKey(id)) {
                registrations.remove(id);
                deletedIds.add(id);
            } else {
                notFoundIds.add(id);
            }
        }

        return "Total IDs received: " + ids.size() +
                " | Successfully deleted: " + deletedIds.size() +
                " | Deleted IDs: " + deletedIds +
                " | Not Found IDs: " + notFoundIds;

    }




}
