package codecheck;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

	App testTarget = new App();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_CLIアプリはWorldが与えられた場合にHelloWorldと出力できる() {
//		fail("まだ実装されていません");
//		testTarget.main(new String[] {"World"});
		String actual = testTarget.outputWithHello("World");
		assertThat(actual, is("Hello World"));
	}

}
