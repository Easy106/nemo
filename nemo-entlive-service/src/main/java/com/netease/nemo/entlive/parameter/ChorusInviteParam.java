package com.netease.nemo.entlive.parameter;

import lombok.Data;

import java.util.Map;

/**
 * 邀请合唱控制对象
 *
 * @Author：CH
 * @Date：2023/10/11 13:05 AM
 */
@Data
public class ChorusInviteParam {

    /**
     * NeRoom房间编号
     */
    private String roomUuid;

    /**
     * 点歌编号
     */
    private Long orderId;

    /**
     * 不传，默认给麦上的所有成员发送邀请通知, 聊天室消息优先
     * **/
    private String anchorUserUuid;

    /**
     * 判断走串行还是实时合唱的参数(Json对象)：
     * {
     *     "playDelay":30,    //播放延时，单位：ms
     *     "rtt":20,    //rtt值，单位：ms
     *     "wiredHeadset":1    //有线耳机，1: 有线耳机，0: 非有线耳机
     * }
     * **/
    private Map<String, Object> deviceParam;
}