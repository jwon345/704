import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1

public class RotaryPlant extends ClockDomain{
  public RotaryPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal tableAlignedWithSensorE = new Signal("tableAlignedWithSensorE", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal capOnBottleAtPos1E = new Signal("capOnBottleAtPos1E", Signal.OUTPUT);
  public Signal rotaryTableTriggerE = new Signal("rotaryTableTriggerE", Signal.OUTPUT);
  private int S25500 = 1;
  private int S25461 = 1;
  private int S25455 = 1;
  private int S25498 = 1;
  private int S25469 = 1;
  private int S25477 = 1;
  private int S25485 = 1;
  private int S25496 = 1;
  
  private int[] ends = new int[42];
  private int[] tdone = new int[42];
  
  public void thread26065(int [] tdone, int [] ends){
        switch(S25496){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 89, column: 31
          ;//sysj\conveyor_plant.sysj line: 89, column: 51
          rotaryTableTriggerE.setPresent();//sysj\conveyor_plant.sysj line: 89, column: 52
          currsigs.addElement(rotaryTableTriggerE);
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

  public void thread26064(int [] tdone, int [] ends){
        switch(S25485){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 87, column: 31
          capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 87, column: 50
          currsigs.addElement(capOnBottleAtPos1E);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread26063(int [] tdone, int [] ends){
        switch(S25477){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 85, column: 31
          bottleAtPos5E.setPresent();//sysj\conveyor_plant.sysj line: 85, column: 45
          currsigs.addElement(bottleAtPos5E);
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
  }

  public void thread26062(int [] tdone, int [] ends){
        switch(S25469){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 83, column: 31
          tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 83, column: 55
          currsigs.addElement(tableAlignedWithSensorE);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread26061(int [] tdone, int [] ends){
        switch(S25498){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread26062(tdone,ends);
        thread26063(tdone,ends);
        thread26064(tdone,ends);
        thread26065(tdone,ends);
        int biggest26066 = 0;
        if(ends[14]>=biggest26066){
          biggest26066=ends[14];
        }
        if(ends[15]>=biggest26066){
          biggest26066=ends[15];
        }
        if(ends[16]>=biggest26066){
          biggest26066=ends[16];
        }
        if(ends[17]>=biggest26066){
          biggest26066=ends[17];
        }
        if(biggest26066 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest26066 == 0){
          S25498=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread26060(int [] tdone, int [] ends){
        switch(S25461){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S25455){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 75, column: 11
              S25455=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S25455=1;
            tableAlignedWithSensor.setPresent();//sysj\conveyor_plant.sysj line: 77, column: 5
            currsigs.addElement(tableAlignedWithSensor);
            System.out.println("*Recieved*");//sysj\conveyor_plant.sysj line: 78, column: 14
            S25455=0;
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread26057(int [] tdone, int [] ends){
        S25496=1;
    if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_plant.sysj line: 89, column: 31
      ;//sysj\conveyor_plant.sysj line: 89, column: 51
      rotaryTableTriggerE.setPresent();//sysj\conveyor_plant.sysj line: 89, column: 52
      currsigs.addElement(rotaryTableTriggerE);
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

  public void thread26056(int [] tdone, int [] ends){
        S25485=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj\conveyor_plant.sysj line: 87, column: 31
      capOnBottleAtPos1E.setPresent();//sysj\conveyor_plant.sysj line: 87, column: 50
      currsigs.addElement(capOnBottleAtPos1E);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread26055(int [] tdone, int [] ends){
        S25477=1;
    if(bottleAtPos5.getprestatus()){//sysj\conveyor_plant.sysj line: 85, column: 31
      bottleAtPos5E.setPresent();//sysj\conveyor_plant.sysj line: 85, column: 45
      currsigs.addElement(bottleAtPos5E);
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

  public void thread26054(int [] tdone, int [] ends){
        S25469=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_plant.sysj line: 83, column: 31
      tableAlignedWithSensorE.setPresent();//sysj\conveyor_plant.sysj line: 83, column: 55
      currsigs.addElement(tableAlignedWithSensorE);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread26053(int [] tdone, int [] ends){
        S25498=1;
    thread26054(tdone,ends);
    thread26055(tdone,ends);
    thread26056(tdone,ends);
    thread26057(tdone,ends);
    int biggest26058 = 0;
    if(ends[14]>=biggest26058){
      biggest26058=ends[14];
    }
    if(ends[15]>=biggest26058){
      biggest26058=ends[15];
    }
    if(ends[16]>=biggest26058){
      biggest26058=ends[16];
    }
    if(ends[17]>=biggest26058){
      biggest26058=ends[17];
    }
    if(biggest26058 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread26052(int [] tdone, int [] ends){
        S25461=1;
    S25455=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S25500){
        case 0 : 
          S25500=0;
          break RUN;
        
        case 1 : 
          S25500=2;
          S25500=2;
          thread26052(tdone,ends);
          thread26053(tdone,ends);
          int biggest26059 = 0;
          if(ends[12]>=biggest26059){
            biggest26059=ends[12];
          }
          if(ends[13]>=biggest26059){
            biggest26059=ends[13];
          }
          if(biggest26059 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
        
        case 2 : 
          thread26060(tdone,ends);
          thread26061(tdone,ends);
          int biggest26067 = 0;
          if(ends[12]>=biggest26067){
            biggest26067=ends[12];
          }
          if(ends[13]>=biggest26067){
            biggest26067=ends[13];
          }
          if(biggest26067 == 1){
            active[11]=1;
            ends[11]=1;
            break RUN;
          }
          //FINXME code
          if(biggest26067 == 0){
            S25500=0;
            active[11]=0;
            ends[11]=0;
            S25500=0;
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
    while(active[11] != 0){
      int index = 11;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[11]!=0 || suspended[11]!=0 || active[11]!=1);
      else{
        if(!df){
          rotaryTableTrigger.gethook();
          df = true;
        }
        runClockDomain();
      }
      rotaryTableTrigger.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      tableAlignedWithSensorE.setpreclear();
      bottleAtPos5E.setpreclear();
      capOnBottleAtPos1E.setpreclear();
      rotaryTableTriggerE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = rotaryTableTrigger.getStatus() ? rotaryTableTrigger.setprepresent() : rotaryTableTrigger.setpreclear();
      rotaryTableTrigger.setpreval(rotaryTableTrigger.getValue());
      rotaryTableTrigger.setClear();
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
      tableAlignedWithSensorE.sethook();
      tableAlignedWithSensorE.setClear();
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      capOnBottleAtPos1E.sethook();
      capOnBottleAtPos1E.setClear();
      rotaryTableTriggerE.sethook();
      rotaryTableTriggerE.setClear();
      if(paused[11]!=0 || suspended[11]!=0 || active[11]!=1);
      else{
        rotaryTableTrigger.gethook();
      }
      runFinisher();
      if(active[11] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
