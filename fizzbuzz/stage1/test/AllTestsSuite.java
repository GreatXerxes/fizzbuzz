package fizzbuzz.stage1.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Stage1_Test_Buzz.class, Stage1_Test_Fizz.class,
		Stage1_Test_FizzBuzz.class, Stage1_Test_Incorrect.class,
		Stage1_Test_Num.class })
public class AllTestsSuite {

}
