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
  private Signal bottleAtPos2_36;
  private long __start_thread_37;//sysj\conveyor_controller.sysj line: 281, column: 9
  private int S28198 = 1;
  private int S28197 = 1;
  private int S19981 = 1;
  private int S19976 = 1;
  private int S21928 = 1;
  private int S19999 = 1;
  private int S20034 = 1;
  private int S20029 = 1;
  private int S20123 = 1;
  private int S20128 = 1;
  private int S20207 = 1;
  private int S20212 = 1;
  private int S20248 = 1;
  private int S20243 = 1;
  private int S20321 = 1;
  private int S22011 = 1;
  private int S21955 = 1;
  private int S21935 = 1;
  private int S21930 = 1;
  private int S22046 = 1;
  private int S22022 = 1;
  private int S22016 = 1;
  private int S22019 = 1;
  
  private int[] ends = new int[60];
  private int[] tdone = new int[60];
  
  public void thread31631(int [] tdone, int [] ends){
        S22019=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31630(int [] tdone, int [] ends){
        S22016=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 342, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31628(int [] tdone, int [] ends){
        switch(S22019){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 346, column: 35
          ends[45]=2;
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

  public void thread31627(int [] tdone, int [] ends){
        switch(S22016){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 342, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
        break;
      
    }
  }

  public void thread31626(int [] tdone, int [] ends){
        switch(S22046){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        switch(S22022){
          case 0 : 
            thread31627(tdone,ends);
            thread31628(tdone,ends);
            int biggest31629 = 0;
            if(ends[44]>=biggest31629){
              biggest31629=ends[44];
            }
            if(ends[45]>=biggest31629){
              biggest31629=ends[45];
            }
            if(biggest31629 == 1){
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            if(biggest31629 == 2){
              ends[43]=2;
              ;//sysj\conveyor_controller.sysj line: 340, column: 18
              S22022=1;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            //FINXME code
            if(biggest31629 == 0){
              S22022=1;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            break;
          
          case 1 : 
            S22022=1;
            S22022=0;
            if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 339, column: 26
              thread31630(tdone,ends);
              thread31631(tdone,ends);
              int biggest31632 = 0;
              if(ends[44]>=biggest31632){
                biggest31632=ends[44];
              }
              if(ends[45]>=biggest31632){
                biggest31632=ends[45];
              }
              if(biggest31632 == 1){
                active[43]=1;
                ends[43]=1;
                tdone[43]=1;
              }
            }
            else {
              S22022=1;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31625(int [] tdone, int [] ends){
        switch(S22011){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S21955){
          case 0 : 
            switch(S21935){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 328, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
                  S21935=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  switch(S21930){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 328, column: 12
                        S21930=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
                          ends[42]=2;
                          ;//sysj\conveyor_controller.sysj line: 328, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 329, column: 15
                            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 330, column: 13
                            currsigs.addElement(bottleAtPos2_36);
                            S21955=1;
                            active[42]=1;
                            ends[42]=1;
                            tdone[42]=1;
                          }
                          else {
                            S21955=1;
                            active[42]=1;
                            ends[42]=1;
                            tdone[42]=1;
                          }
                        }
                        else {
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                      }
                      else {
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
                        ends[42]=2;
                        ;//sysj\conveyor_controller.sysj line: 328, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 329, column: 15
                          bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 330, column: 13
                          currsigs.addElement(bottleAtPos2_36);
                          S21955=1;
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                        else {
                          S21955=1;
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                      }
                      else {
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S21935=1;
                S21935=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 328, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
                  S21935=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  S21930=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 328, column: 12
                    S21930=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
                      ends[42]=2;
                      ;//sysj\conveyor_controller.sysj line: 328, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 329, column: 15
                        bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 330, column: 13
                        currsigs.addElement(bottleAtPos2_36);
                        S21955=1;
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      else {
                        S21955=1;
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                    }
                    else {
                      active[42]=1;
                      ends[42]=1;
                      tdone[42]=1;
                    }
                  }
                  else {
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S21955=1;
            S21955=0;
            S21935=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 328, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
              S21935=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            else {
              S21930=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 328, column: 12
                S21930=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
                  ends[42]=2;
                  ;//sysj\conveyor_controller.sysj line: 328, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 329, column: 15
                    bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 330, column: 13
                    currsigs.addElement(bottleAtPos2_36);
                    S21955=1;
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                  else {
                    S21955=1;
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                }
                else {
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
              }
              else {
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31623(int [] tdone, int [] ends){
        switch(S20212){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 307, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
        break;
      
    }
  }

  public void thread31622(int [] tdone, int [] ends){
        switch(S20207){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 303, column: 13
        currsigs.addElement(valveInletOnOff);
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
        break;
      
    }
  }

  public void thread31620(int [] tdone, int [] ends){
        S20212=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 307, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread31619(int [] tdone, int [] ends){
        S20207=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 302, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 303, column: 13
    currsigs.addElement(valveInletOnOff);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread31617(int [] tdone, int [] ends){
        switch(S20128){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 296, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
        break;
      
    }
  }

  public void thread31616(int [] tdone, int [] ends){
        switch(S20123){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 292, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
        break;
      
    }
  }

  public void thread31614(int [] tdone, int [] ends){
        S20212=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 307, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread31613(int [] tdone, int [] ends){
        S20207=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 302, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 303, column: 13
    currsigs.addElement(valveInletOnOff);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread31611(int [] tdone, int [] ends){
        S20128=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 296, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31610(int [] tdone, int [] ends){
        S20123=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 291, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 292, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31608(int [] tdone, int [] ends){
        S20128=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 296, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31607(int [] tdone, int [] ends){
        S20123=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 291, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 292, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31605(int [] tdone, int [] ends){
        S20128=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 296, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31604(int [] tdone, int [] ends){
        S20123=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 291, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 292, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31602(int [] tdone, int [] ends){
        S20128=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 296, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31601(int [] tdone, int [] ends){
        S20123=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 291, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 292, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31599(int [] tdone, int [] ends){
        S20128=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 296, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31598(int [] tdone, int [] ends){
        S20123=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 291, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 292, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31597(int [] tdone, int [] ends){
        switch(S21928){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S19999){
          case 0 : 
            if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 284, column: 17
              S19999=1;
              __start_thread_37 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 281, column: 9
              if(com.systemj.Timer.getMs() - __start_thread_37 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 281, column: 9
                ends[37]=2;
                ;//sysj\conveyor_controller.sysj line: 281, column: 9
                S19999=2;
                S20034=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 286, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 286, column: 11
                  S20034=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  S20029=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 286, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 286, column: 11
                    S20029=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 286, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 286, column: 11
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 286, column: 11
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 287, column: 11
                      S19999=3;
                      thread31598(tdone,ends);
                      thread31599(tdone,ends);
                      int biggest31600 = 0;
                      if(ends[38]>=biggest31600){
                        biggest31600=ends[38];
                      }
                      if(ends[39]>=biggest31600){
                        biggest31600=ends[39];
                      }
                      if(biggest31600 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                    }
                    else {
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
              }
              else {
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_37 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 281, column: 9
              ends[37]=2;
              ;//sysj\conveyor_controller.sysj line: 281, column: 9
              S19999=2;
              S20034=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 286, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 286, column: 11
                S20034=1;
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
              else {
                S20029=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 286, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 286, column: 11
                  S20029=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 286, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 286, column: 11
                    ends[37]=2;
                    ;//sysj\conveyor_controller.sysj line: 286, column: 11
                    System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 287, column: 11
                    S19999=3;
                    thread31601(tdone,ends);
                    thread31602(tdone,ends);
                    int biggest31603 = 0;
                    if(ends[38]>=biggest31603){
                      biggest31603=ends[38];
                    }
                    if(ends[39]>=biggest31603){
                      biggest31603=ends[39];
                    }
                    if(biggest31603 == 1){
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                else {
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
            }
            else {
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 2 : 
            switch(S20034){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 286, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 286, column: 11
                  S20034=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  switch(S20029){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 286, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 286, column: 11
                        S20029=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 286, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 286, column: 11
                          ends[37]=2;
                          ;//sysj\conveyor_controller.sysj line: 286, column: 11
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 287, column: 11
                          S19999=3;
                          thread31604(tdone,ends);
                          thread31605(tdone,ends);
                          int biggest31606 = 0;
                          if(ends[38]>=biggest31606){
                            biggest31606=ends[38];
                          }
                          if(ends[39]>=biggest31606){
                            biggest31606=ends[39];
                          }
                          if(biggest31606 == 1){
                            active[37]=1;
                            ends[37]=1;
                            tdone[37]=1;
                          }
                        }
                        else {
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                      }
                      else {
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 286, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 286, column: 11
                        ends[37]=2;
                        ;//sysj\conveyor_controller.sysj line: 286, column: 11
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 287, column: 11
                        S19999=3;
                        thread31607(tdone,ends);
                        thread31608(tdone,ends);
                        int biggest31609 = 0;
                        if(ends[38]>=biggest31609){
                          biggest31609=ends[38];
                        }
                        if(ends[39]>=biggest31609){
                          biggest31609=ends[39];
                        }
                        if(biggest31609 == 1){
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                      }
                      else {
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S20034=1;
                S20034=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 286, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 286, column: 11
                  S20034=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  S20029=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 286, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 286, column: 11
                    S20029=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 286, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 286, column: 11
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 286, column: 11
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 287, column: 11
                      S19999=3;
                      thread31610(tdone,ends);
                      thread31611(tdone,ends);
                      int biggest31612 = 0;
                      if(ends[38]>=biggest31612){
                        biggest31612=ends[38];
                      }
                      if(ends[39]>=biggest31612){
                        biggest31612=ends[39];
                      }
                      if(biggest31612 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                    }
                    else {
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 3 : 
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 289, column: 17
              S19999=4;
              thread31613(tdone,ends);
              thread31614(tdone,ends);
              int biggest31615 = 0;
              if(ends[40]>=biggest31615){
                biggest31615=ends[40];
              }
              if(ends[41]>=biggest31615){
                biggest31615=ends[41];
              }
              if(biggest31615 == 1){
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              thread31616(tdone,ends);
              thread31617(tdone,ends);
              int biggest31618 = 0;
              if(ends[38]>=biggest31618){
                biggest31618=ends[38];
              }
              if(ends[39]>=biggest31618){
                biggest31618=ends[39];
              }
              if(biggest31618 == 1){
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
              //FINXME code
              if(biggest31618 == 0){
                S19999=4;
                thread31619(tdone,ends);
                thread31620(tdone,ends);
                int biggest31621 = 0;
                if(ends[40]>=biggest31621){
                  biggest31621=ends[40];
                }
                if(ends[41]>=biggest31621){
                  biggest31621=ends[41];
                }
                if(biggest31621 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 300, column: 17
              S19999=5;
              S20248=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 311, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 311, column: 11
                S20248=1;
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
              else {
                S20243=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 311, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 311, column: 11
                  S20243=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 311, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 311, column: 11
                    ends[37]=2;
                    ;//sysj\conveyor_controller.sysj line: 311, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 312, column: 11
                    S19999=6;
                    S20321=0;
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                else {
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
            }
            else {
              thread31622(tdone,ends);
              thread31623(tdone,ends);
              int biggest31624 = 0;
              if(ends[40]>=biggest31624){
                biggest31624=ends[40];
              }
              if(ends[41]>=biggest31624){
                biggest31624=ends[41];
              }
              if(biggest31624 == 1){
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
              //FINXME code
              if(biggest31624 == 0){
                S19999=5;
                S20248=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 311, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 311, column: 11
                  S20248=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  S20243=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 311, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 311, column: 11
                    S20243=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 311, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 311, column: 11
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 311, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 312, column: 11
                      S19999=6;
                      S20321=0;
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                    else {
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
              }
            }
            break;
          
          case 5 : 
            switch(S20248){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 311, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 311, column: 11
                  S20248=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  switch(S20243){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 311, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 311, column: 11
                        S20243=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 311, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 311, column: 11
                          ends[37]=2;
                          ;//sysj\conveyor_controller.sysj line: 311, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 312, column: 11
                          S19999=6;
                          S20321=0;
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                        else {
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                      }
                      else {
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 311, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 311, column: 11
                        ends[37]=2;
                        ;//sysj\conveyor_controller.sysj line: 311, column: 11
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 312, column: 11
                        S19999=6;
                        S20321=0;
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
                }
                break;
              
              case 1 : 
                S20248=1;
                S20248=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 311, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 311, column: 11
                  S20248=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  S20243=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 311, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 311, column: 11
                    S20243=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 311, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 311, column: 11
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 311, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 312, column: 11
                      S19999=6;
                      S20321=0;
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                    else {
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S20321){
              case 0 : 
                if(!bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 315, column: 18
                  S20321=1;
                  if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 317, column: 21
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                  else {
                    ends[37]=2;
                    ;//sysj\conveyor_controller.sysj line: 314, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 283, column: 14
                    S19999=0;
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                else {
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 317, column: 21
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  ends[37]=2;
                  ;//sysj\conveyor_controller.sysj line: 314, column: 11
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 283, column: 14
                  S19999=0;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31594(int [] tdone, int [] ends){
        S22019=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31593(int [] tdone, int [] ends){
        S22016=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 342, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31592(int [] tdone, int [] ends){
        S22046=1;
    S22022=0;
    if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 339, column: 26
      thread31593(tdone,ends);
      thread31594(tdone,ends);
      int biggest31595 = 0;
      if(ends[44]>=biggest31595){
        biggest31595=ends[44];
      }
      if(ends[45]>=biggest31595){
        biggest31595=ends[45];
      }
      if(biggest31595 == 1){
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
    else {
      S22022=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread31591(int [] tdone, int [] ends){
        S22011=1;
    S21955=0;
    S21935=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 328, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
      S21935=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S21930=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 328, column: 12
        S21930=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 328, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 329, column: 15
            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 330, column: 13
            currsigs.addElement(bottleAtPos2_36);
            S21955=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
          else {
            S21955=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread31590(int [] tdone, int [] ends){
        S21928=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 283, column: 14
    S19999=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread31587(int [] tdone, int [] ends){
        S22019=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31586(int [] tdone, int [] ends){
        S22016=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 342, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31585(int [] tdone, int [] ends){
        S22046=1;
    S22022=0;
    if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 339, column: 26
      thread31586(tdone,ends);
      thread31587(tdone,ends);
      int biggest31588 = 0;
      if(ends[44]>=biggest31588){
        biggest31588=ends[44];
      }
      if(ends[45]>=biggest31588){
        biggest31588=ends[45];
      }
      if(biggest31588 == 1){
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
    else {
      S22022=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread31584(int [] tdone, int [] ends){
        S22011=1;
    S21955=0;
    S21935=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 328, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
      S21935=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S21930=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 328, column: 12
        S21930=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 328, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 329, column: 15
            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 330, column: 13
            currsigs.addElement(bottleAtPos2_36);
            S21955=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
          else {
            S21955=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread31583(int [] tdone, int [] ends){
        S21928=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 283, column: 14
    S19999=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread31580(int [] tdone, int [] ends){
        S22019=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31579(int [] tdone, int [] ends){
        S22016=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 342, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31578(int [] tdone, int [] ends){
        S22046=1;
    S22022=0;
    if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 339, column: 26
      thread31579(tdone,ends);
      thread31580(tdone,ends);
      int biggest31581 = 0;
      if(ends[44]>=biggest31581){
        biggest31581=ends[44];
      }
      if(ends[45]>=biggest31581){
        biggest31581=ends[45];
      }
      if(biggest31581 == 1){
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
    else {
      S22022=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread31577(int [] tdone, int [] ends){
        S22011=1;
    S21955=0;
    S21935=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 328, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
      S21935=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S21930=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 328, column: 12
        S21930=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 328, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 329, column: 15
            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 330, column: 13
            currsigs.addElement(bottleAtPos2_36);
            S21955=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
          else {
            S21955=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread31576(int [] tdone, int [] ends){
        S21928=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 283, column: 14
    S19999=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread31573(int [] tdone, int [] ends){
        S22019=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31572(int [] tdone, int [] ends){
        S22016=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 342, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31571(int [] tdone, int [] ends){
        S22046=1;
    S22022=0;
    if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 339, column: 26
      thread31572(tdone,ends);
      thread31573(tdone,ends);
      int biggest31574 = 0;
      if(ends[44]>=biggest31574){
        biggest31574=ends[44];
      }
      if(ends[45]>=biggest31574){
        biggest31574=ends[45];
      }
      if(biggest31574 == 1){
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
    else {
      S22022=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread31570(int [] tdone, int [] ends){
        S22011=1;
    S21955=0;
    S21935=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 328, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
      S21935=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S21930=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 328, column: 12
        S21930=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 328, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 328, column: 12
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 328, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 329, column: 15
            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 330, column: 13
            currsigs.addElement(bottleAtPos2_36);
            S21955=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
          else {
            S21955=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread31569(int [] tdone, int [] ends){
        S21928=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 283, column: 14
    S19999=0;
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
      switch(S28198){
        case 0 : 
          S28198=0;
          break RUN;
        
        case 1 : 
          S28198=2;
          S28198=2;
          bottleAtPos2_36.setClear();//sysj\conveyor_controller.sysj line: 276, column: 9
          S28197=0;
          S19981=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 278, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
            S19981=1;
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
          else {
            S19976=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 278, column: 9
              S19976=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
                ends[36]=2;
                ;//sysj\conveyor_controller.sysj line: 278, column: 9
                S28197=1;
                thread31569(tdone,ends);
                thread31570(tdone,ends);
                thread31571(tdone,ends);
                int biggest31575 = 0;
                if(ends[37]>=biggest31575){
                  biggest31575=ends[37];
                }
                if(ends[42]>=biggest31575){
                  biggest31575=ends[42];
                }
                if(ends[43]>=biggest31575){
                  biggest31575=ends[43];
                }
                if(biggest31575 == 1){
                  active[36]=1;
                  ends[36]=1;
                  break RUN;
                }
              }
              else {
                active[36]=1;
                ends[36]=1;
                break RUN;
              }
            }
            else {
              active[36]=1;
              ends[36]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos2_36.setClear();//sysj\conveyor_controller.sysj line: 276, column: 9
          switch(S28197){
            case 0 : 
              switch(S19981){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 278, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
                    S19981=1;
                    active[36]=1;
                    ends[36]=1;
                    break RUN;
                  }
                  else {
                    switch(S19976){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 278, column: 9
                          S19976=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
                            ends[36]=2;
                            ;//sysj\conveyor_controller.sysj line: 278, column: 9
                            S28197=1;
                            thread31576(tdone,ends);
                            thread31577(tdone,ends);
                            thread31578(tdone,ends);
                            int biggest31582 = 0;
                            if(ends[37]>=biggest31582){
                              biggest31582=ends[37];
                            }
                            if(ends[42]>=biggest31582){
                              biggest31582=ends[42];
                            }
                            if(ends[43]>=biggest31582){
                              biggest31582=ends[43];
                            }
                            if(biggest31582 == 1){
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[36]=1;
                            ends[36]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[36]=1;
                          ends[36]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
                          ends[36]=2;
                          ;//sysj\conveyor_controller.sysj line: 278, column: 9
                          S28197=1;
                          thread31583(tdone,ends);
                          thread31584(tdone,ends);
                          thread31585(tdone,ends);
                          int biggest31589 = 0;
                          if(ends[37]>=biggest31589){
                            biggest31589=ends[37];
                          }
                          if(ends[42]>=biggest31589){
                            biggest31589=ends[42];
                          }
                          if(ends[43]>=biggest31589){
                            biggest31589=ends[43];
                          }
                          if(biggest31589 == 1){
                            active[36]=1;
                            ends[36]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[36]=1;
                          ends[36]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S19981=1;
                  S19981=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 278, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
                    S19981=1;
                    active[36]=1;
                    ends[36]=1;
                    break RUN;
                  }
                  else {
                    S19976=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 278, column: 9
                      S19976=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
                        ends[36]=2;
                        ;//sysj\conveyor_controller.sysj line: 278, column: 9
                        S28197=1;
                        thread31590(tdone,ends);
                        thread31591(tdone,ends);
                        thread31592(tdone,ends);
                        int biggest31596 = 0;
                        if(ends[37]>=biggest31596){
                          biggest31596=ends[37];
                        }
                        if(ends[42]>=biggest31596){
                          biggest31596=ends[42];
                        }
                        if(ends[43]>=biggest31596){
                          biggest31596=ends[43];
                        }
                        if(biggest31596 == 1){
                          active[36]=1;
                          ends[36]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[36]=1;
                        ends[36]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[36]=1;
                      ends[36]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread31597(tdone,ends);
              thread31625(tdone,ends);
              thread31626(tdone,ends);
              int biggest31633 = 0;
              if(ends[37]>=biggest31633){
                biggest31633=ends[37];
              }
              if(ends[42]>=biggest31633){
                biggest31633=ends[42];
              }
              if(ends[43]>=biggest31633){
                biggest31633=ends[43];
              }
              if(biggest31633 == 1){
                active[36]=1;
                ends[36]=1;
                break RUN;
              }
              //FINXME code
              if(biggest31633 == 0){
                S28198=0;
                active[36]=0;
                ends[36]=0;
                S28198=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos2_36 = new Signal();
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
      bottleAtPos2_36.setpreclear();
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
      bottleAtPos2_36.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[36]!=0 || suspended[36]!=0 || active[36]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[36] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
