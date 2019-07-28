package config;

import java.io.InputStream;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Properties;

import javax.cache.configuration.Factory;
import javax.sql.DataSource;

import org.apache.ignite.cache.CacheAtomicityMode;
import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.cache.QueryEntity;
import org.apache.ignite.cache.store.jdbc.CacheJdbcPojoStoreFactory;
import org.apache.ignite.cache.store.jdbc.JdbcType;
import org.apache.ignite.cache.store.jdbc.JdbcTypeField;
import org.apache.ignite.cache.store.jdbc.dialect.MySQLDialect;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi;
import org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/** This file was generated by Ignite Web Console (10/24/2018, 11:35) **/
public class ClientConfigurationFactory {
    /** Secret properties loading. **/
    private static final Properties props = new Properties();

    static {
        try (InputStream in = IgniteConfiguration.class.getClassLoader().getResourceAsStream("secret.properties")) {
            props.load(in);
        }
        catch (Exception ignored) {
            // No-op.
        }
    }

    /** Helper class for datasource creation. **/
    public static class DataSources {
        public static final MysqlDataSource INSTANCE_dsMySQL_TestUpload = createdsMySQL_TestUpload();

        private static MysqlDataSource createdsMySQL_TestUpload() {
            MysqlDataSource dsMySQL_TestUpload = new MysqlDataSource();

            dsMySQL_TestUpload.setURL(props.getProperty("dsMySQL_TestUpload.jdbc.url"));
            dsMySQL_TestUpload.setUser(props.getProperty("dsMySQL_TestUpload.jdbc.username"));
            dsMySQL_TestUpload.setPassword(props.getProperty("dsMySQL_TestUpload.jdbc.password"));

            return dsMySQL_TestUpload;
        }
    }

    /**
     * Configure grid.
     * 
     * @return Ignite configuration.
     * @throws Exception If failed to construct Ignite configuration instance.
     **/
    public static IgniteConfiguration createConfiguration() throws Exception {
        IgniteConfiguration cfg = new IgniteConfiguration();

        cfg.setClientMode(true);
        cfg.setIgniteInstanceName("ImportedCluster");

        TcpDiscoverySpi discovery = new TcpDiscoverySpi();

        TcpDiscoveryMulticastIpFinder ipFinder = new TcpDiscoveryMulticastIpFinder();

        ipFinder.setAddresses(Arrays.asList("127.0.0.1:47500..47510"));

        discovery.setIpFinder(ipFinder);
        
        cfg.setDiscoverySpi(discovery);
        
        cfg.setCacheConfiguration(cacheTblInvoiceCache());

        return cfg;
    }

    /**
     * Create configuration for cache "TblInvoiceCache".
     * 
     * @return Configured cache.
     * @throws Exception if failed to create cache configuration.
     **/
    public static CacheConfiguration cacheTblInvoiceCache() throws Exception {
        CacheConfiguration ccfg = new CacheConfiguration();

        ccfg.setName("TblInvoiceCache");
        ccfg.setCacheMode(CacheMode.PARTITIONED);
        ccfg.setAtomicityMode(CacheAtomicityMode.ATOMIC);

        CacheJdbcPojoStoreFactory cacheStoreFactory = new CacheJdbcPojoStoreFactory();

        cacheStoreFactory.setDataSourceFactory(new Factory<DataSource>() {
            /** {@inheritDoc} **/
            @Override public DataSource create() {
                return DataSources.INSTANCE_dsMySQL_TestUpload;
            };
        });

        cacheStoreFactory.setDialect(new MySQLDialect());

        cacheStoreFactory.setTypes(jdbcTypeTblInvoice(ccfg.getName()));

        ccfg.setCacheStoreFactory(cacheStoreFactory);

        ccfg.setReadThrough(true);
        ccfg.setWriteThrough(true);

        ArrayList<QueryEntity> qryEntities = new ArrayList<>();

        QueryEntity qryEntity = new QueryEntity();

        qryEntity.setKeyType("java.lang.Long");
        qryEntity.setValueType("com.test.upload.ignite.model.TblInvoice");
        qryEntity.setTableName("tbl_invoice");
        qryEntity.setKeyFieldName("invoiceId");

        HashSet<String> keyFields = new HashSet<>();

        keyFields.add("invoiceId");

        qryEntity.setKeyFields(keyFields);

        LinkedHashMap<String, String> fields = new LinkedHashMap<>();

        fields.put("batchDescription", "java.lang.String");
        fields.put("billDiscount", "java.lang.Double");
        fields.put("channelName", "java.lang.String");
        fields.put("companyId", "java.lang.Long");
        fields.put("createdBy", "java.lang.Long");
        fields.put("createdDate", "java.sql.Timestamp");
        fields.put("discount", "java.lang.Double");
        fields.put("distributorName", "java.lang.String");
        fields.put("groupId", "java.lang.Long");
        fields.put("hilCode", "java.lang.String");
        fields.put("invoiceDate", "java.sql.Timestamp");
        fields.put("invoiceNo", "java.lang.String");
        fields.put("invoiceNo1", "java.lang.String");
        fields.put("modifiedBy", "java.lang.Long");
        fields.put("modifiedDate", "java.sql.Timestamp");
        fields.put("orderId", "java.lang.String");
        fields.put("price", "java.lang.Double");
        fields.put("qtyCase", "java.lang.Double");
        fields.put("qtyPiece", "java.lang.Double");
        fields.put("retailerCode", "java.lang.String");
        fields.put("retailerName", "java.lang.String");
        fields.put("schemeAmount", "java.lang.Double");
        fields.put("seller", "java.lang.String");
        fields.put("sihNetAmount", "java.lang.Double");
        fields.put("skuCode", "java.lang.String");
        fields.put("skuName", "java.lang.String");
        fields.put("tax", "java.lang.Double");
        fields.put("textbox12", "java.lang.Double");
        fields.put("value", "java.lang.Double");
        fields.put("volume", "java.lang.Double");
        fields.put("invoiceId", "java.lang.Long");

        qryEntity.setFields(fields);

        HashMap<String, String> aliases = new HashMap<>();

        aliases.put("invoiceId", "invoice_id");
        aliases.put("batchDescription", "batch_description");
        aliases.put("billDiscount", "bill_discount");
        aliases.put("channelName", "channel_name");
        aliases.put("companyId", "company_id");
        aliases.put("createdBy", "created_by");
        aliases.put("createdDate", "created_date");
        aliases.put("distributorName", "distributor_name");
        aliases.put("groupId", "group_id");
        aliases.put("hilCode", "hil_code");
        aliases.put("invoiceDate", "invoice_date");
        aliases.put("invoiceNo", "invoice_no");
        aliases.put("invoiceNo1", "invoice_no1");
        aliases.put("modifiedBy", "modified_by");
        aliases.put("modifiedDate", "modified_date");
        aliases.put("orderId", "order_id");
        aliases.put("qtyCase", "qty_case");
        aliases.put("qtyPiece", "qty_piece");
        aliases.put("retailerCode", "retailer_code");
        aliases.put("retailerName", "retailer_name");
        aliases.put("schemeAmount", "scheme_amount");
        aliases.put("sihNetAmount", "sih_net_amount");
        aliases.put("skuCode", "sku_code");
        aliases.put("skuName", "sku_name");

        qryEntity.setAliases(aliases);
        qryEntities.add(qryEntity);

        ccfg.setQueryEntities(qryEntities);

        return ccfg;
    }

    /**
     * Create JDBC type for "jdbcTypeTblInvoice".
     * 
     * @param cacheName Cache name.
     * @return Configured JDBC type.
     **/
    private static JdbcType jdbcTypeTblInvoice(String cacheName) {
        JdbcType type = new JdbcType();

        type.setCacheName(cacheName);
        type.setKeyType(Long.class);
        type.setValueType("com.test.upload.ignite.model.TblInvoice");
        type.setDatabaseSchema("test_upload");
        type.setDatabaseTable("tbl_invoice");

        type.setKeyFields(new JdbcTypeField(Types.BIGINT, "invoice_id", long.class, "invoiceId"));

        type.setValueFields(
    		new JdbcTypeField(Types.BIGINT, "invoice_id", String.class, "invoiceId"),
            new JdbcTypeField(Types.VARCHAR, "batch_description", String.class, "batchDescription"),
            new JdbcTypeField(Types.DOUBLE, "bill_discount", Double.class, "billDiscount"),
            new JdbcTypeField(Types.VARCHAR, "channel_name", String.class, "channelName"),
            new JdbcTypeField(Types.BIGINT, "company_id", Long.class, "companyId"),
            new JdbcTypeField(Types.BIGINT, "created_by", Long.class, "createdBy"),
            new JdbcTypeField(Types.TIMESTAMP, "created_date", Timestamp.class, "createdDate"),
            new JdbcTypeField(Types.DOUBLE, "discount", Double.class, "discount"),
            new JdbcTypeField(Types.VARCHAR, "distributor_name", String.class, "distributorName"),
            new JdbcTypeField(Types.BIGINT, "group_id", Long.class, "groupId"),
            new JdbcTypeField(Types.VARCHAR, "hil_code", String.class, "hilCode"),
            new JdbcTypeField(Types.TIMESTAMP, "invoice_date", Timestamp.class, "invoiceDate"),
            new JdbcTypeField(Types.VARCHAR, "invoice_no", String.class, "invoiceNo"),
            new JdbcTypeField(Types.VARCHAR, "invoice_no1", String.class, "invoiceNo1"),
            new JdbcTypeField(Types.BIGINT, "modified_by", Long.class, "modifiedBy"),
            new JdbcTypeField(Types.TIMESTAMP, "modified_date", Timestamp.class, "modifiedDate"),
            new JdbcTypeField(Types.VARCHAR, "order_id", String.class, "orderId"),
            new JdbcTypeField(Types.DOUBLE, "price", Double.class, "price"),
            new JdbcTypeField(Types.DOUBLE, "qty_case", Double.class, "qtyCase"),
            new JdbcTypeField(Types.DOUBLE, "qty_piece", Double.class, "qtyPiece"),
            new JdbcTypeField(Types.VARCHAR, "retailer_code", String.class, "retailerCode"),
            new JdbcTypeField(Types.VARCHAR, "retailer_name", String.class, "retailerName"),
            new JdbcTypeField(Types.DOUBLE, "scheme_amount", Double.class, "schemeAmount"),
            new JdbcTypeField(Types.VARCHAR, "seller", String.class, "seller"),
            new JdbcTypeField(Types.DOUBLE, "sih_net_amount", Double.class, "sihNetAmount"),
            new JdbcTypeField(Types.VARCHAR, "sku_code", String.class, "skuCode"),
            new JdbcTypeField(Types.VARCHAR, "sku_name", String.class, "skuName"),
            new JdbcTypeField(Types.DOUBLE, "tax", Double.class, "tax"),
            new JdbcTypeField(Types.DOUBLE, "textbox12", Double.class, "textbox12"),
            new JdbcTypeField(Types.DOUBLE, "value", Double.class, "value"),
            new JdbcTypeField(Types.DOUBLE, "volume", Double.class, "volume")
        );

        return type;
    }
}