package com.lzGeorge.app.dao.entity;

import java.io.Serializable;

public class StudentInfo implements Serializable {
    private Integer sno;

    private String classes;

    private String sname;

    private String scode;

    private String ssex;

    private String sn;

    private String snp;

    private String tell;

    private String tels;

    private String qq;

    private String sliving;

    private String slive;

    private String youbian;

    private String htell;

    private String sfathername;

    private String sftell;

    private String smothername;

    private String smtell;

    private static final long serialVersionUID = 1L;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode == null ? null : scode.trim();
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getSnp() {
        return snp;
    }

    public void setSnp(String snp) {
        this.snp = snp == null ? null : snp.trim();
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell == null ? null : tell.trim();
    }

    public String getTels() {
        return tels;
    }

    public void setTels(String tels) {
        this.tels = tels == null ? null : tels.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getSliving() {
        return sliving;
    }

    public void setSliving(String sliving) {
        this.sliving = sliving == null ? null : sliving.trim();
    }

    public String getSlive() {
        return slive;
    }

    public void setSlive(String slive) {
        this.slive = slive == null ? null : slive.trim();
    }

    public String getYoubian() {
        return youbian;
    }

    public void setYoubian(String youbian) {
        this.youbian = youbian == null ? null : youbian.trim();
    }

    public String getHtell() {
        return htell;
    }

    public void setHtell(String htell) {
        this.htell = htell == null ? null : htell.trim();
    }

    public String getSfathername() {
        return sfathername;
    }

    public void setSfathername(String sfathername) {
        this.sfathername = sfathername == null ? null : sfathername.trim();
    }

    public String getSftell() {
        return sftell;
    }

    public void setSftell(String sftell) {
        this.sftell = sftell == null ? null : sftell.trim();
    }

    public String getSmothername() {
        return smothername;
    }

    public void setSmothername(String smothername) {
        this.smothername = smothername == null ? null : smothername.trim();
    }

    public String getSmtell() {
        return smtell;
    }

    public void setSmtell(String smtell) {
        this.smtell = smtell == null ? null : smtell.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sno=").append(sno);
        sb.append(", classes=").append(classes);
        sb.append(", sname=").append(sname);
        sb.append(", scode=").append(scode);
        sb.append(", ssex=").append(ssex);
        sb.append(", sn=").append(sn);
        sb.append(", snp=").append(snp);
        sb.append(", tell=").append(tell);
        sb.append(", tels=").append(tels);
        sb.append(", qq=").append(qq);
        sb.append(", sliving=").append(sliving);
        sb.append(", slive=").append(slive);
        sb.append(", youbian=").append(youbian);
        sb.append(", htell=").append(htell);
        sb.append(", sfathername=").append(sfathername);
        sb.append(", sftell=").append(sftell);
        sb.append(", smothername=").append(smothername);
        sb.append(", smtell=").append(smtell);
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
        StudentInfo other = (StudentInfo) that;
        return (this.getSno() == null ? other.getSno() == null : this.getSno().equals(other.getSno()))
            && (this.getClasses() == null ? other.getClasses() == null : this.getClasses().equals(other.getClasses()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
            && (this.getScode() == null ? other.getScode() == null : this.getScode().equals(other.getScode()))
            && (this.getSsex() == null ? other.getSsex() == null : this.getSsex().equals(other.getSsex()))
            && (this.getSn() == null ? other.getSn() == null : this.getSn().equals(other.getSn()))
            && (this.getSnp() == null ? other.getSnp() == null : this.getSnp().equals(other.getSnp()))
            && (this.getTell() == null ? other.getTell() == null : this.getTell().equals(other.getTell()))
            && (this.getTels() == null ? other.getTels() == null : this.getTels().equals(other.getTels()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getSliving() == null ? other.getSliving() == null : this.getSliving().equals(other.getSliving()))
            && (this.getSlive() == null ? other.getSlive() == null : this.getSlive().equals(other.getSlive()))
            && (this.getYoubian() == null ? other.getYoubian() == null : this.getYoubian().equals(other.getYoubian()))
            && (this.getHtell() == null ? other.getHtell() == null : this.getHtell().equals(other.getHtell()))
            && (this.getSfathername() == null ? other.getSfathername() == null : this.getSfathername().equals(other.getSfathername()))
            && (this.getSftell() == null ? other.getSftell() == null : this.getSftell().equals(other.getSftell()))
            && (this.getSmothername() == null ? other.getSmothername() == null : this.getSmothername().equals(other.getSmothername()))
            && (this.getSmtell() == null ? other.getSmtell() == null : this.getSmtell().equals(other.getSmtell()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSno() == null) ? 0 : getSno().hashCode());
        result = prime * result + ((getClasses() == null) ? 0 : getClasses().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getScode() == null) ? 0 : getScode().hashCode());
        result = prime * result + ((getSsex() == null) ? 0 : getSsex().hashCode());
        result = prime * result + ((getSn() == null) ? 0 : getSn().hashCode());
        result = prime * result + ((getSnp() == null) ? 0 : getSnp().hashCode());
        result = prime * result + ((getTell() == null) ? 0 : getTell().hashCode());
        result = prime * result + ((getTels() == null) ? 0 : getTels().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getSliving() == null) ? 0 : getSliving().hashCode());
        result = prime * result + ((getSlive() == null) ? 0 : getSlive().hashCode());
        result = prime * result + ((getYoubian() == null) ? 0 : getYoubian().hashCode());
        result = prime * result + ((getHtell() == null) ? 0 : getHtell().hashCode());
        result = prime * result + ((getSfathername() == null) ? 0 : getSfathername().hashCode());
        result = prime * result + ((getSftell() == null) ? 0 : getSftell().hashCode());
        result = prime * result + ((getSmothername() == null) ? 0 : getSmothername().hashCode());
        result = prime * result + ((getSmtell() == null) ? 0 : getSmtell().hashCode());
        return result;
    }
}