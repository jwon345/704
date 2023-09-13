import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1
import run.socketListener;//sysj\conveyor_plant.sysj line: 2, column: 1

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
  private long __start_thread_15;//sysj\conveyor_plant.sysj line: 87, column: 5
  private int S202885 = 1;
  private int S202824 = 1;
  private int S202672 = 1;
  private int S202883 = 1;
  private int S202832 = 1;
  private int S202840 = 1;
  private int S202848 = 1;
  private int S202859 = 1;
  private int S202870 = 1;
  private int S202881 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread203967(int [] tdone, int [] ends){
        switch(S202881){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 117, column: 34
          ;//sysj\conveyor_plant.sysj line: 117, column: 49
          dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 117, column: 50
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

  public void thread203966(int [] tdone, int [] ends){
        switch(S202870){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 115, column: 34
          ;//sysj\conveyor_plant.sysj line: 115, column: 47
          dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 115, column: 48
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

  public void thread203965(int [] tdone, int [] ends){
        switch(S202859){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 113, column: 34
          ;//sysj\conveyor_plant.sysj line: 113, column: 54
          dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 113, column: 55
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

  public void thread203964(int [] tdone, int [] ends){
        switch(S202848){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 111, column: 34
          dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 111, column: 55
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

  public void thread203963(int [] tdone, int [] ends){
        switch(S202840){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 109, column: 34
          valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 109, column: 51
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

  public void thread203962(int [] tdone, int [] ends){
        switch(S202832){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 107, column: 34
          valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 107, column: 54
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

  public void thread203961(int [] tdone, int [] ends){
        switch(S202883){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread203962(tdone,ends);
        thread203963(tdone,ends);
        thread203964(tdone,ends);
        thread203965(tdone,ends);
        thread203966(tdone,ends);
        thread203967(tdone,ends);
        int biggest203968 = 0;
        if(ends[17]>=biggest203968){
          biggest203968=ends[17];
        }
        if(ends[18]>=biggest203968){
          biggest203968=ends[18];
        }
        if(ends[19]>=biggest203968){
          biggest203968=ends[19];
        }
        if(ends[20]>=biggest203968){
          biggest203968=ends[20];
        }
        if(ends[21]>=biggest203968){
          biggest203968=ends[21];
        }
        if(ends[22]>=biggest203968){
          biggest203968=ends[22];
        }
        if(biggest203968 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest203968 == 0){
          S202883=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread203960(int [] tdone, int [] ends){
        switch(S202824){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S202672){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 89, column: 13
              S202672=1;
              __start_thread_15 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 87, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_15 >= 500){//sysj\conveyor_plant.sysj line: 87, column: 5
                ends[15]=2;
                ;//sysj\conveyor_plant.sysj line: 87, column: 5
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 91, column: 7
                currsigs.addElement(dosUnitFilled);
                S202672=2;
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
            if(com.systemj.Timer.getMs() - __start_thread_15 >= 500){//sysj\conveyor_plant.sysj line: 87, column: 5
              ends[15]=2;
              ;//sysj\conveyor_plant.sysj line: 87, column: 5
              dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 91, column: 7
              currsigs.addElement(dosUnitFilled);
              S202672=2;
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
            S202672=2;
            System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 93, column: 7
            S202672=3;
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
            break;
          
          case 3 : 
            if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 94, column: 13
              S202672=4;
              __start_thread_15 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 87, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_15 >= 500){//sysj\conveyor_plant.sysj line: 87, column: 5
                ends[15]=2;
                ;//sysj\conveyor_plant.sysj line: 87, column: 5
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 96, column: 7
                currsigs.addElement(dosUnitEvac);
                S202672=5;
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
            if(com.systemj.Timer.getMs() - __start_thread_15 >= 500){//sysj\conveyor_plant.sysj line: 87, column: 5
              ends[15]=2;
              ;//sysj\conveyor_plant.sysj line: 87, column: 5
              dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 96, column: 7
              currsigs.addElement(dosUnitEvac);
              S202672=5;
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
            S202672=5;
            System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 98, column: 7
            S202672=0;
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread203957(int [] tdone, int [] ends){
        S202881=1;
    if(dosUnitFilled.getprestatus()){//sysj\conveyor_plant.sysj line: 117, column: 34
      ;//sysj\conveyor_plant.sysj line: 117, column: 49
      dosUnitFilledE.setPresent();//sysj\conveyor_plant.sysj line: 117, column: 50
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

  public void thread203956(int [] tdone, int [] ends){
        S202870=1;
    if(dosUnitEvac.getprestatus()){//sysj\conveyor_plant.sysj line: 115, column: 34
      ;//sysj\conveyor_plant.sysj line: 115, column: 47
      dosUnitEvacE.setPresent();//sysj\conveyor_plant.sysj line: 115, column: 48
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

  public void thread203955(int [] tdone, int [] ends){
        S202859=1;
    if(dosUnitValveExtend.getprestatus()){//sysj\conveyor_plant.sysj line: 113, column: 34
      ;//sysj\conveyor_plant.sysj line: 113, column: 54
      dosUnitValveExtendE.setPresent();//sysj\conveyor_plant.sysj line: 113, column: 55
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

  public void thread203954(int [] tdone, int [] ends){
        S202848=1;
    if(dosUnitValveRetract.getprestatus()){//sysj\conveyor_plant.sysj line: 111, column: 34
      dosUnitValveRetractE.setPresent();//sysj\conveyor_plant.sysj line: 111, column: 55
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

  public void thread203953(int [] tdone, int [] ends){
        S202840=1;
    if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 109, column: 34
      valveInletOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 109, column: 51
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

  public void thread203952(int [] tdone, int [] ends){
        S202832=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 107, column: 34
      valveInjectorOnOffE.setPresent();//sysj\conveyor_plant.sysj line: 107, column: 54
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

  public void thread203951(int [] tdone, int [] ends){
        S202883=1;
    thread203952(tdone,ends);
    thread203953(tdone,ends);
    thread203954(tdone,ends);
    thread203955(tdone,ends);
    thread203956(tdone,ends);
    thread203957(tdone,ends);
    int biggest203958 = 0;
    if(ends[17]>=biggest203958){
      biggest203958=ends[17];
    }
    if(ends[18]>=biggest203958){
      biggest203958=ends[18];
    }
    if(ends[19]>=biggest203958){
      biggest203958=ends[19];
    }
    if(ends[20]>=biggest203958){
      biggest203958=ends[20];
    }
    if(ends[21]>=biggest203958){
      biggest203958=ends[21];
    }
    if(ends[22]>=biggest203958){
      biggest203958=ends[22];
    }
    if(biggest203958 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread203950(int [] tdone, int [] ends){
        S202824=1;
    S202672=0;
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
      switch(S202885){
        case 0 : 
          S202885=0;
          break RUN;
        
        case 1 : 
          S202885=2;
          S202885=2;
          thread203950(tdone,ends);
          thread203951(tdone,ends);
          int biggest203959 = 0;
          if(ends[15]>=biggest203959){
            biggest203959=ends[15];
          }
          if(ends[16]>=biggest203959){
            biggest203959=ends[16];
          }
          if(biggest203959 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
        
        case 2 : 
          thread203960(tdone,ends);
          thread203961(tdone,ends);
          int biggest203969 = 0;
          if(ends[15]>=biggest203969){
            biggest203969=ends[15];
          }
          if(ends[16]>=biggest203969){
            biggest203969=ends[16];
          }
          if(biggest203969 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
          //FINXME code
          if(biggest203969 == 0){
            S202885=0;
            active[14]=0;
            ends[14]=0;
            S202885=0;
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
