import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(applicationContext.getBean("helloworld", HelloWorld.class) == bean);
        System.out.println(applicationContext.getBean("cat", Cat.class) == applicationContext.getBean("cat", Cat.class));
    }
}