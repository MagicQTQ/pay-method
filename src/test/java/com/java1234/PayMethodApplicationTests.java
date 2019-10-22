package com.java1234;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PayMethodApplicationTests {

	@Test
	public void contextLoads() {
		Map<String,Object> m1 = new HashMap<>();
		m1.put("qwe",123);
		m1.put("qwe",456);

		System.out.println(m1.get("qwe"));
	}

}
