package main.model.entities;

public class UserEntity {
    private String user_cnpjID;
    private String user_empName;
    private String user_name;
    private String user_email;
    private String user_password;
    
    public UserEntity(String user_cnpjID, String user_empName, String user_name, String user_email, String user_password) {
        this.user_cnpjID = user_cnpjID;
        this.user_empName = user_empName;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_password = user_password;
    }
    public UserEntity() {
        
    }
    public String getUser_empName() {
        return user_empName;
    }

    public void setUser_empName(String user_empName) {
        this.user_empName = user_empName;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_cnpjID() {
        return user_cnpjID;
    }

    public void setUser_cnpjID(String user_cnpjID) {
        this.user_cnpjID = user_cnpjID;
    }
    
}
