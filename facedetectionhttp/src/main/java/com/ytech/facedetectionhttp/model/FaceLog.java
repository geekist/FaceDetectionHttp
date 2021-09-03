package com.ytech.facedetectionhttp.model;

public class FaceLog {
    private String user_id;

    private String recog_time;

    private String recog_type;

    private String photo;

    private String body_temperature;

    private String confidence;

    private int reflectivity;

    private double room_temperature;

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public void setRecog_time(String recog_time) {
        this.recog_time = recog_time;
    }

    public String getRecog_time() {
        return this.recog_time;
    }

    public void setRecog_type(String recog_type) {
        this.recog_type = recog_type;
    }

    public String getRecog_type() {
        return this.recog_type;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setBody_temperature(String body_temperature) {
        this.body_temperature = body_temperature;
    }

    public String getBody_temperature() {
        return this.body_temperature;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public String getConfidence() {
        return this.confidence;
    }

    public void setReflectivity(int reflectivity) {
        this.reflectivity = reflectivity;
    }

    public int getReflectivity() {
        return this.reflectivity;
    }

    public void setRoom_temperature(double room_temperature) {
        this.room_temperature = room_temperature;
    }

    public double getRoom_temperature() {
        return this.room_temperature;
    }

}



