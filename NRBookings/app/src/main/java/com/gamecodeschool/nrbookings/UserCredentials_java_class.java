package com.gamecodeschool.nrbookings;



public class UserCredentials_java_class {
    String dId,dEmail,dPhn,dName;
    public UserCredentials_java_class()
    {

    }

    public UserCredentials_java_class(String dId, String dEmail, String dPhn, String dName) {
        this.dId = dId;
        this.dEmail = dEmail;
        this.dPhn = dPhn;
        this.dName = dName;
    }

    public String getdId() {
        return dId;
    }

    public String getdEmail() {
        return dEmail;
    }

    public String getdPhn() {
        return dPhn;
    }

    public String getdName() {
        return dName;
    }
}
