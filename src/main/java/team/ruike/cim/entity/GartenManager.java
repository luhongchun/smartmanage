package team.ruike.cim.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class GartenManager extends BaseEntity {

    private String loginId;
    private String password;
    private boolean disabled;
    private String gartenUserId;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(boolean isDisabled) {
        this.disabled = isDisabled;
    }

    public String getGartenUserId() {
        return gartenUserId;
    }

    public void setGartenUserId(String gartenUserId) {
        this.gartenUserId = gartenUserId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}