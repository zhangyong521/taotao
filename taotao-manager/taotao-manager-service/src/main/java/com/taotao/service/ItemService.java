package com.taotao.service;

import com.taotao.Pojo.EUDataGridResult;
import com.taotao.Pojo.TaotaoResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	TbItem getItemById(long itemId);
	EUDataGridResult getItemList(int page,int rows);
	TaotaoResult createItem(TbItem item);
}
