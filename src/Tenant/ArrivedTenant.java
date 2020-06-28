package Tenant;

import Services.TenantService;

import java.util.Date;

public class ArrivedTenant implements TenantService {
    Date dateOfArrival;
    @Override
    public void setTenantType(String tenantType) {

    }

    @Override
    public String getTenantType() {
        return "Arrived";
    }

    @Override
    public void setDate(Date date) {
        this.dateOfArrival=date;
    }

    @Override
    public Date getDate() {
        return this.dateOfArrival;
    }
}
