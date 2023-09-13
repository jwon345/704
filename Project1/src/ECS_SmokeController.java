import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

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
  public Signal ReadySmoke = new Signal("ReadySmoke", Signal.OUTPUT);
  private int S207331 = 1;
  private int S207295 = 1;
  private int S207283 = 1;
  private int S207288 = 1;
  private int S207292 = 1;
  
  private int[] ends = new int[69];
  private int[] tdone = new int[69];
  
  public void thread207613(int [] tdone, int [] ends){
        S207292=1;
    System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 460, column: 15
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread207612(int [] tdone, int [] ends){
        S207288=1;
    ReadySmoke.setPresent();//sysj\ECS.sysj line: 456, column: 15
    currsigs.addElement(ReadySmoke);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread207611(int [] tdone, int [] ends){
        S207283=1;
    sirenONOFF.setPresent();//sysj\ECS.sysj line: 452, column: 15
    currsigs.addElement(sirenONOFF);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread207609(int [] tdone, int [] ends){
        switch(S207292){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        if(!detectSmoke.getprestatus()){//sysj\ECS.sysj line: 461, column: 21
          ends[68]=2;
          tdone[68]=1;
        }
        else {
          active[68]=1;
          ends[68]=1;
          tdone[68]=1;
        }
        break;
      
    }
  }

  public void thread207608(int [] tdone, int [] ends){
        switch(S207288){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        ReadySmoke.setPresent();//sysj\ECS.sysj line: 456, column: 15
        currsigs.addElement(ReadySmoke);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread207607(int [] tdone, int [] ends){
        switch(S207283){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        sirenONOFF.setPresent();//sysj\ECS.sysj line: 452, column: 15
        currsigs.addElement(sirenONOFF);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread207605(int [] tdone, int [] ends){
        S207292=1;
    System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 460, column: 15
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread207604(int [] tdone, int [] ends){
        S207288=1;
    ReadySmoke.setPresent();//sysj\ECS.sysj line: 456, column: 15
    currsigs.addElement(ReadySmoke);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread207603(int [] tdone, int [] ends){
        S207283=1;
    sirenONOFF.setPresent();//sysj\ECS.sysj line: 452, column: 15
    currsigs.addElement(sirenONOFF);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S207331){
        case 0 : 
          S207331=0;
          break RUN;
        
        case 1 : 
          S207331=2;
          S207331=2;
          S207295=0;
          if(detectSmoke.getprestatus()){//sysj\ECS.sysj line: 448, column: 11
            thread207603(tdone,ends);
            thread207604(tdone,ends);
            thread207605(tdone,ends);
            int biggest207606 = 0;
            if(ends[66]>=biggest207606){
              biggest207606=ends[66];
            }
            if(ends[67]>=biggest207606){
              biggest207606=ends[67];
            }
            if(ends[68]>=biggest207606){
              biggest207606=ends[68];
            }
            if(biggest207606 == 1){
              active[65]=1;
              ends[65]=1;
              break RUN;
            }
          }
          else {
            S207295=1;
            active[65]=1;
            ends[65]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S207295){
            case 0 : 
              thread207607(tdone,ends);
              thread207608(tdone,ends);
              thread207609(tdone,ends);
              int biggest207610 = 0;
              if(ends[66]>=biggest207610){
                biggest207610=ends[66];
              }
              if(ends[67]>=biggest207610){
                biggest207610=ends[67];
              }
              if(ends[68]>=biggest207610){
                biggest207610=ends[68];
              }
              if(biggest207610 == 1){
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              if(biggest207610 == 2){
                ends[65]=2;
                ;//sysj\ECS.sysj line: 450, column: 7
                S207295=1;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              //FINXME code
              if(biggest207610 == 0){
                S207295=1;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 1 : 
              S207295=1;
              S207295=0;
              if(detectSmoke.getprestatus()){//sysj\ECS.sysj line: 448, column: 11
                thread207611(tdone,ends);
                thread207612(tdone,ends);
                thread207613(tdone,ends);
                int biggest207614 = 0;
                if(ends[66]>=biggest207614){
                  biggest207614=ends[66];
                }
                if(ends[67]>=biggest207614){
                  biggest207614=ends[67];
                }
                if(ends[68]>=biggest207614){
                  biggest207614=ends[68];
                }
                if(biggest207614 == 1){
                  active[65]=1;
                  ends[65]=1;
                  break RUN;
                }
              }
              else {
                S207295=1;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[65] != 0){
      int index = 65;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[65]!=0 || suspended[65]!=0 || active[65]!=1);
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
      ReadySmoke.setpreclear();
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
      ReadySmoke.sethook();
      ReadySmoke.setClear();
      if(paused[65]!=0 || suspended[65]!=0 || active[65]!=1);
      else{
        detectSmoke.gethook();
        stopAll.gethook();
      }
      runFinisher();
      if(active[65] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
