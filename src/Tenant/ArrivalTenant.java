package Tenant;

import Services.TenantService;

import java.util.Date;

public class ArrivalTenant implements TenantService {
    Date dateOfAdvanced;
    @Override
    public void setTenantType(String tenantType) {

    }

    @Override
    public String getTenantType() {
        return "Arriving";
    }

    @Override
    public void setDate(Date date) {
        this.dateOfAdvanced=date;
    }

    @Override
    public Date getDate() {
        return this.dateOfAdvanced;
    }
}
