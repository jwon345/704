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
  private int capcount_thread_41;//sysj\conveyor_plant.sysj line: 273, column: 8
  private int S97495 = 1;
  private int S96886 = 1;
  private int S96840 = 1;
  private int S96939 = 1;
  private int S96893 = 1;
  private int S96983 = 1;
  private int S96953 = 1;
  private int S97051 = 1;
  private int S97005 = 1;
  private int S96987 = 1;
  private int S97113 = 1;
  private int S97163 = 1;
  private int S97121 = 1;
  private int S97129 = 1;
  private int S97137 = 1;
  private int S97145 = 1;
  private int S97153 = 1;
  private int S97161 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread97605(int [] tdone, int [] ends){
        switch(S97161){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 301, column: 29
          emptyE.setPresent();//sysj\conveyor_plant.sysj line: 301, column: 36
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

  public void thread97604(int [] tdone, int [] ends){
        switch(S97153){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\conveyor_plant.sysj line: 299, column: 29
          armAtDestE.setPresent();//sysj\conveyor_plant.sysj line: 299, column: 40
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

  public void thread97603(int [] tdone, int [] ends){
        switch(S97145){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 297, column: 29
          armAtSourceE.setPresent();//sysj\conveyor_plant.sysj line: 297, column: 42
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

  public void thread97602(int [] tdone, int [] ends){
        switch(S97137){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\conveyor_plant.sysj line: 295, column: 29
          WPgrippedE.setPresent();//sysj\conveyor_plant.sysj line: 295, column: 40
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

  public void thread97601(int [] tdone, int [] ends){
        switch(S97129){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 293, column: 29
          pusherExtendedE.setPresent();//sysj\conveyor_plant.sysj line: 293, column: 45
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

  public void thread97600(int [] tdone, int [] ends){
        switch(S97121){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 291, column: 29
          pusherRetractedE.setPresent();//sysj\conveyor_plant.sysj line: 291, column: 46
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

  public void thread97599(int [] tdone, int [] ends){
        switch(S97163){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        thread97600(tdone,ends);
        thread97601(tdone,ends);
        thread97602(tdone,ends);
        thread97603(tdone,ends);
        thread97604(tdone,ends);
        thread97605(tdone,ends);
        int biggest97606 = 0;
        if(ends[43]>=biggest97606){
          biggest97606=ends[43];
        }
        if(ends[44]>=biggest97606){
          biggest97606=ends[44];
        }
        if(ends[45]>=biggest97606){
          biggest97606=ends[45];
        }
        if(ends[46]>=biggest97606){
          biggest97606=ends[46];
        }
        if(ends[47]>=biggest97606){
          biggest97606=ends[47];
        }
        if(ends[48]>=biggest97606){
          biggest97606=ends[48];
        }
        if(biggest97606 == 1){
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        //FINXME code
        if(biggest97606 == 0){
          S97163=0;
          active[42]=0;
          ends[42]=0;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread97598(int [] tdone, int [] ends){
        switch(S97113){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(capDec_36.getprestatus()){//sysj\conveyor_plant.sysj line: 275, column: 17
          if(capcount_thread_41 > 0) {//sysj\conveyor_plant.sysj line: 276, column: 10
            capcount_thread_41 = capcount_thread_41 - 1;//sysj\conveyor_plant.sysj line: 277, column: 11
          }
          if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 279, column: 17
            capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 280, column: 10
            if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 283, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 284, column: 11
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
            if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 283, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 284, column: 11
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
          if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 279, column: 17
            capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 280, column: 10
            if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 283, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 284, column: 11
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
            if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 283, column: 13
              empty.setPresent();//sysj\conveyor_plant.sysj line: 284, column: 11
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

  public void thread97597(int [] tdone, int [] ends){
        switch(S97051){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        switch(S97005){
          case 0 : 
            if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 258, column: 15
              S97005=1;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            else {
              switch(S96987){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 260, column: 18
                    S96987=1;
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
                  if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 261, column: 18
                    capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 263, column: 12
                    currsigs.addElement(capPos_36);
                    capPos_36.setValue(1);//sysj\conveyor_plant.sysj line: 263, column: 12
                    S96987=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 264, column: 18
                    capDec_36.setPresent();//sysj\conveyor_plant.sysj line: 265, column: 12
                    currsigs.addElement(capDec_36);
                    S96987=0;
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
            if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 268, column: 15
              S97005=0;
              S96987=0;
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

  public void thread97596(int [] tdone, int [] ends){
        switch(S96983){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S96953){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\conveyor_plant.sysj line: 238, column: 17
              if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 241, column: 19
                capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 242, column: 12
                currsigs.addElement(capPos_36);
                capPos_36.setValue(1);//sysj\conveyor_plant.sysj line: 242, column: 12
                S96953=1;
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
              else {
                S96953=1;
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 239, column: 12
              currsigs.addElement(WPgripped);
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
          case 1 : 
            S96953=1;
            S96953=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 235, column: 17
              if((Integer)(capPos_36.getpreval() == null ? 0 : ((Integer)capPos_36.getpreval()).intValue()) == 1){//sysj\conveyor_plant.sysj line: 236, column: 13
                capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 237, column: 11
                currsigs.addElement(capPos_36);
                capPos_36.setValue(0);//sysj\conveyor_plant.sysj line: 237, column: 11
                WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 239, column: 12
                currsigs.addElement(WPgripped);
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
              else {
                S96953=1;
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
            }
            else {
              S96953=1;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread97595(int [] tdone, int [] ends){
        switch(S96939){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S96893){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 222, column: 15
              S96893=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 223, column: 10
              currsigs.addElement(pusherRetracted);
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 225, column: 15
              S96893=2;
              pusherExtended.setPresent();//sysj\conveyor_plant.sysj line: 227, column: 10
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
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 226, column: 15
              S96893=3;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\conveyor_plant.sysj line: 227, column: 10
              currsigs.addElement(pusherExtended);
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 229, column: 15
              S96893=0;
              pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 223, column: 10
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

  public void thread97594(int [] tdone, int [] ends){
        switch(S96886){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S96840){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 209, column: 15
              S96840=1;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 210, column: 10
              currsigs.addElement(armAtDest);
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 212, column: 15
              S96840=2;
              armAtSource.setPresent();//sysj\conveyor_plant.sysj line: 214, column: 10
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
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 213, column: 15
              S96840=3;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              armAtSource.setPresent();//sysj\conveyor_plant.sysj line: 214, column: 10
              currsigs.addElement(armAtSource);
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\conveyor_plant.sysj line: 216, column: 15
              S96840=0;
              armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 210, column: 10
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

  public void thread97591(int [] tdone, int [] ends){
        S97161=1;
    if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 301, column: 29
      emptyE.setPresent();//sysj\conveyor_plant.sysj line: 301, column: 36
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

  public void thread97590(int [] tdone, int [] ends){
        S97153=1;
    if(armAtDest.getprestatus()){//sysj\conveyor_plant.sysj line: 299, column: 29
      armAtDestE.setPresent();//sysj\conveyor_plant.sysj line: 299, column: 40
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

  public void thread97589(int [] tdone, int [] ends){
        S97145=1;
    if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 297, column: 29
      armAtSourceE.setPresent();//sysj\conveyor_plant.sysj line: 297, column: 42
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

  public void thread97588(int [] tdone, int [] ends){
        S97137=1;
    if(WPgripped.getprestatus()){//sysj\conveyor_plant.sysj line: 295, column: 29
      WPgrippedE.setPresent();//sysj\conveyor_plant.sysj line: 295, column: 40
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

  public void thread97587(int [] tdone, int [] ends){
        S97129=1;
    if(pusherExtended.getprestatus()){//sysj\conveyor_plant.sysj line: 293, column: 29
      pusherExtendedE.setPresent();//sysj\conveyor_plant.sysj line: 293, column: 45
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

  public void thread97586(int [] tdone, int [] ends){
        S97121=1;
    if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 291, column: 29
      pusherRetractedE.setPresent();//sysj\conveyor_plant.sysj line: 291, column: 46
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

  public void thread97585(int [] tdone, int [] ends){
        S97163=1;
    thread97586(tdone,ends);
    thread97587(tdone,ends);
    thread97588(tdone,ends);
    thread97589(tdone,ends);
    thread97590(tdone,ends);
    thread97591(tdone,ends);
    int biggest97592 = 0;
    if(ends[43]>=biggest97592){
      biggest97592=ends[43];
    }
    if(ends[44]>=biggest97592){
      biggest97592=ends[44];
    }
    if(ends[45]>=biggest97592){
      biggest97592=ends[45];
    }
    if(ends[46]>=biggest97592){
      biggest97592=ends[46];
    }
    if(ends[47]>=biggest97592){
      biggest97592=ends[47];
    }
    if(ends[48]>=biggest97592){
      biggest97592=ends[48];
    }
    if(biggest97592 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread97584(int [] tdone, int [] ends){
        S97113=1;
    capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 273, column: 8
    if(capDec_36.getprestatus()){//sysj\conveyor_plant.sysj line: 275, column: 17
      if(capcount_thread_41 > 0) {//sysj\conveyor_plant.sysj line: 276, column: 10
        capcount_thread_41 = capcount_thread_41 - 1;//sysj\conveyor_plant.sysj line: 277, column: 11
      }
      if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 279, column: 17
        capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 280, column: 10
        if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 283, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 284, column: 11
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
        if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 283, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 284, column: 11
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
      if(refill.getprestatus()){//sysj\conveyor_plant.sysj line: 279, column: 17
        capcount_thread_41 = 5;//sysj\conveyor_plant.sysj line: 280, column: 10
        if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 283, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 284, column: 11
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
        if(capcount_thread_41 == 0){//sysj\conveyor_plant.sysj line: 283, column: 13
          empty.setPresent();//sysj\conveyor_plant.sysj line: 284, column: 11
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

  public void thread97583(int [] tdone, int [] ends){
        S97051=1;
    S97005=0;
    S96987=0;
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread97582(int [] tdone, int [] ends){
        S96983=1;
    S96953=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 235, column: 17
      if((Integer)(capPos_36.getpreval() == null ? 0 : ((Integer)capPos_36.getpreval()).intValue()) == 1){//sysj\conveyor_plant.sysj line: 236, column: 13
        capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 237, column: 11
        currsigs.addElement(capPos_36);
        capPos_36.setValue(0);//sysj\conveyor_plant.sysj line: 237, column: 11
        WPgripped.setPresent();//sysj\conveyor_plant.sysj line: 239, column: 12
        currsigs.addElement(WPgripped);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
      else {
        S96953=1;
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
    else {
      S96953=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread97581(int [] tdone, int [] ends){
        S96939=1;
    S96893=0;
    pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 223, column: 10
    currsigs.addElement(pusherRetracted);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread97580(int [] tdone, int [] ends){
        S96886=1;
    S96840=0;
    armAtDest.setPresent();//sysj\conveyor_plant.sysj line: 210, column: 10
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
      switch(S97495){
        case 0 : 
          S97495=0;
          break RUN;
        
        case 1 : 
          S97495=2;
          S97495=2;
          capDec_36.setClear();//sysj\conveyor_plant.sysj line: 204, column: 7
          capPos_36.setClear();//sysj\conveyor_plant.sysj line: 205, column: 7
          capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 206, column: 7
          currsigs.addElement(capPos_36);
          capPos_36.setValue(0);//sysj\conveyor_plant.sysj line: 206, column: 7
          thread97580(tdone,ends);
          thread97581(tdone,ends);
          thread97582(tdone,ends);
          thread97583(tdone,ends);
          thread97584(tdone,ends);
          thread97585(tdone,ends);
          int biggest97593 = 0;
          if(ends[37]>=biggest97593){
            biggest97593=ends[37];
          }
          if(ends[38]>=biggest97593){
            biggest97593=ends[38];
          }
          if(ends[39]>=biggest97593){
            biggest97593=ends[39];
          }
          if(ends[40]>=biggest97593){
            biggest97593=ends[40];
          }
          if(ends[41]>=biggest97593){
            biggest97593=ends[41];
          }
          if(ends[42]>=biggest97593){
            biggest97593=ends[42];
          }
          if(biggest97593 == 1){
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_36.setClear();//sysj\conveyor_plant.sysj line: 204, column: 7
          capPos_36.setClear();//sysj\conveyor_plant.sysj line: 205, column: 7
          thread97594(tdone,ends);
          thread97595(tdone,ends);
          thread97596(tdone,ends);
          thread97597(tdone,ends);
          thread97598(tdone,ends);
          thread97599(tdone,ends);
          int biggest97607 = 0;
          if(ends[37]>=biggest97607){
            biggest97607=ends[37];
          }
          if(ends[38]>=biggest97607){
            biggest97607=ends[38];
          }
          if(ends[39]>=biggest97607){
            biggest97607=ends[39];
          }
          if(ends[40]>=biggest97607){
            biggest97607=ends[40];
          }
          if(ends[41]>=biggest97607){
            biggest97607=ends[41];
          }
          if(ends[42]>=biggest97607){
            biggest97607=ends[42];
          }
          if(biggest97607 == 1){
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
          //FINXME code
          if(biggest97607 == 0){
            S97495=0;
            active[36]=0;
            ends[36]=0;
            S97495=0;
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
