package Tenant;

import Room.Room;
import Services.TenantService;

public class TenantInfo {
    private String NID, name, permanentAddress;
    TenantService tenantService;
    Room room;

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public void setTenantStatus(TenantService tenantService){ this.tenantService=tenantService;}

    public TenantService getTenantStatus(){ return this.tenantService;}

    public void setRoom(Room room){
        this.room=room;
    }
    public Room getRoom(){
        return this.room;
    }



}
