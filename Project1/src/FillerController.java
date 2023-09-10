import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class FillerController extends ClockDomain{
  public FillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public input_Channel simFiller_in = new input_Channel();
  public output_Channel fillerReady_o = new output_Channel();
  private Signal bottleAtPos2_51;
  private long __start_thread_52;//sysj\conveyor_controller.sysj line: 373, column: 9
  private int S31269 = 1;
  private int S31268 = 1;
  private int S23372 = 1;
  private int S23367 = 1;
  private int S25239 = 1;
  private int S23390 = 1;
  private int S23397 = 1;
  private int S23392 = 1;
  private int S23498 = 1;
  private int S23503 = 1;
  private int S23582 = 1;
  private int S23587 = 1;
  private int S23623 = 1;
  private int S23618 = 1;
  private int S23696 = 1;
  private int S25322 = 1;
  private int S25266 = 1;
  private int S25246 = 1;
  private int S25241 = 1;
  private int S25357 = 1;
  private int S25333 = 1;
  private int S25327 = 1;
  private int S25330 = 1;
  
  private int[] ends = new int[88];
  private int[] tdone = new int[88];
  
  public void thread95758(int [] tdone, int [] ends){
        S25330=1;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread95757(int [] tdone, int [] ends){
        S25327=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread95755(int [] tdone, int [] ends){
        switch(S25330){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 443, column: 35
          ends[60]=2;
          tdone[60]=1;
        }
        else {
          active[60]=1;
          ends[60]=1;
          tdone[60]=1;
        }
        break;
      
    }
  }

  public void thread95754(int [] tdone, int [] ends){
        switch(S25327){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
        break;
      
    }
  }

  public void thread95753(int [] tdone, int [] ends){
        switch(S25357){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        switch(S25333){
          case 0 : 
            thread95754(tdone,ends);
            thread95755(tdone,ends);
            int biggest95756 = 0;
            if(ends[59]>=biggest95756){
              biggest95756=ends[59];
            }
            if(ends[60]>=biggest95756){
              biggest95756=ends[60];
            }
            if(biggest95756 == 1){
              active[58]=1;
              ends[58]=1;
              tdone[58]=1;
            }
            if(biggest95756 == 2){
              ends[58]=2;
              ;//sysj\conveyor_controller.sysj line: 437, column: 18
              S25333=1;
              active[58]=1;
              ends[58]=1;
              tdone[58]=1;
            }
            //FINXME code
            if(biggest95756 == 0){
              S25333=1;
              active[58]=1;
              ends[58]=1;
              tdone[58]=1;
            }
            break;
          
          case 1 : 
            S25333=1;
            S25333=0;
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 436, column: 26
              thread95757(tdone,ends);
              thread95758(tdone,ends);
              int biggest95759 = 0;
              if(ends[59]>=biggest95759){
                biggest95759=ends[59];
              }
              if(ends[60]>=biggest95759){
                biggest95759=ends[60];
              }
              if(biggest95759 == 1){
                active[58]=1;
                ends[58]=1;
                tdone[58]=1;
              }
            }
            else {
              S25333=1;
              active[58]=1;
              ends[58]=1;
              tdone[58]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95752(int [] tdone, int [] ends){
        switch(S25322){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        switch(S25266){
          case 0 : 
            switch(S25246){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
                  S25246=1;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  switch(S25241){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 425, column: 12
                        S25241=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
                          ends[57]=2;
                          ;//sysj\conveyor_controller.sysj line: 425, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 426, column: 15
                            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 13
                            currsigs.addElement(bottleAtPos2_51);
                            S25266=1;
                            active[57]=1;
                            ends[57]=1;
                            tdone[57]=1;
                          }
                          else {
                            S25266=1;
                            active[57]=1;
                            ends[57]=1;
                            tdone[57]=1;
                          }
                        }
                        else {
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                      }
                      else {
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
                        ends[57]=2;
                        ;//sysj\conveyor_controller.sysj line: 425, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 426, column: 15
                          bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 13
                          currsigs.addElement(bottleAtPos2_51);
                          S25266=1;
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                        else {
                          S25266=1;
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                      }
                      else {
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S25246=1;
                S25246=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
                  S25246=1;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  S25241=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 425, column: 12
                    S25241=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
                      ends[57]=2;
                      ;//sysj\conveyor_controller.sysj line: 425, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 426, column: 15
                        bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 13
                        currsigs.addElement(bottleAtPos2_51);
                        S25266=1;
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      else {
                        S25266=1;
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                    }
                    else {
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                  else {
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S25266=1;
            S25266=0;
            S25246=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
              S25246=1;
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            else {
              S25241=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 425, column: 12
                S25241=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
                  ends[57]=2;
                  ;//sysj\conveyor_controller.sysj line: 425, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 426, column: 15
                    bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 13
                    currsigs.addElement(bottleAtPos2_51);
                    S25266=1;
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                  else {
                    S25266=1;
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                else {
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
              }
              else {
                active[57]=1;
                ends[57]=1;
                tdone[57]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95750(int [] tdone, int [] ends){
        switch(S23587){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 403, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread95749(int [] tdone, int [] ends){
        switch(S23582){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 13
        currsigs.addElement(valveInletOnOff);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread95747(int [] tdone, int [] ends){
        S23587=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 403, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread95746(int [] tdone, int [] ends){
        S23582=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 398, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 13
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread95744(int [] tdone, int [] ends){
        switch(S23503){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
        break;
      
    }
  }

  public void thread95743(int [] tdone, int [] ends){
        switch(S23498){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread95741(int [] tdone, int [] ends){
        S23587=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 403, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread95740(int [] tdone, int [] ends){
        S23582=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 398, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 13
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread95738(int [] tdone, int [] ends){
        S23503=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread95737(int [] tdone, int [] ends){
        S23498=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 386, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread95735(int [] tdone, int [] ends){
        S23503=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread95734(int [] tdone, int [] ends){
        S23498=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 386, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread95732(int [] tdone, int [] ends){
        S23503=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread95731(int [] tdone, int [] ends){
        S23498=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 386, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread95729(int [] tdone, int [] ends){
        S23503=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread95728(int [] tdone, int [] ends){
        S23498=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 386, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread95726(int [] tdone, int [] ends){
        S23503=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread95725(int [] tdone, int [] ends){
        S23498=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 386, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread95724(int [] tdone, int [] ends){
        switch(S25239){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S23390){
          case 0 : 
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 376, column: 17
              S23390=1;
              S23397=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 377, column: 11
                S23397=1;
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              else {
                S23392=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 377, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 377, column: 11
                  S23392=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 377, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 377, column: 11
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 377, column: 11
                    S23390=2;
                    __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 373, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 373, column: 9
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 373, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 380, column: 11
                      S23390=3;
                      thread95725(tdone,ends);
                      thread95726(tdone,ends);
                      int biggest95727 = 0;
                      if(ends[53]>=biggest95727){
                        biggest95727=ends[53];
                      }
                      if(ends[54]>=biggest95727){
                        biggest95727=ends[54];
                      }
                      if(biggest95727 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 1 : 
            switch(S23397){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 377, column: 11
                  S23397=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S23392){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 377, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 377, column: 11
                        S23392=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 377, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 377, column: 11
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 377, column: 11
                          S23390=2;
                          __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 373, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 373, column: 9
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 373, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 380, column: 11
                            S23390=3;
                            thread95728(tdone,ends);
                            thread95729(tdone,ends);
                            int biggest95730 = 0;
                            if(ends[53]>=biggest95730){
                              biggest95730=ends[53];
                            }
                            if(ends[54]>=biggest95730){
                              biggest95730=ends[54];
                            }
                            if(biggest95730 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 377, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 377, column: 11
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 377, column: 11
                        S23390=2;
                        __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 373, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 373, column: 9
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 373, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 380, column: 11
                          S23390=3;
                          thread95731(tdone,ends);
                          thread95732(tdone,ends);
                          int biggest95733 = 0;
                          if(ends[53]>=biggest95733){
                            biggest95733=ends[53];
                          }
                          if(ends[54]>=biggest95733){
                            biggest95733=ends[54];
                          }
                          if(biggest95733 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S23397=1;
                S23397=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 377, column: 11
                  S23397=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S23392=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 377, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 377, column: 11
                    S23392=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 377, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 377, column: 11
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 377, column: 11
                      S23390=2;
                      __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 373, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 373, column: 9
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 373, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 380, column: 11
                        S23390=3;
                        thread95734(tdone,ends);
                        thread95735(tdone,ends);
                        int biggest95736 = 0;
                        if(ends[53]>=biggest95736){
                          biggest95736=ends[53];
                        }
                        if(ends[54]>=biggest95736){
                          biggest95736=ends[54];
                        }
                        if(biggest95736 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 373, column: 9
              ends[52]=2;
              ;//sysj\conveyor_controller.sysj line: 373, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 380, column: 11
              S23390=3;
              thread95737(tdone,ends);
              thread95738(tdone,ends);
              int biggest95739 = 0;
              if(ends[53]>=biggest95739){
                biggest95739=ends[53];
              }
              if(ends[54]>=biggest95739){
                biggest95739=ends[54];
              }
              if(biggest95739 == 1){
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 3 : 
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 384, column: 17
              S23390=4;
              thread95740(tdone,ends);
              thread95741(tdone,ends);
              int biggest95742 = 0;
              if(ends[55]>=biggest95742){
                biggest95742=ends[55];
              }
              if(ends[56]>=biggest95742){
                biggest95742=ends[56];
              }
              if(biggest95742 == 1){
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
            }
            else {
              thread95743(tdone,ends);
              thread95744(tdone,ends);
              int biggest95745 = 0;
              if(ends[53]>=biggest95745){
                biggest95745=ends[53];
              }
              if(ends[54]>=biggest95745){
                biggest95745=ends[54];
              }
              if(biggest95745 == 1){
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              //FINXME code
              if(biggest95745 == 0){
                S23390=4;
                thread95746(tdone,ends);
                thread95747(tdone,ends);
                int biggest95748 = 0;
                if(ends[55]>=biggest95748){
                  biggest95748=ends[55];
                }
                if(ends[56]>=biggest95748){
                  biggest95748=ends[56];
                }
                if(biggest95748 == 1){
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 396, column: 17
              S23390=5;
              S23623=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 408, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 408, column: 11
                S23623=1;
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              else {
                S23618=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 408, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 408, column: 11
                  S23618=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 408, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 408, column: 11
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 408, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 409, column: 11
                    S23390=6;
                    S23696=0;
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
                else {
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
            }
            else {
              thread95749(tdone,ends);
              thread95750(tdone,ends);
              int biggest95751 = 0;
              if(ends[55]>=biggest95751){
                biggest95751=ends[55];
              }
              if(ends[56]>=biggest95751){
                biggest95751=ends[56];
              }
              if(biggest95751 == 1){
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              //FINXME code
              if(biggest95751 == 0){
                S23390=5;
                S23623=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 408, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 408, column: 11
                  S23623=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S23618=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 408, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 408, column: 11
                    S23618=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 408, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 408, column: 11
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 408, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 409, column: 11
                      S23390=6;
                      S23696=0;
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
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
              }
            }
            break;
          
          case 5 : 
            switch(S23623){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 408, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 408, column: 11
                  S23623=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S23618){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 408, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 408, column: 11
                        S23618=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 408, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 408, column: 11
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 408, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 409, column: 11
                          S23390=6;
                          S23696=0;
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
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 408, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 408, column: 11
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 408, column: 11
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 409, column: 11
                        S23390=6;
                        S23696=0;
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
                break;
              
              case 1 : 
                S23623=1;
                S23623=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 408, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 408, column: 11
                  S23623=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S23618=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 408, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 408, column: 11
                    S23618=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 408, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 408, column: 11
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 408, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 409, column: 11
                      S23390=6;
                      S23696=0;
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
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S23696){
              case 0 : 
                if(!bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 412, column: 18
                  S23696=1;
                  if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 414, column: 21
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 411, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 375, column: 14
                    S23390=0;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 414, column: 21
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  ends[52]=2;
                  ;//sysj\conveyor_controller.sysj line: 411, column: 11
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 375, column: 14
                  S23390=0;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95721(int [] tdone, int [] ends){
        S25330=1;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread95720(int [] tdone, int [] ends){
        S25327=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread95719(int [] tdone, int [] ends){
        S25357=1;
    S25333=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 436, column: 26
      thread95720(tdone,ends);
      thread95721(tdone,ends);
      int biggest95722 = 0;
      if(ends[59]>=biggest95722){
        biggest95722=ends[59];
      }
      if(ends[60]>=biggest95722){
        biggest95722=ends[60];
      }
      if(biggest95722 == 1){
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
      }
    }
    else {
      S25333=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread95718(int [] tdone, int [] ends){
        S25322=1;
    S25266=0;
    S25246=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
      S25246=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      S25241=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 425, column: 12
        S25241=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
          ends[57]=2;
          ;//sysj\conveyor_controller.sysj line: 425, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 426, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S25266=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
          else {
            S25266=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
      else {
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
  }

  public void thread95717(int [] tdone, int [] ends){
        S25239=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 375, column: 14
    S23390=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread95714(int [] tdone, int [] ends){
        S25330=1;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread95713(int [] tdone, int [] ends){
        S25327=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread95712(int [] tdone, int [] ends){
        S25357=1;
    S25333=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 436, column: 26
      thread95713(tdone,ends);
      thread95714(tdone,ends);
      int biggest95715 = 0;
      if(ends[59]>=biggest95715){
        biggest95715=ends[59];
      }
      if(ends[60]>=biggest95715){
        biggest95715=ends[60];
      }
      if(biggest95715 == 1){
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
      }
    }
    else {
      S25333=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread95711(int [] tdone, int [] ends){
        S25322=1;
    S25266=0;
    S25246=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
      S25246=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      S25241=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 425, column: 12
        S25241=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
          ends[57]=2;
          ;//sysj\conveyor_controller.sysj line: 425, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 426, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S25266=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
          else {
            S25266=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
      else {
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
  }

  public void thread95710(int [] tdone, int [] ends){
        S25239=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 375, column: 14
    S23390=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread95707(int [] tdone, int [] ends){
        S25330=1;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread95706(int [] tdone, int [] ends){
        S25327=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread95705(int [] tdone, int [] ends){
        S25357=1;
    S25333=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 436, column: 26
      thread95706(tdone,ends);
      thread95707(tdone,ends);
      int biggest95708 = 0;
      if(ends[59]>=biggest95708){
        biggest95708=ends[59];
      }
      if(ends[60]>=biggest95708){
        biggest95708=ends[60];
      }
      if(biggest95708 == 1){
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
      }
    }
    else {
      S25333=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread95704(int [] tdone, int [] ends){
        S25322=1;
    S25266=0;
    S25246=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
      S25246=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      S25241=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 425, column: 12
        S25241=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
          ends[57]=2;
          ;//sysj\conveyor_controller.sysj line: 425, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 426, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S25266=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
          else {
            S25266=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
      else {
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
  }

  public void thread95703(int [] tdone, int [] ends){
        S25239=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 375, column: 14
    S23390=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread95700(int [] tdone, int [] ends){
        S25330=1;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread95699(int [] tdone, int [] ends){
        S25327=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread95698(int [] tdone, int [] ends){
        S25357=1;
    S25333=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 436, column: 26
      thread95699(tdone,ends);
      thread95700(tdone,ends);
      int biggest95701 = 0;
      if(ends[59]>=biggest95701){
        biggest95701=ends[59];
      }
      if(ends[60]>=biggest95701){
        biggest95701=ends[60];
      }
      if(biggest95701 == 1){
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
      }
    }
    else {
      S25333=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread95697(int [] tdone, int [] ends){
        S25322=1;
    S25266=0;
    S25246=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
      S25246=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      S25241=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 425, column: 12
        S25241=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 425, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 425, column: 12
          ends[57]=2;
          ;//sysj\conveyor_controller.sysj line: 425, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 426, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 427, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S25266=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
          else {
            S25266=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
      else {
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
  }

  public void thread95696(int [] tdone, int [] ends){
        S25239=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 375, column: 14
    S23390=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S31269){
        case 0 : 
          S31269=0;
          break RUN;
        
        case 1 : 
          S31269=2;
          S31269=2;
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 369, column: 9
          S31268=0;
          S23372=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 370, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 370, column: 9
            S23372=1;
            active[51]=1;
            ends[51]=1;
            break RUN;
          }
          else {
            S23367=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 370, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 370, column: 9
              S23367=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 370, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 370, column: 9
                ends[51]=2;
                ;//sysj\conveyor_controller.sysj line: 370, column: 9
                S31268=1;
                thread95696(tdone,ends);
                thread95697(tdone,ends);
                thread95698(tdone,ends);
                int biggest95702 = 0;
                if(ends[52]>=biggest95702){
                  biggest95702=ends[52];
                }
                if(ends[57]>=biggest95702){
                  biggest95702=ends[57];
                }
                if(ends[58]>=biggest95702){
                  biggest95702=ends[58];
                }
                if(biggest95702 == 1){
                  active[51]=1;
                  ends[51]=1;
                  break RUN;
                }
              }
              else {
                active[51]=1;
                ends[51]=1;
                break RUN;
              }
            }
            else {
              active[51]=1;
              ends[51]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 369, column: 9
          switch(S31268){
            case 0 : 
              switch(S23372){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 370, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 370, column: 9
                    S23372=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    switch(S23367){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 370, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 370, column: 9
                          S23367=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 370, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 370, column: 9
                            ends[51]=2;
                            ;//sysj\conveyor_controller.sysj line: 370, column: 9
                            S31268=1;
                            thread95703(tdone,ends);
                            thread95704(tdone,ends);
                            thread95705(tdone,ends);
                            int biggest95709 = 0;
                            if(ends[52]>=biggest95709){
                              biggest95709=ends[52];
                            }
                            if(ends[57]>=biggest95709){
                              biggest95709=ends[57];
                            }
                            if(ends[58]>=biggest95709){
                              biggest95709=ends[58];
                            }
                            if(biggest95709 == 1){
                              active[51]=1;
                              ends[51]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[51]=1;
                            ends[51]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 370, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 370, column: 9
                          ends[51]=2;
                          ;//sysj\conveyor_controller.sysj line: 370, column: 9
                          S31268=1;
                          thread95710(tdone,ends);
                          thread95711(tdone,ends);
                          thread95712(tdone,ends);
                          int biggest95716 = 0;
                          if(ends[52]>=biggest95716){
                            biggest95716=ends[52];
                          }
                          if(ends[57]>=biggest95716){
                            biggest95716=ends[57];
                          }
                          if(ends[58]>=biggest95716){
                            biggest95716=ends[58];
                          }
                          if(biggest95716 == 1){
                            active[51]=1;
                            ends[51]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S23372=1;
                  S23372=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 370, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 370, column: 9
                    S23372=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    S23367=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 370, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 370, column: 9
                      S23367=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 370, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 370, column: 9
                        ends[51]=2;
                        ;//sysj\conveyor_controller.sysj line: 370, column: 9
                        S31268=1;
                        thread95717(tdone,ends);
                        thread95718(tdone,ends);
                        thread95719(tdone,ends);
                        int biggest95723 = 0;
                        if(ends[52]>=biggest95723){
                          biggest95723=ends[52];
                        }
                        if(ends[57]>=biggest95723){
                          biggest95723=ends[57];
                        }
                        if(ends[58]>=biggest95723){
                          biggest95723=ends[58];
                        }
                        if(biggest95723 == 1){
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[51]=1;
                        ends[51]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[51]=1;
                      ends[51]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread95724(tdone,ends);
              thread95752(tdone,ends);
              thread95753(tdone,ends);
              int biggest95760 = 0;
              if(ends[52]>=biggest95760){
                biggest95760=ends[52];
              }
              if(ends[57]>=biggest95760){
                biggest95760=ends[57];
              }
              if(ends[58]>=biggest95760){
                biggest95760=ends[58];
              }
              if(biggest95760 == 1){
                active[51]=1;
                ends[51]=1;
                break RUN;
              }
              //FINXME code
              if(biggest95760 == 0){
                S31269=0;
                active[51]=0;
                ends[51]=0;
                S31269=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos2_51 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[51] != 0){
      int index = 51;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
      else{
        if(!df){
          simFiller_in.gethook();
          fillerReady_o.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          df = true;
        }
        runClockDomain();
      }
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      bottleAtPos2E.setpreclear();
      bottleAtPos2_51.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      bottleAtPos2_51.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[51] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
