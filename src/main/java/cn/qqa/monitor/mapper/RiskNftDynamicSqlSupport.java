package cn.qqa.monitor.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RiskNftDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final RiskNft riskNft = new RiskNft();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = riskNft.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> nftAddress = riskNft.nftAddress;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> platformId = riskNft.platformId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> type = riskNft.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> riskLabel = riskNft.riskLabel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> censorTime = riskNft.censorTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> contentUrl = riskNft.contentUrl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class RiskNft extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> nftAddress = column("nft_address", JDBCType.VARCHAR);

        public final SqlColumn<Integer> platformId = column("platform_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<String> riskLabel = column("risk_label", JDBCType.VARCHAR);

        public final SqlColumn<Date> censorTime = column("censor_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> contentUrl = column("content_url", JDBCType.LONGVARCHAR);

        public RiskNft() {
            super("risk_nft");
        }
    }
}