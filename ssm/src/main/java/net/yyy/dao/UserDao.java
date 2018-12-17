package net.yyy.dao;

import net.yyy.entity.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
@CacheConfig(cacheNames = "users")
public interface UserDao {
    @CacheEvict(key ="#p0",allEntries=true)
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    @Cacheable(key ="#p0")
    User selectByPrimaryKey(Integer id);

    @CachePut(key = "#p0")
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}