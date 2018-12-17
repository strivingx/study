package service;

import com.github.pagehelper.PageInfo;

/**
 * Created by Administrator on 2018/7/12 0012.
 * 用户业务层
 * 注意实际开发中肯定就是使用@Service注解了，这里为了学习@ImportSource注解方便-
 * 就像注释掉，采用beans.xml配置的方式将UserService加入到Spring容器中去
 */
public interface BaseService {

    public <T> Integer add(T t);

    public <T> Integer update(T t);

    public Boolean delete(Integer id);

    public <T> T findById(Integer id);

    public <T, R> PageInfo<T> list(R req);

}
