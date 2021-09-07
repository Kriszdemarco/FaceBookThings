package com.company;

import java.util.ArrayList;

public abstract class Post {
    private int id;
    private User user;
    ArrayList<Like> likes = new ArrayList<>();

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Like> getLikes() {
        return likes;
    }

    public void addLike(Like like){
        likes.add(like);
    }

    public void removeLike(Like like){
        likes.remove(like);
    }

    @Override
    public boolean equals(Like like){
        return like.getId()==this.id;
    }
}
