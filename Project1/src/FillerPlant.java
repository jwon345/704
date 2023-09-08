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
  private int S16742 = 1;
  private int S16670 = 1;
  private int S16658 = 1;
  private int S16740 = 1;
  private int S16678 = 1;
  private int S16686 = 1;
  private int S16694 = 1;
  private int S16705 = 1;
  private int S16716 = 1;
  private int S16727 = 1;
  private int S16738 = 1;
  
  private int[] ends = new int[28];
  private int[] tdone = new int[28];
  
  public void thread16814(int [] tdone, int [] ends){
        switch(S16738){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 127, column: 34
          ;//sysj\conveyor_plant.sysj line: 127, column: 49
          dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 127, column: 50
          currsigs.addElement(dosUnitFilledE);
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread16813(int [] tdone, int [] ends){
        switch(S16727){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 125, column: 34
          ;//sysj\conveyor_plant.sysj line: 125, column: 47
          dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 125, column: 48
          currsigs.addElement(dosUnitEvacE);
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread16812(int [] tdone, int [] ends){
        switch(S16716){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\conveyor_plant.sysj line: 123, column: 34
          ;//sysj\conveyor_plant.sysj line: 123, column: 48
          bottleAtPos2E.setPresent();//sysj\conveyor_plant.sysj line: 123, column: 49
          currsigs.addElement(bottleAtPos2E);
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread16811(int [] tdone, int [] ends){
        switch(S16705){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 121, column: 34
          ;//sysj\conveyor_plant.sysj line: 121, column: 54
          dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 121, column: 55
          currsigs.addElement(dosUnitValveExtendE);
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

  public void thread16810(int [] tdone, int [] ends){
        switch(S16694){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 119, column: 34
          dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 119, column: 55
          currsigs.addElement(dosUnitValveRetractE);
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

  public void thread16809(int [] tdone, int [] ends){
        switch(S16686){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 117, column: 34
          valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 117, column: 51
          currsigs.addElement(valveInletOnOffE);
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

  public void thread16808(int [] tdone, int [] ends){
        switch(S16678){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 115, column: 34
          valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 115, column: 54
          currsigs.addElement(valveInjectorOnOffE);
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

  public void thread16807(int [] tdone, int [] ends){
        switch(S16740){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        thread16808(tdone,ends);
        thread16809(tdone,ends);
        thread16810(tdone,ends);
        thread16811(tdone,ends);
        thread16812(tdone,ends);
        thread16813(tdone,ends);
        thread16814(tdone,ends);
        int biggest16815 = 0;
        if(ends[21]>=biggest16815){
          biggest16815=ends[21];
        }
        if(ends[22]>=biggest16815){
          biggest16815=ends[22];
        }
        if(ends[23]>=biggest16815){
          biggest16815=ends[23];
        }
        if(ends[24]>=biggest16815){
          biggest16815=ends[24];
        }
        if(ends[25]>=biggest16815){
          biggest16815=ends[25];
        }
        if(ends[26]>=biggest16815){
          biggest16815=ends[26];
        }
        if(ends[27]>=biggest16815){
          biggest16815=ends[27];
        }
        if(biggest16815 == 1){
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        //FINXME code
        if(biggest16815 == 0){
          S16740=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread16806(int [] tdone, int [] ends){
        switch(S16670){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S16658){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 102, column: 13
              dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 103, column: 7
              currsigs.addElement(dosUnitFilled);
              System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 104, column: 7
              S16658=1;
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
          
          case 1 : 
            if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 105, column: 13
              dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 106, column: 7
              currsigs.addElement(dosUnitEvac);
              System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 107, column: 7
              S16658=0;
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
        break;
      
    }
  }

  public void thread16803(int [] tdone, int [] ends){
        S16738=1;
    if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 127, column: 34
      ;//sysj\conveyor_plant.sysj line: 127, column: 49
      dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 127, column: 50
      currsigs.addElement(dosUnitFilledE);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread16802(int [] tdone, int [] ends){
        S16727=1;
    if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 125, column: 34
      ;//sysj\conveyor_plant.sysj line: 125, column: 47
      dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 125, column: 48
      currsigs.addElement(dosUnitEvacE);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread16801(int [] tdone, int [] ends){
        S16716=1;
    if(bottleAtPos2.getprestatus()){//sysj\conveyor_plant.sysj line: 123, column: 34
      ;//sysj\conveyor_plant.sysj line: 123, column: 48
      bottleAtPos2E.setPresent();//sysj\conveyor_plant.sysj line: 123, column: 49
      currsigs.addElement(bottleAtPos2E);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread16800(int [] tdone, int [] ends){
        S16705=1;
    if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 121, column: 34
      ;//sysj\conveyor_plant.sysj line: 121, column: 54
      dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 121, column: 55
      currsigs.addElement(dosUnitValveExtendE);
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

  public void thread16799(int [] tdone, int [] ends){
        S16694=1;
    if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 119, column: 34
      dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 119, column: 55
      currsigs.addElement(dosUnitValveRetractE);
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

  public void thread16798(int [] tdone, int [] ends){
        S16686=1;
    if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 117, column: 34
      valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 117, column: 51
      currsigs.addElement(valveInletOnOffE);
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

  public void thread16797(int [] tdone, int [] ends){
        S16678=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 115, column: 34
      valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 115, column: 54
      currsigs.addElement(valveInjectorOnOffE);
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

  public void thread16796(int [] tdone, int [] ends){
        S16740=1;
    thread16797(tdone,ends);
    thread16798(tdone,ends);
    thread16799(tdone,ends);
    thread16800(tdone,ends);
    thread16801(tdone,ends);
    thread16802(tdone,ends);
    thread16803(tdone,ends);
    int biggest16804 = 0;
    if(ends[21]>=biggest16804){
      biggest16804=ends[21];
    }
    if(ends[22]>=biggest16804){
      biggest16804=ends[22];
    }
    if(ends[23]>=biggest16804){
      biggest16804=ends[23];
    }
    if(ends[24]>=biggest16804){
      biggest16804=ends[24];
    }
    if(ends[25]>=biggest16804){
      biggest16804=ends[25];
    }
    if(ends[26]>=biggest16804){
      biggest16804=ends[26];
    }
    if(ends[27]>=biggest16804){
      biggest16804=ends[27];
    }
    if(biggest16804 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread16795(int [] tdone, int [] ends){
        S16670=1;
    S16658=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S16742){
        case 0 : 
          S16742=0;
          break RUN;
        
        case 1 : 
          S16742=2;
          S16742=2;
          thread16795(tdone,ends);
          thread16796(tdone,ends);
          int biggest16805 = 0;
          if(ends[19]>=biggest16805){
            biggest16805=ends[19];
          }
          if(ends[20]>=biggest16805){
            biggest16805=ends[20];
          }
          if(biggest16805 == 1){
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
        
        case 2 : 
          thread16806(tdone,ends);
          thread16807(tdone,ends);
          int biggest16816 = 0;
          if(ends[19]>=biggest16816){
            biggest16816=ends[19];
          }
          if(ends[20]>=biggest16816){
            biggest16816=ends[20];
          }
          if(biggest16816 == 1){
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
          //FINXME code
          if(biggest16816 == 0){
            S16742=0;
            active[18]=0;
            ends[18]=0;
            S16742=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[18] != 0){
      int index = 18;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[18]!=0 || suspended[18]!=0 || active[18]!=1);
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
      if(paused[18]!=0 || suspended[18]!=0 || active[18]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
      }
      runFinisher();
      if(active[18] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
