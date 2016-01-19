package com.payment.comm.base.service;

import com.payment.comm.base.dao.BaseDao;
import com.payment.comm.base.domain.AbstractCriteria;
import com.payment.comm.base.domain.AbstractEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;



@Transactional
public abstract class BaseServiceImpl<T extends AbstractEntity, E extends AbstractCriteria>
		implements BaseService<T, E> {

	protected abstract BaseDao<T, E,String> getDao();

	protected Class<T> entityClazz;

	protected Class<E> criteriaClazz;

	@SuppressWarnings("unchecked")
	public BaseServiceImpl() {
		Type genType = getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		entityClazz = (Class<T>) params[0];
		criteriaClazz = (Class<E>) params[1];
	}

	
	public T create(T entity) {
		Assert.notNull(entity);
		getDao().insertSelective(entity);
		return entity;
	}

	
	public List<T> create(List<T> entities) {
		Assert.notEmpty(entities);
		List<T> list = new ArrayList<T>();
		for (T t : entities) {
			list.add(create(t));
		}
		return list;
	}

	
	public T update(T entity) {
		Assert.notNull(entity);
		T existing = getDao().selectByPrimaryKey(entity.getId());
		BeanUtils.copyProperties(entity, existing);
		getDao().updateByPrimaryKeySelective(existing);
		return findOne(entity.getId());
	}

	
	public List<T> update(List<T> entities) {
		Assert.notEmpty(entities);
		List<T> list = new ArrayList<T>();
		for (T t : entities) {
			list.add(update(t));
		}
		return list;
	}

	
	public T save(T entity) {
		Assert.notNull(entity);
		if (entity.getId() == null) {
			create(entity);
		} else {
			update(entity);
		}
		return findOne(entity.getId());
	}

	
	public List<T> save(List<T> entities) {
		Assert.notEmpty(entities);
		List<T> list = new ArrayList<T>();
		for (T t : entities) {
			list.add(save(t));
		}
		return list;
	}

	
	@Transactional(readOnly = true)
	public T findOne(String id) {
		Assert.notNull(id);
		return getDao().selectByPrimaryKey(id);
	}

	
	@Transactional(readOnly = true)
	public T findOneByOutTradeNo(String outId) {
		Assert.notNull(outId);
		return getDao().selectByOutNo(outId);
	}

	
	public boolean exists(String id) {
		Assert.notNull(id);
		return findOne(id) != null;
	}

	public long count() {
		return getDao().countByExample(null);
	}

	public void delete(String id) {
		Assert.notNull(id);
		getDao().deleteByPrimaryKey(id);
	}

	public void delete(T entity) {
		Assert.notNull(entity);
		getDao().deleteByPrimaryKey(entity.getId());
	}

	public void delete(List<T> entities) {
		Assert.notEmpty(entities);
		for (T t : entities) {
			delete(t);
		}
	}

	@Transactional(readOnly = true)
	public List<T> findAll() {
		return getDao().selectByExample(null);
	}

	@Transactional(readOnly =true)
	public List<T> search(E criteria){
		Assert.notNull(criteria);
		return getDao().selectByExample(criteria);
	}
	
}
