import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.ECS_GUI;//sysj\ECS.sysj line: 1, column: 1

public class ECS_SmokeController extends ClockDomain{
  public ECS_SmokeController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal detectSmoke = new Signal("detectSmoke", Signal.INPUT);
  public Signal stopAll = new Signal("stopAll", Signal.INPUT);
  public Signal sirenONOFF = new Signal("sirenONOFF", Signal.OUTPUT);
  private int S97668 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S97668){
        case 0 : 
          S97668=0;
          break RUN;
        
        case 1 : 
          S97668=2;
          S97668=2;
          if(detectSmoke.getprestatus()){//sysj\ECS.sysj line: 183, column: 11
            sirenONOFF.setPresent();//sysj\ECS.sysj line: 185, column: 4
            currsigs.addElement(sirenONOFF);
            System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 186, column: 4
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
          else {
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
        
        case 2 : 
          if(detectSmoke.getprestatus()){//sysj\ECS.sysj line: 183, column: 11
            sirenONOFF.setPresent();//sysj\ECS.sysj line: 185, column: 4
            currsigs.addElement(sirenONOFF);
            System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 186, column: 4
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
          else {
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[11] != 0){
      int index = 11;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[11]!=0 || suspended[11]!=0 || active[11]!=1);
      else{
        if(!df){
          detectSmoke.gethook();
          stopAll.gethook();
          df = true;
        }
        runClockDomain();
      }
      detectSmoke.setpreclear();
      stopAll.setpreclear();
      sirenONOFF.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = detectSmoke.getStatus() ? detectSmoke.setprepresent() : detectSmoke.setpreclear();
      detectSmoke.setpreval(detectSmoke.getValue());
      detectSmoke.setClear();
      dummyint = stopAll.getStatus() ? stopAll.setprepresent() : stopAll.setpreclear();
      stopAll.setpreval(stopAll.getValue());
      stopAll.setClear();
      sirenONOFF.sethook();
      sirenONOFF.setClear();
      if(paused[11]!=0 || suspended[11]!=0 || active[11]!=1);
      else{
        detectSmoke.gethook();
        stopAll.gethook();
      }
      runFinisher();
      if(active[11] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
