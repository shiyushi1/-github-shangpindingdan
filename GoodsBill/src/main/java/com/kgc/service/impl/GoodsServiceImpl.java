package com.kgc.service.impl;

import com.kgc.mapper.GoodsMapper;
import com.kgc.pojo.Goods;
import com.kgc.pojo.GoodsExample;
import com.kgc.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsMapper goodsMapper;
    @Override
    public List<Goods> getlist(Integer gdistrict) {
        GoodsExample example=new GoodsExample();
        GoodsExample.Criteria criteria=example.createCriteria();
        criteria.andGdistrictEqualTo(gdistrict);
        List<Goods> list=goodsMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<Goods> getlistbyid(Integer id) {
        GoodsExample example=new GoodsExample();
        GoodsExample.Criteria criteria=example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Goods> list=goodsMapper.selectByExample(example);
        return list;
    }

    @Override
    public int upt(Goods goods) {
        int i=goodsMapper.updateByPrimaryKeySelective(goods);
        return 0;
    }
}
