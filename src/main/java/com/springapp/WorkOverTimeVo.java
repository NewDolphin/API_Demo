package com.springapp;

/**
 * Created by xiepeng on 16/8/26.
 */
public class WorkOverTimeVo {
    private int id;
    private int time;
    private String reason;
    private String type;


    public WorkOverTimeVo(int id, int time, String reason, String type) {
        this.id = id;
        this.time = time;
        this.reason = reason;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "WorkOverTimeVo{" +
                "id=" + id +
                ", time=" + time +
                ", reason='" + reason + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
