package cn.qqa.monitor.mapper;

import static cn.qqa.monitor.mapper.RiskNftDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.qqa.monitor.entity.RiskNft;
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
public interface RiskNftMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, nftAddress, platformId, type, riskLabel, censorTime, contentUrl);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<RiskNft> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<RiskNft> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RiskNftResult")
    Optional<RiskNft> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RiskNftResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="nft_address", property="nftAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform_id", property="platformId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="risk_label", property="riskLabel", jdbcType=JdbcType.VARCHAR),
        @Result(column="censor_time", property="censorTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content_url", property="contentUrl", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<RiskNft> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, riskNft, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, riskNft, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(RiskNft record) {
        return MyBatis3Utils.insert(this::insert, record, riskNft, c ->
            c.map(id).toProperty("id")
            .map(nftAddress).toProperty("nftAddress")
            .map(platformId).toProperty("platformId")
            .map(type).toProperty("type")
            .map(riskLabel).toProperty("riskLabel")
            .map(censorTime).toProperty("censorTime")
            .map(contentUrl).toProperty("contentUrl")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<RiskNft> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, riskNft, c ->
            c.map(id).toProperty("id")
            .map(nftAddress).toProperty("nftAddress")
            .map(platformId).toProperty("platformId")
            .map(type).toProperty("type")
            .map(riskLabel).toProperty("riskLabel")
            .map(censorTime).toProperty("censorTime")
            .map(contentUrl).toProperty("contentUrl")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(RiskNft record) {
        return MyBatis3Utils.insert(this::insert, record, riskNft, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(nftAddress).toPropertyWhenPresent("nftAddress", record::getNftAddress)
            .map(platformId).toPropertyWhenPresent("platformId", record::getPlatformId)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(riskLabel).toPropertyWhenPresent("riskLabel", record::getRiskLabel)
            .map(censorTime).toPropertyWhenPresent("censorTime", record::getCensorTime)
            .map(contentUrl).toPropertyWhenPresent("contentUrl", record::getContentUrl)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<RiskNft> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, riskNft, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<RiskNft> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, riskNft, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<RiskNft> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, riskNft, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<RiskNft> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, riskNft, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(RiskNft record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(nftAddress).equalTo(record::getNftAddress)
                .set(platformId).equalTo(record::getPlatformId)
                .set(type).equalTo(record::getType)
                .set(riskLabel).equalTo(record::getRiskLabel)
                .set(censorTime).equalTo(record::getCensorTime)
                .set(contentUrl).equalTo(record::getContentUrl);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RiskNft record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(nftAddress).equalToWhenPresent(record::getNftAddress)
                .set(platformId).equalToWhenPresent(record::getPlatformId)
                .set(type).equalToWhenPresent(record::getType)
                .set(riskLabel).equalToWhenPresent(record::getRiskLabel)
                .set(censorTime).equalToWhenPresent(record::getCensorTime)
                .set(contentUrl).equalToWhenPresent(record::getContentUrl);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(RiskNft record) {
        return update(c ->
            c.set(nftAddress).equalTo(record::getNftAddress)
            .set(platformId).equalTo(record::getPlatformId)
            .set(type).equalTo(record::getType)
            .set(riskLabel).equalTo(record::getRiskLabel)
            .set(censorTime).equalTo(record::getCensorTime)
            .set(contentUrl).equalTo(record::getContentUrl)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(RiskNft record) {
        return update(c ->
            c.set(nftAddress).equalToWhenPresent(record::getNftAddress)
            .set(platformId).equalToWhenPresent(record::getPlatformId)
            .set(type).equalToWhenPresent(record::getType)
            .set(riskLabel).equalToWhenPresent(record::getRiskLabel)
            .set(censorTime).equalToWhenPresent(record::getCensorTime)
            .set(contentUrl).equalToWhenPresent(record::getContentUrl)
            .where(id, isEqualTo(record::getId))
        );
    }
}