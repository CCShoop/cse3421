import java.util.ArrayList;
import java.util.List;

public class EventHandler {
    List <Event> events = new ArrayList <Event>();
    private ServerHandler serverHandler;

    public EventHandler(ServerHandler serverHandler) {
        this.serverHandler = serverHandler;
    }

    public List <Event> getEvents(String address, Int range) {
        //return events
    }

    public Event getEventInfo(Event event) {
        //return event info
    }

    public void saveEvent(Event event) {
        //save event for user on server
    }
}

