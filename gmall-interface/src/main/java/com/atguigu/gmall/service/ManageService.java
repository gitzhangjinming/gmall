package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.*;

import java.util.List;

public interface ManageService {

    List<BaseCatalog1> getCatalog1();
    List<BaseCatalog2> getCatalog2(String catalog1Id);
    List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2);
    List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3);
    List<BaseAttrInfo> getAttrInfoList(BaseAttrInfo baseAttrInfo);
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);
    List<BaseAttrValue> getAttrValueList(String attrId);
    BaseAttrInfo getAttrInfo(String attrId);
}
