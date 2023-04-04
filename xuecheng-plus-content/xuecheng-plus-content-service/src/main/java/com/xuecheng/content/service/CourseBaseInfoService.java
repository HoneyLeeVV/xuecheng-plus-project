package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @Description
 * @Author:星海
 * @CreateTime:2023/4/209:14
 */
public interface CourseBaseInfoService {
    /**
     *
     * @param pageParams 分页参数
     * @param queryCourseParamsDto 分页条件
     * @return
     */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    /**
     *添加课程基本信息
     * @param companyId 教学机构id
     * @param dto 课程基本信息
     * @return
     */
    CourseBaseInfoDto createCourseBase(long companyId, AddCourseDto dto);
}
