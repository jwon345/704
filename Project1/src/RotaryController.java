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
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  private long __start_thread_3;//sysj\rotary_controller.sysj line: 30, column: 14
  private long __start_thread_1;//sysj\rotary_controller.sysj line: 19, column: 6
  private int S5029 = 1;
  private int S4609 = 1;
  private int S4617 = 1;
  private int S4633 = 1;
  private int S4619 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread5035(int [] tdone, int [] ends){
        switch(S4633){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S4619){
          case 0 : 
            S4619=0;
            if(com.systemj.Timer.getMs() - __start_thread_3 >= 100){//sysj\rotary_controller.sysj line: 30, column: 14
              ends[3]=3;
              ;//sysj\rotary_controller.sysj line: 30, column: 14
              ends[3]=2;
              tdone[3]=1;
            }
            else {
              S4619=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S4619=1;
            S4619=0;
            if(com.systemj.Timer.getMs() - __start_thread_3 >= 100){//sysj\rotary_controller.sysj line: 30, column: 14
              ends[3]=3;
              ;//sysj\rotary_controller.sysj line: 30, column: 14
              ends[3]=2;
              tdone[3]=1;
            }
            else {
              S4619=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5034(int [] tdone, int [] ends){
        switch(S4617){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\rotary_controller.sysj line: 27, column: 18
        currsigs.addElement(rotaryTableTrigger);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread5032(int [] tdone, int [] ends){
        S4633=1;
    __start_thread_3 = com.systemj.Timer.getMs();//sysj\rotary_controller.sysj line: 30, column: 14
    S4619=0;
    if(com.systemj.Timer.getMs() - __start_thread_3 >= 100){//sysj\rotary_controller.sysj line: 30, column: 14
      ends[3]=3;
      ;//sysj\rotary_controller.sysj line: 30, column: 14
      ends[3]=2;
      tdone[3]=1;
    }
    else {
      S4619=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread5031(int [] tdone, int [] ends){
        S4617=1;
    System.out.println("*Rotating*");//sysj\rotary_controller.sysj line: 26, column: 18
    rotaryTableTrigger.setPresent();//sysj\rotary_controller.sysj line: 27, column: 18
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
      switch(S5029){
        case 0 : 
          S5029=0;
          break RUN;
        
        case 1 : 
          S5029=2;
          S5029=2;
          S4609=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S4609){
            case 0 : 
              if(fillerReady.getprestatus() && capperReady.getprestatus() && convReady.getprestatus()){//sysj\rotary_controller.sysj line: 20, column: 16
                System.out.println("*All controllers are ready*");//sysj\rotary_controller.sysj line: 22, column: 10
                S4609=1;
                thread5031(tdone,ends);
                thread5032(tdone,ends);
                int biggest5033 = 0;
                if(ends[2]>=biggest5033){
                  biggest5033=ends[2];
                }
                if(ends[3]>=biggest5033){
                  biggest5033=ends[3];
                }
                if(biggest5033 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                if(biggest5033 == 2){
                  ends[1]=2;
                  ;//sysj\rotary_controller.sysj line: 24, column: 10
                  System.out.println("*Waiting for Alignment*");//sysj\rotary_controller.sysj line: 36, column: 10
                  S4609=2;
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
              thread5034(tdone,ends);
              thread5035(tdone,ends);
              int biggest5036 = 0;
              if(ends[2]>=biggest5036){
                biggest5036=ends[2];
              }
              if(ends[3]>=biggest5036){
                biggest5036=ends[3];
              }
              if(biggest5036 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              if(biggest5036 == 2){
                ends[1]=2;
                ;//sysj\rotary_controller.sysj line: 24, column: 10
                System.out.println("*Waiting for Alignment*");//sysj\rotary_controller.sysj line: 36, column: 10
                S4609=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest5036 == 0){
                System.out.println("*Waiting for Alignment*");//sysj\rotary_controller.sysj line: 36, column: 10
                S4609=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_controller.sysj line: 37, column: 16
                System.out.println("*Aligned*");//sysj\rotary_controller.sysj line: 38, column: 10
                S4609=3;
                __start_thread_1 = com.systemj.Timer.getMs();//sysj\rotary_controller.sysj line: 19, column: 6
                if(com.systemj.Timer.getMs() - __start_thread_1 >= 500){//sysj\rotary_controller.sysj line: 19, column: 6
                  ends[1]=2;
                  ;//sysj\rotary_controller.sysj line: 19, column: 6
                  S4609=0;
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
              if(com.systemj.Timer.getMs() - __start_thread_1 >= 500){//sysj\rotary_controller.sysj line: 19, column: 6
                ends[1]=2;
                ;//sysj\rotary_controller.sysj line: 19, column: 6
                S4609=0;
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
      rotaryTableTrigger.setpreclear();
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
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        capOnBottleAtPos1.gethook();
        fillerReady.gethook();
        capperReady.gethook();
        convReady.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
