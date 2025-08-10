package Java.Training.MeetingRoom.src;

public class Admin {
    int id;
    String name;
    private final String accessToken;

    Admin(int id, String name, String accessToken) {
        this.id = id;
        this.name = name;
        this.accessToken = accessToken;
    }

    String getAccessToken() {
        return this.accessToken;
    }
}
