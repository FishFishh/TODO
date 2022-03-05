package com.todo.demo.vo;
//VO层存在的意义，通俗的讲，VO层的存在就是方便前端获取数据，
//后端将前端的需要的数据做一个整合，打包成一个类。
//分页查询de参数
import lombok.Data;

import java.util.List;
@Data
public class Page<T> {
    private Integer pageNum;//页码
    private Integer pageSize;
    private Integer total;//统计行数
    private List<T> data;
}