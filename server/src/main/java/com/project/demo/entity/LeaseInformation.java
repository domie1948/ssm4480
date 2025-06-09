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
 * 租赁信息：(LeaseInformation)表实体类
 *
 */
@TableName("`lease_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class LeaseInformation implements Serializable {

    // LeaseInformation编号
    @TableId(value = "lease_information_id", type = IdType.AUTO)
    private Integer lease_information_id;

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
    // 租赁原价
    @TableField(value = "`original_rental_price`")
    private Integer original_rental_price;
    // 租赁现价
    @TableField(value = "`current_rental_price`")
    private Integer current_rental_price;
    // 租赁日期
    @TableField(value = "`lease_date`")
    private Timestamp lease_date;
    // 取车地址
    @TableField(value = "`pickup_address`")
    private String pickup_address;
    // 退车地址
    @TableField(value = "`return_address`")
    private String return_address;
    // 使用天数
    @TableField(value = "`usage_days`")
    private Integer usage_days;
    // 租赁费用
    @TableField(value = "`rental_fees`")
    private String rental_fees;
    // 租赁用户
    @TableField(value = "`rental_users`")
    private Integer rental_users;
    // 用户姓名
    @TableField(value = "`user_name`")
    private String user_name;
    // 身份证号
    @TableField(value = "`id_number`")
    private String id_number;
    // 联系电话
    @TableField(value = "`contact_number`")
    private String contact_number;




    // 支付状态
    @TableField(value = "pay_state")
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @TableField(value = "pay_type")
    private String pay_type;






    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
