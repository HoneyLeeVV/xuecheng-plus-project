package com.xuecheng.content;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description Service接口测试
 * @Author:星海
 * @CreateTime:2023/4/209:27
 */
@SpringBootTest
public class CourseBaseServiceTests {
    @Autowired
    private CourseBaseInfoService courseBaseInfoService;
    @Test
    void queryCourseBaseList(){
        PageParams pageParams = new PageParams();
        pageParams.setPageNo(1L);
        pageParams.setPageSize(2L);

        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto();

        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParamsDto);
        System.out.println(courseBasePageResult);


    }

}
