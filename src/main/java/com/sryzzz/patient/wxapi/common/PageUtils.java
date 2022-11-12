package com.sryzzz.patient.wxapi.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果封装
 *
 * @author sryzzz
 * @create 2022/11/12 13:57
 * @description 分页结果封装
 */
@Data
public class PageUtils implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总记录数
     */
    private long totalCount;

    /**
     * 每页记录数
     */
    private int pageSize;

    /**
     * 总页数
     */
    private int totalPage;

    /**
     * 当前页数
     */
    private int pageIndex;

    /**
     * 列表数据
     */
    private List<?> list;

    public PageUtils(List<?> list, long totalCount, int pageIndex, int pageSize) {
        this.list = list;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
        this.totalPage = (int) Math.ceil((double) totalCount / pageSize);
    }

}
