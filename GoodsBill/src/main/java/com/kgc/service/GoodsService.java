package com.kgc.service;

import com.kgc.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getlist(Integer gdistrict);
    List<Goods> getlistbyid(Integer id);
    int upt(Goods goods);


}
