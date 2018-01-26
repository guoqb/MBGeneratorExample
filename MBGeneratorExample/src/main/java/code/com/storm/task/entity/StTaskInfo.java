package com.storm.task.entity;

import java.math.BigDecimal;
import java.util.Date;

public class StTaskInfo {
    private Long id;

    private Long stId;

    private String stCode;

    private String stLogo;

    private String stName;

    private BigDecimal stAmount;

    private String proviceCode;

    private String cityCode;

    private String areaCode;

    private String workAddrLong;

    private String workAddrLat;

    private Date stSignupEndtime;

    private Long userId;

    private String userName;

    private Byte state;

    private Byte enable;

    private Date createTime;

    private Date updateTime;

    private Integer entryCount;

    private Byte depositPayState;

    private Integer preState;

    private Byte isApplyTransfer;

    private Long currentNode;

    private Byte stSendSource;

    private Long followUserId;

    private String followUserName;

    private String currentNodeName;

    private Byte needFee;

    private Byte examineState;

    private Byte feePayState;

    private Date approveTime;

    private Byte origin;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStId() {
        return stId;
    }

    public void setStId(Long stId) {
        this.stId = stId;
    }

    public String getStCode() {
        return stCode;
    }

    public void setStCode(String stCode) {
        this.stCode = stCode == null ? null : stCode.trim();
    }

    public String getStLogo() {
        return stLogo;
    }

    public void setStLogo(String stLogo) {
        this.stLogo = stLogo == null ? null : stLogo.trim();
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public BigDecimal getStAmount() {
        return stAmount;
    }

    public void setStAmount(BigDecimal stAmount) {
        this.stAmount = stAmount;
    }

    public String getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(String proviceCode) {
        this.proviceCode = proviceCode == null ? null : proviceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getWorkAddrLong() {
        return workAddrLong;
    }

    public void setWorkAddrLong(String workAddrLong) {
        this.workAddrLong = workAddrLong == null ? null : workAddrLong.trim();
    }

    public String getWorkAddrLat() {
        return workAddrLat;
    }

    public void setWorkAddrLat(String workAddrLat) {
        this.workAddrLat = workAddrLat == null ? null : workAddrLat.trim();
    }

    public Date getStSignupEndtime() {
        return stSignupEndtime;
    }

    public void setStSignupEndtime(Date stSignupEndtime) {
        this.stSignupEndtime = stSignupEndtime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getEnable() {
        return enable;
    }

    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getEntryCount() {
        return entryCount;
    }

    public void setEntryCount(Integer entryCount) {
        this.entryCount = entryCount;
    }

    public Byte getDepositPayState() {
        return depositPayState;
    }

    public void setDepositPayState(Byte depositPayState) {
        this.depositPayState = depositPayState;
    }

    public Integer getPreState() {
        return preState;
    }

    public void setPreState(Integer preState) {
        this.preState = preState;
    }

    public Byte getIsApplyTransfer() {
        return isApplyTransfer;
    }

    public void setIsApplyTransfer(Byte isApplyTransfer) {
        this.isApplyTransfer = isApplyTransfer;
    }

    public Long getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Long currentNode) {
        this.currentNode = currentNode;
    }

    public Byte getStSendSource() {
        return stSendSource;
    }

    public void setStSendSource(Byte stSendSource) {
        this.stSendSource = stSendSource;
    }

    public Long getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(Long followUserId) {
        this.followUserId = followUserId;
    }

    public String getFollowUserName() {
        return followUserName;
    }

    public void setFollowUserName(String followUserName) {
        this.followUserName = followUserName == null ? null : followUserName.trim();
    }

    public String getCurrentNodeName() {
        return currentNodeName;
    }

    public void setCurrentNodeName(String currentNodeName) {
        this.currentNodeName = currentNodeName == null ? null : currentNodeName.trim();
    }

    public Byte getNeedFee() {
        return needFee;
    }

    public void setNeedFee(Byte needFee) {
        this.needFee = needFee;
    }

    public Byte getExamineState() {
        return examineState;
    }

    public void setExamineState(Byte examineState) {
        this.examineState = examineState;
    }

    public Byte getFeePayState() {
        return feePayState;
    }

    public void setFeePayState(Byte feePayState) {
        this.feePayState = feePayState;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public Byte getOrigin() {
        return origin;
    }

    public void setOrigin(Byte origin) {
        this.origin = origin;
    }
}