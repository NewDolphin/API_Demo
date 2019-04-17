package com.springapp;

/**
 * Created by xiepeng on 16/8/26.
 */
public class LeaveVo{
    private String id;
    private String name;
    private int time;
    private String type;
    private String reason;
    private String examine1ID;
    private String examine2ID;


    public LeaveVo(String id, String name, int time, String type, String reason, String examine1ID, String examine2ID) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.type = type;
        this.reason = reason;
        this.examine1ID = examine1ID;
        this.examine2ID = examine2ID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getExamine1ID() {
        return examine1ID;
    }

    public void setExamine1ID(String examine1ID) {
        this.examine1ID = examine1ID;
    }

    public String getExamine2ID() {
        return examine2ID;
    }

    public void setExamine2ID(String examine2ID) {
        this.examine2ID = examine2ID;
    }

    @Override
    public String toString() {
        return "LeaveVo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", type='" + type + '\'' +
                ", reason='" + reason + '\'' +
                ", examine1ID='" + examine1ID + '\'' +
                ", examine2ID='" + examine2ID + '\'' +
                '}';
    }
}
