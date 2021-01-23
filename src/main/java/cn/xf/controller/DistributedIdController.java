package cn.xf.controller;

import cn.xf.service.DistributedIdService;
import com.sankuai.inf.leaf.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author xf
 * @date 2021-01-23
 */
@RestController
public class DistributedIdController {

    @Autowired
    private DistributedIdService distributedIdService;

    @GetMapping("/getSegmentId")
    private Result getSegmentId(){
       return distributedIdService.getSegmentId();
    }

    @GetMapping("/getSnowflakeId")
    private Result getSnowflakeId(){
        return distributedIdService.getSnowflakeId();
    }



}
