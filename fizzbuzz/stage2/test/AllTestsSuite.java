package fizzbuzz.stage2.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Stage2_Test_Buzz.class, Stage2_Test_Fizz.class,
		Stage2_Test_FizzBuzz.class, Stage2_Test_Incorrect.class,
		Stage2_Test_Num.class})
public class AllTestsSuite {

}
