package com.example.boottest.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.ArrayList;
import java.util.List;

public class PaginationExample {
    public static void main(String[] args) {
        // 假设有一个包含100个元素的列表
        List<Integer> dataList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            dataList.add(i);
        }

        int pageSize = 10; // 每页显示的数据条数
        int currentPage = 3; // 当前页码

        // 使用PageHelper进行分页设置
        PageHelper.startPage(currentPage, pageSize);

        // 获取分页数据
        List<Integer> pageData = dataList;

        // 封装分页结果
        PageInfo<Integer> pageInfo = new PageInfo<>(pageData);

        // 输出分页信息
        System.out.println("总记录数：" + pageInfo.getTotal());
        System.out.println("总页数：" + pageInfo.getPages());
        System.out.println("当前页码：" + pageInfo.getPageNum());
        System.out.println("每页显示的数据条数：" + pageInfo.getPageSize());
        System.out.println("当前页的数据条数：" + pageInfo.getSize());
        System.out.println("是否有上一页：" + pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页：" + pageInfo.isHasNextPage());
        System.out.println("是否为第一页：" + pageInfo.isIsFirstPage());
        System.out.println("是否为最后一页：" + pageInfo.isIsLastPage());
        System.out.println("当前页的数据：" + pageInfo.getList());
    }
}
