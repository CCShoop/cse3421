public class Event {
    private String eventTime;
    private String eventLocation;
    private String eventInfo;

    public Event(String name, String time, String location, String info) {
        super(name);
        this.eventTime = time;
        this.eventLocation = location;
        this.eventInfo = info;
    }
}

