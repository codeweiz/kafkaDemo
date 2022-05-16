package cn.microboat.kafkaDemo.producer;

import cn.microboat.kafkaDemo.pojo.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author zhouwei
 */
@Component
@Slf4j
public class KafkaProducer {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    private final Gson gson = new GsonBuilder().create();

    public void send(String msg) {

        Message message = new Message();
        message.setId(System.currentTimeMillis());
        message.setMsg(msg);
        message.setSendTime(new Date());

        log.info("send msg: " + gson.toJson(message) + ", by topic: test3");
        kafkaTemplate.send("topic", gson.toJson(message));
    }
}
