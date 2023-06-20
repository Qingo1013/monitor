package cn.qqa.monitor.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PlatformDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Platform platform = new Platform();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = platform.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = platform.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> icon = platform.icon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> url = platform.url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> riskLevel = platform.riskLevel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> lastSensorTime = platform.lastSensorTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sampleNumber = platform.sampleNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> creator = platform.creator;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> updater = platform.updater;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = platform.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> updateTime = platform.updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Platform extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<Integer> riskLevel = column("risk_level", JDBCType.INTEGER);

        public final SqlColumn<Date> lastSensorTime = column("last_sensor_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> sampleNumber = column("sample_number", JDBCType.INTEGER);

        public final SqlColumn<String> creator = column("creator", JDBCType.VARCHAR);

        public final SqlColumn<String> updater = column("updater", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public Platform() {
            super("platform");
        }
    }
}