package com.nggirl.test.thinkinjva.testmainmethod;

import java.util.Date;

/**
 * 用户常用地址
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/4/19  12:06
 */
public class UserCommonAddress {
    private Integer id;
    private Integer userId;
    private Integer cityId;
    private Integer areaId;
    private String address;
    private String detail;
    private String bizName;
    private Date lastUsedTime;

    @Override
    public int hashCode() {
        int result;
        result = id;
        result = 31*result + userId;
        result = 31*result + cityId;
        result = 31*result + areaId;
        result = 31*result + (address != null ? address.hashCode() : 0);
        result = 31*result + (detail != null ? detail.hashCode() : 0);
        result = 31*result + (bizName != null ? bizName.hashCode() : 0);
        result = 31*result + (lastUsedTime != null ? lastUsedTime.hashCode() : 0);

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof UserCommonAddress)) return false;
        if (obj == null || getClass() != obj.getClass()) return false;
        UserCommonAddress o = (UserCommonAddress)obj;

        return id.equals(o.id) && userId.equals(o.userId) &&
                cityId.equals(o.cityId) && areaId.equals(o.areaId) &&
                address.equals(o.address) && detail.equals(o.detail) &&
                bizName.equals(o.bizName) && lastUsedTime.equals(o.lastUsedTime);
    }

}
