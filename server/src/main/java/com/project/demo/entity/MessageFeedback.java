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
 * 留言反馈：(MessageFeedback)表实体类
 *
 */
@TableName("`message_feedback`")
@Data
@EqualsAndHashCode(callSuper = false)
public class MessageFeedback implements Serializable {

    // MessageFeedback编号
    @TableId(value = "message_feedback_id", type = IdType.AUTO)
    private Integer message_feedback_id;

    // 留言标题
    @TableField(value = "`message_title`")
    private String message_title;
    // 留言用户
    @TableField(value = "`message_user`")
    private Integer message_user;
    // 用户姓名
    @TableField(value = "`user_name`")
    private String user_name;
    // 留言日期
    @TableField(value = "`message_date`")
    private Timestamp message_date;
    // 留言内容
    @TableField(value = "`message_content`")
    private String message_content;
    // 回复状态
    @TableField(value = "`reply_status`")
    private String reply_status;
    // 留言回复
    @TableField(value = "`message_reply`")
    private String message_reply;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
