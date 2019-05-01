package top.starwish.namelessbot.entity;

public class QQGroup {
    private long groupID;
    private boolean autoAcceptJoinRequest;
    private String joinMsg;
    private String kickMsg;
    private String serverInfoMsg;

    public QQGroup() {
    }

    public boolean isAutoAcceptJoinRequest() {
        return autoAcceptJoinRequest;
    }

    public void setAutoAcceptJoinRequest(boolean autoAcceptJoinRequest) {
        this.autoAcceptJoinRequest = autoAcceptJoinRequest;
    }

    public void setGroupID(long groupID) {
        this.groupID = groupID;
    }

    public long getGroupID() {
        return groupID;
    }

    public String getJoinMsg() {
        return joinMsg;
    }

    public void setJoinMsg(String joinMsg){
        this.joinMsg = joinMsg;
    }

    public String getKickMsg(){
        return kickMsg;
    }

    public void setKickMsg(String kickMsg){
        this.kickMsg = kickMsg;
    }

    public void setServerInfoMsg(String serverInfoMsg){
        this.serverInfoMsg = serverInfoMsg;
    }

    public String getServerInfoMsg() {
        return serverInfoMsg;
    }
}