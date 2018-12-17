package controller;

import com.github.pagehelper.PageInfo;
import com.yyy.entities.User;
import com.yyy.service.BaseService;

public class BaseController {

	protected BaseService baseService;

	public BaseService getBaseService() {
		return baseService;
	}

	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}

	@GetMapping("/{id}")
	public User findById(@PathVariable("id") Integer id) {
		return getBaseService().findById(id);
	}

	@GetMapping("")
	public PageInfo<User> list() {
		return getBaseService().list(null);
	}

	@PostMapping("/{id}")
	public Integer add(User user) {
		return getBaseService().add(user);
	}

	@PutMapping("/{id}")
	public Integer update(User user) {
		return getBaseService().update(user);
	}

	@DeleteMapping("/{id}")
	public Boolean delete(@PathVariable("id") Integer id) {
		return getBaseService().findById(id);
	}
}
