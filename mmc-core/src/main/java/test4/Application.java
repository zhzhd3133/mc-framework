package test4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = null;
        try {
            printer = context.getBean(MessagePrinter.class);
        }catch (Exception e){

        }

        printer.printMessage();
    }

}
