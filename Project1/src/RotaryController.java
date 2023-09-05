import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class RotaryController extends ClockDomain{
  public RotaryController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal fillerReady = new Signal("fillerReady", Signal.INPUT);
  public Signal capperReady = new Signal("capperReady", Signal.INPUT);
  public Signal convReady = new Signal("convReady", Signal.INPUT);
  public Signal baxterReady = new Signal("baxterReady", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  private Signal allControllersReady_1;
  private long __start_thread_3;//sysj\rotary_controller.sysj line: 34, column: 14
  private long __start_thread_1;//sysj\rotary_controller.sysj line: 21, column: 6
  private int S3238 = 1;
  private int S2818 = 1;
  private int S2826 = 1;
  private int S2842 = 1;
  private int S2828 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread3244(int [] tdone, int [] ends){
        switch(S2842){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2828){
          case 0 : 
            S2828=0;
            if(com.systemj.Timer.getMs() - __start_thread_3 >= 100){//sysj\rotary_controller.sysj line: 34, column: 14
              ends[3]=3;
              ;//sysj\rotary_controller.sysj line: 34, column: 14
              ends[3]=2;
              tdone[3]=1;
            }
            else {
              S2828=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S2828=1;
            S2828=0;
            if(com.systemj.Timer.getMs() - __start_thread_3 >= 100){//sysj\rotary_controller.sysj line: 34, column: 14
              ends[3]=3;
              ;//sysj\rotary_controller.sysj line: 34, column: 14
              ends[3]=2;
              tdone[3]=1;
            }
            else {
              S2828=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3243(int [] tdone, int [] ends){
        switch(S2826){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\rotary_controller.sysj line: 31, column: 18
        currsigs.addElement(rotaryTableTrigger);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread3241(int [] tdone, int [] ends){
        S2842=1;
    __start_thread_3 = com.systemj.Timer.getMs();//sysj\rotary_controller.sysj line: 34, column: 14
    S2828=0;
    if(com.systemj.Timer.getMs() - __start_thread_3 >= 100){//sysj\rotary_controller.sysj line: 34, column: 14
      ends[3]=3;
      ;//sysj\rotary_controller.sysj line: 34, column: 14
      ends[3]=2;
      tdone[3]=1;
    }
    else {
      S2828=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread3240(int [] tdone, int [] ends){
        S2826=1;
    System.out.println("*Rotating*");//sysj\rotary_controller.sysj line: 30, column: 18
    rotaryTableTrigger.setPresent();//sysj\rotary_controller.sysj line: 31, column: 18
    currsigs.addElement(rotaryTableTrigger);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S3238){
        case 0 : 
          S3238=0;
          break RUN;
        
        case 1 : 
          S3238=2;
          S3238=2;
          allControllersReady_1.setClear();//sysj\rotary_controller.sysj line: 19, column: 6
          S2818=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          allControllersReady_1.setClear();//sysj\rotary_controller.sysj line: 19, column: 6
          switch(S2818){
            case 0 : 
              if(fillerReady.getprestatus() && capperReady.getprestatus() && convReady.getprestatus() && baxterReady.getprestatus()){//sysj\rotary_controller.sysj line: 23, column: 16
                allControllersReady_1.setPresent();//sysj\rotary_controller.sysj line: 24, column: 10
                currsigs.addElement(allControllersReady_1);
                System.out.println("*All controllers are ready*");//sysj\rotary_controller.sysj line: 26, column: 10
                S2818=1;
                thread3240(tdone,ends);
                thread3241(tdone,ends);
                int biggest3242 = 0;
                if(ends[2]>=biggest3242){
                  biggest3242=ends[2];
                }
                if(ends[3]>=biggest3242){
                  biggest3242=ends[3];
                }
                if(biggest3242 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                if(biggest3242 == 2){
                  ends[1]=2;
                  ;//sysj\rotary_controller.sysj line: 28, column: 10
                  System.out.println("*Waiting for Alignment*");//sysj\rotary_controller.sysj line: 40, column: 10
                  S2818=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              thread3243(tdone,ends);
              thread3244(tdone,ends);
              int biggest3245 = 0;
              if(ends[2]>=biggest3245){
                biggest3245=ends[2];
              }
              if(ends[3]>=biggest3245){
                biggest3245=ends[3];
              }
              if(biggest3245 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              if(biggest3245 == 2){
                ends[1]=2;
                ;//sysj\rotary_controller.sysj line: 28, column: 10
                System.out.println("*Waiting for Alignment*");//sysj\rotary_controller.sysj line: 40, column: 10
                S2818=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest3245 == 0){
                System.out.println("*Waiting for Alignment*");//sysj\rotary_controller.sysj line: 40, column: 10
                S2818=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_controller.sysj line: 41, column: 16
                System.out.println("*Aligned*");//sysj\rotary_controller.sysj line: 42, column: 10
                S2818=3;
                __start_thread_1 = com.systemj.Timer.getMs();//sysj\rotary_controller.sysj line: 21, column: 6
                if(com.systemj.Timer.getMs() - __start_thread_1 >= 500){//sysj\rotary_controller.sysj line: 21, column: 6
                  ends[1]=2;
                  ;//sysj\rotary_controller.sysj line: 21, column: 6
                  S2818=0;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 3 : 
              if(com.systemj.Timer.getMs() - __start_thread_1 >= 500){//sysj\rotary_controller.sysj line: 21, column: 6
                ends[1]=2;
                ;//sysj\rotary_controller.sysj line: 21, column: 6
                S2818=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    allControllersReady_1 = new Signal();
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
          tableAlignedWithSensor.gethook();
          bottleAtPos5.gethook();
          capOnBottleAtPos1.gethook();
          fillerReady.gethook();
          capperReady.gethook();
          convReady.gethook();
          baxterReady.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      fillerReady.setpreclear();
      capperReady.setpreclear();
      convReady.setpreclear();
      baxterReady.setpreclear();
      rotaryTableTrigger.setpreclear();
      allControllersReady_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = fillerReady.getStatus() ? fillerReady.setprepresent() : fillerReady.setpreclear();
      fillerReady.setpreval(fillerReady.getValue());
      fillerReady.setClear();
      dummyint = capperReady.getStatus() ? capperReady.setprepresent() : capperReady.setpreclear();
      capperReady.setpreval(capperReady.getValue());
      capperReady.setClear();
      dummyint = convReady.getStatus() ? convReady.setprepresent() : convReady.setpreclear();
      convReady.setpreval(convReady.getValue());
      convReady.setClear();
      dummyint = baxterReady.getStatus() ? baxterReady.setprepresent() : baxterReady.setpreclear();
      baxterReady.setpreval(baxterReady.getValue());
      baxterReady.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      allControllersReady_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        capOnBottleAtPos1.gethook();
        fillerReady.gethook();
        capperReady.gethook();
        convReady.gethook();
        baxterReady.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
