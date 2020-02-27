package com.tian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tian.dao.CustomerTableDao;
import com.tian.entity.CustomerTable;
import com.tian.service.CustomerTableService;
import org.springframework.stereotype.Service;

/**
 * (CustomerTable)表服务实现类
 *
 * @author makejava
 * @since 2020-02-27 10:59:19
 */
@Service("customerTableService")
public class CustomerTableServiceImpl extends ServiceImpl<CustomerTableDao, CustomerTable> implements CustomerTableService {

}