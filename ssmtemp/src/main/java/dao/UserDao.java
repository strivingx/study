package dao;

import com.yyy.entities.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserDao extends BaseDao{

    @Insert("insert into user(name) values(#{name})")
    public int insert(User user);

    @Update("update user set name=#{name} where id=#{id}")
    public int update(User user);

    @Delete("delete from user where id = #{id}")
    public Integer delete(Integer id);

    @Select("select * from user where name=#{name}")
    public User getByName(String name);

    @Select("select * from user where id=#{id}")
    public User findById(Integer id);

    @Select("select * from user")
    public List<User> getList();


 //    public <T, R> PageInfo<T> list(R req);
}
