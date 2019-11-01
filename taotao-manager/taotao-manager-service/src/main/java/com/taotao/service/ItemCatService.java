package com.taotao.service;

import java.util.List;

import com.taotao.Pojo.TreeNode;


public interface ItemCatService {

	List<TreeNode> getItemCatList(long parentId);
}
