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
  private Signal capDec_39;
  private Signal capPos_39;
  private int capcount_thread_44;//sysj\conveyor_plant.sysj line: 272, column: 8
  private int S193655 = 1;
  private int S193046 = 1;
  private int S193000 = 1;
  private int S193099 = 1;
  private int S193053 = 1;
  private int S193143 = 1;
  private int S193113 = 1;
  private int S193211 = 1;
  private int S193165 = 1;
  private int S193147 = 1;
  private int S193273 = 1;
  private int S193323 = 1;
  private int S193281 = 1;
  private int S193289 = 1;
  private int S193297 = 1;
  private int S193305 = 1;
  private int S193313 = 1;
  private int S193321 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread193778(int [] tdone, int [] ends){
        switch(S193321){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 300, column: 29
          emptyE.setPresent();//sysj\conveyor_plant.sysj line: 300, column: 36
          currsigs.addElement(emptyE);
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

  public void thread193777(int [] tdone, int [] ends){
        switch(S193313){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\conveyor_plant.sysj line: 298, column: 29
          armAtDestE.setPresent();//sysj\conveyor_plant.sysj line: 298, column: 40
          currsigs.addElement(armAtDestE);
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

  public void thread193776(int [] tdone, int [] ends){
        switch(S193305){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 296, column: 29
          armAtSourceE.setPresent();//sysj\conveyor_plant.sysj line: 296, column: 42
          currsigs.addElement(armAtSourceE);
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

  public void thread193775(int [] tdone, int [] ends){
        switch(S193297){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\conveyor_plant.sysj line: 294, column: 29
          WPgrippedE.setPresent();//sysj\conveyor_plant.sysj line: 294, column: 40
          currsigs.addElement(WPgrippedE);
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

  public void thread193774(int [] tdone, int [] ends){
        switch(S193289){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 292, column: 29
          pusherExtendedE.setPresent();//sysj\conveyor_plant.sysj line: 292, column: 45
          currsigs.addElement(pusherExtendedE);
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

  public void thread193773(int [] tdone, int [] ends){
        switch(S193281){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 290, column: 29
          pusherRetractedE.setPresent();//sysj\conveyor_plant.sysj line: 290, column: 46
          currsigs.addElement(pusherRetractedE);
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

  public void thread193772(int [] tdone, int [] ends){
        switch(S193323){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        thread193773(tdone,ends);
        thread193774(tdone,ends);
        thread193775(tdone,ends);
        thread193776(tdone,ends);
        thread193777(tdone,ends);
        thread193778(tdone,ends);
        int biggest193779 = 0;
        if(ends[46]>=biggest193779){
          biggest193779=ends[46];
        }
        if(ends[47]>=biggest193779){
          biggest193779=ends[47];
        }
        if(ends[48]>=biggest193779){
          biggest193779=ends[48];
        }
        if(ends[49]>=biggest193779){
          biggest193779=ends[49];
        }
        if(ends[50]>=biggest193779){
          biggest193779=ends[50];
        }
        if(ends[51]>=biggest193779){
          biggest193779=ends[51];
        }
        if(biggest193779 == 1){
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        //FINXME code
        if(biggest193779 == 0){
          S193323=0;
          active[45]=0;
          ends[45]=0;
          tdone[45]=1;
        }
        break;
      
    }
  }

  public void thread193771(int [] tdone, int [] ends){
        switch(S193273){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if(capDec_39.getprestatus()){//sysj\conveyor_plant.sysj line: 274, column: 17
          if(capcount_thread_44 > 0) {//sysj\conveyor_plant.sysj line: 275, column: 10
            capcount_thread_44 = capcount_thread_44 - 1;//sysj\conveyor_plant.sysj line: 276, column: 11
          }
          if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 278, column: 17
            capcount_thread_44 = 5;//sysj\conveyor_plant.sysj line: 279, column: 10
            if(capcount_thread_44 == 0){//sysj\conveyor_plant.sysj line: 282, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 283, column: 11
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_44 == 0){//sysj\conveyor_plant.sysj line: 282, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 283, column: 11
              currsigs.addElement(empty);
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
        }
        else {
          if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 278, column: 17
            capcount_thread_44 = 5;//sysj\conveyor_plant.sysj line: 279, column: 10
            if(capcount_thread_44 == 0){//sysj\conveyor_plant.sysj line: 282, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 283, column: 11
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_44 == 0){//sysj\conveyor_plant.sysj line: 282, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 283, column: 11
              currsigs.addElement(empty);
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
        }
        break;
      
    }
  }

  public void thread193770(int [] tdone, int [] ends){
        switch(S193211){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        switch(S193165){
          case 0 : 
            if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 257, column: 15
              S193165=1;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            else {
              switch(S193147){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 259, column: 18
                    S193147=1;
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
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 260, column: 18
                    capPos_39.setPresent();//sysj\conveyor_plant.sysj line: 262, column: 12
                    currsigs.addElement(capPos_39);
                    capPos_39.setValue(1);//sysj\conveyor_plant.sysj line: 262, column: 12
                    S193147=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 263, column: 18
                    capDec_39.setPresent();//sysj\conveyor_plant.sysj line: 264, column: 12
                    currsigs.addElement(capDec_39);
                    S193147=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 267, column: 15
              S193165=0;
              S193147=0;
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

  public void thread193769(int [] tdone, int [] ends){
        switch(S193143){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S193113){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\conveyor_plant.sysj line: 237, column: 17
              if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 240, column: 19
                capPos_39.setPresent();//sysj\conveyor_plant.sysj line: 241, column: 12
                currsigs.addElement(capPos_39);
                capPos_39.setValue(1);//sysj\conveyor_plant.sysj line: 241, column: 12
                S193113=1;
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
              else {
                S193113=1;
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 238, column: 12
              currsigs.addElement(WPgripped);
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
          case 1 : 
            S193113=1;
            S193113=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 234, column: 17
              if((Integer)(capPos_39.getpreval() == null ? 0 : ((Integer)capPos_39.getpreval()).intValue()) == 1){//sysj\conveyor_plant.sysj line: 235, column: 13
                capPos_39.setPresent();//sysj\conveyor_plant.sysj line: 236, column: 11
                currsigs.addElement(capPos_39);
                capPos_39.setValue(0);//sysj\conveyor_plant.sysj line: 236, column: 11
                WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 238, column: 12
                currsigs.addElement(WPgripped);
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
              else {
                S193113=1;
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
            }
            else {
              S193113=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread193768(int [] tdone, int [] ends){
        switch(S193099){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        switch(S193053){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 221, column: 15
              S193053=1;
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 222, column: 10
              currsigs.addElement(pusherRetracted);
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 224, column: 15
              S193053=2;
              pusherExtended.setPresent();//sysj\conveyor_plant.sysj line: 226, column: 10
              currsigs.addElement(pusherExtended);
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            else {
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            break;
          
          case 2 : 
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 225, column: 15
              S193053=3;
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\conveyor_plant.sysj line: 226, column: 10
              currsigs.addElement(pusherExtended);
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 228, column: 15
              S193053=0;
              pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 222, column: 10
              currsigs.addElement(pusherRetracted);
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            else {
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread193767(int [] tdone, int [] ends){
        switch(S193046){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        switch(S193000){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 208, column: 15
              S193000=1;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            else {
              armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 209, column: 10
              currsigs.addElement(armAtDest);
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 211, column: 15
              S193000=2;
              armAtSource.setPresent();//sysj\conveyor_plant.sysj line: 213, column: 10
              currsigs.addElement(armAtSource);
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
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 212, column: 15
              S193000=3;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            else {
              armAtSource.setPresent();//sysj\conveyor_plant.sysj line: 213, column: 10
              currsigs.addElement(armAtSource);
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 215, column: 15
              S193000=0;
              armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 209, column: 10
              currsigs.addElement(armAtDest);
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

  public void thread193764(int [] tdone, int [] ends){
        S193321=1;
    if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 300, column: 29
      emptyE.setPresent();//sysj\conveyor_plant.sysj line: 300, column: 36
      currsigs.addElement(emptyE);
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

  public void thread193763(int [] tdone, int [] ends){
        S193313=1;
    if(armAtDest.getprestatus()){//sysj\conveyor_plant.sysj line: 298, column: 29
      armAtDestE.setPresent();//sysj\conveyor_plant.sysj line: 298, column: 40
      currsigs.addElement(armAtDestE);
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

  public void thread193762(int [] tdone, int [] ends){
        S193305=1;
    if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 296, column: 29
      armAtSourceE.setPresent();//sysj\conveyor_plant.sysj line: 296, column: 42
      currsigs.addElement(armAtSourceE);
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

  public void thread193761(int [] tdone, int [] ends){
        S193297=1;
    if(WPgripped.getprestatus()){//sysj\conveyor_plant.sysj line: 294, column: 29
      WPgrippedE.setPresent();//sysj\conveyor_plant.sysj line: 294, column: 40
      currsigs.addElement(WPgrippedE);
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

  public void thread193760(int [] tdone, int [] ends){
        S193289=1;
    if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 292, column: 29
      pusherExtendedE.setPresent();//sysj\conveyor_plant.sysj line: 292, column: 45
      currsigs.addElement(pusherExtendedE);
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

  public void thread193759(int [] tdone, int [] ends){
        S193281=1;
    if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 290, column: 29
      pusherRetractedE.setPresent();//sysj\conveyor_plant.sysj line: 290, column: 46
      currsigs.addElement(pusherRetractedE);
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

  public void thread193758(int [] tdone, int [] ends){
        S193323=1;
    thread193759(tdone,ends);
    thread193760(tdone,ends);
    thread193761(tdone,ends);
    thread193762(tdone,ends);
    thread193763(tdone,ends);
    thread193764(tdone,ends);
    int biggest193765 = 0;
    if(ends[46]>=biggest193765){
      biggest193765=ends[46];
    }
    if(ends[47]>=biggest193765){
      biggest193765=ends[47];
    }
    if(ends[48]>=biggest193765){
      biggest193765=ends[48];
    }
    if(ends[49]>=biggest193765){
      biggest193765=ends[49];
    }
    if(ends[50]>=biggest193765){
      biggest193765=ends[50];
    }
    if(ends[51]>=biggest193765){
      biggest193765=ends[51];
    }
    if(biggest193765 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread193757(int [] tdone, int [] ends){
        S193273=1;
    capcount_thread_44 = 5;//sysj\conveyor_plant.sysj line: 272, column: 8
    if(capDec_39.getprestatus()){//sysj\conveyor_plant.sysj line: 274, column: 17
      if(capcount_thread_44 > 0) {//sysj\conveyor_plant.sysj line: 275, column: 10
        capcount_thread_44 = capcount_thread_44 - 1;//sysj\conveyor_plant.sysj line: 276, column: 11
      }
      if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 278, column: 17
        capcount_thread_44 = 5;//sysj\conveyor_plant.sysj line: 279, column: 10
        if(capcount_thread_44 == 0){//sysj\conveyor_plant.sysj line: 282, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 283, column: 11
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_44 == 0){//sysj\conveyor_plant.sysj line: 282, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 283, column: 11
          currsigs.addElement(empty);
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
    }
    else {
      if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 278, column: 17
        capcount_thread_44 = 5;//sysj\conveyor_plant.sysj line: 279, column: 10
        if(capcount_thread_44 == 0){//sysj\conveyor_plant.sysj line: 282, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 283, column: 11
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_44 == 0){//sysj\conveyor_plant.sysj line: 282, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 283, column: 11
          currsigs.addElement(empty);
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
    }
  }

  public void thread193756(int [] tdone, int [] ends){
        S193211=1;
    S193165=0;
    S193147=0;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread193755(int [] tdone, int [] ends){
        S193143=1;
    S193113=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 234, column: 17
      if((Integer)(capPos_39.getpreval() == null ? 0 : ((Integer)capPos_39.getpreval()).intValue()) == 1){//sysj\conveyor_plant.sysj line: 235, column: 13
        capPos_39.setPresent();//sysj\conveyor_plant.sysj line: 236, column: 11
        currsigs.addElement(capPos_39);
        capPos_39.setValue(0);//sysj\conveyor_plant.sysj line: 236, column: 11
        WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 238, column: 12
        currsigs.addElement(WPgripped);
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
      else {
        S193113=1;
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S193113=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread193754(int [] tdone, int [] ends){
        S193099=1;
    S193053=0;
    pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 222, column: 10
    currsigs.addElement(pusherRetracted);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread193753(int [] tdone, int [] ends){
        S193046=1;
    S193000=0;
    armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 209, column: 10
    currsigs.addElement(armAtDest);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S193655){
        case 0 : 
          S193655=0;
          break RUN;
        
        case 1 : 
          S193655=2;
          S193655=2;
          capDec_39.setClear();//sysj\conveyor_plant.sysj line: 203, column: 7
          capPos_39.setClear();//sysj\conveyor_plant.sysj line: 204, column: 7
          capPos_39.setPresent();//sysj\conveyor_plant.sysj line: 205, column: 7
          currsigs.addElement(capPos_39);
          capPos_39.setValue(0);//sysj\conveyor_plant.sysj line: 205, column: 7
          thread193753(tdone,ends);
          thread193754(tdone,ends);
          thread193755(tdone,ends);
          thread193756(tdone,ends);
          thread193757(tdone,ends);
          thread193758(tdone,ends);
          int biggest193766 = 0;
          if(ends[40]>=biggest193766){
            biggest193766=ends[40];
          }
          if(ends[41]>=biggest193766){
            biggest193766=ends[41];
          }
          if(ends[42]>=biggest193766){
            biggest193766=ends[42];
          }
          if(ends[43]>=biggest193766){
            biggest193766=ends[43];
          }
          if(ends[44]>=biggest193766){
            biggest193766=ends[44];
          }
          if(ends[45]>=biggest193766){
            biggest193766=ends[45];
          }
          if(biggest193766 == 1){
            active[39]=1;
            ends[39]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_39.setClear();//sysj\conveyor_plant.sysj line: 203, column: 7
          capPos_39.setClear();//sysj\conveyor_plant.sysj line: 204, column: 7
          thread193767(tdone,ends);
          thread193768(tdone,ends);
          thread193769(tdone,ends);
          thread193770(tdone,ends);
          thread193771(tdone,ends);
          thread193772(tdone,ends);
          int biggest193780 = 0;
          if(ends[40]>=biggest193780){
            biggest193780=ends[40];
          }
          if(ends[41]>=biggest193780){
            biggest193780=ends[41];
          }
          if(ends[42]>=biggest193780){
            biggest193780=ends[42];
          }
          if(ends[43]>=biggest193780){
            biggest193780=ends[43];
          }
          if(ends[44]>=biggest193780){
            biggest193780=ends[44];
          }
          if(ends[45]>=biggest193780){
            biggest193780=ends[45];
          }
          if(biggest193780 == 1){
            active[39]=1;
            ends[39]=1;
            break RUN;
          }
          //FINXME code
          if(biggest193780 == 0){
            S193655=0;
            active[39]=0;
            ends[39]=0;
            S193655=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_39 = new Signal();
    capPos_39 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[39] != 0){
      int index = 39;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[39]!=0 || suspended[39]!=0 || active[39]!=1);
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
      capDec_39.setpreclear();
      capPos_39.setpreclear();
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
      capDec_39.setClear();
      capPos_39.setClear();
      if(paused[39]!=0 || suspended[39]!=0 || active[39]!=1);
      else{
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        enable.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[39] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
