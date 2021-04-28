package com.ingyu.connection;
public abstract class AbstConnectionHelper {
    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);

    protected abstract String connection(String info);

    public String requestConnection(String encodedString) {
        String decodedString = doSecurity(encodedString);

        String id = decodedString;
        String password = "efgh";
        if (!authentication(id, password)) {
            throw new Error("[ERROR] Authentication Failed");
        }

        String userName = "username";
        int i = authorization(userName);

        switch (i) {
        case -1:
            throw new Error("[ERROR] Can't Connect After 22:00");
        case 0:
            System.out.println("[DEBUG] Game Master");
            break;
        case 1:
            System.out.println("[DEBUG] VIP User");
            break;
        case 2:
            System.out.println("[DEBUG] Free User");
            break;
        case 3:
            System.out.println("[DEBUG] Not Authorized");
            break;
        default:
            System.out.println("[ERROR] Authorization Error");
            break;
        }

        return connection("");
    }
}
