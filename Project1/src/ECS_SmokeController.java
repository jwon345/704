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
  private int S205203 = 1;
  private int S205167 = 1;
  private int S205155 = 1;
  private int S205160 = 1;
  private int S205164 = 1;
  
  private int[] ends = new int[69];
  private int[] tdone = new int[69];
  
  public void thread205485(int [] tdone, int [] ends){
        S205164=1;
    System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 434, column: 15
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread205484(int [] tdone, int [] ends){
        S205160=1;
    ReadySmoke.setPresent();//sysj\ECS.sysj line: 430, column: 15
    currsigs.addElement(ReadySmoke);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread205483(int [] tdone, int [] ends){
        S205155=1;
    sirenONOFF.setPresent();//sysj\ECS.sysj line: 426, column: 15
    currsigs.addElement(sirenONOFF);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread205481(int [] tdone, int [] ends){
        switch(S205164){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        if(!detectSmoke.getprestatus()){//sysj\ECS.sysj line: 435, column: 21
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

  public void thread205480(int [] tdone, int [] ends){
        switch(S205160){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        ReadySmoke.setPresent();//sysj\ECS.sysj line: 430, column: 15
        currsigs.addElement(ReadySmoke);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread205479(int [] tdone, int [] ends){
        switch(S205155){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        sirenONOFF.setPresent();//sysj\ECS.sysj line: 426, column: 15
        currsigs.addElement(sirenONOFF);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread205477(int [] tdone, int [] ends){
        S205164=1;
    System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 434, column: 15
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread205476(int [] tdone, int [] ends){
        S205160=1;
    ReadySmoke.setPresent();//sysj\ECS.sysj line: 430, column: 15
    currsigs.addElement(ReadySmoke);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread205475(int [] tdone, int [] ends){
        S205155=1;
    sirenONOFF.setPresent();//sysj\ECS.sysj line: 426, column: 15
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
      switch(S205203){
        case 0 : 
          S205203=0;
          break RUN;
        
        case 1 : 
          S205203=2;
          S205203=2;
          S205167=0;
          if(detectSmoke.getprestatus()){//sysj\ECS.sysj line: 422, column: 11
            thread205475(tdone,ends);
            thread205476(tdone,ends);
            thread205477(tdone,ends);
            int biggest205478 = 0;
            if(ends[66]>=biggest205478){
              biggest205478=ends[66];
            }
            if(ends[67]>=biggest205478){
              biggest205478=ends[67];
            }
            if(ends[68]>=biggest205478){
              biggest205478=ends[68];
            }
            if(biggest205478 == 1){
              active[65]=1;
              ends[65]=1;
              break RUN;
            }
          }
          else {
            S205167=1;
            active[65]=1;
            ends[65]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S205167){
            case 0 : 
              thread205479(tdone,ends);
              thread205480(tdone,ends);
              thread205481(tdone,ends);
              int biggest205482 = 0;
              if(ends[66]>=biggest205482){
                biggest205482=ends[66];
              }
              if(ends[67]>=biggest205482){
                biggest205482=ends[67];
              }
              if(ends[68]>=biggest205482){
                biggest205482=ends[68];
              }
              if(biggest205482 == 1){
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              if(biggest205482 == 2){
                ends[65]=2;
                ;//sysj\ECS.sysj line: 424, column: 7
                S205167=1;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              //FINXME code
              if(biggest205482 == 0){
                S205167=1;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 1 : 
              S205167=1;
              S205167=0;
              if(detectSmoke.getprestatus()){//sysj\ECS.sysj line: 422, column: 11
                thread205483(tdone,ends);
                thread205484(tdone,ends);
                thread205485(tdone,ends);
                int biggest205486 = 0;
                if(ends[66]>=biggest205486){
                  biggest205486=ends[66];
                }
                if(ends[67]>=biggest205486){
                  biggest205486=ends[67];
                }
                if(ends[68]>=biggest205486){
                  biggest205486=ends[68];
                }
                if(biggest205486 == 1){
                  active[65]=1;
                  ends[65]=1;
                  break RUN;
                }
              }
              else {
                S205167=1;
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
