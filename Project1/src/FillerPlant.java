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
  private int S30824 = 1;
  private int S30763 = 1;
  private int S30481 = 1;
  private int S30822 = 1;
  private int S30771 = 1;
  private int S30779 = 1;
  private int S30787 = 1;
  private int S30798 = 1;
  private int S30809 = 1;
  private int S30820 = 1;
  
  private int[] ends = new int[40];
  private int[] tdone = new int[40];
  
  public void thread31626(int [] tdone, int [] ends){
        switch(S30820){
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

  public void thread31625(int [] tdone, int [] ends){
        switch(S30809){
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

  public void thread31624(int [] tdone, int [] ends){
        switch(S30798){
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

  public void thread31623(int [] tdone, int [] ends){
        switch(S30787){
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

  public void thread31622(int [] tdone, int [] ends){
        switch(S30779){
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

  public void thread31621(int [] tdone, int [] ends){
        switch(S30771){
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

  public void thread31620(int [] tdone, int [] ends){
        switch(S30822){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread31621(tdone,ends);
        thread31622(tdone,ends);
        thread31623(tdone,ends);
        thread31624(tdone,ends);
        thread31625(tdone,ends);
        thread31626(tdone,ends);
        int biggest31627 = 0;
        if(ends[19]>=biggest31627){
          biggest31627=ends[19];
        }
        if(ends[20]>=biggest31627){
          biggest31627=ends[20];
        }
        if(ends[21]>=biggest31627){
          biggest31627=ends[21];
        }
        if(ends[22]>=biggest31627){
          biggest31627=ends[22];
        }
        if(ends[23]>=biggest31627){
          biggest31627=ends[23];
        }
        if(ends[24]>=biggest31627){
          biggest31627=ends[24];
        }
        if(biggest31627 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest31627 == 0){
          S30822=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread31619(int [] tdone, int [] ends){
        switch(S30763){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S30481){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 96, column: 13
              S30481=1;
              __start_thread_17 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 94, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_17 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 94, column: 5
                ends[17]=2;
                ;//sysj\conveyor_plant.sysj line: 94, column: 5
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 98, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 99, column: 7
                S30481=2;
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
              S30481=2;
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
              S30481=3;
              __start_thread_17 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 94, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_17 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 94, column: 5
                ends[17]=2;
                ;//sysj\conveyor_plant.sysj line: 94, column: 5
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 102, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 103, column: 7
                S30481=0;
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
              S30481=0;
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

  public void thread31616(int [] tdone, int [] ends){
        S30820=1;
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

  public void thread31615(int [] tdone, int [] ends){
        S30809=1;
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

  public void thread31614(int [] tdone, int [] ends){
        S30798=1;
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

  public void thread31613(int [] tdone, int [] ends){
        S30787=1;
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

  public void thread31612(int [] tdone, int [] ends){
        S30779=1;
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

  public void thread31611(int [] tdone, int [] ends){
        S30771=1;
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

  public void thread31610(int [] tdone, int [] ends){
        S30822=1;
    thread31611(tdone,ends);
    thread31612(tdone,ends);
    thread31613(tdone,ends);
    thread31614(tdone,ends);
    thread31615(tdone,ends);
    thread31616(tdone,ends);
    int biggest31617 = 0;
    if(ends[19]>=biggest31617){
      biggest31617=ends[19];
    }
    if(ends[20]>=biggest31617){
      biggest31617=ends[20];
    }
    if(ends[21]>=biggest31617){
      biggest31617=ends[21];
    }
    if(ends[22]>=biggest31617){
      biggest31617=ends[22];
    }
    if(ends[23]>=biggest31617){
      biggest31617=ends[23];
    }
    if(ends[24]>=biggest31617){
      biggest31617=ends[24];
    }
    if(biggest31617 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread31609(int [] tdone, int [] ends){
        S30763=1;
    S30481=0;
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
      switch(S30824){
        case 0 : 
          S30824=0;
          break RUN;
        
        case 1 : 
          S30824=2;
          S30824=2;
          thread31609(tdone,ends);
          thread31610(tdone,ends);
          int biggest31618 = 0;
          if(ends[17]>=biggest31618){
            biggest31618=ends[17];
          }
          if(ends[18]>=biggest31618){
            biggest31618=ends[18];
          }
          if(biggest31618 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
          }
        
        case 2 : 
          thread31619(tdone,ends);
          thread31620(tdone,ends);
          int biggest31628 = 0;
          if(ends[17]>=biggest31628){
            biggest31628=ends[17];
          }
          if(ends[18]>=biggest31628){
            biggest31628=ends[18];
          }
          if(biggest31628 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
          }
          //FINXME code
          if(biggest31628 == 0){
            S30824=0;
            active[16]=0;
            ends[16]=0;
            S30824=0;
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
