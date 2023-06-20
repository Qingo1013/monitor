package cn.qqa.monitor.entity;

import java.util.Date;
import javax.annotation.Generated;

public class RiskNft {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String nftAddress;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer platformId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String riskLabel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date censorTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String contentUrl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public RiskNft withId(Integer id) {
        this.setId(id);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNftAddress() {
        return nftAddress;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public RiskNft withNftAddress(String nftAddress) {
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
    public RiskNft withPlatformId(Integer platformId) {
        this.setPlatformId(platformId);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getType() {
        return type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public RiskNft withType(Integer type) {
        this.setType(type);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setType(Integer type) {
        this.type = type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRiskLabel() {
        return riskLabel;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public RiskNft withRiskLabel(String riskLabel) {
        this.setRiskLabel(riskLabel);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskLabel(String riskLabel) {
        this.riskLabel = riskLabel;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCensorTime() {
        return censorTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public RiskNft withCensorTime(Date censorTime) {
        this.setCensorTime(censorTime);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCensorTime(Date censorTime) {
        this.censorTime = censorTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getContentUrl() {
        return contentUrl;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public RiskNft withContentUrl(String contentUrl) {
        this.setContentUrl(contentUrl);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nftAddress=").append(nftAddress);
        sb.append(", platformId=").append(platformId);
        sb.append(", type=").append(type);
        sb.append(", riskLabel=").append(riskLabel);
        sb.append(", censorTime=").append(censorTime);
        sb.append(", contentUrl=").append(contentUrl);
        sb.append("]");
        return sb.toString();
    }
}