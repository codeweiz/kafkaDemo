package cn.microboat.kafkaDemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KafkaDemoApplicationTests {

	@Test
	void contextLoads() {
		String str = "ashiwdiwhdiw";
		str = str.replace("Z", "U");
		System.out.println(str);
	}

}
