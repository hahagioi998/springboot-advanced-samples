package cn.chenzw.springboot.elasticsearch.basic.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceTests {

    private static final Logger logger = LoggerFactory.getLogger(SysUserServiceTests.class);

    @Autowired
    SysUserService sysUserService;


    /**
     * 创建索引
     *
     * @throws IOException
     */
    @Test
    public void testCreateIndex() throws IOException {
        sysUserService.createIndex();
    }

    /**
     * 删除索引
     *
     * @throws IOException
     */
    @Test
    public void testDeleteIndex() throws IOException {
        sysUserService.deleteIndex();
    }


    @Test
    public void testInsertByString() throws IOException {
        sysUserService.insertByString();
    }

    @Test
    public void testInsertByMap() throws IOException {
        sysUserService.insertMap();
    }

    @Test
    public void testInsertByXContent() throws IOException {
        sysUserService.insertXContent();
    }

    @Test
    public void testInsertXContent() throws IOException {
        sysUserService.insertXContent();
    }

    @Test
    public void testInsertByObject() throws IOException {
        sysUserService.insertByObject();
    }

    @Test
    public void testBulkInsert() throws IOException {
        sysUserService.bulkInsert();
    }


    @Test
    public void testUpdate() throws IOException {
        sysUserService.update();
    }

    @Test
    public void testMatchAllQuery() throws IOException {
        sysUserService.matchAllQuery();
    }

    @Test
    public void testMatchQuery() throws IOException {
        sysUserService.matchQuery();
    }

    @Test
    public void testCommonTermsQuery() throws IOException {
        sysUserService.commonTermsQuery();
    }

    @Test
    public void testMultiMatchQuery() throws IOException {
        sysUserService.multiMatchQuery();
    }

    @Test
    public void testDisMaxQuery() throws IOException {
        sysUserService.disMaxQuery();
    }

    @Test
    public void testIdQuery() throws IOException {
        sysUserService.idQuery();
    }

    @Test
    public void testTermQuery() throws IOException {
        sysUserService.termQuery();
    }

    @Test
    public void testFuzzyQuery() throws IOException {
        sysUserService.fuzzyQuery();
    }

    @Test
    public void testPrefixQuery() throws IOException {
        sysUserService.prefixQuery();
    }

    @Test
    public void testRangeQuery() throws IOException {
        sysUserService.rangeQuery();
    }

    @Test
    public void testWildcardQuery() throws IOException {
        sysUserService.wildcardQuery();
    }

    @Test
    public void testMatchPhraseQuery() throws IOException {
        sysUserService.matchPhraseQuery();
    }

    @Test
    public void testRegexpQuery() throws IOException {
        sysUserService.regexpQuery();
    }

    @Test
    public void testQueryStringQuery() throws IOException {
        sysUserService.queryStringQuery();
    }

    @Test
    public void testBooleanQuery() throws IOException {
        sysUserService.boolQuery();
    }

    @Test
    public void testSpanFirstQuery() throws IOException {
        sysUserService.spanFirstQuery();
    }

    @Test
    public void testDeleteByQuery() throws IOException {
        long count = sysUserService.deleteByQuery();
        logger.info("删除个数:{}", count);
    }

}
