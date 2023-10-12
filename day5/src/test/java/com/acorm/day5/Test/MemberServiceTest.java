package com.acorm.day5.Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/test.xml" , "file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )
public class MemberServiceTest {

	@Autowired
	MemberService s;
	
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		ArrayList<Member> list = s.getMemberList();
		assertTrue(list.size() >=1);
	}

}
