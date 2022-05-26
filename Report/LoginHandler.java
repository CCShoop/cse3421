public class LoginHandler {
    private String username;
    private String password;
    private Boolean verified = false;
    private ServerHandler serverHandler;

    public LoginHandler(ServerHandler serverHandler) {
        this.serverHandler = serverHandler;
    }

    public void login(String username, String password) {
        this.username = username;
        this.password = password;
        verified = serverHandler.authenticate(username, password);
    }
}

