package org.example.models;

public class ToDo {
    private int id;
    private User user;
    private String todo;
    private String expiryDate;
    private String createDate;
    private String modifieData;

    public ToDo(){

    }

    public ToDo(int id, User user, String todo, String expiryDate, String createDate, String modifieData) {
        this.id = id;
        this.user = user;
        this.todo = todo;
        this.expiryDate = expiryDate;
        this.createDate = createDate;
        this.modifieData = modifieData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifieData() {
        return modifieData;
    }

    public void setModifieData(String modifieData) {
        this.modifieData = modifieData;
    }
}
