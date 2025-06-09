package com.project.demo.controller;

import com.project.demo.entity.VehicleInformation;
import com.project.demo.service.VehicleInformationService;
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
 * 车辆信息：(VehicleInformation)表控制层
 *
 */
@RestController
@RequestMapping("/vehicle_information")
public class VehicleInformationController extends BaseController<VehicleInformation, VehicleInformationService> {

    /**
     * 车辆信息对象
     */
    @Autowired
    public VehicleInformationController(VehicleInformationService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> maplicense_plate = new HashMap<>();
        maplicense_plate.put("license_plate",String.valueOf(paramMap.get("license_plate")));
        List listlicense_plate = service.selectBaseList(service.select(maplicense_plate, new HashMap<>()));
        if (listlicense_plate.size()>0){
            return error(30000, "字段车牌号码内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
