import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1

public class FillerPlant extends ClockDomain{
  public FillerPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal valveInjectorOnOffE = new Signal("valveInjectorOnOffE", Signal.OUTPUT);
  public Signal valveInletOnOffE = new Signal("valveInletOnOffE", Signal.OUTPUT);
  public Signal dosUnitValveRetractE = new Signal("dosUnitValveRetractE", Signal.OUTPUT);
  public Signal dosUnitValveExtendE = new Signal("dosUnitValveExtendE", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal dosUnitEvacE = new Signal("dosUnitEvacE", Signal.OUTPUT);
  public Signal dosUnitFilledE = new Signal("dosUnitFilledE", Signal.OUTPUT);
  private long __start_thread_17;//sysj\conveyor_plant.sysj line: 94, column: 5
  private int S32432 = 1;
  private int S32371 = 1;
  private int S32089 = 1;
  private int S32430 = 1;
  private int S32379 = 1;
  private int S32387 = 1;
  private int S32395 = 1;
  private int S32406 = 1;
  private int S32417 = 1;
  private int S32428 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread32632(int [] tdone, int [] ends){
        switch(S32428){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 122, column: 34
          ;//sysj\conveyor_plant.sysj line: 122, column: 49
          dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 122, column: 50
          currsigs.addElement(dosUnitFilledE);
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread32631(int [] tdone, int [] ends){
        switch(S32417){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 120, column: 34
          ;//sysj\conveyor_plant.sysj line: 120, column: 47
          dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 120, column: 48
          currsigs.addElement(dosUnitEvacE);
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread32630(int [] tdone, int [] ends){
        switch(S32406){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 118, column: 34
          ;//sysj\conveyor_plant.sysj line: 118, column: 54
          dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 118, column: 55
          currsigs.addElement(dosUnitValveExtendE);
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread32629(int [] tdone, int [] ends){
        switch(S32395){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 116, column: 34
          dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 116, column: 55
          currsigs.addElement(dosUnitValveRetractE);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread32628(int [] tdone, int [] ends){
        switch(S32387){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 114, column: 34
          valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 114, column: 51
          currsigs.addElement(valveInletOnOffE);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread32627(int [] tdone, int [] ends){
        switch(S32379){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 112, column: 34
          valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 112, column: 54
          currsigs.addElement(valveInjectorOnOffE);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread32626(int [] tdone, int [] ends){
        switch(S32430){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread32627(tdone,ends);
        thread32628(tdone,ends);
        thread32629(tdone,ends);
        thread32630(tdone,ends);
        thread32631(tdone,ends);
        thread32632(tdone,ends);
        int biggest32633 = 0;
        if(ends[19]>=biggest32633){
          biggest32633=ends[19];
        }
        if(ends[20]>=biggest32633){
          biggest32633=ends[20];
        }
        if(ends[21]>=biggest32633){
          biggest32633=ends[21];
        }
        if(ends[22]>=biggest32633){
          biggest32633=ends[22];
        }
        if(ends[23]>=biggest32633){
          biggest32633=ends[23];
        }
        if(ends[24]>=biggest32633){
          biggest32633=ends[24];
        }
        if(biggest32633 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest32633 == 0){
          S32430=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread32625(int [] tdone, int [] ends){
        switch(S32371){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S32089){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 96, column: 13
              S32089=1;
              __start_thread_17 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 94, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_17 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 94, column: 5
                ends[17]=2;
                ;//sysj\conveyor_plant.sysj line: 94, column: 5
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 98, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 99, column: 7
                S32089=2;
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
              else {
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_17 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 94, column: 5
              ends[17]=2;
              ;//sysj\conveyor_plant.sysj line: 94, column: 5
              dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 98, column: 7
              currsigs.addElement(dosUnitFilled);
              System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 99, column: 7
              S32089=2;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 2 : 
            if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 100, column: 13
              S32089=3;
              __start_thread_17 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 94, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_17 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 94, column: 5
                ends[17]=2;
                ;//sysj\conveyor_plant.sysj line: 94, column: 5
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 102, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 103, column: 7
                S32089=0;
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
              else {
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 3 : 
            if(com.systemj.Timer.getMs() - __start_thread_17 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 94, column: 5
              ends[17]=2;
              ;//sysj\conveyor_plant.sysj line: 94, column: 5
              dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 102, column: 7
              currsigs.addElement(dosUnitEvac);
              System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 103, column: 7
              S32089=0;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread32622(int [] tdone, int [] ends){
        S32428=1;
    if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 122, column: 34
      ;//sysj\conveyor_plant.sysj line: 122, column: 49
      dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 122, column: 50
      currsigs.addElement(dosUnitFilledE);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread32621(int [] tdone, int [] ends){
        S32417=1;
    if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 120, column: 34
      ;//sysj\conveyor_plant.sysj line: 120, column: 47
      dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 120, column: 48
      currsigs.addElement(dosUnitEvacE);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread32620(int [] tdone, int [] ends){
        S32406=1;
    if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 118, column: 34
      ;//sysj\conveyor_plant.sysj line: 118, column: 54
      dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 118, column: 55
      currsigs.addElement(dosUnitValveExtendE);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread32619(int [] tdone, int [] ends){
        S32395=1;
    if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 116, column: 34
      dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 116, column: 55
      currsigs.addElement(dosUnitValveRetractE);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread32618(int [] tdone, int [] ends){
        S32387=1;
    if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 114, column: 34
      valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 114, column: 51
      currsigs.addElement(valveInletOnOffE);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread32617(int [] tdone, int [] ends){
        S32379=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 112, column: 34
      valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 112, column: 54
      currsigs.addElement(valveInjectorOnOffE);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread32616(int [] tdone, int [] ends){
        S32430=1;
    thread32617(tdone,ends);
    thread32618(tdone,ends);
    thread32619(tdone,ends);
    thread32620(tdone,ends);
    thread32621(tdone,ends);
    thread32622(tdone,ends);
    int biggest32623 = 0;
    if(ends[19]>=biggest32623){
      biggest32623=ends[19];
    }
    if(ends[20]>=biggest32623){
      biggest32623=ends[20];
    }
    if(ends[21]>=biggest32623){
      biggest32623=ends[21];
    }
    if(ends[22]>=biggest32623){
      biggest32623=ends[22];
    }
    if(ends[23]>=biggest32623){
      biggest32623=ends[23];
    }
    if(ends[24]>=biggest32623){
      biggest32623=ends[24];
    }
    if(biggest32623 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread32615(int [] tdone, int [] ends){
        S32371=1;
    S32089=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S32432){
        case 0 : 
          S32432=0;
          break RUN;
        
        case 1 : 
          S32432=2;
          S32432=2;
          thread32615(tdone,ends);
          thread32616(tdone,ends);
          int biggest32624 = 0;
          if(ends[17]>=biggest32624){
            biggest32624=ends[17];
          }
          if(ends[18]>=biggest32624){
            biggest32624=ends[18];
          }
          if(biggest32624 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
          }
        
        case 2 : 
          thread32625(tdone,ends);
          thread32626(tdone,ends);
          int biggest32634 = 0;
          if(ends[17]>=biggest32634){
            biggest32634=ends[17];
          }
          if(ends[18]>=biggest32634){
            biggest32634=ends[18];
          }
          if(biggest32634 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
          }
          //FINXME code
          if(biggest32634 == 0){
            S32432=0;
            active[16]=0;
            ends[16]=0;
            S32432=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[16] != 0){
      int index = 16;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[16]!=0 || suspended[16]!=0 || active[16]!=1);
      else{
        if(!df){
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
          df = true;
        }
        runClockDomain();
      }
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      valveInjectorOnOffE.setpreclear();
      valveInletOnOffE.setpreclear();
      dosUnitValveRetractE.setpreclear();
      dosUnitValveExtendE.setpreclear();
      bottleAtPos2E.setpreclear();
      dosUnitEvacE.setpreclear();
      dosUnitFilledE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = valveInjectorOnOff.getStatus() ? valveInjectorOnOff.setprepresent() : valveInjectorOnOff.setpreclear();
      valveInjectorOnOff.setpreval(valveInjectorOnOff.getValue());
      valveInjectorOnOff.setClear();
      dummyint = valveInletOnOff.getStatus() ? valveInletOnOff.setprepresent() : valveInletOnOff.setpreclear();
      valveInletOnOff.setpreval(valveInletOnOff.getValue());
      valveInletOnOff.setClear();
      dummyint = dosUnitValveRetract.getStatus() ? dosUnitValveRetract.setprepresent() : dosUnitValveRetract.setpreclear();
      dosUnitValveRetract.setpreval(dosUnitValveRetract.getValue());
      dosUnitValveRetract.setClear();
      dummyint = dosUnitValveExtend.getStatus() ? dosUnitValveExtend.setprepresent() : dosUnitValveExtend.setpreclear();
      dosUnitValveExtend.setpreval(dosUnitValveExtend.getValue());
      dosUnitValveExtend.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      valveInjectorOnOffE.sethook();
      valveInjectorOnOffE.setClear();
      valveInletOnOffE.sethook();
      valveInletOnOffE.setClear();
      dosUnitValveRetractE.sethook();
      dosUnitValveRetractE.setClear();
      dosUnitValveExtendE.sethook();
      dosUnitValveExtendE.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      dosUnitEvacE.sethook();
      dosUnitEvacE.setClear();
      dosUnitFilledE.sethook();
      dosUnitFilledE.setClear();
      if(paused[16]!=0 || suspended[16]!=0 || active[16]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
      }
      runFinisher();
      if(active[16] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
