package tech.lovelycheng.xuande.server.processimpl;

import tech.lovelycheng.xuande.server.Processor;


import lombok.extern.slf4j.Slf4j;
import tech.lovelycheng.xuande.server.quorum.QuorumPeer;
import tech.lovelycheng.xuande.transfer.Packet;

/**
 * @author chengtong
 * @date 2023/3/1 01:51
 */
@Slf4j
public class VoteProcessor implements Processor {

    private final QuorumPeer quorumPeer;

    Processor next;

    public VoteProcessor(QuorumPeer quorumPeer, Processor next) {
        this.quorumPeer = quorumPeer;
        this.next = next;
    }

    @Override
    public void process(Packet.Body body) {
        /*if (!body.getType()
            .equals(TypeCode.VOTES)) {
            next.process(body);
        } else {
            VoteFor voteFor = (VoteFor) body.getData();
            if(quorumPeer.supportElect(voteFor)){
                int term = voteFor.getTerm();
                if (term < this.quorumPeer.getTerm()){
                    log.info("对方任期小于自己，不接受选举信息");
                    //todo 返回false
                }
                int nextIndex = voteFor.getLastLogIndex();
                if(nextIndex < this.quorumPeer.getNextIndex().get()) {
                    //todo 返回false
                }
                //todo 修改自己的votefor
                log.info("");
            }
        }*/
    }
}
