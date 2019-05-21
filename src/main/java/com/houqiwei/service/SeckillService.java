package com.houqiwei.service;

import com.houqiwei.dto.Exposer;
import com.houqiwei.dto.SeckillExecution;
import com.houqiwei.exception.RepeatKillException;
import com.houqiwei.exception.SeckillCloseException;
import com.houqiwei.exception.SeckillException;
import com.houqiwei.model.Seckill;

import java.util.List;

public interface SeckillService {

    /**
     * 查询所有秒杀记录
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开始时输出秒杀接口地址,否则输出系统时间和秒杀时间
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SeckillException, RepeatKillException, SeckillCloseException;
}
