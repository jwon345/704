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
  private long __start_thread_37;//sysj\conveyor_controller.sysj line: 287, column: 9
  private int S23878 = 1;
  private int S23877 = 1;
  private int S15981 = 1;
  private int S15976 = 1;
  private int S17848 = 1;
  private int S15999 = 1;
  private int S16006 = 1;
  private int S16001 = 1;
  private int S16107 = 1;
  private int S16112 = 1;
  private int S16191 = 1;
  private int S16196 = 1;
  private int S16232 = 1;
  private int S16227 = 1;
  private int S16305 = 1;
  private int S17931 = 1;
  private int S17875 = 1;
  private int S17855 = 1;
  private int S17850 = 1;
  private int S17966 = 1;
  private int S17942 = 1;
  private int S17936 = 1;
  private int S17939 = 1;
  
  private int[] ends = new int[60];
  private int[] tdone = new int[60];
  
  public void thread30023(int [] tdone, int [] ends){
        S17939=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread30022(int [] tdone, int [] ends){
        S17936=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread30020(int [] tdone, int [] ends){
        switch(S17939){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 353, column: 35
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

  public void thread30019(int [] tdone, int [] ends){
        switch(S17936){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
        break;
      
    }
  }

  public void thread30018(int [] tdone, int [] ends){
        switch(S17966){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        switch(S17942){
          case 0 : 
            thread30019(tdone,ends);
            thread30020(tdone,ends);
            int biggest30021 = 0;
            if(ends[44]>=biggest30021){
              biggest30021=ends[44];
            }
            if(ends[45]>=biggest30021){
              biggest30021=ends[45];
            }
            if(biggest30021 == 1){
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            if(biggest30021 == 2){
              ends[43]=2;
              ;//sysj\conveyor_controller.sysj line: 347, column: 18
              S17942=1;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            //FINXME code
            if(biggest30021 == 0){
              S17942=1;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            break;
          
          case 1 : 
            S17942=1;
            S17942=0;
            if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 346, column: 26
              thread30022(tdone,ends);
              thread30023(tdone,ends);
              int biggest30024 = 0;
              if(ends[44]>=biggest30024){
                biggest30024=ends[44];
              }
              if(ends[45]>=biggest30024){
                biggest30024=ends[45];
              }
              if(biggest30024 == 1){
                active[43]=1;
                ends[43]=1;
                tdone[43]=1;
              }
            }
            else {
              S17942=1;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread30017(int [] tdone, int [] ends){
        switch(S17931){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S17875){
          case 0 : 
            switch(S17855){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 335, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
                  S17855=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  switch(S17850){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 335, column: 12
                        S17850=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
                          ends[42]=2;
                          ;//sysj\conveyor_controller.sysj line: 335, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 336, column: 15
                            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 337, column: 13
                            currsigs.addElement(bottleAtPos2_36);
                            S17875=1;
                            active[42]=1;
                            ends[42]=1;
                            tdone[42]=1;
                          }
                          else {
                            S17875=1;
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
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
                        ends[42]=2;
                        ;//sysj\conveyor_controller.sysj line: 335, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 336, column: 15
                          bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 337, column: 13
                          currsigs.addElement(bottleAtPos2_36);
                          S17875=1;
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                        else {
                          S17875=1;
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
                S17855=1;
                S17855=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 335, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
                  S17855=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  S17850=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 335, column: 12
                    S17850=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
                      ends[42]=2;
                      ;//sysj\conveyor_controller.sysj line: 335, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 336, column: 15
                        bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 337, column: 13
                        currsigs.addElement(bottleAtPos2_36);
                        S17875=1;
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      else {
                        S17875=1;
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
            S17875=1;
            S17875=0;
            S17855=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 335, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
              S17855=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            else {
              S17850=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 335, column: 12
                S17850=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
                  ends[42]=2;
                  ;//sysj\conveyor_controller.sysj line: 335, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 336, column: 15
                    bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 337, column: 13
                    currsigs.addElement(bottleAtPos2_36);
                    S17875=1;
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                  else {
                    S17875=1;
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

  public void thread30015(int [] tdone, int [] ends){
        switch(S16196){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 314, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
        break;
      
    }
  }

  public void thread30014(int [] tdone, int [] ends){
        switch(S16191){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 310, column: 13
        currsigs.addElement(valveInletOnOff);
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
        break;
      
    }
  }

  public void thread30012(int [] tdone, int [] ends){
        S16196=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 314, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread30011(int [] tdone, int [] ends){
        S16191=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 309, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 310, column: 13
    currsigs.addElement(valveInletOnOff);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread30009(int [] tdone, int [] ends){
        switch(S16112){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 303, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
        break;
      
    }
  }

  public void thread30008(int [] tdone, int [] ends){
        switch(S16107){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 299, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
        break;
      
    }
  }

  public void thread30006(int [] tdone, int [] ends){
        S16196=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 314, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread30005(int [] tdone, int [] ends){
        S16191=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 309, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 310, column: 13
    currsigs.addElement(valveInletOnOff);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread30003(int [] tdone, int [] ends){
        S16112=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 303, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread30002(int [] tdone, int [] ends){
        S16107=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 298, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 299, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread30000(int [] tdone, int [] ends){
        S16112=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 303, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread29999(int [] tdone, int [] ends){
        S16107=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 298, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 299, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread29997(int [] tdone, int [] ends){
        S16112=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 303, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread29996(int [] tdone, int [] ends){
        S16107=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 298, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 299, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread29994(int [] tdone, int [] ends){
        S16112=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 303, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread29993(int [] tdone, int [] ends){
        S16107=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 298, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 299, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread29991(int [] tdone, int [] ends){
        S16112=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 303, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread29990(int [] tdone, int [] ends){
        S16107=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 298, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 299, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread29989(int [] tdone, int [] ends){
        switch(S17848){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S15999){
          case 0 : 
            if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 290, column: 17
              S15999=1;
              S16006=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 291, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 11
                S16006=1;
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
              else {
                S16001=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 291, column: 11
                  S16001=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 11
                    ends[37]=2;
                    ;//sysj\conveyor_controller.sysj line: 291, column: 11
                    S15999=2;
                    __start_thread_37 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 287, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_37 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 287, column: 9
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 287, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 294, column: 11
                      S15999=3;
                      thread29990(tdone,ends);
                      thread29991(tdone,ends);
                      int biggest29992 = 0;
                      if(ends[38]>=biggest29992){
                        biggest29992=ends[38];
                      }
                      if(ends[39]>=biggest29992){
                        biggest29992=ends[39];
                      }
                      if(biggest29992 == 1){
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
          
          case 1 : 
            switch(S16006){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 291, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 11
                  S16006=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  switch(S16001){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 291, column: 11
                        S16001=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 11
                          ends[37]=2;
                          ;//sysj\conveyor_controller.sysj line: 291, column: 11
                          S15999=2;
                          __start_thread_37 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 287, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_37 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 287, column: 9
                            ends[37]=2;
                            ;//sysj\conveyor_controller.sysj line: 287, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 294, column: 11
                            S15999=3;
                            thread29993(tdone,ends);
                            thread29994(tdone,ends);
                            int biggest29995 = 0;
                            if(ends[38]>=biggest29995){
                              biggest29995=ends[38];
                            }
                            if(ends[39]>=biggest29995){
                              biggest29995=ends[39];
                            }
                            if(biggest29995 == 1){
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
                      else {
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 11
                        ends[37]=2;
                        ;//sysj\conveyor_controller.sysj line: 291, column: 11
                        S15999=2;
                        __start_thread_37 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 287, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_37 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 287, column: 9
                          ends[37]=2;
                          ;//sysj\conveyor_controller.sysj line: 287, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 294, column: 11
                          S15999=3;
                          thread29996(tdone,ends);
                          thread29997(tdone,ends);
                          int biggest29998 = 0;
                          if(ends[38]>=biggest29998){
                            biggest29998=ends[38];
                          }
                          if(ends[39]>=biggest29998){
                            biggest29998=ends[39];
                          }
                          if(biggest29998 == 1){
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
                    
                  }
                }
                break;
              
              case 1 : 
                S16006=1;
                S16006=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 291, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 11
                  S16006=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  S16001=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 291, column: 11
                    S16001=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 11
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 291, column: 11
                      S15999=2;
                      __start_thread_37 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 287, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_37 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 287, column: 9
                        ends[37]=2;
                        ;//sysj\conveyor_controller.sysj line: 287, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 294, column: 11
                        S15999=3;
                        thread29999(tdone,ends);
                        thread30000(tdone,ends);
                        int biggest30001 = 0;
                        if(ends[38]>=biggest30001){
                          biggest30001=ends[38];
                        }
                        if(ends[39]>=biggest30001){
                          biggest30001=ends[39];
                        }
                        if(biggest30001 == 1){
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
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_37 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 287, column: 9
              ends[37]=2;
              ;//sysj\conveyor_controller.sysj line: 287, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 294, column: 11
              S15999=3;
              thread30002(tdone,ends);
              thread30003(tdone,ends);
              int biggest30004 = 0;
              if(ends[38]>=biggest30004){
                biggest30004=ends[38];
              }
              if(ends[39]>=biggest30004){
                biggest30004=ends[39];
              }
              if(biggest30004 == 1){
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
          
          case 3 : 
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 296, column: 17
              S15999=4;
              thread30005(tdone,ends);
              thread30006(tdone,ends);
              int biggest30007 = 0;
              if(ends[40]>=biggest30007){
                biggest30007=ends[40];
              }
              if(ends[41]>=biggest30007){
                biggest30007=ends[41];
              }
              if(biggest30007 == 1){
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              thread30008(tdone,ends);
              thread30009(tdone,ends);
              int biggest30010 = 0;
              if(ends[38]>=biggest30010){
                biggest30010=ends[38];
              }
              if(ends[39]>=biggest30010){
                biggest30010=ends[39];
              }
              if(biggest30010 == 1){
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
              //FINXME code
              if(biggest30010 == 0){
                S15999=4;
                thread30011(tdone,ends);
                thread30012(tdone,ends);
                int biggest30013 = 0;
                if(ends[40]>=biggest30013){
                  biggest30013=ends[40];
                }
                if(ends[41]>=biggest30013){
                  biggest30013=ends[41];
                }
                if(biggest30013 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 17
              S15999=5;
              S16232=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 318, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 318, column: 11
                S16232=1;
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
              else {
                S16227=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 318, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 318, column: 11
                  S16227=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 318, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 318, column: 11
                    ends[37]=2;
                    ;//sysj\conveyor_controller.sysj line: 318, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 319, column: 11
                    S15999=6;
                    S16305=0;
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
              thread30014(tdone,ends);
              thread30015(tdone,ends);
              int biggest30016 = 0;
              if(ends[40]>=biggest30016){
                biggest30016=ends[40];
              }
              if(ends[41]>=biggest30016){
                biggest30016=ends[41];
              }
              if(biggest30016 == 1){
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
              //FINXME code
              if(biggest30016 == 0){
                S15999=5;
                S16232=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 318, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 318, column: 11
                  S16232=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  S16227=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 318, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 318, column: 11
                    S16227=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 318, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 318, column: 11
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 318, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 319, column: 11
                      S15999=6;
                      S16305=0;
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
            switch(S16232){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 318, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 318, column: 11
                  S16232=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  switch(S16227){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 318, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 318, column: 11
                        S16227=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 318, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 318, column: 11
                          ends[37]=2;
                          ;//sysj\conveyor_controller.sysj line: 318, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 319, column: 11
                          S15999=6;
                          S16305=0;
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
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 318, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 318, column: 11
                        ends[37]=2;
                        ;//sysj\conveyor_controller.sysj line: 318, column: 11
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 319, column: 11
                        S15999=6;
                        S16305=0;
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
                S16232=1;
                S16232=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 318, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 318, column: 11
                  S16232=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  S16227=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 318, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 318, column: 11
                    S16227=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 318, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 318, column: 11
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 318, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 319, column: 11
                      S15999=6;
                      S16305=0;
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
            switch(S16305){
              case 0 : 
                if(!bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 322, column: 18
                  S16305=1;
                  if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 324, column: 21
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                  else {
                    ends[37]=2;
                    ;//sysj\conveyor_controller.sysj line: 321, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 289, column: 14
                    S15999=0;
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
                if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 324, column: 21
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  ends[37]=2;
                  ;//sysj\conveyor_controller.sysj line: 321, column: 11
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 289, column: 14
                  S15999=0;
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

  public void thread29986(int [] tdone, int [] ends){
        S17939=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread29985(int [] tdone, int [] ends){
        S17936=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread29984(int [] tdone, int [] ends){
        S17966=1;
    S17942=0;
    if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 346, column: 26
      thread29985(tdone,ends);
      thread29986(tdone,ends);
      int biggest29987 = 0;
      if(ends[44]>=biggest29987){
        biggest29987=ends[44];
      }
      if(ends[45]>=biggest29987){
        biggest29987=ends[45];
      }
      if(biggest29987 == 1){
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
    else {
      S17942=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread29983(int [] tdone, int [] ends){
        S17931=1;
    S17875=0;
    S17855=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 335, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
      S17855=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S17850=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 335, column: 12
        S17850=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 335, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 336, column: 15
            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 337, column: 13
            currsigs.addElement(bottleAtPos2_36);
            S17875=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
          else {
            S17875=1;
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

  public void thread29982(int [] tdone, int [] ends){
        S17848=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 289, column: 14
    S15999=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread29979(int [] tdone, int [] ends){
        S17939=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread29978(int [] tdone, int [] ends){
        S17936=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread29977(int [] tdone, int [] ends){
        S17966=1;
    S17942=0;
    if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 346, column: 26
      thread29978(tdone,ends);
      thread29979(tdone,ends);
      int biggest29980 = 0;
      if(ends[44]>=biggest29980){
        biggest29980=ends[44];
      }
      if(ends[45]>=biggest29980){
        biggest29980=ends[45];
      }
      if(biggest29980 == 1){
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
    else {
      S17942=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread29976(int [] tdone, int [] ends){
        S17931=1;
    S17875=0;
    S17855=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 335, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
      S17855=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S17850=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 335, column: 12
        S17850=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 335, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 336, column: 15
            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 337, column: 13
            currsigs.addElement(bottleAtPos2_36);
            S17875=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
          else {
            S17875=1;
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

  public void thread29975(int [] tdone, int [] ends){
        S17848=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 289, column: 14
    S15999=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread29972(int [] tdone, int [] ends){
        S17939=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread29971(int [] tdone, int [] ends){
        S17936=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread29970(int [] tdone, int [] ends){
        S17966=1;
    S17942=0;
    if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 346, column: 26
      thread29971(tdone,ends);
      thread29972(tdone,ends);
      int biggest29973 = 0;
      if(ends[44]>=biggest29973){
        biggest29973=ends[44];
      }
      if(ends[45]>=biggest29973){
        biggest29973=ends[45];
      }
      if(biggest29973 == 1){
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
    else {
      S17942=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread29969(int [] tdone, int [] ends){
        S17931=1;
    S17875=0;
    S17855=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 335, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
      S17855=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S17850=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 335, column: 12
        S17850=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 335, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 336, column: 15
            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 337, column: 13
            currsigs.addElement(bottleAtPos2_36);
            S17875=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
          else {
            S17875=1;
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

  public void thread29968(int [] tdone, int [] ends){
        S17848=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 289, column: 14
    S15999=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread29965(int [] tdone, int [] ends){
        S17939=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread29964(int [] tdone, int [] ends){
        S17936=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 349, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread29963(int [] tdone, int [] ends){
        S17966=1;
    S17942=0;
    if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 346, column: 26
      thread29964(tdone,ends);
      thread29965(tdone,ends);
      int biggest29966 = 0;
      if(ends[44]>=biggest29966){
        biggest29966=ends[44];
      }
      if(ends[45]>=biggest29966){
        biggest29966=ends[45];
      }
      if(biggest29966 == 1){
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
    else {
      S17942=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread29962(int [] tdone, int [] ends){
        S17931=1;
    S17875=0;
    S17855=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 335, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
      S17855=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S17850=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 335, column: 12
        S17850=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 335, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 335, column: 12
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 335, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 336, column: 15
            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 337, column: 13
            currsigs.addElement(bottleAtPos2_36);
            S17875=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
          else {
            S17875=1;
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

  public void thread29961(int [] tdone, int [] ends){
        S17848=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 289, column: 14
    S15999=0;
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
      switch(S23878){
        case 0 : 
          S23878=0;
          break RUN;
        
        case 1 : 
          S23878=2;
          S23878=2;
          bottleAtPos2_36.setClear();//sysj\conveyor_controller.sysj line: 283, column: 9
          S23877=0;
          S15981=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 284, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 9
            S15981=1;
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
          else {
            S15976=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 284, column: 9
              S15976=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 9
                ends[36]=2;
                ;//sysj\conveyor_controller.sysj line: 284, column: 9
                S23877=1;
                thread29961(tdone,ends);
                thread29962(tdone,ends);
                thread29963(tdone,ends);
                int biggest29967 = 0;
                if(ends[37]>=biggest29967){
                  biggest29967=ends[37];
                }
                if(ends[42]>=biggest29967){
                  biggest29967=ends[42];
                }
                if(ends[43]>=biggest29967){
                  biggest29967=ends[43];
                }
                if(biggest29967 == 1){
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
          bottleAtPos2_36.setClear();//sysj\conveyor_controller.sysj line: 283, column: 9
          switch(S23877){
            case 0 : 
              switch(S15981){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 284, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 9
                    S15981=1;
                    active[36]=1;
                    ends[36]=1;
                    break RUN;
                  }
                  else {
                    switch(S15976){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 284, column: 9
                          S15976=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 9
                            ends[36]=2;
                            ;//sysj\conveyor_controller.sysj line: 284, column: 9
                            S23877=1;
                            thread29968(tdone,ends);
                            thread29969(tdone,ends);
                            thread29970(tdone,ends);
                            int biggest29974 = 0;
                            if(ends[37]>=biggest29974){
                              biggest29974=ends[37];
                            }
                            if(ends[42]>=biggest29974){
                              biggest29974=ends[42];
                            }
                            if(ends[43]>=biggest29974){
                              biggest29974=ends[43];
                            }
                            if(biggest29974 == 1){
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
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 9
                          ends[36]=2;
                          ;//sysj\conveyor_controller.sysj line: 284, column: 9
                          S23877=1;
                          thread29975(tdone,ends);
                          thread29976(tdone,ends);
                          thread29977(tdone,ends);
                          int biggest29981 = 0;
                          if(ends[37]>=biggest29981){
                            biggest29981=ends[37];
                          }
                          if(ends[42]>=biggest29981){
                            biggest29981=ends[42];
                          }
                          if(ends[43]>=biggest29981){
                            biggest29981=ends[43];
                          }
                          if(biggest29981 == 1){
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
                  S15981=1;
                  S15981=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 284, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 9
                    S15981=1;
                    active[36]=1;
                    ends[36]=1;
                    break RUN;
                  }
                  else {
                    S15976=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 284, column: 9
                      S15976=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 9
                        ends[36]=2;
                        ;//sysj\conveyor_controller.sysj line: 284, column: 9
                        S23877=1;
                        thread29982(tdone,ends);
                        thread29983(tdone,ends);
                        thread29984(tdone,ends);
                        int biggest29988 = 0;
                        if(ends[37]>=biggest29988){
                          biggest29988=ends[37];
                        }
                        if(ends[42]>=biggest29988){
                          biggest29988=ends[42];
                        }
                        if(ends[43]>=biggest29988){
                          biggest29988=ends[43];
                        }
                        if(biggest29988 == 1){
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
              thread29989(tdone,ends);
              thread30017(tdone,ends);
              thread30018(tdone,ends);
              int biggest30025 = 0;
              if(ends[37]>=biggest30025){
                biggest30025=ends[37];
              }
              if(ends[42]>=biggest30025){
                biggest30025=ends[42];
              }
              if(ends[43]>=biggest30025){
                biggest30025=ends[43];
              }
              if(biggest30025 == 1){
                active[36]=1;
                ends[36]=1;
                break RUN;
              }
              //FINXME code
              if(biggest30025 == 0){
                S23878=0;
                active[36]=0;
                ends[36]=0;
                S23878=0;
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
