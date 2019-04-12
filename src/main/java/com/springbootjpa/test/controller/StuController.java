package com.springbootjpa.test.controller;

import com.springbootjpa.test.dto.ResponseDto;
import com.springbootjpa.test.model.Stu;
import com.springbootjpa.test.service.StuService;
import com.springbootjpa.test.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author  zufeichao
 */
@RestController
@RequestMapping("/stu")
public class StuController {

     @Autowired
     private StuService stuService;

     @GetMapping(value = "/findStu/{id}")
     public Stu findStu(@PathVariable("id") Integer id){
         return stuService.findStuById(id);
     }

     @GetMapping("/list")
     public ResponseDto listStu( Integer page, Integer size){
          page = page == null ? 0 :page;
          size = size == null ? 3 :size;
          PageRequest pageRequest = PageRequest.of(page,size);
          Page<Stu> list = stuService.listStu(pageRequest);
          return ResultUtil.getResult(list);
     }

}
