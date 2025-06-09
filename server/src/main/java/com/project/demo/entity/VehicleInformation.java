package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 车辆信息：(VehicleInformation)表实体类
 *
 */
@TableName("`vehicle_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class VehicleInformation implements Serializable {

    // VehicleInformation编号
    @TableId(value = "vehicle_information_id", type = IdType.AUTO)
    private Integer vehicle_information_id;

    // 车辆品牌
    @TableField(value = "`vehicle_brand`")
    private String vehicle_brand;
    // 车辆类型
    @TableField(value = "`vehicle_type`")
    private String vehicle_type;
    // 车辆车型
    @TableField(value = "`vehicle_model`")
    private String vehicle_model;
    // 车牌号码
    @TableField(value = "`license_plate`")
    private String license_plate;
    // 车载人数
    @TableField(value = "`number_of_people_on_board`")
    private String number_of_people_on_board;
    // 变速箱
    @TableField(value = "`transmission_case`")
    private String transmission_case;
    // 车辆位置
    @TableField(value = "`vehicle_location`")
    private String vehicle_location;
    // 车辆图片
    @TableField(value = "`vehicle_image`")
    private String vehicle_image;
    // 租赁原价
    @TableField(value = "`original_rental_price`")
    private Integer original_rental_price;
    // 租赁现价
    @TableField(value = "`current_rental_price`")
    private Integer current_rental_price;
    // 车辆详情
    @TableField(value = "`vehicle_details`")
    private String vehicle_details;

    // 点击数
    @TableField(value = "hits")
    private Integer hits;

    // 点赞数
    @TableField(value = "praise_len")
    private Integer praise_len;








    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
