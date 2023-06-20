package cn.qqa.monitor.mapper;

import static cn.qqa.monitor.mapper.ActivityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.qqa.monitor.entity.Activity;
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
public interface ActivityMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, number, platformLevels, cycleTime, status, creator, updator, createTime, updateTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Activity> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Activity> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ActivityResult")
    Optional<Activity> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ActivityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="number", property="number", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform_levels", property="platformLevels", jdbcType=JdbcType.BIT),
        @Result(column="cycle_time", property="cycleTime", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="updator", property="updator", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Activity> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, activity, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, activity, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Activity record) {
        return MyBatis3Utils.insert(this::insert, record, activity, c ->
            c.map(id).toProperty("id")
            .map(number).toProperty("number")
            .map(platformLevels).toProperty("platformLevels")
            .map(cycleTime).toProperty("cycleTime")
            .map(status).toProperty("status")
            .map(creator).toProperty("creator")
            .map(updator).toProperty("updator")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Activity> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, activity, c ->
            c.map(id).toProperty("id")
            .map(number).toProperty("number")
            .map(platformLevels).toProperty("platformLevels")
            .map(cycleTime).toProperty("cycleTime")
            .map(status).toProperty("status")
            .map(creator).toProperty("creator")
            .map(updator).toProperty("updator")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Activity record) {
        return MyBatis3Utils.insert(this::insert, record, activity, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(number).toPropertyWhenPresent("number", record::getNumber)
            .map(platformLevels).toPropertyWhenPresent("platformLevels", record::getPlatformLevels)
            .map(cycleTime).toPropertyWhenPresent("cycleTime", record::getCycleTime)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(creator).toPropertyWhenPresent("creator", record::getCreator)
            .map(updator).toPropertyWhenPresent("updator", record::getUpdator)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Activity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, activity, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Activity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, activity, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Activity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, activity, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Activity> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, activity, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Activity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(number).equalTo(record::getNumber)
                .set(platformLevels).equalTo(record::getPlatformLevels)
                .set(cycleTime).equalTo(record::getCycleTime)
                .set(status).equalTo(record::getStatus)
                .set(creator).equalTo(record::getCreator)
                .set(updator).equalTo(record::getUpdator)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Activity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(number).equalToWhenPresent(record::getNumber)
                .set(platformLevels).equalToWhenPresent(record::getPlatformLevels)
                .set(cycleTime).equalToWhenPresent(record::getCycleTime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(creator).equalToWhenPresent(record::getCreator)
                .set(updator).equalToWhenPresent(record::getUpdator)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Activity record) {
        return update(c ->
            c.set(number).equalTo(record::getNumber)
            .set(platformLevels).equalTo(record::getPlatformLevels)
            .set(cycleTime).equalTo(record::getCycleTime)
            .set(status).equalTo(record::getStatus)
            .set(creator).equalTo(record::getCreator)
            .set(updator).equalTo(record::getUpdator)
            .set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Activity record) {
        return update(c ->
            c.set(number).equalToWhenPresent(record::getNumber)
            .set(platformLevels).equalToWhenPresent(record::getPlatformLevels)
            .set(cycleTime).equalToWhenPresent(record::getCycleTime)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(creator).equalToWhenPresent(record::getCreator)
            .set(updator).equalToWhenPresent(record::getUpdator)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}