package Tenant;

import Services.TenantService;

import java.util.Date;

public class LeftTenant implements TenantService {
    Date dateOfLeaving;
    @Override
    public void setTenantType(String tenantType) {

    }

    @Override
    public String getTenantType() {
        return "Left";
    }

    @Override
    public void setDate(Date date) {
        this.dateOfLeaving=date;
    }

    @Override
    public Date getDate() {
        return this.dateOfLeaving;
    }
}
