package com.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @Description 课程条件查询模型类
 * @Author:星海
 * @CreateTime:2023/3/2922:08
 */
@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String Status;
}
