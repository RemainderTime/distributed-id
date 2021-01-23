package cn.xf.service;

import cn.xf.DistributedIdApplication;
import com.sankuai.inf.leaf.common.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;


@SpringBootTest
@RunWith(JUnit4.class)
public class DistributedIdServiceTest {

    @Autowired
    private DistributedIdService distributedIdService;

    @Test
    public void segmentId(){
        Result segmentId = distributedIdService.getSegmentId();
        System.out.println(segmentId);
    }

}
