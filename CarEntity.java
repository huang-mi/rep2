package com.xxxy.entity;

public class CarEntity {
    private int oid;
    private String oname;
    private CarTypeEntity ocid;
    private String ocolor;
    private double oprice;
    private double ohundred;
    private double ohigh;
    private double oavg;
    private String ofa;
    private String opicture;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public CarTypeEntity getOcid() {
        return ocid;
    }

    public void setOcid(CarTypeEntity ocid) {
        this.ocid = ocid;
    }

    public String getOcolor() {
        return ocolor;
    }

    public void setOcolor(String ocolor) {
        this.ocolor = ocolor;
    }

    public double getOprice() {
        return oprice;
    }

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public double getOhundred() {
        return ohundred;
    }

    public void setOhundred(double ohundred) {
        this.ohundred = ohundred;
    }

    public double getOhigh() {
        return ohigh;
    }

    public void setOhigh(double ohigh) {
        this.ohigh = ohigh;
    }

    public double getOavg() {
        return oavg;
    }

    public void setOavg(double oavg) {
        this.oavg = oavg;
    }

    public String getOfa() {
        return ofa;
    }

    public void setOfa(String ofa) {
        this.ofa = ofa;
    }

    public String getOpicture() {
        return opicture;
    }

    public void setOpicture(String opicture) {
        this.opicture = opicture;
    }

    public CarEntity(int oid, String oname, CarTypeEntity ocid, String ocolor, double oprice, double ohundred, double ohigh, double oavg, String ofa, String opicture) {
        this.oid = oid;
        this.oname = oname;
        this.ocid = ocid;
        this.ocolor = ocolor;
        this.oprice = oprice;
        this.ohundred = ohundred;
        this.ohigh = ohigh;
        this.oavg = oavg;
        this.ofa = ofa;
        this.opicture = opicture;
    }

    public CarEntity(String oname, CarTypeEntity ocid, String ocolor, double oprice, double ohundred, double ohigh, double oavg, String ofa, String opicture) {
        this.oname = oname;
        this.ocid = ocid;
        this.ocolor = ocolor;
        this.oprice = oprice;
        this.ohundred = ohundred;
        this.ohigh = ohigh;
        this.oavg = oavg;
        this.ofa = ofa;
        this.opicture = opicture;
    }

    public CarEntity() {
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                ", ocid=" + ocid +
                ", ocolor='" + ocolor + '\'' +
                ", oprice=" + oprice +
                ", ohundred=" + ohundred +
                ", ohigh=" + ohigh +
                ", oavg=" + oavg +
                ", ofa='" + ofa + '\'' +
                ", opicture='" + opicture + '\'' +
                '}';
    }
}
