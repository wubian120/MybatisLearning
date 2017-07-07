package cn.brady.dao;

import cn.brady.pojo.Item;


import java.util.List;

/**
 * Created by Brady on 2017/7/7.
 */
public interface ItemMapper {

    List<Item> getAllItems();

    Item getItemById(long uid);
}
