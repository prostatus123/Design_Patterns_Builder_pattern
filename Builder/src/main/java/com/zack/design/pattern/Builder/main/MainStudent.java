package com.zack.design.pattern.Builder.main;

import com.zack.design.pattern.Builder.service.StudentBuilder;
import com.zack.design.pattern.Builder.serviceImpl.StudentConcreteBuilder;

public class MainStudent {


    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentConcreteBuilder()
                .setFirstName("Tuan")
                .setLastName("Nguyen Minh")
                .setId("123");

        System.out.println(studentBuilder.build());


    }

}
