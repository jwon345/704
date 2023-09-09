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
  private Signal bottleAtPos2_48;
  private long __start_thread_49;//sysj\conveyor_controller.sysj line: 360, column: 9
  private int S32450 = 1;
  private int S32449 = 1;
  private int S24553 = 1;
  private int S24548 = 1;
  private int S26420 = 1;
  private int S24571 = 1;
  private int S24578 = 1;
  private int S24573 = 1;
  private int S24679 = 1;
  private int S24684 = 1;
  private int S24763 = 1;
  private int S24768 = 1;
  private int S24804 = 1;
  private int S24799 = 1;
  private int S24877 = 1;
  private int S26503 = 1;
  private int S26447 = 1;
  private int S26427 = 1;
  private int S26422 = 1;
  private int S26538 = 1;
  private int S26514 = 1;
  private int S26508 = 1;
  private int S26511 = 1;
  
  private int[] ends = new int[72];
  private int[] tdone = new int[72];
  
  public void thread38754(int [] tdone, int [] ends){
        S26511=1;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread38753(int [] tdone, int [] ends){
        S26508=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread38751(int [] tdone, int [] ends){
        switch(S26511){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 427, column: 35
          ends[57]=2;
          tdone[57]=1;
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        break;
      
    }
  }

  public void thread38750(int [] tdone, int [] ends){
        switch(S26508){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread38749(int [] tdone, int [] ends){
        switch(S26538){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        switch(S26514){
          case 0 : 
            thread38750(tdone,ends);
            thread38751(tdone,ends);
            int biggest38752 = 0;
            if(ends[56]>=biggest38752){
              biggest38752=ends[56];
            }
            if(ends[57]>=biggest38752){
              biggest38752=ends[57];
            }
            if(biggest38752 == 1){
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            if(biggest38752 == 2){
              ends[55]=2;
              ;//sysj\conveyor_controller.sysj line: 421, column: 18
              S26514=1;
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            //FINXME code
            if(biggest38752 == 0){
              S26514=1;
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            break;
          
          case 1 : 
            S26514=1;
            S26514=0;
            if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 420, column: 26
              thread38753(tdone,ends);
              thread38754(tdone,ends);
              int biggest38755 = 0;
              if(ends[56]>=biggest38755){
                biggest38755=ends[56];
              }
              if(ends[57]>=biggest38755){
                biggest38755=ends[57];
              }
              if(biggest38755 == 1){
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
            }
            else {
              S26514=1;
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38748(int [] tdone, int [] ends){
        switch(S26503){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S26447){
          case 0 : 
            switch(S26427){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
                  S26427=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  switch(S26422){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
                        S26422=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
                          ends[54]=2;
                          ;//sysj\conveyor_controller.sysj line: 409, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
                            bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
                            currsigs.addElement(bottleAtPos2_48);
                            S26447=1;
                            active[54]=1;
                            ends[54]=1;
                            tdone[54]=1;
                          }
                          else {
                            S26447=1;
                            active[54]=1;
                            ends[54]=1;
                            tdone[54]=1;
                          }
                        }
                        else {
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                      }
                      else {
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
                        ends[54]=2;
                        ;//sysj\conveyor_controller.sysj line: 409, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
                          bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
                          currsigs.addElement(bottleAtPos2_48);
                          S26447=1;
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                        else {
                          S26447=1;
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                      }
                      else {
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S26427=1;
                S26427=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
                  S26427=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  S26422=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
                    S26422=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
                      ends[54]=2;
                      ;//sysj\conveyor_controller.sysj line: 409, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
                        bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
                        currsigs.addElement(bottleAtPos2_48);
                        S26447=1;
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                      else {
                        S26447=1;
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                    }
                    else {
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                  }
                  else {
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S26447=1;
            S26447=0;
            S26427=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
              S26427=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              S26422=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
                S26422=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
                  ends[54]=2;
                  ;//sysj\conveyor_controller.sysj line: 409, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
                    bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
                    currsigs.addElement(bottleAtPos2_48);
                    S26447=1;
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  else {
                    S26447=1;
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                }
                else {
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
              }
              else {
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38746(int [] tdone, int [] ends){
        switch(S24768){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread38745(int [] tdone, int [] ends){
        switch(S24763){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 13
        currsigs.addElement(valveInletOnOff);
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
        break;
      
    }
  }

  public void thread38743(int [] tdone, int [] ends){
        S24768=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread38742(int [] tdone, int [] ends){
        S24763=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 382, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 13
    currsigs.addElement(valveInletOnOff);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread38740(int [] tdone, int [] ends){
        switch(S24684){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 376, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
        break;
      
    }
  }

  public void thread38739(int [] tdone, int [] ends){
        switch(S24679){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 372, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
        break;
      
    }
  }

  public void thread38737(int [] tdone, int [] ends){
        S24768=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread38736(int [] tdone, int [] ends){
        S24763=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 382, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 13
    currsigs.addElement(valveInletOnOff);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread38734(int [] tdone, int [] ends){
        S24684=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 376, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread38733(int [] tdone, int [] ends){
        S24679=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 371, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 372, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread38731(int [] tdone, int [] ends){
        S24684=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 376, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread38730(int [] tdone, int [] ends){
        S24679=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 371, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 372, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread38728(int [] tdone, int [] ends){
        S24684=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 376, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread38727(int [] tdone, int [] ends){
        S24679=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 371, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 372, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread38725(int [] tdone, int [] ends){
        S24684=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 376, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread38724(int [] tdone, int [] ends){
        S24679=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 371, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 372, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread38722(int [] tdone, int [] ends){
        S24684=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 376, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread38721(int [] tdone, int [] ends){
        S24679=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 371, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 372, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread38720(int [] tdone, int [] ends){
        switch(S26420){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        switch(S24571){
          case 0 : 
            if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 363, column: 17
              S24571=1;
              S24578=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 364, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                S24578=1;
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
              else {
                S24573=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 364, column: 11
                  S24573=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                    ends[49]=2;
                    ;//sysj\conveyor_controller.sysj line: 364, column: 11
                    S24571=2;
                    __start_thread_49 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 360, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_49 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 360, column: 9
                      ends[49]=2;
                      ;//sysj\conveyor_controller.sysj line: 360, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 367, column: 11
                      S24571=3;
                      thread38721(tdone,ends);
                      thread38722(tdone,ends);
                      int biggest38723 = 0;
                      if(ends[50]>=biggest38723){
                        biggest38723=ends[50];
                      }
                      if(ends[51]>=biggest38723){
                        biggest38723=ends[51];
                      }
                      if(biggest38723 == 1){
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                    }
                    else {
                      active[49]=1;
                      ends[49]=1;
                      tdone[49]=1;
                    }
                  }
                  else {
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
                else {
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
              }
            }
            else {
              active[49]=1;
              ends[49]=1;
              tdone[49]=1;
            }
            break;
          
          case 1 : 
            switch(S24578){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 364, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                  S24578=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  switch(S24573){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 364, column: 11
                        S24573=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                          ends[49]=2;
                          ;//sysj\conveyor_controller.sysj line: 364, column: 11
                          S24571=2;
                          __start_thread_49 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 360, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_49 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 360, column: 9
                            ends[49]=2;
                            ;//sysj\conveyor_controller.sysj line: 360, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 367, column: 11
                            S24571=3;
                            thread38724(tdone,ends);
                            thread38725(tdone,ends);
                            int biggest38726 = 0;
                            if(ends[50]>=biggest38726){
                              biggest38726=ends[50];
                            }
                            if(ends[51]>=biggest38726){
                              biggest38726=ends[51];
                            }
                            if(biggest38726 == 1){
                              active[49]=1;
                              ends[49]=1;
                              tdone[49]=1;
                            }
                          }
                          else {
                            active[49]=1;
                            ends[49]=1;
                            tdone[49]=1;
                          }
                        }
                        else {
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                      }
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                        ends[49]=2;
                        ;//sysj\conveyor_controller.sysj line: 364, column: 11
                        S24571=2;
                        __start_thread_49 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 360, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_49 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 360, column: 9
                          ends[49]=2;
                          ;//sysj\conveyor_controller.sysj line: 360, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 367, column: 11
                          S24571=3;
                          thread38727(tdone,ends);
                          thread38728(tdone,ends);
                          int biggest38729 = 0;
                          if(ends[50]>=biggest38729){
                            biggest38729=ends[50];
                          }
                          if(ends[51]>=biggest38729){
                            biggest38729=ends[51];
                          }
                          if(biggest38729 == 1){
                            active[49]=1;
                            ends[49]=1;
                            tdone[49]=1;
                          }
                        }
                        else {
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                      }
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S24578=1;
                S24578=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 364, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                  S24578=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  S24573=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 364, column: 11
                    S24573=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                      ends[49]=2;
                      ;//sysj\conveyor_controller.sysj line: 364, column: 11
                      S24571=2;
                      __start_thread_49 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 360, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_49 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 360, column: 9
                        ends[49]=2;
                        ;//sysj\conveyor_controller.sysj line: 360, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 367, column: 11
                        S24571=3;
                        thread38730(tdone,ends);
                        thread38731(tdone,ends);
                        int biggest38732 = 0;
                        if(ends[50]>=biggest38732){
                          biggest38732=ends[50];
                        }
                        if(ends[51]>=biggest38732){
                          biggest38732=ends[51];
                        }
                        if(biggest38732 == 1){
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                      }
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                    }
                    else {
                      active[49]=1;
                      ends[49]=1;
                      tdone[49]=1;
                    }
                  }
                  else {
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_49 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 360, column: 9
              ends[49]=2;
              ;//sysj\conveyor_controller.sysj line: 360, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 367, column: 11
              S24571=3;
              thread38733(tdone,ends);
              thread38734(tdone,ends);
              int biggest38735 = 0;
              if(ends[50]>=biggest38735){
                biggest38735=ends[50];
              }
              if(ends[51]>=biggest38735){
                biggest38735=ends[51];
              }
              if(biggest38735 == 1){
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
            }
            else {
              active[49]=1;
              ends[49]=1;
              tdone[49]=1;
            }
            break;
          
          case 3 : 
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 369, column: 17
              S24571=4;
              thread38736(tdone,ends);
              thread38737(tdone,ends);
              int biggest38738 = 0;
              if(ends[52]>=biggest38738){
                biggest38738=ends[52];
              }
              if(ends[53]>=biggest38738){
                biggest38738=ends[53];
              }
              if(biggest38738 == 1){
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
            }
            else {
              thread38739(tdone,ends);
              thread38740(tdone,ends);
              int biggest38741 = 0;
              if(ends[50]>=biggest38741){
                biggest38741=ends[50];
              }
              if(ends[51]>=biggest38741){
                biggest38741=ends[51];
              }
              if(biggest38741 == 1){
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
              //FINXME code
              if(biggest38741 == 0){
                S24571=4;
                thread38742(tdone,ends);
                thread38743(tdone,ends);
                int biggest38744 = 0;
                if(ends[52]>=biggest38744){
                  biggest38744=ends[52];
                }
                if(ends[53]>=biggest38744){
                  biggest38744=ends[53];
                }
                if(biggest38744 == 1){
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 380, column: 17
              S24571=5;
              S24804=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 392, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                S24804=1;
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
              else {
                S24799=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 392, column: 11
                  S24799=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                    ends[49]=2;
                    ;//sysj\conveyor_controller.sysj line: 392, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 393, column: 11
                    S24571=6;
                    S24877=0;
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
                else {
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
              }
            }
            else {
              thread38745(tdone,ends);
              thread38746(tdone,ends);
              int biggest38747 = 0;
              if(ends[52]>=biggest38747){
                biggest38747=ends[52];
              }
              if(ends[53]>=biggest38747){
                biggest38747=ends[53];
              }
              if(biggest38747 == 1){
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
              //FINXME code
              if(biggest38747 == 0){
                S24571=5;
                S24804=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 392, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                  S24804=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  S24799=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 392, column: 11
                    S24799=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                      ends[49]=2;
                      ;//sysj\conveyor_controller.sysj line: 392, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 393, column: 11
                      S24571=6;
                      S24877=0;
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
                  else {
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
              }
            }
            break;
          
          case 5 : 
            switch(S24804){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 392, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                  S24804=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  switch(S24799){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 392, column: 11
                        S24799=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                          ends[49]=2;
                          ;//sysj\conveyor_controller.sysj line: 392, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 393, column: 11
                          S24571=6;
                          S24877=0;
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
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                        ends[49]=2;
                        ;//sysj\conveyor_controller.sysj line: 392, column: 11
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 393, column: 11
                        S24571=6;
                        S24877=0;
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
                break;
              
              case 1 : 
                S24804=1;
                S24804=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 392, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                  S24804=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  S24799=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 392, column: 11
                    S24799=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                      ends[49]=2;
                      ;//sysj\conveyor_controller.sysj line: 392, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 393, column: 11
                      S24571=6;
                      S24877=0;
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
                  else {
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S24877){
              case 0 : 
                if(!bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 396, column: 18
                  S24877=1;
                  if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 398, column: 21
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                  else {
                    ends[49]=2;
                    ;//sysj\conveyor_controller.sysj line: 395, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 362, column: 14
                    S24571=0;
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
                else {
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 398, column: 21
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  ends[49]=2;
                  ;//sysj\conveyor_controller.sysj line: 395, column: 11
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 362, column: 14
                  S24571=0;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38717(int [] tdone, int [] ends){
        S26511=1;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread38716(int [] tdone, int [] ends){
        S26508=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread38715(int [] tdone, int [] ends){
        S26538=1;
    S26514=0;
    if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 420, column: 26
      thread38716(tdone,ends);
      thread38717(tdone,ends);
      int biggest38718 = 0;
      if(ends[56]>=biggest38718){
        biggest38718=ends[56];
      }
      if(ends[57]>=biggest38718){
        biggest38718=ends[57];
      }
      if(biggest38718 == 1){
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
    else {
      S26514=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread38714(int [] tdone, int [] ends){
        S26503=1;
    S26447=0;
    S26427=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
      S26427=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S26422=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
        S26422=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
          ends[54]=2;
          ;//sysj\conveyor_controller.sysj line: 409, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
            bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
            currsigs.addElement(bottleAtPos2_48);
            S26447=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
          else {
            S26447=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
      }
      else {
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
  }

  public void thread38713(int [] tdone, int [] ends){
        S26420=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 362, column: 14
    S24571=0;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread38710(int [] tdone, int [] ends){
        S26511=1;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread38709(int [] tdone, int [] ends){
        S26508=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread38708(int [] tdone, int [] ends){
        S26538=1;
    S26514=0;
    if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 420, column: 26
      thread38709(tdone,ends);
      thread38710(tdone,ends);
      int biggest38711 = 0;
      if(ends[56]>=biggest38711){
        biggest38711=ends[56];
      }
      if(ends[57]>=biggest38711){
        biggest38711=ends[57];
      }
      if(biggest38711 == 1){
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
    else {
      S26514=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread38707(int [] tdone, int [] ends){
        S26503=1;
    S26447=0;
    S26427=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
      S26427=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S26422=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
        S26422=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
          ends[54]=2;
          ;//sysj\conveyor_controller.sysj line: 409, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
            bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
            currsigs.addElement(bottleAtPos2_48);
            S26447=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
          else {
            S26447=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
      }
      else {
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
  }

  public void thread38706(int [] tdone, int [] ends){
        S26420=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 362, column: 14
    S24571=0;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread38703(int [] tdone, int [] ends){
        S26511=1;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread38702(int [] tdone, int [] ends){
        S26508=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread38701(int [] tdone, int [] ends){
        S26538=1;
    S26514=0;
    if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 420, column: 26
      thread38702(tdone,ends);
      thread38703(tdone,ends);
      int biggest38704 = 0;
      if(ends[56]>=biggest38704){
        biggest38704=ends[56];
      }
      if(ends[57]>=biggest38704){
        biggest38704=ends[57];
      }
      if(biggest38704 == 1){
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
    else {
      S26514=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread38700(int [] tdone, int [] ends){
        S26503=1;
    S26447=0;
    S26427=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
      S26427=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S26422=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
        S26422=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
          ends[54]=2;
          ;//sysj\conveyor_controller.sysj line: 409, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
            bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
            currsigs.addElement(bottleAtPos2_48);
            S26447=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
          else {
            S26447=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
      }
      else {
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
  }

  public void thread38699(int [] tdone, int [] ends){
        S26420=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 362, column: 14
    S24571=0;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread38696(int [] tdone, int [] ends){
        S26511=1;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread38695(int [] tdone, int [] ends){
        S26508=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread38694(int [] tdone, int [] ends){
        S26538=1;
    S26514=0;
    if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 420, column: 26
      thread38695(tdone,ends);
      thread38696(tdone,ends);
      int biggest38697 = 0;
      if(ends[56]>=biggest38697){
        biggest38697=ends[56];
      }
      if(ends[57]>=biggest38697){
        biggest38697=ends[57];
      }
      if(biggest38697 == 1){
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
    else {
      S26514=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread38693(int [] tdone, int [] ends){
        S26503=1;
    S26447=0;
    S26427=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
      S26427=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S26422=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
        S26422=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
          ends[54]=2;
          ;//sysj\conveyor_controller.sysj line: 409, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
            bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
            currsigs.addElement(bottleAtPos2_48);
            S26447=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
          else {
            S26447=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
      }
      else {
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
  }

  public void thread38692(int [] tdone, int [] ends){
        S26420=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 362, column: 14
    S24571=0;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S32450){
        case 0 : 
          S32450=0;
          break RUN;
        
        case 1 : 
          S32450=2;
          S32450=2;
          bottleAtPos2_48.setClear();//sysj\conveyor_controller.sysj line: 356, column: 9
          S32449=0;
          S24553=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 357, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
            S24553=1;
            active[48]=1;
            ends[48]=1;
            break RUN;
          }
          else {
            S24548=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 357, column: 9
              S24548=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
                ends[48]=2;
                ;//sysj\conveyor_controller.sysj line: 357, column: 9
                S32449=1;
                thread38692(tdone,ends);
                thread38693(tdone,ends);
                thread38694(tdone,ends);
                int biggest38698 = 0;
                if(ends[49]>=biggest38698){
                  biggest38698=ends[49];
                }
                if(ends[54]>=biggest38698){
                  biggest38698=ends[54];
                }
                if(ends[55]>=biggest38698){
                  biggest38698=ends[55];
                }
                if(biggest38698 == 1){
                  active[48]=1;
                  ends[48]=1;
                  break RUN;
                }
              }
              else {
                active[48]=1;
                ends[48]=1;
                break RUN;
              }
            }
            else {
              active[48]=1;
              ends[48]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos2_48.setClear();//sysj\conveyor_controller.sysj line: 356, column: 9
          switch(S32449){
            case 0 : 
              switch(S24553){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 357, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
                    S24553=1;
                    active[48]=1;
                    ends[48]=1;
                    break RUN;
                  }
                  else {
                    switch(S24548){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 357, column: 9
                          S24548=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
                            ends[48]=2;
                            ;//sysj\conveyor_controller.sysj line: 357, column: 9
                            S32449=1;
                            thread38699(tdone,ends);
                            thread38700(tdone,ends);
                            thread38701(tdone,ends);
                            int biggest38705 = 0;
                            if(ends[49]>=biggest38705){
                              biggest38705=ends[49];
                            }
                            if(ends[54]>=biggest38705){
                              biggest38705=ends[54];
                            }
                            if(ends[55]>=biggest38705){
                              biggest38705=ends[55];
                            }
                            if(biggest38705 == 1){
                              active[48]=1;
                              ends[48]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[48]=1;
                            ends[48]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[48]=1;
                          ends[48]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
                          ends[48]=2;
                          ;//sysj\conveyor_controller.sysj line: 357, column: 9
                          S32449=1;
                          thread38706(tdone,ends);
                          thread38707(tdone,ends);
                          thread38708(tdone,ends);
                          int biggest38712 = 0;
                          if(ends[49]>=biggest38712){
                            biggest38712=ends[49];
                          }
                          if(ends[54]>=biggest38712){
                            biggest38712=ends[54];
                          }
                          if(ends[55]>=biggest38712){
                            biggest38712=ends[55];
                          }
                          if(biggest38712 == 1){
                            active[48]=1;
                            ends[48]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[48]=1;
                          ends[48]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S24553=1;
                  S24553=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 357, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
                    S24553=1;
                    active[48]=1;
                    ends[48]=1;
                    break RUN;
                  }
                  else {
                    S24548=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 357, column: 9
                      S24548=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
                        ends[48]=2;
                        ;//sysj\conveyor_controller.sysj line: 357, column: 9
                        S32449=1;
                        thread38713(tdone,ends);
                        thread38714(tdone,ends);
                        thread38715(tdone,ends);
                        int biggest38719 = 0;
                        if(ends[49]>=biggest38719){
                          biggest38719=ends[49];
                        }
                        if(ends[54]>=biggest38719){
                          biggest38719=ends[54];
                        }
                        if(ends[55]>=biggest38719){
                          biggest38719=ends[55];
                        }
                        if(biggest38719 == 1){
                          active[48]=1;
                          ends[48]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[48]=1;
                        ends[48]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[48]=1;
                      ends[48]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread38720(tdone,ends);
              thread38748(tdone,ends);
              thread38749(tdone,ends);
              int biggest38756 = 0;
              if(ends[49]>=biggest38756){
                biggest38756=ends[49];
              }
              if(ends[54]>=biggest38756){
                biggest38756=ends[54];
              }
              if(ends[55]>=biggest38756){
                biggest38756=ends[55];
              }
              if(biggest38756 == 1){
                active[48]=1;
                ends[48]=1;
                break RUN;
              }
              //FINXME code
              if(biggest38756 == 0){
                S32450=0;
                active[48]=0;
                ends[48]=0;
                S32450=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos2_48 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[48] != 0){
      int index = 48;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[48]!=0 || suspended[48]!=0 || active[48]!=1);
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
      bottleAtPos2_48.setpreclear();
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
      bottleAtPos2_48.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[48]!=0 || suspended[48]!=0 || active[48]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[48] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
