package cn.insectmk.dailyeats.framework.domain.model;

import cn.insectmk.dailyeats.system.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.util.Collection;
import java.util.List;

/**
 * @Description 系统用户信息-用于Security
 * @Author makun
 * @Date 2024/10/16 20:02
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class SysUser implements UserDetails {
    @Serial
    private static final long serialVersionUID = 1L;

    /** 用户信息*/
    private final User user;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
