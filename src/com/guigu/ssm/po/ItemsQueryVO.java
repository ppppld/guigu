package com.guigu.ssm.po;
/**       
 * <p>project_name:SpringMVCSpringMyBatis</p>
 * <p>package_name:com.guigu.ssm.po.ItemsQueryVO</p>
 * <p>description��</p>
 * <p>@author������ʦ<p>   
 * <p> date:2018��1��18������1:50:51 </p>
 * <p>comments��    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

import java.util.List;

public class ItemsQueryVO {

    // ��Ʒ��Ϣ
    private Items items;

    // Ϊ��ϵͳ�Ŀ���չ�� ��ԭʼ��POJO������չ
    private ItemsCustom itemsCustom;

    private List<ItemsCustom> itemsList;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }

    public List<ItemsCustom> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<ItemsCustom> itemsList) {
        this.itemsList = itemsList;
    }

}
