package cn.microboat.kafkaDemo.controller;

import cn.microboat.kafkaDemo.producer.KafkaProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhouwei
 */
@RequestMapping("/kafka")
@RestController
public class KafkaController {

    @Resource
    private KafkaProducer kafkaProducer;

    @GetMapping("/send/{msg}")
    public void send(@PathVariable("msg") String msg) {
        kafkaProducer.send(msg);
    }

}
