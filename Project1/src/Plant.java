import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1

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
  private Signal capDec_1;
  private Signal capPos_1;
  private int capcount_thread_6;//sysj\plant.sysj line: 82, column: 3
  private int S38276 = 1;
  private int S37003 = 1;
  private int S36957 = 1;
  private int S37056 = 1;
  private int S37010 = 1;
  private int S37100 = 1;
  private int S37070 = 1;
  private int S37065 = 1;
  private int S37168 = 1;
  private int S37122 = 1;
  private int S37104 = 1;
  private int S37230 = 1;
  private int S37280 = 1;
  private int S37238 = 1;
  private int S37246 = 1;
  private int S37254 = 1;
  private int S37262 = 1;
  private int S37270 = 1;
  private int S37278 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread38303(int [] tdone, int [] ends){
        switch(S37278){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\plant.sysj line: 110, column: 24
          emptyE.setPresent();//sysj\plant.sysj line: 110, column: 31
          currsigs.addElement(emptyE);
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

  public void thread38302(int [] tdone, int [] ends){
        switch(S37270){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\plant.sysj line: 108, column: 24
          armAtDestE.setPresent();//sysj\plant.sysj line: 108, column: 35
          currsigs.addElement(armAtDestE);
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

  public void thread38301(int [] tdone, int [] ends){
        switch(S37262){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\plant.sysj line: 106, column: 24
          armAtSourceE.setPresent();//sysj\plant.sysj line: 106, column: 37
          currsigs.addElement(armAtSourceE);
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

  public void thread38300(int [] tdone, int [] ends){
        switch(S37254){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\plant.sysj line: 104, column: 24
          WPgrippedE.setPresent();//sysj\plant.sysj line: 104, column: 35
          currsigs.addElement(WPgrippedE);
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

  public void thread38299(int [] tdone, int [] ends){
        switch(S37246){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 102, column: 24
          pusherExtendedE.setPresent();//sysj\plant.sysj line: 102, column: 40
          currsigs.addElement(pusherExtendedE);
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

  public void thread38298(int [] tdone, int [] ends){
        switch(S37238){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 100, column: 24
          pusherRetractedE.setPresent();//sysj\plant.sysj line: 100, column: 41
          currsigs.addElement(pusherRetractedE);
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

  public void thread38297(int [] tdone, int [] ends){
        switch(S37280){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread38298(tdone,ends);
        thread38299(tdone,ends);
        thread38300(tdone,ends);
        thread38301(tdone,ends);
        thread38302(tdone,ends);
        thread38303(tdone,ends);
        int biggest38304 = 0;
        if(ends[8]>=biggest38304){
          biggest38304=ends[8];
        }
        if(ends[9]>=biggest38304){
          biggest38304=ends[9];
        }
        if(ends[10]>=biggest38304){
          biggest38304=ends[10];
        }
        if(ends[11]>=biggest38304){
          biggest38304=ends[11];
        }
        if(ends[12]>=biggest38304){
          biggest38304=ends[12];
        }
        if(ends[13]>=biggest38304){
          biggest38304=ends[13];
        }
        if(biggest38304 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest38304 == 0){
          S37280=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread38296(int [] tdone, int [] ends){
        switch(S37230){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 84, column: 12
          if(capcount_thread_6 > 0) {//sysj\plant.sysj line: 85, column: 5
            capcount_thread_6 = capcount_thread_6 - 1;//sysj\plant.sysj line: 86, column: 6
          }
          if(refill.getprestatus()){//sysj\plant.sysj line: 88, column: 12
            capcount_thread_6 = 5;//sysj\plant.sysj line: 89, column: 5
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
              empty.setPresent();//sysj\plant.sysj line: 93, column: 6
              currsigs.addElement(empty);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
          }
          else {
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
              empty.setPresent();//sysj\plant.sysj line: 93, column: 6
              currsigs.addElement(empty);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
          }
        }
        else {
          if(refill.getprestatus()){//sysj\plant.sysj line: 88, column: 12
            capcount_thread_6 = 5;//sysj\plant.sysj line: 89, column: 5
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
              empty.setPresent();//sysj\plant.sysj line: 93, column: 6
              currsigs.addElement(empty);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
          }
          else {
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
              empty.setPresent();//sysj\plant.sysj line: 93, column: 6
              currsigs.addElement(empty);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread38295(int [] tdone, int [] ends){
        switch(S37168){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S37122){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 67, column: 10
              S37122=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S37104){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 69, column: 13
                    S37104=1;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  break;
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 70, column: 13
                    capPos_1.setPresent();//sysj\plant.sysj line: 72, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 72, column: 7
                    S37104=2;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  break;
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 73, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 74, column: 7
                    currsigs.addElement(capDec_1);
                    S37104=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plant.sysj line: 77, column: 10
              S37122=0;
              S37104=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38294(int [] tdone, int [] ends){
        switch(S37100){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S37070){
          case 0 : 
            switch(S37065){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\plant.sysj line: 47, column: 12
                  S37065=1;
                  if(armAtSource.getprestatus()){//sysj\plant.sysj line: 50, column: 14
                    capPos_1.setPresent();//sysj\plant.sysj line: 51, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 51, column: 7
                    S37070=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S37070=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\plant.sysj line: 48, column: 7
                  currsigs.addElement(WPgripped);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                S37070=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 44, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 45, column: 8
                    capPos_1.setPresent();//sysj\plant.sysj line: 46, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\plant.sysj line: 46, column: 6
                    S37065=0;
                    WPgripped.setPresent();//sysj\plant.sysj line: 48, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S37070=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S37070=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S37070=1;
            S37070=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 44, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 45, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 46, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 46, column: 6
                S37065=0;
                WPgripped.setPresent();//sysj\plant.sysj line: 48, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S37070=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S37070=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38293(int [] tdone, int [] ends){
        switch(S37056){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S37010){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 31, column: 10
              S37010=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 32, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 34, column: 10
              S37010=2;
              pusherExtended.setPresent();//sysj\plant.sysj line: 36, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 35, column: 10
              S37010=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 36, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 38, column: 10
              S37010=0;
              pusherRetracted.setPresent();//sysj\plant.sysj line: 32, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38292(int [] tdone, int [] ends){
        switch(S37003){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S36957){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 18, column: 10
              S36957=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 19, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 21, column: 10
              S36957=2;
              armAtSource.setPresent();//sysj\plant.sysj line: 23, column: 5
              currsigs.addElement(armAtSource);
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
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 22, column: 10
              S36957=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 23, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 25, column: 10
              S36957=0;
              armAtDest.setPresent();//sysj\plant.sysj line: 19, column: 5
              currsigs.addElement(armAtDest);
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
          
        }
        break;
      
    }
  }

  public void thread38289(int [] tdone, int [] ends){
        S37278=1;
    if(empty.getprestatus()){//sysj\plant.sysj line: 110, column: 24
      emptyE.setPresent();//sysj\plant.sysj line: 110, column: 31
      currsigs.addElement(emptyE);
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

  public void thread38288(int [] tdone, int [] ends){
        S37270=1;
    if(armAtDest.getprestatus()){//sysj\plant.sysj line: 108, column: 24
      armAtDestE.setPresent();//sysj\plant.sysj line: 108, column: 35
      currsigs.addElement(armAtDestE);
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

  public void thread38287(int [] tdone, int [] ends){
        S37262=1;
    if(armAtSource.getprestatus()){//sysj\plant.sysj line: 106, column: 24
      armAtSourceE.setPresent();//sysj\plant.sysj line: 106, column: 37
      currsigs.addElement(armAtSourceE);
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

  public void thread38286(int [] tdone, int [] ends){
        S37254=1;
    if(WPgripped.getprestatus()){//sysj\plant.sysj line: 104, column: 24
      WPgrippedE.setPresent();//sysj\plant.sysj line: 104, column: 35
      currsigs.addElement(WPgrippedE);
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

  public void thread38285(int [] tdone, int [] ends){
        S37246=1;
    if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 102, column: 24
      pusherExtendedE.setPresent();//sysj\plant.sysj line: 102, column: 40
      currsigs.addElement(pusherExtendedE);
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

  public void thread38284(int [] tdone, int [] ends){
        S37238=1;
    if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 100, column: 24
      pusherRetractedE.setPresent();//sysj\plant.sysj line: 100, column: 41
      currsigs.addElement(pusherRetractedE);
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

  public void thread38283(int [] tdone, int [] ends){
        S37280=1;
    thread38284(tdone,ends);
    thread38285(tdone,ends);
    thread38286(tdone,ends);
    thread38287(tdone,ends);
    thread38288(tdone,ends);
    thread38289(tdone,ends);
    int biggest38290 = 0;
    if(ends[8]>=biggest38290){
      biggest38290=ends[8];
    }
    if(ends[9]>=biggest38290){
      biggest38290=ends[9];
    }
    if(ends[10]>=biggest38290){
      biggest38290=ends[10];
    }
    if(ends[11]>=biggest38290){
      biggest38290=ends[11];
    }
    if(ends[12]>=biggest38290){
      biggest38290=ends[12];
    }
    if(ends[13]>=biggest38290){
      biggest38290=ends[13];
    }
    if(biggest38290 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread38282(int [] tdone, int [] ends){
        S37230=1;
    capcount_thread_6 = 5;//sysj\plant.sysj line: 82, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 84, column: 12
      if(capcount_thread_6 > 0) {//sysj\plant.sysj line: 85, column: 5
        capcount_thread_6 = capcount_thread_6 - 1;//sysj\plant.sysj line: 86, column: 6
      }
      if(refill.getprestatus()){//sysj\plant.sysj line: 88, column: 12
        capcount_thread_6 = 5;//sysj\plant.sysj line: 89, column: 5
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
          empty.setPresent();//sysj\plant.sysj line: 93, column: 6
          currsigs.addElement(empty);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
          empty.setPresent();//sysj\plant.sysj line: 93, column: 6
          currsigs.addElement(empty);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\plant.sysj line: 88, column: 12
        capcount_thread_6 = 5;//sysj\plant.sysj line: 89, column: 5
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
          empty.setPresent();//sysj\plant.sysj line: 93, column: 6
          currsigs.addElement(empty);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
          empty.setPresent();//sysj\plant.sysj line: 93, column: 6
          currsigs.addElement(empty);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
    }
  }

  public void thread38281(int [] tdone, int [] ends){
        S37168=1;
    S37122=0;
    S37104=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread38280(int [] tdone, int [] ends){
        S37100=1;
    S37070=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 44, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 45, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 46, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 46, column: 6
        S37065=0;
        WPgripped.setPresent();//sysj\plant.sysj line: 48, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S37070=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S37070=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread38279(int [] tdone, int [] ends){
        S37056=1;
    S37010=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 32, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread38278(int [] tdone, int [] ends){
        S37003=1;
    S36957=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 19, column: 5
    currsigs.addElement(armAtDest);
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
      switch(S38276){
        case 0 : 
          S38276=0;
          break RUN;
        
        case 1 : 
          S38276=2;
          S38276=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 11, column: 2
          capDec_1.setClear();//sysj\plant.sysj line: 13, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 14, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 15, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 15, column: 2
          thread38278(tdone,ends);
          thread38279(tdone,ends);
          thread38280(tdone,ends);
          thread38281(tdone,ends);
          thread38282(tdone,ends);
          thread38283(tdone,ends);
          int biggest38291 = 0;
          if(ends[2]>=biggest38291){
            biggest38291=ends[2];
          }
          if(ends[3]>=biggest38291){
            biggest38291=ends[3];
          }
          if(ends[4]>=biggest38291){
            biggest38291=ends[4];
          }
          if(ends[5]>=biggest38291){
            biggest38291=ends[5];
          }
          if(ends[6]>=biggest38291){
            biggest38291=ends[6];
          }
          if(ends[7]>=biggest38291){
            biggest38291=ends[7];
          }
          if(biggest38291 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 13, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 14, column: 2
          thread38292(tdone,ends);
          thread38293(tdone,ends);
          thread38294(tdone,ends);
          thread38295(tdone,ends);
          thread38296(tdone,ends);
          thread38297(tdone,ends);
          int biggest38305 = 0;
          if(ends[2]>=biggest38305){
            biggest38305=ends[2];
          }
          if(ends[3]>=biggest38305){
            biggest38305=ends[3];
          }
          if(ends[4]>=biggest38305){
            biggest38305=ends[4];
          }
          if(ends[5]>=biggest38305){
            biggest38305=ends[5];
          }
          if(ends[6]>=biggest38305){
            biggest38305=ends[6];
          }
          if(ends[7]>=biggest38305){
            biggest38305=ends[7];
          }
          if(biggest38305 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest38305 == 0){
            S38276=0;
            active[1]=0;
            ends[1]=0;
            S38276=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_1 = new Signal();
    capPos_1 = new Signal();
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
      capDec_1.setpreclear();
      capPos_1.setpreclear();
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
      capDec_1.setClear();
      capPos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        enable.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
