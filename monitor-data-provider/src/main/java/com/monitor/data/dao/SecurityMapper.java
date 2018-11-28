package com.monitor.data.dao;

import com.monitor.data.framework.DataSource;
import com.monitor.data.framework.DataSources;
import com.monitor.data.pojo.Security;

public interface SecurityMapper {
    @DataSource(DataSources.MASTER)
    Security selectByPrimaryKey(String fSecuritykey);
    @DataSource(DataSources.SLAVE)
    Security selectByPrimaryKey2(String fSecuritykey);

}