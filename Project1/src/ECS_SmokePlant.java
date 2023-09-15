import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.ECS_GUI;//sysj\ECS_plant.sysj line: 1, column: 1

public class ECS_SmokePlant extends ClockDomain{
  public ECS_SmokePlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal sirenONOFF = new Signal("sirenONOFF", Signal.INPUT);
  public Signal detectSmoke = new Signal("detectSmoke", Signal.OUTPUT);
  public Signal stopAll = new Signal("stopAll", Signal.OUTPUT);
  public Signal sirenONOFF_E = new Signal("sirenONOFF_E", Signal.OUTPUT);
  private int S25613 = 1;
  private int S25603 = 1;
  private int S25591 = 1;
  private int S25611 = 1;
  
  private int[] ends = new int[47];
  private int[] tdone = new int[47];
  
  public void thread25730(int [] tdone, int [] ends){
        switch(S25611){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(sirenONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 298, column: 28
          sirenONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 298, column: 40
          currsigs.addElement(sirenONOFF_E);
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        break;
      
    }
  }

  public void thread25729(int [] tdone, int [] ends){
        switch(S25603){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S25591){
          case 0 : 
            if(!sirenONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 291, column: 12
              S25591=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            else {
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
          case 1 : 
            S25591=1;
            S25591=0;
            if(sirenONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 287, column: 13
              stopAll.setPresent();//sysj\ECS_plant.sysj line: 289, column: 6
              currsigs.addElement(stopAll);
              System.out.println("SIREN - ON");//sysj\ECS_plant.sysj line: 290, column: 6
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            else {
              S25591=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread25727(int [] tdone, int [] ends){
        S25611=1;
    if(sirenONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 298, column: 28
      sirenONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 298, column: 40
      currsigs.addElement(sirenONOFF_E);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread25726(int [] tdone, int [] ends){
        S25603=1;
    S25591=0;
    if(sirenONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 287, column: 13
      stopAll.setPresent();//sysj\ECS_plant.sysj line: 289, column: 6
      currsigs.addElement(stopAll);
      System.out.println("SIREN - ON");//sysj\ECS_plant.sysj line: 290, column: 6
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S25591=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S25613){
        case 0 : 
          S25613=0;
          break RUN;
        
        case 1 : 
          S25613=2;
          S25613=2;
          thread25726(tdone,ends);
          thread25727(tdone,ends);
          int biggest25728 = 0;
          if(ends[45]>=biggest25728){
            biggest25728=ends[45];
          }
          if(ends[46]>=biggest25728){
            biggest25728=ends[46];
          }
          if(biggest25728 == 1){
            active[44]=1;
            ends[44]=1;
            break RUN;
          }
        
        case 2 : 
          thread25729(tdone,ends);
          thread25730(tdone,ends);
          int biggest25731 = 0;
          if(ends[45]>=biggest25731){
            biggest25731=ends[45];
          }
          if(ends[46]>=biggest25731){
            biggest25731=ends[46];
          }
          if(biggest25731 == 1){
            active[44]=1;
            ends[44]=1;
            break RUN;
          }
          //FINXME code
          if(biggest25731 == 0){
            S25613=0;
            active[44]=0;
            ends[44]=0;
            S25613=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[44] != 0){
      int index = 44;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[44]!=0 || suspended[44]!=0 || active[44]!=1);
      else{
        if(!df){
          sirenONOFF.gethook();
          df = true;
        }
        runClockDomain();
      }
      sirenONOFF.setpreclear();
      detectSmoke.setpreclear();
      stopAll.setpreclear();
      sirenONOFF_E.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = sirenONOFF.getStatus() ? sirenONOFF.setprepresent() : sirenONOFF.setpreclear();
      sirenONOFF.setpreval(sirenONOFF.getValue());
      sirenONOFF.setClear();
      detectSmoke.sethook();
      detectSmoke.setClear();
      stopAll.sethook();
      stopAll.setClear();
      sirenONOFF_E.sethook();
      sirenONOFF_E.setClear();
      if(paused[44]!=0 || suspended[44]!=0 || active[44]!=1);
      else{
        sirenONOFF.gethook();
      }
      runFinisher();
      if(active[44] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
