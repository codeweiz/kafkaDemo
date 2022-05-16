package cn.microboat.kafkaDemo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author zhouwei
 */
@Data
public class Message {
    /**
     * 消息 id
     */
    private Long id;

    /**
     * 消息内容
     */
    private String msg;

    /**
     * 消息发送时间
     */
    private Date sendTime;
}
