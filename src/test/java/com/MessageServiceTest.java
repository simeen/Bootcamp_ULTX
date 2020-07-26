import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes={com.MessageService.class})
public class MessageServiceTest {

	@Test
	public void testMessage() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	}	
	
	@Test
	public void testmultiply() {
	MessageService ms = new MessageService();	
	Assertions.assertEquals(ms.multiply(4,3), "Multiplication of 4 and 3 is 12");
	}
	
	  @Test
        public void testmultiply() {
        MessageService ms = new MessageService();
        Assertions.assertEquals(ms.multiply(5,5), "Multiplication of 5 and 5 is 25");
        }

	@Test
        public void type() {
        MessageService ms = new MessageService();
        Assertions.assertEquals(ms.type(4), "Entered number is even");
	}
	
	@Test
        public void type1() {
        MessageService ms = new MessageService();
        Assertions.assertEquals(ms.type(5), "Entered number is odd");
	}
	@Test
	public void primer() {
	MessageService ms = new MessageService();
	Assertions.assertEquals(ms.prime(8), "8 is not a Prime Number");
	}
	 @Test
        public void primers() {
        MessageService ms = new MessageService();
        Assertions.assertEquals(ms.prime(1), "1 is a Prime Number");
        }
}
