package org.akm.integration.report;

import java.io.Serializable;

public class WbsElementDto implements Serializable {

    private static final long serialVersionUID = 6553002794236814509L;

    private String clientId;
    private String unitId;

    public String code;

    public String description;

    private String companyCode;

    private String profitCenter;
    private Boolean idaFlag;

    private Boolean active;

    private String project;
    private String projectDescription;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getProfitCenter() {
        return profitCenter;
    }

    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
    }

    public Boolean getIdaFlag() {
        return idaFlag;
    }

    public void setIdaFlag(Boolean idaFlag) {
        this.idaFlag = idaFlag;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    @Override
    public String toString() {
        return "WbsElementDto [clientId=" + clientId + ", unitId=" + unitId + ", code=" + code + ", description=" + description + ", companyCode=" + companyCode + ", profitCenter=" + profitCenter + ", idaFlag=" + idaFlag + ", active=" + active + ", project=" + project + ", projectDescription=" + projectDescription + "]";
    }

}
