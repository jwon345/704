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
  private int S96473 = 1;
  private int S96412 = 1;
  private int S96130 = 1;
  private int S96471 = 1;
  private int S96420 = 1;
  private int S96428 = 1;
  private int S96436 = 1;
  private int S96447 = 1;
  private int S96458 = 1;
  private int S96469 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread97549(int [] tdone, int [] ends){
        switch(S96469){
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

  public void thread97548(int [] tdone, int [] ends){
        switch(S96458){
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

  public void thread97547(int [] tdone, int [] ends){
        switch(S96447){
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

  public void thread97546(int [] tdone, int [] ends){
        switch(S96436){
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

  public void thread97545(int [] tdone, int [] ends){
        switch(S96428){
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

  public void thread97544(int [] tdone, int [] ends){
        switch(S96420){
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

  public void thread97543(int [] tdone, int [] ends){
        switch(S96471){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread97544(tdone,ends);
        thread97545(tdone,ends);
        thread97546(tdone,ends);
        thread97547(tdone,ends);
        thread97548(tdone,ends);
        thread97549(tdone,ends);
        int biggest97550 = 0;
        if(ends[17]>=biggest97550){
          biggest97550=ends[17];
        }
        if(ends[18]>=biggest97550){
          biggest97550=ends[18];
        }
        if(ends[19]>=biggest97550){
          biggest97550=ends[19];
        }
        if(ends[20]>=biggest97550){
          biggest97550=ends[20];
        }
        if(ends[21]>=biggest97550){
          biggest97550=ends[21];
        }
        if(ends[22]>=biggest97550){
          biggest97550=ends[22];
        }
        if(biggest97550 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest97550 == 0){
          S96471=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread97542(int [] tdone, int [] ends){
        switch(S96412){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S96130){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 88, column: 13
              S96130=1;
              __start_thread_15 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 86, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_15 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 86, column: 5
                ends[15]=2;
                ;//sysj\conveyor_plant.sysj line: 86, column: 5
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 90, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 92, column: 7
                S96130=2;
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
            if(com.systemj.Timer.getMs() - __start_thread_15 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 86, column: 5
              ends[15]=2;
              ;//sysj\conveyor_plant.sysj line: 86, column: 5
              dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 90, column: 7
              currsigs.addElement(dosUnitFilled);
              System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 92, column: 7
              S96130=2;
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
            if(valveInletOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 93, column: 13
              S96130=3;
              __start_thread_15 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 86, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_15 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 86, column: 5
                ends[15]=2;
                ;//sysj\conveyor_plant.sysj line: 86, column: 5
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 95, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 97, column: 7
                S96130=0;
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
          
          case 3 : 
            if(com.systemj.Timer.getMs() - __start_thread_15 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 86, column: 5
              ends[15]=2;
              ;//sysj\conveyor_plant.sysj line: 86, column: 5
              dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 95, column: 7
              currsigs.addElement(dosUnitEvac);
              System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 97, column: 7
              S96130=0;
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
          
        }
        break;
      
    }
  }

  public void thread97539(int [] tdone, int [] ends){
        S96469=1;
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

  public void thread97538(int [] tdone, int [] ends){
        S96458=1;
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

  public void thread97537(int [] tdone, int [] ends){
        S96447=1;
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

  public void thread97536(int [] tdone, int [] ends){
        S96436=1;
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

  public void thread97535(int [] tdone, int [] ends){
        S96428=1;
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

  public void thread97534(int [] tdone, int [] ends){
        S96420=1;
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

  public void thread97533(int [] tdone, int [] ends){
        S96471=1;
    thread97534(tdone,ends);
    thread97535(tdone,ends);
    thread97536(tdone,ends);
    thread97537(tdone,ends);
    thread97538(tdone,ends);
    thread97539(tdone,ends);
    int biggest97540 = 0;
    if(ends[17]>=biggest97540){
      biggest97540=ends[17];
    }
    if(ends[18]>=biggest97540){
      biggest97540=ends[18];
    }
    if(ends[19]>=biggest97540){
      biggest97540=ends[19];
    }
    if(ends[20]>=biggest97540){
      biggest97540=ends[20];
    }
    if(ends[21]>=biggest97540){
      biggest97540=ends[21];
    }
    if(ends[22]>=biggest97540){
      biggest97540=ends[22];
    }
    if(biggest97540 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread97532(int [] tdone, int [] ends){
        S96412=1;
    S96130=0;
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
      switch(S96473){
        case 0 : 
          S96473=0;
          break RUN;
        
        case 1 : 
          S96473=2;
          S96473=2;
          thread97532(tdone,ends);
          thread97533(tdone,ends);
          int biggest97541 = 0;
          if(ends[15]>=biggest97541){
            biggest97541=ends[15];
          }
          if(ends[16]>=biggest97541){
            biggest97541=ends[16];
          }
          if(biggest97541 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
        
        case 2 : 
          thread97542(tdone,ends);
          thread97543(tdone,ends);
          int biggest97551 = 0;
          if(ends[15]>=biggest97551){
            biggest97551=ends[15];
          }
          if(ends[16]>=biggest97551){
            biggest97551=ends[16];
          }
          if(biggest97551 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
          //FINXME code
          if(biggest97551 == 0){
            S96473=0;
            active[14]=0;
            ends[14]=0;
            S96473=0;
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
