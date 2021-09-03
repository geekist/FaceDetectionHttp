package com.ytech.facedetectionhttp.model;

import java.util.List;

public class FaceRecord {
    private String sn;

    private int Count;

    private List<FaceLog> logs ;

    public void setSn(String sn){
        this.sn = sn;
    }
    public String getSn(){
        return this.sn;
    }
    public void setCount(int Count){
        this.Count = Count;
    }
    public int getCount(){
        return this.Count;
    }
    public void setLogs(List<FaceLog> logs){
        this.logs = logs;
    }
    public List<FaceLog> getLogs(){
        return this.logs;
    }
}
