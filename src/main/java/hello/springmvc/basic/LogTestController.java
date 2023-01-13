package hello.springmvc.basic;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController
 * 반환값으로 뷰를 찾는것이아니라 http 메세지 바디에 바로 입력한다.
 */
@Slf4j
@RestController
public class LogTestController {


    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";
        System.out.println("name = " + name);
        log.trace("trace log ={}",name);
        log.debug("debug log ={}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        int answer = Arrays.asList(1,2,3).stream().reduce(1,(a,b)->a+b);
        log.info("result = {}",answer);
        return "ok";
    }
}
