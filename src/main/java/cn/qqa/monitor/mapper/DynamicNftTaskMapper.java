package cn.qqa.monitor.mapper;

import static cn.qqa.monitor.mapper.DynamicNftTaskDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.qqa.monitor.entity.DynamicNftTask;
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
public interface DynamicNftTaskMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, number, nftAddress, platformId, cycleTime, status);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DynamicNftTask> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<DynamicNftTask> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DynamicNftTaskResult")
    Optional<DynamicNftTask> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DynamicNftTaskResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="number", property="number", jdbcType=JdbcType.VARCHAR),
        @Result(column="nft_address", property="nftAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform_id", property="platformId", jdbcType=JdbcType.INTEGER),
        @Result(column="cycle_time", property="cycleTime", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    List<DynamicNftTask> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dynamicNftTask, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dynamicNftTask, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(DynamicNftTask record) {
        return MyBatis3Utils.insert(this::insert, record, dynamicNftTask, c ->
            c.map(id).toProperty("id")
            .map(number).toProperty("number")
            .map(nftAddress).toProperty("nftAddress")
            .map(platformId).toProperty("platformId")
            .map(cycleTime).toProperty("cycleTime")
            .map(status).toProperty("status")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<DynamicNftTask> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, dynamicNftTask, c ->
            c.map(id).toProperty("id")
            .map(number).toProperty("number")
            .map(nftAddress).toProperty("nftAddress")
            .map(platformId).toProperty("platformId")
            .map(cycleTime).toProperty("cycleTime")
            .map(status).toProperty("status")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(DynamicNftTask record) {
        return MyBatis3Utils.insert(this::insert, record, dynamicNftTask, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(number).toPropertyWhenPresent("number", record::getNumber)
            .map(nftAddress).toPropertyWhenPresent("nftAddress", record::getNftAddress)
            .map(platformId).toPropertyWhenPresent("platformId", record::getPlatformId)
            .map(cycleTime).toPropertyWhenPresent("cycleTime", record::getCycleTime)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DynamicNftTask> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, dynamicNftTask, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<DynamicNftTask> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, dynamicNftTask, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<DynamicNftTask> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, dynamicNftTask, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DynamicNftTask> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dynamicNftTask, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(DynamicNftTask record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(number).equalTo(record::getNumber)
                .set(nftAddress).equalTo(record::getNftAddress)
                .set(platformId).equalTo(record::getPlatformId)
                .set(cycleTime).equalTo(record::getCycleTime)
                .set(status).equalTo(record::getStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DynamicNftTask record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(number).equalToWhenPresent(record::getNumber)
                .set(nftAddress).equalToWhenPresent(record::getNftAddress)
                .set(platformId).equalToWhenPresent(record::getPlatformId)
                .set(cycleTime).equalToWhenPresent(record::getCycleTime)
                .set(status).equalToWhenPresent(record::getStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(DynamicNftTask record) {
        return update(c ->
            c.set(number).equalTo(record::getNumber)
            .set(nftAddress).equalTo(record::getNftAddress)
            .set(platformId).equalTo(record::getPlatformId)
            .set(cycleTime).equalTo(record::getCycleTime)
            .set(status).equalTo(record::getStatus)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(DynamicNftTask record) {
        return update(c ->
            c.set(number).equalToWhenPresent(record::getNumber)
            .set(nftAddress).equalToWhenPresent(record::getNftAddress)
            .set(platformId).equalToWhenPresent(record::getPlatformId)
            .set(cycleTime).equalToWhenPresent(record::getCycleTime)
            .set(status).equalToWhenPresent(record::getStatus)
            .where(id, isEqualTo(record::getId))
        );
    }
}