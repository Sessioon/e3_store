package cn.e3store.manager.service;

import cn.e3store.manager.pojo.TbItem;

public interface ItemService {
	
	/**
	 * 根据商品id查询商品
	 * @param itemId :商品id
	 */
	TbItem findItemById(Long itemId);

}
