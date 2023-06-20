package cn.qqa.monitor.entity;

import java.util.Date;
import javax.annotation.Generated;

public class Activity {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String number;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private byte[] platformLevels;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer cycleTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String creator;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String updator;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Activity withId(Integer id) {
        this.setId(id);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNumber() {
        return number;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Activity withNumber(String number) {
        this.setNumber(number);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNumber(String number) {
        this.number = number;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public byte[] getPlatformLevels() {
        return platformLevels;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Activity withPlatformLevels(byte[] platformLevels) {
        this.setPlatformLevels(platformLevels);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlatformLevels(byte[] platformLevels) {
        this.platformLevels = platformLevels;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCycleTime() {
        return cycleTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Activity withCycleTime(Integer cycleTime) {
        this.setCycleTime(cycleTime);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCycleTime(Integer cycleTime) {
        this.cycleTime = cycleTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStatus() {
        return status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Activity withStatus(Integer status) {
        this.setStatus(status);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCreator() {
        return creator;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Activity withCreator(String creator) {
        this.setCreator(creator);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUpdator() {
        return updator;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Activity withUpdator(String updator) {
        this.setUpdator(updator);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Activity withCreateTime(Date createTime) {
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
    public Activity withUpdateTime(Date updateTime) {
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
        sb.append(", number=").append(number);
        sb.append(", platformLevels=").append(platformLevels);
        sb.append(", cycleTime=").append(cycleTime);
        sb.append(", status=").append(status);
        sb.append(", creator=").append(creator);
        sb.append(", updator=").append(updator);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}