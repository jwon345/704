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
  private int S213690 = 1;
  private int S213629 = 1;
  private int S213477 = 1;
  private int S213688 = 1;
  private int S213637 = 1;
  private int S213645 = 1;
  private int S213653 = 1;
  private int S213664 = 1;
  private int S213675 = 1;
  private int S213686 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread214772(int [] tdone, int [] ends){
        switch(S213686){
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

  public void thread214771(int [] tdone, int [] ends){
        switch(S213675){
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

  public void thread214770(int [] tdone, int [] ends){
        switch(S213664){
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

  public void thread214769(int [] tdone, int [] ends){
        switch(S213653){
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

  public void thread214768(int [] tdone, int [] ends){
        switch(S213645){
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

  public void thread214767(int [] tdone, int [] ends){
        switch(S213637){
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

  public void thread214766(int [] tdone, int [] ends){
        switch(S213688){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread214767(tdone,ends);
        thread214768(tdone,ends);
        thread214769(tdone,ends);
        thread214770(tdone,ends);
        thread214771(tdone,ends);
        thread214772(tdone,ends);
        int biggest214773 = 0;
        if(ends[17]>=biggest214773){
          biggest214773=ends[17];
        }
        if(ends[18]>=biggest214773){
          biggest214773=ends[18];
        }
        if(ends[19]>=biggest214773){
          biggest214773=ends[19];
        }
        if(ends[20]>=biggest214773){
          biggest214773=ends[20];
        }
        if(ends[21]>=biggest214773){
          biggest214773=ends[21];
        }
        if(ends[22]>=biggest214773){
          biggest214773=ends[22];
        }
        if(biggest214773 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest214773 == 0){
          S213688=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread214765(int [] tdone, int [] ends){
        switch(S213629){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S213477){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 89, column: 13
              S213477=1;
              __start_thread_15 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 87, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_15 >= 500){//sysj\conveyor_plant.sysj line: 87, column: 5
                ends[15]=2;
                ;//sysj\conveyor_plant.sysj line: 87, column: 5
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 91, column: 7
                currsigs.addElement(dosUnitFilled);
                S213477=2;
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
              S213477=2;
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
            S213477=2;
            System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 93, column: 7
            S213477=3;
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
            break;
          
          case 3 : 
            if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 94, column: 13
              S213477=4;
              __start_thread_15 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 87, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_15 >= 500){//sysj\conveyor_plant.sysj line: 87, column: 5
                ends[15]=2;
                ;//sysj\conveyor_plant.sysj line: 87, column: 5
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 96, column: 7
                currsigs.addElement(dosUnitEvac);
                S213477=5;
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
              S213477=5;
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
            S213477=5;
            System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 98, column: 7
            S213477=0;
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread214762(int [] tdone, int [] ends){
        S213686=1;
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

  public void thread214761(int [] tdone, int [] ends){
        S213675=1;
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

  public void thread214760(int [] tdone, int [] ends){
        S213664=1;
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

  public void thread214759(int [] tdone, int [] ends){
        S213653=1;
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

  public void thread214758(int [] tdone, int [] ends){
        S213645=1;
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

  public void thread214757(int [] tdone, int [] ends){
        S213637=1;
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

  public void thread214756(int [] tdone, int [] ends){
        S213688=1;
    thread214757(tdone,ends);
    thread214758(tdone,ends);
    thread214759(tdone,ends);
    thread214760(tdone,ends);
    thread214761(tdone,ends);
    thread214762(tdone,ends);
    int biggest214763 = 0;
    if(ends[17]>=biggest214763){
      biggest214763=ends[17];
    }
    if(ends[18]>=biggest214763){
      biggest214763=ends[18];
    }
    if(ends[19]>=biggest214763){
      biggest214763=ends[19];
    }
    if(ends[20]>=biggest214763){
      biggest214763=ends[20];
    }
    if(ends[21]>=biggest214763){
      biggest214763=ends[21];
    }
    if(ends[22]>=biggest214763){
      biggest214763=ends[22];
    }
    if(biggest214763 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread214755(int [] tdone, int [] ends){
        S213629=1;
    S213477=0;
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
      switch(S213690){
        case 0 : 
          S213690=0;
          break RUN;
        
        case 1 : 
          S213690=2;
          S213690=2;
          thread214755(tdone,ends);
          thread214756(tdone,ends);
          int biggest214764 = 0;
          if(ends[15]>=biggest214764){
            biggest214764=ends[15];
          }
          if(ends[16]>=biggest214764){
            biggest214764=ends[16];
          }
          if(biggest214764 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
        
        case 2 : 
          thread214765(tdone,ends);
          thread214766(tdone,ends);
          int biggest214774 = 0;
          if(ends[15]>=biggest214774){
            biggest214774=ends[15];
          }
          if(ends[16]>=biggest214774){
            biggest214774=ends[16];
          }
          if(biggest214774 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
          //FINXME code
          if(biggest214774 == 0){
            S213690=0;
            active[14]=0;
            ends[14]=0;
            S213690=0;
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
