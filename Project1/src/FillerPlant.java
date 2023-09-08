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
  private int S20015 = 1;
  private int S19954 = 1;
  private int S19672 = 1;
  private int S20013 = 1;
  private int S19962 = 1;
  private int S19970 = 1;
  private int S19978 = 1;
  private int S19989 = 1;
  private int S20000 = 1;
  private int S20011 = 1;
  
  private int[] ends = new int[27];
  private int[] tdone = new int[27];
  
  public void thread20085(int [] tdone, int [] ends){
        switch(S20011){
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

  public void thread20084(int [] tdone, int [] ends){
        switch(S20000){
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

  public void thread20083(int [] tdone, int [] ends){
        switch(S19989){
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

  public void thread20082(int [] tdone, int [] ends){
        switch(S19978){
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

  public void thread20081(int [] tdone, int [] ends){
        switch(S19970){
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

  public void thread20080(int [] tdone, int [] ends){
        switch(S19962){
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

  public void thread20079(int [] tdone, int [] ends){
        switch(S20013){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        thread20080(tdone,ends);
        thread20081(tdone,ends);
        thread20082(tdone,ends);
        thread20083(tdone,ends);
        thread20084(tdone,ends);
        thread20085(tdone,ends);
        int biggest20086 = 0;
        if(ends[21]>=biggest20086){
          biggest20086=ends[21];
        }
        if(ends[22]>=biggest20086){
          biggest20086=ends[22];
        }
        if(ends[23]>=biggest20086){
          biggest20086=ends[23];
        }
        if(ends[24]>=biggest20086){
          biggest20086=ends[24];
        }
        if(ends[25]>=biggest20086){
          biggest20086=ends[25];
        }
        if(ends[26]>=biggest20086){
          biggest20086=ends[26];
        }
        if(biggest20086 == 1){
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        //FINXME code
        if(biggest20086 == 0){
          S20013=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread20078(int [] tdone, int [] ends){
        switch(S19954){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S19672){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 102, column: 13
              S19672=1;
              __start_thread_19 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 100, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_19 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 100, column: 5
                ends[19]=2;
                ;//sysj\conveyor_plant.sysj line: 100, column: 5
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 104, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 105, column: 7
                S19672=2;
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
              S19672=2;
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
              S19672=3;
              __start_thread_19 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 100, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_19 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 100, column: 5
                ends[19]=2;
                ;//sysj\conveyor_plant.sysj line: 100, column: 5
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 108, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 109, column: 7
                S19672=0;
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
              S19672=0;
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

  public void thread20075(int [] tdone, int [] ends){
        S20011=1;
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

  public void thread20074(int [] tdone, int [] ends){
        S20000=1;
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

  public void thread20073(int [] tdone, int [] ends){
        S19989=1;
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

  public void thread20072(int [] tdone, int [] ends){
        S19978=1;
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

  public void thread20071(int [] tdone, int [] ends){
        S19970=1;
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

  public void thread20070(int [] tdone, int [] ends){
        S19962=1;
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

  public void thread20069(int [] tdone, int [] ends){
        S20013=1;
    thread20070(tdone,ends);
    thread20071(tdone,ends);
    thread20072(tdone,ends);
    thread20073(tdone,ends);
    thread20074(tdone,ends);
    thread20075(tdone,ends);
    int biggest20076 = 0;
    if(ends[21]>=biggest20076){
      biggest20076=ends[21];
    }
    if(ends[22]>=biggest20076){
      biggest20076=ends[22];
    }
    if(ends[23]>=biggest20076){
      biggest20076=ends[23];
    }
    if(ends[24]>=biggest20076){
      biggest20076=ends[24];
    }
    if(ends[25]>=biggest20076){
      biggest20076=ends[25];
    }
    if(ends[26]>=biggest20076){
      biggest20076=ends[26];
    }
    if(biggest20076 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread20068(int [] tdone, int [] ends){
        S19954=1;
    S19672=0;
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
      switch(S20015){
        case 0 : 
          S20015=0;
          break RUN;
        
        case 1 : 
          S20015=2;
          S20015=2;
          thread20068(tdone,ends);
          thread20069(tdone,ends);
          int biggest20077 = 0;
          if(ends[19]>=biggest20077){
            biggest20077=ends[19];
          }
          if(ends[20]>=biggest20077){
            biggest20077=ends[20];
          }
          if(biggest20077 == 1){
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
        
        case 2 : 
          thread20078(tdone,ends);
          thread20079(tdone,ends);
          int biggest20087 = 0;
          if(ends[19]>=biggest20087){
            biggest20087=ends[19];
          }
          if(ends[20]>=biggest20087){
            biggest20087=ends[20];
          }
          if(biggest20087 == 1){
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
          //FINXME code
          if(biggest20087 == 0){
            S20015=0;
            active[18]=0;
            ends[18]=0;
            S20015=0;
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
