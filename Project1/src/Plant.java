import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1
import run.socketListener;//sysj\conveyor_plant.sysj line: 2, column: 1

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  public Signal empty = new Signal("empty", Signal.OUTPUT);
  public Signal pusherRetractedE = new Signal("pusherRetractedE", Signal.OUTPUT);
  public Signal pusherExtendedE = new Signal("pusherExtendedE", Signal.OUTPUT);
  public Signal WPgrippedE = new Signal("WPgrippedE", Signal.OUTPUT);
  public Signal armAtSourceE = new Signal("armAtSourceE", Signal.OUTPUT);
  public Signal armAtDestE = new Signal("armAtDestE", Signal.OUTPUT);
  public Signal emptyE = new Signal("emptyE", Signal.OUTPUT);
  private Signal capDec_36;
  private Signal capPos_36;
  private int capcount_thread_41;//sysj\conveyor_plant.sysj line: 275, column: 8
  private int S203913 = 1;
  private int S203304 = 1;
  private int S203258 = 1;
  private int S203357 = 1;
  private int S203311 = 1;
  private int S203401 = 1;
  private int S203371 = 1;
  private int S203469 = 1;
  private int S203423 = 1;
  private int S203405 = 1;
  private int S203531 = 1;
  private int S203581 = 1;
  private int S203539 = 1;
  private int S203547 = 1;
  private int S203555 = 1;
  private int S203563 = 1;
  private int S203571 = 1;
  private int S203579 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread204023(int [] tdone, int [] ends){
        switch(S203579){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 303, column: 29
          emptyE.setPresent();//sysj\conveyor_plant.sysj line: 303, column: 36
          currsigs.addElement(emptyE);
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        break;
      
    }
  }

  public void thread204022(int [] tdone, int [] ends){
        switch(S203571){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\conveyor_plant.sysj line: 301, column: 29
          armAtDestE.setPresent();//sysj\conveyor_plant.sysj line: 301, column: 40
          currsigs.addElement(armAtDestE);
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread204021(int [] tdone, int [] ends){
        switch(S203563){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 299, column: 29
          armAtSourceE.setPresent();//sysj\conveyor_plant.sysj line: 299, column: 42
          currsigs.addElement(armAtSourceE);
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        break;
      
    }
  }

  public void thread204020(int [] tdone, int [] ends){
        switch(S203555){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\conveyor_plant.sysj line: 297, column: 29
          WPgrippedE.setPresent();//sysj\conveyor_plant.sysj line: 297, column: 40
          currsigs.addElement(WPgrippedE);
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        break;
      
    }
  }

  public void thread204019(int [] tdone, int [] ends){
        switch(S203547){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 295, column: 29
          pusherExtendedE.setPresent();//sysj\conveyor_plant.sysj line: 295, column: 45
          currsigs.addElement(pusherExtendedE);
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        break;
      
    }
  }

  public void thread204018(int [] tdone, int [] ends){
        switch(S203539){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 293, column: 29
          pusherRetractedE.setPresent();//sysj\conveyor_plant.sysj line: 293, column: 46
          currsigs.addElement(pusherRetractedE);
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        break;
      
    }
  }

  public void thread204017(int [] tdone, int [] ends){
        switch(S203581){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        thread204018(tdone,ends);
        thread204019(tdone,ends);
        thread204020(tdone,ends);
        thread204021(tdone,ends);
        thread204022(tdone,ends);
        thread204023(tdone,ends);
        int biggest204024 = 0;
        if(ends[43]>=biggest204024){
          biggest204024=ends[43];
        }
        if(ends[44]>=biggest204024){
          biggest204024=ends[44];
        }
        if(ends[45]>=biggest204024){
          biggest204024=ends[45];
        }
        if(ends[46]>=biggest204024){
          biggest204024=ends[46];
        }
        if(ends[47]>=biggest204024){
          biggest204024=ends[47];
        }
        if(ends[48]>=biggest204024){
          biggest204024=ends[48];
        }
        if(biggest204024 == 1){
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        //FINXME code
        if(biggest204024 == 0){
          S203581=0;
          active[42]=0;
          ends[42]=0;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread204016(int [] tdone, int [] ends){
        switch(S203531){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(capDec_36.getprestatus()){//sysj\conveyor_plant.sysj line: 277, column: 17
          if(capcount_thread_41 > 0) {//sysj\conveyor_plant.sysj line: 278, column: 10
            capcount_thread_41 = capcount_thread_41 - 1;//sysj\conveyor_plant.sysj line: 279, column: 11
          }
          if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 281, column: 17
            capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 282, column: 10
            if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 285, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 286, column: 11
              currsigs.addElement(empty);
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            else {
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
          }
          else {
            if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 285, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 286, column: 11
              currsigs.addElement(empty);
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            else {
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
          }
        }
        else {
          if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 281, column: 17
            capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 282, column: 10
            if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 285, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 286, column: 11
              currsigs.addElement(empty);
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            else {
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
          }
          else {
            if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 285, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 286, column: 11
              currsigs.addElement(empty);
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            else {
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread204015(int [] tdone, int [] ends){
        switch(S203469){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        switch(S203423){
          case 0 : 
            if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 260, column: 15
              S203423=1;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            else {
              switch(S203405){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 262, column: 18
                    S203405=1;
                    active[40]=1;
                    ends[40]=1;
                    tdone[40]=1;
                  }
                  else {
                    active[40]=1;
                    ends[40]=1;
                    tdone[40]=1;
                  }
                  break;
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 263, column: 18
                    capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 265, column: 12
                    currsigs.addElement(capPos_36);
                    capPos_36.setValue(1);//sysj\conveyor_plant.sysj line: 265, column: 12
                    S203405=2;
                    active[40]=1;
                    ends[40]=1;
                    tdone[40]=1;
                  }
                  else {
                    active[40]=1;
                    ends[40]=1;
                    tdone[40]=1;
                  }
                  break;
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 266, column: 18
                    capDec_36.setPresent();//sysj\conveyor_plant.sysj line: 267, column: 12
                    currsigs.addElement(capDec_36);
                    S203405=0;
                    active[40]=1;
                    ends[40]=1;
                    tdone[40]=1;
                  }
                  else {
                    active[40]=1;
                    ends[40]=1;
                    tdone[40]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 270, column: 15
              S203423=0;
              S203405=0;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            else {
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread204014(int [] tdone, int [] ends){
        switch(S203401){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S203371){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\conveyor_plant.sysj line: 240, column: 17
              if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 243, column: 19
                capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 244, column: 12
                currsigs.addElement(capPos_36);
                capPos_36.setValue(1);//sysj\conveyor_plant.sysj line: 244, column: 12
                S203371=1;
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
              else {
                S203371=1;
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 241, column: 12
              currsigs.addElement(WPgripped);
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
          case 1 : 
            S203371=1;
            S203371=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 237, column: 17
              if((Integer)(capPos_36.getpreval() == null ? 0 : ((Integer)capPos_36.getpreval()).intValue()) == 1){//sysj\conveyor_plant.sysj line: 238, column: 13
                capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 239, column: 11
                currsigs.addElement(capPos_36);
                capPos_36.setValue(0);//sysj\conveyor_plant.sysj line: 239, column: 11
                WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 241, column: 12
                currsigs.addElement(WPgripped);
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
              else {
                S203371=1;
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
            }
            else {
              S203371=1;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread204013(int [] tdone, int [] ends){
        switch(S203357){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S203311){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 224, column: 15
              S203311=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 225, column: 10
              currsigs.addElement(pusherRetracted);
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 227, column: 15
              S203311=2;
              pusherExtended.setPresent();//sysj\conveyor_plant.sysj line: 229, column: 10
              currsigs.addElement(pusherExtended);
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 2 : 
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 228, column: 15
              S203311=3;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\conveyor_plant.sysj line: 229, column: 10
              currsigs.addElement(pusherExtended);
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 231, column: 15
              S203311=0;
              pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 225, column: 10
              currsigs.addElement(pusherRetracted);
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread204012(int [] tdone, int [] ends){
        switch(S203304){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S203258){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 211, column: 15
              S203258=1;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 212, column: 10
              currsigs.addElement(armAtDest);
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 214, column: 15
              S203258=2;
              armAtSource.setPresent();//sysj\conveyor_plant.sysj line: 216, column: 10
              currsigs.addElement(armAtSource);
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 2 : 
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 215, column: 15
              S203258=3;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              armAtSource.setPresent();//sysj\conveyor_plant.sysj line: 216, column: 10
              currsigs.addElement(armAtSource);
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 218, column: 15
              S203258=0;
              armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 212, column: 10
              currsigs.addElement(armAtDest);
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread204009(int [] tdone, int [] ends){
        S203579=1;
    if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 303, column: 29
      emptyE.setPresent();//sysj\conveyor_plant.sysj line: 303, column: 36
      currsigs.addElement(emptyE);
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread204008(int [] tdone, int [] ends){
        S203571=1;
    if(armAtDest.getprestatus()){//sysj\conveyor_plant.sysj line: 301, column: 29
      armAtDestE.setPresent();//sysj\conveyor_plant.sysj line: 301, column: 40
      currsigs.addElement(armAtDestE);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread204007(int [] tdone, int [] ends){
        S203563=1;
    if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 299, column: 29
      armAtSourceE.setPresent();//sysj\conveyor_plant.sysj line: 299, column: 42
      currsigs.addElement(armAtSourceE);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread204006(int [] tdone, int [] ends){
        S203555=1;
    if(WPgripped.getprestatus()){//sysj\conveyor_plant.sysj line: 297, column: 29
      WPgrippedE.setPresent();//sysj\conveyor_plant.sysj line: 297, column: 40
      currsigs.addElement(WPgrippedE);
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread204005(int [] tdone, int [] ends){
        S203547=1;
    if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 295, column: 29
      pusherExtendedE.setPresent();//sysj\conveyor_plant.sysj line: 295, column: 45
      currsigs.addElement(pusherExtendedE);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread204004(int [] tdone, int [] ends){
        S203539=1;
    if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 293, column: 29
      pusherRetractedE.setPresent();//sysj\conveyor_plant.sysj line: 293, column: 46
      currsigs.addElement(pusherRetractedE);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread204003(int [] tdone, int [] ends){
        S203581=1;
    thread204004(tdone,ends);
    thread204005(tdone,ends);
    thread204006(tdone,ends);
    thread204007(tdone,ends);
    thread204008(tdone,ends);
    thread204009(tdone,ends);
    int biggest204010 = 0;
    if(ends[43]>=biggest204010){
      biggest204010=ends[43];
    }
    if(ends[44]>=biggest204010){
      biggest204010=ends[44];
    }
    if(ends[45]>=biggest204010){
      biggest204010=ends[45];
    }
    if(ends[46]>=biggest204010){
      biggest204010=ends[46];
    }
    if(ends[47]>=biggest204010){
      biggest204010=ends[47];
    }
    if(ends[48]>=biggest204010){
      biggest204010=ends[48];
    }
    if(biggest204010 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread204002(int [] tdone, int [] ends){
        S203531=1;
    capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 275, column: 8
    if(capDec_36.getprestatus()){//sysj\conveyor_plant.sysj line: 277, column: 17
      if(capcount_thread_41 > 0) {//sysj\conveyor_plant.sysj line: 278, column: 10
        capcount_thread_41 = capcount_thread_41 - 1;//sysj\conveyor_plant.sysj line: 279, column: 11
      }
      if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 281, column: 17
        capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 282, column: 10
        if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 285, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 286, column: 11
          currsigs.addElement(empty);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 285, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 286, column: 11
          currsigs.addElement(empty);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 281, column: 17
        capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 282, column: 10
        if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 285, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 286, column: 11
          currsigs.addElement(empty);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 285, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 286, column: 11
          currsigs.addElement(empty);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
    }
  }

  public void thread204001(int [] tdone, int [] ends){
        S203469=1;
    S203423=0;
    S203405=0;
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread204000(int [] tdone, int [] ends){
        S203401=1;
    S203371=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 237, column: 17
      if((Integer)(capPos_36.getpreval() == null ? 0 : ((Integer)capPos_36.getpreval()).intValue()) == 1){//sysj\conveyor_plant.sysj line: 238, column: 13
        capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 239, column: 11
        currsigs.addElement(capPos_36);
        capPos_36.setValue(0);//sysj\conveyor_plant.sysj line: 239, column: 11
        WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 241, column: 12
        currsigs.addElement(WPgripped);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
      else {
        S203371=1;
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
    else {
      S203371=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread203999(int [] tdone, int [] ends){
        S203357=1;
    S203311=0;
    pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 225, column: 10
    currsigs.addElement(pusherRetracted);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread203998(int [] tdone, int [] ends){
        S203304=1;
    S203258=0;
    armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 212, column: 10
    currsigs.addElement(armAtDest);
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S203913){
        case 0 : 
          S203913=0;
          break RUN;
        
        case 1 : 
          S203913=2;
          S203913=2;
          capDec_36.setClear();//sysj\conveyor_plant.sysj line: 206, column: 7
          capPos_36.setClear();//sysj\conveyor_plant.sysj line: 207, column: 7
          capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 208, column: 7
          currsigs.addElement(capPos_36);
          capPos_36.setValue(0);//sysj\conveyor_plant.sysj line: 208, column: 7
          thread203998(tdone,ends);
          thread203999(tdone,ends);
          thread204000(tdone,ends);
          thread204001(tdone,ends);
          thread204002(tdone,ends);
          thread204003(tdone,ends);
          int biggest204011 = 0;
          if(ends[37]>=biggest204011){
            biggest204011=ends[37];
          }
          if(ends[38]>=biggest204011){
            biggest204011=ends[38];
          }
          if(ends[39]>=biggest204011){
            biggest204011=ends[39];
          }
          if(ends[40]>=biggest204011){
            biggest204011=ends[40];
          }
          if(ends[41]>=biggest204011){
            biggest204011=ends[41];
          }
          if(ends[42]>=biggest204011){
            biggest204011=ends[42];
          }
          if(biggest204011 == 1){
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_36.setClear();//sysj\conveyor_plant.sysj line: 206, column: 7
          capPos_36.setClear();//sysj\conveyor_plant.sysj line: 207, column: 7
          thread204012(tdone,ends);
          thread204013(tdone,ends);
          thread204014(tdone,ends);
          thread204015(tdone,ends);
          thread204016(tdone,ends);
          thread204017(tdone,ends);
          int biggest204025 = 0;
          if(ends[37]>=biggest204025){
            biggest204025=ends[37];
          }
          if(ends[38]>=biggest204025){
            biggest204025=ends[38];
          }
          if(ends[39]>=biggest204025){
            biggest204025=ends[39];
          }
          if(ends[40]>=biggest204025){
            biggest204025=ends[40];
          }
          if(ends[41]>=biggest204025){
            biggest204025=ends[41];
          }
          if(ends[42]>=biggest204025){
            biggest204025=ends[42];
          }
          if(biggest204025 == 1){
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
          //FINXME code
          if(biggest204025 == 0){
            S203913=0;
            active[36]=0;
            ends[36]=0;
            S203913=0;
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
    capDec_36 = new Signal();
    capPos_36 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[36] != 0){
      int index = 36;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[36]!=0 || suspended[36]!=0 || active[36]!=1);
      else{
        if(!df){
          pusherExtend.gethook();
          vacOn.gethook();
          armSource.gethook();
          armDest.gethook();
          enable.gethook();
          refill.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      pusherRetractedE.setpreclear();
      pusherExtendedE.setpreclear();
      WPgrippedE.setpreclear();
      armAtSourceE.setpreclear();
      armAtDestE.setpreclear();
      emptyE.setpreclear();
      capDec_36.setpreclear();
      capPos_36.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherExtend.getStatus() ? pusherExtend.setprepresent() : pusherExtend.setpreclear();
      pusherExtend.setpreval(pusherExtend.getValue());
      pusherExtend.setClear();
      dummyint = vacOn.getStatus() ? vacOn.setprepresent() : vacOn.setpreclear();
      vacOn.setpreval(vacOn.getValue());
      vacOn.setClear();
      dummyint = armSource.getStatus() ? armSource.setprepresent() : armSource.setpreclear();
      armSource.setpreval(armSource.getValue());
      armSource.setClear();
      dummyint = armDest.getStatus() ? armDest.setprepresent() : armDest.setpreclear();
      armDest.setpreval(armDest.getValue());
      armDest.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      pusherRetracted.sethook();
      pusherRetracted.setClear();
      pusherExtended.sethook();
      pusherExtended.setClear();
      WPgripped.sethook();
      WPgripped.setClear();
      armAtSource.sethook();
      armAtSource.setClear();
      armAtDest.sethook();
      armAtDest.setClear();
      empty.sethook();
      empty.setClear();
      pusherRetractedE.sethook();
      pusherRetractedE.setClear();
      pusherExtendedE.sethook();
      pusherExtendedE.setClear();
      WPgrippedE.sethook();
      WPgrippedE.setClear();
      armAtSourceE.sethook();
      armAtSourceE.setClear();
      armAtDestE.sethook();
      armAtDestE.setClear();
      emptyE.sethook();
      emptyE.setClear();
      capDec_36.setClear();
      capPos_36.setClear();
      if(paused[36]!=0 || suspended[36]!=0 || active[36]!=1);
      else{
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        enable.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[36] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
