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
  private Signal capDec_42;
  private Signal capPos_42;
  private int capcount_thread_47;//sysj\conveyor_plant.sysj line: 292, column: 8
  private int S184987 = 1;
  private int S184378 = 1;
  private int S184332 = 1;
  private int S184431 = 1;
  private int S184385 = 1;
  private int S184475 = 1;
  private int S184445 = 1;
  private int S184543 = 1;
  private int S184497 = 1;
  private int S184479 = 1;
  private int S184605 = 1;
  private int S184655 = 1;
  private int S184613 = 1;
  private int S184621 = 1;
  private int S184629 = 1;
  private int S184637 = 1;
  private int S184645 = 1;
  private int S184653 = 1;
  
  private int[] ends = new int[55];
  private int[] tdone = new int[55];
  
  public void thread185121(int [] tdone, int [] ends){
        switch(S184653){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 320, column: 29
          emptyE.setPresent();//sysj\conveyor_plant.sysj line: 320, column: 36
          currsigs.addElement(emptyE);
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
        break;
      
    }
  }

  public void thread185120(int [] tdone, int [] ends){
        switch(S184645){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\conveyor_plant.sysj line: 318, column: 29
          armAtDestE.setPresent();//sysj\conveyor_plant.sysj line: 318, column: 40
          currsigs.addElement(armAtDestE);
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        else {
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        break;
      
    }
  }

  public void thread185119(int [] tdone, int [] ends){
        switch(S184637){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 316, column: 29
          armAtSourceE.setPresent();//sysj\conveyor_plant.sysj line: 316, column: 42
          currsigs.addElement(armAtSourceE);
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        else {
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        break;
      
    }
  }

  public void thread185118(int [] tdone, int [] ends){
        switch(S184629){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\conveyor_plant.sysj line: 314, column: 29
          WPgrippedE.setPresent();//sysj\conveyor_plant.sysj line: 314, column: 40
          currsigs.addElement(WPgrippedE);
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        break;
      
    }
  }

  public void thread185117(int [] tdone, int [] ends){
        switch(S184621){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 312, column: 29
          pusherExtendedE.setPresent();//sysj\conveyor_plant.sysj line: 312, column: 45
          currsigs.addElement(pusherExtendedE);
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        else {
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        break;
      
    }
  }

  public void thread185116(int [] tdone, int [] ends){
        switch(S184613){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 310, column: 29
          pusherRetractedE.setPresent();//sysj\conveyor_plant.sysj line: 310, column: 46
          currsigs.addElement(pusherRetractedE);
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        break;
      
    }
  }

  public void thread185115(int [] tdone, int [] ends){
        switch(S184655){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        thread185116(tdone,ends);
        thread185117(tdone,ends);
        thread185118(tdone,ends);
        thread185119(tdone,ends);
        thread185120(tdone,ends);
        thread185121(tdone,ends);
        int biggest185122 = 0;
        if(ends[49]>=biggest185122){
          biggest185122=ends[49];
        }
        if(ends[50]>=biggest185122){
          biggest185122=ends[50];
        }
        if(ends[51]>=biggest185122){
          biggest185122=ends[51];
        }
        if(ends[52]>=biggest185122){
          biggest185122=ends[52];
        }
        if(ends[53]>=biggest185122){
          biggest185122=ends[53];
        }
        if(ends[54]>=biggest185122){
          biggest185122=ends[54];
        }
        if(biggest185122 == 1){
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        //FINXME code
        if(biggest185122 == 0){
          S184655=0;
          active[48]=0;
          ends[48]=0;
          tdone[48]=1;
        }
        break;
      
    }
  }

  public void thread185114(int [] tdone, int [] ends){
        switch(S184605){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(capDec_42.getprestatus()){//sysj\conveyor_plant.sysj line: 294, column: 17
          if(capcount_thread_47 > 0) {//sysj\conveyor_plant.sysj line: 295, column: 10
            capcount_thread_47 = capcount_thread_47 - 1;//sysj\conveyor_plant.sysj line: 296, column: 11
          }
          if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 298, column: 17
            capcount_thread_47 = 5;//sysj\conveyor_plant.sysj line: 299, column: 10
            if(capcount_thread_47 == 0){//sysj\conveyor_plant.sysj line: 302, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 303, column: 11
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_47 == 0){//sysj\conveyor_plant.sysj line: 302, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 303, column: 11
              currsigs.addElement(empty);
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
        }
        else {
          if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 298, column: 17
            capcount_thread_47 = 5;//sysj\conveyor_plant.sysj line: 299, column: 10
            if(capcount_thread_47 == 0){//sysj\conveyor_plant.sysj line: 302, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 303, column: 11
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_47 == 0){//sysj\conveyor_plant.sysj line: 302, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 303, column: 11
              currsigs.addElement(empty);
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
        }
        break;
      
    }
  }

  public void thread185113(int [] tdone, int [] ends){
        switch(S184543){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        switch(S184497){
          case 0 : 
            if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 277, column: 15
              S184497=1;
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            else {
              switch(S184479){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 279, column: 18
                    S184479=1;
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
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 280, column: 18
                    capPos_42.setPresent();//sysj\conveyor_plant.sysj line: 282, column: 12
                    currsigs.addElement(capPos_42);
                    capPos_42.setValue(1);//sysj\conveyor_plant.sysj line: 282, column: 12
                    S184479=2;
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
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 283, column: 18
                    capDec_42.setPresent();//sysj\conveyor_plant.sysj line: 284, column: 12
                    currsigs.addElement(capDec_42);
                    S184479=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 287, column: 15
              S184497=0;
              S184479=0;
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
        break;
      
    }
  }

  public void thread185112(int [] tdone, int [] ends){
        switch(S184475){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S184445){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\conveyor_plant.sysj line: 257, column: 17
              if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 260, column: 19
                capPos_42.setPresent();//sysj\conveyor_plant.sysj line: 261, column: 12
                currsigs.addElement(capPos_42);
                capPos_42.setValue(1);//sysj\conveyor_plant.sysj line: 261, column: 12
                S184445=1;
                active[45]=1;
                ends[45]=1;
                tdone[45]=1;
              }
              else {
                S184445=1;
                active[45]=1;
                ends[45]=1;
                tdone[45]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 258, column: 12
              currsigs.addElement(WPgripped);
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
          case 1 : 
            S184445=1;
            S184445=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 254, column: 17
              if((Integer)(capPos_42.getpreval() == null ? 0 : ((Integer)capPos_42.getpreval()).intValue()) == 1){//sysj\conveyor_plant.sysj line: 255, column: 13
                capPos_42.setPresent();//sysj\conveyor_plant.sysj line: 256, column: 11
                currsigs.addElement(capPos_42);
                capPos_42.setValue(0);//sysj\conveyor_plant.sysj line: 256, column: 11
                WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 258, column: 12
                currsigs.addElement(WPgripped);
                active[45]=1;
                ends[45]=1;
                tdone[45]=1;
              }
              else {
                S184445=1;
                active[45]=1;
                ends[45]=1;
                tdone[45]=1;
              }
            }
            else {
              S184445=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread185111(int [] tdone, int [] ends){
        switch(S184431){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        switch(S184385){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 241, column: 15
              S184385=1;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 242, column: 10
              currsigs.addElement(pusherRetracted);
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 244, column: 15
              S184385=2;
              pusherExtended.setPresent();//sysj\conveyor_plant.sysj line: 246, column: 10
              currsigs.addElement(pusherExtended);
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
          
          case 2 : 
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 245, column: 15
              S184385=3;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\conveyor_plant.sysj line: 246, column: 10
              currsigs.addElement(pusherExtended);
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 248, column: 15
              S184385=0;
              pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 242, column: 10
              currsigs.addElement(pusherRetracted);
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
        break;
      
    }
  }

  public void thread185110(int [] tdone, int [] ends){
        switch(S184378){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        switch(S184332){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 228, column: 15
              S184332=1;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            else {
              armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 229, column: 10
              currsigs.addElement(armAtDest);
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 231, column: 15
              S184332=2;
              armAtSource.setPresent();//sysj\conveyor_plant.sysj line: 233, column: 10
              currsigs.addElement(armAtSource);
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
          
          case 2 : 
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 232, column: 15
              S184332=3;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            else {
              armAtSource.setPresent();//sysj\conveyor_plant.sysj line: 233, column: 10
              currsigs.addElement(armAtSource);
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 235, column: 15
              S184332=0;
              armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 229, column: 10
              currsigs.addElement(armAtDest);
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
        break;
      
    }
  }

  public void thread185107(int [] tdone, int [] ends){
        S184653=1;
    if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 320, column: 29
      emptyE.setPresent();//sysj\conveyor_plant.sysj line: 320, column: 36
      currsigs.addElement(emptyE);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread185106(int [] tdone, int [] ends){
        S184645=1;
    if(armAtDest.getprestatus()){//sysj\conveyor_plant.sysj line: 318, column: 29
      armAtDestE.setPresent();//sysj\conveyor_plant.sysj line: 318, column: 40
      currsigs.addElement(armAtDestE);
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
  }

  public void thread185105(int [] tdone, int [] ends){
        S184637=1;
    if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 316, column: 29
      armAtSourceE.setPresent();//sysj\conveyor_plant.sysj line: 316, column: 42
      currsigs.addElement(armAtSourceE);
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread185104(int [] tdone, int [] ends){
        S184629=1;
    if(WPgripped.getprestatus()){//sysj\conveyor_plant.sysj line: 314, column: 29
      WPgrippedE.setPresent();//sysj\conveyor_plant.sysj line: 314, column: 40
      currsigs.addElement(WPgrippedE);
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread185103(int [] tdone, int [] ends){
        S184621=1;
    if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 312, column: 29
      pusherExtendedE.setPresent();//sysj\conveyor_plant.sysj line: 312, column: 45
      currsigs.addElement(pusherExtendedE);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread185102(int [] tdone, int [] ends){
        S184613=1;
    if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 310, column: 29
      pusherRetractedE.setPresent();//sysj\conveyor_plant.sysj line: 310, column: 46
      currsigs.addElement(pusherRetractedE);
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread185101(int [] tdone, int [] ends){
        S184655=1;
    thread185102(tdone,ends);
    thread185103(tdone,ends);
    thread185104(tdone,ends);
    thread185105(tdone,ends);
    thread185106(tdone,ends);
    thread185107(tdone,ends);
    int biggest185108 = 0;
    if(ends[49]>=biggest185108){
      biggest185108=ends[49];
    }
    if(ends[50]>=biggest185108){
      biggest185108=ends[50];
    }
    if(ends[51]>=biggest185108){
      biggest185108=ends[51];
    }
    if(ends[52]>=biggest185108){
      biggest185108=ends[52];
    }
    if(ends[53]>=biggest185108){
      biggest185108=ends[53];
    }
    if(ends[54]>=biggest185108){
      biggest185108=ends[54];
    }
    if(biggest185108 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread185100(int [] tdone, int [] ends){
        S184605=1;
    capcount_thread_47 = 5;//sysj\conveyor_plant.sysj line: 292, column: 8
    if(capDec_42.getprestatus()){//sysj\conveyor_plant.sysj line: 294, column: 17
      if(capcount_thread_47 > 0) {//sysj\conveyor_plant.sysj line: 295, column: 10
        capcount_thread_47 = capcount_thread_47 - 1;//sysj\conveyor_plant.sysj line: 296, column: 11
      }
      if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 298, column: 17
        capcount_thread_47 = 5;//sysj\conveyor_plant.sysj line: 299, column: 10
        if(capcount_thread_47 == 0){//sysj\conveyor_plant.sysj line: 302, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 303, column: 11
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_47 == 0){//sysj\conveyor_plant.sysj line: 302, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 303, column: 11
          currsigs.addElement(empty);
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
    }
    else {
      if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 298, column: 17
        capcount_thread_47 = 5;//sysj\conveyor_plant.sysj line: 299, column: 10
        if(capcount_thread_47 == 0){//sysj\conveyor_plant.sysj line: 302, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 303, column: 11
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_47 == 0){//sysj\conveyor_plant.sysj line: 302, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 303, column: 11
          currsigs.addElement(empty);
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
    }
  }

  public void thread185099(int [] tdone, int [] ends){
        S184543=1;
    S184497=0;
    S184479=0;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread185098(int [] tdone, int [] ends){
        S184475=1;
    S184445=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 254, column: 17
      if((Integer)(capPos_42.getpreval() == null ? 0 : ((Integer)capPos_42.getpreval()).intValue()) == 1){//sysj\conveyor_plant.sysj line: 255, column: 13
        capPos_42.setPresent();//sysj\conveyor_plant.sysj line: 256, column: 11
        currsigs.addElement(capPos_42);
        capPos_42.setValue(0);//sysj\conveyor_plant.sysj line: 256, column: 11
        WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 258, column: 12
        currsigs.addElement(WPgripped);
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
      else {
        S184445=1;
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S184445=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread185097(int [] tdone, int [] ends){
        S184431=1;
    S184385=0;
    pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 242, column: 10
    currsigs.addElement(pusherRetracted);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread185096(int [] tdone, int [] ends){
        S184378=1;
    S184332=0;
    armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 229, column: 10
    currsigs.addElement(armAtDest);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S184987){
        case 0 : 
          S184987=0;
          break RUN;
        
        case 1 : 
          S184987=2;
          S184987=2;
          capDec_42.setClear();//sysj\conveyor_plant.sysj line: 223, column: 7
          capPos_42.setClear();//sysj\conveyor_plant.sysj line: 224, column: 7
          capPos_42.setPresent();//sysj\conveyor_plant.sysj line: 225, column: 7
          currsigs.addElement(capPos_42);
          capPos_42.setValue(0);//sysj\conveyor_plant.sysj line: 225, column: 7
          thread185096(tdone,ends);
          thread185097(tdone,ends);
          thread185098(tdone,ends);
          thread185099(tdone,ends);
          thread185100(tdone,ends);
          thread185101(tdone,ends);
          int biggest185109 = 0;
          if(ends[43]>=biggest185109){
            biggest185109=ends[43];
          }
          if(ends[44]>=biggest185109){
            biggest185109=ends[44];
          }
          if(ends[45]>=biggest185109){
            biggest185109=ends[45];
          }
          if(ends[46]>=biggest185109){
            biggest185109=ends[46];
          }
          if(ends[47]>=biggest185109){
            biggest185109=ends[47];
          }
          if(ends[48]>=biggest185109){
            biggest185109=ends[48];
          }
          if(biggest185109 == 1){
            active[42]=1;
            ends[42]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_42.setClear();//sysj\conveyor_plant.sysj line: 223, column: 7
          capPos_42.setClear();//sysj\conveyor_plant.sysj line: 224, column: 7
          thread185110(tdone,ends);
          thread185111(tdone,ends);
          thread185112(tdone,ends);
          thread185113(tdone,ends);
          thread185114(tdone,ends);
          thread185115(tdone,ends);
          int biggest185123 = 0;
          if(ends[43]>=biggest185123){
            biggest185123=ends[43];
          }
          if(ends[44]>=biggest185123){
            biggest185123=ends[44];
          }
          if(ends[45]>=biggest185123){
            biggest185123=ends[45];
          }
          if(ends[46]>=biggest185123){
            biggest185123=ends[46];
          }
          if(ends[47]>=biggest185123){
            biggest185123=ends[47];
          }
          if(ends[48]>=biggest185123){
            biggest185123=ends[48];
          }
          if(biggest185123 == 1){
            active[42]=1;
            ends[42]=1;
            break RUN;
          }
          //FINXME code
          if(biggest185123 == 0){
            S184987=0;
            active[42]=0;
            ends[42]=0;
            S184987=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_42 = new Signal();
    capPos_42 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[42] != 0){
      int index = 42;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[42]!=0 || suspended[42]!=0 || active[42]!=1);
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
      capDec_42.setpreclear();
      capPos_42.setpreclear();
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
      capDec_42.setClear();
      capPos_42.setClear();
      if(paused[42]!=0 || suspended[42]!=0 || active[42]!=1);
      else{
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        enable.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[42] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
