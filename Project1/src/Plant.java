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
  private int S203433 = 1;
  private int S202824 = 1;
  private int S202778 = 1;
  private int S202877 = 1;
  private int S202831 = 1;
  private int S202921 = 1;
  private int S202891 = 1;
  private int S202989 = 1;
  private int S202943 = 1;
  private int S202925 = 1;
  private int S203051 = 1;
  private int S203101 = 1;
  private int S203059 = 1;
  private int S203067 = 1;
  private int S203075 = 1;
  private int S203083 = 1;
  private int S203091 = 1;
  private int S203099 = 1;
  
  private int[] ends = new int[52];
  private int[] tdone = new int[52];
  
  public void thread203556(int [] tdone, int [] ends){
        switch(S203099){
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

  public void thread203555(int [] tdone, int [] ends){
        switch(S203091){
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

  public void thread203554(int [] tdone, int [] ends){
        switch(S203083){
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

  public void thread203553(int [] tdone, int [] ends){
        switch(S203075){
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

  public void thread203552(int [] tdone, int [] ends){
        switch(S203067){
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

  public void thread203551(int [] tdone, int [] ends){
        switch(S203059){
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

  public void thread203550(int [] tdone, int [] ends){
        switch(S203101){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        thread203551(tdone,ends);
        thread203552(tdone,ends);
        thread203553(tdone,ends);
        thread203554(tdone,ends);
        thread203555(tdone,ends);
        thread203556(tdone,ends);
        int biggest203557 = 0;
        if(ends[46]>=biggest203557){
          biggest203557=ends[46];
        }
        if(ends[47]>=biggest203557){
          biggest203557=ends[47];
        }
        if(ends[48]>=biggest203557){
          biggest203557=ends[48];
        }
        if(ends[49]>=biggest203557){
          biggest203557=ends[49];
        }
        if(ends[50]>=biggest203557){
          biggest203557=ends[50];
        }
        if(ends[51]>=biggest203557){
          biggest203557=ends[51];
        }
        if(biggest203557 == 1){
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        //FINXME code
        if(biggest203557 == 0){
          S203101=0;
          active[45]=0;
          ends[45]=0;
          tdone[45]=1;
        }
        break;
      
    }
  }

  public void thread203549(int [] tdone, int [] ends){
        switch(S203051){
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

  public void thread203548(int [] tdone, int [] ends){
        switch(S202989){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        switch(S202943){
          case 0 : 
            if(empty.getprestatus()){//sysj\conveyor_plant.sysj line: 257, column: 15
              S202943=1;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            else {
              switch(S202925){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\conveyor_plant.sysj line: 259, column: 18
                    S202925=1;
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
                    S202925=2;
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
                    S202925=0;
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
              S202943=0;
              S202925=0;
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

  public void thread203547(int [] tdone, int [] ends){
        switch(S202921){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S202891){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\conveyor_plant.sysj line: 237, column: 17
              if(armAtSource.getprestatus()){//sysj\conveyor_plant.sysj line: 240, column: 19
                capPos_39.setPresent();//sysj\conveyor_plant.sysj line: 241, column: 12
                currsigs.addElement(capPos_39);
                capPos_39.setValue(1);//sysj\conveyor_plant.sysj line: 241, column: 12
                S202891=1;
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
              else {
                S202891=1;
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
            S202891=1;
            S202891=0;
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
                S202891=1;
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
            }
            else {
              S202891=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread203546(int [] tdone, int [] ends){
        switch(S202877){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        switch(S202831){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 221, column: 15
              S202831=1;
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
              S202831=2;
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
              S202831=3;
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
              S202831=0;
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

  public void thread203545(int [] tdone, int [] ends){
        switch(S202824){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        switch(S202778){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\conveyor_plant.sysj line: 208, column: 15
              S202778=1;
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
              S202778=2;
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
              S202778=3;
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
              S202778=0;
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

  public void thread203542(int [] tdone, int [] ends){
        S203099=1;
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

  public void thread203541(int [] tdone, int [] ends){
        S203091=1;
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

  public void thread203540(int [] tdone, int [] ends){
        S203083=1;
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

  public void thread203539(int [] tdone, int [] ends){
        S203075=1;
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

  public void thread203538(int [] tdone, int [] ends){
        S203067=1;
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

  public void thread203537(int [] tdone, int [] ends){
        S203059=1;
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

  public void thread203536(int [] tdone, int [] ends){
        S203101=1;
    thread203537(tdone,ends);
    thread203538(tdone,ends);
    thread203539(tdone,ends);
    thread203540(tdone,ends);
    thread203541(tdone,ends);
    thread203542(tdone,ends);
    int biggest203543 = 0;
    if(ends[46]>=biggest203543){
      biggest203543=ends[46];
    }
    if(ends[47]>=biggest203543){
      biggest203543=ends[47];
    }
    if(ends[48]>=biggest203543){
      biggest203543=ends[48];
    }
    if(ends[49]>=biggest203543){
      biggest203543=ends[49];
    }
    if(ends[50]>=biggest203543){
      biggest203543=ends[50];
    }
    if(ends[51]>=biggest203543){
      biggest203543=ends[51];
    }
    if(biggest203543 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread203535(int [] tdone, int [] ends){
        S203051=1;
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

  public void thread203534(int [] tdone, int [] ends){
        S202989=1;
    S202943=0;
    S202925=0;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread203533(int [] tdone, int [] ends){
        S202921=1;
    S202891=0;
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
        S202891=1;
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S202891=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread203532(int [] tdone, int [] ends){
        S202877=1;
    S202831=0;
    pusherRetracted.setPresent();//sysj\conveyor_plant.sysj line: 222, column: 10
    currsigs.addElement(pusherRetracted);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread203531(int [] tdone, int [] ends){
        S202824=1;
    S202778=0;
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
      switch(S203433){
        case 0 : 
          S203433=0;
          break RUN;
        
        case 1 : 
          S203433=2;
          S203433=2;
          capDec_39.setClear();//sysj\conveyor_plant.sysj line: 203, column: 7
          capPos_39.setClear();//sysj\conveyor_plant.sysj line: 204, column: 7
          capPos_39.setPresent();//sysj\conveyor_plant.sysj line: 205, column: 7
          currsigs.addElement(capPos_39);
          capPos_39.setValue(0);//sysj\conveyor_plant.sysj line: 205, column: 7
          thread203531(tdone,ends);
          thread203532(tdone,ends);
          thread203533(tdone,ends);
          thread203534(tdone,ends);
          thread203535(tdone,ends);
          thread203536(tdone,ends);
          int biggest203544 = 0;
          if(ends[40]>=biggest203544){
            biggest203544=ends[40];
          }
          if(ends[41]>=biggest203544){
            biggest203544=ends[41];
          }
          if(ends[42]>=biggest203544){
            biggest203544=ends[42];
          }
          if(ends[43]>=biggest203544){
            biggest203544=ends[43];
          }
          if(ends[44]>=biggest203544){
            biggest203544=ends[44];
          }
          if(ends[45]>=biggest203544){
            biggest203544=ends[45];
          }
          if(biggest203544 == 1){
            active[39]=1;
            ends[39]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_39.setClear();//sysj\conveyor_plant.sysj line: 203, column: 7
          capPos_39.setClear();//sysj\conveyor_plant.sysj line: 204, column: 7
          thread203545(tdone,ends);
          thread203546(tdone,ends);
          thread203547(tdone,ends);
          thread203548(tdone,ends);
          thread203549(tdone,ends);
          thread203550(tdone,ends);
          int biggest203558 = 0;
          if(ends[40]>=biggest203558){
            biggest203558=ends[40];
          }
          if(ends[41]>=biggest203558){
            biggest203558=ends[41];
          }
          if(ends[42]>=biggest203558){
            biggest203558=ends[42];
          }
          if(ends[43]>=biggest203558){
            biggest203558=ends[43];
          }
          if(ends[44]>=biggest203558){
            biggest203558=ends[44];
          }
          if(ends[45]>=biggest203558){
            biggest203558=ends[45];
          }
          if(biggest203558 == 1){
            active[39]=1;
            ends[39]=1;
            break RUN;
          }
          //FINXME code
          if(biggest203558 == 0){
            S203433=0;
            active[39]=0;
            ends[39]=0;
            S203433=0;
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
