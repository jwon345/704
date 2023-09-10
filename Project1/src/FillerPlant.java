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
  private int S48325 = 1;
  private int S48264 = 1;
  private int S47982 = 1;
  private int S48323 = 1;
  private int S48272 = 1;
  private int S48280 = 1;
  private int S48288 = 1;
  private int S48299 = 1;
  private int S48310 = 1;
  private int S48321 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread49401(int [] tdone, int [] ends){
        switch(S48321){
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

  public void thread49400(int [] tdone, int [] ends){
        switch(S48310){
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

  public void thread49399(int [] tdone, int [] ends){
        switch(S48299){
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

  public void thread49398(int [] tdone, int [] ends){
        switch(S48288){
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

  public void thread49397(int [] tdone, int [] ends){
        switch(S48280){
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

  public void thread49396(int [] tdone, int [] ends){
        switch(S48272){
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

  public void thread49395(int [] tdone, int [] ends){
        switch(S48323){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread49396(tdone,ends);
        thread49397(tdone,ends);
        thread49398(tdone,ends);
        thread49399(tdone,ends);
        thread49400(tdone,ends);
        thread49401(tdone,ends);
        int biggest49402 = 0;
        if(ends[17]>=biggest49402){
          biggest49402=ends[17];
        }
        if(ends[18]>=biggest49402){
          biggest49402=ends[18];
        }
        if(ends[19]>=biggest49402){
          biggest49402=ends[19];
        }
        if(ends[20]>=biggest49402){
          biggest49402=ends[20];
        }
        if(ends[21]>=biggest49402){
          biggest49402=ends[21];
        }
        if(ends[22]>=biggest49402){
          biggest49402=ends[22];
        }
        if(biggest49402 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest49402 == 0){
          S48323=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread49394(int [] tdone, int [] ends){
        switch(S48264){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S47982){
          case 0 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 88, column: 13
              S47982=1;
              __start_thread_15 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 86, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_15 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 86, column: 5
                ends[15]=2;
                ;//sysj\conveyor_plant.sysj line: 86, column: 5
                dosUnitFilled.setPresent();//sysj\conveyor_plant.sysj line: 90, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("*Filler - Bottle Filled (Pressure Can At Top) *");//sysj\conveyor_plant.sysj line: 92, column: 7
                S47982=2;
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
              S47982=2;
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
              S47982=3;
              __start_thread_15 = com.systemj.Timer.getMs();//sysj\conveyor_plant.sysj line: 86, column: 5
              if(com.systemj.Timer.getMs() - __start_thread_15 >= (1) * 1000){//sysj\conveyor_plant.sysj line: 86, column: 5
                ends[15]=2;
                ;//sysj\conveyor_plant.sysj line: 86, column: 5
                dosUnitEvac.setPresent();//sysj\conveyor_plant.sysj line: 95, column: 7
                currsigs.addElement(dosUnitEvac);
                System.out.println("*Filler - Inlet Open (Pressure Can At Bottem) *");//sysj\conveyor_plant.sysj line: 97, column: 7
                S47982=0;
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
              S47982=0;
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

  public void thread49391(int [] tdone, int [] ends){
        S48321=1;
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

  public void thread49390(int [] tdone, int [] ends){
        S48310=1;
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

  public void thread49389(int [] tdone, int [] ends){
        S48299=1;
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

  public void thread49388(int [] tdone, int [] ends){
        S48288=1;
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

  public void thread49387(int [] tdone, int [] ends){
        S48280=1;
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

  public void thread49386(int [] tdone, int [] ends){
        S48272=1;
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

  public void thread49385(int [] tdone, int [] ends){
        S48323=1;
    thread49386(tdone,ends);
    thread49387(tdone,ends);
    thread49388(tdone,ends);
    thread49389(tdone,ends);
    thread49390(tdone,ends);
    thread49391(tdone,ends);
    int biggest49392 = 0;
    if(ends[17]>=biggest49392){
      biggest49392=ends[17];
    }
    if(ends[18]>=biggest49392){
      biggest49392=ends[18];
    }
    if(ends[19]>=biggest49392){
      biggest49392=ends[19];
    }
    if(ends[20]>=biggest49392){
      biggest49392=ends[20];
    }
    if(ends[21]>=biggest49392){
      biggest49392=ends[21];
    }
    if(ends[22]>=biggest49392){
      biggest49392=ends[22];
    }
    if(biggest49392 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread49384(int [] tdone, int [] ends){
        S48264=1;
    S47982=0;
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
      switch(S48325){
        case 0 : 
          S48325=0;
          break RUN;
        
        case 1 : 
          S48325=2;
          S48325=2;
          thread49384(tdone,ends);
          thread49385(tdone,ends);
          int biggest49393 = 0;
          if(ends[15]>=biggest49393){
            biggest49393=ends[15];
          }
          if(ends[16]>=biggest49393){
            biggest49393=ends[16];
          }
          if(biggest49393 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
        
        case 2 : 
          thread49394(tdone,ends);
          thread49395(tdone,ends);
          int biggest49403 = 0;
          if(ends[15]>=biggest49403){
            biggest49403=ends[15];
          }
          if(ends[16]>=biggest49403){
            biggest49403=ends[16];
          }
          if(biggest49403 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
          //FINXME code
          if(biggest49403 == 0){
            S48325=0;
            active[14]=0;
            ends[14]=0;
            S48325=0;
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
