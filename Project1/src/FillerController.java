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
  private Signal bottleAtPos2_27;
  private long __start_thread_28;//sysj\conveyor_controller.sysj line: 249, column: 9
  private int S18472 = 1;
  private int S18471 = 1;
  private int S10607 = 1;
  private int S10602 = 1;
  private int S12490 = 1;
  private int S10625 = 1;
  private int S10660 = 1;
  private int S10655 = 1;
  private int S10749 = 1;
  private int S10754 = 1;
  private int S10833 = 1;
  private int S10838 = 1;
  private int S10874 = 1;
  private int S10869 = 1;
  private int S12573 = 1;
  private int S12517 = 1;
  private int S12497 = 1;
  private int S12492 = 1;
  private int S12584 = 1;
  
  private int[] ends = new int[35];
  private int[] tdone = new int[35];
  
  public void thread18706(int [] tdone, int [] ends){
        switch(S12584){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2_27.getprestatus()){//sysj\conveyor_controller.sysj line: 297, column: 19
          ;//sysj\conveyor_controller.sysj line: 299, column: 12
          bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 300, column: 12
          currsigs.addElement(bottleAtPos2E);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread18705(int [] tdone, int [] ends){
        switch(S12573){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S12517){
          case 0 : 
            switch(S12497){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
                  S12497=1;
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
                else {
                  switch(S12492){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
                        S12492=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
                          ends[33]=2;
                          ;//sysj\conveyor_controller.sysj line: 288, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
                            bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
                            currsigs.addElement(bottleAtPos2_27);
                            S12517=1;
                            active[33]=1;
                            ends[33]=1;
                            tdone[33]=1;
                          }
                          else {
                            S12517=1;
                            active[33]=1;
                            ends[33]=1;
                            tdone[33]=1;
                          }
                        }
                        else {
                          active[33]=1;
                          ends[33]=1;
                          tdone[33]=1;
                        }
                      }
                      else {
                        active[33]=1;
                        ends[33]=1;
                        tdone[33]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
                        ends[33]=2;
                        ;//sysj\conveyor_controller.sysj line: 288, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
                          bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
                          currsigs.addElement(bottleAtPos2_27);
                          S12517=1;
                          active[33]=1;
                          ends[33]=1;
                          tdone[33]=1;
                        }
                        else {
                          S12517=1;
                          active[33]=1;
                          ends[33]=1;
                          tdone[33]=1;
                        }
                      }
                      else {
                        active[33]=1;
                        ends[33]=1;
                        tdone[33]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S12497=1;
                S12497=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
                  S12497=1;
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
                else {
                  S12492=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
                    S12492=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
                      ends[33]=2;
                      ;//sysj\conveyor_controller.sysj line: 288, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
                        bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
                        currsigs.addElement(bottleAtPos2_27);
                        S12517=1;
                        active[33]=1;
                        ends[33]=1;
                        tdone[33]=1;
                      }
                      else {
                        S12517=1;
                        active[33]=1;
                        ends[33]=1;
                        tdone[33]=1;
                      }
                    }
                    else {
                      active[33]=1;
                      ends[33]=1;
                      tdone[33]=1;
                    }
                  }
                  else {
                    active[33]=1;
                    ends[33]=1;
                    tdone[33]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S12517=1;
            S12517=0;
            S12497=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
              S12497=1;
              active[33]=1;
              ends[33]=1;
              tdone[33]=1;
            }
            else {
              S12492=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
                S12492=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
                  ends[33]=2;
                  ;//sysj\conveyor_controller.sysj line: 288, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
                    bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
                    currsigs.addElement(bottleAtPos2_27);
                    S12517=1;
                    active[33]=1;
                    ends[33]=1;
                    tdone[33]=1;
                  }
                  else {
                    S12517=1;
                    active[33]=1;
                    ends[33]=1;
                    tdone[33]=1;
                  }
                }
                else {
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
              }
              else {
                active[33]=1;
                ends[33]=1;
                tdone[33]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18703(int [] tdone, int [] ends){
        switch(S10838){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 275, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[32]=1;
        ends[32]=1;
        tdone[32]=1;
        break;
      
    }
  }

  public void thread18702(int [] tdone, int [] ends){
        switch(S10833){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 271, column: 13
        currsigs.addElement(valveInletOnOff);
        active[31]=1;
        ends[31]=1;
        tdone[31]=1;
        break;
      
    }
  }

  public void thread18700(int [] tdone, int [] ends){
        S10838=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 275, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread18699(int [] tdone, int [] ends){
        S10833=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 270, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 271, column: 13
    currsigs.addElement(valveInletOnOff);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread18697(int [] tdone, int [] ends){
        switch(S10754){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
        break;
      
    }
  }

  public void thread18696(int [] tdone, int [] ends){
        switch(S10749){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 260, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
        break;
      
    }
  }

  public void thread18694(int [] tdone, int [] ends){
        S10838=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 275, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread18693(int [] tdone, int [] ends){
        S10833=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 270, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 271, column: 13
    currsigs.addElement(valveInletOnOff);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread18691(int [] tdone, int [] ends){
        S10754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread18690(int [] tdone, int [] ends){
        S10749=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 259, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 260, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread18688(int [] tdone, int [] ends){
        S10754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread18687(int [] tdone, int [] ends){
        S10749=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 259, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 260, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread18685(int [] tdone, int [] ends){
        S10754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread18684(int [] tdone, int [] ends){
        S10749=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 259, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 260, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread18682(int [] tdone, int [] ends){
        S10754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread18681(int [] tdone, int [] ends){
        S10749=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 259, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 260, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread18679(int [] tdone, int [] ends){
        S10754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread18678(int [] tdone, int [] ends){
        S10749=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 259, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 260, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread18677(int [] tdone, int [] ends){
        switch(S12490){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        switch(S10625){
          case 0 : 
            if(bottleAtPos2_27.getprestatus()){//sysj\conveyor_controller.sysj line: 252, column: 17
              S10625=1;
              __start_thread_28 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 249, column: 9
              if(com.systemj.Timer.getMs() - __start_thread_28 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 249, column: 9
                ends[28]=2;
                ;//sysj\conveyor_controller.sysj line: 249, column: 9
                S10625=2;
                S10660=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 254, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                  S10660=1;
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
                else {
                  S10655=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 254, column: 11
                    S10655=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                      ends[28]=2;
                      ;//sysj\conveyor_controller.sysj line: 254, column: 11
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 255, column: 11
                      S10625=3;
                      thread18678(tdone,ends);
                      thread18679(tdone,ends);
                      int biggest18680 = 0;
                      if(ends[29]>=biggest18680){
                        biggest18680=ends[29];
                      }
                      if(ends[30]>=biggest18680){
                        biggest18680=ends[30];
                      }
                      if(biggest18680 == 1){
                        active[28]=1;
                        ends[28]=1;
                        tdone[28]=1;
                      }
                    }
                    else {
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                  }
                  else {
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                }
              }
              else {
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
            }
            else {
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_28 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 249, column: 9
              ends[28]=2;
              ;//sysj\conveyor_controller.sysj line: 249, column: 9
              S10625=2;
              S10660=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 254, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                S10660=1;
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
              else {
                S10655=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 254, column: 11
                  S10655=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                    ends[28]=2;
                    ;//sysj\conveyor_controller.sysj line: 254, column: 11
                    System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 255, column: 11
                    S10625=3;
                    thread18681(tdone,ends);
                    thread18682(tdone,ends);
                    int biggest18683 = 0;
                    if(ends[29]>=biggest18683){
                      biggest18683=ends[29];
                    }
                    if(ends[30]>=biggest18683){
                      biggest18683=ends[30];
                    }
                    if(biggest18683 == 1){
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                  }
                  else {
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                }
                else {
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
              }
            }
            else {
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            break;
          
          case 2 : 
            switch(S10660){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 254, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                  S10660=1;
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
                else {
                  switch(S10655){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 254, column: 11
                        S10655=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                          ends[28]=2;
                          ;//sysj\conveyor_controller.sysj line: 254, column: 11
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 255, column: 11
                          S10625=3;
                          thread18684(tdone,ends);
                          thread18685(tdone,ends);
                          int biggest18686 = 0;
                          if(ends[29]>=biggest18686){
                            biggest18686=ends[29];
                          }
                          if(ends[30]>=biggest18686){
                            biggest18686=ends[30];
                          }
                          if(biggest18686 == 1){
                            active[28]=1;
                            ends[28]=1;
                            tdone[28]=1;
                          }
                        }
                        else {
                          active[28]=1;
                          ends[28]=1;
                          tdone[28]=1;
                        }
                      }
                      else {
                        active[28]=1;
                        ends[28]=1;
                        tdone[28]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                        ends[28]=2;
                        ;//sysj\conveyor_controller.sysj line: 254, column: 11
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 255, column: 11
                        S10625=3;
                        thread18687(tdone,ends);
                        thread18688(tdone,ends);
                        int biggest18689 = 0;
                        if(ends[29]>=biggest18689){
                          biggest18689=ends[29];
                        }
                        if(ends[30]>=biggest18689){
                          biggest18689=ends[30];
                        }
                        if(biggest18689 == 1){
                          active[28]=1;
                          ends[28]=1;
                          tdone[28]=1;
                        }
                      }
                      else {
                        active[28]=1;
                        ends[28]=1;
                        tdone[28]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S10660=1;
                S10660=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 254, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                  S10660=1;
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
                else {
                  S10655=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 254, column: 11
                    S10655=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                      ends[28]=2;
                      ;//sysj\conveyor_controller.sysj line: 254, column: 11
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 255, column: 11
                      S10625=3;
                      thread18690(tdone,ends);
                      thread18691(tdone,ends);
                      int biggest18692 = 0;
                      if(ends[29]>=biggest18692){
                        biggest18692=ends[29];
                      }
                      if(ends[30]>=biggest18692){
                        biggest18692=ends[30];
                      }
                      if(biggest18692 == 1){
                        active[28]=1;
                        ends[28]=1;
                        tdone[28]=1;
                      }
                    }
                    else {
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                  }
                  else {
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 3 : 
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 257, column: 17
              S10625=4;
              thread18693(tdone,ends);
              thread18694(tdone,ends);
              int biggest18695 = 0;
              if(ends[31]>=biggest18695){
                biggest18695=ends[31];
              }
              if(ends[32]>=biggest18695){
                biggest18695=ends[32];
              }
              if(biggest18695 == 1){
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
            }
            else {
              thread18696(tdone,ends);
              thread18697(tdone,ends);
              int biggest18698 = 0;
              if(ends[29]>=biggest18698){
                biggest18698=ends[29];
              }
              if(ends[30]>=biggest18698){
                biggest18698=ends[30];
              }
              if(biggest18698 == 1){
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
              //FINXME code
              if(biggest18698 == 0){
                S10625=4;
                thread18699(tdone,ends);
                thread18700(tdone,ends);
                int biggest18701 = 0;
                if(ends[31]>=biggest18701){
                  biggest18701=ends[31];
                }
                if(ends[32]>=biggest18701){
                  biggest18701=ends[32];
                }
                if(biggest18701 == 1){
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 268, column: 17
              S10625=5;
              S10874=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 279, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                S10874=1;
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
              else {
                S10869=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 279, column: 11
                  S10869=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                    ends[28]=2;
                    ;//sysj\conveyor_controller.sysj line: 279, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 280, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
                    S10625=0;
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                  else {
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                }
                else {
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
              }
            }
            else {
              thread18702(tdone,ends);
              thread18703(tdone,ends);
              int biggest18704 = 0;
              if(ends[31]>=biggest18704){
                biggest18704=ends[31];
              }
              if(ends[32]>=biggest18704){
                biggest18704=ends[32];
              }
              if(biggest18704 == 1){
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
              //FINXME code
              if(biggest18704 == 0){
                S10625=5;
                S10874=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 279, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                  S10874=1;
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
                else {
                  S10869=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 279, column: 11
                    S10869=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                      ends[28]=2;
                      ;//sysj\conveyor_controller.sysj line: 279, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 280, column: 11
                      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
                      S10625=0;
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                    else {
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                  }
                  else {
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                }
              }
            }
            break;
          
          case 5 : 
            switch(S10874){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 279, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                  S10874=1;
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
                else {
                  switch(S10869){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 279, column: 11
                        S10869=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                          ends[28]=2;
                          ;//sysj\conveyor_controller.sysj line: 279, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 280, column: 11
                          System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
                          S10625=0;
                          active[28]=1;
                          ends[28]=1;
                          tdone[28]=1;
                        }
                        else {
                          active[28]=1;
                          ends[28]=1;
                          tdone[28]=1;
                        }
                      }
                      else {
                        active[28]=1;
                        ends[28]=1;
                        tdone[28]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                        ends[28]=2;
                        ;//sysj\conveyor_controller.sysj line: 279, column: 11
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 280, column: 11
                        System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
                        S10625=0;
                        active[28]=1;
                        ends[28]=1;
                        tdone[28]=1;
                      }
                      else {
                        active[28]=1;
                        ends[28]=1;
                        tdone[28]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S10874=1;
                S10874=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 279, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                  S10874=1;
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
                else {
                  S10869=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 279, column: 11
                    S10869=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                      ends[28]=2;
                      ;//sysj\conveyor_controller.sysj line: 279, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 280, column: 11
                      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
                      S10625=0;
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                    else {
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                  }
                  else {
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18675(int [] tdone, int [] ends){
        S12584=1;
    if(bottleAtPos2_27.getprestatus()){//sysj\conveyor_controller.sysj line: 297, column: 19
      ;//sysj\conveyor_controller.sysj line: 299, column: 12
      bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 300, column: 12
      currsigs.addElement(bottleAtPos2E);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread18674(int [] tdone, int [] ends){
        S12573=1;
    S12517=0;
    S12497=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
      S12497=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S12492=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
        S12492=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 288, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
            bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
            currsigs.addElement(bottleAtPos2_27);
            S12517=1;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
          else {
            S12517=1;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread18673(int [] tdone, int [] ends){
        S12490=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
    S10625=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread18671(int [] tdone, int [] ends){
        S12584=1;
    if(bottleAtPos2_27.getprestatus()){//sysj\conveyor_controller.sysj line: 297, column: 19
      ;//sysj\conveyor_controller.sysj line: 299, column: 12
      bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 300, column: 12
      currsigs.addElement(bottleAtPos2E);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread18670(int [] tdone, int [] ends){
        S12573=1;
    S12517=0;
    S12497=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
      S12497=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S12492=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
        S12492=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 288, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
            bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
            currsigs.addElement(bottleAtPos2_27);
            S12517=1;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
          else {
            S12517=1;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread18669(int [] tdone, int [] ends){
        S12490=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
    S10625=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread18667(int [] tdone, int [] ends){
        S12584=1;
    if(bottleAtPos2_27.getprestatus()){//sysj\conveyor_controller.sysj line: 297, column: 19
      ;//sysj\conveyor_controller.sysj line: 299, column: 12
      bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 300, column: 12
      currsigs.addElement(bottleAtPos2E);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread18666(int [] tdone, int [] ends){
        S12573=1;
    S12517=0;
    S12497=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
      S12497=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S12492=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
        S12492=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 288, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
            bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
            currsigs.addElement(bottleAtPos2_27);
            S12517=1;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
          else {
            S12517=1;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread18665(int [] tdone, int [] ends){
        S12490=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
    S10625=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread18663(int [] tdone, int [] ends){
        S12584=1;
    if(bottleAtPos2_27.getprestatus()){//sysj\conveyor_controller.sysj line: 297, column: 19
      ;//sysj\conveyor_controller.sysj line: 299, column: 12
      bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 300, column: 12
      currsigs.addElement(bottleAtPos2E);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread18662(int [] tdone, int [] ends){
        S12573=1;
    S12517=0;
    S12497=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
      S12497=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S12492=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
        S12492=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 288, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
            bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
            currsigs.addElement(bottleAtPos2_27);
            S12517=1;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
          else {
            S12517=1;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread18661(int [] tdone, int [] ends){
        S12490=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
    S10625=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S18472){
        case 0 : 
          S18472=0;
          break RUN;
        
        case 1 : 
          S18472=2;
          S18472=2;
          bottleAtPos2_27.setClear();//sysj\conveyor_controller.sysj line: 244, column: 9
          S18471=0;
          S10607=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 246, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
            S10607=1;
            active[27]=1;
            ends[27]=1;
            break RUN;
          }
          else {
            S10602=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 246, column: 9
              S10602=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
                ends[27]=2;
                ;//sysj\conveyor_controller.sysj line: 246, column: 9
                S18471=1;
                thread18661(tdone,ends);
                thread18662(tdone,ends);
                thread18663(tdone,ends);
                int biggest18664 = 0;
                if(ends[28]>=biggest18664){
                  biggest18664=ends[28];
                }
                if(ends[33]>=biggest18664){
                  biggest18664=ends[33];
                }
                if(ends[34]>=biggest18664){
                  biggest18664=ends[34];
                }
                if(biggest18664 == 1){
                  active[27]=1;
                  ends[27]=1;
                  break RUN;
                }
              }
              else {
                active[27]=1;
                ends[27]=1;
                break RUN;
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos2_27.setClear();//sysj\conveyor_controller.sysj line: 244, column: 9
          switch(S18471){
            case 0 : 
              switch(S10607){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 246, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
                    S10607=1;
                    active[27]=1;
                    ends[27]=1;
                    break RUN;
                  }
                  else {
                    switch(S10602){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 246, column: 9
                          S10602=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
                            ends[27]=2;
                            ;//sysj\conveyor_controller.sysj line: 246, column: 9
                            S18471=1;
                            thread18665(tdone,ends);
                            thread18666(tdone,ends);
                            thread18667(tdone,ends);
                            int biggest18668 = 0;
                            if(ends[28]>=biggest18668){
                              biggest18668=ends[28];
                            }
                            if(ends[33]>=biggest18668){
                              biggest18668=ends[33];
                            }
                            if(ends[34]>=biggest18668){
                              biggest18668=ends[34];
                            }
                            if(biggest18668 == 1){
                              active[27]=1;
                              ends[27]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[27]=1;
                            ends[27]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[27]=1;
                          ends[27]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 246, column: 9
                          S18471=1;
                          thread18669(tdone,ends);
                          thread18670(tdone,ends);
                          thread18671(tdone,ends);
                          int biggest18672 = 0;
                          if(ends[28]>=biggest18672){
                            biggest18672=ends[28];
                          }
                          if(ends[33]>=biggest18672){
                            biggest18672=ends[33];
                          }
                          if(ends[34]>=biggest18672){
                            biggest18672=ends[34];
                          }
                          if(biggest18672 == 1){
                            active[27]=1;
                            ends[27]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[27]=1;
                          ends[27]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S10607=1;
                  S10607=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 246, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
                    S10607=1;
                    active[27]=1;
                    ends[27]=1;
                    break RUN;
                  }
                  else {
                    S10602=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 246, column: 9
                      S10602=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 246, column: 9
                        S18471=1;
                        thread18673(tdone,ends);
                        thread18674(tdone,ends);
                        thread18675(tdone,ends);
                        int biggest18676 = 0;
                        if(ends[28]>=biggest18676){
                          biggest18676=ends[28];
                        }
                        if(ends[33]>=biggest18676){
                          biggest18676=ends[33];
                        }
                        if(ends[34]>=biggest18676){
                          biggest18676=ends[34];
                        }
                        if(biggest18676 == 1){
                          active[27]=1;
                          ends[27]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[27]=1;
                      ends[27]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread18677(tdone,ends);
              thread18705(tdone,ends);
              thread18706(tdone,ends);
              int biggest18707 = 0;
              if(ends[28]>=biggest18707){
                biggest18707=ends[28];
              }
              if(ends[33]>=biggest18707){
                biggest18707=ends[33];
              }
              if(ends[34]>=biggest18707){
                biggest18707=ends[34];
              }
              if(biggest18707 == 1){
                active[27]=1;
                ends[27]=1;
                break RUN;
              }
              //FINXME code
              if(biggest18707 == 0){
                S18472=0;
                active[27]=0;
                ends[27]=0;
                S18472=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos2_27 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[27] != 0){
      int index = 27;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[27]!=0 || suspended[27]!=0 || active[27]!=1);
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
      bottleAtPos2_27.setpreclear();
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
      bottleAtPos2_27.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[27]!=0 || suspended[27]!=0 || active[27]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[27] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
