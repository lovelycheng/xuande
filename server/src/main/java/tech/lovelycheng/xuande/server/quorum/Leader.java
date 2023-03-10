package tech.lovelycheng.xuande.server.quorum;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


import lombok.Data;
import lombok.EqualsAndHashCode;
import tech.lovelycheng.xuande.server.StateEnum;

/**
 * @author chengtong
 * @date 2023/3/1 15:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Leader extends QuorumPeer{

    private QuorumPeer self;
    private int sid;

    private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);

    public Leader() {

    }

    public void appendLog(){

    }

    public void commit(){
       // todo
    }

    public void heartbeatStart(){
        scheduledThreadPoolExecutor.scheduleAtFixedRate(()->{

        },0,5000, TimeUnit.MILLISECONDS);
    }

    public void heartBeatToFollowers(){
        if(!this.self.getStateEnum().equals(StateEnum.LEADER)){
            return;
        }

    }

}
