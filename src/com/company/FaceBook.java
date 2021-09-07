package com.company;

import java.util.ArrayList;

public class FaceBook {
    ArrayList<User> users = new ArrayList<>();

    public void listOfUsers(){
        for (int i=0; i<users.size(); i++){
            System.out.println(users.get(i));
        }
    }

    public void logIn(User user){
        //todo: complite the metod
    }

    public void post(int id, Post post){

    }

    public void listPostByUser(int id){
        //todo: user post
    }

    public void likePost(int uId, int pId){
        
    }
}
