package cn.e3store.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3store.manager.pojo.TbItem;
import cn.e3store.manager.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService itemsService;
	
	/**
	 * 根据id查询一个商品,并以json数据格式返回
	 * @param itemId
	 * @return
	 */
	@RequestMapping("/singleItem/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemId){
		return itemsService.findItemById(itemId);
	}

}
