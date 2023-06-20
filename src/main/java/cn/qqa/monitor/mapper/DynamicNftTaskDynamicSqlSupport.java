package cn.qqa.monitor.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DynamicNftTaskDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final DynamicNftTask dynamicNftTask = new DynamicNftTask();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = dynamicNftTask.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> number = dynamicNftTask.number;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> nftAddress = dynamicNftTask.nftAddress;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> platformId = dynamicNftTask.platformId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> cycleTime = dynamicNftTask.cycleTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> status = dynamicNftTask.status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class DynamicNftTask extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> number = column("number", JDBCType.VARCHAR);

        public final SqlColumn<String> nftAddress = column("nft_address", JDBCType.VARCHAR);

        public final SqlColumn<Integer> platformId = column("platform_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> cycleTime = column("cycle_time", JDBCType.INTEGER);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public DynamicNftTask() {
            super("dynamic_nft_task");
        }
    }
}