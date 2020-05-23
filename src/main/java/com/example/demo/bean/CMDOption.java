package com.example.demo.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;



@Slf4j
@Component
public class CMDOption implements CommandLineRunner {

  /*  @Autowired
    private OrderProcessor orderProcessor;

    @Resource
    private Buyer buyer;*/
    @Override
    public void run(String... args) throws Exception {
        /*log.info("Receive incoming args:{}", Arrays.toString(args));
        for(int i = 0;i < args.length;i++){
            log.info("args[{}]:{}", i, args[i]);
        }*/
       // orderProcessor.process(3);
      //  System.out.print("Buyer Total Fee:"+ this.buyer.getTotalFee());

    }
}
