package cn.qqa.monitor.entity;

import javax.annotation.Generated;

public class DynamicNftTask {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String number;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String nftAddress;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer platformId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer cycleTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public DynamicNftTask withId(Integer id) {
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
    public DynamicNftTask withNumber(String number) {
        this.setNumber(number);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNumber(String number) {
        this.number = number;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNftAddress() {
        return nftAddress;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public DynamicNftTask withNftAddress(String nftAddress) {
        this.setNftAddress(nftAddress);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNftAddress(String nftAddress) {
        this.nftAddress = nftAddress;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPlatformId() {
        return platformId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public DynamicNftTask withPlatformId(Integer platformId) {
        this.setPlatformId(platformId);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCycleTime() {
        return cycleTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public DynamicNftTask withCycleTime(Integer cycleTime) {
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
    public DynamicNftTask withStatus(Integer status) {
        this.setStatus(status);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStatus(Integer status) {
        this.status = status;
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
        sb.append(", nftAddress=").append(nftAddress);
        sb.append(", platformId=").append(platformId);
        sb.append(", cycleTime=").append(cycleTime);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}