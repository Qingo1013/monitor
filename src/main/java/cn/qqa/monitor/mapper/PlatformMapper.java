package cn.qqa.monitor.mapper;

import static cn.qqa.monitor.mapper.PlatformDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.qqa.monitor.entity.Platform;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface PlatformMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, icon, url, riskLevel, lastSensorTime, sampleNumber, creator, updater, createTime, updateTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Platform> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Platform> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PlatformResult")
    Optional<Platform> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PlatformResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="risk_level", property="riskLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="last_sensor_time", property="lastSensorTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sample_number", property="sampleNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="updater", property="updater", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Platform> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, platform, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, platform, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Platform record) {
        return MyBatis3Utils.insert(this::insert, record, platform, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(icon).toProperty("icon")
            .map(url).toProperty("url")
            .map(riskLevel).toProperty("riskLevel")
            .map(lastSensorTime).toProperty("lastSensorTime")
            .map(sampleNumber).toProperty("sampleNumber")
            .map(creator).toProperty("creator")
            .map(updater).toProperty("updater")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Platform> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, platform, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(icon).toProperty("icon")
            .map(url).toProperty("url")
            .map(riskLevel).toProperty("riskLevel")
            .map(lastSensorTime).toProperty("lastSensorTime")
            .map(sampleNumber).toProperty("sampleNumber")
            .map(creator).toProperty("creator")
            .map(updater).toProperty("updater")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Platform record) {
        return MyBatis3Utils.insert(this::insert, record, platform, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(icon).toPropertyWhenPresent("icon", record::getIcon)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
            .map(riskLevel).toPropertyWhenPresent("riskLevel", record::getRiskLevel)
            .map(lastSensorTime).toPropertyWhenPresent("lastSensorTime", record::getLastSensorTime)
            .map(sampleNumber).toPropertyWhenPresent("sampleNumber", record::getSampleNumber)
            .map(creator).toPropertyWhenPresent("creator", record::getCreator)
            .map(updater).toPropertyWhenPresent("updater", record::getUpdater)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Platform> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, platform, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Platform> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, platform, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Platform> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, platform, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Platform> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, platform, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Platform record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(icon).equalTo(record::getIcon)
                .set(url).equalTo(record::getUrl)
                .set(riskLevel).equalTo(record::getRiskLevel)
                .set(lastSensorTime).equalTo(record::getLastSensorTime)
                .set(sampleNumber).equalTo(record::getSampleNumber)
                .set(creator).equalTo(record::getCreator)
                .set(updater).equalTo(record::getUpdater)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Platform record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(riskLevel).equalToWhenPresent(record::getRiskLevel)
                .set(lastSensorTime).equalToWhenPresent(record::getLastSensorTime)
                .set(sampleNumber).equalToWhenPresent(record::getSampleNumber)
                .set(creator).equalToWhenPresent(record::getCreator)
                .set(updater).equalToWhenPresent(record::getUpdater)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Platform record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(icon).equalTo(record::getIcon)
            .set(url).equalTo(record::getUrl)
            .set(riskLevel).equalTo(record::getRiskLevel)
            .set(lastSensorTime).equalTo(record::getLastSensorTime)
            .set(sampleNumber).equalTo(record::getSampleNumber)
            .set(creator).equalTo(record::getCreator)
            .set(updater).equalTo(record::getUpdater)
            .set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Platform record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(icon).equalToWhenPresent(record::getIcon)
            .set(url).equalToWhenPresent(record::getUrl)
            .set(riskLevel).equalToWhenPresent(record::getRiskLevel)
            .set(lastSensorTime).equalToWhenPresent(record::getLastSensorTime)
            .set(sampleNumber).equalToWhenPresent(record::getSampleNumber)
            .set(creator).equalToWhenPresent(record::getCreator)
            .set(updater).equalToWhenPresent(record::getUpdater)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}