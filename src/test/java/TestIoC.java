import com.tech.controller.MemberController;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {
    @Test
    public void test(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

        MemberController memberController = (MemberController) beanFactory.getBean("");

    }
}
