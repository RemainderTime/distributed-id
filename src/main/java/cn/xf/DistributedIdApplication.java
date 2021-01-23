package cn.xf;

import com.sankuai.inf.leaf.plugin.annotation.EnableLeafServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *
 * </p>
 *
 * @author xf
 * @date 2021-01-23
 */
@SpringBootApplication
@EnableLeafServer
public class DistributedIdApplication {

    public static void main(String[] args) {

        SpringApplication.run(DistributedIdApplication.class,args);

    }
}
