package cn.qqa.monitor.entity;

import java.util.Date;
import javax.annotation.Generated;

public class Platform {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String icon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer riskLevel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date lastSensorTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer sampleNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String creator;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String updater;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Platform withId(Integer id) {
        this.setId(id);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Platform withName(String name) {
        this.setName(name);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIcon() {
        return icon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Platform withIcon(String icon) {
        this.setIcon(icon);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUrl() {
        return url;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Platform withUrl(String url) {
        this.setUrl(url);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUrl(String url) {
        this.url = url;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getRiskLevel() {
        return riskLevel;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Platform withRiskLevel(Integer riskLevel) {
        this.setRiskLevel(riskLevel);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getLastSensorTime() {
        return lastSensorTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Platform withLastSensorTime(Date lastSensorTime) {
        this.setLastSensorTime(lastSensorTime);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLastSensorTime(Date lastSensorTime) {
        this.lastSensorTime = lastSensorTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSampleNumber() {
        return sampleNumber;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Platform withSampleNumber(Integer sampleNumber) {
        this.setSampleNumber(sampleNumber);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSampleNumber(Integer sampleNumber) {
        this.sampleNumber = sampleNumber;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCreator() {
        return creator;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Platform withCreator(String creator) {
        this.setCreator(creator);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUpdater() {
        return updater;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Platform withUpdater(String updater) {
        this.setUpdater(updater);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Platform withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Platform withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", url=").append(url);
        sb.append(", riskLevel=").append(riskLevel);
        sb.append(", lastSensorTime=").append(lastSensorTime);
        sb.append(", sampleNumber=").append(sampleNumber);
        sb.append(", creator=").append(creator);
        sb.append(", updater=").append(updater);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}