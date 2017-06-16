package com.lzGeorge.app.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class StayInSchool implements Serializable {
    private Integer id;

    private String college;

    private String name;

    private String sex;

    private String snum;

    private String classes;

    private String address;

    private String tel;

    private String durTime;

    private String reason;

    private String teacher;

    private String teacherTel;

    private Date recordTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSnum() {
        return snum;
    }

    public void setSnum(String snum) {
        this.snum = snum == null ? null : snum.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getDurTime() {
        return durTime;
    }

    public void setDurTime(String durTime) {
        this.durTime = durTime == null ? null : durTime.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public String getTeacherTel() {
        return teacherTel;
    }

    public void setTeacherTel(String teacherTel) {
        this.teacherTel = teacherTel == null ? null : teacherTel.trim();
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", college=").append(college);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", snum=").append(snum);
        sb.append(", classes=").append(classes);
        sb.append(", address=").append(address);
        sb.append(", tel=").append(tel);
        sb.append(", durTime=").append(durTime);
        sb.append(", reason=").append(reason);
        sb.append(", teacher=").append(teacher);
        sb.append(", teacherTel=").append(teacherTel);
        sb.append(", recordTime=").append(recordTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StayInSchool other = (StayInSchool) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCollege() == null ? other.getCollege() == null : this.getCollege().equals(other.getCollege()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getSnum() == null ? other.getSnum() == null : this.getSnum().equals(other.getSnum()))
            && (this.getClasses() == null ? other.getClasses() == null : this.getClasses().equals(other.getClasses()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getDurTime() == null ? other.getDurTime() == null : this.getDurTime().equals(other.getDurTime()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getTeacher() == null ? other.getTeacher() == null : this.getTeacher().equals(other.getTeacher()))
            && (this.getTeacherTel() == null ? other.getTeacherTel() == null : this.getTeacherTel().equals(other.getTeacherTel()))
            && (this.getRecordTime() == null ? other.getRecordTime() == null : this.getRecordTime().equals(other.getRecordTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCollege() == null) ? 0 : getCollege().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getSnum() == null) ? 0 : getSnum().hashCode());
        result = prime * result + ((getClasses() == null) ? 0 : getClasses().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getDurTime() == null) ? 0 : getDurTime().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getTeacher() == null) ? 0 : getTeacher().hashCode());
        result = prime * result + ((getTeacherTel() == null) ? 0 : getTeacherTel().hashCode());
        result = prime * result + ((getRecordTime() == null) ? 0 : getRecordTime().hashCode());
        return result;
    }
}