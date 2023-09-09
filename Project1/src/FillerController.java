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
  private Signal bottleAtPos2_31;
  private long __start_thread_32;//sysj\conveyor_controller.sysj line: 254, column: 9
  private int S21346 = 1;
  private int S21345 = 1;
  private int S13385 = 1;
  private int S13380 = 1;
  private int S15268 = 1;
  private int S13403 = 1;
  private int S13438 = 1;
  private int S13433 = 1;
  private int S13527 = 1;
  private int S13532 = 1;
  private int S13611 = 1;
  private int S13616 = 1;
  private int S13652 = 1;
  private int S13647 = 1;
  private int S15351 = 1;
  private int S15295 = 1;
  private int S15275 = 1;
  private int S15270 = 1;
  private int S15386 = 1;
  private int S15362 = 1;
  private int S15356 = 1;
  private int S15359 = 1;
  
  private int[] ends = new int[55];
  private int[] tdone = new int[55];
  
  public void thread24736(int [] tdone, int [] ends){
        S15359=1;
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread24735(int [] tdone, int [] ends){
        S15356=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 307, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread24733(int [] tdone, int [] ends){
        switch(S15359){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 311, column: 35
          ends[40]=2;
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

  public void thread24732(int [] tdone, int [] ends){
        switch(S15356){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 307, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
        break;
      
    }
  }

  public void thread24731(int [] tdone, int [] ends){
        switch(S15386){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S15362){
          case 0 : 
            thread24732(tdone,ends);
            thread24733(tdone,ends);
            int biggest24734 = 0;
            if(ends[39]>=biggest24734){
              biggest24734=ends[39];
            }
            if(ends[40]>=biggest24734){
              biggest24734=ends[40];
            }
            if(biggest24734 == 1){
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            if(biggest24734 == 2){
              ends[38]=2;
              ;//sysj\conveyor_controller.sysj line: 305, column: 18
              S15362=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            //FINXME code
            if(biggest24734 == 0){
              S15362=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 1 : 
            S15362=1;
            S15362=0;
            if(bottleAtPos2_31.getprestatus()){//sysj\conveyor_controller.sysj line: 304, column: 26
              thread24735(tdone,ends);
              thread24736(tdone,ends);
              int biggest24737 = 0;
              if(ends[39]>=biggest24737){
                biggest24737=ends[39];
              }
              if(ends[40]>=biggest24737){
                biggest24737=ends[40];
              }
              if(biggest24737 == 1){
                active[38]=1;
                ends[38]=1;
                tdone[38]=1;
              }
            }
            else {
              S15362=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24730(int [] tdone, int [] ends){
        switch(S15351){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S15295){
          case 0 : 
            switch(S15275){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 293, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
                  S15275=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  switch(S15270){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 293, column: 12
                        S15270=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
                          ends[37]=2;
                          ;//sysj\conveyor_controller.sysj line: 293, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 294, column: 15
                            bottleAtPos2_31.setPresent();//sysj\conveyor_controller.sysj line: 295, column: 13
                            currsigs.addElement(bottleAtPos2_31);
                            S15295=1;
                            active[37]=1;
                            ends[37]=1;
                            tdone[37]=1;
                          }
                          else {
                            S15295=1;
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
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
                        ends[37]=2;
                        ;//sysj\conveyor_controller.sysj line: 293, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 294, column: 15
                          bottleAtPos2_31.setPresent();//sysj\conveyor_controller.sysj line: 295, column: 13
                          currsigs.addElement(bottleAtPos2_31);
                          S15295=1;
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                        else {
                          S15295=1;
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
                S15275=1;
                S15275=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 293, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
                  S15275=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  S15270=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 293, column: 12
                    S15270=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 293, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 294, column: 15
                        bottleAtPos2_31.setPresent();//sysj\conveyor_controller.sysj line: 295, column: 13
                        currsigs.addElement(bottleAtPos2_31);
                        S15295=1;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      else {
                        S15295=1;
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
          
          case 1 : 
            S15295=1;
            S15295=0;
            S15275=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 293, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
              S15275=1;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              S15270=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 293, column: 12
                S15270=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
                  ends[37]=2;
                  ;//sysj\conveyor_controller.sysj line: 293, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 294, column: 15
                    bottleAtPos2_31.setPresent();//sysj\conveyor_controller.sysj line: 295, column: 13
                    currsigs.addElement(bottleAtPos2_31);
                    S15295=1;
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                  else {
                    S15295=1;
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
      
    }
  }

  public void thread24728(int [] tdone, int [] ends){
        switch(S13616){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 280, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
        break;
      
    }
  }

  public void thread24727(int [] tdone, int [] ends){
        switch(S13611){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 276, column: 13
        currsigs.addElement(valveInletOnOff);
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
        break;
      
    }
  }

  public void thread24725(int [] tdone, int [] ends){
        S13616=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 280, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread24724(int [] tdone, int [] ends){
        S13611=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 275, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 276, column: 13
    currsigs.addElement(valveInletOnOff);
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread24722(int [] tdone, int [] ends){
        switch(S13532){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 269, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[34]=1;
        ends[34]=1;
        tdone[34]=1;
        break;
      
    }
  }

  public void thread24721(int [] tdone, int [] ends){
        switch(S13527){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 265, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
        break;
      
    }
  }

  public void thread24719(int [] tdone, int [] ends){
        S13616=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 280, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread24718(int [] tdone, int [] ends){
        S13611=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 275, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 276, column: 13
    currsigs.addElement(valveInletOnOff);
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread24716(int [] tdone, int [] ends){
        S13532=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 269, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread24715(int [] tdone, int [] ends){
        S13527=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 264, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 265, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread24713(int [] tdone, int [] ends){
        S13532=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 269, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread24712(int [] tdone, int [] ends){
        S13527=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 264, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 265, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread24710(int [] tdone, int [] ends){
        S13532=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 269, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread24709(int [] tdone, int [] ends){
        S13527=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 264, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 265, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread24707(int [] tdone, int [] ends){
        S13532=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 269, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread24706(int [] tdone, int [] ends){
        S13527=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 264, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 265, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread24704(int [] tdone, int [] ends){
        S13532=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 269, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread24703(int [] tdone, int [] ends){
        S13527=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 264, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 265, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread24702(int [] tdone, int [] ends){
        switch(S15268){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S13403){
          case 0 : 
            if(bottleAtPos2_31.getprestatus()){//sysj\conveyor_controller.sysj line: 257, column: 17
              S13403=1;
              __start_thread_32 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 254, column: 9
              if(com.systemj.Timer.getMs() - __start_thread_32 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 254, column: 9
                ends[32]=2;
                ;//sysj\conveyor_controller.sysj line: 254, column: 9
                S13403=2;
                S13438=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 259, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 259, column: 11
                  S13438=1;
                  active[32]=1;
                  ends[32]=1;
                  tdone[32]=1;
                }
                else {
                  S13433=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 259, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 259, column: 11
                    S13433=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 259, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 259, column: 11
                      ends[32]=2;
                      ;//sysj\conveyor_controller.sysj line: 259, column: 11
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 260, column: 11
                      S13403=3;
                      thread24703(tdone,ends);
                      thread24704(tdone,ends);
                      int biggest24705 = 0;
                      if(ends[33]>=biggest24705){
                        biggest24705=ends[33];
                      }
                      if(ends[34]>=biggest24705){
                        biggest24705=ends[34];
                      }
                      if(biggest24705 == 1){
                        active[32]=1;
                        ends[32]=1;
                        tdone[32]=1;
                      }
                    }
                    else {
                      active[32]=1;
                      ends[32]=1;
                      tdone[32]=1;
                    }
                  }
                  else {
                    active[32]=1;
                    ends[32]=1;
                    tdone[32]=1;
                  }
                }
              }
              else {
                active[32]=1;
                ends[32]=1;
                tdone[32]=1;
              }
            }
            else {
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_32 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 254, column: 9
              ends[32]=2;
              ;//sysj\conveyor_controller.sysj line: 254, column: 9
              S13403=2;
              S13438=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 259, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 259, column: 11
                S13438=1;
                active[32]=1;
                ends[32]=1;
                tdone[32]=1;
              }
              else {
                S13433=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 259, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 259, column: 11
                  S13433=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 259, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 259, column: 11
                    ends[32]=2;
                    ;//sysj\conveyor_controller.sysj line: 259, column: 11
                    System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 260, column: 11
                    S13403=3;
                    thread24706(tdone,ends);
                    thread24707(tdone,ends);
                    int biggest24708 = 0;
                    if(ends[33]>=biggest24708){
                      biggest24708=ends[33];
                    }
                    if(ends[34]>=biggest24708){
                      biggest24708=ends[34];
                    }
                    if(biggest24708 == 1){
                      active[32]=1;
                      ends[32]=1;
                      tdone[32]=1;
                    }
                  }
                  else {
                    active[32]=1;
                    ends[32]=1;
                    tdone[32]=1;
                  }
                }
                else {
                  active[32]=1;
                  ends[32]=1;
                  tdone[32]=1;
                }
              }
            }
            else {
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
          case 2 : 
            switch(S13438){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 259, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 259, column: 11
                  S13438=1;
                  active[32]=1;
                  ends[32]=1;
                  tdone[32]=1;
                }
                else {
                  switch(S13433){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 259, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 259, column: 11
                        S13433=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 259, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 259, column: 11
                          ends[32]=2;
                          ;//sysj\conveyor_controller.sysj line: 259, column: 11
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 260, column: 11
                          S13403=3;
                          thread24709(tdone,ends);
                          thread24710(tdone,ends);
                          int biggest24711 = 0;
                          if(ends[33]>=biggest24711){
                            biggest24711=ends[33];
                          }
                          if(ends[34]>=biggest24711){
                            biggest24711=ends[34];
                          }
                          if(biggest24711 == 1){
                            active[32]=1;
                            ends[32]=1;
                            tdone[32]=1;
                          }
                        }
                        else {
                          active[32]=1;
                          ends[32]=1;
                          tdone[32]=1;
                        }
                      }
                      else {
                        active[32]=1;
                        ends[32]=1;
                        tdone[32]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 259, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 259, column: 11
                        ends[32]=2;
                        ;//sysj\conveyor_controller.sysj line: 259, column: 11
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 260, column: 11
                        S13403=3;
                        thread24712(tdone,ends);
                        thread24713(tdone,ends);
                        int biggest24714 = 0;
                        if(ends[33]>=biggest24714){
                          biggest24714=ends[33];
                        }
                        if(ends[34]>=biggest24714){
                          biggest24714=ends[34];
                        }
                        if(biggest24714 == 1){
                          active[32]=1;
                          ends[32]=1;
                          tdone[32]=1;
                        }
                      }
                      else {
                        active[32]=1;
                        ends[32]=1;
                        tdone[32]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S13438=1;
                S13438=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 259, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 259, column: 11
                  S13438=1;
                  active[32]=1;
                  ends[32]=1;
                  tdone[32]=1;
                }
                else {
                  S13433=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 259, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 259, column: 11
                    S13433=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 259, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 259, column: 11
                      ends[32]=2;
                      ;//sysj\conveyor_controller.sysj line: 259, column: 11
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 260, column: 11
                      S13403=3;
                      thread24715(tdone,ends);
                      thread24716(tdone,ends);
                      int biggest24717 = 0;
                      if(ends[33]>=biggest24717){
                        biggest24717=ends[33];
                      }
                      if(ends[34]>=biggest24717){
                        biggest24717=ends[34];
                      }
                      if(biggest24717 == 1){
                        active[32]=1;
                        ends[32]=1;
                        tdone[32]=1;
                      }
                    }
                    else {
                      active[32]=1;
                      ends[32]=1;
                      tdone[32]=1;
                    }
                  }
                  else {
                    active[32]=1;
                    ends[32]=1;
                    tdone[32]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 3 : 
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 262, column: 17
              S13403=4;
              thread24718(tdone,ends);
              thread24719(tdone,ends);
              int biggest24720 = 0;
              if(ends[35]>=biggest24720){
                biggest24720=ends[35];
              }
              if(ends[36]>=biggest24720){
                biggest24720=ends[36];
              }
              if(biggest24720 == 1){
                active[32]=1;
                ends[32]=1;
                tdone[32]=1;
              }
            }
            else {
              thread24721(tdone,ends);
              thread24722(tdone,ends);
              int biggest24723 = 0;
              if(ends[33]>=biggest24723){
                biggest24723=ends[33];
              }
              if(ends[34]>=biggest24723){
                biggest24723=ends[34];
              }
              if(biggest24723 == 1){
                active[32]=1;
                ends[32]=1;
                tdone[32]=1;
              }
              //FINXME code
              if(biggest24723 == 0){
                S13403=4;
                thread24724(tdone,ends);
                thread24725(tdone,ends);
                int biggest24726 = 0;
                if(ends[35]>=biggest24726){
                  biggest24726=ends[35];
                }
                if(ends[36]>=biggest24726){
                  biggest24726=ends[36];
                }
                if(biggest24726 == 1){
                  active[32]=1;
                  ends[32]=1;
                  tdone[32]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 273, column: 17
              S13403=5;
              S13652=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 284, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 11
                S13652=1;
                active[32]=1;
                ends[32]=1;
                tdone[32]=1;
              }
              else {
                S13647=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 284, column: 11
                  S13647=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 11
                    ends[32]=2;
                    ;//sysj\conveyor_controller.sysj line: 284, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 285, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 256, column: 14
                    S13403=0;
                    active[32]=1;
                    ends[32]=1;
                    tdone[32]=1;
                  }
                  else {
                    active[32]=1;
                    ends[32]=1;
                    tdone[32]=1;
                  }
                }
                else {
                  active[32]=1;
                  ends[32]=1;
                  tdone[32]=1;
                }
              }
            }
            else {
              thread24727(tdone,ends);
              thread24728(tdone,ends);
              int biggest24729 = 0;
              if(ends[35]>=biggest24729){
                biggest24729=ends[35];
              }
              if(ends[36]>=biggest24729){
                biggest24729=ends[36];
              }
              if(biggest24729 == 1){
                active[32]=1;
                ends[32]=1;
                tdone[32]=1;
              }
              //FINXME code
              if(biggest24729 == 0){
                S13403=5;
                S13652=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 284, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 11
                  S13652=1;
                  active[32]=1;
                  ends[32]=1;
                  tdone[32]=1;
                }
                else {
                  S13647=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 284, column: 11
                    S13647=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 11
                      ends[32]=2;
                      ;//sysj\conveyor_controller.sysj line: 284, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 285, column: 11
                      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 256, column: 14
                      S13403=0;
                      active[32]=1;
                      ends[32]=1;
                      tdone[32]=1;
                    }
                    else {
                      active[32]=1;
                      ends[32]=1;
                      tdone[32]=1;
                    }
                  }
                  else {
                    active[32]=1;
                    ends[32]=1;
                    tdone[32]=1;
                  }
                }
              }
            }
            break;
          
          case 5 : 
            switch(S13652){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 284, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 11
                  S13652=1;
                  active[32]=1;
                  ends[32]=1;
                  tdone[32]=1;
                }
                else {
                  switch(S13647){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 284, column: 11
                        S13647=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 11
                          ends[32]=2;
                          ;//sysj\conveyor_controller.sysj line: 284, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 285, column: 11
                          System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 256, column: 14
                          S13403=0;
                          active[32]=1;
                          ends[32]=1;
                          tdone[32]=1;
                        }
                        else {
                          active[32]=1;
                          ends[32]=1;
                          tdone[32]=1;
                        }
                      }
                      else {
                        active[32]=1;
                        ends[32]=1;
                        tdone[32]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 11
                        ends[32]=2;
                        ;//sysj\conveyor_controller.sysj line: 284, column: 11
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 285, column: 11
                        System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 256, column: 14
                        S13403=0;
                        active[32]=1;
                        ends[32]=1;
                        tdone[32]=1;
                      }
                      else {
                        active[32]=1;
                        ends[32]=1;
                        tdone[32]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S13652=1;
                S13652=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 284, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 11
                  S13652=1;
                  active[32]=1;
                  ends[32]=1;
                  tdone[32]=1;
                }
                else {
                  S13647=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 284, column: 11
                    S13647=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 284, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 284, column: 11
                      ends[32]=2;
                      ;//sysj\conveyor_controller.sysj line: 284, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 285, column: 11
                      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 256, column: 14
                      S13403=0;
                      active[32]=1;
                      ends[32]=1;
                      tdone[32]=1;
                    }
                    else {
                      active[32]=1;
                      ends[32]=1;
                      tdone[32]=1;
                    }
                  }
                  else {
                    active[32]=1;
                    ends[32]=1;
                    tdone[32]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24699(int [] tdone, int [] ends){
        S15359=1;
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread24698(int [] tdone, int [] ends){
        S15356=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 307, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread24697(int [] tdone, int [] ends){
        S15386=1;
    S15362=0;
    if(bottleAtPos2_31.getprestatus()){//sysj\conveyor_controller.sysj line: 304, column: 26
      thread24698(tdone,ends);
      thread24699(tdone,ends);
      int biggest24700 = 0;
      if(ends[39]>=biggest24700){
        biggest24700=ends[39];
      }
      if(ends[40]>=biggest24700){
        biggest24700=ends[40];
      }
      if(biggest24700 == 1){
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
    else {
      S15362=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread24696(int [] tdone, int [] ends){
        S15351=1;
    S15295=0;
    S15275=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 293, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
      S15275=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S15270=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 293, column: 12
        S15270=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 293, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 294, column: 15
            bottleAtPos2_31.setPresent();//sysj\conveyor_controller.sysj line: 295, column: 13
            currsigs.addElement(bottleAtPos2_31);
            S15295=1;
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
          else {
            S15295=1;
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

  public void thread24695(int [] tdone, int [] ends){
        S15268=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 256, column: 14
    S13403=0;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread24692(int [] tdone, int [] ends){
        S15359=1;
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread24691(int [] tdone, int [] ends){
        S15356=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 307, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread24690(int [] tdone, int [] ends){
        S15386=1;
    S15362=0;
    if(bottleAtPos2_31.getprestatus()){//sysj\conveyor_controller.sysj line: 304, column: 26
      thread24691(tdone,ends);
      thread24692(tdone,ends);
      int biggest24693 = 0;
      if(ends[39]>=biggest24693){
        biggest24693=ends[39];
      }
      if(ends[40]>=biggest24693){
        biggest24693=ends[40];
      }
      if(biggest24693 == 1){
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
    else {
      S15362=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread24689(int [] tdone, int [] ends){
        S15351=1;
    S15295=0;
    S15275=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 293, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
      S15275=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S15270=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 293, column: 12
        S15270=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 293, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 294, column: 15
            bottleAtPos2_31.setPresent();//sysj\conveyor_controller.sysj line: 295, column: 13
            currsigs.addElement(bottleAtPos2_31);
            S15295=1;
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
          else {
            S15295=1;
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

  public void thread24688(int [] tdone, int [] ends){
        S15268=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 256, column: 14
    S13403=0;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread24685(int [] tdone, int [] ends){
        S15359=1;
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread24684(int [] tdone, int [] ends){
        S15356=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 307, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread24683(int [] tdone, int [] ends){
        S15386=1;
    S15362=0;
    if(bottleAtPos2_31.getprestatus()){//sysj\conveyor_controller.sysj line: 304, column: 26
      thread24684(tdone,ends);
      thread24685(tdone,ends);
      int biggest24686 = 0;
      if(ends[39]>=biggest24686){
        biggest24686=ends[39];
      }
      if(ends[40]>=biggest24686){
        biggest24686=ends[40];
      }
      if(biggest24686 == 1){
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
    else {
      S15362=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread24682(int [] tdone, int [] ends){
        S15351=1;
    S15295=0;
    S15275=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 293, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
      S15275=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S15270=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 293, column: 12
        S15270=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 293, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 294, column: 15
            bottleAtPos2_31.setPresent();//sysj\conveyor_controller.sysj line: 295, column: 13
            currsigs.addElement(bottleAtPos2_31);
            S15295=1;
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
          else {
            S15295=1;
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

  public void thread24681(int [] tdone, int [] ends){
        S15268=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 256, column: 14
    S13403=0;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread24678(int [] tdone, int [] ends){
        S15359=1;
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread24677(int [] tdone, int [] ends){
        S15356=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 307, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread24676(int [] tdone, int [] ends){
        S15386=1;
    S15362=0;
    if(bottleAtPos2_31.getprestatus()){//sysj\conveyor_controller.sysj line: 304, column: 26
      thread24677(tdone,ends);
      thread24678(tdone,ends);
      int biggest24679 = 0;
      if(ends[39]>=biggest24679){
        biggest24679=ends[39];
      }
      if(ends[40]>=biggest24679){
        biggest24679=ends[40];
      }
      if(biggest24679 == 1){
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
    else {
      S15362=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread24675(int [] tdone, int [] ends){
        S15351=1;
    S15295=0;
    S15275=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 293, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
      S15275=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S15270=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 293, column: 12
        S15270=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 293, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 293, column: 12
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 293, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 294, column: 15
            bottleAtPos2_31.setPresent();//sysj\conveyor_controller.sysj line: 295, column: 13
            currsigs.addElement(bottleAtPos2_31);
            S15295=1;
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
          }
          else {
            S15295=1;
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

  public void thread24674(int [] tdone, int [] ends){
        S15268=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 256, column: 14
    S13403=0;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S21346){
        case 0 : 
          S21346=0;
          break RUN;
        
        case 1 : 
          S21346=2;
          S21346=2;
          bottleAtPos2_31.setClear();//sysj\conveyor_controller.sysj line: 249, column: 9
          S21345=0;
          S13385=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 251, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 251, column: 9
            S13385=1;
            active[31]=1;
            ends[31]=1;
            break RUN;
          }
          else {
            S13380=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 251, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 251, column: 9
              S13380=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 251, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 251, column: 9
                ends[31]=2;
                ;//sysj\conveyor_controller.sysj line: 251, column: 9
                S21345=1;
                thread24674(tdone,ends);
                thread24675(tdone,ends);
                thread24676(tdone,ends);
                int biggest24680 = 0;
                if(ends[32]>=biggest24680){
                  biggest24680=ends[32];
                }
                if(ends[37]>=biggest24680){
                  biggest24680=ends[37];
                }
                if(ends[38]>=biggest24680){
                  biggest24680=ends[38];
                }
                if(biggest24680 == 1){
                  active[31]=1;
                  ends[31]=1;
                  break RUN;
                }
              }
              else {
                active[31]=1;
                ends[31]=1;
                break RUN;
              }
            }
            else {
              active[31]=1;
              ends[31]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos2_31.setClear();//sysj\conveyor_controller.sysj line: 249, column: 9
          switch(S21345){
            case 0 : 
              switch(S13385){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 251, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 251, column: 9
                    S13385=1;
                    active[31]=1;
                    ends[31]=1;
                    break RUN;
                  }
                  else {
                    switch(S13380){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 251, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 251, column: 9
                          S13380=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 251, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 251, column: 9
                            ends[31]=2;
                            ;//sysj\conveyor_controller.sysj line: 251, column: 9
                            S21345=1;
                            thread24681(tdone,ends);
                            thread24682(tdone,ends);
                            thread24683(tdone,ends);
                            int biggest24687 = 0;
                            if(ends[32]>=biggest24687){
                              biggest24687=ends[32];
                            }
                            if(ends[37]>=biggest24687){
                              biggest24687=ends[37];
                            }
                            if(ends[38]>=biggest24687){
                              biggest24687=ends[38];
                            }
                            if(biggest24687 == 1){
                              active[31]=1;
                              ends[31]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[31]=1;
                            ends[31]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[31]=1;
                          ends[31]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 251, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 251, column: 9
                          ends[31]=2;
                          ;//sysj\conveyor_controller.sysj line: 251, column: 9
                          S21345=1;
                          thread24688(tdone,ends);
                          thread24689(tdone,ends);
                          thread24690(tdone,ends);
                          int biggest24694 = 0;
                          if(ends[32]>=biggest24694){
                            biggest24694=ends[32];
                          }
                          if(ends[37]>=biggest24694){
                            biggest24694=ends[37];
                          }
                          if(ends[38]>=biggest24694){
                            biggest24694=ends[38];
                          }
                          if(biggest24694 == 1){
                            active[31]=1;
                            ends[31]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[31]=1;
                          ends[31]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S13385=1;
                  S13385=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 251, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 251, column: 9
                    S13385=1;
                    active[31]=1;
                    ends[31]=1;
                    break RUN;
                  }
                  else {
                    S13380=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 251, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 251, column: 9
                      S13380=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 251, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 251, column: 9
                        ends[31]=2;
                        ;//sysj\conveyor_controller.sysj line: 251, column: 9
                        S21345=1;
                        thread24695(tdone,ends);
                        thread24696(tdone,ends);
                        thread24697(tdone,ends);
                        int biggest24701 = 0;
                        if(ends[32]>=biggest24701){
                          biggest24701=ends[32];
                        }
                        if(ends[37]>=biggest24701){
                          biggest24701=ends[37];
                        }
                        if(ends[38]>=biggest24701){
                          biggest24701=ends[38];
                        }
                        if(biggest24701 == 1){
                          active[31]=1;
                          ends[31]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[31]=1;
                        ends[31]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[31]=1;
                      ends[31]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread24702(tdone,ends);
              thread24730(tdone,ends);
              thread24731(tdone,ends);
              int biggest24738 = 0;
              if(ends[32]>=biggest24738){
                biggest24738=ends[32];
              }
              if(ends[37]>=biggest24738){
                biggest24738=ends[37];
              }
              if(ends[38]>=biggest24738){
                biggest24738=ends[38];
              }
              if(biggest24738 == 1){
                active[31]=1;
                ends[31]=1;
                break RUN;
              }
              //FINXME code
              if(biggest24738 == 0){
                S21346=0;
                active[31]=0;
                ends[31]=0;
                S21346=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos2_31 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[31] != 0){
      int index = 31;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[31]!=0 || suspended[31]!=0 || active[31]!=1);
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
      bottleAtPos2_31.setpreclear();
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
      bottleAtPos2_31.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[31]!=0 || suspended[31]!=0 || active[31]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[31] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
