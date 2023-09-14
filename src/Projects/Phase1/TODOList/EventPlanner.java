package Projects.Phase1.TODOList;

import java.util.ArrayList;
import java.util.List;

public class EventPlanner {

    private List<String> events;
//    private String EventTime;


    public EventPlanner() {
        events = new ArrayList<>();
    }

    public void addEvent(String eventName){
        if (events.contains(eventName)){
            System.out.println("Event already exists");
            return;
        }
        else{
            events.add(eventName);
            System.out.println("Event successfully added");
        }
    }

    public void removeEvent(String eventName){
        if (!events.contains(eventName)){
            System.out.println("Event does not exist");
        }
        else{
            events.remove(eventName);
            System.out.println("Event removed");
        }
    }

    public void listEvents(){

        if (events.isEmpty()){
            System.out.println("No activity present");
        }
        for (String event: events){
            System.out.println(event);
        }
    }
}
