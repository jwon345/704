import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ConveyorController extends ClockDomain{
  public ConveyorController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal BOTTLE_LEFT_POS5 = new Signal("BOTTLE_LEFT_POS5", Signal.INPUT);
  public Signal BOTTLE_AT_POS1 = new Signal("BOTTLE_AT_POS1", Signal.INPUT);
  public Signal MOT_CONVEYOR_ON_OFF = new Signal("MOT_CONVEYOR_ON_OFF", Signal.OUTPUT);
  private int S0 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S0){
        case 0 : 
          S0=0;
          break RUN;
        
        case 1 : 
          S0=2;
          S0=2;
          active[1]=0;
          ends[1]=0;
          S0=0;
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
          BOTTLE_LEFT_POS5.gethook();
          BOTTLE_AT_POS1.gethook();
          df = true;
        }
        runClockDomain();
      }
      BOTTLE_LEFT_POS5.setpreclear();
      BOTTLE_AT_POS1.setpreclear();
      MOT_CONVEYOR_ON_OFF.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = BOTTLE_LEFT_POS5.getStatus() ? BOTTLE_LEFT_POS5.setprepresent() : BOTTLE_LEFT_POS5.setpreclear();
      BOTTLE_LEFT_POS5.setpreval(BOTTLE_LEFT_POS5.getValue());
      BOTTLE_LEFT_POS5.setClear();
      dummyint = BOTTLE_AT_POS1.getStatus() ? BOTTLE_AT_POS1.setprepresent() : BOTTLE_AT_POS1.setpreclear();
      BOTTLE_AT_POS1.setpreval(BOTTLE_AT_POS1.getValue());
      BOTTLE_AT_POS1.setClear();
      MOT_CONVEYOR_ON_OFF.sethook();
      MOT_CONVEYOR_ON_OFF.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        BOTTLE_LEFT_POS5.gethook();
        BOTTLE_AT_POS1.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
