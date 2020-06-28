package Tenant;

import Services.TenantService;

import java.util.Date;

public class LeavingTenant implements TenantService {
    private String tenantType;
    Date leavingDate;
    @Override
    public void setTenantType(String tenantType) {

    }

    @Override
    public String getTenantType() {
        return "Leaving";
    }

    @Override
    public void setDate(Date date) {
        this.leavingDate=date;
    }

    @Override
    public Date getDate() {
        return this.leavingDate;
    }
}
