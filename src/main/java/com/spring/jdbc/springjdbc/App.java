package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx=new ClassPathXmlApplicationContext("configbeans.xml");
        JdbcTemplate tmp=(JdbcTemplate) ctx.getBean("jdbcTemplate");
        String sql="insert into student(id,name,city)values(?,?,?)"; 
        int r = tmp.update(sql,100,"Pratap Dutta","Bhadrak");
        System.out.println(r);
    }
}
