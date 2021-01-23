package cn.xf.service;

import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.service.SegmentService;
import com.sankuai.inf.leaf.service.SnowflakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author xf
 * @date 2021-01-23
 */
@Service
public class DistributedIdService {

    //号段模式service
    @Autowired
    private SegmentService segmentService;
    //雪花模式
    @Autowired
    private SnowflakeService snowflakeService;

    public Result getSegmentId(){
        Result id = segmentService.getId("leaf-segment-test");
        return id;
    }

    public Result getSnowflakeId(){
        Result xf = snowflakeService.getId("xf");
        return xf;
    }

}
