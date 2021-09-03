package com.ytech.facedetectionhttp.model;

public class FaceResponse {
    private int Result;

    private String Msg;

    private Content Content;

    public void setResult(int Result){
        this.Result = Result;
    }
    public int getResult(){
        return this.Result;
    }
    public void setMsg(String Msg){
        this.Msg = Msg;
    }
    public String getMsg(){
        return this.Msg;
    }
    public void setContent(Content Content){
        this.Content = Content;
    }
    public Content getContent(){
        return this.Content;
    }
}
