package org.cxytiandi.conf.springboot.demo.conf;

import lombok.Data;
import org.cxytiandi.conf.client.annotation.ConfField;
import org.cxytiandi.conf.client.annotation.CxytianDiConf;

/**
 * <p></p>
 * Created by @author zhezhiyong@163.com on 2018/8/30.
 */
@Data
@CxytianDiConf(system="common")
public class JwtConf {
    @ConfField("accessToken有效期,秒")
    private int accessToken= 0;
    @ConfField("refreshToken有效期,秒")
    private int refreshToken= 0;
    @ConfField("删除过期时间,秒")
    private int exp = 0;
    @ConfField("加密密钥")
    private String salt="0";

}
