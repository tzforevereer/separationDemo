package com.tian.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tian.entity.CustomerTable;
import com.tian.service.CustomerTableService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (CustomerTable)表控制层
 *
 * @author makejava
 * @since 2020-02-27 10:59:19
 */
@RestController
@RequestMapping("customerTable")
public class CustomerTableController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerTableService customerTableService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param customerTable 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<CustomerTable> page, CustomerTable customerTable) {
        return success(this.customerTableService.page(page, new QueryWrapper<>(customerTable)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.customerTableService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param customerTable 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody CustomerTable customerTable) {
        return success(this.customerTableService.save(customerTable));
    }

    /**
     * 修改数据
     *
     * @param customerTable 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody CustomerTable customerTable) {
        return success(this.customerTableService.updateById(customerTable));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.customerTableService.removeByIds(idList));
    }
}