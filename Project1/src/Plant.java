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
  private int S49347 = 1;
  private int S48738 = 1;
  private int S48692 = 1;
  private int S48791 = 1;
  private int S48745 = 1;
  private int S48835 = 1;
  private int S48805 = 1;
  private int S48903 = 1;
  private int S48857 = 1;
  private int S48839 = 1;
  private int S48965 = 1;
  private int S49015 = 1;
  private int S48973 = 1;
  private int S48981 = 1;
  private int S48989 = 1;
  private int S48997 = 1;
  private int S49005 = 1;
  private int S49013 = 1;
  
  private int[] ends = new int[49];
  private int[] tdone = new int[49];
  
  public void thread49457(int [] tdone, int [] ends){
        switch(S49013){
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

  public void thread49456(int [] tdone, int [] ends){
        switch(S49005){
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

  public void thread49455(int [] tdone, int [] ends){
        switch(S48997){
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

  public void thread49454(int [] tdone, int [] ends){
        switch(S48989){
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

  public void thread49453(int [] tdone, int [] ends){
        switch(S48981){
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

  public void thread49452(int [] tdone, int [] ends){
        switch(S48973){
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

  public void thread49451(int [] tdone, int [] ends){
        switch(S49015){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        thread49452(tdone,ends);
        thread49453(tdone,ends);
        thread49454(tdone,ends);
        thread49455(tdone,ends);
        thread49456(tdone,ends);
        thread49457(tdone,ends);
        int biggest49458 = 0;
        if(ends[43]>=biggest49458){
          biggest49458=ends[43];
        }
        if(ends[44]>=biggest49458){
          biggest49458=ends[44];
        }
        if(ends[45]>=biggest49458){
          biggest49458=ends[45];
        }
        if(ends[46]>=biggest49458){
          biggest49458=ends[46];
        }
        if(ends[47]>=biggest49458){
          biggest49458=ends[47];
        }
        if(ends[48]>=biggest49458){
          biggest49458=ends[48];
        }
        if(biggest49458 == 1){
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        //FINXME code
        if(biggest49458 == 0){
          S49015=0;
          active[42]=0;
          ends[42]=0;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread49450(int [] tdone, int [] ends){
        switch(S48965){
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

  public void thread49449(int [] tdone, int [] ends){
        switch(S48903){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        switch(S48857){
          case 0 : 
            if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 258, column: 15
              S48857=1;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            else {
              switch(S48839){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 260, column: 18
                    S48839=1;
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
                    S48839=2;
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
                    S48839=0;
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
              S48857=0;
              S48839=0;
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

  public void thread49448(int [] tdone, int [] ends){
        switch(S48835){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S48805){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\conveyor_plant.sysj line: 238, column: 17
              if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 241, column: 19
                capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 242, column: 12
                currsigs.addElement(capPos_36);
                capPos_36.setValue(1);//sysj\conveyor_plant.sysj line: 242, column: 12
                S48805=1;
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
              else {
                S48805=1;
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
            S48805=1;
            S48805=0;
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
                S48805=1;
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
            }
            else {
              S48805=1;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread49447(int [] tdone, int [] ends){
        switch(S48791){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S48745){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 222, column: 15
              S48745=1;
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
              S48745=2;
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
              S48745=3;
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
              S48745=0;
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

  public void thread49446(int [] tdone, int [] ends){
        switch(S48738){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S48692){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 209, column: 15
              S48692=1;
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
              S48692=2;
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
              S48692=3;
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
              S48692=0;
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

  public void thread49443(int [] tdone, int [] ends){
        S49013=1;
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

  public void thread49442(int [] tdone, int [] ends){
        S49005=1;
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

  public void thread49441(int [] tdone, int [] ends){
        S48997=1;
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

  public void thread49440(int [] tdone, int [] ends){
        S48989=1;
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

  public void thread49439(int [] tdone, int [] ends){
        S48981=1;
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

  public void thread49438(int [] tdone, int [] ends){
        S48973=1;
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

  public void thread49437(int [] tdone, int [] ends){
        S49015=1;
    thread49438(tdone,ends);
    thread49439(tdone,ends);
    thread49440(tdone,ends);
    thread49441(tdone,ends);
    thread49442(tdone,ends);
    thread49443(tdone,ends);
    int biggest49444 = 0;
    if(ends[43]>=biggest49444){
      biggest49444=ends[43];
    }
    if(ends[44]>=biggest49444){
      biggest49444=ends[44];
    }
    if(ends[45]>=biggest49444){
      biggest49444=ends[45];
    }
    if(ends[46]>=biggest49444){
      biggest49444=ends[46];
    }
    if(ends[47]>=biggest49444){
      biggest49444=ends[47];
    }
    if(ends[48]>=biggest49444){
      biggest49444=ends[48];
    }
    if(biggest49444 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread49436(int [] tdone, int [] ends){
        S48965=1;
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

  public void thread49435(int [] tdone, int [] ends){
        S48903=1;
    S48857=0;
    S48839=0;
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread49434(int [] tdone, int [] ends){
        S48835=1;
    S48805=0;
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
        S48805=1;
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
    else {
      S48805=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread49433(int [] tdone, int [] ends){
        S48791=1;
    S48745=0;
    pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 223, column: 10
    currsigs.addElement(pusherRetracted);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread49432(int [] tdone, int [] ends){
        S48738=1;
    S48692=0;
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
      switch(S49347){
        case 0 : 
          S49347=0;
          break RUN;
        
        case 1 : 
          S49347=2;
          S49347=2;
          capDec_36.setClear();//sysj\conveyor_plant.sysj line: 204, column: 7
          capPos_36.setClear();//sysj\conveyor_plant.sysj line: 205, column: 7
          capPos_36.setPresent();//sysj\conveyor_plant.sysj line: 206, column: 7
          currsigs.addElement(capPos_36);
          capPos_36.setValue(0);//sysj\conveyor_plant.sysj line: 206, column: 7
          thread49432(tdone,ends);
          thread49433(tdone,ends);
          thread49434(tdone,ends);
          thread49435(tdone,ends);
          thread49436(tdone,ends);
          thread49437(tdone,ends);
          int biggest49445 = 0;
          if(ends[37]>=biggest49445){
            biggest49445=ends[37];
          }
          if(ends[38]>=biggest49445){
            biggest49445=ends[38];
          }
          if(ends[39]>=biggest49445){
            biggest49445=ends[39];
          }
          if(ends[40]>=biggest49445){
            biggest49445=ends[40];
          }
          if(ends[41]>=biggest49445){
            biggest49445=ends[41];
          }
          if(ends[42]>=biggest49445){
            biggest49445=ends[42];
          }
          if(biggest49445 == 1){
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_36.setClear();//sysj\conveyor_plant.sysj line: 204, column: 7
          capPos_36.setClear();//sysj\conveyor_plant.sysj line: 205, column: 7
          thread49446(tdone,ends);
          thread49447(tdone,ends);
          thread49448(tdone,ends);
          thread49449(tdone,ends);
          thread49450(tdone,ends);
          thread49451(tdone,ends);
          int biggest49459 = 0;
          if(ends[37]>=biggest49459){
            biggest49459=ends[37];
          }
          if(ends[38]>=biggest49459){
            biggest49459=ends[38];
          }
          if(ends[39]>=biggest49459){
            biggest49459=ends[39];
          }
          if(ends[40]>=biggest49459){
            biggest49459=ends[40];
          }
          if(ends[41]>=biggest49459){
            biggest49459=ends[41];
          }
          if(ends[42]>=biggest49459){
            biggest49459=ends[42];
          }
          if(biggest49459 == 1){
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
          //FINXME code
          if(biggest49459 == 0){
            S49347=0;
            active[36]=0;
            ends[36]=0;
            S49347=0;
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
