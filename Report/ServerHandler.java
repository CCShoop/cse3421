public class ServerHandler {
    private String serverAddress;

    public ServerHandler(String serverAddress) {
        this.serverAddress = serverAddress;
        connect(serverAddress);
    }

    public void connect(String serverAddress) {
        //connect to the server
    }

    public Boolean authenticate(String username, String password) {
        /*if (password is correct for username) {
            return true
        }
        else {
            return false
        }*/
    }

    public void saveAddress(String userAddress) {
        //save address to server
    }
}

