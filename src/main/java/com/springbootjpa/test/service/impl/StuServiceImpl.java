package com.springbootjpa.test.service.impl;

import com.springbootjpa.test.dao.StuRepository;
import com.springbootjpa.test.model.Stu;
import com.springbootjpa.test.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author  zufeichao
 */
@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuRepository stuRepository;

    @Override
    public Stu findStuById(Integer id) {
        return stuRepository.getOne(id);
    }

    @Override
    public Page<Stu> listStu(Pageable pageable) {

        Page<Stu> stuList =  stuRepository.findAll(pageable);
        Page<Stu> pageStuList = new PageImpl<>(stuList.getContent(),pageable, stuList.getSize());
        return pageStuList;
    }


}
