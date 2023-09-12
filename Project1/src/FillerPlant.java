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
  private long __start_thread_15;//sysj\conveyor_plant.sysj line: 86, column: 5
  private int S213530 = 1;
  private int S213469 = 1;
  private int S213317 = 1;
  private int S213528 = 1;
  private int S213477 = 1;
  private int S213485 = 1;
  private int S213493 = 1;
  private int S213504 = 1;
  private int S213515 = 1;
  private int S213526 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread214612(int [] tdone, int [] ends){
        switch(S213526){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 116, column: 34
          ;//sysj\conveyor_plant.sysj line: 116, column: 49
          dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 116, column: 50
          currsigs.addElement(dosUnitFilledE);
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

  public void thread214611(int [] tdone, int [] ends){
        switch(S213515){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 114, column: 34
          ;//sysj\conveyor_plant.sysj line: 114, column: 47
          dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 114, column: 48
          currsigs.addElement(dosUnitEvacE);
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

  public void thread214610(int [] tdone, int [] ends){
        switch(S213504){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 112, column: 34
          ;//sysj\conveyor_plant.sysj line: 112, column: 54
          dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 112, column: 55
          currsigs.addElement(dosUnitValveExtendE);
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

  public void thread214609(int [] tdone, int [] ends){
        switch(S213493){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 110, column: 34
          dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 110, column: 55
          currsigs.addElement(dosUnitValveRetractE);
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

  public void thread214608(int [] tdone, int [] ends){
        switch(S213485){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 108, column: 34
          valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 108, column: 51
          currsigs.addElement(valveInletOnOffE);
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread214607(int [] tdone, int [] ends){
        switch(S213477){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 106, column: 34
          valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 106, column: 54
          currsigs.addElement(valveInjectorOnOffE);
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
  }

  public void thread214606(int [] tdone, int [] ends){
        switch(S213528){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread214607(tdone,ends);
        thread214608(tdone,ends);
        thread214609(tdone,ends);
        thread214610(tdone,ends);
        thread214611(tdone,ends);
        thread214612(tdone,ends);
        int biggest214613 = 0;
        if(ends[17]>=biggest214613){
          biggest214613=ends[17];
        }
        if(ends[18]>=biggest214613){
          biggest214613=ends[18];
        }
        if(ends[19]>=biggest214613){
          biggest214613=ends[19];
        }
        if(ends[20]>=biggest214613){
          biggest214613=ends[20];
        }
        if(ends[21]>=biggest214613){
          biggest214613=ends[21];
        }
        if(ends[22]>=biggest214613){
          biggest214613=ends[22];
        }
        if(biggest214613 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest214613 == 0){
          S213528=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread214605(int [] tdone, int [] ends){
        switch(S213469){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S213317){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 88, column: 13
              S213317=1;
              __start_thread_15 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 86, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_15 >= 500){//sysj\conveyor_plant.sysj line: 86, column: 5
                ends[15]=2;
                ;//sysj\conveyor_plant.sysj line: 86, column: 5
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 90, column: 7
                currsigs.addElement(dosUnitFilled);
                S213317=2;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_15 >= 500){//sysj\conveyor_plant.sysj line: 86, column: 5
              ends[15]=2;
              ;//sysj\conveyor_plant.sysj line: 86, column: 5
              dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 90, column: 7
              currsigs.addElement(dosUnitFilled);
              S213317=2;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 2 : 
            S213317=2;
            System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 92, column: 7
            S213317=3;
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
            break;
          
          case 3 : 
            if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 93, column: 13
              S213317=4;
              __start_thread_15 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 86, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_15 >= 500){//sysj\conveyor_plant.sysj line: 86, column: 5
                ends[15]=2;
                ;//sysj\conveyor_plant.sysj line: 86, column: 5
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 95, column: 7
                currsigs.addElement(dosUnitEvac);
                S213317=5;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 4 : 
            if(com.systemj.Timer.getMs() - __start_thread_15 >= 500){//sysj\conveyor_plant.sysj line: 86, column: 5
              ends[15]=2;
              ;//sysj\conveyor_plant.sysj line: 86, column: 5
              dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 95, column: 7
              currsigs.addElement(dosUnitEvac);
              S213317=5;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 5 : 
            S213317=5;
            System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 97, column: 7
            S213317=0;
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread214602(int [] tdone, int [] ends){
        S213526=1;
    if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 116, column: 34
      ;//sysj\conveyor_plant.sysj line: 116, column: 49
      dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 116, column: 50
      currsigs.addElement(dosUnitFilledE);
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

  public void thread214601(int [] tdone, int [] ends){
        S213515=1;
    if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 114, column: 34
      ;//sysj\conveyor_plant.sysj line: 114, column: 47
      dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 114, column: 48
      currsigs.addElement(dosUnitEvacE);
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

  public void thread214600(int [] tdone, int [] ends){
        S213504=1;
    if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 112, column: 34
      ;//sysj\conveyor_plant.sysj line: 112, column: 54
      dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 112, column: 55
      currsigs.addElement(dosUnitValveExtendE);
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

  public void thread214599(int [] tdone, int [] ends){
        S213493=1;
    if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 110, column: 34
      dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 110, column: 55
      currsigs.addElement(dosUnitValveRetractE);
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

  public void thread214598(int [] tdone, int [] ends){
        S213485=1;
    if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 108, column: 34
      valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 108, column: 51
      currsigs.addElement(valveInletOnOffE);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread214597(int [] tdone, int [] ends){
        S213477=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 106, column: 34
      valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 106, column: 54
      currsigs.addElement(valveInjectorOnOffE);
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

  public void thread214596(int [] tdone, int [] ends){
        S213528=1;
    thread214597(tdone,ends);
    thread214598(tdone,ends);
    thread214599(tdone,ends);
    thread214600(tdone,ends);
    thread214601(tdone,ends);
    thread214602(tdone,ends);
    int biggest214603 = 0;
    if(ends[17]>=biggest214603){
      biggest214603=ends[17];
    }
    if(ends[18]>=biggest214603){
      biggest214603=ends[18];
    }
    if(ends[19]>=biggest214603){
      biggest214603=ends[19];
    }
    if(ends[20]>=biggest214603){
      biggest214603=ends[20];
    }
    if(ends[21]>=biggest214603){
      biggest214603=ends[21];
    }
    if(ends[22]>=biggest214603){
      biggest214603=ends[22];
    }
    if(biggest214603 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread214595(int [] tdone, int [] ends){
        S213469=1;
    S213317=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S213530){
        case 0 : 
          S213530=0;
          break RUN;
        
        case 1 : 
          S213530=2;
          S213530=2;
          thread214595(tdone,ends);
          thread214596(tdone,ends);
          int biggest214604 = 0;
          if(ends[15]>=biggest214604){
            biggest214604=ends[15];
          }
          if(ends[16]>=biggest214604){
            biggest214604=ends[16];
          }
          if(biggest214604 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
        
        case 2 : 
          thread214605(tdone,ends);
          thread214606(tdone,ends);
          int biggest214614 = 0;
          if(ends[15]>=biggest214614){
            biggest214614=ends[15];
          }
          if(ends[16]>=biggest214614){
            biggest214614=ends[16];
          }
          if(biggest214614 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
          //FINXME code
          if(biggest214614 == 0){
            S213530=0;
            active[14]=0;
            ends[14]=0;
            S213530=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[14] != 0){
      int index = 14;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[14]!=0 || suspended[14]!=0 || active[14]!=1);
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
      if(paused[14]!=0 || suspended[14]!=0 || active[14]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
      }
      runFinisher();
      if(active[14] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
