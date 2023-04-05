package com.example.onlineauctionsellingecommerce.model;
import com.example.onlineauctionsellingecommerce.entity.Role;
import lombok.Data;

@Data
public class RoleModel {
    private Long id;
    private String role;

    public Role disassemble(){
        Role role1=new Role();
        role1.setId(id);
        role1.setRoleName(role);
        return  role1;
    }
    public RoleModel assemble(Role role){
        RoleModel roleModel=new RoleModel();
        roleModel.setId(role.getId());
        roleModel.setRole(role.getRoleName());
        return roleModel;
    }
}
