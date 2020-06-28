package Services;

import java.util.Date;

public interface TenantService {
    void setTenantType(String tenantType);
    String getTenantType();
    void setDate(Date date);
    Date getDate();

}
