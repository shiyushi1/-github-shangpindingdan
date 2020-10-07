package com.kgc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Goods {
    private Integer id;

    private String gname;

    private Integer billstatus;

    private Integer gdistrict;

    private Double gprice;

    private Long gcount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public Integer getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(Integer billstatus) {
        this.billstatus = billstatus;
    }

    public Integer getGdistrict() {
        return gdistrict;
    }

    public void setGdistrict(Integer gdistrict) {
        this.gdistrict = gdistrict;
    }

    public Double getGprice() {
        return gprice;
    }

    public void setGprice(Double gprice) {
        this.gprice = gprice;
    }

    public Long getGcount() {
        return gcount;
    }

    public void setGcount(Long gcount) {
        this.gcount = gcount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}