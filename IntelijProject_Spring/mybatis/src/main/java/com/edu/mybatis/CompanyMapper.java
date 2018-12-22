package com.edu.mybatis;

import com.edu.mybatis.bean.Company;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {
    public Company getComById(Integer id);
    public void insertCom(Company com);
}
