package com.ytech.facedetectionhttp.model;

public class Content {
    private String extra;

    private int voice_code;

    private String voice_text;

    private int is_upload_record;

    private int is_verify_online;

    private String user_id;

    public void setExtra(String extra){
        this.extra = extra;
    }
    public String getExtra(){
        return this.extra;
    }
    public void setVoice_code(int voice_code){
        this.voice_code = voice_code;
    }
    public int getVoice_code(){
        return this.voice_code;
    }
    public void setVoice_text(String voice_text){
        this.voice_text = voice_text;
    }
    public String getVoice_text(){
        return this.voice_text;
    }
    public void setIs_upload_record(int is_upload_record){
        this.is_upload_record = is_upload_record;
    }
    public int getIs_upload_record(){
        return this.is_upload_record;
    }
    public void setIs_verify_online(int is_verify_online){
        this.is_verify_online = is_verify_online;
    }
    public int getIs_verify_online(){
        return this.is_verify_online;
    }
    public void setUser_id(String user_id){
        this.user_id = user_id;
    }
    public String getUser_id(){
        return this.user_id;
    }

}
