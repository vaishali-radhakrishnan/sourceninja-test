package com.kannan.testsourcewalkertest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    
    public static void test(String s, int i, List<String> list, Map<String, String> map){
    	System.out.println(" inside dummy");
    }

  public static void main(String[] args) {
	  System.out.println("inside spring main ");
	  List<String> list = new ArrayList<String>();
	  Map<String, String> map = new HashMap<String, String>();
	  test("s", 1, list, map);
     /* ApplicationContext context = 
          new AnnotationConfigApplicationContext(Application.class);
      MessagePrinter printer = context.getBean(MessagePrinter.class);
      printer.printMessage();*/
  }
  
  public static void springTest(String[] args) {
	  System.out.println("inside spring test ");
	  List<String> list = new ArrayList<String>();
	  Map<String, String> map = new HashMap<String, String>();
	  test("s", 1, list, map);
      ApplicationContext context = 
          new AnnotationConfigApplicationContext(Application.class);
      MessagePrinter printer = context.getBean(MessagePrinter.class);
      printer.printMessage();
  }
}