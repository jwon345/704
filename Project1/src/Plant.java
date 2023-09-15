import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

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
  private Signal capDec_14;
  private Signal capPos_14;
  private int capcount_thread_19;//sysj\lidloader.sysj line: 222, column: 8
  private int S169859 = 1;
  private int S169250 = 1;
  private int S169204 = 1;
  private int S169303 = 1;
  private int S169257 = 1;
  private int S169347 = 1;
  private int S169317 = 1;
  private int S169415 = 1;
  private int S169369 = 1;
  private int S169351 = 1;
  private int S169477 = 1;
  private int S169527 = 1;
  private int S169485 = 1;
  private int S169493 = 1;
  private int S169501 = 1;
  private int S169509 = 1;
  private int S169517 = 1;
  private int S169525 = 1;
  
  private int[] ends = new int[27];
  private int[] tdone = new int[27];
  
  public void thread169921(int [] tdone, int [] ends){
        switch(S169525){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\lidloader.sysj line: 250, column: 29
          emptyE.setPresent();//sysj\lidloader.sysj line: 250, column: 36
          currsigs.addElement(emptyE);
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread169920(int [] tdone, int [] ends){
        switch(S169517){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\lidloader.sysj line: 248, column: 29
          armAtDestE.setPresent();//sysj\lidloader.sysj line: 248, column: 40
          currsigs.addElement(armAtDestE);
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread169919(int [] tdone, int [] ends){
        switch(S169509){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\lidloader.sysj line: 246, column: 29
          armAtSourceE.setPresent();//sysj\lidloader.sysj line: 246, column: 42
          currsigs.addElement(armAtSourceE);
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread169918(int [] tdone, int [] ends){
        switch(S169501){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\lidloader.sysj line: 244, column: 29
          WPgrippedE.setPresent();//sysj\lidloader.sysj line: 244, column: 40
          currsigs.addElement(WPgrippedE);
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread169917(int [] tdone, int [] ends){
        switch(S169493){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\lidloader.sysj line: 242, column: 29
          pusherExtendedE.setPresent();//sysj\lidloader.sysj line: 242, column: 45
          currsigs.addElement(pusherExtendedE);
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread169916(int [] tdone, int [] ends){
        switch(S169485){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\lidloader.sysj line: 240, column: 29
          pusherRetractedE.setPresent();//sysj\lidloader.sysj line: 240, column: 46
          currsigs.addElement(pusherRetractedE);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread169915(int [] tdone, int [] ends){
        switch(S169527){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        thread169916(tdone,ends);
        thread169917(tdone,ends);
        thread169918(tdone,ends);
        thread169919(tdone,ends);
        thread169920(tdone,ends);
        thread169921(tdone,ends);
        int biggest169922 = 0;
        if(ends[21]>=biggest169922){
          biggest169922=ends[21];
        }
        if(ends[22]>=biggest169922){
          biggest169922=ends[22];
        }
        if(ends[23]>=biggest169922){
          biggest169922=ends[23];
        }
        if(ends[24]>=biggest169922){
          biggest169922=ends[24];
        }
        if(ends[25]>=biggest169922){
          biggest169922=ends[25];
        }
        if(ends[26]>=biggest169922){
          biggest169922=ends[26];
        }
        if(biggest169922 == 1){
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        //FINXME code
        if(biggest169922 == 0){
          S169527=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread169914(int [] tdone, int [] ends){
        switch(S169477){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(capDec_14.getprestatus()){//sysj\lidloader.sysj line: 224, column: 17
          if(capcount_thread_19 > 0) {//sysj\lidloader.sysj line: 225, column: 10
            capcount_thread_19 = capcount_thread_19 - 1;//sysj\lidloader.sysj line: 226, column: 11
          }
          if(refill.getprestatus()){//sysj\lidloader.sysj line: 228, column: 17
            capcount_thread_19 = 5;//sysj\lidloader.sysj line: 229, column: 10
            if(capcount_thread_19 == 0){//sysj\lidloader.sysj line: 232, column: 13
              empty.setPresent();//sysj\lidloader.sysj line: 233, column: 11
              currsigs.addElement(empty);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
          }
          else {
            if(capcount_thread_19 == 0){//sysj\lidloader.sysj line: 232, column: 13
              empty.setPresent();//sysj\lidloader.sysj line: 233, column: 11
              currsigs.addElement(empty);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
          }
        }
        else {
          if(refill.getprestatus()){//sysj\lidloader.sysj line: 228, column: 17
            capcount_thread_19 = 5;//sysj\lidloader.sysj line: 229, column: 10
            if(capcount_thread_19 == 0){//sysj\lidloader.sysj line: 232, column: 13
              empty.setPresent();//sysj\lidloader.sysj line: 233, column: 11
              currsigs.addElement(empty);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
          }
          else {
            if(capcount_thread_19 == 0){//sysj\lidloader.sysj line: 232, column: 13
              empty.setPresent();//sysj\lidloader.sysj line: 233, column: 11
              currsigs.addElement(empty);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread169913(int [] tdone, int [] ends){
        switch(S169415){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S169369){
          case 0 : 
            if(empty.getprestatus()){//sysj\lidloader.sysj line: 207, column: 15
              S169369=1;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              switch(S169351){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\lidloader.sysj line: 209, column: 18
                    S169351=1;
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  else {
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  break;
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\lidloader.sysj line: 210, column: 18
                    capPos_14.setPresent();//sysj\lidloader.sysj line: 212, column: 12
                    currsigs.addElement(capPos_14);
                    capPos_14.setValue(1);//sysj\lidloader.sysj line: 212, column: 12
                    S169351=2;
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  else {
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  break;
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\lidloader.sysj line: 213, column: 18
                    capDec_14.setPresent();//sysj\lidloader.sysj line: 214, column: 12
                    currsigs.addElement(capDec_14);
                    S169351=0;
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  else {
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\lidloader.sysj line: 217, column: 15
              S169369=0;
              S169351=0;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread169912(int [] tdone, int [] ends){
        switch(S169347){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S169317){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\lidloader.sysj line: 187, column: 17
              if(armAtSource.getprestatus()){//sysj\lidloader.sysj line: 190, column: 19
                capPos_14.setPresent();//sysj\lidloader.sysj line: 191, column: 12
                currsigs.addElement(capPos_14);
                capPos_14.setValue(1);//sysj\lidloader.sysj line: 191, column: 12
                S169317=1;
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
              else {
                S169317=1;
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\lidloader.sysj line: 188, column: 12
              currsigs.addElement(WPgripped);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            S169317=1;
            S169317=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\lidloader.sysj line: 184, column: 17
              if((Integer)(capPos_14.getpreval() == null ? 0 : ((Integer)capPos_14.getpreval()).intValue()) == 1){//sysj\lidloader.sysj line: 185, column: 13
                capPos_14.setPresent();//sysj\lidloader.sysj line: 186, column: 11
                currsigs.addElement(capPos_14);
                capPos_14.setValue(0);//sysj\lidloader.sysj line: 186, column: 11
                WPgripped.setPresent();//sysj\lidloader.sysj line: 188, column: 12
                currsigs.addElement(WPgripped);
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
              else {
                S169317=1;
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
            }
            else {
              S169317=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread169911(int [] tdone, int [] ends){
        switch(S169303){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S169257){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\lidloader.sysj line: 171, column: 15
              S169257=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\lidloader.sysj line: 172, column: 10
              currsigs.addElement(pusherRetracted);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\lidloader.sysj line: 174, column: 15
              S169257=2;
              pusherExtended.setPresent();//sysj\lidloader.sysj line: 176, column: 10
              currsigs.addElement(pusherExtended);
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
          
          case 2 : 
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\lidloader.sysj line: 175, column: 15
              S169257=3;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\lidloader.sysj line: 176, column: 10
              currsigs.addElement(pusherExtended);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\lidloader.sysj line: 178, column: 15
              S169257=0;
              pusherRetracted.setPresent();//sysj\lidloader.sysj line: 172, column: 10
              currsigs.addElement(pusherRetracted);
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
        break;
      
    }
  }

  public void thread169910(int [] tdone, int [] ends){
        switch(S169250){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S169204){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\lidloader.sysj line: 158, column: 15
              S169204=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              armAtDest.setPresent();//sysj\lidloader.sysj line: 159, column: 10
              currsigs.addElement(armAtDest);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\lidloader.sysj line: 161, column: 15
              S169204=2;
              armAtSource.setPresent();//sysj\lidloader.sysj line: 163, column: 10
              currsigs.addElement(armAtSource);
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
          
          case 2 : 
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\lidloader.sysj line: 162, column: 15
              S169204=3;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              armAtSource.setPresent();//sysj\lidloader.sysj line: 163, column: 10
              currsigs.addElement(armAtSource);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\lidloader.sysj line: 165, column: 15
              S169204=0;
              armAtDest.setPresent();//sysj\lidloader.sysj line: 159, column: 10
              currsigs.addElement(armAtDest);
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
        break;
      
    }
  }

  public void thread169907(int [] tdone, int [] ends){
        S169525=1;
    if(empty.getprestatus()){//sysj\lidloader.sysj line: 250, column: 29
      emptyE.setPresent();//sysj\lidloader.sysj line: 250, column: 36
      currsigs.addElement(emptyE);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread169906(int [] tdone, int [] ends){
        S169517=1;
    if(armAtDest.getprestatus()){//sysj\lidloader.sysj line: 248, column: 29
      armAtDestE.setPresent();//sysj\lidloader.sysj line: 248, column: 40
      currsigs.addElement(armAtDestE);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread169905(int [] tdone, int [] ends){
        S169509=1;
    if(armAtSource.getprestatus()){//sysj\lidloader.sysj line: 246, column: 29
      armAtSourceE.setPresent();//sysj\lidloader.sysj line: 246, column: 42
      currsigs.addElement(armAtSourceE);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread169904(int [] tdone, int [] ends){
        S169501=1;
    if(WPgripped.getprestatus()){//sysj\lidloader.sysj line: 244, column: 29
      WPgrippedE.setPresent();//sysj\lidloader.sysj line: 244, column: 40
      currsigs.addElement(WPgrippedE);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread169903(int [] tdone, int [] ends){
        S169493=1;
    if(pusherExtended.getprestatus()){//sysj\lidloader.sysj line: 242, column: 29
      pusherExtendedE.setPresent();//sysj\lidloader.sysj line: 242, column: 45
      currsigs.addElement(pusherExtendedE);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread169902(int [] tdone, int [] ends){
        S169485=1;
    if(pusherRetracted.getprestatus()){//sysj\lidloader.sysj line: 240, column: 29
      pusherRetractedE.setPresent();//sysj\lidloader.sysj line: 240, column: 46
      currsigs.addElement(pusherRetractedE);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread169901(int [] tdone, int [] ends){
        S169527=1;
    thread169902(tdone,ends);
    thread169903(tdone,ends);
    thread169904(tdone,ends);
    thread169905(tdone,ends);
    thread169906(tdone,ends);
    thread169907(tdone,ends);
    int biggest169908 = 0;
    if(ends[21]>=biggest169908){
      biggest169908=ends[21];
    }
    if(ends[22]>=biggest169908){
      biggest169908=ends[22];
    }
    if(ends[23]>=biggest169908){
      biggest169908=ends[23];
    }
    if(ends[24]>=biggest169908){
      biggest169908=ends[24];
    }
    if(ends[25]>=biggest169908){
      biggest169908=ends[25];
    }
    if(ends[26]>=biggest169908){
      biggest169908=ends[26];
    }
    if(biggest169908 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread169900(int [] tdone, int [] ends){
        S169477=1;
    capcount_thread_19 = 5;//sysj\lidloader.sysj line: 222, column: 8
    if(capDec_14.getprestatus()){//sysj\lidloader.sysj line: 224, column: 17
      if(capcount_thread_19 > 0) {//sysj\lidloader.sysj line: 225, column: 10
        capcount_thread_19 = capcount_thread_19 - 1;//sysj\lidloader.sysj line: 226, column: 11
      }
      if(refill.getprestatus()){//sysj\lidloader.sysj line: 228, column: 17
        capcount_thread_19 = 5;//sysj\lidloader.sysj line: 229, column: 10
        if(capcount_thread_19 == 0){//sysj\lidloader.sysj line: 232, column: 13
          empty.setPresent();//sysj\lidloader.sysj line: 233, column: 11
          currsigs.addElement(empty);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
      }
      else {
        if(capcount_thread_19 == 0){//sysj\lidloader.sysj line: 232, column: 13
          empty.setPresent();//sysj\lidloader.sysj line: 233, column: 11
          currsigs.addElement(empty);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\lidloader.sysj line: 228, column: 17
        capcount_thread_19 = 5;//sysj\lidloader.sysj line: 229, column: 10
        if(capcount_thread_19 == 0){//sysj\lidloader.sysj line: 232, column: 13
          empty.setPresent();//sysj\lidloader.sysj line: 233, column: 11
          currsigs.addElement(empty);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
      }
      else {
        if(capcount_thread_19 == 0){//sysj\lidloader.sysj line: 232, column: 13
          empty.setPresent();//sysj\lidloader.sysj line: 233, column: 11
          currsigs.addElement(empty);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
      }
    }
  }

  public void thread169899(int [] tdone, int [] ends){
        S169415=1;
    S169369=0;
    S169351=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread169898(int [] tdone, int [] ends){
        S169347=1;
    S169317=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\lidloader.sysj line: 184, column: 17
      if((Integer)(capPos_14.getpreval() == null ? 0 : ((Integer)capPos_14.getpreval()).intValue()) == 1){//sysj\lidloader.sysj line: 185, column: 13
        capPos_14.setPresent();//sysj\lidloader.sysj line: 186, column: 11
        currsigs.addElement(capPos_14);
        capPos_14.setValue(0);//sysj\lidloader.sysj line: 186, column: 11
        WPgripped.setPresent();//sysj\lidloader.sysj line: 188, column: 12
        currsigs.addElement(WPgripped);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
      }
      else {
        S169317=1;
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
      }
    }
    else {
      S169317=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread169897(int [] tdone, int [] ends){
        S169303=1;
    S169257=0;
    pusherRetracted.setPresent();//sysj\lidloader.sysj line: 172, column: 10
    currsigs.addElement(pusherRetracted);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread169896(int [] tdone, int [] ends){
        S169250=1;
    S169204=0;
    armAtDest.setPresent();//sysj\lidloader.sysj line: 159, column: 10
    currsigs.addElement(armAtDest);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S169859){
        case 0 : 
          S169859=0;
          break RUN;
        
        case 1 : 
          S169859=2;
          S169859=2;
          capDec_14.setClear();//sysj\lidloader.sysj line: 153, column: 7
          capPos_14.setClear();//sysj\lidloader.sysj line: 154, column: 7
          capPos_14.setPresent();//sysj\lidloader.sysj line: 155, column: 7
          currsigs.addElement(capPos_14);
          capPos_14.setValue(0);//sysj\lidloader.sysj line: 155, column: 7
          thread169896(tdone,ends);
          thread169897(tdone,ends);
          thread169898(tdone,ends);
          thread169899(tdone,ends);
          thread169900(tdone,ends);
          thread169901(tdone,ends);
          int biggest169909 = 0;
          if(ends[15]>=biggest169909){
            biggest169909=ends[15];
          }
          if(ends[16]>=biggest169909){
            biggest169909=ends[16];
          }
          if(ends[17]>=biggest169909){
            biggest169909=ends[17];
          }
          if(ends[18]>=biggest169909){
            biggest169909=ends[18];
          }
          if(ends[19]>=biggest169909){
            biggest169909=ends[19];
          }
          if(ends[20]>=biggest169909){
            biggest169909=ends[20];
          }
          if(biggest169909 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_14.setClear();//sysj\lidloader.sysj line: 153, column: 7
          capPos_14.setClear();//sysj\lidloader.sysj line: 154, column: 7
          thread169910(tdone,ends);
          thread169911(tdone,ends);
          thread169912(tdone,ends);
          thread169913(tdone,ends);
          thread169914(tdone,ends);
          thread169915(tdone,ends);
          int biggest169923 = 0;
          if(ends[15]>=biggest169923){
            biggest169923=ends[15];
          }
          if(ends[16]>=biggest169923){
            biggest169923=ends[16];
          }
          if(ends[17]>=biggest169923){
            biggest169923=ends[17];
          }
          if(ends[18]>=biggest169923){
            biggest169923=ends[18];
          }
          if(ends[19]>=biggest169923){
            biggest169923=ends[19];
          }
          if(ends[20]>=biggest169923){
            biggest169923=ends[20];
          }
          if(biggest169923 == 1){
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
          //FINXME code
          if(biggest169923 == 0){
            S169859=0;
            active[14]=0;
            ends[14]=0;
            S169859=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_14 = new Signal();
    capPos_14 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[14] != 0){
      int index = 14;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[14]!=0 || suspended[14]!=0 || active[14]!=1);
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
      capDec_14.setpreclear();
      capPos_14.setpreclear();
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
      capDec_14.setClear();
      capPos_14.setClear();
      if(paused[14]!=0 || suspended[14]!=0 || active[14]!=1);
      else{
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        enable.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[14] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
