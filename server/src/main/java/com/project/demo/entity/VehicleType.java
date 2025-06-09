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
 * 车辆类型：(VehicleType)表实体类
 *
 */
@TableName("`vehicle_type`")
@Data
@EqualsAndHashCode(callSuper = false)
public class VehicleType implements Serializable {

    // VehicleType编号
    @TableId(value = "vehicle_type_id", type = IdType.AUTO)
    private Integer vehicle_type_id;

    // 车辆类型
    @TableField(value = "`vehicle_type`")
    private String vehicle_type;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
