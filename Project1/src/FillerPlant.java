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
  private int S25873 = 1;
  private int S25812 = 1;
  private int S25530 = 1;
  private int S25871 = 1;
  private int S25820 = 1;
  private int S25828 = 1;
  private int S25836 = 1;
  private int S25847 = 1;
  private int S25858 = 1;
  private int S25869 = 1;
  
  private int[] ends = new int[42];
  private int[] tdone = new int[42];
  
  public void thread26085(int [] tdone, int [] ends){
        switch(S25869){
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

  public void thread26084(int [] tdone, int [] ends){
        switch(S25858){
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

  public void thread26083(int [] tdone, int [] ends){
        switch(S25847){
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

  public void thread26082(int [] tdone, int [] ends){
        switch(S25836){
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

  public void thread26081(int [] tdone, int [] ends){
        switch(S25828){
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

  public void thread26080(int [] tdone, int [] ends){
        switch(S25820){
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

  public void thread26079(int [] tdone, int [] ends){
        switch(S25871){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        thread26080(tdone,ends);
        thread26081(tdone,ends);
        thread26082(tdone,ends);
        thread26083(tdone,ends);
        thread26084(tdone,ends);
        thread26085(tdone,ends);
        int biggest26086 = 0;
        if(ends[21]>=biggest26086){
          biggest26086=ends[21];
        }
        if(ends[22]>=biggest26086){
          biggest26086=ends[22];
        }
        if(ends[23]>=biggest26086){
          biggest26086=ends[23];
        }
        if(ends[24]>=biggest26086){
          biggest26086=ends[24];
        }
        if(ends[25]>=biggest26086){
          biggest26086=ends[25];
        }
        if(ends[26]>=biggest26086){
          biggest26086=ends[26];
        }
        if(biggest26086 == 1){
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        //FINXME code
        if(biggest26086 == 0){
          S25871=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread26078(int [] tdone, int [] ends){
        switch(S25812){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S25530){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 102, column: 13
              S25530=1;
              __start_thread_19 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 100, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_19 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 100, column: 5
                ends[19]=2;
                ;//sysj\conveyor_plant.sysj line: 100, column: 5
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 104, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 105, column: 7
                S25530=2;
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
              S25530=2;
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
              S25530=3;
              __start_thread_19 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 100, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_19 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 100, column: 5
                ends[19]=2;
                ;//sysj\conveyor_plant.sysj line: 100, column: 5
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 108, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 109, column: 7
                S25530=0;
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
              S25530=0;
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

  public void thread26075(int [] tdone, int [] ends){
        S25869=1;
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

  public void thread26074(int [] tdone, int [] ends){
        S25858=1;
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

  public void thread26073(int [] tdone, int [] ends){
        S25847=1;
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

  public void thread26072(int [] tdone, int [] ends){
        S25836=1;
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

  public void thread26071(int [] tdone, int [] ends){
        S25828=1;
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

  public void thread26070(int [] tdone, int [] ends){
        S25820=1;
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

  public void thread26069(int [] tdone, int [] ends){
        S25871=1;
    thread26070(tdone,ends);
    thread26071(tdone,ends);
    thread26072(tdone,ends);
    thread26073(tdone,ends);
    thread26074(tdone,ends);
    thread26075(tdone,ends);
    int biggest26076 = 0;
    if(ends[21]>=biggest26076){
      biggest26076=ends[21];
    }
    if(ends[22]>=biggest26076){
      biggest26076=ends[22];
    }
    if(ends[23]>=biggest26076){
      biggest26076=ends[23];
    }
    if(ends[24]>=biggest26076){
      biggest26076=ends[24];
    }
    if(ends[25]>=biggest26076){
      biggest26076=ends[25];
    }
    if(ends[26]>=biggest26076){
      biggest26076=ends[26];
    }
    if(biggest26076 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread26068(int [] tdone, int [] ends){
        S25812=1;
    S25530=0;
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
      switch(S25873){
        case 0 : 
          S25873=0;
          break RUN;
        
        case 1 : 
          S25873=2;
          S25873=2;
          thread26068(tdone,ends);
          thread26069(tdone,ends);
          int biggest26077 = 0;
          if(ends[19]>=biggest26077){
            biggest26077=ends[19];
          }
          if(ends[20]>=biggest26077){
            biggest26077=ends[20];
          }
          if(biggest26077 == 1){
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
        
        case 2 : 
          thread26078(tdone,ends);
          thread26079(tdone,ends);
          int biggest26087 = 0;
          if(ends[19]>=biggest26087){
            biggest26087=ends[19];
          }
          if(ends[20]>=biggest26087){
            biggest26087=ends[20];
          }
          if(biggest26087 == 1){
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
          //FINXME code
          if(biggest26087 == 0){
            S25873=0;
            active[18]=0;
            ends[18]=0;
            S25873=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
