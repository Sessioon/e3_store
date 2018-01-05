package cn.e3store.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3store.manager.mapper.TbItemMapper;
import cn.e3store.manager.pojo.TbItem;
import cn.e3store.manager.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem findItemById(Long itemId) {
		return itemMapper.selectByPrimaryKey(itemId);
	}

}
