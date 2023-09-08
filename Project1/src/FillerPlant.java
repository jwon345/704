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
  private long __start_thread_19;//sysj\conveyor_plant.sysj line: 100, column: 5
  private int S19767 = 1;
  private int S19706 = 1;
  private int S19424 = 1;
  private int S19765 = 1;
  private int S19714 = 1;
  private int S19722 = 1;
  private int S19730 = 1;
  private int S19741 = 1;
  private int S19752 = 1;
  private int S19763 = 1;
  
  private int[] ends = new int[27];
  private int[] tdone = new int[27];
  
  public void thread19837(int [] tdone, int [] ends){
        switch(S19763){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 128, column: 34
          ;//sysj\conveyor_plant.sysj line: 128, column: 49
          dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 128, column: 50
          currsigs.addElement(dosUnitFilledE);
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

  public void thread19836(int [] tdone, int [] ends){
        switch(S19752){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 126, column: 34
          ;//sysj\conveyor_plant.sysj line: 126, column: 47
          dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 126, column: 48
          currsigs.addElement(dosUnitEvacE);
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

  public void thread19835(int [] tdone, int [] ends){
        switch(S19741){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 124, column: 34
          ;//sysj\conveyor_plant.sysj line: 124, column: 54
          dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 124, column: 55
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

  public void thread19834(int [] tdone, int [] ends){
        switch(S19730){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 122, column: 34
          dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 122, column: 55
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

  public void thread19833(int [] tdone, int [] ends){
        switch(S19722){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 120, column: 34
          valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 120, column: 51
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

  public void thread19832(int [] tdone, int [] ends){
        switch(S19714){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 118, column: 34
          valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 118, column: 54
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

  public void thread19831(int [] tdone, int [] ends){
        switch(S19765){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        thread19832(tdone,ends);
        thread19833(tdone,ends);
        thread19834(tdone,ends);
        thread19835(tdone,ends);
        thread19836(tdone,ends);
        thread19837(tdone,ends);
        int biggest19838 = 0;
        if(ends[21]>=biggest19838){
          biggest19838=ends[21];
        }
        if(ends[22]>=biggest19838){
          biggest19838=ends[22];
        }
        if(ends[23]>=biggest19838){
          biggest19838=ends[23];
        }
        if(ends[24]>=biggest19838){
          biggest19838=ends[24];
        }
        if(ends[25]>=biggest19838){
          biggest19838=ends[25];
        }
        if(ends[26]>=biggest19838){
          biggest19838=ends[26];
        }
        if(biggest19838 == 1){
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        //FINXME code
        if(biggest19838 == 0){
          S19765=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread19830(int [] tdone, int [] ends){
        switch(S19706){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S19424){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 102, column: 13
              S19424=1;
              __start_thread_19 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 100, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_19 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 100, column: 5
                ends[19]=2;
                ;//sysj\conveyor_plant.sysj line: 100, column: 5
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 104, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 105, column: 7
                S19424=2;
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
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_19 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 100, column: 5
              ends[19]=2;
              ;//sysj\conveyor_plant.sysj line: 100, column: 5
              dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 104, column: 7
              currsigs.addElement(dosUnitFilled);
              System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 105, column: 7
              S19424=2;
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
          
          case 2 : 
            if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 106, column: 13
              S19424=3;
              __start_thread_19 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 100, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_19 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 100, column: 5
                ends[19]=2;
                ;//sysj\conveyor_plant.sysj line: 100, column: 5
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 108, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 109, column: 7
                S19424=0;
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
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 3 : 
            if(com.systemj.Timer.getMs() - __start_thread_19 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 100, column: 5
              ends[19]=2;
              ;//sysj\conveyor_plant.sysj line: 100, column: 5
              dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 108, column: 7
              currsigs.addElement(dosUnitEvac);
              System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 109, column: 7
              S19424=0;
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

  public void thread19827(int [] tdone, int [] ends){
        S19763=1;
    if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 128, column: 34
      ;//sysj\conveyor_plant.sysj line: 128, column: 49
      dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 128, column: 50
      currsigs.addElement(dosUnitFilledE);
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

  public void thread19826(int [] tdone, int [] ends){
        S19752=1;
    if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 126, column: 34
      ;//sysj\conveyor_plant.sysj line: 126, column: 47
      dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 126, column: 48
      currsigs.addElement(dosUnitEvacE);
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

  public void thread19825(int [] tdone, int [] ends){
        S19741=1;
    if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 124, column: 34
      ;//sysj\conveyor_plant.sysj line: 124, column: 54
      dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 124, column: 55
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

  public void thread19824(int [] tdone, int [] ends){
        S19730=1;
    if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 122, column: 34
      dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 122, column: 55
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

  public void thread19823(int [] tdone, int [] ends){
        S19722=1;
    if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 120, column: 34
      valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 120, column: 51
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

  public void thread19822(int [] tdone, int [] ends){
        S19714=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 118, column: 34
      valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 118, column: 54
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

  public void thread19821(int [] tdone, int [] ends){
        S19765=1;
    thread19822(tdone,ends);
    thread19823(tdone,ends);
    thread19824(tdone,ends);
    thread19825(tdone,ends);
    thread19826(tdone,ends);
    thread19827(tdone,ends);
    int biggest19828 = 0;
    if(ends[21]>=biggest19828){
      biggest19828=ends[21];
    }
    if(ends[22]>=biggest19828){
      biggest19828=ends[22];
    }
    if(ends[23]>=biggest19828){
      biggest19828=ends[23];
    }
    if(ends[24]>=biggest19828){
      biggest19828=ends[24];
    }
    if(ends[25]>=biggest19828){
      biggest19828=ends[25];
    }
    if(ends[26]>=biggest19828){
      biggest19828=ends[26];
    }
    if(biggest19828 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread19820(int [] tdone, int [] ends){
        S19706=1;
    S19424=0;
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
      switch(S19767){
        case 0 : 
          S19767=0;
          break RUN;
        
        case 1 : 
          S19767=2;
          S19767=2;
          thread19820(tdone,ends);
          thread19821(tdone,ends);
          int biggest19829 = 0;
          if(ends[19]>=biggest19829){
            biggest19829=ends[19];
          }
          if(ends[20]>=biggest19829){
            biggest19829=ends[20];
          }
          if(biggest19829 == 1){
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
        
        case 2 : 
          thread19830(tdone,ends);
          thread19831(tdone,ends);
          int biggest19839 = 0;
          if(ends[19]>=biggest19839){
            biggest19839=ends[19];
          }
          if(ends[20]>=biggest19839){
            biggest19839=ends[20];
          }
          if(biggest19839 == 1){
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
          //FINXME code
          if(biggest19839 == 0){
            S19767=0;
            active[18]=0;
            ends[18]=0;
            S19767=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
