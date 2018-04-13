package li.jesse.aop;

import li.jesse.aop.waiter.Waiter;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Aspect
public class AspectTest {

    //与非运算
    @Before("!target(li.jesse.aop.waiter.NaiveWaiter) && execution(* serveTo(..))")
    public void notServeInNaiveWaiter(){
        System.out.println("--notServeInNaiveWaiter() executed!--");
    }
    //与运算
    @After("within(li.jesse.aop.waiter.*) && execution(* greetTo(..))")
    public void greetToFun(){
        System.out.println("--greetToFun() executed!--");
    }
    //或运算
    @AfterReturning("target(li.jesse.aop.waiter.Waiter)")
    public void waiterOrSeller(){
        System.out.println("--waiterOrSeller() executed!--");
    }

    @Test
    public void pointAspectJTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/Beans.xml");
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
//        Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
        naiveWaiter.greetTo("John");
        naiveWaiter.serveTo("John");
//        naughtyWaiter.greetTo("Tom");
//        naughtyWaiter.serveTo("Tom");
    }
}
