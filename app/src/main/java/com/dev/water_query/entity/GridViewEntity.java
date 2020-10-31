package com.dev.water_query.entity;

/**
 * @version: v1.0
 * @ClassName: GridViewEntity
 * @Package: com.dev.water_query.entity
 * @Description: 图标实体类
 * @author: Corina
 * @date: 2020/10/20 15:54
 */
public class GridViewEntity {
    private int iId;
    private String iName;

    public GridViewEntity() {
    }

    public GridViewEntity(int iId, String iName) {
        this.iId = iId;
        this.iName = iName;
    }

    public int getId() {
        return iId;
    }

    public String getName() {
        return iName;
    }

    public void setId(int iId) {
        this.iId = iId;
    }

    public void setName(String iName) {
        this.iName = iName;
    }
}
