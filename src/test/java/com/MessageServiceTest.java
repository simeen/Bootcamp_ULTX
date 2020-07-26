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
	@Test
	public void large() {
	 MessageService ms = new MessageService();
        Assertions.assertEquals(ms.greater(4,3,1), "4 is the largest Number");
	}
        @Test
        public void larger() {
         MessageService ms = new MessageService();
        Assertions.assertEquals(ms.greater(3,4,1), "4 is the largest Number");
        }
	@Test
        public void largest() {
         MessageService ms = new MessageService();
        Assertions.assertEquals(ms.greater(1,3,4), "4 is the largest Number");
        }
	@Test
	public void cube(){
        MessageService ms = new MessageService();
        Assertions.assertEquals(ms.cube(5), 125);
        }
        @Test
        public void area(){
        MessageService ms = new MessageService();
        Assertions.assertEquals(ms.area(5,2), "Area of Triangle having base5 and width 2 is: 5.0");
        }
       @Test
        public void surname(){
        MessageService ms = new MessageService();
        Assertions.assertEquals(ms.surname("Enid","Blyton"), "Enid Blyton");
        }

}
