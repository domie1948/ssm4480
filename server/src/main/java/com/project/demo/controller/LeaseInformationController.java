package com.project.demo.controller;

import com.project.demo.entity.LeaseInformation;
import com.project.demo.service.LeaseInformationService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 租赁信息：(LeaseInformation)表控制层
 *
 */
@RestController
@RequestMapping("/lease_information")
public class LeaseInformationController extends BaseController<LeaseInformation, LeaseInformationService> {

    /**
     * 租赁信息对象
     */
    @Autowired
    public LeaseInformationController(LeaseInformationService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
