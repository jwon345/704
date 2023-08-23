import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor\conveyor_plant.sysj line: 1, column: 1

public class ConveyorPlant extends ClockDomain{
  public ConveyorPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleDeployed = new Signal("bottleDeployed", Signal.INPUT);
  public Signal BOTTLE_FINISHED_AT_POS5 = new Signal("BOTTLE_FINISHED_AT_POS5", Signal.INPUT);
  public Signal MOT_CONVEYOR_ON_OFF = new Signal("MOT_CONVEYOR_ON_OFF", Signal.INPUT);
  public Signal BOTTLE_LEFT_POS5 = new Signal("BOTTLE_LEFT_POS5", Signal.OUTPUT);
  public Signal BOTTLE_AT_POS1 = new Signal("BOTTLE_AT_POS1", Signal.OUTPUT);
  private int S3 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S3){
        case 0 : 
          S3=0;
          break RUN;
        
        case 1 : 
          S3=2;
          new Thread(new GUI()).start();//sysj\conveyor\conveyor_plant.sysj line: 10, column: 2
          S3=0;
          active[1]=0;
          ends[1]=0;
          S3=0;
          break RUN;
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          bottleDeployed.gethook();
          BOTTLE_FINISHED_AT_POS5.gethook();
          MOT_CONVEYOR_ON_OFF.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleDeployed.setpreclear();
      BOTTLE_FINISHED_AT_POS5.setpreclear();
      MOT_CONVEYOR_ON_OFF.setpreclear();
      BOTTLE_LEFT_POS5.setpreclear();
      BOTTLE_AT_POS1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleDeployed.getStatus() ? bottleDeployed.setprepresent() : bottleDeployed.setpreclear();
      bottleDeployed.setpreval(bottleDeployed.getValue());
      bottleDeployed.setClear();
      dummyint = BOTTLE_FINISHED_AT_POS5.getStatus() ? BOTTLE_FINISHED_AT_POS5.setprepresent() : BOTTLE_FINISHED_AT_POS5.setpreclear();
      BOTTLE_FINISHED_AT_POS5.setpreval(BOTTLE_FINISHED_AT_POS5.getValue());
      BOTTLE_FINISHED_AT_POS5.setClear();
      dummyint = MOT_CONVEYOR_ON_OFF.getStatus() ? MOT_CONVEYOR_ON_OFF.setprepresent() : MOT_CONVEYOR_ON_OFF.setpreclear();
      MOT_CONVEYOR_ON_OFF.setpreval(MOT_CONVEYOR_ON_OFF.getValue());
      MOT_CONVEYOR_ON_OFF.setClear();
      BOTTLE_LEFT_POS5.sethook();
      BOTTLE_LEFT_POS5.setClear();
      BOTTLE_AT_POS1.sethook();
      BOTTLE_AT_POS1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleDeployed.gethook();
        BOTTLE_FINISHED_AT_POS5.gethook();
        MOT_CONVEYOR_ON_OFF.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
