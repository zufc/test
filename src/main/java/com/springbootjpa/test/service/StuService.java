package com.springbootjpa.test.service;

import com.springbootjpa.test.model.Stu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author zufeichao
 */
public interface StuService {
    /**
     * 根据ID查找学生
     * @param id
     * @return
     */
    Stu findStuById(Integer id);

    /**
     * 返回查询列表
     * @param pageable
     * @return
     */
    Page<Stu> listStu(Pageable pageable);
}
