package impl;

import com.github.pagehelper.PageInfo;
import com.yyy.dao.BaseDao;
import com.yyy.service.BaseService;
import org.springframework.stereotype.Service;

@Service
abstract public class AbstractBaseService<T> implements BaseService{

    private BaseDao baseDao;

    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public <T> Integer add(T t) {
        return baseDao.insert(t);
    }

    @Override
    public <T> Integer update(T t) {
        return baseDao.update(t);
    }

    @Override
    public Boolean delete(Integer id) {
        return baseDao.delete(id) > 0;
    }

    @Override
    public <T> T findById(Integer id) {
        return baseDao.findById(id);
    }

    @Override
    public <T, R> PageInfo<T> list(R req) {
        return null;
    }
}
