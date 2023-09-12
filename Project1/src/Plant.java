import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\conveyor_plant.sysj line: 1, column: 1

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
  private int capcount_thread_41;//sysj\conveyor_plant.sysj line: 274, column: 8
  private int S214558 = 1;
  private int S213949 = 1;
  private int S213903 = 1;
  private int S214002 = 1;
  private int S213956 = 1;
  private int S214046 = 1;
  private int S214016 = 1;
  private int S214114 = 1;
  private int S214068 = 1;
  private int S214050 = 1;
  private int S214176 = 1;
  private int S214226 = 1;
  private int S214184 = 1;
  private int S214192 = 1;
  private int S214200 = 1;
  private int S214208 = 1;
  private int S214216 = 1;
  private int S214224 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread214668(int [] tdone, int [] ends){
        switch(S214224){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 302, column: 29
          emptyE.setPresent();//sysj\conveyor_plant.sysj line: 302, column: 36
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

  public void thread214667(int [] tdone, int [] ends){
        switch(S214216){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\conveyor_plant.sysj line: 300, column: 29
          armAtDestE.setPresent();//sysj\conveyor_plant.sysj line: 300, column: 40
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

  public void thread214666(int [] tdone, int [] ends){
        switch(S214208){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 298, column: 29
          armAtSourceE.setPresent();//sysj\conveyor_plant.sysj line: 298, column: 42
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

  public void thread214665(int [] tdone, int [] ends){
        switch(S214200){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\conveyor_plant.sysj line: 296, column: 29
          WPgrippedE.setPresent();//sysj\conveyor_plant.sysj line: 296, column: 40
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

  public void thread214664(int [] tdone, int [] ends){
        switch(S214192){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 294, column: 29
          pusherExtendedE.setPresent();//sysj\conveyor_plant.sysj line: 294, column: 45
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

  public void thread214663(int [] tdone, int [] ends){
        switch(S214184){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 292, column: 29
          pusherRetractedE.setPresent();//sysj\conveyor_plant.sysj line: 292, column: 46
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

  public void thread214662(int [] tdone, int [] ends){
        switch(S214226){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        thread214663(tdone,ends);
        thread214664(tdone,ends);
        thread214665(tdone,ends);
        thread214666(tdone,ends);
        thread214667(tdone,ends);
        thread214668(tdone,ends);
        int biggest214669 = 0;
        if(ends[43]>=biggest214669){
          biggest214669=ends[43];
        }
        if(ends[44]>=biggest214669){
          biggest214669=ends[44];
        }
        if(ends[45]>=biggest214669){
          biggest214669=ends[45];
        }
        if(ends[46]>=biggest214669){
          biggest214669=ends[46];
        }
        if(ends[47]>=biggest214669){
          biggest214669=ends[47];
        }
        if(ends[48]>=biggest214669){
          biggest214669=ends[48];
        }
        if(biggest214669 == 1){
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        //FINXME code
        if(biggest214669 == 0){
          S214226=0;
          active[42]=0;
          ends[42]=0;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread214661(int [] tdone, int [] ends){
        switch(S214176){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(capDec_36.getprestatus()){//sysj\conveyor_plant.sysj line: 276, column: 17
          if(capcount_thread_41 > 0) {//sysj\conveyor_plant.sysj line: 277, column: 10
            capcount_thread_41 = capcount_thread_41 - 1;//sysj\conveyor_plant.sysj line: 278, column: 11
          }
          if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 280, column: 17
            capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 281, column: 10
            if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 284, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 285, column: 11
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
            if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 284, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 285, column: 11
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
          if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 280, column: 17
            capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 281, column: 10
            if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 284, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 285, column: 11
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
            if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 284, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 285, column: 11
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

  public void thread214660(int [] tdone, int [] ends){
        switch(S214114){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        switch(S214068){
          case 0 : 
            if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 259, column: 15
              S214068=1;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            else {
              switch(S214050){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 261, column: 18
                    S214050=1;
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
                  if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 262, column: 18
                    capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 264, column: 12
                    currsigs.addElement(capPos_36);
                    capPos_36.setValue(1);//sysj\conveyor_plant.sysj line: 264, column: 12
                    S214050=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 265, column: 18
                    capDec_36.setPresent();//sysj\conveyor_plant.sysj line: 266, column: 12
                    currsigs.addElement(capDec_36);
                    S214050=0;
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
            if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 269, column: 15
              S214068=0;
              S214050=0;
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

  public void thread214659(int [] tdone, int [] ends){
        switch(S214046){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S214016){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\conveyor_plant.sysj line: 239, column: 17
              if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 242, column: 19
                capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 243, column: 12
                currsigs.addElement(capPos_36);
                capPos_36.setValue(1);//sysj\conveyor_plant.sysj line: 243, column: 12
                S214016=1;
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
              else {
                S214016=1;
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 240, column: 12
              currsigs.addElement(WPgripped);
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
          case 1 : 
            S214016=1;
            S214016=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 236, column: 17
              if((Integer)(capPos_36.getpreval() == null ? 0 : ((Integer)capPos_36.getpreval()).intValue()) == 1){//sysj\conveyor_plant.sysj line: 237, column: 13
                capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 238, column: 11
                currsigs.addElement(capPos_36);
                capPos_36.setValue(0);//sysj\conveyor_plant.sysj line: 238, column: 11
                WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 240, column: 12
                currsigs.addElement(WPgripped);
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
              else {
                S214016=1;
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
            }
            else {
              S214016=1;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread214658(int [] tdone, int [] ends){
        switch(S214002){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S213956){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 223, column: 15
              S213956=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 224, column: 10
              currsigs.addElement(pusherRetracted);
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 226, column: 15
              S213956=2;
              pusherExtended.setPresent();//sysj\conveyor_plant.sysj line: 228, column: 10
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
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 227, column: 15
              S213956=3;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\conveyor_plant.sysj line: 228, column: 10
              currsigs.addElement(pusherExtended);
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 230, column: 15
              S213956=0;
              pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 224, column: 10
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

  public void thread214657(int [] tdone, int [] ends){
        switch(S213949){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S213903){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 210, column: 15
              S213903=1;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 211, column: 10
              currsigs.addElement(armAtDest);
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 213, column: 15
              S213903=2;
              armAtSource.setPresent();//sysj\conveyor_plant.sysj line: 215, column: 10
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
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 214, column: 15
              S213903=3;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              armAtSource.setPresent();//sysj\conveyor_plant.sysj line: 215, column: 10
              currsigs.addElement(armAtSource);
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 217, column: 15
              S213903=0;
              armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 211, column: 10
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

  public void thread214654(int [] tdone, int [] ends){
        S214224=1;
    if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 302, column: 29
      emptyE.setPresent();//sysj\conveyor_plant.sysj line: 302, column: 36
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

  public void thread214653(int [] tdone, int [] ends){
        S214216=1;
    if(armAtDest.getprestatus()){//sysj\conveyor_plant.sysj line: 300, column: 29
      armAtDestE.setPresent();//sysj\conveyor_plant.sysj line: 300, column: 40
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

  public void thread214652(int [] tdone, int [] ends){
        S214208=1;
    if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 298, column: 29
      armAtSourceE.setPresent();//sysj\conveyor_plant.sysj line: 298, column: 42
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

  public void thread214651(int [] tdone, int [] ends){
        S214200=1;
    if(WPgripped.getprestatus()){//sysj\conveyor_plant.sysj line: 296, column: 29
      WPgrippedE.setPresent();//sysj\conveyor_plant.sysj line: 296, column: 40
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

  public void thread214650(int [] tdone, int [] ends){
        S214192=1;
    if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 294, column: 29
      pusherExtendedE.setPresent();//sysj\conveyor_plant.sysj line: 294, column: 45
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

  public void thread214649(int [] tdone, int [] ends){
        S214184=1;
    if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 292, column: 29
      pusherRetractedE.setPresent();//sysj\conveyor_plant.sysj line: 292, column: 46
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

  public void thread214648(int [] tdone, int [] ends){
        S214226=1;
    thread214649(tdone,ends);
    thread214650(tdone,ends);
    thread214651(tdone,ends);
    thread214652(tdone,ends);
    thread214653(tdone,ends);
    thread214654(tdone,ends);
    int biggest214655 = 0;
    if(ends[43]>=biggest214655){
      biggest214655=ends[43];
    }
    if(ends[44]>=biggest214655){
      biggest214655=ends[44];
    }
    if(ends[45]>=biggest214655){
      biggest214655=ends[45];
    }
    if(ends[46]>=biggest214655){
      biggest214655=ends[46];
    }
    if(ends[47]>=biggest214655){
      biggest214655=ends[47];
    }
    if(ends[48]>=biggest214655){
      biggest214655=ends[48];
    }
    if(biggest214655 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread214647(int [] tdone, int [] ends){
        S214176=1;
    capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 274, column: 8
    if(capDec_36.getprestatus()){//sysj\conveyor_plant.sysj line: 276, column: 17
      if(capcount_thread_41 > 0) {//sysj\conveyor_plant.sysj line: 277, column: 10
        capcount_thread_41 = capcount_thread_41 - 1;//sysj\conveyor_plant.sysj line: 278, column: 11
      }
      if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 280, column: 17
        capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 281, column: 10
        if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 284, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 285, column: 11
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
        if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 284, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 285, column: 11
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
      if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 280, column: 17
        capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 281, column: 10
        if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 284, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 285, column: 11
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
        if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 284, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 285, column: 11
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

  public void thread214646(int [] tdone, int [] ends){
        S214114=1;
    S214068=0;
    S214050=0;
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread214645(int [] tdone, int [] ends){
        S214046=1;
    S214016=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 236, column: 17
      if((Integer)(capPos_36.getpreval() == null ? 0 : ((Integer)capPos_36.getpreval()).intValue()) == 1){//sysj\conveyor_plant.sysj line: 237, column: 13
        capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 238, column: 11
        currsigs.addElement(capPos_36);
        capPos_36.setValue(0);//sysj\conveyor_plant.sysj line: 238, column: 11
        WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 240, column: 12
        currsigs.addElement(WPgripped);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
      else {
        S214016=1;
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
    else {
      S214016=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread214644(int [] tdone, int [] ends){
        S214002=1;
    S213956=0;
    pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 224, column: 10
    currsigs.addElement(pusherRetracted);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread214643(int [] tdone, int [] ends){
        S213949=1;
    S213903=0;
    armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 211, column: 10
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
      switch(S214558){
        case 0 : 
          S214558=0;
          break RUN;
        
        case 1 : 
          S214558=2;
          S214558=2;
          capDec_36.setClear();//sysj\conveyor_plant.sysj line: 205, column: 7
          capPos_36.setClear();//sysj\conveyor_plant.sysj line: 206, column: 7
          capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 207, column: 7
          currsigs.addElement(capPos_36);
          capPos_36.setValue(0);//sysj\conveyor_plant.sysj line: 207, column: 7
          thread214643(tdone,ends);
          thread214644(tdone,ends);
          thread214645(tdone,ends);
          thread214646(tdone,ends);
          thread214647(tdone,ends);
          thread214648(tdone,ends);
          int biggest214656 = 0;
          if(ends[37]>=biggest214656){
            biggest214656=ends[37];
          }
          if(ends[38]>=biggest214656){
            biggest214656=ends[38];
          }
          if(ends[39]>=biggest214656){
            biggest214656=ends[39];
          }
          if(ends[40]>=biggest214656){
            biggest214656=ends[40];
          }
          if(ends[41]>=biggest214656){
            biggest214656=ends[41];
          }
          if(ends[42]>=biggest214656){
            biggest214656=ends[42];
          }
          if(biggest214656 == 1){
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_36.setClear();//sysj\conveyor_plant.sysj line: 205, column: 7
          capPos_36.setClear();//sysj\conveyor_plant.sysj line: 206, column: 7
          thread214657(tdone,ends);
          thread214658(tdone,ends);
          thread214659(tdone,ends);
          thread214660(tdone,ends);
          thread214661(tdone,ends);
          thread214662(tdone,ends);
          int biggest214670 = 0;
          if(ends[37]>=biggest214670){
            biggest214670=ends[37];
          }
          if(ends[38]>=biggest214670){
            biggest214670=ends[38];
          }
          if(ends[39]>=biggest214670){
            biggest214670=ends[39];
          }
          if(ends[40]>=biggest214670){
            biggest214670=ends[40];
          }
          if(ends[41]>=biggest214670){
            biggest214670=ends[41];
          }
          if(ends[42]>=biggest214670){
            biggest214670=ends[42];
          }
          if(biggest214670 == 1){
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
          //FINXME code
          if(biggest214670 == 0){
            S214558=0;
            active[36]=0;
            ends[36]=0;
            S214558=0;
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
