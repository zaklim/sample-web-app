import org.junit.Test;
import org.mockito.Spy;
import static org.mockito.Mockito.verify;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import static org.mockito.ArgumentMatchers.anyString;

@RunWith(MockitoJUnitRunner.class)
public class HelloJenkinsTest{
	@Spy
	private HelloJenkins hj;

	@Test
        public void should_call_display(){
		hj.display("Hello Jenkins");
		verify(hj).display(anyString());
	}
}