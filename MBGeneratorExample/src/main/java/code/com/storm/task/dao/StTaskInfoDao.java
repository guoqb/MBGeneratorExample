package com.storm.task.dao;

import com.storm.task.entity.StTaskInfo;
import com.storm.task.entity.StTaskInfoExample;
import java.util.List;
import my.mybatis.example.base.BaseDao;
import org.apache.ibatis.annotations.Param;

public interface StTaskInfoDao extends BaseDao<StTaskInfo, Long> {
}