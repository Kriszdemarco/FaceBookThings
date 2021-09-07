package com.company;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    ArrayList<User> freindList = new ArrayList<>();
    ArrayList<Post> postList = new ArrayList<>();


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addPost(Post post) {
        postList.add(post);
    }

    public void removePost(Post post) {
        postList.remove(post);
    }

    public void addFriend(User user) {
        freindList.add(user);
    }

    public void removeFriend(User user) {
        freindList.remove(user);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<User> getFreindList() {
        return freindList;
    }

    public ArrayList<Post> getPostList() {
        return postList;
    }

    @Override
    public boolean equals(Object user) {
        User u = (User) user;
        return u.getId() == this.id;
    }

    @Override
    public boolean equals(Post post) {
        return post.getId() == this.id;
    }

    @Override
    public String toString(){
        return "id:"+String.valueOf(id) + "name: " + name;
    }

}
