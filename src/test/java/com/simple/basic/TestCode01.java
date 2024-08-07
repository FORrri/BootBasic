package com.simple.basic;

import com.simple.basic.command.BuilderVO;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //테스트코드의 순서를 지정
                //테스트코드가 위에서부터 아래로 완료되는 것은 아님 (Order로 순서 지정)
                //Order은 @TestMethodOrder(MethodOrderer.OrderAnnotation.class) 와 함께 사용됨
public class TestCode01 {

    //alt+enter 로 run실행
//    @Test
//    @Order(2)
//    public void testCode01() {
//        System.out.println("test code1번 실행됨");
//    }
//    @Test
//    @Order(1)
//    public void testCode02() {
//        System.out.println("test code2번 실행됨");
//    }
    @Test
    public void testCode03() {

        //한번 값이 지정되면, 변수 값을 바꿀 수 없음 불변성 제공
        //값의 타입을 명확하게 확인할 수 있음.
        //getter, setter 쓰지 말라는 것은 아님
        BuilderVO vo = BuilderVO.builder()
                                .name("홍길동")
                                .age(10)
                                .build();
        System.out.println(vo.toString());


    }

}
