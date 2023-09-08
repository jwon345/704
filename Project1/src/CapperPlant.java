import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\capper_plant.sysj line: 1, column: 1

public class CapperPlant extends ClockDomain{
  public CapperPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.INPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.INPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.INPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.INPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.OUTPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.OUTPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.OUTPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.OUTPUT);
  public Signal cylPos5ZaxisExtendE = new Signal("cylPos5ZaxisExtendE", Signal.OUTPUT);
  public Signal gripperTurnRetractE = new Signal("gripperTurnRetractE", Signal.OUTPUT);
  public Signal gripperTurnExtendE = new Signal("gripperTurnExtendE", Signal.OUTPUT);
  public Signal capGripperPos5ExtendE = new Signal("capGripperPos5ExtendE", Signal.OUTPUT);
  public Signal cylClampBottleExtendE = new Signal("cylClampBottleExtendE", Signal.OUTPUT);
  public Signal gripperZAxisLoweredE = new Signal("gripperZAxisLoweredE", Signal.OUTPUT);
  public Signal gripperZAxisLiftedE = new Signal("gripperZAxisLiftedE", Signal.OUTPUT);
  public Signal gripperTurnHomePosE = new Signal("gripperTurnHomePosE", Signal.OUTPUT);
  public Signal gripperTurnFinalPosE = new Signal("gripperTurnFinalPosE", Signal.OUTPUT);
  private int S720 = 1;
  private int S503 = 1;
  private int S445 = 1;
  private int S450 = 1;
  private int S453 = 1;
  private int S578 = 1;
  private int S512 = 1;
  private int S506 = 1;
  private int S520 = 1;
  private int S528 = 1;
  private int S536 = 1;
  private int S544 = 1;
  private int S552 = 1;
  private int S560 = 1;
  private int S568 = 1;
  private int S576 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread753(int [] tdone, int [] ends){
        switch(S576){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capper_plant.sysj line: 68, column: 32
          gripperTurnFinalPosE.setPresent();//sysj\capper_plant.sysj line: 68, column: 53
          currsigs.addElement(gripperTurnFinalPosE);
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

  public void thread752(int [] tdone, int [] ends){
        switch(S568){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\capper_plant.sysj line: 66, column: 32
          gripperTurnHomePosE.setPresent();//sysj\capper_plant.sysj line: 66, column: 52
          currsigs.addElement(gripperTurnHomePosE);
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

  public void thread751(int [] tdone, int [] ends){
        switch(S560){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\capper_plant.sysj line: 64, column: 32
          gripperZAxisLiftedE.setPresent();//sysj\capper_plant.sysj line: 64, column: 52
          currsigs.addElement(gripperZAxisLiftedE);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread750(int [] tdone, int [] ends){
        switch(S552){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\capper_plant.sysj line: 62, column: 32
          gripperZAxisLoweredE.setPresent();//sysj\capper_plant.sysj line: 62, column: 53
          currsigs.addElement(gripperZAxisLoweredE);
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
      
    }
  }

  public void thread749(int [] tdone, int [] ends){
        switch(S544){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 60, column: 32
          cylClampBottleExtendE.setPresent();//sysj\capper_plant.sysj line: 60, column: 54
          currsigs.addElement(cylClampBottleExtendE);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread748(int [] tdone, int [] ends){
        switch(S536){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 58, column: 32
          capGripperPos5ExtendE.setPresent();//sysj\capper_plant.sysj line: 58, column: 54
          currsigs.addElement(capGripperPos5ExtendE);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread747(int [] tdone, int [] ends){
        switch(S528){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\capper_plant.sysj line: 56, column: 32
          gripperTurnExtendE.setPresent();//sysj\capper_plant.sysj line: 56, column: 51
          currsigs.addElement(gripperTurnExtendE);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread746(int [] tdone, int [] ends){
        switch(S520){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj\capper_plant.sysj line: 54, column: 32
          gripperTurnRetractE.setPresent();//sysj\capper_plant.sysj line: 54, column: 52
          currsigs.addElement(gripperTurnRetractE);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread745(int [] tdone, int [] ends){
        switch(S512){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S506){
          case 0 : 
            S506=0;
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 52, column: 32
              cylPos5ZaxisExtendE.setPresent();//sysj\capper_plant.sysj line: 52, column: 52
              currsigs.addElement(cylPos5ZaxisExtendE);
              S506=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S506=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S506=1;
            S506=0;
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 52, column: 32
              cylPos5ZaxisExtendE.setPresent();//sysj\capper_plant.sysj line: 52, column: 52
              currsigs.addElement(cylPos5ZaxisExtendE);
              S506=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S506=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread744(int [] tdone, int [] ends){
        switch(S578){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread745(tdone,ends);
        thread746(tdone,ends);
        thread747(tdone,ends);
        thread748(tdone,ends);
        thread749(tdone,ends);
        thread750(tdone,ends);
        thread751(tdone,ends);
        thread752(tdone,ends);
        thread753(tdone,ends);
        int biggest754 = 0;
        if(ends[7]>=biggest754){
          biggest754=ends[7];
        }
        if(ends[8]>=biggest754){
          biggest754=ends[8];
        }
        if(ends[9]>=biggest754){
          biggest754=ends[9];
        }
        if(ends[10]>=biggest754){
          biggest754=ends[10];
        }
        if(ends[11]>=biggest754){
          biggest754=ends[11];
        }
        if(ends[12]>=biggest754){
          biggest754=ends[12];
        }
        if(ends[13]>=biggest754){
          biggest754=ends[13];
        }
        if(ends[14]>=biggest754){
          biggest754=ends[14];
        }
        if(ends[15]>=biggest754){
          biggest754=ends[15];
        }
        if(biggest754 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest754 == 0){
          S578=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread743(int [] tdone, int [] ends){
        active[5]=0;
    ends[5]=0;
    tdone[5]=1;
  }

  public void thread741(int [] tdone, int [] ends){
        switch(S453){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj\capper_plant.sysj line: 36, column: 14
          S453=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread740(int [] tdone, int [] ends){
        switch(S450){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 34, column: 14
          S450=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread738(int [] tdone, int [] ends){
        S453=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread737(int [] tdone, int [] ends){
        S450=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread736(int [] tdone, int [] ends){
        switch(S503){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S445){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\capper_plant.sysj line: 21, column: 12
              S445=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 23, column: 7
              currsigs.addElement(gripperZAxisLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnRetract.getprestatus()){//sysj\capper_plant.sysj line: 26, column: 13
              gripperTurnHomePos.setPresent();//sysj\capper_plant.sysj line: 27, column: 6
              currsigs.addElement(gripperTurnHomePos);
              S445=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S445=2;
            S445=3;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 30, column: 13
              gripperZAxisLowered.setPresent();//sysj\capper_plant.sysj line: 31, column: 6
              currsigs.addElement(gripperZAxisLowered);
              S445=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            S445=4;
            S445=5;
            thread737(tdone,ends);
            thread738(tdone,ends);
            int biggest739 = 0;
            if(ends[3]>=biggest739){
              biggest739=ends[3];
            }
            if(ends[4]>=biggest739){
              biggest739=ends[4];
            }
            if(biggest739 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            thread740(tdone,ends);
            thread741(tdone,ends);
            int biggest742 = 0;
            if(ends[3]>=biggest742){
              biggest742=ends[3];
            }
            if(ends[4]>=biggest742){
              biggest742=ends[4];
            }
            if(biggest742 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest742 == 0){
              gripperTurnFinalPos.setPresent();//sysj\capper_plant.sysj line: 39, column: 6
              currsigs.addElement(gripperTurnFinalPos);
              S445=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            S445=6;
            gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 42, column: 6
            currsigs.addElement(gripperZAxisLifted);
            S445=0;
            gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 23, column: 7
            currsigs.addElement(gripperZAxisLifted);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread733(int [] tdone, int [] ends){
        S576=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\capper_plant.sysj line: 68, column: 32
      gripperTurnFinalPosE.setPresent();//sysj\capper_plant.sysj line: 68, column: 53
      currsigs.addElement(gripperTurnFinalPosE);
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

  public void thread732(int [] tdone, int [] ends){
        S568=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\capper_plant.sysj line: 66, column: 32
      gripperTurnHomePosE.setPresent();//sysj\capper_plant.sysj line: 66, column: 52
      currsigs.addElement(gripperTurnHomePosE);
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

  public void thread731(int [] tdone, int [] ends){
        S560=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\capper_plant.sysj line: 64, column: 32
      gripperZAxisLiftedE.setPresent();//sysj\capper_plant.sysj line: 64, column: 52
      currsigs.addElement(gripperZAxisLiftedE);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread730(int [] tdone, int [] ends){
        S552=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\capper_plant.sysj line: 62, column: 32
      gripperZAxisLoweredE.setPresent();//sysj\capper_plant.sysj line: 62, column: 53
      currsigs.addElement(gripperZAxisLoweredE);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread729(int [] tdone, int [] ends){
        S544=1;
    if(cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 60, column: 32
      cylClampBottleExtendE.setPresent();//sysj\capper_plant.sysj line: 60, column: 54
      currsigs.addElement(cylClampBottleExtendE);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread728(int [] tdone, int [] ends){
        S536=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 58, column: 32
      capGripperPos5ExtendE.setPresent();//sysj\capper_plant.sysj line: 58, column: 54
      currsigs.addElement(capGripperPos5ExtendE);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread727(int [] tdone, int [] ends){
        S528=1;
    if(gripperTurnExtend.getprestatus()){//sysj\capper_plant.sysj line: 56, column: 32
      gripperTurnExtendE.setPresent();//sysj\capper_plant.sysj line: 56, column: 51
      currsigs.addElement(gripperTurnExtendE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread726(int [] tdone, int [] ends){
        S520=1;
    if(gripperTurnRetract.getprestatus()){//sysj\capper_plant.sysj line: 54, column: 32
      gripperTurnRetractE.setPresent();//sysj\capper_plant.sysj line: 54, column: 52
      currsigs.addElement(gripperTurnRetractE);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread725(int [] tdone, int [] ends){
        S512=1;
    S506=0;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 52, column: 32
      cylPos5ZaxisExtendE.setPresent();//sysj\capper_plant.sysj line: 52, column: 52
      currsigs.addElement(cylPos5ZaxisExtendE);
      S506=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S506=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread724(int [] tdone, int [] ends){
        S578=1;
    thread725(tdone,ends);
    thread726(tdone,ends);
    thread727(tdone,ends);
    thread728(tdone,ends);
    thread729(tdone,ends);
    thread730(tdone,ends);
    thread731(tdone,ends);
    thread732(tdone,ends);
    thread733(tdone,ends);
    int biggest734 = 0;
    if(ends[7]>=biggest734){
      biggest734=ends[7];
    }
    if(ends[8]>=biggest734){
      biggest734=ends[8];
    }
    if(ends[9]>=biggest734){
      biggest734=ends[9];
    }
    if(ends[10]>=biggest734){
      biggest734=ends[10];
    }
    if(ends[11]>=biggest734){
      biggest734=ends[11];
    }
    if(ends[12]>=biggest734){
      biggest734=ends[12];
    }
    if(ends[13]>=biggest734){
      biggest734=ends[13];
    }
    if(ends[14]>=biggest734){
      biggest734=ends[14];
    }
    if(ends[15]>=biggest734){
      biggest734=ends[15];
    }
    if(biggest734 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread723(int [] tdone, int [] ends){
        active[5]=0;
    ends[5]=0;
    tdone[5]=1;
  }

  public void thread722(int [] tdone, int [] ends){
        S503=1;
    S445=0;
    gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 23, column: 7
    currsigs.addElement(gripperZAxisLifted);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S720){
        case 0 : 
          S720=0;
          break RUN;
        
        case 1 : 
          S720=2;
          S720=2;
          new Thread(new GUI()).start();//sysj\capper_plant.sysj line: 17, column: 4
          thread722(tdone,ends);
          thread723(tdone,ends);
          thread724(tdone,ends);
          int biggest735 = 0;
          if(ends[2]>=biggest735){
            biggest735=ends[2];
          }
          if(ends[5]>=biggest735){
            biggest735=ends[5];
          }
          if(ends[6]>=biggest735){
            biggest735=ends[6];
          }
          if(biggest735 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread736(tdone,ends);
          thread743(tdone,ends);
          thread744(tdone,ends);
          int biggest755 = 0;
          if(ends[2]>=biggest755){
            biggest755=ends[2];
          }
          if(ends[5]>=biggest755){
            biggest755=ends[5];
          }
          if(ends[6]>=biggest755){
            biggest755=ends[6];
          }
          if(biggest755 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest755 == 0){
            S720=0;
            active[1]=0;
            ends[1]=0;
            S720=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          cylPos5ZaxisExtend.gethook();
          gripperTurnRetract.gethook();
          gripperTurnExtend.gethook();
          capGripperPos5Extend.gethook();
          cylClampBottleExtend.gethook();
          df = true;
        }
        runClockDomain();
      }
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      cylPos5ZaxisExtendE.setpreclear();
      gripperTurnRetractE.setpreclear();
      gripperTurnExtendE.setpreclear();
      capGripperPos5ExtendE.setpreclear();
      cylClampBottleExtendE.setpreclear();
      gripperZAxisLoweredE.setpreclear();
      gripperZAxisLiftedE.setpreclear();
      gripperTurnHomePosE.setpreclear();
      gripperTurnFinalPosE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = cylPos5ZaxisExtend.getStatus() ? cylPos5ZaxisExtend.setprepresent() : cylPos5ZaxisExtend.setpreclear();
      cylPos5ZaxisExtend.setpreval(cylPos5ZaxisExtend.getValue());
      cylPos5ZaxisExtend.setClear();
      dummyint = gripperTurnRetract.getStatus() ? gripperTurnRetract.setprepresent() : gripperTurnRetract.setpreclear();
      gripperTurnRetract.setpreval(gripperTurnRetract.getValue());
      gripperTurnRetract.setClear();
      dummyint = gripperTurnExtend.getStatus() ? gripperTurnExtend.setprepresent() : gripperTurnExtend.setpreclear();
      gripperTurnExtend.setpreval(gripperTurnExtend.getValue());
      gripperTurnExtend.setClear();
      dummyint = capGripperPos5Extend.getStatus() ? capGripperPos5Extend.setprepresent() : capGripperPos5Extend.setpreclear();
      capGripperPos5Extend.setpreval(capGripperPos5Extend.getValue());
      capGripperPos5Extend.setClear();
      dummyint = cylClampBottleExtend.getStatus() ? cylClampBottleExtend.setprepresent() : cylClampBottleExtend.setpreclear();
      cylClampBottleExtend.setpreval(cylClampBottleExtend.getValue());
      cylClampBottleExtend.setClear();
      gripperZAxisLowered.sethook();
      gripperZAxisLowered.setClear();
      gripperZAxisLifted.sethook();
      gripperZAxisLifted.setClear();
      gripperTurnHomePos.sethook();
      gripperTurnHomePos.setClear();
      gripperTurnFinalPos.sethook();
      gripperTurnFinalPos.setClear();
      cylPos5ZaxisExtendE.sethook();
      cylPos5ZaxisExtendE.setClear();
      gripperTurnRetractE.sethook();
      gripperTurnRetractE.setClear();
      gripperTurnExtendE.sethook();
      gripperTurnExtendE.setClear();
      capGripperPos5ExtendE.sethook();
      capGripperPos5ExtendE.setClear();
      cylClampBottleExtendE.sethook();
      cylClampBottleExtendE.setClear();
      gripperZAxisLoweredE.sethook();
      gripperZAxisLoweredE.setClear();
      gripperZAxisLiftedE.sethook();
      gripperZAxisLiftedE.setClear();
      gripperTurnHomePosE.sethook();
      gripperTurnHomePosE.setClear();
      gripperTurnFinalPosE.sethook();
      gripperTurnFinalPosE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
