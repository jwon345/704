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
  private int S207695 = 1;
  private int S207685 = 1;
  private int S207673 = 1;
  private int S207693 = 1;
  
  private int[] ends = new int[54];
  private int[] tdone = new int[54];
  
  public void thread207826(int [] tdone, int [] ends){
        switch(S207693){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        if(sirenONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 325, column: 28
          sirenONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 325, column: 40
          currsigs.addElement(sirenONOFF_E);
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        else {
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        break;
      
    }
  }

  public void thread207825(int [] tdone, int [] ends){
        switch(S207685){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S207673){
          case 0 : 
            if(!sirenONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 318, column: 12
              S207673=1;
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 1 : 
            S207673=1;
            S207673=0;
            if(sirenONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 314, column: 13
              stopAll.setPresent();//sysj\ECS_plant.sysj line: 316, column: 6
              currsigs.addElement(stopAll);
              System.out.println("SIREN - ON");//sysj\ECS_plant.sysj line: 317, column: 6
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            else {
              S207673=1;
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207823(int [] tdone, int [] ends){
        S207693=1;
    if(sirenONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 325, column: 28
      sirenONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 325, column: 40
      currsigs.addElement(sirenONOFF_E);
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
  }

  public void thread207822(int [] tdone, int [] ends){
        S207685=1;
    S207673=0;
    if(sirenONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 314, column: 13
      stopAll.setPresent();//sysj\ECS_plant.sysj line: 316, column: 6
      currsigs.addElement(stopAll);
      System.out.println("SIREN - ON");//sysj\ECS_plant.sysj line: 317, column: 6
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      S207673=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S207695){
        case 0 : 
          S207695=0;
          break RUN;
        
        case 1 : 
          S207695=2;
          S207695=2;
          thread207822(tdone,ends);
          thread207823(tdone,ends);
          int biggest207824 = 0;
          if(ends[52]>=biggest207824){
            biggest207824=ends[52];
          }
          if(ends[53]>=biggest207824){
            biggest207824=ends[53];
          }
          if(biggest207824 == 1){
            active[51]=1;
            ends[51]=1;
            break RUN;
          }
        
        case 2 : 
          thread207825(tdone,ends);
          thread207826(tdone,ends);
          int biggest207827 = 0;
          if(ends[52]>=biggest207827){
            biggest207827=ends[52];
          }
          if(ends[53]>=biggest207827){
            biggest207827=ends[53];
          }
          if(biggest207827 == 1){
            active[51]=1;
            ends[51]=1;
            break RUN;
          }
          //FINXME code
          if(biggest207827 == 0){
            S207695=0;
            active[51]=0;
            ends[51]=0;
            S207695=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[51] != 0){
      int index = 51;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
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
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
      else{
        sirenONOFF.gethook();
      }
      runFinisher();
      if(active[51] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
