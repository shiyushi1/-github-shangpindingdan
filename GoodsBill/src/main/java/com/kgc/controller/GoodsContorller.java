package com.kgc.controller;

import com.kgc.pojo.Goods;
import com.kgc.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class GoodsContorller {
    @Resource
    GoodsService goodsService;
    @RequestMapping("/wecome")
    public  String start(){
        return "/start";
    }
    @RequestMapping("/list")
    public String list(Integer gdistrict, Model model) {
        List<Goods> list=goodsService.getlist(gdistrict);
        model.addAttribute("list",list);
        return "/index";
    }
    @RequestMapping("/cha/{id}")
    public String chaid(@PathVariable Integer id, Model model){
        List<Goods> listbyid=goodsService.getlistbyid(id);
        model.addAttribute("list",listbyid);
        return "/upt";
    }
    @RequestMapping("/toupt")
    public String upt(Integer id,String gname,Integer billstatus,Double gprice,Long gcount,Date createtime){
        Goods goods=new Goods();
        goods.setId(id);
        goods.setGname(gname);
        goods.setBillstatus(billstatus);
        goods.getGdistrict();
        goods.setGprice(gprice);
        goods.setGcount(gcount);
        goods.setCreatetime(new Date());
        int i=goodsService.upt(goods);
        return "redirect:/wecome";
    }
}
