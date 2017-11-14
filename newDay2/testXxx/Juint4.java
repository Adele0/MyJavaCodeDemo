package cn.itsource.testXxx;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//右键--properties --java build path --Library -- add Library--JUnit
//JUnit3 extends TestCase(junit.framework)
//JUnit3 规则testXxx
//运行：右键runAs(不选择test名称，runAs是测试所有，选中只测试选中的那个)
//左侧绿色条幅代表无误，红色是错误，提示在左下角。Method afterClass() should be static
//不添加@BeforeClass @AfterClass @Before @After @Test 是不能正常运行的

public class Juint4 {
	
	@BeforeClass
	public static void beforClass() {
		System.out.println("@BeforeClass只会在最初的方法开始前调用一次");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterClass只会在最后的方法结束后调用一次");
	}
	
	@Before
	public void before() {
		System.out.println("@Before会在每个test方法开始前调用一次");
	}
	
	@After
	public void after() {
		System.out.println("@After会在每个test方法结束后调用一次");
		System.out.println("--------------------------------------------------");
	}
	
	@Test
	public void test1() throws Exception {//直接输入test
		System.out.println("JUnit4不用extends");
	}

	@Test
	public void headache() throws Exception {
		System.out.println("JUnit4的test名字可以任意改");
	}
	
	
}
